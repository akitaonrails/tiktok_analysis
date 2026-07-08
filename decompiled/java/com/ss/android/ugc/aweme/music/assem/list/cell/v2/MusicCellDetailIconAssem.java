package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C09R3;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C632780Ors;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import Y.AObjectS71S0000000_19;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MusicCellDetailIconAssem extends DefaultDetailIconAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellDetailIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicCellDetailIconAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicCellDetailIconAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1617), null, AFwS257S0000000_19.get$arr$(230));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1618), null, AFwS257S0000000_19.get$arr$(231));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS71S0000000_19(this, 12), OriginMusicListViewModel.class, new AObjectS71S0000000_19(this, 11)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ot7);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_lines_horizontal_decrease_alt;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
            C632780Ors.LIZ(tuxIconView, 10, 10, 10, 10);
            C786410Ut5.a9(tuxIconView, new ACListenerS154S0100000_19(this, 118));
        }
    }
}
