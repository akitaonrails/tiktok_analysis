package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetRecommendsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gift_sub_count")
        public long giftSubCount;

        @C09CT("recommends_list")
        public List<OnePageRecommends> recommendsList = new ArrayList();
    }
}
