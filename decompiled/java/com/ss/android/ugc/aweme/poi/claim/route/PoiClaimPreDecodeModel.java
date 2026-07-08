package com.ss.android.ugc.aweme.poi.claim.route;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PoiClaimPreDecodeModel {

    @C09CT("pre_decode_enable")
    public final boolean enable;

    @C09CT("pre_decode_list")
    public final List<String> preDecodeList;

    public PoiClaimPreDecodeModel() {
        this(false, null);
    }

    public PoiClaimPreDecodeModel(boolean z, List<String> list) {
        this.enable = z;
        this.preDecodeList = list;
    }
}
