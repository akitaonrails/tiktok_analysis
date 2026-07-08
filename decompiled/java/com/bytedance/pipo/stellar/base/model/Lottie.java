package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class Lottie implements Serializable {

    @C09CT("lottie_name")
    public final String lottieName;

    @C09CT("lottie_url")
    public final String lottieUrl;

    public Lottie() {
        this(null, null);
    }

    public Lottie(String str, String str2) {
        this.lottieName = str;
        this.lottieUrl = str2;
    }
}
