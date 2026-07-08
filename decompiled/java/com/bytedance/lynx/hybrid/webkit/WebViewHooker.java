package com.bytedance.lynx.hybrid.webkit;

import X.C0WZX;
import X.C1BVM;
import X.C2202461BHw;
import X.C2204961BRm;
import X.C846490XIp;
import X.InterfaceC846530XIt;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewHooker {
    public static Class LIZ;
    public static Class LIZIZ;
    public static Field LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static long LJIIJJI;
    public static long LJIIL;
    public static Keva LJIILIIL;
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static boolean LJIIIIZZ = false;
    public static C846490XIp LJIIIZ = null;
    public static InterfaceC846530XIt LJIIJ = null;
    public static Class LJIILJJIL = null;
    public static final WeakHashMap<WebView, WeakReference<WebViewClient>> LJIILL = new WeakHashMap<>();
    public static final WeakHashMap<WebView, WeakReference<WebChromeClient>> LJIILLIIL = new WeakHashMap<>();
    public static boolean LJIIZILJ = true;

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class MyInvocationHandler implements InvocationHandler {
        public Object real;

        public Object getProxy() {
            Object objNewProxyInstance = null;
            if (this.real == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = this.real.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                Class<?>[] interfaces = superclass.getInterfaces();
                if (interfaces != null) {
                    arrayList.addAll(Arrays.asList(interfaces));
                }
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            if (clsArr.length == 0) {
                return null;
            }
            try {
                objNewProxyInstance = Proxy.newProxyInstance(this.real.getClass().getClassLoader(), clsArr, this);
                return objNewProxyInstance;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return objNewProxyInstance;
            }
        }

        public MyInvocationHandler(Object obj) {
            this.real = obj;
        }
    }

    public static void LIZJ() {
        try {
            LIZ = Class.forName("android.webkit.WebViewProvider");
            LIZIZ = Class.forName("android.webkit.WebViewFactory");
            Method method = LIZ.getMethod("setWebViewClient", WebViewClient.class);
            LJ = method;
            method.setAccessible(true);
            Method method2 = LIZ.getMethod("setWebChromeClient", WebChromeClient.class);
            LJFF = method2;
            method2.setAccessible(true);
            Field declaredField = LIZIZ.getDeclaredField("sProviderInstance");
            LIZJ = declaredField;
            declaredField.setAccessible(true);
            Method declaredMethod = LIZIZ.getDeclaredMethod("getProvider", new Class[0]);
            LIZLLL = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ() throws Throwable {
        LJIIJJI = System.currentTimeMillis();
        final Object objA0 = C2204961BRm.a0(LIZLLL, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH2MzfgA7DPkOrq3uiLw==", null));
        Object proxy = new MyInvocationHandler(objA0) { // from class: X.0XIu
            /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 212
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C846540XIu.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        }.getProxy();
        C846490XIp c846490XIp = LJIIIZ;
        if (c846490XIp != null) {
            c846490XIp.getClass();
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(LIZIZ, "sProviderLock");
            if (field == null) {
                throw new NullPointerException("getProviderLock reflection failed");
            }
            field.setAccessible(true);
            synchronized (field.get(null)) {
                try {
                    LIZJ.set(null, proxy);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            LIZJ.set(null, proxy);
        }
        LJIIIIZZ = true;
    }

    public static WebViewClient LIZ(WebView webView) {
        WeakReference<WebViewClient> weakReference = LJIILL.get(webView);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LIZLLL(C2202461BHw c2202461BHw) {
        int i = c2202461BHw.LL;
        if (i >= 0) {
            List<C2202461BHw>[] listArr = C2202461BHw.LLILZLL;
            List<C2202461BHw> arrayList = listArr[i];
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(c2202461BHw);
            listArr[c2202461BHw.LL] = arrayList;
        }
    }

    public static void LJ(C1BVM c1bvm) {
        int i = c1bvm.LL;
        if (i >= 0) {
            List<C1BVM>[] listArr = C1BVM.LLIZ;
            List<C1BVM> arrayList = listArr[i];
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(c1bvm);
            listArr[c1bvm.LL] = arrayList;
        }
    }
}
