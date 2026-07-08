package defpackage;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class c5 {
    public static final PipoCashierQrCodeConfigModel LIZ = new PipoCashierQrCodeConfigModel(null, null, null, null, null, null, null, null);

    public static final PipoCashierQrCodeConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoCashierQrCodeConfigModel pipoCashierQrCodeConfigModel = LIZ;
        PipoCashierQrCodeConfigModel pipoCashierQrCodeConfigModel2 = (PipoCashierQrCodeConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_cashier_qr_code_config", PipoCashierQrCodeConfigModel.class, pipoCashierQrCodeConfigModel);
        return pipoCashierQrCodeConfigModel2 != null ? pipoCashierQrCodeConfigModel2 : pipoCashierQrCodeConfigModel;
    }
}
