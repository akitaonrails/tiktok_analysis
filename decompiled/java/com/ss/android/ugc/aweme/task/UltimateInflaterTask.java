package com.ss.android.ugc.aweme.task;

import X.C098200Yq;
import X.C0CCZ;
import X.C0VZ0;
import X.C13LE;
import X.C189200o6;
import X.C21145617p0;
import X.C21146517p9;
import X.C21146717pB;
import X.C21147517pJ;
import X.C21172617tM;
import X.C2184411AeN;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1567700qtk;
import X.InterfaceC21146617pA;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.services.ICreativeToolsLifecycleService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class UltimateInflaterTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "UltimateInflaterTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Object c098200Yq;
        if (context == null || C786410Ut5.N3(context) == null) {
            return;
        }
        InterfaceC1567700qtk ultimateInflaterLifecycleOwnerFactory = null;
        ICreativeToolsLifecycleService iCreativeToolsLifecycleService = (ICreativeToolsLifecycleService) PluggableExtentionKt.pluggableSpi$default(ICreativeToolsLifecycleService.class, false, false, false, 14, null);
        if (iCreativeToolsLifecycleService != null) {
            ultimateInflaterLifecycleOwnerFactory = iCreativeToolsLifecycleService.getUltimateInflaterLifecycleOwnerFactory();
        }
        C21147517pJ c21147517pJ = new C21147517pJ(context);
        c21147517pJ.LIZ = R.style.xm;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(60L);
        if (millis >= 0) {
            c21147517pJ.LIZLLL = millis;
            long millis2 = timeUnit.toMillis(60L);
            if (millis2 >= 0) {
                c21147517pJ.LJ = millis2;
                try {
                    c098200Yq = C21172617tM.LJFF.LIZIZ();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = C823050WQl.LIZLLL();
                }
                c21147517pJ.LIZIZ = (Executor) c098200Yq;
                c21147517pJ.LIZJ = new InterfaceC21146617pA() { // from class: X.14Sb
                    @Override // X.InterfaceC21146617pA
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJFF() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIIJJI() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIILJJIL() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIILL() {
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LIZIZ(String str, Throwable th2) {
                        LJIIZILJ(str, "onRelayError", th2);
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIILLIIL(String str, Throwable th2) {
                        LJIIZILJ(str, "onAttachActivityError", th2);
                    }

                    public static void LJIIZILJ(String str, String str2, Throwable th2) {
                        C2187451AjH.LJIIJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("UltimateInflater-");
                        sbLIZ.append(str2);
                        sbLIZ.append('(');
                        sbLIZ.append(str);
                        sbLIZ.append(')');
                        C0VY3.LIZLLL(th2, C2188811AlT.LIZIZ(sbLIZ), "TTUltimateInflaterMonitorImpl", str2, "");
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIIIZ(int i, long j, String str) {
                        C2187451AjH.LJIIJ();
                        CommentService.LIZ.getClass();
                        C523420Kfs.LIZ().LJJJLL(i);
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().p5().LJI(true, i, str);
                        IEcomAsyncInflateMonitor.LIZ.getClass();
                        C1205404nc.LIZIZ(true, i, str, j, null);
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIIL(int i, String str, Throwable th2) {
                        LJIIZILJ(str, "onPreloadError", th2);
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().p5().LJI(false, i, str);
                        IEcomAsyncInflateMonitor.LIZ.getClass();
                        C1205404nc.LIZIZ(false, i, str, -1L, th2);
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIIJ(int i, String str, C0QHX c0qhx, Throwable th2) {
                        LJIIZILJ(str, "onInflateError", th2);
                        C1205404nc c1205404nc = IEcomAsyncInflateMonitor.LIZ;
                        String strName = c0qhx.name();
                        c1205404nc.getClass();
                        C1205404nc.LIZ(false, i, str, strName, -1L, th2);
                    }

                    @Override // X.InterfaceC21146617pA
                    public final void LJIILIIL(int i, String str, C0QHX c0qhx, long j) throws JSONException {
                        Object service;
                        C2187451AjH.LJIIJ();
                        String strName = c0qhx.name();
                        if (AbstractC19994813Le.Default.nextDouble() <= 0.005d) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("inflater_framework", "ultimate-inflater");
                            jSONObject.put("layout_name", str);
                            jSONObject.put("cache_type", strName);
                            jSONObject.put("time_cost", j);
                            C20684815ws.LJIJ("prf_layout_inflate_event", jSONObject);
                        }
                        if (C1157804fw.LIZ()) {
                            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                            if (service == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchUltimateInflaterPartial");
                            }
                        } else {
                            service = ServiceManager.get().getService(ISearchService.class);
                            if (service == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchUltimateInflaterPartial");
                            }
                        }
                        ((InterfaceC20267614Sc) service).x0(i, str, c0qhx, j);
                        C1205404nc c1205404nc = IEcomAsyncInflateMonitor.LIZ;
                        String strName2 = c0qhx.name();
                        c1205404nc.getClass();
                        C1205404nc.LIZ(true, i, str, strName2, j, null);
                    }
                };
                if (ultimateInflaterLifecycleOwnerFactory != null) {
                    ((ArrayList) c21147517pJ.LJFF).add(ultimateInflaterLifecycleOwnerFactory);
                }
                Executor executor = c21147517pJ.LIZIZ;
                if (executor == null) {
                    executor = (Executor) C21147517pJ.LJII.getValue();
                }
                Context contextN3 = C786410Ut5.N3(c21147517pJ.LJI);
                if (contextN3 != null) {
                    C21146517p9 c21146517p9 = new C21146517p9(contextN3, c21147517pJ.LIZ, executor, c21147517pJ.LIZJ, c21147517pJ.LIZLLL, c21147517pJ.LJ, Collections.unmodifiableList(c21147517pJ.LJFF));
                    AtomicBoolean atomicBoolean = C21146717pB.LIZ;
                    if (!atomicBoolean.get()) {
                        synchronized (C13LE.LIZ(C21146717pB.class)) {
                            try {
                                if (!atomicBoolean.get()) {
                                    C21145617p0.LIZ = c21146517p9;
                                    atomicBoolean.set(true);
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                    }
                    if (((Boolean) C2184411AeN.LIZJ.getValue()).booleanValue() && C2184411AeN.LJI.compareAndSet(false, true)) {
                        C21146717pB.LIZLLL(null, "common_feed_item_feed");
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot get application context from context : ");
                sbLIZ.append(c21147517pJ.LJI);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            throw new IllegalStateException("readyCacheKeepAliveTime < 0.");
        }
        throw new IllegalStateException("pendingCacheKeepAliveTime < 0.");
    }
}
