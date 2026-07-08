package defpackage;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPaRetrofitRefactorConfigSettings {
    public static final PipoPaRetrofitRefactorConfigModel LIZ = new PipoPaRetrofitRefactorConfigModel(Boolean.TRUE, Boolean.TRUE);

    public static final class PipoPaRetrofitRefactorConfigModel implements Serializable {

        @C09CT("use_cache")
        public final Boolean useCache;

        @C09CT("use_new_flow")
        public final Boolean useNewFlow;

        public PipoPaRetrofitRefactorConfigModel() {
            this(Boolean.TRUE, Boolean.TRUE);
        }

        public PipoPaRetrofitRefactorConfigModel(Boolean bool, Boolean bool2) {
            this.useCache = bool;
            this.useNewFlow = bool2;
        }
    }

    public static final PipoPaRetrofitRefactorConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoPaRetrofitRefactorConfigModel pipoPaRetrofitRefactorConfigModel = LIZ;
        PipoPaRetrofitRefactorConfigModel pipoPaRetrofitRefactorConfigModel2 = (PipoPaRetrofitRefactorConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_pa_retrofit_refactor_config", PipoPaRetrofitRefactorConfigModel.class, pipoPaRetrofitRefactorConfigModel);
        return pipoPaRetrofitRefactorConfigModel2 != null ? pipoPaRetrofitRefactorConfigModel2 : pipoPaRetrofitRefactorConfigModel;
    }
}
