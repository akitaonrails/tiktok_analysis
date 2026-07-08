package com.ss.lyrax.augur;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public class AugurConfigRequestOption {
    public Context context;
    public boolean enableUseCache;
    public AugurConfigRequesterObserver observer;

    public Context getContext() {
        return this.context;
    }

    public boolean getEnableUseCache() {
        return this.enableUseCache;
    }

    public AugurConfigRequesterObserver getObserver() {
        return this.observer;
    }

    public AugurConfigRequestOption(Context context, AugurConfigRequesterObserver augurConfigRequesterObserver) {
        this.context = context;
        this.observer = augurConfigRequesterObserver;
    }

    public AugurConfigRequestOption(Context context, AugurConfigRequesterObserver augurConfigRequesterObserver, boolean z) {
        this(context, augurConfigRequesterObserver);
        this.enableUseCache = z;
    }
}
