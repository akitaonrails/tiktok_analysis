package com.ss.android.ugc.aweme.ecommerce.mall.customdot;

import X.AbstractC1769040w8U;
import X.AbstractC1769070w8X;
import X.C098200Yq;
import X.C099G;
import X.C09R9;
import X.C0CA1;
import X.C0PEM;
import X.C0S4T;
import X.C0S4U;
import X.C0S78;
import X.C13LE;
import X.C13LP;
import X.C1741890vQh;
import X.C1766860w4y;
import X.C1767800w6U;
import X.C1768410w7T;
import X.C1768560w7i;
import X.C1768660w7s;
import X.C1768720w7y;
import X.C1768800w86;
import X.C1768820w88;
import X.C1768850w8B;
import X.C1768870w8D;
import X.C1768970w8N;
import X.C1769000w8Q;
import X.C1769030w8T;
import X.C1769080w8Y;
import X.C1769130w8d;
import X.C1769140w8e;
import X.C1769250w8p;
import X.C1769460w9A;
import X.C1769690w9X;
import X.C1769790w9h;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C2421209eE;
import X.C324990Cob;
import X.C343710Ddh;
import X.C663760Q1u;
import X.C724240Sb0;
import X.C7879035x;
import X.C823050WQl;
import X.C948503nH;
import X.EnumC1768570w7j;
import X.EnumC1768630w7p;
import X.EnumC1768880w8E;
import X.EnumC1768910w8H;
import X.EnumC1768940w8K;
import X.EnumC1768950w8L;
import X.EnumC1768960w8M;
import X.EnumC1768980w8O;
import X.EnumC1769260w8q;
import X.EnumC1769280w8s;
import X.EnumC1986207qG;
import X.EnumC599720Nfe;
import X.InterfaceC0148002o;
import X.InterfaceC1768760w82;
import X.InterfaceC1769150w8f;
import X.InterfaceC1769710w9Z;
import X.InterfaceC599750Nfh;
import X.InterfaceC736910SvR;
import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachControlData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.FetchReachCfgFlag;
import com.ss.android.ugc.aweme.ecommerce.ug.landing.IEcUgLandingService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomDotVMV2 extends AssemViewModel<C1769460w9A> implements InterfaceC1769150w8f {
    public static final String LLJLILLLLZIIL = UUID.randomUUID().toString();
    public boolean LLILZ;
    public InterfaceC1769710w9Z LLILZIL;
    public C1769690w9X LLILZLL;
    public boolean LLIZ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public volatile Aweme LLJILLL;
    public volatile AbstractC1769040w8U LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public volatile C099G LLJJJJJIL;
    public volatile C099G LLJJJJLIIL;
    public volatile C1769030w8T LLJJL;
    public volatile Long LLJJLIIIJLLLLLLLZ;
    public volatile long LLJL;
    public volatile boolean LLJLIL;
    public int LL = -1;
    public String LLILLJJLI = "";
    public volatile FetchReachCfgFlag LLILLL = new FetchReachCfgFlag(false, null, null, Boolean.FALSE);
    public String LLIZLLLIL = "HOME";
    public boolean LLJ = true;
    public Pair<Boolean, String> LLJILJILJ = new Pair<>(Boolean.FALSE, "");
    public volatile boolean LLJJ = true;
    public Integer LLJJIJIL = 0;
    public final C09R9 LLJJJ = new C09R9(this, C13LE.LIZ(C1768410w7T.class));
    public final String LLJJJIL = EnumC1986207qG.MALL_VERSION_V3.getValue();
    public volatile boolean LLJJJJ = true;

    public final void CQ2() {
        String str;
        ReachCfgDataTransfer reachCfgDataTransfer;
        ReachCfgData reachCfgData;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopByteSync ClickShopTab handle shop tab click");
        C1769030w8T c1769030w8T = this.LLJJL;
        if (c1769030w8T == null || (reachCfgDataTransfer = c1769030w8T.LIZIZ) == null || (reachCfgData = reachCfgDataTransfer.reachCfgData) == null || (str = reachCfgData.bizType) == null) {
            str = "";
        }
        if (Intrinsics.LJFF("delivery_landing", str)) {
            return;
        }
        C948503nH.LJI(this, C0PEM.LIZJ, new C1768870w8D(this, null));
    }

    @Override // X.InterfaceC1769150w8f
    public final void Ck1() {
        HQ2(false, EnumC1768950w8L.BACKGROUND_CLEAR_BADGE, null, null);
    }

    public final boolean EQ2() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        TopTabAbility topTabAbilityLIZ;
        int i = this.LL;
        if (i == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
            if (!this.LLJ || this.LLJILJILJ.getFirst().booleanValue() || this.LLJI || this.LLJIJIL) {
                return false;
            }
        } else {
            if (i != EnumC1768630w7p.TOP_TAB.getValue() || !this.LLJ || !Intrinsics.LJFF(this.LLIZLLLIL, "HOME") || this.LLJILJILJ.getFirst().booleanValue() || this.LLJIJIL || this.LLJI) {
                return false;
            }
            Activity activityLIZ = C2421209eE.LIZ();
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZJ)) != null && !topTabAbilityLIZ.T40()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean Ge2() {
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
        return iEcUgVSAService != null && iEcUgVSAService.LIZLLL();
    }

    @Override // X.InterfaceC1769150w8f
    public final C0CA1 cM2() {
        C19EG c19egLIZ;
        C1769690w9X c1769690w9X = this.LLILZLL;
        if (c1769690w9X != null) {
            CustomDotAssem customDotAssem = c1769690w9X.LIZ.LIZJ;
            if (customDotAssem != null && (c19egLIZ = C724240Sb0.LIZ(customDotAssem)) != null) {
                C0CA1 c0ca1 = Intrinsics.LJFF("HOME", C343710Ddh.LIZ(c19egLIZ).CQ2()) ? C0CA1.HOME_TAB : C0CA1.NOT_HOME_TAB;
                if (c0ca1 != null) {
                    return c0ca1;
                }
            }
            C0CA1 c0ca12 = C0CA1.NONE;
            if (c0ca12 != null) {
                return c0ca12;
            }
        }
        return C0CA1.NONE;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1769460w9A(null, null, null, null);
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean fc0() {
        C19EG c19eg;
        Integer num = this.LLJJIJIL;
        int value = EnumC1768950w8L.UG_BACK_FYP_SHOW_BUBBLE.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        Activity activityLIZ = C2421209eE.LIZ();
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
            return false;
        }
        return !Hox.LLJILJIL.LIZ(c19eg).KQ2("For You");
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean ge2() {
        Aweme aweme = this.LLJILLL;
        return aweme != null && aweme.isAd();
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean hh0() {
        if (this.LL == EnumC1768630w7p.TOP_TAB.getValue()) {
            return true;
        }
        EnumC1768630w7p.BOTTOM_TAB.getValue();
        return false;
    }

    public final InterfaceC736910SvR<InterfaceC1768760w82> xQ2() {
        return (InterfaceC736910SvR) this.LLJJJ.getValue();
    }

    public static String wQ2() {
        String strLJIIIIZZ = null;
        if (C7879035x.LIZLLL()) {
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                return C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return null;
        }
        try {
            PageSourceInfo pageSourceInfoLJ2 = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ2 == null) {
                return null;
            }
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ2);
            return strLJIIIIZZ;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return strLJIIIIZZ;
        }
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean K71() {
        return EQ2();
    }

    public final n zQ2() {
        String str;
        String str2;
        List<String> listLIZIZ;
        Object obj;
        String str3;
        k kVar;
        Set<Map.Entry<String, k>> setEntrySet;
        String str4;
        k kVar2;
        Set<Map.Entry<String, k>> setEntrySet2;
        List<String> listLIZIZ2;
        if (C7879035x.LIZLLL()) {
            n nVar = new n();
            Aweme aweme = this.LLJILLL;
            nVar.LJJIIJ("context_video_ids", aweme != null ? aweme.getAid() : null);
            Aweme aweme2 = this.LLJILLL;
            nVar.LJJIIJ("context_video_product_ids", (aweme2 == null || (listLIZIZ2 = C663760Q1u.LIZIZ(aweme2)) == null) ? null : C13LP.LJJLIIIJ(listLIZIZ2, ",", null, null, 0, null, null, 62));
            Aweme aweme3 = this.LLJILLL;
            nVar.LJJIIJ("context_room_ids", aweme3 != null ? C663760Q1u.LJ(aweme3) : null);
            Aweme aweme4 = this.LLJILLL;
            nVar.LJJIIJ("context_account_ids", aweme4 != null ? AwemeExtKt.getAuthorUid(aweme4) : null);
            if (C7879035x.LIZLLL()) {
                InterfaceC599750Nfh interfaceC599750NfhLIZIZ = C1767800w6U.LIZIZ();
                Object objLIZLLL = interfaceC599750NfhLIZIZ != null ? interfaceC599750NfhLIZIZ.LIZLLL("bubble_algorithm_params", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()) : null;
                if ((objLIZLLL instanceof String) && (str4 = (String) objLIZLLL) != null && !a0.LJJJIL(str4) && (kVar2 = GsonProtectorUtils.parse(new p(), str4)) != null && (setEntrySet2 = kVar2.LJIILIIL().entrySet()) != null) {
                    Iterator<T> it2 = setEntrySet2.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        nVar.LJJIFFI((String) entry.getKey(), (k) entry.getValue());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } else {
                try {
                    InterfaceC599750Nfh interfaceC599750NfhLIZIZ2 = C1767800w6U.LIZIZ();
                    Object objLIZLLL2 = interfaceC599750NfhLIZIZ2 != null ? interfaceC599750NfhLIZIZ2.LIZLLL("bubble_algorithm_params", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()) : null;
                    if ((objLIZLLL2 instanceof String) && (str3 = (String) objLIZLLL2) != null && !a0.LJJJIL(str3)) {
                        new p();
                        Set<Map.Entry<String, k>> setEntrySet3 = p.LIZJ(str3).LJIILIIL().entrySet();
                        if (setEntrySet3 != null) {
                            Iterator<T> it3 = setEntrySet3.iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it3.next();
                                nVar.LJJIFFI((String) entry2.getKey(), (k) entry2.getValue());
                            }
                        }
                    }
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
            if (C7879035x.LIZLLL()) {
                String str5 = this.LLJJIJI;
                if (str5 != null && !a0.LJJJIL(str5) && (kVar = GsonProtectorUtils.parse(new p(), this.LLJJIJI)) != null && (setEntrySet = kVar.LJIILIIL().entrySet()) != null) {
                    Iterator<T> it4 = setEntrySet.iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it4.next();
                        nVar.LJJIFFI((String) entry3.getKey(), (k) entry3.getValue());
                    }
                }
                this.LLJJIJI = null;
                C189200o6.m2constructorimpl(Unit.LIZ);
            } else {
                try {
                    String str6 = this.LLJJIJI;
                    if (str6 != null && !a0.LJJJIL(str6)) {
                        new p();
                        Set<Map.Entry<String, k>> setEntrySet4 = p.LIZJ(this.LLJJIJI).LJIILIIL().entrySet();
                        if (setEntrySet4 != null) {
                            Iterator<T> it5 = setEntrySet4.iterator();
                            while (it5.hasNext()) {
                                Map.Entry entry4 = (Map.Entry) it5.next();
                                nVar.LJJIFFI((String) entry4.getKey(), (k) entry4.getValue());
                            }
                        }
                    }
                    this.LLJJIJI = null;
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJ(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
            C189200o6.m2constructorimpl(nVar);
            obj = nVar;
        } else {
            try {
                n nVar2 = new n();
                Aweme aweme5 = this.LLJILLL;
                nVar2.LJJIIJ("context_video_ids", aweme5 != null ? aweme5.getAid() : null);
                Aweme aweme6 = this.LLJILLL;
                nVar2.LJJIIJ("context_video_product_ids", (aweme6 == null || (listLIZIZ = C663760Q1u.LIZIZ(aweme6)) == null) ? null : C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, null, 62));
                Aweme aweme7 = this.LLJILLL;
                nVar2.LJJIIJ("context_room_ids", aweme7 != null ? C663760Q1u.LJ(aweme7) : null);
                Aweme aweme8 = this.LLJILLL;
                nVar2.LJJIIJ("context_account_ids", aweme8 != null ? AwemeExtKt.getAuthorUid(aweme8) : null);
                if (C7879035x.LIZLLL()) {
                    InterfaceC599750Nfh interfaceC599750NfhLIZIZ3 = C1767800w6U.LIZIZ();
                    Object objLIZLLL3 = interfaceC599750NfhLIZIZ3 != null ? interfaceC599750NfhLIZIZ3.LIZLLL("bubble_algorithm_params", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()) : null;
                    if ((objLIZLLL3 instanceof String) && (str2 = (String) objLIZLLL3) != null && !a0.LJJJIL(str2)) {
                        new p();
                        Set<Map.Entry<String, k>> setEntrySet5 = p.LIZJ(str2).LJIILIIL().entrySet();
                        if (setEntrySet5 != null) {
                            Iterator<T> it6 = setEntrySet5.iterator();
                            while (it6.hasNext()) {
                                Map.Entry entry5 = (Map.Entry) it6.next();
                                nVar2.LJJIFFI((String) entry5.getKey(), (k) entry5.getValue());
                            }
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } else {
                    try {
                        InterfaceC599750Nfh interfaceC599750NfhLIZIZ4 = C1767800w6U.LIZIZ();
                        Object objLIZLLL4 = interfaceC599750NfhLIZIZ4 != null ? interfaceC599750NfhLIZIZ4.LIZLLL("bubble_algorithm_params", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()) : null;
                        if ((objLIZLLL4 instanceof String) && (str = (String) objLIZLLL4) != null && !a0.LJJJIL(str)) {
                            new p();
                            Set<Map.Entry<String, k>> setEntrySet6 = p.LIZJ(str).LJIILIIL().entrySet();
                            if (setEntrySet6 != null) {
                                Iterator<T> it7 = setEntrySet6.iterator();
                                while (it7.hasNext()) {
                                    Map.Entry entry6 = (Map.Entry) it7.next();
                                    nVar2.LJJIFFI((String) entry6.getKey(), (k) entry6.getValue());
                                }
                            }
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (CancellationException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw e3;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C1AF0.LJ(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                    }
                }
                if (C7879035x.LIZLLL()) {
                    String str7 = this.LLJJIJI;
                    if (str7 != null && !a0.LJJJIL(str7)) {
                        new p();
                        Set<Map.Entry<String, k>> setEntrySet7 = p.LIZJ(this.LLJJIJI).LJIILIIL().entrySet();
                        if (setEntrySet7 != null) {
                            Iterator<T> it8 = setEntrySet7.iterator();
                            while (it8.hasNext()) {
                                Map.Entry entry7 = (Map.Entry) it8.next();
                                nVar2.LJJIFFI((String) entry7.getKey(), (k) entry7.getValue());
                            }
                        }
                    }
                    this.LLJJIJI = null;
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } else {
                    try {
                        String str8 = this.LLJJIJI;
                        if (str8 != null && !a0.LJJJIL(str8)) {
                            new p();
                            Set<Map.Entry<String, k>> setEntrySet8 = p.LIZJ(this.LLJJIJI).LJIILIIL().entrySet();
                            if (setEntrySet8 != null) {
                                Iterator<T> it9 = setEntrySet8.iterator();
                                while (it9.hasNext()) {
                                    Map.Entry entry8 = (Map.Entry) it9.next();
                                    nVar2.LJJIFFI((String) entry8.getKey(), (k) entry8.getValue());
                                }
                            }
                        }
                        this.LLJJIJI = null;
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (CancellationException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        throw e4;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C1AF0.LJ(th4);
                        C189200o6.m2constructorimpl(new C098200Yq(th4));
                    }
                }
                C189200o6.m2constructorimpl(nVar2);
                obj = nVar2;
            } catch (CancellationException e5) {
                TryCatchGuardChecker.doCheck(e5);
                throw e5;
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                C1AF0.LJ(th5);
                C098200Yq c098200Yq = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
        }
        return (n) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean DF() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1769150w8f
    public final Aweme G3() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1769150w8f
    public final InterfaceC1769710w9Z H2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean LK1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean Qt2() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean Yh1() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1769150w8f
    public final int am1() {
        return this.LL;
    }

    @Override // X.InterfaceC1769150w8f
    public final boolean qb0() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1769150w8f
    public final String tE2() {
        return this.LLILLJJLI;
    }

    public static EnumC1768940w8K yQ2(EnumC1768950w8L enumC1768950w8L) {
        int i = C1768970w8N.LIZJ[enumC1768950w8L.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return EnumC1768940w8K.UNKNOWN;
                            }
                            return EnumC1768940w8K.PITAYA_TRIGGER_IMMEDIATELY;
                        }
                        return EnumC1768940w8K.AFTER_FREEZE_TIME;
                    }
                    return EnumC1768940w8K.BYTESYNC_PUSH_RETRY;
                }
                return EnumC1768940w8K.UG_BACK_FYP_SHOW_BUBBLE;
            }
            return EnumC1768940w8K.GENERAL_SEARCH;
        }
        return EnumC1768940w8K.FEED_VIDEO_SEARCH;
    }

    @Override // X.InterfaceC1769150w8f
    public final void CI(C1769140w8e c1769140w8e) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopByteSync TooltipTask===== vm update tooltip vis: ");
        sbLIZ.append(c1769140w8e.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        setState(new AwS605S0100000_26(c1769140w8e, 271));
    }

    public final void DQ2(EnumC1769260w8q enumC1769260w8q) {
        C1769080w8Y c1769080w8Y;
        C1769030w8T c1769030w8T = this.LLJJL;
        if (c1769030w8T != null) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopByteSync ReachTask===== hide tooltip ");
            sbLIZ.append(enumC1769260w8q);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            Object obj = ((LinkedHashMap) c1769030w8T.LJIIIIZZ).get(EnumC1768880w8E.TAB_TOOLTIP);
            if ((obj instanceof C1769080w8Y) && (c1769080w8Y = (C1769080w8Y) obj) != null) {
                c1769080w8Y.LIZ(enumC1769260w8q);
            }
        }
    }

    public final void FQ2(int i) {
        C1769030w8T c1769030w8T;
        C1769080w8Y c1769080w8Y;
        C1769030w8T c1769030w8T2 = this.LLJJL;
        if (c1769030w8T2 != null && c1769030w8T2.LJ == i && (c1769030w8T = this.LLJJL) != null) {
            Object obj = ((LinkedHashMap) c1769030w8T.LJIIIIZZ).get(EnumC1768880w8E.TAB_TOOLTIP);
            if ((obj instanceof C1769080w8Y) && (c1769080w8Y = (C1769080w8Y) obj) != null) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopByteSync TooltipTask===== popup task run tooltip task tooltipPopupTaskContinuation: ");
                sbLIZ.append(c1769080w8Y.LJIILIIL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                C324990Cob.LIZIZ(c1769080w8Y.LJIILIIL);
            }
        }
    }

    @Override // X.InterfaceC1769150w8f
    public final void Ib0(C1769790w9h c1769790w9h) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopByteSync TooltipTask===== vm trigger popup task");
        setState(new AwS605S0100000_26(c1769790w9h, 268));
    }

    @Override // X.InterfaceC1769150w8f
    public final void Oc1(FetchReachCfgFlag fetchReachCfgFlag) {
        this.LLILLL = fetchReachCfgFlag;
    }

    @Override // X.InterfaceC1769150w8f
    public final void a52(C1769250w8p c1769250w8p) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopByteSync IconTask===== vm update icon state: ");
        sbLIZ.append(c1769250w8p.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        setState(new AwS605S0100000_26(c1769250w8p, 270));
    }

    @Override // X.InterfaceC1769150w8f
    public final void mJ0(C1769130w8d c1769130w8d) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopByteSync BadgeTask===== vm update badge vis: ");
        sbLIZ.append(c1769130w8d.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        setState(new AwS605S0100000_26(c1769130w8d, 269));
    }

    public final void AQ2(CustomDotResponseV2 customDotResponseV2, Pair<Boolean, String> pair) {
        String str;
        String str2;
        ReachCfg reachCfg;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  handle reachcfg");
        if (customDotResponseV2 == null) {
            C1768560w7i c1768560w7i = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.HANDLE_RESPONSE;
            EnumC1768960w8M enumC1768960w8M = EnumC1768960w8M.REQUEST_FINISH;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("reason", EnumC1768980w8O.REQUEST_FAIL.getValue()));
            c1768560w7i.getClass();
            C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, false, mapLIZJ);
            C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  request fail");
            return;
        }
        C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  request success");
        if (customDotResponseV2.waitingTime > 0) {
            this.LLJLIL = true;
            C823050WQl.LJ().schedule(new ARunnableS126S0100000_26(this, 136), customDotResponseV2.waitingTime, TimeUnit.SECONDS);
        }
        C1769030w8T c1769030w8T = this.LLJJL;
        Integer num = customDotResponseV2.uiAction;
        int value = EnumC1768910w8H.SHOW.getValue();
        if (num != null && num.intValue() == value) {
            C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  handle ui action show");
            List<ReachCfg> list = customDotResponseV2.reachConfigList;
            if (list != null && (reachCfg = (ReachCfg) C13LP.LJJJLL(list)) != null) {
                str = reachCfg.noticeId;
            } else {
                str = null;
            }
            if (c1769030w8T != null) {
                str2 = c1769030w8T.LIZLLL;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str, str2)) {
                if (c1769030w8T != null) {
                    Iterator it2 = ((LinkedHashMap) c1769030w8T.LJIIIIZZ).entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            entry.getKey();
                            if (((AbstractC1769070w8X) entry.getValue()).LJIIJ == EnumC1769280w8s.FAILED) {
                                break;
                            }
                        } else if (c1769030w8T.LJFF()) {
                            if (c1769030w8T.LIZLLL != null && c1769030w8T.LIZIZ != null) {
                                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ShopByteSync ReachCfgProcess=====  replace last reach task bring_back_info ");
                                sbLIZ.append(customDotResponseV2.bringBackInfo);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c2341109Fh.getClass();
                                C2341109Fh.LIZ(strLIZIZ);
                                c1769030w8T.LIZIZ.response.bringBackInfo = customDotResponseV2.bringBackInfo;
                            }
                        }
                    }
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  create new reach task show with same notice_id");
                    vQ2(EnumC1768910w8H.SHOW, customDotResponseV2, c1769030w8T, new Pair<>(Boolean.FALSE, null));
                } else {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZ("ShopByteSync ReachCfgProcess===== response_ignore");
                }
            } else {
                C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  create new reach task show with different notice_id");
                vQ2(EnumC1768910w8H.SHOW, customDotResponseV2, c1769030w8T, new Pair<>(Boolean.FALSE, null));
            }
        } else {
            int value2 = EnumC1768910w8H.HIDE.getValue();
            if (num != null && num.intValue() == value2) {
                C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  handle ui action hide");
                if (c1769030w8T != null && c1769030w8T.LIZLLL != null) {
                    C2341109Fh.LIZ("ShopByteSync ReachCfgProcess=====  create new reach task hide");
                    vQ2(EnumC1768910w8H.HIDE, customDotResponseV2, c1769030w8T, pair);
                } else {
                    C2341109Fh.LIZ("ShopByteSync ReachCfgProcess===== response_ignore");
                }
            }
        }
        C0S78.LIZJ(new AwS427S0200000_26(customDotResponseV2, (CustomDotResponseV2) pair, (Pair<Boolean, String>) 35), true);
    }

    @Override // X.InterfaceC1769150w8f
    public final void If1(ReachCfgDataTransfer reachCfgDataTransfer, EnumC1768880w8E enumC1768880w8E) {
        String str;
        ReachCfgDataTransfer reachCfgDataTransfer2;
        ReachCfgData reachCfgData;
        C1769030w8T c1769030w8T = this.LLJJL;
        if (c1769030w8T == null || (reachCfgDataTransfer2 = c1769030w8T.LIZIZ) == null || (reachCfgData = reachCfgDataTransfer2.reachCfgData) == null || (str = reachCfgData.bizType) == null) {
            str = "";
        }
        if (!Intrinsics.LJFF("delivery_landing", str) && reachCfgDataTransfer != null) {
            C948503nH.LJI(this, C0PEM.LIZJ, new C1768800w86(reachCfgDataTransfer, this, enumC1768880w8E, reachCfgDataTransfer, null));
        }
    }

    public final void IQ2(EnumC1768950w8L enumC1768950w8L, Map map, Function2 function2) {
        this.LLJJIJIL = Integer.valueOf(enumC1768950w8L.getValue());
        EnumC1768960w8M enumC1768960w8MLIZ = C1769000w8Q.LIZ(enumC1768950w8L);
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopByteSync ReachCfgProcess===== try request reachcfg");
        this.LLJJLIIIJLLLLLLLZ = Long.valueOf(System.currentTimeMillis());
        boolean z = this.LLJJJJ;
        this.LLJJJJ = false;
        C099G c099g = this.LLJJJJJIL;
        if (c099g != null && !c099g.isCompleted()) {
            C2341109Fh.LIZ("ShopByteSync ReachCfgProcess===== cancal last request");
            C1768560w7i c1768560w7i = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.HANDLE_RESPONSE;
            EnumC1768960w8M enumC1768960w8M = EnumC1768960w8M.REQUEST_FINISH;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("reason", EnumC1768980w8O.REQUEST_CANCEL.getValue()));
            c1768560w7i.getClass();
            C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, false, mapLIZJ);
            c099g.LIZIZ(null);
        }
        C948503nH.LJI(this, C0PEM.LIZJ, new C1768660w7s(this, enumC1768960w8MLIZ, map, function2, z, null));
    }

    public final void GQ2(boolean z, EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map<String, Object> map) {
        this.LLJL = System.currentTimeMillis();
        C099G c099g = this.LLJJJJLIIL;
        if (c099g != null && !c099g.isCompleted()) {
            c099g.LIZIZ(null);
        }
        C948503nH.LJI(this, C0PEM.LIZJ, new C1768720w7y(this, z, enumC1768950w8L, c1768850w8B, map, null));
    }

    public final void HQ2(boolean z, EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map map) {
        IEcUgLandingService iEcUgLandingService = (IEcUgLandingService) PluggableExtentionKt.pluggableSpi$default(IEcUgLandingService.class, false, false, false, 14, null);
        if ((iEcUgLandingService != null && iEcUgLandingService.LIZIZ()) || this.LLJJIJIIJIL) {
            return;
        }
        if (C7879035x.LIZLLL()) {
            IQ2(enumC1768950w8L, map, new C1768820w88(this, z, enumC1768950w8L, c1768850w8B, null));
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            IQ2(enumC1768950w8L, map, new C1768820w88(this, z, enumC1768950w8L, c1768850w8B, null));
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 >= (r3.longValue() + (r0 * ((long) com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig.DEFAULT)))) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JQ2(boolean r12, X.EnumC1768950w8L r13, X.C1768850w8B r14, java.util.Map r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2.JQ2(boolean, X.0w8L, X.0w8B, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LQ2(boolean r19, X.EnumC1768950w8L r20, X.C1768850w8B r21, java.util.Map r22) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2.LQ2(boolean, X.0w8L, X.0w8B, java.util.Map):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:14|(10:16|(1:18)|40|21|(1:29)(1:25)|26|(2:28|30)|31|34|(1:36))(1:19)|20|40|21|(7:23|29|26|(0)|31|34|(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[Catch: s -> 0x00be, TryCatch #0 {s -> 0x00be, blocks: (B:21:0x008a, B:23:0x0099, B:25:0x009d, B:26:0x00a7, B:31:0x00bb, B:29:0x00b0), top: B:40:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.EnumC1768910w8H r12, com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2 r13, X.C1769030w8T r14, kotlin.Pair<java.lang.Boolean, java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2.vQ2(X.0w8H, com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2, X.0w8T, kotlin.Pair):void");
    }

    public final void BQ2(ShopReachControlResponse shopReachControlResponse, boolean z, EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map<String, Object> map) {
        Map<String, Object> linkedHashMap;
        ReachControlData reachControlData;
        EnumC1768960w8M enumC1768960w8MLIZ = C1769000w8Q.LIZ(enumC1768950w8L);
        if (map == null) {
            linkedHashMap = new LinkedHashMap<>();
        } else {
            linkedHashMap = map;
        }
        if (shopReachControlResponse == null) {
            C1768560w7i c1768560w7i = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.TRIGGER_REQUEST;
            linkedHashMap.put("reason", EnumC1768980w8O.FREQ_CONTROL_REQ_FAIL.getValue());
            c1768560w7i.getClass();
            C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8MLIZ, false, linkedHashMap);
            return;
        }
        List<ReachControlData> list = shopReachControlResponse.reachControlDataList;
        if (list != null && (reachControlData = (ReachControlData) C13LP.LJJJLL(list)) != null && Intrinsics.LJFF(reachControlData.isPositive, Boolean.TRUE)) {
            Integer num = reachControlData.scene;
            int value = enumC1768950w8L.getValue();
            if (num != null && num.intValue() == value) {
                this.LLILLL = new FetchReachCfgFlag(true, yQ2(enumC1768950w8L), null, Boolean.FALSE);
                JQ2(z, enumC1768950w8L, c1768850w8B, map);
                return;
            }
        }
        C1768560w7i c1768560w7i2 = C1768560w7i.LIZ;
        EnumC1768570w7j enumC1768570w7j2 = EnumC1768570w7j.TRIGGER_REQUEST;
        linkedHashMap.put("reason", EnumC1768980w8O.FREQ_CONTROL_NOT_SATISFIED.getValue());
        c1768560w7i2.getClass();
        C1768560w7i.LJ(enumC1768570w7j2, enumC1768960w8MLIZ, false, linkedHashMap);
    }
}
