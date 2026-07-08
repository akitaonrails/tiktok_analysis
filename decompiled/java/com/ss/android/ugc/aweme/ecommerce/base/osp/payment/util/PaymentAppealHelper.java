package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util;

import X.AnonymousClass0317;
import X.C034S;
import X.C04J7;
import X.C05XL;
import X.C09CT;
import X.C1120604Zw;
import X.C13LP;
import X.C1AQS;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.C912503hT;
import X.C912903hX;
import X.InterfaceC497601wk;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoPiAppealParamsSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AppealStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentAppealHelper {
    public static final PaymentAppealHelper LIZ = new PaymentAppealHelper();
    public static C912503hT LIZIZ;

    public static void LJ(C912503hT c912503hT) {
        InterfaceC497601wk interfaceC497601wk;
        Context context = c912503hT.LJ.get();
        if (context == null || (interfaceC497601wk = c912503hT.LJFF.get()) == null || !C2296808zG.LJI(interfaceC497601wk)) {
            return;
        }
        LIZLLL(c912503hT.LIZ, c912503hT.LIZIZ, c912503hT.LIZJ, c912503hT.LIZLLL, context, interfaceC497601wk, c912503hT.LJI, c912503hT.LJII, c912503hT.LJIIIIZZ);
    }

    public static boolean LJI(PaymentMethod paymentMethod) {
        if (Intrinsics.LJFF(paymentMethod.canAppeal, Boolean.TRUE)) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_pipo_pi_appeal_config", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJII(String str) {
        EcPipoPiAppealParamsSettings.AppealConfig appealConfig = EcPipoPiAppealParamsSettings.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPipoPiAppealParamsSettings.AppealConfig appealConfig2 = EcPipoPiAppealParamsSettings.LIZ;
        EcPipoPiAppealParamsSettings.AppealConfig appealConfig3 = (EcPipoPiAppealParamsSettings.AppealConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_pipo_pi_appeal_params", EcPipoPiAppealParamsSettings.AppealConfig.class, appealConfig2);
        if (appealConfig3 != null) {
            appealConfig2 = appealConfig3;
        }
        List<String> list = appealConfig2.errorCodeList;
        if (list != null && C13LP.LJJJJ(str, list)) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_pipo_pi_appeal_config", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final class AppealObject {

        @C09CT("object_type")
        public final Integer objectType;

        @C09CT("object_value")
        public final String objectValue;

        public AppealObject(Integer num, String str) {
            this.objectType = num;
            this.objectValue = str;
        }
    }

    public static final class AppealResponse {

        @C09CT("appeal_info_list")
        public final List<AppealInfo> appealInfoList;

        @C09CT("result_code")
        public final String resultCode;

        public AppealResponse(String str, List<AppealInfo> list) {
            this.resultCode = str;
            this.appealInfoList = list;
        }
    }

    public static String LIZ(String str, String str2) {
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        String name;
        StringBuilder sb = new StringBuilder("aweme://webview?url=");
        sb.append(str);
        sb.append("&enter_from=");
        sb.append(str2);
        sb.append("&lang=");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAppSettingDependencyService.class.getName();
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        sb.append(((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage());
        return sb.toString();
    }

    public static SpannableString LIZIZ(PaymentMethod paymentMethod, Context context, Function0 function0) {
        String string;
        String string2;
        if (Intrinsics.LJFF(paymentMethod.canAppeal, Boolean.TRUE) && paymentMethod.appealStatus == AppealStatus.PENDING) {
            string = context.getString(2131832788);
            string2 = context.getString(2131832787);
        } else {
            string = context.getString(2131832786);
            string2 = context.getString(2131832785);
        }
        int iLJJJ = a0.LJJJ(string, "{placeholder}", 0, false, 6);
        SpannableString spannableString = new SpannableString(a0.LJJL(string, iLJJJ, iLJJJ + 13, string2).toString());
        C786410Ut5.p2(spannableString, new C04J7(context, function0, 1), iLJJJ, string2.length() + iLJJJ, 33);
        return spannableString;
    }

    public static final class AppealInfo {

        @C09CT("appeal_id")
        public final String appealId;

        @C09CT("appeal_link")
        public final String appealLink;

        @C09CT("appeal_object")
        public final List<AppealObject> appealObject;

        @C09CT("appeal_status")
        public final AppealStatus appealStatus;

        @C09CT("can_appeal")
        public final Boolean canAppeal;

        @C09CT("merchant_user_id")
        public final String merchantUserId;

        @C09CT("reason_details")
        public final List<Object> reasonDetails;

        public AppealInfo(String str, List<AppealObject> list, Boolean bool, String str2, AppealStatus appealStatus, String str3, List<Object> list2) {
            this.merchantUserId = str;
            this.appealObject = list;
            this.canAppeal = bool;
            this.appealLink = str2;
            this.appealStatus = appealStatus;
            this.appealId = str3;
            this.reasonDetails = list2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.EnumC913203ha r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper.AppealInfo> r27) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper.LIZJ(java.lang.String, java.lang.String, java.lang.String, X.03ha, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final class AppealRequestContent {

        @C09CT("appeal_id")
        public final String appealId;

        @C09CT("appeal_object")
        public final List<AppealObject> appealObject;

        @C09CT("custom_tag")
        public final Map<String, String> customTag;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("merchant_order_id")
        public final String merchantOrderId;

        @C09CT("merchant_user_id")
        public final String merchantUserId;

        @C09CT("nonce")
        public final String nonce;

        @C09CT("redirect_url")
        public final String redirectUrl;

        public AppealRequestContent(String str, String str2, List<AppealObject> list, String str3, String str4, String str5, String str6, Map<String, String> map) {
            this.merchantId = str;
            this.merchantUserId = str2;
            this.appealObject = list;
            this.merchantOrderId = str3;
            this.redirectUrl = str4;
            this.nonce = str5;
            this.appealId = str6;
            this.customTag = map;
        }
    }

    public static void LIZLLL(PaymentMethod paymentMethod, String str, String str2, String str3, Context context, InterfaceC497601wk interfaceC497601wk, C05XL c05xl, C05XL c05xl2, String str4) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C912903hX(paymentMethod, c05xl2, context, str3, c05xl, str2, str, str4, null), 3);
    }
}
