package webcast.api.ranklist_class;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LeagueMatchHistoryResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("record_list")
        public List<LeagueMatchRecord> recordList = new ArrayList();
    }
}
