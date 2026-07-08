package com.bytedance.android.livesdk.broadcast.preview;

import X.C0IJT;
import X.C0UQN;
import X.C0WZX;
import X.C16F5;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C474500IjA;
import X.C500260Jjc;
import X.C781270Ukn;
import X.C814420VxA;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.common.applog.AppLog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS373S0200000_7;

/* JADX INFO: loaded from: classes8.dex */
public class PreviewPhoneCameraWidget extends PreviewToolBaseWidget {
    public final int LLILZLL = 2131853617;
    public final int LLIZ = R.raw.icon_desktop_computer_phone;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        ImageView imageView;
        super.E1();
        View view = getView();
        C16F5 c16f5 = view != null ? (C16F5) view.findViewById(R.id.widget_text) : null;
        View view2 = getView();
        if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.widget_icon)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_desktop_computer_phone;
            c419910GdJ.LJ = Integer.valueOf(R.attr.exp);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            imageView.setImageDrawable(c419910GdJ.LIZ(this.context));
        }
        this.dataChannel.EQ2(this, LiveModeChannel.class, new AwS373S0200000_7(this, c16f5, 2));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        Context context;
        C19EG c19egLJ;
        String str;
        String str2;
        if (C0UQN.LIZIZ() && (context = this.context) != null && (c19egLJ = C500260Jjc.LJ(context)) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_entrance_click");
            LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
            if (liveMode != null) {
                str = liveMode.logStreamingType;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJII(str, "live_type");
            c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
            c474500IjALIZ.LIZ();
            Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(c19egLJ, 6);
            LiveMode liveMode2 = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
            if (liveMode2 != null) {
                str2 = liveMode2.logStreamingType;
            } else {
                str2 = null;
            }
            intentCreateStartBroadcastIntent.putExtra("enter_from", str2);
            Context context2 = this.context;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intentCreateStartBroadcastIntent, "Context_startActivity_1");
            C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context2);
            C2204961BRm.LJJJJJL(context2, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft6PXzi9fWG4+KpZV7WFw2MviKtulmNWOX", null));
        }
    }
}
