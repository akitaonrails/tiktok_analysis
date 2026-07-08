package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkUniversalPopupResponse implements Serializable {

    @C09CT("popup_meta")
    public final NetworkUniversalPopupMeta popupMeta;

    @C09CT("popup_ui")
    public final NetworkUniversalPopupUIModel popupUiModel;

    public NetworkUniversalPopupResponse() {
        this(new NetworkUniversalPopupMeta("", "", "", false, false, null, false), new NetworkUniversalPopupUIModel(null, null, null, false, false, false, false, null, null, null, null, 0.0f, 0.0f, null, 16383, null));
    }

    public NetworkUniversalPopupResponse(NetworkUniversalPopupMeta networkUniversalPopupMeta, NetworkUniversalPopupUIModel networkUniversalPopupUIModel) {
        this.popupMeta = networkUniversalPopupMeta;
        this.popupUiModel = networkUniversalPopupUIModel;
    }
}
