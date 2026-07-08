package com.bytedance.android.livesdk.unityanimation.widget;

import X.AbstractC1749570vd5;
import X.AnonymousClass0956;
import X.C01GW;
import X.C1548820qPI;
import X.C1702860uPk;
import X.C1871910yoP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C292401Bi;
import X.C500260Jjc;
import X.C930940aKi;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.unityanimation.event.UnityAnimationDataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EventAreaUnityAnimationWidget extends LiveRecyclableWidget implements InterfaceC1141530foN {
    public final C01GW LL = C292401Bi.LIZ(AFwS215S0000000_26.get$arr$(17));

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1548820qPI.LJIIIIZZ("event_area_js_event_live_unity_animation_queue", this);
        y1().clear();
    }

    public final PriorityBlockingQueue<AbstractC1749570vd5> y1() {
        return (PriorityBlockingQueue) this.LL.getValue();
    }

    public final void x1() {
        AbstractC1749570vd5 abstractC1749570vd5Peek;
        if (y1().isEmpty() || (abstractC1749570vd5Peek = y1().peek()) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play animation:");
        sbLIZ.append(abstractC1749570vd5Peek.LL);
        C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (!abstractC1749570vd5Peek.LLIZ) {
            abstractC1749570vd5Peek.LLIZ = true;
            abstractC1749570vd5Peek.LIZJ();
        }
        abstractC1749570vd5Peek.LLILZLL = C500260Jjc.LJJJJJ(this, null, new C1702860uPk(abstractC1749570vd5Peek, this, null), 3);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        boolean z;
        AbstractC1749570vd5 next;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null) {
            return;
        }
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "");
        final String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "containerID", "");
        final String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd, "bid", "");
        String strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd, "room_id", "");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        if (strLJFF4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Intrinsics.LJFF(strLJFF4, string)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveJsEvent: ");
            sbLIZ.append(strLJFF);
            sbLIZ.append("  bid:");
            sbLIZ.append(strLJFF3);
            C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
            if (Intrinsics.LJFF(strLJFF, "action_enter")) {
                y1().add(new AbstractC1749570vd5(strLJFF3, strLJFF2) { // from class: X.0vd4
                    public final /* synthetic */ String LLIZLLLIL;
                    public final /* synthetic */ String LLJ;

                    @Override // X.AbstractC1749570vd5
                    public final void LIZJ() {
                        String string2;
                        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                        if (room2 == null || (string2 = Long.valueOf(room2.getId()).toString()) == null) {
                            string2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        C389001fE.LIZJ("event_area_js_event_live_unity_animation_queue", new Pair[]{new Pair("type", "action_start"), new Pair("containerID", this.LLJ), new Pair("bid", this.LLIZLLLIL), new Pair("room_id", string2)});
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sendJsEvent: action_start  bid:");
                        sbLIZ2.append(this.LLIZLLLIL);
                        C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(strLJFF3, strLJFF2);
                        this.LLIZLLLIL = strLJFF3;
                        this.LLJ = strLJFF2;
                    }
                });
                x1();
                return;
            }
            if (!Intrinsics.LJFF(strLJFF, "action_end")) {
                return;
            }
            Iterator<AbstractC1749570vd5> it2 = y1().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AbstractC1749570vd5 abstractC1749570vd5 = next;
                    if (Intrinsics.LJFF(abstractC1749570vd5.LL, strLJFF3) && Intrinsics.LJFF(abstractC1749570vd5.LLILLJJLI, strLJFF2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC1749570vd5 abstractC1749570vd52 = next;
            if (abstractC1749570vd52 != null) {
                AnonymousClass0956 anonymousClass0956 = abstractC1749570vd52.LLILZLL;
                if (anonymousClass0956 != null && !anonymousClass0956.isCancelled()) {
                    AnonymousClass0956 anonymousClass09562 = abstractC1749570vd52.LLILZLL;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("canceled delay job:");
                    sbLIZ2.append(abstractC1749570vd52.LL);
                    C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ2));
                }
                y1().remove(abstractC1749570vd52);
            }
            x1();
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("eventRoomId:");
        sbLIZ3.append(strLJFF4);
        sbLIZ3.append(" doesn't match currentRoomId:");
        sbLIZ3.append(string);
        sbLIZ3.append(",just return");
        C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1548820qPI.LIZLLL("event_area_js_event_live_unity_animation_queue", this);
        this.dataChannel.CQ2(UnityAnimationDataChannel.class, this, new AwS605S0100000_26(this, 35));
    }
}
