package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.desc;

import X.C1564680qos;
import X.C705700RmC;
import X.InterfaceC494301wD;
import X.InterfaceC705620Rm4;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3RepostContentDescAssem extends VideoDescAssem implements InterfaceC705620Rm4 {
    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1354300871 || iHashCode == -78363505 || iHashCode == -16814679) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.b9t, new AwS555S0100000_11(this, 437));
    }
}
