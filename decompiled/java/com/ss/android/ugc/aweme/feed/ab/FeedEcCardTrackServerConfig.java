package com.ss.android.ugc.aweme.feed.ab;

import X.C01GW;
import X.C09CT;
import X.C0RRZ;
import X.C452501pT;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedEcCardTrackServerConfig {
    public static final TrackModel LIZ = new TrackModel(Boolean.FALSE, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0RRZ());

    public static final class TrackModel {

        @C09CT("card_type_list")
        public final Map<String, String> cardTypeList;

        @C09CT("enable")
        public final Boolean enable;

        public TrackModel() {
            this(Boolean.FALSE, null);
        }

        public TrackModel(Boolean bool, Map<String, String> map) {
            this.enable = bool;
            this.cardTypeList = map;
        }
    }
}
