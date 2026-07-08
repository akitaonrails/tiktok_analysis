package com.facebook.login;

import X.C0W7Q;
import X.C19EG;
import X.C1BBU;
import X.C1BIA;
import X.C1BIC;
import X.C1BJ0;
import X.C1D13;
import X.InterfaceC2202491BHz;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;

/* JADX INFO: loaded from: classes35.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public String e2e;
    public WebDialog loginDialog;
    public final String nameForLogging;
    public final C1BJ0 tokenSource;
    public static final C1BIC Companion = new Object() { // from class: X.1BIC
    };
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C1D13(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void LIZIZ() {
        WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            webDialog.cancel();
            this.loginDialog = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LIZLLL() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final C1BJ0 LJIIJJI() {
        return this.tokenSource;
    }

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.nameForLogging = "web_view";
        this.tokenSource = C1BJ0.WEB_VIEW;
        this.e2e = parcel.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIIZ(final LoginClient.Request request) {
        String str;
        Bundle bundleLJIIJ = LJIIJ(request);
        InterfaceC2202491BHz interfaceC2202491BHz = new InterfaceC2202491BHz() { // from class: X.1BIB
            @Override // X.InterfaceC2202491BHz
            public final void LIZ(Bundle bundle, C1BJO c1bjo) {
                this.LIZ.LJIIL(request, bundle, c1bjo);
            }
        };
        LoginClient.Companion.getClass();
        String strLIZ = C1BBU.LIZ();
        this.e2e = strLIZ;
        LIZ(strLIZ, "e2e");
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        C19EG c19egLJFF = loginClient.LJFF();
        if (c19egLJFF == null) {
            return 0;
        }
        boolean zLJIILIIL = C0W7Q.LJIILIIL(c19egLJFF);
        C1BIA c1bia = new C1BIA(c19egLJFF, request.applicationId, bundleLJIIJ);
        String str2 = this.e2e;
        if (str2 != null) {
            c1bia.LJIIJJI = str2;
            if (zLJIILIIL) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            c1bia.LJI = str;
            c1bia.LJIIL = request.authType;
            c1bia.LJII = request.loginBehavior;
            c1bia.LJIIIIZZ = request.loginTargetApp;
            c1bia.LJIIIZ = request.isFamilyLogin;
            c1bia.LJIIJ = request.shouldSkipAccountDeduplication;
            c1bia.LIZLLL = interfaceC2202491BHz;
            this.loginDialog = c1bia.LIZ();
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.LL = this.loginDialog;
            facebookDialogFragment.show(c19egLJFF.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "web_view";
        this.tokenSource = C1BJ0.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e2e);
    }
}
