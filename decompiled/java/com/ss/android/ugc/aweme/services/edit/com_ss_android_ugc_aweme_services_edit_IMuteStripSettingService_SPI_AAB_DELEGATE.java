package com.ss.android.ugc.aweme.services.edit;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.MuteStripSettingService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_edit_IMuteStripSettingService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final int $stable = 0;
    public static final com_ss_android_ugc_aweme_services_edit_IMuteStripSettingService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_edit_IMuteStripSettingService_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMuteStripSettingService getService() {
        return new MuteStripSettingService();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMuteStripSettingService> getServices() {
        ArrayList<IMuteStripSettingService> arrayList = new ArrayList<>();
        arrayList.add(new MuteStripSettingService());
        return arrayList;
    }
}
