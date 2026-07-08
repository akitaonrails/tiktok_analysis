package com.ss.lyrax.pushersession;

import com.ss.lyrax.ILyraxObject;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxPusherSession extends ILyraxObject {
    LyraxErrorCode addUserMetadata(String str, String str2);

    LyraxErrorCode bindToRoom(String str);

    LyraxErrorCode cacheJoinRoomState();

    void dispose();

    LyraxErrorCode enableCalculateAudioLoudness(boolean z);

    LyraxScene getCurrentScene();

    LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels();

    LyraxPusherState getPusherState();

    int getSessionVersion();

    String getStreamInfo(String str);

    List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable();

    LyraxErrorCode insertStandardLevel(int i, int i2, int i3, int i4);

    boolean isRunning();

    LyraxErrorCode pushVideoFrame(LyraxVideoFrame lyraxVideoFrame);

    void reportFinalLog(String str);

    LyraxErrorCode resetVideoPerformanceConfig(String str);

    LyraxErrorCode sendSEI(LyraxPusherSEIParam lyraxPusherSEIParam);

    LyraxErrorCode setAppState(String str);

    LyraxErrorCode setEncodeOutputSize(int i, int i2);

    LyraxErrorCode setFeaturesConfig(LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig);

    LyraxErrorCode setListener(ILyraxPusherSessionListener iLyraxPusherSessionListener);

    LyraxErrorCode setSeiCurrentShiftDiffTime(long j);

    LyraxErrorCode setVideoBitrate(int i, int i2);

    LyraxErrorCode setVideoFrameRate(int i);

    LyraxErrorCode setVideoPerformanceConfig(int i, int i2, int i3, String str);

    LyraxErrorCode setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    LyraxErrorCode startPush(boolean z);

    LyraxErrorCode stopPush(boolean z);

    LyraxErrorCode switchScene(LyraxScene lyraxScene);

    LyraxErrorCode unbindFromRoom(String str);

    LyraxErrorCode updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);
}
