package com.ss.bytertc.engine.livepusher;

/* JADX INFO: loaded from: classes21.dex */
public class LivePusherConfig {
    public LivePusherAudioConfig audioConfig;
    public boolean enableLiveAB;
    public MixedStreamType mixType;
    public LivePusherVideoConfig videoConfig;
    public int reconnectDuration = 30;
    public int reportTimerInterval = 10000;
    public boolean isAutoSubscribeAudio = true;
    public boolean isAutoSubscribeVideo = true;
    public String anchorIDCName = "";
}
