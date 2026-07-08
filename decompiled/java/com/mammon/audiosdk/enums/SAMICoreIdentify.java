package com.mammon.audiosdk.enums;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: loaded from: classes4.dex */
public enum SAMICoreIdentify {
    SAMICoreIdentify_Processor_ContextWithString(0),
    SAMICoreIdentify_Processor_ContextWithFileName(1),
    SAMICoreIdentify_Processor(100),
    SAMICoreIdentify_Processor_Gain(101),
    SAMICoreIdentify_Processor_Compressor(102),
    SAMICoreIdentify_Processor_Chorus(103),
    SAMICoreIdentify_Processor_Distortion(104),
    SAMICoreIdentify_Processor_Echo(105),
    SAMICoreIdentify_Processor_Filter(106),
    SAMICoreIdentify_Processor_GainAndPan(107),
    SAMICoreIdentify_Processor_Limiter(108),
    SAMICoreIdentify_Processor_Reverb(109),
    SAMICoreIdentify_Processor_Vibrato(110),
    SAMICoreIdentify_Processor_TimeDomainPitchShifter(111),
    SAMICoreIdentify_Processor_SpatialAudio(112),
    SAMICoreIdentify_Processor_AECompressor(113),
    SAMICoreIdentify_Drc(116),
    SAMICoreIdentify_Extractor_F0Detection(200),
    SAMICoreIdentify_Extractor_OnsetDetection(201),
    SAMICoreIdentify_Extractor_SpectrumDisplay(202),
    SAMICoreIdentify_Extractor_VolumeDetection(203),
    SAMICoreIdentify_Extractor_EventDetection(204),
    SAMICoreIdentify_Extractor_VoiceActivityDetection(205),
    SAMICoreIdentify_Extractor_BeatTracking(206),
    SAMICoreIdentify_Extractor_BeatTrackingOffline(207),
    SAMICoreIdentify_Extractor_Music2VibesVideoModel(208),
    SAMICoreIdentify_Extractor_Music2VibesMatchModel(209),
    SAMICoreIdentify_Extractor_NNVAD(210),
    SAMICoreIdentify_Extractor_Loudness(211),
    SAMICoreIdentify_Extractor_AedS2s(212),
    SAMICoreIdentify_Extractor_VoiceActivityDetection_S2S(213),
    SAMICoreIdentify_AEC(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL),
    SAMICoreIdentify_RNNAEC(301),
    SAMICoreIdentify_AGC(302),
    SAMICoreIdentify_RNNOSIE16K(303),
    SAMICoreIdentify_RNNOSIE(304),
    SAMICoreIdentify_RNNOSIE48K(305),
    SAMICoreIdentify_TCNDENOISE44K(306),
    SAMICoreIdentify_TCNDENOISE16K(307),
    SAMICoreIdentify_DENOISE_V2_MUSIC44k(308),
    SAMICoreIdentify_DENOISE_V2_SPEECH44k(309),
    SAMICoreIdentify_DENOISE_V2_MUSIC16k(310),
    SAMICoreIdentify_DENOISE_V2_SPEECH16k(311),
    SAMICoreIdentify_DENOISE_V2_DEREVERB44k(312),
    SAMICoreIdentify_BEAM_FORMING(313),
    SAMICoreIdentify_NNAEC_MIC_SELECTION(314),
    SAMICoreIdentify_DENOISE_V2(315),
    SAMICoreIdentify_TimeScaler(400),
    SAMICoreIdentify_Engine(500),
    SAMICoreIdentify_EngineExecutor(501),
    SAMICoreIdentify_EngineExecutor_TimeAlign(502),
    SAMICoreIdentify_EngineExecutor_AED(503),
    SAMICoreIdentify_EngineExecutor_Denoise(504),
    SAMICoreIdentify_EngineExecutor_AudioMetrics(508),
    SAMICoreIdentify_EngineExecutor_Common(512),
    SAMICoreIdentify_Create_Token(600),
    SAMICoreIdentify_TTS_Online(601),
    SAMICoreIdentify_ASR_Online(602),
    SAMICoreIdentify_BeatTracking_Online(603),
    SAMICoreIdentify_MusicSourceSeparate_Online(604),
    SAMICoreIdentify_MusicTagging_Online(605),
    SAMICoreIdentify_Chorus_Online(606),
    SAMICoreIdentify_MusicRetarget_Online(607),
    SAMICoreIdentify_Midi_Online(608),
    SAMICoreIdentify_SpeechDisfluency_Online(609),
    SAMICoreIdentify_VoiceFilter_Online(610),
    SAMICoreIdentify_GET_MixedEncryptedFOnlineToken(611),
    SAMICoreIdentify_LyricsAlignment_Online(612),
    SAMICoreIdentify_SpeechToSong_Online(613),
    SAMICoreIdentify_HTTP_COMMON(614),
    SAMICoreIdentify_Streaming_ASR_Online(650),
    SAMICoreIdentify_Streaming_TTS_Online(651),
    SAMICoreIdentify_Streaming_Playing_TTS_Online(652),
    SAMICoreIdentify_Streaming_VC_Online(654),
    SAMICoreIdentify_SPEECH_RECOGNITION(OppoPermissionPopupMaskDelayExp.DEFAULT),
    SAMICoreIdentify_Audio_Encode(800),
    SAMICoreIdentify_Processor_ContextWithBinaryRes(2000),
    SAMICoreIdentify_TuneToTarget(LivePreCreateNextRoomPlayer.ENABLE),
    SAMICoreIdentify_Get_DevicePlaybackAbility(7000);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreIdentify valueOf(String str) {
        return (SAMICoreIdentify) C08FF.LIZ(SAMICoreIdentify.class, str);
    }

    SAMICoreIdentify(int i) {
        this.value = i;
    }
}
