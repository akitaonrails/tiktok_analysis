package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AbstractC1616230sA1;
import X.C0O0I;
import X.C1235870iGX;
import X.C1389300mG0;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1603210rp1;
import X.C2189821An6;
import X.C734320SrG;
import X.C735610StL;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1554640qYg;
import X.InterfaceC1568180quW;
import X.InterfaceC1603160row;
import X.InterfaceC1603270rp7;
import X.InterfaceC1603280rp8;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class LoadMorePanelComponent extends BasePanelUIComponent implements ILoadMoreAbility, InterfaceC743730TFj, InterfaceC1554640qYg {
    public C1603210rp1 LLJIJIL;
    public final List<InterfaceC1603160row> LLJILJIL = new ArrayList();

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 519754333) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreError() {
        Wi(null);
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreEmpty() {
        Iterator<InterfaceC1603160row> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onEmpty();
        }
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void DR0() {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final boolean ea2() {
        C1603210rp1 c1603210rp1Go;
        if (so() && (c1603210rp1Go = Go()) != null) {
            return c1603210rp1Go.LJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void f22() {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void oE1() {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            int childCount = c1603210rp1Go.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c1603210rp1Go.getChildAt(i);
                if (childAt instanceof C1235870iGX) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof TuxTextView) {
                            ((TextView) childAt2).setText("");
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void resetLoadMoreState() {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.LJIIJ();
        }
    }

    public final C1603210rp1 Go() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void CV(String str) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.setLabel("main_feed");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void JU0(C734320SrG c734320SrG) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.LLJLIL.add(c734320SrG);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void La2(AbstractC1616230sA1 abstractC1616230sA1) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            Fragment fragment = getPanelContext().LJ;
            IRefreshAbility iRefreshAbility = null;
            if (fragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) != null) {
                iRefreshAbility = (IRefreshAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IRefreshAbility.class, null);
            }
            c1603210rp1Go.LLILZ = abstractC1616230sA1;
            c1603210rp1Go.LLILZLL = iRefreshAbility;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Qx2(String str) {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.setEnterFromPage(str);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Sp0(InterfaceC1568180quW interfaceC1568180quW) {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.setOnGestureTriggerExit(interfaceC1568180quW);
        }
    }

    public final void Wi(Exception exc) {
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1603160row) it2.next()).onFailed();
        }
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.LJIILIIL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Xl1(InterfaceC1603280rp8 interfaceC1603280rp8) {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.setLoadMoreListener(interfaceC1603280rp8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void addView(View view) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.addView(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void g82(boolean z) {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.setSkipTouchEvent(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void hJ2(String str) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null && str != null && !str.isEmpty()) {
            ((ArrayList) c1603210rp1.LL).add(str);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void jb1(InterfaceC1603270rp7 interfaceC1603270rp7) {
        C1603210rp1 c1603210rp1Go = Go();
        if (c1603210rp1Go != null) {
            c1603210rp1Go.LJIIIZ(interfaceC1603270rp7);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int pageType;
        View view2;
        AbstractC1616230sA1 abstractC1616230sA1;
        C1603210rp1 c1603210rp1;
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        String eventType = null;
        if (!Intrinsics.LJFF(Go(), viewLJJIJL)) {
            if (viewLJJIJL instanceof C1603210rp1) {
                c1603210rp1 = (C1603210rp1) viewLJJIJL;
            } else {
                c1603210rp1 = null;
            }
            this.LLJIJIL = c1603210rp1;
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (view2 = fragment.getView()) != null && (abstractC1616230sA1 = (AbstractC1616230sA1) view2.findViewById(R.id.viewpager)) != null) {
            La2(abstractC1616230sA1);
        }
        resetLoadMoreState();
        if (C1389300mG0.LJII(getPanelContext()) || C1389300mG0.LJIJJLI(getPanelContext())) {
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                pageType = c2189821An6.getPageType();
            } else {
                pageType = 0;
            }
            C2189821An6 c2189821An62 = getPanelContext().LIZJ;
            if (c2189821An62 != null) {
                eventType = c2189821An62.getEventType();
            }
            String strLIZ = C735610StL.LIZ(pageType, eventType, true);
            if (strLIZ != null) {
                Qx2(strLIZ);
            }
        }
        C2189821An6 c2189821An63 = getPanelContext().LIZJ;
        if (c2189821An63 != null && !c2189821An63.isSupportGestureExit()) {
            return;
        }
        Sp0(new InterfaceC1568180quW() { // from class: X.0hgZ
            @Override // X.InterfaceC1568180quW
            public final void LIZ() {
                C19EG activity;
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                C128Y c128yLIZLLL = iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(this.LIZ.getPanelContext().LJ) : null;
                if (c128yLIZLLL instanceof InterfaceC214902198i) {
                    ((InterfaceC214902198i) c128yLIZLLL).finish();
                    return;
                }
                Fragment fragment2 = this.LIZ.getPanelContext().LJ;
                if (fragment2 == null || (activity = fragment2.getActivity()) == null) {
                    return;
                }
                activity.finish();
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void p41(InterfaceC1603270rp7 interfaceC1603270rp7) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            ((ArrayList) c1603210rp1.LLJJJJJIL).add(interfaceC1603270rp7);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void removeView(View view) {
        C1603210rp1 c1603210rp1;
        if (view != null && (c1603210rp1 = this.LLJIJIL) != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1603210rp1, view);
            c1603210rp1.removeView(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void setLoadEmptyText(CharSequence charSequence) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            TextView textView = (TextView) C786410Ut5.Sd(R.layout.i9w, C786410Ut5.ne(c1603210rp1.getContext()), null);
            textView.setGravity(17);
            textView.setTextColor(C960203pA.LIZ(R.attr.eh, c1603210rp1.getContext()));
            textView.setText(charSequence);
            c1603210rp1.setLoadMoreEmptyView(textView);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void u31(C0O0I c0o0i) {
        ((ArrayList) this.LLJILJIL).add(c0o0i);
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        View viewFindViewById;
        C1603210rp1 c1603210rp1 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.nns);
        } else {
            viewFindViewById = null;
        }
        if (!Intrinsics.LJFF(Go(), viewFindViewById)) {
            if (viewFindViewById instanceof C1603210rp1) {
                c1603210rp1 = (C1603210rp1) viewFindViewById;
            }
            this.LLJIJIL = c1603210rp1;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C1603210rp1 c1603210rp1;
        if (view != null && (c1603210rp1 = this.LLJIJIL) != null) {
            c1603210rp1.addView(view, layoutParams);
        }
    }
}
