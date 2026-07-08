package com.ss.bytertc.engine.livepusher;

import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.SourceWantedData;

/* JADX INFO: loaded from: classes21.dex */
public interface ILivePusherEventHandler {
    void onError(LivePusherErrorCode livePusherErrorCode, int i, String str);

    void onInitializedEngineEGL(GLESVersion gLESVersion);

    void onLocalAudioStateChanged(LivePusherLocalAudioState livePusherLocalAudioState);

    void onLocalVideoStateChanged(LivePusherLocalVideoState livePusherLocalVideoState);

    void onLogCallback(String str, String str2);

    void onNetworkQuality(NetworkQualityStats networkQualityStats);

    void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData);

    void onStatusChanged(LivePusherStatus livePusherStatus, int i, String str);
}
