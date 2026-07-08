package com.bytedance.ies.nle.editor_jni;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes6.dex */
public class NLEPlayer {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEPlayer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int destroy() {
        synchronized (this) {
            try {
                long j = this.swigCPtr;
                if (j == 0) {
                    return 0;
                }
                return NLEMediaPublicJniJNI.NLEPlayer_destroy(j, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void cancelAsyncRender() {
        NLEMediaPublicJniJNI.NLEPlayer_cancelAsyncRender(this.swigCPtr, this);
    }

    public void clearNLEResourceDownloadStatusListener() {
        NLEMediaPublicJniJNI.NLEPlayer_clearNLEResourceDownloadStatusListener(this.swigCPtr, this);
    }

    public String dumpVEClips() {
        return NLEMediaPublicJniJNI.NLEPlayer_dumpVEClips(this.swigCPtr, this);
    }

    public String dumpVEModel() {
        return NLEMediaPublicJniJNI.NLEPlayer_dumpVEModel(this.swigCPtr, this);
    }

    public String dumpVESequence() {
        return NLEMediaPublicJniJNI.NLEPlayer_dumpVESequence(this.swigCPtr, this);
    }

    public int flushSeekCmd() {
        return NLEMediaPublicJniJNI.NLEPlayer_flushSeekCmd(this.swigCPtr, this);
    }

    public long getCurrentPosition() {
        return NLEMediaPublicJniJNI.NLEPlayer_getCurrentPosition(this.swigCPtr, this);
    }

    public long getDuration() {
        return NLEMediaPublicJniJNI.NLEPlayer_getDuration(this.swigCPtr, this);
    }

    public String getEffectDebugPageUIData() {
        return NLEMediaPublicJniJNI.NLEPlayer_getEffectDebugPageUIData(this.swigCPtr, this);
    }

    public int pause() {
        return NLEMediaPublicJniJNI.NLEPlayer_pause__SWIG_1(this.swigCPtr, this);
    }

    public int play() {
        return NLEMediaPublicJniJNI.NLEPlayer_play(this.swigCPtr, this);
    }

    public int prepare() {
        return NLEMediaPublicJniJNI.NLEPlayer_prepare(this.swigCPtr, this);
    }

    public int rePrepare() {
        return NLEMediaPublicJniJNI.NLEPlayer_rePrepare(this.swigCPtr, this);
    }

    public void releaseAndroidSurface() {
        NLEMediaPublicJniJNI.NLEPlayer_releaseAndroidSurface(this.swigCPtr, this);
    }

    public int releaseEngine() {
        return NLEMediaPublicJniJNI.NLEPlayer_releaseEngine__SWIG_1(this.swigCPtr, this);
    }

    public void releaseMagnifierSurface() {
        NLEMediaPublicJniJNI.NLEPlayer_releaseMagnifierSurface(this.swigCPtr, this);
    }

    public int releaseResource() {
        return NLEMediaPublicJniJNI.NLEPlayer_releaseResource(this.swigCPtr, this);
    }

    public int seekBackward() {
        return NLEMediaPublicJniJNI.NLEPlayer_seekBackward(this.swigCPtr, this);
    }

    public int seekForward() {
        return NLEMediaPublicJniJNI.NLEPlayer_seekForward(this.swigCPtr, this);
    }

    public NLEPlayerState state() {
        return NLEPlayerState.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_state(this.swigCPtr, this));
    }

    public int stop() {
        return NLEMediaPublicJniJNI.NLEPlayer_stop(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEPlayer nLEPlayer) {
        if (nLEPlayer == null) {
            return 0L;
        }
        return nLEPlayer.swigCPtr;
    }

    public void addMessageListener(NLEMediaMessageListener nLEMediaMessageListener) {
        NLEMediaPublicJniJNI.NLEPlayer_addMessageListener(this.swigCPtr, this, NLEMediaMessageListener.getCPtr(nLEMediaMessageListener), nLEMediaMessageListener);
    }

    public void addNLEResourceDownloadStatusListener(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener) {
        NLEMediaPublicJniJNI.NLEPlayer_addNLEResourceDownloadStatusListener(this.swigCPtr, this, INLEResourceDownloadStatusListener.getCPtr(iNLEResourceDownloadStatusListener), iNLEResourceDownloadStatusListener);
    }

    public String dumpSwingEffectData(String str) {
        return NLEMediaPublicJniJNI.NLEPlayer_dumpSwingEffectData(this.swigCPtr, this, str);
    }

    public int pause(boolean z) {
        return NLEMediaPublicJniJNI.NLEPlayer_pause__SWIG_0(this.swigCPtr, this, z);
    }

    public int refreshCurrentFrame(int i) {
        return NLEMediaPublicJniJNI.NLEPlayer_refreshCurrentFrame(this.swigCPtr, this, i);
    }

    public int releaseEngine(boolean z) {
        return NLEMediaPublicJniJNI.NLEPlayer_releaseEngine__SWIG_0(this.swigCPtr, this, z);
    }

    public void removeNLEResourceDownloadStatusListener(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener) {
        NLEMediaPublicJniJNI.NLEPlayer_removeNLEResourceDownloadStatusListener(this.swigCPtr, this, INLEResourceDownloadStatusListener.getCPtr(iNLEResourceDownloadStatusListener), iNLEResourceDownloadStatusListener);
    }

    public NLEError setAndroidMagnifierSurface(Object obj) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidMagnifierSurface__SWIG_1(this.swigCPtr, this, obj));
    }

    public NLEError setAndroidSurface(Object obj) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidSurface__SWIG_1(this.swigCPtr, this, obj));
    }

