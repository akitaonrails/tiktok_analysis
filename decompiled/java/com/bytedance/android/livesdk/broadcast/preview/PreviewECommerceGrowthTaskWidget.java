package com.bytedance.android.livesdk.broadcast.preview;

import X.C0IJT;
import X.C0UKZ;
import X.C13LE;
import X.C20337914i1;
import X.C474500IjA;
import X.C5183020f;
import X.C770220UJg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.ECommerceGrowthTaskChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewECommerceGrowthTaskWidget extends PreviewWidget {
    public boolean LLILZ;
    public String LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hhc;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("ecom_anchor_growth", "component_name");
        c474500IjALIZ.LJJII("banner", "component_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(ECommerceGrowthTaskChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (!this.LLILZ) {
            this.LLILZ = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("ecom_anchor_growth", "component_name");
            c474500IjALIZ.LJJII("banner", "component_type");
            c474500IjALIZ.LIZ();
            String str = this.LLILZIL;
            if (str != null) {
                C20337914i1<Map<String, Integer>> c20337914i1 = C0UKZ.LLIZ;
                Map<String, Integer> mapLIZIZ = c20337914i1.LIZIZ();
                Integer num = mapLIZIZ.get(str);
                mapLIZIZ.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                c20337914i1.LJFF(mapLIZIZ);
            }
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(ECommerceGrowthTaskChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 86));
        }
    }
}
