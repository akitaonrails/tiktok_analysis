package com.ss.android.ugc.aweme.detail.panel;

import X.C0OBG;
import X.C1050610dRj;
import X.C1402090mad;
import X.C2189821An6;
import X.C686150Qvl;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class CreativeHubPanel extends ShootFeedPanel {
    public final int G0;
    public final String H0;
    public final String I0;
    public final String J0;
    public TuxTextView K0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        int i = this.G0;
        if (i == 1 || i == 2) {
            return 2131830454;
        }
        if (i != 3) {
            return i == 4 ? 2131857990 : 2131830454;
        }
        return 2131830453;
    }

    public CreativeHubPanel(C2189821An6 c2189821An6) {
        this.G0 = c2189821An6.getCreativeHubType();
        this.H0 = c2189821An6.getCreativeHubText();
        this.I0 = c2189821An6.getCreativeHubOpenRecordId();
        String eventType = c2189821An6.getEventType();
        this.J0 = eventType == null ? "cvh" : eventType;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
        if (view == null || C0OBG.LIZIZ(view)) {
            return;
        }
        int i = this.G0;
        if (i != 3) {
            if (i != 4) {
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.enterFrom(this.J0);
                builder.shootWay(this.J0);
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(this.activity, this.J0, new C1402090mad(this, builder, 1));
            } else {
                String str = this.I0;
                if (str != null && str.length() != 0) {
                    C686150Qvl c686150Qvl = new C686150Qvl("aweme://openShoot");
                    c686150Qvl.LIZIZ("type", "use_music");
                    c686150Qvl.LIZIZ("music_id", this.I0);
                    c686150Qvl.LIZIZ("enter_from", this.J0);
                    c686150Qvl.LIZIZ("shoot_way", "direct_shoot");
                    SmartRouter.buildRoute(getContext(), c686150Qvl.LIZJ()).open();
                } else {
                    return;
                }
            }
        } else {
            String str2 = this.I0;
            if (str2 != null && str2.length() != 0) {
                C686150Qvl c686150Qvl2 = new C686150Qvl("aweme://openShoot");
                c686150Qvl2.LIZIZ("type", "use_challenge");
                c686150Qvl2.LIZIZ("challenge_id", this.I0);
                c686150Qvl2.LIZIZ("enter_from", this.J0);
                c686150Qvl2.LIZIZ("shoot_way", "direct_shoot");
                SmartRouter.buildRoute(getContext(), c686150Qvl2.LIZJ()).open();
            } else {
                return;
            }
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        c1050610dRj.LIZ(Integer.valueOf(this.G0), "enter_from");
        c1050610dRj.LJII("cvh_shoot", new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bkw, relativeLayout, false);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.f7s);
        this.K0 = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.K0;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.H0);
        }
        String str = this.H0;
        if (str == null || str.length() == 0) {
            TuxTextView tuxTextView3 = this.K0;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            ViewGroup.LayoutParams layoutParams = viewTd.findViewById(R.id.cbx).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
        }
        return viewTd;
    }
}
