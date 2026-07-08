package com.ss.android.ugc.aweme.services;

import X.C844470XAv;
import X.InterfaceC810020Vq4;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;

/* JADX INFO: loaded from: classes14.dex */
public class MainServiceForPush implements InterfaceC810020Vq4 {
    public String filterUrl(Context context, String str) {
        return str;
    }

    @Override // X.InterfaceC810020Vq4
    public String getDefaultUninstallQuestionUrl() {
        Uri uriBuild = UriProtector.parse("https://www.tiktokv.com/aweme/i18n/uninstall/");
        try {
            Uri.Builder builderBuildUpon = uriBuild.buildUpon();
            C844470XAv.LIZ.getClass();
            uriBuild = builderBuildUpon.appendQueryParameter("app_id", String.valueOf(C844470XAv.LJIIJ)).appendQueryParameter("device_type", Build.MODEL).appendQueryParameter("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()).appendQueryParameter("language", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getSysLanguage()).build();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return uriBuild.toString();
    }
}
