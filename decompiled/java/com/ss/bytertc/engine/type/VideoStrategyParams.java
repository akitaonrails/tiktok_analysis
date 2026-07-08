package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes21.dex */
public class VideoStrategyParams {
    public VideoStrategyChannelParams[] channelEncInfoTable;
    public int mediaTargetBps;
    public int sceneType;

    public VideoStrategyChannelParams[] getChannelEncInfoTable() {
        return this.channelEncInfoTable;
    }

    public int getMediaTargetBps() {
        return this.mediaTargetBps;
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public void setChannelEncInfoTable(VideoStrategyChannelParams[] videoStrategyChannelParamsArr) {
        this.channelEncInfoTable = videoStrategyChannelParamsArr;
    }

    public void setMediaTargetBps(int i) {
        this.mediaTargetBps = i;
    }

    public void setSceneType(int i) {
        this.sceneType = i;
    }
}
