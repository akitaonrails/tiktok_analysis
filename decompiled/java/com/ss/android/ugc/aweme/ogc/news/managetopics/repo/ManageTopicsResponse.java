package com.ss.android.ugc.aweme.ogc.news.managetopics.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ManageTopicsResponse extends BaseResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("help_link")
        public String helpLink;

        @C09CT("topic_preferences")
        public List<TopicPreference> preferenceList;

        @C09CT("version")
        public Integer version;

        @C09CT("version_alert")
        public String versionAlert;

        public Data() {
            this(null, null, null, null);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Data(preferenceList=");
            sbLIZ.append(this.preferenceList);
            sbLIZ.append(", helpLink=");
            sbLIZ.append(this.helpLink);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Data(List<TopicPreference> list, String str, Integer num, String str2) {
            this.preferenceList = list;
            this.helpLink = str;
            this.version = num;
            this.versionAlert = str2;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageAffairsResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ManageTopicsResponse(Data data) {
        this.data = data;
    }
}
