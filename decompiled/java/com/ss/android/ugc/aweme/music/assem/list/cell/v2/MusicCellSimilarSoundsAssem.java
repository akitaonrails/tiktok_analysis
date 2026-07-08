package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C632090Oql;
import X.C632780Ors;
import X.C723580SZw;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellSimilarSoundsAssem extends DefaultSimilarSoundsAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellSimilarSoundsAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicCellSimilarSoundsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1130), null, AFwS240S0000000_9.get$arr$(465));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 43)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultSimilarSoundsAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        C786410Ut5.I7(new AbS691S0100000_9(this, 17, 42), LJJIJL());
        C632780Ors.LIZ(LJJIJL(), 0, 0, 0, 8);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C632090Oql c632090Oql) {
        C632090Oql c632090Oql2 = c632090Oql;
        super.op(c632090Oql2);
        if (c632090Oql2.getMusicItemModel().similarMusicSize > 0) {
            C2211631BhB.LJ(LJJIJL(), new AwS375S0200000_9(c632090Oql2, this, 160));
        }
    }
}
