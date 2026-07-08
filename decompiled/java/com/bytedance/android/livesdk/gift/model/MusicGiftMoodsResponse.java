package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftMoodsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("moods")
        public List<MusicGiftMood> moods = new ArrayList();
    }
}
