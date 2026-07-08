package com.ss.android.ugc.aweme.commercialize.tcm.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class TcmBarSchemaSettingModel {

    @C09CT("tcm_appeal_schema")
    public final String tcmAppealSchema;

    @C09CT("tcm_official_schema")
    public final String tcmOfficialSchema;

    public TcmBarSchemaSettingModel() {
        this(null, null);
    }

    public TcmBarSchemaSettingModel(String str, String str2) {
        this.tcmOfficialSchema = str;
        this.tcmAppealSchema = str2;
    }
}
