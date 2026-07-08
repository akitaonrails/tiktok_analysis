package com.ss.android.ugc.aweme.music.highlight.cell.assem;

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
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AObjectS62S0000000_9;
import Y.ARunnableS109S0100000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectMusicBaseAssem extends ReusedUISlotAssem<HighlightSelectMusicBaseAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C127G LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightSelectMusicBaseAssem.class, "highlightSelectViewModel", "getHighlightSelectViewModel()Lcom/ss/android/ugc/aweme/music/highlight/HighlightSelectListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightSelectMusicBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightSelectListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1174), AFwS240S0000000_9.get$arr$(494), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg6;
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
                    C127G c127g2 = new C127G(new Object[]{HighlightSelectListViewModel.class, new AObjectS62S0000000_9(this, 11)}, defaultViewModelProviderFactory);
                    this.LLJL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1173);
        if (C724240Sb0.LIZ(this) != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && c19egLIZ.isFinishing()) {
                return;
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null && c19egLIZ2.isDestroyed()) {
                return;
            }
            C725080ScM.LIZ().execute(new ARunnableS109S0100000_9(awS553S0100000_9, 102));
            C786410Ut5.I7(new AbS691S0100000_9(this, 25, 42), getContentView());
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
