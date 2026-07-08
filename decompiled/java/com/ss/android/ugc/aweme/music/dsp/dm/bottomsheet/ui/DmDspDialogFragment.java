package com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616070OEj;
import X.C626260OhM;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC626270OhN;
import X.InterfaceC0148002o;
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
import Y.ACListenerS144S0100000_9;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DmDspDialogFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C616070OEj LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final List<DialogInterface.OnDismissListener> LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZiE/OWE3HELIOSJWsuJjsnJyg/ISo2PGs5IGEXJQE/OQs6KSkjLgkhKSIhLCEn";
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C197039127h LLJI;
    public LinearLayout LLJIJIL;
    public C1749280vcc LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public DmMessageConfig LLJILLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OEj] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DmDspDialogFragment.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/dsp/dm/bottomsheet/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJ = new Object() { // from class: X.0OEj
        };
        LLJJIII = new ArrayList();
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

    public DmDspDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1153);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(477);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1154), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1155), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1156), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
    }

    public final LinearLayout SR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eux) : null;
            this.LLJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C1749280vcc UR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLJILJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_subtitle) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_title) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DmMessageConfig dmMessageConfig;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            dmMessageConfig = (DmMessageConfig) arguments.getParcelable("message_config");
        } else {
            dmMessageConfig = null;
        }
        this.LLJILLL = dmMessageConfig;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC626270OhN enumC626270OhN;
        EnumC626270OhN enumC626270OhN2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLIZ;
        String str13 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.lc0);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS144S0100000_9(this, 72));
        DmMessageConfig dmMessageConfig = this.LLJILLL;
        if (dmMessageConfig != null && (enumC626270OhN2 = dmMessageConfig.contentType) != null) {
            switch (C626260OhM.LIZ[enumC626270OhN2.ordinal()]) {
                case -1:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    break;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    TuxTextView tuxTextViewWR = WR();
                    DmMessageConfig dmMessageConfig2 = this.LLJILLL;
                    if (dmMessageConfig2 != null) {
                        str11 = dmMessageConfig2.title;
                    } else {
                        str11 = null;
                    }
                    tuxTextViewWR.setText(str11);
                    TuxTextView tuxTextViewVR = VR();
                    DmMessageConfig dmMessageConfig3 = this.LLJILLL;
                    if (dmMessageConfig3 != null) {
                        str12 = dmMessageConfig3.subtitle;
                    } else {
                        str12 = null;
                    }
                    tuxTextViewVR.setText(str12);
                    break;
                case 2:
                    TuxTextView tuxTextViewWR2 = WR();
                    DmMessageConfig dmMessageConfig4 = this.LLJILLL;
                    if (dmMessageConfig4 != null) {
                        str9 = dmMessageConfig4.title;
                    } else {
                        str9 = null;
                    }
                    tuxTextViewWR2.setText(str9);
                    TuxTextView tuxTextViewVR2 = VR();
                    DmMessageConfig dmMessageConfig5 = this.LLJILLL;
                    if (dmMessageConfig5 != null) {
                        str10 = dmMessageConfig5.subtitle;
                    } else {
                        str10 = null;
                    }
                    tuxTextViewVR2.setText(str10);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    TuxTextView tuxTextViewWR3 = WR();
                    DmMessageConfig dmMessageConfig6 = this.LLJILLL;
                    if (dmMessageConfig6 != null) {
                        str7 = dmMessageConfig6.title;
                    } else {
                        str7 = null;
                    }
                    tuxTextViewWR3.setText(str7);
                    TuxTextView tuxTextViewVR3 = VR();
                    DmMessageConfig dmMessageConfig7 = this.LLJILLL;
                    if (dmMessageConfig7 != null) {
                        str8 = dmMessageConfig7.subtitle;
                    } else {
                        str8 = null;
                    }
                    tuxTextViewVR3.setText(str8);
                    break;
                case 7:
                    TuxTextView tuxTextViewWR4 = WR();
                    DmMessageConfig dmMessageConfig8 = this.LLJILLL;
                    if (dmMessageConfig8 != null) {
                        str5 = dmMessageConfig8.title;
                    } else {
                        str5 = null;
                    }
                    tuxTextViewWR4.setText(str5);
                    TuxTextView tuxTextViewVR4 = VR();
                    DmMessageConfig dmMessageConfig9 = this.LLJILLL;
                    if (dmMessageConfig9 != null) {
                        str6 = dmMessageConfig9.subtitle;
                    } else {
                        str6 = null;
                    }
                    tuxTextViewVR4.setText(str6);
                    break;
                case 8:
                    TuxTextView tuxTextViewWR5 = WR();
                    DmMessageConfig dmMessageConfig10 = this.LLJILLL;
                    if (dmMessageConfig10 != null) {
                        str3 = dmMessageConfig10.title;
                    } else {
                        str3 = null;
                    }
                    tuxTextViewWR5.setText(str3);
                    TuxTextView tuxTextViewVR5 = VR();
                    DmMessageConfig dmMessageConfig11 = this.LLJILLL;
                    if (dmMessageConfig11 != null) {
                        str4 = dmMessageConfig11.subtitle;
                    } else {
                        str4 = null;
                    }
                    tuxTextViewVR5.setText(str4);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    TuxTextView tuxTextViewWR6 = WR();
                    DmMessageConfig dmMessageConfig12 = this.LLJILLL;
                    if (dmMessageConfig12 != null) {
                        str = dmMessageConfig12.title;
                    } else {
                        str = null;
                    }
                    tuxTextViewWR6.setText(str);
                    TuxTextView tuxTextViewVR6 = VR();
                    DmMessageConfig dmMessageConfig13 = this.LLJILLL;
                    if (dmMessageConfig13 != null) {
                        str2 = dmMessageConfig13.subtitle;
                    } else {
                        str2 = null;
                    }
                    tuxTextViewVR6.setText(str2);
                    break;
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 281), 3);
        DmMessageConfig dmMessageConfig14 = this.LLJILLL;
        if (dmMessageConfig14 != null) {
            enumC626270OhN = dmMessageConfig14.contentType;
        } else {
            enumC626270OhN = null;
        }
        if (enumC626270OhN == EnumC626270OhN.TRACK) {
            if (dmMessageConfig14 != null) {
                str13 = dmMessageConfig14.musicId;
            }
            if (C123100dR.LIZ(str13)) {
                AssemVMLazy assemVMLazy = this.LLJILJILJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
                assemVMLazy.getValue().asyncSubscribe(new C2217381BqS() { // from class: X.0OEi
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0O1C) obj).LL;
                    }
                }, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 282), new AwS553S0100000_9(this, 1152), new AwS588S0100000_9(this, 283));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.drd, viewGroup, false);
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
