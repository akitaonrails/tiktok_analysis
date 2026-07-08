package com.ss.android.ugc.aweme.detail.component.biz.creativetools;

import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C0P4Y;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C189200o6;
import X.C19EG;
import X.C418440Gaw;
import X.C424560Gko;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CreativeToolCommonBottomComponent extends ShootButtonBottomComponent {
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public UrlModel LLJIJIL;
    public ViewGroup LLJILJILJ;
    public TuxTextView LLJILLL;
    public ViewGroup LLJJ;
    public TuxTextView LLJJI;
    public View LLJJIII;
    public C424560Gko LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 96));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 97));
    public String LLJILJIL = "";

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do */
    public final int mo176do() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void ho(ViewGroup viewGroup) {
    }

    public abstract void mo();

    public abstract int oo(boolean z);

    public abstract void so(Aweme aweme);

    public abstract void uo(C19EG c19eg, Aweme aweme, String str, String str2);

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent, com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        Bundle arguments;
        super.onCreate();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (arguments = fragment.getArguments()) == null) {
            return;
        }
        arguments.getLong("extra_creative_tool_publish_count", 0L);
        this.LLIZLLLIL = arguments.getString("extra_creative_tool_id", "");
        arguments.getString("extra_creative_tool_original_aweme_id", "");
        this.LLJI = arguments.getString("extra_creative_tool_name", "");
        Serializable serializable = arguments.getSerializable("extra_creative_tool_cover");
        this.LLJIJIL = serializable instanceof UrlModel ? (UrlModel) serializable : null;
        this.LLJ = arguments.getString("extra_creative_tool_extra", "");
        this.LLJILJIL = arguments.getString("extra_creative_tool_enter_from", "");
        arguments.getString("template_anchor_enter_method", "");
        arguments.getString("main_anchor_type");
        arguments.getString("shoot_enter_from", "");
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLIZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C0P4Y(this, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void bo(View view) {
        String str;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme awemeLJIIIIZZ;
        C19EG c19egLIZ;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(C724240Sb0.LIZ(this), this.LLJILJIL, true) || (str = this.LLIZLLLIL) == null || (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILZLL.getValue()) == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) == null || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        uo(c19egLIZ, awemeLJIIIIZZ, str, this.LLJ);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View ko(ViewGroup viewGroup) {
        List<String> urlList;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bkm, viewGroup, false);
        this.LLJILJILJ = (ViewGroup) viewTd.findViewById(R.id.cdc);
        this.LLJILLL = (TuxTextView) viewTd.findViewById(R.id.cdd);
        this.LLJJ = (ViewGroup) viewTd.findViewById(R.id.cf6);
        C424560Gko c424560Gko = (C424560Gko) viewTd.findViewById(R.id.cf7);
        this.LLJJIJI = c424560Gko;
        if (c424560Gko != null) {
            c424560Gko.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f))));
        }
        this.LLJJIJIIJIL = (TuxTextView) viewTd.findViewById(R.id.cf_);
        this.LLJJIII = viewTd.findViewById(R.id.cf9);
        this.LLJJI = (TuxTextView) viewTd.findViewById(R.id.cf8);
        ViewGroup viewGroup2 = this.LLJILJILJ;
        if (viewGroup2 != null) {
            C786410Ut5.I7(new AkS81S0100000_9(this, 0), viewGroup2);
        }
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.I7(new AkS81S0100000_9(this, 1), view);
        }
        try {
            UrlModel urlModel = this.LLJIJIL;
            if (urlModel != null) {
                urlList = urlModel.getUrlList();
            } else {
                urlList = null;
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList));
            c1331670kl3LJIIJ.LJJ(this.LLJJIJI);
            C786410Ut5.h3(c1331670kl3LJIIJ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        TuxTextView tuxTextView = this.LLJJIJIIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(this.LLJI);
        }
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(viewTd.getContext().getString(oo(true)));
        }
        TuxTextView tuxTextView3 = this.LLJJI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(viewTd.getContext().getString(oo(false)));
        }
        return viewTd;
    }
}
