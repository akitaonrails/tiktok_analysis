package com.ss.android.ugc.aweme.deeplink.impl;

import X.C13LN;
import X.C292550BdN;
import X.C584360Mvy;
import com.ss.android.ugc.aweme.deeplink.ITrafficRecorderService;

/* JADX INFO: loaded from: classes5.dex */
public final class TrafficRecorderServiceImpl implements ITrafficRecorderService {
    public volatile String LIZ;
    public int LIZIZ;

    @Override // com.ss.android.ugc.aweme.deeplink.ITrafficRecorderService
    public final synchronized String LIZ() {
        String strLJZL;
        strLJZL = this.LIZ;
        if (strLJZL != null) {
            int i = C292550BdN.LIZ().maxSize;
            if (i > 0 && strLJZL.length() > i) {
                strLJZL = C13LN.LJZL(i, strLJZL);
            }
        } else {
            strLJZL = null;
        }
        this.LIZ = null;
        return strLJZL;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.ITrafficRecorderService
    public final int LIZIZ() {
        return C584360Mvy.LIZJ - this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.ITrafficRecorderService
    public final void LIZJ(String str) {
        if (!C292550BdN.LIZ().isEnable) {
            return;
        }
        this.LIZ = str;
        this.LIZIZ = C584360Mvy.LIZJ;
    }
}
