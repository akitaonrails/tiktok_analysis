package com.mammon.audiosdk.bridge;

import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.SAMICoreHostCallBackListener;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.enums.SAMICoreVopSpeakerInfoCommand;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreDebugConfig;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.mammon.audiosdk.structures.SAMICoreVopAudioCheckerAudioMetricParameter;
import com.mammon.audiosdk.structures.SAMICoreVopAudioCheckerConfig;
import com.mammon.audiosdk.structures.SAMICoreVopAudioCheckerOnlineAsrParameter;
import com.mammon.audiosdk.structures.SAMICoreVopInitContext;
import com.mammon.audiosdk.structures.SAMICoreVopRecordingStatus;
import com.mammon.audiosdk.structures.SAMICoreVopSpeakerInfo;

/* JADX INFO: loaded from: classes35.dex */
public class SAMICoreHostBridge implements SAMICoreBridge {
    public SAMICoreHostCallBackListener hostCallBackListener;
    public SAMICoreCallBackListener listener;

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int AudioChecker_native_checkAudioQuality(long j, byte[] bArr, int i, String str, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long AudioChecker_native_createEngine();

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native void AudioChecker_native_destroyEngine(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int AudioChecker_native_init(long j, SAMICoreVopAudioCheckerConfig sAMICoreVopAudioCheckerConfig);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int AudioChecker_native_setAudioMetricParameter(long j, SAMICoreVopAudioCheckerAudioMetricParameter sAMICoreVopAudioCheckerAudioMetricParameter);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int AudioChecker_native_setOnlineAsrParameter(long j, SAMICoreVopAudioCheckerOnlineAsrParameter sAMICoreVopAudioCheckerOnlineAsrParameter);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long Native_SAMICoreCreateHandleByIdentify(int i, Object obj, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreDestroyHandle(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreGetPropertyById(long j, int i, SAMICoreProperty sAMICoreProperty);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long Native_SAMICoreInitContext(int i, Object obj);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreInitDebugConfig(long j, SAMICoreDebugConfig sAMICoreDebugConfig);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreProcess(long j, int i, SAMICoreBlock sAMICoreBlock, SAMICoreBlock sAMICoreBlock2);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreProcessAsync(long j, int i, SAMICoreBlock sAMICoreBlock);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long Native_SAMICoreRegisterLogger(Object obj);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long Native_SAMICoreRegisterTraceSpanCallback(Object obj);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreReleaseContext(int i);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreReleaseDebugConfig(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int Native_SAMICoreSetProperty(long j, int i, SAMICoreProperty sAMICoreProperty);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long Native_SAMICoreUnregisterLogger(Object obj);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long VopEngine_native_createEngine();

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native void VopEngine_native_destroyEngine(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native float VopEngine_native_getCurrentPositionMs(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_getCurrentState(long j, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_getNextTextInfo(long j, Object[] objArr, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_getRecordingStatus(long j, SAMICoreVopRecordingStatus sAMICoreVopRecordingStatus);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_getSpeakerInfo(long j, SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native float VopEngine_native_getTotalDurationMs(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_init(long j, SAMICoreVopInitContext sAMICoreVopInitContext);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_manageSpeakerInfo(long j, SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_play(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_preparePlayer(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_processRecordAudio(long j, byte[] bArr, int i, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopEngine_native_stop(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native long VopInstantEngine_native_createEngine();

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native void VopInstantEngine_native_destroyEngine(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_getCurrentState(long j, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_getNextTextInfo(long j, Object[] objArr, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_getSpeakerInfo(long j, SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_init(long j, SAMICoreVopInitContext sAMICoreVopInitContext);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_manageSpeakerInfo(long j, SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_play(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_preparePlayer(long j, String str);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_processRecordAudio(long j, byte[] bArr, int i, int[] iArr);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public native int VopInstantEngine_native_stop(long j);

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public void setHostCallBackListener(SAMICoreHostCallBackListener sAMICoreHostCallBackListener) {
        this.hostCallBackListener = sAMICoreHostCallBackListener;
    }

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public void setListener(SAMICoreCallBackListener sAMICoreCallBackListener) {
        this.listener = sAMICoreCallBackListener;
    }

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public void onMessageReceived(int i, SAMICoreBlock sAMICoreBlock) {
        SAMICoreCallBackListener sAMICoreCallBackListener = this.listener;
        if (sAMICoreCallBackListener != null) {
            sAMICoreCallBackListener.onMessageReceived(SAMICoreCallBackEventType.fromInt(i), sAMICoreBlock);
        }
    }

    @Override // com.mammon.audiosdk.bridge.SAMICoreBridge
    public void onSendToHost(int i, SAMICoreBlock sAMICoreBlock) {
        SAMICoreHostCallBackListener sAMICoreHostCallBackListener = this.hostCallBackListener;
        if (sAMICoreHostCallBackListener != null) {
            sAMICoreHostCallBackListener.onSendToHost(SAMICoreCallBackEventType.fromInt(i), sAMICoreBlock);
        }
    }
}
