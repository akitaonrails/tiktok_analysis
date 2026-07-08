package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.extrafee;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C030V;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C049X;
import X.C04J7;
import X.C1019103yf;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C754002x0;
import X.C770702zh;
import X.C786410Ut5;
import X.EnumC1014603xw;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentExtraFeeCell extends ECPowerCell<C754002x0> {
    public static final C030V LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PaymentExtraFeeCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new C030V();
    }

    public final void L5() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        C03J8.LIZ(this.itemView, false);
        C1748720vbi.LJFF(this.itemView, new C049X(), AFwS185S0000000_1.get$arr$(40), AFwS228S0000000_1.get$arr$(86));
        try {
            try {
                Integer numLIZJ = C1308910kAL.LIZJ(Intrinsics.LJFF(N5().o.LIZJ, "us") ? R.attr.zp : R.attr.a03, this.itemView.getContext());
                if (numLIZJ != null) {
                    this.itemView.setBackgroundColor(numLIZJ.intValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.03av
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, null, new AwS615S0100000_1(this, 29), 6);
    }

    public PaymentExtraFeeCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 375);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(85);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 366), awS545S0100000_1, AFwS207S0000000_19.get$arr$(135), new AwS545S0100000_1((C03K6) this, 367), new AwS545S0100000_1((C03K6) this, 369), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 371), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1145), null, new AwS545S0100000_1((C03K6) this, 373));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 368);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 370);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 372);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 54));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1146);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1147);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1148);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1149);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1150);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 374), awS545S0100000_1, AFwS207S0000000_19.get$arr$(136), new AwS545S0100000_1((C03K6) this, 376), new AwS545S0100000_1((C03K6) this, 377), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 378), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1151), null, new AwS545S0100000_1((C03K6) this, 379));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 380), awS545S0100000_1, AFwS207S0000000_19.get$arr$(137), new AwS545S0100000_1((C03K6) this, 381), new AwS545S0100000_1((C03K6) this, 363), new AwS545S0100000_1((C03K6) this, 364), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 365));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        L5();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C754002x0 c754002x0) {
        String str;
        String str2;
        String str3;
        L5();
        try {
            ExtraFeeStatement extraFeeStatement = c754002x0.LLILZLL;
            if (extraFeeStatement == null || (str = extraFeeStatement.template) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            Map<String, ExtraFeeRichText> map = extraFeeStatement.arguments;
            LinkedHashMap linkedHashMap = null;
            if (map != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, ExtraFeeRichText> entry : map.entrySet()) {
                    ExtraFeeRichText value = entry.getValue();
                    if (value != null) {
                        str3 = value.text;
                    } else {
                        str3 = null;
                    }
                    if (C770702zh.LIZ(str3)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap = linkedHashMap2;
            }
            R5(linkedHashMap, sb);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) entry2.getValue();
                    if (extraFeeRichText != null && (str2 = extraFeeRichText.text) != null) {
                        int iIndexOf = sb.indexOf(str2);
                        int length = extraFeeRichText.text.length() + iIndexOf;
                        if (iIndexOf >= 0 && length < sb.length()) {
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIndexOf, length, 17);
                            C786410Ut5.q2(spannableStringBuilder, new C04J7(extraFeeRichText, this, 0), iIndexOf, length, 17);
                        } else {
                            return;
                        }
                    }
                }
            }
            ((TuxTextView) this.itemView.findViewById(R.id.hip)).setText(spannableStringBuilder);
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.hip));
            ((TuxTextView) this.itemView.findViewById(R.id.hip)).setClickable(true);
            ((TuxTextView) this.itemView.findViewById(R.id.hip)).setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR16;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaymentExtraFeeVH onbind exception: ");
            sbLIZ.append(e);
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), N5().LLLIL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.aov, viewGroup, false);
    }

    public final void R5(Map<String, ExtraFeeRichText> map, StringBuilder sb) {
        String str;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, ExtraFeeRichText> entry : map.entrySet()) {
                String key = entry.getKey();
                ExtraFeeRichText value = entry.getValue();
                int iIndexOf = sb.indexOf(key);
                if (iIndexOf >= 0) {
                    int length = key.length() + iIndexOf;
                    if (value == null || (str = value.text) == null) {
                        str = "these banks";
                    }
                    sb.replace(iIndexOf, length, str);
                } else {
                    EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR17;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PaymentExtraFeeVH ");
                    sbLIZ.append(key);
                    sbLIZ.append(" starling key not found");
                    C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), N5().LLLIL);
                }
            }
        }
    }
}
