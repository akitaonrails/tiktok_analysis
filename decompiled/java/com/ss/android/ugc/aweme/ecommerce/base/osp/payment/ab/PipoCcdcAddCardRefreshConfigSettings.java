package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoCcdcAddCardRefreshConfigSettings {
    public static final PipoOspSecondRefreshConfigModel LIZ = new PipoOspSecondRefreshConfigModel(null, null, 3, null);

    public static final PipoOspSecondRefreshConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoOspSecondRefreshConfigModel pipoOspSecondRefreshConfigModel = LIZ;
        PipoOspSecondRefreshConfigModel pipoOspSecondRefreshConfigModel2 = (PipoOspSecondRefreshConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ccdc_add_card_refresh_config", PipoOspSecondRefreshConfigModel.class, pipoOspSecondRefreshConfigModel);
        return pipoOspSecondRefreshConfigModel2 != null ? pipoOspSecondRefreshConfigModel2 : pipoOspSecondRefreshConfigModel;
    }

    public static final class PipoOspSecondRefreshConfigModel {

        @C09CT("enable_refresh")
        public final Boolean enableRefresh;

        @C09CT("source_list")
        public final List<String> sourceList;

        public PipoOspSecondRefreshConfigModel() {
            this(null, null, 3, null);
        }

        public PipoOspSecondRefreshConfigModel(Boolean bool, List<String> list) {
            this.enableRefresh = bool;
            this.sourceList = list;
        }

        public PipoOspSecondRefreshConfigModel(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
