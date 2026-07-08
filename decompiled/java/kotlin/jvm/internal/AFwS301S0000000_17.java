package kotlin.jvm.internal;

import X.AbstractC1252750ihl;
import X.AbstractC738140SxQ;
import X.C09AY;
import X.C0IJT;
import X.C1107580evc;
import X.C1129850fVX;
import X.C1144770ftb;
import X.C1146350fw9;
import X.C1149120g0c;
import X.C1276840jKc;
import X.C1558520qew;
import X.C1CC2;
import X.C20441214yg;
import X.C291001Au;
import X.C474500IjA;
import X.C500260Jjc;
import X.C766270U4b;
import X.EnumC1100890ekp;
import X.EnumC1131970fYx;
import X.EnumC1146170fvr;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCState;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AFwS301S0000000_17 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(24);
    public final int $t;

    public static AFwS301S0000000_17 get$arr$(int i) {
        AFwS301S0000000_17 aFwS301S0000000_17 = (AFwS301S0000000_17) arr$.get(i);
        if (aFwS301S0000000_17 != null) {
            return aFwS301S0000000_17;
        }
        arr$.compareAndSet(i, null, new AFwS301S0000000_17(i));
        return (AFwS301S0000000_17) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS301S0000000_17(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "alog");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "ALOG is block");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "alog");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "ALOG is not block");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "multi_guest");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "GUEST_WAVE_BLOCK is block");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "multi_guest");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "GUEST_WAVE_BLOCK is not block");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((Pair) obj2).getFirst() == EnumC1146170fvr.RECORD) {
            C500260Jjc.LLFFF(uIAssem.LJJIJL());
        } else {
            C500260Jjc.LJIILIIL(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C1107580evc.LIZLLL((String) obj), C1107580evc.LIZLLL((String) obj2)));
    }

    public static final Object invoke$12(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C1107580evc.LIZLLL((String) obj), C1107580evc.LIZLLL((String) obj2)));
    }

    public static final Object invoke$13(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        C1276840jKc.LIZ.getClass();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C1107580evc.LIZLLL((String) obj), C1107580evc.LIZLLL((String) obj2)));
    }

    public static final Object invoke$17(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C1107580evc.LIZLLL((String) obj), C1107580evc.LIZLLL((String) obj2)));
    }

    public static final Object invoke$18(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "consume_normal");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "consume_normal");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$2(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "guide_animation");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "GUIDE_ANIMATION_BLOCK is block");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "guide_animation");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "GUIDE_ANIMATION_BLOCK is not block");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            UUID uuid = ((C1144770ftb) c291001Au.LIZ).LIZ;
            IMatchItemAbility iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMatchItemAbility.class, null);
            if (iMatchItemAbility != null) {
                iMatchItemAbility.Qk0(uuid);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return ((CPCState) obj).copy((AbstractC1252750ihl) obj2);
    }

    public static final Object invoke$23(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        ((Number) obj).longValue();
        if (obj2 == EnumC1131970fYx.TIMED_OUT || obj2 == EnumC1131970fYx.FAILED) {
            C20441214yg.LJ("CollaborateGiftingBiz", "skip finish effect, show fallback finish toast");
            C766270U4b.LIZLLL(2131836626);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "effect_insert");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "INSERT_STICKER_BLOCK is block");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "effect_insert");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "INSERT_STICKER_BLOCK is not block");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "live_center_anim");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "live_center_anim");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.STABLE_NEW, "apm_log");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "SLARDAR is block");
        } else {
            LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.STABLE_NEW, "apm_log");
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "SLARDAR is not block");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        String str = (String) obj;
        Throwable th = (Throwable) obj2;
        C20441214yg.LJI(str, th);
        C1CC2.LIZ(str, th);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        if (((C1149120g0c) obj2).LIZ) {
            C766270U4b.LIZLLL(2131843765);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_toast_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("featured_area_full", "toast_message_content");
            C1129850fVX.LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((Pair) obj2).getFirst() == EnumC1146170fvr.GIFT) {
            C500260Jjc.LLFFF(uIAssem.LJJIJL());
        } else {
            C500260Jjc.LJIILIIL(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Long.valueOf(((C1146350fw9) obj2).LL);
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AFwS301S0000000_17 aFwS301S0000000_17, Object obj, Object obj2) {
        return obj;
    }
}
