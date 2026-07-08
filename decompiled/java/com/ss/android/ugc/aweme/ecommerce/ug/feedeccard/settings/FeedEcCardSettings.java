package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.settings;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedEcCardSettings {
    public static final FeedEcLynxCardConfigModel LIZ = new FeedEcLynxCardConfigModel(new ArrayList());

    public static final class FeedEcLynxCardConfigModel {

        @C09CT("card_type")
        public List<Integer> cardTypeList;

        public FeedEcLynxCardConfigModel() {
            this(new ArrayList());
        }

        public FeedEcLynxCardConfigModel(List<Integer> list) {
            this.cardTypeList = list;
        }
    }
}
