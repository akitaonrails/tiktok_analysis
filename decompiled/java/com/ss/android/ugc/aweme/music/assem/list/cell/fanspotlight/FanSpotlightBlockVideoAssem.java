package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C019F;
import X.C050S;
import X.C0P4F;
import X.C127G;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1559260qg8;
import X.C1620160sGM;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C430210Gtv;
import X.C438710HIf;
import X.C723580SZw;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightBlockVideoAssem extends ReusedUISlotAssem<FanSpotlightBlockVideoAssem> implements InterfaceC712990Rxx<C050S> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;
    public SmartImageView LLJLIL;
    public C430210Gtv LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FanSpotlightBlockVideoAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FanSpotlightBlockVideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1101), AFwS240S0000000_9.get$arr$(443), null, true);
        this.LLJL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg5;
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
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 18)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (SmartImageView) getContentView().findViewById(R.id.bm3);
        this.LLJLILLLLZIIL = (C430210Gtv) getContentView().findViewById(R.id.bbz);
        SmartImageView smartImageView = this.LLJLIL;
        if (smartImageView == null) {
            smartImageView = null;
        }
        C786410Ut5.I7(new AbS691S0100000_9(this, 12, 42), smartImageView);
        C2211631BhB.LJ(view, new AwS588S0100000_9(this, 266));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C050S c050s) {
        UrlModel avatarMedium;
        UrlModel cover;
        C050S c050s2 = c050s;
        C430210Gtv c430210Gtv = null;
        if (c050s2.LLILLJJLI) {
            SmartImageView smartImageView = this.LLJLIL;
            if (smartImageView == null) {
                smartImageView = null;
            }
            smartImageView.setOnLongClickListener(new C0P4F(this, c050s2, 1));
        } else {
            SmartImageView smartImageView2 = this.LLJLIL;
            if (smartImageView2 == null) {
                smartImageView2 = null;
            }
            smartImageView2.setOnLongClickListener(null);
        }
        SmartImageView smartImageView3 = this.LLJLIL;
        if (smartImageView3 == null) {
            smartImageView3 = null;
        }
        if (!C1620160sGM.LIZLLL(smartImageView3, c050s2.LL.getVideo(), "FanSpotlightVideos", false, false, 248)) {
            Video video = c050s2.LL.getVideo();
            if (video != null) {
                cover = video.getCover();
            } else {
                cover = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            SmartImageView smartImageView4 = this.LLJLIL;
            if (smartImageView4 == null) {
                smartImageView4 = null;
            }
            c1331670kl3LJIIIIZZ.LJJ(smartImageView4);
            c1331670kl3LJIIIIZZ.LIZLLL = true;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        User author = c050s2.LL.getAuthor();
        if (author != null) {
            avatarMedium = author.getAvatarMedium();
        } else {
            avatarMedium = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium));
        C430210Gtv c430210Gtv2 = this.LLJLILLLLZIIL;
        if (c430210Gtv2 != null) {
            c430210Gtv = c430210Gtv2;
        }
        c1331670kl3LJIIIIZZ2.LJJ(c430210Gtv);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C050S c050s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C050S c050s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
