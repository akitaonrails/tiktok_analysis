package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C020N;
import X.C08LY;
import X.C098200Yq;
import X.C09CT;
import X.C09RB;
import X.C11VU;
import X.C1708600uZ0;
import X.C1711340udQ;
import X.C189200o6;
import X.C1939607ik;
import X.C19719612Di;
import X.C844470XAv;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.Pipo3DSConfigs;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class RiskInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("browser_accept_header")
    public final String browserAcceptHeader;

    @C09CT("browser_color_depth")
    public final String browserColorDepth;

    @C09CT("browser_ip")
    public final String browserIP;

    @C09CT("browser_java_enabled")
    public final Boolean browserJavaEnabled;

    @C09CT("browser_javascript_enabled")
    public final Boolean browserJavascriptEnabled;

    @C09CT("browser_language")
    public final String browserLanguage;

    @C09CT("browser_screen_height")
    public final String browserScreenHeight;

    @C09CT("browser_screen_width")
    public final String browserScreenWidth;

    @C09CT("browser_tz")
    public final String browserTimezone;

    @C09CT("device_platform")
    public final String devicePlatform;

    @C09CT("pm_device_data")
    public final String pmDeviceData;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("user_create_time")
    public final String userCreateTime;

    @C09CT("user_id")
    public final String userId;

    static {
        new C1708600uZ0();
    }

    public RiskInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public RiskInfo(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, String str9, String str10, String str11, String str12) {
        this.devicePlatform = str;
        this.browserJavaEnabled = bool;
        this.browserAcceptHeader = str2;
        this.browserLanguage = str3;
        this.browserColorDepth = str4;
        this.browserScreenHeight = str5;
        this.browserScreenWidth = str6;
        this.browserTimezone = str7;
        this.browserIP = str8;
        this.browserJavascriptEnabled = bool2;
        this.pmDeviceData = str9;
        this.userCreateTime = str10;
        this.userId = str11;
        this.requestId = str12;
    }

    public RiskInfo(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String id = str7;
        String str13 = str2;
        String strValueOf = str6;
        String appLanguage = str3;
        Boolean bool3 = bool2;
        String strValueOf2 = str5;
        String str14 = str10;
        String str15 = str8;
        String str16 = str12;
        String str17 = str4;
        String str18 = str9;
        Boolean bool4 = bool;
        String str19 = (i & 1) != 0 ? "android" : str;
        bool4 = (i & 2) != 0 ? Pipo3DSConfigs.LIZ().browserJavaEnabled : bool4;
        str13 = (i & 4) != 0 ? Pipo3DSConfigs.LIZ().browserAcceptHeader : str13;
        appLanguage = (i & 8) != 0 ? ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage() : appLanguage;
        str17 = (i & 16) != 0 ? Pipo3DSConfigs.LIZ().browserColorDepth : str17;
        if ((i & 32) != 0) {
            C844470XAv.LIZ.getClass();
            strValueOf2 = String.valueOf(C11VU.LIZLLL(C844470XAv.LIZ()));
        }
        if ((i & 64) != 0) {
            C844470XAv.LIZ.getClass();
            strValueOf = String.valueOf(C11VU.LJ(C844470XAv.LIZ()));
        }
        id = (i & 128) != 0 ? TimeZone.getDefault().getID() : id;
        if ((i & 256) != 0) {
            C1711340udQ.LIZ.getClass();
            try {
                ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(Collections.list(((NetworkInterface) it2.next()).getInetAddresses()), arrayList);
                }
                str15 = (String) C09RB.LJIIL(new C08LY(C09RB.LJIIIZ(new C08LY(C09RB.LJIIIZ(new C1939607ik(arrayList), AFwS245S0000000_12.get$arr$(272)), AFwS231S0000000_3.get$arr$(299)), new C020N(true, 14)), new C020N(true, 15)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                str15 = null;
            }
        }
        bool3 = (i & 512) != 0 ? Pipo3DSConfigs.LIZ().browserJavascriptEnabled : bool3;
        str18 = (i & 1024) != 0 ? null : str18;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            str14 = simpleDateFormat.format(new Date());
        }
        this(str19, bool4, str13, appLanguage, str17, strValueOf2, strValueOf, id, str15, bool3, str18, str14, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str11 : null, (i & 8192) != 0 ? UUID.randomUUID().toString() : str16);
    }
}
