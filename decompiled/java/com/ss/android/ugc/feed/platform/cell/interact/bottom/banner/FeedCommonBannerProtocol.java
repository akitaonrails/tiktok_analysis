package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.C06KX;
import X.C0SGE;
import X.C0SH0;
import X.C0SH2;
import X.C718260SFk;
import X.C718310SFp;
import X.C718360SFu;
import X.InterfaceC707420Roy;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedCommonBannerProtocol implements C06KX {
    public final C718360SFu LL;
    public final C0SGE LLILLJJLI;
    public final C718310SFp LLILLL;
    public final C718260SFk LLILZ;

    public abstract String LIZJ();

    public void LJII(VideoItemParams videoItemParams) {
    }

    public BannerCommonStruct LJIIIIZZ(BannerCommonStruct bannerCommonStruct) {
        return bannerCommonStruct;
    }

    public FeedCommonBannerProtocol() {
        C718360SFu c718360SFu = new C718360SFu();
        this.LL = c718360SFu;
        this.LLILLJJLI = new C0SGE(c718360SFu);
        this.LLILLL = new C718310SFp();
        this.LLILZ = new C718260SFk(c718360SFu);
    }

    public C0SH0 LJ() {
        return this.LLILLL;
    }

    public InterfaceC707420Roy LJFF() {
        return this.LLILZ;
    }

    public C0SH2 LJI() {
        return this.LLILLJJLI;
    }
}
