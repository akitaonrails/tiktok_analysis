package com.ss.android.ugc.aweme.view.autocreation;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19402110vT;
import X.C19423210ys;
import X.C19424810z8;
import X.C19429110zp;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC19402410vW;
import X.InterfaceC19402510vX;
import X.InterfaceC19403010vc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS163S0100000_29;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviAutoCreationSkinToneFragment extends Fragment implements InterfaceC1171660gay, InterfaceC19402410vW {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9KTA4JiwhLSQ4ICA9HELIOSZhU+Jik6JCACKDk6CTA4JgwhLSQ4ICA9Gy4lJxs8JiAKOy40JSAiPQ==";
    public SmartImageView LL;
    public ImageView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public RecyclerView LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 576));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 577));

    public final void NR() {
        InterfaceC19403010vc interfaceC19403010vc;
        MR().getClass();
        HashMap<String, InterfaceC19403010vc> map = C19429110zp.LJ;
        if (map == null || (interfaceC19403010vc = map.get("skin_tone")) == null) {
            return;
        }
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s4q) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(interfaceC19403010vc.getName());
        View viewFindViewById2 = this.LLILZIL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.s4n) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById2;
        }
        ((RecyclerView) viewFindViewById2).setLayoutManager(new GridLayoutManager(getContext(), 6));
        View view3 = this.LLILZIL;
        if (view3 == null) {
            View view4 = getView();
            View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.s4n) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        ((RecyclerView) view3).setAdapter(new C19402110vT(6, new ArrayList(interfaceC19403010vc.LIZLLL().values()), interfaceC19403010vc.LIZJ(), 1, this, new AwS608S0100000_29(this, 327), new AwS608S0100000_29(this, 328)));
    }

    @Override // X.InterfaceC19402410vW
    public final void O2(InterfaceC19402510vX interfaceC19402510vX, int i) {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final ProfileNaviAutoCreationViewModel MR() {
        return (ProfileNaviAutoCreationViewModel) this.LLILZLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C19423210ys.LIZ.getClass();
        String strValueOf = String.valueOf(new Date().getTime());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("start_time", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        C20684815ws.LJIILLIIL("show_auto_avatar_skin_tone", c2344009Gk.LIZ);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_avatar_outline.png"));
        c1331670kl3LJI.LJJIJL(getContext());
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s3e) : null;
            this.LL = (SmartImageView) viewFindViewById;
        }
        c1331670kl3LJI.LJJ((SmartImageView) viewFindViewById);
        C786410Ut5.h3(c1331670kl3LJI);
        Bitmap selfieBitmap = ((ProfileNaviAutoCreationState) MR().hR2()).getSelfieBitmap();
        if (selfieBitmap != null) {
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                viewFindViewById2 = view2 != null ? view2.findViewById(R.id.s4p) : null;
                this.LLILLJJLI = (ImageView) viewFindViewById2;
            }
            ((ImageView) viewFindViewById2).setImageBitmap(selfieBitmap);
        }
        View view3 = this.LLILLL;
        if (view3 == null) {
            View view4 = getView();
            View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.s4l) : null;
            this.LLILLL = (TuxIconView) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        C786410Ut5.a9((TuxIconView) view3, new ACListenerS163S0100000_29(this, 323));
        if (((ProfileNaviEditorState) ((BaseJediViewModel) this.LLIZ.getValue()).hR2()).isSceneEffectLoaded()) {
            NR();
        } else {
            C11EA.LJII(this, (JediViewModel) this.LLIZ.getValue(), new C2217381BqS() { // from class: X.10yp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((ProfileNaviEditorState) obj).isSceneEffectLoaded());
                }
            }, new AwS643S0100000_29(this, 184));
        }
    }

    @Override // X.InterfaceC19402410vW
    public final void u(InterfaceC19402510vX interfaceC19402510vX) {
        ProfileNaviDataModel profileNaviDataModel;
        ProfileNaviAutoCreationViewModel profileNaviAutoCreationViewModelMR = MR();
        profileNaviAutoCreationViewModelMR.getClass();
        profileNaviAutoCreationViewModelMR.setStateImmediate(new AwS608S0100000_29(interfaceC19402510vX, 561));
        C19423210ys.LIZ.getClass();
        String strValueOf = String.valueOf(new Date().getTime());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("start_time", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        C20684815ws.LJIILLIIL("select_auto_avatar_skin_tone", c2344009Gk.LIZ);
        InterfaceC19402510vX selectedSkintone = ((ProfileNaviAutoCreationState) MR().hR2()).getSelectedSkintone();
        if (selectedSkintone != null && (profileNaviDataModel = ((ProfileNaviAutoCreationState) MR().hR2()).getProfileNaviDataModel()) != null) {
            List<ProfileNaviFeatureDataModel> list = profileNaviDataModel.features;
            if (list != null) {
                C19719512Dh.LIZIZ(list).add(new ProfileNaviFeatureDataModel(selectedSkintone.getCategory().getKey(), C19424810z8.LIZIZ(selectedSkintone)));
            }
            ProfileNaviAutoCreationViewModel profileNaviAutoCreationViewModelMR2 = MR();
            profileNaviAutoCreationViewModelMR2.getClass();
            profileNaviAutoCreationViewModelMR2.setStateImmediate(new AwS608S0100000_29(profileNaviDataModel, 558));
            profileNaviAutoCreationViewModelMR2.setStateImmediate(AFwS273S0000000_29.get$arr$(304));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.egt, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
