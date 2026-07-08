package com.ss.solution.interact;

import X.C08FF;
import android.view.View;
import com.ss.avframework.livestreamv2.core.interact.DisposableParams;
import com.ss.lyrax.stream.LyraxForwardStreamInfo;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutRegionConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderServerControlConfig;
import com.ss.lyrax.transcoder.MixStreamCommonConfig;
import com.ss.lyrax.transcoder.MixStreamVideoConfig;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface IInteract {
    int adjustPlaybackSignalVolume(int i);

    int adjustRecordingSignalVolume(int i);

    int applyMixStream(DisposableParams disposableParams);

    AuxStreamInfo createAuxStream(String str);

    int disableAudio();

    void disableDownlinkAudioSelection();

    int enableAudio();

    int enableAudioVolumeIndication(int i, int i2);

    void enableDownlinkAudioSelection(int i);

    String getBusinessId();

    String getLivePusherTaskId();

    int initialize();

    boolean isJoined();

    int joinChannel();

    int leaveChannel();

    int muteAllRemoteAudioStreams(boolean z);

    int muteAllRemoteVideoStreams(boolean z);

    int muteAuxStreamAudio(String str, boolean z);

    int muteLocalAudioStream(boolean z);

    int muteLocalVideoStream(boolean z);

    int muteRemoteAudioStream(String str, boolean z);

    int muteRemoteVideoStream(String str, boolean z);

    void parseSDKParams(String str);

    void publishBlackFrameIfNeeded();

    int publishVideoStream(boolean z);

    void recoverVideoStreamStatus();

    void removeVideoRenderer(String str);

    void reportAPICall(String str, String str2);

    int resetVideoPerformanceConfig();

    int sendRoomBinaryMessage(byte[] bArr);

    int sendRoomMessage(String str);

    int sendSEIV1(String str, int i, boolean z);

    int sendSEIV1(byte[] bArr, int i, boolean z);

    int sendSEIV2(String str, int i, boolean z, boolean z2);

    long sendUserMessage(String str, String str2);

    int setAuxStreamRenderView(String str, Object obj);

    void setBizSessionId(String str);

    int setBusinessId(String str);

    int setBusinessLabel(String str);

    int setDefaultMuteAllRemoteAudioStreams(boolean z);

    int setDefaultMuteAllRemoteVideoStreams(boolean z);

    int setDownLinkAudioSelectionPriority(int i, int i2);

    int setEnableSpeakerphone(boolean z);

    int setGroupChannelId(String str);

    void setInteractParams(int i, boolean z);

    void setLinkMicType(int i);

    void setLinkmicStateForAnchorNet();

    int setMixStreamAppDataSEI(String str);

    int setMixStreamRegions(LyraxTranscoderLayoutRegionConfig[] lyraxTranscoderLayoutRegionConfigArr);

    void setNativeListener(IInteractNativeListener iInteractNativeListener);

    void setPlaybackVolume(int i);

    void setRemoteAudioPlaybackVolume(String str, int i);

    int setRemoteRoomAudioPlaybackVolume(int i);

    void setRemoteSessionNeedRender(boolean z);

    void setRemoteVideoRenderTargetView(String str, View view);

    void setRtcScene(int i);

    int setRtcVideoSize(int i, int i2, int i3, int i4);

    int setSEICurrentShiftDiffTimeMs(long j);

    int setVideoEncoderConfig(int i, LyraxVideoEncoderConfig lyraxVideoEncoderConfig);

    int setVideoPerformanceConfig(int i, int i2, int i3, int i4);

    int setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    int startAuxStream(String str);

    int startForwardStreamToRooms(List<LyraxForwardStreamInfo> list);

    int startMixStream();

    int stopAuxStream(String str);

    int stopForwardStreamToRooms();

    int stopMixStream();

    int subscribeAuxStream(String str);

    int subscribeAuxStreamWithMediaType(String str, boolean z, boolean z2);

    void subscribeRemoteStream(int i, int i2);

    int unsubscribeAuxStream(String str);

    int updateAuthInfo(String str);

    int updateAuxStreamEncodeConfig(String str, int i, int i2, int i3, int i4, int i5, int i6);

    int updateAuxStreamSourceConfig(String str, Object obj);

    ChannelBaseApplyResult updateChannelBaseConfiguration(String str, String str2);

    int updateForwardStreamToRooms(List<LyraxForwardStreamInfo> list);

    void updateInteractVideoSourceType(int i);

    int updateMixStreamAuthInfo(String str);

    int updateMixStreamCommonConfig(MixStreamCommonConfig mixStreamCommonConfig);

    int updateMixStreamVideoConfig(MixStreamVideoConfig mixStreamVideoConfig);

    void updateRtcExtInfo(String str);

    int updateServerControlConfig(LyraxTranscoderServerControlConfig lyraxTranscoderServerControlConfig);

    void updateSingleViewModeFlag(boolean z);

    boolean videoStreamPublished();

    /* JADX INFO: loaded from: classes17.dex */
    public enum AudioSelectionPriority {
        NORMAL(0),
        MEDIUM(1),
        HIGH(2),
        CRITICAL(3);

        public final int value;

        public int getValue() {
            return this.value;
        }

        public static AudioSelectionPriority valueOf(String str) {
            return (AudioSelectionPriority) C08FF.LIZ(AudioSelectionPriority.class, str);
        }

        AudioSelectionPriority(int i) {
            this.value = i;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public enum RTCStreamIndex {
        STREAM_INDEX_MAIN(0),
        STREAM_INDEX_SCREEN(1);

        public final int value;

        public int getValue() {
            return this.value;
        }

        public static RTCStreamIndex valueOf(String str) {
            return (RTCStreamIndex) C08FF.LIZ(RTCStreamIndex.class, str);
        }

        RTCStreamIndex(int i) {
            this.value = i;
        }
    }

    public enum FrameType {
        DEFAULT_OCCUPY,
        METADATA,
        SEI,
        METADATA_SEI;

        public static FrameType valueOf(String str) {
            return (FrameType) C08FF.LIZ(FrameType.class, str);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public enum PerformanceProfile {
        LOW,
        MID,
        HIGH;

        public static PerformanceProfile valueOf(String str) {
            return (PerformanceProfile) C08FF.LIZ(PerformanceProfile.class, str);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public enum ViewMode {
        MULTI_VIEW,
        SINGLE_VIEW;

        public static ViewMode valueOf(String str) {
            return (ViewMode) C08FF.LIZ(ViewMode.class, str);
        }
    }
}
