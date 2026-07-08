package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C0DYK;
import X.C444960Hcc;
import X.C666750QDh;
import X.C786410Ut5;
import X.C820940WIi;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchCardVideoDiggAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1m;
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
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.videoDiggCount);
        int i = C666750QDh.LIZ;
        C786410Ut5.LLLLZLL(tuxTextView, C666750QDh.LIZ);
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        long diggCount;
        Aweme aweme = interfaceC435460H5s.getAweme();
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        tuxTextView.setText(C820940WIi.LIZ(diggCount));
        Drawable drawableLIZ = C0DYK.LIZ(getContext(), aweme, R.drawable.d4i);
        if (C444960Hcc.LIZIZ()) {
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableLIZ, (Drawable) null);
            return;
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setCompoundDrawablesWithIntrinsicBounds(drawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
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
