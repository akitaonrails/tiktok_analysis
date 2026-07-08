package com.bytedance.pia.core.worker.binding;

import X.C1287700jc8;
import X.C1953107kv;
import X.C1BP4;
import X.C1BPD;
import X.C1BPP;
import X.C1BQN;
import X.C1BQX;
import X.C1C7U;
import X.C20190913zP;
import X.C2188811AlT;
import X.C2203961BNq;
import X.C2204041BNy;
import X.EnumC1535440q3i;
import X.InterfaceC1522160piI;
import X.InterfaceC1530550pvp;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.pia.core.worker.binding.BaseModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import com.ss.android.agilelogger.ALog;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BaseModule extends JSModule {
    public final ConcurrentLinkedQueue<JavaOnlyMap> localBridgeMessages;
    public final ConcurrentLinkedQueue<JavaOnlyMap> localMessages;
    public final C1BPD<ReadableMap> remoteBridgeMessages;
    public final C1BPD<ReadableMap> remoteMessages;
    public final C1BP4 worker;

    @InterfaceC1522160piI
    public WritableMap getBridgeMessage() {
        return this.localBridgeMessages.poll();
    }

    @InterfaceC1522160piI
    public WritableMap getGlobalProps() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("settings", new JavaOnlyMap());
        Map<String, ?> map = this.worker.LJIILL;
        if (map != null) {
            javaOnlyMap.put("businessProps", C1BQX.LIZIZ(GsonProtectorUtils.toJsonTree(GsonUtils.LIZ(), map).LJIILIIL()));
            return javaOnlyMap;
        }
        javaOnlyMap.put("businessProps", new JavaOnlyMap());
        return javaOnlyMap;
    }

    @InterfaceC1522160piI
    public String getHref() {
        return this.worker.LJIIJ.toString();
    }

    @InterfaceC1522160piI
    public WritableMap getMessage() {
        return this.localMessages.poll();
    }

    @InterfaceC1522160piI
    public String getUserAgent() {
        return this.worker.LJIIL;
    }

    @InterfaceC1522160piI
    public String getWorkerName() {
        return this.worker.LJI;
    }

    @InterfaceC1522160piI
    public void terminate() {
        this.worker.LJFF(null);
    }

    @InterfaceC1522160piI
    public boolean useNewMessagePort() {
        return C2203961BNq.LIZ().LIZ;
    }

    @InterfaceC1522160piI
    public void handleScript(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final View viewLJI = ((C2204041BNy) this.worker.LJIIZILJ).LJI();
        if (viewLJI instanceof WebView) {
            C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BQE
                @Override // java.lang.Runnable
                public final void run() {
                    BaseModule.lambda$handleScript$2(viewLJI, str);
                }
            });
        }
    }

    @InterfaceC1522160piI
    public void postBridgeMessage(ReadableMap readableMap) {
        if (readableMap != null) {
            this.remoteBridgeMessages.LIZ(readableMap);
        }
    }

    @InterfaceC1522160piI
    public void postMessage(ReadableMap readableMap) {
        if (readableMap != null) {
            this.remoteMessages.LIZ(readableMap);
            return;
        }
        throw new NullPointerException("message can not be null!");
    }

    public void sendWorkerBridgeMessage(JavaOnlyMap javaOnlyMap) {
        this.localBridgeMessages.offer(javaOnlyMap);
        this.worker.LIZIZ("globalThis.__PIA_NATIVE__.onWorkerBridgeMessage();");
    }

    public void sendWorkerMessage(JavaOnlyMap javaOnlyMap) {
        this.localMessages.offer(javaOnlyMap);
        this.worker.LIZIZ("globalThis.__PIA_NATIVE__.onWorkerMessage();");
    }

    public void setBridgeMessageHandle(InterfaceC1530550pvp<ReadableMap> interfaceC1530550pvp) {
        this.remoteBridgeMessages.LIZJ(interfaceC1530550pvp);
    }

    public void setMessageHandle(InterfaceC1530550pvp<ReadableMap> interfaceC1530550pvp) {
        this.remoteMessages.LIZJ(interfaceC1530550pvp);
    }

    @InterfaceC1522160piI
    public void terminateWithResult(ReadableMap readableMap) {
        if (readableMap == null) {
            this.worker.LJFF(null);
        } else {
            this.worker.LJFF(C1BQX.LIZLLL(readableMap));
        }
    }

    @InterfaceC1522160piI
    public void trace(String str) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    if (objOpt instanceof Number) {
                        this.worker.LJIIZILJ.LJIILJJIL.LIZJ(((Long) objOpt).longValue(), next);
                    } else {
                        this.worker.LJIIZILJ.LJIILJJIL.LIZ(objOpt, next);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public BaseModule(Context context, Object obj) {
        super(context, obj);
        this.remoteMessages = new C1BPD<>();
        this.localMessages = new ConcurrentLinkedQueue<>();
        this.remoteBridgeMessages = new C1BPD<>();
        this.localBridgeMessages = new ConcurrentLinkedQueue<>();
        this.worker = (C1BP4) obj;
    }

    public static void lambda$handleScript$2(View view, String str) {
        C1C7U.LIZ("BaseModule@6a70.handleScript$1L");
        C20190913zP.LIZIZ((WebView) view, str, null);
        C1C7U.LIZIZ("BaseModule@6a70.handleScript$1L");
    }

    public static /* synthetic */ void lambda$importScriptsAsync$0(Callback callback, String str) {
        if (callback != null) {
            callback.invoke(str);
        }
    }

    public static /* synthetic */ void lambda$importScriptsAsync$1(Callback callback, String str) {
        if (callback != null) {
            callback.invoke(str);
        }
    }

    @InterfaceC1522160piI
    public void log(String str, int i) {
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(this.worker.LJII);
                            sbLIZ.append(str);
                            C1BPP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(this.worker.LJII);
                            sbLIZ2.append(str);
                            C1BPP.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(this.worker.LJII);
                        sbLIZ3.append(str);
                        C1BPP.LJII(6, C2188811AlT.LIZIZ(sbLIZ3), null);
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.worker.LJII);
                    sbLIZ4.append(str);
                    C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(this.worker.LJII);
                sbLIZ5.append(str);
                String strLIZLLL = C1BPP.LIZLLL(C2188811AlT.LIZIZ(sbLIZ5));
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZLLL);
                sbLIZ6.append(Log.getStackTraceString(null));
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PiaCore", C2188811AlT.LIZIZ(sbLIZ6));
            }
            ((C2204041BNy) this.worker.LJIIZILJ).LJIIJJI("event-on-worker-log", str, Integer.valueOf(i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1BPP.LJII(4, "Worker invoke log error:", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BQ9] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.1BQ8] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0pvp, X.1BPY] */
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
    @InterfaceC1522160piI
    public void importScriptsAsync(final String str, final Callback callback, final Callback callback2) {
        final C1BP4 c1bp4 = this.worker;
        final ?? r10 = new InterfaceC1530550pvp() { // from class: X.1BQ8
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                BaseModule.lambda$importScriptsAsync$0(callback, (String) obj);
            }
        };
        final ?? r0 = new InterfaceC1530550pvp() { // from class: X.1BQ9
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                BaseModule.lambda$importScriptsAsync$1(callback2, (String) obj);
            }
        };
        c1bp4.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final ?? r12 = new InterfaceC1530550pvp() { // from class: X.1BPY
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                String string;
                C1BP4 c1bp42 = c1bp4;
                InterfaceC1530550pvp interfaceC1530550pvp = r0;
                Throwable th = (Throwable) obj;
                c1bp42.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1bp42.LJII);
                sbLIZ.append("load script async error:");
                C1BPP.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), th);
                if (th != null) {
                    string = th.toString();
                } else {
                    string = "";
                }
                interfaceC1530550pvp.accept(string);
            }
        };
        InterfaceC1530550pvp interfaceC1530550pvp = new InterfaceC1530550pvp() { // from class: X.1BP8
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                C1BP4 c1bp42 = c1bp4;
                long j = jCurrentTimeMillis;
                InterfaceC1530550pvp interfaceC1530550pvp2 = r10;
                String str2 = str;
                InterfaceC1530550pvp interfaceC1530550pvp3 = r12;
                InterfaceC1532650pzD interfaceC1532650pzD = (InterfaceC1532650pzD) obj;
                c1bp42.getClass();
                try {
                    String strLIZ = C21346518gJ.LIZ(interfaceC1532650pzD);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                    c1bp42.LJIILIIL.evaluateJavaScript(strLIZ);
                    interfaceC1530550pvp2.accept(String.valueOf(jCurrentTimeMillis2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1287750jcD c1287750jcD = c1bp42.LJIIZILJ.LJII;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("url=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", error=");
                    sbLIZ.append(Log.getStackTraceString(th));
                    c1287750jcD.LIZIZ("worker", -6, C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC1530550pvp3.accept(th);
                }
            }
        };
        if (TextUtils.isEmpty(str)) {
            c1bp4.LJIIZILJ.LJII.LIZIZ("worker", -2, "script url is empty.");
            r12.accept(new RuntimeException("invalid url"));
        }
        Uri uri = UriProtector.parse(str);
        if (!C1953107kv.LIZIZ(uri)) {
            c1bp4.LJIIZILJ.LJII.LIZIZ("worker", -2, uri.toString());
            r12.accept(new RuntimeException("invalid url"));
        }
        c1bp4.LJIIJJI.LIZIZ(EnumC1535440q3i.Auto, new C1BQN(uri), interfaceC1530550pvp, r12);
    }
}
