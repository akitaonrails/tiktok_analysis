package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShinyCardProgressResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("shiny_cards")
        public List<ShinyCardStatus> shinyCards = new ArrayList();
    }
}
