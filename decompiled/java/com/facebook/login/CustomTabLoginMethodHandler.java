package com.facebook.login;

import X.C0W01;
import X.C0W59;
import X.C0W7Q;
import X.C0WVC;
import X.C0WVE;
import X.C0WVG;
import X.C0WZX;
import X.C14SE;
import X.C1701330uNH;
import X.C19EG;
import X.C1BBU;
import X.C1BID;
import X.C1BIN;
import X.C1BJ0;
import X.C1BJO;
import X.C1D13;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C817470W4z;
import X.C824920WXq;
import X.EnumC824980WXw;
import Y.ARunnableS67S0300000_34;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static boolean calledThroughLoggedOutAppSwitch;
    public String currentPackage;
    public String expectedChallenge;
    public final String nameForLogging;
    public final C1BJ0 tokenSource;
    public String validRedirectURI;
    public static final C1BID Companion = new Object() { // from class: X.1BID
    };
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C1D13(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LIZLLL() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJ() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final C1BJ0 LJIIJJI() {
        return this.tokenSource;
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "custom_tab";
        this.tokenSource = C1BJ0.CHROME_CUSTOM_TAB;
        this.expectedChallenge = new BigInteger(100, new Random()).toString(32);
        calledThroughLoggedOutAppSwitch = false;
        this.validRedirectURI = C0W01.LIZJ(super.LJ());
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void LJIIIIZZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIIZ(LoginClient.Request request) throws Throwable {
        boolean z;
        String strName;
        String str;
        C817470W4z c817470W4z;
        C817470W4z c817470W4z2;
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        if (this.validRedirectURI.length() == 0) {
            return 0;
        }
        Bundle bundleLJIIJ = LJIIJ(request);
        C786410Ut5.LJJJI("redirect_uri", this.validRedirectURI, bundleLJIIJ);
        EnumC824980WXw enumC824980WXw = request.loginTargetApp;
        EnumC824980WXw enumC824980WXw2 = EnumC824980WXw.INSTAGRAM;
        if (enumC824980WXw == enumC824980WXw2) {
            C786410Ut5.LJJJI("app_id", request.applicationId, bundleLJIIJ);
        } else {
            C786410Ut5.LJJJI("client_id", request.applicationId, bundleLJIIJ);
        }
        LoginClient.Companion.getClass();
        C786410Ut5.LJJJI("e2e", C1BBU.LIZ(), bundleLJIIJ);
        if (request.loginTargetApp == enumC824980WXw2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LJJJI("response_type", "token,signed_request,graph_domain,granted_scopes", bundleLJIIJ);
        } else {
            if (request.permissions.contains("openid")) {
                C786410Ut5.LJJJI("nonce", request.nonce, bundleLJIIJ);
            }
            C786410Ut5.LJJJI("response_type", "id_token,token,signed_request,graph_domain", bundleLJIIJ);
        }
        C786410Ut5.LJJJI("code_challenge", request.codeChallenge, bundleLJIIJ);
        C14SE c14se = request.codeChallengeMethod;
        if (c14se == null) {
            strName = null;
        } else {
            strName = c14se.name();
        }
        C786410Ut5.LJJJI("code_challenge_method", strName, bundleLJIIJ);
        C786410Ut5.LJJJI("return_scopes", "true", bundleLJIIJ);
        C786410Ut5.LJJJI("auth_type", request.authType, bundleLJIIJ);
        C786410Ut5.LJJJI("login_behavior", request.loginBehavior.name(), bundleLJIIJ);
        C786410Ut5.E2();
        C786410Ut5.LJJJI("sdk", Intrinsics.LJIIJJI("17.0.0", "android-"), bundleLJIIJ);
        C786410Ut5.LJJJI("sso", "chrome_custom_tab", bundleLJIIJ);
        boolean z2 = FacebookSdk.LJIIJJI;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("cct_prefetching", str, bundleLJIIJ);
        if (request.isFamilyLogin) {
            C786410Ut5.LJJJI("fx_app", request.loginTargetApp.toString(), bundleLJIIJ);
        }
        if (request.shouldSkipAccountDeduplication) {
            C786410Ut5.LJJJI("skip_dedupe", "true", bundleLJIIJ);
        }
        String str3 = request.messengerPageId;
        if (str3 != null) {
            C786410Ut5.LJJJI("messenger_page_id", str3, bundleLJIIJ);
            if (request.resetMessengerState) {
                str2 = "1";
            }
            C786410Ut5.LJJJI("reset_messenger_state", str2, bundleLJIIJ);
        }
        if (calledThroughLoggedOutAppSwitch) {
            C786410Ut5.LJJJI("cct_over_app_switch", "1", bundleLJIIJ);
        }
        if (FacebookSdk.LJIIJJI) {
            if (request.loginTargetApp == enumC824980WXw2) {
                Uri uriLIZ = C0WVG.LIZ(bundleLJIIJ, "oauth");
                ReentrantLock reentrantLock = C824920WXq.LLILLL;
                reentrantLock.lock();
                if (C824920WXq.LLILLJJLI == null && (c817470W4z2 = C824920WXq.LL) != null) {
                    C824920WXq.LLILLJJLI = c817470W4z2.LIZJ(null);
                }
                reentrantLock.unlock();
                reentrantLock.lock();
                C0W59 c0w59 = C824920WXq.LLILLJJLI;
                if (c0w59 != null) {
                    try {
                        c0w59.LIZIZ.c(c0w59.LIZJ, uriLIZ, c0w59.LIZ(null), null);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                reentrantLock.unlock();
            } else {
                Uri uriLIZ2 = C0WVC.LIZ(bundleLJIIJ, "oauth");
                ReentrantLock reentrantLock2 = C824920WXq.LLILLL;
                reentrantLock2.lock();
                if (C824920WXq.LLILLJJLI == null && (c817470W4z = C824920WXq.LL) != null) {
                    C824920WXq.LLILLJJLI = c817470W4z.LIZJ(null);
                }
                reentrantLock2.unlock();
                reentrantLock2.lock();
                C0W59 c0w592 = C824920WXq.LLILLJJLI;
                if (c0w592 != null) {
                    try {
                        c0w592.LIZIZ.c(c0w592.LIZJ, uriLIZ2, c0w592.LIZ(null), null);
                    } catch (RemoteException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                reentrantLock2.unlock();
            }
        }
        C19EG c19egLJFF = loginClient.LJFF();
        if (c19egLJFF == null) {
            return 0;
        }
        Intent intent = new Intent(c19egLJFF, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.LLILLL, "oauth");
        intent.putExtra(CustomTabMainActivity.LLILZ, bundleLJIIJ);
        String str4 = CustomTabMainActivity.LLILZIL;
        String strLIZ = this.currentPackage;
        if (strLIZ == null) {
            strLIZ = C0W01.LIZ();
            this.currentPackage = strLIZ;
        }
        intent.putExtra(str4, strLIZ);
        intent.putExtra(CustomTabMainActivity.LLIZ, request.loginTargetApp.toString());
        Fragment fragment = loginClient.fragment;
        if (fragment != null) {
            C1701330uNH.LIZ(intent, fragment);
            C2204961BRm.LLJL(fragment, intent, 1, new C0WZX("dzBzEgQ7XM/eWlgqCx6LYVXDpcZub8iUcWB1kLbafl9PCFEA1QEtl0ICfRva0g==", new String[]{"019e5"}));
        }
        return 1;
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.nameForLogging = "custom_tab";
        this.tokenSource = C1BJ0.CHROME_CUSTOM_TAB;
        this.expectedChallenge = parcel.readString();
        this.validRedirectURI = C0W01.LIZJ(super.LJ());
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final boolean LJI(int i, int i2, Intent intent) {
        int i3;
        if ((intent != null && intent.getBooleanExtra(CustomTabMainActivity.LLJ, false)) || i != 1) {
            return false;
        }
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        LoginClient.Request request = loginClient.pendingRequest;
        if (request == null) {
            return false;
        }
        if (i2 == -1) {
            if (intent != null) {
                try {
                    String stringExtra = intent.getStringExtra(CustomTabMainActivity.LLILZLL);
                    if (stringExtra != null && (u.LJJIIJZLJL(stringExtra, "fbconnect://cct.", false) || u.LJJIIJZLJL(stringExtra, super.LJ(), false))) {
                        Uri uri = Uri.parse(stringExtra);
                        Bundle bundleLJIJ = C0W7Q.LJIJ(uri.getQuery());
                        C786410Ut5.LJJIIJZLJL(bundleLJIJ, C0W7Q.LJIJ(uri.getFragment()));
                        try {
                            String string = bundleLJIJ.getString("state");
                            if (string != null) {
                                if (Intrinsics.LJFF(new JSONObject(string).getString("7_challenge"), this.expectedChallenge)) {
                                    String string2 = bundleLJIJ.getString("error");
                                    if (string2 == null) {
                                        string2 = bundleLJIJ.getString("error_type");
                                    }
                                    String string3 = bundleLJIJ.getString("error_msg");
                                    if (string3 == null && (string3 = bundleLJIJ.getString("error_message")) == null) {
                                        string3 = bundleLJIJ.getString("error_description");
                                    }
                                    String string4 = bundleLJIJ.getString("error_code");
                                    if (string4 != null) {
                                        try {
                                            i3 = Integer.parseInt(string4);
                                        } catch (NumberFormatException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            i3 = -1;
                                        }
                                    } else {
                                        i3 = -1;
                                    }
                                    if (C0W7Q.LJIILL(string2) && C0W7Q.LJIILL(string3) && i3 == -1) {
                                        if (bundleLJIJ.containsKey("access_token")) {
                                            LJIIL(request, bundleLJIJ, null);
                                            return true;
                                        }
                                        FacebookSdk.LJ().execute(new ARunnableS67S0300000_34(this, request, bundleLJIJ, 26));
                                        return true;
                                    }
                                    if (string2 != null && (Intrinsics.LJFF(string2, "access_denied") || Intrinsics.LJFF(string2, "OAuthAccessDeniedException"))) {
                                        LJIIL(request, null, new C1BIN());
                                        return true;
                                    }
                                    if (i3 == 4201) {
                                        LJIIL(request, null, new C1BIN());
                                        return true;
                                    }
                                    LJIIL(request, null, new C0WVE(new FacebookRequestError(i3, string2, string3), string3));
                                    return true;
                                }
                            }
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        LJIIL(request, null, new C1BJO("Invalid state parameter"));
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return true;
                }
            }
            return true;
        }
        LJIIL(request, null, new C1BIN());
        return false;
    }
}
