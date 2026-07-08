package com.ss.ttvideoengine.model;

import X.C1467530oIB;
import X.C1469810oLr;
import X.C1471660oOq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C795730VJj;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.model.IntertrustDrmHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import okhttp3.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class IntertrustDrmHelper {
    public Class<?> LIZ;
    public Object LIZIZ;
    public Object LIZJ;
    public Object LIZLLL;
    public final C1469810oLr LJ = new C1469810oLr();
    public C1467530oIB LJFF;
    public Handler LJI;

    public final void LIZLLL() {
        int i = C2187451AjH.LIZ;
        TTVideoEngineLog.d("IntertrustDrmHelper", "stop enter");
        if (this.LIZIZ == null) {
            return;
        }
        try {
            if (this.LIZ == null) {
                this.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            ((Integer) this.LIZ.getDeclaredMethod("stop", new Class[0]).invoke(this.LIZIZ, new Object[0])).intValue();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("class not found:");
            sbLIZ.append(e.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("method invoke failied:");
            sbLIZ2.append(e2.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("method not found:");
            sbLIZ3.append(e3.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("method invoke failied:");
            sbLIZ4.append(e4.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public class MyHandler extends BPEAHandler {
        public final WeakReference<IntertrustDrmHelper> LL;

        /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r15) {
            /*
                Method dump skipped, instruction units count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.model.IntertrustDrmHelper.MyHandler.handleMessage(android.os.Message):void");
        }

        public MyHandler(IntertrustDrmHelper intertrustDrmHelper, Looper looper) {
            super(looper);
            this.LL = new WeakReference<>(intertrustDrmHelper);
        }
    }

    public final void LIZJ(String str) {
        int i = C2187451AjH.LIZ;
        TTVideoEngineLog.d("IntertrustDrmHelper", "setTokenUrlTemplate enter");
        if (this.LIZIZ == null) {
            return;
        }
        try {
            if (this.LIZ == null) {
                this.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            this.LIZ.getDeclaredMethod("setTokenUrlTemplate", String.class).invoke(this.LIZIZ, str);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("class not found:");
            sbLIZ.append(e.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("method invoke failied:");
            sbLIZ2.append(e2.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("method not found:");
            sbLIZ3.append(e3.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("method invoke failied:");
            sbLIZ4.append(e4.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final int LIZ(int i, Context context) {
        Object objInvoke;
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("IntertrustDrmHelper", "init enter");
        try {
            Class<?> cls = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            this.LIZ = cls;
            this.LIZIZ = cls.newInstance();
            Class<?> cls2 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyListener");
            this.LIZJ = Proxy.newProxyInstance(IntertrustDrmHelper.class.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: X.0oJ7
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    int iIntValue;
                    String string;
                    int i3 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("IntertrustDrmHelper", "intertrust listener invoke");
                    String name = method.getName();
                    if (name.equals("onTokenProcessed")) {
                        IntertrustDrmHelper intertrustDrmHelper = this.LL;
                        C786410Ut5.LJLJJL(intertrustDrmHelper.LJI, intertrustDrmHelper.LJI.obtainMessage(0));
                        return null;
                    }
                    if (name.equals("onError")) {
                        Object obj2 = objArr[0];
                        int iIntValue2 = -1;
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        } else {
                            iIntValue = -1;
                        }
                        Object obj3 = objArr[1];
                        if (obj3 != null) {
                            iIntValue2 = ((Integer) obj3).intValue();
                        }
                        Object obj4 = objArr[2];
                        if (obj4 != null) {
                            string = obj4.toString();
                        } else {
                            string = "";
                        }
                        if (iIntValue == -600000) {
                            iIntValue = -9935;
                        } else if (iIntValue == -600001) {
                            iIntValue = -9934;
                        }
                        IntertrustDrmHelper intertrustDrmHelper2 = this.LL;
                        C786410Ut5.LJLJJL(intertrustDrmHelper2.LJI, intertrustDrmHelper2.LJI.obtainMessage(1, new e("kTTVideoErrorDomainIntertrustDRM", iIntValue, iIntValue2, string)));
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalid method name:");
                    sbLIZ.append(name);
                    TTVideoEngineLog.w("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
            });
            this.LIZ.getDeclaredMethod("setListener", cls2).invoke(this.LIZIZ, this.LIZJ);
            Class<?> cls3 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyNetworkClient");
            this.LIZLLL = Proxy.newProxyInstance(IntertrustDrmHelper.class.getClassLoader(), new Class[]{cls3}, new InvocationHandler() { // from class: X.0oLh
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    String string;
                    Map map;
                    int i3 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("IntertrustDrmHelper", "network listener invoke");
                    String name = method.getName();
                    if (name.equals("startTask")) {
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            string = obj2.toString();
                        } else {
                            string = "";
                        }
                        Object obj3 = objArr[1];
                        if (obj3 != null) {
                            map = (Map) obj3;
                        } else {
                            map = null;
                        }
                        Object obj4 = objArr[2];
                        IntertrustDrmHelper intertrustDrmHelper = this.LL;
                        C1469810oLr c1469810oLr = intertrustDrmHelper.LJ;
                        final C1468100oJ6 c1468100oJ6 = new C1468100oJ6(intertrustDrmHelper);
                        c1469810oLr.getClass();
                        synchronized (C1469810oLr.class) {
                            try {
                                C1469810oLr.LJFF();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C0X33 c0x33 = new C0X33();
                        c0x33.LJII(string);
                        if (map != null && map.size() > 0) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (entry.getKey() != null && entry.getValue() != null) {
                                    c0x33.LIZ((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                        }
                        C1495520p1K c1495520p1K = C1469810oLr.LIZJ;
                        Request requestLIZIZ = c0x33.LIZIZ();
                        c1495520p1K.getClass();
                        C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1K, requestLIZIZ, false);
                        c1469810oLr.LIZ = c1495500p1ILIZJ;
                        C2204961BRm.i0(c1495500p1ILIZJ, new InterfaceC1495610p1T() { // from class: X.0oLo
                            @Override // X.InterfaceC1495610p1T
                            public final void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                                int i4 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("startTask onFailure: ");
                                sbLIZ.append(iOException.toString());
                                TTVideoEngineLog.d("TTHTTPNetwork", C2188811AlT.LIZIZ(sbLIZ));
                                ((C1468100oJ6) c1468100oJ6).LIZ(new e("", -9994, 0, iOException.toString()), null);
                            }

                            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x005d
                                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                                */
                            @Override // X.InterfaceC1495610p1T
                            public final void onResponse(X.InterfaceC1495580p1Q r9, X.C0XLY r10) {
                                /*
                                    r8 = this;
                                    r7 = 0
                                    X.0X3h r3 = r10.LLIZ     // Catch: java.lang.Throwable -> L5d
                                    java.lang.String r6 = r3.string()     // Catch: java.lang.Throwable -> L5a
                                    int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L5a
                                    java.lang.String r2 = "TTHTTPNetwork"
                                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5a
                                    java.lang.String r0 = "startTask onResponse body:"
                                    r1.append(r0)     // Catch: java.lang.Throwable -> L5a
                                    r1.append(r6)     // Catch: java.lang.Throwable -> L5a
                                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5a
                                    com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)     // Catch: java.lang.Throwable -> L5a
                                    boolean r0 = r10.LIZIZ()     // Catch: java.lang.Throwable -> L5a
                                    if (r0 != 0) goto L29
                                    java.lang.String r5 = r10.LLILZ     // Catch: java.lang.Throwable -> L5a
                                    int r4 = r10.LLILLL     // Catch: java.lang.Throwable -> L5a
                                    goto L2b
                                L29:
                                    r4 = -1
                                    r5 = r7
                                L2b:
                                    r3.close()
                                    if (r5 != 0) goto L38
                                    X.0oJ8 r0 = r1
                                    X.0oJ6 r0 = (X.C1468100oJ6) r0
                                    r0.LIZ(r7, r6)
                                    return
                                L38:
                                    java.lang.String r3 = ""
                                    r2 = -9979(0xffffffffffffd905, float:NaN)
                                    if (r4 != r2) goto L4b
                                    X.0oJ8 r1 = r1
                                    fyo.e r0 = new fyo.e
                                    r0.<init>(r3, r2, r4, r5)
                                    X.0oJ6 r1 = (X.C1468100oJ6) r1
                                    r1.LIZ(r0, r7)
                                    return
                                L4b:
                                    X.0oJ8 r2 = r1
                                    fyo.e r1 = new fyo.e
                                    r0 = -9994(0xffffffffffffd8f6, float:NaN)
                                    r1.<init>(r3, r0, r4, r5)
                                    X.0oJ6 r2 = (X.C1468100oJ6) r2
                                    r2.LIZ(r1, r6)
                                    return
                                L5a:
                                    r0 = move-exception
                                    r7 = r3
                                    goto L5e
                                L5d:
                                    r0 = move-exception
                                L5e:
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
                                    if (r7 == 0) goto L66
                                    r7.close()
                                L66:
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1469780oLo.onResponse(X.0p1Q, X.0XLY):void");
                            }
                        }, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFu8ec22iEfgwxRclxcM6/Ouk=", null));
                        return null;
                    }
                    if (name.equals("cancel")) {
                        this.LL.LJ.LIZ();
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalid method name:");
                    sbLIZ.append(name);
                    TTVideoEngineLog.w("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
            });
            this.LIZ.getDeclaredMethod("setNetworkClient", cls3).invoke(this.LIZIZ, this.LIZLLL);
            if (i == 0) {
                objInvoke = this.LIZ.getDeclaredMethod("init", Context.class).invoke(this.LIZIZ, context);
            } else {
                objInvoke = this.LIZ.getDeclaredMethod("init", Context.class, Integer.TYPE).invoke(this.LIZIZ, context, Integer.valueOf(i));
            }
            this.LJI = new MyHandler(this, C795730VJj.LJII());
            return ((Integer) objInvoke).intValue();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("class not found:");
            sbLIZ.append(e.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
            return -1002;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("illegal access exception:");
            sbLIZ2.append(e2.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("instance failed+");
            sbLIZ3.append(e3.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ3));
            return -1;
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("method not found:");
            sbLIZ4.append(e4.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ4));
            return -1;
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("invoke failed:");
            sbLIZ5.append(e5.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ5));
            return -1;
        }
    }

    public final int LIZIZ(int i, String str, String str2) {
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("IntertrustDrmHelper", "processToken enter");
        if (this.LIZIZ == null) {
            return -1;
        }
        try {
            if (this.LIZ == null) {
                this.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.LIZ.getDeclaredMethod("processToken", Integer.TYPE, String.class, String.class).invoke(this.LIZIZ, Integer.valueOf(i), str, str2)).intValue();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("class not found:");
            sbLIZ.append(e.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
            return -1;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("method invoke failied:");
            sbLIZ2.append(e2.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("method not found:");
            sbLIZ3.append(e3.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ3));
            return -1;
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("method invoke failied:");
            sbLIZ4.append(e4.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ4));
            return -1;
        }
    }
}
