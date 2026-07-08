package com.facebook.login;

import X.C0W7K;
import X.C0W7Q;
import X.C0WZX;
import X.C14SE;
import X.C19EG;
import X.C1BBU;
import X.C1BIP;
import X.C1BIQ;
import X.C1BIT;
import X.C1BIW;
import X.C1BIX;
import X.C1BJ5;
import X.C1BJO;
import X.C1BK1;
import X.C1D13;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2202601BIk;
import X.C2202621BIm;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C807660VmG;
import X.EnumC2202671BIr;
import X.EnumC824980WXw;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class LoginClient implements Parcelable {
    public C1BK1 backgroundProcessingListener;
    public boolean checkedInternetPermission;
    public int currentHandler;
    public Map<String, String> extraData;
    public Fragment fragment;
    public LoginMethodHandler[] handlersToTry;
    public Map<String, String> loggingExtras;
    public C2202601BIk loginLogger;
    public int numActivitiesReturned;
    public int numTotalIntentsFired;
    public C1BIX onCompletedListener;
    public Request pendingRequest;
    public static final C1BBU Companion = new C1BBU();
    public static final Parcelable.Creator<LoginClient> CREATOR = new C1D13(12);

    public static final class Request implements Parcelable {
        public final String applicationId;
        public String authId;
        public String authType;
        public final String codeChallenge;
        public final C14SE codeChallengeMethod;
        public final String codeVerifier;
        public final C1BIP defaultAudience;
        public String deviceAuthTargetUserId;
        public String deviceRedirectUriString;
        public boolean isFamilyLogin;
        public boolean isRerequest;
        public final C1BIT loginBehavior;
        public final EnumC824980WXw loginTargetApp;
        public String messengerPageId;
        public final String nonce;
        public Set<String> permissions;
        public boolean resetMessengerState;
        public boolean shouldSkipAccountDeduplication;
        public static final C1BIQ Companion = new Object() { // from class: X.1BIQ
        };
        public static final Parcelable.Creator<Request> CREATOR = new C1D13(10);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean LIZ() {
            for (String str : this.permissions) {
                if (str != null && (u.LJJIIJZLJL(str, "publish", false) || u.LJJIIJZLJL(str, "manage", false) || LoginManager.LJIIJ.contains(str))) {
                    return true;
                }
            }
            return false;
        }

        public Request(Parcel parcel) {
            C1BIP c1bipValueOf;
            boolean z;
            boolean z2;
            EnumC824980WXw enumC824980WXwValueOf;
            boolean z3;
            C14SE c14seValueOf;
            String string = parcel.readString();
            C0W7K.LJ(string, "loginBehavior");
            this.loginBehavior = C1BIT.valueOf(string);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String string2 = parcel.readString();
            if (string2 != null) {
                c1bipValueOf = C1BIP.valueOf(string2);
            } else {
                c1bipValueOf = C1BIP.NONE;
            }
            this.defaultAudience = c1bipValueOf;
            String string3 = parcel.readString();
            C0W7K.LJ(string3, "applicationId");
            this.applicationId = string3;
            String string4 = parcel.readString();
            C0W7K.LJ(string4, "authId");
            this.authId = string4;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isRerequest = z;
            this.deviceRedirectUriString = parcel.readString();
            String string5 = parcel.readString();
            C0W7K.LJ(string5, "authType");
            this.authType = string5;
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.resetMessengerState = z2;
            String string6 = parcel.readString();
            if (string6 != null) {
                enumC824980WXwValueOf = EnumC824980WXw.valueOf(string6);
            } else {
                enumC824980WXwValueOf = EnumC824980WXw.FACEBOOK;
            }
            this.loginTargetApp = enumC824980WXwValueOf;
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.isFamilyLogin = z3;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            String string7 = parcel.readString();
            C0W7K.LJ(string7, "nonce");
            this.nonce = string7;
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String string8 = parcel.readString();
            if (string8 == null) {
                c14seValueOf = null;
            } else {
                c14seValueOf = C14SE.valueOf(string8);
            }
            this.codeChallengeMethod = c14seValueOf;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String strName;
            parcel.writeString(this.loginBehavior.name());
            parcel.writeStringList(new ArrayList(this.permissions));
            parcel.writeString(this.defaultAudience.name());
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loginTargetApp.name());
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            parcel.writeString(this.nonce);
            parcel.writeString(this.codeVerifier);
            parcel.writeString(this.codeChallenge);
            C14SE c14se = this.codeChallengeMethod;
            if (c14se == null) {
                strName = null;
            } else {
                strName = c14se.name();
            }
            parcel.writeString(strName);
        }

        public Request(C1BIT c1bit, Set<String> set, C1BIP c1bip, String str, String str2, String str3, EnumC824980WXw enumC824980WXw, String str4, String str5, String str6, C14SE c14se) {
            this.loginBehavior = c1bit;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = c1bip;
            this.authType = str;
            this.applicationId = str2;
            this.authId = str3;
            this.loginTargetApp = enumC824980WXw == null ? EnumC824980WXw.FACEBOOK : enumC824980WXw;
            if (str4 != null && str4.length() != 0) {
                this.nonce = str4;
            } else {
                this.nonce = UUID.randomUUID().toString();
            }
            this.codeVerifier = str5;
            this.codeChallenge = str6;
            this.codeChallengeMethod = c14se;
        }
    }

    public final void LJIIJ() {
        LoginMethodHandler loginMethodHandlerLJI = LJI();
        if (loginMethodHandlerLJI != null) {
            LJIIIIZZ(loginMethodHandlerLJI.LIZLLL(), "skipped", null, null, loginMethodHandlerLJI.methodLoggingExtras);
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        if (loginMethodHandlerArr != null) {
            while (true) {
                int i = this.currentHandler;
                if (i >= loginMethodHandlerArr.length - 1) {
                    break;
                }
                this.currentHandler = i + 1;
                LoginMethodHandler loginMethodHandlerLJI2 = LJI();
                if (loginMethodHandlerLJI2 != null) {
                    if (!(loginMethodHandlerLJI2 instanceof WebViewLoginMethodHandler) || LIZJ()) {
                        Request request = this.pendingRequest;
                        if (request != null) {
                            int iLJIIIZ = loginMethodHandlerLJI2.LJIIIZ(request);
                            this.numActivitiesReturned = 0;
                            if (iLJIIIZ > 0) {
                                C2202601BIk c2202601BIkLJII = LJII();
                                String str = request.authId;
                                String strLIZLLL = loginMethodHandlerLJI2.LIZLLL();
                                if (!C807660VmG.LIZ(c2202601BIkLJII)) {
                                    try {
                                        ScheduledExecutorService scheduledExecutorService = C2202601BIk.LIZLLL;
                                        C786410Ut5.LJJJI("3_method", strLIZLLL, C1BJ5.LIZ(str));
                                        c2202601BIkLJII.LIZIZ.getClass();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                                this.numTotalIntentsFired = iLJIIIZ;
                                return;
                            }
                            C2202601BIk c2202601BIkLJII2 = LJII();
                            String str2 = request.authId;
                            String strLIZLLL2 = loginMethodHandlerLJI2.LIZLLL();
                            if (!C807660VmG.LIZ(c2202601BIkLJII2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = C2202601BIk.LIZLLL;
                                    C786410Ut5.LJJJI("3_method", strLIZLLL2, C1BJ5.LIZ(str2));
                                    c2202601BIkLJII2.LIZIZ.getClass();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                            LIZIZ("not_tried", loginMethodHandlerLJI2.LIZLLL(), true);
                        } else {
                            continue;
                        }
                    } else {
                        LIZIZ("no_internet_permission", "1", false);
                    }
                }
            }
        }
        Request request2 = this.pendingRequest;
        if (request2 != null) {
            Result.Companion.getClass();
            LIZ(this, C2202621BIm.LIZJ(request2, "Login attempt failed.", null, null));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LIZJ() throws Throwable {
        String string;
        if (this.checkedInternetPermission) {
            return true;
        }
        C19EG c19egLJFF = LJFF();
        if (c19egLJFF != null && c19egLJFF.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        C19EG c19egLJFF2 = LJFF();
        String string2 = null;
        if (c19egLJFF2 == null) {
            string = null;
        } else {
            string = c19egLJFF2.getString(2131828974);
            string2 = c19egLJFF2.getString(2131828973);
        }
        C2202621BIm c2202621BIm = Result.Companion;
        Request request = this.pendingRequest;
        c2202621BIm.getClass();
        LIZ(this, C2202621BIm.LIZJ(request, string, string2, null));
        return false;
    }

    public final C19EG LJFF() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final LoginMethodHandler LJI() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.currentHandler;
        if (i < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2202601BIk LJII() {
        /*
            r4 = this;
            X.1BIk r3 = r4.loginLogger
            if (r3 == 0) goto L1f
            boolean r0 = X.C807660VmG.LIZ(r3)
            r2 = 0
            if (r0 != 0) goto L12
            java.lang.String r1 = r3.LIZ     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L12:
            r1 = r2
        L13:
            com.facebook.login.LoginClient$Request r0 = r4.pendingRequest
            if (r0 == 0) goto L19
            java.lang.String r2 = r0.applicationId
        L19:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto L38
        L1f:
            X.1BIk r3 = new X.1BIk
            X.19EG r1 = r4.LJFF()
            if (r1 != 0) goto L2b
            android.content.Context r1 = com.facebook.FacebookSdk.LIZJ()
        L2b:
            com.facebook.login.LoginClient$Request r0 = r4.pendingRequest
            if (r0 != 0) goto L39
            java.lang.String r0 = com.facebook.FacebookSdk.LIZLLL()
        L33:
            r3.<init>(r1, r0)
            r4.loginLogger = r3
        L38:
            return r3
        L39:
            java.lang.String r0 = r0.applicationId
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.LJII():X.1BIk");
    }

    public static final class Result implements Parcelable {
        public final AuthenticationToken authenticationToken;
        public final EnumC2202671BIr code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;
        public static final C2202621BIm Companion = new C2202621BIm();
        public static final Parcelable.Creator<Result> CREATOR = new C1D13(11);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.code = EnumC2202671BIr.valueOf(string == null ? "error" : string);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = C0W7Q.LJIJJ(parcel);
            this.extraData = C0W7Q.LJIJJ(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i);
            parcel.writeParcelable(this.authenticationToken, i);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i);
            C0W7Q.LJJ(parcel, this.loggingExtras);
            C0W7Q.LJJ(parcel, this.extraData);
        }

        public Result(Request request, EnumC2202671BIr enumC2202671BIr, AccessToken accessToken, String str, String str2) {
            this(request, enumC2202671BIr, accessToken, null, str, str2);
        }

        public Result(Request request, EnumC2202671BIr enumC2202671BIr, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = enumC2202671BIr;
            this.errorCode = str2;
        }
    }

    public LoginClient(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        LoginMethodHandler loginMethodHandler;
        this.currentHandler = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i];
            if ((parcelable instanceof LoginMethodHandler) && (loginMethodHandler = (LoginMethodHandler) parcelable) != null) {
                loginMethodHandler.loginClient = this;
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (LoginMethodHandler[]) array;
            this.currentHandler = parcel.readInt();
            this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
            Map<String, String> mapLJIJJ = C0W7Q.LJIJJ(parcel);
            if (mapLJIJJ == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = new LinkedHashMap(mapLJIJJ);
            }
            this.loggingExtras = linkedHashMap;
            Map<String, String> mapLJIJJ2 = C0W7Q.LJIJJ(parcel);
            this.extraData = mapLJIJJ2 != null ? new LinkedHashMap(mapLJIJJ2) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void LIZLLL(Result result) throws Throwable {
        LoginMethodHandler loginMethodHandlerLJI = LJI();
        if (loginMethodHandlerLJI != null) {
            LJIIIIZZ(loginMethodHandlerLJI.LIZLLL(), result.code.getLoggingValue(), result.errorMessage, result.errorCode, loginMethodHandlerLJI.methodLoggingExtras);
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        int i = -1;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        C1BIX c1bix = this.onCompletedListener;
        if (c1bix != null) {
            LoginFragment loginFragment = ((C1BIW) c1bix).LIZ;
            loginFragment.LLILLJJLI = null;
            if (result.code == EnumC2202671BIr.CANCEL) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "com.facebook.LoginFragment:Result", result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            C19EG activity = loginFragment.getActivity();
            if (loginFragment.isAdded() && activity != null) {
                C2204961BRm.LLJJIJIL(i, intent, activity, new C0WZX("dzBzEgQ7XM/eWlgqCx6LYVXDpcl0e9WVWkZ1lZfQd0I=", new String[]{"019e5"}));
                activity.finish();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: Exception -> 0x0048, TRY_ENTER, TryCatch #0 {Exception -> 0x0048, blocks: (B:11:0x001c, B:15:0x0044, B:12:0x002b, B:14:0x0035), top: B:24:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.facebook.login.LoginClient.Result r5) {
        /*
            r4 = this;
            com.facebook.AccessToken r0 = r5.token
            if (r0 == 0) goto L6a
            X.1BIw r0 = com.facebook.AccessToken.Companion
            r0.getClass()
            boolean r0 = X.C2202721BIw.LIZJ()
            if (r0 == 0) goto L6a
            com.facebook.AccessToken r0 = r5.token
            if (r0 == 0) goto L62
            com.facebook.AccessToken r1 = X.C2202721BIw.LIZIZ()
            com.facebook.AccessToken r0 = r5.token
            if (r1 == 0) goto L1c
            goto L2b
        L1c:
            X.1BIm r3 = com.facebook.login.LoginClient.Result.Companion     // Catch: java.lang.Exception -> L48
            com.facebook.login.LoginClient$Request r2 = r4.pendingRequest     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "User logged in as different Facebook user."
            r0 = 0
            r3.getClass()     // Catch: java.lang.Exception -> L48
            com.facebook.login.LoginClient$Result r0 = X.C2202621BIm.LIZJ(r2, r1, r0, r0)     // Catch: java.lang.Exception -> L48
            goto L44
        L2b:
            java.lang.String r1 = r1.userId     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r0.userId     // Catch: java.lang.Exception -> L48
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L1c
            X.1BIm r3 = com.facebook.login.LoginClient.Result.Companion     // Catch: java.lang.Exception -> L48
            com.facebook.login.LoginClient$Request r2 = r4.pendingRequest     // Catch: java.lang.Exception -> L48
            com.facebook.AccessToken r1 = r5.token     // Catch: java.lang.Exception -> L48
            com.facebook.AuthenticationToken r0 = r5.authenticationToken     // Catch: java.lang.Exception -> L48
            r3.getClass()     // Catch: java.lang.Exception -> L48
            com.facebook.login.LoginClient$Result r0 = X.C2202621BIm.LIZIZ(r2, r1, r0)     // Catch: java.lang.Exception -> L48
        L44:
            LIZ(r4, r0)     // Catch: java.lang.Exception -> L48
            return
        L48:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BIm r0 = com.facebook.login.LoginClient.Result.Companion
            com.facebook.login.LoginClient$Request r3 = r4.pendingRequest
            java.lang.String r2 = "Caught exception"
            java.lang.String r1 = r1.getMessage()
            r0.getClass()
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = X.C2202621BIm.LIZJ(r3, r2, r1, r0)
            LIZ(r4, r0)
            return
        L62:
            X.1BJO r1 = new X.1BJO
            java.lang.String r0 = "Can't validate without a token"
            r1.<init>(r0)
            throw r1
        L6a:
            LIZ(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.LJ(com.facebook.login.LoginClient$Result):void");
    }

    public LoginClient(Fragment fragment) {
        this.currentHandler = -1;
        if (this.fragment == null) {
            this.fragment = fragment;
            return;
        }
        throw new C1BJO("Can't set fragment once it is already set.");
    }

    public static void LIZ(LoginClient loginClient, Result result) throws Throwable {
        loginClient.LIZLLL(result);
        int i = C2187451AjH.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.handlersToTry, i);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i);
        C0W7Q.LJJ(parcel, this.loggingExtras);
        C0W7Q.LJJ(parcel, this.extraData);
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) map.get(str));
            sbLIZ.append(',');
            sbLIZ.append(str2);
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        map.put(str, str2);
    }

    public final void LJIIIZ(int i, int i2, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.LLJ, false)) {
                LJIIJ();
                return;
            }
            LoginMethodHandler loginMethodHandlerLJI = LJI();
            if (loginMethodHandlerLJI != null) {
                if (!(loginMethodHandlerLJI instanceof KatanaProxyLoginMethodHandler) || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired) {
                    loginMethodHandlerLJI.LJI(i, i2, intent);
                }
            }
        }
    }

    public final void LJIIIIZZ(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        if (request == null) {
            LJII().LIZ(str);
            return;
        }
        C2202601BIk c2202601BIkLJII = LJII();
        String str5 = request.authId;
        if (C807660VmG.LIZ(c2202601BIkLJII)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = C2202601BIk.LIZLLL;
            Bundle bundleLIZ = C1BJ5.LIZ(str5);
            if (str2 != null) {
                C786410Ut5.LJJJI("2_result", str2, bundleLIZ);
            }
            if (str3 != null) {
                C786410Ut5.LJJJI("5_error_message", str3, bundleLIZ);
            }
            if (str4 != null) {
                C786410Ut5.LJJJI("4_error_code", str4, bundleLIZ);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C786410Ut5.LJJJI("6_extras", C786410Ut5.J3(new JSONObject(linkedHashMap)), bundleLIZ);
            }
            C786410Ut5.LJJJI("3_method", str, bundleLIZ);
            c2202601BIkLJII.LIZIZ.getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
