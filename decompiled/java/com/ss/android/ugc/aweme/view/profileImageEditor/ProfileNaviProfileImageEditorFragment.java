package com.ss.android.ugc.aweme.view.profileImageEditor;

import X.AbstractC1252750ihl;
import X.AbstractC21673619ry;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1322090kVb;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389600mGU;
import X.C1390410mHn;
import X.C1440005kM;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19401510vN;
import X.C19401910vR;
import X.C19402010vS;
import X.C19423210ys;
import X.C19424410z4;
import X.C19429110zp;
import X.C19429410zs;
import X.C19430010zy;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC19728412Gs;
import X.EnumC1338240kve;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC19401710vP;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS163S0100000_29;
import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS79S1000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviProfileImageEditorFragment extends GlobalHookDialogFragment implements InterfaceC1171660gay, InterfaceC19401710vP {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9ODcjLyY/LQwhKCg2DSHELIOSElPSAhZhU+Jik6JCACKDk6GDcjLyY/LQwhKCg2DSElPSAhDjctLiI2JjE=";
    public C197039127h LL;
    public TuxIconView LLILLJJLI;
    public SmartImageView LLILLL;
    public C1390410mHn LLILZ;
    public CardView LLILZIL;
    public RoundedFrameLayout LLILZLL;
    public RecyclerView LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 600));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 601));

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

    public final ProfileNaviCreatorViewModel MR() {
        return (ProfileNaviCreatorViewModel) this.LLIZLLLIL.getValue();
    }

    public final RecyclerView NR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s4e) : null;
            this.LLIZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final RoundedFrameLayout OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s4h) : null;
            this.LLILZLL = (RoundedFrameLayout) viewFindViewById;
        }
        return (RoundedFrameLayout) viewFindViewById;
    }

    public final C1390410mHn PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s4r) : null;
            this.LLILZ = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final void RR() {
        C19423210ys.LIZ.getClass();
        C20684815ws.LJIILLIIL("cancel_edit_set_avatar_profile", new C2344009Gk().LIZ);
        ProfileNaviCreatorViewModel profileNaviCreatorViewModelMR = MR();
        profileNaviCreatorViewModelMR.getClass();
        profileNaviCreatorViewModelMR.setStateImmediate(AFwS273S0000000_29.get$arr$(314));
        profileNaviCreatorViewModelMR.setStateImmediate(AFwS273S0000000_29.get$arr$(315));
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1440005kM.LIZ(new C19430010zy(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1440005kM.LIZ(new C19430010zy(0));
    }

    @Override // X.InterfaceC19401710vP
    public final void L5(C19402010vS c19402010vS) {
        ((C19401910vR) this.LLJ.getValue()).LIZIZ = c19402010vS;
        AbstractC21673619ry adapter = NR().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        UR(c19402010vS);
    }

    public final void SR(boolean z) {
        if (isAdded() && PR() != null) {
            View viewFindViewById = null;
            if (z) {
                View view = this.LLILZIL;
                if (view == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById = view2.findViewById(R.id.s4s);
                    }
                    this.LLILZIL = (CardView) viewFindViewById;
                    view = viewFindViewById;
                }
                C786410Ut5.LLILLL((CardView) view, 0);
                PR().LIZJ();
                return;
            }
            PR().LIZLLL();
            View view3 = this.LLILZIL;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.s4s);
                }
                this.LLILZIL = (CardView) viewFindViewById;
                view3 = viewFindViewById;
            }
            C786410Ut5.LLILLL((CardView) view3, 8);
        }
    }

    public final void UR(C19402010vS c19402010vS) {
        String str = c19402010vS.LIZIZ;
        if (str != null && str.length() != 0) {
            ProfileNaviCreatorViewModel profileNaviCreatorViewModelMR = MR();
            String str2 = c19402010vS.LIZIZ;
            profileNaviCreatorViewModelMR.getClass();
            profileNaviCreatorViewModelMR.setStateImmediate(new AwS79S1000000_29(str2, 6));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, android.R.style.Theme.DeviceDefault.NoActionBar.Fullscreen);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        final C19EG c19egRequireActivity = requireActivity();
        final int theme = getTheme();
        DialogC19728412Gs dialogC19728412Gs = new DialogC19728412Gs(c19egRequireActivity, theme) { // from class: X.10zx
            @Override // android.app.Dialog
            public final void onBackPressed() {
                this.LL.RR();
            }
        };
        Window window = dialogC19728412Gs.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC19728412Gs);
        return dialogC19728412Gs;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        File file;
        UrlModel urlModel;
        File file2;
        super.onViewCreated(view, bundle);
        C11EA.LJII(this, MR(), new C2217371BqR() { // from class: X.10zv
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviCreatorState) obj).getProfileImageBackgroundColor();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setProfileImageBackgroundColor((String) obj2);
            }
        }, new AwS643S0100000_29(this, 59));
        if (getContext() != null && getFragmentManager() != null) {
            NR().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            NR().setAdapter(new C19401510vN((C19401910vR) this.LLJ.getValue(), this));
            C19402010vS c19402010vS = ((C19401910vR) this.LLJ.getValue()).LIZIZ;
            if (c19402010vS != null) {
                UR(c19402010vS);
            }
        }
        MR().getClass();
        C19429410zs c19429410zs = C19429110zp.LIZJ;
        View viewFindViewById = null;
        if (c19429410zs != null) {
            file = c19429410zs.LIZ;
        } else {
            file = null;
        }
        if (file != null) {
            View viewFindViewById2 = this.LLILLL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.s4k);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLL = (SmartImageView) viewFindViewById2;
            }
            C1322090kVb c1322090kVb = (C1322090kVb) viewFindViewById2;
            MR().getClass();
            C19429410zs c19429410zs2 = C19429110zp.LIZJ;
            if (c19429410zs2 != null) {
                file2 = c19429410zs2.LIZ;
            } else {
                file2 = null;
            }
            c1322090kVb.setImageBitmap(BitmapFactory.decodeFile(file2.getAbsolutePath()));
        } else {
            MR().getClass();
            C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
            if (c19424410z4 != null && (urlModel = c19424410z4.LJ) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                View viewFindViewById3 = this.LLILLL;
                if (viewFindViewById3 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById3 = view3.findViewById(R.id.s4k);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLILLL = (SmartImageView) viewFindViewById3;
                }
                c1331670kl3LJIIIIZZ.LJJ((SmartImageView) viewFindViewById3);
                c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.CENTER_INSIDE;
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        View viewFindViewById4 = this.LL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.s4i);
            } else {
                viewFindViewById4 = null;
            }
            this.LL = (C197039127h) viewFindViewById4;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById4, new ACListenerS163S0100000_29(this, 162));
        View view5 = this.LLILLJJLI;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.s4c);
            }
            this.LLILLJJLI = (TuxIconView) viewFindViewById;
            view5 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view5, new ACListenerS163S0100000_29(this, 163));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ehc, viewGroup, false);
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