    public void setAsyncRenderPlayStatusListener(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener) {
        NLEMediaPublicJniJNI.NLEPlayer_setAsyncRenderPlayStatusListener(this.swigCPtr, this, INLEAsyncRenderPlayStatusListener.getCPtr(iNLEAsyncRenderPlayStatusListener), iNLEAsyncRenderPlayStatusListener);
    }

    public int setEditorMode(NLEVEEditorMode nLEVEEditorMode) {
        return NLEMediaPublicJniJNI.NLEPlayer_setEditorMode(this.swigCPtr, this, nLEVEEditorMode.swigValue());
    }

    public void setEnableDirectRenderMode(boolean z) {
        NLEMediaPublicJniJNI.NLEPlayer_setEnableDirectRenderMode(this.swigCPtr, this, z);
    }

    public void setEnableFastcvLanc(boolean z) {
        NLEMediaPublicJniJNI.NLEPlayer_setEnableFastcvLanc(this.swigCPtr, this, z);
    }

    public void setNleModel(NLEModel nLEModel) {
        NLEMediaPublicJniJNI.NLEPlayer_setNleModel(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void setResourceDownloadConfig(INLEResourceDownloadConfig iNLEResourceDownloadConfig) {
        NLEMediaPublicJniJNI.NLEPlayer_setResourceDownloadConfig(this.swigCPtr, this, INLEResourceDownloadConfig.getCPtr(iNLEResourceDownloadConfig), iNLEResourceDownloadConfig);
    }

    public void setResourceManager(NLEResourceManager nLEResourceManager) {
        NLEMediaPublicJniJNI.NLEPlayer_setResourceManager(this.swigCPtr, this, NLEResourceManager.getCPtr(nLEResourceManager), nLEResourceManager);
    }

    public void setSkipNextSeek(boolean z) {
        NLEMediaPublicJniJNI.NLEPlayer_setSkipNextSeek(this.swigCPtr, this, z);
    }

    public void startAsyncRenderResourceDownload(NLEModel nLEModel) {
        NLEMediaPublicJniJNI.NLEPlayer_startAsyncRenderResourceDownload(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEPlayer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public String handleEffectDebugCmd(String str, String str2) {
        return NLEMediaPublicJniJNI.NLEPlayer_handleEffectDebugCmd(this.swigCPtr, this, str, str2);
    }

    public int seekTime(long j, NLESeekFlag nLESeekFlag) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekTime__SWIG_0(this.swigCPtr, this, j, nLESeekFlag.swigValue());
    }

    public int seekWithFrame(long j, NLEListenerGetImageWrapper nLEListenerGetImageWrapper) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekWithFrame__SWIG_0(this.swigCPtr, this, j, NLEListenerGetImageWrapper.getCPtr(nLEListenerGetImageWrapper), nLEListenerGetImageWrapper);
    }

    public int seekWithFrameStable(long j, NLEListenerGetImageWrapper nLEListenerGetImageWrapper) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekWithFrameStable(this.swigCPtr, this, j, NLEListenerGetImageWrapper.getCPtr(nLEListenerGetImageWrapper), nLEListenerGetImageWrapper);
    }

    public NLEError setAndroidMagnifierSurface(Object obj, boolean z) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidMagnifierSurface__SWIG_0(this.swigCPtr, this, obj, z));
    }

    public NLEError setAndroidSurface(Object obj, boolean z) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidSurface__SWIG_0(this.swigCPtr, this, obj, z));
    }

    public NLEError setMagnifierSurfaceSize(int i, int i2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setMagnifierSurfaceSize(this.swigCPtr, this, i, i2));
    }

    public int setPlayRange(long j, long j2) {
        return NLEMediaPublicJniJNI.NLEPlayer_setPlayRange__SWIG_1(this.swigCPtr, this, j, j2);
    }

    public NLEError setPreviewSurfaceSize(int i, int i2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setPreviewSurfaceSize(this.swigCPtr, this, i, i2));
    }

    public int handleEffectDebugService(int i, String str, String str2) {
        return NLEMediaPublicJniJNI.NLEPlayer_handleEffectDebugService(this.swigCPtr, this, i, str, str2);
    }

    public int seekTime(long j, NLESeekFlag nLESeekFlag, long j2) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekTime__SWIG_1(this.swigCPtr, this, j, nLESeekFlag.swigValue(), j2);
    }

    public int seekWithFrame(long j, int i, NLEListenerGetImageWrapper nLEListenerGetImageWrapper) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekWithFrame__SWIG_1(this.swigCPtr, this, j, i, NLEListenerGetImageWrapper.getCPtr(nLEListenerGetImageWrapper), nLEListenerGetImageWrapper);
    }

    public int setPlayRange(long j, long j2, NLESetRangeMode nLESetRangeMode) {
        return NLEMediaPublicJniJNI.NLEPlayer_setPlayRange__SWIG_0(this.swigCPtr, this, j, j2, nLESetRangeMode.swigValue());
    }

    public int seekWithSpeed(long j, NLESeekFlag nLESeekFlag, float f, float f2) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekWithSpeed(this.swigCPtr, this, j, nLESeekFlag.swigValue(), f, f2);
    }
}
