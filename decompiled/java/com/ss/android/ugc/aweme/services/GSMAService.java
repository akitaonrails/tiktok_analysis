package com.ss.android.ugc.aweme.services;

import X.AbstractC2238408pq;
import X.AbstractC23140094w;
import X.AbstractC343940De4;
import X.AbstractC431340Gvk;
import X.C01GW;
import X.C099A;
import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C0FNV;
import X.C0PEM;
import X.C0XF1;
import X.C0XGR;
import X.C1227904rF;
import X.C1245960iWo;
import X.C1260730iud;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C155000ia;
import X.C1554300qY8;
import X.C1668306g5;
import X.C19EG;
import X.C1C7U;
import X.C1DFH;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C343980De8;
import X.C431300Gvg;
import X.C452501pT;
import X.C786410Ut5;
import X.C851730Xb9;
import X.DialogC20224814Bq;
import X.EnumC852910Xd3;
import X.InterfaceC1238810iLH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1519705xD;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.v2.network.GSMAStatusData;
import com.ss.android.ugc.aweme.account.login.v2.network.GetGSMARedirectUrlData;
import com.ss.android.ugc.aweme.account.login.v2.network.PopupConfig;
import com.ss.android.ugc.aweme.account.login.v2.network.SendGSMACodeData;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.GSMALoadingSheetFragment;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: loaded from: classes20.dex */
public final class GSMAService {
    public static C09AE gsmaStatusJob;
    public static C09AE sendGSMACodeJob;
    public static final GSMAService INSTANCE = new GSMAService();
    public static final C01GW keva$delegate = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(320));
    public static final Map<String, GSMAStatusData> cacheMap = new LinkedHashMap();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$requestGsmaCode$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService", f = "GSMAService.kt", l = {163, 172, 189}, m = "requestGsmaCode")
    public final class C2325821 extends AbstractC23140094w {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C2325821(InterfaceC1364105Vn<? super C2325821> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("GSMAService@d4af.requestGsmaCode$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objRequestGsmaCode = GSMAService.this.requestGsmaCode(null, null, null, null, null, null, this);
            C1C7U.LIZIZ("GSMAService@d4af.requestGsmaCode$1");
            return objRequestGsmaCode;
        }
    }

    public final boolean isGSMAEnabled() {
        GSMALocalCache gSMALocalCache = getGSMALocalCache(null, null);
        return gSMALocalCache.optOutRequired ? gSMALocalCache.userPreference == 1 : gSMALocalCache.userPreference != 2;
    }

    private final Keva getKeva() {
        return (Keva) keva$delegate.getValue();
    }

    public final void cancelJob() {
        C09AE c09ae = gsmaStatusJob;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = sendGSMACodeJob;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
    }

    public final Map<String, String> getGSMAExtraMap() {
        return C2097908Jt.LIZJ(new Pair("is_gsma", "1"));
    }

    public final void removeGSMALocalCache() {
        getKeva().erase("gsma_cache_key");
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$callSendGSMACode$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$callSendGSMACode$1", f = "GSMAService.kt", l = {442, 451, 462}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ String $enterFrom;
        public final /* synthetic */ String $enterMethod;
        public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
        public final /* synthetic */ boolean $isWifi;
        public final /* synthetic */ String $phone;
        public final /* synthetic */ boolean $popupShown;
        public final /* synthetic */ EnumC852910Xd3 $step;
        public long J$0;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, EnumC852910Xd3 enumC852910Xd3, boolean z, InterfaceC1238810iLH interfaceC1238810iLH, String str2, String str3, boolean z2, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$phone = str;
            this.$step = enumC852910Xd3;
            this.$isWifi = z;
            this.$gsmaCallback = interfaceC1238810iLH;
            this.$enterFrom = str2;
            this.$enterMethod = str3;
            this.$popupShown = z2;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.$phone, this.$step, this.$isWifi, this.$gsmaCallback, this.$enterFrom, this.$enterMethod, this.$popupShown, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$callSendGSMACode$1$1, reason: invalid class name and collision with other inner class name */
        @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$callSendGSMACode$1$1", f = "GSMAService.kt", l = {}, m = "invokeSuspend")
        public final class C00231 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ String $enterFrom;
            public final /* synthetic */ String $enterMethod;
            public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
            public final /* synthetic */ SendGSMACodeData $gsmaCodeData;
            public final /* synthetic */ boolean $popupShown;
            public final /* synthetic */ GetGSMARedirectUrlData $redirectUrlData;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(InterfaceC1238810iLH interfaceC1238810iLH, SendGSMACodeData sendGSMACodeData, String str, String str2, boolean z, GetGSMARedirectUrlData getGSMARedirectUrlData, InterfaceC1364105Vn<? super C00231> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$gsmaCallback = interfaceC1238810iLH;
                this.$gsmaCodeData = sendGSMACodeData;
                this.$enterFrom = str;
                this.$enterMethod = str2;
                this.$popupShown = z;
                this.$redirectUrlData = getGSMARedirectUrlData;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C00231(this.$gsmaCallback, this.$gsmaCodeData, this.$enterFrom, this.$enterMethod, this.$popupShown, this.$redirectUrlData, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("GSMAService@d4af.callSendGSMACode$1$1");
                C099R.LJFF();
                if (this.label == 0) {
                    C155000ia.LIZIZ(obj);
                    this.$gsmaCallback.WP();
                    SendGSMACodeData sendGSMACodeData = this.$gsmaCodeData;
                    Boolean bool = null;
                    if (sendGSMACodeData != null && sendGSMACodeData.code != null) {
                        GSMAService.mobGSMAAuthentication$default(GSMAService.INSTANCE, this.$enterFrom, this.$enterMethod, null, true, null, null, 48, null);
                        InterfaceC1238810iLH interfaceC1238810iLH = this.$gsmaCallback;
                        String str = this.$gsmaCodeData.code;
                        boolean z = this.$popupShown;
                        GetGSMARedirectUrlData getGSMARedirectUrlData = this.$redirectUrlData;
                        if (getGSMARedirectUrlData != null) {
                            bool = getGSMARedirectUrlData.hasAccount;
                        }
                        interfaceC1238810iLH.yq(str, z, bool);
                    } else {
                        GSMAService.mobGSMAAuthentication$default(GSMAService.INSTANCE, this.$enterFrom, this.$enterMethod, null, false, null, null, 48, null);
                        this.$gsmaCallback.kD("auth_send_code_fail");
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GSMAService@d4af.callSendGSMACode$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.GSMAService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1", f = "GSMAService.kt", l = {305, 312, 321, 331}, m = "invokeSuspend")
    public final class C2325801 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ C19EG $activity;
        public final /* synthetic */ String $enterFrom;
        public final /* synthetic */ String $enterMethod;
        public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
        public final /* synthetic */ boolean $isWifi;
        public final /* synthetic */ String $page;
        public final /* synthetic */ String $phone;
        public final /* synthetic */ String $popupTriggerValue;
        public final /* synthetic */ EnumC852910Xd3 $step;
        public long J$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325801(boolean z, String str, String str2, String str3, InterfaceC1238810iLH interfaceC1238810iLH, EnumC852910Xd3 enumC852910Xd3, C19EG c19eg, String str4, String str5, InterfaceC1364105Vn<? super C2325801> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$isWifi = z;
            this.$enterFrom = str;
            this.$enterMethod = str2;
            this.$phone = str3;
            this.$gsmaCallback = interfaceC1238810iLH;
            this.$step = enumC852910Xd3;
            this.$activity = c19eg;
            this.$popupTriggerValue = str4;
            this.$page = str5;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new C2325801(this.$isWifi, this.$enterFrom, this.$enterMethod, this.$phone, this.$gsmaCallback, this.$step, this.$activity, this.$popupTriggerValue, this.$page, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$1, reason: invalid class name and collision with other inner class name */
        @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$1", f = "GSMAService.kt", l = {}, m = "invokeSuspend")
        public final class C00241 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00241(InterfaceC1238810iLH interfaceC1238810iLH, InterfaceC1364105Vn<? super C00241> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$gsmaCallback = interfaceC1238810iLH;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C00241(this.$gsmaCallback, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("GSMAService@d4af.getGSMACode$1$1");
                C099R.LJFF();
                if (this.label == 0) {
                    C155000ia.LIZIZ(obj);
                    this.$gsmaCallback.kD("wifi_only");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GSMAService@d4af.getGSMACode$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$2, reason: invalid class name */
        @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$2", f = "GSMAService.kt", l = {}, m = "invokeSuspend")
        public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ C19EG $activity;
            public final /* synthetic */ GSMAStatusData $data;
            public final /* synthetic */ String $enterFrom;
            public final /* synthetic */ String $enterMethod;
            public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
            public final /* synthetic */ boolean $isWifi;
            public final /* synthetic */ String $page;
            public final /* synthetic */ String $phone;
            public final /* synthetic */ String $popupTriggerValue;
            public final /* synthetic */ EnumC852910Xd3 $step;
            public int label;

            /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$2$1, reason: invalid class name and collision with other inner class name */
            public final class C00251 extends C09AY implements Function0<Unit> {
                public final /* synthetic */ String $enterFrom;
                public final /* synthetic */ String $enterMethod;
                public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
                public final /* synthetic */ boolean $isWifi;
                public final /* synthetic */ String $page;
                public final /* synthetic */ String $phone;
                public final /* synthetic */ EnumC852910Xd3 $step;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00251(String str, String str2, String str3, String str4, EnumC852910Xd3 enumC852910Xd3, boolean z, InterfaceC1238810iLH interfaceC1238810iLH) {
                    super(0);
                    this.$enterFrom = str;
                    this.$enterMethod = str2;
                    this.$page = str3;
                    this.$phone = str4;
                    this.$step = enumC852910Xd3;
                    this.$isWifi = z;
                    this.$gsmaCallback = interfaceC1238810iLH;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", this.$enterFrom);
                    c0xgr.LIZLLL("enter_method", this.$enterMethod);
                    c0xgr.LIZLLL("text", "continue");
                    c0xgr.LIZLLL("page", this.$page);
                    C20684815ws.LJIILLIIL("click_gsma_popup", c0xgr.LIZ);
                    GSMAService gSMAService = GSMAService.INSTANCE;
                    gSMAService.updateGSMALocalCache(null, 1, null, null, null, null);
                    gSMAService.callSendGSMACode(this.$phone, true, this.$step, this.$enterFrom, this.$enterMethod, this.$isWifi, this.$gsmaCallback);
                    return Unit.LIZ;
                }
            }

            /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$2$2, reason: invalid class name and collision with other inner class name */
            public final class C00262 extends C09AY implements Function0<Unit> {
                public final /* synthetic */ String $enterFrom;
                public final /* synthetic */ String $enterMethod;
                public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
                public final /* synthetic */ String $page;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00262(String str, String str2, String str3, InterfaceC1238810iLH interfaceC1238810iLH) {
                    super(0);
                    this.$enterFrom = str;
                    this.$enterMethod = str2;
                    this.$page = str3;
                    this.$gsmaCallback = interfaceC1238810iLH;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", this.$enterFrom);
                    c0xgr.LIZLLL("enter_method", this.$enterMethod);
                    c0xgr.LIZLLL("text", "send_code_instead");
                    c0xgr.LIZLLL("page", this.$page);
                    C20684815ws.LJIILLIIL("click_gsma_popup", c0xgr.LIZ);
                    this.$gsmaCallback.kD("opt_out");
                    return Unit.LIZ;
                }
            }

            /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$2$3, reason: invalid class name */
            public final class AnonymousClass3 extends C09AY implements Function0<Unit> {
                public final /* synthetic */ String $enterFrom;
                public final /* synthetic */ String $enterMethod;
                public final /* synthetic */ String $page;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(String str, String str2, String str3) {
                    super(0);
                    this.$enterFrom = str;
                    this.$enterMethod = str2;
                    this.$page = str3;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", this.$enterFrom);
                    c0xgr.LIZLLL("enter_method", this.$enterMethod);
                    c0xgr.LIZLLL("text", "dismiss");
                    c0xgr.LIZLLL("page", this.$page);
                    C20684815ws.LJIILLIIL("click_gsma_popup", c0xgr.LIZ);
                    return Unit.LIZ;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC1238810iLH interfaceC1238810iLH, String str, GSMAStatusData gSMAStatusData, EnumC852910Xd3 enumC852910Xd3, String str2, String str3, boolean z, C19EG c19eg, String str4, String str5, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$gsmaCallback = interfaceC1238810iLH;
                this.$phone = str;
                this.$data = gSMAStatusData;
                this.$step = enumC852910Xd3;
                this.$enterFrom = str2;
                this.$enterMethod = str3;
                this.$isWifi = z;
                this.$activity = c19eg;
                this.$popupTriggerValue = str4;
                this.$page = str5;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new AnonymousClass2(this.$gsmaCallback, this.$phone, this.$data, this.$step, this.$enterFrom, this.$enterMethod, this.$isWifi, this.$activity, this.$popupTriggerValue, this.$page, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                C1C7U.LIZ("GSMAService@d4af.getGSMACode$1$2");
                C099R.LJFF();
                if (this.label == 0) {
                    C155000ia.LIZIZ(obj);
                    this.$gsmaCallback.WP();
                    Map<String, GSMAStatusData> map = GSMAService.cacheMap;
                    String str6 = this.$phone;
                    GSMAStatusData gSMAStatusData = this.$data;
                    String str7 = null;
                    if (gSMAStatusData == null) {
                        gSMAStatusData = new GSMAStatusData(false, null, null, null);
                    }
                    map.put(str6, gSMAStatusData);
                    GSMAStatusData gSMAStatusData2 = this.$data;
                    if (gSMAStatusData2 != null && Intrinsics.LJFF(gSMAStatusData2.gsmaAvailable, true)) {
                        this.$gsmaCallback.ha();
                        GSMAService gSMAService = GSMAService.INSTANCE;
                        GSMALocalCache gSMALocalCache = gSMAService.getGSMALocalCache(this.$phone, null);
                        if (Intrinsics.LJFF(this.$data.optOutRequired, true)) {
                            gSMALocalCache.setOptOutRequired(true);
                            int i = gSMALocalCache.userPreference;
                            if (i == 1) {
                                gSMAService.callSendGSMACode(this.$phone, false, this.$step, this.$enterFrom, this.$enterMethod, this.$isWifi, this.$gsmaCallback);
                            } else if (i != 2 && gSMALocalCache.showCount < 3) {
                                C19EG c19eg = this.$activity;
                                PopupConfig popupConfig = this.$data.popupConfig;
                                if (popupConfig != null) {
                                    str2 = popupConfig.title;
                                    str3 = popupConfig.description;
                                    str4 = popupConfig.placeholderText;
                                    str7 = popupConfig.learnMoreLink;
                                } else {
                                    str2 = null;
                                    str3 = null;
                                    str4 = null;
                                }
                                String str8 = str3;
                                String str9 = str2;
                                PopupManager.LJIJ(new C1245960iWo(c19eg, str9, str8, str4, str7, new C00251(this.$enterFrom, this.$enterMethod, this.$page, this.$phone, this.$step, this.$isWifi, this.$gsmaCallback), new C00262(this.$enterFrom, this.$enterMethod, this.$page, this.$gsmaCallback), new AnonymousClass3(this.$enterFrom, this.$enterMethod, this.$page)), "account_gsma_require_dialog", new C1668306g5(this.$popupTriggerValue));
                                C0XGR c0xgr = new C0XGR();
                                c0xgr.LIZLLL("enter_from", this.$enterFrom);
                                c0xgr.LIZLLL("enter_method", this.$enterMethod);
                                Set<String> set = C1260730iud.LIZ;
                                if (C851730Xb9.LIZIZ()) {
                                    str5 = "delay";
                                } else {
                                    str5 = "forward";
                                }
                                c0xgr.LIZLLL("age_gate", str5);
                                C20684815ws.LJIILLIIL("show_gsma_popup", c0xgr.LIZ);
                                gSMALocalCache.setShowCount(gSMALocalCache.showCount + 1);
                            } else {
                                this.$gsmaCallback.kD("opt_out");
                            }
                        } else {
                            gSMALocalCache.setOptOutRequired(false);
                            if (gSMALocalCache.userPreference == 2) {
                                this.$gsmaCallback.kD("opt_out");
                            } else {
                                gSMAService.callSendGSMACode(this.$phone, false, this.$step, this.$enterFrom, this.$enterMethod, this.$isWifi, this.$gsmaCallback);
                            }
                        }
                        gSMALocalCache.setPhone(this.$phone);
                        gSMAService.updateGSMALocalCache(gSMALocalCache, null, null, null, null, null);
                    } else {
                        this.$gsmaCallback.BM();
                        InterfaceC1238810iLH interfaceC1238810iLH = this.$gsmaCallback;
                        GSMAStatusData gSMAStatusData3 = this.$data;
                        if (gSMAStatusData3 != null && Intrinsics.LJFF(gSMAStatusData3.gsmaAvailable, false)) {
                            str = "server_ineligible";
                        } else {
                            str = "network_error";
                        }
                        interfaceC1238810iLH.kD(str);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GSMAService@d4af.getGSMACode$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.GSMAService.C2325801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1", f = "GSMAService.kt", l = {128, 133}, m = "invokeSuspend")
    public final class C2325811 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ C19EG $activity;
        public final /* synthetic */ String $enterFrom;
        public final /* synthetic */ String $enterMethod;
        public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
        public final /* synthetic */ String $loginPanelType;
        public final /* synthetic */ String $phone;
        public final /* synthetic */ EnumC852910Xd3 $step;
        public final /* synthetic */ TuxSheet $tuxSheet;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325811(C19EG c19eg, String str, EnumC852910Xd3 enumC852910Xd3, String str2, String str3, String str4, TuxSheet tuxSheet, InterfaceC1238810iLH interfaceC1238810iLH, InterfaceC1364105Vn<? super C2325811> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$activity = c19eg;
            this.$phone = str;
            this.$step = enumC852910Xd3;
            this.$enterFrom = str2;
            this.$enterMethod = str3;
            this.$loginPanelType = str4;
            this.$tuxSheet = tuxSheet;
            this.$gsmaCallback = interfaceC1238810iLH;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new C2325811(this.$activity, this.$phone, this.$step, this.$enterFrom, this.$enterMethod, this.$loginPanelType, this.$tuxSheet, this.$gsmaCallback, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1$1, reason: invalid class name and collision with other inner class name */
        @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1$1", f = "GSMAService.kt", l = {}, m = "invokeSuspend")
        public final class C00271 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ InterfaceC1238810iLH $gsmaCallback;
            public final /* synthetic */ GSMAGetCodeResult $result;
            public final /* synthetic */ TuxSheet $tuxSheet;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00271(TuxSheet tuxSheet, GSMAGetCodeResult gSMAGetCodeResult, InterfaceC1238810iLH interfaceC1238810iLH, InterfaceC1364105Vn<? super C00271> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$tuxSheet = tuxSheet;
                this.$result = gSMAGetCodeResult;
                this.$gsmaCallback = interfaceC1238810iLH;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C00271(this.$tuxSheet, this.$result, this.$gsmaCallback, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
            @Override // njp.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.String r5 = "GSMAService@d4af.getGSMACodePhase2$1$1"
                    X.C1C7U.LIZ(r5)
                    X.C099R.LJFF()
                    int r0 = r6.label
                    if (r0 != 0) goto L42
                    X.C155000ia.LIZIZ(r7)
                    com.bytedance.tux.sheet.sheet.TuxSheet r0 = r6.$tuxSheet
                    boolean r0 = r0.isAdded()
                    if (r0 == 0) goto L1c
                    com.bytedance.tux.sheet.sheet.TuxSheet r0 = r6.$tuxSheet
                    r0.dismissAllowingStateLoss()
                L1c:
                    com.ss.android.ugc.aweme.services.GSMAGetCodeResult r4 = r6.$result
                    if (r4 == 0) goto L2a
                    java.lang.String r0 = r4.code
                    if (r0 != 0) goto L37
                    if (r4 == 0) goto L2a
                    java.lang.String r1 = r4.failReason
                    if (r1 != 0) goto L2c
                L2a:
                    java.lang.String r1 = "time_out"
                L2c:
                    X.0iLH r0 = r6.$gsmaCallback
                    r0.kD(r1)
                L31:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    X.C1C7U.LIZIZ(r5)
                    return r0
                L37:
                    X.0iLH r3 = r6.$gsmaCallback
                    java.lang.String r2 = r4.code
                    r1 = 1
                    java.lang.Boolean r0 = r4.hasAccount
                    r3.yq(r2, r1, r0)
                    goto L31
                L42:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.GSMAService.C2325811.C00271.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objLIZJ = obj;
            C1C7U.LIZ("GSMAService@d4af.getGSMACodePhase2$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(objLIZJ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                long j = AccountGSMAPhase2Experiment.LIZ().timeoutMillis;
                GSMAService$getGSMACodePhase2$1$result$1 gSMAService$getGSMACodePhase2$1$result$1 = new GSMAService$getGSMACodePhase2$1$result$1(this.$activity, this.$phone, this.$step, this.$enterFrom, this.$enterMethod, this.$loginPanelType, null);
                this.label = 1;
                objLIZJ = C099A.LIZJ(j, gSMAService$getGSMACodePhase2$1$result$1, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1");
                    return objLJFF;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C00271 c00271 = new C00271(this.$tuxSheet, (GSMAGetCodeResult) objLIZJ, this.$gsmaCallback, null);
            this.label = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c00271) == objLJFF) {
                C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1");
            return unit2;
        }
    }

    private final void saveGSMALocalCache(GSMALocalCache gSMALocalCache) {
        Keva keva = getKeva();
        C1227904rF.LIZ.getClass();
        keva.storeString("gsma_cache_key", C1227904rF.LJI(gSMALocalCache));
    }

    public final boolean isUserGSMAAvailable(String str) {
        return Intrinsics.LJFF(getGSMALocalCache(null, null).uid, str);
    }

    public final void showGSMAFailureToast(Activity activity) {
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131824510);
        c1389890mGx.LIZ(true);
        c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389890mGx.LJIIJJI();
    }

    public final GSMALocalCache getGSMALocalCache(String str, String str2) {
        String string = getKeva().getString("gsma_cache_key", "");
        try {
            C1227904rF.LIZ.getClass();
            GSMALocalCache gSMALocalCache = (GSMALocalCache) C1227904rF.LIZIZ(string, GSMALocalCache.class);
            if (gSMALocalCache != null) {
                if (str2 != null && !Intrinsics.LJFF(str2, gSMALocalCache.uid)) {
                    removeGSMALocalCache();
                    return new GSMALocalCache(0, 0, false, "", "");
                }
                if (str != null && !Intrinsics.LJFF(str, gSMALocalCache.phone)) {
                    removeGSMALocalCache();
                    return new GSMALocalCache(0, 0, false, "", "");
                }
                return gSMALocalCache;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new GSMALocalCache(0, 0, false, "", "");
    }

    public final void mobGSMATimer(String str, long j) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZIZ(j, "load_time");
        C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
    }

    private final void mobGSMAVerifyPopupShow(String str, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("platform", "sms_verification");
        C20684815ws.LJIILLIIL("gsma_verify_popup_show", c0xgr.LIZ);
    }

    public final void bindLoginLearnMoreForGSMA(final Activity activity, TextView textView, final String str) {
        final int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(activity.getString(2131839766));
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, activity);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iIntValue, activity, str) { // from class: com.ss.android.ugc.aweme.services.GSMAService$bindLoginLearnMoreForGSMA$gsmaLearnMoreSpan$1
            public final /* synthetic */ Activity $activity;
            public final /* synthetic */ String $learnMoreURL;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Activity activity2 = this.$activity;
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.url = this.$learnMoreURL;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(402685964);
                C1554300qY8.LIZIZ(activity2, sparkThirdContext);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(iIntValue, iIntValue);
                this.$activity = activity;
                this.$learnMoreURL = str;
            }
        };
        String string = activity.getString(2131824512, strLIZIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iLJJJ = a0.LJJJ(string, activity.getString(2131839766), 0, false, 6);
        if (iLJJJ != -1) {
            C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iLJJJ, strLIZIZ.length() + iLJJJ, 18);
        }
        textView.setHighlightColor(0);
        textView.setText(SpannableString.valueOf(spannableStringBuilder));
        textView.setMovementMethod(C431300Gvg.LIZ());
    }

    public final void bindSignupLearnMoreForGSMA(final Activity activity, TextView textView, final String str) {
        final int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(activity.getString(2131839766));
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, activity);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iIntValue, activity, str) { // from class: com.ss.android.ugc.aweme.services.GSMAService$bindSignupLearnMoreForGSMA$gsmaLearnMoreSpan$1
            public final /* synthetic */ Activity $activity;
            public final /* synthetic */ String $learnMoreURL;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Activity activity2 = this.$activity;
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.url = this.$learnMoreURL;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(402685964);
                C1554300qY8.LIZIZ(activity2, sparkThirdContext);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(iIntValue, iIntValue);
                this.$activity = activity;
                this.$learnMoreURL = str;
            }
        };
        AbstractC431340Gvk abstractC431340Gvk2 = new AbstractC431340Gvk(iIntValue, activity) { // from class: com.ss.android.ugc.aweme.services.GSMAService$bindSignupLearnMoreForGSMA$regularLearnMoreSpan$1
            public final /* synthetic */ Activity $activity;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                C0FNV.LIZJ(DialogC20224814Bq.LJJLIIIJLLLLLLLZ(this.$activity));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(iIntValue, iIntValue);
                this.$activity = activity;
            }
        };
        String string = activity.getString(2131824505, strLIZIZ, strLIZIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iLJJJ = a0.LJJJ(string, activity.getString(2131839766), 0, false, 6);
        int iLJJJJI = a0.LJJJJI(string, activity.getString(2131839766), 0, 6);
        if (iLJJJ != -1) {
            spannableStringBuilder.replace(strLIZIZ.length() + iLJJJ, strLIZIZ.length() + iLJJJ + 1, (CharSequence) "\n\n");
            C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iLJJJ, strLIZIZ.length() + iLJJJ, 18);
        }
        if (iLJJJJI != -1) {
            C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk2, iLJJJJI, strLIZIZ.length() + iLJJJJI, 18);
        }
        textView.setHighlightColor(0);
        textView.setText(SpannableString.valueOf(spannableStringBuilder));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, activity);
        if (numLIZJ2 != null) {
            textView.setTextColor(numLIZJ2.intValue());
        }
        textView.setMovementMethod(C431300Gvg.LIZ());
    }

    public final void mobSendCodeInsteadClick(String str, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("platform", "sms_verification");
        C20684815ws.LJIILLIIL("send_code_instead_click", c0xgr.LIZ);
    }

    public final void showGSMAToast(Activity activity, String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        C20684815ws.LJIILLIIL("show_gsma_login_toast", c0xgr.LIZ);
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131835420);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.zi);
        c1389890mGx.LIZ(true);
        c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389890mGx.LJIIJJI();
    }

    public final void mobGSMAVerifyPopupClick(String str, String str2, String str3, String str4) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("platform", "sms_verification");
        c0xgr.LIZLLL("click_type", str4);
        C20684815ws.LJIILLIIL("gsma_verify_popup_click", c0xgr.LIZ);
    }

    private final void mobGSMATimer(String str, long j, String str2, String str3, String str4) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZIZ(j, "load_time");
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str3);
        c0xgr.LIZLLL("login_panel_type", str4);
        C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
    }

    public final void mobCheckGSMAEligibility(String str, String str2, boolean z, String str3, Integer num) {
        String str4;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xgr.LIZLLL("is_eligible", str4);
        if (str3 != null) {
            c0xgr.LIZJ("ineligible_reason", str3);
        }
        if (num != null) {
            num.intValue();
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("check_gsma_eligibility", c0xgr.LIZ);
    }

    private final void mobGSMAAuthentication(String str, String str2, String str3, boolean z, String str4, Integer num) {
        String str5;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xgr.LIZLLL("is_success", str5);
        if (str3 != null) {
            c0xgr.LIZJ("login_panel_type", str3);
        }
        if (str4 != null) {
            c0xgr.LIZJ("ineligible_reason", str4);
        }
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("gsma_authentication", c0xgr.LIZ);
    }

    private final void mobSendGSMACode(String str, String str2, String str3, boolean z, String str4, Integer num) {
        String str5;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xgr.LIZLLL("is_eligible", str5);
        c0xgr.LIZLLL("login_panel_type", str3);
        if (str4 != null) {
            c0xgr.LIZJ("ineligible_reason", str4);
        }
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("send_gsma_code", c0xgr.LIZ);
    }

    public final void updateGSMALocalCache(GSMALocalCache gSMALocalCache, Integer num, Integer num2, Boolean bool, String str, String str2) {
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue;
        String str3 = str2;
        String str4 = str;
        GSMALocalCache gSMALocalCache2 = getGSMALocalCache(null, null);
        if (gSMALocalCache != null) {
            saveGSMALocalCache(gSMALocalCache);
            return;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = gSMALocalCache2.userPreference;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = gSMALocalCache2.showCount;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = gSMALocalCache2.optOutRequired;
        }
        if (str4 == null) {
            str4 = gSMALocalCache2.uid;
        }
        if (str3 == null) {
            str3 = gSMALocalCache2.phone;
        }
        saveGSMALocalCache(gSMALocalCache2.copy(iIntValue, iIntValue2, zBooleanValue, str4, str3));
    }

    public final void callSendGSMACode(String str, boolean z, EnumC852910Xd3 enumC852910Xd3, String str2, String str3, boolean z2, InterfaceC1238810iLH interfaceC1238810iLH) {
        interfaceC1238810iLH.CQ();
        sendGSMACodeJob = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass1(str, enumC852910Xd3, z2, interfaceC1238810iLH, str2, str3, z, null), 3);
    }

    public final void getGSMACode(String str, String str2, EnumC852910Xd3 enumC852910Xd3, String str3, String str4, String str5, InterfaceC1238810iLH interfaceC1238810iLH) {
        C19EG activity = interfaceC1238810iLH.getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC1519705xD.LIZ.getClass();
        boolean zLJ = C0XF1.LJ(activity);
        AccountGSMAExperiment.LIZ.getClass();
        if (!AccountGSMAExperiment.LIZ().enableWifi && zLJ) {
            interfaceC1238810iLH.kD("");
        } else {
            interfaceC1238810iLH.CQ();
            gsmaStatusJob = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2325801(zLJ, str3, str4, str2, interfaceC1238810iLH, enumC852910Xd3, activity, str, str5, null), 3);
        }
    }

    public final void getGSMACodePhase2(InterfaceC497601wk interfaceC497601wk, String str, EnumC852910Xd3 enumC852910Xd3, final String str2, final String str3, final String str4, final InterfaceC1238810iLH interfaceC1238810iLH) {
        C19EG activity = interfaceC1238810iLH.getActivity();
        if (activity == null) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        GSMALoadingSheetFragment gSMALoadingSheetFragment = new GSMALoadingSheetFragment();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = gSMALoadingSheetFragment;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLLIL = false;
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$tuxSheet$1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str5;
                GSMAService gSMAService = GSMAService.INSTANCE;
                gSMAService.cancelJob();
                String str6 = TuxSheet._pnsPageId;
                AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343980De8.LIZ)) {
                    str5 = "dismiss";
                } else if (Intrinsics.LJFF(abstractC343940De4LJIIJ, ClickSendCodeInstead.INSTANCE)) {
                    str5 = "send_code_instead";
                } else {
                    str5 = "";
                }
                gSMAService.mobGSMAVerifyPopupClick(str2, str3, str4, str5);
                if (!Intrinsics.LJFF(str5, "dismiss")) {
                    interfaceC1238810iLH.kD("quit");
                }
            }
        };
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LL = onCancelListener;
        mobGSMAVerifyPopupShow(str2, str3, str4);
        tuxSheet2.show(activity.getSupportFragmentManager(), (String) null);
        sendGSMACodeJob = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C2325811(activity, str, enumC852910Xd3, str2, str3, str4, tuxSheet2, interfaceC1238810iLH, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (r2 == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0213  */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestGsmaCode(android.app.Activity r20, java.lang.String r21, X.EnumC852910Xd3 r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.GSMAGetCodeResult> r26) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.GSMAService.requestGsmaCode(android.app.Activity, java.lang.String, X.0Xd3, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static /* synthetic */ void mobGSMAAuthentication$default(GSMAService gSMAService, String str, String str2, String str3, boolean z, String str4, Integer num, int i, Object obj) {
        String str5 = str4;
        Integer num2 = null;
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) == 0) {
            num2 = num;
        }
        gSMAService.mobGSMAAuthentication(str, str2, str3, z, str5, num2);
    }
}
