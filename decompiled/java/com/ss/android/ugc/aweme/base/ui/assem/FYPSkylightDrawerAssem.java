package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC1604610rrH;
import X.C01GW;
import X.C0RGG;
import X.C1439490nYx;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1594870rbZ;
import X.C1604590rrF;
import X.C1604600rrG;
import X.C1604620rrI;
import X.C1605420rsa;
import X.C1618440sDa;
import X.C1620830sHR;
import X.C1620990sHh;
import X.C19252910Tv;
import X.C299660Boq;
import X.C417950Ga9;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C586380MzE;
import X.C628500Oky;
import X.C630740Ooa;
import X.C714060Rzg;
import X.C723580SZw;
import X.C724240Sb0;
import X.C814420VxA;
import X.EnumC1604570rrD;
import X.EnumC1616310sA9;
import X.InterfaceC729460SjQ;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.base.ui.assem.FYPSkylightDrawerAssem;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS21S0002000_11;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FYPSkylightDrawerAssem extends UIContentAssem implements FeedRecommendSkylightDrawerAbility {
    public final C630740Ooa LLIZLLLIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 51));
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 48));
    public final C630740Ooa LLJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 45));
    public final C630740Ooa LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C630740Ooa LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public C1604590rrF LLJJIJIIJIL;
    public C1594870rbZ LLJJIJIL;
    public boolean LLJJJ;
    public final C630740Ooa LLJJJIL;
    public final C01GW LLJJJJ;
    public final C1620830sHR LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    public final C1604620rrI Go() {
        return (C1604620rrI) this.LLIZLLLIL.getValue();
    }

    public final IViewPagerComponentAbility Ho() {
        return (IViewPagerComponentAbility) this.LLJIJIL.getValue();
    }

    public FYPSkylightDrawerAssem() {
        C628500Oky.LIZ(new AwS568S0100000_24(this, 49));
        C628500Oky.LIZ(new AwS568S0100000_24(this, 50));
        C628500Oky.LIZ(new AwS568S0100000_24(this, 56));
        this.LLJIJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 57));
        this.LLJILJIL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 47));
        this.LLJILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 54));
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 55));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 44));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 46));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(64));
        StoryHomepageService storyHomepageServiceLJJJJZ = C1618440sDa.LIZIZ.LJJJJZ();
        if (storyHomepageServiceLJJJJZ != null) {
            storyHomepageServiceLJJJJZ.LIZLLL();
        }
        this.LLJJJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 53));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 52));
        this.LLJJJJJIL = new C1620830sHR(this, 0);
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(65));
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility
    public final float Q91() {
        C1604620rrI c1604620rrIGo = Go();
        if (c1604620rrIGo != null) {
            return c1604620rrIGo.getTranslationY();
        }
        return 0.0f;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1618440sDa.LIZIZ.LJJIFFI().LJII("FYPSkylightDrawerAssem", new InterfaceC729460SjQ() { // from class: X.0rRa
            @Override // X.InterfaceC729460SjQ
            public final void LIZJ(float f) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZLLL(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJFF() {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJI(C729450SjP c729450SjP, String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZ(String str, C0SPF c0spf) {
                C614770O9j.LIZIZ.LJ().LJIJI(1, false);
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZIZ(EnumC729410SjL enumC729410SjL, String str) {
                this.LIZ.getClass();
                if (enumC729410SjL == EnumC729410SjL.PUBLISH_START) {
                    FYPSkylightDrawerAssem fYPSkylightDrawerAssem = this.LIZ;
                    fYPSkylightDrawerAssem.getClass();
                    if (C724240Sb0.LJI(fYPSkylightDrawerAssem) != null) {
                        if (C1594980rbk.LIZ().avatarType <= 0) {
                            fYPSkylightDrawerAssem.G62("publish_landing", true, true, false, null, true);
                        }
                        C614770O9j.LIZIZ.LJ().LJIJI(1, true);
                    }
                }
            }
        });
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FeedRecommendSkylightDrawerAbility.class, null);
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityHo = Ho();
        if (iViewPagerComponentAbilityHo != null) {
            iViewPagerComponentAbilityHo.Xl0(this.LLJJJJJIL);
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility
    public final boolean yw0() {
        AbstractC1604610rrH manager;
        C1604620rrI c1604620rrIGo = Go();
        return (c1604620rrIGo == null || (manager = c1604620rrIGo.getManager()) == null || !manager.LIZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility
    public final void Km(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLJJIJI.getValue()).remove(function1);
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility
    public final void lh(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLJJIJI.getValue()).add(function1);
    }

    @C14EU
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        String str;
        Map<String, String> map;
        Fragment fragmentLJI;
        if (!C299660Boq.LIZ()) {
            return;
        }
        if (EnumC1616310sA9.SWITCH_PAGE.getType() == c714060Rzg.LIZIZ && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.getUserVisibleHint()) {
            return;
        }
        String str2 = c714060Rzg.LIZLLL;
        C1564490qoZ c1564490qoZ = (C1564490qoZ) this.LLJILJIL.getValue();
        EnumC1604570rrD enumC1604570rrD = null;
        if (c1564490qoZ == null || (map = c1564490qoZ.LL) == null || (str = map.get("enter_from")) == null) {
            str = "";
        }
        if (Intrinsics.LJFF(str2, str)) {
            if (c714060Rzg.LIZ) {
                C1604590rrF c1604590rrF = this.LLJJIJIIJIL;
                if (c1604590rrF != null) {
                    enumC1604570rrD = c1604590rrF.LJIIZILJ;
                }
                if (enumC1604570rrD == EnumC1604570rrD.OPENED) {
                    this.LLJJJ = true;
                }
                if (c1604590rrF != null) {
                    C1604590rrF.LJIIIIZZ(c1604590rrF, EnumC1604570rrD.CLOSED, "clear_mode", false, false, false, false, null, 124);
                    return;
                }
                return;
            }
            if (this.LLJJJ) {
                C1604590rrF c1604590rrF2 = this.LLJJIJIIJIL;
                if (c1604590rrF2 != null) {
                    enumC1604570rrD = c1604590rrF2.LJIIZILJ;
                }
                if (enumC1604570rrD == EnumC1604570rrD.CLOSED && c1604590rrF2 != null) {
                    C1604590rrF.LJIIIIZZ(c1604590rrF2, EnumC1604570rrD.OPENED, "clear_mode", false, false, false, false, null, 124);
                }
            }
            this.LLJJJ = false;
        }
    }

    @C14EU
    public final void onPublishAnimStart(C1439490nYx c1439490nYx) {
        C1604620rrI c1604620rrIGo;
        AbstractC1604610rrH manager;
        if (Intrinsics.LJFF(c1439490nYx.LIZ, "pull_down") && (c1604620rrIGo = Go()) != null && (manager = c1604620rrIGo.getManager()) != null) {
            manager.LIZLLL();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZIZ;
        int iLIZJ;
        super.onViewCreated(view);
        View view2 = (View) this.LLJ.getValue();
        if (view2 != null) {
            C417950Ga9.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), view2);
        }
        C1604620rrI c1604620rrIGo = Go();
        if (c1604620rrIGo != null) {
            int i = C1605420rsa.LIZ;
            if (i != 1 && i != 2) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            }
            Context context = getContext();
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            C1604600rrG c1604600rrG = new C1604600rrG(0);
            c1604600rrG.LJFF = new AwS21S0002000_11(iLIZJ, iLIZIZ, 1);
            this.LLJJIJIIJIL = new C1604590rrF(c1604620rrIGo, c1604600rrG, new C1620990sHh(this, 3), new AwS390S0200000_24(c1604600rrG, this, 70), new AwS568S0100000_24(this, 1670), new AwS603S0100000_24(this, 464), new AwS603S0100000_24(this, 465), new AwS568S0100000_24(this, 1671), new AwS568S0100000_24(this, 1672));
            c1604620rrIGo.setManagerProvider(new AwS568S0100000_24(this, 1669));
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJZZI(c1604620rrIGo);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FeedRecommendSkylightDrawerAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility
    public final void G62(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        EnumC1604570rrD enumC1604570rrD;
        String str3;
        Map<String, String> map;
        C1604590rrF c1604590rrF = this.LLJJIJIIJIL;
        if (c1604590rrF != null) {
            c1604590rrF.LIZ.setManager(c1604590rrF);
        }
        if (z) {
            enumC1604570rrD = EnumC1604570rrD.OPENED;
        } else {
            enumC1604570rrD = EnumC1604570rrD.CLOSED;
        }
        if (C299660Boq.LIZ()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C1564490qoZ c1564490qoZ = (C1564490qoZ) this.LLJILJIL.getValue();
            if (c1564490qoZ == null || (map = c1564490qoZ.LL) == null || (str3 = map.get("enter_from")) == null) {
                str3 = "";
            }
            if (c0rggLIZ.LIZJ(str3)) {
                this.LLJJJ = true;
                return;
            }
        }
        C1604590rrF c1604590rrF2 = this.LLJJIJIIJIL;
        if (c1604590rrF2 == null) {
            return;
        }
        C1604590rrF.LJIIIIZZ(c1604590rrF2, enumC1604570rrD, str, z2, z3, false, z4, str2, 16);
    }
}
