package com.ss.android.ugc.aweme.feed.adapter.widget.group;

import X.C1161920gLG;
import X.C176600m4;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.checkalive.LiveCheckAliveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.enterroom.LivePreviewEnterRoomBoostWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.enterroom.LivePreviewEnterRoomBoostWidgetV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreviewNoInteractLayerWidget extends LiveWatchPreviewWidget {
    public final View LLJ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public LivePreviewNoInteractLayerWidget(View view) {
        this.LLJ = view;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        enablePreviewSubWidgetManager();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean boolValueOf;
        super.onLoad(objArr);
        this.subWidgetManager.createWidget(findViewById(R.id.view_rootview), new LiveCheckAliveWidget());
        IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
        if (iHostWatch != null) {
            boolValueOf = Boolean.valueOf(iHostWatch.getEnterRoomBoostEnable());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            this.subWidgetManager.createWidget(findViewById(R.id.view_rootview), new LivePreviewEnterRoomBoostWidget());
        }
        if (LiveEnterRoomUpdateSetting.INSTANCE.isEnable()) {
            this.subWidgetManager.createWidget(findViewById(R.id.view_rootview), new LivePreviewEnterRoomBoostWidgetV2());
        }
    }
}
