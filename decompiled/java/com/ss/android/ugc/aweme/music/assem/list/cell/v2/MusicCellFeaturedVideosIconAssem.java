package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C09R3;
import X.C0HHT;
import X.C127G;
import X.C1389890mGx;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C631370Opb;
import X.C632090Oql;
import X.C632210Oqx;
import X.C723580SZw;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS167S0100000_33;
import Y.AObjectS80S0000000_33;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class MusicCellFeaturedVideosIconAssem extends DefaultFeaturedVideoIconAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public C127G LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellFeaturedVideosIconAssem.class, "featuredVideosIconViewModel", "getFeaturedVideosIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/v2/MusicCellFeaturedVideosIconViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicCellFeaturedVideosIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicCellFeaturedVideosIconAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicCellFeaturedVideosIconViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 785), null, AFwS264S0000000_24.get$arr$(230));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 786), null, AFwS279S0000000_33.get$arr$(204));
    }

    public final void up() {
        String userId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("button_name", "plus");
        OriginMusicArg originMusicArg = (OriginMusicArg) this.LLJLIL.getValue();
        if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
            userId = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", userId);
        C724270Sb3 c724270Sb3 = this.LLJI;
        c2344009Gk.LIZJ(((C632090Oql) (c724270Sb3 != null ? c724270Sb3.LL : null)).getMusicItemModel().isHighlighted() ? 1 : 0, "highlight");
        C20684815ws.LJIILLIIL("new_song_click", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS80S0000000_33(this, 13)}, defaultViewModelProviderFactory);
                    this.LLJLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 59));
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS167S0100000_33(this, 60));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(this, LLJLLL[0]), new C2217381BqS() { // from class: X.1AAB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556780qc8) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 24), 4);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem
    /* JADX INFO: renamed from: op */
    public final void up(C632090Oql c632090Oql) {
        super.up(c632090Oql);
        ((MusicCellFeaturedVideosIconViewModel) this.LLJLILLLLZIIL.getValue(this, LLJLLL[0])).LL = c632090Oql.getMusicModel().getMusicId();
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C632090Oql c632090Oql) {
        up(c632090Oql);
    }

    public final void tp(boolean z) {
        Object obj;
        C632210Oqx.LIZ.getClass();
        User userLIZJ = C632210Oqx.LIZJ();
        if (userLIZJ != null && userLIZJ.isAccuratePrivateAccount()) {
            C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
            c1389890mGx.LJIIIZ(2131834511);
            c1389890mGx.LJIIJJI();
            return;
        }
        Object obj2 = null;
        if (z) {
            MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) this.LLJLL.getValue(this, LLJLLL[1]);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            musicPlayViewModel.xQ2((C632090Oql) obj, C631370Opb.LIZIZ(this), true, null);
            return;
        }
        Object value = this.LLJLL.getValue(this, LLJLLL[1]);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        MusicModel musicModel = ((C632090Oql) obj2).getMusicModel();
        value.getClass();
        MusicPlayViewModel.wQ2(musicModel);
    }
}
