package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C2095008Iq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class EComWordRichExpression {

    @C09CT("expression_combine_info")
    public final String expressionCombineInfo;

    @C09CT("icon_text_info")
    public final List<IconTextInfo> iconTextInfo;

    @C09CT("tracker_info")
    public final Map<String, String> trackerInfo;

    @C09CT("attach_info")
    public final WordAttachInfo wordAttachInfo;

    public final boolean LIZ() {
        Integer numLJIIJJI;
        String str = this.expressionCombineInfo;
        return (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 1) ? false : true;
    }

    public EComWordRichExpression(String str, WordAttachInfo wordAttachInfo, List<IconTextInfo> list, Map<String, String> map) {
        this.expressionCombineInfo = str;
        this.wordAttachInfo = wordAttachInfo;
        this.iconTextInfo = list;
        this.trackerInfo = map;
    }
}
