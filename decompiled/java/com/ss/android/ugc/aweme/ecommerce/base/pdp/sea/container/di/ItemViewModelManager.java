package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di;

import X.AbstractC1764350w0v;
import X.InterfaceC494301wD;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes27.dex */
public final class ItemViewModelManager implements InterfaceC494301wD {
    public final ConcurrentHashMap<String, WeakReference<AbstractC1764350w0v<?, ?>>> LL = new ConcurrentHashMap<>();

    public final AbstractC1764350w0v<?, ?> LIZ(String str) {
        WeakReference<AbstractC1764350w0v<?, ?>> weakReference;
        AbstractC1764350w0v<?, ?> abstractC1764350w0v = null;
        if (str != null && (((weakReference = this.LL.get(str)) == null || (abstractC1764350w0v = weakReference.get()) == null) && str != null)) {
            this.LL.remove(str);
        }
        return abstractC1764350w0v;
    }
}
