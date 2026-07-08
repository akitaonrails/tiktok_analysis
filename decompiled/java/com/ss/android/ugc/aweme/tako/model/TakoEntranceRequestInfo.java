package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEntranceRequestInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("active_action_bar")
    public Integer activeActionBar;

    @C09CT("params_map")
    public final Map<String, Object> paramsMap;

    @C09CT("search_card_summary")
    public final String searchCardSummary;

    @C09CT("template_generate_type")
    public Integer templateGenerateType;

    @C09CT("visual_search_card_answer")
    public final String visualSearchCardAnswer;

    @C09CT("visual_search_card_query")
    public final String visualSearchCardQuery;

    public TakoEntranceRequestInfo() {
        this(null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEntranceRequestInfo(searchCardSummary=");
        sbLIZ.append(this.searchCardSummary);
        sbLIZ.append(", visualSearchCardQuery=");
        sbLIZ.append(this.visualSearchCardQuery);
        sbLIZ.append(", visualSearchCardAnswer=");
        sbLIZ.append(this.visualSearchCardAnswer);
        sbLIZ.append(", paramsMap=");
        sbLIZ.append(this.paramsMap);
        sbLIZ.append(", activeActionBar=");
        sbLIZ.append(this.activeActionBar);
        sbLIZ.append(", templateGenerateType=");
        sbLIZ.append(this.templateGenerateType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setActiveActionBar(Integer num) {
        this.activeActionBar = num;
    }

    public final void setTemplateGenerateType(Integer num) {
        this.templateGenerateType = num;
    }

    public TakoEntranceRequestInfo(String str, String str2, String str3, Map<String, ? extends Object> map, Integer num, Integer num2) {
        this.searchCardSummary = str;
        this.visualSearchCardQuery = str2;
        this.visualSearchCardAnswer = str3;
        this.paramsMap = map;
        this.activeActionBar = num;
        this.templateGenerateType = num2;
    }
}
