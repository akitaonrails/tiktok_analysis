package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftFavouriteUpdateResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gifts")
        public List<Gift> gifts = new ArrayList();
    }
}
