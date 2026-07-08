package com.stripe.android.pushProvisioning;

import X.C0WZX;
import X.C0X33;
import X.C0XLP;
import X.C0XLQ;
import X.C1495500p1I;
import X.C1495520p1K;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C832510WlF;
import X.C833200WmM;
import X.C836620Wrs;
import X.C836630Wrt;
import X.C836670Wrx;
import X.C836680Wry;
import X.C836690Wrz;
import X.C836700Ws0;
import X.EnumC836640Wru;
import X.InterfaceC1495610p1T;
import X.InterfaceC831290WjH;
import X.InterfaceC834430WoL;
import X.InterfaceC834580Woa;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.stripe.android.pushProvisioning.PushProvisioningActivity;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import com.stripe.android.pushProvisioning.PushProvisioningEphemeralKeyProvider;
import java.io.IOException;
import java.lang.ref.WeakReference;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PushProvisioningActivity extends C19EG {
    public static final String _pnsPageId = "KyohZzwnOiw8LGEyJiE+JiY3ZjU5OicDOio6IDw6HELIOSJyslJyh9GDA/IR8hJzMlOiY8JiwiLg4wPCw6IDsq";
    public C833200WmM LL;
    public PushProvisioningEphemeralKeyProvider LLILLJJLI;
    public String LLILLL;
    public C836630Wrt LLILZ;
    public InterfaceC834430WoL<String> LLILZIL;
    public InterfaceC834430WoL<String> LLILZLL;
    public C836620Wrs LLIZ;
    public C836690Wrz LLIZLLLIL;
    public C836700Ws0 LLJ;

    @Override // X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0Ws0] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0Wrz] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0Wrs] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Wrt] */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.LL = new C833200WmM((Activity) this);
        PushProvisioningActivityStarter.Args args = (PushProvisioningActivityStarter.Args) LLLLLZL(getIntent()).getParcelable("extra_activity_args");
        this.LLILLL = args.LL;
        this.LLILLJJLI = args.LLILLJJLI;
        this.LLILZ = new Object(args.LLILLL) { // from class: X.0Wrt
        };
        InterfaceC834430WoL<String> interfaceC834430WoL = (InterfaceC834430WoL) LLLLLZL(getIntent()).getParcelable("StableHardwareIdRetriever");
        this.LLILZIL = interfaceC834430WoL;
        if (interfaceC834430WoL == null) {
            this.LLILZIL = new InterfaceC834430WoL<String>() { // from class: X.0WoK
                @Override // X.InterfaceC834430WoL
                public final void LIZ(InterfaceC833320WmY interfaceC833320WmY, InterfaceC834580Woa<String> interfaceC834580Woa) {
                    C833200WmM c833200WmM = (C833200WmM) interfaceC833320WmY;
                    c833200WmM.getClass();
                    C832510WlF c832510WlF = new C832510WlF();
                    c832510WlF.LIZ = new InterfaceC831290WjH(c833200WmM) { // from class: X.0WmP
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC831290WjH
                        public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                            final C835520Wq6 c835520Wq6 = (C835520Wq6) obj;
                            C833260WmS c833260WmS = (C833260WmS) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                            BinderC817800W6g binderC817800W6g = new BinderC817800W6g() { // from class: X.0Wlc
                                @Override // X.BinderC817800W6g, X.InterfaceC817790W6f
                                public final void LLILZLL(Status status, String str) {
                                    C832640WlS.LIZIZ(status, str, c835520Wq6);
                                }
                            };
                            Parcel parcelLJJJZ = c833260WmS.LJJJZ();
                            parcelLJJJZ.writeStrongBinder(binderC817800W6g);
                            c833260WmS.LLILLIZIL(30, parcelLJJJZ);
                        }
                    };
                    c832510WlF.LIZLLL = 2109;
                    c833200WmM.doRead(c832510WlF.LIZ()).LIZIZ(interfaceC834580Woa);
                }
            };
        }
        InterfaceC834430WoL<String> interfaceC834430WoL2 = (InterfaceC834430WoL) LLLLLZL(getIntent()).getParcelable("ActiveWalletIdRetriever");
        this.LLILZLL = interfaceC834430WoL2;
        if (interfaceC834430WoL2 == null) {
            this.LLILZLL = new InterfaceC834430WoL<String>() { // from class: X.0WoJ
                @Override // X.InterfaceC834430WoL
                public final void LIZ(InterfaceC833320WmY interfaceC833320WmY, InterfaceC834580Woa<String> interfaceC834580Woa) {
                    C833200WmM c833200WmM = (C833200WmM) interfaceC833320WmY;
                    c833200WmM.getClass();
                    C832510WlF c832510WlF = new C832510WlF();
                    c832510WlF.LIZ = new InterfaceC831290WjH(c833200WmM) { // from class: X.0WmR
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC831290WjH
                        public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                            final C835520Wq6 c835520Wq6 = (C835520Wq6) obj;
                            C833260WmS c833260WmS = (C833260WmS) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                            BinderC817800W6g binderC817800W6g = new BinderC817800W6g() { // from class: X.0Wle
                                @Override // X.BinderC817800W6g, X.InterfaceC817790W6f
                                public final void LLLLIILL(Status status, String str) {
                                    C832640WlS.LIZIZ(status, str, c835520Wq6);
                                }
                            };
                            Parcel parcelLJJJZ = c833260WmS.LJJJZ();
                            parcelLJJJZ.writeStrongBinder(binderC817800W6g);
                            c833260WmS.LLILLIZIL(21, parcelLJJJZ);
                        }
                    };
                    c832510WlF.LIZLLL = 2103;
                    c833200WmM.doRead(c832510WlF.LIZ()).LIZIZ(interfaceC834580Woa);
                }
            };
        }
        C836620Wrs c836620Wrs = (C836620Wrs) LLLLLZL(getIntent()).getParcelable("EphemeralKeyRetriever");
        this.LLIZ = c836620Wrs;
        if (c836620Wrs == null) {
            this.LLIZ = new Object() { // from class: X.0Wrs
            };
        }
        C836690Wrz c836690Wrz = (C836690Wrz) LLLLLZL(getIntent()).getParcelable("HttpCaller");
        this.LLIZLLLIL = c836690Wrz;
        if (c836690Wrz == null) {
            this.LLIZLLLIL = new Object() { // from class: X.0Wrz
            };
        }
        C836700Ws0 c836700Ws0 = (C836700Ws0) LLLLLZL(getIntent()).getParcelable("PushTokenizeCaller");
        this.LLJ = c836700Ws0;
        if (c836700Ws0 == null) {
            this.LLJ = new Object() { // from class: X.0Ws0
            };
        }
        if (this.LLILLJJLI != null) {
            getClass();
            getClass();
            this.LLILZLL.LIZ(this.LL, new InterfaceC834580Woa<String>() { // from class: X.0Wro
                @Override // X.InterfaceC834580Woa
                public final void LIZ(AbstractC835450Wpz<String> abstractC835450Wpz) throws Throwable {
                    PushProvisioningActivity pushProvisioningActivity;
                    EnumC836640Wru enumC836640Wru;
                    String str;
                    if (abstractC835450Wpz.LJIILJJIL()) {
                        final String strLJIIJ = abstractC835450Wpz.LJIIJ();
                        getClass();
                        final PushProvisioningActivity pushProvisioningActivity2 = this.LL;
                        pushProvisioningActivity2.LLILZ.getClass();
                        pushProvisioningActivity2.LLILZIL.LIZ(pushProvisioningActivity2.LL, new InterfaceC834580Woa<String>() { // from class: X.0Wrp
                            @Override // X.InterfaceC834580Woa
                            public final void LIZ(AbstractC835450Wpz<String> abstractC835450Wpz2) throws Throwable {
                                if (abstractC835450Wpz2.LJIILJJIL()) {
                                    String strLJIIJ2 = abstractC835450Wpz2.LJIIJ();
                                    getClass();
                                    PushProvisioningActivity pushProvisioningActivity3 = pushProvisioningActivity2;
                                    String str2 = strLJIIJ;
                                    pushProvisioningActivity3.LLILZ.getClass();
                                    final C836600Wrq c836600Wrq = new C836600Wrq(pushProvisioningActivity3, strLJIIJ2, str2);
                                    C836620Wrs c836620Wrs2 = pushProvisioningActivity3.LLIZ;
                                    final PushProvisioningEphemeralKeyProvider pushProvisioningEphemeralKeyProvider = pushProvisioningActivity3.LLILLJJLI;
                                    final C836630Wrt c836630Wrt = pushProvisioningActivity3.LLILZ;
                                    c836620Wrs2.getClass();
                                    final WeakReference weakReference = new WeakReference(pushProvisioningActivity3);
                                    C0WP3.LIZJ(new Runnable() { // from class: X.0Wrn
                                        public final /* synthetic */ String LLILLJJLI = "2019-09-09";

                                        public final void LIZ() throws Throwable {
                                            try {
                                                pushProvisioningEphemeralKeyProvider.Cz(this.LLILLJJLI, c836600Wrq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                getClass();
                                                PushProvisioningActivity pushProvisioningActivity4 = (PushProvisioningActivity) weakReference.get();
                                                if (pushProvisioningActivity4 != null) {
                                                    EnumC836640Wru enumC836640Wru2 = EnumC836640Wru.EPHEMERAL_KEY_ERROR;
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("Error retrieving the ephemeral key: ");
                                                    sbLIZ.append(th.getMessage());
                                                    pushProvisioningActivity4.LLLLZIL(enumC836640Wru2, C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                            }
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("PushProvisioningActivity$f@5a66.a$1");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("PushProvisioningActivity$f@5a66.a$1");
                                        }
                                    });
                                    return;
                                }
                                pushProvisioningActivity2.LLLLZIL(EnumC836640Wru.NO_STABLE_HARDWARE_ID, "Could not retrieve a stable hardware ID for this device");
                            }
                        });
                        return;
                    }
                    int statusCode = ((C0W4V) abstractC835450Wpz.LJIIIZ()).getStatusCode();
                    C836630Wrt c836630Wrt = this.LL.LLILZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("retrieveActiveWalletId - Got status code ");
                    sbLIZ.append(statusCode);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c836630Wrt.getClass();
                    if (statusCode == 15002) {
                        pushProvisioningActivity = this.LL;
                        enumC836640Wru = EnumC836640Wru.NO_ACTIVE_WALLET_FOUND;
                        str = "Could not find an active wallet";
                    } else {
                        if (statusCode != 15009) {
                            return;
                        }
                        pushProvisioningActivity = this.LL;
                        enumC836640Wru = EnumC836640Wru.TAP_AND_PAY_UNAVAILABLE;
                        str = "'Tap and pay' API unavailable within Google services. Check that your app ID has been whitelisted by Google.";
                    }
                    pushProvisioningActivity.LLLLZIL(enumC836640Wru, str);
                }
            });
            return;
        }
        LLLLZIL(EnumC836640Wru.EPHEMERAL_KEY_ERROR, "No key provider passed to activity");
    }

    public static String LLLLZI(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public final void LLLLZIL(EnumC836640Wru enumC836640Wru, String str) throws Throwable {
        C836630Wrt c836630Wrt = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed with error ");
        sbLIZ.append(enumC836640Wru);
        sbLIZ.append(" message:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c836630Wrt.getClass();
        Intent intent = new Intent();
        intent.putExtra("errorCode", enumC836640Wru);
        intent.putExtra("errorMessage", str);
        C2204961BRm.LLJJIJIL(500, intent, this, new C0WZX("dzBzEhEuTcPMUBkgSxaWaWVa6kxtPtu1IJrsJoXuv+eVM69+C65Gsqsd5MKn4blJ4SQsj3wd8+aXWUFJ", null));
        finish();
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 7000) {
            C836630Wrt c836630Wrt = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityResult - received result code ");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            c836630Wrt.getClass();
            if (i2 == 0) {
                LLLLZIL(EnumC836640Wru.USER_CANCELED, "User canceled the tokenization");
                return;
            }
            if (i2 == -1) {
                getClass();
                try {
                    stringExtra = intent.getStringExtra("extra_issuer_token_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                getClass();
                Intent intent2 = new Intent();
                intent2.putExtra("cardTokenId", stringExtra);
                C2204961BRm.LLJJIJIL(-1, intent2, this, new C0WZX("dzBzEhEuTcPMUBkgSxaWaWVa6kxtPtu1IJrsJoXuv+eVM69+C65Gsqsd5MKn4blJ4SQsj3wd8+aXWUFJ", null));
                finish();
                return;
            }
            C836630Wrt c836630Wrt2 = this.LLILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onActivityResult - received unexpected result code after pushTokenize ");
            sbLIZ2.append(i2);
            C2188811AlT.LIZIZ(sbLIZ2);
            c836630Wrt2.getClass();
            LLLLZIL(EnumC836640Wru.UNKNOWN_ERROR, "Something went wrong while tokenizing");
            return;
        }
        C836630Wrt c836630Wrt3 = this.LLILZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onActivityResult - received unexpected request code ");
        sbLIZ3.append(i);
        C2188811AlT.LIZIZ(sbLIZ3);
        c836630Wrt3.getClass();
    }

    public static void LLLLZLL(final PushProvisioningActivity pushProvisioningActivity, String str, String str2, c cVar) throws Throwable {
        pushProvisioningActivity.LLILZ.getClass();
        try {
            C0XLP c0xlp = new C0XLP();
            c0xlp.LJIIJJI("https");
            c0xlp.LJFF("api.stripe.com");
            c0xlp.LIZIZ("v1");
            c0xlp.LIZIZ("issuing");
            c0xlp.LIZIZ("cards");
            c0xlp.LIZIZ(cVar.a);
            c0xlp.LIZIZ("push_provisioning_details");
            c0xlp.LIZ("android[wallet_account_id]", str2);
            c0xlp.LIZ("android[device_id]", str);
            c0xlp.LIZ("expand[]", "card");
            c0xlp.LIZ("expand[]", "cardholder");
            C0XLQ c0xlqLIZLLL = c0xlp.LIZLLL();
            pushProvisioningActivity.LLILZ.getClass();
            C0X33 c0x33 = new C0X33();
            c0x33.LJIIIIZZ(c0xlqLIZLLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bearer ");
            sbLIZ.append(cVar.g);
            c0x33.LIZLLL.LJ("Authorization", C2188811AlT.LIZIZ(sbLIZ));
            c0x33.LIZLLL.LJ("Stripe-Version", "2019-09-09");
            c0x33.LIZLLL.LJ("Content-Type", "application/x-www-form-urlencoded");
            c0x33.LIZLLL("GET", null);
            Request requestLIZIZ = c0x33.LIZIZ();
            C836690Wrz c836690Wrz = pushProvisioningActivity.LLIZLLLIL;
            InterfaceC1495610p1T interfaceC1495610p1T = new InterfaceC1495610p1T() { // from class: X.0Wrv
                @Override // X.InterfaceC1495610p1T
                public final void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) throws Throwable {
                    PushProvisioningActivity pushProvisioningActivity2 = this.LIZ;
                    EnumC836640Wru enumC836640Wru = EnumC836640Wru.PUSH_PROVISIONING_ENCRYPTED_PAYLOAD_ERROR;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Could not call Stripe server to retrieve push provisioning details - ");
                    sbLIZ2.append(iOException.getMessage());
                    pushProvisioningActivity2.LLLLZIL(enumC836640Wru, C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.InterfaceC1495610p1T
                public final void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) throws Throwable {
                    String strString = c0xly.LLIZ.string();
                    int i = c0xly.LLILLL;
                    if (i != 200) {
                        PushProvisioningActivity pushProvisioningActivity2 = this.LIZ;
                        EnumC836640Wru enumC836640Wru = EnumC836640Wru.PUSH_PROVISIONING_ENCRYPTED_PAYLOAD_ERROR;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Stripe servers responded with non-200 - code: ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", response:");
                        sbLIZ2.append(strString);
                        pushProvisioningActivity2.LLLLZIL(enumC836640Wru, C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(strString);
                        String strLLLLZI = PushProvisioningActivity.LLLLZI("contents", jSONObject);
                        if (strLLLLZI == null) {
                            this.LIZ.LLLLZIL(EnumC836640Wru.PUSH_PROVISIONING_ENCRYPTED_PAYLOAD_ERROR, "Stripe servers replied with non-valid JSON - no contents");
                            return;
                        }
                        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "card");
                        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "cardholder");
                        JSONObject jSONObject4 = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject3, "billing"), "address");
                        String strLLLLZI2 = PushProvisioningActivity.LLLLZI("line1", jSONObject4);
                        String strLLLLZI3 = PushProvisioningActivity.LLLLZI("line2", jSONObject4);
                        String strLLLLZI4 = PushProvisioningActivity.LLLLZI("city", jSONObject4);
                        String strLLLLZI5 = PushProvisioningActivity.LLLLZI("state", jSONObject4);
                        String strLLLLZI6 = PushProvisioningActivity.LLLLZI("postal_code", jSONObject4);
                        String strLLLLZI7 = PushProvisioningActivity.LLLLZI("country", jSONObject4);
                        String strLLLLZI8 = PushProvisioningActivity.LLLLZI("name", jSONObject3);
                        String strLLLLZI9 = PushProvisioningActivity.LLLLZI("phone_number", jSONObject3);
                        String strLLLLZI10 = PushProvisioningActivity.LLLLZI("last4", jSONObject2);
                        String strLLLLZI11 = PushProvisioningActivity.LLLLZI(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, jSONObject2);
                        boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject2, "livemode");
                        String lowerCase = JSONObjectProtectorUtils.getString(jSONObject2, "brand").toLowerCase();
                        if (!"canceled".equals(strLLLLZI11) && !"lost".equals(strLLLLZI11) && !"stolen".equals(strLLLLZI11)) {
                            if (!z) {
                                this.LIZ.LLLLZIL(EnumC836640Wru.CARD_TESTMODE, "Card is a testmode card. Only livemode cards can be added to Google Pay.");
                                return;
                            } else {
                                getClass();
                                PushProvisioningActivity.LLLLZLLIL(this.LIZ, strLLLLZI, strLLLLZI2, strLLLLZI3, strLLLLZI4, strLLLLZI5, strLLLLZI6, strLLLLZI7, strLLLLZI8, strLLLLZI9, strLLLLZI10, lowerCase);
                                return;
                            }
                        }
                        this.LIZ.LLLLZIL(EnumC836640Wru.CARD_CANCELED, "Card has been canceled and cannot be provisioned");
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LLLLZIL(EnumC836640Wru.PUSH_PROVISIONING_ENCRYPTED_PAYLOAD_ERROR, "Stripe servers replied with non-valid JSON - " + e.getMessage());
                    }
                }
            };
            c836690Wrz.getClass();
            C2204961BRm.i0(C1495500p1I.LIZJ(new C1495520p1K(), requestLIZIZ, false), interfaceC1495610p1T, new C0WZX("dzBzEhEuTcPMUBkgSxaWaWVa6kxtPtu1IJrsJoXuv+eVM69+C65Gsqsd5MKn4blJ4SQsj3wd8+aXWUFJ", null));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC836640Wru enumC836640Wru = EnumC836640Wru.PUSH_PROVISIONING_ENCRYPTED_PAYLOAD_ERROR;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Could not call Stripe server to retrieve push provisioning details - ");
            sbLIZ2.append(e.getMessage());
            pushProvisioningActivity.LLLLZIL(enumC836640Wru, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LLLLZLLIL(final PushProvisioningActivity pushProvisioningActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        int i;
        pushProvisioningActivity.LLILZ.getClass();
        C836680Wry c836680Wry = new C836680Wry();
        c836680Wry.LIZIZ = str2;
        c836680Wry.LIZJ = str3;
        c836680Wry.LJFF = str7;
        c836680Wry.LJ = str4;
        c836680Wry.LIZLLL = str5;
        c836680Wry.LJI = str6;
        c836680Wry.LIZ = str8;
        c836680Wry.LJII = str9;
        UserAddress userAddress = new UserAddress(c836680Wry.LIZ, c836680Wry.LIZIZ, c836680Wry.LIZJ, null, null, null, c836680Wry.LIZLLL, c836680Wry.LJ, c836680Wry.LJFF, c836680Wry.LJI, null, c836680Wry.LJII, false, null, null);
        if (str11.equals("mastercard")) {
            i = 3;
        } else {
            i = 4;
        }
        C836670Wrx c836670Wrx = new C836670Wrx();
        c836670Wrx.LIZJ = str.getBytes();
        c836670Wrx.LIZ = i;
        c836670Wrx.LIZIZ = i;
        c836670Wrx.LIZLLL = str10;
        c836670Wrx.LJ = pushProvisioningActivity.LLILLL;
        c836670Wrx.LJFF = userAddress;
        final PushTokenizeRequest pushTokenizeRequest = new PushTokenizeRequest(c836670Wrx.LIZ, c836670Wrx.LIZIZ, c836670Wrx.LIZJ, c836670Wrx.LIZLLL, c836670Wrx.LJ, c836670Wrx.LJFF, false, new int[0], null);
        C836700Ws0 c836700Ws0 = pushProvisioningActivity.LLJ;
        C833200WmM c833200WmM = pushProvisioningActivity.LL;
        c836700Ws0.getClass();
        c833200WmM.getClass();
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0WmQ
            public final /* synthetic */ int LIZJ = 7000;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                PushTokenizeRequest pushTokenizeRequest2 = pushTokenizeRequest;
                Activity activity = pushProvisioningActivity;
                int i2 = this.LIZJ;
                C833260WmS c833260WmS = (C833260WmS) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                C0WY1 c0wy1 = new C0WY1(activity, i2);
                Parcel parcelLJJJZ = c833260WmS.LJJJZ();
                if (pushTokenizeRequest2 == null) {
                    parcelLJJJZ.writeInt(0);
                } else {
                    parcelLJJJZ.writeInt(1);
                    pushTokenizeRequest2.writeToParcel(parcelLJJJZ, 0);
                }
                parcelLJJJZ.writeStrongBinder(c0wy1);
                c833260WmS.LLILLIZIL(28, parcelLJJJZ);
            }
        };
        c832510WlF.LIZLLL = 2106;
        c833200WmM.doRead(c832510WlF.LIZ());
    }
}
