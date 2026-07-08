package com.ss.android.ugc.feed.platform.tablet;

import X.C1558520qew;
import X.C1616650sAh;
import X.C19252910Tv;
import X.C299070Bnt;
import X.C341940Daq;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.ViewTreeObserverOnGlobalLayoutListenerC2189681Ams;
import Y.ACListenerS97S0300000_33;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class RewindButtonComponent extends BaseCellSlotComponent<RewindButtonComponent> implements IRewindAbility, InterfaceC1554640qYg {
    public AnimatorSet LLL;
    public AccelerateDecelerateInterpolator LLLF;
    public View LLLFF;
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 3647));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS577S0100000_33(this, 3650));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS577S0100000_33(this, 3648));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 3649));
    public final ViewTreeObserverOnGlobalLayoutListenerC2189681Ams LLLFFI = new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(this, 5);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ba0;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1311570918) {
            return null;
        }
        return this;
    }

    public final Integer Bp() {
        View view;
        Integer numValueOf;
        ViewParent parent;
        ViewParent parent2;
        View view2 = this.LLLFF;
        Object parent3 = (view2 == null || (parent = view2.getParent()) == null || (parent2 = parent.getParent()) == null) ? null : parent2.getParent();
        if (!(parent3 instanceof View) || (view = (View) parent3) == null || (numValueOf = Integer.valueOf(view.getWidth())) == null) {
            return null;
        }
        return Integer.valueOf(C341940Daq.LIZIZ(numValueOf.intValue()));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLJZIJLIL.getValue();
        if (rootCellCommonAbility != null) {
            rootCellCommonAbility.ek(this.LLLFFI);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        RootCellCommonAbility rootCellCommonAbility;
        if (!C299070Bnt.LIZ() || (rootCellCommonAbility = (RootCellCommonAbility) this.LLJZIJLIL.getValue()) == null) {
            return;
        }
        rootCellCommonAbility.ek(this.LLLFFI);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLL = new AnimatorSet();
        this.LLLF = new AccelerateDecelerateInterpolator();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.IRewindAbility
    public final void KX0(boolean z) {
        View view = this.LLLFF;
        if (view != null) {
            C1616650sAh.LIZLLL(z, view, (IViewPagerComponentAbility) this.LLJLLL.getValue(), true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.IRewindAbility
    public final void bu1(Aweme aweme) {
        View view = this.LLLFF;
        if (view != null) {
            C1616650sAh.LJIIIZ(aweme, view, (IViewPagerComponentAbility) this.LLJLLL.getValue(), Bp(), true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ImageView imageView;
        TuxTextView tuxTextView;
        this.LLLFF = view;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.tjj);
        Context context = getContext();
        if (context != null && (imageView = (ImageView) view.findViewById(R.id.tjj)) != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.tjk)) != null) {
            C1616650sAh.LIZ(context, view, imageView, tuxTextView, true);
        }
        C786410Ut5.I7(new ACListenerS97S0300000_33(view, imageView2, this, 3), view);
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.IRewindAbility
    public final void pS(float f) {
        View view = this.LLLFF;
        if (view != null) {
            C786410Ut5.T4(view, f);
            if (f == 0.0f) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILLJJLI(false);
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLJZIJLIL.getValue();
        if (rootCellCommonAbility != null) {
            rootCellCommonAbility.H8(this.LLLFFI);
        }
    }
}
