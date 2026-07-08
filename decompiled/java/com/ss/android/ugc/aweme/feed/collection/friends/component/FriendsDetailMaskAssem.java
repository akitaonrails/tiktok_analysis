package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C0HHT;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCMaskViewModel;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailMaskAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailMaskAssem extends BaseCellLogicComponent<FriendsDetailMaskAssem> implements FriendsDetailMaskAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsDetailMaskAssem.class, "tucMaskVM", "getTucMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/tns/mask/TUCMaskViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsDetailMaskAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TUCMaskViewModel.class);
        this.LLJJIJI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 312), null, AFwS243S0000000_11.get$arr$(112));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1210784679) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailMaskAbility
    public final void Er() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIJI.getValue(this, LLJJIJIIJIL[0]);
        assemViewModel.getClass();
        assemViewModel.setState(AFwS243S0000000_11.get$arr$(589));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
