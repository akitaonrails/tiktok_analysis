package com.ss.android.ugc.aweme.openshare.entity;

import X.C1B3W;
import X.C786410Ut5;
import android.os.Bundle;

/* JADX INFO: loaded from: classes35.dex */
public abstract class DYBaseResp extends C1B3W {
    public Bundle extras;

    @Override // X.C1B3W
    public boolean checkArgs() {
        return true;
    }

    @Override // X.C1B3W
    public abstract int getType();

    @Override // X.C1B3W
    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    @Override // X.C1B3W
    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
        this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    @Override // X.C1B3W
    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_error_msg", this.errorMsg, bundle);
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        C786410Ut5.LJJIIZI(bundle, this.extras, "_bytedance_params_extra");
    }
}
