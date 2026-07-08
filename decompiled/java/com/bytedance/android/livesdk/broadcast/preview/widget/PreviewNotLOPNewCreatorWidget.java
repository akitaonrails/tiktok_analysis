package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C13LE;
import X.C474500IjA;
import X.C5183020f;
import X.C770220UJg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.NewAnchorIncentiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewNotLOPNewCreatorWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hho;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(NewAnchorIncentiveChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(NewAnchorIncentiveChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 92));
        }
    }

    public final void G1(String str, Map<String, String> map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII("live_take_page", "banner_page");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJIJL();
    }

    public final void H1(String str, String str2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_banner_send");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII("live_take_page", "banner_page");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "is_send");
        c474500IjALIZ.LJJII(str2, "not_send_reason");
        c474500IjALIZ.LJJIJL();
    }
}
