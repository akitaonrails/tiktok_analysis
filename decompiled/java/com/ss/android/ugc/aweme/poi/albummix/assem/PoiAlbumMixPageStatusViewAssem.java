package com.ss.android.ugc.aweme.poi.albummix.assem;

import X.C01GW;
import X.C1308910kAL;
import X.C1749280vcc;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixPageStatusViewAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 858));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 860));
    public C1749280vcc LLJI;

    public final PoiHeaderTopVideosSharedViewModel U32() {
        return (PoiHeaderTopVideosSharedViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZJ;
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.qwr);
        this.LLJI = c1749280vcc;
        if (c1749280vcc != null && (context = c1749280vcc.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1749280vcc c1749280vcc2 = this.LLJI;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setBackgroundColor(iIntValue);
            }
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJ.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0h0K
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1187300h0C) obj).LLILLJJLI;
                }
            }, null, new AwS632S0100000_18(this, 88), 6);
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelU32 = U32();
        if (poiHeaderTopVideosSharedViewModelU32 != null) {
            AssemViewModel.asyncSubscribe$default(poiHeaderTopVideosSharedViewModelU32, new C2217381BqS() { // from class: X.0h0F
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1187300h0C c1187300h0C = (C1187300h0C) obj;
                    c1187300h0C.getClass();
                    return C627260Oiy.LIZLLL(c1187300h0C);
                }
            }, this, null, new AwS597S0100000_18(this, 231), new AwS562S0100000_18(this, 859), new AwS597S0100000_18(this, 232), 4, null);
        }
    }
}
