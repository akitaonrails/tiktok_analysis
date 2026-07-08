package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video;

import X.C12KQ;
import X.C12P5;
import X.C704790Rkj;
import X.C723830SaL;
import X.InterfaceC1361270lWn;
import android.view.View;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3AudioBarAssem extends BaseFriendsV3CellContentAssem<FriendsV3AudioBarAssem, InterfaceC1361270lWn> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C12P5 c12p5 = new C12P5();
        c12p5.LIZLLL = Integer.valueOf(R.attr.e1);
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJFF = Float.valueOf(0.3f);
        c12p5.LJI = C12KQ.VERTICAL;
        view.setBackground(c12p5.LIZ(view.getContext()));
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 157));
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }
}
