package com.ss.android.ugc.aweme.fangroup.view;

import X.C0216005e;
import X.C123100dR;
import X.C1584506Ih;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class FanGroupItemTitleAssemCell extends ReusedUISlotAssem<FanGroupItemTitleAssemCell> implements InterfaceC712990Rxx<C0216005e> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ci7;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0216005e c0216005e) {
        TextView textView;
        C0216005e c0216005e2 = c0216005e;
        getContentView().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0216005e2.LLILLL))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0216005e2.LLILLL))), 0);
        if (C123100dR.LIZ(c0216005e2.LL) && (textView = (TextView) getContentView().findViewById(R.id.f6s)) != null) {
            textView.setText(c0216005e2.LL);
        }
        TextView textView2 = (TextView) getContentView().findViewById(R.id.f6r);
        if (textView2 != null) {
            if (C123100dR.LIZ(c0216005e2.LLILLJJLI)) {
                C1584506Ih.LIZIZ(textView2);
                textView2.setText(c0216005e2.LLILLJJLI);
            } else {
                C1584506Ih.LIZ(textView2);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0216005e c0216005e) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0216005e c0216005e) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
