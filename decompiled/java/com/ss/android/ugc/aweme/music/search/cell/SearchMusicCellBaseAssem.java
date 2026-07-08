package com.ss.android.ugc.aweme.music.search.cell;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C632090Oql;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C725080ScM;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS154S0100000_19;
import Y.AObjectS71S0000000_19;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SearchMusicCellBaseAssem extends ReusedUISlotAssem<SearchMusicCellBaseAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public C127G LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMusicCellBaseAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchMusicCellBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1619), null, AFwS257S0000000_19.get$arr$(232));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS71S0000000_19(this, 10)}, defaultViewModelProviderFactory);
                    this.LLJL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 192);
        if (C724240Sb0.LIZ(this) != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && c19egLIZ.isFinishing()) {
                return;
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null && c19egLIZ2.isDestroyed()) {
                return;
            }
            C725080ScM.LIZ().execute(new ARunnableS110S0100000_10(awS554S0100000_10, 35));
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 119), getContentView());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
