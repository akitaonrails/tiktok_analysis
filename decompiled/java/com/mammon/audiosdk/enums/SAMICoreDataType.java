package com.mammon.audiosdk.enums;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public enum SAMICoreDataType {
    SAMICoreDataType_Float(0),
    SAMICoreDataType_Int(1),
    SAMICoreDataType_String(2),
    SAMICoreDataType_Null(5),
    SAMICoreDataType_AudioBuffer(50),
    SAMICoreDataType_Data_Uri_Parameter(52),
    SAMICoreDataType_ContextPrepareParameter(100),
    SAMICoreDataType_ResourceParameter(101),
    SAMICoreDataType_ParameterEvent(102),
    SAMICoreDataType_ProcessorParameter(150),
    SAMICoreDataType_FeatureSet(250),
    SAMICoreDataType_ExtractorParameter(251),
    SAMICoreDataType_ModelBin(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL),
    SAMICoreDataType_AecInput(350),
    SAMICoreDataType_TTSCallBack(400),
    SAMICoreDataType_EngineCreateParameter(401),
    SAMICoreDataType_ExecutorCreateParameter(402),
    SAMICoreDataType_TimeAlign(450),
    SAMICoreDataType_LoudNorm(451),
    SAMICoreDataType_LoudNorm2(452),
    SAMICoreDataType_KWS(455),
    SAMICoreDataType_KWS_SA_REAULT(456),
    SAMICoreDataType_TTS_Result(500),
    SAMICoreDataType_ASR_Result(503),
    SAMICoreDataType_AudioBin(504),
    SAMICoreDataType_BeatTracking_Result(505),
    SAMICoreDataType_MusicSourceSeparate_Result(506),
    SAMICoreDataType_MusicTagging_Result(507),
    SAMICoreDataType_Chorus_Result(508),
    SAMICoreDataType_MusicRetarget_Result(509),
    SAMICoreDataType_Midi_Result(510),
    SAMICoreDataType_Token_Result(511),
    SAMICoreDataType_SpeechDisfluency_Result(512),
    SAMICoreDataType_VoiceFilterParam(513),
    SAMICoreDataType_ServerHttpResponse(514),
    SAMICoreDataType_Http_Common_Response(517),
    SAMICoreDataType_WebSocket_Server_Event(600),
    SAMICoreDataType_WebSocket_Connection_Event(601),
    SAMICoreDataType_WebSocket_Asr(602),
    SAMICoreDataType_WebSocket_Tts(603),
    SAMICoreDataType_WebSocket_Vc(604),
    SAMICoreDataType_WebSocket_Vc_Speaker(605),
    SAMICoreDataType_WebSocket_KeepAliveParam(606),
    SAMICoreDataType_WebSocket_Asr_Context_Param(650),
    SAMICoreDataType_WebSocket_Tts_Context_Param(651),
    SAMICoreDataType_Voice_Assistant_Property_Param(652),
    SAMICoreDataType_Voice_Assistant_Audio_data(653),
    SAMICoreDataType_Voice_Assistant_Aec_Context_Param(654),
    SAMICoreDataType_Voice_Assistant_Text_data(655),
    SAMICoreDataType_Voice_Assistant_Trace_Span_Param(656),
    SAMICoreDataType_Voice_Assistant_LoudnessStrategy_Param(657),
    SAMICoreDataType_PostProcess_LoudnessStrategy_Param(657),
    SAMICoreDataType_Voice_Assistant_Mem_Upload_Param(680),
    SAMICoreDataType_WebSocket_BidirectionalTTS_Param(681),
    SAMICoreDataType_Voice_Assistant_Info_Upload_Param(682),
    SAMICore_DataType_TimeStretcher_ScaleInfo(800);

    public static final HashMap<Integer, SAMICoreDataType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreDataType sAMICoreDataType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreDataType.getValue()), sAMICoreDataType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreDataType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreDataType valueOf(String str) {
        return (SAMICoreDataType) C08FF.LIZ(SAMICoreDataType.class, str);
    }

    SAMICoreDataType(int i) {
        this.value = i;
    }
}
