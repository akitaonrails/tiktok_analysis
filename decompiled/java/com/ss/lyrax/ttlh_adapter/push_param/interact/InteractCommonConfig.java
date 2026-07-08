package com.ss.lyrax.ttlh_adapter.push_param.interact;

/* JADX INFO: loaded from: classes21.dex */
public class InteractCommonConfig {
    public boolean enableAnchorNetStartForawrdOpt;
    public boolean enableNativeInteract;
    public boolean enableNtpTime;
    public boolean notifyLiveSceneToAuxStream;

    public InteractCommonConfig() {
        this.notifyLiveSceneToAuxStream = true;
    }

    public boolean getEnableAnchorNetStartForawrdOpt() {
        return this.enableAnchorNetStartForawrdOpt;
    }

    public boolean getEnableNativeInteract() {
        return this.enableNativeInteract;
    }

    public boolean getEnableNtpTime() {
        return this.enableNtpTime;
    }

    public boolean getNotifyLiveSceneToAuxStream() {
        return this.notifyLiveSceneToAuxStream;
    }

    public InteractCommonConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableAnchorNetStartForawrdOpt = z;
        this.enableNtpTime = z2;
        this.notifyLiveSceneToAuxStream = z3;
        this.enableNativeInteract = z4;
    }
}
