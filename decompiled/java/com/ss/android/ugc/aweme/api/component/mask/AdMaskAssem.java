package com.ss.android.ugc.aweme.api.component.mask;

import X.C01GW;
import X.C07CW;
import X.C1003680cE2;
import X.C1009740cNo;
import X.C1012040cRW;
import X.C1016730cZ5;
import X.C1017070cZd;
import X.C1022290ci3;
import X.C1074310e3x;
import X.C1386360mBG;
import X.C13LE;
import X.C1440005kM;
import X.C1558520qew;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C988330bpH;
import X.C988760bpy;
import X.C997050c3L;
import X.EnumC706820Ro0;
import X.InterfaceC1008930cMV;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC990810btH;
import X.InterfaceC997040c3K;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.ad.feed.mask.IAdFeedMaskAbility;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.mask.AdMaskAssem;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdMaskAssem extends BaseCellContentComponent<AdMaskAssem> implements InterfaceC997040c3K, IAdFeedMaskAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJLLL = 0;
    public C997050c3L LLJLIL;
    public Aweme LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS252S0000000_16.get$arr$(91));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 69));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 68));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(106));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(107));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1169263539) {
            return null;
        }
        return this;
    }

    public final InterfaceC1008930cMV ep() {
        IFeedService iFeedServiceLIZIZ = ((ICommerceService) this.LLJL.getValue()).LIZIZ();
        Context context = getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        return iFeedServiceLIZIZ.LIZJ(context, this.LLJLL, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType, true);
    }

    @Override // X.InterfaceC997040c3K
    public final void ra() {
        EdgeSpeedupAbility edgeSpeedupAbility;
        if (!C1003680cE2.LIZJ(this.LLJLL)) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            DataCenter dataCenter = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "ad_feed_pause_video");
            }
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Xz2(EnumC706820Ro0.ALL, false, null, false, null);
        }
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIIL(true);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Aweme aweme = this.LLJLL;
            if (!ShakeEggSetting.LIZ().closeShakeEgg && C1016730cZ5.LIZIZ.LIZ(aweme)) {
                C1074310e3x.LIZ(c19egLIZ).LLIZ.setValue("ad_mask_block");
            }
        }
        C1012040cRW.LIZIZ().LIZLLL = true;
        InterfaceC1008930cMV interfaceC1008930cMVEp = ep();
        if (interfaceC1008930cMVEp != null) {
            interfaceC1008930cMVEp.LJIILL(new C988760bpy(true));
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        C1440005kM.LIZ(new C988330bpH(true, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid()));
        C724270Sb3 c724270Sb33 = this.LLJI;
        DataCenter dataCenter2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.zQ2(Boolean.TRUE, "ad_init_play_fun_egg");
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (!C1009740cNo.LIZLLL(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme()) || (edgeSpeedupAbility = (EdgeSpeedupAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) == null) {
            return;
        }
        edgeSpeedupAbility.wi(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected: aweme is ");
        sbLIZ.append(this.LLJLL);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLLIL = false;
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.LJL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnbind: aweme is ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        C2188811AlT.LIZIZ(sbLIZ);
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.onUnbind();
        }
        this.LLJLIL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAdFeedMaskAbility
    public final void Hd(boolean z) {
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.LJ(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.LJFF();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.LJI();
        }
    }

    @Override // X.InterfaceC997040c3K
    public final void cd(boolean z) {
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (z) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            DataCenter dataCenter = ((VideoItemParams) obj2).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "ad_feed_resume_video");
            }
            ((IAdSceneService) this.LLJLILLLLZIIL.getValue()).LIZIZ();
            C1022290ci3.LJIJJLI(1, 0, getContext(), this.LLJLL);
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Xz2(EnumC706820Ro0.ALL, true, null, false, null);
        }
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIIL(false);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Aweme aweme = this.LLJLL;
            if (!ShakeEggSetting.LIZ().closeShakeEgg && C1016730cZ5.LIZIZ.LIZ(aweme)) {
                C1074310e3x.LIZ(c19egLIZ).LLIZLLLIL.setValue("ad_mask_block");
            }
        }
        C1012040cRW.LIZIZ().LIZLLL = false;
        InterfaceC1008930cMV interfaceC1008930cMVEp = ep();
        if (interfaceC1008930cMVEp != null) {
            interfaceC1008930cMVEp.LJIILL(new C988760bpy(false));
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        C1440005kM.LIZ(new C988330bpH(false, ((VideoItemParams) obj).getAweme().getAid()));
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        }
        DataCenter dataCenter2 = ((VideoItemParams) obj3).dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.zQ2(Boolean.FALSE, "ad_init_play_fun_egg");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (C1017070cZd.LJ(videoItemParams.getAweme()) && C07CW.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAdFeedMaskAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hQ(int r13) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.mask.AdMaskAssem.hQ(int):boolean");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0c3E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJ;
            }
        }, null, AFwS300S0000000_16.get$arr$(12), 6);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0buO] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        final VideoItemParams videoItemParams2 = videoItemParams;
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.onUnbind();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: aweme is ");
        sbLIZ.append(videoItemParams2.getAweme());
        C2188811AlT.LIZIZ(sbLIZ);
        C997050c3L c997050c3L2 = new C997050c3L(new InterfaceC990810btH() { // from class: X.0buO
            @Override // X.InterfaceC990810btH
            public final View LJIJI() {
                return this.LIZ.LJJIJL();
            }

            @Override // X.InterfaceC990810btH
            public final DataCenter LJJIIZI() {
                return videoItemParams2.dataCenter;
            }

            @Override // X.InterfaceC988550bpd
            public final Aweme getAweme() {
                return videoItemParams2.getAweme();
            }

            @Override // X.InterfaceC990810btH
            public final Fragment getFragment() {
                return C724240Sb0.LJI(this.LIZ);
            }

            @Override // X.InterfaceC990810btH
            public final AdMaskAssem LIZJ() {
                return this.LIZ;
            }
        });
        c997050c3L2.initialize();
        this.LLJLIL = c997050c3L2;
        c997050c3L2.onBind();
        this.LLJLL = videoItemParams2.getAweme();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected: aweme is ");
        sbLIZ.append(aweme);
        sbLIZ.append(", position is ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLLIL = false;
        C997050c3L c997050c3L = this.LLJLIL;
        if (c997050c3L != null) {
            c997050c3L.LJJLJLI();
        }
    }
}
