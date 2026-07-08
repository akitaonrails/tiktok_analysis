package com.ss.android.ugc.aweme.feed.ab;

import X.C01GW;
import X.C09CT;
import X.C20321514fN;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedLynxCardFallbackExperiment {
    public static final FeedLynxCardFallbackExperiment LIZ = new FeedLynxCardFallbackExperiment();
    public static final FallbackModel LIZIZ = new FallbackModel(Boolean.FALSE, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C20321514fN());

    public static final class FallbackListItem {

        @C09CT("card_type")
        public final Integer cardType;

        public FallbackListItem() {
            this(null);
        }

        public FallbackListItem(Integer num) {
            this.cardType = num;
        }
    }

    public static boolean LIZ(Integer num) {
        FallbackModel fallbackModel;
        List<FallbackListItem> list;
        if (num == null) {
            return false;
        }
        num.intValue();
        C01GW c01gw = LIZJ;
        FallbackModel fallbackModel2 = (FallbackModel) c01gw.getValue();
        if (fallbackModel2 == null || !Intrinsics.LJFF(fallbackModel2.enable, Boolean.TRUE) || (fallbackModel = (FallbackModel) c01gw.getValue()) == null || (list = fallbackModel.whiteList) == null) {
            return false;
        }
        for (FallbackListItem fallbackListItem : list) {
            if (Intrinsics.LJFF(fallbackListItem.cardType, num)) {
                if (fallbackListItem == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final class FallbackModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("card_type_list")
        public final List<FallbackListItem> whiteList;

        public FallbackModel() {
            this(Boolean.FALSE, null);
        }

        public FallbackModel(Boolean bool, List<FallbackListItem> list) {
            this.enable = bool;
            this.whiteList = list;
        }
    }
}
