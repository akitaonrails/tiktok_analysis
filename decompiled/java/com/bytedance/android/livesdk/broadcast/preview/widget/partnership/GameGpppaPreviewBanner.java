package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C0IJT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5183020f;
import X.C760180Trs;
import X.C786410Ut5;
import X.InterfaceC772390URp;
import X.ViewOnClickListenerC512201z6;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.PartnershipGpppaBanInfoChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class GameGpppaPreviewBanner extends BannerWidget {
    public TextView LLJI;
    public final String LLJIJIL = "game_gpppa_ban_banner";
    public boolean LLJILJIL;

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        InterfaceC772390URp.Q.LIZJ(Boolean.TRUE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("game_gpppa_ban_text_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (this.LLJILJIL) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View view;
        View viewFindViewById;
        super.E1();
        hide();
        View view2 = getView();
        this.LLJI = view2 != null ? (TextView) view2.findViewById(R.id.br1) : null;
        View view3 = getView();
        if (view3 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 28), view3);
        }
        if (C760180Trs.LJI() && (view = getView()) != null && (viewFindViewById = view.findViewById(R.id.tld)) != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 29), viewFindViewById);
        }
        if (C500260Jjc.LJJJI(InterfaceC772390URp.Q.LIZ())) {
            return;
        }
        this.dataChannel.EQ2(this, PartnershipGpppaBanInfoChannel.class, new C5183020f(this, 98));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C760180Trs.LJI() ? R.layout.hz0 : R.layout.hyz;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJIJIL;
    }
}
