package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.service;

import X.C0NOF;
import X.C1741420vPw;
import X.C1767530w63;
import X.C1767650w6F;
import X.EnumC1767640w6E;
import X.InterfaceC1767700w6K;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallUgService implements IEcMallUgService {
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService
    public final void LIZ(Context context, Uri uri) {
        List<InterfaceC1767700w6K> list = C1767530w63.LIZ;
        C1767530w63.LIZ(context, C1767650w6F.LIZ(EnumC1767640w6E.BOTTOM_TAB, 1, uri));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService
    public final void verifyTrackEvent(String str, Map<String, ? extends Object> map) {
        C1741420vPw.LIZ.getClass();
        C0NOF.LIZ.getClass();
    }
}
