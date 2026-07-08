package tikcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class FansGetTaskInfoRequest {

    @C09CT("is_pre_render")
    public boolean isPreRender;

    @C09CT("need_top_contributors")
    public boolean needTopContributors;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";
}
