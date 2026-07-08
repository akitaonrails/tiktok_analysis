package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C631230OpN;
import X.C632090Oql;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AObjectS62S0000000_9;
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
public final class HighlightSelectMusicSelectIconAssem extends ReusedUISlotAssem<HighlightSelectMusicSelectIconAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public C1841350y17 LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightSelectMusicSelectIconAssem.class, "highlightSelectViewModel", "getHighlightSelectViewModel()Lcom/ss/android/ugc/aweme/music/highlight/HighlightSelectListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightSelectMusicSelectIconAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightSelectListViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1175), AFwS240S0000000_9.get$arr$(495), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg7;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
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
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{HighlightSelectListViewModel.class, new AObjectS62S0000000_9(this, 12)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.spe);
        if (c1841350y17 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 26, 42), c1841350y17);
        } else {
            c1841350y17 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = c1841350y17;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        C632090Oql c632090Oql2 = c632090Oql;
        boolean zIsSimilarMusic = c632090Oql2.getMusicItemModel().isSimilarMusic();
        boolean zIsSelected = c632090Oql2.getMusicItemModel().isSelected();
        if (zIsSimilarMusic) {
            C631230OpN.LIZ(getContentView());
            return;
        }
        C631230OpN.LIZJ(getContentView());
        C1841350y17 c1841350y17 = this.LLJJLIIIJLLLLLLLZ;
        if (c1841350y17 == null) {
            return;
        }
        c1841350y17.setChecked(zIsSelected);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
