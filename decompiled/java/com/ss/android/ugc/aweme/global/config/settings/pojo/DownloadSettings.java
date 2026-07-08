package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadSettings {

    @C09CT("download_dialog_config")
    public DownloadDialogSettings downloadDialogConfig;

    @C09CT("download_lib_switch")
    public Integer downloadLibSwitch;

    public DownloadDialogSettings getDownloadDialogConfig() throws C316660CbA {
        DownloadDialogSettings downloadDialogSettings = this.downloadDialogConfig;
        if (downloadDialogSettings != null) {
            return downloadDialogSettings;
        }
        throw new C316660CbA();
    }

    public Integer getDownloadLibSwitch() throws C316660CbA {
        Integer num = this.downloadLibSwitch;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
