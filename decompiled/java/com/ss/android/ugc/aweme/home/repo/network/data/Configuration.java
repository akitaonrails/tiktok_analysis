package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;
import X.C1717770unn;
import X.C2222691Bz1;
import X.C827070WcT;
import X.C844470XAv;
import X.InterfaceC1713900uhY;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class Configuration {

    @C09CT("app_id")
    public final String appId;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("device_platform")
    public final String devicePlatform;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("did")
    public final String f383did;

    @C09CT("locale")
    public final String locale;

    @C09CT("platform")
    public final String platform;

    @C09CT("priority_region")
    public final String priorityRegion;

    public Configuration() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Configuration(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.locale = str;
        this.appVersion = str2;
        this.appId = str3;
        this.priorityRegion = str4;
        this.platform = str5;
        this.devicePlatform = str6;
        this.f383did = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Configuration(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String strLIZJ = str7;
        String str8 = str5;
        String strLIZ = str4;
        String strValueOf = str3;
        String strLJFF = str2;
        String currentLocaleStr = str;
        if ((i & 1) != 0) {
            InterfaceC1713900uhY interfaceC1713900uhYLIZLLL = C1717770unn.LIZLLL();
            C844470XAv.LIZ.getClass();
            currentLocaleStr = interfaceC1713900uhYLIZLLL.getCurrentLocaleStr(C844470XAv.LIZ());
        }
        if ((i & 2) != 0) {
            C844470XAv.LIZ.getClass();
            strLJFF = C844470XAv.LJFF();
        }
        if ((i & 4) != 0) {
            C844470XAv.LIZ.getClass();
            strValueOf = String.valueOf(C844470XAv.LJIIJ);
        }
        strLIZ = (i & 8) != 0 ? C2222691Bz1.LIZ() : strLIZ;
        str8 = (i & 16) != 0 ? "android" : str8;
        String str9 = (i & 32) == 0 ? str6 : "android";
        if ((i & 64) != 0) {
            C827070WcT.LIZ.getClass();
            strLIZJ = C827070WcT.LIZJ();
        }
        this(currentLocaleStr, strLJFF, strValueOf, strLIZ, str8, str9, strLIZJ);
    }
}
