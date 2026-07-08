package webcast.api.sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PerksPinPanel {

    @C09CT("cooling_down_time")
    public long coolingDownTime;

    @C09CT("pinned_id_str")
    public String pinnedIdStr = "";

    @C09CT("show_to_new_viewer")
    public boolean showToNewViewer;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
