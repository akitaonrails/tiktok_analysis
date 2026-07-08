package com.ss.android.ugc.aweme.detail.panel;

import X.C1324840ka2;
import X.C20684815ws;
import X.C21459218yU;
import X.C2344009Gk;
import X.C342770DcB;
import X.C535390KzB;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class AimeFeedPanel extends StickerFeedPanel {
    public final String O0;
    public final String P0;
    public final String Q0;
    public final String R0;
    public final String S0;
    public final String T0;

    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return 2131825938;
    }

    public AimeFeedPanel(Bundle bundle) {
        super(bundle);
        this.O0 = bundle.getString("extra_aime_sytle_id", "");
        this.P0 = bundle.getString("AIME_DETAIL_STYLE_IMAGE");
        this.Q0 = bundle.getString("AIME_DETAIL_STYLE_NAME");
        String string = bundle.getString("resource_id");
        this.R0 = string == null ? "" : string;
        this.S0 = bundle.getString("extra_aime_root_style_id", "");
        this.T0 = bundle.getString("enter_from", "");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
        IAIMEServices iAIMEServices;
        String str = this.O0;
        if (str != null) {
            Bundle arguments = getFragment().getArguments();
            if (arguments != null) {
                C786410Ut5.LJJJI("enter_from", "style_page_feed", arguments);
            }
            Bundle arguments2 = getFragment().getArguments();
            if (arguments2 != null) {
                C786410Ut5.LJJJI("shoot_way", "style_page", arguments2);
            }
            if (C535390KzB.LIZ()) {
                if (C342770DcB.LIZ()) {
                    iAIMEServices = (IAIMEServices) PluggableExtentionKt.pluggableSpi$default(IAIMEServices.class, false, false, false, 14, null);
                } else {
                    iAIMEServices = (IAIMEServices) ServiceManager.get().getService(IAIMEServices.class);
                }
                if (iAIMEServices != null) {
                    iAIMEServices.LJIILLIIL(getFragment(), str, this.S0, "style_page_feed", "style_page_feed", "style_page_feed", this.R0);
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.T0);
            c2344009Gk.LJIIIIZZ("root_style_id", this.S0);
            c2344009Gk.LJIIIIZZ("style_id", this.O0);
            c2344009Gk.LIZJ(2, "is_customize");
            C20684815ws.LJIILLIIL("try_style_click", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        View viewM0 = super.M0(relativeLayout);
        String str = this.P0;
        if (str != null) {
            C1324840ka2.LJIIJ((RemoteImageView) viewM0.findViewById(R.id.w62), str, -1, -1);
        }
        String str2 = this.Q0;
        if (str2 != null) {
            C21459218yU c21459218yU = (C21459218yU) viewM0.findViewById(R.id.hu1);
            c21459218yU.setTuxFont(42);
            N0(c21459218yU, str2);
        }
        C786410Ut5.LLLLLLZZ((TuxIconView) viewM0.findViewById(R.id.syy), 8);
        return viewM0;
    }
}
