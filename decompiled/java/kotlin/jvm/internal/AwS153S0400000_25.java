package kotlin.jvm.internal;

import X.AbstractC1556970qcR;
import X.AbstractC1662050tLv;
import X.C01GW;
import X.C01QW;
import X.C01TT;
import X.C05P0;
import X.C09AY;
import X.C11RK;
import X.C1320700kTM;
import X.C13FE;
import X.C13FK;
import X.C13LP;
import X.C1447800nmM;
import X.C1449000noI;
import X.C1556960qcQ;
import X.C1624440sNG;
import X.C1625150sOP;
import X.C1625460sOu;
import X.C1627310sRt;
import X.C1630880sXe;
import X.C1631250sYF;
import X.C1634330sdD;
import X.C1636890shL;
import X.C1636900shM;
import X.C1637440siE;
import X.C1650460t3E;
import X.C1650560t3O;
import X.C1650630t3V;
import X.C1650750t3h;
import X.C1650980t44;
import X.C1651010t47;
import X.C1662100tM0;
import X.C1662850tND;
import X.C1674030tfF;
import X.C1677040tk6;
import X.C1677210tkN;
import X.C1677800tlK;
import X.C1679360tnq;
import X.C1679440tny;
import X.C1686740tzk;
import X.C1686970u07;
import X.C1689390u41;
import X.C1692150u8T;
import X.C1692280u8g;
import X.C19475711Hn;
import X.C19A3;
import X.C1DRG;
import X.C20700915zT;
import X.C23250099c;
import X.C350401Xq;
import X.C577500Mku;
import X.DialogC1686750tzl;
import X.EnumC1616740sAq;
import X.EnumC1671200tag;
import X.InterfaceC1325670kbN;
import X.InterfaceC1330440kj4;
import X.InterfaceC1625180sOS;
import X.InterfaceC1625220sOW;
import X.InterfaceC1635660sfM;
import X.InterfaceC1647280sy6;
import X.InterfaceC1648570t0B;
import X.InterfaceC1649500t1g;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650190t2n;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650670t3Z;
import X.InterfaceC1650730t3f;
import X.InterfaceC1651020t48;
import X.InterfaceC1671910tbp;
import X.InterfaceC1679450tnz;
import X.InterfaceC1686540tzQ;
import X.InterfaceC497601wk;
import Y.AObjectS185S0300000_25;
import Y.AObjectS306S0200000_25;
import Y.AObjectS82S0400000_25;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupParams;
import com.ss.android.ugc.aweme.behavior.popup.OnclickParams;
import com.ss.android.ugc.aweme.components.briefinfo.BriefInfoParams;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mn3.e0;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public class AwS153S0400000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS153S0400000_25 awS153S0400000_25) {
        String str;
        String string;
        String string2;
        C1449000noI c1449000noI = (C1449000noI) awS153S0400000_25.l0;
        String str2 = null;
        if (c1449000noI != null) {
            str2 = c1449000noI.LJIIIZ;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (c1449000noI == null || (str = c1449000noI.LJIIIIZZ) == null) {
            str = "";
        }
        if (c1449000noI == null || (string = Integer.valueOf(c1449000noI.LIZJ).toString()) == null) {
            string = "";
        }
        Bundle bundle = ((C1625460sOu) ((InterfaceC1625180sOS) awS153S0400000_25.l1)).LIZLLL;
        if (bundle == null || bundle.getBoolean("need_report_prop_remove_event", true)) {
            InterfaceC1625220sOW interfaceC1625220sOW = ((C1625150sOP) awS153S0400000_25.l2).LIZIZ;
            Effect effect = (Effect) awS153S0400000_25.l3;
            Bundle bundle2 = ((C1625460sOu) ((InterfaceC1625180sOS) awS153S0400000_25.l1)).LIZLLL;
            if (bundle2 != null && (string2 = bundle2.getString("enter_method")) != null) {
                str3 = string2;
            }
            interfaceC1625220sOW.LIZLLL(effect, str3, ((C1625460sOu) ((InterfaceC1625180sOS) awS153S0400000_25.l1)).LIZLLL, string, str, str2);
            C1625150sOP c1625150sOP = (C1625150sOP) awS153S0400000_25.l2;
            InterfaceC1625220sOW interfaceC1625220sOW2 = c1625150sOP.LIZIZ;
            Effect effect2 = (Effect) awS153S0400000_25.l3;
            int i = c1625150sOP.LJ;
            String str4 = c1625150sOP.LJI;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1625150sOP c1625150sOP2 = (C1625150sOP) awS153S0400000_25.l2;
            interfaceC1625220sOW2.LJIILIIL(effect2, i, str4, str2, jElapsedRealtime - c1625150sOP2.LJIIIIZZ, c1625150sOP2.LJFF);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS153S0400000_25 awS153S0400000_25) {
        ((InterfaceC1686540tzQ) awS153S0400000_25.l0).LJIJJ(true);
        InterfaceC1679450tnz interfaceC1679450tnz = (InterfaceC1679450tnz) awS153S0400000_25.l1;
        if (interfaceC1679450tnz != null) {
            interfaceC1679450tnz.hide();
        }
        if (((C13FK) ((InterfaceC1671910tbp) awS153S0400000_25.l2).LIZ().LJI).LIZ() == Long.MIN_VALUE) {
            ((InvitePageViewModel) awS153S0400000_25.l3).yQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS153S0400000_25 awS153S0400000_25) {
        C1637440siE.LIZJ((C1662850tND) awS153S0400000_25.l0, (List) awS153S0400000_25.l1, (InterfaceC1325670kbN) awS153S0400000_25.l2, (C1320700kTM) awS153S0400000_25.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS153S0400000_25 awS153S0400000_25) {
        Function0<Unit> function0;
        C01TT.LIZJ(new AwS426S0200000_25((AbstractC1662050tLv) awS153S0400000_25.l2, (ViewGroup) awS153S0400000_25.l3, 152));
        C1662100tM0 c1662100tM0 = (C1662100tM0) awS153S0400000_25.l0;
        if (c1662100tM0 != null && (function0 = c1662100tM0.LJIIJ) != null) {
            function0.invoke();
        }
        Function0 function02 = (Function0) awS153S0400000_25.l1;
        if (function02 != null) {
            function02.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS153S0400000_25 awS153S0400000_25) {
        return new C1634330sdD((Function0) awS153S0400000_25.l0, (Function0) awS153S0400000_25.l1, (Function0) awS153S0400000_25.l2, (Function0) awS153S0400000_25.l3, AFwS214S0000000_25.get$arr$(491));
    }

    public static final Object invoke$13(AwS153S0400000_25 awS153S0400000_25) {
        String str;
        OnclickParams onclickParams;
        OnclickParams onclickParams2;
        MarketplacePopupParams marketplacePopupParams;
        Function1 function1 = (Function1) awS153S0400000_25.l0;
        if (function1 != null) {
            BriefInfoParams briefInfoParams = (BriefInfoParams) awS153S0400000_25.l1;
            C1674030tfF c1674030tfF = (C1674030tfF) awS153S0400000_25.l2;
            C05P0 c05p0 = (C05P0) awS153S0400000_25.l3;
            MarketplacePopupParams marketplacePopupParams2 = null;
            if (briefInfoParams != null && (onclickParams2 = briefInfoParams.onClickAction) != null && (marketplacePopupParams = onclickParams2.popup) != null) {
                str = marketplacePopupParams.popupMode;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, EnumC1616740sAq.EXPAND_ON_SCREEN.getMode())) {
                c05p0.setValue(Boolean.valueOf(!((Boolean) c05p0.getValue()).booleanValue()));
            } else {
                BriefInfoParams briefInfoParams2 = c1674030tfF.LIZIZ.briefInfoComponent;
                if (briefInfoParams2 != null && (onclickParams = briefInfoParams2.onClickAction) != null) {
                    marketplacePopupParams2 = onclickParams.popup;
                }
                function1.invoke(new C1556960qcQ(marketplacePopupParams2));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS153S0400000_25 awS153S0400000_25) {
        ((DialogC1686750tzl) awS153S0400000_25.l0).LJJLJLI((Function0) awS153S0400000_25.l1, (C1686740tzk) awS153S0400000_25.l2, (EnumC1671200tag) awS153S0400000_25.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS153S0400000_25 awS153S0400000_25) {
        LiveEvent<Unit> liveEventCI;
        C1650750t3h c1650750t3h = (C1650750t3h) awS153S0400000_25.l0;
        C19A3 c19a3 = (C19A3) awS153S0400000_25.l1;
        C1DRG c1drg = (C1DRG) awS153S0400000_25.l2;
        C1650630t3V c1650630t3V = (C1650630t3V) awS153S0400000_25.l3;
        c1650750t3h.getClass();
        NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(c19a3);
        c1650750t3h.LJFF = new SafeHandler(navigationSceneLIZIZ);
        InterfaceC1650230t2r interfaceC1650230t2r = c1650750t3h.LIZIZ;
        if (interfaceC1650230t2r == null) {
            interfaceC1650230t2r = null;
        }
        interfaceC1650230t2r.oN().LIZ(navigationSceneLIZIZ, new AObjectS306S0200000_25((Object) c1650630t3V, (Object) c1drg, (InterfaceC1648570t0B) 32));
        ((InterfaceC1650670t3Z) c1drg.LJII(InterfaceC1650670t3Z.class, null)).R7().LIZ(navigationSceneLIZIZ, new AObjectS306S0200000_25((Object) c1650630t3V, (Object) c1drg, (InterfaceC1648570t0B) 33));
        InterfaceC1650670t3Z interfaceC1650670t3Z = (InterfaceC1650670t3Z) c1drg.LJII(InterfaceC1650670t3Z.class, null);
        interfaceC1650670t3Z.R7().LIZ(navigationSceneLIZIZ, new AObjectS82S0400000_25(interfaceC1650670t3Z, c1650750t3h, c1650630t3V, c1drg, 10));
        ((InterfaceC1649500t1g) c1drg.LJII(InterfaceC1649500t1g.class, null)).Vr().LIZ(navigationSceneLIZIZ, new AObjectS306S0200000_25((Object) c1650630t3V, (Object) c1drg, (InterfaceC1648570t0B) 34));
        ((InterfaceC1647280sy6) c1drg.LJII(InterfaceC1647280sy6.class, null)).getBottomTabIndexChangeEvent().LIZ(navigationSceneLIZIZ, new AObjectS185S0300000_25(c1drg, c1650750t3h, c1650630t3V, 27));
        InterfaceC1650230t2r interfaceC1650230t2r2 = c1650750t3h.LIZIZ;
        if (interfaceC1650230t2r2 == null) {
            interfaceC1650230t2r2 = null;
        }
        interfaceC1650230t2r2.vB1().LIZ(navigationSceneLIZIZ, new AObjectS306S0200000_25((Object) c1650630t3V, (Object) c1drg, (InterfaceC1648570t0B) 35));
        InterfaceC1650230t2r interfaceC1650230t2r3 = c1650750t3h.LIZIZ;
        if (interfaceC1650230t2r3 == null) {
            interfaceC1650230t2r3 = null;
        }
        interfaceC1650230t2r3.ok0().LIZ(navigationSceneLIZIZ, new AObjectS306S0200000_25((Object) c1650630t3V, (Object) c1drg, (InterfaceC1648570t0B) 36));
        ((InterfaceC1650190t2n) c1drg.LJII(InterfaceC1650230t2r.class, null)).p92().LIZ(navigationSceneLIZIZ, new AObjectS82S0400000_25(c1650750t3h, c1650630t3V, c1drg, c19a3, 11));
        InterfaceC1650730t3f interfaceC1650730t3f = (InterfaceC1650730t3f) c1drg.LJII(InterfaceC1650730t3f.class, null);
        interfaceC1650730t3f.Wv().LIZ(navigationSceneLIZIZ, new AObjectS185S0300000_25(c1drg, c1650750t3h, c1650630t3V, 28));
        interfaceC1650730t3f.Vk().LIZ(navigationSceneLIZIZ, new AObjectS185S0300000_25(c1drg, c1650750t3h, c1650630t3V, 25));
        ((e0) c1drg.LJII(e0.class, null)).XJ2().LIZ(navigationSceneLIZIZ, new AObjectS185S0300000_25(c1drg, c1650750t3h, c1650630t3V, 26));
        e0 e0Var = (e0) c1drg.LJIIL(null, e0.class);
        if (e0Var != null && (liveEventCI = e0Var.cI()) != null) {
            liveEventCI.LIZ(navigationSceneLIZIZ, new AObjectS306S0200000_25((Object) c1650750t3h, (Object) c1drg, (InterfaceC1648570t0B) 31));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS153S0400000_25 awS153S0400000_25) {
        C1636890shL c1636890shL = (C1636890shL) awS153S0400000_25.l0;
        FragmentManager fragmentManager = (FragmentManager) awS153S0400000_25.l1;
        C1630880sXe c1630880sXe = (C1630880sXe) awS153S0400000_25.l2;
        C1631250sYF c1631250sYF = c1636890shL.LLILLL;
        C11RK<Pair<Integer, Integer>> c11rk = c1636890shL.LLJ;
        c11rk.getClass();
        c1631250sYF.LJII = new C19475711Hn(c11rk);
        return new C1636900shM(c1636890shL, fragmentManager, c1630880sXe, c1631250sYF, c1636890shL.LLILZ, c1636890shL.LLILZIL, (InterfaceC1635660sfM) awS153S0400000_25.l3);
    }

    public static final Object invoke$17(AwS153S0400000_25 awS153S0400000_25) {
        return new C1679440tny(C1692280u8g.LIZLLL(C1679360tnq.LIZIZ((C05P0) awS153S0400000_25.l1).LIZIZ), (C1692150u8T) ((C05P0) awS153S0400000_25.l2).getValue(), ((Number) ((C05P0) awS153S0400000_25.l3).getValue()).intValue(), ((C1689390u41) awS153S0400000_25.l0).LJI());
    }

    public static final Object invoke$2(AwS153S0400000_25 awS153S0400000_25) {
        C1627310sRt c1627310sRt = (C1627310sRt) ((C1DRG) awS153S0400000_25.l0).LJII(C1627310sRt.class, null);
        RecordEffectModel recordEffectModel = ((ShortVideoContext) awS153S0400000_25.l1).creativeModel.recordEffectModel;
        return new C1624440sNG(recordEffectModel.stickerFrom, (String) C13LP.LJJJLL(recordEffectModel.gradeKey), (Effect) awS153S0400000_25.l2, (List) awS153S0400000_25.l3, c1627310sRt.LIZ.LIZJ().booleanValue());
    }

    public static final Object invoke$3(AwS153S0400000_25 awS153S0400000_25) {
        C1650460t3E c1650460t3E = new C1650460t3E((C1DRG) awS153S0400000_25.l0);
        InterfaceC1651020t48 interfaceC1651020t48 = (InterfaceC1651020t48) awS153S0400000_25.l1;
        ShortVideoContext shortVideoContext = ((C1651010t47) awS153S0400000_25.l2).LJ;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        return interfaceC1651020t48.LIZJ(shortVideoContext, c1650460t3E, (C1650560t3O) awS153S0400000_25.l3);
    }

    public static final Object invoke$4(AwS153S0400000_25 awS153S0400000_25) {
        C1650980t44 c1650980t44LJIILJJIL = ((C1650560t3O) awS153S0400000_25.l0).LJIILJJIL();
        InterfaceC1649530t1j interfaceC1649530t1j = (InterfaceC1649530t1j) awS153S0400000_25.l1;
        C1651010t47 c1651010t47 = (C1651010t47) awS153S0400000_25.l2;
        Boolean bool = (Boolean) awS153S0400000_25.l3;
        c1650980t44LJIILJJIL.LLILLJJLI = -1;
        s sVarLJI = interfaceC1649530t1j.R7().LJI();
        if (sVarLJI == null) {
            InterfaceC1650230t2r interfaceC1650230t2r = c1651010t47.LIZIZ;
            if (interfaceC1650230t2r == null) {
                interfaceC1650230t2r = null;
            }
            sVarLJI = interfaceC1650230t2r.getSpeed();
        }
        c1650980t44LJIILJJIL.LLILLL = C577500Mku.LJIIIIZZ(sVarLJI);
        c1650980t44LJIILJJIL.LLILZLL = bool.booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS153S0400000_25 awS153S0400000_25) {
        ((DoNotTranslateSettingPageV2) awS153S0400000_25.l0).ZR((List) ((C05P0) awS153S0400000_25.l1).getValue(), (C20700915zT) ((C01GW) awS153S0400000_25.l2).getValue(), (List) ((C05P0) awS153S0400000_25.l3).getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS153S0400000_25 awS153S0400000_25) {
        ((DoNotTranslateSettingPageV2) awS153S0400000_25.l0).ZR((List) ((C05P0) awS153S0400000_25.l1).getValue(), (C20700915zT) ((C01GW) awS153S0400000_25.l2).getValue(), (List) ((C05P0) awS153S0400000_25.l3).getValue());
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public static final Object invoke$7(AwS153S0400000_25 awS153S0400000_25) {
        if (!Intrinsics.LJFF(awS153S0400000_25.l0, ((C1677800tlK) awS153S0400000_25.l1).LL) || !Intrinsics.LJFF(awS153S0400000_25.l2, ((C1677800tlK) awS153S0400000_25.l1).LLILLJJLI)) {
            C1677800tlK c1677800tlK = (C1677800tlK) awS153S0400000_25.l1;
            ?? r4 = awS153S0400000_25.l0;
            ?? r3 = awS153S0400000_25.l2;
            C1677040tk6 c1677040tk6 = (C1677040tk6) awS153S0400000_25.l3;
            c1677800tlK.LL = r4;
            c1677800tlK.LLILLJJLI = r3;
            c1677800tlK.LLILZIL = c1677040tk6;
            c1677800tlK.LLILZLL = new C1677210tkN<>(c1677040tk6, c1677800tlK.LLILLL, r4, r3);
            ((C13FE) c1677800tlK.LLJI.LIZIZ).setValue(Boolean.TRUE);
            c1677800tlK.LLIZ = false;
            c1677800tlK.LLIZLLLIL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS153S0400000_25 awS153S0400000_25) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS153S0400000_25.l0, null, null, new C350401Xq((StoryHighlightsCreationVM) awS153S0400000_25.l1, (Context) awS153S0400000_25.l2, (StoryHighlightAwemePreview) awS153S0400000_25.l3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS153S0400000_25 awS153S0400000_25) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS153S0400000_25.l0, null, null, new C01QW((StoryHighlightsCreationVM) awS153S0400000_25.l1, (Context) awS153S0400000_25.l2, (StoryHighlightAwemePreview) awS153S0400000_25.l3, null), 3);
        ((StoryHighlightsCreationVM) awS153S0400000_25.l1).zJ("click_cover_image", null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0400000_25(InterfaceC497601wk interfaceC497601wk, StoryHighlightsCreationVM storyHighlightsCreationVM, Context context, StoryHighlightAwemePreview storyHighlightAwemePreview, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = storyHighlightsCreationVM;
        this.l2 = context;
        this.l3 = storyHighlightAwemePreview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(C1449000noI c1449000noI, C1449000noI c1449000noI2, InterfaceC1625180sOS<T> interfaceC1625180sOS, C1625150sOP c1625150sOP, Effect effect) {
        super(0);
        this.$t = effect;
        this.l0 = c1449000noI;
        this.l1 = c1449000noI2;
        this.l2 = interfaceC1625180sOS;
        this.l3 = c1625150sOP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(C1636890shL c1636890shL, C1636890shL c1636890shL2, FragmentManager fragmentManager, C1630880sXe c1630880sXe, InterfaceC1635660sfM<?, Fragment> interfaceC1635660sfM) {
        super(0);
        this.$t = interfaceC1635660sfM;
        this.l0 = c1636890shL;
        this.l1 = c1636890shL2;
        this.l2 = fragmentManager;
        this.l3 = c1630880sXe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0400000_25(C1650560t3O c1650560t3O, InterfaceC1649530t1j interfaceC1649530t1j, C1651010t47 c1651010t47, Boolean bool, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1650560t3O;
        this.l1 = interfaceC1649530t1j;
        this.l2 = c1651010t47;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(C1662100tM0 c1662100tM0, C1662100tM0 c1662100tM02, Function0<Unit> function0, AbstractC1662050tLv abstractC1662050tLv, ViewGroup viewGroup) {
        super(0);
        this.$t = viewGroup;
        this.l0 = c1662100tM0;
        this.l1 = c1662100tM02;
        this.l2 = function0;
        this.l3 = abstractC1662050tLv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(C1662850tND c1662850tND, C1662850tND c1662850tND2, List<String> list, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        super(0);
        this.$t = c1320700kTM;
        this.l0 = c1662850tND;
        this.l1 = c1662850tND2;
        this.l2 = list;
        this.l3 = interfaceC1325670kbN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0400000_25(InterfaceC1686540tzQ interfaceC1686540tzQ, InterfaceC1679450tnz interfaceC1679450tnz, InterfaceC1671910tbp interfaceC1671910tbp, InvitePageViewModel invitePageViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1686540tzQ;
        this.l1 = interfaceC1679450tnz;
        this.l2 = interfaceC1671910tbp;
        this.l3 = invitePageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(DialogC1686750tzl dialogC1686750tzl, DialogC1686750tzl dialogC1686750tzl2, Function0<Unit> function0, C1686740tzk c1686740tzk, EnumC1671200tag enumC1671200tag) {
        super(0);
        this.$t = enumC1671200tag;
        this.l0 = dialogC1686750tzl;
        this.l1 = dialogC1686750tzl2;
        this.l2 = function0;
        this.l3 = c1686740tzk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(C1689390u41 c1689390u41, C1689390u41 c1689390u412, C05P0<C1686970u07> c05p0, C05P0<C1692150u8T> c05p02, C05P0<Integer> c05p03) {
        super(0);
        this.$t = c05p03;
        this.l0 = c1689390u41;
        this.l1 = c1689390u412;
        this.l2 = c05p0;
        this.l3 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0400000_25(C1DRG c1drg, InterfaceC1651020t48 interfaceC1651020t48, C1651010t47 c1651010t47, C1650560t3O c1650560t3O, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1drg;
        this.l1 = interfaceC1651020t48;
        this.l2 = c1651010t47;
        this.l3 = c1650560t3O;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0400000_25(C1DRG c1drg, C19A3 c19a3, C1650750t3h c1650750t3h, C1650630t3V c1650630t3V, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1650750t3h;
        this.l1 = c19a3;
        this.l2 = c1drg;
        this.l3 = c1650630t3V;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(C1DRG c1drg, C1DRG c1drg2, ShortVideoContext shortVideoContext, Effect effect, List<String> list) {
        super(0);
        this.$t = list;
        this.l0 = c1drg;
        this.l1 = c1drg2;
        this.l2 = shortVideoContext;
        this.l3 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(DoNotTranslateSettingPageV2 doNotTranslateSettingPageV2, DoNotTranslateSettingPageV2 doNotTranslateSettingPageV22, C05P0<List<String>> c05p0, C01GW<C20700915zT> c01gw, C05P0<List<String>> c05p02) {
        super(0);
        this.$t = c05p02;
        this.l0 = doNotTranslateSettingPageV2;
        this.l1 = doNotTranslateSettingPageV22;
        this.l2 = c05p0;
        this.l3 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(Object obj, Object obj2, C1677800tlK<Object, Object> c1677800tlK, Object obj3, C1677040tk6<Object> c1677040tk6) {
        super(0);
        this.$t = c1677040tk6;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = c1677800tlK;
        this.l3 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S0400000_25(Function1 function1, Function1<? super AbstractC1556970qcR, Unit> function12, BriefInfoParams briefInfoParams, C1674030tfF c1674030tfF, C05P0<Boolean> c05p0) {
        super(0);
        this.$t = c05p0;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = briefInfoParams;
        this.l3 = c1674030tfF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0400000_25(AFwS214S0000000_25 aFwS214S0000000_25, AFwS201S0000000_14 aFwS201S0000000_14, AFwS214S0000000_25 aFwS214S0000000_252, AFwS201S0000000_14 aFwS201S0000000_142, int i) {
        super(0);
        this.$t = i;
        this.l0 = aFwS214S0000000_25;
        this.l1 = aFwS201S0000000_14;
        this.l2 = aFwS214S0000000_252;
        this.l3 = aFwS201S0000000_142;
    }
}
