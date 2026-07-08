package com.bytedance.android.livesdk.impl.revenue.enigma.widget;

import X.C001A;
import X.C0KZX;
import X.C500260Jjc;
import X.C776250Uch;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.EnigmaCommentEnableChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: loaded from: classes8.dex */
public final class EnigmaWidget extends LiveRecyclableWidget {
    public IMessageManager LLILLJJLI;
    public final String LL = "EnigmaWidget";
    public final C0KZX LLILLL = new OnIMMessageListener() { // from class: X.0KZX
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return this.LL.LL;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            DataChannel dataChannel;
            if (iMessage instanceof MemberMessage) {
                int i = ((MemberMessage) iMessage).action;
                if (i != 43) {
                    if (i == 44 && (dataChannel = this.LL.dataChannel) != null) {
                        dataChannel.zW(EnigmaCommentEnableChannel.class, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                DataChannel dataChannel2 = this.LL.dataChannel;
                if (dataChannel2 == null) {
                    return;
                }
                dataChannel2.zW(EnigmaCommentEnableChannel.class, Boolean.TRUE);
            }
        }
    };

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLILLL);
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        boolean z;
        Room roomLJJLIIIIJ;
        RoomAuthStatus roomAuthStatus;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILLJJLI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), (OnIMMessageListener) this.LLILLL);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null && roomAuthStatus.enigmawhisper == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(EnigmaCommentEnableChannel.class, Boolean.valueOf(z2));
        }
    }
}
