package com.ss.android.ugc.aweme.feed.title;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QQT;
import X.C0QSJ;
import X.C0S4J;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1350320lF8;
import X.C1354140lLI;
import X.C1354410lLj;
import X.C1354450lLn;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C2217381BqS;
import X.C278240AvO;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1349720lEA;
import X.EnumC1354360lLe;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1218670hon;
import X.InterfaceC1349690lE7;
import X.InterfaceC1354310lLZ;
import X.InterfaceC1354440lLm;
import X.InterfaceC1385905bd;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelRootFragment extends AbsFragment implements InterfaceC724530SbT, InterfaceC1385905bd, InterfaceC1218670hon, InterfaceC1354310lLZ, C0QSJ, InterfaceC1146704e9 {
    public static final C1354450lLn LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9HELIOSPCw4JSp9HCw4JSoDKSspJR08JzEKOy40JSAiPQ==";
    public C1354140lLI LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 565));
    public final AssemVMLazy LLILLL;
    public volatile InterfaceC1349690lE7 LLILZ;
    public InterfaceC1349690lE7 LLILZIL;
    public ICommentFloatAdAbility LLILZLL;
    public ICommentListAssemAbility LLIZ;
    public ICommentExposureAbility LLIZLLLIL;
    public ICommentListVMAbility LLJ;
    public IPageActionBarAbility LLJI;
    public ICommentPageContainer LLJIJIL;
    public C0QQT LLJILJIL;
    public List<InterfaceC687730QyJ> LLJILJILJ;
    public InterfaceC665370Q7z LLJILLL;
    public C0QSJ LLJJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lLn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelRootFragment.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TitlePanelRootFragment.class, "rootVM", "getRootVM()Lcom/ss/android/ugc/aweme/feed/title/vm/TitlePanelRootVM;", 0)};
        LLJJI = new Object() { // from class: X.0lLn
        };
        new C0S4J("title_panel");
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1349690lE7.class) {
            this.LLILZIL = (InterfaceC1349690lE7) obj;
            C687700QyG.LJFF(this, this.LLJILJILJ, obj, cls);
        } else if (cls == ICommentFloatAdAbility.class) {
            this.LLILZLL = (ICommentFloatAdAbility) obj;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLIZ = (ICommentListAssemAbility) obj;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLIZLLLIL = (ICommentExposureAbility) obj;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJ = (ICommentListVMAbility) obj;
        } else if (cls == IPageActionBarAbility.class) {
            this.LLJI = (IPageActionBarAbility) obj;
        } else if (cls == ICommentPageContainer.class) {
            this.LLJIJIL = (ICommentPageContainer) obj;
        } else if (cls == C0QQT.class) {
            this.LLJILJIL = (C0QQT) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class, CommentPageScope.class, TitlePanelRootScope.class, CommentRootFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1349690lE7.class) {
            return this.LLILZIL;
        }
        if (cls == ICommentFloatAdAbility.class) {
            return this.LLILZLL;
        }
        if (cls == ICommentListAssemAbility.class) {
            return this.LLIZ;
        }
        if (cls == ICommentExposureAbility.class) {
            return this.LLIZLLLIL;
        }
        if (cls == ICommentListVMAbility.class) {
            return this.LLJ;
        }
        if (cls == IPageActionBarAbility.class) {
            return this.LLJI;
        }
        if (cls == ICommentPageContainer.class) {
            return this.LLJIJIL;
        }
        if (cls == C0QQT.class) {
            return this.LLJILJIL;
        }
        return null;
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
        arrayList.add(TitlePanelRootScope.class);
        arrayList.add(CommentPageScope.class);
        arrayList.add(TitlePanelRootScope.class);
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        arrayList.add(TitlePanelRootScope.class);
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1354310lLZ
    public final void onShow() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1349690lE7.class) {
            this.LLILZIL = null;
        } else if (cls == ICommentFloatAdAbility.class) {
            this.LLILZLL = null;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLIZ = null;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJ = null;
        } else if (cls == IPageActionBarAbility.class) {
            this.LLJI = null;
        } else if (cls == ICommentPageContainer.class) {
            this.LLJIJIL = null;
        } else if (cls == C0QQT.class) {
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJILJILJ;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    public TitlePanelRootFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TitlePanelRootVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 561);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(157);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 562), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new AwS565S0100000_21((Fragment) this, 563), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 564), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
    }

    public final TitlePanelRootVM MR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (TitlePanelRootVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1349690lE7 NR() {
        /*
            r4 = this;
            X.0lE7 r0 = r4.LLILZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0lE7 r0 = r4.LLILZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJILLL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJILLL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope> r1 = com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0lE7> r0 = X.InterfaceC1349690lE7.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0lE7 r0 = (X.InterfaceC1349690lE7) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.title.TitlePanelRootFragment.NR():X.0lE7");
    }

    public final EnumC1354360lLe OR() {
        return (EnumC1354360lLe) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        InterfaceC1349690lE7 interfaceC1349690lE7NR;
        if (isResumed() && (interfaceC1349690lE7NR = NR()) != null) {
            return interfaceC1349690lE7NR.H5(EnumC1349720lEA.BACK_PRESS);
        }
        return false;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<InterfaceC1354440lLm> list;
        super.onDestroy();
        C1354410lLj c1354410lLj = MR().LLILLL;
        if (c1354410lLj != null && (list = c1354410lLj.LIZIZ) != null) {
            Iterator<InterfaceC1354440lLm> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onDestroy();
            }
        }
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) PluggableExtentionKt.pluggableSpi$default(InterceptHomeBackPressService.class, false, false, false, 14, null);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZ(this);
        }
    }

    @Override // X.InterfaceC1354310lLZ
    public final void lM(EnumC1349720lEA enumC1349720lEA) throws Throwable {
        if (!isAdded()) {
            return;
        }
        if (((Number) C278240AvO.LIZ.getValue()).intValue() == 0) {
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS121S0100000_21(this, 72));
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        setUserVisibleHint(false);
        View view3 = getView();
        if (view3 == null) {
            return;
        }
        HandlerHook.viewPost(view3, new ARunnableS121S0100000_21(this, 71));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1350320lF8 c1350320lF8;
        super.onCreate(bundle);
        if (this.LL == null) {
            this.LL = MR().LL;
        } else {
            MR().LL = this.LL;
        }
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) PluggableExtentionKt.pluggableSpi$default(InterceptHomeBackPressService.class, false, false, false, 14, null);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZJ(this);
        }
        C1354140lLI c1354140lLI = this.LL;
        if (c1354140lLI != null && (c1350320lF8 = c1354140lLI.LL) != null) {
            C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1350320lF8, C1350320lF8.class, "source_default_key");
        }
        C1354140lLI c1354140lLI2 = this.LL;
        if (c1354140lLI2 != null) {
            C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1354140lLI2, C1354140lLI.class, "source_default_key");
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new ArrayList();
        }
        ((ArrayList) this.LLJILJILJ).add(interfaceC687730QyJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a2 A[LOOP:7: B:118:0x029c->B:120:0x02a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0228  */
    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.title.TitlePanelRootFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZIZ;
        Context context = getContext();
        C19GS c19gs = null;
        if (context == null) {
            viewLIZIZ = null;
        } else {
            viewLIZIZ = C21146717pB.LIZIZ(context, R.layout.bay, viewGroup, false);
        }
        if (!(viewLIZIZ instanceof View)) {
            viewLIZIZ = null;
        }
        if (viewLIZIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
                viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZIZ;
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
