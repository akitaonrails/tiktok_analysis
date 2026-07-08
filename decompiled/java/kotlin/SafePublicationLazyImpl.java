package kotlin;

import X.C01GW;
import X.C1333210knX;
import X.C13K9;
import X.C377010EqJ;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class SafePublicationLazyImpl<T> implements C01GW<T>, Serializable {
    public static final C13K9 Companion;
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    public volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final Object f88final;
    public volatile Function0<? extends T> initializer;

    public static /* synthetic */ void getFinal$annotations() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13K9] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Object(defaultConstructorMarker) { // from class: X.13K9
        };
    }

    private final Object writeReplace() {
        return new C377010EqJ(getValue());
    }

    @Override // X.C01GW
    public T getValue() {
        T t = (T) this._value;
        C1333210knX c1333210knX = C1333210knX.LIZ;
        if (t != c1333210knX) {
            return t;
        }
        Function0<? extends T> function0 = this.initializer;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = valueUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1333210knX, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1333210knX) {
                }
            }
            this.initializer = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    @Override // X.C01GW
    public boolean isInitialized() {
        return this._value != C1333210knX.LIZ;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public SafePublicationLazyImpl(Function0<? extends T> function0) {
        this.initializer = function0;
        C1333210knX c1333210knX = C1333210knX.LIZ;
        this._value = c1333210knX;
        this.f88final = c1333210knX;
    }
}
