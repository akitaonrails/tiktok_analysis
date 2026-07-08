package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0I7D;
import X.C0OBG;
import X.C0P9E;
import X.C0PD4;
import X.C0PSG;
import X.C0Q94;
import X.C0QNN;
import X.C0QSJ;
import X.C0WZX;
import X.C0ZP4;
import X.C1125404ai;
import X.C11FA;
import X.C11FD;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C15IK;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C1935507i5;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1A6V;
import X.C1ER1;
import X.C20684815ws;
import X.C2082308Dt;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C665460Q8i;
import X.C671830QWv;
import X.C673150Qan;
import X.C679990Qlp;
import X.C681030QnV;
import X.C681100Qnc;
import X.C681210Qnn;
import X.C681220Qno;
import X.C681310Qnx;
import X.C681320Qny;
import X.C681380Qo4;
import X.C681400Qo6;
import X.C681430Qo9;
import X.C681620QoS;
import X.C681730Qod;
import X.C681910Qov;
import X.C682080QpC;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC681490QoF;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1210900hcG;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC604400NnC;
import X.InterfaceC665370Q7z;
import X.InterfaceC681200Qnm;
import X.InterfaceC681980Qp2;
import X.InterfaceC682070QpB;
import X.InterfaceC682120QpG;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS110S0100000_10;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.communication.ChooseSearchMusicScope;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.ui.DynamicSearchMusicResultFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ChooseSearchMusicFragment extends AmeBaseFragment implements InterfaceC682120QpG, View.OnClickListener, InterfaceC724530SbT, InterfaceC604400NnC, TextView.OnEditorActionListener, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C681380Qo4 LLLIIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2svISA8HELIOSOyAhPDw6K2svJj02ZjAlZww7Jyo/LBw2KTcvIQImOywvDz0yLygpJzs=";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public RelativeLayout LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public RelativeLayout LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public C0I7D LLJIJIL;
    public final ChooseSearchMusicFragment LLJILJIL = this;
    public int LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public C665460Q8i LLJJI;
    public SearchKeywordPresenter LLJJIII;
    public C679990Qlp LLJJIJI;
    public InterfaceC681200Qnm LLJJIJIIJIL;
    public C0PSG LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public DynamicSearchMusicResultFragment LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public long LLJLIL;
    public int LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public int LLLF;
    public final List<String> LLLFF;
    public int LLLFFI;
    public List<String> LLLFZ;
    public final C01GW LLLI;
    public InterfaceC604400NnC LLLII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Qo4] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChooseSearchMusicFragment.class, "searchMusicViewModel", "getSearchMusicViewModel()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/sug/core/viewmodel/ChooseSearchMusicViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIII = new Object() { // from class: X.0Qo4
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC604400NnC.class) {
            this.LLLII = (InterfaceC604400NnC) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChooseSearchMusicScope.class, ChooseSearchMusicScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC604400NnC.class) {
            return this.LLLII;
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
        arrayList.add(ChooseSearchMusicScope.class);
        arrayList.add(ChooseSearchMusicScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChooseSearchMusicScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC604400NnC.class) {
            this.LLLII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC682120QpG
    public final void wH() {
        this.LLJLLL = false;
        C0I7D c0i7d = this.LLJIJIL;
        if (c0i7d != null) {
            c0i7d.setText("");
        }
        InterfaceC681200Qnm interfaceC681200Qnm = this.LLJJIJIIJIL;
        if (interfaceC681200Qnm != null) {
            ((C681210Qnn) interfaceC681200Qnm).LIZ.LLIZ = "";
        }
        cS();
    }

    public ChooseSearchMusicFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChooseSearchMusicViewModel.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 368);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(188);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 369), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10((Fragment) this, 370), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 371), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 365));
        this.LLJJJ = "";
        this.LLJLL = "";
        this.LLJLLIL = true;
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(254));
        this.LLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(253));
        this.LLLF = -1;
        this.LLLFF = C1125404ai.LIZ();
        this.LLLFFI = -1;
        this.LLLFZ = C13BV.INSTANCE;
        this.LLLI = C1935507i5.LIZ(new AwS554S0100000_10(this, 366));
    }

    public final void LJJIL() {
        C0I7D c0i7d = this.LLJIJIL;
        if (c0i7d != null) {
            new C1A6V(requireActivity().getWindow(), c0i7d).LIZ(8);
            c0i7d.clearFocus();
        }
        PR().setState(new AwS25S0010000_10(false, 11));
    }

    public final TuxIconView OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ua3) : null;
            this.LLILLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final ChooseSearchMusicViewModel PR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (ChooseSearchMusicViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv RR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wo7) : null;
            this.LLJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_search_action) : null;
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView UR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_search_cancel) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void ZR() {
        int i;
        int i2;
        SearchKeywordPresenter searchKeywordPresenter = this.LLJJIII;
        String str = null;
        String str2 = searchKeywordPresenter != null ? searchKeywordPresenter.getKeyword().LIZ : null;
        if (str2 == null || str2.length() == 0) {
            if (!C681620QoS.LJI() && !C681620QoS.LIZJ()) {
                LJJIL();
                return;
            }
            if (C681620QoS.LIZJ() && (!this.LLLFZ.isEmpty()) && this.LLLFFI < this.LLLFZ.size() && (i2 = this.LLLFFI) >= 0) {
                str2 = (String) ListProtector.get(this.LLLFZ, i2);
                str = "placeholder_sug";
            } else if (!C681620QoS.LJI() || !(!this.LLLFF.isEmpty()) || this.LLLF >= this.LLLFF.size() || (i = this.LLLF) < 0) {
                LJJIL();
                return;
            } else {
                str2 = (String) ListProtector.get(this.LLLFF, i);
                str = "placeholder_default";
            }
            C1440005kM.LIZ(new C681310Qnx(C2097608Jq.LJIIIIZZ(new Pair("words_position", "-1"), new Pair("words_content", str2), new Pair("words_horder", str))));
        }
        C679990Qlp c679990Qlp = new C679990Qlp();
        c679990Qlp.LIZIZ = str2;
        c679990Qlp.LIZ = "normal_search";
        if (str == null) {
            str = "other";
        }
        c679990Qlp.LJIIIIZZ = str;
        VR(c679990Qlp);
        C1440005kM.LIZ(new IEvent() { // from class: X.0QnW
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void cS() {
        C0I7D c0i7d = this.LLJIJIL;
        if (c0i7d == null) {
            return;
        }
        C671830QWv.LIZIZ(c0i7d, new AwS411S0200000_10(this, c0i7d, 32));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1440005kM.LIZ(new C681220Qno(-1));
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Iterator<Fragment> it2 = getChildFragmentManager().LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            c19ehLJIIJ.LJIIZILJ(it2.next());
        }
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(ChooseSearchMusicFragment.class.getName());
        }
        super.onResume();
        if (isViewValid()) {
            C681100Qnc state = PR().getState();
            int i = state.LL;
            if (!state.LLILZ || (i != 1 && i != 2)) {
                LJJIL();
                return;
            }
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS110S0100000_10(this, 51));
            } else {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0PD4(this, null), 3);
            }
        }
    }

    public final void MR(boolean z) {
        int i;
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.wo6);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (RelativeLayout) viewFindViewById;
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById;
        if (relativeLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIIL(relativeLayout, i);
        }
    }

    @Override // X.InterfaceC604400NnC
    public final void OP(boolean z) {
        if (!z) {
            C681400Qo6 c681400Qo6 = new Object() { // from class: X.0Qo6
            };
            String str = C15IK.LJ;
            String str2 = C15IK.LIZ;
            c681400Qo6.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "search_music_blankpage");
            c2344009Gk.LJIIIIZZ("creation_id", str);
            c2344009Gk.LJIIIIZZ("previous_page", str2);
            C20684815ws.LJIILLIIL("click_discover_more_sounds", c2344009Gk.LIZ);
        }
        KeyboardUtils.LIZIZ(this.LLJIJIL);
        InterfaceC681200Qnm interfaceC681200Qnm = this.LLJJIJIIJIL;
        if (interfaceC681200Qnm != null) {
            ((C681210Qnn) interfaceC681200Qnm).LIZ.NR();
        }
        if (this.LLJZ) {
            bS(C11FA.TAB_TYPE_UNLIMITED_MUSIC.getPosition());
        } else {
            bS(C11FA.TAB_TYPE_DISCOVER.getPosition());
        }
    }

    @Override // X.InterfaceC682120QpG
    public final void Qj(C665460Q8i c665460Q8i) {
        this.LLJJI = c665460Q8i;
    }

    public final void VR(C679990Qlp c679990Qlp) {
        C0I7D c0i7d;
        if (isViewValid() && c679990Qlp != null && !TextUtils.isEmpty(c679990Qlp.LIZIZ)) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLJJ.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(AFwS241S0000000_10.get$arr$(535));
            SearchKeywordPresenter searchKeywordPresenter = this.LLJJIII;
            if (searchKeywordPresenter != null) {
                searchKeywordPresenter.LIZ(new C0P9E(c679990Qlp.LIZIZ, ""));
            }
            c679990Qlp.LJII = this.LLJLILLLLZIIL;
            this.LLJJIJI = c679990Qlp;
            if (((InterfaceC682070QpB) this.LLJZIJLIL.getValue()).LIZIZ() && this.LLJJIJI.LJ == null) {
                this.LLJJIJIL = null;
                ((C0Q94) this.LLLI.getValue()).LIZJ();
            }
            c679990Qlp.LJFF = this.LLJL;
            c679990Qlp.LJI = this.LLJLIL;
            PR().setState(new AwS589S0100000_10(c679990Qlp, 512));
            PR().setState(new AwS25S0001000_10(0, 8));
            if (!c679990Qlp.LIZJ) {
                KeyboardUtils.LIZIZ(this.LLJIJIL);
                C681730Qod.LJIILIIL().LJIIIIZZ(new MusicSearchHistory(c679990Qlp.LIZIZ));
            }
            C0I7D c0i7d2 = this.LLJIJIL;
            if (c0i7d2 != null) {
                c0i7d2.clearFocus();
            }
            PR().setState(new AwS25S0010000_10(false, 11));
            this.LLJJJJ = true;
            String str = c679990Qlp.LIZIZ;
            if (this.LLJIJIL != null && !TextUtils.isEmpty(str) && (c0i7d = this.LLJIJIL) != null) {
                c0i7d.setText(str);
            }
            this.LLJJJJ = false;
            aS(false);
            MR(false);
            ((InterfaceC681980Qp2) this.LLL.getValue()).setLastSearchSoundPage(EnumC681490QoF.SEARCH_RES_PAGE);
        }
    }

    public final void WR(boolean z) {
        String str;
        if (PR().getState().LL == 1) {
            return;
        }
        if (z) {
            if (C681430Qo9.LIZ() && !this.LLJLLL) {
                str = "return";
            } else {
                str = "cancel";
            }
            ((ChooseSearchMusicStateViewModel) this.LLJJ.getValue()).LL = str;
            C0QNN c0qnn = new C0QNN();
            c0qnn.LJIJJ(((ChooseSearchMusicStateViewModel) this.LLJJ.getValue()).vQ2());
            c0qnn.LJIIZILJ("enter_method", str);
            String str2 = C15IK.LIZ;
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            c0qnn.LJFF("search_entrance", str2, c2082308Dt);
            c0qnn.LJFF("creation_id", C15IK.LJ, c2082308Dt);
            c0qnn.LJFF("shoot_way", C15IK.LJIIJJI, c2082308Dt);
            c0qnn.LJIILJJIL();
        }
        PR().setState(new AwS25S0001000_10(1, 8));
    }

    public final void aS(boolean z) {
        int i;
        if (C682080QpC.LIZIZ()) {
            return;
        }
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.fx0);
            } else {
                viewFindViewById = null;
            }
            this.LLILZLL = (RelativeLayout) viewFindViewById;
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById;
        if (relativeLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIIL(relativeLayout, i);
        }
    }

    public final void bS(int i) {
        InterfaceC681200Qnm interfaceC681200Qnm = this.LLJJIJIIJIL;
        if (interfaceC681200Qnm != null) {
            C681210Qnn c681210Qnn = (C681210Qnn) interfaceC681200Qnm;
            NewMusicTabFragment newMusicTabFragment = c681210Qnn.LIZ.LLILZIL;
            if (newMusicTabFragment != null) {
                newMusicTabFragment.bS();
                BaseChooseMusicFragment baseChooseMusicFragment = c681210Qnn.LIZ;
                baseChooseMusicFragment.LLILZIL.hS(C11FD.LIZIZ(i, baseChooseMusicFragment.LLJLLIL, baseChooseMusicFragment.LLJLLL));
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChooseSearchMusicScope.class}).unbindAbility(this.LLJILJIL, InterfaceC604400NnC.class);
    }

    @C14EU
    public final void onChooseMusicDismissKeyboardEvent(C681910Qov c681910Qov) {
        LJJIL();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Fragment fragmentLJJJJZI;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        String strValueOf = "";
        if (numValueOf != null) {
            if (numValueOf.intValue() == R.id.tv_search_cancel) {
                KeyboardUtils.LIZIZ(this.LLJIJIL);
                FragmentManager fragmentManager = getFragmentManager();
                if (fragmentManager != null && (fragmentLJJJJZI = fragmentManager.LJJJJZI("ChooseSearchMusicFragment")) != null && fragmentLJJJJZI.isAdded()) {
                    C0I7D c0i7d = this.LLJIJIL;
                    if (c0i7d != null) {
                        c0i7d.setText("");
                    }
                    InterfaceC681200Qnm interfaceC681200Qnm = this.LLJJIJIIJIL;
                    if (interfaceC681200Qnm != null) {
                        ((C681210Qnn) interfaceC681200Qnm).LIZ.NR();
                        return;
                    }
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == R.id.tv_search_action) {
                ZR();
                return;
            }
            if (numValueOf.intValue() == R.id.lbw) {
                this.LLJLLL = true;
                C0I7D c0i7d2 = this.LLJIJIL;
                if (c0i7d2 != null) {
                    c0i7d2.setText("");
                }
                InterfaceC681200Qnm interfaceC681200Qnm2 = this.LLJJIJIIJIL;
                if (interfaceC681200Qnm2 != null) {
                    ((C681210Qnn) interfaceC681200Qnm2).LIZ.LLIZ = "";
                }
                cS();
                return;
            }
            if (numValueOf.intValue() == R.id.ua3) {
                if (C0OBG.LIZIZ(view)) {
                    return;
                }
                C0Q94 c0q94 = (C0Q94) this.LLLI.getValue();
                HashMap map = new HashMap();
                C0I7D c0i7d3 = this.LLJIJIL;
                if (c0i7d3 != null) {
                    strValueOf = String.valueOf(C2204961BRm.LLLLJI(c0i7d3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI7nb2pWYPuNWKQF85S7SSzZqWMoE3l8SV3s2wuFChV0WmsSDAMzhY5+soLhTPw=", null)));
                }
                map.put("search_keyword", strValueOf);
                map.put("search_id", this.LLJJJ);
                map.put("search_type", "music_create");
                map.put("enter_from", "search_music");
                c0q94.LIZLLL(null, map);
                return;
            }
            if (numValueOf.intValue() != R.id.fx0) {
                return;
            }
            OP(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJILJILJ = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.LLJLILLLLZIIL = arguments.getInt("sound_page_scene", 0);
            this.LLJJL = arguments.getString("creation_id");
            this.LLJJLIIIJLLLLLLLZ = arguments.getString("shoot_way");
            this.LLJZ = arguments.getBoolean("get_unlimited_music_only", false);
            this.LLJL = arguments.getLong("max_video_duration", 0L);
            this.LLJLIL = arguments.getLong("shoot_video_length", 0L);
            this.LLJLL = arguments.getString("music_default_query", "");
            this.LLJLLIL = arguments.getBoolean("music_initial_load", true);
            ArrayList<String> stringArrayList = arguments.getStringArrayList("music_suggested_queries");
            if (stringArrayList != null && (!stringArrayList.isEmpty())) {
                this.LLLFZ = C13LP.LLIIII(stringArrayList);
                this.LLLFFI = -1;
            }
        }
        ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJJI(this).Xq0();
    }

    @C14EU
    public final void onInnerMusicSearchEvent(C681320Qny c681320Qny) {
        String str;
        C679990Qlp c679990Qlp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMusicResultFragment InnerMusicSearchEventNew: ");
        if (c681320Qny != null && (c679990Qlp = c681320Qny.LIZ) != null) {
            str = c679990Qlp.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (isViewValid() && c681320Qny != null) {
            VR(c681320Qny.LIZ);
        }
    }

    @C14EU
    public final void onSugCompletionEvent(C681030QnV c681030QnV) {
        C0I7D c0i7d;
        C0I7D c0i7d2;
        if (isViewValid() && c681030QnV != null) {
            String str = c681030QnV.LIZ;
            if (str == null) {
                str = "";
            }
            if (this.LLJIJIL != null && !TextUtils.isEmpty(str) && (c0i7d2 = this.LLJIJIL) != null) {
                c0i7d2.setText(str);
            }
            if (!TextUtils.isEmpty(str) && (c0i7d = this.LLJIJIL) != null) {
                c0i7d.setSelection(str.length());
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChooseSearchMusicScope.class}).bindAbility(this.LLJILJIL, InterfaceC604400NnC.class);
    }

    @Override // X.InterfaceC682120QpG
    public final void so(C681210Qnn c681210Qnn) {
        this.LLJJIJIIJIL = c681210Qnn;
    }

    public final void NR(boolean z, boolean z2) {
        if (z) {
            OR().setClickable(true);
            if (!z2) {
                OR().setTintColorRes(R.attr.a04);
                return;
            } else {
                OR().setTintColorRes(R.attr.a1h);
                return;
            }
        }
        if (C1ER1.LIZIZ.LLIILZL().LJIIIIZZ()) {
            OR().setClickable(true);
            OR().setTintColorRes(R.attr.a1h);
        } else {
            OR().setClickable(false);
            OR().setTintColorRes(R.attr.a1p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7 A[PHI: r2
      0x01f7: PHI (r2v13 android.view.View) = (r2v12 android.view.View), (r2v30 android.view.View) binds: [B:71:0x01e4, B:76:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0QMK, X.0Qnf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.b4);
        animationLoadAnimation.setStartOffset(20L);
        final int i3 = 0;
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener(this, i3) { // from class: X.0R3y
            public final int $t;
            public Object l0;

            public static final void onAnimationEnd$0(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            public static final void onAnimationRepeat$0(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            public static final void onAnimationRepeat$1(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationEnd$0(this, animation);
                        break;
                    case 1:
                        onAnimationEnd$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationRepeat$0(this, animation);
                        break;
                    case 1:
                        onAnimationRepeat$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationStart$0(this, animation);
                        break;
                    case 1:
                        onAnimationStart$1(this, animation);
                        break;
                }
            }

            {
                this.$t = i3;
                this.l0 = this;
            }

            public static final void onAnimationEnd$1(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
                InterfaceC681200Qnm interfaceC681200Qnm = ((ChooseSearchMusicFragment) animationAnimationListenerC689800R3y.l0).LLJJIJIIJIL;
                if (interfaceC681200Qnm != null) {
                    C681210Qnn c681210Qnn = (C681210Qnn) interfaceC681200Qnm;
                    View view = c681210Qnn.LIZ.LLLIIIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    View view2 = c681210Qnn.LIZ.LLLIILIL;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    c681210Qnn.LIZ.MR(0);
                    c681210Qnn.LIZ.LLILZLL = false;
                }
            }

            public static final void onAnimationStart$0(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            public static final void onAnimationStart$1(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }
        });
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getActivity(), R.anim.b5);
        animationLoadAnimation2.setStartOffset(10L);
        final int i4 = 1;
        animationLoadAnimation2.setAnimationListener(new Animation.AnimationListener(this, i4) { // from class: X.0R3y
            public final int $t;
            public Object l0;

            public static final void onAnimationEnd$0(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            public static final void onAnimationRepeat$0(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            public static final void onAnimationRepeat$1(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationEnd$0(this, animation);
                        break;
                    case 1:
                        onAnimationEnd$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationRepeat$0(this, animation);
                        break;
                    case 1:
                        onAnimationRepeat$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationStart$0(this, animation);
                        break;
                    case 1:
                        onAnimationStart$1(this, animation);
                        break;
                }
            }

            {
                this.$t = i4;
                this.l0 = this;
            }

            public static final void onAnimationEnd$1(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
                InterfaceC681200Qnm interfaceC681200Qnm = ((ChooseSearchMusicFragment) animationAnimationListenerC689800R3y.l0).LLJJIJIIJIL;
                if (interfaceC681200Qnm != null) {
                    C681210Qnn c681210Qnn = (C681210Qnn) interfaceC681200Qnm;
                    View view = c681210Qnn.LIZ.LLLIIIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    View view2 = c681210Qnn.LIZ.LLLIILIL;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    c681210Qnn.LIZ.MR(0);
                    c681210Qnn.LIZ.LLILZLL = false;
                }
            }

            public static final void onAnimationStart$0(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }

            public static final void onAnimationStart$1(AnimationAnimationListenerC689800R3y animationAnimationListenerC689800R3y, Animation animation) {
            }
        });
        if (i2 == R.anim.b4) {
            return animationLoadAnimation;
        }
        if (i2 == R.anim.b5) {
            return animationLoadAnimation2;
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ewp, viewGroup, false);
        C15IK.LJIIJJI = this.LLJJLIIIJLLLLLLLZ;
        C15IK.LJ = this.LLJJL;
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

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            ZR();
            return false;
        }
        return false;
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
