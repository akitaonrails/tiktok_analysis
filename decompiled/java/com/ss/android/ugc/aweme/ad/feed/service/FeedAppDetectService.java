package com.ss.android.ugc.aweme.ad.feed.service;

import X.C01GW;
import X.C098200Yq;
import X.C0CCZ;
import X.C0WZX;
import X.C1191904lR;
import X.C1697810uHb;
import X.C1720106oR;
import X.C189200o6;
import X.C1BWL;
import X.C2162308dZ;
import X.C2187211Ait;
import X.C2187221Aiu;
import X.C2187231Aiv;
import X.C2187271Aiz;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C257200A6c;
import X.C452501pT;
import X.C703302op;
import X.EnumC452301pR;
import android.content.Intent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.experiment.AppInfo;
import com.ss.android.ugc.aweme.ad.feed.experiment.ImaAdsDetectAppConfigModel;
import com.ss.android.ugc.aweme.ad.feed.model.AppAdsDetectAppModel;
import com.ss.android.ugc.aweme.ad.feed.task.AppAdsDetectAppTask;
import com.ss.android.ugc.aweme.ad.feed.task.LeadAdsDetectAppTask;
import com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig;
import com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class FeedAppDetectService implements IFeedAppDetectService {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1191904lR());
    public volatile long LIZIZ = -1;

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService
    public final List<C0CCZ> LIZIZ() {
        return C1697810uHb.LJIIJJI(new LeadAdsDetectAppTask(), new AppAdsDetectAppTask());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService
    public final void LIZ() {
        C2187221Aiu.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService
    public final AppAdsDetectAppModel LIZJ() {
        AppAdsDetectAppModel appAdsDetectAppModel;
        if (((Boolean) C2187271Aiz.LIZJ.getValue()).booleanValue() && (appAdsDetectAppModel = C2187231Aiv.LIZIZ) != null) {
            Long l = ((AppAdsDetectAppConfig) C2187271Aiz.LIZIZ.getValue())._dataExpirationDuration;
            long jLongValue = l != null ? l.longValue() : 604800000L;
            Long l2 = appAdsDetectAppModel.timeStamp;
            if (l2 != null) {
                if (Math.abs(System.currentTimeMillis() - l2.longValue()) <= jLongValue) {
                    return appAdsDetectAppModel;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService
    public final void LJ() {
        Object c098200Yq;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("FeedAppDetectService", "detectApp");
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ImaAdsDetectAppConfigModel imaAdsDetectAppConfigModel = C2187211Ait.LIZ;
        ImaAdsDetectAppConfigModel imaAdsDetectAppConfigModel2 = (ImaAdsDetectAppConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ima_ads_detect_app_config", ImaAdsDetectAppConfigModel.class, imaAdsDetectAppConfigModel);
        if (imaAdsDetectAppConfigModel2 != null) {
            imaAdsDetectAppConfigModel = imaAdsDetectAppConfigModel2;
        }
        if (imaAdsDetectAppConfigModel.appList.isEmpty()) {
            this.LIZIZ = -1L;
            return;
        }
        if (this.LIZIZ == -1) {
            this.LIZIZ = ((Keva) this.LIZ.getValue()).getLong("app_status", -1L);
        }
        long j = 0;
        long j2 = ((Keva) this.LIZ.getValue()).getLong("last_detect_app_status_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ == -1 || jCurrentTimeMillis - j2 >= imaAdsDetectAppConfigModel.detectIntervalsMs) {
            ((Keva) this.LIZ.getValue()).storeLong("last_detect_app_status_time", jCurrentTimeMillis);
            for (AppInfo appInfo : imaAdsDetectAppConfigModel.appList) {
                if (((Number) C257200A6c.LIZ.getValue()).intValue() == 1) {
                    String str = appInfo.packageName;
                    if (C703302op.LIZ(str) && C2162308dZ.LJFF(C1BWL.LIZ(), str)) {
                        j |= 1 << appInfo.index;
                    }
                } else if (C703302op.LIZ(appInfo.url)) {
                    String str2 = appInfo.url;
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(UriProtector.parse(str2));
                        c098200Yq = Boolean.valueOf(!C2204961BRm.LJJJJZ(C1BWL.LIZ().getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLZnL2TZRf0wHVqumacC2tQDqRQauTGoL4Atnbg2UieikWA==", null)).isEmpty());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = bool;
                    }
                    if (((Boolean) c098200Yq).booleanValue()) {
                        j |= 1 << appInfo.index;
                    }
                }
            }
            this.LIZIZ = j;
            ((Keva) this.LIZ.getValue()).storeLong("app_status", this.LIZIZ);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("detectApp finish, new status:");
            sbLIZ.append(this.LIZIZ);
            C1720106oR.LJI("FeedAppDetectService", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService
    public final long LIZLLL() {
        return this.LIZIZ;
    }
}
