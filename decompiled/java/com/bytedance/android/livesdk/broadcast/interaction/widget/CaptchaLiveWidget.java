package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C0IJT;
import X.C162100jj;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5183020f;
import X.CountDownTimerC511401yy;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class CaptchaLiveWidget extends LiveWidget {
    public final View LL;
    public long LLILLJJLI;
    public CountDownTimerC511401yy LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxs;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C500260Jjc.LJIILLIIL(this.LL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        Room roomLIZ = C162100jj.LIZ(this.dataChannel);
        this.LLILLJJLI = roomLIZ != null ? roomLIZ.getCreateTime() : 0L;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(CaptchaLivePauseTimeChannel.class, this, new C5183020f(this, 85));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C500260Jjc.LLFFF(this.LL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_popup_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        Room roomLIZ = C162100jj.LIZ(this.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - (roomLIZ != null ? roomLIZ.getCreateTime() : 0L)), "duration_after_live_take");
        c474500IjALIZ.LIZ();
    }

    public CaptchaLiveWidget(View view) {
        this.LL = view;
    }
}
