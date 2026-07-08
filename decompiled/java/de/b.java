package de;

import X.AbstractC2255721DQs;
import X.C05YF;
import X.C0ETY;
import X.C0F1U;
import X.C1DRG;
import X.InterfaceC379610EuV;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends AbstractC2255721DQs<C0ETY> implements InterfaceC379610EuV, C0F1U, C0ETY {
    public final C1DRG LL;
    public final C0ETY LLILLJJLI = this;
    public final String LLILLL = "ALSInternalLazyHelperComponent";

    public C0ETY W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public String getComponentName() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public b(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0ETY
    public <T extends C05YF> T MY1(Class<T> cls) {
        return findReadyComponent(this, cls);
    }

    @Override // X.C0ETY
    public <T extends C05YF> void Sd(Class<T> cls, Function1<? super T, Unit> function1) {
        whenReady(this, cls, function1);
    }

    @Override // X.C0ETY
    public <T extends C05YF> void te1(Class<T> cls, Function1<? super T, Unit> function1) {
        whenReadyOrThrow(this, cls, function1);
    }
}
