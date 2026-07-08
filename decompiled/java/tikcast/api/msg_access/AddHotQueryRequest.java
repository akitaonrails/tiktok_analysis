package tikcast.api.msg_access;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AddHotQueryRequest {

    @C09CT("offline_time")
    public long offlineTime;

    @C09CT("online_time")
    public long onlineTime;

    @C09CT("lang")
    public String lang = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("author")
    public String author = "";

    @C09CT("hot_queries")
    public String hotQueries = "";

    @C09CT("unique_ids")
    public List<String> uniqueIds = new ArrayList();
}
