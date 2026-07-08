package com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic;

import X.C0IJT;
import X.C0UV3;
import X.C1161920gLG;
import X.C474500IjA;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MuteMicViewStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MuteMicWidget extends LiveWidget {
    public int LL;
    public int LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0l;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C0UV3 c0uv3;
        super.onCreate();
        View view = getView();
        if ((view instanceof C0UV3) && (c0uv3 = (C0UV3) view) != null) {
            c0uv3.setClickAction(new AwS556S0100000_12(this, 168));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MuteMicChannel.class, new AwS591S0100000_12(this, 217));
            dataChannel.BQ2(this, PauseLiveChannel.class, new AwS591S0100000_12(this, 218));
            dataChannel.BQ2(this, MuteMicViewStateChangeEvent.class, new AwS591S0100000_12(this, 219));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        DataChannel dataChannel = this.dataChannel;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_mute_quick_button_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), Scene.SCENE_SERVICE);
        c474500IjALIZ.LIZ();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS591S0100000_12(this, 220));
        }
    }
}
