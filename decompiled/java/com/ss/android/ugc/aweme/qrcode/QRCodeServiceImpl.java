package com.ss.android.ugc.aweme.qrcode;

import X.C04TD;
import X.C08SY;
import X.C0VSJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C15O7;
import X.C1900270zY9;
import X.C2204961BRm;
import X.C2443109hl;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes29.dex */
public final class QRCodeServiceImpl implements IQRCodeService {
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZ() {
        final C0VSJ c0vsjLIZIZ;
        final C0VSJ c0vsjLIZIZ2;
        if (C08SY.LIZIZ(0) != null && (c0vsjLIZIZ2 = C08SY.LIZIZ(0)) != null && c0vsjLIZIZ2.exists()) {
            C15O7.LIZJ(new Callable() { // from class: X.01ol
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File file = c0vsjLIZIZ2;
                    C1C7U.LIZ("UserQRCodeImageCacheHelper@72a8.clearCache$1L");
                    try {
                        file.delete();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1C7U.LIZIZ("UserQRCodeImageCacheHelper@72a8.clearCache$1L");
                    return null;
                }
            });
        }
        if (C08SY.LIZIZ(1) == null || (c0vsjLIZIZ = C08SY.LIZIZ(1)) == null || !c0vsjLIZIZ.exists()) {
            return;
        }
        C15O7.LIZJ(new Callable() { // from class: X.01ol
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File file = c0vsjLIZIZ;
                C1C7U.LIZ("UserQRCodeImageCacheHelper@72a8.clearCache$1L");
                try {
                    file.delete();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1C7U.LIZIZ("UserQRCodeImageCacheHelper@72a8.clearCache$1L");
                return null;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final String LJFF() {
        return "qrcode";
    }

    public static IQRCodeService LJII() {
        Object objLIZ = C04TD.LIZ(IQRCodeService.class, false);
        if (objLIZ != null) {
            return (IQRCodeService) objLIZ;
        }
        if (C04TD.f112m3 == null) {
            synchronized (IQRCodeService.class) {
                if (C04TD.f112m3 == null) {
                    C04TD.f112m3 = new QRCodeServiceImpl();
                }
            }
        }
        return C04TD.f112m3;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZLLL(Context context) throws Throwable {
        Context context2;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxRQVG6DkHCH0aQ4SXBhV4EDQ==", null);
        C0WST c0wst = new C0WST();
        boolean zBooleanValue = false;
        int iIntValue = -1;
        Object[] objArr = {context, Boolean.FALSE, -1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;ZI)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/QRCodePermissionActivity", "startActivity", QRCodePermissionActivity.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/QRCodePermissionActivity", "startActivity", null, objArr, QRCodePermissionActivity.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                zBooleanValue = ((Boolean) obj2).booleanValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            context2 = context;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - QRCodePermissionActivity.LLILZIL >= 1000) {
            QRCodePermissionActivity.LLILZIL = jCurrentTimeMillis;
            Intent intent = new Intent(context2, (Class<?>) QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", zBooleanValue);
            intent.putExtra("page_from", iIntValue);
            C2443109hl.LIZ(context2, intent);
        }
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/QRCodePermissionActivity", "startActivity", null, objArr, QRCodePermissionActivity.class, c0wzw, true);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int LJI(String str) {
        return C1900270zY9.LIZIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1375710lu5 LIZIZ(android.view.View r5, boolean r6, java.lang.String r7) {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto L36
            android.content.Context r0 = r5.getContext()
            java.lang.String r2 = X.C2427709fH.LJIILLIIL(r0)
            android.graphics.Bitmap r1 = X.C1388460mEe.LIZ(r5)
            if (r1 == 0) goto L34
            r0 = 0
            r5.setDrawingCacheEnabled(r0)
            boolean r0 = com.bytedance.common.utility.BitmapUtils.saveBitmapToSD(r1, r2, r7)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
        L2e:
            X.0lu5 r0 = new X.0lu5
            r0.<init>(r3, r1, r6)
            return r0
        L34:
            r1 = r3
            goto L2e
        L36:
            android.content.Context r0 = r5.getContext()
            android.net.Uri r1 = X.C1388460mEe.LIZIZ(r0, r5, r7)
            X.0lu5 r0 = new X.0lu5
            r0.<init>(r1, r3, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl.LIZIZ(android.view.View, boolean, java.lang.String):X.0lu5");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void LIZJ(Context context, int i, boolean z) throws Throwable {
        C2204961BRm.i(context, z, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxRQVG6DkHCH0aQ4SXBhV4EDQ==", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.content.Context r25, int r26, X.C1904020zeC r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl.LJ(android.content.Context, int, X.0zeC):void");
    }
}
