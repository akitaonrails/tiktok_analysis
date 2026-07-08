package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class OptionConfigParams {

    @C09CT("activity_option")
    public ActivityOptionStruct activityTypeOptionStruct;

    @C09CT("category_option")
    public FilterOptionStruct categoryOptionStruct;

    @C09CT("filter_option_list")
    public List<FilterOptionStruct> filterOptionList;

    @C09CT("filter_option")
    public FilterOptionStruct filterOptionStruct;

    @C09CT("follower_number_option")
    public FilterOptionStruct followerNumberOptionStruct;

    @C09CT("other_preferences_option")
    public FilterOptionStruct otherPreferencesOption;

    @C09CT("profiles_types_option")
    public FilterOptionStruct profilesTypesOptionStruct;

    @C09CT("research_option_list")
    public List<ResearchFilterStruct> researchOptionList;

    @C09CT("search_type")
    public String searchType;

    @C09CT("sort_option")
    public FilterOptionStruct sortTypeOptionStruct;
}
