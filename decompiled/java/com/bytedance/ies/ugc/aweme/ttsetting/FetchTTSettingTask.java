package com.bytedance.ies.ugc.aweme.ttsetting;

import X.C0CCZ;
import X.C0VZ0;
import X.C0XPR;
import X.C259800zU;
import X.C854750Xg1;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class FetchTTSettingTask implements C0CCZ {
    public final String LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchTTSettingTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public FetchTTSettingTask(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (System.currentTimeMillis() - Keva.getRepo("TTSettingData").getLong("last_get_setting_time", 0L) > TimeUnit.HOURS.toMillis(6L)) {
            C0XPR c0xpr = C0XPR.LIZ;
            String str = this.LL;
            c0xpr.getClass();
            IRetrofit iRetrofitCreateNewRetrofit = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            ((TTSettingDataApi$SettingApi) iRetrofitCreateNewRetrofit.create(TTSettingDataApi$SettingApi.class)).getResponse(!TextUtils.isEmpty(Keva.getRepo("TTSettingData").getString("settingData", "")), 1, 1).enqueue(new C854750Xg1(c259800zU, 0));
            return;
        }
        C0XPR.LIZ.getClass();
        C0XPR.LIZ();
    }
}
