package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PATopicsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("ad_topics")
    public final List<AdTopicStruct> adTopics;

    @C09CT("description_learn_more_link")
    public final String descriptionLearnMoreLink;

    @C09CT("gender")
    public final String gender;

    @C09CT("interest_learn_more_link")
    public final String interestLearnMoreLink;

    public PATopicsResponse() {
        this(null, null, null, null);
    }

    public final PATopicsResponse copy(List<AdTopicStruct> list, String str, String str2, String str3) {
        return new PATopicsResponse(list, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PATopicsResponse)) {
            return false;
        }
        PATopicsResponse pATopicsResponse = (PATopicsResponse) obj;
        return Intrinsics.LJFF(this.adTopics, pATopicsResponse.adTopics) && Intrinsics.LJFF(this.gender, pATopicsResponse.gender) && Intrinsics.LJFF(this.descriptionLearnMoreLink, pATopicsResponse.descriptionLearnMoreLink) && Intrinsics.LJFF(this.interestLearnMoreLink, pATopicsResponse.interestLearnMoreLink);
    }

    public int hashCode() {
        List<AdTopicStruct> list = this.adTopics;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.gender;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descriptionLearnMoreLink;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.interestLearnMoreLink;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PATopicsResponse(adTopics=");
        sbLIZ.append(this.adTopics);
        sbLIZ.append(", gender=");
        sbLIZ.append(this.gender);
        sbLIZ.append(", descriptionLearnMoreLink=");
        sbLIZ.append(this.descriptionLearnMoreLink);
        sbLIZ.append(", interestLearnMoreLink=");
        sbLIZ.append(this.interestLearnMoreLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AdTopicStruct> getAdTopics() {
        return this.adTopics;
    }

    public final String getDescriptionLearnMoreLink() {
        return this.descriptionLearnMoreLink;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getInterestLearnMoreLink() {
        return this.interestLearnMoreLink;
    }

    public PATopicsResponse(List<AdTopicStruct> list, String str, String str2, String str3) {
        this.adTopics = list;
        this.gender = str;
        this.descriptionLearnMoreLink = str2;
        this.interestLearnMoreLink = str3;
    }
}
