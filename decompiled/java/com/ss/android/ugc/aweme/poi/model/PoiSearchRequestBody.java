package com.ss.android.ugc.aweme.poi.model;

import X.C09CT;
import X.C1227904rF;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.h;
import com.google.gson.n;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class PoiSearchRequestBody implements Serializable {

    @C09CT("ab_params")
    public final String abParams;

    @C09CT("appid")
    public final int appId;

    @C09CT("appversion")
    public final String appVersion;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("client_extra_data")
    public final String clientExtraData;

    @C09CT("device")
    public final int device;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("did")
    public final String f392did;

    @C09CT("enc_data")
    public final String encData;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("filter_ids")
    public final List<String> filterIds;

    @C09CT("first_page_poi_ids")
    public final String firstPagePoiIds;

    @C09CT("hashtags")
    public final List<String> hashtags;

    @C09CT("is_alliance_creator")
    public final Boolean isAllianceCreator;

    @C09CT("language")
    public final String language;

    @C09CT("location_allowed")
    public final int locationAllowed;

    @C09CT("location_installed")
    public final int locationInstalled;

    @C09CT("location_precise")
    public final int locationPrecise;

    @C09CT("need_filter_data")
    public final Boolean needFilterData;

    @C09CT("offset")
    public final long offset;

    @C09CT("page")
    public final long page;

    @C09CT("publish_content")
    public final String publishContent;

    @C09CT("publish_log_id")
    public final String publishLogId;

    @C09CT("publish_poi_id")
    public final String publishPoiId;

    @C09CT("radius")
    public final long radius;

    @C09CT("region")
    public final String region;

    @C09CT("scenario")
    public final String scenario;

    @C09CT("sdkversion")
    public final String sdkVersion;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("session_id")
    public final Long sessionId;

    @C09CT("timestamp")
    public final long timeStamp;

    public n toJsonObject() {
        n nVar = new n();
        String str = this.region;
        if (str != null) {
            nVar.LJJIIJ("region", str);
        }
        String str2 = this.language;
        if (str2 != null) {
            nVar.LJJIIJ("language", str2);
        }
        String str3 = this.scenario;
        if (str3 != null) {
            nVar.LJJIIJ("scenario", str3);
        }
        nVar.LJJIII(Long.valueOf(this.radius), "radius");
        nVar.LJJIII(Long.valueOf(this.offset), "offset");
        nVar.LJJIII(Long.valueOf(this.page), "page");
        nVar.LJJIII(Integer.valueOf(this.device), "device");
        nVar.LJJIII(Integer.valueOf(this.appId), "appid");
        String str4 = this.f392did;
        if (str4 != null) {
            nVar.LJJIIJ("did", str4);
        }
        String str5 = this.appVersion;
        if (str5 != null) {
            nVar.LJJIIJ("appversion", str5);
        }
        String str6 = this.sdkVersion;
        if (str6 != null) {
            nVar.LJJIIJ("sdkversion", str6);
        }
        nVar.LJJIII(Long.valueOf(this.timeStamp), "timestamp");
        nVar.LJJIII(Integer.valueOf(this.locationAllowed), "location_allowed");
        nVar.LJJIII(Integer.valueOf(this.locationInstalled), "location_installed");
        nVar.LJJIII(Integer.valueOf(this.locationPrecise), "location_precise");
        String str7 = this.abParams;
        if (str7 != null) {
            nVar.LJJIIJ("ab_params", str7);
        }
        String str8 = this.encData;
        if (str8 != null) {
            nVar.LJJIIJ("enc_data", str8);
        }
        Long l = this.sessionId;
        if (l != null) {
            nVar.LJJIII(Long.valueOf(l.longValue()), "session_id");
        }
        String str9 = this.awemeId;
        if (str9 != null) {
            nVar.LJJIIJ("aweme_id", str9);
        }
        String str10 = this.enterFrom;
        if (str10 != null) {
            nVar.LJJIIJ("enter_from", str10);
        }
        String str11 = this.searchId;
        if (str11 != null) {
            nVar.LJJIIJ("search_id", str11);
        }
        String str12 = this.publishPoiId;
        if (str12 != null) {
            nVar.LJJIIJ("publish_poi_id", str12);
        }
        String str13 = this.publishLogId;
        if (str13 != null) {
            nVar.LJJIIJ("publish_log_id", str13);
        }
        String str14 = this.clientExtraData;
        if (str14 != null) {
            nVar.LJJIIJ("client_extra_data", str14);
        }
        String str15 = this.publishContent;
        if (str15 != null) {
            nVar.LJJIIJ("publish_content", str15);
        }
        String str16 = this.firstPagePoiIds;
        if (str16 != null) {
            nVar.LJJIIJ("first_page_poi_ids", str16);
        }
        List<String> list = this.hashtags;
        if (list != null) {
            C1227904rF.LIZ.getClass();
            nVar.LJJIFFI("hashtags", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), list));
        }
        Boolean bool = this.isAllianceCreator;
        if (bool != null) {
            bool.booleanValue();
            nVar.LJJII(this.isAllianceCreator, "is_alliance_creator");
            if (!Intrinsics.LJFF(this.isAllianceCreator, Boolean.FALSE)) {
                nVar.LJJII(this.needFilterData, "need_filter_data");
                if (this.filterIds != null && (!r0.isEmpty())) {
                    h hVar = new h();
                    Iterator<String> it2 = this.filterIds.iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIII(it2.next());
                    }
                    nVar.LJJIFFI("filter_ids", hVar);
                }
            }
        }
        return nVar;
    }

    public final String getAbParams() {
        return this.abParams;
    }

    public final int getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getClientExtraData() {
        return this.clientExtraData;
    }

    public final int getDevice() {
        return this.device;
    }

    public final String getDid() {
        return this.f392did;
    }

    public final String getEncData() {
        return this.encData;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final List<String> getFilterIds() {
        return this.filterIds;
    }

    public final String getFirstPagePoiIds() {
        return this.firstPagePoiIds;
    }

    public final List<String> getHashtags() {
        return this.hashtags;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getLocationAllowed() {
        return this.locationAllowed;
    }

    public final int getLocationInstalled() {
        return this.locationInstalled;
    }

    public final int getLocationPrecise() {
        return this.locationPrecise;
    }

    public final Boolean getNeedFilterData() {
        return this.needFilterData;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getPage() {
        return this.page;
    }

    public final String getPublishContent() {
        return this.publishContent;
    }

    public final String getPublishLogId() {
        return this.publishLogId;
    }

    public final String getPublishPoiId() {
        return this.publishPoiId;
    }

    public final long getRadius() {
        return this.radius;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final Boolean isAllianceCreator() {
        return this.isAllianceCreator;
    }

    public PoiSearchRequestBody(String str, String str2, String str3, long j, long j2, long j3, int i, int i2, String str4, String str5, String str6, long j4, int i3, int i4, int i5, String str7, String str8, Long l, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<String> list, Boolean bool, Boolean bool2, List<String> list2, String str16) {
        this.region = str;
        this.language = str2;
        this.scenario = str3;
        this.radius = j;
        this.offset = j2;
        this.page = j3;
        this.device = i;
        this.appId = i2;
        this.f392did = str4;
        this.appVersion = str5;
        this.sdkVersion = str6;
        this.timeStamp = j4;
        this.locationAllowed = i3;
        this.locationInstalled = i4;
        this.locationPrecise = i5;
        this.abParams = str7;
        this.encData = str8;
        this.sessionId = l;
        this.awemeId = str9;
        this.enterFrom = str10;
        this.searchId = str11;
        this.publishPoiId = str12;
        this.publishLogId = str13;
        this.clientExtraData = str14;
        this.publishContent = str15;
        this.hashtags = list;
        this.isAllianceCreator = bool;
        this.needFilterData = bool2;
        this.filterIds = list2;
        this.firstPagePoiIds = str16;
    }
}
