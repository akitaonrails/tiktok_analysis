package com.ss.android.ugc.aweme.pagesyncer;

import X.C1188360h1u;
import X.C15438062q;
import X.C2187701Ajg;
import X.InterfaceC1189350h3V;
import X.InterfaceC494301wD;
import X.ViewTreeObserverOnDrawListenerC1192270h8D;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.pagesyncer.PageModuleSyncer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PageModuleSyncer implements InterfaceC1189350h3V, InterfaceC494301wD {
    public final LifecycleOwner LL;
    public final String LLILLJJLI;
    public InterfaceC1189350h3V LLILLL;
    public boolean LLILZLL;
    public View LLIZLLLIL;
    public ViewTreeObserverOnDrawListenerC1192270h8D LLJI;
    public final List<InterfaceC1189350h3V> LLILZ = new ArrayList();
    public final Set<String> LLILZIL = new LinkedHashSet();
    public boolean LLIZ = true;
    public final List<ViewTreeObserver> LLJ = new ArrayList();

    @Override // X.InterfaceC1189350h3V
    public final PageModuleSyncer LIZLLL() {
        return this;
    }

    @Override // X.InterfaceC1189350h3V
    public final void LIZIZ() {
        ((ArrayList) this.LLILZ).isEmpty();
        List<InterfaceC1189350h3V> list = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((InterfaceC1189350h3V) obj).LIZLLL().LLILZLL) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC1189350h3V) it2.next()).LIZLLL().LLILLJJLI);
        }
        if (arrayList2.containsAll(this.LLILZIL) && this.LLIZ) {
            this.LLIZ = false;
        }
    }

    public final void LJFF() {
        List<ViewTreeObserver> list;
        if (this.LLJI == null || (list = this.LLJ) == null) {
            return;
        }
        for (ViewTreeObserver viewTreeObserver : (ArrayList) list) {
            if (viewTreeObserver.isAlive()) {
                ViewTreeObserverOnDrawListenerC1192270h8D viewTreeObserverOnDrawListenerC1192270h8D = this.LLJI;
                viewTreeObserver.removeOnDrawListener(viewTreeObserverOnDrawListenerC1192270h8D);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnDrawListenerC1192270h8D, ViewTreeObserver.OnDrawListener.class);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0h8D] */
    @Override // X.InterfaceC1189350h3V
    public final void LIZ(Function1<? super C1188360h1u, Unit> function1) {
        ViewTreeObserver viewTreeObserver;
        if (this.LLILZLL) {
            return;
        }
        final C1188360h1u c1188360h1u = new C1188360h1u();
        function1.invoke(c1188360h1u);
        View view = c1188360h1u.LIZ;
        this.LLIZLLLIL = view;
        this.LLJI = new ViewTreeObserver.OnDrawListener() { // from class: X.0h8D
            /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                ?? r0;
                if (this.LL.LLILZLL || (r0 = c1188360h1u.LIZIZ) == 0 || !((Boolean) r0.invoke()).booleanValue() || this.LL.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                PageModuleSyncer pageModuleSyncer = this.LL;
                pageModuleSyncer.LLILZLL = true;
                InterfaceC1189350h3V interfaceC1189350h3V = pageModuleSyncer.LLILLL;
                if (interfaceC1189350h3V != null) {
                    interfaceC1189350h3V.LIZIZ();
                }
                View view2 = c1188360h1u.LIZ;
                if (view2 != null) {
                    HandlerHook.viewPost(view2, new ARunnableS118S0100000_18(this.LL, 28));
                }
            }
        };
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ((ArrayList) this.LLJ).add(viewTreeObserver);
            ViewTreeObserverOnDrawListenerC1192270h8D viewTreeObserverOnDrawListenerC1192270h8D = this.LLJI;
            viewTreeObserver.addOnDrawListener(viewTreeObserverOnDrawListenerC1192270h8D);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnDrawListenerC1192270h8D, ViewTreeObserver.OnDrawListener.class);
        }
    }

    public PageModuleSyncer(String str, LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = str;
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pagesyncer.PageModuleSyncer.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ViewTreeObserver viewTreeObserver;
                if (event == Lifecycle.Event.ON_STOP) {
                    View view = PageModuleSyncer.this.LLIZLLLIL;
                    if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                        ((ArrayList) PageModuleSyncer.this.LLJ).add(viewTreeObserver);
                        return;
                    }
                    return;
                }
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                PageModuleSyncer.this.LJFF();
            }
        });
    }
}
