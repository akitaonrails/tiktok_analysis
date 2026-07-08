package com.ss.android.ugc.aweme.ecommerce.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcMixMallRuntimeCardJSOptSetting {
    public static final EcMixMallRuntimeOptModel LIZ;
    public static final EcMixMallRuntimeOptModel LIZIZ;

    static {
        EcMixMallRuntimeOptModel ecMixMallRuntimeOptModel = new EcMixMallRuntimeOptModel(null, null, null, 7, null);
        LIZ = ecMixMallRuntimeOptModel;
        try {
            EcMixMallRuntimeOptModel ecMixMallRuntimeOptModel2 = (EcMixMallRuntimeOptModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_mix_mall_runtime_cart_opt", EcMixMallRuntimeOptModel.class, ecMixMallRuntimeOptModel);
            if (ecMixMallRuntimeOptModel2 != null) {
                ecMixMallRuntimeOptModel = ecMixMallRuntimeOptModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecMixMallRuntimeOptModel = LIZ;
        }
        LIZIZ = ecMixMallRuntimeOptModel;
    }

    public static final class EcMixMallRuntimeOptModel {

        @C09CT("enable_js_concur_channel")
        public final String enableJsConcurChannel;

        @C09CT("enable_js_concur_list")
        public final List<String> enableJsConcurList;

        @C09CT("js_group_name")
        public final String jsGroupName;

        public EcMixMallRuntimeOptModel() {
            this(null, null, null, 7, null);
        }

        public EcMixMallRuntimeOptModel(String str, String str2, List<String> list) {
            this.jsGroupName = str;
            this.enableJsConcurChannel = str2;
            this.enableJsConcurList = list;
        }

        public EcMixMallRuntimeOptModel(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ecom_js_group_concur" : str, (i & 2) != 0 ? "tiktok_ecom_hybrid_mall" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
