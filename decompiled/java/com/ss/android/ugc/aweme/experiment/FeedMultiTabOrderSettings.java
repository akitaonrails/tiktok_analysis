package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedMultiTabOrderSettings {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIJ(new Pair("homepage_hot", "For You"), new Pair("homepage_following", "Following"), new Pair("homepage_popular", "Popular"), new Pair("homepage_mall", "Shop"), new Pair("homepage_nearby", "Nearby"), new Pair("homepage_friends", "FRIENDS_FEED"), new Pair("homepage_explore", "homepage_explore"), new Pair("homepage_stem", "Stem"), new Pair("homepage_series", "Drama"), new Pair("homepage_live", "Live"), new Pair("homepage_topic0", "Topic0"), new Pair("homepage_topic1", "Topic1"), new Pair("homepage_topic2", "Topic2"), new Pair("homepage_topic3", "Topic3"), new Pair("homepage_personalized0", "Personalized0"), new Pair("homepage_personalized1", "Personalized1"));
    public static final FeedMultiTabOrderModel LIZIZ = new FeedMultiTabOrderModel(C1697810uHb.LJ("homepage_topic0", "homepage_topic1", "homepage_topic2", "homepage_topic3", "homepage_personalized0", "homepage_personalized1", "homepage_music", "homepage_nearby", "homepage_popular", "homepage_friends", "homepage_mall", "homepage_explore", "homepage_following", "homepage_hot", "homepage_live"));

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r3
      0x0015: PHI (r3v2 com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel) = 
      (r3v1 com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel)
      (r3v3 com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel)
     binds: [B:3:0x0010, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> LIZ() {
        /*
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel> r1 = com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.FeedMultiTabOrderModel.class
            com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel r4 = com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.LIZIZ
            java.lang.String r0 = "feed_multi_tab_order"
            java.lang.Object r3 = r2.LJIIIIZZ(r0, r1, r4)
            com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel r3 = (com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.FeedMultiTabOrderModel) r3
            if (r3 != 0) goto L15
            r3 = r4
            if (r4 == 0) goto L44
        L15:
            java.util.List<java.lang.String> r0 = r3.order
            if (r0 == 0) goto L44
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L44
            java.util.List<java.lang.String> r0 = r3.order
            java.lang.String r2 = "homepage_hot"
            int r1 = r0.indexOf(r2)
            java.util.List<java.lang.String> r0 = r3.order
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r1 == r0) goto L41
            boolean r0 = X.C296130Bj9.LIZ()
            if (r0 == 0) goto L44
            java.util.List<java.lang.String> r0 = r3.order
            int r0 = r0.indexOf(r2)
            if (r0 < 0) goto L44
        L41:
            java.util.List<java.lang.String> r0 = r3.order
            return r0
        L44:
            java.util.List<java.lang.String> r0 = r4.order
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.LIZ():java.util.List");
    }

    public static final class FeedMultiTabOrderModel {

        @C09CT("order")
        public final List<String> order;

        public FeedMultiTabOrderModel(List<String> list) {
            this.order = list;
        }
    }
}
