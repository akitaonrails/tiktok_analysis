package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallInitConfigSettings {
    public static final EcMixMallInitConfigModel LIZ;
    public static final EcMixMallInitConfigModel LIZIZ;

    static {
        EcMixMallInitConfigModel ecMixMallInitConfigModel = new EcMixMallInitConfigModel(null, 0, null, 0, 0, 0, 63, null);
        LIZ = ecMixMallInitConfigModel;
        try {
            EcMixMallInitConfigModel ecMixMallInitConfigModel2 = (EcMixMallInitConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_mix_mall_init_config", EcMixMallInitConfigModel.class, ecMixMallInitConfigModel);
            if (ecMixMallInitConfigModel2 != null) {
                ecMixMallInitConfigModel = ecMixMallInitConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecMixMallInitConfigModel = LIZ;
        }
        LIZIZ = ecMixMallInitConfigModel;
    }

    public static final class EcMixMallInitConfigModel {

        @C09CT("exception_bubble_max_threshold")
        public final int exceptionBubbleMaxThreshold;

        @C09CT("exception_popup_task_max_threshold")
        public final int exceptionPopupTaskMaxThreshold;

        @C09CT("external_popup_host_suffix")
        public final List<String> externalPopupHostSuffix;

        @C09CT("runtime_card_bff_switch")
        public final int runtimeCardBffSwitch;

        @C09CT("runtime_card_load_retry_times")
        public final int runtimeCardLoadRetryTimes;

        @C09CT("runtime_card_schema")
        public final String runtimeCardSchema;

        public EcMixMallInitConfigModel() {
            this(null, 0, null, 0, 0, 0, 63, null);
        }

        public EcMixMallInitConfigModel(String str, int i, List<String> list, int i2, int i3, int i4) {
            this.runtimeCardSchema = str;
            this.runtimeCardLoadRetryTimes = i;
            this.externalPopupHostSuffix = list;
            this.exceptionPopupTaskMaxThreshold = i2;
            this.exceptionBubbleMaxThreshold = i3;
            this.runtimeCardBffSwitch = i4;
        }

        public EcMixMallInitConfigModel(String str, int i, List list, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? 1 : i, (i5 & 4) != 0 ? Collections.singletonList("lynxview_popup") : list, (i5 & 8) != 0 ? 3 : i2, (i5 & 16) != 0 ? 4 : i3, (i5 & 32) != 0 ? 0 : i4);
        }
    }
}
