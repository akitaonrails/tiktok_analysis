package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.pages.result.aidisclaimer.SearchLLMCardCommonInfo;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMixCardProfile implements Serializable {
    public static final int $stable = 8;

    @C09CT("card_summary_info")
    public final Map<String, Object> cardSummaryInfo;

    @C09CT("category_tag_list")
    public final HashSet<Integer> categoryTypes;

    @C09CT("llm_common_info")
    public final SearchLLMCardCommonInfo llmCommonInfo;

    @C09CT("scene_type")
    public final String sceneType;

    @C09CT("token_type")
    public final String tokenType;

    @C09CT("unique_id")
    public final String uniqueId;

    public SearchMixCardProfile() {
        this(null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMixCardProfile(uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", categoryTypes=");
        sbLIZ.append(this.categoryTypes);
        sbLIZ.append(", llmCommonInfo=");
        sbLIZ.append(this.llmCommonInfo);
        sbLIZ.append(", tokenType=");
        sbLIZ.append(this.tokenType);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.sceneType);
        sbLIZ.append(", cardSummaryInfo=");
        sbLIZ.append(this.cardSummaryInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchMixCardProfile(String str, HashSet<Integer> hashSet, SearchLLMCardCommonInfo searchLLMCardCommonInfo, String str2, String str3, Map<String, ? extends Object> map) {
        this.uniqueId = str;
        this.categoryTypes = hashSet;
        this.llmCommonInfo = searchLLMCardCommonInfo;
        this.tokenType = str2;
        this.sceneType = str3;
        this.cardSummaryInfo = map;
    }
}
