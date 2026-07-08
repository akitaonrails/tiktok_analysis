package com.bytedance.pumbaa.hybrid.impl.jsb;

import X.C098200Yq;
import X.C0WLA;
import X.C0WOC;
import X.C0WOJ;
import X.C0WOK;
import X.C0WON;
import X.C0WOO;
import X.C13LQ;
import X.C189200o6;
import X.C19719512Dh;
import X.C1BVM;
import X.C2188811AlT;
import X.C2348209Ia;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class BridgeHookDispatcher {
    public static final BridgeHookDispatcher INSTANCE = new BridgeHookDispatcher();
    public static List<C0WON> chain = new ArrayList();
    public static C0WOC config;
    public static C0WOJ webBridgeManager;

    public final void hookCallback(Object obj, Object... objArr) {
    }

    public final List<C0WON> getChain() {
        return chain;
    }

    public final C0WOC getConfig$com_bytedance_pumbaa_hybrid_hook_impl() {
        return config;
    }

    public final void registerBridgeInterceptor(C0WON c0won) {
        chain.add(c0won);
    }

    public final void removeBridgeInterceptor(C0WON c0won) {
        chain.remove(c0won);
    }

    public final void setChain(List<C0WON> list) {
        chain = list;
    }

    public final void setConfig$com_bytedance_pumbaa_hybrid_hook_impl(C0WOC c0woc) {
        config = c0woc;
    }

    public final void updateSettings(C0WOC c0woc) {
        config = c0woc;
    }

    public final void hookWebCallback(String str, ValueCallback<String> valueCallback) {
        Object c098200Yq;
        C0WOJ c0woj = webBridgeManager;
        if (c0woj != null && str != null) {
            try {
                if (u.LJJIIJZLJL(str, "javascript:", false) && !a0.LJJIIZI(str, "__event_id", false) && a0.LJJIIZI(str, "__callback_id", false) && a0.LJJIIZI(str, "__params", false) && a0.LJJIIZI(str, "__msg_type", false)) {
                    if (a0.LJJIIZI(str, "_handleMessageFromApp(", false)) {
                        c0woj.LIZIZ(str, "_handleMessageFromApp(", ")");
                    } else if (a0.LJJIIZI(str, "_handleMessageFromToutiao(", false)) {
                        c0woj.LIZIZ(str, "_handleMessageFromToutiao(", ")");
                    } else if (a0.LJJIIZI(str, "iframe.contentWindow.postMessage(", false)) {
                        c0woj.LIZIZ(str, "iframe.contentWindow.postMessage(", "atob(");
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onWebBridgeCallback error: ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                sbLIZ.append(", stack: ");
                sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final void init(List<C0WON> list, final C0WOC c0woc) {
        config = c0woc;
        chain.addAll(list);
        WebViewHooker.LJ(new C1BVM() { // from class: com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher.init.1
            @Override // X.C1BVM
            public final void LJ() {
                C0WOK.LIZ(this.LLILZIL);
                super.LJ();
            }

            {
                super(7);
            }

            @Override // X.C1BVM
            public final void LJIIJJI(String str) {
                if (c0woc.LIZIZ && str != null && u.LJJIIJZLJL(str, "javascript:", false)) {
                    BridgeHookDispatcher.INSTANCE.hookWebCallback(str, null);
                }
                super.LJIIJJI(str);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C1BVM
            public final void LIZIZ(Object obj, String str) {
                List arrayList;
                if (c0woc.LIZIZ) {
                    WebView webView = this.LLILZIL;
                    webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0WOM
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view) {
                            WebView webView2;
                            if ((view instanceof WebView) && (webView2 = (WebView) view) != null) {
                                C0WOK.LIZ(webView2);
                            }
                            view.removeOnAttachStateChangeListener(this);
                        }
                    });
                    Object tag = webView.getTag(R.id.web_client_jsi_flag);
                    if (!C19719512Dh.LJI(tag) || (arrayList = (List) tag) == null) {
                        arrayList = new ArrayList();
                    }
                    int iHashCode = obj.hashCode();
                    arrayList.add(Integer.valueOf(iHashCode));
                    webView.setTag(R.id.web_client_jsi_flag, arrayList);
                    ConcurrentHashMap<Object, List<C0WOO>> concurrentHashMap = C0WOK.LIZ;
                    if (concurrentHashMap.containsKey(Integer.valueOf(iHashCode))) {
                        List<C0WOO> list2 = concurrentHashMap.get(Integer.valueOf(iHashCode));
                        if (list2 != null) {
                            list2.add(new C0WOO(webView, str));
                        }
                    } else {
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new C0WOO(webView, str));
                        concurrentHashMap.put(numValueOf, arrayList2);
                    }
                }
                super.LIZIZ(obj, str);
            }

            @Override // X.C1BVM
            public final void LJFF(String str, ValueCallback<String> valueCallback) {
                if (c0woc.LIZIZ) {
                    BridgeHookDispatcher.INSTANCE.hookWebCallback(str, valueCallback);
                }
                super.LJFF(str, valueCallback);
            }
        });
        webBridgeManager = new C0WOJ(this);
    }

    public final void hookReturn(int i, Object obj, String[] strArr) {
        C0WOJ c0woj;
        Object c098200Yq;
        String strPrevious;
        String str;
        String str2;
        String str3;
        if (i == 300001 && (c0woj = webBridgeManager) != null) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = c0woj.LIZJ;
                ListIterator<String> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
                while (true) {
                    c098200Yq = null;
                    if (listIterator.hasPrevious()) {
                        strPrevious = listIterator.previous();
                        C0WLA c0wla = c0woj.LIZIZ.get(strPrevious);
                        if (c0wla != null) {
                            str = c0wla.LJIIJ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, strArr[0])) {
                            if (c0wla == null) {
                                str2 = null;
                            } else {
                                str2 = c0wla.LJIIJJI;
                            }
                            if (Intrinsics.LJFF(str2, strArr[1])) {
                                if (c0wla == null) {
                                    str3 = null;
                                } else {
                                    str3 = c0wla.LJIIL;
                                }
                                if (Intrinsics.LJFF(str3, strArr[2])) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        strPrevious = null;
                        break;
                    }
                }
                String str4 = strPrevious;
                if (str4 != null) {
                    C0WLA c0wlaLIZ = C0WLA.LIZ(c0woj.LIZIZ.get(str4), null, obj, 1048447);
                    Iterator<C0WON> it2 = c0woj.LIZ.getChain().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZJ(c0wlaLIZ);
                    }
                    if (!c0wlaLIZ.LIZLLL) {
                        c0woj.LIZIZ.remove(str4);
                        c0woj.LIZJ.remove(str4);
                    }
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onWebBridgeReturn error:");
                sbLIZ.append(thM5exceptionOrNullimpl);
                sbLIZ.append(", stack: ");
                sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final boolean hookParams(int i, Object obj, String[] strArr, Object[] objArr) {
        C0WOJ c0woj;
        Object obj2;
        if (i == 300001 && (c0woj = webBridgeManager) != null) {
            try {
                C0WLA c0wlaLIZ = C0WOJ.LIZ(obj, C13LQ.LJJLL(strArr), C13LQ.LJJLL(objArr));
                if (c0wlaLIZ != null) {
                    c0woj.LIZJ.add(c0wlaLIZ.LIZ);
                    c0woj.LIZIZ.put(c0wlaLIZ.LIZ, c0wlaLIZ);
                    Iterator<C0WON> it2 = c0woj.LIZ.getChain().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LIZ(C0WLA.LIZ(c0wlaLIZ, null, null, 1048575))) {
                            return true;
                        }
                    }
                } else {
                    c0wlaLIZ = null;
                }
                C189200o6.m2constructorimpl(c0wlaLIZ);
                obj2 = c0wlaLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onWebBridgeInvoke error:");
                sbLIZ.append(thM5exceptionOrNullimpl);
                sbLIZ.append(", stack: ");
                sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return false;
    }
}
