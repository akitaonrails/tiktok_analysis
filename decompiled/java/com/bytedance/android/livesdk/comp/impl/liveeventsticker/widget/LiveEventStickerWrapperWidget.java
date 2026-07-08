package com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget;

import X.AbstractC19664311wf;
import X.AbstractC19994813Le;
import X.AnonymousClass0956;
import X.C001A;
import X.C098200Yq;
import X.C0PEM;
import X.C1078480eAg;
import X.C1081050eEp;
import X.C1085140eLQ;
import X.C1085150eLR;
import X.C1085370eLn;
import X.C1161920gLG;
import X.C13LZ;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C189200o6;
import X.C19662011wI;
import X.C19662211wK;
import X.C19662311wL;
import X.C19662411wM;
import X.C19662511wN;
import X.C19662711wP;
import X.C19663611wY;
import X.C19663811wa;
import X.C19664911wl;
import X.C19665311wp;
import X.C1AJN;
import X.C20337914i1;
import X.C23250099c;
import X.C2327809Ae;
import X.C262100zr;
import X.C354710DvR;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1083170eIF;
import X.EnumC19663011wS;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventStickerRequestMaxDelayTimeSetting;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventStickerWrapperWidget extends DecorationWrapperWidget implements OnIMMessageListener, InterfaceC1141530foN {
    public C19665311wp LLJILJIL;
    public AnonymousClass0956 LLJILJILJ;
    public Long LLJILLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "LiveEventStickerWrapperWidget";
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
    public final void y1(Sticker sticker) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
    public final void z1() {
    }

    public final void C1() {
        ViewGroup viewGroup;
        ((ArrayList) this.LLILLL).clear();
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
    }

    public final C19662711wP E1() {
        C1AJN<?> next;
        Iterator<C1AJN<?>> it2 = this.LLILLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof C19662711wP) {
                break;
            }
        }
        if (next instanceof C19662711wP) {
            return (C19662711wP) next;
        }
        return null;
    }

    public final void D1() {
        C19663611wY c19663611wY;
        C19662711wP c19662711wPE1 = E1();
        if (c19662711wPE1 == null || (c19663611wY = (C19663611wY) c19662711wPE1.LL) == null) {
            return;
        }
        C19665311wp c19665311wp = this.LLJILJIL;
        if (c19665311wp != null) {
            c19665311wp.LJII(c19663611wY, new C1085150eLR(this), null);
        }
        C1();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11wp] */
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Object obj;
        IMessage iMessage;
        attachAndShow();
        super.onCreate();
        final long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(this.dataChannel);
        this.LLJILJIL = new AbstractC19664311wf(this, jLJJLIIIJ) { // from class: X.11wp
            public final long LIZIZ;

            @Override // X.AbstractC19664311wf
            public final int LIZ() {
                return 5;
            }

            @Override // X.AbstractC19664311wf
            public final int LIZJ() {
                return 1;
            }

            @Override // X.AbstractC19664311wf
            public final int LIZLLL() {
                return 3;
            }

            @Override // X.AbstractC19664311wf
            public final Long LIZIZ() {
                return Long.valueOf(this.LIZIZ);
            }

            {
                this.LIZIZ = jLJJLIIIJ;
            }
        };
        Object[] objArr = this.args;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage)) && (iMessage = (IMessage) obj) != null)) {
                    onMessage(iMessage);
                }
            }
        }
        IMessageManager iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(this.dataChannel);
        if (iMessageManagerLJJJJLL != null) {
            iMessageManagerLJJJJLL.addMessageListener(C001A.ROOM_EVENT_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        C1548820qPI.LIZLLL("live_event_display_sticker", this);
        C1548820qPI.LIZLLL("live_event_update_result", this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C19662711wP c19662711wPE1;
        C19663611wY c19663611wY;
        super.onDestroy();
        this.LLJILJIL = null;
        C1548820qPI.LJIIIIZZ("live_event_display_sticker", this);
        C1548820qPI.LJIIIIZZ("live_event_update_result", this);
        if (E1() == null || (c19662711wPE1 = E1()) == null || (c19663611wY = (C19663611wY) c19662711wPE1.LL) == null) {
            return;
        }
        C19662511wN.LJFF(c19663611wY, "leave_room");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void B1(final C19663611wY c19663611wY) {
        Long lValueOf;
        EnumC19663011wS enumC19663011wS;
        float fFloatValue;
        C19663611wY c19663611wY2;
        C19662711wP c19662711wPE1 = E1();
        if (c19662711wPE1 != null && (c19663611wY2 = (C19663611wY) c19662711wPE1.LL) != null) {
            lValueOf = Long.valueOf(c19663611wY2.LIZLLL);
        } else {
            lValueOf = null;
        }
        long j = c19663611wY.LIZLLL;
        final boolean zLJIIZILJ = false;
        if (lValueOf != null && lValueOf.longValue() == j) {
            C19662711wP c19662711wPE12 = E1();
            if (c19662711wPE12 != null) {
                C19663611wY c19663611wY3 = (C19663611wY) c19662711wPE12.LL;
                c19663611wY3.getClass();
                c19663611wY3.LJI = c19663611wY.LJI;
                c19663611wY3.LJII.clear();
                c19663611wY3.LJII.addAll(c19663611wY.LJII);
                c19663611wY3.LJIIIIZZ = c19663611wY.LJIIIIZZ;
                c19663611wY3.LJIIIZ = c19663611wY.LJIIIZ;
                c19663611wY3.LJIIJ = c19663611wY.LJIIJ;
                c19663611wY3.LJIIJJI = c19663611wY.LJIIJJI;
                c19663611wY3.LJ = c19663611wY.LJ;
                c19663611wY3.LJFF = c19663611wY.LJFF;
                c19662711wPE12.E0();
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(((C19663611wY) c19662711wPE12.LL).LJIIIIZZ);
                float fFloatValue2 = -1.0f;
                if (fLJIIIIZZ != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = -1.0f;
                }
                float f = 100;
                float f2 = fFloatValue / f;
                Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(((C19663611wY) c19662711wPE12.LL).LJIIIZ);
                if (fLJIIIIZZ2 != null) {
                    fFloatValue2 = fLJIIIIZZ2.floatValue();
                }
                c19662711wPE12.I0(f2, fFloatValue2 / f);
                return;
            }
            return;
        }
        C1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel))) {
            enumC19663011wS = EnumC19663011wS.ANCHOR;
        } else {
            enumC19663011wS = EnumC19663011wS.AUDIENCE;
        }
        C19662711wP c19662711wP = new C19662711wP(this.context, c19663611wY, enumC19663011wS, this.LL, this, new C19662411wM(zLJIIZILJ, this), new C19662311wL(zLJIIZILJ, this, c19663611wY));
        ((ArrayList) this.LLILLL).add(c19662711wP);
        x1(c19662711wP);
        this.dataChannel.SX0(C1085140eLQ.class, Long.valueOf(c19663611wY.LIZLLL));
        AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJILJ = null;
        this.LLJILJILJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C19662211wK(this, c19663611wY, null), 3);
        HandlerHook.viewPost(c19662711wP, new Runnable() { // from class: X.11wO
            public final void LIZ() {
                if (zLJIIZILJ) {
                    C19662511wN.LJ(c19663611wY, "live_take_detail");
                    return;
                }
                C19663611wY c19663611wY4 = c19663611wY;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_module_show");
                C19662511wN.LIZIZ(c474500IjALIZ, c19663611wY4);
                c474500IjALIZ.LJJII(Boolean.valueOf(c19663611wY4.LJIIJ), "has_registered");
                c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY4.LIZ()), "module_position_x");
                c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY4.LIZIZ), "module_position_y");
                c474500IjALIZ.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveEventStickerWrapperWidget@dd57.addLiveEventSticker$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.addLiveEventSticker$1");
            }
        });
    }

    @Override // X.InterfaceC2177361AJi
    public final void LJIJI(boolean z) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideTitleLayoutEvent.class, new C1081050eEp(z, EnumC1083170eIF.LIVE_EVENT_STICKER_WRAPPER_WIDGET));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void LLLLLJLJLL(Sticker sticker) {
        C19663611wY c19663611wY;
        Object obj;
        super.LLLLLJLJLL(sticker);
        if ((sticker instanceof C19663611wY) && (c19663611wY = (C19663611wY) sticker) != null) {
            if (this.LLILZ) {
                D1();
                return;
            }
            C1();
            try {
                C20337914i1<HashMap<String, HashSet<String>>> c20337914i1 = InterfaceC1106030et7.r8;
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                    HashSet<String> hashSet = c20337914i1.LIZIZ().get(String.valueOf(jLJJLIIIJ));
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                    }
                    hashSet.add(String.valueOf(c19663611wY.LIZLLL));
                    c20337914i1.LIZIZ().put(String.valueOf(jLJJLIIIJ), hashSet);
                    c20337914i1.LIZJ();
                    C189200o6.m2constructorimpl(c20337914i1);
                    obj = c20337914i1;
                } else {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            C189200o6.m1boximpl(obj);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C19662711wP c19662711wPE1;
        C19663611wY c19663611wY;
        InterfaceC1107590evd interfaceC1107590evd;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "live_event_display_sticker")) {
            if (this.LLJILJIL != null) {
                AbstractC19664311wf.LJ(c262100zr, new C19664911wl(this), new C1085370eLn(this));
            }
        } else {
            if (!Intrinsics.LJFF(str, "live_event_update_result") || (c19662711wPE1 = E1()) == null || (c19663611wY = (C19663611wY) c19662711wPE1.LL) == null || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "live_event")) == null) {
                return;
            }
            C19663611wY c19663611wYLIZ = C19663811wa.LIZ(interfaceC1107590evdLJ);
            C19663611wY c19663611wY2 = new C19663611wY(c19663611wY.LIZLLL, c19663611wY.LJ, c19663611wY.LJFF, c19663611wY.LJI, c19663611wY.LJII, c19663611wY.LJIIIIZZ, c19663611wY.LJIIIZ);
            c19663611wY2.LJIIJ = c19663611wYLIZ.LJIIJ;
            c19663611wY2.LJIIJJI = c19663611wYLIZ.LJIIJJI;
            c19663611wY2.LJ = c19663611wYLIZ.LJ;
            c19663611wY2.LJFF = c19663611wYLIZ.LJFF;
            B1(c19663611wY2);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void o0(Sticker sticker) {
        C19663611wY c19663611wY;
        if ((sticker instanceof C19663611wY) && (c19663611wY = (C19663611wY) sticker) != null) {
            C19665311wp c19665311wp = this.LLJILJIL;
            if (c19665311wp != null) {
                c19665311wp.LJFF(c19663611wY);
            }
            C19662511wN.LIZLLL((C19663611wY) sticker, "live_take_detail");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        Long lValueOf;
        C19663611wY c19663611wY;
        if (!(iMessage instanceof RoomEventMessage)) {
            return;
        }
        RoomEventMessage roomEventMessage = (RoomEventMessage) iMessage;
        int i = roomEventMessage.configOpt;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 5 && i != 6 && i != 7) {
                    return;
                }
            } else {
                AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJILJILJ = null;
                C1();
                return;
            }
        }
        C19663611wY c19663611wY2 = new C19663611wY(roomEventMessage.eventId, roomEventMessage.title, roomEventMessage.startTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT), roomEventMessage.subscribedCount, roomEventMessage.eventUserInfo, roomEventMessage.posX, roomEventMessage.posY);
        int iYy2 = 0;
        if (c19663611wY2.LJFF - System.currentTimeMillis() > 7200000) {
            Long l = this.LLJILLL;
            long j = c19663611wY2.LIZLLL;
            if ((l != null && l.longValue() == j) || (dataChannel = this.dataChannel) == null) {
                return;
            }
            try {
                HashSet<String> hashSet = InterfaceC1106030et7.r8.LIZIZ().get(String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)));
                if (hashSet != null && hashSet.contains(String.valueOf(c19663611wY2.LIZLLL))) {
                    return;
                } else {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (!this.LLILZ && i == 7 && E1() != null) {
                return;
            }
            if (this.LLILZ && i == 5 && E1() != null) {
                C19662711wP c19662711wPE1 = E1();
                if (c19662711wPE1 != null && (c19663611wY = (C19663611wY) c19662711wPE1.LL) != null) {
                    lValueOf = Long.valueOf(c19663611wY.LIZLLL);
                } else {
                    lValueOf = null;
                }
                long j2 = c19663611wY2.LIZLLL;
                if (lValueOf != null && lValueOf.longValue() == j2) {
                    return;
                }
            }
            c19663611wY2.LJIIL = i;
            IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
            if (iRankService != null) {
                iYy2 = iRankService.yy2();
            }
            long value = ((long) iYy2) / LiveEventStickerRequestMaxDelayTimeSetting.INSTANCE.getValue();
            long jLJIIJJI = 0;
            if (value != 0) {
                jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, value)) * 1000;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C19662011wI(jLJIIJJI, c19663611wY2, this, null), 2);
        }
    }
}
