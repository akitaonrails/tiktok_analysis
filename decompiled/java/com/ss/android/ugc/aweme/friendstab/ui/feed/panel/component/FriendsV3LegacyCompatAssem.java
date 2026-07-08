package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C0HTT;
import X.C0R9L;
import X.C0W17;
import X.C1284660jXE;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C583170Mu3;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737030Svd;
import X.InterfaceC2217461Bqa;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes10.dex */
public class FriendsV3LegacyCompatAssem extends BasePanelUIComponent implements FriendsV3LegacyAbility, C0HTT<C737030Svd>, C0R9L {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3LegacyCompatAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3LegacyCompatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 219), AFwS229S0000000_2.get$arr$(190), null, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyAbility
    public final FriendsV3LegacyCompatAssem DA0() {
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyAbility
    public final FriendsV3LegacyCompatAssem sz2() {
        return this;
    }

    public FriendsV3FeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // X.C0R9L
    public final C583170Mu3 ok() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0R9L
    public final void z() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3LegacyAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        Go().LLILLJJLI = getPanelContext();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3LegacyAbility.class, null, null);
        }
    }

    @Override // X.C0HTT
    public final void LLIIL(C737030Svd c737030Svd) {
        Integer numValueOf;
        String str;
        C737030Svd c737030Svd2 = c737030Svd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInternalEvent, event type=");
        String str2 = null;
        if (c737030Svd2 != null) {
            numValueOf = Integer.valueOf(c737030Svd2.LIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", eventType=");
        if (c737030Svd2 != null) {
            str = c737030Svd2.LJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", enterFrom=");
        if (c737030Svd2 != null) {
            str2 = c737030Svd2.LJIIL;
        }
        sbLIZ.append(str2);
        sbLIZ.append("  ");
        C0W17.LIZJ("legacy", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0R9L
    public final void handleDoubleClick(MotionEvent motionEvent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0R9L
    public final void nk(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0R9L
    public final void Y2(Aweme aweme, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }
}
