package com.bytedance.android.livesdk.notify;

import X.C1096660ee0;
import X.C1097770efn;
import X.C1102210emx;
import X.C1107720evq;
import X.C1107750evt;
import X.C1107770evv;
import X.C1107780evw;
import X.C1107800evy;
import X.C1107810evz;
import X.C1119700fFA;
import X.C1161920gLG;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C464800IKo;
import X.InterfaceC1107760evu;
import X.InterfaceC1119790fFJ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.notify.BusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class BusinessAvoidConflictNotifyService implements IBusinessAvoidConflictNotifyService {
    public final String LL = "BusinessAvoidConflictNotify";
    public final boolean LLILLJJLI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    public final HashMap<DataChannel, C1107800evy> LLILLL = new HashMap<>();

    public BusinessAvoidConflictNotifyService() {
        C1097770efn.LLILLJJLI = this;
        C464800IKo.LIZ.LJIIJJI = new C1107720evq(this);
        C1119700fFA.LIZ = new InterfaceC1119790fFJ() { // from class: X.0evr
            @Override // X.InterfaceC1119790fFJ
            public final void onDismiss() {
                Set<Map.Entry<DataChannel, C1107800evy>> setEntrySet = this.LIZ.LLILLL.entrySet();
                BusinessAvoidConflictNotifyService businessAvoidConflictNotifyService = this.LIZ;
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    businessAvoidConflictNotifyService.f10((DataChannel) ((Map.Entry) it2.next()).getKey(), C1107810evz.LJJIJIIJIL, new C1107780evw(false, 2));
                }
            }

            @Override // X.InterfaceC1119790fFJ
            public final void onShow() {
                Set<Map.Entry<DataChannel, C1107800evy>> setEntrySet = this.LIZ.LLILLL.entrySet();
                BusinessAvoidConflictNotifyService businessAvoidConflictNotifyService = this.LIZ;
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    businessAvoidConflictNotifyService.f10((DataChannel) ((Map.Entry) it2.next()).getKey(), C1107810evz.LJJIJIIJIL, new C1107780evw(true, 2));
                }
            }
        };
    }

    public final List<C1107810evz> LJIIIZ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Object obj = ((LinkedHashMap) C1107810evz.LJJJJZ).get(str);
            if (obj != null) {
                arrayList.add(obj);
            } else if (this.LLILLJJLI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" must be added to BusinessItem#businessMap");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService
    public final void iq(DataChannel dataChannel) {
        if (this.LLILLJJLI) {
            String str = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[detach] datachannel = ");
            sbLIZ.append(dataChannel);
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1107800evy c1107800evyRemove = this.LLILLL.remove(dataChannel);
        if (c1107800evyRemove != null) {
            c1107800evyRemove.LIZJ.clear();
            c1107800evyRemove.LJ.clear();
            c1107800evyRemove.LIZLLL.clear();
            c1107800evyRemove.LJFF.clear();
        }
    }

    @Override // com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService
    public final void Cg0(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        if (!this.LLILLL.containsKey(dataChannel)) {
            this.LLILLL.put(dataChannel, new C1107800evy(lifecycleOwner, dataChannel));
        }
    }

    @Override // X.InterfaceC1097760efm
    public final void Eq(DataChannel dataChannel, InterfaceC1107760evu interfaceC1107760evu) {
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            c1107800evy.LIZJ(interfaceC1107760evu);
        }
    }

    @Override // X.InterfaceC1097760efm
    public final List<String> LIZ(DataChannel dataChannel, List<String> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        List<C1107810evz> listLJIIIZ = LJIIIZ(list);
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            ArrayList<C1107810evz> arrayList2 = (ArrayList) listLJIIIZ;
            for (C1107810evz c1107810evz : arrayList2) {
                if (!c1107800evy.LJFF.contains(c1107810evz)) {
                    c1107800evy.LIZIZ(c1107810evz);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                C1107780evw c1107780evw = c1107800evy.LIZJ.get(obj);
                if (c1107780evw != null && c1107780evw.LIZ()) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1107810evz) it2.next()).LIZ);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1097760efm
    public final C1096660ee0 LIZIZ(DataChannel dataChannel, List<String> list) {
        List<C1107810evz> listLJIIIZ = LJIIIZ(list);
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            return c1107800evy.LIZ(listLJIIIZ);
        }
        return new C1096660ee0(false, 3);
    }

    @Override // X.InterfaceC1097760efm
    public final C1096660ee0 LIZJ(DataChannel dataChannel, List<C1107810evz> list) {
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            return c1107800evy.LIZ(list);
        }
        return new C1096660ee0(true, 2);
    }

    @Override // X.InterfaceC1097760efm
    public final C1096660ee0 LIZLLL(DataChannel dataChannel, List<C1107810evz> list) {
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            for (C1107810evz c1107810evz : list) {
                C1107780evw c1107780evw = c1107800evy.LIZJ.get(c1107810evz);
                if (c1107780evw == null || !c1107780evw.LIZ()) {
                    return new C1096660ee0(false, c1107810evz);
                }
            }
            return new C1096660ee0(true, 2);
        }
        return new C1096660ee0(false, 3);
    }

    @Override // X.InterfaceC1097760efm
    public final C1107780evw LJ(DataChannel dataChannel, C1107810evz c1107810evz) {
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            return c1107800evy.LIZJ.get(c1107810evz);
        }
        return null;
    }

    @Override // X.InterfaceC1097760efm
    public final List<C1102210emx> LJII(DataChannel dataChannel, List<String> list) {
        Object obj;
        if (list == null) {
            return null;
        }
        List<C1107810evz> listLJIIIZ = LJIIIZ(list);
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy == null) {
            return null;
        }
        ArrayList<C1107810evz> arrayList = (ArrayList) listLJIIIZ;
        for (C1107810evz c1107810evz : arrayList) {
            if (!c1107800evy.LJFF.contains(c1107810evz)) {
                c1107800evy.LIZIZ(c1107810evz);
            }
        }
        ArrayList<C1107810evz> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C1107780evw c1107780evw = c1107800evy.LIZJ.get(obj2);
            if (c1107780evw != null && c1107780evw.LIZ()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (C1107810evz c1107810evz2 : arrayList2) {
            String str = c1107810evz2.LIZ;
            C1107780evw c1107780evw2 = c1107800evy.LIZJ.get(c1107810evz2);
            if (c1107780evw2 != null) {
                obj = c1107780evw2.LIZIZ;
            } else {
                obj = null;
            }
            arrayList3.add(new C1102210emx(str, obj));
        }
        return arrayList3;
    }

    @Override // X.InterfaceC1097760efm
    public final boolean LJIIIIZZ(DataChannel dataChannel, C1107810evz c1107810evz) {
        C1107780evw c1107780evw;
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy == null || (c1107780evw = c1107800evy.LIZJ.get(c1107810evz)) == null || !c1107780evw.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService
    public final void f10(DataChannel dataChannel, C1107810evz c1107810evz, C1107780evw c1107780evw) {
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            c1107800evy.LIZLLL(c1107810evz, c1107780evw);
        }
    }

    @Override // X.InterfaceC1097760efm
    public final void LJFF(DataChannel dataChannel, List<String> list, InterfaceC1107760evu interfaceC1107760evu, String str, LifecycleOwner lifecycleOwner, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj = ((LinkedHashMap) C1107810evz.LJJJJZ).get(it2.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            sf(dataChannel, arrayList, interfaceC1107760evu, str, lifecycleOwner, z);
        }
    }

    @Override // X.InterfaceC1097760efm
    public final void sf(DataChannel dataChannel, List<C1107810evz> list, InterfaceC1107760evu interfaceC1107760evu, String str, LifecycleOwner lifecycleOwner, boolean z) {
        Lifecycle lifecycle;
        C1107800evy c1107800evy = this.LLILLL.get(dataChannel);
        if (c1107800evy != null) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new BusinessAvoidConflictNotifyService$NotifyStatus$observe$1(c1107800evy, interfaceC1107760evu));
            }
            C1107750evt c1107750evt = new C1107750evt(c1107800evy.LIZIZ, interfaceC1107760evu, list, z, str);
            c1107800evy.LJ.put(interfaceC1107760evu, c1107750evt);
            for (C1107810evz c1107810evz : list) {
                if (!c1107800evy.LJFF.contains(c1107810evz)) {
                    c1107800evy.LIZIZ(c1107810evz);
                }
                List<C1107750evt> copyOnWriteArrayList = c1107800evy.LIZLLL.get(c1107810evz);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                }
                copyOnWriteArrayList.add(c1107750evt);
                c1107800evy.LIZLLL.put(c1107810evz, copyOnWriteArrayList);
                if (!c1107800evy.LIZJ.containsKey(c1107810evz)) {
                    c1107800evy.LIZJ.put(c1107810evz, new C1107770evv());
                }
            }
            if (c1107750evt.LIZLLL) {
                for (C1107810evz c1107810evz2 : c1107750evt.LIZJ) {
                    C1107780evw c1107780evwLJ = C1097770efn.LL.LJ(c1107750evt.LIZ, c1107810evz2);
                    if (c1107780evwLJ != null && c1107780evwLJ.LIZ()) {
                        c1107750evt.LIZIZ.LIZIZ(c1107810evz2, c1107780evwLJ.LIZ(), c1107780evwLJ);
                    }
                }
                C1097770efn c1097770efn = C1097770efn.LL;
                if (c1097770efn.LIZJ(c1107750evt.LIZ, c1107750evt.LIZJ).LIZ) {
                    c1107750evt.LIZIZ.LIZ();
                }
                if (c1097770efn.LIZLLL(c1107750evt.LIZ, c1107750evt.LIZJ).LIZ) {
                    c1107750evt.LIZIZ.LIZJ();
                }
            }
        }
    }
}
