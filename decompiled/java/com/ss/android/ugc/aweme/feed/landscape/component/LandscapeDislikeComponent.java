package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C0SR4;
import X.C0SZ8;
import X.C1210880hcE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2189821An6;
import X.C452501pT;
import X.C692480REg;
import X.C711330RvH;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeDislikeComponent extends BasePanelComponent {
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 404));

    public final LandscapeFeedViewPagerAbility bo() {
        return (LandscapeFeedViewPagerAbility) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        String from;
        PagerAdapter adapter;
        C0SZ8 c0sz8LJLIL;
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility;
        C0SR4 c0sr4;
        int iHu;
        VerticalViewPager verticalViewPagerSP1;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        Integer numValueOf = null;
        if (c2189821An6 != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        int iLJLLJ = 0;
        if (u.LJIJI(from, "homepage_hot", false)) {
            if (C692480REg.LIZ()) {
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo = bo();
                if (landscapeFeedViewPagerAbilityBo != null && (verticalViewPagerSP1 = landscapeFeedViewPagerAbilityBo.sP1()) != null) {
                    adapter = verticalViewPagerSP1.getAdapter();
                } else {
                    adapter = null;
                }
                if ((adapter instanceof C711330RvH) && (c0sr4 = (C0SR4) adapter) != null) {
                    Aweme aweme = c1210880hcE.LIZ;
                    LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo2 = bo();
                    if (landscapeFeedViewPagerAbilityBo2 != null) {
                        iHu = landscapeFeedViewPagerAbilityBo2.hu(c1210880hcE.LIZ);
                    } else {
                        iHu = 0;
                    }
                    c0sr4.LJJJJLI(iHu, aweme);
                }
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo3 = bo();
                if (landscapeFeedViewPagerAbilityBo3 != null && landscapeFeedViewPagerAbilityBo3.getItemCount() == 0) {
                    C19EG c19egLIZ = getPanelContext().LIZ();
                    if (c19egLIZ != null) {
                        c19egLIZ.finish();
                        return;
                    }
                    return;
                }
                Fragment fragment = getPanelContext().LJ;
                if (fragment != null && (landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), LandscapeFeedPlayerAbility.class, null)) != null) {
                    LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo4 = bo();
                    if (landscapeFeedViewPagerAbilityBo4 != null) {
                        numValueOf = Integer.valueOf(landscapeFeedViewPagerAbilityBo4.LJLLJ());
                    }
                    landscapeFeedPlayerAbility.Hz0(numValueOf);
                }
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo5 = bo();
                if (landscapeFeedViewPagerAbilityBo5 != null && (c0sz8LJLIL = landscapeFeedViewPagerAbilityBo5.LJLIL()) != null) {
                    LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityBo6 = bo();
                    if (landscapeFeedViewPagerAbilityBo6 != null) {
                        iLJLLJ = landscapeFeedViewPagerAbilityBo6.LJLLJ();
                    }
                    c0sz8LJLIL.LJJIJIIJIL(iLJLLJ);
                    return;
                }
                return;
            }
            C19EG c19egLIZ2 = getPanelContext().LIZ();
            if (c19egLIZ2 != null) {
                c19egLIZ2.finish();
            }
        }
    }
}
