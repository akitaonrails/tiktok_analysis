package com.ss.android.ugc.aweme.commerce.anywhere;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C19273110af;
import X.C786410Ut5;
import X.C792600V7i;
import X.C816120Vzu;
import X.C816140Vzw;
import X.C844470XAv;
import X.EnumC313280CPu;
import X.InterfaceC816150Vzx;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes14.dex */
public final class AnyDoorDepend {
    public void cleanExtraMockCacheIfNeed() {
        ISplashAdService iSplashAdService = (ISplashAdService) C792600V7i.LIZ(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.LJIJ();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Vzu] */
    public C816120Vzu getAppInfo() throws UnsupportedEncodingException {
        final String strValueOf = String.valueOf(C816140Vzw.LIZ);
        final String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        C0XQ7.LJ();
        final String curUserId = C0XQ7.LIZ.LIZ() ? ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId() : CardStruct.IStatusCode.DEFAULT;
        final String strEncode = URLEncoder.encode(Build.MODEL, "UTF-8");
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        final boolean z = localTestApiLIZ != null && localTestApiLIZ.enableBoe();
        final String str = C786410Ut5.Y3(getContext().getPackageManager(), getContext().getPackageName(), 0).versionName;
        final String str2 = Build.VERSION.RELEASE;
        final String string = Keva.getRepo("aweme_network").getString("lastInputEmailPrefix", "");
        return new Object(strValueOf, curUserId, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, str, strEncode, str2, string, z) { // from class: X.0Vzu
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;
            public final boolean LJII;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AnyDoorAppInfo{appId='");
                sbLIZ.append(this.LIZ);
                sbLIZ.append("', userId='");
                sbLIZ.append((Object) this.LIZIZ);
                sbLIZ.append("', deviceId='");
                sbLIZ.append((Object) this.LIZJ);
                sbLIZ.append("', deviceVersion='");
                sbLIZ.append((Object) this.LIZLLL);
                sbLIZ.append("', deviceName='");
                sbLIZ.append(this.LJ);
                sbLIZ.append("', osVersion='");
                sbLIZ.append((Object) this.LJFF);
                sbLIZ.append("', ssoEmail='");
                sbLIZ.append((Object) this.LJI);
                sbLIZ.append("', isBoe='");
                sbLIZ.append(this.LJII);
                sbLIZ.append("'}");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = strValueOf;
                this.LIZIZ = curUserId;
                this.LIZJ = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
                this.LIZLLL = str;
                this.LJ = strEncode;
                this.LJFF = str2;
                this.LJI = string;
                this.LJII = z;
            }
        };
    }

    public Context getContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    public InterfaceC816150Vzx getRouter() {
        return new AnyDoorRouterImpl();
    }

    public EnumC313280CPu getAppType() {
        return EnumC313280CPu.US;
    }
}
