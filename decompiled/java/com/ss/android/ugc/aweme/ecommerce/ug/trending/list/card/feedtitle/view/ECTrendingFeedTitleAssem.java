package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.feedtitle.view;

import X.C1742960vSQ;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class ECTrendingFeedTitleAssem extends ReusedUISlotAssem<ECTrendingFeedTitleAssem> implements InterfaceC712990Rxx<C1742960vSQ> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bsv;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.hve);
        this.LLJL = view.findViewById(R.id.hvd);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1742960vSQ c1742960vSQ) {
        ViewGroup.LayoutParams layoutParams;
        C1742960vSQ c1742960vSQ2 = c1742960vSQ;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c1742960vSQ2.LLILLJJLI);
        }
        Integer num = c1742960vSQ2.LLILLL;
        if (num != null && num.intValue() > 0) {
            int iIntValue = num.intValue();
            View view = this.LLJL;
            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1742960vSQ c1742960vSQ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1742960vSQ c1742960vSQ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
