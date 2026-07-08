package com.facebook.login;

import X.AbstractServiceConnectionC2202581BIi;
import X.C08CX;
import X.C0WV6;
import X.C0WZX;
import X.C13BV;
import X.C1BIE;
import X.C1BJ0;
import X.C1BJ3;
import X.C1BJO;
import X.C1BK1;
import X.C1BK3;
import X.C1BKF;
import X.C1D13;
import X.C20338814iA;
import X.C2202561BIg;
import X.C2202621BIm;
import X.C2202721BIw;
import X.C2202851BJj;
import X.C2202921BJq;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C807660VmG;
import X.InterfaceC2202881BJm;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public C2202851BJj getTokenClient;
    public final String nameForLogging;
    public static final C1BKF Companion = new Object() { // from class: X.1BKF
    };
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C1D13(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void LIZIZ() {
        C2202851BJj c2202851BJj = this.getTokenClient;
        if (c2202851BJj != null) {
            c2202851BJj.LLILZ = false;
            c2202851BJj.LLILLL = null;
            this.getTokenClient = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LIZLLL() {
        return this.nameForLogging;
    }

    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.nameForLogging = "get_token";
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.1BIi, X.1BJj, android.content.ServiceConnection] */
    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIIZ(final LoginClient.Request request) {
        boolean z;
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        final Context contextLJFF = loginClient.LJFF();
        if (contextLJFF == null) {
            contextLJFF = FacebookSdk.LIZJ();
        }
        ?? r5 = new AbstractServiceConnectionC2202581BIi(contextLJFF, request) { // from class: X.1BJj
            {
                String str = request.applicationId;
                String str2 = request.nonce;
            }
        };
        this.getTokenClient = r5;
        synchronized (r5) {
            try {
                if (!r5.LLILZ) {
                    C1BIE c1bie = C1BIE.LIZ;
                    int i = r5.LLJ;
                    if (!C807660VmG.LIZ(C1BIE.class)) {
                        try {
                            if (C1BIE.LIZ.LJII(C1BIE.LIZIZ, new int[]{i}).LIZ == -1) {
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    C1BIE c1bie2 = C1BIE.LIZ;
                    Intent intentLIZLLL = C1BIE.LIZLLL(r5.LL);
                    if (intentLIZLLL != null) {
                        r5.LLILZ = true;
                        C2204961BRm.LJJJJ(r5.LL, intentLIZLLL, r5, 1, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloOV7HWgI2mG9kwUzmTT0kl2ybJZIQ==", new String[]{"019e5"}));
                        z = true;
                    } else {
                        z = false;
                    }
                }
                z = false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (Intrinsics.LJFF(Boolean.valueOf(z), Boolean.FALSE)) {
            return 0;
        }
        LoginClient loginClient2 = this.loginClient;
        loginClient2.getClass();
        C1BK1 c1bk1 = loginClient2.backgroundProcessingListener;
        if (c1bk1 != null) {
            c1bk1.LIZIZ();
        }
        C2202921BJq c2202921BJq = new C2202921BJq(this, request);
        C2202851BJj c2202851BJj = this.getTokenClient;
        if (c2202851BJj != null) {
            c2202851BJj.LLILLL = c2202921BJq;
        }
        return 1;
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "get_token";
    }

    public final void LJIIJJI(Bundle bundle, LoginClient.Request request) {
        LoginClient.Result resultLIZJ;
        AuthenticationToken authenticationToken;
        try {
            C2202561BIg c2202561BIg = LoginMethodHandler.Companion;
            C1BJ0 c1bj0 = C1BJ0.FACEBOOK_APPLICATION_SERVICE;
            String str = request.applicationId;
            c2202561BIg.getClass();
            AccessToken accessTokenLIZ = C2202561BIg.LIZ(bundle, c1bj0, str);
            String str2 = request.nonce;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null && string.length() != 0 && str2 != null && str2.length() != 0) {
                try {
                    authenticationToken = new AuthenticationToken(string, str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C1BJO(e.getMessage());
                }
            } else {
                authenticationToken = null;
            }
            LoginClient.Result.Companion.getClass();
            resultLIZJ = C2202621BIm.LIZIZ(request, accessTokenLIZ, authenticationToken);
        } catch (C1BJO e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2202621BIm c2202621BIm = LoginClient.Result.Companion;
            LoginClient loginClient = this.loginClient;
            loginClient.getClass();
            LoginClient.Request request2 = loginClient.pendingRequest;
            String message = e2.getMessage();
            c2202621BIm.getClass();
            resultLIZJ = C2202621BIm.LIZJ(request2, null, message, null);
        }
        LoginClient loginClient2 = this.loginClient;
        loginClient2.getClass();
        loginClient2.LJ(resultLIZJ);
    }

    public static void LJIIJ(final Bundle bundle, final GetTokenLoginMethodHandler getTokenLoginMethodHandler, final LoginClient.Request request) {
        String str;
        String str2;
        C2202851BJj c2202851BJj = getTokenLoginMethodHandler.getTokenClient;
        if (c2202851BJj != null) {
            c2202851BJj.LLILLL = null;
        }
        getTokenLoginMethodHandler.getTokenClient = null;
        LoginClient loginClient = getTokenLoginMethodHandler.loginClient;
        loginClient.getClass();
        C1BK1 c1bk1 = loginClient.backgroundProcessingListener;
        if (c1bk1 != null) {
            c1bk1.LIZ();
        }
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = C13BV.INSTANCE;
            }
            Set set = request.permissions;
            if (set == null) {
                set = C08CX.INSTANCE;
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (set.contains("openid") && (string == null || string.length() == 0)) {
                LoginClient loginClient2 = getTokenLoginMethodHandler.loginClient;
                loginClient2.getClass();
                loginClient2.LJIIJ();
                return;
            }
            if (stringArrayList.containsAll(set)) {
                String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string2 != null && string2.length() != 0) {
                    getTokenLoginMethodHandler.LJIIJJI(bundle, request);
                    return;
                }
                LoginClient loginClient3 = getTokenLoginMethodHandler.loginClient;
                loginClient3.getClass();
                C1BK1 c1bk12 = loginClient3.backgroundProcessingListener;
                if (c1bk12 != null) {
                    c1bk12.LIZIZ();
                }
                String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                if (string3 != null) {
                    InterfaceC2202881BJm interfaceC2202881BJm = new InterfaceC2202881BJm() { // from class: X.1BIl
                        @Override // X.InterfaceC2202881BJm
                        public final void LIZ(C1BJO c1bjo) throws Throwable {
                            String message;
                            LoginClient loginClient4 = getTokenLoginMethodHandler.loginClient;
                            loginClient4.getClass();
                            C2202621BIm c2202621BIm = LoginClient.Result.Companion;
                            LoginClient loginClient5 = getTokenLoginMethodHandler.loginClient;
                            loginClient5.getClass();
                            LoginClient.Request request2 = loginClient5.pendingRequest;
                            if (c1bjo == null) {
                                message = null;
                            } else {
                                message = c1bjo.getMessage();
                            }
                            c2202621BIm.getClass();
                            loginClient4.LIZLLL(C2202621BIm.LIZJ(request2, "Caught exception", message, null));
                            int i = C2187451AjH.LIZ;
                        }

                        @Override // X.InterfaceC2202881BJm
                        public final void LIZIZ(JSONObject jSONObject) {
                            String string4;
                            try {
                                Bundle bundle2 = bundle;
                                if (jSONObject == null) {
                                    string4 = null;
                                } else {
                                    string4 = jSONObject.getString(FollowStatusChangeMethod.PARAM_UID);
                                }
                                C786410Ut5.LJJJI("com.facebook.platform.extra.USER_ID", string4, bundle2);
                                getTokenLoginMethodHandler.LJIIJJI(bundle, request);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                LoginClient loginClient4 = getTokenLoginMethodHandler.loginClient;
                                loginClient4.getClass();
                                C2202621BIm c2202621BIm = LoginClient.Result.Companion;
                                LoginClient loginClient5 = getTokenLoginMethodHandler.loginClient;
                                loginClient5.getClass();
                                LoginClient.Request request2 = loginClient5.pendingRequest;
                                String message = e.getMessage();
                                c2202621BIm.getClass();
                                loginClient4.LIZLLL(C2202621BIm.LIZJ(request2, "Caught exception", message, null));
                                int i = C2187451AjH.LIZ;
                            }
                        }
                    };
                    JSONObject jSONObject = C20338814iA.LIZ.get(string3);
                    if (jSONObject != null) {
                        interfaceC2202881BJm.LIZIZ(jSONObject);
                        return;
                    }
                    C1BJ3 c1bj3 = new C1BJ3(interfaceC2202881BJm, string3);
                    Bundle bundle2 = new Bundle();
                    AccessToken.Companion.getClass();
                    AccessToken accessTokenLIZIZ = C2202721BIw.LIZIZ();
                    if (accessTokenLIZIZ == null || (str = accessTokenLIZIZ.graphDomain) == null) {
                        str = "facebook";
                    }
                    if (Intrinsics.LJFF(str, "instagram")) {
                        str2 = "id,name,profile_picture";
                    } else {
                        str2 = "id,name,first_name,middle_name,last_name";
                    }
                    C786410Ut5.LJJJI("fields", str2, bundle2);
                    C786410Ut5.LJJJI("access_token", string3, bundle2);
                    GraphRequest graphRequest = new GraphRequest(null, "me", null, null, new C1BK3(), 32);
                    graphRequest.LIZLLL = bundle2;
                    graphRequest.LJIIIZ(C0WV6.GET);
                    synchronized (FacebookSdk.LIZ) {
                    }
                    FacebookSdk.LJIIIIZZ();
                    graphRequest.LJFF = c1bj3;
                    graphRequest.LIZLLL();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            HashSet hashSet = new HashSet();
            for (Object obj : set) {
                if (!stringArrayList.contains(obj)) {
                    hashSet.add(obj);
                }
            }
            if (!hashSet.isEmpty()) {
                getTokenLoginMethodHandler.LIZ(TextUtils.join(",", hashSet), "new_permissions");
            }
            request.permissions = hashSet;
        }
        LoginClient loginClient4 = getTokenLoginMethodHandler.loginClient;
        loginClient4.getClass();
        loginClient4.LJIIJ();
    }
}
