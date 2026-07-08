package com.ss.android.ugc.aweme.upvote.detail.repostshare;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C1110404Vy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1355210lN1;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16BC;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20742216Eq;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355220lN2;
import X.InterfaceC1363000lZa;
import X.InterfaceC1366280les;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1355200lN0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostSharePanel extends BaseFragment implements InterfaceC724530SbT, InterfaceC1363000lZa, InterfaceC1352000lHq {
    public static final C1355210lN1 LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWsoLDHELIOSsyISliOyojJzY4OicyOiBiGyojJzY4GicyOiAcKCE2JA==";
    public Aweme LLIZ;
    public UpvoteStruct LLIZLLLIL;
    public RepostReplyStruct LLJ;
    public boolean LLJI;
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public InterfaceC1355220lN2 LLJILLL;
    public UpvoteStruct LLJJ;
    public boolean LLJJI;
    public Function0<Unit> LLJJIII;
    public Fragment LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public TuxSheet LLJJIJIL;
    public C16BC LLJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJIL;
    public C20742216Eq LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public InterfaceC1366280les LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostSharePanel.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/upvote/detail/repostshare/ShareRepostViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLILLLLZIIL = new C1355210lN1();
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        ViewTreeObserver viewTreeObserver;
        this.LLJJL = 0;
        FrameLayout frameLayout = this.LLJJJJJIL;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1355200lN0 viewTreeObserverOnGlobalLayoutListenerC1355200lN0 = new ViewTreeObserverOnGlobalLayoutListenerC1355200lN0(this, "", false);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1355200lN0);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1355200lN0, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1363000lZa
    public final void sd() {
        IRepostInternalShareAbility iRepostInternalShareAbility = (IRepostInternalShareAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostInternalShareAbility.class, null);
        if (iRepostInternalShareAbility != null) {
            iRepostInternalShareAbility.UB1();
        }
    }

    public RepostSharePanel() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareRepostViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 1056);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(273);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1057), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new AwS565S0100000_21((Fragment) this, 1058), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1059), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIIJIL = assemVMLazy;
        this.LLJLIL = true;
    }

    public final ShareRepostViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (ShareRepostViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1363000lZa
    public final void gF(boolean z) {
        Boolean boolValueOf;
        ViewTreeObserver viewTreeObserver;
        int i;
        boolean z2;
        FrameLayout frameLayout = this.LLJJJJJIL;
        if (frameLayout != null) {
            if (frameLayout.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.valueOf(z))) {
            FrameLayout frameLayout2 = this.LLJJJJJIL;
            if (frameLayout2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, frameLayout2);
            }
            FrameLayout frameLayout3 = this.LLJJJJJIL;
            if (frameLayout3 != null && (viewTreeObserver = frameLayout3.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1355200lN0 viewTreeObserverOnGlobalLayoutListenerC1355200lN0 = new ViewTreeObserverOnGlobalLayoutListenerC1355200lN0(this, "", false);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1355200lN0);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1355200lN0, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    @Override // X.InterfaceC1363000lZa
    public final void h(boolean z) {
        String str;
        ViewTreeObserver viewTreeObserver;
        if (this.LLJJLIIIJLLLLLLLZ != z) {
            this.LLJJLIIIJLLLLLLLZ = z;
            if (z) {
                str = "group_show";
            } else {
                str = "group_hide";
            }
            FrameLayout frameLayout = this.LLJJJJJIL;
            if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1355200lN0 viewTreeObserverOnGlobalLayoutListenerC1355200lN0 = new ViewTreeObserverOnGlobalLayoutListenerC1355200lN0(this, str, false);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1355200lN0);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1355200lN0, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        ViewTreeObserver viewTreeObserver;
        C19EG activity = getActivity();
        if (activity != null) {
            int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = i - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(activity);
            C1110404Vy.LIZ().LIZIZ(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight, true);
            this.LLJJL = iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
            FrameLayout frameLayout = this.LLJJJJJIL;
            if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1355200lN0 viewTreeObserverOnGlobalLayoutListenerC1355200lN0 = new ViewTreeObserverOnGlobalLayoutListenerC1355200lN0(this, "", false);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1355200lN0);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1355200lN0, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            View view = getView();
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanel.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View decorView;
        Window window;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i70, viewGroup, false);
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        Context context = getContext();
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(context, decorView);
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
