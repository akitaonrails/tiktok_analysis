package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C0C64;
import X.C0P4Y;
import X.C123100dR;
import X.C12ES;
import X.C1360520lVa;
import X.C1843500y4a;
import X.C19EG;
import X.C339190DRl;
import X.C452501pT;
import X.C522540KeS;
import X.C724240Sb0;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateBottomComponent extends ShootButtonBottomComponent {
    public static final /* synthetic */ int LLJJ = 0;
    public long LLILZLL;
    public TuxTextView LLIZ;
    public String LLJIJIL;
    public AnchorCommonStruct LLJILJILJ;
    public String LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 94));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 95));
    public String LLJI = "";
    public String LLJILJIL = "";

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do */
    public final int mo176do() {
        return 2131857993;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent, com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        Bundle arguments;
        super.onCreate();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (arguments = fragment.getArguments()) == null) {
            return;
        }
        this.LLILZLL = arguments.getLong("template_publish_count", 0L);
        arguments.getString("template_id", "");
        this.LLJI = arguments.getString("template_anchor_enter_from", "");
        this.LLJILJIL = arguments.getString("template_anchor_enter_method", "");
        this.LLJIJIL = arguments.getString("main_anchor_type");
        Serializable serializable = arguments.getSerializable("template_anchor");
        this.LLJILJILJ = serializable instanceof AnchorCommonStruct ? (AnchorCommonStruct) serializable : null;
        this.LLJILLL = arguments.getString("shoot_enter_from", "");
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C0P4Y(this, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void bo(View view) {
        AnchorCommonStruct anchorCommonStruct;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme awemeLJIIIIZZ;
        final C19EG c19egLIZ;
        final ITemplateAnchorStrategyService iTemplateAnchorStrategyService;
        final TemplateAnchorConfig templateAnchorConfigLIZLLL;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(C724240Sb0.LIZ(this), "pugc_template", true) || (anchorCommonStruct = this.LLJILJILJ) == null || (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLIZLLLIL.getValue()) == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) == null || (c19egLIZ = C724240Sb0.LIZ(this)) == null || (templateAnchorConfigLIZLLL = (iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) ServiceManager.get().getService(ITemplateAnchorStrategyService.class)).LIZLLL(anchorCommonStruct, awemeLJIIIIZZ, this.LLJI, this.LLJILJIL, "")) == null) {
            return;
        }
        templateAnchorConfigLIZLLL.setMainAnchorType(this.LLJIJIL);
        templateAnchorConfigLIZLLL.setFollowedTemplateType(anchorCommonStruct.subType());
        if (C123100dR.LIZ(this.LLJILLL)) {
            templateAnchorConfigLIZLLL.setShootEnterFrom(this.LLJILLL);
        }
        ITemplateConsumeService iTemplateConsumeService = C522540KeS.LIZ;
        if (iTemplateConsumeService != null && iTemplateConsumeService.LJFF(4, null, templateAnchorConfigLIZLLL, null)) {
            iTemplateAnchorStrategyService.LIZ(c19egLIZ, templateAnchorConfigLIZLLL, true);
        } else {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("pugc_template", new SimpleServiceLoadCallback() { // from class: X.0OlJ
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
                    C19EG c19eg = c19egLIZ;
                    TemplateAnchorConfig templateAnchorConfig = templateAnchorConfigLIZLLL;
                    iRecordServiceRecordService.checkPUGCI2VQuota(c19eg, templateAnchorConfig, new AwS218S0300000_9(c19eg, iTemplateAnchorStrategyService, templateAnchorConfig, 3));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View ko(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bku, viewGroup, false);
        this.LLIZ = (TuxTextView) viewTd.findViewById(R.id.xio);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_tdp_large_use_btn", true, false)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C12ES.LJIIJ(getContext()) - ((int) C339190DRl.LIZ(24)), (int) C339190DRl.LIZ(38));
            layoutParams.bottomMargin = (int) C339190DRl.LIZ(5);
            layoutParams.topMargin = (int) C339190DRl.LIZ(4);
            C786410Ut5.W5(viewTd.findViewById(R.id.cbx), layoutParams);
            TuxTextView tuxTextView = this.LLIZ;
            if (tuxTextView != null) {
                C339190DRl.LIZIZ(tuxTextView);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLIZ;
            if (tuxTextView2 != null) {
                String strLIZIZ = C1843500y4a.LIZIZ(this.LLILZLL);
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) viewGroup.getResources().getQuantityString(2131755168, (int) this.LLILZLL, strLIZIZ));
                tuxTextView2.setText(c1360520lVa.LIZ);
                return viewTd;
            }
        }
        return viewTd;
    }
}
