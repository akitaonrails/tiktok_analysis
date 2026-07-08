package com.ss.android.ugc.aweme.base.vm;

import X.AbstractC316870CbV;
import X.AbstractC641380PDs;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C01GW;
import X.C01N1;
import X.C054G;
import X.C05AF;
import X.C05IK;
import X.C05IL;
import X.C0IVH;
import X.C0PEM;
import X.C0V06;
import X.C0XQ7;
import X.C1206104nj;
import X.C1324005Gc;
import X.C139500g5;
import X.C139600g6;
import X.C13BV;
import X.C1559260qg8;
import X.C1559360qgI;
import X.C1564490qoZ;
import X.C1572210r11;
import X.C1572220r12;
import X.C1573030r2L;
import X.C1594860rbY;
import X.C1594880rba;
import X.C1594890rbb;
import X.C1595180rc4;
import X.C1595260rcC;
import X.C1596130rdb;
import X.C1596360rdy;
import X.C1599640rjG;
import X.C1618440sDa;
import X.C1720106oR;
import X.C1954807lC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2296808zG;
import X.C23250099c;
import X.C278480Avm;
import X.C305290Bxv;
import X.C316640Cb8;
import X.C317290CcB;
import X.C319860CgK;
import X.C452501pT;
import X.C596340NaC;
import X.C611610Nyp;
import X.C614770O9j;
import X.C626160OhC;
import X.C627660Ojc;
import X.C713200RyI;
import X.C723600SZy;
import X.C729510SjV;
import X.EnumC1582650rHr;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1455405mq;
import X.InterfaceC1594550rb3;
import X.InterfaceC1594830rbV;
import X.InterfaceC1595130rbz;
import X.InterfaceC1891350zJl;
import X.InterfaceC712570RxH;
import X.InterfaceC714040Rze;
import Y.ARunnableS102S0100000_2;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ab.SkylightLiveRefreshConfig;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS1S0221000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS87S0210000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightListViewModel extends BaseDetailShareVM<C1573030r2L, InterfaceC1891350zJl, String> implements InterfaceC712570RxH, IStoryFeedUserDataAbility<String> {
    public static final /* synthetic */ int LLLFF = 0;
    public final C1559260qg8 LLILZIL = new C1559260qg8(new C723600SZy(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), true);
    public final long LLILZLL = 600000;
    public final C054G LLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 107));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 105));
    public AnonymousClass0956 LLJI;
    public AnonymousClass0956 LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public boolean LLJILJILJ;
    public final C1594860rbY LLJILLL;
    public int LLJJ;
    public String LLJJI;
    public final Set<Integer> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public AbstractC316870CbV<String> LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public volatile InsertStory LLJJJJ;
    public volatile AbstractC316870CbV<String> LLJJJJJIL;
    public long LLJJJJLIIL;
    public final AtomicBoolean LLJJL;
    public EnumC1582650rHr LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public volatile boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public SoftReference<Function0<Unit>> LLJLL;
    public final Object LLJLLIL;
    public final AtomicBoolean LLJLLL;
    public long LLJZ;
    public int LLJZIJLIL;
    public volatile boolean LLL;
    public volatile boolean LLLF;

    @Override // X.InterfaceC712570RxH
    public final void Dl1() {
        LQ2(null);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void W20() {
        this.LLJJIJIIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // X.InterfaceC712570RxH
    public final void h21(Aweme aweme, int i, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void pF2() {
        yA1(false);
        XG().clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* bridge */ /* synthetic */ String yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return "";
    }

    @Override // X.InterfaceC712570RxH
    public final void zc1(LifecycleOwner lifecycleOwner, Function1<? super C626160OhC, Unit> function1, Function0<Unit> function0, Function1<? super Throwable, Unit> function12) {
    }

    public final InterfaceC1595130rbz FQ2() {
        return (InterfaceC1595130rbz) this.LLJ.getValue();
    }

    public final C1564490qoZ GQ2() {
        C1564490qoZ c1564490qoZ = (C1564490qoZ) this.LLILZIL.getValue();
        return c1564490qoZ == null ? new C1564490qoZ(0) : c1564490qoZ;
    }

    public final int HQ2() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    public final void RQ2() {
        C1594860rbY c1594860rbY = this.LLJILLL;
        if (c1594860rbY != null) {
            c1594860rbY.LIZ = SystemClock.elapsedRealtime();
            c1594860rbY.LIZIZ = 0L;
        }
        if (JQ2()) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = C23250099c.LIZLLL(this.LLIZ, null, null, new C1572220r12(this, null), 3);
    }

    public final void UQ2() {
        int i;
        Pair<InterfaceC1455405mq<InterfaceC1891350zJl>, Integer> pairLIZIZ = C614770O9j.LIZIZ.LIZ().LIZIZ();
        InterfaceC1455405mq<InterfaceC1891350zJl> first = pairLIZIZ.getFirst();
        int iIntValue = pairLIZIZ.getSecond().intValue();
        if (first == null || iIntValue >= first.LIZJ() || (i = C596340NaC.LIZIZ().pagedReadPageCount) <= 0) {
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startFriendsV3RemainingPagedRead: offset=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(first.LIZJ());
        C1720106oR.LJI("FeedSkylightListVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C05AF(this, first, iIntValue, i, null), 3);
    }

    public final void VQ2() {
        synchronized (this.LLJLLIL) {
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1573030r2L(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        synchronized (this.LLJLLIL) {
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJIJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJIJIL = null;
        AnonymousClass0956 anonymousClass09563 = this.LLJILJIL;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        this.LLJILJIL = null;
        super.onCleared();
    }

    public FeedSkylightListViewModel() {
        this.LLJILLL = (((Boolean) C139600g6.LIZ.getValue()).booleanValue() || ((Boolean) C139500g5.LIZ.getValue()).booleanValue()) ? new C1594860rbY() : null;
        this.LLJJI = "";
        this.LLJJIII = new LinkedHashSet();
        this.LLJJL = new AtomicBoolean(false);
        this.LLJJLIIIJLLLLLLLZ = EnumC1582650rHr.REFRESH;
        this.LLJL = "auto";
        this.LLJLLIL = new Object();
        this.LLJLLL = new AtomicBoolean(false);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean He1() {
        return C713200RyI.LIZIZ(this);
    }

    public final boolean JQ2() {
        return (HQ2() == 2) && C0IVH.LIZIZ() && !C305290Bxv.LIZIZ();
    }

    public final boolean KQ2() {
        return HQ2() == 0 && C319860CgK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Qd2() {
        return C713200RyI.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean m82() {
        return C713200RyI.LIZ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void manualListRefresh() {
        RQ2();
        super.manualListRefresh();
        this.LLJJLIIIJLLLLLLLZ = EnumC1582650rHr.AUTO_REFRESH;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        RQ2();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean Hu1() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final int UW1() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final Set<Integer> XG() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final AbstractC316870CbV<String> Yl1() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final /* bridge */ /* synthetic */ String bK2() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final boolean mB0() {
        return this.LLJJIJI;
    }

    public final void IQ2(InterfaceC1594830rbV interfaceC1594830rbV) {
        if (interfaceC1594830rbV != null && !Intrinsics.LJFF(interfaceC1594830rbV, C1594890rbb.LIZ)) {
            if (Intrinsics.LJFF(interfaceC1594830rbV, C1594880rba.LIZ)) {
                if (JQ2()) {
                    return;
                }
                if (!this.LLJJJIL) {
                    OQ2(this, EnumC1582650rHr.POLLING, "auto", false, null, null, 28);
                    return;
                } else {
                    RQ2();
                    return;
                }
            }
            if (interfaceC1594830rbV instanceof C0V06) {
                long j = ((C0V06) interfaceC1594830rbV).LIZ;
                if (!JQ2()) {
                    AnonymousClass0956 anonymousClass0956 = this.LLJI;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LLJI = C23250099c.LIZLLL(this.LLIZ, null, null, new C1572210r11(j, this, null), 3);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void LQ2(String str) {
        boolean z;
        if (C596340NaC.LIZIZ().isEnabled) {
            if (this.LLJLLL.compareAndSet(false, true)) {
                if (KQ2()) {
                    Pair<List<InterfaceC1891350zJl>, Integer> pairLJFF = C614770O9j.LIZIZ.LIZ().LJFF();
                    List<InterfaceC1891350zJl> first = pairLJFF.getFirst();
                    int iIntValue = pairLJFF.getSecond().intValue();
                    if (C596340NaC.LIZIZ().pagedReadPageCount > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (first != null && !first.isEmpty()) {
                        DQ2(first, true);
                        WQ2(new AwS87S0210000_2(this, (FeedSkylightListViewModel) first, (List<? extends InterfaceC1891350zJl>) z, true));
                    } else {
                        WQ2(new AwS568S0100000_24(this, 1753));
                    }
                    if (!C1206104nj.LIZ()) {
                        iIntValue = -2;
                    } else if (first != null && !first.isEmpty()) {
                        iIntValue = 2;
                    }
                    C1599640rjG.LIZIZ.Mu(iIntValue);
                    return;
                }
                C05IL c05ilLIZJ = C614770O9j.LIZIZ.LJII().LIZJ(HQ2());
                if (c05ilLIZJ == null) {
                    return;
                }
                int i = C596340NaC.LIZIZ().pagedReadPageCount;
                if (i > 0) {
                    C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1324005Gc(this, c05ilLIZJ, i, null), 3);
                    return;
                } else {
                    C23250099c.LIZLLL(getAssemVMScope(), null, null, new C05IK(c05ilLIZJ, this, null), 3);
                    return;
                }
            }
            return;
        }
        if (KQ2()) {
            AwS173S1100000_24 awS173S1100000_24 = new AwS173S1100000_24(this, str, 17);
            if (C278480Avm.LIZ()) {
                awS173S1100000_24.invoke();
                return;
            } else {
                C23250099c.LIZLLL(this.LLIZ, null, null, new C01N1(awS173S1100000_24, null), 3);
                return;
            }
        }
        C23250099c.LIZLLL(this.LLIZ, null, null, new C611610Nyp(this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void SO0(int i) {
        this.LLJJ = i;
    }

    public final void SQ2(boolean z) {
        this.LLJJJ = z;
    }

    public final void WQ2(Function0<Unit> function0) {
        boolean z;
        if (C278480Avm.LIZ()) {
            synchronized (this.LLJLLIL) {
                try {
                    z = this.LLJLILLLLZIIL;
                } finally {
                }
            }
            if (z) {
                function0.invoke();
                return;
            } else {
                this.LLJLIL = true;
                this.LLJLL = new SoftReference<>(function0);
                return;
            }
        }
        if (C596340NaC.LIZIZ().isEnabled) {
            synchronized (this.LLJLLIL) {
                try {
                    if (this.LLJLILLLLZIIL) {
                        function0.invoke();
                    } else {
                        new ArrayList().add(new ARunnableS102S0100000_2(function0, 15));
                    }
                } finally {
                }
            }
            return;
        }
        function0.invoke();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void fm2(boolean z) {
        SQ2(z);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void h60(int i) {
        C713200RyI.LIZLLL(this, i);
    }

    @Override // X.InterfaceC712570RxH
    public final void ll0(AbstractC641380PDs abstractC641380PDs) {
        setState(new AwS603S0100000_24(abstractC641380PDs, 29));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 28));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        if (HQ2() == 1 && C596340NaC.LIZIZ().isEnabled) {
            LQ2("");
        }
        if ((HQ2() != 0 || !C319860CgK.LIZ()) && this.LLJJJJJIL != null) {
            AbstractC316870CbV<String> abstractC316870CbV = this.LLJJJJJIL;
            this.LLJJJJJIL = null;
            this.LLL = true;
            if (abstractC316870CbV == null) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                C13BV c13bv = C13BV.INSTANCE;
                c317290CcB.getClass();
                return new C316640Cb8(c13bv);
            }
            return abstractC316870CbV;
        }
        if (FQ2().LJIIL()) {
            C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJJI = FQ2().LJJI();
            if (c1595260rcCLJJI != null) {
                return CQ2(c1595260rcCLJJI, true);
            }
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            C13BV c13bv2 = C13BV.INSTANCE;
            c317290CcB2.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(c13bv2);
            this.LLJJL.compareAndSet(true, false);
            return c316640Cb8;
        }
        boolean z = this.LLJILJILJ;
        this.LLJILJILJ = false;
        boolean zLJI = MethodIDManager.LJI(196720);
        Object objMQ2 = MQ2(true, "", null, z, null, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objMQ2;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1596360rdy) {
            C1596360rdy c1596360rdy = (C1596360rdy) interfaceC1891350zJl;
            if (C729510SjV.LJJII(c1596360rdy.LLILLJJLI)) {
                return null;
            }
            Aweme aweme = c1596360rdy.LLILLJJLI;
            C1618440sDa.LIZIZ.LJJIIJ().LIZ(aweme);
            return aweme;
        }
        if (!(interfaceC1891350zJl instanceof SkylightFollowingUserItem)) {
            return null;
        }
        return ((SkylightFollowingUserItem) interfaceC1891350zJl).aweme;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility
    public final void yA1(boolean z) {
        this.LLJJIJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Type inference failed for: r0v24, types: [T extends java.util.List<? extends X.0zJl>, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T extends java.util.List<? extends X.0zJl>, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T extends java.util.List<? extends X.0zJl>, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T extends java.util.List<? extends X.0zJl>, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0Nxb] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T extends java.util.List<? extends X.0zJl>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC316870CbV<java.lang.String> CQ2(X.C1595260rcC<? extends java.util.List<? extends X.InterfaceC1891350zJl>> r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel.CQ2(X.0rcC, boolean):X.0CbV");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022a A[PHI: r3
      0x022a: PHI (r3v7 int) = (r3v4 int), (r3v9 int) binds: [B:111:0x0227, B:99:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182 A[PHI: r3
      0x0182: PHI (r3v15 int) = (r3v12 int), (r3v17 int) binds: [B:78:0x017f, B:66:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(java.util.List<? extends X.InterfaceC1891350zJl> r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel.DQ2(java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int EQ2(int i, Aweme aweme) {
        C1596360rdy c1596360rdy;
        Aweme aweme2;
        String strLJIIIZ = C729510SjV.LJIIIZ(aweme);
        ITEM itemListGetAt = listGetAt(i);
        String strLJIIIZ2 = null;
        if ((itemListGetAt instanceof C1596360rdy) && (c1596360rdy = (C1596360rdy) itemListGetAt) != null && (aweme2 = c1596360rdy.LLILLJJLI) != null) {
            strLJIIIZ2 = C729510SjV.LJIIIZ(aweme2);
        }
        if (Intrinsics.LJFF(strLJIIIZ, strLJIIIZ2)) {
            return i;
        }
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll != 0) {
            int i2 = 0;
            for (ITEM item : listListGetAll) {
                if ((item instanceof InterfaceC714040Rze) && Intrinsics.LJFF(C729510SjV.LJIIIZ(((InterfaceC714040Rze) item).getStoryCollection()), C729510SjV.LJIIIZ(aweme))) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: PQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C1595120rby
            r4 = r11
            if (r0 == 0) goto L73
            r10 = r13
            X.0rby r10 = (X.C1595120rby) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r10.LLILLL = r2
        L13:
            java.lang.Object r1 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L79
            X.C155000ia.LIZIZ(r1)
        L23:
            r0 = r1
            X.0CbV r0 = (X.AbstractC316870CbV) r0
            r4.LLJJIJIL = r0
            return r1
        L29:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.LLJJL
            r0 = 0
            r1.set(r0)
            boolean r0 = r4.LLJJJ
            if (r0 == 0) goto L4b
            X.0rbz r0 = r4.FQ2()
            boolean r0 = r0 instanceof X.C1596050rdT
            if (r0 == 0) goto L4b
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0CbW r1 = new X.0CbW
            java.lang.String r0 = "no need load more"
            r1.<init>(r0)
            return r1
        L4b:
            r6 = r12
            int r0 = r6.length()
            if (r0 == 0) goto L81
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 != 0) goto L81
            r10.LLILLL = r3
            r0 = 196720(0x30070, float:2.75663E-40)
            boolean r0 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r7 = 0
            r5 = 0
            r8 = r5
            r9 = r7
            java.lang.Object r1 = r4.MQ2(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L70
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L70:
            if (r1 != r2) goto L23
            return r2
        L73:
            X.0rby r10 = new X.0rby
            r10.<init>(r4, r13)
            goto L13
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L81:
            X.0rcC r0 = new X.0rcC
            X.0rcI r1 = X.EnumC1595320rcI.SUCCESS
            X.13BV r2 = X.C13BV.INSTANCE
            java.lang.String r3 = r4.LLJJI
            r4 = 0
            r6 = 0
            r10 = 496(0x1f0, float:6.95E-43)
            r5 = r4
            r7 = r6
            r8 = r6
            r9 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.0CbV r0 = r0.LIZ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void TQ2(List<? extends InterfaceC1891350zJl> list, boolean z) {
        C1596130rdb c1596130rdb = C1596130rdb.LIZ;
        int iHQ2 = HQ2();
        c1596130rdb.getClass();
        if (!C1596130rdb.LJIIIIZZ(iHQ2) && !this.LLL) {
            if (z) {
                this.LLL = true;
                C614770O9j.LIZIZ.LJ().LJ(HQ2(), list);
            }
            setStateImmediate(new AwS603S0100000_24(list, (List<? extends InterfaceC1594550rb3>) 30));
            listSetItems(list);
            return;
        }
        this.LLJLL = null;
    }

    @Override // X.InterfaceC712570RxH
    public final void sA1(int i, Aweme aweme, boolean z, boolean z2) {
        setState(new AwS1S0221000_24(aweme, i, this, z, z2, 0));
    }

    /* JADX WARN: Path cross not found for [B:39:0x00de, B:49:0x0156], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0098 -> B:31:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x00a0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object QQ2(X.InterfaceC1455405mq<X.InterfaceC1891350zJl> r12, int r13, int r14, java.lang.String r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel.QQ2(X.05mq, int, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171 A[Catch: all -> 0x017e, TryCatch #6 {all -> 0x017e, blocks: (B:75:0x0163, B:80:0x016c, B:82:0x0171), top: B:120:0x0163 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(boolean r30, java.lang.String r31, X.C1595180rc4 r32, boolean r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r35) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel.MQ2(boolean, java.lang.String, X.0rc4, boolean, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    public static void OQ2(FeedSkylightListViewModel feedSkylightListViewModel, EnumC1582650rHr enumC1582650rHr, String str, boolean z, C1595180rc4 c1595180rc4, InsertStory insertStory, int i) {
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        String str2 = null;
        if ((i & 8) != 0) {
            c1595180rc4 = null;
        }
        if ((i & 16) != 0) {
            insertStory = null;
        }
        if (feedSkylightListViewModel.HQ2() != 1 && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        if (enumC1582650rHr == EnumC1582650rHr.LIVE_HIGH_VALUE_FOLLOW_RELATIONSHIP) {
            long j = feedSkylightListViewModel.LLJJJJLIIL;
            if (j <= 0) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ont refresh --- ");
                sbLIZ.append(feedSkylightListViewModel.LLJJJJLIIL);
                C1720106oR.LJI("FeedSkylightListVM", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (System.currentTimeMillis() - j < ((SkylightLiveRefreshConfig) C1559360qgI.LIZIZ.getValue()).refreshInterval * LSPassThroughRecordSizeConfig.DEFAULT) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ont refresh ---not outOfRefreshInterval ");
                sbLIZ2.append(feedSkylightListViewModel.LLJJJJLIIL);
                C1720106oR.LJI("FeedSkylightListVM", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        if (!C278480Avm.LIZ() || feedSkylightListViewModel.HQ2() != 0 || !C319860CgK.LIZ()) {
            if (c1595180rc4 != null) {
                str2 = c1595180rc4.LIZ;
            }
            feedSkylightListViewModel.LQ2(str2);
        }
        feedSkylightListViewModel.LLJJL.set(true);
        if (!z) {
            feedSkylightListViewModel.RQ2();
        }
        feedSkylightListViewModel.LLJILJILJ = z;
        feedSkylightListViewModel.LLJJLIIIJLLLLLLLZ = enumC1582650rHr;
        feedSkylightListViewModel.LLJL = str;
        feedSkylightListViewModel.LLJJJJ = insertStory;
        feedSkylightListViewModel.LLJJJJLIIL = System.currentTimeMillis();
        if (c1595180rc4 != null) {
            z2 = c1595180rc4.LIZJ;
        }
        feedSkylightListViewModel.LLLF = z2;
        super.manualListRefresh();
    }
}
