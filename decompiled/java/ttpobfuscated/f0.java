package ttpobfuscated;

import X.C1500770p9n;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501110pAL;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501370pAl;
import ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeResponse;

/* JADX INFO: loaded from: classes24.dex */
public interface f0 {
    @InterfaceC1501200pAU("{api_version_path_parameter}/apps/{app_id}/challenge")
    Object a(@InterfaceC1501110pAL("api_version_path_parameter") String str, @InterfaceC1501110pAL("app_id") String str2, @InterfaceC1501120pAM("target_resource") String str3, @InterfaceC1501370pAl("client_version") String str4, @InterfaceC1501370pAl("app_version") String str5, @InterfaceC1501370pAl("x_os") String str6, InterfaceC1364105Vn<? super C1500770p9n<ChallengeResponse>> interfaceC1364105Vn);

    public static final class a {
        public static /* synthetic */ Object a(f0 f0Var, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str4 = "0.17.0";
                }
                if ((i & 16) != 0) {
                    str5 = null;
                }
                if ((i & 32) != 0) {
                    str6 = "android";
                }
                return f0Var.a(str, str2, str3, str4, str5, str6, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChallenge");
        }
    }
}
