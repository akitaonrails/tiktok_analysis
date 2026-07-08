package kotlin.jvm.internal;

import X.C09AY;
import X.C0UFI;
import X.C0UFJ;
import X.C11XV;
import X.C1448570nnb;
import X.C1664680tQA;
import X.C1672190tcH;
import X.C1828990xhB;
import X.C1D82;
import X.C1D85;
import X.C1DEF;
import X.C1DEK;
import X.C1DEN;
import X.C20280014Ww;
import X.C2250671D7h;
import X.C2254091DKl;
import X.C2267471Dp3;
import X.C2267491Dp5;
import X.C2267501Dp6;
import X.C2267521Dp8;
import X.C2267541DpA;
import X.C2267581DpE;
import X.C500260Jjc;
import X.C556200Lre;
import X.C556300Lro;
import X.EnumC1229960i70;
import X.EnumC1448590nnd;
import X.EnumC1679580toC;
import X.EnumC2251001D8o;
import X.InterfaceC2252951DGb;
import X.InterfaceC2260541Dds;
import X.InterfaceC2267531Dp9;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectBackgroundCoexistSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS244S0300000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        C1D82 c1d82 = ((C1D85) awS244S0300000_35.l0).LIZJ;
        c1d82.LIZ.LIZIZ(new C556200Lre((C556300Lro) obj, c1d82.LJIIL, awS244S0300000_35.l1), (EnumC2251001D8o) awS244S0300000_35.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        boolean z;
        InterfaceC2252951DGb interfaceC2252951DGb = (InterfaceC2252951DGb) obj;
        interfaceC2252951DGb.LIZJ(((C2254091DKl) awS244S0300000_35.l0).LIZLLL);
        int[] iArrLIZIZ = C1448570nnb.LIZIZ(C1448570nnb.LIZ, (EnumC1448590nnd) awS244S0300000_35.l1);
        if (iArrLIZIZ.length > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            interfaceC2252951DGb.LIZ(iArrLIZIZ[0], iArrLIZIZ[1]);
        }
        int[] iArrLIZJ = C1448570nnb.LIZJ((EnumC1448590nnd) awS244S0300000_35.l1);
        if (iArrLIZJ.length > 1) {
            interfaceC2252951DGb.LIZIZ(iArrLIZJ[0], iArrLIZJ[1]);
        }
        int[] iArrLIZ = C1448570nnb.LIZ((EnumC1448590nnd) awS244S0300000_35.l1, ((ShortVideoContext) awS244S0300000_35.l2).cameraComponentModel);
        if (iArrLIZ.length > 1) {
            interfaceC2252951DGb.LIZLLL(iArrLIZ[0], iArrLIZ[1]);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        EnumC1229960i70 enumC1229960i70 = (EnumC1229960i70) obj;
        ((C1664680tQA) awS244S0300000_35.l0).LIZLLL(new AwS614S0100000_35(enumC1229960i70, 228), true);
        C20280014Ww c20280014Ww = (C20280014Ww) awS244S0300000_35.l1;
        Aweme aweme = (Aweme) awS244S0300000_35.l2;
        int value = enumC1229960i70.getValue();
        c20280014Ww.getClass();
        C20280014Ww.LJI(value, aweme);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        EnumC1229960i70 enumC1229960i70 = (EnumC1229960i70) obj;
        ((C1664680tQA) awS244S0300000_35.l0).LIZLLL(new AwS614S0100000_35(enumC1229960i70, 229), true);
        C20280014Ww c20280014Ww = (C20280014Ww) awS244S0300000_35.l1;
        Aweme aweme = (Aweme) awS244S0300000_35.l2;
        int value = enumC1229960i70.getValue();
        c20280014Ww.getClass();
        C20280014Ww.LJI(value, aweme);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        ((InterfaceC2260541Dds) awS244S0300000_35.l0).LIZJ((Voucher) awS244S0300000_35.l1, (C11XV) awS244S0300000_35.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        ((InterfaceC2260541Dds) awS244S0300000_35.l0).LIZIZ((Voucher) awS244S0300000_35.l1, (C11XV) awS244S0300000_35.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$2(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        String str = (String) obj;
        switch (str.hashCode()) {
            case -1890252483:
                if (str.equals("sticker")) {
                    ((Function0) awS244S0300000_35.l0).invoke();
                }
                break;
            case -1527670528:
                if (str.equals("live_boards")) {
                    C1828990xhB c1828990xhB = C1828990xhB.LIZ;
                    Context context = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_35 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 30);
                    AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(94);
                    c1828990xhB.getClass();
                    C1828990xhB.LJ(dataChannel, "show", "liveboards");
                    C1828990xhB.LJFF(context, 2131842519, 2131851361, 2131842514, 2131842516, new AwS436S0200000_35(dataChannel, awS579S0100000_35, 23), new AwS436S0200000_35(dataChannel, (DataChannel) aFwS226S0000000_35, (Function0<Unit>) 25));
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    C1828990xhB c1828990xhB2 = C1828990xhB.LIZ;
                    Context context2 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel2 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_352 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 26);
                    c1828990xhB2.getClass();
                    C1828990xhB.LJ(dataChannel2, "show", "background");
                    C1828990xhB.LJFF(context2, 2131842519, 2131842517, 2131842514, 2131842516, new AwS436S0200000_35(dataChannel2, awS579S0100000_352, 19), new AwS579S0100000_35(dataChannel2, 60));
                }
                break;
            case -58673966:
                if (str.equals("background_and_liveboards")) {
                    C1828990xhB c1828990xhB3 = C1828990xhB.LIZ;
                    Context context3 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel3 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_353 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 33);
                    c1828990xhB3.getClass();
                    C1828990xhB.LJ(dataChannel3, "show", "background_boards");
                    C1828990xhB.LJFF(context3, 2131842519, 2131851354, 2131842514, 2131842516, new AwS436S0200000_35(dataChannel3, awS579S0100000_353, 21), new AwS579S0100000_35(dataChannel3, 64));
                }
                break;
            case 1008614022:
                if (str.equals("live_goal")) {
                    if (!LiveEffectBackgroundCoexistSetting.INSTANCE.enable() || C500260Jjc.LJJIJLIJ()) {
                        C0UFI.LIZ.LJIIJJI();
                        ((Function0) awS244S0300000_35.l0).invoke();
                    } else {
                        C1828990xhB c1828990xhB4 = C1828990xhB.LIZ;
                        Context context4 = (Context) awS244S0300000_35.l1;
                        DataChannel dataChannel4 = (DataChannel) awS244S0300000_35.l2;
                        AwS579S0100000_35 awS579S0100000_354 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 28);
                        c1828990xhB4.getClass();
                        C1828990xhB.LJ(dataChannel4, "show", "livegoal");
                        C1828990xhB.LJFF(context4, 2131842519, 2131842518, 2131842514, 2131842516, new AwS436S0200000_35(dataChannel4, awS579S0100000_354, 7), new AwS579S0100000_35(dataChannel4, 27));
                    }
                }
                break;
            case 1543009402:
                if (str.equals("live_goal_and_liveboards")) {
                    C1828990xhB c1828990xhB5 = C1828990xhB.LIZ;
                    Context context5 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel5 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_355 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 36);
                    c1828990xhB5.getClass();
                    C1828990xhB.LJ(dataChannel5, "show", "livegoal_liveboards");
                    C1828990xhB.LJFF(context5, 2131842519, 2131851354, 2131842514, 2131842516, new AwS436S0200000_35(dataChannel5, awS579S0100000_355, 8), new AwS579S0100000_35(dataChannel5, 31));
                }
                break;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$3(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        String str = (String) obj;
        switch (str.hashCode()) {
            case -1890252483:
                if (str.equals("sticker")) {
                    C1828990xhB c1828990xhB = C1828990xhB.LIZ;
                    Context context = (Context) awS244S0300000_35.l0;
                    DataChannel dataChannel = (DataChannel) awS244S0300000_35.l1;
                    AwS579S0100000_35 awS579S0100000_35 = new AwS579S0100000_35((Function0) awS244S0300000_35.l2, (Function0<Unit>) 32);
                    c1828990xhB.getClass();
                    C1828990xhB.LIZLLL(dataChannel, "effect", "show");
                    C1828990xhB.LJFF(context, 2131842526, 2131842525, 2131842523, 2131842524, new AwS436S0200000_35(dataChannel, awS579S0100000_35, 15), new AwS579S0100000_35(dataChannel, 52));
                }
                break;
            case -1527670528:
                if (str.equals("live_boards")) {
                    C1828990xhB c1828990xhB2 = C1828990xhB.LIZ;
                    Context context2 = (Context) awS244S0300000_35.l0;
                    DataChannel dataChannel2 = (DataChannel) awS244S0300000_35.l1;
                    AwS579S0100000_35 awS579S0100000_352 = new AwS579S0100000_35((Function0) awS244S0300000_35.l2, (Function0<Unit>) 37);
                    c1828990xhB2.getClass();
                    C1828990xhB.LIZLLL(dataChannel2, "liveboards", "show");
                    C1828990xhB.LJFF(context2, 2131851350, 2131851361, 2131851353, 2131851363, new AwS436S0200000_35(dataChannel2, awS579S0100000_352, 9), new AwS579S0100000_35(dataChannel2, 43));
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    ((Function0) awS244S0300000_35.l2).invoke();
                }
                break;
            case 366051555:
                if (str.equals("sticker_and_liveboards")) {
                    C1828990xhB c1828990xhB3 = C1828990xhB.LIZ;
                    Context context3 = (Context) awS244S0300000_35.l0;
                    DataChannel dataChannel3 = (DataChannel) awS244S0300000_35.l1;
                    AwS579S0100000_35 awS579S0100000_353 = new AwS579S0100000_35((Function0) awS244S0300000_35.l2, (Function0<Unit>) 41);
                    c1828990xhB3.getClass();
                    C1828990xhB.LIZLLL(dataChannel3, "effect_liveboards", "show");
                    C1828990xhB.LJFF(context3, 2131851350, 2131851365, 2131851353, 2131851363, new AwS436S0200000_35(dataChannel3, awS579S0100000_353, 17), new AwS579S0100000_35(dataChannel3, 56));
                }
                break;
            case 1008614022:
                if (str.equals("live_goal")) {
                    C1828990xhB c1828990xhB4 = C1828990xhB.LIZ;
                    Context context4 = (Context) awS244S0300000_35.l0;
                    DataChannel dataChannel4 = (DataChannel) awS244S0300000_35.l1;
                    AwS579S0100000_35 awS579S0100000_354 = new AwS579S0100000_35((Function0) awS244S0300000_35.l2, (Function0<Unit>) 35);
                    c1828990xhB4.getClass();
                    C1828990xhB.LIZLLL(dataChannel4, "livegoal_background", "show");
                    C1828990xhB.LJFF(context4, 2131842530, 2131842529, 2131842523, 2131842524, new AwS436S0200000_35(dataChannel4, awS579S0100000_354, 11), new AwS579S0100000_35(dataChannel4, 47));
                }
                break;
            case 1543009402:
                if (str.equals("live_goal_and_liveboards")) {
                    C1828990xhB c1828990xhB5 = C1828990xhB.LIZ;
                    Context context5 = (Context) awS244S0300000_35.l0;
                    DataChannel dataChannel5 = (DataChannel) awS244S0300000_35.l1;
                    AwS579S0100000_35 awS579S0100000_355 = new AwS579S0100000_35((Function0) awS244S0300000_35.l2, (Function0<Unit>) 39);
                    c1828990xhB5.getClass();
                    C1828990xhB.LIZLLL(dataChannel5, "livegoal_liveboards", "show");
                    C1828990xhB.LJFF(context5, 2131851350, 2131851367, 2131851353, 2131851363, new AwS436S0200000_35(dataChannel5, awS579S0100000_355, 13), new AwS579S0100000_35(dataChannel5, 49));
                }
                break;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$4(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        String str = (String) obj;
        int i5 = 2131842513;
        switch (str.hashCode()) {
            case -1890252483:
                if (str.equals("sticker")) {
                    if (C500260Jjc.LJJIJLIJ()) {
                        C0UFI.LIZ.LJIILIIL();
                        ((Function0) awS244S0300000_35.l0).invoke();
                    } else {
                        C1828990xhB c1828990xhB = C1828990xhB.LIZ;
                        Context context = (Context) awS244S0300000_35.l1;
                        DataChannel dataChannel = (DataChannel) awS244S0300000_35.l2;
                        AwS579S0100000_35 awS579S0100000_35 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 61);
                        c1828990xhB.getClass();
                        C0UFJ c0ufj = C0UFJ.LIZ;
                        C0UFJ.LIZJ(dataChannel, "popup", "effect");
                        C1828990xhB.LJFF(context, 2131842914, 2131842908, 2131842907, 2131842906, new AwS436S0200000_35(dataChannel, awS579S0100000_35, 16), new AwS579S0100000_35(dataChannel, 53));
                    }
                }
                break;
            case -1527670528:
                if (str.equals("live_boards")) {
                    C1828990xhB c1828990xhB2 = C1828990xhB.LIZ;
                    Context context2 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel2 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_352 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 65);
                    c1828990xhB2.getClass();
                    if (LiveEffectBackgroundCoexistSetting.INSTANCE.enable()) {
                        i4 = 2131842513;
                    } else {
                        i4 = 2131842914;
                    }
                    C0UFJ c0ufj2 = C0UFJ.LIZ;
                    C0UFJ.LIZJ(dataChannel2, "popup", "liveboards");
                    C1828990xhB.LJFF(context2, i4, 2131851361, 2131851353, 2131851363, new AwS436S0200000_35(dataChannel2, awS579S0100000_352, 14), new AwS579S0100000_35(dataChannel2, 50));
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    C1828990xhB c1828990xhB3 = C1828990xhB.LIZ;
                    Context context3 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel3 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_353 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 62);
                    c1828990xhB3.getClass();
                    LiveEffectBackgroundCoexistSetting liveEffectBackgroundCoexistSetting = LiveEffectBackgroundCoexistSetting.INSTANCE;
                    if (!liveEffectBackgroundCoexistSetting.enable()) {
                        i5 = 2131842914;
                    }
                    if (liveEffectBackgroundCoexistSetting.enable()) {
                        i3 = 2131842515;
                    } else {
                        i3 = 2131842512;
                    }
                    C0UFJ c0ufj3 = C0UFJ.LIZ;
                    C0UFJ.LIZJ(dataChannel3, "popup", "background");
                    C1828990xhB.LJFF(context3, i5, i3, 2131842527, 2131842528, new AwS436S0200000_35(dataChannel3, awS579S0100000_353, 10), new AwS579S0100000_35(dataChannel3, 44));
                }
                break;
            case -58673966:
                if (str.equals("background_and_liveboards")) {
                    C1828990xhB c1828990xhB4 = C1828990xhB.LIZ;
                    Context context4 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel4 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_354 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 66);
                    c1828990xhB4.getClass();
                    C1828990xhB.LIZLLL(dataChannel4, "liveboards_background", "show");
                    if (LiveEffectBackgroundCoexistSetting.INSTANCE.enable()) {
                        i2 = 2131842513;
                    } else {
                        i2 = 2131842914;
                    }
                    C1828990xhB.LJFF(context4, i2, 2131851354, 2131851353, 2131851363, new AwS436S0200000_35(dataChannel4, awS579S0100000_354, 12), new AwS579S0100000_35(dataChannel4, 48));
                }
                break;
            case 366051555:
                if (str.equals("sticker_and_liveboards")) {
                    C1828990xhB c1828990xhB5 = C1828990xhB.LIZ;
                    Context context5 = (Context) awS244S0300000_35.l1;
                    DataChannel dataChannel5 = (DataChannel) awS244S0300000_35.l2;
                    AwS579S0100000_35 awS579S0100000_355 = new AwS579S0100000_35((Function0) awS244S0300000_35.l0, (Function0<Unit>) 68);
                    c1828990xhB5.getClass();
                    C1828990xhB.LIZLLL(dataChannel5, "effect_liveboards", "show");
                    if (LiveEffectBackgroundCoexistSetting.INSTANCE.enable()) {
                        i = 2131842513;
                    } else {
                        i = 2131842914;
                    }
                    C1828990xhB.LJFF(context5, i, 2131851365, 2131851353, 2131851363, new AwS436S0200000_35(dataChannel5, awS579S0100000_355, 18), new AwS579S0100000_35(dataChannel5, 57));
                }
                break;
            case 1008614022:
                if (str.equals("live_goal")) {
                    ((Function0) awS244S0300000_35.l0).invoke();
                }
                break;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        C2267541DpA c2267541DpA;
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267471Dp3.LIZ(c2267501Dp6.LJI, ((C2267581DpE) awS244S0300000_35.l0).LIZJ, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJ, ((C2267581DpE) awS244S0300000_35.l1).LIZJ, -20, 4);
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        if (((EnumC1679580toC) awS244S0300000_35.l2) == EnumC1679580toC.TEXT_INPUTTING) {
            c2267541DpA = C2267541DpA.LIZIZ;
        } else {
            c2267541DpA = C2267541DpA.LIZLLL;
        }
        c2267501Dp6.LIZIZ(c2267541DpA);
        InterfaceC2267531Dp9.LIZ.getClass();
        c2267501Dp6.LIZ(C2267521Dp8.LIZ());
        c2267501Dp6.LIZJ(C2267521Dp8.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, ((C2267581DpE) awS244S0300000_35.l0).LIZIZ, ((C1672190tcH) awS244S0300000_35.l1).LJIIIZ, 4);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, ((C2267581DpE) awS244S0300000_35.l2).LJ, 0.0f, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        Object obj2 = awS244S0300000_35.l0;
        if (obj2 != C1DEN.LJIIJJI) {
            C2250671D7h.LIZ(((C1DEK) awS244S0300000_35.l1).LLILLJJLI, obj2, ((C1DEF) awS244S0300000_35.l2).getContext());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        C2250671D7h.LIZ((Function1) awS244S0300000_35.l0, awS244S0300000_35.l1, (CoroutineContext) awS244S0300000_35.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS244S0300000_35 awS244S0300000_35, Object obj) {
        EnumC1229960i70 enumC1229960i70 = (EnumC1229960i70) obj;
        ((C1664680tQA) awS244S0300000_35.l0).LIZLLL(new AwS614S0100000_35(enumC1229960i70, 227), true);
        C20280014Ww c20280014Ww = (C20280014Ww) awS244S0300000_35.l1;
        Aweme aweme = (Aweme) awS244S0300000_35.l2;
        int value = enumC1229960i70.getValue();
        c20280014Ww.getClass();
        C20280014Ww.LJI(value, aweme);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS244S0300000_35(android.content.Context r3, com.bytedance.ies.sdk.datachannel.DataChannel r4, kotlin.jvm.functions.Function0 r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 2: goto L11;
                case 3: goto L5;
                case 4: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS244S0300000_35.<init>(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0300000_35(C1664680tQA c1664680tQA, Aweme aweme, C20280014Ww c20280014Ww, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1664680tQA;
        this.l1 = c20280014Ww;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0300000_35(C1D85 c1d85, Object obj, EnumC2251001D8o enumC2251001D8o, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1d85;
        this.l1 = obj;
        this.l2 = enumC2251001D8o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0300000_35(C2254091DKl c2254091DKl, EnumC1448590nnd enumC1448590nnd, ShortVideoContext shortVideoContext, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2254091DKl;
        this.l1 = enumC1448590nnd;
        this.l2 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0300000_35(InterfaceC2260541Dds interfaceC2260541Dds, Voucher voucher, C11XV c11xv, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC2260541Dds;
        this.l1 = voucher;
        this.l2 = c11xv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0300000_35(C2267581DpE c2267581DpE, C1672190tcH c1672190tcH, C2267581DpE c2267581DpE2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2267581DpE;
        this.l1 = c1672190tcH;
        this.l2 = c2267581DpE2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0300000_35(C2267581DpE c2267581DpE, C2267581DpE c2267581DpE2, EnumC1679580toC enumC1679580toC, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2267581DpE;
        this.l1 = c2267581DpE2;
        this.l2 = enumC1679580toC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS244S0300000_35(Object obj, Object obj2, C1DEK<Object> c1dek, C1DEF<?> c1def) {
        super(1);
        this.$t = c1def;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = c1dek;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS244S0300000_35(Function1 function1, Function1<Object, Unit> function12, Object obj, CoroutineContext coroutineContext) {
        super(1);
        this.$t = coroutineContext;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = obj;
    }
}
