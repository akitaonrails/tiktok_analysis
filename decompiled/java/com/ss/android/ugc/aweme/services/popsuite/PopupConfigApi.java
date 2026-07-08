package com.ss.android.ugc.aweme.services.popsuite;

import X.C01GW;
import X.C15O7;
import X.C452501pT;
import X.InterfaceC1501160pAQ;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class PopupConfigApi {
    public static final PopupConfigApi INSTANCE = new PopupConfigApi();
    public static final C01GW api$delegate = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(80));
    public static final int $stable = 8;

    public interface Api {
        @InterfaceC1501160pAQ("/passport/popup/configuration/")
        C15O7<PopupConfigApiResponse> getPopupConfigs();
    }

    private final Api getApi() {
        return (Api) api$delegate.getValue();
    }

    public final C15O7<PopupConfigApiResponse> getPopupConfigs() {
        boolean zLJI = MethodIDManager.LJI(137945);
        C15O7<PopupConfigApiResponse> popupConfigs = getApi().getPopupConfigs();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return popupConfigs;
    }
}
