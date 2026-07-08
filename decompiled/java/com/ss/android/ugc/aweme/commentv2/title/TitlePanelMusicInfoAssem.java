package com.ss.android.ugc.aweme.commentv2.title;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C13LE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.musicinfo.MusicInfoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TitlePanelMusicInfoAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public View LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelMusicInfoAssem.class, "musicInfoViewModel", "getMusicInfoViewModel()Lcom/ss/android/ugc/aweme/commentv2/commentlist/powercell/musicinfo/MusicInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3r;
    }

    public final CommentContextSource hp() {
        return (CommentContextSource) this.LLJJIJIL.getValue();
    }

    public TitlePanelMusicInfoAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicInfoViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 94);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(25);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((AbstractC738140SxQ) this, 95), aFwS243S0000000_11, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJI = assemVMLazy;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 93));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelMusicInfoAssem.onViewCreated(android.view.View):void");
    }
}
