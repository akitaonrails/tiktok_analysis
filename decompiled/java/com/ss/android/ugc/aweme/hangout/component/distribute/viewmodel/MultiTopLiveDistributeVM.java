package com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel;

import X.C01GW;
import X.C09HN;
import X.C09YA;
import X.C0IVA;
import X.C1161920gLG;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C293501Bt;
import X.C452501pT;
import X.C477500Io0;
import X.C477640IoE;
import X.C477650IoF;
import X.C477660IoG;
import X.C477730IoN;
import X.C478550Iph;
import X.EnumC477480Iny;
import X.EnumC479370Ir1;
import X.InterfaceC0148002o;
import X.InterfaceC476860Imy;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedDynamicFeatureConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveDistributeVM extends AssemViewModel<C477730IoN> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(122));
    public final C477650IoF LLILLJJLI = new C0IVA() { // from class: X.0IoF
        @Override // X.C0IVA
        public final void LIZ(EnumC471750Iej enumC471750Iej, long j) {
        }

        @Override // X.C0IVA
        public final void LIZIZ(EnumC471750Iej enumC471750Iej, boolean z) {
            if (enumC471750Iej == EnumC471750Iej.LIVE_PERMISSION_UPDATE && z) {
                C20441214yg.LIZIZ("MultiTopLiveDistributeVM", "goLivePermissionListener: permission updated");
                InterfaceC476860Imy interfaceC476860Imy = (InterfaceC476860Imy) this.LIZ.LL.getValue();
                if (interfaceC476860Imy != null && interfaceC476860Imy.hasLivePermission()) {
                    this.LIZ.setState(AFwS237S0000000_7.get$arr$(71));
                }
            }
        }
    };
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 188));
    public final C09YA LLILZ = new C09YA(this, AFwS193S0000000_7.get$arr$(123));

    public static String yQ2() {
        Object liveFeature;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<String, List<String>>> entry : LiveFeedDynamicFeatureConfig.INSTANCE.getValue().entrySet()) {
            String key = entry.getKey();
            Map<String, List<String>> value = entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, List<String>> entry2 : value.entrySet()) {
                String key2 = entry2.getKey();
                for (String str : entry2.getValue()) {
                    if ((str.length() > 0) && (liveFeature = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getLiveFeature(key, key2, str)) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createRequestBody: fill feature, key = ");
                        sbLIZ.append(str);
                        sbLIZ.append(", value = ");
                        sbLIZ.append(liveFeature);
                        C20441214yg.LIZIZ("MultiTopLiveDistributeVM", C2188811AlT.LIZIZ(sbLIZ));
                        linkedHashMap2.put(str, liveFeature);
                    }
                }
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        try {
            String strLJIILL = C293501Bt.LIZ().LJIILL(linkedHashMap);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createRequestBody: featureJson = ");
            sbLIZ2.append(strLJIILL);
            C20441214yg.LIZIZ("MultiTopLiveDistributeVM", C2188811AlT.LIZIZ(sbLIZ2));
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createRequestBody: exception = ");
            sbLIZ3.append(e);
            C20441214yg.LJ("MultiTopLiveDistributeVM", C2188811AlT.LIZIZ(sbLIZ3));
            return "";
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C477730IoN(C478550Iph.LIZJ, null, EnumC479370Ir1.DEFAULT, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InterfaceC476860Imy interfaceC476860Imy = (InterfaceC476860Imy) this.LL.getValue();
        if (interfaceC476860Imy != null) {
            interfaceC476860Imy.LIZJ(this.LLILLJJLI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.EnumC479370Ir1 r19, X.InterfaceC1364105Vn r20) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM.wQ2(X.0Ir1, X.05Vn):java.lang.Object");
    }

    public final void xQ2(EnumC479370Ir1 enumC479370Ir1, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPage: scene=");
        sbLIZ.append(enumC479370Ir1);
        sbLIZ.append(", requestScene=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveDistributeVM", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C477640IoE(this, null), 3);
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C477660IoG(this, enumC479370Ir1, str, null), 3);
    }

    public final boolean vQ2(RecommendItem recommendItem, int i, String str, EnumC477480Iny enumC477480Iny) {
        String strValueOf;
        Long lValueOf;
        Room room = recommendItem.room;
        if (room == null || room.getId() <= 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList(getState().LL);
        if (arrayList.size() >= 1) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Room room2 = ((RecommendItem) it2.next()).room;
                if (room2 != null) {
                    lValueOf = Long.valueOf(room2.getId());
                } else {
                    lValueOf = null;
                }
                arrayList2.add(lValueOf);
            }
            strValueOf = String.valueOf(C09HN.LIZ(arrayList2));
        } else {
            strValueOf = "";
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Room room3 = ((RecommendItem) it3.next()).room;
            if (room3 != null) {
                arrayList3.add(room3);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        C477500Io0 c477500Io0 = C477500Io0.LIZ;
        long id = room.getId();
        String str2 = recommendItem.requestId;
        c477500Io0.getClass();
        C477500Io0.LJIJI(c477500Io0, id, room, str, null, str2, false, null, strValueOf, null, recommendItem, arrayList4, Integer.valueOf(i), C477500Io0.LJIIIIZZ(recommendItem), enumC477480Iny, null, 16744);
        return true;
    }
}
