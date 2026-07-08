package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top;

import X.C01GW;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import android.view.View;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3MoreOptionAssem extends BaseFriendsV3CellContentAssem<FriendsV3MoreOptionAssem, InterfaceC1361270lWn> {
    public final C01GW LLJJJJJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS565S0100000_21(this, 588));
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS565S0100000_21(this, 589));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS565S0100000_21(this, 587));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS701S0100000_21(this, 6, 42, 42), (View) this.LLJJJJJIL.getValue());
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
