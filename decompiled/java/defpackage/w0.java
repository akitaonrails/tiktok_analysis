package defpackage;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes14.dex */
public final class w0 {
    public static final CloudKeyConfigurationModel LIZ = new CloudKeyConfigurationModel(null, false, null, null, 15, null);

    public static final CloudKeyConfigurationModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CloudKeyConfigurationModel cloudKeyConfigurationModel = LIZ;
        CloudKeyConfigurationModel cloudKeyConfigurationModel2 = (CloudKeyConfigurationModel) settingsManagerLIZLLL.LJIIIIZZ("cloud_key_configuration", CloudKeyConfigurationModel.class, cloudKeyConfigurationModel);
        return cloudKeyConfigurationModel2 != null ? cloudKeyConfigurationModel2 : cloudKeyConfigurationModel;
    }
}
