package com.ss.android.ugc.trill.feedback.api;

import X.C040I;
import X.C09CT;
import X.C1689100u3Y;
import X.C610330Nwl;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501260pAa;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface CSPPageApi {
    public static final C610330Nwl LIZ = C610330Nwl.LIZ;

    public static final class CSPButtonRequestBody {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("AppID")
        public int appID;

        @C09CT("AppKey")
        public String appKey;

        @C09CT("AppLanguage")
        public String appLanguage;

        @C09CT("AppVersion")
        public String appVersion;

        @C09CT("BotEntrance")
        public String botEntrance;

        @C09CT("Category")
        public String category;

        @C09CT("DeviceID")
        public String deviceID;

        @C09CT("ImEntrance")
        public String imEntrance;

        @C09CT("Language")
        public String language;

        @C09CT("RapFaqId")
        public String rapFaqId;

        @C09CT("RealUserID")
        public long realUserID;

        @C09CT("UserID")
        public String userID;

        public CSPButtonRequestBody() {
            this("TIKTOK_APP_RAP_INDEX_V2", "TIKTOK_APP_RAP_INDEX", "", 0L, "", 0, "", "", "", "", "", "");
        }

        public CSPButtonRequestBody(String str, String str2, String str3, long j, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.botEntrance = str;
            this.imEntrance = str2;
            this.language = str3;
            this.realUserID = j;
            this.deviceID = str4;
            this.appID = i;
            this.userID = str5;
            this.appVersion = str6;
            this.appLanguage = str7;
            this.appKey = str8;
            this.category = str9;
            this.rapFaqId = str10;
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    public static final class FaqRequestBody implements Serializable {
        public String aid;

        @C09CT("app_key")
        public String appKey;
        public String country;

        @C09CT("device_id")
        public String deviceId;
        public String entrance;

        @C09CT("faq_types")
        public String general;
        public String lang;
        public String uid;
        public static final C1689100u3Y Factory = new C1689100u3Y();
        public static final int $stable = 8;

        public FaqRequestBody() {
            this("", "tiktok-android", "", "", "general_v2", "general", "", "");
        }

        public final void setAid(String str) {
            this.aid = str;
        }

        public final void setAppKey(String str) {
            this.appKey = str;
        }

        public final void setCountry(String str) {
            this.country = str;
        }

        public final void setDeviceId(String str) {
            this.deviceId = str;
        }

        public final void setEntrance(String str) {
            this.entrance = str;
        }

        public final void setGeneral(String str) {
            this.general = str;
        }

        public final void setLang(String str) {
            this.lang = str;
        }

        public final void setUid(String str) {
            this.uid = str;
        }

        public FaqRequestBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.aid = str;
            this.appKey = str2;
            this.country = str3;
            this.deviceId = str4;
            this.entrance = str5;
            this.general = str6;
            this.lang = str7;
            this.uid = str8;
        }
    }

    @InterfaceC1501200pAU("/feedback/1/report_a_problem_index/")
    Object LIZ(@InterfaceC1501260pAa Map<String, String> map, InterfaceC1364105Vn<? super FaqResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/feedback/1/faq_list/")
    Object LIZIZ(@InterfaceC1501260pAa Map<String, String> map, @InterfaceC1501120pAM("faq_types") List<String> list, InterfaceC1364105Vn<? super FaqResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/csp/im/api/v2/check_chat_entrance")
    Object LIZJ(@C040I CSPButtonRequestBody cSPButtonRequestBody, InterfaceC1364105Vn<? super FaqBottomButtonResponse> interfaceC1364105Vn);
}
