package com.ss.android.ugc.aweme.request_combine.task;

import X.C0CL2;
import X.C0VU1;
import X.EnumC799870VZh;
import X.InterfaceC312000CKw;
import X.InterfaceC799590VYf;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchCombineSettingsTask extends BaseFetchCombineSettingsTask implements InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchCombineSettingsTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    public FetchCombineSettingsTask() {
        ISettingsRequestApi iSettingsRequestApiLIZJ = SettingsRequestApiImpl.LIZJ();
        if (iSettingsRequestApiLIZJ != null) {
            iSettingsRequestApiLIZJ.LIZ(C0CL2.UG_NEW, new InterfaceC312000CKw() { // from class: X.0COK
                @Override // X.InterfaceC312000CKw
                public final Pair<String, String> getParam() {
                    IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
                    if (iEcUgNewInstallService != null) {
                        return iEcUgNewInstallService.LIZ();
                    }
                    return null;
                }
            });
            iSettingsRequestApiLIZJ.LIZ(C0CL2.TABLET, new InterfaceC312000CKw() { // from class: X.0COL
                @Override // X.InterfaceC312000CKw
                public final Pair<String, String> getParam() {
                    return new Pair<>("is_pad", String.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad()));
                }
            });
            iSettingsRequestApiLIZJ.LIZ(C0CL2.FOLDABLE, new InterfaceC312000CKw() { // from class: X.0COJ
                @Override // X.InterfaceC312000CKw
                public final Pair<String, String> getParam() {
                    IDeviceCapability iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null);
                    return new Pair<>("is_foldable", iDeviceCapability != null ? iDeviceCapability.k(null) : false ? "1" : CardStruct.IStatusCode.DEFAULT);
                }
            });
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }
}
