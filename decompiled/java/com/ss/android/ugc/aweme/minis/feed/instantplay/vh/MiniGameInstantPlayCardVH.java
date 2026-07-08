package com.ss.android.ugc.aweme.minis.feed.instantplay.vh;

import X.C03H5;
import X.C0RAF;
import X.C0RF0;
import X.C0RF2;
import X.C0RGP;
import X.C690870R8b;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.minis.feed.base.BaseMinisViewHolder;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS31S0010000_16;

/* JADX INFO: loaded from: classes12.dex */
public final class MiniGameInstantPlayCardVH extends BaseMinisViewHolder<MiniGameInstantPlayCardVH> {
    public final C0RF0 LLJJLIIIJLLLLLLLZ;
    public final C0RF2<MiniGameInstantPlayCardVH, VideoItemParams> LLJL;
    public MiniGameInstantPlayCardRootAssem LLJLIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return null;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "minis_instant_play_card";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJLLILLLL() {
        MiniGameInstantPlayCardRootAssem miniGameInstantPlayCardRootAssem = this.LLJLIL;
        if (miniGameInstantPlayCardRootAssem != null) {
            MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp = miniGameInstantPlayCardRootAssem.ep();
            miniGameInstantPlayViewModelEp.getClass();
            miniGameInstantPlayViewModelEp.setState(new AwS31S0010000_16(true, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        MiniGameInstantPlayCardRootAssem miniGameInstantPlayCardRootAssem = new MiniGameInstantPlayCardRootAssem();
        this.LLJJJ = miniGameInstantPlayCardRootAssem;
        this.LLJLIL = miniGameInstantPlayCardRootAssem;
        return miniGameInstantPlayCardRootAssem;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLLIL(boolean z) {
        if (!z) {
            return;
        }
        LLLI(2);
    }

    public MiniGameInstantPlayCardVH(C0RF0 c0rf0, C0RGP c0rgp) {
        super(c0rf0, c0rgp);
        this.LLJJLIIIJLLLLLLLZ = c0rf0;
        this.LLJL = c0rgp;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        VideoItemParams videoItemParamsLIZ = C0RAF.LIZ(this.LLJJLIIIJLLLLLLLZ);
        if (aweme == null) {
            aweme = new Aweme();
        }
        videoItemParamsLIZ.setAweme(aweme);
        videoItemParamsLIZ.currentPosition = this.LLJJIJIL;
        return videoItemParamsLIZ;
    }
}
