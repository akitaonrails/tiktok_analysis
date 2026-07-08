package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C019F;
import X.C09R3;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightEllipsisAssem extends ReusedUIContentAssem<FanSpotlightEllipsisAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJJJJ = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public C127G LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FanSpotlightEllipsisAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FanSpotlightEllipsisAssem.class, "musicPlayViewModel", "getMusicPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FanSpotlightEllipsisAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1102), AFwS240S0000000_9.get$arr$(444), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1103), AFwS240S0000000_9.get$arr$(445), null, true);
    }

    public final OriginMusicListViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 19), MusicPlayViewModel.class, new AObjectS62S0000000_9(this, 20)}, defaultViewModelProviderFactory);
                    this.LLJJL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS691S0100000_9(this, 13, 42), view);
    }
}
