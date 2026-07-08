package com.ss.android.ugc.aweme.music.ghost;

import X.C01D1;
import X.C0OEA;
import X.C0OEC;
import X.C0XI4;
import X.C127G;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2277881EDy;
import X.C23250099c;
import X.C2344009Gk;
import X.C631230OpN;
import X.C632050Oqh;
import X.C632060Oqi;
import X.C632070Oqj;
import X.C632410OrH;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC632420OrI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC615760ODe;
import X.InterfaceC633960Otm;
import X.InterfaceC736910SvR;
import Y.AObjectS384S0100000_9;
import android.content.Context;
import android.text.Html;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.ab.ArtistCertiflowConfig;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class GhostMusicAssem extends UISlotAssem implements InterfaceC633960Otm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public User LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public ViewModelProvider.Factory LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GhostMusicAssem.class, "ghostMusicTabViewModel", "getGhostMusicTabViewModel()Lcom/ss/android/ugc/aweme/music/ghost/GhostMusicTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = 8;
    }

    public GhostMusicAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GhostMusicTabViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1165), AFwS240S0000000_9.get$arr$(486), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    }

    private Function0 lp() {
        return new AObjectS384S0100000_9(this, 19);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.ee5;
    }

    @Override // X.InterfaceC633960Otm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final OriginMusicArg kp() {
        return (OriginMusicArg) this.LLJJIII.getValue();
    }

    private final void tp() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("red_dot", this.LLJJIJIIJIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_entrance");
        C20684815ws.LJIILLIIL("ghost_music_tab_show", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC633960Otm
    public void LLLZ() {
        String secUid;
        User user = this.LLJJIJI;
        if (user == null || !C632050Oqh.LJIIIZ(user)) {
            return;
        }
        this.LLJJIJIL++;
        User user2 = this.LLJJIJI;
        String secUid2 = user2 != null ? user2.getSecUid() : null;
        int i = this.LLJJIJIL;
        String str = "";
        if (secUid2 == null) {
            secUid2 = "";
        }
        Keva kevaLIZIZ = C632070Oqj.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_ghost_entrance_show_times");
        sbLIZ.append(secUid2);
        kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
        tp();
        User user3 = this.LLJJIJI;
        if (user3 != null && (secUid = user3.getSecUid()) != null) {
            str = secUid;
        }
        if (!C632070Oqj.LIZIZ) {
            Keva kevaLIZIZ2 = C632070Oqj.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_ghost_entrance_cold_start_show_times");
            sbLIZ2.append(str);
            kevaLIZIZ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), C632070Oqj.LIZJ(str) + 1);
            C632070Oqj.LIZIZ = true;
        }
        User user4 = this.LLJJIJI;
        if (C632070Oqj.LIZJ(user4 != null ? user4.getSecUid() : null) >= ((ArtistCertiflowConfig) C632060Oqi.LIZIZ.getValue()).ghostEntranceShowTimes) {
            GhostMusicTabViewModel ghostMusicTabViewModelIp = ip();
            C0OEC c0oec = C0OEC.FREQUENCY_CONTROL;
            ghostMusicTabViewModelIp.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(ghostMusicTabViewModelIp), null, null, new C0OEA(ghostMusicTabViewModelIp, c0oec, null), 3);
        }
    }

    public final GhostMusicTabViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (GhostMusicTabViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC633960Otm
    public void u0() {
        User user = this.LLJJIJI;
        if (user == null || !C632050Oqh.LJIIIZ(user)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("red_dot", this.LLJJIJIIJIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("show_times", String.valueOf(this.LLJJIJIL));
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_entrance");
        C20684815ws.LJIILLIIL("ghost_music_tab_click", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        ViewModelProvider.Factory factory = this.LLJJJ;
        if (factory == null) {
            synchronized (this) {
                factory = this.LLJJJ;
                if (factory == null) {
                    C127G c127g = new C127G(new Object[]{GhostMusicTabViewModel.class, lp()}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g;
                    return c127g;
                }
            }
        }
        return factory;
    }

    public final void mp() {
        Context contextN3;
        MusicTabInfo musicTabInfo;
        Context context = getContext();
        if (context == null || (contextN3 = C786410Ut5.N3(context)) == null) {
            return;
        }
        User user = this.LLJJIJI;
        MusicTabClaimInfo musicTabClaimInfo = (user == null || (musicTabInfo = user.getMusicTabInfo()) == null) ? null : musicTabInfo.musicTabClaimInfo;
        SmartRouter.buildRoute(contextN3, new C0XI4(C632410OrH.LIZ(EnumC632420OrI.GHOST_ENTRANCE, ClaimStatus.Companion.of(musicTabClaimInfo != null ? Integer.valueOf(musicTabClaimInfo.status) : null))).LJFF()).open();
    }

    public final void yp() {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131826691);
            c1397580mTM.LIZIZ(Html.fromHtml(context.getResources().getString(2131826690)));
            C985403tE.LIZ(c1397580mTM, new AwS588S0100000_9(this, 290));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0ODd] */
    public static GhostMusicTabViewModel op(GhostMusicAssem ghostMusicAssem) {
        return new GhostMusicTabViewModel(new InterfaceC736910SvR<InterfaceC615760ODe>() { // from class: X.0ODd
            public final C615740ODc LL = new InterfaceC615760ODe() { // from class: X.0ODc
                @Override // X.InterfaceC615760ODe
                public final InterfaceC346201Wa k0(int i) {
                    return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615720ODa(i)), "/tiktok/user/ghost_music_tab/set/v1/", null);
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        });
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        User user;
        super.onViewCreated(view);
        OriginMusicArg originMusicArgKp = kp();
        if (originMusicArgKp != null) {
            user = originMusicArgKp.getUser();
        } else {
            user = null;
        }
        this.LLJJIJI = user;
        IProfileAssemService profileAssemService = C2277881EDy.LIZIZ.getProfileAssemService();
        if (profileAssemService != null) {
            profileAssemService.selectSubscribeProfileInfoServiceUserUpdateEvent(this, new AwS375S0200000_9(this, view, 64));
        }
    }

    public final void sp(boolean z) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (this.LLJJIJIIJIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("red_dot", str);
        if (z) {
            str2 = "show_case";
        } else {
            str2 = "not_interested";
        }
        c2344009Gk.LJIIIIZZ("name", str2);
        c2344009Gk.LJIIIIZZ("show_times", String.valueOf(this.LLJJIJIL));
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_entrance");
        C20684815ws.LJIILLIIL("ghost_button_click", c2344009Gk.LIZ);
    }

    public final void up(boolean z) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (this.LLJJIJIIJIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("red_dot", str);
        if (z) {
            str2 = "cancel";
        } else {
            str2 = "not_interested";
        }
        c2344009Gk.LJIIIIZZ("name", str2);
        c2344009Gk.LJIIIIZZ("show_times", String.valueOf(this.LLJJIJIL));
        c2344009Gk.LJIIIIZZ("tab_name", "ghost_entrance");
        C20684815ws.LJIILLIIL("ghost_toast_click", c2344009Gk.LIZ);
    }

    public final void zp(View view) {
        String secUid;
        User user = this.LLJJIJI;
        if (user != null && C632050Oqh.LJIIIZ(user)) {
            C631230OpN.LIZJ(view);
            View viewFindViewById = view.findViewById(R.id.rik);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AbS691S0100000_9(this, 23, 42), viewFindViewById);
            }
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.p4j);
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                C786410Ut5.I7(new AbS691S0100000_9(this, 24, 42), c197039127h);
            }
            User user2 = this.LLJJIJI;
            String secUid2 = null;
            if (user2 != null) {
                secUid2 = user2.getSecUid();
            }
            this.LLJJIJIIJIL = C632070Oqj.LJ(secUid2);
            User user3 = this.LLJJIJI;
            if (user3 == null || (secUid = user3.getSecUid()) == null) {
                secUid = "";
            }
            Keva kevaLIZIZ = C632070Oqj.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_ghost_entrance_show_times");
            sbLIZ.append(secUid);
            this.LLJJIJIL = kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            return;
        }
        C631230OpN.LIZ(view);
    }
}
