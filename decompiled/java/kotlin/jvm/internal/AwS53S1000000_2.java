package kotlin.jvm.internal;

import X.C05M1;
import X.C060B;
import X.C061N;
import X.C062P;
import X.C09AY;
import X.C0I0B;
import X.C1281104zp;
import X.C13BV;
import X.C1500205u4;
import X.C1512005vy;
import X.C1582806Hq;
import X.C1588106Jr;
import X.C1590906Kt;
import X.C1616606Uq;
import X.C1639906bV;
import X.C1688880u3C;
import X.C1688906jP;
import X.C1703106lh;
import X.C201955140j;
import X.C2188811AlT;
import X.C291001Au;
import X.C912600Zr8;
import X.InterfaceC1566906Bn;
import X.InterfaceC1573006Dw;
import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS53S1000000_2 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S1000000_2(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareSourceForAnimax failed: file not exist, src=");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveSource yielded null, fallback to original source=");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveSource: forest returned no local path, source=");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid schema: missing required parameter 'biz' or 'url'. Schema content: ");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        obj.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C05M1) obj).LIZIZ, awS53S1000000_2.s0));
    }

    public static final Object invoke$13(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return C1639906bV.LIZ((C1639906bV) obj, null, null, null, false, awS53S1000000_2.s0, false, null, null, null, 991);
    }

    public static final Object invoke$14(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        String str = (String) obj;
        C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
        String str2 = awS53S1000000_2.s0;
        if (str2 == null) {
            str2 = "smart_reply_chatroom_creator";
        }
        c1500205u4.getClass();
        C1500205u4.LIZIZ(1, str2, str);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return C1688880u3C.LIZ((C1688880u3C) obj, null, false, false, false, false, awS53S1000000_2.s0, 95);
    }

    public static final Object invoke$16(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return C1688880u3C.LIZ((C1688880u3C) obj, awS53S1000000_2.s0, false, false, false, false, null, 126);
    }

    public static final Object invoke$17(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return C1588106Jr.LIZ((C1588106Jr) obj, null, null, new C291001Au(awS53S1000000_2.s0), null, null, null, null, 123);
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot ");
        sbLIZ.append(awS53S1000000_2.s0);
        sbLIZ.append(": biz is empty or blank. Operation ignored.");
        C2188811AlT.LIZIZ(sbLIZ);
        obj.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((C062P) obj).LIZ = new C061N(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("variableManager removeVariable key: ");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        Activity activity = (Activity) obj;
        String str = awS53S1000000_2.s0;
        if (activity != null) {
            IReportUtils.LIZ.getClass();
            IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
            if (iReportUtilsLIZ != null) {
                iReportUtilsLIZ.LIZ(new C1688906jP(str, "button", "group_setting", "im_details_page", 8), activity, "5", null, false);
            }
            IMGroupChatDetailAnalytics.LJIIL("group_setting", "", "im", "button", null, null, 112);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((Map) obj).put("placeholderPath", awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
        String str = awS53S1000000_2.s0;
        c1582806Hq.getClass();
        C1582806Hq.LIZLLL(str, (List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
        String str = awS53S1000000_2.s0;
        c1582806Hq.getClass();
        C1582806Hq.LIZJ(str, (List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((InterfaceC1573006Dw) obj).g(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((InterfaceC1573006Dw) obj).LLLJIL(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return C060B.LIZ((C060B) obj, awS53S1000000_2.s0, null, 6);
    }

    public static final Object invoke$27(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deserialize template, unknown key=");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return C1512005vy.LIZ((C1512005vy) obj, awS53S1000000_2.s0, null, false, C13BV.INSTANCE, null, 42);
    }

    public static final Object invoke$29(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1281104zp) obj).LIZ, awS53S1000000_2.s0));
    }

    public static final Object invoke$3(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return Boolean.valueOf(!Intrinsics.LJFF(((Pair) obj).getFirst(), awS53S1000000_2.s0));
    }

    public static final Object invoke$30(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSuccess: ");
        sbLIZ.append(awS53S1000000_2.s0);
        sbLIZ.append('}');
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doCreateTemplateViews success:");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch template success: ");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchResourceToLocalFile no local file: url=");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ILogger.LIZ.getClass();
        ILogger iLoggerLIZ = C912600Zr8.LIZ();
        if (iLoggerLIZ != null) {
            String str2 = awS53S1000000_2.s0;
            if (zBooleanValue) {
                str = "on";
            } else {
                str = "off";
            }
            iLoggerLIZ.LJFF(str2, str, "chat_top_click", C0I0B.LJFF.LIZIZ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        String str = ((StreakData) obj).convId;
        if (str == null) {
            C1590906Kt.LIZJ("Streak: convId is invalid");
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(awS53S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$36(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((InterfaceC1566906Bn) obj).LJFF(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((InterfaceC1566906Bn) obj).g(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((InterfaceC1566906Bn) obj).LLLJIL(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTemplateViewCache: in MynaPreloadUtil ");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        ((C062P) obj).LIZ = new C1616606Uq(awS53S1000000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handled custom action chain: ");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to handle custom action chain: ");
        sbLIZ.append(awS53S1000000_2.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS53S1000000_2 r1, java.lang.Object r2) {
        /*
            com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness r2 = (com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness) r2
            java.lang.String r0 = r2.actionSchema
            if (r0 == 0) goto L31
            java.lang.String r2 = r1.s0
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
            if (r0 == 0) goto L31
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "pageId"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L31
            boolean r0 = r0.booleanValue()
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L31:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS53S1000000_2.invoke$5(kotlin.jvm.internal.AwS53S1000000_2, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Pair) obj).getFirst(), awS53S1000000_2.s0));
    }

    public static final Object invoke$7(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Map.Entry) obj).getValue(), awS53S1000000_2.s0));
    }

    public static final Object invoke$8(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Map.Entry) obj).getValue(), awS53S1000000_2.s0));
    }

    public static final Object invoke$9(AwS53S1000000_2 awS53S1000000_2, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchPanel ");
        sbLIZ.append(awS53S1000000_2.s0);
        sbLIZ.append(" cancelled");
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S1000000_2(StreakServerDataSource streakServerDataSource, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S1000000_2(String str, Exception exc, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }
}
