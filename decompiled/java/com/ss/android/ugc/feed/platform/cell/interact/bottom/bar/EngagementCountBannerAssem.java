package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C722170SUl;
import X.C722420SVk;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class EngagementCountBannerAssem extends BaseCellSlotComponent<EngagementCountBannerAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb0;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ViewGroup viewGroup;
        if (ComplianceServiceProvider.LJIIJJI().LJIILJJIL()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_engagement_count_banner_android", false)) {
                View contentView = getContentView();
                if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
                C722170SUl c722170SUlLJI = ((ITUCBizService) ServiceManager.get().getService(ITUCBizService.class)).LJI(getContentView().getContext());
                c722170SUlLJI.LIZIZ = getContentView();
                C722420SVk.LIZ(C722420SVk.LIZ, c722170SUlLJI, getContentView());
                C786410Ut5.LJLLLLLL(0, getContentView());
                return;
            }
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
    }
}
