package defpackage;

import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class h5 {
    public static final PipoJsbRegisterOptimizeInfo LIZ = new PipoJsbRegisterOptimizeInfo(true, true, C1697810uHb.LJIIJJI("pipo.encryptString", "pipoAppInfo"), true, new PipoBnplJsbRegisterConfig(false, C1697810uHb.LJIIJJI("pipo_bnpl_spark", "pipo_wallet_kyc_hybrid", "pipo_credit_wallet")));

    public static final PipoJsbRegisterOptimizeInfo LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoJsbRegisterOptimizeInfo pipoJsbRegisterOptimizeInfo = LIZ;
        PipoJsbRegisterOptimizeInfo pipoJsbRegisterOptimizeInfo2 = (PipoJsbRegisterOptimizeInfo) settingsManagerLIZLLL.LJIIIIZZ("pipo_jsb_register_opt_list_settings_new", PipoJsbRegisterOptimizeInfo.class, pipoJsbRegisterOptimizeInfo);
        return pipoJsbRegisterOptimizeInfo2 != null ? pipoJsbRegisterOptimizeInfo2 : pipoJsbRegisterOptimizeInfo;
    }
}
