package com.bytedance.ies.xelement;

import X.C01GW;
import X.C21354918hf;
import X.C452501pT;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class XElementInitializerLite {
    public static final C21354918hf Companion = new Object() { // from class: X.18hf
    };
    public static final C01GW<XElementInitializerLite> instance$delegate = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(29));
    public XElementConfigLite localConfig;

    public final XElementConfigLite getConfig() {
        XElementConfigLite xElementConfigLite = this.localConfig;
        if (xElementConfigLite == null) {
            return null;
        }
        return xElementConfigLite;
    }

    public final void setConfig(XElementConfigLite xElementConfigLite) {
        this.localConfig = xElementConfigLite;
    }
}
