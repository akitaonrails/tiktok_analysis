package com.ss.android.ugc.aweme.detail.component.bottom;

import X.C01GW;
import X.C0SZ8;
import X.C10IT;
import X.C1266030j3B;
import X.C128Y;
import X.C14EU;
import X.C14LC;
import X.C19EG;
import X.C2189821An6;
import X.C309690CBz;
import X.C452501pT;
import X.C716550S8v;
import X.C724240Sb0;
import X.C729510SjV;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class DetailBottomContainerComponent extends BasePanelComponent implements DetailBottomAbility, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 981));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 979));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 980));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 982));
    public View LLILZIL;
    public RelativeLayout LLILZLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -252390251) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility
    public final void cV() {
        View view = this.LLILZIL;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            int i = C14LC.LJIILLIIL;
            C309690CBz.LIZ.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            if (i == 0) {
                i = iLIZIZ;
            }
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
        IDetailBottomProtocol iDetailBottomProtocol = (IDetailBottomProtocol) this.LL.getValue();
        if (iDetailBottomProtocol != null) {
            iDetailBottomProtocol.bi2();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility
    public final void MX0() {
        Fragment fragmentLJI;
        ViewGroup viewGroup;
        InterfaceC214902198i interfaceC214902198i;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || !c2189821An6.isPlaylistCleanMode() || Intrinsics.LJFF(getPanelContext().LIZ, "DETAIL_TRASH_BIN_RESTORE")) {
            IDetailBottomProtocol iDetailBottomProtocol = (IDetailBottomProtocol) this.LL.getValue();
            if (iDetailBottomProtocol != null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ == null) {
                    return;
                }
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                C128Y c128yLIZLLL = iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(getPanelContext().LJ) : null;
                if (((!(c128yLIZLLL instanceof InterfaceC214902198i) || (interfaceC214902198i = (InterfaceC214902198i) c128yLIZLLL) == null) ? c19egLIZ.isFinishing() : SAFExtensionKt.LJIIZILJ(interfaceC214902198i)) || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
                    return;
                }
                View view = fragmentLJI.getView();
                View viewFindViewById = view != null ? view.findViewById(R.id.cb7) : null;
                if (!(viewFindViewById instanceof ViewGroup) || (viewGroup = (ViewGroup) viewFindViewById) == null) {
                    View view2 = fragmentLJI.getView();
                    if (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null) {
                        return;
                    }
                }
                if (this.LLILZLL != null) {
                    return;
                }
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.LLILZLL = relativeLayout;
                this.LLILZIL = iDetailBottomProtocol.pE2(relativeLayout);
                viewGroup.addView(this.LLILZLL, new ViewGroup.LayoutParams(-1, -1));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(12);
                RelativeLayout relativeLayout2 = this.LLILZLL;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(this.LLILZIL, layoutParams);
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
            }
            DetailBottomLegacyAbility detailBottomLegacyAbility = (DetailBottomLegacyAbility) this.LLILLJJLI.getValue();
            if (detailBottomLegacyAbility != null) {
                detailBottomLegacyAbility.Cu1();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        bo(false);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1266030j3B(this, 1));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        bo(false);
    }

    public final void bo(boolean z) {
        Aweme awemeLJIIIIZZ;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        View view = this.LLILZIL;
        if (view != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLL.getValue();
            Aweme awemeLJIIIIZZ2 = null;
            if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) != null) {
                awemeLJIIIIZZ = c0sz8LJLIL.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            if (awemeLJIIIIZZ != null && C729510SjV.LJJIJIL(awemeLJIIIIZZ)) {
                awemeLJIIIIZZ2 = awemeLJIIIIZZ;
            } else {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLILLL.getValue();
                if (iFeedPanelPlatformAbility2 != null) {
                    awemeLJIIIIZZ2 = iFeedPanelPlatformAbility2.LJIIIIZZ();
                }
            }
            if (!z && C10IT.LJIIJJI(awemeLJIIIIZZ2)) {
                C786410Ut5.LJLLLLLL(4, view);
                return;
            } else {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
        }
        DetailBottomLegacyAbility detailBottomLegacyAbility = (DetailBottomLegacyAbility) this.LLILLJJLI.getValue();
        if (detailBottomLegacyAbility == null) {
            return;
        }
        detailBottomLegacyAbility.XZ();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility
    public final void mW0(boolean z) {
        bo(z);
    }

    @C14EU
    public void onCancelVideoCoverMaskEvent(C716550S8v c716550S8v) {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }
}
