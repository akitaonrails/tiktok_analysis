package com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui;

import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLsLiveCardInfoAssem extends ReusedUISlotAssem<SearchLsLiveCardInfoAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public RelativeLayout LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public boolean LLJLL;
    public final int LLJLLIL = R.id.uby;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1z;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (RelativeLayout) view.findViewById(R.id.uby);
        this.LLJL = (SmartImageView) view.findViewById(R.id.ubz);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.uc1);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.uc0);
        RelativeLayout relativeLayout = this.LLJJLIIIJLLLLLLLZ;
        if (relativeLayout != null) {
            C427690Gpr.LJ(relativeLayout, 0.0f);
        }
        RelativeLayout relativeLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (relativeLayout2 != null) {
            C786410Ut5.S7(relativeLayout2, new ACListenerS145S0100000_10(this, 35));
        }
        this.LLJLL = C426750GoL.LIZLLL(view.getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[PHI: r5
      0x0050: PHI (r5v11 java.lang.String) = (r5v2 java.lang.String), (r5v12 java.lang.String) binds: [B:24:0x004e, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[PHI: r5
      0x0054: PHI (r5v10 java.lang.String) = (r5v2 java.lang.String), (r5v11 java.lang.String) binds: [B:24:0x004e, B:26:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[PHI: r5
      0x0081: PHI (r5v8 java.lang.String) = (r5v4 java.lang.String), (r5v9 java.lang.String) binds: [B:33:0x007f, B:31:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[PHI: r5
      0x0085: PHI (r5v7 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:33:0x007f, B:35:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC435460H5s r10) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchLsLiveCardInfoAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
