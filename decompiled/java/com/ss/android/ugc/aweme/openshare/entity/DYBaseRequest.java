package com.ss.android.ugc.aweme.openshare.entity;

import X.C1B3T;
import X.C786410Ut5;
import android.os.Bundle;

/* JADX INFO: loaded from: classes35.dex */
public abstract class DYBaseRequest extends C1B3T {
    public Bundle extras;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mClientKey;
    public String mState;

    @Override // X.C1B3T
    public abstract int getType();

    @Override // X.C1B3T
    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    @Override // X.C1B3T
    public String getCallerPackage() {
        return this.mCallerPackage;
    }

    @Override // X.C1B3T
    public String getCallerVersion() {
        return this.mCallerSDKVersion;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getMCallerPackage() {
        return this.mCallerPackage;
    }

    public final String getMCallerSDKVersion() {
        return this.mCallerSDKVersion;
    }

    public final String getMClientKey() {
        return this.mClientKey;
    }

    public final String getMState() {
        return this.mState;
    }

    @Override // X.C1B3T
    public void fromBundle(Bundle bundle) {
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public final void setMCallerPackage(String str) {
        this.mCallerPackage = str;
    }

    public final void setMCallerSDKVersion(String str) {
        this.mCallerSDKVersion = str;
    }

    public final void setMClientKey(String str) {
        this.mClientKey = str;
    }

    public final void setMState(String str) {
        this.mState = str;
    }

    @Override // X.C1B3T
    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        C786410Ut5.LJJIIZI(bundle, this.extras, "_bytedance_params_extra");
        C786410Ut5.LJJJI("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_client_key", this.mClientKey, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_caller_package", this.mCallerPackage, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_state", this.mState, bundle);
    }
}
