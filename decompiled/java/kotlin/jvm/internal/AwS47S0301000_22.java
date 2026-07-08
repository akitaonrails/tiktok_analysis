package kotlin.jvm.internal;

import X.C09AY;
import X.C0ET4;
import X.C13LQ;
import X.C1419580n2q;
import X.C1419590n2r;
import X.C1422180n72;
import X.C1427030nEr;
import X.C1427080nEw;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1460750o7F;
import X.C1DRG;
import X.C559610Lx9;
import X.EnumC1642750sqn;
import X.InterfaceC1422310n7F;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public class AwS47S0301000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS47S0301000_22 awS47S0301000_22, Object obj) {
        String str;
        boolean z;
        IntRange intRange = (IntRange) obj;
        InterfaceC1631630sYr<EffectModel, Integer, String, Boolean, Unit> interfaceC1631630sYr = ((C1427030nEr) awS47S0301000_22.l0).LLLLIL().LJ;
        EffectModel effectModel = (EffectModel) awS47S0301000_22.l1;
        Integer numValueOf = Integer.valueOf(awS47S0301000_22.i3);
        C1427080nEw c1427080nEw = (C1427080nEw) awS47S0301000_22.l2;
        if (c1427080nEw != null) {
            str = c1427080nEw.LIZLLL;
        } else {
            str = null;
        }
        if (intRange != null && intRange.LJLJL(((EffectModel) awS47S0301000_22.l1).index)) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1631630sYr.invoke(effectModel, numValueOf, str, Boolean.valueOf(z));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S0301000_22 awS47S0301000_22, Object obj) {
        String str;
        boolean z;
        IntRange intRange = (IntRange) obj;
        InterfaceC1685420txc<EffectModel, Integer, String, Boolean, Function0<Unit>, Unit> interfaceC1685420txc = ((C1427030nEr) awS47S0301000_22.l0).LLLLIL().LIZLLL;
        EffectModel effectModel = (EffectModel) awS47S0301000_22.l1;
        Integer numValueOf = Integer.valueOf(awS47S0301000_22.i3);
        C1427080nEw c1427080nEw = (C1427080nEw) awS47S0301000_22.l2;
        if (c1427080nEw != null) {
            str = c1427080nEw.LIZLLL;
        } else {
            str = null;
        }
        if (intRange != null && intRange.LJLJL(((EffectModel) awS47S0301000_22.l1).index)) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1685420txc.invoke(effectModel, numValueOf, str, Boolean.valueOf(z), new AwS161S0101000_22((C1427030nEr) awS47S0301000_22.l0, awS47S0301000_22.i3, 1));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS47S0301000_22 awS47S0301000_22, Object obj) {
        boolean z;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1455260nyO c1455260nyO = (C1455260nyO) awS47S0301000_22.l1;
        int i = awS47S0301000_22.i3;
        if (((EnumC1642750sqn) awS47S0301000_22.l2) != EnumC1642750sqn.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        C1460750o7F c1460750o7F = new C1460750o7F(c1drg, c1455260nyO, i, z, c1455260nyO.w);
        ((C559610Lx9) awS47S0301000_22.l0).getClass();
        C559610Lx9.LIZ(c1460750o7F);
        c1460750o7F.afterInit$als_release(jUptimeMillis);
        return c1460750o7F;
    }

    public static final Object invoke$3(AwS47S0301000_22 awS47S0301000_22, Object obj) {
        ((TextStickerModel) awS47S0301000_22.l0).setTextStrWithLineBreak(C13LQ.LJJJ(((TextStickerTextWrap) obj).getStickerStringArray(), "\n", null, null, AFwS273S0000000_29.get$arr$(345), 30));
        if (awS47S0301000_22.i3 == ((List) awS47S0301000_22.l1).size() - 1) {
            ((Function0) awS47S0301000_22.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS47S0301000_22 awS47S0301000_22, Object obj) {
        boolean z;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1455250nyN c1455250nyN = (C1455250nyN) awS47S0301000_22.l1;
        int i = awS47S0301000_22.i3;
        if (((EnumC1642750sqn) awS47S0301000_22.l2) != EnumC1642750sqn.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        C1460750o7F c1460750o7F = new C1460750o7F(c1drg, c1455250nyN, i, z, c1455250nyN.LLLLLLLLL);
        ((C559610Lx9) awS47S0301000_22.l0).getClass();
        C559610Lx9.LIZ(c1460750o7F);
        c1460750o7F.afterInit$als_release(jUptimeMillis);
        return c1460750o7F;
    }

    public static final Object invoke$5(AwS47S0301000_22 awS47S0301000_22, Object obj) {
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        int i = awS47S0301000_22.i3;
        C1419590n2r c1419590n2r = (C1419590n2r) awS47S0301000_22.l0;
        TemplateCategoryData templateCategoryData = (TemplateCategoryData) awS47S0301000_22.l1;
        InterfaceC1422310n7F interfaceC1422310n7F = ((C1422180n72) awS47S0301000_22.l2).LIZJ;
        c1419580n2q.getClass();
        C1419580n2q.LJIILIIL((ShortVideoContext) obj, "mv_shoot_page", i, c1419590n2r, templateCategoryData, false, interfaceC1422310n7F);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0301000_22(int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, C1422180n72 c1422180n72, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = c1419590n2r;
        this.l1 = templateCategoryData;
        this.l2 = c1422180n72;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0301000_22(C1427030nEr c1427030nEr, EffectModel effectModel, int i, C1427080nEw c1427080nEw, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1427030nEr;
        this.l1 = effectModel;
        this.i3 = i;
        this.l2 = c1427080nEw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0301000_22(TextStickerModel textStickerModel, int i, List list, AwS566S0100000_22 awS566S0100000_22, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = textStickerModel;
        this.i3 = i;
        this.l1 = list;
        this.l2 = awS566S0100000_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0301000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, C1455250nyN c1455250nyN, int i, EnumC1642750sqn enumC1642750sqn, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c1455250nyN;
        this.i3 = i;
        this.l2 = enumC1642750sqn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0301000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, C1455260nyO c1455260nyO, int i, EnumC1642750sqn enumC1642750sqn, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c1455260nyO;
        this.i3 = i;
        this.l2 = enumC1642750sqn;
    }
}
