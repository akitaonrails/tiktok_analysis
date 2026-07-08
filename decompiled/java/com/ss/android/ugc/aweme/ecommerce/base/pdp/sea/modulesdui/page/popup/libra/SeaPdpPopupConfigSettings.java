package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.libra;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class SeaPdpPopupConfigSettings {
    public static final SeaPdpPopupConfigModel LIZ;
    public static final SeaPdpPopupConfigModel LIZIZ;

    static {
        SeaPdpPopupConfigModel seaPdpPopupConfigModel = new SeaPdpPopupConfigModel(2);
        LIZ = seaPdpPopupConfigModel;
        try {
            SeaPdpPopupConfigModel seaPdpPopupConfigModel2 = (SeaPdpPopupConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_sea_pdp_popup_config", SeaPdpPopupConfigModel.class, seaPdpPopupConfigModel);
            if (seaPdpPopupConfigModel2 != null) {
                seaPdpPopupConfigModel = seaPdpPopupConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            seaPdpPopupConfigModel = LIZ;
        }
        LIZIZ = seaPdpPopupConfigModel;
    }

    public static final class SeaPdpPopupConfigModel {

        @C09CT("popup_list_max_threshold")
        public final int popupListMaxThreshold;

        public SeaPdpPopupConfigModel() {
            this(2);
        }

        public SeaPdpPopupConfigModel(int i) {
            this.popupListMaxThreshold = i;
        }
    }
}
