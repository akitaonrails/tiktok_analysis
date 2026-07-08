package com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public C1749280vcc LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinShareMusicStatusAssem.class, "bulletinShareMusicListVM", "getBulletinShareMusicListVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/sharemusic/BulletinShareMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinShareMusicStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinShareMusicListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 496), AFwS240S0000000_9.get$arr$(281), null, true);
    }

    public final BulletinShareMusicListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (BulletinShareMusicListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = (C1749280vcc) view.findViewById(R.id.d57);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0OUx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C618880OPe c618880OPe = (C618880OPe) obj;
                c618880OPe.getClass();
                return C627260Oiy.LIZLLL(c618880OPe);
            }
        }, this, null, new AwS588S0100000_9(this, 161), new AwS553S0100000_9(this, 495), new AwS588S0100000_9(this, 162), 4, null);
    }
}
