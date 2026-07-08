package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C07E5;
import X.C0DYK;
import X.C1558520qew;
import X.C452501pT;
import X.C820940WIi;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC494301wD;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchCardVideoLikeAssem extends ReusedUISlotAssem<SearchCardVideoLikeAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s>, ISearchCardVideoLikeAbility, InterfaceC1554640qYg {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 537));
    public TuxTextView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f14;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1006913275) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.ISearchCardVideoLikeAbility
    public final TuxTextView ku2() {
        return this.LLJL;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
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
        view.findViewById(R.id.ug1);
        this.LLJL = (TuxTextView) view.findViewById(R.id.ug3);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        CharSequence text;
        long diggCount;
        Aweme aweme = interfaceC435460H5s.getAweme();
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            tuxTextView.setText(C820940WIi.LIZ(diggCount));
            TuxIconDrawable tuxIconDrawableLIZIZ = C0DYK.LIZIZ(tuxTextView.getContext(), aweme);
            if (Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ.getValue(), Boolean.TRUE)) {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZIZ, (Drawable) null);
            } else {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0 && (text = tuxTextView2.getText()) != null && text.length() != 0) {
            tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), 0, tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        }
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
