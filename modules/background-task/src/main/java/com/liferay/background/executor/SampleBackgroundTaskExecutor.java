package com.liferay.background.executor;

import com.liferay.background.vo.BackgroundTaskVO;
import com.liferay.portal.kernel.backgroundtask.*;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplay;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplayFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.service.component.annotations.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * @author vipin.bardia
 * @version 1.0
 */
@Component(
        immediate = true,
        property = {"background.task.executor.class.name=com.liferay.background.executor.SampleBackgroundTaskExecutor"}, // Without this property osgi will not register this as background executor/handler
        service = BackgroundTaskExecutor.class
)
public class SampleBackgroundTaskExecutor extends BaseBackgroundTaskExecutor {
	public static final Log LOGGER = LogFactoryUtil
			.getLog(SampleBackgroundTaskExecutor.class);
	
    public void MyBackgroundTaskExecutor() {
		System.out.println("Background task exc");
    	setBackgroundTaskStatusMessageTranslator(
				new SampleBackgroundTaskStatusMessageTranslator());
    }

    /**
     * @param backgroundTask
     * @return BackgroundTaskResult
     */
    public BackgroundTaskResult execute(BackgroundTask backgroundTask)
        throws Exception {
		System.out.println("Background task REsult");

		// taskContextMap which is sent by the caller
        Map<String,Serializable> taskContextMap = backgroundTask.getTaskContextMap();

        String taskName = (String)taskContextMap.get("processName") ;
		String totalNodes = (String)taskContextMap.get("totalNodes");
		System.out.println("Taskname: "+taskName);
		System.out.println("total nodes: "+totalNodes);
        //ServiceContext serviceContext  = (ServiceContext) taskContextMap.get("serviceContext");

    	if(LOGGER.isDebugEnabled()){
    		LOGGER.debug("Task Name : "+ taskName);
    	}

		BackgroundTaskVO messageContent = new BackgroundTaskVO();
		messageContent.setTotalNodes(totalNodes);

		// Sending the data to util for MessageBus
    	SampleDataHandlerStatusMessageSenderUtil sampleDataHandlerStatusMessageSenderUtil = new SampleDataHandlerStatusMessageSenderUtil();
		sampleDataHandlerStatusMessageSenderUtil.sendStatusMessage(messageContent);

		// Telling the system if, background task is successful or not
    	BackgroundTaskResult backgroundTaskResult = new BackgroundTaskResult();
		backgroundTaskResult.setStatusMessage("Wonder full");
		return BackgroundTaskResult.SUCCESS;
    }

    @Override
    public boolean isSerial() {
        return true;
    }

    @Override
	public BackgroundTaskDisplay getBackgroundTaskDisplay(BackgroundTask backgroundTask) {
		System.out.println("Background task Display"+backgroundTask.getBackgroundTaskId());

		return BackgroundTaskDisplayFactoryUtil.getBackgroundTaskDisplay(backgroundTask.getBackgroundTaskId());
	}

	@Override
	public BackgroundTaskExecutor clone() {
		return this;
	}
}