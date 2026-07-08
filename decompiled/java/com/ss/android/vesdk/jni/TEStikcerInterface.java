package com.ss.android.vesdk.jni;

import X.C2188811AlT;
import X.C2484209oO;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes36.dex */
public class TEStikcerInterface {
    public long LIZ;

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native int nativeAddInfoStickerWithBuffer(long j);

    private native int nativeAddSubTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeBeginInfoStickerPin(long j, int i);

    private native int nativeCancelInfoStickerPin(long j, int i);

    private native int nativeControlInfoStickerAnimationPreview(long j, boolean z, int i, int i2);

    private native int nativeDeleteSubTrack(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j, int i);

    private native int nativeGetInfoStickerFlip(long j, int i, boolean[] zArr);

    private native boolean nativeGetInfoStickerIsDynamic(long j, int i);

    private native int nativeGetInfoStickerPinData(long j, int i, ByteBuffer[] byteBufferArr);

    private native int nativeGetInfoStickerPinState(long j, int i);

    private native int nativeGetInfoStickerPosition(long j, int i, float[] fArr);

    private native float nativeGetInfoStickerRotate(long j, int i);

    private native float nativeGetInfoStickerScale(long j, int i);

    private native String nativeGetInfoStickerTemplateParam(long j, int i);

    private native String nativeGetInfoStickerTemplateParamWithPath(long j, String str);

    private native boolean nativeGetInfoStickerVisible(long j, int i);

    private native int nativeGetSrtInfoStickerInitPosition(long j, int i, float[] fArr);

    private native int nativeGetSubTrackFilter(long j, int i);

    private native int nativeGetTextContentCallback(long j, NativeCallbacks.OnARTextContentCallback onARTextContentCallback);

    private native int nativeGetTextLimitCount(long j);

    private native boolean nativeIsInfoStickerAnimatable(long j, int i);

    private native int nativeNotifyHideKeyBoard(long j, boolean z);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native int nativePauseInfoStickerAnimation(long j, boolean z);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native int nativeRemoveInfoStickerWithBuffer(long j, int i);

    private native int nativeRestoreInfoStickerPinWithJson(long j, int i, ByteBuffer byteBuffer, int i2);

    private native int nativeSetEffectBgmEnable(long j, boolean z);

    private native int nativeSetEffectFontPath(long j, String str, int i);

    private native int nativeSetEffectInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetInfoStickerAnimationParam(long j, int i, boolean z, String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6);

    private native int nativeSetInfoStickerAnimationPreview(long j, int i, boolean z);

    private native int nativeSetInfoStickerBufferCallback(long j, VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    private native int nativeSetInfoStickerCallSync(long j, boolean z);

    private native int nativeSetInfoStickerFlip(long j, int i, boolean z, boolean z2);

    private native int nativeSetInfoStickerRestoreMode(long j, int i);

    private native float nativeSetInfoStickerScale(long j, int i, float f);

    private native int nativeSetLanguage(long j, String str);

    private native int nativeSetStickerPinArea(long j, int i, VEStickerPinAreaParam vEStickerPinAreaParam);

    private native int nativeSetTextBitmapCallback(long j, NativeCallbacks.OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeStopInfoStickerPin(long j, int i);

    private native int nativeUpdateTextSticker(long j, int i, String str);

    public final int LIZIZ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoStickerWithBuffer(j);
    }

    public final int LJIJJLI() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        nativeGetTextContentCallback(j, new NativeCallbacks.OnARTextContentCallback() { // from class: X.1DOA
            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.OnARTextContentCallback
            public final void onResult(String[] strArr) {
            }
        });
        return 0;
    }

