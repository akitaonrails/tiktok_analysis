package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C0ZVH;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TitleBarRightIconConf extends IBusinessConfig {
    public static final C0ZVH Companion = new Object() { // from class: X.0ZVH
    };

    @C09CT("action_schema")
    public final String actionSchema;

    @C09CT("biz_info")
    public final Map<String, String> bizInfo;

    @C09CT("icon_dark_disabled_url")
    public final String iconDarkDisabledUrl;

    @C09CT("icon_dark_url")
    public final String iconDarkUrl;

    @C09CT("icon_disabled_url")
    public final String iconDisabledUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    public TitleBarRightIconConf() {
        this(null, null, null, null, null, null);
    }

    public final TitleBarRightIconConf copy(String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        return new TitleBarRightIconConf(str, str2, str3, map, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleBarRightIconConf)) {
            return false;
        }
        TitleBarRightIconConf titleBarRightIconConf = (TitleBarRightIconConf) obj;
        return Intrinsics.LJFF(this.actionSchema, titleBarRightIconConf.actionSchema) && Intrinsics.LJFF(this.iconUrl, titleBarRightIconConf.iconUrl) && Intrinsics.LJFF(this.iconDarkUrl, titleBarRightIconConf.iconDarkUrl) && Intrinsics.LJFF(this.bizInfo, titleBarRightIconConf.bizInfo) && Intrinsics.LJFF(this.iconDisabledUrl, titleBarRightIconConf.iconDisabledUrl) && Intrinsics.LJFF(this.iconDarkDisabledUrl, titleBarRightIconConf.iconDarkDisabledUrl);
    }

    public int hashCode() {
        String str = this.actionSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconDarkUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.bizInfo;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.iconDisabledUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconDarkDisabledUrl;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarRightIconConf(actionSchema=");
        sbLIZ.append(this.actionSchema);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", iconDarkUrl=");
        sbLIZ.append(this.iconDarkUrl);
        sbLIZ.append(", bizInfo=");
        sbLIZ.append(this.bizInfo);
        sbLIZ.append(", iconDisabledUrl=");
        sbLIZ.append(this.iconDisabledUrl);
        sbLIZ.append(", iconDarkDisabledUrl=");
        sbLIZ.append(this.iconDarkDisabledUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getActionSchema() {
        return this.actionSchema;
    }

    public final Map<String, String> getBizInfo() {
        return this.bizInfo;
    }

    public final String getIconDarkDisabledUrl() {
        return this.iconDarkDisabledUrl;
    }

    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    public final String getIconDisabledUrl() {
        return this.iconDisabledUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public TitleBarRightIconConf(String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        this.actionSchema = str;
        this.iconUrl = str2;
        this.iconDarkUrl = str3;
        this.bizInfo = map;
        this.iconDisabledUrl = str4;
        this.iconDarkDisabledUrl = str5;
    }
}
