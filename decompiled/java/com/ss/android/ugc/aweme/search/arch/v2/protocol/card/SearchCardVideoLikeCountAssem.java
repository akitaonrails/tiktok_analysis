package com.ss.android.ugc.aweme.search.arch.v2.protocol.card;

import X.C07E5;
import X.C0HAV;
import X.C1559260qg8;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444960Hcc;
import X.C666750QDh;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C820940WIi;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
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

/* JADX INFO: loaded from: classes7.dex */
public final class SearchCardVideoLikeCountAssem extends ReusedUISlotAssem<SearchCardVideoLikeCountAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C0HAV.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.evd;
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
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.video_like_count_tv);
        int i = C666750QDh.LIZ;
        C786410Ut5.LLLLZLL(tuxTextView, C666750QDh.LIZ);
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        int iIntValue;
        int iLIZIZ;
        int i;
        Integer numValueOf;
        int iIntValue2;
        Integer num;
        Integer num2;
        Integer num3;
        long diggCount;
        Aweme aweme = interfaceC435460H5s.getAweme();
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            tuxTextView.setText(C820940WIi.LIZ(diggCount));
        }
        C0HAV c0hav = (C0HAV) this.LLJL.getValue();
        if (c0hav != null && (num3 = c0hav.LL) != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = R.attr.zi;
        }
        C0HAV c0hav2 = (C0HAV) this.LLJL.getValue();
        if (c0hav2 != null && (num2 = c0hav2.LLILLL) != null) {
            iLIZIZ = num2.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (aweme.getUserDigg() == 1) {
            i = R.raw.icon_heart_small_fill;
        } else {
            i = R.raw.icon_heart_small;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        if (aweme.getUserDigg() == 1) {
            numValueOf = Integer.valueOf(R.attr.a1r);
        } else {
            numValueOf = Integer.valueOf(iIntValue);
        }
        c419910GdJ.LJ = numValueOf;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContentView().getContext());
        if (C444960Hcc.LIZIZ()) {
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView4 != null) {
            tuxTextView4.setTextColorRes(iIntValue);
        }
        TuxTextView tuxTextView5 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView5 != null) {
            C0HAV c0hav3 = (C0HAV) this.LLJL.getValue();
            if (c0hav3 != null && (num = c0hav3.LLILLJJLI) != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 62;
            }
            tuxTextView5.setTuxFont(iIntValue2);
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
