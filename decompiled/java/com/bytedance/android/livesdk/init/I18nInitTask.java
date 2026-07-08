package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C011Z;
import X.C1119850fFP;
import X.C1124870fNV;
import X.C1161920gLG;
import X.C497740JfY;
import X.C517110KPt;
import X.C783420UoG;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class I18nInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "i18n_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        Locale localeCurrentLocale = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale();
        C1124870fNV.LIZJ().getClass();
        C1124870fNV.LJFF(0, localeCurrentLocale);
        if (C497740JfY.LJJ() && LiveServiceManagerOptSetting.enable()) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).onLocaleChanged(localeCurrentLocale);
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).onLocaleChanged(localeCurrentLocale);
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
            C517110KPt.LJIIIIZZ();
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).onLocaleChanged(localeCurrentLocale);
        }
        C1119850fFP c1119850fFP = C011Z.LIZ;
        C783420UoG c783420UoG = new C783420UoG();
        c1119850fFP.getClass();
        C1119850fFP.LJJIFFI(R.drawable.evh, c783420UoG);
    }
}
