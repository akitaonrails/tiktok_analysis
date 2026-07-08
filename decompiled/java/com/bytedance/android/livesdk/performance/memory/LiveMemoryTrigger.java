package com.bytedance.android.livesdk.performance.memory;

import X.C006A;
import X.C0UQS;
import X.EnumC1153480g7e;
import X.EnumC2177591AKf;
import X.InterfaceC2177561AKc;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes34.dex */
public interface LiveMemoryTrigger extends C006A {
    public static final C0UQS LJIIJ = C0UQS.LIZ;

    void Ek1(Context context, LifecycleOwner lifecycleOwner);

    void Ge1();

    void Gl2(long j, String str, long j2, float f);

    void Gy0();

    void LLD(boolean z);

    void N5(String str);

    void YP1(String str, EnumC2177591AKf enumC2177591AKf, EnumC2177591AKf enumC2177591AKf2, EnumC1153480g7e enumC1153480g7e, InterfaceC2177561AKc interfaceC2177561AKc);

    void bj0();

    void q62(Runnable runnable);
}
