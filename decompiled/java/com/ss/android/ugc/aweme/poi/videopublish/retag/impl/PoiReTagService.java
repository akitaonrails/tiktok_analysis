package com.ss.android.ugc.aweme.poi.videopublish.retag.impl;

import X.C01GW;
import X.C1201100hMS;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.retag.api.IPoiReTagService;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReTagService implements IPoiReTagService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(566));

    @Override // com.ss.android.ugc.aweme.poi.videopublish.retag.api.IPoiReTagService
    public final Object LIZ(String str, PoiReTagInfo poiReTagInfo, InterfaceC1364105Vn<? super PoiSearchApi.PoiReTagResponse> interfaceC1364105Vn) {
        return ((C1201100hMS) this.LIZ.getValue()).LL.LLJLILLLLZIIL(str, poiReTagInfo, interfaceC1364105Vn);
    }
}
