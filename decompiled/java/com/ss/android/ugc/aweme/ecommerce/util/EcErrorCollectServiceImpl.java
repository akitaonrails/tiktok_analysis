package com.ss.android.ugc.aweme.ecommerce.util;

import X.C1019103yf;
import X.EnumC1014603xw;
import com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcErrorCollectServiceImpl implements IEcErrorCollectService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService
    public final void LIZ(String str, Throwable th, Map<String, ? extends Object> map) {
        EnumC1014603xw.Companion.getClass();
        for (EnumC1014603xw enumC1014603xw : EnumC1014603xw.values()) {
            if (Intrinsics.LJFF(enumC1014603xw.name(), str) || Intrinsics.LJFF(enumC1014603xw.getMsg(), str)) {
                C1019103yf.LIZ(enumC1014603xw, th, map);
                return;
            }
        }
        C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th, map);
    }
}
