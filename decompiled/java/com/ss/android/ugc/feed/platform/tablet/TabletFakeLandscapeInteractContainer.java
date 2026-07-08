package com.ss.android.ugc.feed.platform.tablet;

import X.C01GW;
import X.C0P0T;
import X.C0RQ6;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723830SaL;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeContainerAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TabletFakeLandscapeInteractContainer extends BaseContainer<VContainerProtocol, TabletFakeLandscapeInteractContainer> implements TabletFakeLandscapeContainerAbility, InterfaceC1554640qYg {
    public View LLJLILLLLZIIL;
    public C0P0T LLJLL;
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1312));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(585));
    public final int LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public final int LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2131273863) {
            return null;
        }
        return this;
    }

    public final void op() {
        Integer numIa;
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLJL.getValue();
        if (rootCellCommonAbility == null || (numIa = rootCellCommonAbility.Ia()) == null) {
            return;
        }
        int iIntValue = numIa.intValue();
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            int height = ((View) view.getParent()).getHeight();
            layoutParams.removeRule(8);
            layoutParams.bottomMargin = 0;
            layoutParams.addRule(10);
            layoutParams.topMargin = Math.min(iIntValue + this.LLJLLIL, (height - this.LLJLLL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeContainerAbility
    public final void LJJLIIIIJ() {
        op();
        C0P0T c0p0t = this.LLJLL;
        if (c0p0t == null || !c0p0t.isShowing()) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return C0RQ6.TABLET_FAKE_LANDSCAPE_INTERACT_CONTAINER;
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeContainerAbility
    public final void z40() {
        op();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLILLLLZIIL = LJJIJL().findViewById(R.id.m5d);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 364));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0REy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(225), 6);
    }
}
