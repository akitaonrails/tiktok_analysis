package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.AbstractC1689250u3n;
import X.C09AY;
import X.C13YG;
import X.C13YI;
import X.C1640050smR;
import X.C1654150t9B;
import X.C1654180t9E;
import X.C1671550tbF;
import X.C1672120tcA;
import X.C1676510tjF;
import X.C1677710tlB;
import X.C1681200tqo;
import X.C1689240u3m;
import X.C1689410u43;
import X.C1690050u55;
import X.C375830EoP;
import X.C418740GbQ;
import X.EnumC1653870t8j;
import X.EnumC1653890t8l;
import X.InterfaceC1456870o0z;
import X.InterfaceC1564790qp3;
import X.InterfaceC1690400u5e;
import android.content.Context;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel;
import com.ss.android.ugc.aweme.social.creation.edit.uiviewmodel.EditUILayerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS131S0101000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        List<AbstractC1686530tzP> list = (List) awS131S0101000_25.l0;
        int i = awS131S0101000_25.i1;
        int i2 = 0;
        for (AbstractC1686530tzP abstractC1686530tzP : list) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, abstractC1686530tzP, i2, 0);
            i2 += abstractC1686530tzP.LL + i;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        int i = awS131S0101000_25.i1;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS131S0101000_25.l0;
        AbstractC1683310tuD.LJFF((AbstractC1683310tuD) obj, abstractC1686530tzP, 0, (i - abstractC1686530tzP.LLILLJJLI) / 2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(super/*X.19ry*/.getItemViewType(awS131S0101000_25.i1));
    }

    public static final Object invoke$11(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        Function1<Object, Unit> function1LJ;
        InterfaceC1564790qp3 interfaceC1564790qp3 = (InterfaceC1564790qp3) obj;
        InterfaceC1690400u5e interfaceC1690400u5e = ((C1690050u55) awS131S0101000_25.l0).LIZ;
        int i = awS131S0101000_25.i1;
        C13YG c13ygLIZ = C13YI.LIZ();
        if (c13ygLIZ != null) {
            function1LJ = c13ygLIZ.LJ();
        } else {
            function1LJ = null;
        }
        C13YI.LJ(c13ygLIZ, C13YI.LIZIZ(c13ygLIZ), function1LJ);
        interfaceC1690400u5e.LIZ(interfaceC1564790qp3, i);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        return Boolean.valueOf(((C1681200tqo) awS131S0101000_25.l0).LJIIL(awS131S0101000_25.i1, ((Number) obj).longValue()));
    }

    public static final Object invoke$13(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        return Boolean.valueOf(((C1681200tqo) awS131S0101000_25.l0).LJIIL(awS131S0101000_25.i1, ((Number) obj).longValue()));
    }

    public static final Object invoke$2(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        Context context = (Context) obj;
        C418740GbQ c418740GbQ = new C418740GbQ(context, null);
        int i = awS131S0101000_25.i1;
        EditUILayerViewModel editUILayerViewModel = (EditUILayerViewModel) awS131S0101000_25.l0;
        c418740GbQ.setImageResource(i);
        c418740GbQ.setContentDescription(context.getString(2131823350));
        c418740GbQ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        InterfaceC1456870o0z interfaceC1456870o0z = (InterfaceC1456870o0z) editUILayerViewModel.LLILZLL.getValue(editUILayerViewModel, EditUILayerViewModel.LLJ[0]);
        if (interfaceC1456870o0z != null) {
            interfaceC1456870o0z.qK2(c418740GbQ);
        }
        return c418740GbQ;
    }

    public static final Object invoke$3(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        String strValueOf;
        ImNotificationViewModel imNotificationViewModel = (ImNotificationViewModel) awS131S0101000_25.l0;
        int i = awS131S0101000_25.i1;
        List<AbstractC1689250u3n> list = ((C1689240u3m) obj).LL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1689250u3n abstractC1689250u3n : list) {
            if (abstractC1689250u3n instanceof C1689410u43) {
                C1689410u43 c1689410u43 = (C1689410u43) abstractC1689250u3n;
                if (Intrinsics.LJFF(c1689410u43.LIZJ, "im_notification_permissions")) {
                    if (i <= 0) {
                        strValueOf = "";
                    } else {
                        strValueOf = String.valueOf(i);
                    }
                    arrayList.add(C1689410u43.LJII(c1689410u43, false, strValueOf, 63));
                }
            }
            imNotificationViewModel.getClass();
            arrayList.add(ImNotificationViewModel.zQ2(arrayList, abstractC1689250u3n));
        }
        return new C1689240u3m(arrayList);
    }

    public static final Object invoke$4(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        C375830EoP c375830EoP = new C375830EoP(new Pair((EnumC1653870t8j) awS131S0101000_25.l0, Integer.valueOf(awS131S0101000_25.i1)));
        obj.getClass();
        return new C1654180t9E(c375830EoP);
    }

    public static final Object invoke$5(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        C1654150t9B c1654150t9B = (C1654150t9B) obj;
        C375830EoP c375830EoP = new C375830EoP(new Pair((EnumC1653890t8l) awS131S0101000_25.l0, Integer.valueOf(awS131S0101000_25.i1)));
        C375830EoP<Pair<Integer, Integer>> c375830EoP2 = c1654150t9B.LIZIZ;
        c1654150t9B.getClass();
        return new C1654150t9B(c375830EoP, c375830EoP2);
    }

    public static final Object invoke$6(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        return new C1672120tcA(C1676510tjF.LJIILL(C1671550tbF.LIZLLL(680, 0, (C1677710tlB) awS131S0101000_25.l0, 2), new AwS17S0001000_2(awS131S0101000_25.i1, 10)).LIZIZ(C1676510tjF.LJ(0.0f, C1671550tbF.LIZLLL(680, 0, (C1677710tlB) awS131S0101000_25.l0, 2))), C1676510tjF.LJIJ(C1671550tbF.LIZLLL(680, 0, (C1677710tlB) awS131S0101000_25.l0, 2), new AwS17S0001000_2(awS131S0101000_25.i1, 11)).LIZIZ(C1676510tjF.LJI(0.0f, C1671550tbF.LIZLLL(680, 0, (C1677710tlB) awS131S0101000_25.l0, 2))));
    }

    public static final Object invoke$7(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int i = 0;
        for (AbstractC1686530tzP abstractC1686530tzP : (List) awS131S0101000_25.l0) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, abstractC1686530tzP, awS131S0101000_25.i1 - abstractC1686530tzP.LL, i);
            i += abstractC1686530tzP.LLILLJJLI;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        Function1 function1 = (Function1) awS131S0101000_25.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(awS131S0101000_25.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS131S0101000_25 awS131S0101000_25, Object obj) {
        ((AbstractC1683310tuD) obj).LIZLLL((AbstractC1686530tzP) awS131S0101000_25.l0, 0, -awS131S0101000_25.i1, 0.0f);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS131S0101000_25(int r3, X.AbstractC1686530tzP r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS131S0101000_25.<init>(int, X.0tzP, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(int i, EditUILayerViewModel editUILayerViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = editUILayerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(int i, Function1 function1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(C1640050smR c1640050smR, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1640050smR;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(EnumC1653870t8j enumC1653870t8j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC1653870t8j;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(EnumC1653890t8l enumC1653890t8l, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC1653890t8l;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(C1677710tlB c1677710tlB, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1677710tlB;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(C1681200tqo c1681200tqo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1681200tqo;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(C1690050u55 c1690050u55, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1690050u55;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0101000_25(ImNotificationViewModel imNotificationViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = imNotificationViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S0101000_25(List list, List<? extends AbstractC1686530tzP> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
