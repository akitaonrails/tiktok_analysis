package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetRecommendsRequest {

    @C09CT("count")
    public int count;

    @C09CT("offset")
    public int offset;

    @C09CT("room_id")
    public long roomId;

    @C09CT("recommend_scenes")
    public List<RecommendScene> recommendScenes = new ArrayList();

    @C09CT("keyword")
    public String keyword = "";

    @C09CT("filtered_user_ids")
    public List<String> filteredUserIds = new ArrayList();

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("source")
    public String source = "";
}
