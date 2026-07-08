package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C827070WcT;
import X.C844470XAv;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class Configuration {

    @C09CT("app_id")
    public final String appId;

    @C09CT("app_language")
    public final String appLanguage;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("device_platform")
    public final String devicePlatform;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("did")
    public final String f390did;

    @C09CT("locale")
    public final String locale;

    @C09CT("platform")
    public final String platform;

    @C09CT("priority_region")
    public final String priorityRegion;

    @C09CT("three_ds_del_mid_page")
    public final String threeDSDelMidPage;

    @C09CT("use_fe_land_page")
    public final Boolean useFeLandPage;

    public Configuration() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final n LIZ() {
        n nVar = new n();
        nVar.LJJIIJ("locale", this.locale);
        nVar.LJJIIJ("app_version", this.appVersion);
        nVar.LJJIIJ("app_language", this.appLanguage);
        nVar.LJJIIJ("app_id", this.appId);
        nVar.LJJIIJ("priority_region", this.priorityRegion);
        nVar.LJJIIJ("platform", this.platform);
        nVar.LJJIIJ("device_platform", this.devicePlatform);
        nVar.LJJIIJ("did", this.f390did);
        String str = this.threeDSDelMidPage;
        if (str != null) {
            nVar.LJJIIJ("three_ds_del_mid_page", str);
        }
        return nVar;
    }

    public Configuration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
        this.locale = str;
        this.appVersion = str2;
        this.appLanguage = str3;
        this.appId = str4;
        this.priorityRegion = str5;
        this.platform = str6;
        this.devicePlatform = str7;
        this.f390did = str8;
        this.threeDSDelMidPage = str9;
        this.useFeLandPage = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Configuration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10 = str9;
        String strLIZJ = str8;
        String str11 = str6;
        String strLIZ = str5;
        String strValueOf = str4;
        String appLanguage = str3;
        String strLJFF = str2;
        String strLIZIZ = str;
        if ((i & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
            sbLIZ.append('-');
            sbLIZ.append(C2222691Bz1.LIZ());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if ((i & 2) != 0) {
            C844470XAv.LIZ.getClass();
            strLJFF = C844470XAv.LJFF();
        }
        appLanguage = (i & 4) != 0 ? ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage() : appLanguage;
        if ((i & 8) != 0) {
            C844470XAv.LIZ.getClass();
            strValueOf = String.valueOf(C844470XAv.LJIIJ);
        }
        strLIZ = (i & 16) != 0 ? C2222691Bz1.LIZ() : strLIZ;
        str11 = (i & 32) != 0 ? "android" : str11;
        String str12 = (i & 64) == 0 ? str7 : "android";
        if ((i & 128) != 0) {
            C827070WcT.LIZ.getClass();
            strLIZJ = C827070WcT.LIZJ();
        }
        this(strLIZIZ, strLJFF, appLanguage, strValueOf, strLIZ, str11, str12, strLIZJ, (i & 256) != 0 ? null : str10, (i & 512) == 0 ? bool : null);
    }
}
