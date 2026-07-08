package com.ss.android.ugc.aweme.commercialize.ucp.impl.spi;

import X.C0DEY;
import X.C333540D5s;
import android.content.Context;
import com.ss.android.ugc.aweme.ad.ucp.IAddressService;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressServiceImpl implements IAddressService {
    public final C333540D5s LIZ = new C333540D5s(null);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // com.ss.android.ugc.aweme.ad.ucp.IAddressService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C333600D5y
            if (r0 == 0) goto L37
            r4 = r6
            X.0D5y r4 = (X.C333600D5y) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0D5s r0 = r5.LIZ
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LIZ(r4)
            if (r0 != r2) goto L28
            return r2
        L37:
            X.0D5y r4 = new X.0D5y
            r4.<init>(r5, r6)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.spi.AddressServiceImpl.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IAddressService
    public final boolean LIZ(Context context, String str, C0DEY c0dey) {
        return this.LIZ.LIZJ(context, str, c0dey);
    }
}
