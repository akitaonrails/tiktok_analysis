package com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0L6X;
import X.C0ZP4;
import X.C1173220gdU;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1232430iAz;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C14K9;
import X.C14TF;
import X.C15438062q;
import X.C1561230qjJ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C1852850yJf;
import X.C1864490ycR;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2217381BqS;
import X.C338490DOt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS96S0200000_27;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import irm.AkS94S0100000_27;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PreviewPhotoFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C1852850yJf LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JTAgPSYjJCA4LCHELIOSIjJCQ4LGEjOiA6ICokOC0jPSB9GDcpPyY2PxUkJjs8DjctLiI2JjE=";
    public TikTokMediaModel LLIZ;
    public final List<TikTokMediaModel> LLIZLLLIL = new ArrayList();
    public List<String> LLJ = C13BV.INSTANCE;
    public RelativeLayout LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public LinearLayout LLJILJILJ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public final AssemVMLazy LLJJIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0yJf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PreviewPhotoFragment.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new Object() { // from class: X.0yJf
        };
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

    public PreviewPhotoFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2321);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(264);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 844), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS571S0100000_27((Fragment) this, 845), aFwS269S0000000_27, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 846), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
    }

    public final TakoPhotoChooseViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TakoPhotoChooseViewModel takoPhotoChooseViewModelUR = UR();
        takoPhotoChooseViewModelUR.LL = false;
        takoPhotoChooseViewModelUR.setState(AFwS269S0000000_27.get$arr$(478));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1561230qjJ.LIZ.getClass();
        if (C1561230qjJ.LIZ()) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zm);
            tuxImmersionBarLIZLLL.LJ(R.attr.zm);
            tuxImmersionBarLIZLLL.LIZ(true);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.uk);
        tuxImmersionBarLIZLLL.LJ(R.attr.z_);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    public final void SR(TikTokMediaModel tikTokMediaModel) {
        String string;
        TikTokMediaModel next;
        int i;
        Iterator<TikTokMediaModel> it2 = UR().getState().LLIZ.iterator();
        while (true) {
            string = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((MediaModel) next).id, ((MediaModel) tikTokMediaModel).id)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TikTokMediaModel tikTokMediaModel2 = next;
        if (tikTokMediaModel2 != null) {
            i = tikTokMediaModel2.selectIndex;
        } else {
            i = tikTokMediaModel.selectIndex;
        }
        if (i > 0) {
            TuxTextView tuxTextView = this.LLJIJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(String.valueOf(i));
            }
            TuxTextView tuxTextView2 = this.LLJILJIL;
            if (tuxTextView2 != null) {
                Context context = tuxTextView2.getContext();
                if (context != null) {
                    string = context.getString(2131822525);
                }
                tuxTextView2.setText(string);
            }
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                tuxTextView3.setBackground(c384050F3z.LIZ(requireContext()));
                return;
            }
            return;
        }
        TuxTextView tuxTextView4 = this.LLJIJIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setText("");
        }
        TuxTextView tuxTextView5 = this.LLJILJIL;
        if (tuxTextView5 != null) {
            Context context2 = tuxTextView5.getContext();
            if (context2 != null) {
                string = context2.getString(2131822527);
            }
            tuxTextView5.setText(string);
        }
        TuxTextView tuxTextView6 = this.LLJIJIL;
        if (tuxTextView6 == null) {
            return;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
        c384050F3z2.LJFF = Integer.valueOf(R.attr.zi);
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        tuxTextView6.setBackground(c384050F3z2.LIZ(requireContext()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        Parcelable parcelable;
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().LIZ(this, new C1864490ycR(this, 3));
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getBoolean("with_animation", true);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (parcelableArrayList = arguments3.getParcelableArrayList("media_model_list")) != null) {
            ((ArrayList) this.LLIZLLLIL).clear();
            ((ArrayList) this.LLIZLLLIL).addAll(parcelableArrayList);
        }
        if (((ArrayList) this.LLIZLLLIL).isEmpty() && (arguments = getArguments()) != null && (parcelable = arguments.getParcelable("media_model")) != null) {
            ((ArrayList) this.LLIZLLLIL).add(parcelable);
        }
        List<TikTokMediaModel> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TikTokMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MediaModel) it2.next()).id);
        }
        this.LLJ = arrayList;
        Bundle arguments4 = getArguments();
        int i = 0;
        if (arguments4 != null) {
            i = arguments4.getInt("initial_position", 0);
        }
        this.LLJJ = i;
    }

    public static int VR(List list, List list2) {
        int iMin = Math.min(list.size(), list2.size());
        for (int i = 0; i < iMin; i++) {
            if (!Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(list2, i))) {
                return i;
            }
        }
        return iMin;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TakoGalleryPickerActivity takoGalleryPickerActivity;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        this.LLJI = (RelativeLayout) view.findViewById(R.id.y8u);
        int fullScreenHeight = (ScreenUtils.getFullScreenHeight(getContext()) - ScreenUtils.getScreenHeight(getContext())) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext());
        RelativeLayout relativeLayout = this.LLJI;
        if (relativeLayout != null && !(getActivity() instanceof TakoCameraRecordActivity)) {
            C1561230qjJ.LIZ.getClass();
            if (!C1561230qjJ.LIZ() || !C14TF.LIZIZ.LJL(relativeLayout.getContext())) {
                relativeLayout.setPaddingRelative(0, fullScreenHeight, 0, 0);
            }
        }
        C19EG activity = getActivity();
        if ((activity instanceof TakoGalleryPickerActivity) && (takoGalleryPickerActivity = (TakoGalleryPickerActivity) activity) != null && takoGalleryPickerActivity.LLLLZLLIL() && (viewFindViewById = view.findViewById(R.id.cae)) != null) {
            C14K9.LJIJJ(viewFindViewById, C1232430iAz.LL);
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 587), 3);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.qbn);
        viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PreviewImageCell.class);
        InterfaceC1733780vDc viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
        C1173220gdU c1173220gdU = new C1173220gdU();
        c1173220gdU.LIZ = 1;
        viewItemOperator.LIZLLL(c1173220gdU);
        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState();
        List<TikTokMediaModel> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0L6X((TikTokMediaModel) it2.next()));
        }
        state.LIZLLL(arrayList, null);
        if (!this.LLJJI) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS96S0200000_27(this, viewOnAttachStateChangeListenerC20631115oD, 13));
        }
        this.LLJILLL = viewOnAttachStateChangeListenerC20631115oD;
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.kel);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.ull);
        this.LLJILJILJ = (LinearLayout) view.findViewById(R.id.i6h);
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(this.LLJJ, this.LLIZLLLIL);
        this.LLIZ = tikTokMediaModel;
        if (tikTokMediaModel != null) {
            SR(tikTokMediaModel);
        }
        View viewFindViewById2 = view.findViewById(R.id.xcy);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 48), viewFindViewById2);
        }
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0yJd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 65), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0yJe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 64), 4);
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 19), linearLayout);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new ContextThemeWrapper(requireContext(), R.style.y0)), R.layout.fqw, viewGroup, false);
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
