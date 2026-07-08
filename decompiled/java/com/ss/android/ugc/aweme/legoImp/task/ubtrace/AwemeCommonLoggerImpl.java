package com.ss.android.ugc.aweme.legoImp.task.ubtrace;

import X.C0C82;
import X.C1AJ7;
import X.C1DYU;
import X.C2276451E8l;
import X.C2276461E8m;
import X.C2276481E8o;
import X.C2276491E8p;
import com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger;
import kotlin.jvm.internal.AwS184S1100000_35;
import kotlin.jvm.internal.AwS36S2000000_35;
import kotlin.jvm.internal.AwS5S3000000_35;
import kotlin.jvm.internal.AwS69S2100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeCommonLoggerImpl implements IAwemeCommonLogger {
    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void d(String str, String str2) {
        C0C82.LIZ(new C1DYU(str, str2), new C2276491E8p());
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void LIZ(String str, String str2, String str3) {
        C0C82.LIZ(new AwS36S2000000_35(str2, str3, 0), new AwS5S3000000_35(str, str2, str3, 0));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void LIZIZ(String str, String str2, String str3) {
        C0C82.LIZ(new C2276461E8m(str2, str3), new C2276481E8o(str, str2, str3));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void e(String str, String str2, Throwable th) {
        C0C82.LIZ(new AwS184S1100000_35(str2, th, 0), new AwS69S2100000_35(str, str2, th, 0));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void LIZJ(String str, Throwable th, String str2, String str3) {
        C0C82.LIZ(new C1AJ7(str2, str3, th), new C2276451E8l(str, th, str2, str3));
    }
}
