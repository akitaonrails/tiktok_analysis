package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractRunnableC21377818lM;
import X.AnonymousClass0982;
import X.C054G;
import X.C09A1;
import X.C09JN;
import X.C0LJ0;
import X.C0PEM;
import X.C11JF;
import X.C11NZ;
import X.C19EG;
import X.C1C7U;
import X.C2296808zG;
import X.C2296908zH;
import X.C23215097t;
import X.C23216097u;
import X.C530370Kr5;
import X.C530750Krh;
import X.C530760Kri;
import X.C533930Kwp;
import X.C535280Kz0;
import X.C786410Ut5;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import X.InterfaceC500500Jk0;
import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes9.dex */
public final class PreloadBitmapTask extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1, GenericLifecycleObserver {
    public final C19EG LLILZLL;
    public final C054G LLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public C11JF LLIZLLLIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final boolean LIZIZ() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C11JF c11jf = this.LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZLLLIL = null;
        C2296808zG.LIZJ(this.LLIZ, null);
        C23216097u c23216097u = C23215097t.LIZ;
        synchronized (c23216097u) {
            try {
                c23216097u.evictAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LinkedHashSet<String> linkedHashSet = C23215097t.LIZIZ;
        synchronized (linkedHashSet) {
            try {
                linkedHashSet.clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        HashMap<String, C11NZ<Bitmap>> map = C23215097t.LIZJ;
        synchronized (map) {
            try {
                map.clear();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreloadBitmapTask@7b8d.run");
        try {
            LJIIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadBitmapTask@7b8d.run");
    }

    public final void LJIIIZ() {
        if (AnonymousClass0982.LIZ() && C533930Kwp.LIZJ()) {
            C530750Krh.LIZIZ(C786410Ut5.P3(this.LLILZLL));
            AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(this, 55);
            C0LJ0 c0lj0LIZ = C530760Kri.LIZ();
            C535280Kz0 c535280Kz0 = new C535280Kz0(3, 30, 0, false);
            C530370Kr5 c530370Kr5 = C530370Kr5.LIZ;
            this.LLIZLLLIL = (C11JF) C11NZ.LJLLILLLL(c0lj0LIZ.LJJIJL(c535280Kz0, c530370Kr5), C530760Kri.LIZ().LJJIJL(new C535280Kz0(4, 30, 0, false), c530370Kr5), new InterfaceC500500Jk0() { // from class: X.0L3i
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj, Object obj2) {
                    C535700Kzg c535700Kzg = (C535700Kzg) obj;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(((C535700Kzg) obj2).LIZIZ);
                    arrayList.addAll(c535700Kzg.LIZIZ);
                    C08XD.LJIL(arrayList);
                    if (!arrayList.isEmpty()) {
                        return new C535700Kzg(new C535280Kz0(0, arrayList.size(), 0, false), arrayList);
                    }
                    return c535700Kzg;
                }
            }).LJJLL(new AfS172S0100000_3((Object) awS582S0100000_3, 2), new C09JN() { // from class: X.00Oz
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PreloadBitmapTask@7b8d.mergeFetchImageAndVideoDataList$3");
                    C1C7U.LIZIZ("PreloadBitmapTask@7b8d.mergeFetchImageAndVideoDataList$3");
                }
            });
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    public PreloadBitmapTask(C19EG c19eg, Lifecycle lifecycle) {
        this.LLILZLL = c19eg;
        LJ(AFwS239S0000000_8.get$arr$(15));
        lifecycle.addObserver(this);
    }
}
