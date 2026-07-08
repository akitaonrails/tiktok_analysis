package com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui;

import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1361400lX0;
import X.C13LE;
import X.C1443310nf7;
import X.C1445760nj4;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1834150xpV;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C489320JGw;
import X.C489370JHb;
import X.C489400JHe;
import X.C489550JHt;
import X.C489580JHw;
import X.C489600JHy;
import X.C497740JfY;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1405170mfb;
import X.EnumC489360JHa;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2173781A5o;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoPublishFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9PiwoLCAjPSHELIOScgIDw7OCQrLGEmIWscKjwQJzA+OioFISEpJh8mKiklOicVOiQrJCo9PA==";
    public IPcsLoadingAbility LL;
    public IPcsLoadingAbility LLILLJJLI;
    public final C736950SvV LLILLL;
    public final C736950SvV LLILZ;
    public final C736950SvV LLILZIL;
    public C489400JHe LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;

    static {
        new C489320JGw();
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

    public final PcsVideoReEditVm NR() {
        return (PcsVideoReEditVm) this.LLILZIL.getValue();
    }

    public final C489400JHe OR() {
        if (this.LLILZLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C489400JHe.class, null);
            this.LLILZLL = interfaceC1555100qZQLIZIZ != null ? (C489400JHe) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZLL;
    }

    public PcsCourseVideoPublishFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsVideoPublishVM.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(181);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILLL = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, c451460Hn6, c451620HnM, c338520DOw);
        this.LLILZ = new C736950SvV(C13LE.LIZ(PcsVideoEditVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(182), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLILZIL = new C736950SvV(C13LE.LIZ(PcsVideoReEditVm.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(183), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        new Bundle();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PcsVideoReEditVm pcsVideoReEditVmNR = NR();
        pcsVideoReEditVmNR.getClass();
        pcsVideoReEditVmNR.setState(new AwS586S0100000_7(pcsVideoReEditVmNR, 498));
        C1445760nj4.LIZ.getClass();
        C1445760nj4.LIZIZ = null;
        C1445760nj4.LIZJ = null;
        C1445760nj4.LIZLLL = null;
        C1445760nj4.LJ = null;
        C1445760nj4.LJFF = false;
        PcsVideoPublishVM pcsVideoPublishVM = (PcsVideoPublishVM) this.LLILLL.getValue();
        pcsVideoPublishVM.setState(new AwS586S0100000_7(pcsVideoPublishVM, 495));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setStatusBarColor(C497740JfY.LIZLLL(R.attr.ext, requireContext()));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [X.0JHv] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC489360JHa enumC489360JHa;
        PcsGenericLoadingVM pcsGenericLoadingVMDj1;
        String creationId;
        super.onViewCreated(view, bundle);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.euk);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.nlb);
        C489400JHe c489400JHeOR = OR();
        PcsGenericLoadingVM pcsGenericLoadingVMDj12 = null;
        if (c489400JHeOR != null) {
            enumC489360JHa = c489400JHeOR.LL;
        } else {
            enumC489360JHa = null;
        }
        if (enumC489360JHa != null) {
            int i = C489370JHb.LIZ[enumC489360JHa.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                } else {
                    NR().vQ2(getContext());
                }
            } else {
                C1443310nf7 c1443310nf7 = C1443310nf7.LIZIZ;
                VideoPublishEditModel videoPublishEditModel = ((C489550JHt) this.LLILZ.getValue().getState()).LLILLJJLI.LIZ;
                c1443310nf7.getClass();
                CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
                String str = "";
                if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                    creationId = "";
                }
                EnumC1405170mfb enumC1405170mfb = EnumC1405170mfb.NOT_RETRY;
                String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
                if (videoCoverPath != null) {
                    str = videoCoverPath;
                }
                ((AssemViewModel) this.LLILLL.getValue()).setState(new AwS586S0100000_7(new PublishModel("pcs_paid_video", creationId, 0, enumC1405170mfb, 0, 0, Collections.singletonList(str), videoPublishEditModel, null, false, CardStruct.IStatusCode.DEFAULT, false, false, false, false, true, null, false, null, null, false), 497));
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 566), 3);
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPcsLoadingAbility.class, "PcsGenericLoadingAssem1");
        if (iPcsLoadingAbility != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(new C489580JHw(new InterfaceC2173781A5o() { // from class: X.0JHv
                @Override // X.InterfaceC2173781A5o
                public final void LIZ() {
                    this.LIZ.NR().getClass();
                    C1445760nj4.LIZ.getClass();
                    AbstractC2199801B7q abstractC2199801B7q = C1445760nj4.LIZIZ;
                    if (abstractC2199801B7q != null) {
                        int i2 = abstractC2199801B7q.LIZIZ;
                        C844470XAv.LIZ.getClass();
                        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).cancel(i2);
                    }
                    C19EG c19egLIZ = C1124140fMK.LIZ(this.LIZ.getContext());
                    if (c19egLIZ != null) {
                        c19egLIZ.onBackPressed();
                    }
                }
            }), false);
        } else {
            pcsGenericLoadingVMDj1 = null;
        }
        this.LLILLJJLI = pcsGenericLoadingVMDj1;
        IPcsLoadingAbility iPcsLoadingAbility2 = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPcsLoadingAbility.class, "PcsGenericLoadingAssem2");
        if (iPcsLoadingAbility2 != null) {
            pcsGenericLoadingVMDj12 = iPcsLoadingAbility2.dj1(C489600JHy.LIZ, true);
        }
        this.LL = pcsGenericLoadingVMDj12;
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0JHm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JHL) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 104), 6);
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0JHM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JHL) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 105), 6);
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0JHn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JHL) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 106), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C1834150xpV.LJI(getContext())) {
            i = R.style.uy;
        } else {
            i = R.style.v0;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(requireActivity(), i)), R.layout.hlq, viewGroup, false);
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
