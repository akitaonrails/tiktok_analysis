package com.mammon.audiosdk.enums;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public enum SAMICoreCallBackEventType {
    TTS_Started(0),
    TTS_GetResulted(1),
    TTS_Finished(2),
    TTS_Failed(3),
    TTS_WebSocketStateChanged(4),
    ASR_Started(5),
    ASR_GetResulted(6),
    ASR_Finished(7),
    ASR_Failed(8),
    ASR_WebSocketStateChanged(9),
    VC_Started(10),
    VC_GetResulted(11),
    VC_Finished(12),
    VC_Failed(13),
    VC_WebSocketStateChanged(14),
    VC_Player_Finished(15),
    TTS_Player_Finished(20),
    SA_EngineStart(50),
    SA_EngineStop(51),
    SA_EngineError(52),
    SA_WakeupResult(53),
    SA_SidEnrollResult(54),
    SA_SidLoadResult(55),
    SA_PreWakeupResult(56),
    SA_WakeupTimeout(57),
    SA_SidVerifyFailResult(58),
    SA_WakeupEnd(59),
    TaskStarted(200),
    TaskFinished(201),
    TaskFailed(202),
    GetResulted(203),
    SessionStarted(204),
    SessionFinished(205),
    SessionCanceled(206),
    SessionFailed(207),
    TaskResponse(208),
    ASRResponse(209),
    ASREnded(210),
    ChatResponse(211),
    ChatEnded(212),
    TTSSentenceStart(213),
    TTSResponse(214),
    TTSSentenceEnd(215),
    TTSEnded(216),
    WebSocketStateChanged(217),
    CallDisConnectedWithRetry(218),
    RequestRetried(219),
    ASRInfo(220),
    BSResponse(221),
    BotTriggered(222),
    AudioUploadEnded(223),
    SpeechStarted(224),
    SpeechEnded(225),
    PlayerStarted(226),
    PlayerStopped(227),
    SessionConfResponse(230),
    PostBackAudioConfig(231),
    VadStarted(250),
    VadEnded(251),
    PVadStarted(252),
    PVadEnded(253),
    SpeakerSimilarity(254),
    VuiReset(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL),
    VAD_TimeOut(352),
    WakeUp_Succeed(353),
    WakeUp_Failed(354),
    AIS_Data(400),
    AIS_Ability(401);

    public static final HashMap<Integer, SAMICoreCallBackEventType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreCallBackEventType sAMICoreCallBackEventType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreCallBackEventType.getValue()), sAMICoreCallBackEventType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreCallBackEventType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreCallBackEventType valueOf(String str) {
        return (SAMICoreCallBackEventType) C08FF.LIZ(SAMICoreCallBackEventType.class, str);
    }

    SAMICoreCallBackEventType(int i) {
        this.value = i;
    }
}
