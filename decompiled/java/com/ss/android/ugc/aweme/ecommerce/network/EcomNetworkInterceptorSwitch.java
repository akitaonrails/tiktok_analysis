package com.ss.android.ugc.aweme.ecommerce.network;

import X.C08CX;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomNetworkInterceptorSwitch {
    public static final EcomNetworkInterceptorSwitchModel LIZ;
    public static final Set<String> LIZIZ;
    public static final Set<String> LIZJ;

    static {
        EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel = new EcomNetworkInterceptorSwitchModel(false, false, null, null, null, null, 63, null);
        EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel2 = (EcomNetworkInterceptorSwitchModel) SettingsManager.LIZLLL().LJIIIIZZ("ecom_net_interceptor_switch", EcomNetworkInterceptorSwitchModel.class, ecomNetworkInterceptorSwitchModel);
        if (ecomNetworkInterceptorSwitchModel2 != null) {
            ecomNetworkInterceptorSwitchModel = ecomNetworkInterceptorSwitchModel2;
        }
        LIZ = ecomNetworkInterceptorSwitchModel;
        String str = ecomNetworkInterceptorSwitchModel.hosts;
        LIZIZ = a0.LJJJIL(str) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
        String str2 = ecomNetworkInterceptorSwitchModel.paths;
        LIZJ = a0.LJJJIL(str2) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6));
    }

    public static final class EcomNetworkInterceptorSwitchModel {

        @C09CT("base64_uri")
        public final List<String> base64Uri;

        @C09CT("hosts")
        public String hosts;

        @C09CT("image_host")
        public final String imageHost;

        @C09CT("paths")
        public String paths;

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("switch")
        public boolean f60switch;

        @C09CT("switch_stream")
        public boolean switchStream;

        public EcomNetworkInterceptorSwitchModel() {
            this(false, false, null, null, null, null, 63, null);
        }

        public EcomNetworkInterceptorSwitchModel(boolean z, boolean z2, String str, String str2, String str3, List<String> list) {
            this.f60switch = z;
            this.switchStream = z2;
            this.hosts = str;
            this.paths = str2;
            this.imageHost = str3;
            this.base64Uri = list;
        }

        public EcomNetworkInterceptorSwitchModel(boolean z, boolean z2, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
