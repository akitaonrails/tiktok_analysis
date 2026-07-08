package com.ss.android.ugc.aweme.hybridkit.thirdparty;

import X.C1059200dfa;
import X.C1059250dff;
import X.C1547550qNF;
import X.EnumC1536200q4w;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.IThirdPartyUtilService;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class ThirdPartyUtilService implements IThirdPartyUtilService {
    @Override // com.ss.android.ugc.aweme.spark.IThirdPartyUtilService
    public final C1547550qNF LIZIZ() {
        return C1059250dff.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.spark.IThirdPartyUtilService
    public final boolean LIZLLL(String str) {
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLLIIJI;
        C1059200dfa.LIZ.getClass();
        if ((!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) || (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) == null || (sparkHostApiImplLLIIJI = iSparkHostApi.LLIIJI()) == null || !sparkHostApiImplLLIIJI.LLJZIJLIL(str, EnumC1536200q4w.ISOLATED_WEBVIEW)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.spark.IThirdPartyUtilService
    public final boolean LIZ(SparkContext sparkContext, String str) {
        C1059200dfa.LIZ.getClass();
        return C1059200dfa.LIZ(sparkContext, str);
    }
}
