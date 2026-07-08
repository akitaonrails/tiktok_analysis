package com.bytedance.android.livesdk.avoidance;

import X.C09AJ;
import X.C09JN;
import X.C0IJT;
import X.C1096620edw;
import X.C1096640edy;
import X.C1096660ee0;
import X.C1107810evz;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C1701940uOG;
import X.C19719512Dh;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C474500IjA;
import X.C513000K9y;
import X.C519360KYk;
import X.C782850UnL;
import X.C786170Ush;
import X.C786340Usy;
import X.InterfaceC1096630edx;
import X.InterfaceC1097760efm;
import Y.AfS186S0100000_17;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.uikit.uisetting.MsgNotifyComponentAvoidRule;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.avoidance.setting.AvoidanceBusinessConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class BusinessAvoidanceService implements IBusinessAvoidanceService {
    public boolean LL;
    public C11JF LLILLJJLI;
    public final Map<Integer, C1096640edy> LLILLL = new LinkedHashMap();
    public final HashMap<Integer, InterfaceC1096630edx> LLILZ = new HashMap<>();
    public final HashSet<Integer> LLILZIL = new HashSet<>();
    public final HashMap<DataChannel, C1096620edw> LLILZLL = new HashMap<>();

    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final void A82(DataChannel dataChannel) {
        C11JF c11jf;
        if (!this.LL && ((c11jf = this.LLILLJJLI) == null || c11jf.isDisposed())) {
            if (this.LLILLL.isEmpty()) {
                LIZ(AvoidanceBusinessConfigSetting.INSTANCE.getSetting().getComponentRuleList());
            }
            LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
            C259800zU c259800zU = new C259800zU();
            this.LLILLJJLI = (C11JF) C11NZ.LJIJJLI(new C786340Usy(c259800zU, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJ(new C786170Ush(c259800zU, 5)).LJJLL(new AfS186S0100000_17(this, 141), new C09JN() { // from class: X.07xX
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BusinessAvoidanceService@96dd.tryInitData$2");
                    C20441214yg.LJFF("matao-test", "[BusinessAvoidanceService#tryInitData]", (Throwable) obj);
                    C1C7U.LIZIZ("BusinessAvoidanceService@96dd.tryInitData$2");
                }
            });
        }
        if (!this.LLILZLL.containsKey(dataChannel)) {
            this.LLILZLL.put(dataChannel, new C1096620edw(dataChannel, this.LLILLL, this.LLILZ));
        }
        C513000K9y.LIZJ = 0;
    }

    public final void LIZ(List<MsgNotifyComponentAvoidRule> list) {
        if (list != null) {
            for (MsgNotifyComponentAvoidRule msgNotifyComponentAvoidRule : list) {
                Map<Integer, C1096640edy> map = this.LLILLL;
                Integer numValueOf = Integer.valueOf(msgNotifyComponentAvoidRule.getComponentType());
                HashMap map2 = new HashMap();
                List<String> exclusiveQueue = msgNotifyComponentAvoidRule.getExclusiveQueue();
                if (exclusiveQueue != null) {
                    map2.put(1, new HashSet(exclusiveQueue));
                }
                List<String> timelineQueue = msgNotifyComponentAvoidRule.getTimelineQueue();
                if (timelineQueue != null) {
                    map2.put(0, new HashSet(timelineQueue));
                }
                map.put(numValueOf, new C1096640edy(msgNotifyComponentAvoidRule.getRecoverThresholdMs(), msgNotifyComponentAvoidRule.getMaxRecoverRemainMs(), map2));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final void iq(DataChannel dataChannel) {
        C1096620edw c1096620edw = (C1096620edw) C19719512Dh.LIZJ(this.LLILZLL).remove(dataChannel);
        if (c1096620edw != null) {
            ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).Eq(c1096620edw.LIZ, c1096620edw.LJFF);
            c1096620edw.LJ.clear();
            c1096620edw.LIZLLL.clear();
            c1096620edw.LIZJ.clear();
        }
    }

    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final void uW1(C513000K9y c513000K9y) {
        if (this.LLILZ.containsKey(8)) {
            return;
        }
        this.LLILZ.put(8, c513000K9y);
        Iterator<T> it2 = this.LLILZLL.entrySet().iterator();
        while (it2.hasNext()) {
            ((C1096620edw) ((Map.Entry) it2.next()).getValue()).LIZIZ(c513000K9y);
        }
    }

    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final void az(InterfaceC1096630edx interfaceC1096630edx, DataChannel dataChannel) {
        C1096620edw c1096620edw = this.LLILZLL.get(dataChannel);
        if (c1096620edw != null) {
            c1096620edw.LIZIZ(interfaceC1096630edx);
        }
    }

    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final void im2(InterfaceC1096630edx interfaceC1096630edx, DataChannel dataChannel) {
        C1096620edw c1096620edw = this.LLILZLL.get(dataChannel);
        if (c1096620edw != null) {
            int iLIZLLL = interfaceC1096630edx.LIZLLL();
            if (c1096620edw.LJ.containsKey(Integer.valueOf(iLIZLLL)) && Intrinsics.LJFF(c1096620edw.LJ.get(Integer.valueOf(iLIZLLL)), interfaceC1096630edx)) {
                c1096620edw.LJ.remove(Integer.valueOf(iLIZLLL));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final Map oY1(InterfaceC1096630edx interfaceC1096630edx, DataChannel dataChannel) {
        C1096620edw c1096620edw = this.LLILZLL.get(dataChannel);
        if (c1096620edw != null) {
            return c1096620edw.LIZ(interfaceC1096630edx);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService
    public final C519360KYk qD0(InterfaceC1096630edx interfaceC1096630edx, DataChannel dataChannel) {
        String str;
        String str2;
        if (dataChannel == null && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            throw new IllegalArgumentException("dataChannel is null");
        }
        C1096620edw c1096620edw = this.LLILZLL.get(dataChannel);
        String str3 = null;
        if (c1096620edw != null) {
            HashSet hashSet = new HashSet();
            int iLIZLLL = interfaceC1096630edx.LIZLLL();
            ?? LJFF = 0;
            if (!c1096620edw.LIZLLL.contains(Integer.valueOf(iLIZLLL))) {
                c1096620edw.LIZLLL.add(Integer.valueOf(iLIZLLL));
                HashMap map = (HashMap) c1096620edw.LIZ(interfaceC1096630edx);
                Set set = (Set) map.get(1);
                if (set != null) {
                    c1096620edw.LIZJ.addAll(set);
                }
                Set set2 = (Set) map.get(0);
                if (set2 != null) {
                    c1096620edw.LIZJ.addAll(set2);
                }
                DataChannel dataChannel2 = c1096620edw.LIZ;
                InterfaceC1097760efm interfaceC1097760efm = (InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
                interfaceC1097760efm.Eq(dataChannel2, c1096620edw.LJFF);
                interfaceC1097760efm.LJFF(dataChannel2, C13LP.LLIIII(c1096620edw.LIZJ), c1096620edw.LJFF, "Avoidance", null, true);
            }
            HashMap map2 = (HashMap) c1096620edw.LIZ(interfaceC1096630edx);
            Set set3 = (Set) map2.get(0);
            if (set3 != null) {
                hashSet.addAll(set3);
            }
            Set set4 = (Set) map2.get(1);
            if (set4 != null) {
                hashSet.addAll(set4);
            }
            C1096660ee0 c1096660ee0LIZIZ = ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LIZIZ(c1096620edw.LIZ, C13LP.LLIIII(hashSet));
            if (!c1096660ee0LIZIZ.LIZ) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_component_show_control");
                c474500IjALIZ.LJIJJLI(dataChannel);
                if (dataChannel != null) {
                    LJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
                }
                c474500IjALIZ.LJJII(Integer.valueOf((int) LJFF), "is_anchor");
                c474500IjALIZ.LJJII(Integer.valueOf(iLIZLLL), "component_id");
                C1107810evz c1107810evz = c1096660ee0LIZIZ.LIZIZ;
                if (c1107810evz != null) {
                    str2 = c1107810evz.LIZ;
                } else {
                    str2 = null;
                }
                c474500IjALIZ.LJJII(str2, "avoid_component_type");
                c474500IjALIZ.LJJII("timeline", "control_reason");
                c474500IjALIZ.LJJII(0, "is_already_show");
                c474500IjALIZ.LIZ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[canShow] ");
            sbLIZ.append(iLIZLLL);
            sbLIZ.append(" canShow = ");
            C1107810evz c1107810evz2 = c1096660ee0LIZIZ.LIZIZ;
            if (c1107810evz2 != null) {
                str = c1107810evz2.LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", because ");
            sbLIZ.append(c1096660ee0LIZIZ.LIZ);
            C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ));
            boolean z = c1096660ee0LIZIZ.LIZ;
            C1107810evz c1107810evz3 = c1096660ee0LIZIZ.LIZIZ;
            if (c1107810evz3 != null) {
                str3 = c1107810evz3.LIZ;
            }
            return new C519360KYk(z, str3);
        }
        return new C519360KYk(true, null);
    }
}
