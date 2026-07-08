package com.ss.android.ugc.aweme.unifiedauth.service;

import X.C08JS;
import X.C09JN;
import X.C0CQJ;
import X.C0CQK;
import X.C0XQ7;
import X.C11S5;
import X.C20684815ws;
import X.C211000rc;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2822017k;
import X.C314510CUn;
import X.C346430Di5;
import X.C346440Di6;
import X.C516201zk;
import X.InterfaceC251700yB;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService;
import com.ss.android.ugc.aweme.unifiedauth.api.UnifiedAuthConfigApi;
import com.ss.android.ugc.aweme.unifiedauth.api.UnifiedAuthEdmApi;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthConfigsUpdateInterval;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthConfigsVersion;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.EdmAndSmsRequestIntervalExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInfoData;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class PopupInfoServiceImpl implements IPopupInfoService {
    public PopupInfoData LIZ;
    public final AtomicInteger LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LJ() {
        C211000rc.LIZ("[SMS]");
        ((ISmsSettingService) ServiceManager.get().getService(ISmsSettingService.class)).LIZJ(new AwS583S0100000_4(this, 152));
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LJI() {
        C211000rc.LIZ("PopupInfoServiceImpl");
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new C346440Di6(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LJII() {
        C211000rc.LIZ("[EDM]");
        UnifiedAuthEdmApi.LIZ.getClass();
        C0CQK.LIZIZ.getEmailSubscribeStatus().LJL(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C516201zk(this, 106), new C09JN() { // from class: X.00rJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PopupInfoServiceImpl@d3fe.fetchEdmSubscribeStatus$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchEdmSubscribeStatus() - error: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C211000rc.LIZIZ("PopupInfoServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("PopupInfoServiceImpl@d3fe.fetchEdmSubscribeStatus$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final PopupInfoData getPopupConfigs() {
        C211000rc.LIZ("PopupInfoServiceImpl");
        return this.LIZ;
    }

    public PopupInfoServiceImpl() {
        C2822017k.LIZ.getClass();
        String string = ((Keva) C2822017k.LIZIZ.getValue()).getString("key_popup_info", "");
        PopupInfoData popupInfoData = null;
        if (string.length() > 0) {
            try {
                popupInfoData = (PopupInfoData) C08JS.LIZ(string, PopupInfoData.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getPopupInfo(keva: ");
                sbLIZ.append(string);
                sbLIZ.append(", error: ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("PopupInfoKeva");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("keva_value", string);
                c2344009Gk.LJIIIIZZ("exception", e.getMessage());
                C20684815ws.LJIILLIIL("get_popup_info_error", c2344009Gk.LIZ);
            }
        }
        this.LIZ = popupInfoData;
        this.LIZIZ = new AtomicInteger(0);
        this.LIZJ = C314510CUn.LIZ().getBoolean("key_edm_need_show_consent", false);
        this.LIZLLL = C314510CUn.LIZ().getBoolean("key_edm_need_show_subscribe", false);
        this.LJ = C314510CUn.LIZ().getBoolean("key_sms_need_show_consent", false);
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final boolean LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDuringNoUpdateInterval(now: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(", getLastRequestTs: ");
        sbLIZ.append(C314510CUn.LIZ().getLong("key_last_cold_start_request_ts", 0L));
        sbLIZ.append(", interval: ");
        EdmAndSmsRequestIntervalExp edmAndSmsRequestIntervalExp = EdmAndSmsRequestIntervalExp.INSTANCE;
        long jFetchInterval = edmAndSmsRequestIntervalExp.fetchInterval();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        sbLIZ.append(jFetchInterval * j);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PopupInfoServiceImpl");
        return System.currentTimeMillis() - C314510CUn.LIZ().getLong("key_last_cold_start_request_ts", 0L) < edmAndSmsRequestIntervalExp.fetchInterval() * j;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LJIIIIZZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLastRequestTs(");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("EdmAndSmsPopupKeva");
        C314510CUn.LIZ().storeLong("key_last_cold_start_request_ts", jCurrentTimeMillis);
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LJIIIZ() {
        ComplianceServiceProvider.LJIJ().LIZJ("unified_auth_popup", new InterfaceC251700yB() { // from class: X.0CUm
            @Override // X.InterfaceC251700yB
            public final void LIZJ() {
                C211000rc.LIZ("[EDM]");
            }

            @Override // X.InterfaceC251700yB
            public final void LIZ(boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchEdmConsentStatus.needShow(");
                sbLIZ.append(z);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[EDM]");
            }

            @Override // X.InterfaceC251700yB
            public final void LIZIZ(boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchEdmConsentStatus.onSuccess(");
                sbLIZ.append(z);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[EDM]");
                this.LIZ.LIZLLL(z);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final boolean LJIIL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LIZJ(boolean z) {
        this.LIZLLL = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEdmNeedShowSubscribe(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("EdmAndSmsPopupKeva");
        C314510CUn.LIZ().storeBoolean("key_edm_need_show_subscribe", z);
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LIZLLL(boolean z) {
        this.LIZJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEdmNeedShowConsent(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("EdmAndSmsPopupKeva");
        C314510CUn.LIZ().storeBoolean("key_edm_need_show_consent", z);
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final List<UnifiedAuthPopupConfig> LJIIJ(boolean z) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchPopupInfo(forceUpdate: ");
        sbLIZ.append(z);
        sbLIZ.append(", updateInterval: ");
        ChannelsAuthConfigsUpdateInterval channelsAuthConfigsUpdateInterval = ChannelsAuthConfigsUpdateInterval.INSTANCE;
        sbLIZ.append(channelsAuthConfigsUpdateInterval.updateInterval());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PopupInfoServiceImpl");
        if (!z) {
            PopupInfoData popupInfoData = this.LIZ;
            if (popupInfoData != null && popupInfoData.version >= ChannelsAuthConfigsVersion.INSTANCE.serverVersion()) {
                C2822017k c2822017k = C2822017k.LIZ;
                long jUpdateInterval = channelsAuthConfigsUpdateInterval.updateInterval() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                c2822017k.getClass();
                if (System.currentTimeMillis() - ((Keva) C2822017k.LIZIZ.getValue()).getLong("key_popup_info_last_update_ts", 0L) < jUpdateInterval) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchPopupInfo() - hit cache! (local: ");
                    PopupInfoData popupInfoData2 = this.LIZ;
                    if (popupInfoData2 != null) {
                        numValueOf = Integer.valueOf(popupInfoData2.version);
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    sbLIZ2.append(", server: ");
                    sbLIZ2.append(ChannelsAuthConfigsVersion.INSTANCE.serverVersion());
                    sbLIZ2.append(')');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("PopupInfoServiceImpl");
                    PopupInfoData popupInfoData3 = this.LIZ;
                    if (popupInfoData3 == null) {
                        return null;
                    }
                    return popupInfoData3.scenes;
                }
            }
            int andIncrement = this.LIZIZ.getAndIncrement();
            if (andIncrement > 0) {
                this.LIZIZ.decrementAndGet();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetchPopupInfo() - skip normal refresh, inFlight=");
                sbLIZ3.append(andIncrement);
                C2188811AlT.LIZIZ(sbLIZ3);
                C211000rc.LIZ("PopupInfoServiceImpl");
                PopupInfoData popupInfoData4 = this.LIZ;
                if (popupInfoData4 == null) {
                    return null;
                }
                return popupInfoData4.scenes;
            }
        } else {
            this.LIZIZ.incrementAndGet();
        }
        UnifiedAuthConfigApi.LIZ.getClass();
        C0CQJ.LIZIZ.getPopupConfigs().LJL(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJIIJ(new C346430Di5(this, 1)).LJJLL(new C516201zk(this, 107), new C09JN() { // from class: X.00rK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PopupInfoServiceImpl@d3fe.fetchPopupInfo$4");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("fetchPopupInfo() - error: ");
                sbLIZ4.append(((Throwable) obj).getMessage());
                C211000rc.LIZIZ("PopupInfoServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
                C1C7U.LIZIZ("PopupInfoServiceImpl@d3fe.fetchPopupInfo$4");
            }
        });
        return null;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService
    public final void LJIIJJI(boolean z) {
        this.LJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSmsNeedShowConsent(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("EdmAndSmsPopupKeva");
        C314510CUn.LIZ().storeBoolean("key_sms_need_show_consent", z);
    }
}
