package com.ss.lyrax;

import com.ss.lyrax.audio.LyraxAudioContentConfig;
import com.ss.lyrax.audio.LyraxAudioDownLinkSelectionPriority;
import com.ss.lyrax.audio.LyraxAudioEncoderConfig;
import com.ss.lyrax.publisher.ILyraxPublisherListener;
import com.ss.lyrax.stream.LyraxCredential;
import com.ss.lyrax.stream.LyraxLayoutConfig;
import com.ss.lyrax.stream.LyraxPublisherConfig;
import com.ss.lyrax.stream.LyraxPublisherStats;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoColorSpace;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoPooledFrame;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.lyrax.video.LyraxVideoSeiParamV1;
import com.ss.lyrax.video.LyraxVideoSeiParamV2;
import com.ss.lyrax.video.LyraxVideoSourceConfig;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxPublisher extends ILyraxObject {
    LyraxErrorCode addVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat);

    void dispose();

    LyraxErrorCode enableAudioToAvatarMode(boolean z);

    LyraxErrorCode enableCalculateAudioLoudness(boolean z);

    LyraxErrorCode enablePushStream();

    LyraxErrorCode enableSendE2EInfoSEIV2(boolean z, int i);

    LyraxErrorCode enableSendSEIV2(boolean z);

    LyraxVideoPooledFrame getLyraxVideoPooledFrame(LyraxVideoPixelFormat lyraxVideoPixelFormat, int i, int i2, int i3, LyraxVideoRotation lyraxVideoRotation, LyraxVideoColorSpace lyraxVideoColorSpace);

    LyraxPublisherStats getStats();

    LyraxStreamProtocol getStreamProtocol();

    LyraxVideoEncoderConfig getVideoEncoderConfig();

    boolean isLyraxVideoPooledFrameEnabled();

    LyraxErrorCode mute(LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode publish();

    LyraxErrorCode pushVideoFrame(LyraxVideoFrame lyraxVideoFrame);

    LyraxErrorCode removeVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink);

    LyraxErrorCode resetVideoPerfDegradeLimit();

    LyraxErrorCode sendSEIV1(LyraxVideoSeiParamV1 lyraxVideoSeiParamV1);

    LyraxErrorCode sendSEIV2(LyraxVideoSeiParamV2 lyraxVideoSeiParamV2);

    LyraxErrorCode setAudioCaptureVolume(int i);

    LyraxErrorCode setAudioContentConfig(LyraxAudioContentConfig lyraxAudioContentConfig);

    LyraxErrorCode setAudioDownLinkSelectionPriority(LyraxAudioDownLinkSelectionPriority lyraxAudioDownLinkSelectionPriority);

    LyraxErrorCode setAudioEncoderConfig(LyraxAudioEncoderConfig lyraxAudioEncoderConfig);

    LyraxErrorCode setCurrentShiftDiffTimeSEIV2(long j);

    LyraxErrorCode setE2EAnchorLinkmicIdSEIV2(String str);

    LyraxErrorCode setFeaturesConfig(LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig);

    LyraxErrorCode setLayoutConfig(LyraxLayoutConfig lyraxLayoutConfig);

    LyraxErrorCode setListener(ILyraxPublisherListener iLyraxPublisherListener);

    LyraxErrorCode setListenerInternal(ILyraxPublisherListener iLyraxPublisherListener);

    LyraxErrorCode setPublisherConfig(LyraxPublisherConfig lyraxPublisherConfig);

    LyraxErrorCode setPublisherCredential(LyraxCredential lyraxCredential);

    LyraxErrorCode setVideoEncoderConfig(LyraxVideoEncoderConfig lyraxVideoEncoderConfig);

    LyraxErrorCode setVideoPerfDegradeLimit(LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit);

    LyraxErrorCode setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    LyraxErrorCode setVideoSourceConfig(LyraxVideoSourceConfig lyraxVideoSourceConfig);

    LyraxErrorCode setVideoStandardDowngradeTier(int i, int i2, int i3, int i4);

    LyraxErrorCode startPushVideoFile(String str, boolean z);

    LyraxErrorCode stopPushVideoFile();

    LyraxErrorCode unmute(LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode unpublish();

    LyraxErrorCode updateLyraxExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    LyraxErrorCode updatePublishedTask();
}
