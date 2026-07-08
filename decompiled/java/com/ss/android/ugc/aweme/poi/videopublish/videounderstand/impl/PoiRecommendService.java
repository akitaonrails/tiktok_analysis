package com.ss.android.ugc.aweme.poi.videopublish.videounderstand.impl;

import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C1173090gdH;
import X.C1173100gdI;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C289320BVq;
import X.C452501pT;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS6S2110000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendService implements IPoiRecommendService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(567));
    public String LIZIZ;
    public PoiVideoUnderstandResponse LIZJ;
    public String LIZLLL;

    @Override // com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService
    public final Pair<String, PoiVideoUnderstandResponse> LIZ() {
        PoiVideoUnderstandResponse poiVideoUnderstandResponse = this.LIZJ;
        return new Pair<>(this.LIZIZ, (poiVideoUnderstandResponse == null || !poiVideoUnderstandResponse.isSuccess()) ? null : this.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService
    public final Pair<String, PoiVideoUnderstandResponse> LIZIZ(String str) {
        if (!Intrinsics.LJFF(this.LIZLLL, str)) {
            return new Pair<>(null, null);
        }
        return LIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService
    public final void requestVideoUnderstand(String str, Long l, String str2, String str3) {
        boolean z;
        if (!C289320BVq.LIZ()) {
            return;
        }
        C1173100gdI c1173100gdI = C1173100gdI.LIZ;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        c1173100gdI.getClass();
        if (C289320BVq.LIZ()) {
            c1173100gdI.LIZJ("frame_callback", new AwS6S2110000_18(str2, l, z, str3, 0));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestVideoUnderstand zipUri:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            return;
        }
        this.LIZIZ = str;
        this.LIZLLL = str2;
        this.LIZJ = null;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C1173090gdH(str2, str3, this, c054gLIZ, str, null), 3);
    }
}
