package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubToolStat {

    @C09CT("sub_only_live_cnt")
    public long subOnlyLiveCnt;

    @C09CT("sub_only_live_viewer_cnt")
    public long subOnlyLiveViewerCnt;

    @C09CT("sub_only_video_cnt")
    public long subOnlyVideoCnt;

    @C09CT("sub_tool_list")
    public List<Integer> subToolList = new ArrayList();
}
