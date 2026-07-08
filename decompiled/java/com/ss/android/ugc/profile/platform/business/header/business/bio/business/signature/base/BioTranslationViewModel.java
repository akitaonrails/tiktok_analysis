package com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base;

import X.C0A7P;
import X.C11JF;
import X.C1248430ian;
import X.C2188811AlT;
import X.C23250099c;
import X.C710040RtC;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes12.dex */
public final class BioTranslationViewModel extends AssemViewModel<C1248430ian> {
    public C11JF LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1248430ian(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (((Boolean) C0A7P.LIZ.getValue()).booleanValue()) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710040RtC(this, null), 3);
    }

    public static Pair vQ2(String str, List list) {
        int iIntValue;
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        if (list != null && !list.isEmpty()) {
            IntRange intRange = new IntRange(0, str.length() - 1);
            if (list != null) {
                Iterator it2 = list.iterator();
                iIntValue = 0;
                while (it2.hasNext()) {
                    SignatureExtraInfo signatureExtraInfo = (SignatureExtraInfo) it2.next();
                    Integer startIndex = signatureExtraInfo.getStartIndex();
                    Integer endIndex = signatureExtraInfo.getEndIndex();
                    if (startIndex != null && endIndex != null && intRange.LJLJL(startIndex.intValue()) && intRange.LJLJL(endIndex.intValue())) {
                        if (iIntValue >= 0 && iIntValue < startIndex.intValue()) {
                            sb.append(str.substring(iIntValue, startIndex.intValue()));
                        }
                        String strSubstring = str.substring(startIndex.intValue(), endIndex.intValue() + 1);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strSubstring);
                        sbLIZ.append(' ');
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ));
                        iIntValue = endIndex.intValue() + 1;
                    }
                }
            } else {
                iIntValue = 0;
            }
            int i = intRange.LL;
            if (iIntValue <= intRange.LLILLJJLI && i <= iIntValue) {
                sb.append(str.substring(iIntValue));
            }
            return new Pair(sb.toString(), sb2.toString());
        }
        return new Pair(str, sb2.toString());
    }
}
