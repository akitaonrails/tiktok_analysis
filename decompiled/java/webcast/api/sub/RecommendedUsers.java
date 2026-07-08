package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendedUsers {

    @C09CT("recommend_type")
    public int recommendType;

    @C09CT("total_count")
    public int totalCount;

    @C09CT("users")
    public List<RecommendedUser> users = new ArrayList();

    @C09CT("recommend_type_name")
    public String recommendTypeName = "";

    @C09CT("recommend_type_text")
    public String recommendTypeText = "";
}
