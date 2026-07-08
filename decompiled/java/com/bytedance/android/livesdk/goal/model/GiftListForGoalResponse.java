package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftListForGoalResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("pages")
        public List<GiftPage> pages = new ArrayList();
    }
}
