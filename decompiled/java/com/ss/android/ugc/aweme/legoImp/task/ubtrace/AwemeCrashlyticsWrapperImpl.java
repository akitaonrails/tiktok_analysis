package com.ss.android.ugc.aweme.legoImp.task.ubtrace;

import X.C0C82;
import X.C18JC;
import X.C18JD;
import X.C2276351E8b;
import X.C2276361E8c;
import X.C2276371E8d;
import X.C2276381E8e;
import X.C2276391E8f;
import X.C2276401E8g;
import X.C2276421E8i;
import com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper;
import kotlin.jvm.internal.AwS119S1000000_35;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS184S1100000_35;
import kotlin.jvm.internal.AwS36S2000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS5S3000000_35;
import kotlin.jvm.internal.AwS69S2100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeCrashlyticsWrapperImpl implements IAwemeCrashlyticsWrapper {
    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJ(String str) {
        C0C82.LIZ(new C18JD(str), new AwS5S3000000_35(str, 1));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LIZIZ(String str, Exception exc) {
        C0C82.LIZ(new AwS579S0100000_35(exc, 134), new AwS184S1100000_35(str, exc, 1));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LIZLLL(String str, Throwable th) {
        C0C82.LIZ(new C2276361E8c(th), new C2276421E8i(str, th));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJFF(String str, Exception exc) {
        C0C82.LIZ(new AwS173S1100000_24(str, exc, 7), new AwS69S2100000_35(str, exc, 2));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void log(String str, String str2) {
        C0C82.LIZ(new AwS119S1000000_35(str2, 0), new AwS36S2000000_35(str, str2, 1));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJII(String str, String str2, String str3) {
        C0C82.LIZ(new C2276371E8d(str2, str3), new C2276381E8e(str, str2, str3));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LIZJ(String str, int i, String str2, String str3) {
        C0C82.LIZ(new C2276351E8b(i, str2, str3), new C2276391E8f(str, i, str2, str3));
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJI(int i, String str, String str2, String str3) {
        C0C82.LIZ(new C18JC(i, str2, str3), new C2276401E8g(str, i, str2, str3));
    }
}
