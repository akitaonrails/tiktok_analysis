package com.ss.android.ugc.aweme.api.component.speedup;

import X.C01GW;
import X.C098200Yq;
import X.C0N0Y;
import X.C1009740cNo;
import X.C1017070cZd;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.C2176151AEr;
import X.C2217381BqS;
import X.C2249181D1o;
import X.C2249191D1p;
import X.C2249251D1v;
import X.C452501pT;
import X.C583160Mu2;
import X.C589960NBy;
import X.C703302op;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC689860R4e;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility;
import com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility;
import com.ss.android.ugc.aweme.ad.feed.playfun.IAdPlayFunAbility;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS45S0000100_35;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class CommerceSpeedupAssem extends BaseCellLogicComponent<CommerceSpeedupAssem> implements ICommerceSpeedupAbility, InterfaceC1554640qYg {
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS279S0000000_33.get$arr$(29));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 339));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 344));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 341));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 342));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 340));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 338));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 343));
    public long LLJJL = -1;
    public String LLJJLIIIJLLLLLLLZ;
    public C2176151AEr LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        try {
            C736680Sv4.LJIIIIZZ(this, (VideoEventDispatchViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Nyw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLJ;
                }
            }, null, AFwS294S0000000_11.get$arr$(230), 6);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 466791556) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility
    public final boolean Jy() {
        IVideoCellAbility iVideoCellAbility;
        IVideoCellAbility iVideoCellAbility2;
        InterfaceC689860R4e interfaceC689860R4eK9;
        InterfaceC689860R4e interfaceC689860R4eK92;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!C1009740cNo.LIZLLL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return false;
        }
        IAnoleMaskAbility iAnoleMaskAbility = (IAnoleMaskAbility) this.LLJJIJIIJIL.getValue();
        if ((iAnoleMaskAbility == null || !iAnoleMaskAbility.hB2()) && (((iVideoCellAbility = (IVideoCellAbility) this.LLJJIJIL.getValue()) == null || (interfaceC689860R4eK92 = iVideoCellAbility.K9()) == null || !interfaceC689860R4eK92.LLILIL()) && ((iVideoCellAbility2 = (IVideoCellAbility) this.LLJJIJIL.getValue()) == null || (interfaceC689860R4eK9 = iVideoCellAbility2.K9()) == null || !interfaceC689860R4eK9.LLILLIZIL()))) {
            return false;
        }
        this.LLJJLIIIJLLLLLLLZ = "block_by_covers";
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        IPlayerComponentAbility iPlayerComponentAbility;
        C0N0Y playerManager;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!C1017070cZd.LJJJJZI(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJJJLIIL.getValue()) == null || (playerManager = iPlayerComponentAbility.getPlayerManager()) == null) {
            return;
        }
        playerManager.setSpeed(1.0f);
    }

    @Override // com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility
    public final void z() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (C1009740cNo.LIZLLL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) && C583160Mu2.LIZJ != C583160Mu2.LIZIZ) {
            C589960NBy c589960NBy = C589960NBy.LIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
            C724270Sb3 c724270Sb33 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
            c589960NBy.getClass();
            C589960NBy.LJ(1.0f, aweme, str, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C2176151AEr c2176151AEr;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C1009740cNo.LIZLLL(videoItemParams2.getAweme())) {
            c2176151AEr = new C2176151AEr(videoItemParams2.getAweme());
        } else {
            c2176151AEr = null;
        }
        this.LLJL = c2176151AEr;
    }

    @Override // com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility
    public final void wi(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = null;
        C2176151AEr c2176151AEr = this.LLJL;
        if (c2176151AEr != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJL;
            C2249251D1v.LIZ.getClass();
            c2176151AEr.logAd(C2249251D1v.LIZJ, new AwS45S0000100_35(jCurrentTimeMillis, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility
    public final boolean RI1(float f, float f2) {
        Object obj;
        Rect rectHs2;
        boolean z;
        Rect rectHs22;
        Rect widgetRect;
        InterfaceC689860R4e interfaceC689860R4eK9;
        Rect rectLLLF;
        Rect rectMg2;
        int i;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Rect rectZl = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C1009740cNo.LIZLLL(((VideoItemParams) obj).getAweme())) {
            return false;
        }
        InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLJJJ.getValue();
        if (interactAreaAttachAbility != null) {
            rectHs2 = interactAreaAttachAbility.Hs2();
        } else {
            rectHs2 = null;
        }
        if (rectHs2 != null && rectHs2.contains((int) f, (int) f2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LLJJLIIIJLLLLLLLZ = "click_button_on_hot_area";
            return true;
        }
        InteractAreaAttachAbility interactAreaAttachAbility2 = (InteractAreaAttachAbility) this.LLJJJIL.getValue();
        if (interactAreaAttachAbility2 != null) {
            rectHs22 = interactAreaAttachAbility2.Hs2();
        } else {
            rectHs22 = null;
        }
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) this.LLJJJIL.getValue();
        if (interactRightAreaAttachAbility != null) {
            rectZl = interactRightAreaAttachAbility.Zl();
        }
        if (rectHs22 != null) {
            if (rectZl != null) {
                i = rectZl.left;
            } else {
                i = rectHs22.left;
            }
            rectHs22.left = i;
            if (rectHs22.contains((int) f, (int) f2)) {
                this.LLJJLIIIJLLLLLLLZ = "click_button_on_hot_area";
                return true;
            }
        }
        CommerceInteractionAbility commerceInteractionAbility = (CommerceInteractionAbility) this.LLJJJJ.getValue();
        if (commerceInteractionAbility != null && (rectMg2 = commerceInteractionAbility.mg2()) != null && rectMg2.contains((int) f, (int) f2)) {
            this.LLJJLIIIJLLLLLLLZ = "click_button_on_hot_area";
            return true;
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJIJIL.getValue();
        if (iVideoCellAbility != null && (interfaceC689860R4eK9 = iVideoCellAbility.K9()) != null && (rectLLLF = interfaceC689860R4eK9.LLLF()) != null && rectLLLF.contains((int) f, (int) f2)) {
            this.LLJJLIIIJLLLLLLLZ = "click_button_on_hot_area";
            return true;
        }
        IAdPlayFunAbility iAdPlayFunAbility = (IAdPlayFunAbility) this.LLJJJJJIL.getValue();
        if (iAdPlayFunAbility == null || (widgetRect = iAdPlayFunAbility.getWidgetRect()) == null || !widgetRect.contains((int) f, (int) f2)) {
            return false;
        }
        this.LLJJLIIIJLLLLLLLZ = "click_button_on_hot_area";
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility
    public final void Xl(float f, float f2) {
        if (C703302op.LIZ(this.LLJJLIIIJLLLLLLLZ)) {
            C2176151AEr c2176151AEr = this.LLJL;
            if (c2176151AEr != null) {
                String str = this.LLJJLIIIJLLLLLLLZ;
                C2249251D1v.LIZ.getClass();
                c2176151AEr.logAd(C2249251D1v.LIZLLL, new C2249181D1o(c2176151AEr, f, f2, str));
            }
            this.LLJJLIIIJLLLLLLLZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility
    public final void fs(float f, float f2) {
        this.LLJJL = System.currentTimeMillis();
        C2176151AEr c2176151AEr = this.LLJL;
        if (c2176151AEr != null) {
            C2249251D1v.LIZ.getClass();
            c2176151AEr.logAd(C2249251D1v.LIZIZ, new C2249191D1p(c2176151AEr, f, f2));
        }
    }
}
