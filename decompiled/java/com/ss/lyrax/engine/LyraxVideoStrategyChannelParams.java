package com.ss.lyrax.engine;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoStrategyChannelParams {
    public int channelIndex = -1;
    public int subscriberMaxDownlinkBps = -1;
    public int subscriberCount = -1;
    public int cfgMaxEncWidth = -1;
    public int cfgMaxEncHeight = -1;
    public int cfgMaxEncFps = -1;
    public int cfgMinEncBps = -1;
    public int cfgMaxEncBps = -1;
    public int currentEncWidth = -1;
    public int currentEncHeight = -1;
    public int currentEncTargetFps = -1;
    public int currentEncTargetBps = -1;

    public long getCfgMaxEncFps() {
        return this.cfgMaxEncFps;
    }

    public long getCfgMaxEncHeight() {
        return this.cfgMaxEncHeight;
    }

    public long getCfgMaxEncWidth() {
        return this.cfgMaxEncWidth;
    }

    public int getCfgMaxEncBps() {
        return this.cfgMaxEncBps;
    }

    public int getCfgMinEncBps() {
        return this.cfgMinEncBps;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public int getCurrentEncHeight() {
        return this.currentEncHeight;
    }

    public int getCurrentEncTargetBps() {
        return this.currentEncTargetBps;
    }

    public int getCurrentEncTargetFps() {
        return this.currentEncTargetFps;
    }

    public int getCurrentEncWidth() {
        return this.currentEncWidth;
    }

    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    public int getSubscriberMaxDownlinkBps() {
        return this.subscriberMaxDownlinkBps;
    }

    public void setCfgMaxEncBps(int i) {
        this.cfgMaxEncBps = i;
    }

    public void setCfgMaxEncFps(int i) {
        this.cfgMaxEncFps = i;
    }

    public void setCfgMaxEncHeight(int i) {
        this.cfgMaxEncHeight = i;
    }

    public void setCfgMaxEncWidth(int i) {
        this.cfgMaxEncWidth = i;
    }

    public void setCfgMinEncBps(int i) {
        this.cfgMinEncBps = i;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setCurrentEncHeight(int i) {
        this.currentEncHeight = i;
    }

    public void setCurrentEncTargetBps(int i) {
        this.currentEncTargetBps = i;
    }

    public void setCurrentEncTargetFps(int i) {
        this.currentEncTargetFps = i;
    }

    public void setCurrentEncWidth(int i) {
        this.currentEncWidth = i;
    }

    public void setSubscriberCount(int i) {
        this.subscriberCount = i;
    }

    public void setSubscriberMaxDownlinkBps(int i) {
        this.subscriberMaxDownlinkBps = i;
    }
}
