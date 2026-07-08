package com.ss.android.ugc.aweme.poi.quiz.map;

import X.AnonymousClass0956;
import X.C054G;
import X.C09AE;
import X.C1178130glP;
import X.C1178200glW;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C2296808zG;
import X.InterfaceC1177110gjl;
import X.InterfaceC1331910klR;
import X.InterfaceC497601wk;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizMapClusterPicLoader implements InterfaceC497601wk, GenericLifecycleObserver {
    public final InterfaceC1177110gjl<C1178200glW> LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public final /* synthetic */ C054G LL = C2296808zG.LIZIZ();
    public final List<C09AE> LLILZ = new ArrayList();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
    }

    public PoiQuizMapClusterPicLoader(InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl) {
        this.LLILLJJLI = interfaceC1177110gjl;
    }

    public static void LIZ(final C1178200glW c1178200glW, final Function2 function2) {
        String str;
        if (c1178200glW.LIZJ) {
            str = c1178200glW.LJIIJ;
        } else {
            str = c1178200glW.LJIIIZ;
        }
        if (str != null && str.length() > 0 && 1 != 0) {
            C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_quiz", "poi_quiz_marker", null).LIZIZ(str);
            int i = C1178130glP.LIZ;
            c1189360h3WLIZIZ.LJI(i, i);
            c1189360h3WLIZIZ.LIZ.LIZLLL("MarkerDataParser");
            c1189360h3WLIZIZ.LIZ.LJJIIJZLJL(new InterfaceC1331910klR(c1178200glW, function2) { // from class: X.0gla
                public final C1178200glW LL;
                public final Function2<C1178200glW, Bitmap, Unit> LLILLJJLI;

                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    Function2<C1178200glW, Bitmap, Unit> function22;
                    if (bitmap != null && (function22 = this.LLILLJJLI) != null) {
                        function22.invoke(this.LL, bitmap);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = c1178200glW;
                    this.LLILLJJLI = function2;
                }
            });
        }
    }
}
