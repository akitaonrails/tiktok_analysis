package com.ss.android.ugc.aweme.tools.music.monitor;

import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C09AE;
import X.C0PEM;
import X.C14LI;
import X.C15438062q;
import X.C189200o6;
import X.C20153813tQ;
import X.C20154013tS;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1790370wgt;
import X.EnumC2006507tX;
import X.InterfaceC20153913tR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class MusicMonitorTaskQueueServiceImpl implements MusicMonitorTaskQueueService {
    public final int LIZ = 1;
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final ConcurrentLinkedQueue<InterfaceC20153913tR<?>> LIZJ = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, C09AE> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C20154013tS<?>> LJ = new ConcurrentHashMap<>();
    public final AtomicInteger LJFF = new AtomicInteger(0);
    public final C01GW LJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(155));
    public final String LJII = "av_video_music_monitor";

    public final void LIZLLL() {
        InterfaceC20153913tR<?> interfaceC20153913tRPoll;
        while (this.LJFF.get() < this.LIZ && (!this.LIZJ.isEmpty()) && (interfaceC20153913tRPoll = this.LIZJ.poll()) != null) {
            C20154013tS<?> c20154013tS = this.LJ.get(interfaceC20153913tRPoll.getId());
            EnumC1790370wgt enumC1790370wgt = c20154013tS != null ? c20154013tS.LIZ : null;
            if (enumC1790370wgt != EnumC1790370wgt.CANCELLED && enumC1790370wgt != EnumC1790370wgt.COMPLETED && enumC1790370wgt != EnumC1790370wgt.FAILED) {
                this.LJFF.incrementAndGet();
                this.LIZLLL.put(interfaceC20153913tRPoll.getId(), C23250099c.LIZLLL(this.LIZIZ, null, null, new C20153813tQ(this, interfaceC20153913tRPoll, null), 3));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService
    public final boolean LIZ(String str) {
        String str2 = this.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel task: ");
        sbLIZ.append(str);
        C201955140j.LJIILIIL(str2, C2188811AlT.LIZIZ(sbLIZ));
        C09AE c09ae = this.LIZLLL.get(str);
        if (c09ae != null) {
            String str3 = this.LJII;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cancel job: ");
            sbLIZ2.append(str);
            C201955140j.LJIILIIL(str3, C2188811AlT.LIZIZ(sbLIZ2));
            c09ae.LIZIZ(null);
            this.LJ.put(str, new C20154013tS<>(EnumC1790370wgt.CANCELLED, null, 6));
            return true;
        }
        for (InterfaceC20153913tR<?> interfaceC20153913tR : this.LIZJ) {
            if (Intrinsics.LJFF(interfaceC20153913tR.getId(), str)) {
                if (interfaceC20153913tR != null) {
                    boolean zRemove = this.LIZJ.remove(interfaceC20153913tR);
                    if (zRemove) {
                        this.LJ.put(str, new C20154013tS<>(EnumC1790370wgt.CANCELLED, null, 6));
                    }
                    String str4 = this.LJII;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("remove job: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", result: ");
                    sbLIZ3.append(zRemove);
                    C201955140j.LJIILIIL(str4, C2188811AlT.LIZIZ(sbLIZ3));
                    return zRemove;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService
    public final List<String> LIZIZ(EnumC2006507tX enumC2006507tX) {
        ConcurrentLinkedQueue<InterfaceC20153913tR<?>> concurrentLinkedQueue = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC20153913tR<?> interfaceC20153913tR : concurrentLinkedQueue) {
            if (interfaceC20153913tR.getTaskType() == enumC2006507tX) {
                arrayList.add(interfaceC20153913tR);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC20153913tR) it2.next()).getId());
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService
    public final String LIZJ(C14LI c14li) {
        try {
            this.LJ.put(c14li.getId(), new C20154013tS<>(EnumC1790370wgt.PENDING, null, 6));
            this.LIZJ.offer(c14li);
            LIZLLL();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return c14li.getId();
    }
}
