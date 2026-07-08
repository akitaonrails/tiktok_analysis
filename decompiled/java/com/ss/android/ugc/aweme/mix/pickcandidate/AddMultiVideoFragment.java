package com.ss.android.ugc.aweme.mix.pickcandidate;

import X.AbstractC214823195h;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0DXR;
import X.C0OM1;
import X.C0ZP4;
import X.C1163820gOK;
import X.C1165690gRL;
import X.C1167310gTx;
import X.C1167470gUD;
import X.C1167550gUL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1208640hYc;
import X.C1209040hZG;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C13LP;
import X.C14K9;
import X.C1559260qg8;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C298660BnE;
import X.C338490DOt;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS221S0100000_17;
import Y.AObserverS222S0100000_18;
import Y.AsS32S0200000_18;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS508S0200000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AddMultiVideoFragment extends AmeBaseFragment implements InterfaceC724530SbT {
    public static final C1167310gTx LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWEjISYnHELIOSKi49LCwoKDs2ZgQoLQImJDElHyY3LSoKOy40JSAiPQ==";
    public C197039127h LL;
    public C1749280vcc LLILLJJLI;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public TuxNavBar LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 679));
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public boolean LLJI;
    public Integer LLJIJIL;
    public Integer LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddMultiVideoFragment.class, "createVM", "getCreateVM()Lcom/ss/android/ugc/aweme/mix/createmix/viewmodel/MixCreateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AddMultiVideoFragment.class, "manageViewModel", "getManageViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosManageViewModel;", 0), new C2217381BqS(AddMultiVideoFragment.class, "editPlaylistViewModel", "getEditPlaylistViewModel()Lcom/ss/android/ugc/aweme/mix/editplaylist/EditPlaylistViewModel;", 0)};
        LLJILLL = new C1167310gTx();
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

    public final C1749280vcc MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dbm) : null;
            this.LLILLJJLI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final MixCreateViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (MixCreateViewModel) assemVMLazy.getValue();
    }

    public final C1167550gUL OR() {
        return (C1167550gUL) this.LLJ.getValue();
    }

    public final EditPlaylistViewModel PR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (EditPlaylistViewModel) assemVMLazy.getValue();
    }

    public final MixVideosManageViewModel RR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (MixVideosManageViewModel) assemVMLazy.getValue();
    }

    public final C197039127h SR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p8k) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv UR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sji) : null;
            this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final MultiVideoViewModel VR() {
        return (MultiVideoViewModel) this.LLILZIL.getValue();
    }

    public final List<Aweme> WR() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) UR().getState().LJII()) {
            for (Object obj : (ArrayList) VR().LLILLL) {
                if (interfaceC1891350zJl instanceof C1165690gRL) {
                    C1165690gRL c1165690gRL = (C1165690gRL) interfaceC1891350zJl;
                    if (Intrinsics.LJFF(c1165690gRL.LLILZIL, obj) && !c1165690gRL.LLILZLL) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public AddMultiVideoFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixCreateViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 673);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(198);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZLL = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 674), aFwS256S0000000_18);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixVideosManageViewModel.class);
        this.LLIZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS562S0100000_18(c19719912DlLIZ2, 675), c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 676), AFwS256S0000000_18.get$arr$(199));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(EditPlaylistViewModel.class);
        this.LLIZLLLIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), new AwS562S0100000_18(c19719912DlLIZ3, 677), c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 678), AFwS256S0000000_18.get$arr$(200));
        this.LLJ = new C1559260qg8(new AwS127S1200000_11((Fragment) this, (Fragment) C1167550gUL.class, (Class<Object>) "edit_playlist_hierarchy_data_key", (String) 14), true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 672));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddMultiVideoFragment.class.getName());
        }
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() { // from class: X.0gTw
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                FragmentManager supportFragmentManager;
                if (keyEvent.getAction() == 0 && i == 4) {
                    C19EG activity = this.LL.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        AddMultiVideoFragment addMultiVideoFragment = this.LL;
                        if (!(addMultiVideoFragment.getActivity() instanceof EditPlaylistActivity)) {
                            addMultiVideoFragment.RR().setState(new AwS32S0010000_18(true, 16));
                        }
                        if (supportFragmentManager.LJJLIIIIJ() == 0) {
                            C19EG activity2 = addMultiVideoFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                        } else {
                            supportFragmentManager.LJLLILLLL();
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public static final class CandidateGridLayoutManager extends GridLayoutManager {
        public final ViewOnAttachStateChangeListenerC20604515jv LLJ;

        @Override // androidx.recyclerview.widget.GridLayoutManager
        public final void LJIJI(AbstractC214823195h abstractC214823195h) {
            this.LLIZ = new C1208640hYc(this, abstractC214823195h, 2);
        }

        public CandidateGridLayoutManager(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
            super(context, 3);
            this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
            LJIJI(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C723850SaN.LIZ(this, false, null, AFwS256S0000000_18.get$arr$(197), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object objH2;
        C1167550gUL c1167550gULOR;
        TextView textView;
        List arrayList;
        List<String> arrayList2;
        super.onViewCreated(view, bundle);
        if (getActivity() instanceof MixFeedManagerActivity) {
            VR().LLJIJIL = RR().LLILLJJLI;
        } else if (getActivity() instanceof EditPlaylistActivity) {
            MultiVideoViewModel multiVideoViewModelVR = VR();
            C1167550gUL c1167550gULOR2 = OR();
            if (c1167550gULOR2 == null || (str = c1167550gULOR2.LL) == null) {
                str = "";
            }
            multiVideoViewModelVR.LLJIJIL = str;
        }
        VR().LLJILJILJ = ((Boolean) this.LLJILJILJ.getValue()).booleanValue();
        Context context = getContext();
        View viewFindViewById = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "input_method");
        } else {
            objH2 = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) objH2;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(SR().getWindowToken(), 0);
        }
        C786410Ut5.LLLZLZ(MR(), 0);
        if (getActivity() instanceof MixFeedManagerActivity) {
            SR().setText(getString(2131825159));
        } else {
            SR().setText(getString(R.string.hz2));
        }
        if (getActivity() instanceof MixFeedManagerActivity) {
            List<Aweme> list = VR().LLILLL;
            C1163820gOK c1163820gOK = (C1163820gOK) RR().vmDispatcher.getState();
            if (c1163820gOK == null || (arrayList = c1163820gOK.LLILZLL) == null) {
                arrayList = new ArrayList();
            }
            ((ArrayList) list).addAll(arrayList);
            VR().LLJ.postValue(0);
            MultiVideoViewModel multiVideoViewModelVR2 = VR();
            C1163820gOK c1163820gOK2 = (C1163820gOK) RR().vmDispatcher.getState();
            if (c1163820gOK2 == null || (arrayList2 = c1163820gOK2.LLIZ) == null) {
                arrayList2 = new ArrayList<>();
            }
            multiVideoViewModelVR2.LLJI = arrayList2;
        } else if (getActivity() instanceof EditPlaylistActivity) {
            ((ArrayList) VR().LLILLL).addAll(((C1167470gUD) PR().getState()).LLJJ);
            VR().LLJ.postValue(0);
            MultiVideoViewModel multiVideoViewModelVR3 = VR();
            List<String> listLLIIII = C13LP.LLIIII(((C1167470gUD) PR().getState()).LLJILJILJ);
            if (listLLIIII != null) {
                multiVideoViewModelVR3.LLJI = listLLIIII;
            } else {
                multiVideoViewModelVR3.getClass();
            }
        }
        SR().setEnabled(false);
        Context context2 = getContext();
        if (context2 != null) {
            UR().LJIILJJIL(MixPickCandidatePowerCell.class);
            UR().addItemDecoration(new C0DXR() { // from class: X.0fBq
                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view2, recyclerView, c21673919s1);
                    rect.set(2, 2, 2, 2);
                }
            });
            CandidateGridLayoutManager candidateGridLayoutManager = new CandidateGridLayoutManager(context2, UR());
            UR().setLayoutManager(candidateGridLayoutManager);
            UR().setItemAnimator(null);
            UR().LJIIL((AbstractC329610Cw3) VR().LLJILLL.getValue());
            UR().addOnScrollListener(new AsS32S0200000_18(candidateGridLayoutManager, this, 0));
            ((PowerPageSource) VR().LLJILLL.getValue()).getOperator().refresh();
            if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dnx, null, false);
                if (viewTd != null) {
                    C786410Ut5.I7(new AbS508S0200000_18(this, viewTd, 25, 42), viewTd.findViewById(R.id.juj));
                }
                UR().LJ(0, viewTd);
            } else {
                View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dny, null, false);
                if (C298660BnE.LIZ() && (textView = (TextView) viewTd2.findViewById(R.id.z8h)) != null) {
                    textView.setText(2131839652);
                }
                UR().LJ(0, viewTd2);
            }
            C1749280vcc c1749280vccMR = MR();
            if (c1749280vccMR != null) {
                c1749280vccMR.LJ();
            }
        }
        VR().LLILZ.postValue(Integer.valueOf(((ArrayList) VR().LLILLL).size()));
        VR().LLILZ.observe(this, new AObserverS222S0100000_18(this, 22));
        VR().LLILZIL.observe(this, new AObserverS222S0100000_18(this, 6));
        if ((getActivity() instanceof MixFeedManagerActivity) || (getActivity() instanceof EditPlaylistActivity)) {
            VR().LLJ.observe(this, new AObserverS221S0100000_17(this, 35));
        }
        View view2 = this.LLILZ;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.y08);
            }
            this.LLILZ = (TuxNavBar) viewFindViewById;
            view2 = viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2492));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZLLL = false;
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131825158);
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) view2).setNavActions(c0om1);
        C786410Ut5.I7(new AbS699S0100000_18(this, 44, 42), SR());
        AssemViewModel.asyncSubscribe$default(NR(), new C2217381BqS() { // from class: X.0gTy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLIZ;
            }
        }, null, new AwS597S0100000_18(this, 764), null, null, 26, null);
        AssemViewModel.asyncSubscribe$default(NR(), new C2217381BqS() { // from class: X.0gTz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLIZLLLIL;
            }
        }, null, new AwS597S0100000_18(this, 762), null, null, 26, null);
        if ((getActivity() instanceof EditPlaylistActivity) && (c1167550gULOR = OR()) != null && c1167550gULOR.LLIZ == 1) {
            view.setFitsSystemWindows(false);
            C14K9.LJIJJ(view, new C1209040hZG(this, 3));
            C20097313kJ.LIZJ(view);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.do4, viewGroup, false);
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
