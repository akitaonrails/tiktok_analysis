package kotlin.jvm.internal;

import X.AbstractC1126600fQI;
import X.C013C;
import X.C01C1;
import X.C09AY;
import X.C0JGR;
import X.C0KXJ;
import X.C1086960eOM;
import X.C1129700fVI;
import X.C1134160fcU;
import X.C1135810ff9;
import X.C1135920ffK;
import X.C1136320ffy;
import X.C1144720ftW;
import X.C1144800fte;
import X.C1146350fw9;
import X.C1146430fwH;
import X.C1146460fwK;
import X.C1146470fwL;
import X.C1146530fwR;
import X.C118300cf;
import X.C11JF;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1146490fwN;
import X.InterfaceC1094160eZy;
import X.InterfaceC1135310feL;
import Y.AfS186S0100000_17;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.dataChannel.ShowCustomPollToolBarAlert;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.interaction.custompoll.CustomPollCardWidget;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes18.dex */
public class AwS114S0400000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final void LIZ$0(C01C1 c01c1, CustomPollCardWidget customPollCardWidget) {
        if (!c01c1.LIZLLL && c01c1.LIZIZ != 0) {
            customPollCardWidget.D1(c01c1);
            customPollCardWidget.show();
            if (C500260Jjc.LJIIZILJ(customPollCardWidget.dataChannel)) {
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, customPollCardWidget.LLJ, customPollCardWidget.LLJI);
            } else {
                C786410Ut5.LJLIIL(10000L, customPollCardWidget.LLJ, customPollCardWidget.LLJI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        boolean z = ((C013C) awS114S0400000_17.l0).element;
        T t = ((C259800zU) awS114S0400000_17.l1).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(1, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l2;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l3;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LLILLJJLI;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLL;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILZ;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZIL;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZLL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZLLLIL;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLJ;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJI;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJIJIL;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJILJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel, battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel2, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel12, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USE_SMOKE_CARD message setstate, updateRivalSmokeList =  ");
        sbLIZ.append(((BattleItem4FEModel) awS114S0400000_17.l0).itemList);
        sbLIZ.append(", updateRivalSmokeList = ");
        sbLIZ.append(((BattleItem4FEModel) awS114S0400000_17.l1).itemList);
        C20441214yg.LJIIIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hhhhhhhhhhh USE_SMOKE_CARD message setstate, updateRivalSmokeList = ");
        sbLIZ2.append(((BattleItem4FEModel) awS114S0400000_17.l1).itemList);
        C20441214yg.LJIIIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        boolean z = ((C013C) awS114S0400000_17.l2).element;
        T t = ((C259800zU) awS114S0400000_17.l3).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(2, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l0;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l1;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LL;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLL;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILZ;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZIL;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZLL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZ;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLJ;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJI;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJIJIL;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJILJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel3, battleItem4FEModel, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel8, battleItem4FEModel2, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel12, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$10(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1135810ff9 c1135810ff9 = (C1135810ff9) obj;
        try {
            ((Function1) awS114S0400000_17.l0).invoke(c1135810ff9);
            if (((C1136320ffy) awS114S0400000_17.l1).LIZ == null && c1135810ff9 != null) {
                ((InterfaceC1135310feL) awS114S0400000_17.l2).LIZIZ("GiftTrayMessageQueue.releaseClaim", new AwS166S1100000_17((C1135920ffK) awS114S0400000_17.l3, c1135810ff9.LIZLLL, 2));
            }
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (((C1136320ffy) awS114S0400000_17.l1).LIZ == null && c1135810ff9 != null) {
                ((InterfaceC1135310feL) awS114S0400000_17.l2).LIZIZ("GiftTrayMessageQueue.releaseClaim", new AwS166S1100000_17((C1135920ffK) awS114S0400000_17.l3, c1135810ff9.LIZLLL, 2));
            }
            throw th;
        }
    }

    public static final Object invoke$11(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        String str;
        String strLJIIL;
        String str2;
        String strLJJIFFI;
        String str3 = (String) obj;
        LocalCurrencyGiftInfo localCurrencyGiftInfo = (LocalCurrencyGiftInfo) awS114S0400000_17.l0;
        if (localCurrencyGiftInfo != null) {
            str = localCurrencyGiftInfo.bannerExtendText;
        } else {
            str = null;
        }
        if (C500260Jjc.LJJIIZ(str)) {
            LocalCurrencyGiftInfo localCurrencyGiftInfo2 = (LocalCurrencyGiftInfo) awS114S0400000_17.l0;
            if (localCurrencyGiftInfo2 == null || (str2 = localCurrencyGiftInfo2.bannerExtendText) == null || (strLJJIFFI = u.LJJIFFI(str2, "{s_num}", String.valueOf(((AbstractC1126600fQI) awS114S0400000_17.l1).LIZLLL()), false)) == null || (strLJIIL = u.LJJIFFI(strLJJIFFI, "{s_localCurrency}", str3, false)) == null) {
                strLJIIL = "";
            }
        } else {
            strLJIIL = C497740JfY.LJIIL(2131755777, ((AbstractC1126600fQI) awS114S0400000_17.l1).LIZLLL(), Integer.valueOf(((AbstractC1126600fQI) awS114S0400000_17.l1).LIZLLL()), str3);
        }
        C1129700fVI c1129700fVI = (C1129700fVI) awS114S0400000_17.l2;
        c1129700fVI.LIZJ.setText(strLJIIL);
        C500260Jjc.LLFFF(c1129700fVI.LIZLLL);
        C500260Jjc.LLFFF(c1129700fVI.LIZJ);
        c1129700fVI.LIZJ.setIsExpanded(false);
        c1129700fVI.LIZJ.setToggleClickListener(new AwS596S0100000_17(c1129700fVI, 726));
        C20337914i1<Boolean> c20337914i1 = InterfaceC1094160eZy.C1;
        if (!c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.TRUE);
            c1129700fVI.LIZJ.setIsExpanded(true);
            HandlerHook.viewPostDelay(c1129700fVI.LIZJ, c1129700fVI.LJ, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        if (c1129700fVI.LJFF == null) {
            C11JF c11jfLIZJ = C784440Upu.LIZ().LIZJ(c1129700fVI.LIZ, C1134160fcU.class).LIZJ(new AfS186S0100000_17(c1129700fVI, 207));
            c1129700fVI.LJFF = c11jfLIZJ;
            if (c11jfLIZJ != null) {
                c1129700fVI.LIZIZ.LIZ(c11jfLIZJ);
            }
        }
        ((Function1) awS114S0400000_17.l3).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        boolean z = ((C013C) awS114S0400000_17.l0).element;
        T t = ((C259800zU) awS114S0400000_17.l1).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(3, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l2;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l3;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LL;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLJJLI;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILZ;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZIL;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZLL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZ;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLIZLLLIL;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJI;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJIJIL;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJILJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel2, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel12, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        boolean z = ((C013C) awS114S0400000_17.l0).element;
        T t = ((C259800zU) awS114S0400000_17.l1).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(4, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l2;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l3;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LL;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLJJLI;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILLL;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZIL;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZLL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZ;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLIZLLLIL;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJ;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJIJIL;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJILJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel2, battleItem4FEModel11, battleItem4FEModel12, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        boolean z = ((C013C) awS114S0400000_17.l0).element;
        T t = ((C259800zU) awS114S0400000_17.l1).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(7, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l2;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l3;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LL;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLJJLI;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILLL;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZ;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZLL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZ;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLIZLLLIL;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJ;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJI;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJILJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel, battleItem4FEModel7, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel2, battleItem4FEModel12, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        boolean z = ((C013C) awS114S0400000_17.l0).element;
        T t = ((C259800zU) awS114S0400000_17.l1).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(8, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l2;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l3;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LL;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLJJLI;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILLL;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZ;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZIL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZ;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLIZLLLIL;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJ;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJI;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJIJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel12, battleItem4FEModel2, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        boolean z = ((C013C) awS114S0400000_17.l0).element;
        T t = ((C259800zU) awS114S0400000_17.l1).element;
        if (t != 0) {
            C1144800fte c1144800fte = new C1144800fte(9, (ItemInfo4FE) t, z);
            BattleItem4FEModel battleItem4FEModel = (BattleItem4FEModel) awS114S0400000_17.l2;
            BattleItem4FEModel battleItem4FEModel2 = (BattleItem4FEModel) awS114S0400000_17.l3;
            BattleItem4FEModel battleItem4FEModel3 = c1144720ftW.LLILLJJLI;
            BattleItem4FEModel battleItem4FEModel4 = c1144720ftW.LLILLL;
            BattleItem4FEModel battleItem4FEModel5 = c1144720ftW.LLILZ;
            BattleItem4FEModel battleItem4FEModel6 = c1144720ftW.LLILZIL;
            BattleItem4FEModel battleItem4FEModel7 = c1144720ftW.LLILZLL;
            BattleItem4FEModel battleItem4FEModel8 = c1144720ftW.LLIZLLLIL;
            BattleItem4FEModel battleItem4FEModel9 = c1144720ftW.LLJ;
            BattleItem4FEModel battleItem4FEModel10 = c1144720ftW.LLJI;
            BattleItem4FEModel battleItem4FEModel11 = c1144720ftW.LLJIJIL;
            BattleItem4FEModel battleItem4FEModel12 = c1144720ftW.LLJILJIL;
            c1144720ftW.getClass();
            return C1144720ftW.LIZ(battleItem4FEModel, battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel2, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel12, c1144800fte);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$7(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        C1146430fwH c1146430fwHIQ2;
        C1146530fwR c1146530fwR = (C1146530fwR) obj;
        C1146430fwH c1146430fwH = (C1146430fwH) awS114S0400000_17.l0;
        C1146350fw9 c1146350fw9 = (C1146350fw9) awS114S0400000_17.l1;
        if (c1146350fw9.LLJJIJI) {
            GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel = (GiftAnchorPanelGiftPageCenterViewModel) awS114S0400000_17.l2;
            C1146350fw9 c1146350fw9LIZ = C1146350fw9.LIZ(c1146350fw9, C1146470fwL.LIZ);
            EnumC1146490fwN enumC1146490fwN = EnumC1146490fwN.SELECT;
            giftAnchorPanelGiftPageCenterViewModel.getClass();
            c1146430fwHIQ2 = GiftAnchorPanelGiftPageCenterViewModel.HQ2(c1146430fwH, c1146350fw9LIZ, enumC1146490fwN);
        } else {
            GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel2 = (GiftAnchorPanelGiftPageCenterViewModel) awS114S0400000_17.l2;
            C1146350fw9 c1146350fw9LIZ2 = C1146350fw9.LIZ(c1146350fw9, C1146470fwL.LIZ);
            EnumC1146490fwN enumC1146490fwN2 = EnumC1146490fwN.SELECT;
            giftAnchorPanelGiftPageCenterViewModel2.getClass();
            c1146430fwHIQ2 = GiftAnchorPanelGiftPageCenterViewModel.IQ2(c1146430fwH, c1146350fw9LIZ2, enumC1146490fwN2);
        }
        C1146350fw9 c1146350fw92 = (C1146350fw9) awS114S0400000_17.l3;
        if (c1146350fw92 != null) {
            if (c1146350fw92.LLJJIJI) {
                GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel3 = (GiftAnchorPanelGiftPageCenterViewModel) awS114S0400000_17.l2;
                C1146350fw9 c1146350fw9LIZ3 = C1146350fw9.LIZ(c1146350fw92, C1146460fwK.LIZ);
                EnumC1146490fwN enumC1146490fwN3 = EnumC1146490fwN.SELECT;
                giftAnchorPanelGiftPageCenterViewModel3.getClass();
                c1146430fwHIQ2 = GiftAnchorPanelGiftPageCenterViewModel.HQ2(c1146430fwHIQ2, c1146350fw9LIZ3, enumC1146490fwN3);
            } else {
                GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel4 = (GiftAnchorPanelGiftPageCenterViewModel) awS114S0400000_17.l2;
                C1146350fw9 c1146350fw9LIZ4 = C1146350fw9.LIZ(c1146350fw92, C1146460fwK.LIZ);
                EnumC1146490fwN enumC1146490fwN4 = EnumC1146490fwN.SELECT;
                giftAnchorPanelGiftPageCenterViewModel4.getClass();
                c1146430fwHIQ2 = GiftAnchorPanelGiftPageCenterViewModel.IQ2(c1146430fwHIQ2, c1146350fw9LIZ4, enumC1146490fwN4);
            }
        }
        return C1146530fwR.LIZ(c1146530fwR, null, c1146430fwHIQ2, false, 13);
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS114S0400000_17 awS114S0400000_17, Object obj) {
        DataChannel dataChannel;
        long id;
        Long lValueOf;
        long id2;
        long j;
        C118300cf c118300cf = (C118300cf) awS114S0400000_17.l0;
        int i = c118300cf.element;
        if (i <= 0) {
            c118300cf.element = i + 1;
            if (CustomPollCardWidget.B1(((CustomPollCardWidget) awS114S0400000_17.l1).dataChannel)) {
                Long lLIZIZ = C0JGR.A2.LIZIZ();
                PollMessage pollMessage = ((C01C1) awS114S0400000_17.l2).LJFF;
                if (pollMessage != null) {
                    j = pollMessage.pollId;
                } else {
                    User userLIZIZ = C0KXJ.LIZIZ();
                    if (userLIZIZ != null) {
                        id2 = userLIZIZ.getId();
                    } else {
                        id2 = 0;
                    }
                    j = id2 + 0;
                }
                if (!Intrinsics.LJFF(lLIZIZ, Long.valueOf(j))) {
                    C1086960eOM c1086960eOM = C1086960eOM.LL;
                    long id3 = ((Room) awS114S0400000_17.l3).getId();
                    c1086960eOM.getClass();
                    if (C1086960eOM.LJIIIIZZ(id3)) {
                        LIZ$0((C01C1) awS114S0400000_17.l2, (CustomPollCardWidget) awS114S0400000_17.l1);
                    } else {
                        DataChannel dataChannel2 = ((CustomPollCardWidget) awS114S0400000_17.l1).dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.FQ2(ShowCustomPollToolBarAlert.class);
                        }
                    }
                }
            } else {
                C1086960eOM c1086960eOM2 = C1086960eOM.LL;
                long id4 = ((Room) awS114S0400000_17.l3).getId();
                c1086960eOM2.getClass();
                if (C1086960eOM.LJIIIIZZ(id4)) {
                    LIZ$0((C01C1) awS114S0400000_17.l2, (CustomPollCardWidget) awS114S0400000_17.l1);
                } else if (!((C01C1) awS114S0400000_17.l2).LIZLLL && (dataChannel = ((CustomPollCardWidget) awS114S0400000_17.l1).dataChannel) != null) {
                    dataChannel.FQ2(ShowCustomPollToolBarAlert.class);
                }
            }
            C20337914i1<Long> c20337914i1 = C0JGR.A2;
            PollMessage pollMessage2 = ((C01C1) awS114S0400000_17.l2).LJFF;
            if (pollMessage2 != null) {
                lValueOf = Long.valueOf(pollMessage2.pollId);
            } else {
                User userLIZIZ2 = C0KXJ.LIZIZ();
                if (userLIZIZ2 != null) {
                    id = userLIZIZ2.getId();
                } else {
                    id = 0;
                }
                lValueOf = Long.valueOf(id + 0);
            }
            c20337914i1.LJFF(lValueOf);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS114S0400000_17 r3, java.lang.Object r4) {
        /*
            X.0fP3 r4 = (X.C1125830fP3) r4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "listenProgressChange "
            r1.append(r0)
            X.0fP6 r0 = r4.LIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveGoalUtils"
            X.C20441214yg.LJIIIZ(r0, r1)
            java.lang.Object r1 = r3.l0
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L41
            java.util.concurrent.CopyOnWriteArrayList<X.0fP4> r0 = X.C1125820fP2.LIZ
            long r0 = r1.longValue()
            X.0fPC r4 = X.C1125820fP2.LJ(r0, r4)
            if (r4 == 0) goto L41
            java.lang.Object r3 = r3.l1
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            long r0 = r4.LIZIZ
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r4.LIZJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.invoke(r2, r0)
        L3e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Object r0 = r3.l2
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            r1.zQ2(r0)
            java.lang.Object r0 = r3.l3
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS114S0400000_17.invoke$9(kotlin.jvm.internal.AwS114S0400000_17, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS114S0400000_17(com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r3, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r4, X.C013C r5, X.C259800zU r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                case 1: goto L5;
                case 2: goto L13;
                case 3: goto L13;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.l2 = r3
            r1.l3 = r4
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS114S0400000_17.<init>(com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel, X.013C, X.00zU, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0400000_17(C118300cf c118300cf, CustomPollCardWidget customPollCardWidget, C01C1 c01c1, Room room, int i) {
        super(1);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = customPollCardWidget;
        this.l2 = c01c1;
        this.l3 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0400000_17(C1146430fwH c1146430fwH, C1146350fw9 c1146350fw9, GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, C1146350fw9 c1146350fw92, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1146430fwH;
        this.l1 = c1146350fw9;
        this.l2 = giftAnchorPanelGiftPageCenterViewModel;
        this.l3 = c1146350fw92;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0400000_17(Fragment fragment, Long l, AwS561S0100000_17 awS561S0100000_17, AwS631S0100000_17 awS631S0100000_17, int i) {
        super(1);
        this.$t = i;
        this.l0 = l;
        this.l1 = awS631S0100000_17;
        this.l2 = fragment;
        this.l3 = awS561S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0400000_17(LocalCurrencyGiftInfo localCurrencyGiftInfo, AbstractC1126600fQI abstractC1126600fQI, C1129700fVI c1129700fVI, AwS596S0100000_17 awS596S0100000_17, int i) {
        super(1);
        this.$t = i;
        this.l0 = localCurrencyGiftInfo;
        this.l1 = abstractC1126600fQI;
        this.l2 = c1129700fVI;
        this.l3 = awS596S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0400000_17(AwS37S0310000_17 awS37S0310000_17, C1136320ffy c1136320ffy, InterfaceC1135310feL interfaceC1135310feL, C1135920ffK c1135920ffK, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS37S0310000_17;
        this.l1 = c1136320ffy;
        this.l2 = interfaceC1135310feL;
        this.l3 = c1135920ffK;
    }
}
