package com.bytedance.retrofit2;

import X.C080U;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X52;
import X.C0X9S;
import X.C0XMB;
import X.C1490240oso;
import X.C1490350osz;
import X.C1494160oz8;
import X.C1494570ozn;
import X.C1494580ozo;
import X.C1494590ozp;
import X.C1494670ozx;
import X.C1494700p00;
import X.C2088908Gh;
import X.C2175508fh;
import X.C786410Ut5;
import X.C793770VBv;
import X.C805380Via;
import X.InterfaceC1339100kx2;
import X.InterfaceC1489890osF;
import X.InterfaceC1490310osv;
import X.InterfaceC594300NSq;
import X.InterfaceC725990Sdp;
import X.InterfaceC843230X6b;
import X.InterfaceRunnableC1490390ot3;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SsHttpCall<T> implements C0X9S<T>, InterfaceC843230X6b, InterfaceC1339100kx2 {
    public static InterfaceC725990Sdp sPriorityControl;
    public static InterfaceC1490310osv sRequestFlagHandler;
    public static InterfaceC1489890osF sThrottleControl;
    public final Object[] args;
    public final CallServerInterceptor callServerInterceptor;
    public Request delayRequest;
    public final C1494570ozn metrics;
    public Request originalRequest;
    public Throwable requestException;
    public final RequestFactory<T> requestFactory;

    private synchronized void ensureOriginalRequestCreated() {
        if (this.originalRequest != null) {
            return;
        }
        try {
            this.metrics.LJJJJZ();
            this.originalRequest = this.requestFactory.toRequest(null, this.args);
            this.metrics.LJJJJLL();
            Request request = this.originalRequest;
            if (request == null) {
                throw new RuntimeException("Unable to create request.");
            }
            request.setMetrics(this.metrics);
            Logger.debug();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Unable to create request.", e);
        }
    }

    @Override // X.InterfaceC843230X6b
    public void doCollect() {
    }

    @Override // X.C0X9S
    public C0X52 execute() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400204, "com/bytedance/retrofit2/SsHttpCall", "execute", this, new Object[0], "com.bytedance.retrofit2.SsResponse", new C0WZW(false, "()Lcom/bytedance/retrofit2/SsResponse;", new C0WZX("dzBzEgAjS8/YVFkiQFyWY6+XRXBuTsTGj4Nbh9yUF1ICPg==", null)));
        return c0wsuLIZIZ.LIZ ? (C0X52) c0wsuLIZIZ.LIZIZ : com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // X.C0X9S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isExecuted() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.bytedance.retrofit2.CallServerInterceptor r0 = r1.callServerInterceptor     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            boolean r0 = r0.isExecuted()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.SsHttpCall.isExecuted():boolean");
    }

    @Override // X.C0X9S
    public void cancel() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            callServerInterceptor.cancel();
        }
    }

    @Override // X.C0X9S
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SsHttpCall<T> m140clone() {
        return new SsHttpCall<>(this.requestFactory, this.args);
    }

    public C0X52<T> com_bytedance_retrofit2_SsHttpCall__execute$___twin___() {
        this.metrics.LJJJJL(false);
        ensureOriginalRequestCreated();
        try {
            InterfaceC1489890osF interfaceC1489890osF = sThrottleControl;
            if (interfaceC1489890osF != null) {
                Request requestLIZ = interfaceC1489890osF.LIZ(this.originalRequest);
                this.originalRequest = requestLIZ;
                this.delayRequest = requestLIZ;
                sThrottleControl.LIZJ(requestLIZ);
            }
            this.metrics.LJJIJL();
            C0X52<T> responseWithInterceptorChain = getResponseWithInterceptorChain();
            InterfaceC1489890osF interfaceC1489890osF2 = sThrottleControl;
            if (interfaceC1489890osF2 != null) {
                interfaceC1489890osF2.LIZLLL(this.delayRequest);
            }
            this.metrics.LJI();
            this.metrics.LJJJJJL();
            this.metrics.LJJ();
            return responseWithInterceptorChain;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                this.requestException = th;
                this.metrics.LJLILLLLZI.LJ.LIZLLL = new WeakReference<>(th);
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                InterfaceC1489890osF interfaceC1489890osF3 = sThrottleControl;
                if (interfaceC1489890osF3 != null) {
                    interfaceC1489890osF3.LIZLLL(this.delayRequest);
                }
                this.metrics.LJI();
                this.metrics.LJJJJJL();
                this.metrics.LJJ();
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC1339100kx2
    public Object getRequestInfo() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            return callServerInterceptor.getRequestInfo();
        }
        return null;
    }

    @Override // X.C0X9S
    public boolean isCanceled() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        return callServerInterceptor != null && callServerInterceptor.isCanceled();
    }

    public Boolean isStreaming() {
        return Boolean.valueOf(this.requestFactory.isResponseStreaming);
    }

    @Override // X.C0X9S
    public Request request() {
        Request request;
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null && (request = callServerInterceptor.request()) != null) {
            return request;
        }
        ensureOriginalRequestCreated();
        return this.originalRequest;
    }

    public C0X52 getResponseWithInterceptorChain() {
        Logger.debug();
        LinkedList linkedList = new LinkedList();
        InterfaceC1490310osv interfaceC1490310osv = sRequestFlagHandler;
        if (interfaceC1490310osv != null) {
            Request requestLIZ = this.originalRequest;
            C1490240oso c1490240oso = (C1490240oso) interfaceC1490310osv;
            c1490240oso.getClass();
            if (requestLIZ != null) {
                if (requestLIZ.getExtraInfo() instanceof C1494160oz8) {
                    int i = ((C1494160oz8) requestLIZ.getExtraInfo()).LJIL;
                    Logger.debug();
                    if (i > 0) {
                        requestLIZ.setCommonParamLevel(Math.max(requestLIZ.getCommonParamLevel(), i));
                    }
                }
                if (c1490240oso.LIZIZ.get()) {
                    Iterator it2 = ((CopyOnWriteArrayList) c1490240oso.LIZ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1490350osz c1490350osz = (C1490350osz) it2.next();
                        Iterator it3 = ((ArrayList) c1490350osz.LIZJ).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (C2088908Gh.LIZIZ(requestLIZ.getHost(), (String) it3.next())) {
                                    List<String> list = c1490350osz.LIZLLL;
                                    if (list != null) {
                                        Iterator it4 = ((ArrayList) list).iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                String str = (String) it4.next();
                                                if (requestLIZ.getPath() != null && requestLIZ.getPath().startsWith(str)) {
                                                    if (requestLIZ.getExtraInfo() == null) {
                                                        C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                                                        c0xmbNewBuilder.LJIIJJI = new C1494160oz8();
                                                        requestLIZ = c0xmbNewBuilder.LIZ();
                                                    }
                                                    if (requestLIZ.getExtraInfo() instanceof C1494160oz8) {
                                                        C1494160oz8 c1494160oz8 = (C1494160oz8) requestLIZ.getExtraInfo();
                                                        c1494160oz8.LJIILJJIL |= c1490350osz.LIZ;
                                                        c1494160oz8.LJIIJJI = c1490350osz.LIZIZ | c1494160oz8.LJIIJJI;
                                                        C0XMB c0xmbNewBuilder2 = requestLIZ.newBuilder();
                                                        c0xmbNewBuilder2.LJIIJJI = c1494160oz8;
                                                        requestLIZ = c0xmbNewBuilder2.LIZ();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (requestLIZ.getExtraInfo() instanceof C1494160oz8) {
                        int i2 = ((C1494160oz8) requestLIZ.getExtraInfo()).LJIIJJI;
                        boolean z = (i2 & 512) > 0;
                        boolean z2 = (i2 & 1024) > 0;
                        if (z || z2) {
                            C0XMB c0xmbNewBuilder3 = requestLIZ.newBuilder();
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(requestLIZ.getHeaders());
                            if (z) {
                                arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
                            }
                            if (z2) {
                                arrayList.add(new C080U("x-tt-bypass-dp", "1"));
                            }
                            c0xmbNewBuilder3.LIZJ = arrayList;
                            requestLIZ = c0xmbNewBuilder3.LIZ();
                        }
                    }
                }
            }
            this.originalRequest = requestLIZ;
        }
        if (shouldAddInterceptors(this.originalRequest)) {
            linkedList.addAll(this.requestFactory.interceptors);
        }
        linkedList.add(this.callServerInterceptor);
        if (Logger.debug()) {
            this.originalRequest = addDebugMetricsInfoToRequest(this.originalRequest);
        }
        C1494590ozp c1494590ozp = new C1494590ozp(linkedList, 0, this.originalRequest, this);
        C0X52 c0x52LIZJ = C1494590ozp.LJFF ? c1494590ozp.LIZJ(this.originalRequest) : c1494590ozp.LIZ(this.originalRequest);
        c0x52LIZJ.LIZLLL = this.metrics;
        return c0x52LIZJ;
    }

    public C1494570ozn getRetrofitMetrics() {
        return this.metrics;
    }

    private Request addDebugMetricsInfoToRequest(Request request) {
        if (request.getMetrics().LJJII >= 0) {
            C0XMB c0xmbNewBuilder = request.newBuilder();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(request.getHeaders());
            arrayList.add(new C080U("state-delay", String.valueOf(request.getMetrics().LJJII)));
            c0xmbNewBuilder.LIZJ = arrayList;
            return c0xmbNewBuilder.LIZ();
        }
        return request;
    }

    public static C0X52 com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute(SsHttpCall ssHttpCall) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0X52<T> c0x52Com_bytedance_retrofit2_SsHttpCall__execute$___twin___ = ssHttpCall.com_bytedance_retrofit2_SsHttpCall__execute$___twin___();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String str = "";
            try {
                Field declaredField = C0X52.class.getDeclaredField("LIZ");
                declaredField.setAccessible(true);
                str = ((C2175508fh) declaredField.get(c0x52Com_bytedance_retrofit2_SsHttpCall__execute$___twin___)).LIZ;
                Uri uri = UriProtector.parse(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", uri.getPath());
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                C793770VBv.LJII("ttlive_network_main_thread", jSONObject, null, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C805380Via.LJ("core_java_custom_exception_monitor", "do network IO on UI thread，url=" + str + "，duration=" + ((jCurrentTimeMillis2 / 100) * 100), new Throwable());
            return c0x52Com_bytedance_retrofit2_SsHttpCall__execute$___twin___;
        }
        return ssHttpCall.com_bytedance_retrofit2_SsHttpCall__execute$___twin___();
    }

    public static void setPriorityControl(InterfaceC725990Sdp interfaceC725990Sdp) {
        sPriorityControl = interfaceC725990Sdp;
    }

    public static void setRequestFlagHandler(InterfaceC1490310osv interfaceC1490310osv) {
        sRequestFlagHandler = interfaceC1490310osv;
    }

    public static void setThrottleControl(InterfaceC1489890osF interfaceC1489890osF) {
        sThrottleControl = interfaceC1489890osF;
    }

    private boolean shouldAddInterceptors(Request request) {
        if (request.isPureRequest()) {
            return false;
        }
        InterfaceC1490310osv interfaceC1490310osv = sRequestFlagHandler;
        if (interfaceC1490310osv != null) {
            interfaceC1490310osv.getClass();
            if (request.getExtraInfo() instanceof C1494160oz8) {
                int i = ((C1494160oz8) request.getExtraInfo()).LJIIJJI;
                if ((i & 256) > 0 || (i & 512) > 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ozm, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0X9S
    public void enqueue(final InterfaceC594300NSq<T> interfaceC594300NSq) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400205, "com/bytedance/retrofit2/SsHttpCall", "enqueue", this, new Object[]{interfaceC594300NSq}, "void", new C0WZW(false, "(Lcom/bytedance/retrofit2/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyWY6+XRXBuTsTGj4Nbh9yUF1ICPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            interfaceC594300NSq = (InterfaceC594300NSq) obj;
        }
        if (interfaceC594300NSq != null) {
            if (!isExecuted()) {
                this.metrics.LJJJJL(true);
                ?? r3 = new InterfaceRunnableC1490390ot3(interfaceC594300NSq) { // from class: X.0ozm
                    public final InterfaceC594300NSq<T> LL;
                    public final C09SW LLILLJJLI;

                    @Override // X.InterfaceRunnableC1490390ot3
                    public final int LLI() {
                        return 0;
                    }

                    @Override // X.InterfaceRunnableC1490390ot3
                    public final boolean LJIILLIIL() {
                        return this.LLILLL.isStreaming().booleanValue();
                    }

                    @Override // X.InterfaceRunnableC1490390ot3
                    public final C1494570ozn LJJJZ() {
                        return this.LLILLL.getRetrofitMetrics();
                    }

                    @Override // X.InterfaceRunnableC1490390ot3
                    public final int priority() {
                        Request request;
                        InterfaceC725990Sdp interfaceC725990Sdp = SsHttpCall.sPriorityControl;
                        if (interfaceC725990Sdp != null && (request = this.LLILLL.originalRequest) != null) {
                            return interfaceC725990Sdp.LIZ(this.LLILLL.requestFactory.priorityLevel, request.getPath());
                        }
                        SsHttpCall ssHttpCall = this.LLILLL;
                        Request request2 = ssHttpCall.originalRequest;
                        return request2 != null ? request2.getPriorityLevel() : ssHttpCall.requestFactory.priorityLevel;
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0X52 responseWithInterceptorChain;
                        try {
                            this.LLILLL.metrics.LJJIJL();
                            responseWithInterceptorChain = this.LLILLL.getResponseWithInterceptorChain();
                            InterfaceC1489890osF interfaceC1489890osF = SsHttpCall.sThrottleControl;
                            if (interfaceC1489890osF != null) {
                                interfaceC1489890osF.LIZLLL(this.LLILLL.delayRequest);
                            }
                            this.LLILLL.metrics.LJI();
                            this.LLILLL.metrics.LJIILJJIL();
                        } catch (Throwable th) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                SsHttpCall ssHttpCall = this.LLILLL;
                                ssHttpCall.requestException = th;
                                ssHttpCall.metrics.LJLILLLLZI.LJ.LIZLLL = new WeakReference<>(th);
                                InterfaceC1489890osF interfaceC1489890osF2 = SsHttpCall.sThrottleControl;
                                if (interfaceC1489890osF2 != null) {
                                    interfaceC1489890osF2.LIZLLL(this.LLILLL.delayRequest);
                                }
                                this.LLILLL.metrics.LJI();
                                this.LLILLL.metrics.LJIILJJIL();
                                try {
                                    SsHttpCall ssHttpCall2 = this.LLILLL;
                                    Throwable th2 = ssHttpCall2.requestException;
                                    if (th2 != null) {
                                        try {
                                            this.LL.onFailure(ssHttpCall2, th2);
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                        }
                                    } else {
                                        LIZ(null);
                                    }
                                } finally {
                                }
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                InterfaceC1489890osF interfaceC1489890osF3 = SsHttpCall.sThrottleControl;
                                if (interfaceC1489890osF3 != null) {
                                    interfaceC1489890osF3.LIZLLL(this.LLILLL.delayRequest);
                                }
                                this.LLILLL.metrics.LJI();
                                this.LLILLL.metrics.LJIILJJIL();
                                try {
                                    SsHttpCall ssHttpCall3 = this.LLILLL;
                                    Throwable th5 = ssHttpCall3.requestException;
                                    if (th5 != null) {
                                        try {
                                            this.LL.onFailure(ssHttpCall3, th5);
                                        } catch (Throwable th6) {
                                            TryCatchGuardChecker.doCheck(th6);
                                        }
                                    } else {
                                        LIZ(null);
                                    }
                                    this.LLILLL.metrics.LJIILIIL();
                                    this.LLILLL.metrics.LJJ();
                                    throw th4;
                                } catch (Throwable th7) {
                                    TryCatchGuardChecker.doCheck(th7);
                                    this.LLILLL.metrics.LJIILIIL();
                                    throw th7;
                                }
                            }
                        }
                        try {
                            SsHttpCall ssHttpCall4 = this.LLILLL;
                            Throwable th8 = ssHttpCall4.requestException;
                            if (th8 != null) {
                                try {
                                    this.LL.onFailure(ssHttpCall4, th8);
                                } catch (Throwable th9) {
                                    TryCatchGuardChecker.doCheck(th9);
                                }
                            } else {
                                LIZ(responseWithInterceptorChain);
                            }
                            this.LLILLL.metrics.LJIILIIL();
                            this.LLILLL.metrics.LJJ();
                        } finally {
                        }
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v3 boolean
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                        */
                    public final void LIZ(X.C0X52<T> r3) {
                        /*
                            r2 = this;
                            X.0NSq<T> r1 = r2.LL     // Catch: java.lang.Throwable -> L11
                            com.bytedance.retrofit2.SsHttpCall r0 = r2.LLILLL     // Catch: java.lang.Throwable -> L11
                            r1.onResponse(r0, r3)     // Catch: java.lang.Throwable -> L11
                            X.09SW r1 = r2.LLILLJJLI     // Catch: java.lang.Throwable -> L11
                            if (r1 == 0) goto L15
                            com.bytedance.retrofit2.SsHttpCall r0 = r2.LLILLL     // Catch: java.lang.Throwable -> L11
                            r1.onAsyncResponse(r0, r3)     // Catch: java.lang.Throwable -> L11
                            return
                        L11:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L15:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1494560ozm.LIZ(X.0X52):void");
                    }

                    {
                        C09SW c09sw;
                        this.LL = interfaceC594300NSq;
                        if (interfaceC594300NSq instanceof C09SW) {
                            c09sw = (C09SW) interfaceC594300NSq;
                        } else {
                            c09sw = null;
                        }
                        this.LLILLJJLI = c09sw;
                    }
                };
                try {
                    ensureOriginalRequestCreated();
                    InterfaceC1489890osF interfaceC1489890osF = sThrottleControl;
                    if (interfaceC1489890osF != null) {
                        Request requestLIZ = interfaceC1489890osF.LIZ(this.originalRequest);
                        this.originalRequest = requestLIZ;
                        this.delayRequest = requestLIZ;
                        if (sThrottleControl.LIZIZ(requestLIZ, this.requestFactory.httpExecutor, r3)) {
                            this.metrics.LJJJJJL();
                            if (this.requestException != null) {
                                this.metrics.LJIL();
                                this.metrics.LJJ();
                                return;
                            }
                            return;
                        }
                    }
                    this.requestFactory.httpExecutor.execute(r3);
                    this.metrics.LJJJJJL();
                    if (this.requestException == null) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        this.requestException = th;
                        this.metrics.LJLILLLLZI.LJ.LIZLLL = new WeakReference<>(th);
                        this.metrics.LJIILJJIL();
                        try {
                            interfaceC594300NSq.onFailure(this, th);
                            this.metrics.LJIILIIL();
                            InterfaceC1489890osF interfaceC1489890osF2 = sThrottleControl;
                            if (interfaceC1489890osF2 != null) {
                                interfaceC1489890osF2.LIZLLL(this.delayRequest);
                            }
                            this.metrics.LJJJJJL();
                            if (this.requestException == null) {
                                return;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            this.metrics.LJIILIIL();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        this.metrics.LJJJJJL();
                        if (this.requestException != null) {
                            this.metrics.LJIL();
                            this.metrics.LJJ();
                        }
                        throw th3;
                    }
                }
                this.metrics.LJIL();
                this.metrics.LJJ();
                return;
            }
            throw new IllegalStateException("Already executed.");
        }
        throw new NullPointerException("callback == null");
    }

    public boolean setThrottleNetSpeed(long j) {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            return callServerInterceptor.setThrottleNetSpeed(j);
        }
        return false;
    }

    public T toResponseBody(TypedInput typedInput) {
        return (T) this.requestFactory.toResponse(typedInput);
    }

    public SsHttpCall(RequestFactory<T> requestFactory, Object[] objArr) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(requestFactory);
        C1494570ozn retrofitMetrics = requestFactory.getRetrofitMetrics();
        retrofitMetrics.getClass();
        C1494570ozn c1494570ozn = new C1494570ozn();
        c1494570ozn.LJIJJ = retrofitMetrics.LJIJJ;
        c1494570ozn.LJIIL = retrofitMetrics.LJIILIIL;
        c1494570ozn.LJIJ = retrofitMetrics.LJIJ;
        c1494570ozn.LJIJI = retrofitMetrics.LJIJI;
        C1494580ozo c1494580ozo = c1494570ozn.LJLILLLLZI;
        C1494700p00 c1494700p00 = c1494580ozo.LIZ;
        C1494580ozo c1494580ozo2 = retrofitMetrics.LJLILLLLZI;
        C1494700p00 c1494700p002 = c1494580ozo2.LIZ;
        c1494700p00.LJ = c1494700p002.LJ;
        c1494700p00.LJFF = c1494700p002.LJFF;
        c1494700p00.LJI = c1494700p002.LJI;
        C1494670ozx c1494670ozx = c1494580ozo.LIZJ;
        C1494670ozx c1494670ozx2 = c1494580ozo2.LIZJ;
        c1494670ozx.LIZIZ = c1494670ozx2.LIZIZ;
        c1494670ozx.LIZJ = c1494670ozx2.LIZJ;
        this.metrics = c1494570ozn;
        c1494700p00.LJI = System.nanoTime();
    }

    public void cancelNormalRequest(boolean z, Throwable th, boolean z2) {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            callServerInterceptor.cancelNormalRequest(z, th, z2);
        }
    }
}
