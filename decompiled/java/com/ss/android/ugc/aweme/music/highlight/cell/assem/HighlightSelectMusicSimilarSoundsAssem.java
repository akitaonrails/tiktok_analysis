package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C019F;
import X.C01GW;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C452501pT;
import X.C632090Oql;
import X.C632780Ors;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectMusicSimilarSoundsAssem extends DefaultSimilarSoundsAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1177));
    public final AssemVMLazy LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightSelectMusicSimilarSoundsAssem.class, "highlightSelectViewModel", "getHighlightSelectViewModel()Lcom/ss/android/ugc/aweme/music/highlight/HighlightSelectListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightSelectMusicSimilarSoundsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightSelectListViewModel.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1176), AFwS240S0000000_9.get$arr$(496), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{HighlightSelectListViewModel.class, new AObjectS62S0000000_9(this, 13)}, defaultViewModelProviderFactory);
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
        C786410Ut5.I7(new AbS691S0100000_9(this, 27, 42), LJJIJL());
        C632780Ors.LIZ(LJJIJL(), 0, 0, 0, 8);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        C632090Oql c632090Oql2 = c632090Oql;
        super.op(c632090Oql2);
        if (c632090Oql2.getMusicItemModel().similarMusicSize > 0) {
            C2211631BhB.LJ(LJJIJL(), new AwS375S0200000_9(c632090Oql2, this, 121));
        }
    }
}
