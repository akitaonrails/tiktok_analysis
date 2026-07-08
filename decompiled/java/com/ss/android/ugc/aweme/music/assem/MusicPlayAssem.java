package com.ss.android.ugc.aweme.music.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPlayAssem extends MusicPlayAssemBase {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicPlayAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicPlayAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 489), AFwS240S0000000_9.get$arr$(417), null, true);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.MusicPlayAssemBase
    public final ArtistHonorLabel bo() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return ((OriginMusicListViewModel) assemVMLazy.getValue()).LLJJIJIL;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        mo272do().yQ2(false);
        MusicPlayViewModel musicPlayViewModelMo272do = mo272do();
        musicPlayViewModelMo272do.LLILZ = null;
        musicPlayViewModelMo272do.LLILLJJLI = null;
        musicPlayViewModelMo272do.LLILLL = null;
    }
}
