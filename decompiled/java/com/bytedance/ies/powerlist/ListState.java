package com.bytedance.ies.powerlist;

import X.C01GW;
import X.C0Q4Y;
import X.C13LP;
import X.C1891430zJt;
import X.C20600915jL;
import X.C20601015jM;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public abstract class ListState<T> {
    public final CopyOnWriteArrayList<C1891430zJt> LIZ = new CopyOnWriteArrayList<>();
    public final ListState$_liveData$1 LIZIZ = new MutableLiveData<C20600915jL<T>>(this) { // from class: com.bytedance.ies.powerlist.ListState$_liveData$1
        public final /* synthetic */ ListState<T> this$0;

        {
            this.this$0 = this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(C20600915jL<T> c20600915jL) {
            if (!c20600915jL.LJ) {
                c20600915jL.LIZLLL = C13LP.LLIIII(this.this$0.LIZ);
            }
            this.this$0.LIZ.clear();
            super.setValue(c20600915jL);
        }
    };
    public final C01GW LIZJ = C452501pT.LIZIZ(new C20601015jM());
    public C0Q4Y LIZLLL = C0Q4Y.LATEST;

    public static void LIZ(ListState listState, List list, boolean z, boolean z2, Runnable runnable, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            runnable = null;
        }
        listState.getClass();
        C20600915jL c20600915jL = new C20600915jL(list, z, z2);
        if (z || (listState.LIZLLL == C0Q4Y.BUFFER && Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()))) {
            ListState$_liveData$1 listState$_liveData$1 = listState.LIZIZ;
            c20600915jL.LJ = true;
            if (runnable != null) {
                c20600915jL.LIZLLL = Collections.singletonList(new C1891430zJt(runnable));
            }
            listState$_liveData$1.setValue(c20600915jL);
            return;
        }
        ListState$_liveData$1 listState$_liveData$12 = listState.LIZIZ;
        c20600915jL.LJ = false;
        if (runnable != null) {
            synchronized (listState) {
                try {
                    listState.LIZ.add(new C1891430zJt(runnable));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        listState$_liveData$12.postValue(c20600915jL);
    }
}
