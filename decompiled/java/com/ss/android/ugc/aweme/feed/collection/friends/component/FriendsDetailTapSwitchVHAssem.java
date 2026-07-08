package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C1558420qem;
import X.C1558520qew;
import X.C628500Oky;
import X.C630740Ooa;
import X.C726830SfB;
import X.InterfaceC665370Q7z;
import X.InterfaceC693170RGx;
import X.InterfaceC713360RyY;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailTapSwitchVHAssem extends BaseCellLogicComponent<FriendsDetailTapSwitchVHAssem> implements SingleTapSwitchSubVHAbility {
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 315));

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final void Vw2(Context context, float f, InterfaceC693170RGx interfaceC693170RGx) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final void f11() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final boolean jZ0() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final float Ru1() {
        return C726830SfB.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility
    public final float Wu0() {
        return C726830SfB.LIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onDestroy();
        InterfaceC713360RyY interfaceC713360RyY = (InterfaceC713360RyY) this.LLJJIJI.getValue();
        if (interfaceC713360RyY == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, SingleTapSwitchSubVHAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        InterfaceC713360RyY interfaceC713360RyY = (InterfaceC713360RyY) this.LLJJIJI.getValue();
        if (interfaceC713360RyY == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, SingleTapSwitchSubVHAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
