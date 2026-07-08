package com.bytedance.ies.xelement;

import X.AbstractC21354818he;
import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class XElementConfigLite {
    public final Function1<Context, AbstractC21354818he> declarativeVideoPlayBoxViewProvider;

    public final Function1<Context, AbstractC21354818he> getDeclarativeVideoPlayBoxViewProvider() {
        return this.declarativeVideoPlayBoxViewProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XElementConfigLite(Function1<? super Context, ? extends AbstractC21354818he> function1) {
        this.declarativeVideoPlayBoxViewProvider = function1;
    }
}
