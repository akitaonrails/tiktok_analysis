package com.ss.android.ugc.aweme.util;

import X.C1015480cX4;
import X.C1015750cXV;
import com.ss.android.ugc.aweme.IAnoleResourceHandler;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleResourceImpl implements IAnoleResourceHandler {
    @Override // com.ss.android.ugc.aweme.IAnoleResourceHandler
    public final void destroy() {
        C1015480cX4.LIZ.clear();
        C1015480cX4.LIZIZ.clear();
        ((LinkedHashMap) C1015750cXV.LIZ).clear();
        ((LinkedHashMap) C1015750cXV.LIZIZ).clear();
        ((LinkedHashMap) C1015750cXV.LIZJ).clear();
    }
}
