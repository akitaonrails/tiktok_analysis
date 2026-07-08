package kotlin.jvm.internal;

import X.C09AY;
import X.C0H89;
import X.C0HQU;
import X.C0HR5;
import X.C0ID6;
import X.C0S9Q;
import X.C0SZ4;
import X.C1350620lFc;
import X.C13LE;
import X.C1697810uHb;
import X.C197039127h;
import X.C291001Au;
import X.C418440Gaw;
import X.C432010Gwp;
import X.C433800Gzi;
import X.C443860Haq;
import X.C444920HcY;
import X.C454050HrH;
import X.C458160Hxu;
import X.C814420VxA;
import android.content.Context;
import android.graphics.Outline;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.comment.sticker.assem.CommentStickerPanelAssem;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS21S0001000_6 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f970i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0001000_6(int i) {
        super(1);
        this.$t = i;
        this.f970i0 = 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0001000_6(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f970i0 = i;
    }

    public static final Object invoke$0(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setBackgroundResource(R.drawable.ap0);
        c197039127h.setTuxFont(22);
        c197039127h.setTextColorRes(R.attr.a1h);
        c197039127h.setText(String.valueOf(awS21S0001000_6.f970i0));
        c197039127h.setBackgroundRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C1697810uHb.LJIILJJIL(new ForegroundColorSpan(awS21S0001000_6.f970i0), new C444920HcY(43, true));
    }

    public static final Object invoke$10(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C443860Haq.LIZ((C443860Haq) obj, false, awS21S0001000_6.f970i0, null, null, null, null, 61);
    }

    public static final Object invoke$11(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        int businessType = ((ImSysEmojiModel) obj).getBusinessType() & awS21S0001000_6.f970i0;
        boolean z = true;
        if (businessType != 1 && businessType != 2 && businessType != 4 && businessType != 7) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$12(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C432010Gwp c432010Gwp = (C432010Gwp) obj;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new ForegroundColorSpan(awS21S0001000_6.f970i0), new StyleSpan(1));
        if (!a0.LJJJIL(c432010Gwp.LIZLLL)) {
            listLJIILJJIL.add(new C0ID6(awS21S0001000_6.f970i0, c432010Gwp, 1));
        }
        return listLJIILJJIL;
    }

    public static final Object invoke$13(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C0HQU.LIZ((C0HQU) obj, null, false, awS21S0001000_6.f970i0, false, 0L, 27);
    }

    public static final Object invoke$14(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LLIZLLLIL = awS21S0001000_6.f970i0;
        c0sz4.LL = C13LE.LIZ(CommentStickerPanelAssem.class);
        c0sz4.LLJIJIL = C1350620lFc.LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LLIZLLLIL = awS21S0001000_6.f970i0;
        c0sz4.LL = C13LE.LIZ(CommentStickerPanelAssem.class);
        c0sz4.LLJIJIL = C1350620lFc.LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C454050HrH.LIZ((C454050HrH) obj, null, null, new C291001Au(Integer.valueOf(awS21S0001000_6.f970i0)), null, null, null, null, 247);
    }

    public static final Object invoke$17(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C0H89 c0h89 = (C0H89) obj;
        C291001Au c291001Au = new C291001Au(Integer.valueOf(awS21S0001000_6.f970i0));
        C291001Au<View> c291001Au2 = c0h89.LL;
        c0h89.getClass();
        return new C0H89(c291001Au2, c291001Au);
    }

    public static final Object invoke$18(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C458160Hxu c458160Hxu = (C458160Hxu) obj;
        int i = awS21S0001000_6.f970i0;
        int i2 = c458160Hxu.LLILLJJLI;
        c458160Hxu.getClass();
        return new C458160Hxu(i, i2);
    }

    public static final Object invoke$19(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C458160Hxu c458160Hxu = (C458160Hxu) obj;
        int i = awS21S0001000_6.f970i0;
        int i2 = c458160Hxu.LL;
        c458160Hxu.getClass();
        return new C458160Hxu(i2, i);
    }

    public static final Object invoke$2(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.width = awS21S0001000_6.f970i0;
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C0S9Q.LIZ((C0S9Q) obj, awS21S0001000_6.f970i0, false, false, false, null, null, 126);
    }

    public static final Object invoke$21(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.width = awS21S0001000_6.f970i0;
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        int i = awS21S0001000_6.f970i0;
        layoutParams.width = i;
        layoutParams.height = i;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C433800Gzi c433800Gzi = new C433800Gzi((Context) obj, null, 6);
        final int i = awS21S0001000_6.f970i0;
        if (i != 0) {
            c433800Gzi.setClipToOutline(true);
            c433800Gzi.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZu
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
        }
        return c433800Gzi;
    }

    public static final Object invoke$5(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        SmartImageView smartImageView = new SmartImageView((Context) obj);
        final int i = awS21S0001000_6.f970i0;
        if (i != 0) {
            smartImageView.setClipToOutline(true);
            smartImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZs
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
        }
        return smartImageView;
    }

    public static final Object invoke$6(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        C433800Gzi c433800Gzi = new C433800Gzi((Context) obj, null, 6);
        final int i = awS21S0001000_6.f970i0;
        if (i != 0) {
            c433800Gzi.setClipToOutline(true);
            c433800Gzi.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZv
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
        }
        return c433800Gzi;
    }

    public static final Object invoke$7(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C0HR5.LIZ((C0HR5) obj, null, null, awS21S0001000_6.f970i0, 3);
    }

    public static final Object invoke$8(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C0HR5.LIZ((C0HR5) obj, null, null, awS21S0001000_6.f970i0, 3);
    }

    public static final Object invoke$9(AwS21S0001000_6 awS21S0001000_6, Object obj) {
        return C443860Haq.LIZ((C443860Haq) obj, false, awS21S0001000_6.f970i0, null, null, null, null, 61);
    }
}
