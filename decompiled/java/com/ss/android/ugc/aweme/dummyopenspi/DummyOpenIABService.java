package com.ss.android.ugc.aweme.dummyopenspi;

import X.AbstractC1549150qPp;
import X.C1068950dvJ;
import X.C1068990dvN;
import X.C13BV;
import X.InterfaceC1069010dvP;
import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.opensdkservice.IOpenIABService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class DummyOpenIABService implements IOpenIABService {
    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final InterfaceC1069010dvP LIZLLL() {
        return new InterfaceC1069010dvP() { // from class: X.0dvO
            @Override // X.InterfaceC1069010dvP
            public final void LIZ(Activity activity, C2198611B3b c2198611B3b, String str, Map<String, String> map, boolean z, boolean z2, Function1<? super C2196061AxA, Unit> function1) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final C1068990dvN LIZIZ(SparkContext sparkContext, C1068950dvJ c1068950dvJ) {
        return new C1068990dvN();
    }
}
