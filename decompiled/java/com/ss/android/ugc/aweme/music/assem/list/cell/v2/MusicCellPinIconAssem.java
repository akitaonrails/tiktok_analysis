package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellPinIconAssem extends DefaultPinIconAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellPinIconAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicCellPinIconAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1126), null, AFwS240S0000000_9.get$arr$(462));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 40)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultPinIconAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 69));
        }
    }
}
