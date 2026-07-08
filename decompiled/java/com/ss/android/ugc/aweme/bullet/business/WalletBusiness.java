package com.ss.android.ugc.aweme.bullet.business;

import X.C1028210crb;
import X.C1039190d9J;
import X.C1041070dCL;
import X.C988570bpf;
import android.content.Intent;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletBusiness extends BulletBusinessService.Business {
    public WalletBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
    }

    public static void LIZ(String str, int i, int i2, Intent intent) {
        if (str != null && a0.LJJIIZI(str, "wallet/home", false)) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                C1028210crb.LJJIJIIJI();
            }
        }
    }
}
