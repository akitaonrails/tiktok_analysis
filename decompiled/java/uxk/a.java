package uxk;

import X.C13LQ;
import X.C1444600nhC;
import X.C2188811AlT;
import X.C257260A6i;
import X.C290660BaK;
import X.C569240MUg;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;

/* JADX INFO: loaded from: classes23.dex */
public final class a {
    public static final a LIZ = new a();
    public static final String LIZIZ = "privacy_setting_permission";
    public static final String LIZJ = "privacy_setting_default_permission";
    public static final String LIZLLL = "default_permission_show_times";
    public static final String LJ = "auto_show_in_edit_page";
    public static final String LJFF = "aigc_intro_show";
    public static final String LJI = "remove_set_as_default_tip_show";
    public static final String LJII = "remove_previous_selection";
    public static final Keva LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;

    static {
        Keva repo = Keva.getRepo("publish_privacy_settings_cache");
        LJIIIIZZ = repo;
        LJIIIZ = repo.getInt("privacy_setting_comment", 0);
        LJIIJ = repo.getInt("privacy_setting_duet", ((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).avPreferences().LJJIFFI() != 1 ? 1 : 0);
    }

    public static int LIZ() {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ;
        C1444600nhC.LIZ.getClass();
        if (C1444600nhC.LIZ()) {
            return LJIIIIZZ.getInt(LJ(LIZJ), 0);
        }
        IFoundationAVServiceProxy iFoundationAVServiceProxy = (IFoundationAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IFoundationAVServiceProxy.class, false, false, false, 14, null);
        return (iFoundationAVServiceProxy == null || iFoundationAVServiceProxy.complianceService() == null || (privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select")) == null || privacySettingsAgreementRecordLJJIJ.status != 1) ? 0 : -1;
    }

    public static int LIZJ() {
        return LJIIIIZZ.getInt(LJ(LIZIZ), -1);
    }

    public static int LIZLLL() {
        return LJIIIIZZ.getInt(LJ(LIZJ), 0);
    }

    public static void LJI() {
        LJIIIIZZ.storeBoolean(LJ(LJI), true);
    }

    public static boolean LJIIJJI() {
        return !LJIIIIZZ.getBoolean(LJ(LJI), false);
    }

    public static int LIZIZ() {
        ((IFoundationAVServiceProxy) ServiceManager.get().getService(IFoundationAVServiceProxy.class)).complianceService().getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
        if (privacySettingsAgreementRecordLJJIJ == null || privacySettingsAgreementRecordLJJIJ.status != 1) {
            return C569240MUg.LIZ() ? LIZ() : LJIIIIZZ.getInt(LJ(LIZIZ), 0);
        }
        return -1;
    }

    public static void LJFF() {
        if (C290660BaK.LIZ()) {
            LJIIIIZZ.storeBoolean(LJ(LJII), true);
        }
    }

    public static boolean LJIIJ() {
        if (C290660BaK.LIZ()) {
            return !LJIIIIZZ.getBoolean(LJ(LJII), false);
        }
        return false;
    }

    public static String LJ(String str) {
        String currentUserID = ((IFoundationAVServiceProxy) ServiceManager.get().getService(IFoundationAVServiceProxy.class)).getAccountService().getCurrentUserID();
        if (currentUserID != null && currentUserID.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(currentUserID);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LJII(int i) {
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 3}) >= 0) {
            LJIIIZ = i;
            LJIIIIZZ.storeInt("privacy_setting_comment", i);
        }
    }

    public static void LJIIIIZZ(int i) {
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 1}) >= 0) {
            LJIIJ = i;
            LJIIIIZZ.storeInt("privacy_setting_duet", i);
        }
    }

    public static void LJIIIZ(int i) {
        if (((Boolean) C257260A6i.LIZ.getValue()).booleanValue()) {
            if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 2, 1, 4}) < 0) {
                return;
            }
        } else if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 2, 1}) < 0) {
            return;
        }
        LJIIIIZZ.storeInt(LJ(LIZIZ), i);
    }
}
