package kotlin.jvm.internal;

import X.C01GW;
import X.C08OW;
import X.C09AY;
import X.C0CHQ;
import X.C0XF1;
import X.C1300480jwk;
import X.C19221910Hx;
import X.C1EOY;
import X.C20186013yc;
import X.C2188811AlT;
import X.C2269721Dsg;
import X.C2344809Gs;
import X.EnumC20227914Cv;
import X.EnumC23090092y;
import X.RunnableC1160830gJV;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes36.dex */
public class AwS119S1000000_35 extends C09AY implements Function0 {
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
                return this.s0;
            case 3:
                return this.s0;
            case 4:
                return this.s0;
            case 5:
                return this.s0;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS119S1000000_35 awS119S1000000_35) {
        C2344809Gs.LJ(awS119S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS119S1000000_35 awS119S1000000_35) {
        String str = awS119S1000000_35.s0;
        C2269721Dsg c2269721Dsg = new C2269721Dsg();
        c2269721Dsg.LIZ = "3006";
        C0CHQ.LIZ().getApplicationService();
        c2269721Dsg.LIZIZ = C19221910Hx.LIZIZ();
        c2269721Dsg.LIZJ = "ab2d1a104e6311eaa93831049d485a70";
        C0CHQ.LIZ().getApplicationService().getClass();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
        }
        c2269721Dsg.LIZLLL = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
        C0CHQ.LIZ().getRegionService();
        c2269721Dsg.LJ = C20186013yc.LIZ();
        c2269721Dsg.LJFF = C0CHQ.LIZ().getAppLanguage();
        c2269721Dsg.LJI = C08OW.LIZIZ(C0CHQ.LIZ, EnumC23090092y.TEMPLATE_CACHE);
        c2269721Dsg.LJII = C08OW.LIZIZ(C0CHQ.LIZ, EnumC23090092y.MEDIA_CACHE);
        c2269721Dsg.LJIIIIZZ = C0CHQ.LIZ().LJJJ().getEffectSDKVersion();
        c2269721Dsg.LJIIIZ = str;
        c2269721Dsg.LJIIJ = C08OW.LIZIZ(C0CHQ.LIZ, EnumC23090092y.EFFECT_MANAGER);
        c2269721Dsg.LJIIJJI = C08OW.LIZIZ(C0CHQ.LIZ, EnumC23090092y.EFFECT_MANAGER_MODEL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/material_cloud/download/v1/download");
        c2269721Dsg.LJIIL = C2188811AlT.LIZIZ(sbLIZ);
        c2269721Dsg.LJIILIIL = C08OW.LIZIZ(C0CHQ.LIZ, EnumC23090092y.IMUSE_CACHE);
        String downloadDir = C0CHQ.LIZ().LJJJJL().getDownloadDir();
        if (u.LJIIZILJ(downloadDir, "/", false)) {
            downloadDir = downloadDir.substring(0, downloadDir.length() - 1);
        }
        c2269721Dsg.LJIILJJIL = C0CHQ.LIZ().getNetworkService().getApiHost();
        c2269721Dsg.LJIILL = downloadDir;
        c2269721Dsg.LJIILLIIL = false;
        c2269721Dsg.LJIIZILJ = "253cbc66f0020e93j00rpwjpvirxc02a7206";
        C0CHQ.LIZ().getApplicationService();
        c2269721Dsg.LJIJ = String.valueOf(C19221910Hx.LIZ());
        C0CHQ.LIZ().getApplicationService();
        c2269721Dsg.LJIJI = C19221910Hx.LIZIZ();
        c2269721Dsg.LJIJJ = "";
        c2269721Dsg.LJIJJLI = C0XF1.LIZ(C0CHQ.LIZ).name();
        c2269721Dsg.LJIL = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        c2269721Dsg.LJJ = 1;
        c2269721Dsg.LJJI = str;
        c2269721Dsg.LJJIFFI = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AUTOCUT_TEMPLATE, EnumC23090092y.MATERIAL_RESOURCE_CACHE.getDirName(), true).getAbsolutePath();
        return c2269721Dsg.LIZ();
    }

    public static final Object invoke$10(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getPannelMultiGuestSamplingRate(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    public static final Object invoke$11(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getTopLiveHangoutSamplingRate(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    public static final Object invoke$12(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getMultiGuestLayoutSamplingRate(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    public static final Object invoke$13(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getMultiGuestLayoutSamplingRate(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    public static final Object invoke$14(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getMultiGuestLayoutSamplingRate(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    public static final Object invoke$15(AwS119S1000000_35 awS119S1000000_35) {
        C1300480jwk c1300480jwk;
        C1EOY c1eoy = C1EOY.LIZ;
        Handler handlerLJ = C1EOY.LJ();
        C01GW c01gw = (C01GW) ((LinkedHashMap) C1EOY.LJIIJ).get(awS119S1000000_35.s0);
        if (c01gw != null && (c1300480jwk = (C1300480jwk) c01gw.getValue()) != null) {
            c1300480jwk.LIZLLL = true;
        } else {
            c1300480jwk = null;
        }
        return new RunnableC1160830gJV(handlerLJ, c1300480jwk);
    }

    public static final Object invoke$6(AwS119S1000000_35 awS119S1000000_35) {
        return Keva.getRepo(awS119S1000000_35.s0);
    }

    public static final Object invoke$7(AwS119S1000000_35 awS119S1000000_35) {
        return Keva.getRepo(awS119S1000000_35.s0);
    }

    public static final Object invoke$8(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getLinkMicRolePeriodSamplingRate(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    public static final Object invoke$9(AwS119S1000000_35 awS119S1000000_35) {
        return new C1300480jwk(awS119S1000000_35.s0, LiveFluencySupportSampleSetting.INSTANCE.getBoardMetricSampling(), C1EOY.LJIIZILJ, C1EOY.LIZ, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1000000_35(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
