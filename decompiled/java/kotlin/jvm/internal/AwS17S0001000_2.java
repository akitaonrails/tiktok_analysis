package kotlin.jvm.internal;

import X.C060Z;
import X.C09AY;
import X.C0SZ4;
import X.C1163440gNi;
import X.C1267404xc;
import X.C13LE;
import X.C15604069a;
import X.C1653306df;
import X.C291001Au;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.InstructionSectionCardAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton.BulletinInputEmojiButtonUIAssem;
import com.ss.android.ugc.aweme.series.innerfeed.recommend.MainInnerFeedRecommendAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.school.utils.YearPickerAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS17S0001000_2 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f960i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0001000_2(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f960i0 = i;
    }

    public static final Object invoke$0(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(BulletinInputEmojiButtonUIAssem.class);
        c0sz4.LLJIJIL = C1163440gNi.LIZ;
        c0sz4.LLIZLLLIL = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(InputEmojiButtonUIAssem.class);
        c0sz4.LLJIJIL = C1163440gNi.LIZ;
        c0sz4.LLIZLLLIL = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(awS17S0001000_2.f960i0);
    }

    public static final Object invoke$11(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(-awS17S0001000_2.f960i0);
    }

    public static final Object invoke$12(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(MainInnerFeedRecommendAssem.class);
        c0sz4.LLIZLLLIL = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(InstructionSectionCardAssem.class);
        c0sz4.LLIZLLLIL = R.id.de3;
        c0sz4.LJ(C060Z.AI_CANNOT_REPLY, "sectionType");
        c0sz4.LJ(Integer.valueOf(awS17S0001000_2.f960i0), "maxHeightPx");
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(InstructionSectionCardAssem.class);
        c0sz4.LLIZLLLIL = R.id.dfz;
        c0sz4.LJ(C060Z.ASK_FOR_APPROVAL, "sectionType");
        c0sz4.LJ(Integer.valueOf(awS17S0001000_2.f960i0), "maxHeightPx");
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(awS17S0001000_2.f960i0);
    }

    public static final Object invoke$16(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        boolean z;
        if (((C1267404xc) obj).LJ != awS17S0001000_2.f960i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        int i = awS17S0001000_2.f960i0;
        if (i > 0 && iIntValue < i) {
            iIntValue = iIntValue >= i / 2 ? i : 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$3(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(YearPickerAssem.class);
        c0sz4.LLIZLLLIL = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((ViewGroup.MarginLayoutParams) obj).leftMargin = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((ViewGroup.MarginLayoutParams) obj).leftMargin = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((ViewGroup.MarginLayoutParams) obj).topMargin = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        ((ViewGroup.MarginLayoutParams) obj).topMargin = awS17S0001000_2.f960i0;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        C1653306df c1653306df = (C1653306df) obj;
        C291001Au c291001Au = new C291001Au(Integer.valueOf(awS17S0001000_2.f960i0));
        C291001Au<Unit> c291001Au2 = c1653306df.LLILLL;
        c1653306df.getClass();
        return new C1653306df(c291001Au, c291001Au2, true);
    }

    public static final Object invoke$9(AwS17S0001000_2 awS17S0001000_2, Object obj) {
        int i = awS17S0001000_2.f960i0;
        obj.getClass();
        return new C15604069a(i);
    }
}
