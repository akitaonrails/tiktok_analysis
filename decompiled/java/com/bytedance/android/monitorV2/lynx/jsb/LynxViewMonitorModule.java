package com.bytedance.android.monitorV2.lynx.jsb;

import X.AbstractC1521830phl;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LQ;
import X.C1520220pfA;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520510pfd;
import X.C1520640pfq;
import X.C1520960pgM;
import X.C1520970pgN;
import X.C1521130pgd;
import X.C1521150pgf;
import X.C1521380ph2;
import X.C1521460phA;
import X.C1521590phN;
import X.C1521680phW;
import X.C1521850phn;
import X.EnumC1521260pgq;
import X.EnumC1521370ph1;
import X.InterfaceC1063790dmz;
import X.InterfaceC1521790phh;
import X.ViewOnAttachStateChangeListenerC1521210pgl;
import android.content.Context;
import android.view.View;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class LynxViewMonitorModule extends LynxModule implements InterfaceC1521790phh {
    public static final C1521850phn Companion = new Object() { // from class: X.0phn
    };
    public final C1521680phW module;

    public C1521680phW getModule() {
        return this.module;
    }

    private final JSONObject convertJson(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        try {
            return new JSONObject(readableMap.toHashMap());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
            return null;
        }
    }

    private final int getCanSample(ReadableMap readableMap) {
        int i = readableMap.getInt("level", 2);
        int i2 = readableMap.getInt("canSample", 1);
        boolean z = readableMap.getBoolean("canSample", true);
        if (readableMap.hasKey("level")) {
            return i;
        }
        if (!readableMap.hasKey("canSample") || (i2 != 0 && z)) {
            return 2;
        }
        return 0;
    }

    private final C1521460phA getError(ReadableMap readableMap) {
        C1521460phA c1521460phA = new C1521460phA();
        try {
            c1521460phA.LJI = "lynx_error_custom";
            c1521460phA.LJII = 201;
            c1521460phA.LJIIIIZZ = String.valueOf(convertJson(readableMap));
            return c1521460phA;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
            return c1521460phA;
        }
    }

    public LynxViewMonitorModule(Context context, Object obj) {
        super(context, obj);
        C1521680phW c1521680phW = new C1521680phW(obj, this);
        this.module = c1521680phW;
        c1521680phW.LIZLLL(EnumC1521370ph1.Init, new Object[0]);
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
    @InterfaceC1063790dmz
    public final void config(ReadableMap readableMap, Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "config", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSWMlBaZIbqLPzXYUUb2zuYN7Wyw9GN68UUsjUcMRk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        Object obj = readableMap;
        if (objArr != null) {
            Object obj2 = objArr[0];
            Object obj3 = readableMap;
            if (obj2 != null) {
                obj3 = obj2;
            }
            Object obj4 = objArr[1];
            obj = obj3;
            if (obj4 != null) {
                callback = (Callback) obj4;
                obj = obj3;
            }
        }
        C1521130pgd.LIZJ();
        this.module.LIZLLL(EnumC1521370ph1.Config, obj);
        if (callback != null) {
            callback.invoke(C1521680phW.LJI);
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
    @InterfaceC1063790dmz
    public final void customReport(ReadableMap readableMap, Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "customReport", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSWMlBaZIbqLPzXYUUb2zuYN7Wyw9GN68UUsjUcMRk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        Object obj = readableMap;
        if (objArr != null) {
            Object obj2 = objArr[0];
            Object obj3 = readableMap;
            if (obj2 != null) {
                obj3 = obj2;
            }
            Object obj4 = objArr[1];
            obj = obj3;
            if (obj4 != null) {
                callback = (Callback) obj4;
                obj = obj3;
            }
        }
        C1521130pgd.LIZJ();
        this.module.LIZLLL(EnumC1521370ph1.CustomReport, obj);
        if (callback != null) {
            callback.invoke(C1521680phW.LJI);
        }
    }

    @InterfaceC1063790dmz
    public final void getInfo(ReadableMap readableMap, Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "getInfo", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSWMlBaZIbqLPzXYUUb2zuYN7Wyw9GN68UUsjUcMRk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        C1521130pgd.LIZJ();
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString("sdk_version", "1.0-tiktok-monorepo");
            callback.invoke(javaOnlyMap);
        }
    }

    @Override // X.InterfaceC1521790phh
    public void onMethodInvoked(Object obj, Object[] objArr) throws JSONException {
        ReadableMap readableMap;
        ReadableMap readableMap2;
        ReadableMap readableMap3;
        LynxView lynxViewLIZIZ;
        C1521150pgf c1521150pgf;
        if (obj == EnumC1521370ph1.Init) {
            LynxView lynxViewLIZIZ2 = this.module.LIZIZ();
            if (lynxViewLIZIZ2 == null) {
                return;
            }
            LynxViewMonitor.Companion.getClass();
            ViewOnAttachStateChangeListenerC1521210pgl viewSession = LynxViewMonitor.INSTANCE.getViewSession((View) lynxViewLIZIZ2);
            if (viewSession != null) {
                C1521590phN.LIZ(viewSession);
                return;
            }
            return;
        }
        String templateUrl = null;
        if (obj == EnumC1521370ph1.Config) {
            Object objLJIL = C13LQ.LJIL(objArr);
            if (!(objLJIL instanceof ReadableMap) || (readableMap3 = (ReadableMap) objLJIL) == null || (lynxViewLIZIZ = this.module.LIZIZ()) == null) {
                return;
            }
            JSONObject jSONObjectLIZ = C1521380ph2.LIZ(convertJson(readableMap3));
            LynxViewMonitor.Companion.getClass();
            ViewOnAttachStateChangeListenerC1521210pgl viewSession2 = LynxViewMonitor.INSTANCE.getViewSession((View) lynxViewLIZIZ);
            if (viewSession2 != null && viewSession2.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewSession2.LLJIJIL) != null) {
                c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_ON_CONFIG, null);
                if (Intrinsics.LJFF("jsBase", "jsBase")) {
                    if (a0.LJJJIL(c1521150pgf.LLJI)) {
                        c1521150pgf.LJIIIIZZ(jSONObjectLIZ.optString("bid"));
                    }
                    if (a0.LJJJIL(c1521150pgf.LLIZ)) {
                        c1521150pgf.LJIIJ(jSONObjectLIZ.optString("pid"));
                    }
                    c1521150pgf.LLJJIII = C1520640pfq.LIZJ(c1521150pgf.LLJJIII, jSONObjectLIZ);
                    if (!a0.LJJJIL(c1521150pgf.LLJI)) {
                        C1520970pgN c1520970pgN = C1520970pgN.LIZ;
                        String str = c1521150pgf.LLJJJ;
                        String str2 = c1521150pgf.LLJI;
                        String str3 = c1521150pgf.LLIZ;
                        c1520970pgN.getClass();
                        C1520970pgN.LIZ(null, str, str2, str3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (obj == EnumC1521370ph1.CustomReport) {
            Object objLJIL2 = C13LQ.LJIL(objArr);
            if ((objLJIL2 instanceof ReadableMap) && (readableMap2 = (ReadableMap) objLJIL2) != null) {
                LynxView lynxViewLIZIZ3 = this.module.LIZIZ();
                C1520360pfO c1520360pfO = new C1520360pfO(readableMap2.getString("eventName", ""));
                c1520360pfO.LIZIZ = readableMap2.getString("bid");
                if (lynxViewLIZIZ3 != null) {
                    templateUrl = lynxViewLIZIZ3.getTemplateUrl();
                }
                c1520360pfO.LIZ = templateUrl;
                c1520360pfO.LIZLLL = convertJson(readableMap2.getMap("category"));
                c1520360pfO.LJ = convertJson(readableMap2.getMap("metrics"));
                c1520360pfO.LJFF = convertJson(readableMap2.getMap("extra"));
                c1520360pfO.LJI = convertJson(readableMap2.getMap("timing"));
                c1520360pfO.LIZIZ(getCanSample(readableMap2));
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor.INSTANCE.reportCustom(lynxViewLIZIZ3, c1520350pfNLIZ);
                return;
            }
            return;
        }
        if (obj == EnumC1521370ph1.ReportJsError) {
            Object objLJIL3 = C13LQ.LJIL(objArr);
            if ((objLJIL3 instanceof ReadableMap) && (readableMap = (ReadableMap) objLJIL3) != null) {
                C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("js_exception", null);
                C1521460phA error = getError(readableMap);
                c1520220pfALIZ.LJIILIIL = error;
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor.INSTANCE.reportError(this.module.LIZIZ(), error, c1520220pfALIZ);
            }
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
    @InterfaceC1063790dmz
    public final void reportJSError(ReadableMap readableMap, Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "reportJSError", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSWMlBaZIbqLPzXYUUb2zuYN7Wyw9GN68UUsjUcMRk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        Object obj = readableMap;
        if (objArr != null) {
            Object obj2 = objArr[0];
            Object obj3 = readableMap;
            if (obj2 != null) {
                obj3 = obj2;
            }
            Object obj4 = objArr[1];
            obj = obj3;
            if (obj4 != null) {
                callback = (Callback) obj4;
                obj = obj3;
            }
        }
        C1521130pgd.LIZJ();
        this.module.LIZLLL(EnumC1521370ph1.ReportJsError, obj);
        if (callback != null) {
            callback.invoke(C1521680phW.LJI);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0phL] */
    @InterfaceC1063790dmz
    public final void request(ReadableMap readableMap, final Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/android/monitorV2/lynx/jsb/LynxViewMonitorModule", "request", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSWMlBaZIbqLPzXYUUb2zuYN7Wyw9GN68UUsjUcMRk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        C1521130pgd.LIZJ();
        if (readableMap != null) {
            JSONObject jSONObjectConvertJson = convertJson(readableMap);
            if (jSONObjectConvertJson == null) {
                if (callback != null) {
                    com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap javaOnlyMap = C1521680phW.LJ;
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.putInt("errorCode", -1);
                    javaOnlyMap2.putString("errorMessage", "params is not json");
                    callback.invoke(javaOnlyMap2);
                    return;
                }
                return;
            }
            LynxView lynxViewLIZIZ = this.module.LIZIZ();
            if (lynxViewLIZIZ == null) {
                if (callback != null) {
                    com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap javaOnlyMap3 = C1521680phW.LJ;
                    JavaOnlyMap javaOnlyMap4 = new JavaOnlyMap();
                    javaOnlyMap4.putInt("errorCode", -1);
                    javaOnlyMap4.putString("errorMessage", "view is null");
                    callback.invoke(javaOnlyMap4);
                    return;
                }
                return;
            }
            LynxViewMonitor.Companion.getClass();
            ViewOnAttachStateChangeListenerC1521210pgl viewSession = LynxViewMonitor.INSTANCE.getViewSession((View) lynxViewLIZIZ);
            if (viewSession == null) {
                if (callback != null) {
                    com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap javaOnlyMap5 = C1521680phW.LJ;
                    JavaOnlyMap javaOnlyMap6 = new JavaOnlyMap();
                    javaOnlyMap6.putInt("errorCode", -1);
                    javaOnlyMap6.putString("errorMessage", "viewSession is null");
                    callback.invoke(javaOnlyMap6);
                    return;
                }
                return;
            }
            C1521590phN.LIZIZ(viewSession, jSONObjectConvertJson, new AbstractC1521830phl() { // from class: X.0phL
                @Override // X.AbstractC1521830phl
                public final void LIZ() {
                    Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.invoke(C1521680phW.LJII);
                    }
                }

                @Override // X.AbstractC1521830phl
                public final void LIZIZ() {
                    Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.invoke(C1521680phW.LJI);
                    }
                }
            });
            return;
        }
        if (callback != null) {
            callback.invoke(C1521680phW.LJII);
        }
    }
}
