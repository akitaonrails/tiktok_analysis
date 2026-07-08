package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetCameraLiveFragmentListData {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("highlight_list")
    public List<CameraHighlight> highlightList = new ArrayList();

    @C09CT("last_id")
    public long lastId;
}
