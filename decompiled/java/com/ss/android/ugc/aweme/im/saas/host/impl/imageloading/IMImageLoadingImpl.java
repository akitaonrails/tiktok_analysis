package com.ss.android.ugc.aweme.im.saas.host.impl.imageloading;

import X.C1325700kbQ;
import X.InterfaceC1330470kj7;
import X.InterfaceC1330990kjx;
import X.InterfaceC1331030kk1;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class IMImageLoadingImpl implements IMImageLoadingApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi
    public final void LIZ(AnimatedDrawable2 animatedDrawable2, final Function1<? super InterfaceC1330470kj7, ? extends InterfaceC1330990kjx> function1) {
        animatedDrawable2.LJIIIIZZ(new InterfaceC1331030kk1() { // from class: X.0ksB
            @Override // X.InterfaceC1331030kk1
            public final InterfaceC1330990kjx LIZ(InterfaceC1330960kju interfaceC1330960kju, Object obj) {
                return function1.invoke(interfaceC1330960kju);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi
    public final void LIZIZ(C1325700kbQ c1325700kbQ, Map<String, String> map) {
        c1325700kbQ.LJFF(map);
    }
}
