package com.ss.android.ugc.aweme.unifiedauth.manager;

import X.C054G;
import X.C06C3;
import X.C09A1;
import X.C0NFI;
import X.C0O1V;
import X.C0PEM;
import X.C10CR;
import X.C10DA;
import X.C10DB;
import X.C10DL;
import X.C10DM;
import X.C10DS;
import X.C10DT;
import X.C10DU;
import X.C10DX;
import X.C1388190mED;
import X.C1488240opa;
import X.C1668306g5;
import X.C1865500ye4;
import X.C1890430zIH;
import X.C1917270zzZ;
import X.C1917280zza;
import X.C19207310Ch;
import X.C19207610Ck;
import X.C19208010Co;
import X.C19208110Cp;
import X.C19208610Cu;
import X.C19208810Cw;
import X.C19216610Fw;
import X.C19328310jZ;
import X.C19EG;
import X.C211000rc;
import X.C2188811AlT;
import X.C2255281DPa;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C259800zU;
import X.C290990Bar;
import X.C609600Nva;
import X.C786410Ut5;
import X.C824390WVp;
import X.C849850XVn;
import X.InterfaceC1917300zzc;
import X.ViewOnClickListenerC19207210Cg;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthSkipNewUserFilter;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.EdmConsentStatusCheck;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.EdmSubscribeStatusCheck;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGNewExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGTriggerWeightExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.SmsConsentStatusCheck;
import com.ss.android.ugc.aweme.unifiedauthapi.model.CustomizedFrequencyControl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.NewUserFilters;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupFiltersConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS23S0410000_28;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PushUserGuidePopupManager {
    public static final PushUserGuidePopupManager LIZ = new PushUserGuidePopupManager();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static C10DL LIZJ;

    public interface AppDiffProtocol {
        public static final C1865500ye4 LIZ = C1865500ye4.LIZ;

        boolean LIZ(AwS572S0100000_28 awS572S0100000_28);

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager.AppDiffProtocol
            public final boolean LIZ(AwS572S0100000_28 awS572S0100000_28) {
                return ((Boolean) awS572S0100000_28.invoke()).booleanValue();
            }
        }
    }

    public static String LJII(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Apply Fallback: ");
        sbLIZ.append(z);
        sbLIZ.append(", BackupFreq(");
        sbLIZ.append(C609600Nva.LIZ().backupFreqEnabled);
        sbLIZ.append(", ");
        sbLIZ.append(C609600Nva.LIZ().backupShowUpInterval);
        sbLIZ.append(", ");
        sbLIZ.append(C609600Nva.LIZ().backupCloseTimeLimit);
        sbLIZ.append(", ");
        sbLIZ.append(C609600Nva.LIZ().backupShowUpAfter3Interval);
        sbLIZ.append("), FallbackFreqOptimize: ");
        sbLIZ.append(C609600Nva.LIZ().fallbackFreqOptimizeEnable);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("fallbackFreqCheck");
        if (C609600Nva.LIZ().fallbackFreqOptimizeEnable) {
            if (!z || !C609600Nva.LIZ().backupFreqEnabled) {
                return "";
            }
        } else if (!z && !C609600Nva.LIZ().backupFreqEnabled) {
            return "";
        }
        return new C1917270zzZ("fallback_freq_ctrl", C609600Nva.LIZ().backupShowUpInterval, C609600Nva.LIZ().backupCloseTimeLimit, C609600Nva.LIZ().backupShowUpAfter3Interval).LIZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -1039745817: goto L9;
                case -868304044: goto L14;
                case -682509416: goto L1f;
                case 663928061: goto L2a;
                case 1042943256: goto L35;
                case 1690455341: goto L3e;
                case 1844104722: goto L49;
                default: goto L7;
            }
        L7:
            r1 = 0
        L8:
            return r1
        L9:
            java.lang.String r0 = "normal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "338_normal"
            return r1
        L14:
            java.lang.String r0 = "toggle"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "338_toggle"
            return r1
        L1f:
            java.lang.String r0 = "sms_guide_default"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "sms_normal"
            return r1
        L2a:
            java.lang.String r0 = "push_new_default"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "push_new"
            return r1
        L35:
            java.lang.String r1 = "push_new_toggle"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L8
            goto L7
        L3e:
            java.lang.String r0 = "edm_guide_default"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "edm_normal"
            return r1
        L49:
            java.lang.String r0 = "interaction"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "338_interaction"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager.LJIIIIZZ(java.lang.String):java.lang.String");
    }

    public static boolean LJIIJJI(UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        PopupFiltersConfig popupFiltersConfig;
        C10DL c10dl = new C10DL(unifiedAuthPopupConfig);
        UnifiedAuthPopupConfig.Companion.getClass();
        PopupInstanceConfig popupInstanceConfigLIZ = C0O1V.LIZ(unifiedAuthPopupConfig);
        if (popupInstanceConfigLIZ != null && (popupFiltersConfig = popupInstanceConfigLIZ.popupFiltersConfig) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildFilters(");
            sbLIZ.append(popupFiltersConfig);
            sbLIZ.append(")...");
            C2188811AlT.LIZIZ(sbLIZ);
            C211000rc.LIZ("FiltersManager");
            ((ArrayList) c10dl.LIZIZ.LIZ).clear();
            C211000rc.LIZ("FiltersManager");
            C10DM c10dm = c10dl.LIZIZ;
            final int i = popupFiltersConfig.pushSysPermissionStatusCheck;
            c10dm.LIZ(new C10DX(i) { // from class: X.0DfO
                public final int LIZ;

                @Override // X.C10DX
                public final String LIZ() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("filter(");
                    sbLIZ2.append(this.LIZ);
                    sbLIZ2.append(")...");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("SystemPermissionFilter");
                    int i2 = this.LIZ;
                    if (i2 == 0) {
                        C844470XAv.LIZ.getClass();
                        if (C824390WVp.LIZJ(C844470XAv.LIZ())) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("filtered: ");
                            sbLIZ3.append("has_notification_permission");
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C211000rc.LIZ("SystemPermissionFilter");
                            return "has_notification_permission";
                        }
                    } else if (i2 == 1) {
                        C844470XAv.LIZ.getClass();
                        if (!C824390WVp.LIZJ(C844470XAv.LIZ())) {
                            C211000rc.LIZ("SystemPermissionFilter");
                            return "no_notification_permission";
                        }
                    }
                    C211000rc.LIZ("SystemPermissionFilter");
                    return "";
                }

                {
                    this.LIZ = i;
                }
            });
            if (popupFiltersConfig.loginStatusCheck != -1) {
                C211000rc.LIZ("FiltersManager");
                C10DM c10dm2 = c10dl.LIZIZ;
                final int i2 = popupFiltersConfig.loginStatusCheck;
                c10dm2.LIZ(new C10DX(i2) { // from class: X.0CYR
                    public final int LIZ;

                    @Override // X.C10DX
                    public final String LIZ() {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filter(");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(")...");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("LoginStatusFilter");
                        if ((this.LIZ != 1 || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) && !(this.LIZ == 0 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin())) {
                            C211000rc.LIZ("LoginStatusFilter");
                            return "";
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("filtered: ");
                        sbLIZ3.append("invalid_login_status");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C211000rc.LIZ("LoginStatusFilter");
                        return "invalid_login_status";
                    }

                    {
                        this.LIZ = i2;
                    }
                });
            }
            if (popupFiltersConfig.smsConsentCheck) {
                C211000rc.LIZ("FiltersManager");
                c10dl.LIZIZ.LIZ(new C10DX() { // from class: X.0CUp
                    @Override // X.C10DX
                    public final String LIZ() {
                        User curUser;
                        String bindPhone;
                        C211000rc.LIZ("SmsConsentFilter");
                        if (SmsConsentStatusCheck.INSTANCE.disable()) {
                            C211000rc.LIZ("SmsConsentFilter");
                            return "";
                        }
                        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                        if (iAccountUserServiceLJFF == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null || (bindPhone = curUser.getBindPhone()) == null || bindPhone.length() == 0) {
                            C211000rc.LIZ("SmsConsentFilter");
                            return "no_phone_bound";
                        }
                        if (((IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class)).LIZ()) {
                            C211000rc.LIZ("SmsConsentFilter");
                            return "";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filtered: ");
                        sbLIZ2.append("sms_consented");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("SmsConsentFilter");
                        return "sms_consented";
                    }
                });
            }
            if (popupFiltersConfig.edmConsentCheck) {
                C211000rc.LIZ("FiltersManager");
                c10dl.LIZIZ.LIZ(new C10DX() { // from class: X.0CUq
                    @Override // X.C10DX
                    public final String LIZ() {
                        C211000rc.LIZ("EdmConsentFilter");
                        if (EdmConsentStatusCheck.INSTANCE.disable()) {
                            C211000rc.LIZ("EdmConsentFilter");
                            return "";
                        }
                        if (((IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class)).LIZIZ()) {
                            C211000rc.LIZ("EdmConsentFilter");
                            return "";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filtered: ");
                        sbLIZ2.append("edm_consented");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("EdmConsentFilter");
                        return "edm_consented";
                    }
                });
            }
            if (popupFiltersConfig.edmSubscribeCheck) {
                C211000rc.LIZ("FiltersManager");
                c10dl.LIZIZ.LIZ(new C10DX() { // from class: X.0CUo
                    @Override // X.C10DX
                    public final String LIZ() {
                        C211000rc.LIZ("EdmSubscribeFilter");
                        if (EdmSubscribeStatusCheck.INSTANCE.disable()) {
                            C211000rc.LIZ("EdmSubscribeFilter");
                            return "";
                        }
                        if (((IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class)).LJIIL()) {
                            C211000rc.LIZ("EdmSubscribeFilter");
                            return "";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filtered: ");
                        sbLIZ2.append("edm_subscribed");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("EdmSubscribeFilter");
                        return "edm_subscribed";
                    }
                });
            }
            GuideOutPushUGTriggerWeightExp.LIZ.getClass();
            if (((Boolean) GuideOutPushUGTriggerWeightExp.LIZLLL.getValue()).booleanValue()) {
                C211000rc.LIZ("FiltersManager");
                C10DM c10dm3 = c10dl.LIZIZ;
                final String str = unifiedAuthPopupConfig.trigger;
                c10dm3.LIZ(new C10DX(str) { // from class: X.0zzY
                    public final String LIZ;

                    @Override // X.C10DX
                    public final String LIZ() {
                        Double d;
                        AbstractC1387200mCc abstractC1387200mCcLJFF;
                        Fragment fragmentLIZLLL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filter(");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(")...");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("IntelligenceWeightFilter");
                        if (TextUtils.isEmpty(this.LIZ)) {
                            C211000rc.LIZ("IntelligenceWeightFilter");
                            return "";
                        }
                        GuideOutPushUGTriggerWeightExp.LIZ.getClass();
                        Map<String, Double> map = GuideOutPushUGTriggerWeightExp.LJI;
                        if (map.isEmpty()) {
                            C211000rc.LIZ("IntelligenceWeightFilter");
                            return "";
                        }
                        String str2 = this.LIZ;
                        if (str2 != null && (d = map.get(str2)) != null) {
                            double dDoubleValue = d.doubleValue();
                            if (dDoubleValue < 1.0d) {
                                double dNextDouble = C19994513Lb.LIZIZ(SystemClock.elapsedRealtime()).nextDouble(1.0d);
                                if (((Boolean) GuideOutPushUGTriggerWeightExp.LJFF.getValue()).booleanValue() && (abstractC1387200mCcLJFF = C1906580ziK.LJFF()) != null && (fragmentLIZLLL = abstractC1387200mCcLJFF.LIZLLL()) != null) {
                                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("pitayaCheck(");
                                    sbLIZ3.append(dNextDouble);
                                    sbLIZ3.append(", ");
                                    sbLIZ3.append(dDoubleValue);
                                    sbLIZ3.append(')');
                                    c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ3));
                                    c1389890mGx.LJIIJJI();
                                }
                                if (dNextDouble <= dDoubleValue) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("pass IntelligenceWeightFilter(");
                                    sbLIZ4.append(dNextDouble);
                                    sbLIZ4.append(", ");
                                    sbLIZ4.append(dDoubleValue);
                                    sbLIZ4.append(')');
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                    C211000rc.LIZ("IntelligenceWeightFilter");
                                    return "";
                                }
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("filtered by IntelligenceWeightFilter(");
                                sbLIZ5.append(dNextDouble);
                                sbLIZ5.append(", ");
                                sbLIZ5.append(dDoubleValue);
                                sbLIZ5.append(')');
                                C2188811AlT.LIZIZ(sbLIZ5);
                                C211000rc.LIZ("IntelligenceWeightFilter");
                                return "scene_weight_control";
                            }
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("pass IntelligenceWeightFilter: ");
                        sbLIZ6.append(this.LIZ);
                        sbLIZ6.append(" weight >= 1.0!");
                        C2188811AlT.LIZIZ(sbLIZ6);
                        C211000rc.LIZ("IntelligenceWeightFilter");
                        return "";
                    }

                    {
                        this.LIZ = str;
                    }
                });
            }
            if (popupFiltersConfig.enableUnifiedFreqCtrlSettings) {
                C211000rc.LIZ("FiltersManager");
                InterfaceC1917300zzc interfaceC1917300zzc = new InterfaceC1917300zzc() { // from class: X.0zzX
                    public long LIZ = -1;
                    public int LIZIZ;
                    public int LIZJ;
                    public int LIZLLL;

                    @Override // X.InterfaceC1917300zzc
                    public final String LIZLLL() {
                        return "key_cross_guide_out_push_dialog";
                    }

                    @Override // X.InterfaceC1917300zzc
                    public final String LJFF() {
                        return "key_times_guide_out_push_dialog";
                    }

                    @Override // X.C10DX
                    public final String LIZ() {
                        C211000rc.LIZ("UnifiedFrequencyControlFilter");
                        if (!((Boolean) GuideOutPushExperiment.LIZLLL.getValue()).booleanValue()) {
                            C211000rc.LIZ("[Push]");
                            this.LIZ = -1L;
                            return "";
                        }
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        long jLIZJ = C813020Vuu.LJIIL().LIZJ(contextLIZ, "key_cross_guide_out_push_dialog");
                        long jLIZ = C1917280zza.LIZ(this, contextLIZ);
                        if (((Boolean) GuideOutPushUGNewExp.LJIIJJI.getValue()).booleanValue()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("overrideFrequency: ");
                            sbLIZ2.append(this.LIZJ);
                            sbLIZ2.append(" -> ");
                            sbLIZ2.append(GuideOutPushUGNewExp.LJIIIIZZ());
                            sbLIZ2.append(", ");
                            sbLIZ2.append(this.LIZIZ);
                            sbLIZ2.append(" -> ");
                            sbLIZ2.append(GuideOutPushUGNewExp.LIZJ());
                            sbLIZ2.append(", ");
                            sbLIZ2.append(this.LIZLLL);
                            sbLIZ2.append(" -> ");
                            sbLIZ2.append(GuideOutPushUGNewExp.LJII());
                            sbLIZ2.append(", ");
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C211000rc.LIZ("[Push]");
                            this.LIZJ = GuideOutPushUGNewExp.LJIIIIZZ();
                            this.LIZIZ = GuideOutPushUGNewExp.LIZJ();
                            this.LIZLLL = GuideOutPushUGNewExp.LJII();
                            if (((Boolean) GuideOutPushUGNewExp.LJIILL.getValue()).booleanValue() && GuideOutPushUGNewExp.LJIIIZ()) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("nuDifferentFreq: ");
                                sbLIZ3.append(this.LIZJ);
                                sbLIZ3.append(" -> ");
                                sbLIZ3.append(GuideOutPushUGNewExp.LJI());
                                sbLIZ3.append(", ");
                                sbLIZ3.append(this.LIZIZ);
                                sbLIZ3.append(" -> ");
                                sbLIZ3.append(GuideOutPushUGNewExp.LJ());
                                sbLIZ3.append(", ");
                                sbLIZ3.append(this.LIZLLL);
                                sbLIZ3.append(" -> ");
                                sbLIZ3.append(GuideOutPushUGNewExp.LJFF());
                                sbLIZ3.append(", ");
                                C2188811AlT.LIZIZ(sbLIZ3);
                                C211000rc.LIZ("[Push]");
                                this.LIZJ = GuideOutPushUGNewExp.LJI();
                                this.LIZIZ = GuideOutPushUGNewExp.LJ();
                                this.LIZLLL = GuideOutPushUGNewExp.LJFF();
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jLIZ < this.LIZIZ) {
                            this.LIZ = TimeUnit.DAYS.toMinutes(this.LIZJ);
                            if (jCurrentTimeMillis - jLIZJ > ((long) this.LIZJ) * 86400000) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("should show dialog because < ");
                                sbLIZ4.append(this.LIZIZ);
                                sbLIZ4.append(" times and interval < ");
                                sbLIZ4.append(this.LIZJ);
                                sbLIZ4.append(" days");
                                C2188811AlT.LIZIZ(sbLIZ4);
                                C211000rc.LIZ("[Push]");
                                return "";
                            }
                        }
                        if (jLIZ >= this.LIZIZ) {
                            this.LIZ = TimeUnit.DAYS.toMinutes(this.LIZLLL);
                            if (jCurrentTimeMillis - jLIZJ > ((long) this.LIZLLL) * 86400000) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("should show dialog because >= ");
                                sbLIZ5.append(this.LIZIZ);
                                sbLIZ5.append(" times and interval > ");
                                sbLIZ5.append(this.LIZLLL);
                                sbLIZ5.append(" days");
                                C2188811AlT.LIZIZ(sbLIZ5);
                                C211000rc.LIZ("[Push]");
                                return "";
                            }
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Popup filtered(now:");
                        sbLIZ6.append(jCurrentTimeMillis);
                        sbLIZ6.append(" stamp:");
                        sbLIZ6.append(jLIZJ);
                        sbLIZ6.append(" showUpInterval:");
                        sbLIZ6.append(this.LIZJ);
                        sbLIZ6.append(" showUpAfter3TimesInterval:");
                        sbLIZ6.append(this.LIZLLL);
                        sbLIZ6.append(" times:");
                        sbLIZ6.append(jLIZ);
                        sbLIZ6.append(')');
                        C2188811AlT.LIZIZ(sbLIZ6);
                        C211000rc.LIZ("[Push]");
                        return "frequency_control";
                    }

                    {
                        this.LIZIZ = 3;
                        this.LIZJ = 15;
                        this.LIZLLL = 60;
                        try {
                            this.LIZIZ = ((Number) GuideOutPushExperiment.LJII.getValue()).intValue();
                            this.LIZJ = ((Number) GuideOutPushExperiment.LJFF.getValue()).intValue();
                            this.LIZLLL = ((Number) GuideOutPushExperiment.LJI.getValue()).intValue();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZIZ = 3;
                            this.LIZJ = 15;
                            this.LIZLLL = 60;
                        }
                    }

                    @Override // X.InterfaceC1917300zzc
                    public final long LJI() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1917300zzc
                    public final long LIZJ(Context context) {
                        return C1917280zza.LIZ(this, context);
                    }

                    @Override // X.InterfaceC1917300zzc
                    public final void LIZIZ(long j, Context context) {
                        C1917280zza.LIZJ(this, context, j);
                    }

                    @Override // X.InterfaceC1917300zzc
                    public final void LJ(long j, Context context) {
                        C1917280zza.LIZIZ(this, context, j);
                    }
                };
                c10dl.LIZIZ.LIZ(interfaceC1917300zzc);
                ((ArrayList) c10dl.LIZJ).add(interfaceC1917300zzc);
            }
            List<CustomizedFrequencyControl> list = popupFiltersConfig.customizedFreqCtrls;
            if (list != null) {
                for (CustomizedFrequencyControl customizedFrequencyControl : list) {
                    C211000rc.LIZ("FiltersManager");
                    C1917270zzZ c1917270zzZ = new C1917270zzZ(customizedFrequencyControl.name, customizedFrequencyControl.showUpInterval, customizedFrequencyControl.exitingLimit, customizedFrequencyControl.showUpIntervalAfterExiting);
                    c10dl.LIZIZ.LIZ(c1917270zzZ);
                    ((ArrayList) c10dl.LIZJ).add(c1917270zzZ);
                }
            }
            List<String> list2 = popupFiltersConfig.enabledSubScenes;
            if (list2 != null && !list2.isEmpty()) {
                C211000rc.LIZ("FiltersManager");
                final String str2 = c10dl.LIZ.subSceneId;
                final List<String> list3 = popupFiltersConfig.enabledSubScenes;
                c10dl.LIZIZ.LIZ(new C10DX(str2, list3) { // from class: X.0CYQ
                    public final String LIZ;
                    public final List<String> LIZIZ;

                    @Override // X.C10DX
                    public final String LIZ() {
                        List<String> list4;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filter(");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(" @ ");
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append(")...");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("SubScenesFilter");
                        if (C2105908Mv.LIZ(this.LIZ) || (list4 = this.LIZIZ) == null || list4.isEmpty()) {
                            C211000rc.LIZ("SubScenesFilter");
                            return "";
                        }
                        if (this.LIZIZ.contains(this.LIZ)) {
                            C211000rc.LIZ("SubScenesFilter");
                            return "";
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("filtered: ");
                        sbLIZ3.append("forbidden_sub_scene");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C211000rc.LIZ("SubScenesFilter");
                        return "forbidden_sub_scene";
                    }

                    {
                        this.LIZ = str2;
                        this.LIZIZ = list3;
                    }
                });
            }
            if (popupFiltersConfig.newUserFilter != null) {
                C211000rc.LIZ("FiltersManager");
                final NewUserFilters newUserFilters = popupFiltersConfig.newUserFilter;
                c10dl.LIZIZ.LIZ(new C10DX(newUserFilters) { // from class: X.0CYP
                    public final NewUserFilters LIZ;

                    @Override // X.C10DX
                    public final String LIZ() {
                        if (ChannelsAuthSkipNewUserFilter.INSTANCE.skip()) {
                            C211000rc.LIZ("NewUserFilter");
                            return "";
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - C1514430pVp.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filter(");
                        NewUserFilters newUserFilters2 = this.LIZ;
                        sbLIZ2.append(newUserFilters2 != null ? Double.valueOf(newUserFilters2.moreThanXDays) : null);
                        sbLIZ2.append(", ");
                        NewUserFilters newUserFilters3 = this.LIZ;
                        sbLIZ2.append(newUserFilters3 != null ? Double.valueOf(newUserFilters3.lessThanXDays) : null);
                        sbLIZ2.append(") & installed ");
                        double d = jCurrentTimeMillis;
                        sbLIZ2.append((d / 1000.0d) / ((double) 3600));
                        sbLIZ2.append(" hours ago!");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C211000rc.LIZ("NewUserFilter");
                        NewUserFilters newUserFilters4 = this.LIZ;
                        if (newUserFilters4 != null) {
                            Double dValueOf = Double.valueOf(newUserFilters4.moreThanXDays);
                            double dDoubleValue = dValueOf.doubleValue();
                            if (dDoubleValue > 0.0d && d < dDoubleValue * TimeUnit.DAYS.toMillis(1L)) {
                                dValueOf.doubleValue();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("filtered: less than ");
                                sbLIZ3.append(this.LIZ.moreThanXDays);
                                sbLIZ3.append(" days user!");
                                C2188811AlT.LIZIZ(sbLIZ3);
                                C211000rc.LIZ("NewUserFilter");
                                return "x_days_new_user";
                            }
                        }
                        NewUserFilters newUserFilters5 = this.LIZ;
                        if (newUserFilters5 != null) {
                            Double dValueOf2 = Double.valueOf(newUserFilters5.lessThanXDays);
                            double dDoubleValue2 = dValueOf2.doubleValue();
                            if (dDoubleValue2 > 0.0d && d > dDoubleValue2 * TimeUnit.DAYS.toMillis(1L)) {
                                dValueOf2.doubleValue();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("filtered: more than ");
                                sbLIZ4.append(this.LIZ.moreThanXDays);
                                sbLIZ4.append(" days user!");
                                C2188811AlT.LIZIZ(sbLIZ4);
                                C211000rc.LIZ("NewUserFilter");
                                return "x_days_new_user";
                            }
                        }
                        C211000rc.LIZ("NewUserFilter");
                        return "";
                    }

                    {
                        this.LIZ = newUserFilters;
                    }
                });
            }
        }
        LIZJ = c10dl;
        AppDiffProtocol.LIZ.getClass();
        return C1865500ye4.LIZIZ.getValue().LIZ(new AwS572S0100000_28(c10dl, 586));
    }

    public static void LJIIJ(UnifiedAuthPopupConfig unifiedAuthPopupConfig, Context context) {
        if (Intrinsics.LJFF(unifiedAuthPopupConfig.trigger, "inbox")) {
            Keva keva = C1890430zIH.LIZ;
            C1890430zIH.LIZ.storeLong("key_unified_push_permission", System.currentTimeMillis());
        }
        if (Intrinsics.LJFF(unifiedAuthPopupConfig.trigger, "app_launch")) {
            C1488240opa.LIZ().storeInt("launch_guide_new_show_times", C1488240opa.LIZ().getInt("launch_guide_new_show_times", 0) + 1);
            C1488240opa.LIZ().storeLong("launch_guide_new_last_time", System.currentTimeMillis());
        }
        C10DL c10dl = LIZJ;
        if (c10dl != null) {
            C211000rc.LIZ("FiltersManager");
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (InterfaceC1917300zzc interfaceC1917300zzc : (ArrayList) c10dl.LIZJ) {
                interfaceC1917300zzc.LJ(jCurrentTimeMillis, context);
                interfaceC1917300zzc.LIZIZ(interfaceC1917300zzc.LIZJ(context) + 1, context);
            }
            if (C609600Nva.LIZ().recordBackupShowUp) {
                C211000rc.LIZ("FiltersManager");
                C1917270zzZ c1917270zzZ = new C1917270zzZ("fallback_freq_ctrl", 4, 3, 7);
                c1917270zzZ.LJ = true;
                C1917280zza.LIZIZ(c1917270zzZ, context, jCurrentTimeMillis);
                C1917280zza.LIZJ(c1917270zzZ, context, C1917280zza.LIZ(c1917270zzZ, context) + 1);
            }
        }
    }

    public static void LIZJ(Context context, UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z) {
        if (!C2255281DPa.LIZ()) {
            return;
        }
        if (((Boolean) C2255281DPa.LJI.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LIZIZ, null, null, new C06C3(C786410Ut5.N3(context), unifiedAuthPopupConfig, z, null), 3);
        } else {
            LJIIIZ(context, unifiedAuthPopupConfig, z);
        }
    }

    public static void LJIIIZ(Context context, UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z) {
        String str;
        if (!C824390WVp.LIZJ(context)) {
            long j = unifiedAuthPopupConfig.triggerTS;
            String str2 = unifiedAuthPopupConfig.trigger;
            long j2 = unifiedAuthPopupConfig.currentFreqCtrl;
            String str3 = unifiedAuthPopupConfig.filterReason;
            UnifiedAuthPopupConfig.Companion.getClass();
            PopupInstanceConfig popupInstanceConfigLIZ = C0O1V.LIZ(unifiedAuthPopupConfig);
            if (popupInstanceConfigLIZ == null || (str = popupInstanceConfigLIZ.panelType) == null) {
                str = "normal";
            }
            C10CR c10cr = C10CR.NOT_ACTION_TYPE;
            ((IPushOptInTrackingApi) ServiceManager.get().getService(IPushOptInTrackingApi.class)).LIZLLL(C19216610Fw.LIZ(j, z ? 1 : 0, str2, c10cr.getValue(), str3, str, j2, c10cr.getDisplayName()), !z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return LIZIZ(r11, r12, r13, true);
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.10DO] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.10D3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class LJIIL(final android.content.Context r11, final X.C10DS r12, final com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager.LJIIL(android.content.Context, X.10DS, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig):java.lang.Class");
    }

    public static Class LIZ(List list, Context context, UnifiedAuthPopupConfig unifiedAuthPopupConfig, C10DS c10ds) {
        C211000rc.LIZ("PushUserGuidePopupManager");
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sub switch: ");
            sbLIZ.append(str);
            sbLIZ.append(" = ");
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            sbLIZ.append(c19328310jZ.LIZLLL(str));
            C2188811AlT.LIZIZ(sbLIZ);
            C211000rc.LIZ("[Push]");
            if (c19328310jZ.LIZLLL(str) == 0) {
                z = true;
            }
        }
        if (z) {
            C211000rc.LIZ("PushUserGuidePopupManager");
            return LJIIL(context, c10ds, unifiedAuthPopupConfig);
        }
        C211000rc.LIZ("PushUserGuidePopupManager");
        unifiedAuthPopupConfig.setFilterReason("sub_switches_on");
        LIZJ(context, unifiedAuthPopupConfig, false);
        if (c10ds != null) {
            c10ds.LIZ("sub_switches_on");
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class LIZIZ(Context context, C10DS c10ds, UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z) {
        C259800zU c259800zU = new C259800zU();
        IntelligentPopupHelper intelligentPopupHelper = IntelligentPopupHelper.LIZ;
        AwS23S0410000_28 awS23S0410000_28 = new AwS23S0410000_28(context, c10ds, unifiedAuthPopupConfig, c259800zU, z, 1);
        intelligentPopupHelper.getClass();
        IntelligentPopupHelper.LJ(new AwS553S0100000_9(unifiedAuthPopupConfig, 1581));
        if (!C609600Nva.LIZ().enable) {
            IntelligentPopupHelper.LJ(AFwS195S0000000_9.get$arr$(338));
            awS23S0410000_28.invoke(Boolean.TRUE, null);
        } else {
            C23250099c.LIZLLL(IntelligentPopupHelper.LIZJ(context), C0PEM.LIZJ, null, new C0NFI(unifiedAuthPopupConfig, awS23S0410000_28, null), 2);
            IntelligentPopupHelper.LJ(AFwS195S0000000_9.get$arr$(343));
        }
        return (Class) c259800zU.element;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.10DN] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.10D4] */
    public static Class LJ(final Context context, final C10DS c10ds, final UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z) {
        C19207310Ch c19207310Ch;
        boolean zIsSAAActivity;
        String str;
        PopupElementsConfig popupElementsConfig;
        String strLJII = LJII(z);
        if (!TextUtils.isEmpty(strLJII)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not show opt-in prompt: ");
            sbLIZ.append(strLJII);
            sbLIZ.append('!');
            C2188811AlT.LIZIZ(sbLIZ);
            C211000rc.LIZ("[Push-New]");
            unifiedAuthPopupConfig.setFilterReason(strLJII);
            LIZJ(context, unifiedAuthPopupConfig, false);
            if (c10ds != null) {
                c10ds.LIZ(unifiedAuthPopupConfig.filterReason);
            }
            return null;
        }
        UnifiedAuthPopupConfig.Companion.getClass();
        PopupInstanceConfig popupInstanceConfigLIZ = C0O1V.LIZ(unifiedAuthPopupConfig);
        if (popupInstanceConfigLIZ != null && (popupElementsConfig = popupInstanceConfigLIZ.popupElementsConfig) != null && (popupElementsConfig.header != null || popupElementsConfig.usersList != null)) {
            c19207310Ch = new C19207310Ch(context, unifiedAuthPopupConfig);
        } else {
            c19207310Ch = null;
        }
        ?? r11 = new C10DT() { // from class: X.10DN
            @Override // X.C10DT
            public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                C211000rc.LIZ("[Push-New]");
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.LIZIZ(1, abstractC343940De4);
                }
            }
        };
        ?? r12 = new C10DU() { // from class: X.10D4
            @Override // X.C10DU
            public final void LIZIZ() {
                C211000rc.LIZ("[Push-New]");
                PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                Context context2 = context;
                pushUserGuidePopupManager.getClass();
                PushUserGuidePopupManager.LJIIJ(unifiedAuthPopupConfig2, context2);
                PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, true);
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.onShow(1);
                }
            }

            @Override // X.C10DU
            public final void LIZ(String str2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("doShowPushNewPopup#tryShowNewDialog.onNotShow(");
                sbLIZ2.append(str2);
                sbLIZ2.append(')');
                C2188811AlT.LIZIZ(sbLIZ2);
                C211000rc.LIZ("[Push-New]");
                unifiedAuthPopupConfig.setFilterReason(str2);
                PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                Context context2 = context;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                pushUserGuidePopupManager.getClass();
                PushUserGuidePopupManager.LIZJ(context2, unifiedAuthPopupConfig2, false);
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.LIZ(str2);
                }
            }
        };
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (!PopupManager.LJI() && c19egLIZIZ != null) {
            ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService != null) {
                zIsSAAActivity = iCreativeSAAService.isSAAActivity(c19egLIZIZ);
            } else {
                zIsSAAActivity = false;
            }
            if (C290990Bar.LIZ() && zIsSAAActivity) {
                r12.LIZ("creative_tools_forbid");
                return null;
            }
            C19207610Ck c19207610Ck = new C19207610Ck(c19egLIZIZ, unifiedAuthPopupConfig, c19207310Ch, r11, r12);
            PopupInstanceConfig popupInstanceConfigLIZ2 = C0O1V.LIZ(unifiedAuthPopupConfig);
            if (popupInstanceConfigLIZ2 == null || (str = popupInstanceConfigLIZ2.panelType) == null) {
                str = "push_new_default";
            }
            String strLJIIIIZZ = LJIIIIZZ(str);
            if (strLJIIIIZZ == null) {
                strLJIIIIZZ = "";
            }
            PopupManager.LJIJ(c19207610Ck, strLJIIIIZZ, new C1668306g5(unifiedAuthPopupConfig.popupTriggerId));
            return C19207610Ck.class;
        }
        r12.LIZ("has_other_popup_showing");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.10D8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.10D7] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.10DQ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.10DP] */
    public static Class LJFF(final Context context, final C10DS c10ds, final UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z) {
        boolean zIsSAAActivity;
        boolean zIsSAAActivity2;
        String str;
        PopupInstanceConfig popupInstanceConfig;
        String strLJII = LJII(z);
        if (!TextUtils.isEmpty(strLJII)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not show opt-in prompt: ");
            sbLIZ.append(strLJII);
            sbLIZ.append('!');
            C2188811AlT.LIZIZ(sbLIZ);
            C211000rc.LIZ("[Push]");
            unifiedAuthPopupConfig.setFilterReason(strLJII);
            LIZJ(context, unifiedAuthPopupConfig, false);
            if (c10ds != null) {
                c10ds.LIZ(unifiedAuthPopupConfig.filterReason);
            }
            return null;
        }
        ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg = new ViewOnClickListenerC19207210Cg(context, unifiedAuthPopupConfig);
        if (C849850XVn.LIZIZ.LIZJ().LJJ("338") && !TextUtils.isEmpty(unifiedAuthPopupConfig.popupTriggerId)) {
            ?? r6 = new C10DT() { // from class: X.10DP
                @Override // X.C10DT
                public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                    C211000rc.LIZ("[Push]");
                    C10DS c10ds2 = c10ds;
                    if (c10ds2 != null) {
                        c10ds2.LIZIZ(1, abstractC343940De4);
                    }
                }
            };
            ?? r2 = new C10DU() { // from class: X.10D7
                @Override // X.C10DU
                public final void LIZIZ() {
                    C211000rc.LIZ("[Push]");
                    PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                    UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                    Context context2 = context;
                    pushUserGuidePopupManager.getClass();
                    PushUserGuidePopupManager.LJIIJ(unifiedAuthPopupConfig2, context2);
                    PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, true);
                    C10DS c10ds2 = c10ds;
                    if (c10ds2 != null) {
                        c10ds2.onShow(1);
                    }
                }

                @Override // X.C10DU
                public final void LIZ(String str2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("tryShowNewSceneGuideOutPushDialog#tryShowStandardDialog.onNotShow(");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(')');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("[Push]");
                    unifiedAuthPopupConfig.setFilterReason(str2);
                    PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                    Context context2 = context;
                    UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                    pushUserGuidePopupManager.getClass();
                    PushUserGuidePopupManager.LIZJ(context2, unifiedAuthPopupConfig2, false);
                    C10DS c10ds2 = c10ds;
                    if (c10ds2 != null) {
                        c10ds2.LIZ(str2);
                    }
                }
            };
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (!PopupManager.LJI() && c19egLIZIZ != null) {
                ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService != null) {
                    zIsSAAActivity2 = iCreativeSAAService.isSAAActivity(c19egLIZIZ);
                } else {
                    zIsSAAActivity2 = false;
                }
                if (C290990Bar.LIZ() && zIsSAAActivity2) {
                    r2.LIZ("creative_tools_forbid");
                    return null;
                }
                C19208810Cw c19208810Cw = new C19208810Cw(c19egLIZIZ, viewOnClickListenerC19207210Cg, r6, r2);
                List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
                if (list == null || !(!list.isEmpty()) || unifiedAuthPopupConfig.currentIndex >= list.size() || (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex)) == null || (str = popupInstanceConfig.panelType) == null) {
                    str = "normal";
                }
                String strLJIIIIZZ = LJIIIIZZ(str);
                if (strLJIIIIZZ == null) {
                    strLJIIIIZZ = "";
                }
                PopupManager.LJIJ(c19208810Cw, strLJIIIIZZ, new C1668306g5(unifiedAuthPopupConfig.popupTriggerId));
                return C19208810Cw.class;
            }
            r2.LIZ("has_other_popup_showing");
            return null;
        }
        ?? r3 = new C10DT() { // from class: X.10DQ
            @Override // X.C10DT
            public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                C211000rc.LIZ("[Push]");
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.LIZIZ(1, abstractC343940De4);
                }
            }
        };
        ?? r22 = new C10DU() { // from class: X.10D8
            @Override // X.C10DU
            public final void LIZIZ() {
                C211000rc.LIZ("[Push]");
                PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                Context context2 = context;
                pushUserGuidePopupManager.getClass();
                PushUserGuidePopupManager.LJIIJ(unifiedAuthPopupConfig2, context2);
                PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, true);
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.onShow(1);
                }
            }

            @Override // X.C10DU
            public final void LIZ(String str2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryShowNewSceneGuideOutPushDialog#tryShowDialog.onNotShow(");
                sbLIZ2.append(str2);
                sbLIZ2.append(')');
                C2188811AlT.LIZIZ(sbLIZ2);
                C211000rc.LIZ("[Push]");
                unifiedAuthPopupConfig.setFilterReason(str2);
                PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                Context context2 = context;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                pushUserGuidePopupManager.getClass();
                PushUserGuidePopupManager.LIZJ(context2, unifiedAuthPopupConfig2, false);
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.LIZ(str2);
                }
            }
        };
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        if (!PopupManager.LJI() && c19egLIZIZ2 != null) {
            ICreativeSAAService iCreativeSAAService2 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService2 != null) {
                zIsSAAActivity = iCreativeSAAService2.isSAAActivity(c19egLIZIZ2);
            } else {
                zIsSAAActivity = false;
            }
            if (C290990Bar.LIZ() && zIsSAAActivity) {
                r22.LIZ("creative_tools_forbid");
                return null;
            }
            PopupManager.LJIJI(new C19208610Cu(c19egLIZIZ2, viewOnClickListenerC19207210Cg, r3, r22), true);
            return C19208610Cu.class;
        }
        r22.LIZ("has_other_popup_showing");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10D5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.10DE] */
    public static Class LIZLLL(PushUserGuidePopupManager pushUserGuidePopupManager, final Context context, final UnifiedAuthPopupConfig unifiedAuthPopupConfig, final C10DA c10da, int i) {
        final boolean z;
        if ((i & 4) != 0) {
            c10da = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        pushUserGuidePopupManager.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (!PopupManager.LJI() && c19egLIZIZ != null) {
            PopupManager.LJIJ(new C19208110Cp(unifiedAuthPopupConfig, c19egLIZIZ, new C10DT() { // from class: X.10DE
                @Override // X.C10DT
                public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doShowEdmPopup.onDismiss(");
                    sbLIZ.append(abstractC343940De4);
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[EDM]");
                    C10DS c10ds = c10da;
                    if (c10ds != null) {
                        c10ds.LIZIZ(1, abstractC343940De4);
                    }
                }
            }, new C10DU() { // from class: X.10D5
                @Override // X.C10DU
                public final void LIZIZ() {
                    C211000rc.LIZ("[EDM]");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Popup configs(");
                    sbLIZ.append(C105700ad.LIZIZ(unifiedAuthPopupConfig));
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[EDM]");
                    if (z) {
                        PushUserGuidePopupManager pushUserGuidePopupManager2 = PushUserGuidePopupManager.LIZ;
                        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                        Context context2 = context;
                        pushUserGuidePopupManager2.getClass();
                        PushUserGuidePopupManager.LJIIJ(unifiedAuthPopupConfig2, context2);
                    }
                    C10DS c10ds = c10da;
                    if (c10ds != null) {
                        c10ds.onShow(1);
                    }
                }

                @Override // X.C10DU
                public final void LIZ(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doShowEdmPopup.onNotShow(");
                    sbLIZ.append(str);
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[EDM]");
                    unifiedAuthPopupConfig.setFilterReason(str);
                    C10DS c10ds = c10da;
                    if (c10ds != null) {
                        c10ds.LIZ(str);
                    }
                }
            }), "edm_normal", new C1668306g5(unifiedAuthPopupConfig.popupTriggerId));
            return C19208110Cp.class;
        }
        if (c10da == null) {
            return null;
        }
        c10da.LIZ("has_other_popup_showing");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10D6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.10DF] */
    public static Class LJI(PushUserGuidePopupManager pushUserGuidePopupManager, final Context context, final UnifiedAuthPopupConfig unifiedAuthPopupConfig, final C10DB c10db, int i) {
        final boolean z;
        if ((i & 4) != 0) {
            c10db = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        pushUserGuidePopupManager.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (!PopupManager.LJI() && c19egLIZIZ != null) {
            PopupManager.LJIJ(new C19208010Co(unifiedAuthPopupConfig, c19egLIZIZ, new C10DT() { // from class: X.10DF
                @Override // X.C10DT
                public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doShowSmsPopup.onDismiss(");
                    sbLIZ.append(abstractC343940De4);
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[SMS]");
                    C10DS c10ds = c10db;
                    if (c10ds != null) {
                        c10ds.LIZIZ(1, abstractC343940De4);
                    }
                }
            }, new C10DU() { // from class: X.10D6
                @Override // X.C10DU
                public final void LIZIZ() {
                    C211000rc.LIZ("[SMS]");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Popup configs(");
                    sbLIZ.append(C105700ad.LIZIZ(unifiedAuthPopupConfig));
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[SMS]");
                    if (z) {
                        PushUserGuidePopupManager pushUserGuidePopupManager2 = PushUserGuidePopupManager.LIZ;
                        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = unifiedAuthPopupConfig;
                        Context context2 = context;
                        pushUserGuidePopupManager2.getClass();
                        PushUserGuidePopupManager.LJIIJ(unifiedAuthPopupConfig2, context2);
                    }
                    C10DS c10ds = c10db;
                    if (c10ds != null) {
                        c10ds.onShow(1);
                    }
                }

                @Override // X.C10DU
                public final void LIZ(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doShowSmsPopup.onNotShow(");
                    sbLIZ.append(str);
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[SMS]");
                    unifiedAuthPopupConfig.setFilterReason(str);
                    C10DS c10ds = c10db;
                    if (c10ds != null) {
                        c10ds.LIZ(str);
                    }
                }
            }), "sms_normal", new C1668306g5(unifiedAuthPopupConfig.popupTriggerId));
            return C19208010Co.class;
        }
        if (c10db == null) {
            return null;
        }
        c10db.LIZ("has_other_popup_showing");
        return null;
    }
}
