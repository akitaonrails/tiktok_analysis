package com.bytedance.ies.nle.editor_jni;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEPlayer extends INLEPurePlayer {
    void addKeyframeListener(INLEListenerKeyframe iNLEListenerKeyframe);

    void addNLEResourceDownloadListener(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    void addOnInfoListener(INLEListenerCommon iNLEListenerCommon, boolean z);

    void cancelAsyncRender();

    void clearNLEResourceDownloadListener();

    void clearSkipSeekBlock();

    String dumpVEClips();

    int flushSeekCmd();

    String getEffectDebugPageUIData();

    String handleEffectDebugCmd(String str, String str2);

    int handleEffectDebugService(int i, String str, String str2);

    void refreshAllKeyframeInfo(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot);

    void refreshAllKeyframeInfo(String str, long j, String str2, NLETrack nLETrack, NLETrackSlot nLETrackSlot, KeyframeType keyframeType);

    int refreshCurrentFrame(int i);

    int releaseEngineUnitResourceAsync(INLEListenerAsyncReleaseEngineUnitResource iNLEListenerAsyncReleaseEngineUnitResource);

    int releaseResource();

    void removeNLEResourceDownloadListener(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    void removeOnInfoListener(INLEListenerCommon iNLEListenerCommon);

    int seekBackward();

    int seekForward();

    int seekTime(long j, NLESeekFlag nLESeekFlag);

    int seekTime(long j, NLESeekFlag nLESeekFlag, INLEListenerSeek iNLEListenerSeek);

    int seekWithFrame(long j, int i, INLEListenerGetImage iNLEListenerGetImage);

    int seekWithFrame(long j, INLEListenerGetImage iNLEListenerGetImage);

    int seekWithFrameStable(long j, INLEListenerGetImage iNLEListenerGetImage);

    int seekWithSpeed(long j, NLESeekFlag nLESeekFlag, float f, float f2);

    void setAsyncRenderPlayStatusListener(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener);

    void setEditorMode(NLEVEEditorMode nLEVEEditorMode);

    void setEnableDirectRenderMode(boolean z);

    void setEnableFastcvLanc(boolean z);

    void setFirstFrameListener(INLEListenerFirstFrame iNLEListenerFirstFrame);

    void setNLEModelChangeListener(INLEModelChangeListener iNLEModelChangeListener);

    void setOnErrorListener(INLEListenerCommon iNLEListenerCommon);

    int setPlayRange(long j, long j2);

    int setPlayRange(long j, long j2, NLESetRangeMode nLESetRangeMode);

    void setPlayerStatusListener(INLEListenerPlayerStatus iNLEListenerPlayerStatus);

    void setResourceDownloadConfig(INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    void setResourceManager(NLEResourceManager nLEResourceManager);

    void setSkipSeekBlock(Function0<Boolean> function0);

    void setSurfaceStatusListener(INLEListenerSurfaceStatus iNLEListenerSurfaceStatus);

    void setVideoOutputListener(INLEListenerVideoOutput iNLEListenerVideoOutput);

    NLEPlayerState state();

    public static final class DefaultImpls {
        public static /* synthetic */ void addOnInfoListener$default(INLEPlayer iNLEPlayer, INLEListenerCommon iNLEListenerCommon, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                iNLEPlayer.addOnInfoListener(iNLEListenerCommon, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnInfoListener");
        }
    }
}