    public final int LJIL() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGetTextLimitCount(j);
    }

    public final int LJJIZ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        nativeSetTextBitmapCallback(j, new NativeCallbacks.OnARTextBitmapCallback() { // from class: X.1AgY
            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.OnARTextBitmapCallback
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                return null;
            }
        });
        return 0;
    }

    public TEStikcerInterface(long j) {
        this.LIZ = j;
        C2484209oO.LJI("TEMVInterface", "enable public pin adaptor:trueenable info sticker code refactor:true");
    }

    public final int LIZLLL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeBeginInfoStickerPin = nativeBeginInfoStickerPin(j, i);
        if (iNativeBeginInfoStickerPin != 0) {
            return -1;
        }
        return iNativeBeginInfoStickerPin;
    }

    public final int LJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeCancelInfoStickerPin = nativeCancelInfoStickerPin(j, i);
        if (iNativeCancelInfoStickerPin != 0) {
            return -1;
        }
        return iNativeCancelInfoStickerPin;
    }

    public final int LJI(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteSubTrack(j, i);
    }

    public final boolean LJIIJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return false;
        }
        return nativeGetInfoStickerIsDynamic(j, i);
    }

    public final int LJIIL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGetInfoStickerPinState(j, i);
    }

    public final float LJIILJJIL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetInfoStickerRotate(j, i);
    }

    public final float LJIILL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112.0f;
        }
        float fNativeGetInfoStickerScale = nativeGetInfoStickerScale(j, i);
        if (fNativeGetInfoStickerScale < 0.0f) {
            return -1.0f;
        }
        return fNativeGetInfoStickerScale;
    }

    public final String LJIILLIIL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return "";
        }
        return nativeGetInfoStickerTemplateParam(j, i);
    }

    public final String LJIIZILJ(String str) {
        long j = this.LIZ;
        if (j == 0) {
            C2484209oO.LIZJ("TEMVInterface", "[getInfoStickerTemplateParam] mNative wrong value");
            return "";
        }
        return nativeGetInfoStickerTemplateParamWithPath(j, str);
    }

    public final boolean LJIJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return true;
        }
        return nativeGetInfoStickerVisible(j, i);
    }

    public final int LJIJJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeGetSubTrackFilter(j, i);
    }

    public final boolean LJJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return false;
        }
        return nativeIsInfoStickerAnimatable(j, i);
    }

    public final int LJJI(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeNotifyHideKeyBoard(j, z);
    }

    public final int LJJIFFI(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativePauseEffectAudio(j, z);
    }

    public final int LJJII(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativePauseInfoStickerAnimation(j, z);
    }

    public final int LJJIII(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveInfoSticker(j, i);
    }

    public final int LJJIIJZLJL(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectBgmEnable(j, z);
    }

    public final int LJJIJ(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerBufferCallback(j, vEInfoStickerBufferListener);
    }

    public final int LJJIJIIJI(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerCallSync(j, z);
    }

    public final int LJJIJIIJIL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeSetInfoStickerRestoreMode = nativeSetInfoStickerRestoreMode(j, i);
        if (iNativeSetInfoStickerRestoreMode != 0) {
            return -1;
        }
        return iNativeSetInfoStickerRestoreMode;
    }

    public final int LJJIJL(String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetLanguage(j, str);
    }

    public final int LJJJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeStopInfoStickerPin = nativeStopInfoStickerPin(j, i);
        if (iNativeStopInfoStickerPin != 0) {
            return -1;
        }
        return iNativeStopInfoStickerPin;
    }

    public final int LIZ(String str, String[] strArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoSticker(j, str, strArr);
    }

    public final int LJII(int i, boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationPreview(j, i, z);
    }

    public final float[] LJIIIIZZ(int i, boolean z) {
        float[] fArrNativeGetInfoStickerBoundingBoxWithoutRotate;
        long j = this.LIZ;
        if (j != 0) {
            if (z) {
                fArrNativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBox(j, i);
            } else {
                fArrNativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBoxWithoutRotate(j, i);
            }
            if (fArrNativeGetInfoStickerBoundingBoxWithoutRotate[0] == 0.0f) {
                float[] fArr = new float[4];
                System.arraycopy(fArrNativeGetInfoStickerBoundingBoxWithoutRotate, 1, fArr, 0, 4);
                return fArr;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("native getInfoStickerBoundingBox failed: ");
            sbLIZ.append(fArrNativeGetInfoStickerBoundingBoxWithoutRotate[0]);
            sbLIZ.append(" index: ");
            sbLIZ.append(i);
            throw new VEException(-1, C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new VEException(-112, "");
    }

    public final int LJIIIZ(int i, boolean[] zArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeGetInfoStickerFlip = nativeGetInfoStickerFlip(j, i, zArr);
        if (iNativeGetInfoStickerFlip != 0) {
            return -1;
        }
        return iNativeGetInfoStickerFlip;
    }

    public final int LJIIJJI(int i, ByteBuffer[] byteBufferArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGetInfoStickerPinData(j, i, byteBufferArr);
    }

    public final int LJIILIIL(int i, float[] fArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeGetInfoStickerPosition = nativeGetInfoStickerPosition(j, i, fArr);
        if (iNativeGetInfoStickerPosition != 0) {
            return -1;
        }
        return iNativeGetInfoStickerPosition;
    }

    public final int LJIJI(int i, float[] fArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeGetSrtInfoStickerInitPosition = nativeGetSrtInfoStickerInitPosition(j, i, fArr);
        if (iNativeGetSrtInfoStickerInitPosition != 0) {
            return -1;
        }
        return iNativeGetSrtInfoStickerInitPosition;
    }

    public final int LJJIIJ(int i, ByteBuffer byteBuffer) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeRestoreInfoStickerPinWithJson = nativeRestoreInfoStickerPinWithJson(j, i, byteBuffer, byteBuffer.capacity());
        if (iNativeRestoreInfoStickerPinWithJson != 0) {
            return -1;
        }
        return iNativeRestoreInfoStickerPinWithJson;
    }

    public final int LJJIIZ(int i, String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectFontPath(j, str, i);
    }

    public final float LJJIJIL(float f, int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112.0f;
        }
        return nativeSetInfoStickerScale(j, i, f);
    }

    public final int LJJIL(int i, VEStickerPinAreaParam vEStickerPinAreaParam) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeSetStickerPinArea = nativeSetStickerPinArea(j, i, vEStickerPinAreaParam);
        if (iNativeSetStickerPinArea != 0) {
            return -1;
        }
        return iNativeSetStickerPinArea;
    }

    public final int LJJJI(int i, String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int iNativeUpdateTextSticker = nativeUpdateTextSticker(j, i, str);
        if (iNativeUpdateTextSticker != 0) {
            return -1;
        }
        return iNativeUpdateTextSticker;
    }

    public final int LJFF(boolean z, int i, int i2) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeControlInfoStickerAnimationPreview(j, z, i, i2);
    }

    public final int LJJIIZI(int i, int i2, String str, String str2) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectInputText(j, str, i, i2, str2);
    }

    public final int LIZJ(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeAddSubTrack(j, strArr, null, iArr, iArr2, iArr3, iArr4, d, d2, d3, d4, 0, 0);
    }

    public final int LJJIJLIJ(int i, boolean z, String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationParam(j, i, z, str, i2, str2, i3, str3, i4, i5, i6);
    }
}
