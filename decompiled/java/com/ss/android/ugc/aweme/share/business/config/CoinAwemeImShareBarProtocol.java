package com.ss.android.ugc.aweme.share.business.config;

import X.C1372210loR;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinAwemeImShareBarProtocol extends AwemeImShareBarProtocol {
    public final boolean LLILZLL;

    @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public final boolean PK1() {
        C1372210loR c1372210loR = C1372210loR.LIZ;
        boolean z = this.LLILZLL;
        Aweme aweme = this.LLILLJJLI;
        ShareOperationInfo shareOperationInfo = aweme != null ? aweme.getShareOperationInfo() : null;
        c1372210loR.getClass();
        C1372210loR.LIZLLL(shareOperationInfo, z);
        return false;
    }

    public CoinAwemeImShareBarProtocol(BaseSharePackage baseSharePackage) {
        Bundle bundle;
        super(baseSharePackage);
        AwemeSharePackage awemeSharePackage = this.LL;
        boolean z = false;
        if (awemeSharePackage != null && (bundle = awemeSharePackage.extras) != null) {
            z = bundle.getBoolean("is_referral", false);
        }
        this.LLILZLL = z;
    }
}
