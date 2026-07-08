package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingCombineModel extends BaseResponse {

    @C09CT("data")
    public SettingCombineDataModel data;

    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public SettingCombineModel(SettingCombineDataModel settingCombineDataModel) {
        this.data = settingCombineDataModel;
    }

    public final void setData(SettingCombineDataModel settingCombineDataModel) {
        this.data = settingCombineDataModel;
    }
}
