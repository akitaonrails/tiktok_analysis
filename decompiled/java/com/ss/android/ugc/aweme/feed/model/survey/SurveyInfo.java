package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class SurveyInfo implements Serializable {

    @C09CT("biz_params")
    public String bitParams;

    @C09CT("content_scope")
    public String contentScope;

    @C09CT("cover_image_color")
    public String coverImageColor;

    @C09CT("replace")
    public ReplaceInfo replacement;

    @C09CT("survey_key")
    public String surveyKey;
    public long surveyStayTimeSum;

    @C09CT("triggers")
    public List<Integer> triggers;

    public SurveyInfo() {
        this(null, null, null, null, null, 0L, null, 127, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurveyInfo(surveyKey=");
        sbLIZ.append(this.surveyKey);
        sbLIZ.append(", contentScope=");
        sbLIZ.append(this.contentScope);
        sbLIZ.append(", bitParams=");
        sbLIZ.append(this.bitParams);
        sbLIZ.append(", replacement=");
        sbLIZ.append(this.replacement);
        sbLIZ.append(", triggers=");
        sbLIZ.append(this.triggers);
        sbLIZ.append(", surveyStayTimeSum=");
        sbLIZ.append(this.surveyStayTimeSum);
        sbLIZ.append(", coverImageColor=");
        sbLIZ.append(this.coverImageColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setReplacement(ReplaceInfo replaceInfo) {
        this.replacement = replaceInfo;
    }

    public final void setSurveyKey(String str) {
        this.surveyKey = str;
    }

    public final void setSurveyStayTimeSum(long j) {
        this.surveyStayTimeSum = j;
    }

    public final void setTriggers(List<Integer> list) {
        this.triggers = list;
    }

    public SurveyInfo(String str, String str2, String str3, ReplaceInfo replaceInfo, List<Integer> list, long j, String str4) {
        this.surveyKey = str;
        this.contentScope = str2;
        this.bitParams = str3;
        this.replacement = replaceInfo;
        this.triggers = list;
        this.surveyStayTimeSum = j;
        this.coverImageColor = str4;
    }

    public SurveyInfo(String str, String str2, String str3, ReplaceInfo replaceInfo, List list, long j, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : replaceInfo, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? str4 : "");
    }
}
