package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C09CT;
import X.C0HTI;
import X.C0WZX;
import X.C1077404Jg;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11S5;
import X.C1391820mK4;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C1741890vQh;
import X.C1976907ol;
import X.C19EG;
import X.C1AQS;
import X.C2204961BRm;
import X.C2371409Qy;
import X.C452501pT;
import X.C907003ga;
import X.C985403tE;
import X.InterfaceC1059280dfi;
import X.InterfaceC1164530gPT;
import X.InterfaceC907103gb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentInterceptor implements IInterceptor, InterfaceC1164530gPT {
    public int LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1482));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static final class BindResultEvent {

        @C09CT("bind_result_url")
        public final String bindResultUrl;

        public BindResultEvent(String str) {
            this.bindResultUrl = str;
        }
    }

    public static final class CashierParams {

        @C09CT("cashier_id")
        public final String cashierId;

        public CashierParams(String str) {
            this.cashierId = str;
        }
    }

    public static C19EG LIZLLL(boolean z) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        boolean zLIZ = false;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        Activity[] activityStack = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getActivityStack();
        int length = activityStack.length;
        for (int i = 0; i < activityStack.length; i++) {
        }
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("payment_web_container_close_opt", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (zLIZ) {
            for (int i2 = length - 1; -1 < i2; i2--) {
                Activity activity = activityStack[i2];
                if ((activity instanceof InterfaceC1059280dfi) && (activity instanceof C19EG)) {
                    return (C19EG) activity;
                }
            }
        } else {
            int i3 = z ? length - 1 : length - 2;
            if (length > 1) {
                Activity activity2 = activityStack[i3];
                if ((activity2 instanceof InterfaceC1059280dfi) && (activity2 instanceof C19EG)) {
                    return (C19EG) activity2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0107 A[PHI: r1
      0x0107: PHI (r1v14 java.lang.String) = (r1v3 java.lang.String), (r1v15 java.lang.String) binds: [B:19:0x004c, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C887503dR LJFF(com.bytedance.router.RouteIntent r20) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor.LJFF(com.bytedance.router.RouteIntent):X.03dR");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0107 A[PHI: r1
      0x0107: PHI (r1v17 java.lang.String) = (r1v3 java.lang.String), (r1v18 java.lang.String) binds: [B:19:0x004e, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams LJI(com.bytedance.router.RouteIntent r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor.LJI(com.bytedance.router.RouteIntent):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams");
    }

    public static void LJII(n nVar) {
        String string;
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        if (nVar == null || (string = nVar.toString()) == null) {
            string = "{}";
        }
        iEventCenter.LIZ("ec_send_caisher", string);
    }

    public static void LJIIIZ(Context context) {
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131833066);
            c1397580mTM.LIZ(2131833065);
            C1391820mK4.LIZ(c1397580mTM, R.drawable.b52);
            c1397580mTM.LJIIIIZZ = true;
            C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(12));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static void LJIIJ(Context context) {
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131833176);
            c1397580mTM.LIZ(2131833175);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.vk;
            C1391820mK4.LIZIZ(c1397580mTM, c0hti.LIZ(context));
            c1397580mTM.LJIIIIZZ = true;
            C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(13));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final synchronized void LJIIIIZZ(n nVar) {
        if (this.LL == 2) {
            LJII(nVar);
            this.LLILLJJLI = false;
            this.LL = 0;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "ec");
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYfVY5LEXluc5z+cH4XoyHKn76ndmEYh8qtM+SRzncip7", null));
    }

    public static Object LIZIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static String LIZJ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        String str3;
        if (Intrinsics.LJFF(str, "ec_fetch_caisher")) {
            if (this.LL == 0) {
                C907003ga c907003ga = InterfaceC907103gb.LIZ;
                Boolean bool = Boolean.FALSE;
                c907003ga.getClass();
                C907003ga.LIZ(bool, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1077404Jg(this, 6));
                return;
            }
            this.LLILLJJLI = true;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(CashierParams.class));
                } else {
                    type = new TypeToken<CashierParams>() { // from class: X.03gg
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof CashierParams)) {
                    objFromJson = null;
                }
                CashierParams cashierParams = (CashierParams) objFromJson;
                if (cashierParams != null && (str3 = cashierParams.cashierId) != null) {
                    LJIIIIZZ((n) ((Map) this.LLILLL.getValue()).get(str3));
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0e60 A[Catch: s -> 0x0e87, TRY_ENTER, TryCatch #1 {s -> 0x0e87, blocks: (B:767:0x0e6a, B:768:0x0e74, B:771:0x0e7d, B:766:0x0e60), top: B:806:0x0e58 }] */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x056f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r64, com.bytedance.router.RouteIntent r65) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static final class PayResultEvent {

        @C09CT("enable_sync_trade_success")
        public final boolean enableSyncTradeSuccess;

        @C09CT("error_code")
        public final String errorCode;

        @C09CT("is_interrupted")
        public final String interrupter;

        @C09CT("is_success")
        public final boolean isSuccess;

        @C09CT("mall_ab")
        public final Integer mallAb;

        @C09CT("mall_source")
        public final Object mallSource;

        @C09CT("mall_tab")
        public final Object mallTab;

        @C09CT("middle_page_url")
        public final String middlePageUrl;

        @C09CT("pay_request_id")
        public final String payRequestId;

        @C09CT("pay_result_url")
        public final String payResultUrl;

        @C09CT("pay_type")
        public final String payType;

        @C09CT("pipo_error_action")
        public final String pipoErrorAction;

        @C09CT("should_hide_error")
        public final boolean shouldHideError;

        public PayResultEvent() {
            this(null, false, null, null, null, null, null, null, null, null, false, false, null);
        }

        public PayResultEvent(String str, boolean z, String str2, String str3, String str4, Integer num, Object obj, Object obj2, String str5, String str6, boolean z2, boolean z3, String str7) {
            this.payResultUrl = str;
            this.isSuccess = z;
            this.errorCode = str2;
            this.middlePageUrl = str3;
            this.payRequestId = str4;
            this.mallAb = num;
            this.mallTab = obj;
            this.mallSource = obj2;
            this.payType = str5;
            this.interrupter = str6;
            this.shouldHideError = z2;
            this.enableSyncTradeSuccess = z3;
            this.pipoErrorAction = str7;
        }
    }

    public static final class CommonPayResultEvent {

        @C09CT("enable_sync_trade_success")
        public final Boolean enableSyncTradeSuccess;

        @C09CT("error_code")
        public final String errorCode;

        @C09CT("is_from_deeplink")
        public final Boolean fromDeeplink;

        @C09CT("get_pay_params_from_storage")
        public final Boolean getPayParamsFromStorage;

        @C09CT("is_interrupted")
        public final String interrupter;

        @C09CT("is_pipo_poll")
        public final Boolean isPipoPoll;

        @C09CT("is_user_cancel")
        public final Boolean isUserCancel;

        @C09CT("not_poll")
        public final Boolean notPoll;

        @C09CT("pay_request_id")
        public final String payRequestId;

        @C09CT("pay_route")
        public final String payRoute;

        @C09CT("pay_source")
        public final String paySource;

        @C09CT("pay_type")
        public final String payType;

        @C09CT("payment_status")
        public final String paymentStatus;

        @C09CT("pipo_error_action")
        public final String pipoErrorAction;

        @C09CT("should_hide_error")
        public final Boolean shouldHideError;

        public CommonPayResultEvent(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, Boolean bool3, Boolean bool4, String str8, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.paymentStatus = str;
            this.errorCode = str2;
            this.payType = str3;
            this.payRoute = str4;
            this.payRequestId = str5;
            this.shouldHideError = bool;
            this.enableSyncTradeSuccess = bool2;
            this.pipoErrorAction = str6;
            this.interrupter = str7;
            this.isUserCancel = bool3;
            this.notPoll = bool4;
            this.paySource = str8;
            this.getPayParamsFromStorage = bool5;
            this.fromDeeplink = bool6;
            this.isPipoPoll = bool7;
        }
    }
}
