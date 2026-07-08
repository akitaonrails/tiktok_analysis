package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C1569200qwA;
import X.C1569410qwV;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallChunkConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class EcMixMallTouchDownPreconnectConfig {
    public static final EcMixMallTouchDownPreconnectConfig LIZ = new EcMixMallTouchDownPreconnectConfig();
    public static final EcMixMallTouchDownPreconnectConfigModel LIZIZ = new EcMixMallTouchDownPreconnectConfigModel(false, false, false, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(113));

    public static List LIZ() {
        List<String> list;
        String string;
        PreconnectImageHostsConfig preconnectImageHostsConfig = ((EcMixMallTouchDownPreconnectConfigModel) LIZJ.getValue()).preconnectImageHostsConfig;
        if (preconnectImageHostsConfig == null || !preconnectImageHostsConfig.enablePreconnectImageHosts || (list = preconnectImageHostsConfig.imageHosts) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
                arrayList.add(string);
            }
        }
        return C13LP.LJJJJI(arrayList);
    }

    public static List LIZIZ() {
        if (!((EcMixMallTouchDownPreconnectConfigModel) LIZJ.getValue()).preconnectApiHost) {
            return LIZ();
        }
        List listLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://oec-api.tiktokv.com/");
        EcMixMallChunkConfig ecMixMallChunkConfig = C1569410qwV.LIZ;
        sbLIZ.append((C1569410qwV.LIZ.enable == 1 && C1569200qwA.LIZ()) ? "api/v1/mall/homepage/bff/stream/get" : "api/v1/mall/homepage/bff/get");
        return C13LP.LJLILLLLZI(C2188811AlT.LIZIZ(sbLIZ), listLIZ);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PreconnectImageHostsConfig {

        @C09CT("enable_preconnect_image_hosts")
        public final boolean enablePreconnectImageHosts;

        @C09CT("image_hosts")
        public final List<String> imageHosts;

        public PreconnectImageHostsConfig() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreconnectImageHostsConfig)) {
                return false;
            }
            PreconnectImageHostsConfig preconnectImageHostsConfig = (PreconnectImageHostsConfig) obj;
            return this.enablePreconnectImageHosts == preconnectImageHostsConfig.enablePreconnectImageHosts && Intrinsics.LJFF(this.imageHosts, preconnectImageHostsConfig.imageHosts);
        }

        public final int hashCode() {
            int iZ2 = C786410Ut5.Z2(this.enablePreconnectImageHosts) * 31;
            List<String> list = this.imageHosts;
            return iZ2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PreconnectImageHostsConfig(enablePreconnectImageHosts=");
            sbLIZ.append(this.enablePreconnectImageHosts);
            sbLIZ.append(", imageHosts=");
            sbLIZ.append(this.imageHosts);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PreconnectImageHostsConfig(boolean z, List<String> list) {
            this.enablePreconnectImageHosts = z;
            this.imageHosts = list;
        }

        public PreconnectImageHostsConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class EcMixMallTouchDownPreconnectConfigModel {

        @C09CT("enable_top_tab_scroll")
        public final boolean enableTopTabScroll;

        @C09CT("enable_top_tab_touch_down")
        public final boolean enableTopTabTouchDown;

        @C09CT("preconnect_api_host")
        public final boolean preconnectApiHost;

        @C09CT("preconnect_image_hosts_config")
        public final PreconnectImageHostsConfig preconnectImageHostsConfig;

        public EcMixMallTouchDownPreconnectConfigModel() {
            this(false, false, false, null);
        }

        public EcMixMallTouchDownPreconnectConfigModel(boolean z, boolean z2, boolean z3, PreconnectImageHostsConfig preconnectImageHostsConfig) {
            this.enableTopTabScroll = z;
            this.enableTopTabTouchDown = z2;
            this.preconnectApiHost = z3;
            this.preconnectImageHostsConfig = preconnectImageHostsConfig;
        }
    }
}
