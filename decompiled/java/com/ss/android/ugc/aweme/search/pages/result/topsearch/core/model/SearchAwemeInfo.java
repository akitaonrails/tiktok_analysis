package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAwemeInfo implements Serializable {

    @C09CT("external_jump_url")
    public final String externalJumpUrl;

    @C09CT("has_creation_intention")
    public final Boolean hasCreationIntention;

    @C09CT("intent_type")
    public final Integer intentType;

    @C09CT("key_moment")
    public final KeyMoments keyMomentList;

    @C09CT("relevant_clip")
    public final RelevantClip relevantClip;

    @C09CT("replace_cover_list")
    public final List<ReplaceCover> replaceCoverList;

    @C09CT("translate_search_descs")
    public final List<TranslateSearchDesc> translateSearchList;

    @C09CT("with_search_survey")
    public final Boolean withSearchSurvey;

    public SearchAwemeInfo() {
        this(Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAwemeInfo(withSearchSurvey=");
        sbLIZ.append(this.withSearchSurvey);
        sbLIZ.append(", hasCreationIntention=");
        sbLIZ.append(this.hasCreationIntention);
        sbLIZ.append(", translateSearchList=");
        sbLIZ.append(this.translateSearchList);
        sbLIZ.append(", relevantClip=");
        sbLIZ.append(this.relevantClip);
        sbLIZ.append(", keyMomentList=");
        sbLIZ.append(this.keyMomentList);
        sbLIZ.append(", externalJumpUrl=");
        sbLIZ.append(this.externalJumpUrl);
        sbLIZ.append(", replaceCoverList=");
        sbLIZ.append(this.replaceCoverList);
        sbLIZ.append(", intentType=");
        sbLIZ.append(this.intentType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchAwemeInfo(Boolean bool, Boolean bool2, List<TranslateSearchDesc> list, RelevantClip relevantClip, KeyMoments keyMoments, String str, List<ReplaceCover> list2, Integer num) {
        this.withSearchSurvey = bool;
        this.hasCreationIntention = bool2;
        this.translateSearchList = list;
        this.relevantClip = relevantClip;
        this.keyMomentList = keyMoments;
        this.externalJumpUrl = str;
        this.replaceCoverList = list2;
        this.intentType = num;
    }
}
