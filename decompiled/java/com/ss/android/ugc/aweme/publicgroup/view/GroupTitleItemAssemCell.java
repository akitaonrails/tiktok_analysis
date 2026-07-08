package com.ss.android.ugc.aweme.publicgroup.view;

import X.C0215005d;
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

/* JADX INFO: loaded from: classes3.dex */
public final class GroupTitleItemAssemCell extends ReusedUISlotAssem<GroupTitleItemAssemCell> implements InterfaceC712990Rxx<C0215005d> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cih;
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
    public final void up(C0215005d c0215005d) {
        TextView textView;
        View contentView = getContentView();
        c0215005d.getClass();
        contentView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 0);
        if (C123100dR.LIZ(null) && (textView = (TextView) getContentView().findViewById(R.id.f6y)) != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = (TextView) getContentView().findViewById(R.id.f6x);
        if (textView2 != null) {
            if (C123100dR.LIZ(null)) {
                C1584506Ih.LIZIZ(textView2);
                textView2.setText((CharSequence) null);
            } else {
                C1584506Ih.LIZ(textView2);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0215005d c0215005d) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0215005d c0215005d) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
