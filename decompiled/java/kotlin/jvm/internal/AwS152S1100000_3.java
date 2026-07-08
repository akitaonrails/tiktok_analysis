package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C05XL;
import X.C08AH;
import X.C08HM;
import X.C08KW;
import X.C099F;
import X.C09AY;
import X.C0LX3;
import X.C0PEM;
import X.C0VSJ;
import X.C1388190mED;
import X.C1397950mTx;
import X.C1844400y62;
import X.C1897250zTH;
import X.C1906580ziK;
import X.C1AF0;
import X.C201955140j;
import X.C2095108Ir;
import X.C2124208Tw;
import X.C2188811AlT;
import X.C2214011Bl1;
import X.C2241708qN;
import X.C23250099c;
import X.C786410Ut5;
import X.C817503Hh;
import X.C844470XAv;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.memory.profiler.core.BridgeMessage;
import com.ss.android.ugc.aweme.memory.profiler.core.SocketBridge;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.tts.oecverify.BdTuring;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AwS152S1100000_3 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS152S1100000_3 awS152S1100000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data ready before view bind uniqueId=");
        sbLIZ.append(awS152S1100000_3.s0);
        sbLIZ.append(" requestKey=");
        sbLIZ.append(((C2124208Tw) awS152S1100000_3.l1).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS152S1100000_3 awS152S1100000_3) {
        LocalServerSocket localServerSocket;
        LocalSocket localSocketAccept;
        Activity activityLIZ;
        String line;
        String packageName = ((Application) awS152S1100000_3.l1).getPackageName();
        if (packageName == null) {
            packageName = "unknown";
        }
        String strConcat = packageName.concat("_memory");
        while (SocketBridge.running) {
            try {
                try {
                    SocketBridge.serverSocket = new LocalServerSocket(strConcat);
                    while (SocketBridge.running && (localServerSocket = SocketBridge.serverSocket) != null && (localSocketAccept = localServerSocket.accept()) != null) {
                        SocketBridge.clientSocket = localSocketAccept;
                        SocketBridge.outputStream = localSocketAccept.getOutputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(localSocketAccept.getInputStream()));
                        n nVar = new n();
                        String str = awS152S1100000_3.s0;
                        Application application = (Application) awS152S1100000_3.l1;
                        nVar.LJJIII(Long.valueOf(System.currentTimeMillis()), "ts");
                        nVar.LJJIIJ("version", str);
                        String packageName2 = application.getPackageName();
                        if (packageName2 == null) {
                            packageName2 = "unknown";
                        }
                        nVar.LJJIIJ("packageName", packageName2);
                        C844470XAv.LIZ.getClass();
                        nVar.LJJIIJ("channel", C844470XAv.LJIILL);
                        nVar.LJJII(Boolean.FALSE, "debug");
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (!(abstractC1387200mCcLIZIZ instanceof C1844400y62)) {
                            if (abstractC1387200mCcLIZIZ instanceof C1397950mTx) {
                                nVar.LJJIIJ("currentPage", ((C1397950mTx) abstractC1387200mCcLIZIZ).LIZLLL.getClass().getName());
                            }
                        } else {
                            nVar.LJJIIJ("currentPage", ((C1844400y62) abstractC1387200mCcLIZIZ).LIZLLL.getClass().getName());
                            Activity activityLIZIZ = ((C1844400y62) abstractC1387200mCcLIZIZ).LIZIZ();
                            if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                                nVar.LJJIIJ("hostActivity", activityLIZ.getClass().getName());
                                nVar.LJJIIJ("hostActivityId", C2095108Ir.LIZ(activityLIZ));
                            }
                        }
                        SocketBridge.INSTANCE.sendMessage(new BridgeMessage(0, 0, null, "server_connected", nVar));
                        while (SocketBridge.running && (line = bufferedReader.readLine()) != null) {
                            try {
                                SocketBridge.INSTANCE.handleMessage(line);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        SocketBridge socketBridge = SocketBridge.INSTANCE;
                        socketBridge.stopAllHandlers();
                        socketBridge.closeClientSession();
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.getMessage();
                }
                SocketBridge.INSTANCE.closeServerSocket();
                if (SocketBridge.running) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                SocketBridge.INSTANCE.closeServerSocket();
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS152S1100000_3 awS152S1100000_3) {
        boolean z;
        PackageInfo packageInfoY3;
        boolean z2 = false;
        if (((Context) awS152S1100000_3.l1) != null) {
            String str = awS152S1100000_3.s0;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    packageInfoY3 = C786410Ut5.Y3(((Context) awS152S1100000_3.l1).getPackageManager(), awS152S1100000_3.s0, 0);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    packageInfoY3 = null;
                }
                if (packageInfoY3 != null) {
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$11(AwS152S1100000_3 awS152S1100000_3) {
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS152S1100000_3.l1, awS152S1100000_3.s0);
    }

    public static final Object invoke$12(AwS152S1100000_3 awS152S1100000_3) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String str = awS152S1100000_3.s0;
        concurrentHashMap.put(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS152S1100000_3.l1, str));
        return concurrentHashMap;
    }

    public static final Object invoke$13(AwS152S1100000_3 awS152S1100000_3) {
        if (awS152S1100000_3.s0 != null && ((C1897250zTH) awS152S1100000_3.l1).LJIIIIZZ() != null) {
            String strLJIIIIZZ = ((C1897250zTH) awS152S1100000_3.l1).LJIIIIZZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C08HM.LIZJ(awS152S1100000_3.s0));
            sbLIZ.append(".png");
            C0VSJ c0vsj = new C0VSJ(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists() && c0vsj.length() > 0) {
                C1897250zTH c1897250zTH = (C1897250zTH) awS152S1100000_3.l1;
                new AwS546S0100000_2(c0vsj, 1150);
                c1897250zTH.getClass();
                return c0vsj.getAbsolutePath();
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AwS152S1100000_3 awS152S1100000_3) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2241708qN((BaseVerifyFragment) awS152S1100000_3.l1, awS152S1100000_3.s0, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS152S1100000_3 awS152S1100000_3) {
        String strOptString;
        String strOptString2 = null;
        if (C2214011Bl1.LIZLLL.contains(awS152S1100000_3.s0)) {
            JSONObject jSONObject = (JSONObject) awS152S1100000_3.l1;
            if (jSONObject != null) {
                strOptString2 = jSONObject.optString("enter_from");
            }
            if (Intrinsics.LJFF(strOptString2, "homepage_hot")) {
                C2214011Bl1 c2214011Bl1 = C2214011Bl1.LIZ;
                C08KW c08kw = new C08KW(awS152S1100000_3.s0, (JSONObject) awS152S1100000_3.l1);
                c2214011Bl1.getClass();
                C2214011Bl1.LIZIZ(c08kw);
            }
        } else if (C2214011Bl1.LJ.contains(awS152S1100000_3.s0)) {
            JSONObject jSONObject2 = (JSONObject) awS152S1100000_3.l1;
            if (jSONObject2 != null) {
                strOptString = jSONObject2.optString("enter_from");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "homepage_hot")) {
                JSONObject jSONObject3 = (JSONObject) awS152S1100000_3.l1;
                if (jSONObject3 != null) {
                    strOptString2 = jSONObject3.optString("from_page");
                }
                if (Intrinsics.LJFF(strOptString2, "graphic_detail")) {
                    C2214011Bl1 c2214011Bl12 = C2214011Bl1.LIZ;
                    C08KW c08kw2 = new C08KW(awS152S1100000_3.s0, (JSONObject) awS152S1100000_3.l1);
                    c2214011Bl12.getClass();
                    C2214011Bl1.LIZIZ(c08kw2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS152S1100000_3 awS152S1100000_3) {
        String strOptString;
        if (C2214011Bl1.LIZJ.contains(awS152S1100000_3.s0)) {
            JSONObject jSONObject = (JSONObject) awS152S1100000_3.l1;
            if (jSONObject != null) {
                strOptString = jSONObject.optString("event_type");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "homepage_hot")) {
                C2214011Bl1 c2214011Bl1 = C2214011Bl1.LIZ;
                C08KW c08kw = new C08KW(awS152S1100000_3.s0, (JSONObject) awS152S1100000_3.l1);
                c2214011Bl1.getClass();
                C2214011Bl1.LIZIZ(c08kw);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS152S1100000_3 awS152S1100000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store update skipped reason=closed uniqueId=");
        sbLIZ.append(awS152S1100000_3.s0);
        sbLIZ.append(" requestKey=");
        sbLIZ.append(((C2124208Tw) awS152S1100000_3.l1).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS152S1100000_3 awS152S1100000_3) {
        try {
            SmartRoute smartRoute = new SmartRoute(C08AH.LIZ());
            smartRoute.withUrl(awS152S1100000_3.s0);
            smartRoute.open();
            ((Function0) awS152S1100000_3.l1).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS152S1100000_3 awS152S1100000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("put cache from ");
        sbLIZ.append(awS152S1100000_3.s0);
        sbLIZ.append(", size: ");
        sbLIZ.append(((List) awS152S1100000_3.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS152S1100000_3 awS152S1100000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind view uniqueId=");
        sbLIZ.append(awS152S1100000_3.s0);
        sbLIZ.append(" pendingCount=");
        sbLIZ.append(((List) awS152S1100000_3.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS152S1100000_3 awS152S1100000_3) {
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitTaskAwait: task ");
        sbLIZ.append(awS152S1100000_3.s0);
        sbLIZ.append(" persisted, deferred complete");
        C201955140j.LIZLLL(c0lx3, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        C05XL c05xl = (C05XL) awS152S1100000_3.l1;
        Unit unit = Unit.LIZ;
        c05xl.LJIIZILJ(unit);
        return unit;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS152S1100000_3(android.net.Uri r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 11 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS152S1100000_3.<init>(android.net.Uri, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(Application application, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = application;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(BaseVerifyFragment baseVerifyFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = baseVerifyFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(String str, C2124208Tw c2124208Tw, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c2124208Tw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(String str, C099F c099f, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c099f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(String str, C1897250zTH c1897250zTH, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1897250zTH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS152S1100000_3(String str, String str2, List<? extends Aweme> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS152S1100000_3(String str, String str2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1100000_3(String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
    }
}
