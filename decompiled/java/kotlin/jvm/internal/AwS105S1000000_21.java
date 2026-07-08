package kotlin.jvm.internal;

import X.C09AY;
import X.C1386890mC7;
import X.C1440005kM;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C737030Svd;
import X.C786410Ut5;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS105S1000000_21 extends C09AY implements Function0 {
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
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return this.s0;
            case 8:
                return this.s0;
            case BdTuring.TYPE_ECAF /* 9 */:
                return this.s0;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return this.s0;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return this.s0;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS105S1000000_21 awS105S1000000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("long_press imStyle=");
        sbLIZ.append(awS105S1000000_21.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS105S1000000_21 awS105S1000000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("share_panel imStyle=");
        sbLIZ.append(awS105S1000000_21.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS105S1000000_21 awS105S1000000_21) {
        if (C1386890mC7.LIZIZ > 0) {
            C1386890mC7 c1386890mC7 = C1386890mC7.LIZ;
            String str = awS105S1000000_21.s0;
            c1386890mC7.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() - C1386890mC7.LIZIZ, "click_to_show_duration");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - C1386890mC7.LIZJ, "init_to_show_duration");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - C1386890mC7.LIZLLL, "api_end_to_show_duration");
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("ttk_profileviewer_enter_perf", c2344009Gk.LIZ);
            C1386890mC7.LIZIZ = 0L;
            C1386890mC7.LIZJ = 0L;
            C1386890mC7.LIZLLL = 0L;
            C1386890mC7.LJ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS105S1000000_21 awS105S1000000_21) {
        boolean z;
        if (!TextUtils.equals(awS105S1000000_21.s0, "ja") && !TextUtils.equals(awS105S1000000_21.s0, "ko") && !TextUtils.equals(awS105S1000000_21.s0, "zh") && !TextUtils.equals(awS105S1000000_21.s0, "zh-Hant") && !TextUtils.equals(awS105S1000000_21.s0, "zh-Hans") && !TextUtils.equals(awS105S1000000_21.s0, "zh-TW") && !TextUtils.equals(awS105S1000000_21.s0, "zh-HK")) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS105S1000000_21 awS105S1000000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTag UpvoteVideoAssemNew tryShowUpvoteWhiteBar => ");
        sbLIZ.append(awS105S1000000_21.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS105S1000000_21 awS105S1000000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTag UpvoteVideoAssemNew whiteBarController refreshWhiteBarDataIfNeeded => ");
        sbLIZ.append(awS105S1000000_21.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS105S1000000_21 awS105S1000000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufCollect ");
        sbLIZ.append(awS105S1000000_21.s0);
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS105S1000000_21 awS105S1000000_21) {
        C737030Svd c737030Svd = new C737030Svd(78);
        String str = awS105S1000000_21.s0;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("quick_share_aid", str, bundle);
        c737030Svd.LIZJ = bundle;
        C1440005kM.LIZ(c737030Svd);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS105S1000000_21 awS105S1000000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prefetcher-prefetchContact: ");
        sbLIZ.append(awS105S1000000_21.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1000000_21(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
