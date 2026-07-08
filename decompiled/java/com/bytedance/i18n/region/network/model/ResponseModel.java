package com.bytedance.i18n.region.network.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class ResponseModel {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("cert_popup_probability")
    public final CertPopupProbabilityResponse certPopupProbability;

    @C09CT("data")
    public final DataModel data;

    @C09CT("location_sdk_control_config")
    public final String locationSdkControlConfig;

    @C09CT("message")
    public final String message;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public ResponseModel(String str, int i, DataModel dataModel, String str2, CertPopupProbabilityResponse certPopupProbabilityResponse) {
        this.message = str;
        this.status = i;
        this.data = dataModel;
        this.locationSdkControlConfig = str2;
        this.certPopupProbability = certPopupProbabilityResponse;
    }
}
