package com.ss.android.ugc.aweme.im.service.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.im.service.service.ImCommonGuideSheetConfig;

/* JADX INFO: loaded from: classes20.dex */
public final class ImQRGroupConfig {

    @C09CT("local_data_update_interval_day")
    public final Integer localDataUpdateIntervalDay;

    @C09CT("qr_code_group_guide_config")
    public final ImCommonGuideSheetConfig qrCodeGroupGuideConfig;

    @C09CT("qrcode_create_group_entrance_config")
    public final QrcodeCreateGroupEntranceConfig qrcodeCreateGroupEntranceConfig;

    public ImQRGroupConfig() {
        this(null, null, null);
    }

    public ImQRGroupConfig(ImCommonGuideSheetConfig imCommonGuideSheetConfig, QrcodeCreateGroupEntranceConfig qrcodeCreateGroupEntranceConfig, Integer num) {
        this.qrCodeGroupGuideConfig = imCommonGuideSheetConfig;
        this.qrcodeCreateGroupEntranceConfig = qrcodeCreateGroupEntranceConfig;
        this.localDataUpdateIntervalDay = num;
    }
}
