package com.ss.android.ugc.aweme.creatorcenter;

import X.C01GW;
import X.C0C64;
import X.C0TGX;
import X.C1915310zwP;
import X.C1915320zwQ;
import X.C20684815ws;
import X.C312560CNa;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes29.dex */
public final class StudioAppPromoteServiceImpl implements IStudioAppPromoteService {
    public final int LIZ = 3;

    @Override // com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService
    public final boolean LIZIZ() {
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "show_studio_profile_banner", true, false);
        C312560CNa.LIZ.getClass();
        C01GW c01gw = C312560CNa.LIZIZ;
        return zLJIIIZ && !((Keva) c01gw.getValue()).getBoolean("key_has_click_or_close_action", false) && ((Keva) c01gw.getValue()).getInt("key_cancel_profile_guide_time", 0) < this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService
    public final void LIZ(Context context) {
        SmartRouter.buildRoute(context, C1915320zwQ.LIZ.actionLink).open();
    }

    @Override // com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService
    public final void LIZJ(ViewGroup viewGroup, C0TGX c0tgx) {
        PopupManager.LJIJI(new C1915310zwP(viewGroup, c0tgx), true);
        C20684815ws.onEventV3("tiktok_studio_promotion_profile_banner_show");
    }
}
