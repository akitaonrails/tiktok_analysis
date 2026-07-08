package com.ss.android.ugc.aweme.base.ui.assem;

import X.C01D1;
import X.C01GW;
import X.C0RGG;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1637806bA;
import X.C1720106oR;
import X.C19719912Dl;
import X.C20299514bp;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C299660Boq;
import X.C452501pT;
import X.C586380MzE;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC20299614bq;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightMaskAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightMaskAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 88));
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSkylightMaskAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedSkylightMaskAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 87);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(27), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(72));
    }

    public final FeedSkylightContainerViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (FeedSkylightContainerViewModel) assemVMLazy.getValue();
    }

    public final boolean Ho() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    public final int Jo() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final boolean KU() {
        IFeedSkylightHostAbility iFeedSkylightHostAbility = (IFeedSkylightHostAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedSkylightHostAbility.class, null);
        return iFeedSkylightHostAbility != null && iFeedSkylightHostAbility.KU();
    }

    public final boolean Lo() {
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISkylightListAbility.class, null);
        return iSkylightListAbility != null && iSkylightListAbility.rb2();
    }

    public final void No(boolean z) {
        String str;
        String str2;
        Map<String, String> map;
        if (C299660Boq.LIZ()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C1564490qoZ c1564490qoZ = (C1564490qoZ) this.LLIZLLLIL.getValue();
            if (c1564490qoZ == null || (map = c1564490qoZ.LL) == null || (str2 = map.get("enter_from")) == null) {
                str2 = "";
            }
            if (c0rggLIZ.LIZJ(str2)) {
                return;
            }
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("FeedSkylightMaskAssem", "toggleSkylightListShowStatus changes the skylight visibility by gesture, isShow: isShow");
        FeedSkylightContainerViewModel feedSkylightContainerViewModelGo = Go();
        if (z) {
            str = "pull_down";
        } else {
            str = "unknown";
        }
        FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModelGo, z, str, false, false, false, null, 60);
        Go().zQ2(!z, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((C20299514bp) LJJIJL()).setListener(new InterfaceC20299614bq() { // from class: X.0rbM
            @Override // X.InterfaceC20299614bq
            public final void LIZ() {
                if (this.LIZ.Go().xQ2()) {
                    this.LIZ.No(false);
                }
            }

            @Override // X.InterfaceC20299614bq
            public final boolean LIZIZ() {
                if (this.LIZ.Go().xQ2()) {
                    return (this.LIZ.KU() && (this.LIZ.Jo() == 0 || this.LIZ.Jo() == 2)) ? false : true;
                }
                if (!this.LIZ.KU()) {
                    if (this.LIZ.Ho()) {
                        return this.LIZ.Go().xQ2();
                    }
                    return false;
                }
                int iJo = this.LIZ.Jo();
                if (iJo != 0) {
                    if (iJo == 1) {
                        return true;
                    }
                    if (iJo == 2 && !this.LIZ.Go().xQ2()) {
                        return this.LIZ.Go().getState().LLILZLL.LIZ.booleanValue() ? C305290Bxv.LIZ() && this.LIZ.Lo() : this.LIZ.Lo();
                    }
                    return false;
                }
                if (!C305290Bxv.LIZIZ() && !this.LIZ.Ho()) {
                    return this.LIZ.Go().vQ2();
                }
                if (this.LIZ.Go().xQ2()) {
                    return false;
                }
                C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                if (c1589640rT8.LLLLLLL()) {
                    return (C305290Bxv.LIZ() || this.LIZ.Ho()) && this.LIZ.Lo() && (c1589640rT8.D1() ^ true);
                }
                return this.LIZ.Lo();
            }

            @Override // X.InterfaceC20299614bq
            public final boolean LIZLLL() {
                return this.LIZ.Go().xQ2();
            }

            @Override // X.InterfaceC20299614bq
            public final void LJ() {
                int iJo = this.LIZ.Jo();
                if (iJo != 0) {
                    if (iJo == 1) {
                        this.LIZ.No(true);
                        return;
                    } else {
                        if (iJo == 2) {
                            FeedSkylightMaskAssem feedSkylightMaskAssem = this.LIZ;
                            feedSkylightMaskAssem.No(true ^ feedSkylightMaskAssem.Go().xQ2());
                            return;
                        }
                        return;
                    }
                }
                if (this.LIZ.Ho()) {
                    if (this.LIZ.KU() || !this.LIZ.Go().xQ2()) {
                        this.LIZ.No(true);
                        return;
                    } else {
                        this.LIZ.No(false);
                        return;
                    }
                }
                if (C305290Bxv.LIZIZ()) {
                    FeedSkylightMaskAssem feedSkylightMaskAssem2 = this.LIZ;
                    feedSkylightMaskAssem2.No(true ^ feedSkylightMaskAssem2.Go().xQ2());
                } else if (this.LIZ.Go().vQ2()) {
                    this.LIZ.No(true);
                }
            }

            @Override // X.InterfaceC20299614bq
            public final void LJFF() {
                IFeedSkylightHostAbility iFeedSkylightHostAbility;
                Aweme awemeG3;
                LiveRoomStruct liveRoomStructFinally;
                if (this.LIZ.Go().xQ2()) {
                    this.LIZ.No(false);
                    FeedSkylightMaskAssem feedSkylightMaskAssem = this.LIZ;
                    if (feedSkylightMaskAssem.Jo() != 2 || (iFeedSkylightHostAbility = (IFeedSkylightHostAbility) C1558520qew.LIZ(C1558520qew.LJIIL(feedSkylightMaskAssem), IFeedSkylightHostAbility.class, null)) == null || (awemeG3 = iFeedSkylightHostAbility.G3()) == null || !AwemeSaaSExtKt.isLive(awemeG3)) {
                        return;
                    }
                    C998960c6Q.LIZ.getClass();
                    int i = C998960c6Q.LIZIZ;
                    if (i != 0) {
                        boolean z = !Intrinsics.LJFF(feedSkylightMaskAssem.Go().getState().LLILLL.LIZ.LIZJ, "click");
                        if ((i == 1 || (i == 2 && z)) && (liveRoomStructFinally = AwemeExtKt.getLiveRoomStructFinally(awemeG3)) != null) {
                            C1440005kM.LIZ(new C1594770rbP(liveRoomStructFinally.id));
                        }
                    }
                }
            }

            @Override // X.InterfaceC20299614bq
            public final boolean LIZJ() {
                return C299660Boq.LIZ();
            }
        });
    }
}
