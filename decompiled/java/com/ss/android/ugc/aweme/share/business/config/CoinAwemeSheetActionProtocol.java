package com.ss.android.ugc.aweme.share.business.config;

import X.C1372210loR;
import X.EnumC1369720lkQ;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinAwemeSheetActionProtocol extends AwemeSheetActionProtocol {
    public final boolean LLIZ;

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final boolean getHideShareItems() {
        C1372210loR c1372210loR = C1372210loR.LIZ;
        boolean z = this.LLIZ;
        Aweme aweme = this.LLILLL;
        ShareOperationInfo shareOperationInfo = aweme != null ? aweme.getShareOperationInfo() : null;
        c1372210loR.getClass();
        C1372210loR.LIZLLL(shareOperationInfo, z);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeSheetActionProtocol, com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final EnumC1369720lkQ O12() {
        return EnumC1369720lkQ.HORIZONTAL;
    }

    public CoinAwemeSheetActionProtocol(BaseSharePackage baseSharePackage) {
        Bundle bundle;
        super(baseSharePackage);
        AwemeSharePackage awemeSharePackage = this.LLILLJJLI;
        boolean z = false;
        if (awemeSharePackage != null && (bundle = awemeSharePackage.extras) != null) {
            z = bundle.getBoolean("is_referral", false);
        }
        this.LLIZ = z;
    }
}
