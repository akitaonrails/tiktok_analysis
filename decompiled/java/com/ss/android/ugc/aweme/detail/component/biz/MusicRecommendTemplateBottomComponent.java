package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C12ES;
import X.C1394390mOD;
import X.C1402130mah;
import X.C19EG;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicRecommendTemplateBottomComponent extends ShootButtonBottomComponent {
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 526));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 527));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 525));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do */
    public final int mo176do() {
        return 2131829785;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLIZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1402130mah(this, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void bo(View view) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme awemeLJIIIIZZ;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(C724240Sb0.LIZ(this), "pugc_template", true) && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILZLL.getValue()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
            C1394390mOD c1394390mOD = C1394390mOD.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            MDPRecommendTemplateInfo mDPRecommendTemplateInfo = (MDPRecommendTemplateInfo) this.LLIZLLLIL.getValue();
            c1394390mOD.getClass();
            C1394390mOD.LIZ(awemeLJIIIIZZ, c19egLIZ, "asset_card", "click", mDPRecommendTemplateInfo);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void fo(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int iLJIIJ = C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(24.0f, getContext()));
        View view2 = this.LLILZ;
        if (view2 != null && (layoutParams2 = view2.getLayoutParams()) != null) {
            layoutParams2.width = iLJIIJ;
        }
        View view3 = this.LLILZ;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
            layoutParams.height = (int) C12ES.LIZJ(38.0f, getContext());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View ko(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bks, viewGroup, false);
    }
}
