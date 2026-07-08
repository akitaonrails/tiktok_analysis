package jgp;

import X.C0CHQ;
import X.C11S5;
import X.C1701940uOG;
import X.C19634811ru;
import X.C19638611sW;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import Y.AfS178S0100000_9;
import Y.AfS198S0100000_29;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionApi;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class u extends g3a.a implements InterfaceC1408530ml1 {
    @Override // X.InterfaceC1408530ml1
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 892);
        new C19634811ru().LIZ.storeBoolean("is_has_live_cd_permission", false);
        StickerPermissionApi.LIZ.getClass();
        ((StickerPermissionApi) C0CHQ.LIZ().getNetworkService().createRetrofit(C19638611sW.LIZIZ, true, StickerPermissionApi.class)).getStickerPermission().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(awS573S0100000_29, 68), new AfS178S0100000_9(awS573S0100000_29, 76));
    }

    public u() {
        LJ(AFwS266S0000000_25.get$arr$(457));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }
}
