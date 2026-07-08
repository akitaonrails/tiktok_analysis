package com.ss.android.ugc.aweme.compliance.business.consent;

import X.AbstractC826920WcE;
import X.C1150504el;
import X.C1916100zxg;
import X.C1916190zxp;
import X.C786410Ut5;
import X.InterfaceC1916060zxc;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IClearCacheService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSDeviceConsentMainActivityAssem extends BaseMainContainerAssem {
    public final C1916190zxp LL = new InterfaceC1916060zxc() { // from class: X.0zxp
        @Override // X.InterfaceC1916060zxc
        public final void LIZ() {
            TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
            if (tTKUserCommunicationService != null) {
                tTKUserCommunicationService.LJIIJJI(EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue(), null, null);
            }
            this.LIZ.getClass();
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
            if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0 || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0zxq
                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZIZ(String str, String str2) {
                        ISecApi iSecApi = (ISecApi) PluggableExtentionKt.pluggableSpi$default(ISecApi.class, false, false, false, 14, null);
                        if (iSecApi != null) {
                            iSecApi.setDeviceInfo(str, str2);
                        }
                        ISecApi iSecApi2 = (ISecApi) PluggableExtentionKt.pluggableSpi$default(ISecApi.class, false, false, false, 14, null);
                        if (iSecApi2 != null) {
                            iSecApi2.reportData("confirm_consent_box");
                        }
                    }
                });
                return;
            }
            ISecApi iSecApi = (ISecApi) PluggableExtentionKt.pluggableSpi$default(ISecApi.class, false, false, false, 14, null);
            if (iSecApi != null) {
                iSecApi.setDeviceInfo(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId);
            }
            ISecApi iSecApi2 = (ISecApi) PluggableExtentionKt.pluggableSpi$default(ISecApi.class, false, false, false, 14, null);
            if (iSecApi2 != null) {
                iSecApi2.reportData("confirm_consent_box");
            }
        }

        @Override // X.InterfaceC1916060zxc
        public final void LIZIZ(String str) {
            IPipFeedService iPipFeedService = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
            if (iPipFeedService != null) {
                iPipFeedService.LJIJI();
            }
        }
    };
    public final C1916100zxg LLILLJJLI = new AbstractC826920WcE() { // from class: X.0zxg
        @Override // X.InterfaceC1915870zxJ
        public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
            if (enumC1876780ywG == EnumC1876780ywG.APPROVE) {
                ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi$default(ISplashAdService.class, false, false, false, 14, null);
                if (iSplashAdService != null) {
                    iSplashAdService.LJIILL();
                }
                IClearCacheService iClearCacheService = (IClearCacheService) PluggableExtentionKt.pluggableSpi$default(IClearCacheService.class, false, false, false, 14, null);
                if (iClearCacheService != null) {
                    iClearCacheService.retryAddClearCacheShortcut();
                }
                IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
                if (iPNSDeviceConsentService != null) {
                    iPNSDeviceConsentService.LJIIIZ(this);
                }
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"PNSDeviceConsentMainActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService != null) {
            iPNSDeviceConsentService.LIZ(this.LL);
        }
        IPNSDeviceConsentService iPNSDeviceConsentService2 = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService2 != null) {
            iPNSDeviceConsentService2.LJIIJJI(this.LLILLJJLI);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService != null) {
            iPNSDeviceConsentService.LJIILJJIL(this.LL);
        }
        IPNSDeviceConsentService iPNSDeviceConsentService2 = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService2 != null) {
            iPNSDeviceConsentService2.LJIIIZ(this.LLILLJJLI);
        }
    }
}
