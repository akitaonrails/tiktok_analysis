package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.C019F;
import X.C1223490hwZ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581400rFq;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightViewStatusAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyCompatAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendsV3TextCompatAssem extends FriendsV3LegacyCompatAssem implements IFriendsV3RefreshAbility, FriendsV3SkylightViewStatusAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextCompatAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3TextCompatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 204), AFwS229S0000000_2.get$arr$(184), null, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final void Ep1() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightViewStatusAbility
    public final boolean ua1() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyCompatAssem
    public final FriendsV3FeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final void t12() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        ((AssemSingleListViewModel) assemVMLazy.getValue()).manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyCompatAssem, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IFriendsV3RefreshAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, FriendsV3SkylightViewStatusAbility.class, null);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyCompatAssem, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IFriendsV3RefreshAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, FriendsV3SkylightViewStatusAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final void lv1(int i, boolean z, InsertStory insertStory, C1581400rFq c1581400rFq, int i2) {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        ((FriendsV3FeedListViewModel) assemVMLazy.getValue()).DQ2(new C1223490hwZ(Integer.valueOf(i), i2, c1581400rFq, null));
    }
}
