package com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot;

import X.C1331660kl2;
import X.C1331670kl3;
import X.C665170Q7f;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoNewCardImageItemAssem extends ReusedUISlotAssem<SearchTakoNewCardImageItemAssem> implements InterfaceC712990Rxx<C665170Q7f> {
    public View LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f3g;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.xaa);
        this.LLJL = (SmartImageView) view.findViewById(R.id.xa_);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C665170Q7f c665170Q7f) {
        SmartImageView smartImageView;
        ViewGroup.LayoutParams layoutParams;
        C665170Q7f c665170Q7f2 = c665170Q7f;
        if (c665170Q7f2.LLILZ > 0 && c665170Q7f2.LLILLL > 0 && (smartImageView = this.LLJL) != null && (layoutParams = smartImageView.getLayoutParams()) != null) {
            layoutParams.width = c665170Q7f2.LLILLL;
            layoutParams.height = c665170Q7f2.LLILZ;
        }
        SmartImageView smartImageView2 = this.LLJL;
        if (smartImageView2 != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c665170Q7f2.LLILLJJLI);
            c1331670kl3LJIIJ.LJJ(smartImageView2);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C665170Q7f c665170Q7f) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C665170Q7f c665170Q7f) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
