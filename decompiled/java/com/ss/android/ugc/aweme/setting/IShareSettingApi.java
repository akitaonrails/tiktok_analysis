package com.ss.android.ugc.aweme.setting;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;

/* JADX INFO: loaded from: classes5.dex */
public interface IShareSettingApi {
    @InterfaceC1501200pAU("/aweme/v2/platform/share/settings/")
    ListenableFuture<ShareSettings> LIZ();

    @InterfaceC1501200pAU("/aweme/v2/platform/share/settings/")
    C11NZ<ShareSettings> getShareSetting(@InterfaceC1501070pAH("share_settings_scene") String str);
}
