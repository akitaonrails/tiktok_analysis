package com.ss.android.ugc.aweme.series.commonfeed.component.tag;

import X.C0RF0;
import X.C1308910kAL;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPaidContentPreviewTagAssem extends DynamicComponent<FeedPaidContentPreviewTagAssem> {
    public TuxTag LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_m;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        C786410Ut5.LJLLLLLL(0, getContentView());
        C786410Ut5.LJLLLLLL(0, LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        super.onViewCreated(view);
        this.LLJZIJLIL = (TuxTag) view.findViewById(R.id.rsc);
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (C704010RjT.LJ(str)) {
            C704010RjT.LIZIZ(this.LLJZIJLIL);
            TuxTag tuxTag = this.LLJZIJLIL;
            if (tuxTag != null) {
                tuxTag.setTagSize(2);
            }
            TuxTag tuxTag2 = this.LLJZIJLIL;
            if (tuxTag2 != null && (context2 = tuxTag2.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context2)) != null) {
                int iIntValue = numLIZJ2.intValue();
                TuxTag tuxTag3 = this.LLJZIJLIL;
                if (tuxTag3 != null) {
                    tuxTag3.setTagBackgroundColor(iIntValue);
                }
            }
            TuxTag tuxTag4 = this.LLJZIJLIL;
            if (tuxTag4 != null && (context = tuxTag4.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                TuxTag tuxTag5 = this.LLJZIJLIL;
                if (tuxTag5 != null) {
                    tuxTag5.setTagTextColor(iIntValue2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
