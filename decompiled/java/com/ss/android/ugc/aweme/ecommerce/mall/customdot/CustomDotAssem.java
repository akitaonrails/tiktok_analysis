package com.ss.android.ugc.aweme.ecommerce.mall.customdot;

import X.AbstractC1769040w8U;
import X.AbstractC1769070w8X;
import X.AnonymousClass0956;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0NKX;
import X.C0PEM;
import X.C0QSJ;
import X.C0SYH;
import X.C0ZP4;
import X.C1018703yb;
import X.C10GR;
import X.C1150504el;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1303740k20;
import X.C13LE;
import X.C14EU;
import X.C1583900rJs;
import X.C1619070sEb;
import X.C1619080sEc;
import X.C1637806bA;
import X.C1768670w7t;
import X.C1768830w89;
import X.C1768850w8B;
import X.C1768860w8C;
import X.C1768970w8N;
import X.C1769030w8T;
import X.C1769080w8Y;
import X.C1769100w8a;
import X.C1769300w8u;
import X.C1769480w9C;
import X.C1769570w9L;
import X.C1769790w9h;
import X.C1770850wBP;
import X.C189200o6;
import X.C1942307jB;
import X.C1946007jm;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2341109Fh;
import X.C324990Cob;
import X.C446900Hfk;
import X.C452501pT;
import X.C687700QyG;
import X.C714530S1b;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C7879035x;
import X.C823050WQl;
import X.C948503nH;
import X.C960203pA;
import X.EnumC113600bu;
import X.EnumC1768230w7B;
import X.EnumC1768240w7C;
import X.EnumC1768630w7p;
import X.EnumC1768880w8E;
import X.EnumC1768950w8L;
import X.EnumC1769260w8q;
import X.EnumC586510MzR;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC13038058i;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1769800w9i;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS25S0210000_26;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.libra.EcShopTabIconConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.IVideoGuideService;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomDotAssem extends BaseMainContainerAssem implements CustomDotAbilityCommon, InterfaceC724530SbT, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AbstractC1769040w8U LL;
    public final AssemVMLazy LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ;
    public volatile BottomTabAbility LLILZIL;
    public volatile HomeTabAbility LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomDotAssem.class, "shopDotVMV2", "getShopDotVMV2()Lcom/ss/android/ugc/aweme/ecommerce/mall/customdot/CustomDotVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CustomDotAssem.class, "bottomTabAbility", "getBottomTabAbility()Lcom/ss/android/ugc/aweme/base/activity/BottomTabAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CustomDotAssem.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"CustomDotAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).wQ2("page_profile", (C1769300w8u) this.LLILZ.getValue());
        }
        this.LL.LIZ = C724240Sb0.LIZ(this);
        this.LL.LIZIZ = getContext();
        m183do().LLILZIL = this.LL.LIZLLL();
        m183do().LL = this.LL.LJFF();
        CustomDotVMV2 customDotVMV2M183do = m183do();
        Context context = getContext();
        customDotVMV2M183do.LLILZ = context != null ? C960203pA.LIZIZ(context) : false;
        m183do().LLILZLL = this.LL.LIZLLL;
        m183do().LLILLJJLI = this.LL.LJ();
        m183do().LLJJI = this.LL;
        C736680Sv4.LJIIIIZZ(this, m183do(), new C2217381BqS() { // from class: X.0w9N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1769460w9A) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 206), 6);
        C736680Sv4.LJIIIIZZ(this, m183do(), new C2217381BqS() { // from class: X.0w9O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1769460w9A) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 207), 6);
        C736680Sv4.LJIIIIZZ(this, m183do(), new C2217381BqS() { // from class: X.0w9P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1769460w9A) obj).LLILLL;
            }
        }, null, new AwS640S0100000_26(this, 208), 6);
        C736680Sv4.LJIIIIZZ(this, m183do(), new C2217381BqS() { // from class: X.0w9Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1769460w9A) obj).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 209), 6);
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdateRefactor(C1619080sEc c1619080sEc) {
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        boolean z;
        EcShopTabIconConfigSettings.IconUrlModel iconUrlModel;
        EcShopTabIconConfigSettings.IconLocalModel iconLocalModel;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"CustomDotAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopTab Tooltip TooltipAvoid onResume");
        m183do().LLJ = true;
        if (this.LLILLL) {
            m183do();
            IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
            if (iEcUgVSAService == null || !iEcUgVSAService.LIZLLL()) {
                C1583900rJs c1583900rJs = C1583900rJs.LIZ;
                if (m183do().LL == EnumC1768630w7p.TOP_TAB.getValue()) {
                    z = true;
                } else {
                    EnumC1768630w7p.BOTTOM_TAB.getValue();
                    z = false;
                }
                c1583900rJs.getClass();
                if (!z ? ((Boolean) C1583900rJs.LIZJ.getValue()).booleanValue() : ((Boolean) C1583900rJs.LIZIZ.getValue()).booleanValue()) {
                    c1583900rJs.getClass();
                    EcShopTabIconConfigSettings.TimeRangeModel timeRangeModelLIZ = C1583900rJs.LIZ(z);
                    if (timeRangeModelLIZ != null && (((iconUrlModel = timeRangeModelLIZ.iconUrl) != null && iconUrlModel.lightModeIconUrl != null && iconUrlModel.darkModeIconUrl != null) || ((iconLocalModel = timeRangeModelLIZ.iconLocal) != null && iconLocalModel.lightSelectedPath != null && iconLocalModel != null && iconLocalModel.darkSelectedPath != null))) {
                        if (m183do().LL == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
                            m183do().LLJJIJIIJIL = true;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("event", EnumC586510MzR.REACH_GET_PAUSE.getValue());
                            linkedHashMap.put("reason", C0NKX.BOTTOM_ICON_PREPARE_SHOW.getValue());
                            try {
                                C1018703yb.LIZIZ("rd_tiktokec_shop_tab_icon", linkedHashMap);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        this.LL.LJIJJLI();
                    }
                }
            }
            this.LLILLL = false;
            m183do().HQ2(this.LL.LJIIL(), EnumC1768950w8L.COLD_START, null, null);
            ((IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class)).LJIIIIZZ("real_time_bubble_trigger", new InterfaceC13038058i() { // from class: X.0w8S
                @Override // X.InterfaceC13038058i
                public final void N0(String str, long j, JSONObject jSONObject) {
                    String strOptString;
                    String strOptString2;
                    if (Intrinsics.LJFF(str, "real_time_bubble_trigger")) {
                        CustomDotVMV2 customDotVMV2M183do = this.LL.m183do();
                        if (jSONObject != null) {
                            strOptString = jSONObject.optString("trigger_list");
                        } else {
                            strOptString = null;
                        }
                        customDotVMV2M183do.LLJJIII = strOptString;
                        CustomDotVMV2 customDotVMV2M183do2 = this.LL.m183do();
                        if (jSONObject != null) {
                            strOptString2 = jSONObject.optString("algorithm_params");
                        } else {
                            strOptString2 = null;
                        }
                        customDotVMV2M183do2.LLJJIJI = strOptString2;
                        this.LL.m183do().LQ2(this.LL.LL.LJIIL(), EnumC1768950w8L.PITAYA_TRIGGER_IMMEDIATELY, null, null);
                    }
                }
            }, "");
        } else {
            m183do().LQ2(this.LL.LJIIL(), EnumC1768950w8L.SHOP_TAB_SHOW, null, null);
            C1583900rJs c1583900rJs2 = C1583900rJs.LIZ;
            Context context = getContext();
            c1583900rJs2.getClass();
            C1303740k20 c1303740k20 = C1583900rJs.LJFF;
            if (c1303740k20 != null && c1303740k20.LJ && c1303740k20.LIZLLL > 0) {
                long jCurrentTimeMillis = (c1303740k20.LIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - System.currentTimeMillis();
                c1303740k20.LIZLLL = jCurrentTimeMillis;
                if (jCurrentTimeMillis < 0) {
                    c1303740k20.LIZIZ.invoke();
                } else {
                    AnonymousClass0956 anonymousClass0956 = c1303740k20.LIZJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c1303740k20.LJ = false;
                    c1303740k20.LIZ(context);
                }
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 428147899) {
            return null;
        }
        return this;
    }

    public final C0QSJ bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLIZLLLIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLIZ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLIZLLLIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final CustomDotVMV2 m183do() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (CustomDotVMV2) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final void vj() {
        this.LL.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final boolean xu() {
        return this.LL.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final EnumC1768240w7C H72() {
        EnumC1768240w7C enumC1768240w7CLIZLLL;
        C1769030w8T c1769030w8T = m183do().LLJJL;
        if (c1769030w8T != null) {
            AbstractC1769070w8X abstractC1769070w8X = c1769030w8T.LJIIIZ;
            if (abstractC1769070w8X != null && (enumC1768240w7CLIZLLL = abstractC1769070w8X.LIZLLL()) != null) {
                return enumC1768240w7CLIZLLL;
            }
            EnumC1768240w7C enumC1768240w7C = EnumC1768240w7C.DEFAULT;
            if (enumC1768240w7C != null) {
                return enumC1768240w7C;
            }
        }
        return EnumC1768240w7C.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final Long cb2() {
        C1769080w8Y c1769080w8Y;
        C1769030w8T c1769030w8T = m183do().LLJJL;
        if (c1769030w8T == null) {
            return null;
        }
        Object obj = ((LinkedHashMap) c1769030w8T.LJIIIIZZ).get(EnumC1768880w8E.TAB_TOOLTIP);
        if (!(obj instanceof C1769080w8Y) || (c1769080w8Y = (C1769080w8Y) obj) == null) {
            return null;
        }
        return c1769080w8Y.LJIILL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final void cl() {
        CustomDotVMV2 customDotVMV2M183do = m183do();
        C948503nH.LJI(customDotVMV2M183do, C0PEM.LIZJ, new C1768670w7t(customDotVMV2M183do, "fyp_vsa_shoptab", null));
        AbstractC1769040w8U abstractC1769040w8U = customDotVMV2M183do.LLJJI;
        if (abstractC1769040w8U != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event", EnumC586510MzR.REACH_GET_RESUME.getValue());
            linkedHashMap.put("reason", C0NKX.ANIMATION_INTERRUPTION_BY_VSA.getValue());
            abstractC1769040w8U.LIZ(linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final boolean fj2() {
        AbstractC1769070w8X abstractC1769070w8X;
        C1769030w8T c1769030w8T = m183do().LLJJL;
        if (c1769030w8T == null || (abstractC1769070w8X = c1769030w8T.LJIIIZ) == null) {
            return false;
        }
        return abstractC1769070w8X.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final EnumC1768230w7B nh0() {
        EnumC1768230w7B enumC1768230w7B;
        C1769030w8T c1769030w8T = m183do().LLJJL;
        return (c1769030w8T == null || (enumC1768230w7B = c1769030w8T.LJIIJJI) == null) ? EnumC1768230w7B.DEFAULT : enumC1768230w7B;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        ((IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class)).LJII("real_time_bubble_trigger", "");
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).PQ2("page_profile", (C1769300w8u) this.LLILZ.getValue());
        }
        AbstractC1769040w8U abstractC1769040w8U = this.LL;
        abstractC1769040w8U.LIZ = null;
        abstractC1769040w8U.LIZIZ = null;
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopTab Tooltip TooltipAvoid onPause");
        m183do().LLJ = false;
    }

    public CustomDotAssem(AbstractC1769040w8U abstractC1769040w8U) {
        this.LL = abstractC1769040w8U;
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CustomDotVMV2.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 621), AFwS268S0000000_26.get$arr$(262), null, true);
        this.LLILLL = true;
        this.LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 620));
        if (C7879035x.LIZLLL()) {
            abstractC1769040w8U.LIZJ = this;
            abstractC1769040w8U.LJIILJJIL(this);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            abstractC1769040w8U.LIZJ = this;
            abstractC1769040w8U.LJIILJJIL(this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0w92] */
    public final void fo(final C1769790w9h c1769790w9h) {
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            final ?? r0 = new InterfaceC1769800w9i() { // from class: X.0w92
                @Override // X.InterfaceC1769800w9i
                public final void LIZ() {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZ("ShopByteSync TooltipTask===== tooltip popup task run");
                    this.LIZ.m183do().FQ2(c1769790w9h.LIZIZ);
                }
            };
            PopupManager.LJIJI(new C10GR(c19egLIZ, r0) { // from class: X.0zzm
                public final C19EG LL;
                public final InterfaceC1769800w9i LLILLJJLI;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 1800;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg = this.LL;
                    return new C688120Qyw(c19eg, c19eg, null);
                }

                {
                    this.LL = c19egLIZ;
                    this.LLILLJJLI = r0;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LLILLJJLI.LIZ();
                }

                @Override // X.AbstractC20656215sG
                public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                    super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                    if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                        C1440005kM.LIZ(new C1619150sEj(0));
                    }
                }
            }, true);
        } else {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync TooltipTask===== tooltip popup task run activity null");
            m183do().FQ2(c1769790w9h.LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0225 A[Catch: all -> 0x0241, CancellationException -> 0x0252, TryCatch #2 {CancellationException -> 0x0252, all -> 0x0241, blocks: (B:90:0x01a0, B:92:0x01ac, B:95:0x01b4, B:97:0x01b8, B:99:0x01be, B:125:0x0225, B:130:0x0231, B:132:0x0235, B:134:0x023b, B:100:0x01c3, B:102:0x01cf, B:105:0x01d7, B:107:0x01db, B:108:0x01e0, B:110:0x01ec, B:112:0x01f2, B:114:0x01fd, B:117:0x0205, B:119:0x0215, B:121:0x0219, B:123:0x021f, B:116:0x0203), top: B:143:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022c A[PHI: r0
      0x022c: PHI (r0v65 java.lang.String) = (r0v60 java.lang.String), (r0v93 java.lang.String) binds: [B:126:0x0229, B:57:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0235 A[Catch: all -> 0x0241, CancellationException -> 0x0252, TryCatch #2 {CancellationException -> 0x0252, all -> 0x0241, blocks: (B:90:0x01a0, B:92:0x01ac, B:95:0x01b4, B:97:0x01b8, B:99:0x01be, B:125:0x0225, B:130:0x0231, B:132:0x0235, B:134:0x023b, B:100:0x01c3, B:102:0x01cf, B:105:0x01d7, B:107:0x01db, B:108:0x01e0, B:110:0x01ec, B:112:0x01f2, B:114:0x01fd, B:117:0x0205, B:119:0x0215, B:121:0x0219, B:123:0x021f, B:116:0x0203), top: B:143:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall km0(boolean r14) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem.km0(boolean):com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall");
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAnchorPanelAction(C1769480w9C c1769480w9C) {
        CustomDotVMV2 customDotVMV2M183do = m183do();
        boolean zLJIIL = this.LL.LJIIL();
        int i = C1768970w8N.LIZIZ[c1769480w9C.LIZIZ.ordinal()];
        String str = "";
        if (i != 1) {
            if (i == 2) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopTab Tooltip TooltipAvoid handleAnchorPanelAction hide awemeId: ");
                sbLIZ.append(c1769480w9C.LIZ.LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                if (Intrinsics.LJFF(c1769480w9C.LIZ.LIZ, customDotVMV2M183do.LLJILJILJ.getSecond())) {
                    customDotVMV2M183do.LLJILJILJ = new Pair<>(Boolean.FALSE, "");
                    IVideoGuideService iVideoGuideService = (IVideoGuideService) PluggableExtentionKt.pluggableSpi$default(IVideoGuideService.class, false, false, false, 14, null);
                    if (iVideoGuideService == null || !iVideoGuideService.LIZIZ()) {
                        customDotVMV2M183do.LQ2(zLJIIL, EnumC1768950w8L.SHOP_TAB_SHOW, null, null);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ShopTab Tooltip TooltipAvoid handleAnchorPanelAction hide with traceback awemeId: ");
                    sbLIZ2.append(c1769480w9C.LIZ.LIZ);
                    C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ShopTab Tooltip TooltipAvoid handleAnchorPanelAction show awemeId: ");
        sbLIZ3.append(c1769480w9C.LIZ.LIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
        Boolean bool = Boolean.TRUE;
        String str2 = c1769480w9C.LIZ.LIZ;
        if (str2 != null) {
            str = str2;
        }
        customDotVMV2M183do.LLJILJILJ = new Pair<>(bool, str);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCommentDialogEvent(C0SYH c0syh) {
        boolean z = true;
        if (c0syh.LIZ != 1) {
            z = false;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopTab Tooltip TooltipAvoid isCommendDialogShowing: ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        CustomDotVMV2 customDotVMV2M183do = m183do();
        boolean zLJIIL = this.LL.LJIIL();
        customDotVMV2M183do.LLJI = z;
        if (z) {
            customDotVMV2M183do.DQ2(EnumC1769260w8q.OTHER);
        } else {
            customDotVMV2M183do.LQ2(zLJIIL, EnumC1768950w8L.SHOP_TAB_SHOW, null, null);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEcVideoGuideEvent(C1769570w9L c1769570w9L) {
        boolean z;
        CustomDotVMV2 customDotVMV2M183do = m183do();
        if (c1769570w9L.LIZ == EnumC113600bu.SHOW) {
            z = true;
        } else {
            z = false;
        }
        customDotVMV2M183do.LLJILJIL = z;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInboxPopupVisibilityChange(C1619070sEb c1619070sEb) {
        C1769100w8a c1769100w8a;
        CustomDotVMV2 customDotVMV2M183do = m183do();
        int i = c1619070sEb.LIZ;
        if (i == 0) {
            customDotVMV2M183do.LLIZ = true;
            return;
        }
        if (i != 1) {
            return;
        }
        customDotVMV2M183do.LLIZ = false;
        C1769030w8T c1769030w8T = customDotVMV2M183do.LLJJL;
        if (c1769030w8T == null) {
            return;
        }
        Object obj = ((LinkedHashMap) c1769030w8T.LJIIIIZZ).get(EnumC1768880w8E.TAB_ICON);
        if (!(obj instanceof C1769100w8a) || (c1769100w8a = (C1769100w8a) obj) == null) {
            return;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopByteSync IconTask===== icon task inbox tooltip hide inboxTooltipHideContinuation: ");
        sbLIZ.append(c1769100w8a.LJIILL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        C324990Cob.LIZIZ(c1769100w8a.LJIILL);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUgSparkCloseEvent(C1768860w8C c1768860w8C) {
        Fragment fragmentLJI;
        C19EG activity;
        Integer num;
        String strLIZIZ = C1942307jB.LIZIZ(C1946007jm.LJ(c1768860w8C.LIZ), "landing_strategy");
        if (strLIZIZ != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (activity = fragmentLJI.getActivity()) != null) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            if (c446900Hfk.LIZ(activity).KQ2("For You")) {
                num = 1;
            } else {
                if (c446900Hfk.LIZ(activity).KQ2("Shop")) {
                    num = 2;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1768830w89(this, c1768860w8C, strLIZIZ, null), 3);
            }
            if (num != null) {
                num.intValue();
                m183do().LQ2(this.LL.LJIIL(), EnumC1768950w8L.UG_BACK_FYP_SHOW_BUBBLE, new C1768850w8B(null, c1768860w8C.LIZ, strLIZIZ, num, 1), null);
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1768830w89(this, c1768860w8C, strLIZIZ, null), 3);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoPageChangeEvent(C714530S1b c714530S1b) {
        CustomDotVMV2 customDotVMV2M183do = m183do();
        boolean zLJIIL = this.LL.LJIIL();
        customDotVMV2M183do.LLJILLL = c714530S1b.LIZ;
        C823050WQl.LIZJ().execute(new ARunnableS25S0210000_26(customDotVMV2M183do, c714530S1b, zLJIIL, 2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final void Cs(int i, int i2) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopTab Tooltip TooltipAvoid onTopTabScrollChanged l: ");
        sbLIZ.append(i);
        sbLIZ.append(" oldl: ");
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (this.LL.LJFF() == EnumC1768630w7p.TOP_TAB.getValue()) {
            this.LL.LJIIJJI(EnumC1769260w8q.CLICK_SWITCH_TAB);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final void Pv(EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map map) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopByteSync CustomDotAssem tryRequestReachCfg reqState: ");
        sbLIZ.append(enumC1768950w8L.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.getActivity() != null && fragmentLJI != null && fragmentLJI.getFragmentManager() != null) {
            m183do().LQ2(this.LL.LJIIL(), enumC1768950w8L, c1768850w8B, map);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
