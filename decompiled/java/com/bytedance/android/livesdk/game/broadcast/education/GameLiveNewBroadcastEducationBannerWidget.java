package com.bytedance.android.livesdk.game.broadcast.education;

import X.C018R;
import X.C018T;
import X.C0IJT;
import X.C1338270kvh;
import X.C474500IjA;
import X.C497740JfY;
import X.C5183020f;
import X.C786410Ut5;
import X.InterfaceC772390URp;
import X.ViewOnClickListenerC512201z6;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.live.broadcast.model.GameLiveInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GameLiveNewBroadcastEducationBannerWidget extends BannerWidget {
    public boolean LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        C018T c018t = C018T.Banner;
        String str = this.LLILZIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_guide_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJII(c018t.getValue(), "event_page");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LLJIJIL ? R.layout.hz4 : R.layout.hz3;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        GameLiveInfo gameLiveInfo;
        DataChannel dataChannel = this.dataChannel;
        RoomCreateInfo roomCreateInfo = dataChannel != null ? (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class) : null;
        boolean z = (roomCreateInfo == null || (gameLiveInfo = roomCreateInfo.gameLiveInfo) == null) ? true : gameLiveInfo.hasGameLive;
        Boolean boolLIZ = InterfaceC772390URp.L.LIZ();
        boolean zBooleanValue = boolLIZ != null ? boolLIZ.booleanValue() : false;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (z || zBooleanValue) {
            return;
        }
        super.show();
    }

    public GameLiveNewBroadcastEducationBannerWidget() {
        this.LLILZLL = 3;
        this.LLJIJIL = AnchorPreviewUniformStyleABSetting.INSTANCE.enable();
        this.LLJILJIL = "game_live_new_broadcast_education_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        C018R c018r;
        super.E1();
        if (this.LLJIJIL) {
            KeyEvent.Callback view = getView();
            if ((view instanceof C018R) && (c018r = (C018R) view) != null) {
                c018r.setTitle(C497740JfY.LJIJI(2131841800));
                c018r.setRightIcon(true);
                c018r.setLeftIconRes(R.drawable.elr);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 31), view2);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 109));
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJILJIL;
    }
}
