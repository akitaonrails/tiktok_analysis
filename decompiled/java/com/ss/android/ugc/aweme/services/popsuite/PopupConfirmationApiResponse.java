package com.ss.android.ugc.aweme.services.popsuite;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupConfirmationApiResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final Map<String, Integer> data;

    public PopupConfirmationApiResponse() {
        this(null);
    }

    public final Map<String, Integer> getData() {
        return this.data;
    }

    public PopupConfirmationApiResponse(Map<String, Integer> map) {
        this.data = map;
    }
}
