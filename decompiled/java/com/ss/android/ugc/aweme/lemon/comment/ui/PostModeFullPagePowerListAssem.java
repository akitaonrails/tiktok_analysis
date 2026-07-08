package com.ss.android.ugc.aweme.lemon.comment.ui;

import X.AbstractC1906720ziY;
import X.AnonymousClass0508;
import X.C01GW;
import X.C0HW1;
import X.C1341040l0A;
import X.C1341050l0B;
import X.C452501pT;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.lemon.comment.powercell.PostModeLoadingFooterCell;
import java.util.Collections;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeFullPagePowerListAssem extends CommentPowerListAssem {
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(290));

    @Override // com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem
    public final void ap() {
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem
    public final void Vo() {
        C1341040l0A commonModel;
        Aweme aweme;
        So().LIZJ((AbstractC1906720ziY) this.LLJJIJIL.getValue());
        C0HW1 c0hw1 = (C0HW1) this.LLJJIJIL.getValue();
        C1341050l0B c1341050l0BNo = No();
        if (c1341050l0BNo == null || (commonModel = c1341050l0BNo.getCommonModel()) == null || (aweme = commonModel.getAweme()) == null) {
            c0hw1.getClass();
        } else {
            c0hw1.LLJI = aweme;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                c0hw1.LLILZLL.LJIILL(Collections.singletonList(new AnonymousClass0508(aweme, statistics.getCommentCount())), null);
            }
        }
        Go();
        Ho();
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem
    public final Class<? extends PowerLoadingCell> Oo() {
        return PostModeLoadingFooterCell.class;
    }
}
