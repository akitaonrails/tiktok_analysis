package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.C019F;
import X.C01GW;
import X.C0O6M;
import X.C0O6P;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PlaylistCollectionList extends BaseFavoriteListAssem<C0O6M, C0O6P, Integer> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistCollectionList.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/favorites/business/playlist/PlaylistCollectionVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlaylistCollectionList() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistCollectionVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 372), AFwS264S0000000_24.get$arr$(112), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 371));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 370));
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String Go() {
        return (String) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String Ho() {
        return (String) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem
    public final AssemListViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Oo().LJIILJJIL(PlaylistCollectionCell.class);
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0qsS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O6M) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 28), 6);
    }
}
