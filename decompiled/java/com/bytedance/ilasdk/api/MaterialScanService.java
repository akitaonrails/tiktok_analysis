package com.bytedance.ilasdk.api;

import X.C002A;
import X.C003Q;
import X.C00AF;
import X.C094200Xc;
import X.C2249808rg;
import X.C2249908rh;
import X.InterfaceC1631620sYq;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public interface MaterialScanService {
    int LIZ(String str);

    int LIZIZ();

    Map<String, C003Q> LIZJ(List<String> list);

    int LIZLLL(Context context, C2249808rg c2249808rg);

    Map<String, List<C00AF>> LJ(List<String> list);

    boolean LJFF();

    String LJI(List<C2249908rh> list, C094200Xc c094200Xc, Function1<? super C002A, Unit> function1, InterfaceC1631620sYq<? super Integer, ? super List<String>, ? super Map<String, Integer>, Unit> interfaceC1631620sYq);

    List<String> LJII(List<String> list, float f);

    void LJIIIIZZ(Function0<Unit> function0, Function1<? super Exception, Unit> function1);

    float LJIIIZ();

    boolean isInitialized();

    void release();
}
