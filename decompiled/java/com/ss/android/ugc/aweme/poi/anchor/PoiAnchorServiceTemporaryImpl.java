package com.ss.android.ugc.aweme.poi.anchor;

import X.C0C64;
import X.C1185700gxc;
import X.C1188440h22;
import X.C1188460h24;
import X.C1367960lha;
import X.C280200AyY;
import X.C735500StA;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorServiceTemporaryImpl implements IPoiAnchorServiceTemporary {
    @Override // com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "poi_meta_anchor_exp", false, false);
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary
    public final boolean LIZJ() {
        return C280200AyY.LIZ() && C1185700gxc.LIZ > 0 && !C1185700gxc.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary
    public final Map LIZLLL(Aweme aweme) {
        C1367960lha.LIZ.getClass();
        return C1367960lha.LIZ().LJIILJJIL(aweme, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary
    public final C735500StA LIZ(Aweme aweme, String str) {
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, str, null);
        if (c1188440h22LJ != null) {
            return new C735500StA(c1188440h22LJ.getPoiId(), c1188440h22LJ.getPoiName(), c1188440h22LJ.getCollectInfo());
        }
        return null;
    }
}
