package com.bytedance.android.livesdk.hashtag;

import X.C001A;
import X.C1078480eAg;
import X.C1133830fbx;
import X.C776250Uch;
import X.C931340aLM;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.HashtagMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: loaded from: classes.dex */
public final class MessageStationWidget extends LiveRecyclableWidget implements OnMessageListener {
    public IMessageManager LL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.HASHTAG.getIntType(), this);
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && ((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    onMessage((IMessage) obj);
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Text text;
        Hashtag hashtag;
        if (iMessage instanceof HashtagMessage) {
            HashtagMessage hashtagMessage = (HashtagMessage) iMessage;
            CommonMessageData commonMessageData = hashtagMessage.baseMessage;
            if (commonMessageData != null && (text = commonMessageData.displayText) != null && (hashtag = hashtagMessage.hashtag) != null) {
                hashtag.title = C1133830fbx.LJIILIIL(text, "").toString();
            }
            Hashtag hashtag2 = hashtagMessage.hashtag;
            if (hashtag2 != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(HashtagChangedChannel.class, hashtag2);
                }
                DataChannelGlobal.LLILZ.JQ2(C931340aLM.class, hashtag2);
            }
        }
    }
}
