package com.tiktok.kmp.fcp.redux;

import X.C1449705lv;
import X.C2217481Bqc;
import X.InterfaceC1449905lx;
import X.InterfaceC1631620sYq;
import Y.AObjectS346S0100000_2;
import com.tiktok.kmp.fcp.service.IFcpKMPReduxService;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class FcpKMPReduxImpl implements IFcpKMPReduxService {
    @Override // com.tiktok.kmp.fcp.service.IFcpKMPReduxService
    public final AObjectS346S0100000_2 LIZ(Function1... function1Arr) {
        return new AObjectS346S0100000_2((Function1[]) Arrays.copyOf(function1Arr, function1Arr.length), 3);
    }

    @Override // com.tiktok.kmp.fcp.service.IFcpKMPReduxService
    public final AObjectS346S0100000_2 LIZJ(InterfaceC1631620sYq interfaceC1631620sYq) {
        return new AObjectS346S0100000_2(interfaceC1631620sYq, 2);
    }

    @Override // com.tiktok.kmp.fcp.service.IFcpKMPReduxService
    public final InterfaceC1449905lx LIZIZ(Object obj, Function1 function1, Function2 function2) {
        return C1449705lv.LIZ(obj, function1, function2);
    }

    @Override // com.tiktok.kmp.fcp.service.IFcpKMPReduxService
    public final Function0 LIZLLL(InterfaceC1449905lx interfaceC1449905lx, C2217481Bqc c2217481Bqc, Function1 function1) {
        return C1449705lv.LIZIZ(interfaceC1449905lx, c2217481Bqc, function1);
    }
}
