package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13LQ;

/* JADX INFO: loaded from: classes21.dex */
public class EcomCommonOptimizeConfigBean {

    @C09CT("enable")
    public boolean enable;

    @C09CT("blocklist")
    public String[] blocklist = new String[0];

    @C09CT("allowlist")
    public String[] allowlist = new String[0];

    public final boolean LIZ(String str) {
        if (!C13LQ.LJIILLIIL(str, this.allowlist)) {
            if (this.enable && !C13LQ.LJIILLIIL(str, this.blocklist)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
