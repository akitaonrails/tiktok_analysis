package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftHintResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("hints")
        public List<GiftHintInfo> hints;
    }
}
