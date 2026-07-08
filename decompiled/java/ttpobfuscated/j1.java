package ttpobfuscated;

import X.C1500770p9n;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import ttp.orbu.sdk.network.model.ConfigurationResponse;

/* JADX INFO: loaded from: classes24.dex */
public interface j1 {
    @InterfaceC1501200pAU("config-signed.json")
    Object a(@InterfaceC1501120pAM("app_id") String str, InterfaceC1364105Vn<? super C1500770p9n<ConfigurationResponse>> interfaceC1364105Vn);

    @InterfaceC1501200pAU("config-orbucode-signed.json")
    Object b(@InterfaceC1501120pAM("app_id") String str, InterfaceC1364105Vn<? super C1500770p9n<ConfigurationResponse>> interfaceC1364105Vn);

    public static final class a {
        public static /* synthetic */ Object a(j1 j1Var, String str, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return j1Var.a(str, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGeneralConfiguration");
        }

        public static /* synthetic */ Object b(j1 j1Var, String str, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return j1Var.b(str, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrbuCodeConfiguration");
        }
    }
}
