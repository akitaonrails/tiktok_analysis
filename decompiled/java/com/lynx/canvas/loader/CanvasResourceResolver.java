package com.lynx.canvas.loader;

import X.C1288370jdD;
import X.C1301430jyH;
import X.C2188811AlT;
import X.EnumC1301470jyL;
import android.graphics.Bitmap;
import f17.f;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasResourceResolver extends f {
    public final long LIZIZ;
    public final String LIZJ;

    private native void nativeReject(String str, long j);

    private native void nativeResolveBytes(byte[] bArr, int i, int i2, long j);

    private native void nativeResolveImage(Bitmap bitmap, long j, boolean z);

    private native void nativeResolveStreamLoadData(byte[] bArr, int i, int i2, long j);

    private native void nativeResolveStreamLoadEnd(boolean z, String str, long j);

    private native void nativeResolveStreamLoadStart(int i, long j);

    private native void nativeResolveText(String str, long j);

    public final void LIZ(String str) {
        if (this.LIZ == EnumC1301470jyL.PENDING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Resource request is rejected with url: ");
            sbLIZ.append(C1301430jyH.LJFF(this.LIZJ));
            C1288370jdD.LIZJ("KryptonCanvasResourceResolver", C2188811AlT.LIZIZ(sbLIZ));
            nativeReject(str, this.LIZIZ);
        }
        this.LIZ = EnumC1301470jyL.REJECTED;
    }

    public final void LIZIZ(Bitmap bitmap) {
        if (this.LIZ == EnumC1301470jyL.PENDING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Image resource request is resolved with url: ");
            sbLIZ.append(C1301430jyH.LJFF(this.LIZJ));
            C1288370jdD.LIZJ("KryptonCanvasResourceResolver", C2188811AlT.LIZIZ(sbLIZ));
            nativeResolveImage(bitmap, this.LIZIZ, bitmap.isPremultiplied());
        }
        this.LIZ = EnumC1301470jyL.RESOLVED;
    }

    public final void LJFF(int i) {
        nativeResolveStreamLoadStart(i, this.LIZIZ);
    }

    public CanvasResourceResolver(long j, String str) {
        this.LIZIZ = j;
        this.LIZJ = str;
    }

    public final void LIZJ(byte[] bArr, int i) {
        if (this.LIZ == EnumC1301470jyL.PENDING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Resource request is resolved with url: ");
            sbLIZ.append(C1301430jyH.LJFF(this.LIZJ));
            C1288370jdD.LIZJ("KryptonCanvasResourceResolver", C2188811AlT.LIZIZ(sbLIZ));
            nativeResolveBytes(bArr, 0, i, this.LIZIZ);
        }
        this.LIZ = EnumC1301470jyL.RESOLVED;
    }

    public final void LIZLLL(byte[] bArr, int i) {
        nativeResolveStreamLoadData(bArr, 0, i, this.LIZIZ);
    }

    public final void LJ(String str, boolean z) {
        nativeResolveStreamLoadEnd(z, str, this.LIZIZ);
    }
}
