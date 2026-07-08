package kotlin.jvm.internal;

import X.C03HR;
import X.C09AY;
import X.C1019103yf;
import X.C2188811AlT;
import X.C259800zU;
import X.C430110Gtl;
import X.C786410Ut5;
import X.EnumC1014603xw;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S1501000_1 extends C09AY implements Function0 {
    public final int $t;
    public int i6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS1S1501000_1 awS1S1501000_1) {
        try {
            PlatformDiscountsCell platformDiscountsCell = (PlatformDiscountsCell) awS1S1501000_1.l1;
            TuxTextView tuxTextView = (TuxTextView) awS1S1501000_1.l2;
            int i = awS1S1501000_1.i6;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l3).element;
            String str = awS1S1501000_1.s0;
            platformDiscountsCell.getClass();
            Pair pairS5 = PlatformDiscountsCell.S5(tuxTextView, i, spannableStringBuilder, str);
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) pairS5.getFirst();
            if (((Boolean) pairS5.getSecond()).booleanValue()) {
                TuxTextView tuxTextView2 = (TuxTextView) awS1S1501000_1.l2;
                ((PlatformDiscountsCell) awS1S1501000_1.l1).L5(((View) awS1S1501000_1.l4).getContext(), spannableStringBuilder2, true, awS1S1501000_1.s0, ((PromotionCouponModule) awS1S1501000_1.l5).tcSchema);
                tuxTextView2.setText(spannableStringBuilder2);
            } else {
                ((TuxTextView) awS1S1501000_1.l2).setText(spannableStringBuilder2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((TuxTextView) awS1S1501000_1.l2).setText((CharSequence) ((C259800zU) awS1S1501000_1.l3).element);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v24, types: [T, android.text.SpannableStringBuilder] */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS1S1501000_1 awS1S1501000_1) {
        String str = awS1S1501000_1.s0;
        if (str != null && !a0.LJJJIL(str)) {
            try {
                if (((TuxTextView) awS1S1501000_1.l1).getLayout().getLineCount() > awS1S1501000_1.i6) {
                    int lineEnd = ((TuxTextView) awS1S1501000_1.l1).getLayout().getLineEnd(awS1S1501000_1.i6 - 1);
                    if (((Boolean) C03HR.LIZ.getValue()).booleanValue() && lineEnd > ((SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element).length()) {
                        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR107;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("textViewText = ");
                        sbLIZ.append((Object) ((TuxTextView) awS1S1501000_1.l1).getText());
                        sbLIZ.append(", ssb = ");
                        sbLIZ.append(((C259800zU) awS1S1501000_1.l2).element);
                        sbLIZ.append(", lineCount = ");
                        sbLIZ.append(((TuxTextView) awS1S1501000_1.l1).getLayout().getLineCount());
                        sbLIZ.append(", lineEndIndex = ");
                        sbLIZ.append(lineEnd);
                        sbLIZ.append(", defaultMaxLine = ");
                        sbLIZ.append(awS1S1501000_1.i6);
                        C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
                        lineEnd = ((SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element).length();
                    }
                    ((C259800zU) awS1S1501000_1.l2).element = new SpannableStringBuilder(((SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element).subSequence(0, lineEnd));
                    ((TuxTextView) awS1S1501000_1.l1).setText((CharSequence) ((C259800zU) awS1S1501000_1.l2).element);
                    TuxTextView tuxTextView = (TuxTextView) awS1S1501000_1.l1;
                    PlatformDiscountsCell platformDiscountsCell = (PlatformDiscountsCell) awS1S1501000_1.l3;
                    C430110Gtl.LIZIZ(tuxTextView, new AwS1S1501000_1(awS1S1501000_1.i6, (View) awS1S1501000_1.l4, tuxTextView, platformDiscountsCell, (PromotionCouponModule) awS1S1501000_1.l5, awS1S1501000_1.s0, (C259800zU) awS1S1501000_1.l2, 0));
                } else if (((TuxTextView) awS1S1501000_1.l1).getLayout().getLineCount() == awS1S1501000_1.i6) {
                    TextPaint paint = ((TuxTextView) awS1S1501000_1.l1).getPaint();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(' ');
                    sbLIZ2.append(awS1S1501000_1.s0);
                    float fMeasureText = paint.measureText(C2188811AlT.LIZIZ(sbLIZ2));
                    int lineEnd2 = ((TuxTextView) awS1S1501000_1.l1).getLayout().getLineEnd(awS1S1501000_1.i6 - 1);
                    float lineWidth = ((TuxTextView) awS1S1501000_1.l1).getLayout().getLineWidth(awS1S1501000_1.i6 - 1);
                    if (((Boolean) C03HR.LIZ.getValue()).booleanValue() && lineEnd2 > ((SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element).length()) {
                        EnumC1014603xw enumC1014603xw2 = EnumC1014603xw.ERR107;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("textViewText = ");
                        sbLIZ3.append((Object) ((TuxTextView) awS1S1501000_1.l1).getText());
                        sbLIZ3.append(", ssb = ");
                        sbLIZ3.append(((C259800zU) awS1S1501000_1.l2).element);
                        sbLIZ3.append(", lineCount = ");
                        sbLIZ3.append(((TuxTextView) awS1S1501000_1.l1).getLayout().getLineCount());
                        sbLIZ3.append(", lineEndIndex = ");
                        sbLIZ3.append(lineEnd2);
                        sbLIZ3.append(", defaultMaxLine = ");
                        sbLIZ3.append(awS1S1501000_1.i6);
                        C1019103yf.LIZ(enumC1014603xw2, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)), null);
                        lineEnd2 = ((SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element).length();
                    }
                    if (((TuxTextView) awS1S1501000_1.l1).getWidth() - lineWidth > fMeasureText) {
                        ((C259800zU) awS1S1501000_1.l2).element = new SpannableStringBuilder(((SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element).subSequence(0, lineEnd2));
                        TuxTextView tuxTextView2 = (TuxTextView) awS1S1501000_1.l1;
                        PlatformDiscountsCell platformDiscountsCell2 = (PlatformDiscountsCell) awS1S1501000_1.l3;
                        Context context = ((View) awS1S1501000_1.l4).getContext();
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element;
                        platformDiscountsCell2.L5(context, spannableStringBuilder, false, awS1S1501000_1.s0, ((PromotionCouponModule) awS1S1501000_1.l5).tcSchema);
                        tuxTextView2.setText(spannableStringBuilder);
                    } else {
                        PlatformDiscountsCell platformDiscountsCell3 = (PlatformDiscountsCell) awS1S1501000_1.l3;
                        TuxTextView tuxTextView3 = (TuxTextView) awS1S1501000_1.l1;
                        int i = awS1S1501000_1.i6;
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element;
                        String str2 = awS1S1501000_1.s0;
                        platformDiscountsCell3.getClass();
                        Pair pairS5 = PlatformDiscountsCell.S5(tuxTextView3, i, spannableStringBuilder2, str2);
                        SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) pairS5.getFirst();
                        if (((Boolean) pairS5.getSecond()).booleanValue()) {
                            TuxTextView tuxTextView4 = (TuxTextView) awS1S1501000_1.l1;
                            ((PlatformDiscountsCell) awS1S1501000_1.l3).L5(((View) awS1S1501000_1.l4).getContext(), spannableStringBuilder3, true, awS1S1501000_1.s0, ((PromotionCouponModule) awS1S1501000_1.l5).tcSchema);
                            tuxTextView4.setText(spannableStringBuilder3);
                        } else {
                            ((TuxTextView) awS1S1501000_1.l1).setText(spannableStringBuilder3);
                        }
                    }
                } else {
                    ((PlatformDiscountsCell) awS1S1501000_1.l3).L5(((View) awS1S1501000_1.l4).getContext(), (SpannableStringBuilder) ((C259800zU) awS1S1501000_1.l2).element, false, awS1S1501000_1.s0, ((PromotionCouponModule) awS1S1501000_1.l5).tcSchema);
                    ((TuxTextView) awS1S1501000_1.l1).setText((CharSequence) ((C259800zU) awS1S1501000_1.l2).element);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((TuxTextView) awS1S1501000_1.l1).setText((CharSequence) ((C259800zU) awS1S1501000_1.l2).element);
                ((TuxTextView) awS1S1501000_1.l1).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TuxTextView) awS1S1501000_1.l1).setEllipsize(TextUtils.TruncateAt.END);
        }
        C786410Ut5.LLLLZLL((TuxTextView) awS1S1501000_1.l1, 0);
        TuxTextView tuxTextView5 = (TuxTextView) awS1S1501000_1.l1;
        HandlerHook.viewPost(tuxTextView5, new ARunnableS101S0100000_1((Object) tuxTextView5, 5));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS1S1501000_1(int r3, android.view.View r4, com.bytedance.tux.input.TuxTextView r5, com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell r6, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule r7, java.lang.String r8, X.C259800zU r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            if (r10 == 0) goto L18
            r1 = r2
            r1.s0 = r8
            r1.l1 = r5
            r1.i6 = r3
            r1.l2 = r9
            r1.l3 = r6
            r1.l4 = r4
            r1.l5 = r7
            r0 = 0
        L14:
            r1.<init>(r0)
            return
        L18:
            r1 = r2
            r1.l1 = r6
            r1.l2 = r5
            r1.i6 = r3
            r1.l3 = r9
            r1.s0 = r8
            r1.l4 = r4
            r1.l5 = r7
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S1501000_1.<init>(int, android.view.View, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule, java.lang.String, X.00zU, int):void");
    }
}
