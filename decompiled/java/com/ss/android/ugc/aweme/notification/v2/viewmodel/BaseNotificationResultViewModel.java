package com.ss.android.ugc.aweme.notification.v2.viewmodel;

import X.C0Z9X;
import X.C1336205Ku;
import X.C1900430zYP;
import X.C1900540zYa;
import X.C1901580zaG;
import X.C1903780zdo;
import X.C1904270zeb;
import X.EnumC1599580rjA;
import X.EnumC624380OeK;
import X.EnumC895080Z9m;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseNotificationResultViewModel extends AssemViewModel<C1900430zYP> {
    public boolean LL;

    public abstract void AQ2();

    public abstract void BQ2(EnumC1599580rjA enumC1599580rjA);

    public final void wQ2() {
        C1336205Ku.LIZ(false).getImNudgeAnalytics().LIZIZ(EnumC895080Z9m.NOTICE);
        ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIZILJ("tag_activity_aggregated_page").LIZ();
    }

    public abstract C1900540zYa xQ2();

    public abstract List<InterfaceC1891350zJl> yQ2();

    public abstract List<MusNotice> zQ2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1900430zYP(0);
    }

    public final void vQ2(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            if (i2 == C1904270zeb.LIZJ) {
                C1903780zdo.LIZ(EnumC624380OeK.Normal, 13, LSPassThroughRecordSizeConfig.DEFAULT, C1904270zeb.LIZJ, C1904270zeb.LIZ, C1904270zeb.LIZLLL, 84, C1904270zeb.LIZIZ);
            } else {
                C1903780zdo.LIZ(EnumC624380OeK.Normal, i2);
            }
        } else {
            C1903780zdo.LJII().LJJIFFI(EnumC624380OeK.Normal, new int[]{i});
        }
        C1901580zaG.LIZ.getClass();
        C1901580zaG.LJIIJ();
        C1903780zdo.LIZIZ(new EntranceKey(1, null));
    }
}
