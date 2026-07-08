package com.ss.android.ugc.aweme.bullet.bridge.commerce;

import X.C1020610cfL;
import X.C1051660dTQ;
import X.EnumC1054630dYD;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdInfoMethod extends BaseBridgeMethod {
    public static final C1020610cfL Companion = new Object() { // from class: X.0cfL
    };
    public String hasAdInfoJson;
    public long mAdCId;
    public String mAdInfoJson;
    public int mAdSystemOrigin;
    public String mAdType;
    public String mAppName;
    public String mDownloadUrl;
    public long mGroupId;
    public String mLogExtra;
    public String mPackageName;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public AdInfoMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "adInfo";
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void putAdInfo(X.InterfaceC1019840ce6 r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod.putAdInfo(X.0ce6):void");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        Uri uriLIZJ;
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null && kitContainerApi.LJ() == EnumC1054630dYD.WEB && (uriLIZJ = kitContainerApi.LIZJ()) != null) {
            this.mAdInfoJson = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "adinfojson");
            this.hasAdInfoJson = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "has_adinfojson");
        }
        putAdInfo(interfaceC1019840ce6);
    }
}
