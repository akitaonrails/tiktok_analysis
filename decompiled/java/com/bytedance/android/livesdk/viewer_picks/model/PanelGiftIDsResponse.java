package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PanelGiftIDsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gift_ids")
        public List<Long> giftIds = new ArrayList();

        @C09CT("top_gift_ids")
        public List<Long> topGiftIds = new ArrayList();
    }
}
