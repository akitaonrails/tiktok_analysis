package com.bytedance.android.livesdk.chatroom.widget;

import X.C001A;
import X.C0TZM;
import X.C0UO0;
import X.C11JF;
import X.C11NZ;
import X.C20743416Fc;
import X.C776250Uch;
import Y.AfS176S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CumulativeWatchAudienceWidget extends PerformProcessWidget implements OnMessageListener {
    public C20743416Fc LL;
    public int LLILLJJLI;
    public IMessageManager LLILLL;
    public C11JF LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g42;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C11JF c11jf;
        hide();
        IMessageManager iMessageManager = this.LLILLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.USER_SEQ.getIntType(), this);
        }
        C11JF c11jf2 = this.LLILZ;
        if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LLILZ) == null) {
            return;
        }
        c11jf.dispose();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... objArr) {
        super.initConstructor(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C20743416Fc) findViewById(R.id.pms);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int totalUser;
        RoomStats stats;
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null && (stats = room.getStats()) != null) {
            totalUser = stats.getTotalUser();
        } else {
            totalUser = 0;
        }
        this.LLILLJJLI = totalUser;
        Intrinsics.LJFF(this.dataChannel.gg0(C0TZM.class), Boolean.TRUE);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LLILLL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.USER_SEQ.getIntType(), this);
        }
        show();
        this.LLILZ = (C11JF) C11NZ.LJJJJJL(1L, 2L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS176S0100000_7(this, 50));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int iLongValue;
        if (iMessage instanceof RoomUserSeqMessage) {
            Long l = ((RoomUserSeqMessage) iMessage).totalUser;
            if (l != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            this.LLILLJJLI = iLongValue;
        }
    }
}
