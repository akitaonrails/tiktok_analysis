package kotlin.jvm.internal;

import X.AbstractC1899090zWF;
import X.C09AY;
import X.C100H;
import X.C1619720sFe;
import X.C1720106oR;
import X.C1873020yqC;
import X.C1892170zL5;
import X.C1893470zNB;
import X.C1893580zNM;
import X.C1894040zO6;
import X.C1894050zO7;
import X.C1894060zO8;
import X.C1894310zOX;
import X.C1895550zQX;
import X.C1896470zS1;
import X.C1898980zW4;
import X.C19297110eX;
import X.C19306110fz;
import X.C20484080s;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C397501gb;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1897260zTI;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.lego.ReportColdStartConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.incentive.crossplatform.headless.PrefetchUtils;
import com.tts.oecverify.BdTuring;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS112S1000000_28 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return this.s0;
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS112S1000000_28 r15) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S1000000_28.invoke$0(kotlin.jvm.internal.AwS112S1000000_28):java.lang.Object");
    }

    public static final Object invoke$1(AwS112S1000000_28 awS112S1000000_28) {
        Object next;
        List<AdWatchVideoTaskTrigger> list = C1898980zW4.LIZIZ;
        String str = awS112S1000000_28.s0;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) next;
        if (adWatchVideoTaskTrigger != null) {
            adWatchVideoTaskTrigger.LLIZ.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS112S1000000_28 awS112S1000000_28) {
        CountDownLatch countDownLatchRemove = C19297110eX.LIZ.remove(awS112S1000000_28.s0);
        if (countDownLatchRemove != null) {
            countDownLatchRemove.countDown();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS112S1000000_28 awS112S1000000_28) {
        C100H c100h = C100H.LIZ;
        String str = awS112S1000000_28.s0;
        c100h.getClass();
        c100h.LIZ(str, C2097908Jt.LIZJ(new Pair("trigger_source", "auto")));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS112S1000000_28 awS112S1000000_28) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZJ("BUTTON_HID".toLowerCase(Locale.ROOT), awS112S1000000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS112S1000000_28 awS112S1000000_28) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZJ("BUTTON_HID".toLowerCase(Locale.ROOT), awS112S1000000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS112S1000000_28 awS112S1000000_28) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZJ("BUTTON_HID".toLowerCase(Locale.ROOT), awS112S1000000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS112S1000000_28 awS112S1000000_28) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZJ("BUTTON_HID".toLowerCase(Locale.ROOT), awS112S1000000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS112S1000000_28 awS112S1000000_28) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZJ("BUTTON_HID".toLowerCase(Locale.ROOT), awS112S1000000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS112S1000000_28 awS112S1000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS112S1000000_28.s0);
        sbLIZ.append(" not found action");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(AwS112S1000000_28 awS112S1000000_28) {
        String path;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(awS112S1000000_28.s0), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(awS112S1000000_28.s0), "surl")) == null) {
            return Boolean.FALSE;
        }
        Uri uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        if (uri != null && (path = uri.getPath()) != null) {
            C1893470zNB.LIZIZ.getClass();
            boolean zLJII = C1893470zNB.LJII(path);
            boolean zLJIIIIZZ = C1893470zNB.LJIIIIZZ(awS112S1000000_28.s0);
            if (zLJII || zLJIIIIZZ) {
                C1893580zNM.LIZ.getClass();
                C1893580zNM.LJFF();
            }
            return Boolean.valueOf(zLJII);
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$19(AwS112S1000000_28 awS112S1000000_28) {
        Uri uri;
        String path;
        String str = awS112S1000000_28.s0;
        if (str != null && (uri = UriProtector.parse(str)) != null && (path = uri.getPath()) != null) {
            C1893470zNB.LIZIZ.getClass();
            if (C1893470zNB.LJII(path)) {
                C1893580zNM.LIZ.getClass();
                C1893580zNM.LJFF();
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    if (!Intrinsics.LJFF(str2, "use_spark") && !Intrinsics.LJFF(str2, "target_handler")) {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
                        while (it2.hasNext()) {
                            builderClearQuery.appendQueryParameter(str2, it2.next());
                        }
                    }
                }
                builderClearQuery.appendQueryParameter("use_spark", "1");
                builderClearQuery.appendQueryParameter("target_handler", "pa_incentive");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                    builderClearQuery.appendQueryParameter("business_from", "pa_incentive");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview?url=");
                sbLIZ.append(URLEncoder.encode(builderClearQuery.build().toString(), "UTF-8"));
                sbLIZ.append("&use_spark=1&target_handler=pa_incentive&business_from=pa_incentive");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return awS112S1000000_28.s0;
        }
        return awS112S1000000_28.s0;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS112S1000000_28 awS112S1000000_28) {
        String string;
        Keva repo = Keva.getRepo(C786410Ut5.j4("report_cold_start_repo_%s", Arrays.copyOf(new Object[]{awS112S1000000_28.s0}, 1)));
        C844470XAv.LIZ.getClass();
        long jLJ = C844470XAv.LJ();
        h hVar = new h();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (ReportColdStartConfig reportColdStartConfig : (ReportColdStartConfig[]) C19306110fz.LIZIZ.getValue()) {
            if (jLJ >= reportColdStartConfig.version) {
                long j = repo.getLong(reportColdStartConfig.name, 0L);
                if (jCurrentTimeMillis - j < reportColdStartConfig.interval * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("filter by frequency name = ");
                    sbLIZ.append(reportColdStartConfig.name);
                    sbLIZ.append(", interval = ");
                    sbLIZ.append(reportColdStartConfig.interval);
                    sbLIZ.append(", currentTime = ");
                    sbLIZ.append(jCurrentTimeMillis);
                    sbLIZ.append(", lastTime = ");
                    sbLIZ.append(j);
                    C1720106oR.LJI("ReportColdStartFrequency", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    repo.storeLong(reportColdStartConfig.name, jCurrentTimeMillis);
                    n nVar = new n();
                    nVar.LJJIIJ("key", reportColdStartConfig.name);
                    hVar.LJJIFFI(nVar);
                }
            }
        }
        if (hVar.size() > 0) {
            string = hVar.toString();
        } else {
            string = "";
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("report list: ");
        sbLIZ2.append(string);
        C1720106oR.LJI("ReportColdStartRequest", C2188811AlT.LIZIZ(sbLIZ2));
        if (!a0.LJJJIL(string)) {
            C1720106oR.LJI("ReportColdStartRequest", "report to server");
            MusNotificationApiManager.LJFF(string);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS112S1000000_28 awS112S1000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("optimize_and_remove_contacts_list_auth_");
        sbLIZ.append(awS112S1000000_28.s0);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$21(AwS112S1000000_28 awS112S1000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert launch: ");
        sbLIZ.append(awS112S1000000_28.s0);
        sbLIZ.append(" to db failed ...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS112S1000000_28 awS112S1000000_28) {
        C1895550zQX c1895550zQX = C1895550zQX.LL;
        String str = awS112S1000000_28.s0;
        c1895550zQX.getClass();
        C1896470zS1 value = C1896470zS1.LLJJJJ.getValue();
        List<ActivityTask> list = value.LLILZ;
        if (list != null && !list.isEmpty() && 0 == 0) {
            Iterator<ActivityTask> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityTask next = it2.next();
                if (Intrinsics.LJFF(next.taskKey, "like_comment_tribute")) {
                    value.LL.storeBoolean(C1894310zOX.LIZ("do_like_or_comment_tribute_action"), true);
                    if (value.LLILLJJLI >= next.time) {
                        if (!value.LL.getBoolean(C1894310zOX.LIZ("has_report_like_and_comment_tribute"), false)) {
                            value.LLILZIL = null;
                            value.LJIILJJIL(next);
                        }
                    } else {
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("task_name", str);
                            linkedHashMap.put("task_id", next.taskKey);
                            interfaceC1897260zTILIZIZ.LIZ("interact_task_complete", linkedHashMap);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS112S1000000_28 awS112S1000000_28) {
        String string = ((Keva) C1873020yqC.LIZ.getValue()).getString(awS112S1000000_28.s0, "");
        if (string.length() == 0) {
            return C1894040zO6.LIZ;
        }
        long j = ((PrefetchUtils.ApiCacheModel) C20484080s.LIZ(string, PrefetchUtils.ApiCacheModel.class)).expiredTime;
        if (j != 0 && j < System.currentTimeMillis()) {
            return C1894050zO7.LIZ;
        }
        return C1894060zO8.LIZ;
    }

    public static final Object invoke$6(AwS112S1000000_28 awS112S1000000_28) {
        C397501gb c397501gb = C397501gb.LIZ;
        Uri uri = UriProtector.parse(awS112S1000000_28.s0);
        c397501gb.getClass();
        new ARunnableS128S0100000_28(uri, 122).run();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS112S1000000_28 awS112S1000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] permanently disabled, ban schedule reason=");
        sbLIZ.append(awS112S1000000_28.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS112S1000000_28 awS112S1000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] portrait mismatch, ban schedule reason=");
        sbLIZ.append(awS112S1000000_28.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS112S1000000_28 awS112S1000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] window empty, ban schedule reason=");
        sbLIZ.append(awS112S1000000_28.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S1000000_28(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S1000000_28(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S1000000_28(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
