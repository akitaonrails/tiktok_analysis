package com.bytedance.android.livesdk.share;

import X.C11NJ;
import Y.AObjectS350S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WannaShareLiveEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes8.dex */
public class LiveShareWidget extends LiveWidget {
    public final C11NJ LL = new C11NJ();
    public boolean LLILLJJLI;
    public Room LLILLL;
    public User LLILZ;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLJJLI = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.LLILLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLILZ = (User) this.dataChannel.gg0(RoomUserChannel.class);
        this.dataChannel.BQ2(this, WannaShareLiveEvent.class, new AObjectS350S0100000_7(this, 97));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LL.LJ();
    }
}
