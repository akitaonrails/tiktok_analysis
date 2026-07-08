package com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent;

import X.C01GW;
import X.C1162700gMW;
import X.C452501pT;
import X.C786410Ut5;
import Y.ARunnableS87S0200000_18;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenEventCenter implements IRavenEventAbility {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(80));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(81));

    public final void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
        for (RavenEvent ravenEvent : (CopyOnWriteArrayList) this.LL.getValue()) {
            if (Math.abs(jCurrentTimeMillis - ravenEvent.timestamp) > 300000) {
                concurrentSkipListSet.add(ravenEvent);
            }
        }
        Iterator it2 = concurrentSkipListSet.iterator();
        while (it2.hasNext()) {
            ((CopyOnWriteArrayList) this.LL.getValue()).remove(it2.next());
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility
    public final void dZ1(RavenEvent ravenEvent) {
        if (ravenEvent.timestamp == -1) {
            ravenEvent.timestamp = System.currentTimeMillis();
        }
        if (ravenEvent.eventName == null) {
            return;
        }
        LIZ();
        if (ravenEvent.LL) {
            ((CopyOnWriteArrayList) this.LL.getValue()).add(ravenEvent);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.LLILLJJLI.getValue()).get(ravenEvent.eventName);
        if (concurrentHashMap != null) {
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                ((C1162700gMW) ((Map.Entry) it2.next()).getValue()).LIZ(ravenEvent);
            }
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility
    public final void Fk2(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.LLILLJJLI.getValue()).get(str);
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str2);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility
    public final String Lp0(String str, C1162700gMW c1162700gMW) {
        if (c1162700gMW.LIZJ == -1) {
            c1162700gMW.LIZJ = System.currentTimeMillis();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.LLILLJJLI.getValue()).get(str);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
            ((ConcurrentHashMap) this.LLILLJJLI.getValue()).put(str, concurrentHashMap);
        } else if (concurrentHashMap.contains(c1162700gMW)) {
            return c1162700gMW.LIZIZ;
        }
        concurrentHashMap.put(c1162700gMW.LIZIZ, c1162700gMW);
        ((ConcurrentHashMap) this.LLILLJJLI.getValue()).put(str, concurrentHashMap);
        ArrayList arrayList = new ArrayList();
        for (RavenEvent ravenEvent : (CopyOnWriteArrayList) this.LL.getValue()) {
            if (Intrinsics.LJFF(ravenEvent.eventName, str) && c1162700gMW.LIZJ <= ravenEvent.timestamp) {
                arrayList.add(ravenEvent);
            }
        }
        LIZ();
        if (!arrayList.isEmpty()) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(looperMyLooper), new ARunnableS87S0200000_18(arrayList, c1162700gMW, 30));
        }
        return c1162700gMW.LIZIZ;
    }
}
