package com.ss.android.ugc.aweme.explore.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C054700Hx;
import X.C07CG;
import X.C07MS;
import X.C0HU6;
import X.C0PEM;
import X.C1085640eME;
import X.C1086520eNe;
import X.C11NJ;
import X.C11PQ;
import X.C1216500hlI;
import X.C1220000hqw;
import X.C1342130l1v;
import X.C1388190mED;
import X.C1391600mJi;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C15438062q;
import X.C1558520qew;
import X.C15TA;
import X.C15UA;
import X.C1697810uHb;
import X.C16G1;
import X.C16GX;
import X.C1841580y1U;
import X.C1841600y1W;
import X.C1841690y1f;
import X.C1841760y1m;
import X.C1845850y8N;
import X.C1845910y8T;
import X.C1845970y8Z;
import X.C1846010y8d;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C20553115bd;
import X.C20673315v1;
import X.C20673415v2;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2153908cD;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C288830BTt;
import X.C418440Gaw;
import X.C426770GoN;
import X.C450720Hlu;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C717610SCx;
import X.C717620SCy;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1084780eKq;
import X.EnumC1235690iGF;
import X.EnumC1845820y8K;
import X.InterfaceC1554640qYg;
import X.InterfaceC1841670y1d;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC586170Myt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS127S0100000_27;
import Y.ARunnableS16S1200000_11;
import Y.ARunnableS25S0100100_27;
import Y.ARunnableS32S0201000_27;
import Y.ARunnableS88S0200000_19;
import Y.ARunnableS8S0300100_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.explore.assem.dm.ExploreDMGroupCell;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreTopicTabMonitor;
import com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol;
import com.ss.android.ugc.aweme.explore.topic.protocol.ExploreTopicGeneralFeedProtocol;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.ss.android.ugc.aweme.explore.vm.ExploreTabStateVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS41S0000100_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS74S0100100_27;
import kotlin.jvm.internal.AwS78S0210000_27;
import kotlin.jvm.internal.AwS9S1000100_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreViewPagerComponent extends UIContentAssem implements InterfaceC469360Ias, InterfaceC586170Myt, ExploreManageTabAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public C16GX LLIZLLLIL;
    public FrameLayout LLJ;
    public C1845970y8Z LLJI;
    public FrameLayout LLJIJIL;
    public C20553115bd LLJILJIL;
    public C1846010y8d LLJILJILJ;
    public TuxIconView LLJILLL;
    public C1841600y1W LLJJ;
    public long LLJJIJIL;
    public ExploreCustomTopicResponse LLJJJIL;
    public boolean LLJJJJ;
    public Long LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public AwS74S0100100_27 LLJL;
    public int LLJLIL;
    public final int LLJLLIL;
    public C21647019ng LLJLLL;
    public final AssemVMLazy LLJZ;
    public final C736950SvV LLJZIJLIL;
    public final C01GW LLL;
    public List<ExploreCustomTopicResponse> LLJJI = new ArrayList();
    public List<IExploreTopicTabProtocol> LLJJIII = new ArrayList();
    public final C11PQ<Boolean> LLJJIJI = new C11PQ<>();
    public final C11NJ LLJJIJIIJIL = new C11NJ();
    public final Set<Long> LLJJJ = new LinkedHashSet();
    public final C0HU6 LLJLILLLLZIIL = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f));
    public final String LLJLL = "APP_BAR_ANIMATION_TAG";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExploreViewPagerComponent.class, "pageStateOwnerVM", "getPageStateOwnerVM()Lcom/ss/android/ugc/aweme/explore/vm/ExploreTabStateVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void OE1() {
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final Rect TT0() {
        C1845850y8N c1845850y8NLJ;
        C1845910y8T c1845910y8T;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        C1846010y8d c1846010y8d = this.LLJILJILJ;
        if (c1846010y8d != null && (c1845850y8NLJ = c1846010y8d.LJ(0)) != null && (c1845910y8T = c1845850y8NLJ.LJ) != null) {
            c1845910y8T.getGlobalVisibleRect(rect);
        }
        C16GX c16gx = this.LLIZLLLIL;
        int measuredHeight = c16gx != null ? c16gx.getMeasuredHeight() : rect.height();
        LJJIJL().getLocationOnScreen(iArr);
        int i = rect.left;
        int i2 = iArr[1];
        return new Rect(i, i2, rect.right, measuredHeight + i2);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void mp2() {
        No(false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1098231754) {
            return null;
        }
        return this;
    }

    public final ExploreTabStateVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (ExploreTabStateVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void Z6() {
        Vo(0L);
    }

    public final boolean ap() {
        Long l;
        C07CG.LIZ.getClass();
        if (C07CG.LIZ()) {
            return true;
        }
        if (((ArrayList) this.LLJJI).isEmpty()) {
            return false;
        }
        return (((ArrayList) this.LLJJI).size() == 1 && (l = ((ExploreCustomTopicResponse) C13LP.LJJJJZI(this.LLJJI)).topicId) != null && l.longValue() == 0) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void cm2() {
        C16GX c16gx = this.LLIZLLLIL;
        float y = c16gx != null ? c16gx.getY() : 0.0f;
        if (!ap() || y >= 0.0f) {
            return;
        }
        Ho(true, true);
    }

    public final void dp() {
        ExploreCustomTopicDataSource.Companion.getClass();
        C1841760y1m.LIZ.updateLatestTopicResult(this.LLJJI);
    }

    public final void ep() {
        C07CG.LIZ.getClass();
        if (C07CG.LIZ()) {
            this.LLJJIJI.onNext(Boolean.TRUE);
        } else if (C07MS.LIZ()) {
            this.LLJJIJI.onNext(Boolean.valueOf(ap()));
        } else {
            this.LLJJIJI.onNext(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final ExploreCustomTopicResponse yB1() {
        ExploreCustomTopicResponse next;
        Iterator<ExploreCustomTopicResponse> it2 = this.LLJJI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Long l = next.topicId;
            long j = this.LLJJIJIL;
            if (l != null && l.longValue() == j) {
                break;
            }
        }
        return next;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final String zR1() {
        Long l;
        if (this.LLJJJIL != null) {
            return "topic_popup_page";
        }
        ExploreCustomTopicResponse exploreCustomTopicResponseYB1 = yB1();
        return (exploreCustomTopicResponseYB1 == null || (l = exploreCustomTopicResponseYB1.topicId) == null || l.longValue() != 0) ? "subtab" : "main_page";
    }

    public ExploreViewPagerComponent() {
        int iLIZIZ;
        C07CG.LIZ.getClass();
        if (C07CG.LIZ()) {
            C1085640eME c1085640eME = C1846010y8d.LLJL;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        }
        this.LLJLLIL = iLIZIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreTabStateVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1398);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(57);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 1399), aFwS269S0000000_27, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJZ = assemVMLazy;
        AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(102);
        this.LLJZIJLIL = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), aFwS216S0000000_27, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS269S0000000_27.get$arr$(58), new AwS563S0100000_19((AbstractC738140SxQ) this, 1400), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(101));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJIIJIL.LJ();
        IAccountService iAccountService = (IAccountService) this.LLL.getValue();
        if (iAccountService != null) {
            iAccountService.LJI(this);
        }
        C1846010y8d c1846010y8d = this.LLJILJILJ;
        if (c1846010y8d != null) {
            c1846010y8d.LLJIJIL.clear();
        }
        C20553115bd c20553115bd = this.LLJILJIL;
        if (c20553115bd != null) {
            c20553115bd.removeOnPageChangeListener(this);
        }
        Jo().LLJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ExploreCustomTopicDataSource.Companion.getClass();
        C1841760y1m.LIZ.syncCustomTopics();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final ExploreCustomTopicResponse SC0() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final List<IExploreTopicTabProtocol> z02() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final List<ExploreCustomTopicResponse> zV0() {
        return this.LLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void A80(List<ExploreCustomTopicResponse> list) {
        int iIntValue;
        ArrayList arrayList = new ArrayList(list);
        this.LLJJI = arrayList;
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(arrayList);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            Pair pair = new Pair(((ExploreCustomTopicResponse) indexedValue.LIZIZ).topicId, Integer.valueOf(indexedValue.LIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.LLJJIII = new ArrayList(C13LP.LJLLLL(new Comparator() { // from class: X.0y1V
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iIntValue2;
                Integer num = (Integer) linkedHashMap.get(Long.valueOf(((IExploreTopicTabProtocol) t).getTabId()));
                int iIntValue3 = 0;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Integer numValueOf = Integer.valueOf(iIntValue2);
                Integer num2 = (Integer) linkedHashMap.get(Long.valueOf(((IExploreTopicTabProtocol) t2).getTabId()));
                if (num2 != null) {
                    iIntValue3 = num2.intValue();
                }
                return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue3));
            }
        }, this.LLJJIII));
        Integer num = (Integer) linkedHashMap.get(Long.valueOf(this.LLJJIJIL));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C1846010y8d c1846010y8d = this.LLJILJILJ;
        if (c1846010y8d != null) {
            c1846010y8d.setShouldDisableScrollAnimate$explore_release(true);
        }
        hp(true, Integer.valueOf(iIntValue), false);
        dp();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void GD(ExploreCustomTopicResponse exploreCustomTopicResponse) {
        this.LLJJJIL = exploreCustomTopicResponse;
    }

    public final void No(boolean z) {
        TuxIconView tuxIconView;
        if (!C07MS.LIZ() || !ap()) {
            return;
        }
        C1216500hlI.LIZIZ();
        if (C1216500hlI.LIZ().getBoolean("manage_menu_guide_shown", false) || this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        int size = ((ArrayList) this.LLJJI).size() - 1;
        if ((size <= 3 && (!z || size < 2)) || (tuxIconView = this.LLJILLL) == null || tuxIconView.getVisibility() != 0) {
            return;
        }
        HandlerHook.viewPost(tuxIconView, new ARunnableS88S0200000_19(this, tuxIconView, 10));
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void QC2(CopyOnWriteArrayList<ExploreCustomTopicResponse> copyOnWriteArrayList) throws JSONException {
        if (!C07MS.LIZ()) {
            return;
        }
        ExploreTopicTabMonitor.INSTANCE.isSuccess(true);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1841580y1U(copyOnWriteArrayList, this, null), 2);
    }

    public final void Vo(long j) {
        C20553115bd c20553115bd;
        Iterator<ExploreCustomTopicResponse> it2 = this.LLJJI.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Long l = it2.next().topicId;
            if (l != null && l.longValue() == j) {
                if (i >= 0 && (c20553115bd = this.LLJILJIL) != null) {
                    HandlerHook.viewPost(c20553115bd, new ARunnableS32S0201000_27(i, c20553115bd, this, 2));
                    return;
                }
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zo(boolean r8) {
        /*
            r7 = this;
            android.widget.FrameLayout r2 = r7.LLJ
            r6 = 0
            if (r2 == 0) goto L15
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 == 0) goto Lac
            X.16GZ r1 = (X.C16GZ) r1
            if (r8 == 0) goto La9
            r0 = 5
        L10:
            r1.LIZ = r0
            X.C786410Ut5.W5(r2, r1)
        L15:
            r1 = 1
            if (r8 != 0) goto L1f
            X.16GX r0 = r7.LLIZLLLIL
            if (r0 == 0) goto L1f
            r0.LJ(r1, r6, r1)
        L1f:
            X.16GX r0 = r7.LLIZLLLIL
            r4 = 0
            if (r0 == 0) goto La7
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
        L28:
            boolean r0 = r5 instanceof X.C16G1
            if (r0 == 0) goto La4
            X.16G1 r5 = (X.C16G1) r5
            if (r5 == 0) goto La5
            X.16BC r1 = r5.LIZ
        L32:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.explore.ui.animation.FixedThresholdAppBarBehavior
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.explore.ui.animation.FixedThresholdAppBarBehavior r1 = (com.ss.android.ugc.aweme.explore.ui.animation.FixedThresholdAppBarBehavior) r1
            if (r1 == 0) goto L3c
            r1.LIZIZ = r8
        L3c:
            X.08cD r3 = X.C2153908cD.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[setAppBarScrollable] scrollable="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " clpFound="
            r2.append(r0)
            if (r5 == 0) goto La0
            r0 = 1
        L52:
            r2.append(r0)
            java.lang.String r0 = " behaviorFound="
            r2.append(r0)
            if (r1 == 0) goto L5d
            r6 = 1
        L5d:
            r2.append(r6)
            java.lang.String r0 = " applyThreshold="
            r2.append(r0)
            if (r1 == 0) goto L9e
            boolean r0 = r1.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L6d:
            r2.append(r0)
            java.lang.String r0 = " tabFlags="
            r2.append(r0)
            android.widget.FrameLayout r0 = r7.LLJ
            if (r0 == 0) goto L9c
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L7d:
            boolean r0 = r1 instanceof X.C16GZ
            if (r0 == 0) goto L8b
            X.16GZ r1 = (X.C16GZ) r1
            if (r1 == 0) goto L8b
            int r0 = r1.LIZ
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L8b:
            r2.append(r4)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            r3.getClass()
            r1 = 3
            java.lang.String r0 = "explore_vp_component"
            X.C2153908cD.LIZJ(r1, r2, r0)
            return
        L9c:
            r1 = r4
            goto L7d
        L9e:
            r0 = r4
            goto L6d
        La0:
            r0 = 0
            goto L52
        La2:
            r1 = r4
            goto L3c
        La4:
            r5 = r4
        La5:
            r1 = r4
            goto L32
        La7:
            r5 = r4
            goto L28
        La9:
            r0 = 0
            goto L10
        Lac:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent.Zo(boolean):void");
    }

    public final void bp(long j) {
        C1846010y8d c1846010y8d;
        C1845850y8N c1845850y8NLJ;
        C1845910y8T c1845910y8T;
        this.LLJJLIIIJLLLLLLLZ = false;
        C1216500hlI.LIZIZ();
        if (C1216500hlI.LIZ().getBoolean("ug_pin_first_guide_shown", false) || !ap()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
        int i = 0;
        while (it2.hasNext()) {
            Long l = ((ExploreCustomTopicResponse) it2.next()).topicId;
            if (l != null && l.longValue() == j) {
                if (i >= 0 && (c1846010y8d = this.LLJILJILJ) != null && (c1845850y8NLJ = c1846010y8d.LJ(i)) != null && (c1845910y8T = c1845850y8NLJ.LJ) != null) {
                    C1216500hlI.LIZ().storeBoolean("ug_pin_first_guide_shown", true);
                    C450720Hlu c450720Hlu = new C450720Hlu(LJJIJL().getContext());
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LIZIZ = c1845910y8T;
                    c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                    c450720Hlu.LLILZ = LJJIJL().getContext().getString(2131829913);
                    c450720Hlu.LLILLJJLI.LJII = 3000L;
                    c450720Hlu.LIZIZ().show();
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void cp(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        C16G1 c16g1;
        C20553115bd c20553115bd = this.LLJILJIL;
        if (c20553115bd != null) {
            layoutParams = c20553115bd.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C16G1) {
            c16g1 = (C16G1) layoutParams;
        } else {
            c16g1 = null;
        }
        if (z) {
            C16GX c16gx = this.LLIZLLLIL;
            if (c16gx != null && c16gx.getVisibility() == 0) {
                return;
            }
            if (c16g1 != null) {
                c16g1.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
            }
            C16GX c16gx2 = this.LLIZLLLIL;
            if (c16gx2 != null) {
                C786410Ut5.LLZZZZ(c16gx2, 0);
            }
            C16GX c16gx3 = this.LLIZLLLIL;
            if (c16gx3 != null) {
                c16gx3.setExpanded(true);
            }
            C16GX c16gx4 = this.LLIZLLLIL;
            if (c16gx4 == null) {
                return;
            }
            HandlerHook.viewPost(c16gx4, new ARunnableS127S0100000_27(this, 16));
            return;
        }
        C16GX c16gx5 = this.LLIZLLLIL;
        if (c16gx5 == null || c16gx5.getVisibility() != 0) {
            return;
        }
        if (c16g1 != null) {
            c16g1.LIZIZ(null);
        }
        C16GX c16gx6 = this.LLIZLLLIL;
        if (c16gx6 != null) {
            C786410Ut5.LLZZZZ(c16gx6, 8);
        }
        C16GX c16gx7 = this.LLIZLLLIL;
        if (c16gx7 == null) {
            return;
        }
        c16gx7.setExpanded(false);
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void onNodeHide(Bundle bundle) {
        ExploreCustomTopicDataSource.Companion.getClass();
        C1841760y1m.LIZ.syncCustomTopics();
        ExploreTabStateVM exploreTabStateVMJo = Jo();
        Keva keva = C15UA.LIZ;
        C15UA.LIZIZ = UUID.randomUUID().toString();
        if (!exploreTabStateVMJo.LLILZ) {
            long jCurrentTimeMillis = System.currentTimeMillis() - exploreTabStateVMJo.LLILLJJLI;
            C15TA c15ta = C15TA.LIZ;
            Long l = exploreTabStateVMJo.LLILZIL;
            String str = exploreTabStateVMJo.LLILZLL;
            int i = exploreTabStateVMJo.LLIZ;
            String str2 = exploreTabStateVMJo.LLILLL;
            String value = EnumC1084780eKq.EXIT_EXPLORE.getValue();
            c15ta.getClass();
            C15TA.LJII(i, jCurrentTimeMillis, l, str, str2, value);
            exploreTabStateVMJo.LLILZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void onNodeShow(Bundle bundle) {
        boolean z;
        C19EG c19egLIZIZ;
        Intent intent;
        ExploreLynxParams exploreLynxParams;
        Long l;
        boolean z2;
        if (Intrinsics.LJFF(bundle.getString("enterMethod", null), "publish_landing")) {
            Vo(0L);
        }
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (intent = c19egLIZIZ.getIntent()) != null && (exploreLynxParams = (ExploreLynxParams) intent.getParcelableExtra("explore_lynx_params")) != null && (l = exploreLynxParams.lynxJumpInterestId) != null) {
            final long jLongValue = l.longValue();
            z = true;
            if (exploreLynxParams.lynxIsPinTopic) {
                z2 = true;
            } else {
                z2 = false;
            }
            final String str = exploreLynxParams.lynxJumpInterestName;
            if (z2 && C07MS.LIZ() && jLongValue != -1 && str != null && !a0.LJJJIL(str)) {
                HandlerHook.viewPost(LJJIJL(), new Runnable() { // from class: X.0hlU
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ExploreViewPagerComponent@6933.onNodeShow$1$1");
                        try {
                            ExploreViewPagerComponent exploreViewPagerComponent = this.LL;
                            long j = jLongValue;
                            String str2 = str;
                            if (exploreViewPagerComponent.LLJJJJ) {
                                exploreViewPagerComponent.Lo(Long.valueOf(j), str2);
                            } else {
                                exploreViewPagerComponent.LLJJJJJIL = Long.valueOf(j);
                                exploreViewPagerComponent.LLJJJJLIIL = str2;
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.onNodeShow$1$1");
                    }
                });
            } else {
                Vo(0L);
                z = false;
                HandlerHook.viewPost(LJJIJL(), new ARunnableS119S0100000_19(this, 57));
            }
        } else {
            z = false;
            HandlerHook.viewPost(LJJIJL(), new ARunnableS119S0100000_19(this, 57));
        }
        ExploreTabStateVM exploreTabStateVMJo = Jo();
        C15TA.LIZ.getClass();
        String value = C15TA.LJJIFFI;
        if (Intrinsics.LJFF(C15TA.LJIILL, EnumC1845820y8K.SLIDE.getValue())) {
            value = C15TA.LJIILL;
        } else if (value == null) {
            value = EnumC1845820y8K.CLICK_EXPLORE.getValue();
        }
        if (z) {
            exploreTabStateVMJo.LLJI = value;
        } else {
            C15TA.LJI(exploreTabStateVMJo.LLIZ, exploreTabStateVMJo.LLILZIL, exploreTabStateVMJo.LLILZLL, value, exploreTabStateVMJo.LLIZLLLIL);
        }
        exploreTabStateVMJo.LLILLL = value;
        exploreTabStateVMJo.LLILLJJLI = System.currentTimeMillis();
        exploreTabStateVMJo.LLILZ = false;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLJLIL = i;
        if (i == 0 && C288830BTt.LIZ()) {
            ((AssemViewModel) this.LLJZIJLIL.getValue()).setState(AFwS269S0000000_27.get$arr$(380));
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        long jLongValue;
        EnumC1845820y8K enumC1845820y8K;
        C1086520eNe c1086520eNeLP2;
        C1086520eNe c1086520eNeLP22;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2;
        StaggeredGridLayoutManager staggeredGridLayoutManager3;
        int iLJJIII;
        StaggeredGridLayoutManager staggeredGridLayoutManager4;
        StaggeredGridLayoutManager staggeredGridLayoutManager5;
        StaggeredGridLayoutManager staggeredGridLayoutManager6;
        EnumC1084780eKq enumC1084780eKq;
        Object next;
        Object next2;
        ExploreCustomTopicResponse exploreCustomTopicResponse = (ExploreCustomTopicResponse) ListProtector.get(this.LLJJI, i);
        Long l = exploreCustomTopicResponse.topicId;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLJJIJIL;
        }
        this.LLJJIJIL = jLongValue;
        Long l2 = exploreCustomTopicResponse.topicId;
        if (l2 != null) {
            l2.longValue();
            Iterator it2 = ((ArrayList) this.LLJJI).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((ExploreCustomTopicResponse) next).topicId, l2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ExploreCustomTopicResponse exploreCustomTopicResponse2 = (ExploreCustomTopicResponse) next;
            if (exploreCustomTopicResponse2 != null && Intrinsics.LJFF(exploreCustomTopicResponse2.hasRedPoint, Boolean.TRUE)) {
                exploreCustomTopicResponse2.setHasRedPoint(Boolean.FALSE);
                Iterator it3 = ((ArrayList) this.LLJJIII).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (((IExploreTopicTabProtocol) next2).getTabId() == l2.longValue()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                IExploreTopicTabProtocol iExploreTopicTabProtocol = (IExploreTopicTabProtocol) next2;
                if (iExploreTopicTabProtocol != null) {
                    iExploreTopicTabProtocol.Ih1();
                }
                C1846010y8d c1846010y8d = this.LLJILJILJ;
                if (c1846010y8d != null) {
                    Go(this, c1846010y8d);
                }
                dp();
            }
        }
        ExploreTabStateVM exploreTabStateVMJo = Jo();
        Long l3 = exploreCustomTopicResponse.topicId;
        String str = exploreCustomTopicResponse.topicName;
        boolean zLJFF = Intrinsics.LJFF(exploreCustomTopicResponse.hasRedPoint, Boolean.TRUE);
        if (exploreTabStateVMJo.LL == 0.0f) {
            enumC1845820y8K = EnumC1845820y8K.CLICK_SUB;
        } else {
            enumC1845820y8K = EnumC1845820y8K.SLIDE;
        }
        String value = enumC1845820y8K.getValue();
        C15TA c15ta = C15TA.LIZ;
        c15ta.getClass();
        String str2 = C15TA.LJJI;
        C15TA.LJJI = null;
        if (str2 == null) {
            String str3 = exploreTabStateVMJo.LLJI;
            if (str3 != null) {
                exploreTabStateVMJo.LLJI = null;
                value = str3;
            }
            str2 = value;
        }
        if (!Intrinsics.LJFF(l3, exploreTabStateVMJo.LLILZIL)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - exploreTabStateVMJo.LLILLJJLI;
            Long l4 = exploreTabStateVMJo.LLILZIL;
            String str4 = exploreTabStateVMJo.LLILZLL;
            int i2 = exploreTabStateVMJo.LLIZ;
            String str5 = exploreTabStateVMJo.LLILLL;
            if (l3 != null && l3.longValue() == 0) {
                enumC1084780eKq = EnumC1084780eKq.TO_MAIN_PAGE;
            } else {
                enumC1084780eKq = EnumC1084780eKq.TO_OTHER_SUBTAB;
            }
            String value2 = enumC1084780eKq.getValue();
            c15ta.getClass();
            C15TA.LJII(i2, jCurrentTimeMillis, l4, str4, str5, value2);
            AwS606S0100000_27 awS606S0100000_27 = exploreTabStateVMJo.LLJ;
            if (awS606S0100000_27 != null) {
                awS606S0100000_27.invoke(exploreTabStateVMJo.LLILZIL);
            }
            C15TA.LJI(i, l3, str, str2, zLJFF);
            exploreTabStateVMJo.LLILLL = str2;
            exploreTabStateVMJo.LLILLJJLI = System.currentTimeMillis();
            exploreTabStateVMJo.LLILZIL = l3;
            exploreTabStateVMJo.LLILZLL = str;
            exploreTabStateVMJo.LLIZ = i;
            exploreTabStateVMJo.LLIZLLLIL = zLJFF;
        }
        ((AssemViewModel) this.LLJZIJLIL.getValue()).setState(new AwS606S0100000_27((ExploreTopBannerData) null, 370));
        ((AssemViewModel) this.LLJZIJLIL.getValue()).setState(new AwS606S0100000_27(exploreCustomTopicResponse.topicId, 369));
        C16GX c16gx = this.LLIZLLLIL;
        if (c16gx != null) {
            c16gx.LJ(true, false, true);
        }
        MiddleBridgeCellAbility middleBridgeCellAbility = (MiddleBridgeCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MiddleBridgeCellAbility.class, String.valueOf(this.LLJJIJIL));
        if (middleBridgeCellAbility != null) {
            c1086520eNeLP2 = middleBridgeCellAbility.lP2();
        } else {
            c1086520eNeLP2 = null;
        }
        int iLJJIII2 = 2;
        if (c1086520eNeLP2 != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager6 = (StaggeredGridLayoutManager) layoutManager) != null) {
                iLJJIII = staggeredGridLayoutManager6.LJJIII();
            } else {
                iLJJIII = 2;
            }
            int[] iArr = new int[iLJJIII];
            int[] iArr2 = new int[iLJJIII];
            RecyclerView.LayoutManager layoutManager2 = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager2 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager5 = (StaggeredGridLayoutManager) layoutManager2) != null) {
                staggeredGridLayoutManager5.LJIJ(iArr);
            }
            int iLJJJJZI = C13LQ.LJJJJZI(iArr);
            RecyclerView.LayoutManager layoutManager3 = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager3 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager4 = (StaggeredGridLayoutManager) layoutManager3) != null) {
                staggeredGridLayoutManager4.LJIJJ(iArr2);
            }
            int iLJJJJLI = C13LQ.LJJJJLI(iArr2);
            if (iLJJJJZI >= 0 && iLJJJJLI >= 0 && iLJJJJLI >= iLJJJJZI && iLJJJJZI <= iLJJJJLI) {
                while (true) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = c1086520eNeLP2.findViewHolderForLayoutPosition(iLJJJJZI);
                    if (!(viewHolderFindViewHolderForLayoutPosition instanceof ExploreFeedCell)) {
                        viewHolderFindViewHolderForLayoutPosition = null;
                    }
                    ExploreFeedCell exploreFeedCell = (ExploreFeedCell) viewHolderFindViewHolderForLayoutPosition;
                    if (exploreFeedCell != null) {
                        TuxIconDrawable tuxIconDrawable = ExploreFeedCell.LLLF;
                        exploreFeedCell.k7(false);
                    }
                    if (iLJJJJZI == iLJJJJLI) {
                        break;
                    } else {
                        iLJJJJZI++;
                    }
                }
            }
        }
        MiddleBridgeCellAbility middleBridgeCellAbility2 = (MiddleBridgeCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MiddleBridgeCellAbility.class, String.valueOf(this.LLJJIJIL));
        if (middleBridgeCellAbility2 != null && (c1086520eNeLP22 = middleBridgeCellAbility2.lP2()) != null) {
            RecyclerView.LayoutManager layoutManager4 = c1086520eNeLP22.getLayoutManager();
            if ((layoutManager4 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager3 = (StaggeredGridLayoutManager) layoutManager4) != null) {
                iLJJIII2 = staggeredGridLayoutManager3.LJJIII();
            }
            int[] iArr3 = new int[iLJJIII2];
            int[] iArr4 = new int[iLJJIII2];
            RecyclerView.LayoutManager layoutManager5 = c1086520eNeLP22.getLayoutManager();
            if ((layoutManager5 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager5) != null) {
                staggeredGridLayoutManager2.LJIJ(iArr3);
            }
            int iLJJJJZI2 = C13LQ.LJJJJZI(iArr3);
            RecyclerView.LayoutManager layoutManager6 = c1086520eNeLP22.getLayoutManager();
            if ((layoutManager6 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager6) != null) {
                staggeredGridLayoutManager.LJIJJ(iArr4);
            }
            int iLJJJJLI2 = C13LQ.LJJJJLI(iArr4);
            if (iLJJJJZI2 < 0 || iLJJJJLI2 < 0 || iLJJJJLI2 < iLJJJJZI2 || iLJJJJZI2 > iLJJJJLI2) {
                return;
            }
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition2 = c1086520eNeLP22.findViewHolderForLayoutPosition(iLJJJJZI2);
                if (!(viewHolderFindViewHolderForLayoutPosition2 instanceof ExploreDMGroupCell)) {
                    viewHolderFindViewHolderForLayoutPosition2 = null;
                }
                ExploreDMGroupCell exploreDMGroupCell = (ExploreDMGroupCell) viewHolderFindViewHolderForLayoutPosition2;
                if (exploreDMGroupCell != null) {
                    int i3 = ExploreDMGroupCell.LLJILLL;
                    exploreDMGroupCell.L5(false);
                }
                if (iLJJJJZI2 != iLJJJJLI2) {
                    iLJJJJZI2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent.onViewCreated(android.view.View):void");
    }

    public static void Go(ExploreViewPagerComponent exploreViewPagerComponent, C1846010y8d c1846010y8d) {
        Object obj;
        long jLongValue;
        CharSequence charSequence;
        Long l;
        int i;
        exploreViewPagerComponent.getClass();
        int tabCount = c1846010y8d.getTabCount();
        if (tabCount >= 0) {
            int i2 = 0;
            while (true) {
                C1845850y8N c1845850y8NLJ = c1846010y8d.LJ(i2);
                if (c1845850y8NLJ != null) {
                    String strMc = ((IExploreTopicTabProtocol) ListProtector.get(exploreViewPagerComponent.LLJJIII, i2)).mc(c1846010y8d.getContext());
                    long tabId = ((IExploreTopicTabProtocol) ListProtector.get(exploreViewPagerComponent.LLJJIII, i2)).getTabId();
                    boolean zZt2 = ((IExploreTopicTabProtocol) ListProtector.get(exploreViewPagerComponent.LLJJIII, i2)).zt2();
                    c1845850y8NLJ.LIZ(strMc);
                    c1845850y8NLJ.LIZ = Long.valueOf(tabId);
                    C1845910y8T c1845910y8T = c1845850y8NLJ.LJ;
                    if (c1845910y8T != null) {
                        C426770GoN c426770GoN = c1845910y8T.LLILZ;
                        if (c426770GoN != null) {
                            if (zZt2) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            C786410Ut5.LLLLLLIL(c426770GoN, i);
                        }
                        if (zZt2 && c1845910y8T.getRootView().getVisibility() == 8) {
                            C426770GoN c426770GoN2 = c1845910y8T.LLILZ;
                            if (c426770GoN2 != null) {
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426770GoN2);
                                c426770GoN2.setAlpha(0.0f);
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(350L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1845910y8T, 4));
                            valueAnimatorOfFloat.start();
                            C1845850y8N c1845850y8N = c1845910y8T.LL;
                            if (c1845850y8N != null && c1845850y8N.LJFF) {
                                C15TA c15ta = C15TA.LIZ;
                                Integer numValueOf = null;
                                if (c1845850y8N != null) {
                                    obj = c1845850y8N.LIZ;
                                } else {
                                    obj = null;
                                }
                                if ((obj instanceof Long) && (l = (Long) obj) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                Long lValueOf = Long.valueOf(jLongValue);
                                C1845850y8N c1845850y8N2 = c1845910y8T.LL;
                                if (c1845850y8N2 != null) {
                                    charSequence = c1845850y8N2.LIZIZ;
                                } else {
                                    charSequence = null;
                                }
                                String strValueOf = String.valueOf(charSequence);
                                C1845850y8N c1845850y8N3 = c1845910y8T.LL;
                                if (c1845850y8N3 != null) {
                                    numValueOf = Integer.valueOf(c1845850y8N3.LIZJ);
                                }
                                c15ta.getClass();
                                List<Long> list = C15TA.LJIIIZ;
                                if (!C13LP.LJJJJ(lValueOf, list)) {
                                    C15TA.LJIILL(new ARunnableS16S1200000_11(numValueOf, strValueOf, lValueOf, 14));
                                    if (lValueOf != null) {
                                        lValueOf.longValue();
                                        ((ArrayList) list).add(lValueOf);
                                    }
                                }
                            }
                        }
                    }
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("assembleCustomTabView ===> i===> ");
                    sbLIZ.append(i2);
                    sbLIZ.append(" tabName ");
                    sbLIZ.append(strMc);
                    sbLIZ.append(", tabId ");
                    sbLIZ.append(tabId);
                    sbLIZ.append(", tabHasRedPoint ");
                    sbLIZ.append(zZt2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2153908cD.getClass();
                    C2153908cD.LIZJ(3, strLIZIZ, "explore_vp_component");
                }
                if (i2 != tabCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static boolean Oo(List list, final Function1 function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            return list.removeIf(new Predicate() { // from class: X.0y8R
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) function1.invoke(obj)).booleanValue();
                }
            });
        }
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public final void Ho(boolean z, boolean z2) {
        C16GX c16gx = this.LLIZLLLIL;
        if (c16gx == null) {
            return;
        }
        C21647019ng c21647019ng = this.LLJLLL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gx);
            c16gx.setAlpha(0.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gx);
            c16gx.setTranslationY(-this.LLJLLIL);
            ViewGroup.LayoutParams layoutParams = c16gx.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.LLJLLIL;
                C786410Ut5.W5(c16gx, layoutParams);
                cp(true);
                if (z2) {
                    c16gx.setExpanded(true);
                }
                f2 = 1.0f;
                f = 0.0f;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C20673415v2 c20673415v2 = new C20673415v2(null, null, Float.valueOf(f), Float.valueOf(f2), null, null, null, null, null, null, 4047);
        C20673315v1 c20673315v1 = C20673315v1.LIZ;
        String str = this.LLJLL;
        Context context = getContext();
        if (context == null) {
            context = LJJIJL().getContext();
        }
        C0HU6 c0hu6 = this.LLJLILLLLZIIL;
        AwS78S0210000_27 awS78S0210000_27 = new AwS78S0210000_27(c16gx, this, z, 1);
        AwS78S0210000_27 awS78S0210000_272 = new AwS78S0210000_27(c16gx, this, z, 2);
        c20673315v1.getClass();
        C21647019ng c21647019ngLIZ = C20673315v1.LIZ(str, context, c16gx, c0hu6, c20673415v2, awS78S0210000_27, awS78S0210000_272);
        this.LLJLLL = c21647019ngLIZ;
        if (c21647019ngLIZ != null) {
            c21647019ngLIZ.LJI(true);
        }
    }

    public final void Lo(Long l, String str) {
        C19EG c19egLIZIZ;
        Intent intent;
        ExploreLynxParams exploreLynxParams;
        MiddleBridgeCellAbility middleBridgeCellAbility;
        C20553115bd c20553115bd;
        if (C07MS.LIZ() && l != null && l.longValue() != -1) {
            boolean z = false;
            if (lT1(l.longValue(), str)) {
                Iterator it2 = ((ArrayList) this.LLJJI).iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((ExploreCustomTopicResponse) it2.next()).topicId, l)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0 && (c20553115bd = this.LLJILJIL) != null && c20553115bd.getCurrentItem() == i) {
                    z = true;
                }
                Vo(l.longValue());
                if (z) {
                    ExploreTabStateVM exploreTabStateVMJo = Jo();
                    String value = EnumC1845820y8K.CLICK_EXPLORE.getValue();
                    String str2 = exploreTabStateVMJo.LLJI;
                    if (str2 != null) {
                        exploreTabStateVMJo.LLJI = null;
                        value = str2;
                    }
                    C15TA c15ta = C15TA.LIZ;
                    Long l2 = exploreTabStateVMJo.LLILZIL;
                    String str3 = exploreTabStateVMJo.LLILZLL;
                    int i2 = exploreTabStateVMJo.LLIZ;
                    boolean z2 = exploreTabStateVMJo.LLIZLLLIL;
                    c15ta.getClass();
                    C15TA.LJI(i2, l2, str3, value, z2);
                    exploreTabStateVMJo.LLILLL = value;
                    exploreTabStateVMJo.LLILLJJLI = System.currentTimeMillis();
                } else {
                    Context context = getContext();
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (intent = c19egLIZIZ.getIntent()) != null && (exploreLynxParams = (ExploreLynxParams) intent.getParcelableExtra("explore_lynx_params")) != null && (middleBridgeCellAbility = (MiddleBridgeCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MiddleBridgeCellAbility.class, l.toString())) != null) {
                        middleBridgeCellAbility.rh1(exploreLynxParams);
                    }
                }
                So(l.longValue(), true);
                return;
            }
            k00(l.longValue(), str);
            So(l.longValue(), false);
        }
    }

    public final void So(final long j, boolean z) {
        C1846010y8d c1846010y8d = this.LLJILJILJ;
        if (c1846010y8d == null) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C16GX c16gx = this.LLIZLLLIL;
        if (c16gx != null && c16gx.getTranslationY() != 0.0f) {
            this.LLJL = new AwS74S0100100_27(j, this, 0);
            return;
        }
        if (z) {
            C20553115bd c20553115bd = this.LLJILJIL;
            if (c20553115bd == null) {
                HandlerHook.viewPost(c1846010y8d, new ARunnableS25S0100100_27(j, this, 0));
                return;
            } else {
                HandlerHook.viewPost(c20553115bd, new ARunnableS8S0300100_27(j, this, c20553115bd, c1846010y8d, 0));
                return;
            }
        }
        c1846010y8d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0y8P
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                this.bp(j);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void k00(final long j, String str) {
        EnumC1084780eKq enumC1084780eKq;
        float y;
        boolean z;
        final C1846010y8d c1846010y8d;
        ExploreCustomTopicResponse exploreCustomTopicResponse;
        Long l;
        if (((ArrayList) this.LLJJI).size() > 15 && (exploreCustomTopicResponse = (ExploreCustomTopicResponse) C13LP.LJJLIIIJL(this.LLJJI)) != null && (l = exploreCustomTopicResponse.topicId) != null) {
            long jLongValue = l.longValue();
            if (jLongValue != 0) {
                String strValueOf = exploreCustomTopicResponse.topicName;
                if (strValueOf == null || !(!a0.LJJJIL(strValueOf))) {
                    strValueOf = String.valueOf(jLongValue);
                }
                this.LLJJL = strValueOf;
                List<ExploreCustomTopicResponse> list = this.LLJJI;
                ListProtector.remove(list, C1697810uHb.LJIIJ(list));
                Oo(this.LLJJIII, new AwS41S0000100_27(jLongValue, 5));
                Jo().vQ2(jLongValue);
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AwS74S0100100_27 awS74S0100100_27 = new AwS74S0100100_27(jLongValue, exploreCustomTopicResponse, 1);
                c2153908cD.getClass();
                C2153908cD.LIZIZ("explore_vp_component", awS74S0100100_27);
            }
        }
        ExploreTabStateVM exploreTabStateVMJo = Jo();
        String value = EnumC1845820y8K.PIN.getValue();
        C15TA c15ta = C15TA.LIZ;
        c15ta.getClass();
        String str2 = C15TA.LJJI;
        C15TA.LJJI = null;
        if (str2 == null) {
            String str3 = exploreTabStateVMJo.LLJI;
            if (str3 != null) {
                exploreTabStateVMJo.LLJI = null;
                value = str3;
            }
            str2 = value;
        }
        Long l2 = exploreTabStateVMJo.LLILZIL;
        if (l2 == null || j != l2.longValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - exploreTabStateVMJo.LLILLJJLI;
            int i = exploreTabStateVMJo.LLIZ;
            Long l3 = exploreTabStateVMJo.LLILZIL;
            String str4 = exploreTabStateVMJo.LLILZLL;
            String str5 = exploreTabStateVMJo.LLILLL;
            if (j == 0) {
                enumC1084780eKq = EnumC1084780eKq.TO_MAIN_PAGE;
            } else {
                enumC1084780eKq = EnumC1084780eKq.TO_OTHER_SUBTAB;
            }
            String value2 = enumC1084780eKq.getValue();
            c15ta.getClass();
            C15TA.LJII(i, jCurrentTimeMillis, l3, str4, str5, value2);
            AwS606S0100000_27 awS606S0100000_27 = exploreTabStateVMJo.LLJ;
            if (awS606S0100000_27 != null) {
                awS606S0100000_27.invoke(exploreTabStateVMJo.LLILZIL);
            }
            C15TA.LJI(1, Long.valueOf(j), str, str2, false);
            exploreTabStateVMJo.LLILLL = str2;
            exploreTabStateVMJo.LLILLJJLI = System.currentTimeMillis();
            exploreTabStateVMJo.LLILZIL = Long.valueOf(j);
            exploreTabStateVMJo.LLILZLL = str;
            exploreTabStateVMJo.LLIZ = 1;
            exploreTabStateVMJo.LLIZLLLIL = false;
        }
        ExploreTopicGeneralFeedProtocol exploreTopicGeneralFeedProtocol = new ExploreTopicGeneralFeedProtocol(j, str);
        boolean zAp = ap();
        ListProtector.add(this.LLJJIII, 1, exploreTopicGeneralFeedProtocol);
        ListProtector.add(this.LLJJI, 1, new ExploreCustomTopicResponse(str, Long.valueOf(j), Boolean.FALSE, null));
        C16GX c16gx = this.LLIZLLLIL;
        if (c16gx != null) {
            y = c16gx.getY();
        } else {
            y = 0.0f;
        }
        if (zAp == ap() && y >= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        C1846010y8d c1846010y8d2 = this.LLJILJILJ;
        if (c1846010y8d2 != null) {
            c1846010y8d2.setShouldDisableScrollAnimate$explore_release(true);
        }
        hp(false, 1, z);
        final String str6 = this.LLJJL;
        if (str6 != null) {
            this.LLJJL = null;
            if (!C1216500hlI.LIZ().getBoolean("ug_remove_pin_limit_guide", false)) {
                C1216500hlI.LIZIZ();
                if (C1216500hlI.LIZ().getBoolean("ug_pin_first_guide_shown", false) && (c1846010y8d = this.LLJILJILJ) != null) {
                    c1846010y8d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0y8I
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            C1845850y8N c1845850y8NLJ;
                            C1845910y8T c1845910y8T;
                            view.removeOnLayoutChangeListener(this);
                            Iterator it2 = ((ArrayList) this.LL.LLJJI).iterator();
                            int i10 = 0;
                            while (it2.hasNext()) {
                                Long l4 = ((ExploreCustomTopicResponse) it2.next()).topicId;
                                long j2 = j;
                                if (l4 != null && l4.longValue() == j2) {
                                    if (i10 >= 0 && (c1845850y8NLJ = c1846010y8d.LJ(i10)) != null && (c1845910y8T = c1845850y8NLJ.LJ) != null) {
                                        C1216500hlI.LIZ().storeBoolean("ug_remove_pin_limit_guide", true);
                                        C450720Hlu c450720Hlu = new C450720Hlu(this.LL.LJJIJL().getContext());
                                        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                                        c1391600mJi.LIZIZ = c1845910y8T;
                                        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                                        c450720Hlu.LLILZ = this.LL.LJJIJL().getContext().getString(2131829918, str6);
                                        c450720Hlu.LLILLJJLI.LJII = 3000L;
                                        c450720Hlu.LIZIZ().show();
                                        return;
                                    }
                                    return;
                                }
                                i10++;
                            }
                        }
                    });
                }
            }
        }
        dp();
        C2153908cD c2153908cD2 = C2153908cD.LIZ;
        AwS9S1000100_2 awS9S1000100_2 = new AwS9S1000100_2(str, j, 1);
        c2153908cD2.getClass();
        C2153908cD.LIZIZ("explore_vp_component", awS9S1000100_2);
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final boolean lT1(long j, String str) {
        Long l;
        for (ExploreCustomTopicResponse exploreCustomTopicResponse : this.LLJJI) {
            if (Intrinsics.LJFF(exploreCustomTopicResponse.topicName, str) || ((l = exploreCustomTopicResponse.topicId) != null && l.longValue() == j)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility
    public final void wK(long j, String str) {
        boolean z;
        Integer num;
        boolean zAp = ap();
        Iterator it2 = ((ArrayList) this.LLJJIII).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((IExploreTopicTabProtocol) it2.next()).getTabId() == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        Iterator it3 = ((ArrayList) this.LLJJI).iterator();
        int i2 = 0;
        while (true) {
            if (it3.hasNext()) {
                Long l = ((ExploreCustomTopicResponse) it3.next()).topicId;
                if (l != null && l.longValue() == j) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        boolean zOo = Oo(this.LLJJIII, new AwS41S0000100_27(j, 3));
        boolean zOo2 = Oo(this.LLJJI, new AwS41S0000100_27(j, 4));
        if (i != -1 && i2 != -1 && i2 == i) {
            Jo().vQ2(j);
            if (zAp != ap()) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLJJIJIL == j) {
                num = 0;
            } else {
                num = null;
            }
            C1846010y8d c1846010y8d = this.LLJILJILJ;
            if (c1846010y8d != null) {
                c1846010y8d.setShouldDisableScrollAnimate$explore_release(true);
            }
            hp(false, num, z);
            dp();
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS9S1000100_2 awS9S1000100_2 = new AwS9S1000100_2(str, j, 0);
            c2153908cD.getClass();
            C2153908cD.LIZIZ("explore_vp_component", awS9S1000100_2);
            return;
        }
        C2153908cD c2153908cD2 = C2153908cD.LIZ;
        C054700Hx c054700Hx = new C054700Hx(zOo, zOo2);
        c2153908cD2.getClass();
        C2153908cD.LIZ("explore_vp_component", c054700Hx);
    }

    public final void hp(final boolean z, Integer num, boolean z2) {
        C1841600y1W c1841600y1W;
        final C20553115bd c20553115bd;
        PagerAdapter adapter;
        int count;
        C1841600y1W c1841600y1W2 = this.LLJJ;
        if (c1841600y1W2 == null) {
            c1841600y1W = null;
        } else {
            c1841600y1W = c1841600y1W2;
        }
        List<ExploreCustomTopicResponse> list = this.LLJJI;
        List<IExploreTopicTabProtocol> list2 = this.LLJJIII;
        c1841600y1W.LLIZ = list;
        c1841600y1W.LLIZLLLIL = list2;
        if (c1841600y1W2 == null) {
            c1841600y1W2 = null;
        }
        c1841600y1W2.notifyDataSetChanged();
        C1846010y8d c1846010y8d = this.LLJILJILJ;
        if (c1846010y8d != null) {
            Go(this, c1846010y8d);
        }
        if (num != null && (c20553115bd = this.LLJILJIL) != null && (adapter = c20553115bd.getAdapter()) != null && (count = adapter.getCount()) > 0) {
            final int iLJ = C13LZ.LJ(num.intValue(), 0, count - 1);
            HandlerHook.viewPost(c20553115bd, new Runnable() { // from class: X.0KjJ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    int count2;
                    C1C7U.LIZ("ExploreViewPagerComponent@6933.updateViewPager$1$1");
                    try {
                        PagerAdapter adapter2 = c20553115bd.getAdapter();
                        if (adapter2 != null && (count2 = adapter2.getCount()) > 0) {
                            c20553115bd.setCurrentItem(C13LZ.LJ(iLJ, 0, count2 - 1), z);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreViewPagerComponent@6933.updateViewPager$1$1");
                }
            });
        }
        if (z2) {
            Ho(ap(), false);
        }
        ep();
        HandlerHook.viewPost(LJJIJL(), new ARunnableS119S0100000_19(this, 186));
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        Jo().LL = f;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z && i == 1) {
            this.LLJJJJ = false;
            ExploreCustomTopicDataSource.Companion.getClass();
            ExploreCustomTopicDataSource exploreCustomTopicDataSource = C1841760y1m.LIZ;
            exploreCustomTopicDataSource.onAccountChange();
            exploreCustomTopicDataSource.fetchUserCustomTopics();
            InterfaceC1841670y1d fetchInRAMJob = exploreCustomTopicDataSource.getFetchInRAMJob();
            if (fetchInRAMJob != null && fetchInRAMJob.isActive()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1841690y1f(this, null), 3);
            }
        }
    }
}
