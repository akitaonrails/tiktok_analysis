package com.ss.android.ugc.feed.platform.standard.preload;

import X.C0CQT;
import X.C1499810p8F;
import X.C700360Rda;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.feed.platform.experiment.FcpStandardPreloadConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsFcpDataPreloadTask<T, R> implements InterfaceC727570SgN<T, R> {
    public abstract String componentKey();

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public abstract /* synthetic */ R preload(Bundle bundle, Function1<? super Class<T>, ? extends T> function1);

    public abstract List<String> urlList();

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        int iDoubleValue;
        Double d;
        String str = C0CQT.LIZJ;
        Object obj = ((FcpStandardPreloadConfig) C700360Rda.LIZIZ.getValue()).defaultConfig.get("expire_time");
        if ((obj instanceof Double) && (d = (Double) obj) != null) {
            iDoubleValue = (int) d.doubleValue();
        } else {
            iDoubleValue = 0;
        }
        return new C1499810p8F(false, str, null, iDoubleValue, false, 24);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }
}
