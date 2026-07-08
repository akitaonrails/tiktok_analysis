package com.bytedance.jedi.ext.adapter;

import X.AbstractC903280Zc6;
import X.C004I;
import X.C13IQ;
import X.C19566311gr;
import X.C2188811AlT;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class Factory implements ViewModelProvider.Factory {

    public static final class SimpleViewHolderState implements C004I {
        public final Unit trigger;

        private final void component1() {
        }

        public final SimpleViewHolderState copy(Unit unit) {
            return new SimpleViewHolderState(unit);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SimpleViewHolderState) && Intrinsics.LJFF(this.trigger, ((SimpleViewHolderState) obj).trigger);
        }

        public int hashCode() {
            return this.trigger.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SimpleViewHolderState(trigger=");
            sbLIZ.append(this.trigger);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SimpleViewHolderState() {
            this(Unit.LIZ);
        }

        public SimpleViewHolderState(Unit unit) {
            this.trigger = unit;
        }
    }

    public static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        @Override // com.bytedance.jedi.arch.JediViewModel
        public final C004I zQ2() {
            return new SimpleViewHolderState(Unit.LIZ);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ androidx.lifecycle.ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ androidx.lifecycle.ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.lifecycle.ViewModel> T create(Class<T> cls) {
        return new ViewModel();
    }
}
