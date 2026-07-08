package com.ss.android.ugc.aweme.ecommercelive.audience.us.business.billboard.feed;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class OecLivePreviewRoomData implements Serializable {

    @C09CT("billboards")
    public final List<ECBillboard> billboard;

    public OecLivePreviewRoomData() {
        this(null);
    }

    public OecLivePreviewRoomData(List<ECBillboard> list) {
        this.billboard = list;
    }
}
