package com.facebook.login;

import X.C0W01;
import X.C14SE;
import X.C1BBU;
import X.C1BIE;
import X.C1BIF;
import X.C1BIP;
import X.C1BIS;
import X.C1BIT;
import X.C1D13;
import X.C807660VmG;
import X.EnumC2202541BIe;
import X.EnumC824980WXw;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes35.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public final String nameForLogging;
    public static final C1BIS Companion = new Object() { // from class: X.1BIS
    };
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C1D13(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LIZLLL() {
        return this.nameForLogging;
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.nameForLogging = "katana_proxy_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIIZ(LoginClient.Request request) {
        boolean z;
        ArrayList<Intent> arrayList;
        C1BIT c1bit = request.loginBehavior;
        if (FacebookSdk.LJIIL && C0W01.LIZ() != null && c1bit.allowsCustomTabAuth()) {
            z = true;
        } else {
            z = false;
        }
        LoginClient.Companion.getClass();
        String strLIZ = C1BBU.LIZ();
        C1BIE c1bie = C1BIE.LIZ;
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        loginClient.LJFF();
        String str = request.applicationId;
        Set<String> set = request.permissions;
        boolean zLIZ = request.LIZ();
        C1BIP c1bip = request.defaultAudience;
        if (c1bip == null) {
            c1bip = C1BIP.NONE;
        }
        String strLIZJ = LIZJ(request.authId);
        String str2 = request.authType;
        String str3 = request.messengerPageId;
        boolean z2 = request.resetMessengerState;
        boolean z3 = request.isFamilyLogin;
        boolean z4 = request.shouldSkipAccountDeduplication;
        String str4 = request.nonce;
        C14SE c14se = request.codeChallengeMethod;
        if (c14se != null) {
            c14se.name();
        }
        if (!C807660VmG.LIZ(C1BIE.class)) {
            try {
                List<C1BIF> list = C1BIE.LIZIZ;
                arrayList = new ArrayList();
                Iterator<C1BIF> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str5 = str;
                    Intent intentLIZJ = C1BIE.LIZ.LIZJ(it2.next(), str5, set, strLIZ, zLIZ, c1bip, strLIZJ, str2, z, str3, z2, EnumC824980WXw.FACEBOOK, z3, z4, str4);
                    if (intentLIZJ != null) {
                        arrayList.add(intentLIZJ);
                    }
                    str = str5;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        LIZ(strLIZ, "e2e");
        int i = 0;
        for (Intent intent : arrayList) {
            i++;
            LoginClient.Companion.getClass();
            EnumC2202541BIe.Login.toRequestCode();
            if (LJIILJJIL(intent)) {
                return i;
            }
        }
        return 0;
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "katana_proxy_auth";
    }
}
