package com.bytedance.android.livesdk.game.broadcast.highlight;

import X.C0IJT;
import X.C0UKZ;
import X.C1324720kZq;
import X.C1338270kvh;
import X.C20337914i1;
import X.C474500IjA;
import X.C5183020f;
import X.C786410Ut5;
import X.ViewOnClickListenerC512201z6;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewHighLightVideoWidget extends BannerWidget {
    public C1324720kZq LLJI;
    public boolean LLJIJIL;
    public GameLiveFragment LLJILJIL;
    public final String LLJILJILJ;

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        Map<String, Object> map = C1338270kvh.LIZ;
        C20337914i1<String> c20337914i1 = C0UKZ.LJLL;
        GameLiveFragment gameLiveFragment = this.LLJILJIL;
        c20337914i1.LJFF(gameLiveFragment != null ? gameLiveFragment.vid : null);
        String str = this.LLILZIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_highlight_guide_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return AnchorPreviewUniformStyleABSetting.INSTANCE.enable() ? R.layout.i17 : R.layout.i16;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        GameLiveFragment gameLiveFragment;
        Long l;
        Boolean bool = (Boolean) this.dataChannel.gg0(LiveAccessTipsShowChannel.class);
        boolean z = false;
        if (bool == null || !bool.booleanValue()) {
            String strLIZIZ = C0UKZ.LJLL.LIZIZ();
            if (this.LLJIJIL && (gameLiveFragment = this.LLJILJIL) != null && !TextUtils.isEmpty(gameLiveFragment.downloadUrl) && (l = gameLiveFragment.fragmentId) != null && l.longValue() != 0 && !TextUtils.isEmpty(gameLiveFragment.vid)) {
                GameLiveFragment gameLiveFragment2 = this.LLJILJIL;
                if (!Intrinsics.LJFF(gameLiveFragment2 != null ? gameLiveFragment2.vid : null, strLIZIZ) && Intrinsics.LJFF(C0UKZ.LJLJLLL.LIZIZ(), Boolean.TRUE)) {
                    z = true;
                }
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            if (z) {
                super.show();
            }
        }
    }

    public PreviewHighLightVideoWidget() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.gg0(PreviewPageSelectLiveMode.class);
        }
        this.LLILZLL = 5;
        this.LLIZ = true;
        this.LLJILJILJ = "highlight_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View viewFindViewById;
        super.E1();
        this.LLJI = (C1324720kZq) findViewById(R.id.lrv);
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable() && (viewFindViewById = findViewById(R.id.br9)) != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 32), viewFindViewById);
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 33), view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 110));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJILJILJ;
    }
}
