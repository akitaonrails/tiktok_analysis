package com.bytedance.ies.powerlist.page.config;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C189200o6;
import X.C316640Cb8;
import X.C317290CcB;
import X.C329720CwE;
import X.C329750CwH;
import X.C452501pT;
import X.InterfaceC1361890lXn;
import X.InterfaceC1364105Vn;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PowerPageSource<T> {
    public static final C329750CwH Companion = new Object() { // from class: X.0CwH
    };
    public C329720CwE<T> defaultSource;
    public final C01GW defaultOperator$delegate = C452501pT.LIZIZ(new AwS548S0100000_4(this, 39));
    public InterfaceC1361890lXn<T> operator = getDefaultOperator();

    public abstract void onLoadMore(InterfaceC1364105Vn<? super AbstractC316870CbV<T>> interfaceC1364105Vn, T t);

    public abstract void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<T>> interfaceC1364105Vn);

    private final InterfaceC1361890lXn<T> getDefaultOperator() {
        return (InterfaceC1361890lXn) this.defaultOperator$delegate.getValue();
    }

    public final InterfaceC1361890lXn<T> getOperator() {
        return this.operator;
    }

    private final void setOperator(InterfaceC1361890lXn<T> interfaceC1361890lXn) {
        C329720CwE<T> c329720CwE;
        InterfaceC1361890lXn<T> interfaceC1361890lXn2 = this.operator;
        this.operator = interfaceC1361890lXn;
        if (Intrinsics.LJFF(interfaceC1361890lXn2, getDefaultOperator()) && (c329720CwE = this.defaultSource) != null) {
            this.operator.LIZJ(c329720CwE.LIZ, c329720CwE.LIZIZ, c329720CwE.LIZJ);
        }
    }

    public final void onLoad(InterfaceC1361890lXn<T> interfaceC1361890lXn) {
        setOperator(interfaceC1361890lXn);
    }

    public void onLoadLatest(InterfaceC1364105Vn<? super AbstractC316870CbV<T>> interfaceC1364105Vn, T t) {
        C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
        interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
    }
}
