package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C452501pT;
import X.C724240Sb0;
import X.C786130Usd;
import X.InterfaceC586170Myt;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFeedRecommendInfoDebugService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedRecommendInfoComponent extends UIContentAssem {
    public Aweme LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 645));

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C724240Sb0.LIZ(this) != null && view.findViewById(R.id.huk) != null) {
            ((IFeedRecommendInfoDebugService) ServiceManager.get().getService(IFeedRecommendInfoDebugService.class)).LIZIZ();
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C786130Usd(this, 2));
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.0TJe
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z && i == 2) {
                    ((IFeedRecommendInfoDebugService) ServiceManager.get().getService(IFeedRecommendInfoDebugService.class)).LIZ();
                }
            }
        });
    }
}
