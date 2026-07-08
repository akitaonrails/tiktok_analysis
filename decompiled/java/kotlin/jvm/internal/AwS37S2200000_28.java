package kotlin.jvm.internal;

import X.C01U6;
import X.C09AY;
import X.C0VSP;
import X.C1898390zV7;
import X.C1898700zVc;
import X.C1898730zVf;
import X.C1900090zXr;
import X.InterfaceC1898930zVz;
import android.app.Activity;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS37S2200000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS37S2200000_28 awS37S2200000_28) {
        String strLJIILL;
        String str;
        C0VSP c0vspLIZJ;
        C1898700zVc c1898700zVc;
        C1898700zVc c1898700zVc2;
        BaseTimerPendantManager baseTimerPendantManager = (BaseTimerPendantManager) awS37S2200000_28.l2;
        TimerPendant timerPendant = (TimerPendant) baseTimerPendantManager.LLILLL;
        if (timerPendant == null || (strLJIILL = timerPendant.activityId) == null) {
            strLJIILL = baseTimerPendantManager.LJIILL();
        }
        BaseTimerPendantManager baseTimerPendantManager2 = (BaseTimerPendantManager) awS37S2200000_28.l2;
        TimerPendant timerPendant2 = (TimerPendant) baseTimerPendantManager2.LLILLL;
        if (timerPendant2 == null || (str = timerPendant2.lottieFileMd5) == null) {
            str = "";
        }
        C1900090zXr c1900090zXr = (C1900090zXr) baseTimerPendantManager2.LLILZIL.getValue();
        C0VSP c0vspLIZJ2 = c1900090zXr.LIZJ(strLJIILL, str, awS37S2200000_28.s0);
        if (awS37S2200000_28.s1.length() > 0) {
            c0vspLIZJ = c1900090zXr.LIZJ(strLJIILL, str, awS37S2200000_28.s1);
        } else {
            c0vspLIZJ = null;
        }
        String strLIZIZ = c1900090zXr.LIZIZ(strLJIILL, str);
        if ((c0vspLIZJ2 == null || strLIZIZ == null) && (c1898700zVc = ((BaseTimerPendantManager) awS37S2200000_28.l2).LLIZ) != null) {
            c1898700zVc.setResourceLoadSuccess(false);
        }
        if (awS37S2200000_28.s1.length() > 0 && c0vspLIZJ == null && (c1898700zVc2 = ((BaseTimerPendantManager) awS37S2200000_28.l2).LLIZ) != null) {
            c1898700zVc2.setBreathLottieLoadSuccess(false);
        }
        C1898700zVc c1898700zVc3 = ((BaseTimerPendantManager) awS37S2200000_28.l2).LLIZ;
        if (c1898700zVc3 != null) {
            C01U6.LIZIZ(new C1898730zVf(c1898700zVc3, c0vspLIZJ, c0vspLIZJ2, awS37S2200000_28.s0, (InterfaceC1898930zVz) awS37S2200000_28.l3, awS37S2200000_28.s1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S2200000_28 awS37S2200000_28) {
        boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) awS37S2200000_28.l2).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        QrCodeScanService qrCodeScanService = (QrCodeScanService) PluggableExtentionKt.pluggableSpi$default(QrCodeScanService.class, false, false, false, 14, null);
        if (qrCodeScanService != null) {
            qrCodeScanService.downloadStickerHelper(awS37S2200000_28.s0, awS37S2200000_28.s1, (Activity) awS37S2200000_28.l3, zDownloadEffectOrMusicAfterEnterCamera, new IMainService.DownLoadFinishListener() { // from class: X.10ab
                @Override // com.ss.android.ugc.aweme.services.IMainService.DownLoadFinishListener
                public final void doAfterDownLoad(int i, Boolean bool) {
                }
            });
            return Unit.LIZ;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S2200000_28(BaseTimerPendantManager baseTimerPendantManager, String str, String str2, C1898390zV7 c1898390zV7, int i) {
        super(0);
        this.$t = i;
        this.l2 = baseTimerPendantManager;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c1898390zV7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S2200000_28(IExternalService iExternalService, String str, String str2, Activity activity, int i) {
        super(0);
        this.$t = i;
        this.l2 = iExternalService;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = activity;
    }
}
