package com.ss.android.ugc.aweme.player.sdk.api;

import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.EnumC2281141EQm;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface OnUIPlayListener {
    OnUIPlayListener getWrapperedListener();

    void onBrightnessChanged(String str, float f);

    void onBufferedPercent(String str, long j, int i);

    void onBufferedTimeMs(String str, long j);

    void onBuffering(String str, boolean z);

    void onBuffering(String str, boolean z, C1480430ocz c1480430ocz);

    void onBuffering(boolean z);

    void onCompleteLoaded(String str, boolean z);

    void onCrosstalkHappened(String str);

    void onCrosstalkHappened(String str, List<Map<String, Object>> list);

    void onDecoderBuffering(String str, boolean z);

    void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz);

    void onDecoderBuffering(boolean z);

    void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map);

    void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy);

    void onLoopPlay(String str, int i);

    void onMaskInfoCallback(String str, C1480290ocl c1480290ocl);

    void onPausePlay(String str);

    void onPausePlay(String str, C1480430ocz c1480430ocz);

    void onPlayCompleted(String str);

    void onPlayCompleted(String str, int i);

    void onPlayCompletedFirstTime(String str);

    void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz);

    void onPlayFailed(C1481290oeN c1481290oeN);

    void onPlayFailed(String str, C1481290oeN c1481290oeN);

    void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz);

    void onPlayPause(String str);

    void onPlayPrepare(String str);

    void onPlayPrepared(String str);

    void onPlayProgressChange(float f);

    void onPlayProgressChange(String str, long j, long j2);

    void onPlayRelease(String str);

    void onPlayStop(String str);

    void onPlayStop(String str, JSONObject jSONObject);

    void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz);

    void onPlayStop(String str, boolean z);

    void onPlayerInternalEvent(String str, int i, JSONObject jSONObject);

    void onPlaying(String str);

    void onPlaying(String str, C1480430ocz c1480430ocz);

    void onPreRenderSessionMissed(String str);

    void onPreparePlay(String str);

    void onPreparePlay(String str, C1480430ocz c1480430ocz);

    void onRenderFirstFrame(C1480420ocy c1480420ocy);

    void onRenderFirstFrame(String str, C1480420ocy c1480420ocy);

    void onRenderFirstFrameFromResume(String str);

    void onRenderReady(C1480430ocz c1480430ocz);

    void onResumePlay(String str);

    void onResumePlay(String str, C1480430ocz c1480430ocz);

    void onRetryOnError(C1481290oeN c1481290oeN);

    void onRetryOnError(String str, C1481290oeN c1481290oeN);

    void onSeekEnd(String str, boolean z);

    void onSeekStart(String str, int i, float f);

    void onSpeedChanged(String str, float f);

    void onStopPlay(String str);

    void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i);

    void onVideoSecondFrame(String str);

    void onVideoSizeChanged(String str, int i, int i2);
}
