package com.ss.android.ugc.aweme.featureeffectvideo.powerlist;

import X.C01GW;
import X.C0HZQ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1575060r5c;
import X.C1575070r5d;
import X.C1620160sGM;
import X.C294660Bgm;
import X.C295250Bhj;
import X.C422830Gi1;
import X.C438710HIf;
import X.C452501pT;
import X.C661110PwT;
import X.C786410Ut5;
import X.EnumC714850S2h;
import X.InterfaceC1891350zJl;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeatureVideoItemCell extends PowerCell<C1575060r5c> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 375));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 373));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 374));
    public C1575060r5c LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.c71, false, 4, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Aweme aweme;
        C1575060r5c c1575060r5c = (C1575060r5c) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1575060r5c, this.LLILZ)) {
            this.LLILZ = c1575060r5c;
            if (c1575060r5c != null && (aweme = c1575060r5c.LL) != null) {
                Video video = aweme.getVideo();
                C294660Bgm.LIZ();
                if (!C1620160sGM.LIZIZ((SmartImageView) this.LL.getValue(), video, "FeatureVideoItemCell", true, null, null, true, Bitmap.Config.ARGB_8888, false, false, false, false)) {
                    UrlModel cover = video.getCover();
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                    int[] iArrLIZ = C422830Gi1.LIZ(200);
                    if (iArrLIZ != null) {
                        c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
                    }
                    if (Intrinsics.LJFF("AwemeViewHolder", "FeatureVideoItemCell") && C295250Bhj.LIZ()) {
                        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                        c1331670kl3LJIIIIZZ.LJJJJJ = "profile_post_img";
                    }
                    c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
                    c1331670kl3LJIIIIZZ.LIZLLL("FeatureVideoItemCell");
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    if (aweme.getVideo() != null && !C661110PwT.LIZ()) {
                        aweme.getVideo().setCachedOuterCoverUrl(cover);
                        aweme.getVideo().setCachedOuterCoverSize(iArrLIZ);
                    }
                }
                if (AwemeExtKt.isPublic(aweme)) {
                    C786410Ut5.LJLLLLLL(4, (View) this.LLILLL.getValue());
                    C786410Ut5.LLLLLZ((C0HZQ) this.LLILLJJLI.getValue(), 0);
                    ((C0HZQ) this.LLILLJJLI.getValue()).setChecked(c1575060r5c.LLILLJJLI);
                } else {
                    C786410Ut5.LJLLLLLL(0, (View) this.LLILLL.getValue());
                    C786410Ut5.LLLLLZ((C0HZQ) this.LLILLJJLI.getValue(), 4);
                }
                C786410Ut5.I7(new AkS91S0100000_24(this, 18), this.itemView);
                return;
            }
            return;
        }
        this.LLILZ = c1575060r5c;
        for (Object obj : list) {
            if (obj instanceof C1575070r5d) {
                C1575070r5d c1575070r5d = (C1575070r5d) obj;
                this.LLILZ = C1575060r5c.LIZ(c1575060r5c, c1575070r5d.LIZ);
                C786410Ut5.LLLLLZ((C0HZQ) this.LLILLJJLI.getValue(), 0);
                ((C0HZQ) this.LLILLJJLI.getValue()).setChecked(c1575070r5d.LIZ);
            }
        }
    }
}
