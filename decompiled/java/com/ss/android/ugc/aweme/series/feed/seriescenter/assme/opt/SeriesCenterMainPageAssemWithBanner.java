package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.C2217381BqS;
import X.C736680Sv4;
import X.C736820SvI;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterMainPageAssemWithBanner extends SeriesCenterMainPageAssem {
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public RemoteImageView LLJJJ;

    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.ur1);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.uqz);
        this.LLJJIJIL = view.findViewById(R.id.ur0);
        this.LLJJJ = (RemoteImageView) view.findViewById(R.id.uqy);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0r3f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573270r2j) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 75), 4);
    }
}
