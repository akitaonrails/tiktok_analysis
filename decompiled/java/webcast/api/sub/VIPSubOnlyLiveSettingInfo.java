package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class VIPSubOnlyLiveSettingInfo {

    @C09CT("plan_category_list")
    public List<Category> planCategoryList = new ArrayList();

    @C09CT("month_category_list")
    public List<Category> monthCategoryList = new ArrayList();

    public static final class Category {

        @C09CT("lower_bound")
        public long lowerBound;

        @C09CT("title")
        public String title = "";

        @C09CT("desc")
        public String desc = "";
    }
}
