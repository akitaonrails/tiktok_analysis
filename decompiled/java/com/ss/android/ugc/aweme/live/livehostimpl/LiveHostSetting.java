package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C01GW;
import X.C04TD;
import X.C04W5;
import X.C04WR;
import X.C075Y;
import X.C07MW;
import X.C0CLW;
import X.C0CP7;
import X.C0CPM;
import X.C1030440cvC;
import X.C103K;
import X.C1234200iDq;
import X.C1359670lUD;
import X.C1359680lUE;
import X.C1510700pPo;
import X.C1599660rjI;
import X.C1607450rvr;
import X.C1611060s1g;
import X.C1856507Ox;
import X.C1866410yfX;
import X.C20314614eG;
import X.C20441214yg;
import X.C20597915ir;
import X.C2188811AlT;
import X.C274610ApX;
import X.C275330Aqh;
import X.C285800BIc;
import X.C285910BIn;
import X.C292560BdO;
import X.C293010Be7;
import X.C293180BeO;
import X.C293230BeT;
import X.C295310Bhp;
import X.C308130C5z;
import X.C452501pT;
import X.C486680J6s;
import X.C627190Oir;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveColdBootApiOptConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveDiskCleanWithCepExperiment;
import com.bytedance.android.livesdk.performance.LiveColdBootOptConfig;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LiveEntranceAnimConfig;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.experiment.LiveColdBootSecondTabApiOpt;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.live.skylight.LiveSkylightMatchExperiment;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import com.ss.android.ugc.aweme.services.external.IGetPostVideoThresholdService;
import com.ss.android.ugc.aweme.shortvideo.AllowVideoThresholdUtils;
import com.ss.android.ugc.feed.platform.ab.LivePreviewSlideModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveHostSetting implements IHostSetting {
    public final C01GW LL = C452501pT.LIZIZ(new C308130C5z());

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void L61() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean B72() {
        return ((Boolean) C075Y.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean CI0() {
        return ((LivePreviewSlideModel) C20314614eG.LIZIZ.getValue()).enable;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Cg2() {
        return ((Boolean) C293010Be7.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Ji2() {
        return ((Boolean) C04WR.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final JSONObject KF() {
        JSONObject jSONObjectOptJSONObject;
        try {
            Keva repo = Keva.getRepo("TTSettingData");
            if (repo == null || (jSONObjectOptJSONObject = new JSONObject(repo.getString("settingData", "")).optJSONObject("data")) == null) {
                return null;
            }
            return jSONObjectOptJSONObject.optJSONObject("app");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Kx1() {
        return ((Boolean) C274610ApX.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean LO2() {
        return ((Number) C285910BIn.LIZ.getValue()).intValue() >= 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Tt2() {
        return ((Boolean) C1866410yfX.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final String ga1() {
        try {
            return C0CLW.LIZIZ.LIZ.getFeedbackConf().getSubPaymentHelp();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean jL1() {
        return LiveSkylightMatchExperiment.INSTANCE.enableGoLiveBtn();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final String ms1() {
        return (String) C1030440cvC.LIZ.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final long o90() {
        IGetPostVideoThresholdService iGetPostVideoThresholdService;
        Object objLIZ = C04TD.LIZ(IGetPostVideoThresholdService.class, false);
        if (objLIZ != null) {
            iGetPostVideoThresholdService = (IGetPostVideoThresholdService) objLIZ;
        } else {
            if (C04TD.c5 == null) {
                synchronized (IGetPostVideoThresholdService.class) {
                    if (C04TD.c5 == null) {
                        C04TD.c5 = new AllowVideoThresholdUtils();
                    }
                }
            }
            iGetPostVideoThresholdService = C04TD.c5;
        }
        if (iGetPostVideoThresholdService == null) {
            return 600000L;
        }
        return iGetPostVideoThresholdService.getPostVideoThresholdService();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final String oB() {
        FeedbackConf feedbackConf;
        try {
            IESSettingsProxy iESSettingsProxy = C0CLW.LIZIZ.LIZ;
            if (!(iESSettingsProxy instanceof IESSettingsProxy)) {
                iESSettingsProxy = null;
            }
            if (iESSettingsProxy != null && (feedbackConf = iESSettingsProxy.getFeedbackConf()) != null) {
                String abnorLivePurch = feedbackConf.getAbnorLivePurch();
                if (abnorLivePurch != null) {
                    return abnorLivePurch;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final LiveColdBootApiOptConfig pO2() {
        return (LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean r72() {
        return ((LiveDiskCleanWithCepExperiment.LiveDiskCleanRule) LiveDiskCleanWithCepExperiment.LIZIZ.getValue()).enable;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final String tA0() {
        String string = C0CPM.LIZJ;
        if (string == null) {
            string = ((Keva) C0CPM.LIZ.getValue()).getString("live_seting_api_ver_ctr_code", null);
        }
        C0CPM.LIZJ = string;
        return string;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean vx2() {
        C1599660rjI.LIZ.getClass();
        return ((LiveEntranceAnimConfig) C1599660rjI.LIZJ.getValue()).listAvatarAnim;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean wS() {
        return LiveColdBootSecondTabApiOpt.INSTANCE.isEnable();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean xP() {
        return ((Boolean) C04W5.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final LiveColdBootOptConfig JL() {
        return C486680J6s.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Lc1() {
        return C1234200iDq.LIZ().enabled && C1234200iDq.LIZ().newSystemPrompt;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final int Pp1() {
        return C1234200iDq.LIZ().sharerBottomSheetCountDown;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Sl1() {
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
        return privacyUserSettingsV2LJIIIIZZ != null && C103K.LIZ(privacyUserSettingsV2LJIIIIZZ);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Sv0() {
        return C285800BIc.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final String TS1() {
        if (C1607450rvr.LIZ().addAvtarImageDisk) {
            return "live_avatar_cache";
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Xy2() {
        return C1234200iDq.LIZ().enabled && C1234200iDq.LIZ().sharerBottomSheetInLive;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final int ZJ0() {
        if (C1359680lUE.LIZ() == 0) {
            return 2;
        }
        C1359670lUD.LIZ.getClass();
        return C1359670lUD.LIZ() == 2 ? 1 : 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean eR1() {
        return C1856507Ox.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean enableDonationPercentService() {
        IDonationVendorService iDonationVendorService = (IDonationVendorService) ServiceManager.get().getService(IDonationVendorService.class);
        if (iDonationVendorService == null) {
            return false;
        }
        return iDonationVendorService.enableDonationPercentService();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean hW() {
        return C1359680lUE.LIZIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean kc1() {
        return C1510700pPo.LIZ().LJFF(-1, "livesdk_live_play_label") >= ((PreloadWidgetsData) C20597915ir.LIZIZ.getValue()).liveHotLevel;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean nK() {
        return C0CPM.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean oI0() {
        return C295310Bhp.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean oV1() {
        return C275330Aqh.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean pc1() {
        return C1234200iDq.LIZ().enabled && C1234200iDq.LIZ().sharerBannerAfterLive;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean wJ2() {
        return C07MW.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final int BO2(float f) {
        if (!C1611060s1g.LIZ().isTopLiveEnable()) {
            return -1;
        }
        if (f > 0.0f) {
            int i = C1611060s1g.LIZ().topLiveRefreshFrameInterval;
            if (f / i > C1611060s1g.LIZ().minFrameRate) {
                return i;
            }
            return (int) (f / C1611060s1g.LIZ().minFrameRate);
        }
        return 1;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void Nl1(String str) {
        if (((LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue()).settingsApiOptEnable && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store version code: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("LiveSettingVersionCtr", C2188811AlT.LIZIZ(sbLIZ));
            ((Keva) C0CPM.LIZ.getValue()).storeString("live_seting_api_ver_ctr_code", str);
            C0CPM.LIZJ = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0030, code lost:
    
        continue;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C443120HZe<java.lang.Boolean, java.lang.Boolean, java.lang.Integer> Ou0(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<java.lang.String> r0 = X.C1546750qLx.LIZ
            java.util.Iterator r2 = r0.iterator()
        L6:
            boolean r0 = r2.hasNext()
            r5 = 0
            r3 = 0
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r8, r0, r5)
            if (r0 == 0) goto L6
            if (r1 == 0) goto L2a
            X.0HZe r3 = new X.0HZe
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r1, r1, r0)
        L29:
            return r3
        L2a:
            java.util.List<X.0qKZ> r0 = X.C1546750qLx.LIZIZ
            java.util.Iterator r6 = r0.iterator()
        L30:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r6.next()
            X.0qKZ r0 = (X.InterfaceC1545890qKZ) r0
            com.ss.android.ugc.aweme.hybridkit.forest.ForestSettings r4 = r0.LIZ()
            if (r4 == 0) goto L30
            java.util.List<java.lang.String> r0 = r4.patternList
            if (r0 == 0) goto L30
            java.util.Iterator r2 = r0.iterator()
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r8, r0, r5)
            if (r0 == 0) goto L4a
            if (r1 == 0) goto L30
            X.0HZe r3 = new X.0HZe
            int r0 = r4.useMemoryCache
            r1 = 1
            if (r0 != r1) goto L7e
            r0 = 1
        L67:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = r4.parallelFetchResource
            if (r0 != r1) goto L70
            r5 = 1
        L70:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            int r0 = r4.useDynamic
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r2, r1, r0)
            return r3
        L7e:
            r0 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSetting.Ou0(java.lang.String):X.0HZe");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void deleteUselessExposedVids(String str) {
        C293180BeO c293180BeO = (C293180BeO) this.LL.getValue();
        c293180BeO.getClass();
        List<String> listLIZJ = C293180BeO.LIZJ(str);
        if (listLIZJ != null) {
            ((C293230BeT) c293180BeO.LIZLLL.getValue()).LIZJ(listLIZJ);
            C293230BeT c293230BeTLIZIZ = c293180BeO.LIZIZ();
            if (c293230BeTLIZIZ != null) {
                c293230BeTLIZIZ.LIZJ(listLIZJ);
            }
            C292560BdO.LJ();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void setExposedVids(String str) {
        ((C293180BeO) this.LL.getValue()).LIZ(str, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void setExposedVidsByUid(String str) {
        ((C293180BeO) this.LL.getValue()).LIZ(str, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final Map<String, String> yM1(String str) {
        return C0CP7.LIZ.LJI(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void nB2(Context context, String str, long j, String str2) {
        C627190Oir.LIZ.getClass();
        C627190Oir.LIZ(context, str, j, str2, "sub_privilege_page", null);
    }
}
