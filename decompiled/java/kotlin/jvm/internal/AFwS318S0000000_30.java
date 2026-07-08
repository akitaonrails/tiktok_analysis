package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0PHT;
import X.C1212320heY;
import X.C128Y;
import X.C13A2;
import X.C13BQ;
import X.C13CR;
import X.C13LB;
import X.C13LP;
import X.C13WG;
import X.C144G;
import X.C144J;
import X.C144M;
import X.C144R;
import X.C144T;
import X.C14FS;
import X.C14FT;
import X.C14G0;
import X.C14GD;
import X.C14GE;
import X.C14Z4;
import X.C14ZW;
import X.C15442062u;
import X.C1696500uFU;
import X.C1862700yZY;
import X.C1863850ybP;
import X.C1863920ybW;
import X.C1864200yby;
import X.C20042813bW;
import X.C20053713dH;
import X.C20068213fc;
import X.C20084413iE;
import X.C20235514Ft;
import X.C20285214Yw;
import X.C20600815jK;
import X.C23250099c;
import X.C291001Au;
import X.C631370Opb;
import X.C724270Sb3;
import X.EnumC20283814Yi;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1690500u5o;
import X.InterfaceC1891350zJl;
import X.InterfaceC20234914Fn;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS130S0100000_30;
import Y.ARunnableS41S0101000_30;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.detail.keyframe.ui.TakoDetailKeyFrameBottomAssemAssem;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem;
import com.tts.oecverify.BdTuring;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AFwS318S0000000_30 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(53);
    public final int $t;

    public static AFwS318S0000000_30 get$arr$(int i) {
        AFwS318S0000000_30 aFwS318S0000000_30 = (AFwS318S0000000_30) arr$.get(i);
        if (aFwS318S0000000_30 != null) {
            return aFwS318S0000000_30;
        }
        arr$.compareAndSet(i, null, new AFwS318S0000000_30(i));
        return (AFwS318S0000000_30) arr$.get(i);
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
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS318S0000000_30(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        Pair pair = (Pair) obj2;
        return new C13BQ((String) pair.getFirst(), ((Number) pair.getSecond()).longValue(), 1 << ((Number) obj).intValue());
    }

    public static final Object invoke$1(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setModifier((InterfaceC1685750ty9) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setDensity((InterfaceC1690500u5o) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setLifecycleOwner((LifecycleOwner) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setSavedStateRegistryOwner((C128Y) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        TakoAssem takoAssem = (TakoAssem) obj;
        if (obj2 != null) {
            takoAssem.Up(true);
            if (takoAssem.LLLF && takoAssem.LJJIJL().isShown()) {
                takoAssem.LLLFFI = false;
                InterfaceC497601wk interfaceC497601wk = takoAssem.LLL;
                if (interfaceC497601wk != null) {
                    C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C20235514Ft(takoAssem, null), 2);
                }
            } else {
                takoAssem.LLLFFI = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        TakoAssem takoAssem = (TakoAssem) obj;
        if (obj2 != null) {
            takoAssem.Up(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.FALSE;
    }

    public static final Object invoke$17(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((TakoDetailKeyFrameBottomAssemAssem) obj).LLJLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        InterfaceC20234914Fn interfaceC20234914Fn;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        TakoDetailKeyFrameBottomAssemAssem takoDetailKeyFrameBottomAssemAssem = (TakoDetailKeyFrameBottomAssemAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (iIntValue >= 0 && (((interfaceC20234914Fn = (InterfaceC20234914Fn) takoDetailKeyFrameBottomAssemAssem.LLJZ.getValue()) == null || interfaceC20234914Fn.LLLLIIL(takoDetailKeyFrameBottomAssemAssem.LLLFZ)) && !takoDetailKeyFrameBottomAssemAssem.Bp().LLILLL && (viewOnAttachStateChangeListenerC20604515jv = takoDetailKeyFrameBottomAssemAssem.LLJLLIL) != null)) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS41S0101000_30(takoDetailKeyFrameBottomAssemAssem, iIntValue, 0));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        Object obj3;
        BottomSurveyAssem bottomSurveyAssem = (BottomSurveyAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && ((Number) c291001Au.LIZ).intValue() == ((VideoItemParams) C631370Opb.LIZ(bottomSurveyAssem)).currentPosition) {
            C20285214Yw c20285214Yw = bottomSurveyAssem.LLLI;
            C724270Sb3 c724270Sb3 = bottomSurveyAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            Aweme aweme = ((VideoItemParams) obj3).getAweme();
            c20285214Yw.LL = aweme;
            C14ZW.LIZ.getClass();
            c20285214Yw.LLILLJJLI = C14ZW.LJ(aweme);
            c20285214Yw.LLILLL = C14Z4.LIZ(aweme);
            HandlerHook.viewPostDelay(bottomSurveyAssem.LJJIJL(), new ARunnableS130S0100000_30(bottomSurveyAssem, 20), 1000L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        Object obj3;
        BottomSurveyAssem bottomSurveyAssem = (BottomSurveyAssem) obj;
        if (obj2 != null) {
            C20285214Yw c20285214Yw = bottomSurveyAssem.LLLI;
            EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SWIPE;
            C724270Sb3 c724270Sb3 = bottomSurveyAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            c20285214Yw.LJIIJJI(enumC20283814Yi, ((VideoItemParams) obj3).getAweme(), false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$22(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$23(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$24(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$25(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$26(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$27(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$28(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$29(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$3(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$31(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, obj2));
    }

    public static final Object invoke$32(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, obj2));
    }

    public static final Object invoke$33(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$34(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, ((C13CR) obj2).LIZ));
    }

    public static final Object invoke$35(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, obj2));
    }

    public static final Object invoke$36(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C13CR) obj).LIZ, obj2));
    }

    public static final Object invoke$37(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$38(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$39(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$4(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C13WG c13wg = ((C20068213fc) obj).LIZLLL;
        C1212320heY<Float> c1212320heY = C1696500uFU.LJIJ;
        return Integer.valueOf(Float.compare(((Number) c13wg.LJIIIZ(c1212320heY, AFwS189S0000000_3.get$arr$(57))).floatValue(), ((Number) ((C20068213fc) obj2).LIZLLL.LJIIIZ(c1212320heY, AFwS189S0000000_3.get$arr$(58))).floatValue()));
    }

    public static final Object invoke$40(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$41(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        Map<String, List<Object>> mapG4 = ((C20042813bW) obj2).g4();
        if (mapG4.isEmpty()) {
            return null;
        }
        return mapG4;
    }

    public static final Object invoke$43(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return obj;
    }

    public static final Object invoke$44(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C144T c144t = (C144T) obj2;
        return C1863850ybP.LIZ((C1863850ybP) obj, null, null, null, null, null, null, null, null, null, null, null, null, c144t.LJFF, 0L, c144t.LIZ, c144t.LIZIZ, c144t.LIZJ, c144t.LIZLLL, c144t.LJ, null, null, null, null, null, null, false, null, false, null, null, null, null, -512001);
    }

    public static final Object invoke$45(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C13A2 c13a2 = (C13A2) obj;
        return new C13A2(C15442062u.LJIIIIZZ(((C13LB) obj2).LIZ, C13LP.LLIIIZ(c13a2.LL)), c13a2.LLILLJJLI);
    }

    public static final Object invoke$46(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C14FS c14fs = (C14FS) obj;
        C14FT c14ft = (C14FT) obj2;
        List<Pair<String, Long>> list = c14ft.LIZ;
        C0PHT c0pht = c14ft.LIZIZ;
        String str = c14ft.LIZJ;
        String str2 = c14ft.LIZLLL;
        String str3 = c14ft.LJ;
        String str4 = c14ft.LJFF;
        String str5 = c14ft.LJI;
        String str6 = c14ft.LJII;
        String str7 = c14ft.LJIIIIZZ;
        String str8 = c14ft.LJIIIZ;
        String str9 = c14ft.LJIIJ;
        Map<String, List<TakoKeyFramePoint>> map = c14ft.LJIIJJI;
        return new C14FS(list, c0pht, str, str2, str3, str4, str5, str6, str7, str8, str9, c14fs.LLJILJIL, c14ft.LJIIL, map, c14ft.LJIILIIL, c14fs.LLJJI);
    }

    public static final Object invoke$47(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C14GE c14ge = (C14GE) obj2;
        return new C14GD(c14ge.LIZ, c14ge.LIZIZ, c14ge.LJ, c14ge.LIZJ, c14ge.LIZLLL, c14ge.LJFF, c14ge.LJI, ((C14GD) obj).LLIZLLLIL);
    }

    public static final Object invoke$48(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C144J c144j = (C144J) obj2;
        return C1863850ybP.LIZ((C1863850ybP) obj, null, null, null, null, null, null, null, null, null, null, null, null, c144j.LIZIZ, c144j.LIZ, 0L, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -12289);
    }

    public static final Object invoke$49(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        ConcurrentHashMap<String, Map<String, String>> concurrentHashMap;
        Map<String, String> map;
        Map<String, String> mapPutIfAbsent;
        C1863850ybP c1863850ybP = (C1863850ybP) obj;
        C144G c144g = (C144G) obj2;
        String str = c1863850ybP.LLILZIL;
        String str2 = c144g.LIZ;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && !Intrinsics.LJFF(str, str2) && (map = (concurrentHashMap = C1862700yZY.LIZIZ).get(str)) != null) {
            Map<String, String> linkedHashMap = concurrentHashMap.get(str2);
            if (linkedHashMap == null && (mapPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (linkedHashMap = new LinkedHashMap<>()))) != null) {
                linkedHashMap = mapPutIfAbsent;
            }
            Map<String, String> map2 = linkedHashMap;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!map2.containsKey(key)) {
                    map2.put(key, value);
                }
            }
        }
        return C1863850ybP.LIZ(c1863850ybP, null, null, null, null, c144g.LIZ, c144g.LIZIZ, c144g.LIZJ, null, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -113);
    }

    public static final Object invoke$5(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setResetBlock((Function1) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return C1863850ybP.LIZ((C1863850ybP) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, false, null, ((C144M) obj2).LIZ, null, null, null, null, -134217729);
    }

    public static final Object invoke$51(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        return new C1863920ybW(((C144R) obj2).LIZ, ((C1863920ybW) obj).LLILLJJLI);
    }

    public static final Object invoke$52(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C14G0 c14g0 = (C14G0) obj2;
        return new C1864200yby(c14g0.LIZ, c14g0.LIZIZ, ((C1864200yby) obj).LLILLL);
    }

    public static final Object invoke$6(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setUpdateBlock((Function1) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setReleaseBlock((Function1) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setUpdateBlock((Function1) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS318S0000000_30 aFwS318S0000000_30, Object obj, Object obj2) {
        C20084413iE.LIZJ((C20053713dH) obj).setReleaseBlock((Function1) obj2);
        return Unit.LIZ;
    }
}
