package com.liferay.background.vo;

/**
 * Created by viba1015 on 4/25/2018.
 */
public class BackgroundTaskVO {
    String totalNodes;

    public String getTotalNodes() {
        System.out.println("Background task getNodes");

        return totalNodes;
    }

    public void setTotalNodes(String totalNodes) {
        System.out.println("Background task set total nodes");

        this.totalNodes = totalNodes;
    }
}
