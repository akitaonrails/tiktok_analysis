package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel;

import X.C0W17;
import X.C1159400gHC;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS74S1000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3SkylightBridgeViewModel extends AssemViewModel<C1159400gHC> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159400gHC(0);
    }

    public static void vQ2(FriendsV3SkylightBridgeViewModel friendsV3SkylightBridgeViewModel, String str, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showSkylightList, enterMethod=");
        sbLIZ.append(str);
        C0W17.LIZJ("skylightVM", C2188811AlT.LIZIZ(sbLIZ));
        friendsV3SkylightBridgeViewModel.setState(new AwS74S1000000_24(str, 18));
    }
}
