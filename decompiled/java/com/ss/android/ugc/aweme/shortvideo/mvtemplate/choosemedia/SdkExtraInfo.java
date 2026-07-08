package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SdkExtraInfo implements Serializable {
    public static final int $stable = 8;
    public String mvAlgorithmHint = "";
    public PlDataBean pl;

    public final boolean isLegal() {
        PlDataBean plDataBean;
        List<String> alg;
        return this.mvAlgorithmHint.length() > 0 && (plDataBean = this.pl) != null && (alg = plDataBean.getAlg()) != null && (alg.isEmpty() ^ true);
    }

    public final String getMvAlgorithmHint() {
        return this.mvAlgorithmHint;
    }

    public final PlDataBean getPl() {
        return this.pl;
    }

    public final void setMvAlgorithmHint(String str) {
        this.mvAlgorithmHint = str;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.pl = plDataBean;
    }
}
