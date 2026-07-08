package com.bytedance.android.livesdk.impl.revenue.strategy.guide;

import X.AbstractC19994813Le;
import X.C001A;
import X.C01JO;
import X.C01JP;
import X.C01JR;
import X.C09AE;
import X.C0PEM;
import X.C1145050fu3;
import X.C11JF;
import X.C13LZ;
import X.C158B;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C354710DvR;
import X.C500260Jjc;
import X.C776250Uch;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.livesetting.clientai.LiveTriggerScaleProduceSettings;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GiftGuideAsrTriggerSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GuideAnchorTriggerDiscardThresholds;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GuideAnchorTriggerShuffleConfig;
import com.bytedance.android.livesdk.model.message.AnchorGuideTriggerMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GuideTriggerWidget extends LiveRecyclableWidget implements OnIMMessageListener {
    public Function0<Long> LL;
    public final List<C09AE> LLILLJJLI = new ArrayList();
    public final C01JR LLILLL = new C01JR();
    public final C01JP LLILZ = new C01JP();

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "revenue_strategy";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.ANCHOR_GUIDE_TRIGGER_MESSAGE.getIntType(), this);
        }
        LiveGiftGuideBubbleMessageHandler.INSTANCE.unregister();
        LiveGiftGuideTriggerMessageHandler.INSTANCE.unregister();
        LiveGiftGuideAvoidQueryMessageHandler.INSTANCE.unregister();
        LiveAlgoPkgLogSendMessageHandler.INSTANCE.unregister();
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ArrayList) this.LLILLJJLI).clear();
        this.LL = null;
        C01JR c01jr = this.LLILLL;
        c01jr.LIZ = 0L;
        C1145050fu3.LIZIZ(c01jr);
        C01JP c01jp = this.LLILZ;
        c01jp.getClass();
        LiveTriggerScaleProduceSettings liveTriggerScaleProduceSettings = LiveTriggerScaleProduceSettings.INSTANCE;
        if (liveTriggerScaleProduceSettings.enable() && liveTriggerScaleProduceSettings.algoPkgName().length() > 0) {
            c01jp.LIZIZ = 0L;
            c01jp.LJ = false;
            c01jp.LIZLLL = null;
            C11JF c11jf = c01jp.LIZ;
            if (c11jf != null && !c11jf.isDisposed()) {
                c11jf.dispose();
            }
            c01jp.LIZ = null;
        }
        C1145050fu3.LIZIZ(this.LLILLL);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long jLJJLIIIJ;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ANCHOR_GUIDE_TRIGGER_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        this.LL = (Function0) this.dataChannel.gg0(WatchDurationChannel.class);
        C01JR c01jr = this.LLILLL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            c01jr.getClass();
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        c01jr.LIZ = jLJJLIIIJ;
        C1145050fu3.LIZ(c01jr);
        DataChannel dataChannel2 = this.dataChannel;
        LiveGiftGuideBubbleMessageHandler.INSTANCE.register();
        LiveGiftGuideTriggerMessageHandler.INSTANCE.register(dataChannel2);
        LiveGiftGuideAvoidQueryMessageHandler.INSTANCE.register();
        LiveAlgoPkgLogSendMessageHandler.INSTANCE.register();
        C01JP c01jp = this.LLILZ;
        DataChannel dataChannel3 = this.dataChannel;
        c01jp.getClass();
        LiveTriggerScaleProduceSettings liveTriggerScaleProduceSettings = LiveTriggerScaleProduceSettings.INSTANCE;
        boolean zLJFF = false;
        if (liveTriggerScaleProduceSettings.enable() && liveTriggerScaleProduceSettings.algoPkgName().length() > 0) {
            if (dataChannel3 != null) {
                zLJFF = Intrinsics.LJFF(dataChannel3.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
            }
            c01jp.LJ = zLJFF;
            if (dataChannel3 != null) {
                c01jp.LIZIZ = C500260Jjc.LJJLIIIJ(dataChannel3);
                c01jp.LIZLLL = (Function0) dataChannel3.gg0(WatchDurationChannel.class);
                c01jp.LIZ(c01jp.LIZJ);
            }
        }
        C1145050fu3.LIZ(this.LLILLL);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof AnchorGuideTriggerMessage) || !GiftGuideAsrTriggerSetting.INSTANCE.enable()) {
            return;
        }
        AnchorGuideTriggerMessage anchorGuideTriggerMessage = (AnchorGuideTriggerMessage) iMessage;
        long threshold = GuideAnchorTriggerDiscardThresholds.INSTANCE.getThreshold(anchorGuideTriggerMessage.triggerName);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("threshold: ");
        sbLIZ.append(threshold);
        sbLIZ.append(", triggerTime: ");
        sbLIZ.append(anchorGuideTriggerMessage.triggerTime);
        sbLIZ.append(", currentTime: ");
        sbLIZ.append(C158B.LIZJ());
        C20441214yg.LJIIIZ("GuideTriggerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (threshold > 0 && C158B.LIZJ() - anchorGuideTriggerMessage.triggerTime < threshold) {
            long interval = GuideAnchorTriggerShuffleConfig.INSTANCE.getInterval(anchorGuideTriggerMessage.triggerName);
            long jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, interval));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("interval: ");
            sbLIZ2.append(interval);
            sbLIZ2.append(", randomInterval: ");
            sbLIZ2.append(jLJIIJJI);
            C20441214yg.LJIIIZ("GuideTriggerWidget", C2188811AlT.LIZIZ(sbLIZ2));
            ((ArrayList) this.LLILLJJLI).add(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01JO(jLJIIJJI, iMessage, this, null), 3));
        }
    }
}
