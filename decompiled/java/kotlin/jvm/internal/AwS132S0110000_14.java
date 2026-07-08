package kotlin.jvm.internal;

import X.AbstractC880120Yfq;
import X.C09AY;
import X.C0Z28;
import X.C0Z9P;
import X.C13BV;
import X.C1440005kM;
import X.C1619106Vp;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C309160C9y;
import X.C866530Xz1;
import X.C879180YeK;
import X.C882770Yk7;
import X.C882780Yk8;
import X.C884130YmJ;
import X.C884270YmX;
import X.C884730YnH;
import X.C914150Ztd;
import X.EnumC879080YeA;
import X.InterfaceC879010Ye3;
import X.InterfaceC882100Yj2;
import X.InterfaceC884050YmB;
import X.InterfaceC885460YoS;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestNavBarAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS132S0110000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS132S0110000_14 awS132S0110000_14) {
        InterfaceC885460YoS interfaceC885460YoS = ((MessageRequestPageVM) awS132S0110000_14.l0).LL;
        if (interfaceC885460YoS != null) {
            interfaceC885460YoS.z4();
        }
        ((MessageRequestPageVM) awS132S0110000_14.l0).setState(new AwS29S0010000_14(awS132S0110000_14.z1, 6));
        C1440005kM.LIZ(new C884130YmJ());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS132S0110000_14 awS132S0110000_14) {
        InterfaceC885460YoS interfaceC885460YoS = ((MessageRequestPageVM) awS132S0110000_14.l0).LL;
        if (interfaceC885460YoS != null) {
            interfaceC885460YoS.Ka(C20642515q3.LJI(2131846486));
        }
        ((MessageRequestPageVM) awS132S0110000_14.l0).setState(new AwS29S0010000_14(awS132S0110000_14.z1, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS132S0110000_14 awS132S0110000_14) {
        if (awS132S0110000_14.z1) {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                return iChatCustomizeHelperLIZ.getNewLabelImageView((C19EG) awS132S0110000_14.l0);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS132S0110000_14 r21) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS132S0110000_14.invoke$11(kotlin.jvm.internal.AwS132S0110000_14):java.lang.Object");
    }

    public static final Object invoke$2(AwS132S0110000_14 awS132S0110000_14) {
        ((MessageRequestRootPageVM) awS132S0110000_14.l0).setState(new AwS29S0010000_14(awS132S0110000_14.z1, 8));
        C1440005kM.LIZ(new C884130YmJ());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS132S0110000_14 awS132S0110000_14) {
        ((MessageRequestRootPageVM) awS132S0110000_14.l0).setState(new AwS29S0010000_14(awS132S0110000_14.z1, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS132S0110000_14 awS132S0110000_14) {
        List<InterfaceC882100Yj2> list;
        List<InterfaceC882100Yj2> list2;
        if (awS132S0110000_14.z1) {
            C884270YmX c884270YmX = (C884270YmX) awS132S0110000_14.l0;
            C884730YnH c884730YnH = c884270YmX.LJIIL;
            if (c884730YnH != null && (list2 = c884730YnH.LIZJ) != null) {
                for (InterfaceC882100Yj2 interfaceC882100Yj2 : list2) {
                    InterfaceC879010Ye3 key = c884270YmX.LIZ.getKey();
                    C13BV c13bv = C13BV.INSTANCE;
                    c884270YmX.LIZ.LIZLLL().getSecond();
                    interfaceC882100Yj2.LJIIL(key, c13bv);
                }
            }
            C884270YmX c884270YmX2 = (C884270YmX) awS132S0110000_14.l0;
            C884730YnH c884730YnH2 = c884270YmX2.LJIIL;
            if (c884730YnH2 != null && (list = c884730YnH2.LIZLLL) != null) {
                Iterator<InterfaceC882100Yj2> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIJI(c884270YmX2.LIZ.getKey(), C13BV.INSTANCE, "empty_notify", true);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyChatListDataUpdate empty, page=");
        sbLIZ.append(((C884270YmX) awS132S0110000_14.l0).LIZ.getKey());
        sbLIZ.append(", source=empty_notify");
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        List<InterfaceC884050YmB> listLJI = ((C884270YmX) awS132S0110000_14.l0).LJI();
        C884270YmX c884270YmX3 = (C884270YmX) awS132S0110000_14.l0;
        Iterator<InterfaceC884050YmB> it3 = listLJI.iterator();
        while (it3.hasNext()) {
            it3.next().LIZJ(c884270YmX3, C13BV.INSTANCE, false, "empty_notify");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS132S0110000_14 awS132S0110000_14) {
        if (awS132S0110000_14.z1) {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                return iChatCustomizeHelperLIZ.getNewLabelImageView((C19EG) awS132S0110000_14.l0);
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$6(AwS132S0110000_14 awS132S0110000_14) {
        EnumC879080YeA enumC879080YeA;
        List<? extends EnumC879080YeA> listSingletonList;
        Boolean bool;
        String str;
        C866530Xz1 c866530Xz1 = ((C882770Yk7) awS132S0110000_14.l0).LLILZLL;
        if (awS132S0110000_14.z1) {
            enumC879080YeA = EnumC879080YeA.SPAM;
        } else {
            enumC879080YeA = EnumC879080YeA.SECONDARY;
        }
        List<? extends EnumC879080YeA> listSingletonList2 = Collections.singletonList(enumC879080YeA);
        if (awS132S0110000_14.z1) {
            listSingletonList = C13BV.INSTANCE;
        } else {
            listSingletonList = Collections.singletonList(EnumC879080YeA.PRIMARY);
        }
        if (awS132S0110000_14.z1) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        c866530Xz1.LIZIZ(listSingletonList2, listSingletonList, bool, new C914150Ztd((C882770Yk7) awS132S0110000_14.l0, 8));
        if (awS132S0110000_14.z1) {
            str = "spam";
        } else {
            str = "secondary";
        }
        AbstractC880120Yfq.LJFF((C882770Yk7) awS132S0110000_14.l0, str, "single_undo", null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS132S0110000_14 awS132S0110000_14) {
        EnumC879080YeA enumC879080YeA;
        List<? extends EnumC879080YeA> listSingletonList;
        Boolean bool;
        String str;
        C866530Xz1 c866530Xz1 = ((C882780Yk8) awS132S0110000_14.l0).LLILZLL;
        if (awS132S0110000_14.z1) {
            enumC879080YeA = EnumC879080YeA.SPAM;
        } else {
            enumC879080YeA = EnumC879080YeA.PRIMARY;
        }
        List<? extends EnumC879080YeA> listSingletonList2 = Collections.singletonList(enumC879080YeA);
        if (awS132S0110000_14.z1) {
            listSingletonList = C13BV.INSTANCE;
        } else {
            listSingletonList = Collections.singletonList(EnumC879080YeA.SECONDARY);
        }
        if (awS132S0110000_14.z1) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        c866530Xz1.LIZIZ(listSingletonList2, listSingletonList, bool, new C914150Ztd((C882780Yk8) awS132S0110000_14.l0, 9));
        if (awS132S0110000_14.z1) {
            str = "spam";
        } else {
            str = "primary";
        }
        AbstractC880120Yfq.LJFF((C882780Yk8) awS132S0110000_14.l0, str, "single_undo", null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS132S0110000_14 awS132S0110000_14) {
        C0Z9P c0z9p = C0Z9P.LL;
        C879180YeK c879180YeK = (C879180YeK) awS132S0110000_14.l0;
        boolean z = awS132S0110000_14.z1;
        c0z9p.getClass();
        C0Z9P.LJJ(c879180YeK, z);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS132S0110000_14 awS132S0110000_14) {
        boolean z;
        if (!awS132S0110000_14.z1 && ((C0Z28) awS132S0110000_14.l0).LLIZLLLIL.invoke().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(C879180YeK c879180YeK, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c879180YeK;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(C882770Yk7 c882770Yk7, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c882770Yk7;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(C882780Yk8 c882780Yk8, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c882780Yk8;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(C19EG c19eg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(MessageRequestNavBarAssem messageRequestNavBarAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = messageRequestNavBarAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(MessageRequestPageVM messageRequestPageVM, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = messageRequestPageVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(MessageRequestRootPageVM messageRequestRootPageVM, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = messageRequestRootPageVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(boolean z, C884270YmX c884270YmX, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c884270YmX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0110000_14(boolean z, C0Z28 c0z28, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c0z28;
    }
}
