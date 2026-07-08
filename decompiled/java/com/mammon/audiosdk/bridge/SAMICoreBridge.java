package com.mammon.audiosdk.bridge;

import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.SAMICoreHostCallBackListener;
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
public interface SAMICoreBridge {
    int AudioChecker_native_checkAudioQuality(long j, byte[] bArr, int i, String str, int[] iArr);

    long AudioChecker_native_createEngine();

    void AudioChecker_native_destroyEngine(long j);

    int AudioChecker_native_init(long j, SAMICoreVopAudioCheckerConfig sAMICoreVopAudioCheckerConfig);

    int AudioChecker_native_setAudioMetricParameter(long j, SAMICoreVopAudioCheckerAudioMetricParameter sAMICoreVopAudioCheckerAudioMetricParameter);

    int AudioChecker_native_setOnlineAsrParameter(long j, SAMICoreVopAudioCheckerOnlineAsrParameter sAMICoreVopAudioCheckerOnlineAsrParameter);

    long Native_SAMICoreCreateHandleByIdentify(int i, Object obj, int[] iArr);

    int Native_SAMICoreDestroyHandle(long j);

    int Native_SAMICoreGetPropertyById(long j, int i, SAMICoreProperty sAMICoreProperty);

    long Native_SAMICoreInitContext(int i, Object obj);

    int Native_SAMICoreInitDebugConfig(long j, SAMICoreDebugConfig sAMICoreDebugConfig);

    int Native_SAMICoreProcess(long j, int i, SAMICoreBlock sAMICoreBlock, SAMICoreBlock sAMICoreBlock2);

    int Native_SAMICoreProcessAsync(long j, int i, SAMICoreBlock sAMICoreBlock);

    long Native_SAMICoreRegisterLogger(Object obj);

    long Native_SAMICoreRegisterTraceSpanCallback(Object obj);

    int Native_SAMICoreReleaseContext(int i);

    int Native_SAMICoreReleaseDebugConfig(long j);

    int Native_SAMICoreSetProperty(long j, int i, SAMICoreProperty sAMICoreProperty);

    long Native_SAMICoreUnregisterLogger(Object obj);

    long VopEngine_native_createEngine();

    void VopEngine_native_destroyEngine(long j);

    float VopEngine_native_getCurrentPositionMs(long j);

    int VopEngine_native_getCurrentState(long j, int[] iArr);

    int VopEngine_native_getNextTextInfo(long j, Object[] objArr, int[] iArr);

    int VopEngine_native_getRecordingStatus(long j, SAMICoreVopRecordingStatus sAMICoreVopRecordingStatus);

    int VopEngine_native_getSpeakerInfo(long j, SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo);

    float VopEngine_native_getTotalDurationMs(long j);

    int VopEngine_native_init(long j, SAMICoreVopInitContext sAMICoreVopInitContext);

    int VopEngine_native_manageSpeakerInfo(long j, SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand);

    int VopEngine_native_play(long j);

    int VopEngine_native_preparePlayer(long j);

    int VopEngine_native_processRecordAudio(long j, byte[] bArr, int i, int[] iArr);

    int VopEngine_native_stop(long j);

    long VopInstantEngine_native_createEngine();

    void VopInstantEngine_native_destroyEngine(long j);

    int VopInstantEngine_native_getCurrentState(long j, int[] iArr);

    int VopInstantEngine_native_getNextTextInfo(long j, Object[] objArr, int[] iArr);

    int VopInstantEngine_native_getSpeakerInfo(long j, SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo);

    int VopInstantEngine_native_init(long j, SAMICoreVopInitContext sAMICoreVopInitContext);

    int VopInstantEngine_native_manageSpeakerInfo(long j, SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand);

    int VopInstantEngine_native_play(long j);

    int VopInstantEngine_native_preparePlayer(long j, String str);

    int VopInstantEngine_native_processRecordAudio(long j, byte[] bArr, int i, int[] iArr);

    int VopInstantEngine_native_stop(long j);

    void onMessageReceived(int i, SAMICoreBlock sAMICoreBlock);

    void onSendToHost(int i, SAMICoreBlock sAMICoreBlock);

    void setHostCallBackListener(SAMICoreHostCallBackListener sAMICoreHostCallBackListener);

    void setListener(SAMICoreCallBackListener sAMICoreCallBackListener);
}
