package com.facebook.login;

import X.C1BIR;
import X.C1BJ0;
import X.C1D13;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public final String nameForLogging;
    public final C1BJ0 tokenSource;
    public static final C1BIR Companion = new Object() { // from class: X.1BIR
    };
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C1D13(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LIZLLL() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    public final C1BJ0 LJIIJJI() {
        return this.tokenSource;
    }

    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.nameForLogging = "instagram_login";
        this.tokenSource = C1BJ0.INSTAGRAM_APPLICATION_WEB;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIIZ(com.facebook.login.LoginClient.Request r21) {
        /*
            r20 = this;
            X.1BBU r0 = com.facebook.login.LoginClient.Companion
            r0.getClass()
            java.lang.String r8 = X.C1BBU.LIZ()
            X.1BIE r0 = X.C1BIE.LIZ
            r1 = r20
            com.facebook.login.LoginClient r0 = r1.loginClient
            r0.getClass()
            X.19EG r0 = r0.LJFF()
            if (r0 != 0) goto L1c
            android.content.Context r0 = com.facebook.FacebookSdk.LIZJ()
        L1c:
            r4 = r21
            java.lang.String r6 = r4.applicationId
            java.util.Set<java.lang.String> r7 = r4.permissions
            boolean r9 = r4.LIZ()
            X.1BIP r10 = r4.defaultAudience
            if (r10 != 0) goto L2c
            X.1BIP r10 = X.C1BIP.NONE
        L2c:
            java.lang.String r2 = r4.authId
            java.lang.String r11 = r1.LIZJ(r2)
            java.lang.String r12 = r4.authType
            java.lang.String r14 = r4.messengerPageId
            boolean r15 = r4.resetMessengerState
            boolean r3 = r4.isFamilyLogin
            boolean r2 = r4.shouldSkipAccountDeduplication
            java.lang.Class<X.1BIE> r4 = X.C1BIE.class
            boolean r4 = X.C807660VmG.LIZ(r4)
            if (r4 != 0) goto L80
            X.1BIL r5 = new X.1BIL     // Catch: java.lang.Throwable -> L7c
            r5.<init>()     // Catch: java.lang.Throwable -> L7c
            X.1BIE r4 = X.C1BIE.LIZ     // Catch: java.lang.Throwable -> L7c
            X.0WXw r16 = X.EnumC824980WXw.INSTAGRAM     // Catch: java.lang.Throwable -> L7c
            java.lang.String r19 = ""
            r13 = 0
            r18 = r2
            r17 = r3
            android.content.Intent r3 = r4.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<X.1BIE> r2 = X.C1BIE.class
            boolean r2 = X.C807660VmG.LIZ(r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L80
            if (r3 == 0) goto L80
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L77
            android.content.pm.ResolveInfo r2 = r2.resolveActivity(r3, r13)     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L80
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = r2.packageName     // Catch: java.lang.Throwable -> L77
            boolean r0 = X.C2178608gC.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L81
            goto L80
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L80:
            r3 = 0
        L81:
            java.lang.String r0 = "e2e"
            r1.LIZ(r8, r0)
            X.1BBU r0 = com.facebook.login.LoginClient.Companion
            r0.getClass()
            X.1BIe r0 = X.EnumC2202541BIe.Login
            r0.toRequestCode()
            boolean r0 = r1.LJIILJJIL(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.InstagramAppLoginMethodHandler.LJIIIZ(com.facebook.login.LoginClient$Request):int");
    }

    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "instagram_login";
        this.tokenSource = C1BJ0.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
