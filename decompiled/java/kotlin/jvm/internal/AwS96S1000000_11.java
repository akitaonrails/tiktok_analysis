package kotlin.jvm.internal;

import X.C09AY;
import X.C0T6L;
import X.C1247120iYg;
import X.C1260960iv0;
import X.C2188811AlT;
import X.EnumC1260920iuw;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS96S1000000_11 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return this.s0;
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
                return invoke$7(this);
            case 8:
                return this.s0;
            case BdTuring.TYPE_ECAF /* 9 */:
                return this.s0;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return this.s0;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return this.s0;
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp policy bottom container listener invoke. (kmp) winner=");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp policy bottom container transfer global invoke. fcp key: ");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition: request un_mount failed <= fcp node key ");
        sbLIZ.append(awS96S1000000_11.s0);
        sbLIZ.append("..");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS96S1000000_11 awS96S1000000_11) {
        boolean z;
        if (!TextUtils.equals(awS96S1000000_11.s0, "ar") && !TextUtils.equals(awS96S1000000_11.s0, "ur")) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$16(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPendingHighPriority ");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$17(AwS96S1000000_11 awS96S1000000_11) {
        return new C1260960iv0("chat", (User) null, awS96S1000000_11.s0, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, EnumC1260920iuw.MESSAGE_CARD.getType(), (String) null, (String) null, "bottom", (String) null, (String) null, (String) null, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, (Map) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, (String) null, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -9222, -1, 16383);
    }

    public static final Object invoke$2(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp policy bottom container transfer global invoke. fcp key: ");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp policy meta_tag container transfer global invoke. fcp key: ");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp policy high_tag container transfer global invoke. fcp key: ");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcp policy bottom container transfer global invoke. fcp key: ");
        sbLIZ.append(awS96S1000000_11.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS96S1000000_11 awS96S1000000_11) {
        new AwS87S1000000_2(awS96S1000000_11.s0, 13);
        C0T6L.LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS96S1000000_11 awS96S1000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runtime ability mount fcp node: ");
        sbLIZ.append(awS96S1000000_11.s0);
        sbLIZ.append(", assem type not found.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1000000_11(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1000000_11(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str2;
    }
}
