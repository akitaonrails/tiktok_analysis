package com.ss.ttlivestreamer.core.effect;

import X.C0WZX;
import X.C1272380jDQ;
import X.C1272610jDn;
import X.C1273670jFV;
import X.C1274040jG6;
import X.C1977007om;
import X.C2188811AlT;
import X.C2204961BRm;
import X.InterfaceC1272120jD0;
import X.InterfaceC1272510jDd;
import X.InterfaceC1272540jDg;
import X.InterfaceC1272550jDh;
import X.InterfaceC1272620jDo;
import X.InterfaceC1272630jDp;
import X.InterfaceC1272640jDq;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bef.effectsdk.EffectABConfig;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class EffectWrapper extends NativeObject implements InterfaceC1272120jD0 {
    public static WeakReference<InterfaceC1272510jDd> mEffectEdgeLog = new WeakReference<>(null);
    public boolean enableTTLHInitTimeCostOpt;
    public volatile AudioDeviceModule.AudioRenderSink mAudioRenderSink;
    public Long mDetectFlag = new Long(0);
    public InterfaceC1272540jDg mEffectMsgListener;
    public C1272610jDn[] mExpressionBundles;
    public InterfaceC1272620jDo mExpressionListener;
    public TEBundle[] mExpressionTEBundles;
    public InterfaceC1272550jDh mFaceListener;
    public boolean mFromExtern;
    public InterfaceC1272630jDp mIEffectInfoChangeListener;
    public boolean mValid;

    public static String NonNull(String str) {
        return str == null ? "" : str;
    }

    private boolean checkVersion() {
        try {
            String effectVersion = getEffectVersion();
            boolean z = !TextUtils.isEmpty(effectVersion);
            this.mValid = z;
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Effect Version:");
                sbLIZ.append(effectVersion);
                AVLog.ioe("EffectWrapper", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mValid = false;
        }
        return this.mValid;
    }

    private native int nativeAddAmazingAllowedPath(String str);

    public static native String nativeAlgorithmResultGameSizeCheck(long j);

    private native int nativeAudioStrangeVoiceProcess(Buffer buffer, int i, int i2, int i3, long j);

    private native void nativeBindWithEffectNativeHandler(long j);

    public static native int nativeBuildBufferFromString(int i, String str, ByteBuffer byteBuffer);

    private native int nativeComposerAppendNodes(String[] strArr, int i);

    private native int nativeComposerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerAppendNodesWithTagsForEffectChain(String[] strArr, int i, String[] strArr2, String str);

    private native int nativeComposerCancelPreloadNodes(String[] strArr, int i);

    private native int nativeComposerCheckNodeExclusion(String str, String str2, int[] iArr);

    private native int nativeComposerExclusionCompare(String str, String str2, String str3, int[] iArr);

    private native int nativeComposerPreloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerReloadNodes(String[] strArr, int i);

    private native int nativeComposerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerRemoveNodes(String[] strArr, int i);

    private native int nativeComposerRemoveNodesForEffectChain(String[] strArr, int i, String str);

    private native int nativeComposerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native int nativeComposerSetMode(int i, int i2);

    private native int nativeComposerSetNodes(String[] strArr, int i);

    private native int nativeComposerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr);

    private native int nativeComposerUpdateNode(String str, String str2, float f);

    public static native int nativeConfigABBooleanValue(String str, boolean z);

    public static native int nativeConfigABFloatValue(String str, float f);

    public static native int nativeConfigABIntValue(String str, int i);

    public static native int nativeConfigABStringValue(String str, String str2);

    private native int nativeConfigEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3, int i3, boolean z3);

    private native void nativeConfigGpuTurboMode(int i, int i2, boolean z);

    private native void nativeConfigSequenceCache(long j);

    private native AlgorithmResult nativeCreateAlgorithmResult();

    private native long nativeCreateEffectTrack();

    private native void nativeCreateEffectWrapper(AudioDeviceModule audioDeviceModule, AudioDeviceModule.AudioRenderSink audioRenderSink, boolean z);

    private native void nativeDeBindWithEffectNativeHandler(long j);

    private native int nativeDestroyEffectAudioHandler();

    private native int nativeDestroyEffectTrack(long j);

    private native int nativeDetectFaceFromBitMap(Bitmap bitmap);

    private native int nativeDisableEffectAudio();

    private native int nativeEffectAudioProcessData(ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeEffectAudioProcessDataV2(ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeEffectAudioSetPlaybackDeviceType(int i);

    private native long nativeEffectNativeHandler();

    private native int nativeEnableEffectAudio();

    private native void nativeEnableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private native int nativeEnableFindContour(boolean z, String str);

    private native void nativeEnableSetMD5ResourceFinder(boolean z);

    private native long nativeGetAlgorithmRequirment();

    private native long nativeGetAlgorithmRequirmentParams();

    private native long nativeGetAlgorithmResult(AlgorithmResult algorithmResult, long j);

    private native boolean nativeGetAudioRecognizeStatus();

    private native ByteBuffer nativeGetContourInfo(AlgorithmResult algorithmResult);

    private native EffectImageInfo nativeGetEffectCapturedImageWithKey(String str);

    public static native String nativeGetEffectVersion();

    private native boolean nativeGetExpressionDetectResult(TEBundle[] tEBundleArr, int i);

    private native int nativeGetFaceCount();

    private native float nativeGetFilterIntensity(String str);

    private native String nativeGetFrameCostStatistics();

    private native String nativeGetFrameProgressParams(int i);

    private native int nativeGetMattingResult(ByteBuffer byteBuffer);

    private native void nativeInsertABLicense(String str);

    private native boolean nativeIsEffectGpuTurboEnable();

    private native int nativeIsExistValidResource();

    private native int nativeMixFrame(GLTexture[] gLTextureArr, int i, GLTexture gLTexture);

    private native String nativeName();

    private native int nativeNotifyKeyboardHide(boolean z);

    public static native AlgorithmResult nativeParseParcelBuffer(AlgorithmResult algorithmResult, long j, ByteBuffer byteBuffer, int i, int i2);

    public static native String nativeParseStringFromByteBuffer(int i, ByteBuffer byteBuffer);

    private native int nativePauseEffect();

    public static native int nativePeekParcelSize();

    private native int nativePrepareEffect();

    private native int nativeProcess(int i, int i2, int i3, int i4, long j, Long l, RoiInfo roiInfo, boolean z, int i5, long j2);

    private native void nativeProcessDoubleClickEvent(float f, float f2);

    private native void nativeProcessLongPressEvent(float f, float f2);

    private native void nativeProcessPanEvent(float f, float f2, float f3, float f4, float f5);

    private native void nativeProcessRotationEvent(float f, float f2);

    private native void nativeProcessScaleEvent(float f, float f2);

    private native void nativeProcessTouchDownEvent(float f, float f2, int i);

    private native void nativeProcessTouchEvent(float f, float f2);

    private native void nativeProcessTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    private native void nativeProcessTouchUpEvent(float f, float f2, int i);

    private native int nativeProcessV2(int i, int i2, int i3, int i4, long[] jArr, Long l, RoiInfo roiInfo, boolean z, int i5, long j);

    private native int nativeProcessWithEffectChain(GLTexture[] gLTextureArr, GLTexture[] gLTextureArr2, GLTexture[] gLTextureArr3, int i, long j, Long l, RoiInfo roiInfo, boolean z, int i2, long j2);

    public static native int nativeReadParcel(long j, ByteBuffer byteBuffer);

    private native int nativeRefreshAlgorithmRequirment(long j, long j2);

    private native void nativeRefreshSequenceCacheStatus(boolean z);

    private native void nativeReleaseContetDetector();

    private native int nativeRenderCacheBitmap(String str, Bitmap bitmap);

    private native int nativeRenderCacheInt(String str, int i);

    private native int nativeRenderCacheString(String str, String str2);

    private native int nativeRenderCacheTexture(String str, String str2);

    private native int nativeResetFrameCostStatistics();

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i, int i2, int i3, String str);

    private native int nativeSetABLicense(String str);

    private native void nativeSetAlgorithmAB(boolean z);

    private native int nativeSetAlgorithmRequirment(long j);

    private native EffectAlgorithmStrategyResult nativeSetAlgorithmStrategy(String str, int i, String str2);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetAudioRecognizeDict(String str);

    private native int nativeSetBeautify(String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(String str, float f, float f2, float f3);

    private native int nativeSetClientState(int i);

    private native void nativeSetContourInfoInteractId(String str);

    private native int nativeSetCustomEffectOrientation(String str, int i);

    private native void nativeSetDoubleViewRect(double d, double d2, double d3, double d4);

    private native int nativeSetEffect(String str);

    private native int nativeSetEffectAudioGraphCfg(boolean z, boolean z2, boolean z3);

    private native void nativeSetEffectLogLevel(int i);

    private native int nativeSetEffectTrackOutputTexture(long j, int i, int i2, int i3);

    private native int nativeSetEffectTrackStickerPaths(long j, String[] strArr, int[] iArr, int i, String str);

    private native void nativeSetEnableAlgorithmSyncer(boolean z);

    private native void nativeSetEnableThreeBuffer(boolean z);

    private native int nativeSetFaceAttribute(boolean z);

    private native void nativeSetFaceDetectSkipStep(int i);

    private native int nativeSetFilter(String str, float f, boolean z);

    private native int nativeSetInputText(String str, int i, int i2, String str2);

    private native int nativeSetMusicNodeFilePath(String str);

    private native int nativeSetReshape(String str, float f, float f2);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetSendContourInfoType(int i);

    private native int nativeSetStrategy(String str, double d);

    private native int nativeSetTwoFilters(String str, String str2, float f, float f2, float f3, boolean z);

    private native int nativeSetupEffectAudioHandler();

    private native int nativeStartAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeStartEffectTrack(long j);

    private native int nativeStopEffectTrack(long j, boolean z);

    private native int nativeUpdateAudioConfig(String str);

    public void createEffectAudioSource(AudioDeviceModule audioDeviceModule) {
    }

    public int enableMockFace(boolean z) {
        return 0;
    }

    public void onExpressionDetectResultCallback(int i) {
    }

    public void onMicrophoneDetectResultCallback(float f) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        mEffectEdgeLog = new WeakReference<>(null);
        InterfaceC1272540jDg interfaceC1272540jDg = this.mEffectMsgListener;
        if (interfaceC1272540jDg != null) {
            C1272380jDQ.LIZLLL(interfaceC1272540jDg);
            this.mEffectMsgListener = null;
        }
        this.mFaceListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        if (this.mAudioRenderSink != null) {
            this.mAudioRenderSink.LLJILJIL(0L);
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }
    }

    public int setEffect(String str, boolean z) {
        return 0;
    }

    public void setEffectInfoChangeListener(InterfaceC1272630jDp interfaceC1272630jDp) {
    }

    public void setExpressionDetectListener(InterfaceC1272620jDo interfaceC1272620jDo) {
    }

    public void setMicrophoneDetectListener(InterfaceC1272640jDq interfaceC1272640jDq) {
    }

    public int startEffectAudio() {
        return 0;
    }

    public int stopEffectAudio() {
        return 0;
    }

    public static class AlgorithmResult extends NativeObject implements VideoFrame.IExtraData {
        public long LL;

        private void setContourInfo(long j) {
        }

        private void setMiniGmeResult(long j) {
        }

        private void setStRoiInfo(long j) {
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public final int peekParcelSize() {
            return EffectWrapper.nativePeekParcelSize();
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public final long getExtraDataFlag() {
            return this.LL;
        }

        public AlgorithmResult(long j) {
            setNativeObj(j);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public final int readParcel(ByteBuffer byteBuffer) {
            return EffectWrapper.nativeReadParcel(this.mNativeObj, byteBuffer);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public final void releaseExtraData(Object obj) {
            release();
        }
    }

    @Override // X.InterfaceC1272120jD0
    public long createEffectTrack() {
        if (this.mValid) {
            return nativeCreateEffectTrack();
        }
        return -1L;
    }

    @Override // X.InterfaceC1272120jD0
    public int destroyEffectAudioHandler() {
        if (this.mValid) {
            return nativeDestroyEffectAudioHandler();
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public int disableEffectAudio() {
        if (this.mValid) {
            return nativeDisableEffectAudio();
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public int enableEffectAudio() {
        if (this.mValid) {
            return nativeEnableEffectAudio();
        }
        return -1;
    }

    public long getEffectNativeHandler() {
        if (this.mValid) {
            return nativeEffectNativeHandler();
        }
        return 0L;
    }

    public int getFaceCount() {
        if (this.mValid) {
            return nativeGetFaceCount();
        }
        return 0;
    }

    public String getFrameCostStatistics() {
        if (this.mValid) {
            return nativeGetFrameCostStatistics();
        }
        return null;
    }

    @Override // X.InterfaceC1272120jD0
    public boolean isAudioRecognizeAvailable() {
        if (this.mValid) {
            return nativeGetAudioRecognizeStatus();
        }
        return false;
    }

    @Override // X.InterfaceC1272120jD0
    public int isExistValidResource() {
        if (this.mValid) {
            return nativeIsExistValidResource();
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public String name() {
        return !this.mValid ? "Dummy Effect" : nativeName();
    }

    @Override // X.InterfaceC1272120jD0
    public int pauseEffect() {
        if (this.mValid) {
            return nativePauseEffect();
        }
        return 0;
    }

    @Override // X.InterfaceC1272120jD0
    public void prepareEffect() {
        if (this.mValid) {
            nativePrepareEffect();
        }
    }

    public void releaseContetDetector() {
        if (this.mValid) {
            nativeReleaseContetDetector();
        }
    }

    public int resetFrameCostStatistics() {
        if (this.mValid) {
            return nativeResetFrameCostStatistics();
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public int resumeEffect() {
        if (this.mValid) {
            return nativeResumeEffect();
        }
        return 0;
    }

    @Override // X.InterfaceC1272120jD0
    public int setupEffectAudioHandler() {
        if (this.mValid) {
            return nativeSetupEffectAudioHandler();
        }
        return -1;
    }

    public EffectWrapper() {
        if (checkVersion()) {
            throw new AndroidRuntimeException("unsupport");
        }
        this.mFromExtern = false;
    }

    public long getAlgorithmRequirment() {
        return nativeGetAlgorithmRequirment();
    }

    public long getAlgorithmRequirmentParams() {
        return nativeGetAlgorithmRequirmentParams();
    }

    public long getEffectHandle() {
        return getEffectNativeHandler();
    }

    @Override // X.InterfaceC1272120jD0
    public String getEffectVersion() {
        return nativeGetEffectVersion();
    }

    @Override // X.InterfaceC1272120jD0
    public boolean isEffectGpuTurboEnable() {
        return nativeIsEffectGpuTurboEnable();
    }

    @Override // X.InterfaceC1272120jD0
    public AudioDeviceModule.AudioRenderSink getEffectAudioRender() {
        return this.mAudioRenderSink;
    }

    @Override // X.InterfaceC1272120jD0
    public boolean valid() {
        return this.mValid;
    }

    public EffectWrapper(long j) {
        this.mNativeObj = j;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource(null);
        }
    }

    private void initAudioRenderSink(AudioDeviceModule audioDeviceModule) {
        if (this.mValid && audioDeviceModule != null && this.mAudioRenderSink == null) {
            this.mAudioRenderSink = audioDeviceModule.createRenderSink();
            if (this.mAudioRenderSink != null) {
                this.mAudioRenderSink.LLJILJIL(0L);
            }
        }
    }

    public static void setEffectEdgeLog(InterfaceC1272510jDd interfaceC1272510jDd) {
        mEffectEdgeLog = new WeakReference<>(interfaceC1272510jDd);
    }

    @Override // X.InterfaceC1272120jD0
    public void addAmazingAllowedPath(String str) {
        if (!this.mValid) {
            return;
        }
        nativeAddAmazingAllowedPath(str);
    }

    public void bindEffectHandle(long j) {
        if (this.mValid) {
            nativeBindWithEffectNativeHandler(j);
        }
    }

    @Override // X.InterfaceC1272120jD0
    public void configSequenceCache(long j) {
        nativeConfigSequenceCache(j);
    }

    public void debindEffectHandle(long j) {
        if (this.mValid) {
            nativeDeBindWithEffectNativeHandler(j);
        }
    }

    @Override // X.InterfaceC1272120jD0
    public int destroyEffectTrack(long j) {
        if (!this.mValid) {
            return -1;
        }
        return nativeDestroyEffectTrack(j);
    }

    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        if (!this.mValid || nativeDetectFaceFromBitMap(bitmap) != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1272120jD0
    public int effectAudioSetPlaybackDeviceType(int i) {
        if (!this.mValid) {
            return -1;
        }
        return nativeEffectAudioSetPlaybackDeviceType(i);
    }

    @Override // X.InterfaceC1272120jD0
    public void enableSetMD5ResourceFinder(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeEnableSetMD5ResourceFinder(z);
    }

    public AlgorithmResult getAlgorithmResult(long j) {
        AlgorithmResult algorithmResultNativeCreateAlgorithmResult = nativeCreateAlgorithmResult();
        algorithmResultNativeCreateAlgorithmResult.LL = nativeGetAlgorithmResult(algorithmResultNativeCreateAlgorithmResult, j);
        return algorithmResultNativeCreateAlgorithmResult;
    }

    @Override // X.InterfaceC1272120jD0
    public ByteBuffer getContourInfo(AlgorithmResult algorithmResult) {
        if (!this.mValid) {
            return null;
        }
        return nativeGetContourInfo(algorithmResult);
    }

    public String getEffectABInfo(String str) {
        return EffectABConfig.requestABInfoWithLicense(str);
    }

    public EffectImageInfo getEffectCapturedImagewithKey(String str) {
        return nativeGetEffectCapturedImageWithKey(str);
    }

    public float getFilterIntensity(String str) {
        if (!this.mValid) {
            return -1.0f;
        }
        return nativeGetFilterIntensity(str);
    }

    @Override // X.InterfaceC1272120jD0
    public String getFrameProgressParams(int i) {
        if (!this.mValid) {
            return null;
        }
        return nativeGetFrameProgressParams(i);
    }

    @Override // X.InterfaceC1272120jD0
    public void insertEffectLicense(String str) {
        if (str != null) {
            nativeInsertABLicense(str);
        }
    }

    @Override // X.InterfaceC1272120jD0
    public int notifyKeyboardHide(boolean z) {
        if (!this.mValid) {
            return -1;
        }
        return nativeNotifyKeyboardHide(z);
    }

    public void onFaceDetectResultCallback(int i) {
        if (!this.mValid) {
            return;
        }
        try {
            InterfaceC1272550jDh interfaceC1272550jDh = this.mFaceListener;
            if (interfaceC1272550jDh != null) {
                interfaceC1272550jDh.onFaceDetectResultCallback(i);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (AVLog.enableLogToIODevice2()) {
                AVLog.logToIODevice2(6, "EffectWrapper", "onFaceDetectResultCallback exception. ", th, 37, 30000);
            }
        }
    }

    @Override // X.InterfaceC1272120jD0
    public void refreshSequenceCacheStatus(boolean z) {
        nativeRefreshSequenceCacheStatus(z);
    }

    @Override // X.InterfaceC1272120jD0
    public void setAlgorithmAB(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeSetAlgorithmAB(z);
    }

    public int setAlgorithmRequirment(long j) {
        return nativeSetAlgorithmRequirment(j);
    }

    @Override // X.InterfaceC1272120jD0
    public int setAssetManager(AssetManager assetManager) {
        return nativeSetAssetManager(assetManager);
    }

    public int setAudioEffectConfig(String str) {
        return nativeUpdateAudioConfig(str);
    }

    public int setAudioRecognizeDict(Map<String, String[]> map) {
        String str;
        if (!this.mValid) {
            return 0;
        }
        String str2 = "";
        if (map != null) {
            String strLIZIZ = "";
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                for (String str3 : entry.getValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    if (strLIZIZ.isEmpty()) {
                        str = "";
                    } else {
                        str = ",";
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(":");
                    sbLIZ.append(str3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            str2 = strLIZIZ;
        }
        return nativeSetAudioRecognizeDict(str2);
    }

    @Override // X.InterfaceC1272120jD0
    public int setClientState(int i) {
        return nativeSetClientState(i);
    }

    @Override // X.InterfaceC1272120jD0
    public void setContourInfoIndex(String str) {
        if (!this.mValid) {
            return;
        }
        nativeSetContourInfoInteractId(str);
    }

    @Override // X.InterfaceC1272120jD0
    public int setEffect(String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetEffect(NonNull(str));
    }

    public int setEffectLicense(String str) {
        if (str != null) {
            nativeSetABLicense(str);
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1272120jD0
    public void setEffectLogLevel(int i) {
        if (!this.mValid) {
            return;
        }
        nativeSetEffectLogLevel(i);
    }

    @Override // X.InterfaceC1272120jD0
    public void setEffectMsgListener(InterfaceC1272540jDg interfaceC1272540jDg) {
        C1273670jFV c1273670jFV;
        Object objNewProxyInstance;
        if (!this.mValid) {
            return;
        }
        InterfaceC1272540jDg interfaceC1272540jDg2 = this.mEffectMsgListener;
        if (interfaceC1272540jDg2 != null) {
            C1272380jDQ.LIZLLL(interfaceC1272540jDg2);
            this.mEffectMsgListener = null;
        }
        if (interfaceC1272540jDg != null) {
            this.mEffectMsgListener = interfaceC1272540jDg;
            C1272380jDQ c1272380jDQLIZIZ = C1272380jDQ.LIZIZ();
            synchronized (c1272380jDQLIZIZ) {
                AVLog.iod("VideoEffectUtilsWrapper", "Add listener: " + interfaceC1272540jDg);
                if (c1272380jDQLIZIZ.LIZ(interfaceC1272540jDg) != null) {
                    AVLog.w("VideoEffectUtilsWrapper", "Already exist listener");
                    return;
                }
                if (c1272380jDQLIZIZ.LIZJ != null && (objNewProxyInstance = Proxy.newProxyInstance(C1272380jDQ.class.getClassLoader(), new Class[]{c1272380jDQLIZIZ.LIZIZ}, (c1273670jFV = new C1273670jFV(interfaceC1272540jDg)))) != null) {
                    try {
                        AVLog.ioi("VideoEffectUtilsWrapper", "Add listener " + objNewProxyInstance);
                        C2204961BRm.a0(c1272380jDQLIZIZ.LIZJ, null, new Object[]{objNewProxyInstance}, new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91R8v3lLlASXCuFcqw9USErAbkeET4yweLz8+nxXxvUcHcsiz", null));
                        c1273670jFV.LLILLJJLI = new WeakReference<>(objNewProxyInstance);
                        synchronized (c1272380jDQLIZIZ.LIZ) {
                            try {
                                ((ArrayList) c1272380jDQLIZIZ.LIZ).add(c1273670jFV);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        AVLog.ioe("VideoEffectUtilsWrapper", "AddListener failed " + Log.getStackTraceString(th2));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1272120jD0
    public void setEnableAlgorithmSyncer(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeSetEnableAlgorithmSyncer(z);
    }

    public void setEnableTTLHInitTimeCostOpt(boolean z) {
        this.enableTTLHInitTimeCostOpt = z;
    }

    @Override // X.InterfaceC1272120jD0
    public void setEnableThreeBuffer(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeSetEnableThreeBuffer(z);
    }

    public int setFaceAttribute(boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFaceAttribute(z);
    }

    @Override // X.InterfaceC1272120jD0
    public void setFaceDetectListener(InterfaceC1272550jDh interfaceC1272550jDh) {
        if (!this.mValid) {
            return;
        }
        this.mFaceListener = interfaceC1272550jDh;
    }

    @Override // X.InterfaceC1272120jD0
    public void setFaceDetectSkipStep(int i) {
        if (!this.mValid) {
            return;
        }
        nativeSetFaceDetectSkipStep(i);
    }

    public void setMusicNodeFilePath(String str) {
        if (!this.mValid) {
            return;
        }
        nativeSetMusicNodeFilePath(str);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    @Override // X.InterfaceC1272120jD0
    public int setResourceFinder(Object obj) {
        return nativeSetResourceFinder(obj);
    }

    public int setSendContourInfoType(int i) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetSendContourInfoType(i);
    }

    @Override // X.InterfaceC1272120jD0
    public int startEffectTrack(long j) {
        if (!this.mValid) {
            return -1;
        }
        return nativeStartEffectTrack(j);
    }

    public static <T> boolean CheckCount(T[] tArr, int i) {
        int length;
        if (tArr == null) {
            length = 0;
        } else {
            length = tArr.length;
        }
        if (i != length) {
            return false;
        }
        return true;
    }

    public static void onEdgeRenderLog(String str, String str2) {
        InterfaceC1272510jDd interfaceC1272510jDd;
        WeakReference<InterfaceC1272510jDd> weakReference = mEffectEdgeLog;
        if (weakReference != null && (interfaceC1272510jDd = weakReference.get()) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (!str.equals("live_webrtc_monitor_log")) {
                    jSONObject.put("server", str);
                    jSONObject.put("mode", "effect");
                }
                interfaceC1272510jDd.LJJLJ(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1272120jD0
    public int composerAppendNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerAppendNodes(strArr, i);
    }

    public int composerCancelPreloadNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerCancelPreloadNodes(strArr, i);
    }

    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerReloadNodes(strArr, i);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerRemoveNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerRemoveNodes(strArr, i);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerSetMode(int i, int i2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetMode(i, i2);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerSetNodes(strArr, i);
    }

    @Override // X.InterfaceC1272120jD0
    public int enableFindContour(boolean z, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeEnableFindContour(z, str);
    }

    public void getAlgorithmResult(AlgorithmResult algorithmResult, long j) {
        algorithmResult.LL = nativeGetAlgorithmResult(algorithmResult, j);
    }

    public void processDoubleClickEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessDoubleClickEvent(f, f2);
    }

    @Override // X.InterfaceC1272120jD0
    public void processLongPressEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessLongPressEvent(f, f2);
    }

    @Override // X.InterfaceC1272120jD0
    public void processRotationEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessRotationEvent(f, f2);
    }

    @Override // X.InterfaceC1272120jD0
    public void processScaleEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessScaleEvent(f, f2);
    }

    @Override // X.InterfaceC1272120jD0
    public void processTouchEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchEvent(f, f2);
    }

    public int refreshAlgorithmRequirment(long j, long j2) {
        return nativeRefreshAlgorithmRequirment(j, j2);
    }

    @Override // X.InterfaceC1272120jD0
    public int setCustomEffect(String str, String str2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeRenderCacheTexture(NonNull(str), NonNull(str2));
    }

    public int setCustomEffectBitmap(String str, Bitmap bitmap) {
        if (!this.mValid) {
            return 0;
        }
        return nativeRenderCacheBitmap(NonNull(str), bitmap);
    }

    public int setCustomEffectOrientation(String str, int i) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetCustomEffectOrientation(NonNull(str), i);
    }

    @Override // X.InterfaceC1272120jD0
    public int setEffectABInfo(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        try {
            if (this.enableTTLHInitTimeCostOpt) {
                jSONArray = C1977007om.LIZ(str);
                if (jSONArray == null) {
                    return -1;
                }
            } else {
                jSONArray = new JSONArray(EffectABConfig.requestABInfoWithLicense(str));
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                String string = JSONObjectProtectorUtils.getString(jSONObject2, "key");
                int iOptInt = jSONObject2.optInt("dataType", -1);
                checkKey(iOptInt, jSONObject, string);
                if (this.enableTTLHInitTimeCostOpt) {
                    checkKey(iOptInt, jSONObject, jSONObject2.optString("license_key"));
                }
            }
            return 0;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // X.InterfaceC1272120jD0
    public int setEffectStrategy(String str, double d) {
        return nativeSetStrategy(str, d);
    }

    public int setFilter(String str, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f, false);
    }

    public void setRenderCacheInt(String str, int i) {
        if (!this.mValid) {
            return;
        }
        nativeRenderCacheInt(str, i);
    }

    @Override // X.InterfaceC1272120jD0
    public void setRenderCacheString(String str, String str2) {
        if (!this.mValid) {
            return;
        }
        nativeRenderCacheString(NonNull(str), NonNull(str2));
    }

    @Override // X.InterfaceC1272120jD0
    public int stopEffectTrack(long j, boolean z) {
        if (!this.mValid) {
            return -1;
        }
        return nativeStopEffectTrack(j, z);
    }

    private void checkKey(int i, JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                nativeConfigABStringValue(str, JSONObjectProtectorUtils.getString(jSONObject, str));
                                return;
                            }
                            return;
                        }
                        nativeConfigABFloatValue(str, (float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                        return;
                    }
                    nativeConfigABIntValue(str, JSONObjectProtectorUtils.getInt(jSONObject, str));
                    return;
                }
                nativeConfigABBooleanValue(str, JSONObjectProtectorUtils.getBoolean(jSONObject, str));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1274040jG6.LIZ()) {
                throw new AndroidRuntimeException(e);
            }
        }
    }

    @Override // X.InterfaceC1272120jD0
    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (CheckCount(strArr, i) && CheckCount(strArr2, i)) {
            return nativeComposerAppendNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerCheckNodeExclusion(str, str2, iArr);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerPreloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (CheckCount(strArr, i) && CheckCount(strArr2, i)) {
            return nativeComposerPreloadNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (CheckCount(strArr, i) && CheckCount(strArr2, i)) {
            return nativeComposerReloadNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    public int composerRemoveNodesForEffectChain(String[] strArr, int i, String str) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerRemoveNodesForEffectChain(strArr, i, str);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (CheckCount(strArr, i) && CheckCount(strArr2, i)) {
            return nativeComposerSetNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public int composerUpdateNode(String str, String str2, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateNode(NonNull(str), NonNull(str2), f);
    }

    @Override // X.InterfaceC1272120jD0
    public void configGpuTurboBeforeProcessEffect(int i, int i2, boolean z) {
        nativeConfigGpuTurboMode(i, i2, z);
    }

    @Override // X.InterfaceC1272120jD0
    public int mixFrame(GLTexture[] gLTextureArr, int i, GLTexture gLTexture) {
        if (!this.mValid) {
            return -1;
        }
        return nativeMixFrame(gLTextureArr, i, gLTexture);
    }

    @Override // X.InterfaceC1272120jD0
    public void processTouchDownEvent(float f, float f2, int i) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchDownEvent(f, f2, i);
    }

    @Override // X.InterfaceC1272120jD0
    public void processTouchUpEvent(float f, float f2, int i) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchUpEvent(f, f2, i);
    }

    public int setBeautify(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautify(NonNull(str), f, f2);
    }

    @Override // X.InterfaceC1272120jD0
    public EffectAlgorithmStrategyResult setEffectAlgorithmStrategy(String str, int i, String str2) {
        return nativeSetAlgorithmStrategy(str, i, str2);
    }

    @Override // X.InterfaceC1272120jD0
    public int setEffectAudioGraphCfg(boolean z, boolean z2, boolean z3) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetEffectAudioGraphCfg(z, z2, z3);
    }

    public int setFilter(String str, float f, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f, z);
    }

    public int setReshape(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetReshape(NonNull(str), f, f2);
    }

    public EffectWrapper(AudioDeviceModule audioDeviceModule, boolean z, boolean z2, boolean z3) {
        if (checkVersion()) {
            initAudioRenderSink(audioDeviceModule);
            AudioDeviceModule.AudioRenderSink audioRenderSink = null;
            if (z3) {
                audioDeviceModule = null;
            } else if (z2) {
                audioRenderSink = this.mAudioRenderSink;
            }
            nativeCreateEffectWrapper(audioDeviceModule, audioRenderSink, z);
        }
        this.mFromExtern = false;
    }

    public int composerAppendNodesWithTagsForEffectChain(String[] strArr, int i, String[] strArr2, String str) {
        if (!this.mValid) {
            return 0;
        }
        if (CheckCount(strArr, i) && CheckCount(strArr2, i)) {
            return nativeComposerAppendNodesWithTagsForEffectChain(strArr, i, strArr2, str);
        }
        return -1;
    }

    public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerExclusionCompare(str, str2, str3, iArr);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateMultipleNodes(i, strArr, strArr2, fArr);
    }

    @Override // X.InterfaceC1272120jD0
    public int effectAudioProcessData(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!this.mValid) {
            return -1;
        }
        return nativeEffectAudioProcessData(byteBuffer, i, i2, i3);
    }

    @Override // X.InterfaceC1272120jD0
    public int effectAudioProcessDataV2(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!this.mValid) {
            return -1;
        }
        return nativeEffectAudioProcessDataV2(byteBuffer, i, i2, i3);
    }

    public int onReceiveEffectMessage(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    @Override // X.InterfaceC1272120jD0
    public int sendEffectMsg(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSendEffectMsg(i, i2, i3, NonNull(str));
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautifyWithSharp(NonNull(str), f, f2, f3);
    }

    public void setDoubleViewRect(double d, double d2, double d3, double d4) {
        if (this.mValid) {
            nativeSetDoubleViewRect(d, d2, d3, d4);
        }
    }

    @Override // X.InterfaceC1272120jD0
    public int setEffectTrackOutputTexture(long j, int i, int i2, int i3) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetEffectTrackOutputTexture(j, i, i2, i3);
    }

    @Override // X.InterfaceC1272120jD0
    public int setInputText(String str, int i, int i2, String str2) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetInputText(str, i, i2, str2);
    }

    @Override // X.InterfaceC1272120jD0
    public int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeStartAudioRecognize(byteBuffer, i, i2, i3);
    }

    @Override // X.InterfaceC1272120jD0
    public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        if (!this.mValid) {
            return 0;
        }
        if (CheckCount(strArr, i) && CheckCount(strArr2, i2) && CheckCount(strArr3, i2)) {
            return nativeComposerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3);
        }
        return -1;
    }

    @Override // X.InterfaceC1272120jD0
    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (!this.mValid) {
            return;
        }
        nativeProcessPanEvent(f, f2, f3, f4, f5);
    }

    public int processStrangeVoice(Buffer buffer, int i, int i2, int i3, long j) {
        return nativeAudioStrangeVoiceProcess(buffer, i, i2, i3, j);
    }

    @Override // X.InterfaceC1272120jD0
    public int setEffectTrackStickerPaths(long j, String[] strArr, int[] iArr, int i, String str) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetEffectTrackStickerPaths(j, strArr, iArr, i, str);
    }

    public int setFilter(String str, String str2, float f, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f3, f, f2, false);
    }

    public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (!this.mValid) {
            return;
        }
        nativeEnableExpressionDetect(z, z2, z3, z4, z5, z6);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0L);
    }

    public int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f3, f, f2, z);
    }

    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, i5, 0L);
    }

    @Override // X.InterfaceC1272120jD0
    public void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0L);
    }

    @Override // X.InterfaceC1272120jD0
    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        if (!this.mValid) {
            return;
        }
        nativeConfigEffect(i, i2, NonNull(str), NonNull(str2), z, z2, NonNull(str3), GLThreadManager.getConfigGLVersion(true), z3);
    }

    @Override // X.InterfaceC1272120jD0
    public int process(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, roiInfo, z, i5, j2);
    }

    @Override // X.InterfaceC1272120jD0
    public int processV2(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long[] jArr, boolean z, long j) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcessV2(i, i2, i3, i4, jArr, null, roiInfo, z, i5, j);
    }

    @Override // X.InterfaceC1272120jD0
    public int processWithEffectChain(GLTexture[] gLTextureArr, GLTexture[] gLTextureArr2, GLTexture[] gLTextureArr3, int i, int i2, RoiInfo roiInfo, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcessWithEffectChain(gLTextureArr, gLTextureArr2, gLTextureArr3, i, j, null, roiInfo, z, i2, j2);
    }
}
