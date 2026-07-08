package com.bytedance.android.livesdk.toolbar;

import X.EnumC1088870eRR;
import X.EnumC1088900eRU;
import X.EnumC1102750enp;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LandscapeAudienceToolbarWidget extends LiveAudienceToolbarWidget {
    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hsz;
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget
    public final EnumC1088900eRU y1(boolean z) {
        return EnumC1088900eRU.ICON_LAND;
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget
    public final void x1(List<EnumC1102750enp> list, EnumC1088900eRU enumC1088900eRU) {
        if (list != null && enumC1088900eRU != null) {
            EnumC1088870eRR.RIGHT.createHolder(this.dataChannel, (ViewGroup) getView(), list, enumC1088900eRU);
        }
    }
}
