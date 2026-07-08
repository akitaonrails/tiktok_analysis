package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.C01GW;
import X.C1308910kAL;
import X.C1749280vcc;
import X.C2217381BqS;
import X.C452501pT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageStatusViewAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1182));
    public C1749280vcc LLJ;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(boolean r9) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageStatusViewAssem.Go(boolean):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZJ;
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.r74);
        this.LLJ = c1749280vcc;
        if (c1749280vcc != null && (context = c1749280vcc.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1749280vcc c1749280vcc2 = this.LLJ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setBackgroundColor(iIntValue);
            }
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLIZLLLIL.getValue();
        if (assemViewModel != null) {
            AssemViewModel.asyncSubscribe$default(assemViewModel, new C2217381BqS() { // from class: X.0h4H
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1187970h1H c1187970h1H = (C1187970h1H) obj;
                    c1187970h1H.getClass();
                    return C627260Oiy.LIZLLL(c1187970h1H);
                }
            }, this, null, new AwS597S0100000_18(this, 342), new AwS562S0100000_18(this, 1181), new AwS597S0100000_18(this, 343), 4, null);
        }
    }
}
