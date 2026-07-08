package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategory {

    @C09CT("viewer_count")
    public long viewerCount;

    @C09CT("category_name")
    public String categoryName = "";

    @C09CT("category_type")
    public String categoryType = "";

    @C09CT("rank_type")
    public String rankType = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("labels")
    public List<GameDrawerCategoryLabel> labels = new ArrayList();
}
