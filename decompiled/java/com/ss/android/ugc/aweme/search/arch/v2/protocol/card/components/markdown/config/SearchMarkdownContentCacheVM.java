package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config;

import X.C07GC;
import X.C09AE;
import X.C0PO5;
import X.C0PRC;
import X.C0Q3E;
import X.C0QG7;
import X.C1860130yVP;
import X.C1860140yVQ;
import X.C21419418s4;
import X.C2188811AlT;
import X.C287900BQe;
import X.C341990Dav;
import X.C342030Daz;
import X.C640870PBt;
import X.C644060POa;
import X.C689240R1u;
import X.InterfaceC1860180yVU;
import X.InterfaceC342000Daw;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.df.api.top1.Top1NimbleTemplateContextPool;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMarkdownContentCacheVM extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public final ConcurrentHashMap<C342030Daz, InterfaceC342000Daw> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C342030Daz, InterfaceC342000Daw> LLILLJJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C342030Daz, CountDownLatch> LLILLL = new ConcurrentHashMap<>();
    public final Object LLILZ = new Object();
    public final CopyOnWriteArrayList<C09AE> LLILZIL = new CopyOnWriteArrayList<>();

    public final void cancel() {
        if (C07GC.LIZ()) {
            Iterator<C09AE> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(null);
            }
            this.LLILZIL.clear();
            this.LLILLJJLI.clear();
        }
        this.LL.clear();
    }

    public static void xQ2(Fragment fragment, String str) {
        Top1NimbleTemplateContextPool top1NimbleTemplateContextPoolLJ = C0QG7.LIZ().LJ(fragment);
        if (top1NimbleTemplateContextPoolLJ != null) {
            top1NimbleTemplateContextPoolLJ.preloadNimbleTemplateContext(str, fragment);
            top1NimbleTemplateContextPoolLJ.preloadNimbleTemplateContextForPreload(str, fragment);
        }
    }

    public final void wQ2(C342030Daz c342030Daz, CountDownLatch countDownLatch) {
        countDownLatch.countDown();
        synchronized (this.LLILZ) {
            try {
                if (this.LLILLL.get(c342030Daz) == countDownLatch) {
                    this.LLILLL.remove(c342030Daz);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void vQ2(String str, Context context, C1860130yVP c1860130yVP, int i, C21419418s4 c21419418s4) {
        C21419418s4 c21419418s4LIZIZ;
        String str2 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJ;
        if (i != 0) {
            if (i == 1) {
                C644060POa.LIZ.getClass();
                C0PO5 c0po5LJIIIIZZ = C644060POa.LJIIIIZZ(str2);
                c0po5LJIIIIZZ.getClass();
                if (!Intrinsics.LJFF(c0po5LJIIIIZZ, C640870PBt.LIZ)) {
                    c0po5LJIIIIZZ.LLFF++;
                }
            }
        } else {
            C644060POa.LIZ.getClass();
            C0PO5 c0po5LJIIIIZZ2 = C644060POa.LJIIIIZZ(str2);
            c0po5LJIIIIZZ2.getClass();
            if (!Intrinsics.LJFF(c0po5LJIIIIZZ2, C640870PBt.LIZ)) {
                c0po5LJIIIIZZ2.LLFFF++;
            }
        }
        if (c21419418s4 == null) {
            C689240R1u c689240R1u = C689240R1u.LIZ;
            c689240R1u.getClass();
            c21419418s4 = C689240R1u.LIZ(c689240R1u, C689240R1u.LJ(context, null), false, context, false, null, 12);
        }
        InterfaceC342000Daw interfaceC342000DawLIZIZ = C341990Dav.LIZIZ(c1860130yVP, c21419418s4, str);
        if (interfaceC342000DawLIZIZ != null) {
            ConcurrentHashMap<C342030Daz, InterfaceC342000Daw> concurrentHashMap = this.LLILLJJLI;
            InterfaceC1860180yVU interfaceC1860180yVU = ((C1860140yVQ) interfaceC342000DawLIZIZ).LJ;
            if (interfaceC1860180yVU != null) {
                c21419418s4LIZIZ = interfaceC1860180yVU.LIZIZ();
            } else {
                c21419418s4LIZIZ = null;
            }
            concurrentHashMap.put(new C342030Daz(c21419418s4LIZIZ, str), interfaceC342000DawLIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadMarkdownContent success originText = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void yQ2(String str, Context context, C1860130yVP c1860130yVP, int i, C21419418s4 c21419418s4) {
        CountDownLatch countDownLatch;
        C342030Daz c342030Daz = new C342030Daz(c21419418s4, str);
        if (!this.LL.containsKey(c342030Daz) && !this.LLILLJJLI.containsKey(c342030Daz)) {
            if (((Boolean) C287900BQe.LIZ.getValue()).booleanValue()) {
                synchronized (this.LLILZ) {
                    try {
                        if (!this.LLILLL.containsKey(c342030Daz)) {
                            countDownLatch = new CountDownLatch(1);
                            this.LLILLL.put(c342030Daz, countDownLatch);
                        } else {
                            countDownLatch = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (countDownLatch == null) {
                    return;
                }
                try {
                    vQ2(str, context, c1860130yVP, i, c21419418s4);
                    wQ2(c342030Daz, countDownLatch);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    wQ2(c342030Daz, countDownLatch);
                    throw th2;
                }
            }
            vQ2(str, context, c1860130yVP, i, c21419418s4);
        }
    }
}
