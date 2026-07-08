package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.C019F;
import X.C01D1;
import X.C0O6M;
import X.C0O6P;
import X.C1164330gP9;
import X.C1208920hZ4;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1548820qPI;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistCollectionPage extends BaseFavoritePage {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTHELIOSYlJyogO2s8JS4qJCw/PWEDJCQ1JSYgPAYjJSM2KzElJiEDKSIp";
    public final C1208920hZ4 LLIZ = new C1208920hZ4(this, 1);
    public final C19719912Dl LLIZLLLIL = C13LE.LIZ(PlaylistCollectionList.class);
    public final String LLJ = "favourite_playlist";
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistCollectionPage.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/favorites/business/playlist/PlaylistCollectionVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final boolean SR() {
        return false;
    }

    public PlaylistCollectionPage() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistCollectionVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 327);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(107);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 328), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 329), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 330), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("sub_only_playlist_created", this.LLIZ);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String UR() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C19719912Dl VR() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("sub_only_playlist_created", this.LLIZ);
        NR(AFwS256S0000000_18.get$arr$(106));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onPlaylistDeleted(C1164330gP9 c1164330gP9) {
        C0O6P next;
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        AssemListViewModel assemListViewModel = (AssemListViewModel) assemVMLazy.getValue();
        String str = c1164330gP9.LIZIZ;
        List<C0O6P> list = ((C0O6M) assemListViewModel.getState()).LL.LLILZ;
        if (list != null) {
            Iterator<C0O6P> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LL.id, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0O6P c0o6p = next;
            if (c0o6p != null) {
                assemListViewModel.listRemoveItem(c0o6p);
                C1440005kM.LIZ(new IEvent() { // from class: X.0gYC
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
            }
        }
    }
}
