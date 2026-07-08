package com.bytedance.android.livesdk.dialog;

import X.C20634015og;
import X.C473410IhP;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC777420Uea;
import Y.ARunnableS131S0100000_31;
import android.app.Dialog;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AwS168S0101000_31;
import kotlin.jvm.internal.AwS81S0301000_31;

/* JADX INFO: loaded from: classes32.dex */
public class PriorityTaskDispatcher extends ViewModel implements InterfaceC777420Uea {
    public int LL = -1;
    public final PriorityQueue<Integer> LLILLJJLI = new PriorityQueue<>();
    public final SparseArray<C20634015og> LLILLL = new SparseArray<>();
    public C20634015og LLILZ;
    public boolean LLILZIL;

    public void addDialogToManager(Dialog dialog) {
    }

    @Override // X.InterfaceC777420Uea
    public final boolean I50() {
        return this.LLILLJJLI.contains(7);
    }

    public final void vQ2() {
        Integer numPoll = this.LLILLJJLI.poll();
        int iIntValue = numPoll != null ? numPoll.intValue() : -1;
        C20634015og c20634015og = this.LLILZ;
        if (c20634015og != null) {
            c20634015og.LIZ.removeObserver(c20634015og.LIZIZ);
        }
        if (iIntValue == -1) {
            this.LLILZIL = false;
            return;
        }
        C20634015og c20634015og2 = this.LLILLL.get(iIntValue);
        this.LLILZ = c20634015og2;
        if (c20634015og2 == null) {
            this.LL = -1;
            vQ2();
        } else if (c20634015og2.LIZ.hasObservers()) {
            this.LLILLL.remove(iIntValue);
            this.LL = iIntValue;
            c20634015og2.LIZ.setValue(Integer.valueOf(iIntValue));
        } else {
            this.LLILLL.remove(iIntValue);
            this.LL = -1;
            vQ2();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LLILLJJLI.clear();
        this.LLILLL.clear();
        this.LLILZIL = false;
        this.LL = -1;
    }

    @Override // X.InterfaceC777420Uea
    public final void UO0(int i) {
        if (i != -1) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS168S0101000_31(this, i, 0));
        }
    }

    @Override // X.InterfaceC777420Uea
    public final void dV0(boolean z) {
        if (this.LL != -1) {
            this.LL = -1;
            if (z) {
                C786410Ut5.LJLIIL(500L, C473410IhP.LIZ(), new ARunnableS131S0100000_31(this, 33));
            } else {
                vQ2();
            }
        }
    }

    @Override // X.InterfaceC777420Uea
    public final void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        if (i == -1 || this.LLILLJJLI.contains(Integer.valueOf(i))) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS81S0301000_31(lifecycleOwner, (LifecycleOwner) observer, (Observer<Integer>) this, (PriorityTaskDispatcher) i, 0));
    }
}
