package com.ss.android.ugc.aweme.badge;

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
import X.C1389890mGx;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C1893080zMY;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20578915fn;
import X.C20579015fo;
import X.C20579115fp;
import X.C427870Gq9;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC20579515ft;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC445670Hdl;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EditProfileBadgeDialog extends GlobalHookDialogFragment implements InterfaceC445670Hdl, InterfaceC1171660gay, InterfaceC20579515ft {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZictHELIOSLSg2ZgAoIDsDOioqICM2CiQoLioXISQgJig=";
    public final User LL;
    public final Function0<Unit> LLILLJJLI;
    public C1749280vcc LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public RecyclerView LLIZ;
    public C197039127h LLIZLLLIL;
    public SmartImageView LLJ;
    public RelativeLayout LLJI;
    public C427870Gq9 LLJIJIL;
    public RelativeLayout LLJILJIL;
    public final C01GW LLJILJILJ;
    public EditProfileBadgeModel LLJILLL;
    public boolean LLJJ;
    public ProfileBadgeStruct LLJJI;
    public ProfileBadgeStruct LLJJIII;
    public C20578915fn LLJJIJI;
    public GridLayoutManager LLJJIJIIJIL;
    public final IProfileBadgeService LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C20579015fo LLJJJJ;
    public C20579115fp LLJJJJJIL;

    public EditProfileBadgeDialog() {
        this((User) null, 3);
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

    public final SmartImageView MR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gnv) : null;
            this.LLJ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxTextView NR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gny) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gnz) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.go7) : null;
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1749280vcc RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILLL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void UR() {
        C1749280vcc c1749280vccRR = RR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS575S0100000_31(this, 229));
        c1749280vccRR.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(RR(), 0);
    }

    public final void VR() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131845462);
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.a0i);
        c1389890mGx.LIZLLL(2000L);
        c1389890mGx.LJIIJJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJJJJIL = null;
        this.LLJJJJ = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    public final void SR(boolean z) {
        int i;
        View viewFindViewById;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        View viewFindViewById2 = null;
        if (this.LLJILJIL == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.gnw);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJIL = (RelativeLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        if (OR() != null && OR() != null && PR() != null) {
            View view2 = this.LLJILJIL;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.gnw);
                }
                this.LLJILJIL = (RelativeLayout) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C786410Ut5.LLIIL((RelativeLayout) view2, i);
            C786410Ut5.LLLLZLL(OR(), i);
            C786410Ut5.LLLLZLL(NR(), i);
            C786410Ut5.LLLLLLJ(PR(), i);
        }
    }

    @Override // X.InterfaceC20579515ft
    public final void ah(EditProfileBadgeModel editProfileBadgeModel) {
        String url;
        Boolean shouldShow;
        String name;
        this.LLJILLL = editProfileBadgeModel;
        this.LLJJ = true;
        String description = null;
        if (editProfileBadgeModel != null) {
            url = editProfileBadgeModel.getUrl();
            shouldShow = editProfileBadgeModel.getShouldShow();
        } else {
            url = null;
            shouldShow = null;
        }
        WR(shouldShow, url);
        TuxTextView tuxTextViewOR = OR();
        if (editProfileBadgeModel != null) {
            name = editProfileBadgeModel.getName();
        } else {
            name = null;
        }
        tuxTextViewOR.setText(name);
        TuxTextView tuxTextViewNR = NR();
        if (editProfileBadgeModel != null) {
            description = editProfileBadgeModel.getDescription();
        }
        tuxTextViewNR.setText(description);
    }

    @Override // X.InterfaceC445670Hdl
    public final void jA(FragmentManager fragmentManager) {
        super.show(fragmentManager, "EditProfileBadgeDialog");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJI = this.LL.getProfileBadge();
        this.LLJJIII = this.LL.getProfileBadge();
        setStyle(0, R.style.afx);
    }

    public EditProfileBadgeDialog(User user, Function0<Unit> function0) {
        this.LL = user;
        this.LLILLJJLI = function0;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 230));
        this.LLJJIJIL = ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false);
        this.LLJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 95));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 228));
    }

    public final void WR(Boolean bool, String str) {
        if (str != null && Intrinsics.LJFF(bool, Boolean.TRUE) && MR() != null) {
            C786410Ut5.LLFF(0, MR());
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(MR());
            c1331670kl3LJIIIZ.LIZLLL("EditProfileBadgeDialog");
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            return;
        }
        if (MR() == null) {
            return;
        }
        C786410Ut5.LLFF(8, MR());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public /* synthetic */ EditProfileBadgeDialog(User user, int i) {
        this((i & 1) != 0 ? new User() : user, (Function0<Unit>) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        Context context = (Context) this.LLJJJ.getValue();
        if (context != null && (layoutInflaterCloneInContext = layoutInflater.cloneInContext(context)) != null) {
            layoutInflater = layoutInflaterCloneInContext;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f7t, viewGroup, false);
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
