package com.ss.android.ugc.aweme.mix.mixdetail;

import X.AbstractC1250290idn;
import X.AbstractC1585810rMx;
import X.AbstractC329610Cw3;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C05FU;
import X.C05FZ;
import X.C098200Yq;
import X.C0BM0;
import X.C0C0X;
import X.C0COU;
import X.C0OGM;
import X.C0OM1;
import X.C0SUC;
import X.C0T0P;
import X.C0VWN;
import X.C0XQ7;
import X.C0ZP4;
import X.C1164120gOo;
import X.C1164330gP9;
import X.C1165370gQp;
import X.C1165760gRS;
import X.C1167950gUz;
import X.C1168850gWR;
import X.C1169090gWp;
import X.C1169100gWq;
import X.C1169110gWr;
import X.C1169150gWv;
import X.C1169160gWw;
import X.C1169170gWx;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C123100dR;
import X.C1247530iZL;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1321305Fb;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1390850mIV;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C14K4;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19252910Tv;
import X.C19371010qS;
import X.C19406010w6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C20607315kN;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2192381ArE;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C261360AMc;
import X.C297010BkZ;
import X.C338490DOt;
import X.C338520DOw;
import X.C338890DQh;
import X.C343970De7;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C497820Jfg;
import X.C589170N8x;
import X.C621180OYa;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C739260SzE;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC612200Nzm;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1670800ta2;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21676019sM;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.InterfaceC612260Nzs;
import X.InterfaceC625970Ogt;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS73S0200000_4;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.ICollectPlaylist;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionState;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistInfoViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistManagementViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStatusStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.ss.android.ugc.aweme.state.ability.IState;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS17S2000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideosDialog extends Fragment implements InterfaceC724530SbT, InterfaceC487330J9f, InterfaceC612260Nzs {
    public static final C1169090gWp LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final double LLLII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglHELIOSMWE+IT0oLDsyISliBCYrHiwoLCAgDCwtJSA0";
    public C197039127h LL;
    public TuxNavBar LLILLJJLI;
    public C1749280vcc LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public LinearLayout LLILZIL;
    public C197039127h LLILZLL;
    public ConstraintLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public C427660Gpo LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public View LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 573));
    public TuxSheet LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final C736950SvV LLJJJJ;
    public Aweme LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public int LLJLLIL;
    public String LLJLLL;
    public Long LLJZ;
    public C1169150gWv LLJZIJLIL;
    public C0OM1 LLL;
    public UrlModel LLLF;
    public C1389910mGz LLLFF;
    public final InterfaceC625970Ogt LLLFFI;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0gWp] */
    static {
        double dLIZIZ;
        C2217381BqS c2217381BqS = new C2217381BqS(MixVideosDialog.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MixVideosDialog.class, "playlistManagementViewModel", "getPlaylistManagementViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/PlaylistManagementViewModel;", 0), new C2217381BqS(MixVideosDialog.class, "playlistInfoViewModel", "getPlaylistInfoViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/PlaylistInfoViewModel;", 0)};
        LLLFZ = new Object() { // from class: X.0gWp
        };
        if (((Boolean) C261360AMc.LIZ.getValue()).booleanValue()) {
            SettingsManager.LIZLLL().getClass();
            dLIZIZ = SettingsManager.LIZIZ("playlist_panel_settings", 0.8d);
        } else {
            dLIZIZ = 0.73d;
        }
        LLLII = dLIZIZ;
    }

    public MixVideosDialog() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixVideosViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 575);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(171);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJIL = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 576), aFwS256S0000000_18);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PlaylistManagementViewModel.class);
        this.LLJJJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS562S0100000_18(c19719912DlLIZ2, 577), c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 578), AFwS256S0000000_18.get$arr$(172));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PlaylistInfoViewModel.class);
        this.LLJJJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), new AwS562S0100000_18(c19719912DlLIZ3, 579), c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 580), AFwS256S0000000_18.get$arr$(173));
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(this, 574);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(PlaylistConsumptionViewModel.class), awS562S0100000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(174), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJJJLIIL = "";
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = "";
        this.LLJL = true;
        this.LLJLIL = "";
        this.LLJLILLLLZIIL = "";
        this.LLJLL = "";
        this.LLJLLL = "";
        new C1168850gWR(this);
        this.LLLFFI = new C2192381ArE("global", C589170N8x.LIZ("pgc", "playlist"), "playlist_panel_first_favorite_toast_repo_name").LIZ();
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

    public final TuxTextView NR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bc6) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LinearLayout OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.d88) : null;
            this.LLILZIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxIconView PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.goo) : null;
            this.LLIZLLLIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final C197039127h RR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hpq) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxNavBar SR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LLILLJJLI = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final PlaylistConsumptionViewModel UR() {
        return (PlaylistConsumptionViewModel) this.LLJJJJ.getValue();
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qux) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qv4) : null;
            this.LLJILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ZR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final View aS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uqc) : null;
            this.LLJILJILJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View bS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uqd) : null;
            this.LLJJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C1749280vcc cS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILLL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final LinearLayout dS() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wlq) : null;
            this.LLJJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final MixVideosViewModel gS() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (MixVideosViewModel) assemVMLazy.getValue();
    }

    public final void iS() {
        List listLJIILJJIL;
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str = this.LLJJJJLIIL;
        String str2 = this.LLJJLIIIJLLLLLLLZ;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        C20684815ws.LJIILLIIL("manage_playlist", c2344009Gk.LIZ);
        ArrayList arrayList = new ArrayList();
        if (C0BM0.LIZ()) {
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.drawable.cnq);
            c1247530iZL.LIZIZ(2131837028);
            c1247530iZL.LIZ(new AwS597S0100000_18(this, 162));
            arrayList.add(c1247530iZL);
            listLJIILJJIL = arrayList;
        } else {
            C1247530iZL c1247530iZL2 = new C1247530iZL();
            c1247530iZL2.LIZJ(R.drawable.cnq);
            c1247530iZL2.LIZIZ(2131833248);
            c1247530iZL2.LIZ(new AwS597S0100000_18(this, 160));
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZJ(R.drawable.cno);
            c1247530iZL3.LIZIZ(2131828508);
            c1247530iZL3.LIZ(new AwS597S0100000_18(this, 161));
            listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247530iZL2, c1247530iZL3);
        }
        if (!C0COU.LIZ()) {
            int size = C0BM0.LIZ() ? 0 : listLJIILJJIL.size() - 1;
            C1247530iZL c1247530iZL4 = new C1247530iZL();
            c1247530iZL4.LIZJ(R.raw.icon_arrow_turn_up_right);
            c1247530iZL4.LIZIZ(2131847905);
            c1247530iZL4.LIZ(new AwS597S0100000_18(this, 163));
            ListProtector.add(listLJIILJJIL, size, c1247530iZL4);
        }
        C1247530iZL c1247530iZL5 = new C1247530iZL();
        c1247530iZL5.LIZJ(R.drawable.cnp);
        c1247530iZL5.LIZIZ(2131830541);
        c1247530iZL5.LIZJ = 1;
        c1247530iZL5.LJ = new ACListenerS153S0100000_18(this, 35);
        listLJIILJJIL.add(c1247530iZL5);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJFF(listLJIILJJIL);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C19EG activity = getActivity();
        tuxActionSheetLIZJ.show(activity != null ? activity.getSupportFragmentManager() : null, "MixVideosDialog");
    }

    public final void oS() {
        PlayListInfo playListInfo;
        Long itemTotal;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJLJ()) {
            View view = (View) this.LLJJIJI.getValue();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Context context = getContext();
                if (context != null) {
                    Aweme aweme = this.LLJJJJJIL;
                    long jLongValue = (aweme == null || (playListInfo = aweme.playlist_info) == null || (itemTotal = playListInfo.getItemTotal()) == null) ? Long.MAX_VALUE : itemTotal.longValue();
                    layoutParams.width = c19252910Tv.LIZLLL().LJIJI().LJLJJL(C497820Jfg.LIZIZ(context));
                    layoutParams.height = c19252910Tv.LIZLLL().LJIJI().LLJ(C497820Jfg.LIZ(context), jLongValue);
                }
                C786410Ut5.W5(view, layoutParams);
            }
            View view2 = (View) this.LLJJIJI.getValue();
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = (View) this.LLJJIJI.getValue();
            if (view3 != null) {
                view3.requestLayout();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kS() {
        Aweme aweme;
        List<Aweme> listLLIIII;
        ShareInfo shareInfo;
        C19EG activity = getActivity();
        if (activity == null || (aweme = this.LLJJJJJIL) == null) {
            return;
        }
        if (C297010BkZ.LIZ()) {
            C1165370gQp c1165370gQp = UR().LLILZIL;
            if (c1165370gQp == null) {
                c1165370gQp = null;
            }
            listLLIIII = C13LP.LLIIII(c1165370gQp.LLILLL);
            if (listLLIIII == null) {
                return;
            }
        } else {
            listLLIIII = ((C1164120gOo) gS().vmDispatcher.getState()).LL;
            if (listLLIIII == null) {
                return;
            }
        }
        if (C297010BkZ.LIZ()) {
            MixStruct mixStruct = ((C1165760gRS) UR().getState()).LLILZIL;
            if (mixStruct == null || (shareInfo = mixStruct.getShareInfo()) == null) {
                return;
            }
        } else {
            MixStruct mixStruct2 = gS().getState().LLIZ;
            if (mixStruct2 == null || (shareInfo = mixStruct2.getShareInfo()) == null) {
                return;
            }
        }
        boolean zLJIJI = u.LJIJI(this.LLJLIL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), false);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", this.LLJJLIIIJLLLLLLLZ);
        pairArr[1] = new Pair("playlist_id", this.LLJJJJLIIL);
        pairArr[2] = new Pair("is_self", zLJIJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("click_share_playlist", C2097608Jq.LJIIIIZZ(pairArr));
        hS("share_sign");
        C621180OYa.LIZ.LJJJJZ(activity, this.LLJJJJLIIL, this.LLJJL, aweme, listLLIIII, shareInfo, zLJIJI, this.LLJJLIIIJLLLLLLLZ);
    }

    public final void oD2() {
        IState iState = (IState) ServiceManager.get().getService(IPlaylistCollectionState.class);
        if (!((Boolean) iState.currentState(this.LLJJJJLIIL, iState.defaultState())).booleanValue()) {
            ((ICollect) ServiceManager.get().getService(ICollectPlaylist.class)).collect(this.LLJJJJLIIL, null, new AwS632S0100000_18(this, 50), new AwS632S0100000_18(this, 51));
            C1169110gWr c1169110gWr = new Object() { // from class: X.0gWr
            };
            String str = this.LLJJJJLIIL;
            String str2 = this.LLJLIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1169110gWr.getClass();
            C20684815ws.LJIILLIIL("favourite_playlist", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "playlist"), new Pair("enter_method", "playlist_panel"), new Pair("playlist_id", str), new Pair("author_id", str2)), linkedHashMap));
            hS("save_sign");
            return;
        }
        C1389910mGz c1389910mGz = this.LLLFF;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        ((ICollect) ServiceManager.get().getService(ICollectPlaylist.class)).unCollect(this.LLJJJJLIIL, null, null, null);
        C1169110gWr c1169110gWr2 = new Object() { // from class: X.0gWr
        };
        String str3 = this.LLJJJJLIIL;
        String str4 = this.LLJLIL;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        c1169110gWr2.getClass();
        C20684815ws.LJIILLIIL("cancel_favourite_playlist", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "playlist"), new Pair("enter_method", "playlist_panel"), new Pair("playlist_id", str3), new Pair("author_id", str4)), linkedHashMap2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C487280J9a.LIZJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!(getActivity() instanceof MixVideoDetailActivity) && !C297010BkZ.LIZ()) {
            gS().wQ2();
        }
        this.LLJL = false;
        ((IStateNotifier) ServiceManager.get().getService(IPlaylistCollectionStateNotifier.class)).removeSubscriber(this);
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
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        Window window;
        View decorView;
        super.onResume();
        if (!C0COU.LIZ() || (activity = getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        HandlerHook.viewPost(decorView, new ARunnableS73S0200000_4(decorView, this, 12));
    }

    public final void hS(String str) {
        Integer numValueOf;
        C0OGM c0ogm;
        String str2 = "user_click";
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        InterfaceC1670800ta2 activity = getActivity();
        Aweme aweme = null;
        if ((activity instanceof C0OGM) && (c0ogm = (C0OGM) activity) != null) {
            numValueOf = Integer.valueOf(c0ogm.getPageType());
        } else {
            numValueOf = null;
        }
        iCommercePageTrackingServiceLIZLLL.LIZJ(new C19406010w6(numValueOf, aweme, "playlist_page", str2, str, 34));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String aid;
        String string;
        String string2;
        String string3;
        String string4;
        String strValueOf;
        String string5;
        com.ss.android.ugc.aweme.feed.model.MixStruct mixInfo;
        Serializable serializable2;
        Dialog dialog;
        Window window;
        C05FZ c05fz = C05FZ.LIZ;
        C2097608Jq.LJ();
        c05fz.getClass();
        if (C1321305Fb.LIZ()) {
            C05FU.LIZ(C05FU.LIZ, "playlist_launch_performance", "playlist_dialog_create_start");
        }
        super.onCreate(bundle);
        TuxSheet tuxSheet = this.LLJJIJIIJIL;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(R.style.aei);
        }
        this.LLJLLIL = 0;
        String str = null;
        if (C0C0X.LIZ() == 0) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable2 = arguments.getSerializable("key_positioned_aweme");
            } else {
                serializable2 = null;
            }
            this.LLJJJJJIL = (Aweme) serializable2;
        } else {
            this.LLJJJJJIL = C1169100gWq.LIZIZ;
            C1169100gWq.LIZIZ = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_search_params");
        } else {
            serializable = null;
        }
        this.LLJZIJLIL = (C1169150gWv) serializable;
        Aweme aweme = this.LLJJJJJIL;
        String str2 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        this.LLJLLL = aid;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("key_mix_id", "")) == null) {
            string = "";
        }
        this.LLJJJJLIIL = string;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string2 = arguments4.getString("key_mix_name", "")) == null) {
            string2 = "";
        }
        this.LLJJL = string2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.getString("key_video_from", "");
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (string3 = arguments6.getString("key_mix_uid", "")) == null) {
            string3 = "";
        }
        this.LLJLIL = string3;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (string4 = arguments7.getString("key_mix_secuid", "")) == null) {
            string4 = "";
        }
        this.LLJLILLLLZIIL = string4;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            strValueOf = arguments8.getString("playlist_session_id", "");
        } else {
            strValueOf = null;
        }
        if (!C123100dR.LIZ(strValueOf) || strValueOf == null) {
            String str3 = C0SUC.LIZ(getContext()).getExtra().get("playlist_session_id");
            if (C123100dR.LIZ(str3)) {
                str = str3;
            }
            strValueOf = str;
            if (strValueOf == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJJJJLIIL);
                sbLIZ.append(System.currentTimeMillis());
                strValueOf = String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
            }
        }
        this.LLJLL = strValueOf;
        Aweme aweme2 = this.LLJJJJJIL;
        if (aweme2 != null) {
            AwemeExtKt.appendMobParam(aweme2, "playlist_session_id", strValueOf);
        }
        Aweme aweme3 = this.LLJJJJJIL;
        if (aweme3 != null) {
            AwemeExtKt.appendMobParam(aweme3, "key_mix_id", this.LLJJJJLIIL);
        }
        Aweme aweme4 = this.LLJJJJJIL;
        if (aweme4 != null) {
            String authorUid = AwemeExtKt.getAuthorUid(aweme4);
            if (authorUid == null) {
                authorUid = "";
            }
            this.LLJLIL = authorUid;
            String secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme4);
            if (secAuthorUid == null) {
                secAuthorUid = "";
            }
            this.LLJLILLLLZIIL = secAuthorUid;
        }
        if (!C297010BkZ.LIZ()) {
            MixVideosViewModel mixVideosViewModelGS = gS();
            String str4 = this.LLJLIL;
            if (str4 == null) {
                str4 = "";
            }
            mixVideosViewModelGS.LLJILJIL = str4;
            MixVideosViewModel mixVideosViewModelGS2 = gS();
            String str5 = this.LLJLILLLLZIIL;
            if (str5 == null) {
                str5 = "";
            }
            mixVideosViewModelGS2.LLJILJILJ = str5;
        } else {
            PlaylistConsumptionViewModel playlistConsumptionViewModelUR = UR();
            String str6 = this.LLJLIL;
            if (str6 == null) {
                str6 = "";
            }
            playlistConsumptionViewModelUR.LLJIJIL = str6;
            PlaylistConsumptionViewModel playlistConsumptionViewModelUR2 = UR();
            String str7 = this.LLJLILLLLZIIL;
            if (str7 == null) {
                str7 = "";
            }
            playlistConsumptionViewModelUR2.LLJILJIL = str7;
        }
        Aweme aweme5 = this.LLJJJJJIL;
        if (aweme5 != null && (mixInfo = aweme5.getMixInfo()) != null) {
            this.LLJJL = mixInfo.mixName;
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null && (string5 = arguments9.getString("key_mix_dialog_enter_from", "")) != null) {
            str2 = string5;
        }
        this.LLJJLIIIJLLLLLLLZ = str2;
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMixDeleteEvent(C1164330gP9 c1164330gP9) {
        String str = c1164330gP9.LIZIZ;
        if (str != null && Intrinsics.LJFF(this.LLJJJJLIIL, str)) {
            Aweme aweme = c1164330gP9.LIZ;
            if (aweme != null) {
                aweme.playlist_info = null;
                C1440005kM.LIZ(new C739260SzE(null, c1164330gP9.LIZIZ, false));
            }
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMixManageEvent(C1167950gUz c1167950gUz) {
        if (getActivity() instanceof DetailActivity) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMixNameChangeEvent(C0T0P c0t0p) {
        String str;
        String str2;
        UrlModel icon;
        String extra;
        MixStatisStruct statis;
        int mixType;
        MixStatusStruct status;
        ShareInfo shareInfo;
        String mixId;
        PlayListInfo playListInfo;
        PlayListInfo playListInfo2;
        String str3;
        String str4;
        UrlModel icon2;
        String extra2;
        MixStatisStruct statis2;
        MixStatusStruct status2;
        ShareInfo shareInfo2;
        if (Intrinsics.LJFF(this.LLJJJJLIIL, c0t0p.LIZIZ)) {
            int mixType2 = 0;
            if (!C297010BkZ.LIZ()) {
                MixVideosViewModel mixVideosViewModelGS = gS();
                String str5 = c0t0p.LIZ;
                String str6 = c0t0p.LIZIZ;
                MixStruct mixStruct = ((C1164120gOo) mixVideosViewModelGS.vmDispatcher.getState()).LLIZ;
                if (mixStruct != null) {
                    str3 = mixStruct.mixId;
                } else {
                    str3 = null;
                }
                if (u.LJIJI(str3, str6, false)) {
                    MixStruct mixStruct2 = new MixStruct();
                    C1164120gOo c1164120gOo = (C1164120gOo) mixVideosViewModelGS.vmDispatcher.getState();
                    MixStruct mixStruct3 = c1164120gOo.LLIZ;
                    if (mixStruct3 != null) {
                        str4 = mixStruct3.mixId;
                    } else {
                        str4 = null;
                    }
                    mixStruct2.mixId = str4;
                    mixStruct2.setMixName(str5);
                    MixStruct mixStruct4 = c1164120gOo.LLIZ;
                    if (mixStruct4 != null) {
                        icon2 = mixStruct4.getIcon();
                    } else {
                        icon2 = null;
                    }
                    mixStruct2.setIcon(icon2);
                    MixStruct mixStruct5 = c1164120gOo.LLIZ;
                    if (mixStruct5 != null) {
                        extra2 = mixStruct5.getExtra();
                    } else {
                        extra2 = null;
                    }
                    mixStruct2.setExtra(extra2);
                    MixStruct mixStruct6 = c1164120gOo.LLIZ;
                    if (mixStruct6 != null) {
                        statis2 = mixStruct6.getStatis();
                    } else {
                        statis2 = null;
                    }
                    mixStruct2.setStatis(statis2);
                    MixStruct mixStruct7 = c1164120gOo.LLIZ;
                    if (mixStruct7 != null) {
                        mixType2 = mixStruct7.getMixType();
                    }
                    mixStruct2.setMixType(mixType2);
                    MixStruct mixStruct8 = c1164120gOo.LLIZ;
                    if (mixStruct8 != null) {
                        status2 = mixStruct8.getStatus();
                    } else {
                        status2 = null;
                    }
                    mixStruct2.setStatus(status2);
                    MixStruct mixStruct9 = c1164120gOo.LLIZ;
                    if (mixStruct9 != null) {
                        shareInfo2 = mixStruct9.getShareInfo();
                    } else {
                        shareInfo2 = null;
                    }
                    mixStruct2.setShareInfo(shareInfo2);
                    mixVideosViewModelGS.setState(new AwS597S0100000_18(mixStruct2, 723));
                    mixVideosViewModelGS.withState(new AwS17S2000000_18(str6, str5, 3));
                }
            } else {
                PlaylistConsumptionViewModel playlistConsumptionViewModelUR = UR();
                String str7 = c0t0p.LIZ;
                String str8 = c0t0p.LIZIZ;
                MixStruct mixStruct10 = ((C1165760gRS) playlistConsumptionViewModelUR.vmDispatcher.getState()).LLILZIL;
                if (mixStruct10 != null) {
                    str = mixStruct10.mixId;
                } else {
                    str = null;
                }
                if (u.LJIJI(str, str8, false)) {
                    MixStruct mixStruct11 = new MixStruct();
                    C1165760gRS c1165760gRS = (C1165760gRS) playlistConsumptionViewModelUR.vmDispatcher.getState();
                    MixStruct mixStruct12 = c1165760gRS.LLILZIL;
                    if (mixStruct12 != null) {
                        str2 = mixStruct12.mixId;
                    } else {
                        str2 = null;
                    }
                    mixStruct11.mixId = str2;
                    mixStruct11.setMixName(str7);
                    MixStruct mixStruct13 = c1165760gRS.LLILZIL;
                    if (mixStruct13 != null) {
                        icon = mixStruct13.getIcon();
                    } else {
                        icon = null;
                    }
                    mixStruct11.setIcon(icon);
                    MixStruct mixStruct14 = c1165760gRS.LLILZIL;
                    if (mixStruct14 != null) {
                        extra = mixStruct14.getExtra();
                    } else {
                        extra = null;
                    }
                    mixStruct11.setExtra(extra);
                    MixStruct mixStruct15 = c1165760gRS.LLILZIL;
                    if (mixStruct15 != null) {
                        statis = mixStruct15.getStatis();
                    } else {
                        statis = null;
                    }
                    mixStruct11.setStatis(statis);
                    MixStruct mixStruct16 = c1165760gRS.LLILZIL;
                    if (mixStruct16 != null) {
                        mixType = mixStruct16.getMixType();
                    } else {
                        mixType = 0;
                    }
                    mixStruct11.setMixType(mixType);
                    MixStruct mixStruct17 = c1165760gRS.LLILZIL;
                    if (mixStruct17 != null) {
                        status = mixStruct17.getStatus();
                    } else {
                        status = null;
                    }
                    mixStruct11.setStatus(status);
                    MixStruct mixStruct18 = c1165760gRS.LLILZIL;
                    if (mixStruct18 != null) {
                        shareInfo = mixStruct18.getShareInfo();
                    } else {
                        shareInfo = null;
                    }
                    mixStruct11.setShareInfo(shareInfo);
                    playlistConsumptionViewModelUR.setState(new AwS597S0100000_18(mixStruct11, 712));
                    C1165370gQp c1165370gQp = playlistConsumptionViewModelUR.LLILZIL;
                    if (c1165370gQp == null) {
                        c1165370gQp = null;
                    }
                    String str9 = playlistConsumptionViewModelUR.LLIZ;
                    for (Aweme aweme : (ArrayList) c1165370gQp.LLILLL) {
                        PlayListInfo playListInfo3 = aweme.playlist_info;
                        if (playListInfo3 != null) {
                            mixId = playListInfo3.getMixId();
                        } else {
                            mixId = null;
                        }
                        if (u.LJIJI(mixId, str9, false) && (playListInfo = aweme.playlist_info) != null) {
                            playListInfo.setMixName(str7);
                        }
                    }
                }
            }
            Aweme aweme2 = this.LLJJJJJIL;
            if (aweme2 != null && (playListInfo2 = aweme2.playlist_info) != null) {
                playListInfo2.setMixName(c0t0p.LIZ);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131850543);
            c1389890mGx.LJIIJJI();
            C1440005kM.LIZ(new C739260SzE(this.LLJJJJJIL, null, true));
        }
    }

    public static int mS(TuxTextView tuxTextView, int i) {
        if (tuxTextView.getMeasuredWidth() > i) {
            tuxTextView.setMaxWidth(i);
            return i;
        }
        return tuxTextView.getMeasuredWidth();
    }

    public final String MR(long j, long j2) {
        String string;
        String string2;
        String string3;
        String string4;
        if (j2 < 60000) {
            return new BDDateFormat("jn").LIZIZ(j2, Locale.getDefault());
        }
        if (j2 < 3600000) {
            Context context = getContext();
            if (context == null || (string4 = context.getString(2131850409, Long.valueOf(j2 / 60000))) == null) {
                return "";
            }
            return string4;
        }
        if (j2 < 86400000) {
            Context context2 = getContext();
            if (context2 == null || (string3 = context2.getString(2131850407, Long.valueOf(j2 / 3600000))) == null) {
                return "";
            }
            return string3;
        }
        if (j2 < 604800000) {
            Context context3 = getContext();
            if (context3 == null || (string2 = context3.getString(2131850405, Long.valueOf(j2 / 86400000))) == null) {
                return "";
            }
            return string2;
        }
        long j3 = j2 / 86400000;
        if (j3 <= 2147483647L && ((int) j3) == 7) {
            Context context4 = getContext();
            if (context4 == null || (string = context4.getString(2131850405, 7)) == null) {
                return "";
            }
            return string;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar2.get(1) == calendar.get(1)) {
            return new BDDateFormat("ll-Y").LIZIZ(j, Locale.getDefault());
        }
        return new BDDateFormat("ll").LIZIZ(j, Locale.getDefault());
    }

    public final void nS(String str, String str2) {
        boolean z;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View viewLJII = SR().LJII("mix_title");
            if ((viewLJII instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) viewLJII) != null) {
                tuxTextView2.setMinTextSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                tuxTextView2.setText(str);
                return;
            }
            return;
        }
        TuxNavBar tuxNavBarSR = SR();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c1250250idj.LIZIZ = "mix_title";
        if (str2 == null) {
            str2 = "";
        }
        c1250250idj.LIZLLL = str2;
        tuxNavBarSR.LJIJJ(c1250250idj);
        View viewLJII2 = SR().LJII("mix_title");
        if (!(viewLJII2 instanceof TuxTextView) || (tuxTextView = (TuxTextView) viewLJII2) == null) {
            return;
        }
        tuxTextView.setMinTextSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        oS();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [kotlin.jvm.functions.Function1] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C1770850wBP c1770850wBP;
        int i2;
        C19EG activity;
        Window window;
        View decorView;
        Integer numValueOf;
        int i3;
        C20244914Jj c20244914JjLIZ;
        boolean zLJI = MethodIDManager.LJI(202390);
        super.onViewCreated(view, bundle);
        ((IStateNotifier) ServiceManager.get().getService(IPlaylistCollectionStateNotifier.class)).addSubscriber(this);
        cS().setOnTouchListener(new View.OnTouchListener() { // from class: X.0gWX
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        this.LLJL = true;
        boolean zLIZ = C0COU.LIZ();
        int i4 = R.raw.icon_ellipsis_horizontal;
        View viewFindViewById = null;
        if (zLIZ) {
            View viewFindViewById2 = this.LLIZ;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.fdv);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLIZ = (ConstraintLayout) viewFindViewById2;
            }
            C786410Ut5.LL(0, (ConstraintLayout) viewFindViewById2);
            C786410Ut5.LLLLZLLLI(SR(), 8);
            if (u.LJIJI(this.LLJLIL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), false)) {
                TuxIconView tuxIconViewPR = PR();
                if (!C0BM0.LIZ()) {
                    i4 = R.raw.icon_ellipsis_vertical;
                }
                tuxIconViewPR.setIconRes(i4);
                C786410Ut5.I7(new AkS87S0100000_18(this, 6), PR());
            } else {
                C786410Ut5.LLLLLLZZ(PR(), 8);
            }
            View viewFindViewById3 = this.LLJ;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.e1y);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJ = (TuxIconView) viewFindViewById3;
            }
            C786410Ut5.I7(new AkS87S0100000_18(this, 7), viewFindViewById3);
            AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 172);
            if (C297010BkZ.LIZ()) {
                c1770850wBP = null;
                i2 = 6;
                C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gWZ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1165760gRS) obj).LLILZIL;
                    }
                }, null, new AwS632S0100000_18(awS597S0100000_18, 56), 6);
            } else {
                c1770850wBP = null;
                i2 = 6;
                C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gWe
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1164120gOo) obj).LLIZ;
                    }
                }, null, new AwS632S0100000_18(awS597S0100000_18, 58), 6);
            }
        } else {
            C0OM1 c0om1 = new C0OM1();
            this.LLL = c0om1;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 585));
            c0om1.LJ(c1251150ifB);
            AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZIZ = "favorite_icon";
            IState iState = (IState) ServiceManager.get().getService(IPlaylistCollectionState.class);
            if (((Boolean) iState.currentState(this.LLJJJJLIIL, iState.defaultState())).booleanValue()) {
                i = R.raw.icon_bookmark_fill;
            } else {
                i = R.raw.icon_bookmark;
            }
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = i;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new C1169170gWx(this));
            abstractC1250290idnArr[0] = c1251150ifB2;
            c0om1.LIZIZ(abstractC1250290idnArr);
            if (u.LJIJI(this.LLJLIL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), false)) {
                AkS87S0100000_18 akS87S0100000_18 = new AkS87S0100000_18(this, 10);
                AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
                C1251150ifB c1251150ifB3 = new C1251150ifB();
                if (!C0BM0.LIZ()) {
                    i4 = R.raw.icon_ellipsis_vertical;
                }
                c1251150ifB3.LIZLLL();
                c1251150ifB3.LIZJ = i4;
                c1251150ifB3.LIZLLL = true;
                c1251150ifB3.LIZJ(new AwS419S0200000_18(akS87S0100000_18, view, 44));
                abstractC1250290idnArr2[0] = c1251150ifB3;
                c0om1.LIZIZ(abstractC1250290idnArr2);
            } else {
                AkS87S0100000_18 akS87S0100000_182 = new AkS87S0100000_18(this, 11);
                C1251150ifB c1251150ifB4 = new C1251150ifB();
                c1251150ifB4.LIZLLL();
                c1251150ifB4.LIZJ = R.raw.icon_arrow_turn_up_right;
                c1251150ifB4.LIZLLL = true;
                c1251150ifB4.LIZJ(new AwS419S0200000_18(akS87S0100000_182, view, 45));
                c0om1.LIZIZ(c1251150ifB4);
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = this.LLJJL;
            c1250250idj.LIZLLL = " ";
            c1250250idj.LIZIZ = "mix_title";
            c0om1.LIZJ = c1250250idj;
            c1770850wBP = null;
            i2 = 6;
            C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gWf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1164120gOo) obj).LLIZ;
                }
            }, null, new AwS632S0100000_18(this, 61), 6);
            TuxNavBar tuxNavBarSR = SR();
            C0OM1 c0om12 = this.LLL;
            if (c0om12 == null) {
                c0om12 = null;
            }
            tuxNavBarSR.setNavActions(c0om12);
            SR().LJIIZILJ(true);
        }
        C0VWN.LIZ("mix_video_dialog", false).LIZIZ(ZR());
        ZR().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0gWo
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i5) {
                if (i5 != 0) {
                    JatoXL.lightJitBlockStart();
                } else {
                    JatoXL.lightJitBlockStop();
                }
            }
        });
        ZR().LJIILJJIL(MixFeedCell.class);
        if (!C297010BkZ.LIZ()) {
            ZR().LJIIL((AbstractC329610Cw3) gS().LLJJL.getValue());
        } else {
            ZR().LJIIL(UR().getConfig());
        }
        ZR().LJII(new C20607315kN() { // from class: X.0gWW
            @Override // X.C20607315kN
            public final void LIZIZ() {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIIZILJ(this.LL, true);
            }

            @Override // X.C20607315kN
            public final void LIZJ() {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIIZILJ(this.LL, false);
            }

            @Override // X.C20607315kN
            public final void LIZLLL() {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIIZILJ(this.LL, true);
            }
        });
        ZR().addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0gWU
            public float LL;

            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        float y = motionEvent.getY() - this.LL;
                        this.LL = y;
                        if (y > 10.0f) {
                            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                            String str = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
                            c1169160gWw.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", str);
                            c2344009Gk.LJIIIIZZ("direction", "down");
                            C20684815ws.LJIILLIIL("slide_playlist_video_list", c2344009Gk.LIZ);
                            return false;
                        }
                        if (y >= -10.0f) {
                            return false;
                        }
                        C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
                        String str2 = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
                        c1169160gWw2.getClass();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("enter_from", str2);
                        c2344009Gk2.LJIIIIZZ("direction", "up");
                        C20684815ws.LJIILLIIL("slide_playlist_video_list", c2344009Gk2.LIZ);
                        return false;
                    }
                    return false;
                }
                this.LL = motionEvent.getY();
                return false;
            }
        });
        ZR().addItemDecoration(new C338890DQh());
        ZR().LJII(new C20607315kN() { // from class: X.0gVF
            @Override // X.C20607315kN
            public final void LJII(Exception exc) {
                C1749280vcc c1749280vccCS = this.LL.cS();
                if (c1749280vccCS != null) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C1893080zMY.LJFF(c1722300uv6, new AwS562S0100000_18(this.LL, 586));
                    c1749280vccCS.setStatus(c1722300uv6);
                }
                C1749280vcc c1749280vccCS2 = this.LL.cS();
                if (c1749280vccCS2 != null) {
                    C786410Ut5.LLLZLZ(c1749280vccCS2, 0);
                }
            }

            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                MixVideosDialog mixVideosDialog;
                Aweme aweme;
                RecyclerView.LayoutManager layoutManager;
                C1749280vcc c1749280vccCS = this.LL.cS();
                if (c1749280vccCS != null) {
                    C786410Ut5.LLLZLZ(c1749280vccCS, 8);
                }
                if (C297010BkZ.LIZ() && (aweme = (mixVideosDialog = this.LL).LLJJJJJIL) != null) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR = mixVideosDialog.ZR();
                    if (viewOnAttachStateChangeListenerC20604515jvZR != null) {
                        layoutManager = viewOnAttachStateChangeListenerC20604515jvZR.getLayoutManager();
                    } else {
                        layoutManager = null;
                    }
                    if ((layoutManager instanceof LinearLayoutManager) && mixVideosDialog.LLJLLIL != mixVideosDialog.UR().CQ2(aweme)) {
                        mixVideosDialog.LLJLLIL = mixVideosDialog.UR().CQ2(aweme);
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR2 = mixVideosDialog.ZR();
                        if (viewOnAttachStateChangeListenerC20604515jvZR2 != null) {
                            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvZR2, new ARunnableS73S0200000_4(layoutManager, mixVideosDialog, 13));
                        }
                    }
                }
            }
        });
        if (!C297010BkZ.LIZ()) {
            if (!C0COU.LIZ()) {
                C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gWg
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1164120gOo) obj).LLIZ;
                    }
                }, c1770850wBP, new AwS632S0100000_18(this, 62), i2);
            }
            C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gWl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1164120gOo) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 66), 4);
            C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gOM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1164120gOo) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 65), 4);
            C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gP7
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1164120gOo) obj).LLILZLL);
                }
            }, null, new AwS632S0100000_18(this, 52), 6);
            C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0gP1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1164120gOo) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 53), 4);
        } else {
            AssemViewModel.asyncSubscribe$default(UR(), new C2217381BqS() { // from class: X.0gRg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1165760gRS c1165760gRS = (C1165760gRS) obj;
                    c1165760gRS.getClass();
                    return C627260Oiy.LIZLLL(c1165760gRS);
                }
            }, c1770850wBP, c1770850wBP, new AwS562S0100000_18(this, 582), new AwS597S0100000_18(this, 168), i2, c1770850wBP);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gWY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1165760gRS) obj).LLILZIL;
                }
            }, c1770850wBP, new AwS632S0100000_18(this, 54), i2);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gWb
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1165760gRS) obj).LLILLL;
                }
            }, c1770850wBP, new AwS632S0100000_18(this, 57), i2);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gWi
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1165760gRS) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 59), 4);
            AssemVMLazy assemVMLazy = this.LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gWm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C593430NPh) obj).LL;
                }
            }, null, new AwS632S0100000_18(this, 60), 6);
        }
        if (C0COU.LIZ()) {
            C19EG activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                C20246014Ju c20246014JuLIZ = C14K4.LIZ(decorView);
                if (c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) != null) {
                    numValueOf = Integer.valueOf(c20244914JjLIZ.LIZLLL);
                } else {
                    numValueOf = null;
                }
                LinearLayout linearLayoutOR = OR();
                if (numValueOf != null && numValueOf.intValue() != 0) {
                    i3 = 4;
                } else {
                    i3 = 12;
                }
                linearLayoutOR.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
            }
            LinearLayout linearLayoutOR2 = OR();
            if (linearLayoutOR2 != null) {
                C786410Ut5.LJZL(0, linearLayoutOR2);
            }
            View view4 = this.LLILZLL;
            if (view4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById = view5.findViewById(R.id.uyq);
                }
                this.LLILZLL = (C197039127h) viewFindViewById;
                view4 = viewFindViewById;
            }
            C197039127h c197039127h = (C197039127h) view4;
            if (c197039127h != null) {
                c197039127h.LJJJJL(AFwS256S0000000_18.get$arr$(183));
                C786410Ut5.I7(new AkS87S0100000_18(this, 12), c197039127h);
            }
            C197039127h c197039127hRR = RR();
            if (c197039127hRR != null) {
                c197039127hRR.LJJJJL(AFwS256S0000000_18.get$arr$(184));
                IState iState2 = (IState) ServiceManager.get().getService(IPlaylistCollectionState.class);
                if (((Boolean) iState2.currentState(this.LLJJJJLIIL, iState2.defaultState())).booleanValue()) {
                    c197039127hRR.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
                    c197039127hRR.setText(2131824972);
                } else {
                    c197039127hRR.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
                    c197039127hRR.setText(2131824971);
                }
                C786410Ut5.I7(new AkS87S0100000_18(this, 5), c197039127hRR);
            }
        }
        if (!C297010BkZ.LIZ()) {
            gS().DQ2(this.LLJJJJJIL, this.LLJJJJLIIL);
            C786410Ut5.LLLZLZ(cS(), 0);
            cS().LJ();
        } else if (Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, "general_search")) {
            PlaylistConsumptionViewModel playlistConsumptionViewModelUR = UR();
            Aweme aweme = this.LLJJJJJIL;
            playlistConsumptionViewModelUR.LLIZ = this.LLJJJJLIIL;
            playlistConsumptionViewModelUR.LLJ = aweme;
            playlistConsumptionViewModelUR.IQ2(aweme);
            if (aweme != null) {
                String aid = aweme.getAid();
                aid.toString();
                playlistConsumptionViewModelUR.LLIZLLLIL = aid;
            } else {
                playlistConsumptionViewModelUR.LLIZLLLIL = playlistConsumptionViewModelUR.FQ2();
            }
            UR().manualListRefresh();
            UR().HQ2();
        }
        oS();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJLJ() && (activity = getActivity()) != null) {
            C487280J9a.LIZ(activity.hashCode(), this);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C05FZ c05fz = C05FZ.LIZ;
        C19GS c19gs = null;
        boolean zLIZ = C20673215v0.LIZ(R.layout.do6, null);
        c05fz.getClass();
        if (zLIZ) {
            C19371010qS.LIZIZ(-1L, "playlist_dialog_inflate");
        } else {
            C19371010qS.LIZIZ(-2L, "playlist_dialog_inflate");
        }
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.do6, getActivity(), viewGroup, false);
        C2097608Jq.LJ();
        if (C1321305Fb.LIZ()) {
            C05FU.LIZ(C05FU.LIZ, "playlist_launch_performance", "playlist_dialog_created");
        }
        try {
            ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
            viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZLLL;
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Object obj, EnumC612200Nzm enumC612200Nzm) {
        TuxIconView tuxIconView;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (Intrinsics.LJFF(str, this.LLJJJJLIIL)) {
            boolean zLIZ = C0COU.LIZ();
            int i = R.raw.icon_bookmark_fill;
            if (zLIZ) {
                C197039127h c197039127hRR = RR();
                if (c197039127hRR != null) {
                    if (zBooleanValue) {
                        c197039127hRR.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
                        c197039127hRR.setText(2131824972);
                        return;
                    } else {
                        c197039127hRR.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
                        c197039127hRR.setText(2131824971);
                        return;
                    }
                }
                return;
            }
            View viewLJII = SR().LJII("favorite_icon");
            if (!(viewLJII instanceof TuxIconView) || (tuxIconView = (TuxIconView) viewLJII) == null) {
                return;
            }
            if (!zBooleanValue) {
                i = R.raw.icon_bookmark;
            }
            tuxIconView.setIconRes(i);
        }
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
