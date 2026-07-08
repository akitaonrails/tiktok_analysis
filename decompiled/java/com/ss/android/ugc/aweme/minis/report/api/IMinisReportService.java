package com.ss.android.ugc.aweme.minis.report.api;

import X.AnonymousClass0208;
import X.C5185020h;
import X.EnumC1222640hvC;
import X.EnumC507801yO;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public interface IMinisReportService {
    void LIZ(String str, AwS633S0100000_19 awS633S0100000_19);

    void LIZIZ(C5185020h c5185020h);

    void LIZJ(String str, List list, String str2, String str3, EnumC507801yO enumC507801yO, C5185020h c5185020h);

    void LIZLLL(String str, String str2, EnumC507801yO enumC507801yO, AwS456S0200000_21 awS456S0200000_21);

    void LJ(Function2<? super MinisReportGetAuthTokenResponse, ? super Throwable, Unit> function2);

    void LJFF(String str, AwS456S0200000_21 awS456S0200000_21);

    void LJI(String str, String str2, AwS456S0200000_21 awS456S0200000_21);

    void LJII(String str, EnumC1222640hvC enumC1222640hvC, int i, AwS455S0200000_19 awS455S0200000_19);

    void LJIIIIZZ(String str, String str2, AwS633S0100000_19 awS633S0100000_19);

    void LJIIIZ(String str, String str2, String str3, AwS456S0200000_21 awS456S0200000_21);

    void LJIIJ(MinisMetaResp minisMetaResp, AnonymousClass0208 anonymousClass0208);
}
