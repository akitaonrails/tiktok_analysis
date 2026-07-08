package com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class WatchHistorySchemeSetting {
    public static final ActivityCenterSettingModel LIZ = new ActivityCenterSettingModel("", C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());

    public static final class ActivityCenterSettingModel {

        @C09CT("schemaPath")
        public final String schemaPath;

        @C09CT("schemaQuery")
        public final Map<String, Object> schemaQuery;

        @C09CT("specialUrlQuery")
        public final Map<String, Object> specialUrlQuery;

        @C09CT("url")
        public final Map<String, Object> url;

        @C09CT("urlQuery")
        public final Map<String, Object> urlQuery;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityCenterSettingModel)) {
                return false;
            }
            ActivityCenterSettingModel activityCenterSettingModel = (ActivityCenterSettingModel) obj;
            return Intrinsics.LJFF(this.schemaPath, activityCenterSettingModel.schemaPath) && Intrinsics.LJFF(this.schemaQuery, activityCenterSettingModel.schemaQuery) && Intrinsics.LJFF(this.specialUrlQuery, activityCenterSettingModel.specialUrlQuery) && Intrinsics.LJFF(this.url, activityCenterSettingModel.url) && Intrinsics.LJFF(this.urlQuery, activityCenterSettingModel.urlQuery);
        }

        public final int hashCode() {
            return (((((((this.schemaPath.hashCode() * 31) + this.schemaQuery.hashCode()) * 31) + this.specialUrlQuery.hashCode()) * 31) + this.url.hashCode()) * 31) + this.urlQuery.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ActivityCenterSettingModel(schemaPath=");
            sbLIZ.append(this.schemaPath);
            sbLIZ.append(", schemaQuery=");
            sbLIZ.append(this.schemaQuery);
            sbLIZ.append(", specialUrlQuery=");
            sbLIZ.append(this.specialUrlQuery);
            sbLIZ.append(", url=");
            sbLIZ.append(this.url);
            sbLIZ.append(", urlQuery=");
            sbLIZ.append(this.urlQuery);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ActivityCenterSettingModel() {
            this("", C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
        }

        public ActivityCenterSettingModel(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
            this.schemaPath = str;
            this.schemaQuery = map;
            this.specialUrlQuery = map2;
            this.url = map3;
            this.urlQuery = map4;
        }
    }
}
