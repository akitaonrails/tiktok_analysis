package kotlin.jvm.internal;

import X.AbstractC21154817qU;
import X.AbstractC21332518e3;
import X.AbstractRunnableC21164217s0;
import X.C09AY;
import X.C0NOE;
import X.C2097608Jq;
import X.C21172017tG;
import X.C212203182n;
import X.C21285518Rp;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C786410Ut5;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS169S0101000_32 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS169S0101000_32 awS169S0101000_32) {
        C212203182n c212203182n = (C212203182n) awS169S0101000_32.l0;
        int i = awS169S0101000_32.i1;
        if (i != c212203182n.LLJILLL) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ignore stale lynx onShow callback, generation=");
            sbLIZ.append(i);
            sbLIZ.append(", current=");
            sbLIZ.append(c212203182n.LLJILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
        } else {
            c212203182n.LLJJ = true;
            if (c212203182n.LLJJI && !c212203182n.LLJJIII) {
                c212203182n.LJIILL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setHeight(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS169S0101000_32 awS169S0101000_32) {
        ((C21285518Rp) awS169S0101000_32.l0).setPanelItemHeight(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS169S0101000_32 awS169S0101000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble show[");
        sbLIZ.append(((AbstractC21154817qU) awS169S0101000_32.l0).LLJIJIL);
        sbLIZ.append("]: (index: ");
        sbLIZ.append(awS169S0101000_32.i1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS169S0101000_32 awS169S0101000_32) {
        AbstractC21154817qU abstractC21154817qU = (AbstractC21154817qU) awS169S0101000_32.l0;
        if (!abstractC21154817qU.LLILLL.LJIILJJIL) {
            abstractC21154817qU.LLIZ = true;
            ((AbstractC21154817qU) awS169S0101000_32.l0).LJIJ(awS169S0101000_32.i1, true, null);
        } else {
            abstractC21154817qU.LLIZ = false;
            C786410Ut5.g2(((AbstractC21154817qU) awS169S0101000_32.l0).Y4(), 8);
        }
        AbstractC21154817qU abstractC21154817qU2 = (AbstractC21154817qU) awS169S0101000_32.l0;
        C0NOE.LIZIZ(abstractC21154817qU2.LL.LIZ, "ec_mix_mall_bubble_shown", C2097608Jq.LJIIJ(new Pair("bubble_id", abstractC21154817qU2.LLJIJIL)), false);
        ((AbstractC21154817qU) awS169S0101000_32.l0).LJIJI(null, "show", null, null, true);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS169S0101000_32 awS169S0101000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getChildAt(");
        sbLIZ.append(awS169S0101000_32.i1);
        sbLIZ.append("), childCount == ");
        sbLIZ.append(((AbstractC21332518e3) awS169S0101000_32.l0).LJZL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS169S0101000_32 awS169S0101000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bucket ");
        sbLIZ.append(awS169S0101000_32.i1);
        sbLIZ.append(" is not running and receive a head task, execute ");
        sbLIZ.append(((C21172017tG) awS169S0101000_32.l0).LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS169S0101000_32 awS169S0101000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skip non-head task ");
        sbLIZ.append((AbstractRunnableC21164217s0) awS169S0101000_32.l0);
        sbLIZ.append(", last execution one is ");
        sbLIZ.append(awS169S0101000_32.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS169S0101000_32 awS169S0101000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Find head task ");
        sbLIZ.append((AbstractRunnableC21164217s0) awS169S0101000_32.l0);
        sbLIZ.append(" next to ");
        sbLIZ.append(awS169S0101000_32.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$17(AwS169S0101000_32 awS169S0101000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skip non-head task ");
        sbLIZ.append((AbstractRunnableC21164217s0) awS169S0101000_32.l0);
        sbLIZ.append(", last execution one is ");
        sbLIZ.append(awS169S0101000_32.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setLines(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setMaxHeight(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setMaxLines(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setMaxWidth(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setMinHeight(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setMinWidth(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS169S0101000_32 awS169S0101000_32) {
        super/*android.widget.TextView*/.setWidth(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS169S0101000_32 awS169S0101000_32) {
        ((C21285518Rp) awS169S0101000_32.l0).setButtonVisibility(awS169S0101000_32.i1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0101000_32(int i, C21172017tG c21172017tG, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c21172017tG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS169S0101000_32(int i, int i2, AbstractC21332518e3<VTYPE> abstractC21332518e3) {
        super(0);
        this.$t = abstractC21332518e3;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0101000_32(AbstractC21154817qU abstractC21154817qU, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC21154817qU;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0101000_32(AbstractRunnableC21164217s0 abstractRunnableC21164217s0, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractRunnableC21164217s0;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0101000_32(C212203182n c212203182n, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c212203182n;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0101000_32(C21285518Rp c21285518Rp, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c21285518Rp;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0101000_32(SimpleLiveTextView simpleLiveTextView, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = simpleLiveTextView;
        this.i1 = i;
    }
}
