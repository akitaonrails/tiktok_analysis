package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftFavouriteSaveResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("favourite_gift_ids")
        public List<Long> favouriteGiftIds = new ArrayList();

        @C09CT("success")
        public boolean success;
    }
}
