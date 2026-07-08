package com.bytedance.android.livesdk.billboard.broadcast;

import X.C1085270eLd;
import X.C2188811AlT;
import X.C781520UlC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBroadcastBillboardWidget extends LiveWidget {
    public boolean LL;
    public boolean LLILLJJLI;
    public final C1085270eLd LLILLL = new C1085270eLd(new AwS561S0100000_17(this, 103), false);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        this.LLILLL.getClass();
        return R.layout.g0x;
    }

    public final boolean x1() {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room == null || !C781520UlC.LJFF(room)) {
            return this.LL || this.LLILLJJLI;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLL.LJI();
        this.dataChannel.EQ2(this, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 87));
        this.dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 88));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!x1()) {
            super.show();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveBroadcastBillboardWidget#show: return isMultiGuest=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" isCoHost=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" isLiveVoice=");
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        sbLIZ.append(room != null ? C781520UlC.LJFF(room) : false);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void y1() {
        if (x1()) {
            super.hide();
        } else {
            show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }
}
