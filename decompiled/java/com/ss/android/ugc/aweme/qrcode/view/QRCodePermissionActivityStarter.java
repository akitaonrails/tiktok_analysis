package com.ss.android.ugc.aweme.qrcode.view;

import X.C04TD;
import com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter;

/* JADX INFO: loaded from: classes29.dex */
public final class QRCodePermissionActivityStarter implements IQRCodePermissionActivityStarter {
    public static IQRCodePermissionActivityStarter LIZIZ() {
        Object objLIZ = C04TD.LIZ(IQRCodePermissionActivityStarter.class, false);
        if (objLIZ != null) {
            return (IQRCodePermissionActivityStarter) objLIZ;
        }
        if (C04TD.o3 == null) {
            synchronized (IQRCodePermissionActivityStarter.class) {
                if (C04TD.o3 == null) {
                    C04TD.o3 = new QRCodePermissionActivityStarter();
                }
            }
        }
        return C04TD.o3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @Override // com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivityStarter.LIZ(android.content.Context, boolean):void");
    }
}
