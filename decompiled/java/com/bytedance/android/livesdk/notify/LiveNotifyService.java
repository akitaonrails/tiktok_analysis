package com.bytedance.android.livesdk.notify;

import X.AbstractC1097820efs;
import X.C078400Ra;
import X.C0J0H;
import X.C0J0I;
import X.C0J0K;
import X.C0J0P;
import X.C0J0Q;
import X.C0KAJ;
import X.C1090000eTG;
import X.C1092780eXk;
import X.C1092970eY3;
import X.C1092980eY4;
import X.C1094570ead;
import X.C1097740efk;
import X.C1097750efl;
import X.C1102070emj;
import X.C1102080emk;
import X.C1102250en1;
import X.C1107810evz;
import X.C1151790g4v;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C19719512Dh;
import X.C2097608Jq;
import X.C474500IjA;
import X.EnumC1094630eaj;
import X.EnumC1097810efr;
import X.EnumC467180ITs;
import X.InterfaceC1077970e9r;
import X.InterfaceC1092860eXs;
import X.InterfaceC1097710efh;
import X.InterfaceC1097730efj;
import X.InterfaceC1097760efm;
import X.InterfaceC1102170emt;
import X.InterfaceC1102350enB;
import X.InterfaceC1107760evu;
import X.InterfaceC1141530foN;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.increase.IncreaseSDKTriggerEvent;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public class LiveNotifyService implements ILiveNotifyService {
    public final Map<DataChannel, C0J0H> LL = new LinkedHashMap();
    public final boolean LLILLJJLI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public final Map<DataChannel, InterfaceC1141530foN> LLILZ = new LinkedHashMap();

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void Nu1() {
        Integer num;
        ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        EnumC1094630eaj enumC1094630eaj = EnumC1094630eaj.DEFAULT;
        EnumC467180ITs enumC467180ITs = EnumC467180ITs.EPI;
        C1090000eTG c1090000eTGO3 = iLiveDecisionService.O3(enumC1094630eaj, enumC467180ITs.getGroupName(), "send_comment_count");
        Object obj = c1090000eTGO3 != null ? c1090000eTGO3.LIZJ : null;
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(C0J0Q.ROOM, "send_comment_count", Integer.valueOf(((!(obj instanceof Integer) || (num = (Integer) obj) == null) ? 0 : num.intValue()) + 1), enumC467180ITs.getGroupName(), false);
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final boolean mA2(DataChannel dataChannel) {
        C0J0K c0j0k;
        Map<String, InterfaceC1097710efh> map;
        C0J0H c0j0h = (C0J0H) ((LinkedHashMap) this.LL).get(dataChannel);
        InterfaceC1097710efh interfaceC1097710efh = null;
        if (c0j0h != null && (map = c0j0h.LIZ) != null) {
            interfaceC1097710efh = (InterfaceC1097710efh) ((LinkedHashMap) map).get("toolbar_tips_guide");
        }
        if ((interfaceC1097710efh instanceof C0J0K) && (c0j0k = (C0J0K) interfaceC1097710efh) != null && c0j0k.LJFF(dataChannel)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void ma(DataChannel dataChannel) throws JSONException {
        C0J0H c0j0h;
        Map<String, InterfaceC1097710efh> map;
        Map mapLJIIZILJ;
        Map mapLJIIZILJ2;
        C1102070emj.LIZ.getClass();
        Map map2 = (Map) ((LinkedHashMap) C1102070emj.LIZIZ).get(dataChannel);
        if (map2 != null && (mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(map2)) != null) {
            Iterator it2 = mapLJIIZILJ2.entrySet().iterator();
            while (it2.hasNext()) {
                C1102080emk c1102080emk = (C1102080emk) ((Map.Entry) it2.next()).getValue();
                if (c1102080emk.LJIIIIZZ) {
                    C1102070emj.LIZ.LJIILIIL(dataChannel, c1102080emk.LIZIZ, c1102080emk.LIZJ, c1102080emk.LIZ, C0KAJ.AUTO_TERMINATE, null, true, null);
                }
            }
        }
        C1102070emj.LIZIZ.remove(dataChannel);
        C1102070emj.LJ.remove(dataChannel);
        C1102070emj.LIZJ.remove(dataChannel);
        C1102070emj.LIZLLL.remove(dataChannel);
        C1102250en1.LIZ.getClass();
        C1102250en1.LJI().removeCallbacksAndMessages(dataChannel);
        Map map3 = (Map) ((LinkedHashMap) C1102250en1.LIZJ).get(dataChannel);
        if (map3 != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map3)) != null) {
            for (Map.Entry entry : mapLJIIZILJ.entrySet()) {
                C1102250en1 c1102250en1 = C1102250en1.LIZ;
                String str = (String) entry.getKey();
                EnumC1097810efr enumC1097810efr = EnumC1097810efr.LEAVE_ROOM;
                c1102250en1.getClass();
                C1102250en1.LJIJJ(dataChannel, str, new C1097750efl(2), enumC1097810efr);
            }
        }
        C1102250en1.LIZJ.remove(dataChannel);
        C19719512Dh.LIZJ(C1102250en1.LIZLLL).remove(dataChannel);
        C1102250en1.LJ.remove(dataChannel);
        C1102250en1.LJFF.remove(dataChannel);
        C1102250en1.LJI.remove(dataChannel);
        C1102250en1.LJIIIIZZ.remove(dataChannel);
        C1102250en1.LJII.remove(dataChannel);
        C1102070emj.LIZIZ(null, "Leave.");
        this.LLILLL.removeCallbacksAndMessages(dataChannel);
        if (dataChannel != null && (c0j0h = (C0J0H) ((LinkedHashMap) this.LL).get(dataChannel)) != null && (map = c0j0h.LIZ) != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(((InterfaceC1097710efh) entry2.getValue()).getStrategyName());
                ((InterfaceC1097710efh) entry2.getValue()).LJ();
            }
        }
        C19719512Dh.LIZJ(this.LL).remove(dataChannel);
        InterfaceC1141530foN interfaceC1141530foN = (InterfaceC1141530foN) C19719512Dh.LIZJ(this.LLILZ).remove(dataChannel);
        if (interfaceC1141530foN != null) {
            C1548820qPI.LJIIIIZZ("live_effect_notify_click", interfaceC1141530foN);
        }
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void Eq(DataChannel dataChannel, InterfaceC1107760evu interfaceC1107760evu) {
        ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).Eq(dataChannel, interfaceC1107760evu);
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final boolean TE(DataChannel dataChannel, C1107810evz c1107810evz) {
        return ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LJIIIIZZ(dataChannel, c1107810evz);
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void TP(AbsAudienceInteractionFragment absAudienceInteractionFragment, DataChannel dataChannel) {
        C0J0H c0j0h = (C0J0H) ((LinkedHashMap) this.LL).get(dataChannel);
        if (c0j0h != null && !c0j0h.LIZJ) {
            dataChannel.EQ2(absAudienceInteractionFragment, IncreaseSDKTriggerEvent.class, new AwS216S0300000_7(c0j0h, this, dataChannel, 1));
            c0j0h.LIZJ = true;
        }
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void VR(DataChannel dataChannel, C0J0I c0j0i) {
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW("toolbar_tips_guide");
        c0j0i.LJ();
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void dD1(DataChannel dataChannel, final AbstractC1097820efs abstractC1097820efs, boolean z) {
        C1094570ead c1094570ead;
        C0J0H c0j0h = (C0J0H) ((LinkedHashMap) this.LL).get(dataChannel);
        if (c0j0h != null) {
            if (!c0j0h.LIZ.containsKey(abstractC1097820efs.getStrategyName())) {
                c0j0h.LIZ.put(abstractC1097820efs.getStrategyName(), abstractC1097820efs);
                abstractC1097820efs.LJII(dataChannel);
                abstractC1097820efs.LIZIZ = new AwS551S0100000_7(c0j0h, 74);
                abstractC1097820efs.LIZLLL();
                ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                String strategyName = abstractC1097820efs.getStrategyName();
                InterfaceC1092860eXs interfaceC1092860eXs = new InterfaceC1092860eXs() { // from class: X.0efg
                    @Override // X.InterfaceC1092860eXs
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZ() {
                        abstractC1097820efs.LIZJ(null, true);
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LJ(C1092890eXv c1092890eXv) {
                        abstractC1097820efs.LIZIZ(c1092890eXv);
                        C20441214yg.LJ("LiveNotifyService", c1092890eXv.toString());
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZLLL(String str, C477840IoY c477840IoY) {
                        abstractC1097820efs.LIZJ(c477840IoY.LIZIZ, false);
                    }
                };
                C1092980eY4 c1092980eY4 = new C1092980eY4();
                c1092980eY4.LIZ = C0J0P.ROOM;
                c1092980eY4.LIZ(new C1092780eXk(abstractC1097820efs.LIZ()));
                C1092970eY3 c1092970eY3LIZIZ = c1092980eY4.LIZIZ();
                if (!z) {
                    c1094570ead = new C1094570ead();
                    c1094570ead.LIZ = C2097608Jq.LJIIJ(new Pair("skip_final_when_register", Boolean.TRUE));
                } else {
                    c1094570ead = null;
                }
                iLiveDecisionService.fR1(interfaceC1092860eXs, c1092970eY3LIZIZ, c1094570ead, strategyName);
                return;
            }
            return;
        }
        if (!this.LLILLJJLI) {
        } else {
            throw new IllegalStateException("You cannot register notify strategy before enter");
        }
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final boolean x82(int i, DataChannel dataChannel, int i2) {
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C078400Ra c078400Ra = new C078400Ra(i, i2);
        c1102070emj.getClass();
        return C1102070emj.LJIIIZ(dataChannel, c078400Ra);
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void iF2(DataChannel dataChannel, int i, int i2, InterfaceC1102350enB interfaceC1102350enB) {
        C1102070emj.LIZ.getClass();
        C1102070emj.LJJIIZ(dataChannel, i, i2, interfaceC1102350enB);
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void tc2(DataChannel dataChannel, int i, int i2, InterfaceC1102350enB interfaceC1102350enB) {
        C1102070emj.LIZ.getClass();
        C1102070emj.LIZ(dataChannel, i, i2, interfaceC1102350enB);
    }

    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void sf(DataChannel dataChannel, List<C1107810evz> list, InterfaceC1107760evu interfaceC1107760evu, String str, LifecycleOwner lifecycleOwner, boolean z) {
        ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).sf(dataChannel, list, interfaceC1107760evu, str, lifecycleOwner, z);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0efi] */
    @Override // com.bytedance.android.live.notify.ILiveNotifyService
    public final void wg1(Context context, DataChannel dataChannel, Function1<? super List<String>, ? extends List<String>> function1, Function2<? super DataChannel, ? super C474500IjA, Unit> function2, final InterfaceC1077970e9r interfaceC1077970e9r, final InterfaceC1097730efj interfaceC1097730efj) {
        List<MsgNotifyComponentAvoidRuleV2> list;
        Integer num;
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig;
        if (dataChannel == null) {
            return;
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        ?? r7 = new InterfaceC1102170emt() { // from class: X.0efi
            @Override // X.InterfaceC1102170emt
            public final boolean LIZ(DataChannel dataChannel2) {
                InterfaceC1097730efj interfaceC1097730efj2 = interfaceC1097730efj;
                if (interfaceC1097730efj2 == null || !interfaceC1097730efj2.LIZ(dataChannel2)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1102170emt
            public final boolean LIZIZ(DataChannel dataChannel2) {
                InterfaceC1097730efj interfaceC1097730efj2 = interfaceC1097730efj;
                if (interfaceC1097730efj2 == null || !interfaceC1097730efj2.LIZIZ(dataChannel2)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1102170emt
            public final boolean LIZJ(DataChannel dataChannel2) {
                InterfaceC1097730efj interfaceC1097730efj2 = interfaceC1097730efj;
                if (interfaceC1097730efj2 == null || !interfaceC1097730efj2.LIZJ(dataChannel2)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1102170emt
            public final boolean LIZLLL(DataChannel dataChannel2) {
                InterfaceC1097730efj interfaceC1097730efj2 = interfaceC1097730efj;
                if (interfaceC1097730efj2 != null && interfaceC1097730efj2.LJII()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1102170emt
            public final boolean LJ(DataChannel dataChannel2) {
                InterfaceC1097730efj interfaceC1097730efj2 = interfaceC1097730efj;
                if (interfaceC1097730efj2 != null && interfaceC1097730efj2.LJIIIIZZ()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1102170emt
            public final String LJFF(DataChannel dataChannel2) {
                return interfaceC1077970e9r.getEventPage();
            }
        };
        c1102070emj.getClass();
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null && (msgNotifyComAvoidConfig = room.avoidConfig) != null) {
            list = msgNotifyComAvoidConfig.componentRuleListV2;
        } else {
            list = null;
        }
        List<MsgNotifyComponentAvoidRuleV2> list2 = C1102070emj.LJI;
        if (list != null) {
            num = 2;
        } else if (list2 != null) {
            num = 1;
            list = list2;
        } else {
            list = null;
            num = null;
        }
        C1102070emj.LJ.put(dataChannel, new C1097740efk(context, function1, function2, r7, list, num));
        C1102070emj.LIZIZ(null, "Enter.");
        this.LL.put(dataChannel, new C0J0H());
        C1151790g4v c1151790g4v = new C1151790g4v(dataChannel, 2);
        this.LLILZ.put(dataChannel, c1151790g4v);
        C1548820qPI.LIZLLL("live_effect_notify_click", c1151790g4v);
    }
}
