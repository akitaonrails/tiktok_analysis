package com.ss.android.ugc.aweme.services;

import X.C1206450hV5;
import X.C20684815ws;
import X.C2344009Gk;
import X.C735370Ssx;
import X.InterfaceC1259580ism;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes19.dex */
public final class FavoritesMobUtilsServiceImpl implements InterfaceC1259580ism {
    public static final int $stable = 0;

    @Override // X.InterfaceC1259580ism
    public boolean isDataSetChangedOnStart() {
        return C1206450hV5.LIZIZ;
    }

    @Override // X.InterfaceC1259580ism
    public void onVideoItemActionShow(Aweme aweme) {
        String strLIZJ = C1206450hV5.LIZJ(1);
        C2344009Gk c2344009GkLIZIZ = C1206450hV5.LIZIZ("video", "collection_video");
        c2344009GkLIZIZ.LJIIIIZZ("enter_method", C1206450hV5.LIZJ);
        c2344009GkLIZIZ.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        c2344009GkLIZIZ.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
        c2344009GkLIZIZ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        C20684815ws.LJIILLIIL(strLIZJ, c2344009GkLIZIZ.LIZ);
    }

    @Override // X.InterfaceC1259580ism
    public void setDataSetChangedOnStart(boolean z) {
        C1206450hV5.LIZIZ = z;
    }
}
