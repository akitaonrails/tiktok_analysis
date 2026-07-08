package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol;

import X.C03H5;
import X.C690870R8b;
import X.C723830SaL;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3TextCellConfig extends FriendsCellCommonProtocol<C690870R8b, ReusedUISlotAssem<? extends C03H5>> {
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellConfigProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF(c690870R8b.LIZ(), "cell_text");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsCellCommonProtocol, com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellConfigProtocol
    public final void NG(ReusedUISlotAssem<? extends C03H5> reusedUISlotAssem, C690870R8b c690870R8b) {
        super.NG(reusedUISlotAssem, c690870R8b);
        C723830SaL.LIZ(reusedUISlotAssem, null, new AwS590S0100000_11((ReusedUISlotAssem) reusedUISlotAssem, (ReusedUISlotAssem<? extends C03H5>) 153));
    }
}
