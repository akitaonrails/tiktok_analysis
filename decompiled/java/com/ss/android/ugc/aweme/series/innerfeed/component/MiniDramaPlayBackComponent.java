package com.ss.android.ugc.aweme.series.innerfeed.component;

import X.C01GW;
import X.C0RD6;
import X.C0SFC;
import X.C0SZ8;
import X.C14EU;
import X.C1566140qrE;
import X.C1597406Ng;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C295470Bi5;
import X.C299750Boz;
import X.C426750GoL;
import X.C452501pT;
import X.C589960NBy;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import Y.ACListenerS146S0100000_11;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaPlayBackComponent extends BasePanelComponent implements InterfaceC1616070s9l {
    public View LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public AwS638S0100000_24 LLILZLL;
    public final C01GW LLIZLLLIL;
    public final C630740Ooa LLJ;
    public final C630740Ooa LLJI;
    public boolean LLJIJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(309));
    public int LLILZIL = 1;
    public float LLIZ = 1.0f;

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final IFeedPanelPlatformAbility m311do() {
        return (IFeedPanelPlatformAbility) this.LLIZLLLIL.getValue();
    }

    public final void fo() {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setEnabled(true);
        }
        View view = this.LLILLL;
        if (view != null) {
            view.setEnabled(true);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.zl);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            float f = this.LLIZ;
            Context context = tuxTextView3.getContext();
            tuxTextView3.setText(bo(f, context != null && C426750GoL.LIZLLL(context)));
        }
    }

    public MiniDramaPlayBackComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1007), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 13));
        }
        this.LLIZLLLIL = c01gwLIZIZ;
        this.LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1008));
        this.LLJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 1006));
    }

    public final void ho() {
        Aweme awemeLJIIIIZZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM311do = m311do();
        if (iFeedPanelPlatformAbilityM311do == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityM311do.LJIIIIZZ()) == null) {
            fo();
            return;
        }
        if (C0SFC.LIZIZ.LJIIIIZZ(awemeLJIIIIZZ) || awemeLJIIIIZZ.isAd()) {
            View view = this.LLILLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        View view3 = this.LLILLL;
        boolean z = false;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        C589960NBy.LIZ.getClass();
        if (!C589960NBy.LIZ(awemeLJIIIIZZ)) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setEnabled(false);
            }
            View view5 = this.LLILLL;
            if (view5 != null) {
                view5.setEnabled(false);
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.zk);
            }
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 != null) {
                float f = this.LLIZ;
                Context context = tuxTextView3.getContext();
                if (context != null && C426750GoL.LIZLLL(context)) {
                    z = true;
                }
                tuxTextView3.setText(bo(f, z));
                return;
            }
            return;
        }
        TuxTextView tuxTextView4 = this.LLILLJJLI;
        if (tuxTextView4 != null) {
            tuxTextView4.setEnabled(true);
        }
        View view6 = this.LLILLL;
        if (view6 != null) {
            view6.setEnabled(true);
        }
        TuxTextView tuxTextView5 = this.LLILLJJLI;
        if (tuxTextView5 != null) {
            tuxTextView5.setTextColorRes(R.attr.zl);
        }
        float fLIZIZ = C589960NBy.LIZIZ(awemeLJIIIIZZ);
        if (C295470Bi5.LIZ() == 1 || C295470Bi5.LIZ() == 2 || fLIZIZ <= 0.0f) {
            fLIZIZ = this.LLIZ;
        }
        int i = 0;
        for (Object obj : (List) this.LLILZ.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (fLIZIZ >= ((Number) obj).floatValue()) {
                this.LLILZIL = i;
            }
            i = i2;
        }
        TuxTextView tuxTextView6 = this.LLILLJJLI;
        if (tuxTextView6 != null) {
            Context context2 = tuxTextView6.getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                z = true;
            }
            tuxTextView6.setText(bo(fLIZIZ, z));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        AwS638S0100000_24 awS638S0100000_24 = this.LLILZLL;
        if (awS638S0100000_24 != null) {
            C589960NBy.LIZ.getClass();
            ((ArrayList) C589960NBy.LJFF).remove(awS638S0100000_24);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        View view;
        View view2;
        View view3;
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        View viewFindViewById = null;
        this.LLILLJJLI = (fragmentLJI == null || (view3 = fragmentLJI.getView()) == null) ? null : (TuxTextView) view3.findViewById(R.id.qnf);
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        this.LLILLL = (fragmentLJI2 == null || (view2 = fragmentLJI2.getView()) == null) ? null : view2.findViewById(R.id.qne);
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null && (view = fragmentLJI3.getView()) != null) {
            viewFindViewById = view.findViewById(R.id.e0j);
        }
        this.LL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 22), viewFindViewById);
        }
        View view4 = this.LLILLL;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 81), view4);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(52);
        }
        AwS638S0100000_24 awS638S0100000_24 = new AwS638S0100000_24(this, 161);
        this.LLILZLL = awS638S0100000_24;
        C589960NBy.LIZ.getClass();
        ((ArrayList) C589960NBy.LJFF).add(awS638S0100000_24);
        fo();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this);
        }
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new AwS603S0100000_24(this, 231));
        c0rd6.LIZIZ("event_on_play_progress_change", new AwS603S0100000_24(this, 232));
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        ho();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C1597406Ng c1597406Ng;
        if (c737030Svd.LIZ == 83) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof C1597406Ng) && (c1597406Ng = (C1597406Ng) obj) != null) {
                if (c1597406Ng.LIZ) {
                    ho();
                } else {
                    ho();
                }
            }
        }
    }

    public final String bo(float f, boolean z) {
        StringBuilder sbLIZ;
        if (f == 3.0f) {
            if (z) {
                return "×3.0";
            }
            return "3.0×";
        }
        if (f == 2.0f) {
            if (z) {
                return "×2.0";
            }
            return "2.0×";
        }
        if (f == 1.5f) {
            if (z) {
                return "×1.5";
            }
            return "1.5×";
        }
        if (f == 1.0f) {
            if (z) {
                return "×1.0";
            }
            return "1.0×";
        }
        if (f == 0.5f) {
            if (z) {
                return "×0.5";
            }
            return "0.5×";
        }
        if (z) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((char) 215);
            sbLIZ.append(f);
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(f);
            sbLIZ.append((char) 215);
        }
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
