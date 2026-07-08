package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
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
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1729710v73;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardImagesFragment extends Fragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyMmLSsvLD19LSYjJCI2OiYpJSYlLWHELIOSsvJiI+JytiKzogISspOjx9LSMqLCwnemsOICM/KiotOysaJSQrLDwVOiQrJCo9PA==";
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public FrameLayout LLILLL;
    public InterfaceC1729710v73 LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BillboardImagesFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ImageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BillboardImagesFragment.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public BillboardImagesFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ImageListViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 739);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(336);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 740), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 741), aFwS268S0000000_26, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 742), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(c19719912DlLIZ2, 743);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(337);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 744), aFwS268S0000000_262, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new AwS570S0100000_26((Fragment) this, 745), aFwS268S0000000_262, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 738), aFwS268S0000000_262, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLILZLL = assemVMLazy2;
    }

    public final BillboardGlobalViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final ImageListViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (ImageListViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ImageListViewModel imageListViewModelNR = NR();
        imageListViewModelNR.LLILZLL.clear();
        imageListViewModelNR.vQ2();
        imageListViewModelNR.setStateImmediate(new AwS605S0100000_26(imageListViewModelNR, 606));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[PHI: r2
      0x0039: PHI (r2v4 android.view.View) = (r2v3 android.view.View), (r2v9 android.view.View) binds: [B:5:0x0023, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[PHI: r2
      0x005c: PHI (r2v6 android.view.View) = (r2v5 android.view.View), (r2v7 android.view.View) binds: [B:13:0x0045, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r0 = r13
            r1 = r12
            r4 = r11
            super.onViewCreated(r1, r0)
            kotlin.jvm.internal.AwS600S0100000_21 r2 = new kotlin.jvm.internal.AwS600S0100000_21
            r0 = 133(0x85, float:1.86E-43)
            r2.<init>(r4, r0)
            r1 = 3
            r0 = 0
            r3 = 0
            X.C723850SaN.LIZ(r4, r0, r3, r2, r1)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel r0 = r4.MR()
            X.002o r0 = r0.getState()
            X.0v5t r0 = (X.C1728990v5t) r0
            boolean r0 = r0.LLILLJJLI
            if (r0 == 0) goto L66
            com.bytedance.tux.input.TuxTextView r2 = r4.LL
            if (r2 != 0) goto L39
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto Lae
            r0 = 2131396263(0x7f0a86a7, float:1.8413262E38)
            android.view.View r2 = r1.findViewById(r0)
        L32:
            r0 = r2
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r4.LL = r0
            if (r2 == 0) goto L43
        L39:
            g1c.AjS70S0100000_26 r1 = new g1c.AjS70S0100000_26
            r0 = 22
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L43:
            com.bytedance.tux.icon.TuxIconView r2 = r4.LLILLJJLI
            if (r2 != 0) goto L5c
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L54
            r0 = 2131377233(0x7f0a3c51, float:1.8374664E38)
            android.view.View r3 = r1.findViewById(r0)
        L54:
            r0 = r3
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r4.LLILLJJLI = r0
            r2 = r3
            if (r3 == 0) goto L66
        L5c:
            g1c.AjS70S0100000_26 r1 = new g1c.AjS70S0100000_26
            r0 = 23
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L66:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel r2 = r4.NR()
            X.0wBP r5 = X.C736820SvI.LIZJ()
            X.0v6y r3 = new X.C2217381BqS() { // from class: X.0v6y
                static {
                    /*
                        X.0v6y r0 = new X.0v6y
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0v6y) X.0v6y.LL X.0v6y
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729660v6y.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0v7I> r3 = X.C1729860v7I.class
                        java.lang.String r2 = "getUseEffectStatus()Lcom/bytedance/assem/arch/extensions/Async;"
                        r1 = 0
                        java.lang.String r0 = "useEffectStatus"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729660v6y.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0v7I r2 = (X.C1729860v7I) r2
                        X.06Xk<java.lang.Boolean> r0 = r2.LLILZLL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729660v6y.get(java.lang.Object):java.lang.Object");
                }
            }
            r0 = 3
            kotlin.jvm.internal.AFwS268S0000000_26 r6 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r7 = 0
            kotlin.jvm.internal.AwS605S0100000_26 r8 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 11
            r8.<init>(r4, r0)
            r9 = 16
            r10 = r7
            com.bytedance.assem.arch.viewModel.AssemViewModel.asyncSubscribe$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel r2 = r4.NR()
            X.0wBP r5 = X.C736820SvI.LIZJ()
            X.0v70 r3 = new X.C2217381BqS() { // from class: X.0v70
                static {
                    /*
                        X.0v70 r0 = new X.0v70
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0v70) X.0v70.LL X.0v70
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729680v70.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0v7I> r3 = X.C1729860v7I.class
                        java.lang.String r2 = "getCancelDisplayStatus()Lcom/bytedance/assem/arch/extensions/Async;"
                        r1 = 0
                        java.lang.String r0 = "cancelDisplayStatus"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729680v70.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0v7I r2 = (X.C1729860v7I) r2
                        X.06Xk<java.lang.Boolean> r0 = r2.LLIZ
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729680v70.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS605S0100000_26 r8 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 12
            r8.<init>(r4, r0)
            r9 = 24
            r4 = r4
            r6 = r7
            r7 = r7
            r10 = r7
            com.bytedance.assem.arch.viewModel.AssemViewModel.asyncSubscribe$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel r5 = r4.MR()
            X.0v6w r6 = new X.C2217381BqS() { // from class: X.0v6w
                static {
                    /*
                        X.0v6w r0 = new X.0v6w
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0v6w) X.0v6w.LL X.0v6w
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729640v6w.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0v5t> r3 = X.C1728990v5t.class
                        java.lang.String r2 = "isShowAutoDisplayGuide()Z"
                        r1 = 0
                        java.lang.String r0 = "isShowAutoDisplayGuide"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729640v6w.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0v5t r2 = (X.C1728990v5t) r2
                        boolean r0 = r2.LLILLJJLI
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1729640v6w.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS640S0100000_26 r8 = new kotlin.jvm.internal.AwS640S0100000_26
            r0 = 1
            r8.<init>(r4, r0)
            r9 = 6
            X.C736680Sv4.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            return
        Lae:
            r2 = r3
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardImagesFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (MR().getState().LLILLJJLI) {
            i = R.layout.btz;
        } else {
            i = R.layout.bty;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
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
