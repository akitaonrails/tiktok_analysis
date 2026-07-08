package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.refundable;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C0H1U;
import X.C0H9H;
import X.C0HZQ;
import X.C10515049h;
import X.C12ES;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C722302rt;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7730030e;
import X.C786410Ut5;
import X.C814420VxA;
import X.C928203k0;
import X.C960203pA;
import X.EnumC035700Ap;
import X.EnumC860203Xs;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RefundableSampleModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USRefundableSampleCell extends ECPowerCell<C7730030e> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public String LLJ = "";
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public ECRichText LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USRefundableSampleCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USRefundableSampleCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1418);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(70);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1400), awS577S0100000_33, AFwS224S0000000_33.get$arr$(197), new AwS577S0100000_33((C03K6) this, 1403), new AwS577S0100000_33((C03K6) this, 1405), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1407), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1409), null, new AwS577S0100000_33((C03K6) this, 1410));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1404);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1406);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1408);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 52));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1411);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1413);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1414);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1415);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1416);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1417), awS577S0100000_33, AFwS224S0000000_33.get$arr$(198), new AwS577S0100000_33((C03K6) this, 1419), new AwS577S0100000_33((C03K6) this, 1420), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1421), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1422), null, new AwS577S0100000_33((C03K6) this, 1423));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1424), awS577S0100000_33, AFwS224S0000000_33.get$arr$(199), new AwS577S0100000_33((C03K6) this, 1425), new AwS577S0100000_33((C03K6) this, 1426), new AwS577S0100000_33((C03K6) this, 1396), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1398));
        }
        this.LLJI = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1399));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1397));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1402));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1401));
        this.LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1412));
    }

    public final TuxTextView N5() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    public final C0HZQ P5() {
        return (C0HZQ) this.LLJILLL.getValue();
    }

    public final OrderSubmitAssemViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void L5(TuxTextView tuxTextView) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tuxTextView.getText());
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, tuxTextView.getContext())), 0, spannableStringBuilder.length(), 17);
        tuxTextView.setText(spannableStringBuilder);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        Price price;
        String priceStr;
        ECRichText eCRichTextS5;
        C7730030e c7730030e = (C7730030e) interfaceC1891350zJl;
        RefundableSampleModule refundableSampleModule = c7730030e.LLILZLL;
        if (refundableSampleModule != null) {
            C928203k0 c928203k0 = C928203k0.LIZ;
            String str = R5().n;
            c928203k0.getClass();
            if (C928203k0.LJIILJJIL(str)) {
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), (View) this.LLJIJIL.getValue());
                C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), N5());
                C12ES.LJIILL(0, (View) this.LLJJ.getValue());
            } else {
                C03J8.LIZ(this.itemView, true);
            }
            C736680Sv4.LJIIIIZZ(this, R5(), new C2217381BqS() { // from class: X.19yv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLLLLIL;
                }
            }, null, new AwS647S0100000_33(this, 36), 6);
            C736680Sv4.LJIIIIZZ(this, R5(), new C2217381BqS() { // from class: X.03Uh
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLILLL;
                }
            }, null, new AwS615S0100000_1(this, 154), 6);
            C03C8.LIZJ((TextView) this.LLJIJIL.getValue(), refundableSampleModule.title, "order_submit_refundable_sample_title", null);
            ECRichText eCRichText = refundableSampleModule.content;
            if (eCRichText != null) {
                this.LLJJI = eCRichText;
                C722302rt c722302rt = R5().getState().LLILLL;
                if (c722302rt != null && (price = c722302rt.LLIZ) != null && (priceStr = price.getPriceStr()) != null && (eCRichTextS5 = S5(priceStr, eCRichText)) != null) {
                    C03C8.LIZJ(N5(), eCRichTextS5, "order_submit_refundable_sample_content", null);
                }
                C786410Ut5.I7(new AjS40S0200000_1(refundableSampleModule, this, 44), N5());
            }
            RefundableSampleModule refundableSampleModule2 = c7730030e.LLILZLL;
            if (refundableSampleModule2 != null) {
                Integer num = refundableSampleModule2.selectStatus;
                int value = EnumC860203Xs.REFUNDABLE_SAMPLE_STATUS_NONE.getValue();
                if (num == null || num.intValue() != value) {
                    int value2 = EnumC860203Xs.REFUNDABLE_SAMPLE_STATUS_SELECTED.getValue();
                    if (num != null && num.intValue() == value2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    if (boolValueOf != null) {
                        P5().setChecked(boolValueOf.booleanValue());
                    }
                }
                R5().f347O = refundableSampleModule2.selectStatus;
                Integer num2 = refundableSampleModule2.moduleStatus;
                int value3 = EnumC035700Ap.REFUNDABLE_SAMPLE_STATUS_CANNOT_CHANGE.getValue();
                if (num2 != null && num2.intValue() == value3) {
                    P5().setEnabled(false);
                    P5().setInnerMaskVisibility(true);
                    C786410Ut5.I7(null, (View) this.LLJILJILJ.getValue());
                } else {
                    P5().setEnabled(true);
                    P5().setInnerMaskVisibility(false);
                    C786410Ut5.I7(new AjS40S0200000_1(this, c7730030e, 43), (View) this.LLJILJILJ.getValue());
                }
            }
            if (!this.LLILLJJLI) {
                this.LLILLJJLI = true;
                C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS224S0000000_33.get$arr$(570), AFwS279S0000000_33.get$arr$(305));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b2s, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText S5(java.lang.String r8, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r9) {
        /*
            r7 = this;
            r5 = 0
            if (r9 != 0) goto L4
            return r5
        L4:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute> r1 = r9.arguments
            if (r1 == 0) goto L5b
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r0 = r1.size()
            int r0 = X.C2097908Jt.LIZIZ(r0)
            r4.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L1d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute r2 = (com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute) r2
            java.lang.String r0 = "{amount}"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L51
            r7.LLJ = r8
            if (r2 == 0) goto L59
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute r1 = r2.textAttribute
            if (r1 == 0) goto L55
            r0 = 510(0x1fe, float:7.15E-43)
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute r0 = com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute.LIZ(r1, r8, r5, r0)
        L4d:
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute r2 = com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute.LIZ(r2, r0)
        L51:
            r4.put(r3, r2)
            goto L1d
        L55:
            r0 = r5
            if (r2 == 0) goto L59
            goto L4d
        L59:
            r2 = r5
            goto L51
        L5b:
            r4 = r5
        L5c:
            r0 = 29
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r0 = com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText.LIZ(r9, r4, r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.refundable.USRefundableSampleCell.S5(java.lang.String, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText):com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText");
    }
}
