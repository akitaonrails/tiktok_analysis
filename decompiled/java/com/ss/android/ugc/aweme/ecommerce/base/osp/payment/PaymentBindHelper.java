package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AnonymousClass0317;
import X.C034S;
import X.C03WD;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09CT;
import X.C1120604Zw;
import X.C13LQ;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C189200o6;
import X.C18ZQ;
import X.C19EG;
import X.C1AQS;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C2341109Fh;
import X.C834803Ny;
import X.C864803Zm;
import X.C897503f3;
import X.C898203fA;
import X.C902203fo;
import X.C914303hl;
import X.C921103ir;
import X.EnumC878703c1;
import X.EnumC900103fT;
import X.InterfaceC1059280dfi;
import X.InterfaceC1364105Vn;
import X.InterfaceC919403ia;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindingPollingManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS150S1100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBindHelper {
    public static final PaymentBindHelper LIZ = new PaymentBindHelper();
    public static C898203fA LIZIZ;
    public static String LIZJ;
    public static Runnable LIZLLL;
    public static String LJ;
    public static WeakReference<Context> LJFF;

    public static Runnable LIZJ() {
        return LIZLLL;
    }

    public static final class VenmoBindResult {

        @C09CT("bind_result")
        public final boolean bindResult;

        public VenmoBindResult(boolean z) {
            this.bindResult = z;
        }
    }

    public static String LIZIZ(ExceptionUX exceptionUX) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        DialogContent dialogContent = exceptionUX.dialogContent;
        if (dialogContent == null || (str = dialogContent.daInfo) == null || (mapLJIIJ = C1741890vQh.LJIIJ(str)) == null || (obj = mapLJIIJ.get("error_code")) == null) {
            return null;
        }
        return obj.toString();
    }

    public static void LJIIJJI(String str) {
        LJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.C897703f5 r34, X.InterfaceC1364105Vn<? super java.lang.Boolean> r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper.LJIIL(X.03f5, X.05Vn):java.lang.Object");
    }

    public static List LIZ(String str, String str2, EnterParams enterParams) {
        String strLIZIZ;
        boolean z;
        String strLIZIZ2;
        PaymentMethodsData paymentMethodsData;
        if (C897503f3.LJI(enterParams)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTS_Entrance_");
            sbLIZ.append(EnumC878703c1.CHANGE_CARD.getValue());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (!Intrinsics.LJFF(str, "orderdetail") && !Intrinsics.LJFF(str, "orderlist")) {
            strLIZIZ = "TTS_Entrance_osp";
        } else {
            strLIZIZ = "TTS_Entrance_second_payment";
        }
        if (str2 != null && C864803Zm.LIZIZ.contains(str2)) {
            strLIZIZ2 = "TTS_direct_debit";
        } else {
            if (enterParams != null && (paymentMethodsData = enterParams.paymentData) != null && paymentMethodsData.LJJII()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TTS_");
                sbLIZ2.append(EnumC900103fT.SNS_BIND.getValue());
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (enterParams != null && enterParams.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("TTS_");
                sbLIZ3.append(EnumC900103fT.BIDDING_BIND.getValue());
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ2 = "TTS_bind_only";
            }
        }
        return C1697810uHb.LJIIJJI(strLIZIZ, strLIZIZ2);
    }

    public static Object LJIIIIZZ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C914303hl.LIZ.getClass();
        String str3 = C914303hl.LJ;
        C921103ir.LIZ.getClass();
        C921103ir.LJI(str2);
        PaymentBindingPollingManager paymentBindingPollingManager = new PaymentBindingPollingManager(str, str3, false, "order_submit", new InterfaceC919403ia() { // from class: X.03fI
            @Override // X.InterfaceC919403ia
            public final void LIZIZ() {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("afterPaymentBindRetain: polling success");
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }

            @Override // X.InterfaceC919403ia
            public final void LIZJ() {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("afterPaymentBindRetain: polling failed");
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }

            @Override // X.InterfaceC919403ia
            public final void LIZ(String str4, String str5, String str6) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("afterPaymentBindRetain: polling error code=");
                sbLIZ.append(str4);
                sbLIZ.append(" msg=");
                sbLIZ.append(str5);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }
        });
        c2252611DEt.LJJII(AFwS228S0000000_1.get$arr$(155));
        paymentBindingPollingManager.LIZ();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LJIIIZ(String str, CommuteType commuteType, String str2) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        Activity activity;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2;
        boolean z2;
        String str3;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("refreshPayment");
        String name = null;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1747807002) {
                if (str.equals("ordersubmit")) {
                    MiniOspFragment.LLJJJJ.getClass();
                    if (!MiniOspFragment.LLJJL) {
                        str3 = "ec_payment_change";
                    } else {
                        str3 = "ec_payment_change_mini_osp";
                    }
                    ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ(str3, "{}");
                }
            } else {
                str3 = iHashCode != -390864660 ? "ec_payment_page_refresh_data" : "ec_payment_page_refresh_data";
                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ(str3, "{}");
            }
        }
        if (commuteType == CommuteType.BROWSER_TO_APP && Intrinsics.LJFF(str2, "pm_pi_ew_venmo_c_d")) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_tts_bind_poll_close_top_activity", true) || commuteType == CommuteType.APP_NO_FILTER) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_finish_bind_web_switch", true)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IActivityStackDependencyService.class.getName();
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 != null) {
                    name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            activity = (Activity) C13LQ.LJJJJIZL(((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2).getActivityStack());
            if (!(activity instanceof SparkActivity) || !(activity instanceof C19EG)) {
                return;
            }
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name3 = IActivityStackDependencyService.class.getName();
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            Activity[] activityStack = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getActivityStack();
            int length = activityStack.length;
            if ((C13LQ.LJJJJIZL(activityStack) instanceof InterfaceC1059280dfi) && (C13LQ.LJJJJIZL(activityStack) instanceof C19EG)) {
                activity = (Activity) C13LQ.LJJJJIZL(activityStack);
            } else {
                if (length <= 1) {
                    return;
                }
                activity = activityStack[length - 2];
                if (!(activity instanceof InterfaceC1059280dfi) || !(activity instanceof C19EG)) {
                    return;
                }
            }
        }
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public static void LIZLLL(boolean z, EnterParams enterParams, String str, CommuteType commuteType, String str2) {
        if (C897503f3.LJI(enterParams)) {
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_sns_bind_refresh", C1741890vQh.LJIIIIZZ(new VenmoBindResult(z)));
        } else {
            LJIIIZ(str, commuteType, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.03fA] */
    public static void LJII(final CommuteType commuteType, final String str, final String str2, final String str3, final String str4, final String str5) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2;
        boolean z;
        String name;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("pollBindResult");
        String name2 = null;
        boolean z2 = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name3 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).removeAppBackGroundListener(LIZIZ);
        LIZIZ = new C18ZQ() { // from class: X.03fA
            @Override // X.C18ZQ
            public final void onAppBackground() {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("onAppBackground");
                C03SE c03se = C03PI.LJIJI;
                AwS150S1100000_1 awS150S1100000_1 = new AwS150S1100000_1(commuteType, str2, 4);
                c03se.getClass();
                C03SE.LJJIFFI(awS150S1100000_1);
            }

            @Override // X.C18ZQ
            public final void onAppForeground() {
                AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3;
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("onAppForeground");
                C03SE c03se = C03PI.LJIJI;
                AwS150S1100000_1 awS150S1100000_1 = new AwS150S1100000_1(commuteType, str2, 5);
                c03se.getClass();
                C03SE.LJJIFFI(awS150S1100000_1);
                if (Intrinsics.LJFF(str, "ordersubmit") || Intrinsics.LJFF(str, "orderdetail") || Intrinsics.LJFF(str, "orderlist")) {
                    String str6 = str2;
                    String str7 = str3;
                    Boolean bool = Boolean.FALSE;
                    C921103ir c921103ir = C921103ir.LIZ;
                    String str8 = str;
                    c921103ir.getClass();
                    C921103ir.LJI(str8);
                    final String str9 = str;
                    final CommuteType commuteType2 = commuteType;
                    final String str10 = str4;
                    final String str11 = str5;
                    new PaymentBindingPollingManager(str6, str7, bool, "order_submit", new InterfaceC919403ia() { // from class: X.03fF
                        @Override // X.InterfaceC919403ia
                        public final void LIZ(String str12, String str13, String str14) {
                        }

                        @Override // X.InterfaceC919403ia
                        public final void LIZIZ() {
                            Context context;
                            Activity activityLIZ;
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LJ("onQueryBindStatusSuccess");
                            PaymentBindHelper.LIZ.getClass();
                            WeakReference<Context> weakReference = PaymentBindHelper.LJFF;
                            if (weakReference != null && (context = weakReference.get()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                                String str12 = str11;
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                String string = activityLIZ.getString(2131840242);
                                if (str12 == null) {
                                    str12 = "";
                                }
                                c1389890mGx.LJIIJ(u.LJJIFFI(string, "{{payment_method}}", str12, false));
                                c1389890mGx.LJIIJJI();
                            }
                            PaymentBindHelper.LJIIIZ(str9, commuteType2, str10);
                        }

                        @Override // X.InterfaceC919403ia
                        public final void LIZJ() {
                            Context context;
                            Activity activityLIZ;
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LJ("onQueryBindStatusFailed");
                            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
                            String str12 = str9;
                            CommuteType commuteType3 = commuteType2;
                            String str13 = str10;
                            paymentBindHelper.getClass();
                            PaymentBindHelper.LJIIIZ(str12, commuteType3, str13);
                            WeakReference<Context> weakReference = PaymentBindHelper.LJFF;
                            if (weakReference == null || (context = weakReference.get()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
                                return;
                            }
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIJ(activityLIZ.getString(2131840241));
                            c1389890mGx.LJIIJJI();
                        }
                    }).LIZ();
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3 = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3 != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                }
                ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin3).removeAppBackGroundListener(this);
                PaymentBindHelper.LIZIZ = null;
                PaymentBindHelper.LIZ.getClass();
                PaymentBindHelper.LIZLLL = null;
                PaymentBindHelper.LJ = null;
            }
        };
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 == null) {
                z2 = false;
            }
            String name4 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 != null) {
                name2 = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2).addNonWeakAppBackGroundListener(LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(android.content.Context r17, java.lang.String r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.gson.n r23, X.InterfaceC1364105Vn<? super java.lang.Boolean> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper.LJIIJ(android.content.Context, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.google.gson.n, X.05Vn):java.lang.Object");
    }

    public static void LJ(Context context, String str, String str2, HashMap map, String str3, String str4, String str5, String str6, String str7) {
        Object c098200Yq;
        Object obj;
        Integer num;
        String string;
        Object obj2;
        String str8;
        String str9 = str2;
        if (str4 != null && str4.length() != 0 && (Intrinsics.LJFF(str4, "pm_pi_ins_pipobnpl_c_d") || Intrinsics.LJFF(str4, "pm_pi_ew_pipocredit_c_d") || Intrinsics.LJFF(str4, "pm_pi_ew_pipowallet_c_d"))) {
            boolean z = C902203fo.LIZ().enableTrackId;
            boolean z2 = C902203fo.LIZ().enableRenderingNum;
            boolean z3 = C902203fo.LIZ().enableBtmToken;
            boolean z4 = C902203fo.LIZ().enableTenure;
            if (z || z2 || z3 || z4 || ((str6 != null && str6.length() != 0) || (str7 != null && str7.length() != 0))) {
                try {
                    Uri.Builder builderBuildUpon = UriProtector.parse(str9).buildUpon();
                    if (z) {
                        if (map == null) {
                            obj2 = null;
                        } else {
                            obj2 = map.get("cashier_original_track_id");
                        }
                        if ((obj2 instanceof String) && (str8 = (String) obj2) != null && str8.length() != 0) {
                            builderBuildUpon.appendQueryParameter("track_id", str8);
                        } else {
                            C03WD.LJI("cashier_to_bnpl_landing", "track_id is null or empty, skip append", null);
                        }
                    }
                    if (z2) {
                        if (map == null) {
                            obj = null;
                        } else {
                            obj = map.get("rendering_num");
                        }
                        if ((obj instanceof Integer) && (num = (Integer) obj) != null && (string = num.toString()) != null && string.length() != 0) {
                            builderBuildUpon.appendQueryParameter("rendering_num", string);
                        } else {
                            C03WD.LJI("cashier_to_bnpl_landing", "rendering_num is null or empty, skip append", null);
                        }
                    }
                    if (z3) {
                        if (str3 != null && str3.length() != 0) {
                            builderBuildUpon.appendQueryParameter("source_btm_token", str3);
                        } else {
                            C03WD.LJI("cashier_to_bnpl_landing", "btm_token is null or empty, skip append", null);
                        }
                    }
                    if (z4) {
                        if (str5 != null && str5.length() != 0) {
                            builderBuildUpon.appendQueryParameter("tenure", str5);
                        } else {
                            C03WD.LJI("cashier_to_bnpl_landing", "tenure is null or empty, skip append", null);
                        }
                    }
                    if (str6 != null && str6.length() > 0) {
                        builderBuildUpon.appendQueryParameter("payment_promotion", str6);
                    }
                    if (str7 != null && str7.length() > 0) {
                        builderBuildUpon.appendQueryParameter("interest_fee_promotion", str7);
                    }
                    c098200Yq = builderBuildUpon.build().toString();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("buildSchemaWithBnplTrack failed, fallback to origin, error=");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C03WD.LJI("cashier_to_bnpl_landing", C2188811AlT.LIZIZ(sbLIZ), null);
                    c098200Yq = str9;
                }
                str9 = (String) c098200Yq;
            }
        }
        C834803Ny.LIZ("open_bind_url", null, null, null, null, null, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, str9, null, null, null, null, null, null, null, null, null, null, null, null, null, -100663364, 255);
        LIZJ = str;
        SmartRouter.buildRoute(context, str9).open();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper r19, android.content.Context r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r24, java.lang.String r25, final java.lang.String r26, java.lang.String r27, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r28, X.InterfaceC497601wk r29, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r30, boolean r31, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r32, X.InterfaceC877803bs r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper.LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, X.01wk, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams, X.03bs, java.lang.String, int):void");
    }
}
