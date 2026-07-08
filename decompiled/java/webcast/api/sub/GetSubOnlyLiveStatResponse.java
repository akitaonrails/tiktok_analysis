package webcast.api.sub;

import X.C09CT;
import webcast.data.SubOnlyLiveGeneralStat;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSubOnlyLiveStatResponse {

    @C09CT("data")
    public GetSubOnlyLiveStatData data;

    public static final class GetSubOnlyLiveStatData {

        @C09CT("description_type")
        public int descriptionType;

        @C09CT("general_stat")
        public SubOnlyLiveGeneralStat generalStat;

        @C09CT("stat_from_time")
        public long statFromTime;

        @C09CT("stat_to_time")
        public long statToTime;

        @C09CT("title_type")
        public int titleType;
    }
}
