package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.payment;

import X.C04J5;
import X.C1019103yf;
import X.C2188811AlT;
import X.C703302op;
import X.C754002x0;
import X.C786410Ut5;
import X.EnumC1014603xw;
import X.InterfaceC1891350zJl;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class USCombinedSkuExtraFeeCell extends ECPowerCell<C754002x0> {
    public final String LLJ = "these_banks";

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        LinkedHashMap linkedHashMap;
        String str2;
        String str3;
        String str4;
        C754002x0 c754002x0 = (C754002x0) interfaceC1891350zJl;
        super.onBindItemView(c754002x0);
        ExtraFeeStatement extraFeeStatement = c754002x0.LLILZLL;
        if (extraFeeStatement != null && (str = extraFeeStatement.template) != null) {
            StringBuilder sb = new StringBuilder(str);
            Map<String, ExtraFeeRichText> map = extraFeeStatement.arguments;
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ExtraFeeRichText> entry : map.entrySet()) {
                    ExtraFeeRichText value = entry.getValue();
                    if (value != null) {
                        str4 = value.text;
                    } else {
                        str4 = null;
                    }
                    if (C703302op.LIZ(str4)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str5 = (String) entry2.getKey();
                    ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) entry2.getValue();
                    int iIndexOf = sb.indexOf(str5);
                    if (iIndexOf >= 0) {
                        int length = str5.length() + iIndexOf;
                        if (extraFeeRichText == null || (str3 = extraFeeRichText.text) == null) {
                            str3 = "these banks";
                        }
                        sb.replace(iIndexOf, length, str3);
                    } else {
                        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR17;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PaymentExtraFeeVH ");
                        sbLIZ.append(str5);
                        sbLIZ.append(" starling key not found");
                        C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
                    }
                }
            }
            View view = this.itemView;
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
                if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        ExtraFeeRichText extraFeeRichText2 = (ExtraFeeRichText) ((Map.Entry) it2.next()).getValue();
                        if (extraFeeRichText2 != null && (str2 = extraFeeRichText2.text) != null) {
                            int iIndexOf2 = sb.indexOf(str2);
                            int length2 = extraFeeRichText2.text.length() + iIndexOf2;
                            if (iIndexOf2 >= 0 && length2 < sb.length()) {
                                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIndexOf2, length2, 17);
                                C786410Ut5.q2(spannableStringBuilder, new C04J5(view, this, extraFeeRichText2, 2), iIndexOf2, length2, 17);
                            } else {
                                return;
                            }
                        }
                    }
                }
                ((TuxTextView) view.findViewById(R.id.e9c)).setText(spannableStringBuilder);
                ((TuxTextView) view.findViewById(R.id.e9c)).setClickable(true);
                ((TuxTextView) view.findViewById(R.id.e9c)).setMovementMethod(LinkMovementMethod.getInstance());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                EnumC1014603xw enumC1014603xw2 = EnumC1014603xw.ERR16;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PaymentExtraFeeVH onBind exception: ");
                sbLIZ2.append(e);
                C1019103yf.LIZ(enumC1014603xw2, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)), null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.b0s, false, 4, null);
    }
}
