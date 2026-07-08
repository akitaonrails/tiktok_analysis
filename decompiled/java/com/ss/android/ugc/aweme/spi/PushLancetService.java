package com.ss.android.ugc.aweme.spi;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PushLancetService implements IPushLancetService {
    @Override // com.ss.android.ugc.aweme.spi.IPushLancetService
    public final String i(String str) {
        try {
            if (Intrinsics.LJFF(str, "/service/1/update_token/")) {
                str = "/cloudpush/update_token/";
            }
            if (Intrinsics.LJFF(str, "/cloudpush/update_sender/")) {
                str = "/cloudpush/update_sender/";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (Intrinsics.LJFF(str, "/service/1/app_notice_status/")) {
            return "/cloudpush/app_notice_status/";
        }
        return str;
    }
}
