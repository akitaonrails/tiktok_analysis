package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ColdStartStatData {

    @C09CT("stats")
    public List<ColdStartStat> stats = new ArrayList();

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("viewer_count")
    public int viewerCount;
}
