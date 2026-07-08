package com.ss.android.ugc.aweme.openshare;

import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.openshare.entity.DYBaseResp;

/* JADX INFO: loaded from: classes35.dex */
public final class Share$Response extends DYBaseResp {
    public String requestId;
    public String state;
    public int subErrorCode;

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseResp, X.C1B3W
    public int getType() {
        return 4;
    }

    public Share$Response() {
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getState() {
        return this.state;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public Share$Response(Bundle bundle) {
        fromBundle(bundle);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseResp, X.C1B3W
    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.state = bundle.getString("_aweme_open_sdk_params_state");
        this.subErrorCode = bundle.getInt("_aweme_open_sdk_params_sub_error_code");
        this.requestId = bundle.getString("_aweme_open_sdk_params_request_id");
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setSubErrorCode(int i) {
        this.subErrorCode = i;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseResp, X.C1B3W
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_state", this.state, bundle);
        bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.subErrorCode);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_request_id", this.requestId, bundle);
    }
}
