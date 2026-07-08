package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C1308910kAL;
import X.C384050F3z;
import X.C418440Gaw;
import X.InterfaceC1587906Jp;
import X.InterfaceC435450H5r;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchCardVideoLabelAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements InterfaceC712990Rxx<InterfaceC435450H5r> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1o;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.z7o);
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.bp, view.getContext());
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
        tuxTextView.setBackground(c384050F3z.LIZ(view.getContext()));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435450H5r interfaceC435450H5r) {
        InterfaceC435450H5r interfaceC435450H5r2 = interfaceC435450H5r;
        int index = interfaceC435450H5r2.getIndex();
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(String.valueOf(index));
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.bp, getContentView().getContext());
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(interfaceC435450H5r2.LJIIJJI())));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(interfaceC435450H5r2.LJIIJJI())));
        tuxTextView2.setBackground(c384050F3z.LIZ(getContentView().getContext()));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435450H5r interfaceC435450H5r) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435450H5r interfaceC435450H5r) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
