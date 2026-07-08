package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMobParam implements Serializable {

    @C09CT("aweme_type")
    public final Integer awemeType;

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("creation_extra_data")
    public final Map<String, String> creationExtraData;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("display_index")
    public final Integer displayIndex;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("is_display_distance")
    public final Integer isDisplayDistance;

    @C09CT("is_multi_content")
    public final boolean isMultiContent;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("use_method")
    public final String useMethod;

    @C09CT("use_session_cache")
    public final int useSessionCache;

    public PoiMobParam() {
        this(null, null, null, null, null, null, null, "", false, 0, null, null, null, null);
    }

    public final PoiMobParam copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, boolean z, int i, Map<String, String> map, Integer num2, String str8, Integer num3) {
        return new PoiMobParam(str, str2, str3, str4, str5, num, str6, str7, z, i, map, num2, str8, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMobParam)) {
            return false;
        }
        PoiMobParam poiMobParam = (PoiMobParam) obj;
        return Intrinsics.LJFF(this.creationId, poiMobParam.creationId) && Intrinsics.LJFF(this.contentType, poiMobParam.contentType) && Intrinsics.LJFF(this.shootWay, poiMobParam.shootWay) && Intrinsics.LJFF(this.enterMethod, poiMobParam.enterMethod) && Intrinsics.LJFF(this.enterFrom, poiMobParam.enterFrom) && Intrinsics.LJFF(this.awemeType, poiMobParam.awemeType) && Intrinsics.LJFF(this.searchId, poiMobParam.searchId) && Intrinsics.LJFF(this.contentSource, poiMobParam.contentSource) && this.isMultiContent == poiMobParam.isMultiContent && this.useSessionCache == poiMobParam.useSessionCache && Intrinsics.LJFF(this.creationExtraData, poiMobParam.creationExtraData) && Intrinsics.LJFF(this.isDisplayDistance, poiMobParam.isDisplayDistance) && Intrinsics.LJFF(this.useMethod, poiMobParam.useMethod) && Intrinsics.LJFF(this.displayIndex, poiMobParam.displayIndex);
    }

    public String toString() {
        return "PoiMobParam(creationId=" + this.creationId + ", contentType=" + this.contentType + ", shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", awemeType=" + this.awemeType + ", searchId=" + this.searchId + ", contentSource=" + this.contentSource + ", isMultiContent=" + this.isMultiContent + ", useSessionCache=" + this.useSessionCache + ", creationExtraData=" + this.creationExtraData + ", isDisplayDistance=" + this.isDisplayDistance + ", useMethod=" + this.useMethod + ", displayIndex=" + this.displayIndex + ')';
    }

    public final Integer isDisplayDistance() {
        return this.isDisplayDistance;
    }

    public final boolean isMultiContent() {
        return this.isMultiContent;
    }

    public PoiMobParam(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, boolean z, int i, Map<String, String> map, Integer num2, String str8, Integer num3) {
        this.creationId = str;
        this.contentType = str2;
        this.shootWay = str3;
        this.enterMethod = str4;
        this.enterFrom = str5;
        this.awemeType = num;
        this.searchId = str6;
        this.contentSource = str7;
        this.isMultiContent = z;
        this.useSessionCache = i;
        this.creationExtraData = map;
        this.isDisplayDistance = num2;
        this.useMethod = str8;
        this.displayIndex = num3;
    }
}
