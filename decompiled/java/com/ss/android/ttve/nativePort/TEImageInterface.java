package com.ss.android.ttve.nativePort;

import X.C1972907o7;
import X.C2188811AlT;
import android.graphics.Bitmap;
import android.view.Surface;
import com.ss.android.vesdk.bean.VECuttorParams;
import com.ss.android.vesdk.bean.VEImageInfo;
import com.ss.android.vesdk.bean.VEInfoStickerParams;
import com.ss.android.vesdk.bean.VEStickerEditRichTextParam;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TEImageInterface {
    public long mHandler;

    private native void nativeAddColorLayer(long j, int i, int i2, int i3);

    private native int nativeAddGroupLayer(long j, String[] strArr);

    private native int nativeAddInfoSticker(long j, String str, String[] strArr, VEInfoStickerParams vEInfoStickerParams);

    private native void nativeAddNewBitmapLayer(long j, Bitmap bitmap, int i, boolean z);

    private native void nativeAddNewLayer(long j, String str, int i, boolean z);

    private native void nativeAddNewLayerWithBuffer(long j, String str, int i, int i2, int i3, boolean z);

    private native void nativeAddPanoramicLayer(long j, String str, String str2);

    private native void nativeAddTransparentLayer(long j, int i, int i2);

    private native int nativeAddWaterMask(long j, String str, float f, float f2, float f3, boolean z);

    private native void nativeApplyCurrentLayerInfoFromTemp(long j);

    private native void nativeCancelExecuteContrast(long j);

    private native void nativeCancelSelect(long j);

    private native boolean nativeChangeCurrentLayerZorderToTragetLayer(long j, String str, boolean z);

    private native void nativeClearEffect(long j);

    private native void nativeClearLiquefyBuffer(long j);

    private native void nativeConfrimOriginalLayerParams(long j);

    private native void nativeContrastImage(long j, int i);

    public static native boolean nativeConvertBitmapWithRgba(Bitmap bitmap, String str, int i);

    private native long nativeCreateImageHandle(int i, int i2, boolean z, boolean z2, int i3, long j);

    private native void nativeCustomContrastImage(long j, String str, boolean z);

    public static native int[] nativeCutImageToLocalPathStatic(VECuttorParams vECuttorParams);

    private native void nativeCutoutImage(long j, String str, float f, float f2, float f3, float f4);

    private native int[] nativeDecodeBufferToLocalPath(long j, String str, String str2);

    public static native int[] nativeDecodeBufferToLocalPathStatic(String str, String str2, int i, int i2, boolean z, boolean z2);

    private native void nativeDeleteLayer(long j, String str);

    private native int nativeDeleteWaterMask(long j);

    private native void nativeDestorySurface(long j, Surface surface);

    private native void nativeDestoryVEImage(long j);

    private native int nativeDoInfoStickerRotate(long j, int i, float f);

    private native int nativeDoInfoStickerTranslateWithScreenResolution(long j, int i, float f, float f2);

    private native void nativeEnableCanvas(long j, int i, int i2);

    private native void nativeEnableDisplay(long j, boolean z);

    private native void nativeEnableFaceBeautify(long j, boolean z, boolean z2, boolean z3, boolean z4);

    private native void nativeEnableLayerBlendMode(long j, boolean z);

    private native void nativeEnableLayerShow(long j, boolean z);

    private native void nativeEnableLensHdr(long j, boolean z);

    private native void nativeEnableMirror(long j, int i);

    private native int nativeEnableMmap(long j, boolean z);

    public static native void nativeEnableOpenGL3(boolean z);

    private native void nativeEnablePictureMode(long j, boolean z);

    private native void nativeEnableRenderAutomation(long j, boolean z);

    private native void nativeEnableRenderInTimer(long j, boolean z);

    private native void nativeEnableSetAnimateEffect(long j, boolean z);

    private native void nativeEnableSetAnimateSticker(long j, boolean z);

    private native void nativeEnableViewTree(long j);

    private native void nativeExecuteConfirmRender(long j);

    private native float nativeGetColorFilterIntensity(long j, String str);

    private native String nativeGetCurrentLayerId(long j);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i, boolean z);

    private native float[] nativeGetInfoStickerBoundingBoxWithScreenResolution(long j, int i, boolean z);

    private native float[] nativeGetInfoStickerPosition(long j, int i);

    private native String nativeGetInfoStickerTemplateParam(long j, int i);

    private native int[] nativeGetOutputSize(long j);

    private native int[] nativeGetPixelColor(long j, int i, int i2, int i3, int i4);

    private native void nativeInitLensHdrEngine(long j, String str, int i, String str2);

    private native void nativeInitOffScreenSurface(long j, int i, int i2);

    private native void nativeInitPreviewSurface(long j, Surface surface);

    private native void nativeOpenSmartComposition(long j);

    private native void nativePreMVPOperation(long j, boolean z, float f, float f2, float f3, float f4, int i, int i2, int i3);

    private native void nativeProcessGestureEvent(long j, String str, String str2, int i, float f, float f2, float f3, float f4, float f5, int i2, boolean z, boolean z2);

    private native String nativeQueryLayerParams(long j, boolean z, boolean z2);

    public static native String nativeQueryMediadata(boolean z, boolean z2, String str, boolean z3);

    private native void nativeRemoveBackGroundImage(long j);

    private native void nativeRemoveComposerFilter(long j, String str, String str2, String str3, String str4);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native void nativeRenderEffect(long j, boolean z);

    private native void nativeRenderLayerQueue(long j, boolean z);

    private native void nativeReplaceBitmapLayer(long j, Bitmap bitmap, int i, boolean z);

    private native void nativeReplaceLayer(long j, String str, int i, boolean z);

    private native void nativeReplaceLayerWithBuffer(long j, String str, int i, int i2, int i3, boolean z);

    private native void nativeReplacePanoramicLayer(long j, String str, String str2);

    private native void nativeRequestRenderAlgorithm(long j, int i);

    private native int nativeResetEffectEngine(long j);

    private native void nativeRotate(long j, String str, float f, float f2, float f3);

    private native void nativeRotateCanvas(long j, String str, float f, float f2, float f3);

    private native int nativeSaveCurrentImage(long j, Bitmap bitmap, int i, int i2, boolean z);

    private native int nativeSaveCurrentImageWithPath(long j, String str, boolean z, boolean z2, int i);

    private native int nativeSaveCurrentImageWithRgba(long j, Bitmap bitmap, String str);

    private native void nativeSaveCurrentLayerInfoToTemp(long j);

    private native void nativeSaveFinalDisplayLayerInfo(long j);

    private native void nativeSaveFinishLoadLayerInfo(long j);

    private native void nativeScale(long j, String str, float f, float f2, float f3, float f4);

    private native void nativeScaleCanvas(long j, String str, float f, float f2, float f3, float f4);

    private native void nativeSelectWithCoord(long j, float f, float f2);

    private native void nativeSelectWithIndex(long j, String str);

    private native void nativeSendMsgToEffect(long j, int i, long j2, long j3, String str);

    private native void nativeSetAdaptStickerAmazingForAndroid(long j, boolean z);

    private native void nativeSetBackGroundImage(long j, String str);

    private native void nativeSetBackgroundBoxCount(long j, float f);

    private native void nativeSetBackgroundColor(long j, int i);

    private native void nativeSetCompoSmartModel(long j, String str);

    private native void nativeSetComposerResource(long j, String str);

    private native void nativeSetComposerSlideFilter(long j, String str, String str2, String str3, float f, float f2);

    private native void nativeSetEffectHDRFilter(long j, String str, float f);

    private native int nativeSetInfoStickerAlpha(long j, int i, float f);

    private native int nativeSetInfoStickerAnimNew(long j, int i, int i2, String str, double d);

    private native int nativeSetInfoStickerAnimParam(long j, int i, int i2, String str);

    private native int nativeSetInfoStickerLayer(long j, int i, int i2);

    private native int nativeSetInfoStickerPosition(long j, int i, float f, float f2);

    private native int nativeSetInfoStickerRotation(long j, int i, float f);

    private native int nativeSetInfoStickerScale(long j, int i, float f, float f2);

    private native void nativeSetLayerAlpha(long j, float f);

    private native void nativeSetLayerBlendMode(long j, float f);

    private native void nativeSetLayerCanvasRect(long j, float f, float f2, float f3, float f4);

    private native void nativeSetMultiValueFilter(long j, String str, String str2, String str3);

    private native void nativeSetOneValueFilter(long j, String str, String str2, float f);

    private native void nativeSetRenderCacheTextureWithBuffer(long j, String str, String[] strArr, VEImageInfo[] vEImageInfoArr);

    private native void nativeSetRenderTimerFrameRate(long j, int i, int i2);

    private native int nativeSetRenderType(long j, int i);

    private native void nativeSetStickerFilter(long j, String str, String str2, String str3, float f, float f2);

    private native void nativeSetStickerFilterNew(long j, String str, String str2, String str3, float f, float f2, float f3);

    private native void nativeSetStickerV2Filter(long j, String str, String str2);

    private native void nativeTranslate(long j, String str, float f, float f2);

    private native void nativeTranslateCanvas(long j, String str, float f, float f2);

    private native int nativeUpdateAlgorithmCache(long j);

    private native void nativeUpdateComposerNode(long j, String str, String str2, float f);

    private native int nativeUpdateInfoStickerParams(long j, int i, String[] strArr);

    private native int nativeUpdateInfoStickerTemplateParam(long j, int i, String str);

    private native void nativeUpdateLayerNeedAlgorithm(long j, boolean z);

    private native void nativeUpdateMaxRenderSize(long j, int i, int i2);

    private native int nativeUpdateRichTextsticker(long j, int i, VEStickerEditRichTextParam vEStickerEditRichTextParam);

    private native int nativeUpdateText(long j, int i, String str);

    private native int nativeUpdateWaterMask(long j, float f, float f2, float f3, boolean z);

    private native int nativeVEImageGetCapturedImageWithKey(long j, String str, String str2, int i);

    private native void nativeremoveComposerWithoutUndo(long j, String str, String str2);

    public synchronized void applyCurrentLayerInfoFromTemp() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeApplyCurrentLayerInfoFromTemp(j);
    }

    public synchronized void cancelExecuteContrast() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeCancelExecuteContrast(j);
    }

    public synchronized void cancelSelect() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeCancelSelect(j);
    }

    public synchronized void clearEffect() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeClearEffect(j);
    }

    public synchronized void clearLiquefyBuffer() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeClearLiquefyBuffer(j);
    }

    public synchronized void confrimOriginalLayerParams() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeConfrimOriginalLayerParams(j);
    }

    public synchronized int deleteWaterMask() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeDeleteWaterMask(j);
    }

    public synchronized void destoryVEImage() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeDestoryVEImage(j);
        this.mHandler = 0L;
    }

    public synchronized void executeConfirmRender() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeExecuteConfirmRender(j);
    }

    public synchronized String getCurrentLayerId() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetCurrentLayerId(j);
    }

    public synchronized int[] getOutputSize() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetOutputSize(j);
    }

    public synchronized void openSmartComposition() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeOpenSmartComposition(j);
    }

    public synchronized void removeBackGroundImage() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRemoveBackGroundImage(j);
    }

    public synchronized int resetEffectEngine() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeResetEffectEngine(j);
    }

    public synchronized void saveCurrentLayerInfoToTemp() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSaveCurrentLayerInfoToTemp(j);
    }

    public synchronized void saveFinalDisplayLayerInfo() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSaveFinalDisplayLayerInfo(j);
    }

    public synchronized void saveFinishLoadLayerInfo() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSaveFinishLoadLayerInfo(j);
    }

    public synchronized int updateAlgorithmCache() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateAlgorithmCache(j);
    }

    public void enableViewTree() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableViewTree(j);
    }

    static {
        TENativeLibsLoader.loadImage();
    }

    public long getNativeHandler() {
        return this.mHandler;
    }

    public static int[] cutImageToLocalPathStatic(VECuttorParams vECuttorParams) {
        return nativeCutImageToLocalPathStatic(vECuttorParams);
    }

    public static void enableOpenGL3(boolean z) {
        nativeEnableOpenGL3(z);
    }

    public synchronized void SetCompoSmartModel(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetCompoSmartModel(j, str);
    }

    public synchronized int addGroupLayer(String[] strArr) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddGroupLayer(j, strArr);
    }

    public synchronized void contrastImage(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeContrastImage(j, i);
    }

    public synchronized void deleteLayer(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeDeleteLayer(j, str);
    }

    public synchronized void destorySurface(Surface surface) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeDestorySurface(j, surface);
    }

    public synchronized void doRenderEffect(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRenderEffect(j, z);
    }

    public synchronized void enableDisplay(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableDisplay(j, z);
    }

    public synchronized void enableLayerBlendMode(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableLayerBlendMode(j, z);
    }

    public synchronized void enableLayerShow(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableLayerShow(j, z);
    }

    public synchronized void enableLensHdr(boolean z) {
        nativeEnableLensHdr(this.mHandler, z);
    }

    public synchronized void enableMirror(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableMirror(j, i);
    }

    public synchronized int enableMmap(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeEnableMmap(j, z);
    }

    public void enablePictureMode(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnablePictureMode(j, z);
    }

    public synchronized void enableRenderAutomation(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableRenderAutomation(j, z);
    }

    public void enableRenderInTimer(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableRenderInTimer(j, z);
    }

    public void enableSetAnimateEffect(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableSetAnimateEffect(j, z);
    }

    public void enableSetAnimateSticker(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableSetAnimateSticker(j, z);
    }

    public synchronized float getColorFilterIntensity(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1.0f;
        }
        return nativeGetColorFilterIntensity(j, str);
    }

    public synchronized float[] getInfoStickerPosition(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetInfoStickerPosition(j, i);
    }

    public synchronized String getInfoStickerTemplateParam(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeGetInfoStickerTemplateParam(j, i);
    }

    public synchronized void initPreviewSurface(Surface surface) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeInitPreviewSurface(j, surface);
    }

    public synchronized int removeInfoSticker(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveInfoSticker(j, i);
    }

    public synchronized void renderLayerQueue(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRenderLayerQueue(j, z);
    }

    public synchronized void requestRenderAlgorithm(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRequestRenderAlgorithm(j, i);
    }

    public synchronized void selectWithIndex(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSelectWithIndex(j, str);
    }

    public synchronized void setAdaptStickerAmazingForAndroid(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetAdaptStickerAmazingForAndroid(j, z);
    }

    public synchronized void setBackGroundImage(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetBackGroundImage(j, str);
    }

    public synchronized void setBackgroundBoxCount(float f) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetBackgroundBoxCount(j, f);
    }

    public synchronized void setBackgroundColor(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetBackgroundColor(j, i);
    }

    public synchronized void setComposerResource(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetComposerResource(j, str);
    }

    public synchronized void setLayerAlpha(float f) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetLayerAlpha(j, f);
    }

    public synchronized void setLayerBlendMode(float f) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetLayerBlendMode(j, f);
    }

    public synchronized int setRenderType(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetRenderType(j, i);
    }

    public synchronized void updateLayerNeedAlgorithm(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUpdateLayerNeedAlgorithm(j, z);
    }

    public synchronized void addPanoramicLayer(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeAddPanoramicLayer(j, str, str2);
    }

    public void addTransparentLayer(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeAddTransparentLayer(j, i, i2);
    }

    public synchronized boolean changeCurrentLayerZorderToTragetLayer(String str, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativeChangeCurrentLayerZorderToTragetLayer(j, str, z);
    }

    public synchronized void customContrastImage(String str, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeCustomContrastImage(j, str, z);
    }

    public synchronized int[] decodeBufferToLocalPath(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeDecodeBufferToLocalPath(j, str, str2);
    }

    public synchronized int doInfoStickerRotate(int i, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeDoInfoStickerRotate(j, i, f);
    }

    public void enableCanvas(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableCanvas(j, i, i2);
    }

    public synchronized float[] getInfoStickerBoundingBox(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        float[] fArrNativeGetInfoStickerBoundingBox = nativeGetInfoStickerBoundingBox(j, i, z);
        if (fArrNativeGetInfoStickerBoundingBox[0] != 0.0f) {
            return null;
        }
        float[] fArr = new float[4];
        System.arraycopy(fArrNativeGetInfoStickerBoundingBox, 1, fArr, 0, 4);
        return fArr;
    }

    public synchronized float[] getInfoStickerBoundingBoxWithScreenResolution(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        float[] fArrNativeGetInfoStickerBoundingBoxWithScreenResolution = nativeGetInfoStickerBoundingBoxWithScreenResolution(j, i, z);
        if (fArrNativeGetInfoStickerBoundingBoxWithScreenResolution[0] != 0.0f) {
            return null;
        }
        float[] fArr = new float[9];
        System.arraycopy(fArrNativeGetInfoStickerBoundingBoxWithScreenResolution, 0, fArr, 0, 9);
        return fArr;
    }

    public synchronized void initOffScreenSurface(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeInitOffScreenSurface(j, i, i2);
    }

    public synchronized String queryLayerParams(boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeQueryLayerParams(j, z, z2);
    }

    public synchronized void removeComposerWithoutUndo(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeremoveComposerWithoutUndo(j, str, str2);
    }

    public synchronized void replacePanoramicLayer(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeReplacePanoramicLayer(j, str, str2);
    }

    public synchronized int saveCurrentImageWithRgba(Bitmap bitmap, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSaveCurrentImageWithRgba(j, bitmap, str);
    }

    public synchronized void selectWithCoord(float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSelectWithCoord(j, f, f2);
    }

    public synchronized void setEffectHDRFilter(String str, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetEffectHDRFilter(j, str, f);
    }

    public synchronized int setInfoStickerAlpha(int i, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAlpha(j, i, f);
    }

    public synchronized int setInfoStickerLayer(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerLayer(j, i, i2);
    }

    public synchronized int setInfoStickerRotation(int i, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerRotation(j, i, f);
    }

    public void setRenderTimerFrameRate(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetRenderTimerFrameRate(j, i, i2);
    }

    public synchronized void setStickerV2Filter(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetStickerV2Filter(j, str, str2);
    }

    public synchronized int updateInfoStickerParams(int i, String[] strArr) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateInfoStickerParams(j, i, strArr);
    }

    public synchronized int updateInfoStickerTemplateParam(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateInfoStickerTemplateParam(j, i, str);
    }

    public void updateMaxRenderSize(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUpdateMaxRenderSize(j, i, i2);
    }

    public synchronized int updateRichTextsticker(int i, VEStickerEditRichTextParam vEStickerEditRichTextParam) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateRichTextsticker(j, i, vEStickerEditRichTextParam);
    }

    public synchronized int updateText(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateText(j, i, str);
    }

    public static Boolean convertBitmapWithRgba(Bitmap bitmap, String str, int i) {
        return Boolean.valueOf(nativeConvertBitmapWithRgba(bitmap, str, i));
    }

    public void addColorLayer(int i, int i2, int i3) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeAddColorLayer(j, i, i2, i3);
    }

    public synchronized int addInfoSticker(String str, String[] strArr, VEInfoStickerParams vEInfoStickerParams) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoSticker(j, str, strArr, vEInfoStickerParams);
    }

    public synchronized void addNewBitmapLayer(Bitmap bitmap, int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeAddNewBitmapLayer(j, bitmap, i, z);
    }

    public synchronized void addNewLayer(String str, int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeAddNewLayer(j, str, i, z);
    }

    public synchronized int doInfoStickerTranslateWithScreenResolution(int i, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeDoInfoStickerTranslateWithScreenResolution(j, i, f, f2);
    }

    public synchronized int getCapturedImageWithKey(String str, String str2, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeVEImageGetCapturedImageWithKey(j, str, str2, i);
    }

    public synchronized void initLensHdrEngine(String[] strArr, int i, int[] iArr) {
        if (this.mHandler == 0) {
            return;
        }
        int length = strArr.length;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(strArr[i2]);
            if (i2 < length - 1) {
                sb.append(";");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 : iArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i3);
            sbLIZ.append(",");
            sb2.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        nativeInitLensHdrEngine(this.mHandler, sb.toString(), i, sb2.toString());
    }

    public synchronized void replaceBitmapLayer(Bitmap bitmap, int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeReplaceBitmapLayer(j, bitmap, i, z);
    }

    public synchronized void replaceLayer(String str, int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeReplaceLayer(j, str, i, z);
    }

    public synchronized int setInfoStickerAnimParam(int i, int i2, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimParam(j, i, i2, str);
    }

    public synchronized int setInfoStickerPosition(int i, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerPosition(j, i, f, f2);
    }

    public synchronized int setInfoStickerScale(int i, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerScale(j, i, f, f2);
    }

    public synchronized void setMultiValueFilter(String str, String str2, Map<String, Float> map) {
        if (this.mHandler == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(";");
        }
        nativeSetMultiValueFilter(this.mHandler, str, str2, sb.toString());
    }

    public synchronized void setOneValueFilter(String str, String str2, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetOneValueFilter(j, str, str2, f);
    }

    public synchronized void setRenderCacheTextureWithBuffer(String str, String[] strArr, VEImageInfo[] vEImageInfoArr) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetRenderCacheTextureWithBuffer(j, str, strArr, vEImageInfoArr);
    }

    public synchronized void translate(String str, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeTranslate(j, str, f, f2);
    }

    public void translateCanvas(String str, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeTranslateCanvas(j, str, f, f2);
    }

    public synchronized void updateComposerNode(String str, String str2, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUpdateComposerNode(j, str, str2, f);
    }

    public static String queryMediadata(boolean z, boolean z2, String str, Boolean bool) {
        String strNativeQueryMediadata = nativeQueryMediadata(z, z2, str, bool.booleanValue());
        if (strNativeQueryMediadata.length() == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{");
        sbLIZ.append(strNativeQueryMediadata);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public synchronized void enableFaceBeautify(boolean z, boolean z2, boolean z3, boolean z4) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableFaceBeautify(j, z, z2, z3, z4);
    }

    public synchronized int[] getPixelColor(int i, int i2, int i3, int i4) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        int[] iArrNativeGetPixelColor = nativeGetPixelColor(j, i, i2, i3, i4);
        if (iArrNativeGetPixelColor[0] != 0) {
            return null;
        }
        int[] iArr = new int[4];
        System.arraycopy(iArrNativeGetPixelColor, 1, iArr, 0, 4);
        return iArr;
    }

    public synchronized void removeComposerFilter(String str, String str2, String str3, String str4) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRemoveComposerFilter(j, str, str2, str3, str4);
    }

    public synchronized void rotate(String str, float f, float f2, float f3) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRotate(j, str, f, f2, f3);
    }

    public void rotateCanvas(String str, float f, float f2, float f3) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRotateCanvas(j, str, f, f2, f3);
    }

    public synchronized int saveCurrentImage(Bitmap bitmap, int i, int i2, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSaveCurrentImage(j, bitmap, i, i2, z);
    }

    public synchronized void sendMsgToEffect(int i, long j, long j2, String str) {
        long j3 = this.mHandler;
        if (j3 == 0) {
            return;
        }
        nativeSendMsgToEffect(j3, i, j, j2, str);
    }

    public synchronized int setInfoStickerAnimNew(int i, int i2, String str, double d) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimNew(j, i, i2, str, d);
    }

    public void setLayerCanvasRect(float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetLayerCanvasRect(j, f, f2, f3, f4);
    }

    public synchronized int updateWaterMask(float f, float f2, float f3, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateWaterMask(j, f, f2, f3, z);
    }

    public synchronized int saveCurrentImage(String str, boolean z, boolean z2, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSaveCurrentImageWithPath(j, str, z, z2, i);
    }

    public synchronized void addNewLayerWithBuffer(String[] strArr, int i, int i2, int i3, boolean z) {
        if (this.mHandler == 0) {
            return;
        }
        int length = strArr.length;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(strArr[i4]);
            if (i4 < length - 1) {
                sb.append(";");
            }
        }
        nativeAddNewLayerWithBuffer(this.mHandler, sb.toString(), i, i2, i3, z);
    }

    public synchronized int addWaterMask(String str, float f, float f2, float f3, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddWaterMask(j, str, f, f2, f3, z);
    }

    public synchronized void cutoutImage(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeCutoutImage(j, str, f, f2, f3, f4);
    }

    public synchronized void replaceLayerWithBuffer(String[] strArr, int i, int i2, int i3, boolean z) {
        if (this.mHandler == 0) {
            return;
        }
        int length = strArr.length;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(strArr[i4]);
            if (i4 < length - 1) {
                sb.append(";");
            }
        }
        nativeReplaceLayerWithBuffer(this.mHandler, sb.toString(), i, i2, i3, z);
    }

    public synchronized void scale(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeScale(j, str, f, f2, f3, f4);
    }

    public void scaleCanvas(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeScaleCanvas(j, str, f, f2, f3, f4);
    }

    public synchronized void setComposerSlideFilter(String str, String str2, String str3, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetComposerSlideFilter(j, str, str2, str3, f, f2);
    }

    public synchronized void setStickerFilter(String str, String str2, String str3, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetStickerFilter(j, str, str2, str3, f, f2);
    }

    private synchronized long createImageHandle(int i, int i2, boolean z, boolean z2, int i3, C1972907o7 c1972907o7) {
        return nativeCreateImageHandle(i, i2, z, z2, i3, 0L);
    }

    public static synchronized TEImageInterface createVEImage(int i, int i2, boolean z, boolean z2, int i3, C1972907o7 c1972907o7) {
        TEImageInterface tEImageInterface = new TEImageInterface();
        long jCreateImageHandle = tEImageInterface.createImageHandle(i, i2, z, z2, i3, c1972907o7);
        if (jCreateImageHandle == 0) {
            return null;
        }
        tEImageInterface.mHandler = jCreateImageHandle;
        return tEImageInterface;
    }

    public static int[] decodeBufferToLocalPathStatic(String str, String str2, int i, int i2, boolean z, boolean z2) {
        return nativeDecodeBufferToLocalPathStatic(str, str2, i, i2, z, z2);
    }

    public synchronized void setStickerFilterNew(String str, String str2, String str3, float f, float f2, float f3) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetStickerFilterNew(j, str, str2, str3, f, f2, f3);
    }

    public void preMVPOperation(boolean z, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativePreMVPOperation(j, z, f, f2, f3, f4, i, i2, i3);
    }

    public synchronized void processGestureEvent(String str, String str2, int i, float f, float f2, float f3, float f4, float f5, int i2, boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeProcessGestureEvent(j, str, str2, i, f, f2, f3, f4, f5, i2, z, z2);
    }
}
