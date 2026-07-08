package com.ss.android.ugc.aweme.shortvideo.network;

import X.C08XD;
import X.C0CHQ;
import X.C0X52;
import X.C13LP;
import X.C1494590ozp;
import X.C20163113uv;
import X.C201955140j;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1083290eIR;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import Y.AComparatorS524S0100000_30;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.performance.ToolsNetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsInterceptor implements InterfaceC1904907d9 {
    public volatile boolean LL;
    public volatile String LLILLJJLI;
    public final List<Request> LLILLL = new ArrayList();
    public final List<Request> LLILZ = new ArrayList();
    public final Map<Request, Thread> LLILZIL = new LinkedHashMap();
    public final ReentrantLock LLILZLL = new ReentrantLock();

    public final void LIZIZ() {
        ArrayList arrayList = (ArrayList) this.LLILLL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS524S0100000_30(this, 2));
        }
        ArrayList arrayList2 = (ArrayList) this.LLILZ;
        if (arrayList2.size() > 1) {
            C08XD.LJJ(arrayList2, new AComparatorS524S0100000_30(this, 3));
        }
        EnumC1083290eIR enumC1083290eIRLIZ = ((ArrayList) this.LLILLL).isEmpty() ^ true ? LIZ((Request) C13LP.LJJJJZI(this.LLILLL)) : ((ArrayList) this.LLILZ).isEmpty() ^ true ? LIZ((Request) C13LP.LJJJJZI(this.LLILZ)) : EnumC1083290eIR.P0;
        for (Request request : (ArrayList) this.LLILZ) {
            if (LIZ(request).compareTo(enumC1083290eIRLIZ) < 0) {
                return;
            }
            try {
                Thread thread = (Thread) ((LinkedHashMap) this.LLILZIL).get(request);
                if (thread != null) {
                    thread.interrupt();
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Tools-Interceptor interrupt ");
                sbLIZ.append(e.getLocalizedMessage());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public ToolsInterceptor() {
        C0CHQ.LIZ().LJIIL().listenToCurrentPage(new AwS628S0100000_14(this, 33));
    }

    public static EnumC1083290eIR LIZ(Request request) {
        if (request == null) {
            return EnumC1083290eIR.P0;
        }
        Iterator<ToolsNetworkRequest> it2 = C20163113uv.LIZ().p0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ToolsNetworkRequest next = it2.next();
            ToolsNetworkRequest toolsNetworkRequest = next;
            if (Intrinsics.LJFF(a0.LJJJLL("/", request.getPath()), toolsNetworkRequest.path) && a0.LJJIIZI(request.getUrl(), toolsNetworkRequest.extra, false)) {
                if (next != null) {
                    return EnumC1083290eIR.P0;
                }
            }
        }
        Iterator<ToolsNetworkRequest> it3 = C20163113uv.LIZ().f410p1.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ToolsNetworkRequest next2 = it3.next();
            ToolsNetworkRequest toolsNetworkRequest2 = next2;
            if (Intrinsics.LJFF(a0.LJJJLL("/", request.getPath()), toolsNetworkRequest2.path) && a0.LJJIIZI(request.getUrl(), toolsNetworkRequest2.extra, false)) {
                if (next2 != null) {
                    return EnumC1083290eIR.P1;
                }
            }
        }
        Iterator<ToolsNetworkRequest> it4 = C20163113uv.LIZ().f411p2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            ToolsNetworkRequest next3 = it4.next();
            ToolsNetworkRequest toolsNetworkRequest3 = next3;
            if (Intrinsics.LJFF(a0.LJJJLL("/", request.getPath()), toolsNetworkRequest3.path) && a0.LJJIIZI(request.getUrl(), toolsNetworkRequest3.extra, false)) {
                if (next3 != null) {
                    return EnumC1083290eIR.P2;
                }
            }
        }
        Iterator<ToolsNetworkRequest> it5 = C20163113uv.LIZ().p3.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            ToolsNetworkRequest next4 = it5.next();
            ToolsNetworkRequest toolsNetworkRequest4 = next4;
            if (Intrinsics.LJFF(a0.LJJJLL("/", request.getPath()), toolsNetworkRequest4.path) && a0.LJJIIZI(request.getUrl(), toolsNetworkRequest4.extra, false)) {
                if (next4 != null) {
                    return EnumC1083290eIR.P3;
                }
            }
        }
        return EnumC1083290eIR.P0;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Boolean boolValueOf;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        if (this.LL && Intrinsics.LJFF(this.LLILLJJLI, "tool_record_page")) {
            System.currentTimeMillis();
            this.LLILZLL.lock();
            Iterator it2 = ((ArrayList) this.LLILLL).iterator();
            while (true) {
                boolValueOf = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (LIZ((Request) next).compareTo(LIZ(request)) > 0) {
                    if (next != null) {
                        boolValueOf = Boolean.valueOf(((ArrayList) this.LLILZ).add(request));
                    }
                }
            }
            this.LLILZLL.unlock();
            if (boolValueOf != null) {
                this.LLILZIL.put(request, C786410Ut5.u3());
                try {
                    Thread.sleep(C20163113uv.LIZ().lazyInterval);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJ("Tools-Interceptor " + e.getLocalizedMessage());
                }
            }
            this.LLILZLL.lock();
            ((ArrayList) this.LLILLL).add(request);
            this.LLILZLL.unlock();
            try {
                C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
                System.currentTimeMillis();
                this.LLILZLL.lock();
                ((ArrayList) this.LLILLL).remove(request);
                ((ArrayList) this.LLILZ).remove(request);
                LIZIZ();
                this.LLILZLL.unlock();
                return c0x52LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                System.currentTimeMillis();
                this.LLILZLL.lock();
                ((ArrayList) this.LLILLL).remove(request);
                ((ArrayList) this.LLILZ).remove(request);
                LIZIZ();
                this.LLILZLL.unlock();
                throw th;
            }
        }
        return c1494590ozp.LIZ(request);
    }
}
