package com.bytedance.lynx.service.text;

import X.C0X8C;
import X.C1289470jez;
import X.C1311100kDs;
import X.C1311110kDt;
import X.InterfaceC1312730kGV;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.lynx.service.text.LynxTextService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.service.ILynxTextService;
import com.lynx.textra.TTText;
import com.lynx.textra.TTTextDefinition;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes21.dex */
public class LynxTextService implements ILynxTextService {
    public static volatile LynxTextService LIZ;
    public static C1311100kDs LIZIZ;

    public static native long nativeCreateTextLayoutAPI(Object obj);

    public static native void nativeDestroyPage(long j);

    public static native void nativeDestroyTextLayoutAPI(long j);

    public static native byte[] nativeDrawPage(long j);

    public static native int[] nativeGetHitTestEventTargets(long j, float f, float f2);

    public static native byte[] nativeGetSelectedText(long j, int i, int i2);

    public static native int nativeGetSelectionCharIndex(long j, float f, float f2);

    public static native float[] nativeGetSelectionRects(long j, int i, int i2);

    public static native Object[] nativeGetTextInfo(byte[] bArr, float f, byte[] bArr2, float f2, int i);

    public static native int nativeGetTextLength(long j);

    public static native void nativeInitialClasses();

    @Override // com.lynx.tasm.service.ILynxTextService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1311110kDt.LIZ(this);
    }

    @Override // com.lynx.tasm.service.ILynxTextService
    public final InterfaceC1312730kGV createPage(final long j) {
        return new InterfaceC1312730kGV(j) { // from class: X.0kDr
            public long LIZ;

            @Override // X.InterfaceC1312730kGV
            public final void destroy() {
                long j2 = this.LIZ;
                if (j2 == 0) {
                    return;
                }
                LynxTextService.nativeDestroyPage(j2);
                this.LIZ = 0L;
            }

            @Override // X.InterfaceC1312730kGV
            public final int ua() {
                long j2 = this.LIZ;
                if (j2 == 0) {
                    return 0;
                }
                return LynxTextService.nativeGetTextLength(j2);
            }

            {
                this.LIZ = j;
            }

            @Override // X.InterfaceC1312730kGV
            public final String va(int i, int i2) {
                byte[] bArrNativeGetSelectedText;
                long j2 = this.LIZ;
                if (j2 == 0 || (bArrNativeGetSelectedText = LynxTextService.nativeGetSelectedText(j2, i, i2)) == null || bArrNativeGetSelectedText.length == 0) {
                    return "";
                }
                return new String(bArrNativeGetSelectedText, StandardCharsets.UTF_8);
            }

            @Override // X.InterfaceC1312730kGV
            public final float[] wa(int i, int i2) {
                long j2 = this.LIZ;
                if (j2 == 0) {
                    return null;
                }
                return LynxTextService.nativeGetSelectionRects(j2, i, i2);
            }

            @Override // X.InterfaceC1312730kGV
            public final void xa(Canvas canvas, Drawable.Callback callback) {
                long j2 = this.LIZ;
                if (j2 == 0) {
                    return;
                }
                LynxTextService.LJFF(j2, canvas, callback);
            }

            @Override // X.InterfaceC1312730kGV
            public final int[] ya(float f, float f2) {
                long j2 = this.LIZ;
                if (j2 == 0) {
                    return null;
                }
                return LynxTextService.nativeGetHitTestEventTargets(j2, f, f2);
            }

            @Override // X.InterfaceC1312730kGV
            public final int za(float f, float f2) {
                long j2 = this.LIZ;
                if (j2 == 0) {
                    return 0;
                }
                return LynxTextService.nativeGetSelectionCharIndex(j2, f, f2);
            }
        };
    }

    @Override // com.lynx.tasm.service.ILynxTextService
    public final long createTextLayoutAPI(Object obj) {
        return nativeCreateTextLayoutAPI(obj);
    }

    @Override // com.lynx.tasm.service.ILynxTextService
    public final void destroyTextLayoutAPI(long j) {
        nativeDestroyTextLayoutAPI(j);
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
        C0X8C libraryLoader = LynxEnv.inst().getLibraryLoader();
        if (libraryLoader != null) {
            libraryLoader.loadLibrary("tttext_lite");
            libraryLoader.loadLibrary("lynx_text_service");
        } else {
            LoadSoLancet.LIZJ("tttext_lite");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("tttext_lite");
            LoadSoLancet.LJ(jUptimeMillis, "tttext_lite");
            LoadSoLancet.LIZLLL(jUptimeMillis, "tttext_lite");
            LoadSoLancet.LIZIZ("tttext_lite");
            LoadSoLancet.LIZJ("lynx_text_service");
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            Librarian.LJFF("lynx_text_service");
            LoadSoLancet.LJ(jUptimeMillis2, "lynx_text_service");
            LoadSoLancet.LIZLLL(jUptimeMillis2, "lynx_text_service");
            LoadSoLancet.LIZIZ("lynx_text_service");
        }
        TTText.Initial();
        nativeInitialClasses();
        try {
            Class.forName("com.bytedance.lynx.service.text.LynxTextService$PageImpl");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            Class.forName("com.lynx.tasm.utils.FontFaceParser");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            Class.forName("com.lynx.tasm.fontface.FontFaceManager");
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        try {
            Class.forName("com.lynx.tasm.fontface.FontFaceManager$Holder");
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        try {
            Class.forName(TTTextDefinition.class.getName());
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
        }
    }

    public static void LJFF(long j, Canvas canvas, Drawable.Callback callback) {
        byte[] bArrNativeDrawPage = nativeDrawPage(j);
        if (LIZIZ == null) {
            LIZIZ = new C1311100kDs(TTText.mFontManager);
        }
        C1311100kDs c1311100kDs = LIZIZ;
        c1311100kDs.LIZ = canvas;
        c1311100kDs.LIZIZ = callback;
        c1311100kDs.drawBuffer(canvas, bArrNativeDrawPage);
        C1311100kDs c1311100kDs2 = LIZIZ;
        c1311100kDs2.LIZ = null;
        c1311100kDs2.LIZIZ = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r5 < 1.0f) goto L13;
     */
    @Override // com.lynx.tasm.service.ILynxTextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.tasm.service.ILynxTextService.LynxTextInfo getTextInfo(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r0 = 1096810496(0x41600000, float:14.0)
            r4 = 0
            float r0 = X.C1311130kDv.LIZIZ(r0, r4)
            float r3 = X.C1312920kGo.LIZ(r11, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L2c
            r5 = 0
        L12:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L25
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L25
            r2 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r14 <= r2) goto L35
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3e
        L25:
            com.lynx.tasm.service.ILynxTextService$LynxTextInfo r2 = new com.lynx.tasm.service.ILynxTextService$LynxTextInfo
            double r0 = (double) r4
            r2.<init>(r0)
            return r2
        L2c:
            float r0 = X.C1311130kDv.LIZIZ(r4, r4)
            float r5 = X.C1312920kGo.LIZ(r13, r0)
            goto L12
        L35:
            if (r14 != r2) goto L3e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3e
            r5 = 1191181824(0x46fffe00, float:32767.0)
        L3e:
            r6 = 0
            java.lang.String[] r8 = new java.lang.String[r6]
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r10.getBytes(r0)
            java.lang.String r7 = ""
            if (r12 != 0) goto L4c
            r12 = r7
        L4c:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r12.getBytes(r0)
            java.lang.Object[] r3 = nativeGetTextInfo(r1, r3, r0, r5, r14)
            if (r3 == 0) goto L9a
            int r1 = r3.length
            r0 = 2
            if (r1 != r0) goto L9a
            r1 = r3[r6]
            boolean r0 = r1 instanceof float[]
            if (r0 == 0) goto L98
            float[] r1 = (float[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L96
            r0 = r1[r6]
            float r5 = X.C1311130kDv.LIZJ(r0)
        L6d:
            int r0 = r1.length
            if (r0 <= r2) goto L76
            r0 = r1[r2]
            float r4 = X.C1311130kDv.LIZJ(r0)
        L76:
            r3 = r3[r2]
            boolean r0 = r3 instanceof byte[][]
            if (r0 == 0) goto L9c
            byte[][] r3 = (byte[][]) r3
            int r0 = r3.length
            java.lang.String[] r8 = new java.lang.String[r0]
        L81:
            int r0 = r3.length
            if (r6 >= r0) goto L9c
            r2 = r3[r6]
            if (r2 != 0) goto L8e
            r1 = r7
        L89:
            r8[r6] = r1
            int r6 = r6 + 1
            goto L81
        L8e:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r2, r0)
            goto L89
        L96:
            r5 = 0
            goto L6d
        L98:
            r5 = 0
            goto L76
        L9a:
            r0 = 0
            goto L9e
        L9c:
            r0 = r4
            r4 = r5
        L9e:
            com.lynx.tasm.service.ILynxTextService$LynxTextInfo r3 = new com.lynx.tasm.service.ILynxTextService$LynxTextInfo
            double r4 = (double) r4
            double r6 = (double) r0
            r3.<init>(r4, r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.text.LynxTextService.getTextInfo(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):com.lynx.tasm.service.ILynxTextService$LynxTextInfo");
    }
}
