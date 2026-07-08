package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class StaticGiftListResponse {

    @C09CT("gifts")
    public List<Gift> gifts = new ArrayList();

    @C09CT("metadata")
    public Metadata metadata;

    public static final class Metadata {

        @C09CT("hash")
        public String hash = "";

        @C09CT("num_gifts")
        public long numGifts;

        @C09CT("timestamp")
        public long timestamp;
    }
}
