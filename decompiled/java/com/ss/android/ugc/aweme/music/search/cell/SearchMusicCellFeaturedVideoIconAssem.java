package com.ss.android.ugc.aweme.music.search.cell;

import X.C019F;
import X.C09R3;
import X.C0HHT;
import X.C127G;
import X.C1389890mGx;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C631370Opb;
import X.C632090Oql;
import X.C632210Oqx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
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
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellFeaturedVideosIconViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class SearchMusicCellFeaturedVideoIconAssem extends DefaultFeaturedVideoIconAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMusicCellFeaturedVideoIconAssem.class, "featuredVideosIconViewModel", "getFeaturedVideosIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/v2/MusicCellFeaturedVideosIconViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchMusicCellFeaturedVideoIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchMusicCellFeaturedVideoIconAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicCellFeaturedVideosIconViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 787), null, AFwS264S0000000_24.get$arr$(231));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 788), null, AFwS279S0000000_33.get$arr$(205));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS80S0000000_33(this, 10)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
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
            C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 61));
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS167S0100000_33(this, 62));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(this, LLJLLIL[0]), new C2217381BqS() { // from class: X.1AAC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556780qc8) obj).LL;
            }
        }, null, new AwS647S0100000_33(this, 25), 6);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem
    /* JADX INFO: renamed from: op */
    public final void up(C632090Oql c632090Oql) {
        super.up(c632090Oql);
        ((MusicCellFeaturedVideosIconViewModel) this.LLJLIL.getValue(this, LLJLLIL[0])).LL = c632090Oql.getMusicModel().getMusicId();
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
            MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) this.LLJLILLLLZIIL.getValue(this, LLJLLIL[1]);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            musicPlayViewModel.xQ2((C632090Oql) obj, C631370Opb.LIZIZ(this), true, null);
            return;
        }
        Object value = this.LLJLILLLLZIIL.getValue(this, LLJLLIL[1]);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        MusicModel musicModel = ((C632090Oql) obj2).getMusicModel();
        value.getClass();
        MusicPlayViewModel.wQ2(musicModel);
    }
}
