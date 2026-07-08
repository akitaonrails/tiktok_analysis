package com.ss.android.ugc.feed.platform.cardinsert;

import X.C09CT;
import X.C0C64;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class M2CardUplinkAllowlistExp {
    public static final UplinkConditionsSettingModel LIZ;

    static {
        UplinkConditionsSettingModel uplinkConditionsSettingModel = new UplinkConditionsSettingModel(Collections.singletonList("50"));
        UplinkConditionsSettingModel uplinkConditionsSettingModel2 = (UplinkConditionsSettingModel) C0C64.LJIILLIIL().LJJIIJ(true, "fcp_card_conditions_config", 31744, UplinkConditionsSettingModel.class, uplinkConditionsSettingModel, 2);
        if (uplinkConditionsSettingModel2 != null) {
            uplinkConditionsSettingModel = uplinkConditionsSettingModel2;
        }
        LIZ = uplinkConditionsSettingModel;
    }

    public static final class UplinkConditionsSettingModel {

        @C09CT("uplink_conditions_card_types")
        public final List<String> list;

        public UplinkConditionsSettingModel(List<String> list) {
            this.list = list;
        }
    }
}
