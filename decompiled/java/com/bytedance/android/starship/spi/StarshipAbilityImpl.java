package com.bytedance.android.starship.spi;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1306440k6M;
import X.InterfaceC1306560k6Y;
import X.InterfaceC1307680k8M;
import X.InterfaceC1308020k8u;
import X.InterfaceC1309280kAw;
import com.bytedance.android.starship.base.IStarshipBaseBridge;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipAbilityImpl implements IStarshipAbility {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(18));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(20));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(19));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(21));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(22));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(23));

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1307680k8M LIZ() {
        return (InterfaceC1307680k8M) this.LJFF.getValue();
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1308020k8u LIZIZ() {
        return (InterfaceC1308020k8u) this.LIZJ.getValue();
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1309280kAw LIZJ() {
        return (InterfaceC1309280kAw) this.LJ.getValue();
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1306440k6M LIZLLL() {
        return (InterfaceC1306440k6M) this.LIZIZ.getValue();
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final IStarshipBaseBridge LJ() {
        return (IStarshipBaseBridge) this.LIZ.getValue();
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1306560k6Y getNetworkService() {
        return (InterfaceC1306560k6Y) this.LIZLLL.getValue();
    }
}
