package com.ss.lyrax.engine;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoStrategyParams {
    public LyraxVideoStrategyChannelParams[] channelEncInfoTable;
    public int mediaTargetBps = -1;
    public int sceneType = -1;

    public LyraxVideoStrategyChannelParams[] getChannelEncInfoTable() {
        return this.channelEncInfoTable;
    }

    public int getMediaTargetBps() {
        return this.mediaTargetBps;
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public void setChannelEncInfoTable(LyraxVideoStrategyChannelParams[] lyraxVideoStrategyChannelParamsArr) {
        this.channelEncInfoTable = lyraxVideoStrategyChannelParamsArr;
    }

    public void setMediaTargetBps(int i) {
        this.mediaTargetBps = i;
    }

    public void setSceneType(int i) {
        this.sceneType = i;
    }
}
