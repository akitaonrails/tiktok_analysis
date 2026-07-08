package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AbstractC1616230sA1;
import X.C0O0I;
import X.C1235870iGX;
import X.C1565810qqh;
import X.C1603210rp1;
import X.C628500Oky;
import X.C630740Ooa;
import X.C734320SrG;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1568180quW;
import X.InterfaceC1581880rGc;
import X.InterfaceC1603160row;
import X.InterfaceC1603270rp7;
import X.InterfaceC1603280rp8;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class LoadMorePanelComponentTempHelper implements ILoadMoreAbility {
    public static final boolean LLILZLL;
    public final Fragment LL;
    public TuxTextView LLILLJJLI;
    public C1603210rp1 LLILLL;
    public final C630740Ooa LLILZ = C628500Oky.LIZ(new C1565810qqh(this));
    public final List<InterfaceC1603160row> LLILZIL = new ArrayList();

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreError() {
        Wi(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    static {
        /*
            X.01GW r2 = X.C265650Ab5.LIZ
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L1c
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r1) goto L1d
        L1c:
            r1 = 0
        L1d:
            com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper.LLILZLL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper.<clinit>():void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void DR0() {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.DR0();
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 != null) {
            c1603210rp1.LIZLLL();
        }
    }

    public final ILoadMoreAbility Ew0() {
        return (ILoadMoreAbility) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final boolean ea2() {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                return iLoadMoreAbilityEw0.ea2();
            }
            return false;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 != null) {
            return c1603210rp1.LJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void f22() {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.f22();
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 != null) {
            c1603210rp1.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void oE1() {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.oE1();
                return;
            }
            return;
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText("");
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 != null) {
            int childCount = c1603210rp1.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c1603210rp1.getChildAt(i);
                if (childAt instanceof C1235870iGX) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof TuxTextView) {
                            TuxTextView tuxTextView2 = (TuxTextView) childAt2;
                            this.LLILLJJLI = tuxTextView2;
                            tuxTextView2.setText("");
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void resetLoadMoreState() {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.resetLoadMoreState();
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 != null) {
            c1603210rp1.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreEmpty() {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.showLoadMoreEmpty();
                return;
            }
            return;
        }
        Iterator<InterfaceC1603160row> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().onEmpty();
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 != null) {
            c1603210rp1.LJIIL();
        }
    }

    public LoadMorePanelComponentTempHelper(Fragment fragment) {
        this.LL = fragment;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void CV(String str) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.CV("main_feed");
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.setLabel("main_feed");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void JU0(C734320SrG c734320SrG) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.JU0(c734320SrG);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.LLJLIL.add(c734320SrG);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void La2(AbstractC1616230sA1 abstractC1616230sA1) {
        KeyEvent.Callback callbackFindViewById;
        C1603210rp1 c1603210rp1;
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.La2(abstractC1616230sA1);
                return;
            }
            return;
        }
        View view = this.LL.getView();
        if (view != null) {
            callbackFindViewById = view.findViewById(R.id.t25);
        } else {
            callbackFindViewById = null;
        }
        if (!(callbackFindViewById instanceof InterfaceC1581880rGc) || (c1603210rp1 = this.LLILLL) == null) {
            return;
        }
        c1603210rp1.LLILZ = abstractC1616230sA1;
        c1603210rp1.LLILZIL = (InterfaceC1581880rGc) callbackFindViewById;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Qx2(String str) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.Qx2(str);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.setEnterFromPage(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Sp0(InterfaceC1568180quW interfaceC1568180quW) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.Sp0(interfaceC1568180quW);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.setOnGestureTriggerExit(interfaceC1568180quW);
    }

    public final void Wi(Exception exc) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.showLoadMoreError();
                return;
            }
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1603160row) it2.next()).onFailed();
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.LJIILIIL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Xl1(InterfaceC1603280rp8 interfaceC1603280rp8) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.Xl1(interfaceC1603280rp8);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.setLoadMoreListener(interfaceC1603280rp8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void addView(View view) {
        if (view != null) {
            if (LLILZLL) {
                ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
                if (iLoadMoreAbilityEw0 != null) {
                    iLoadMoreAbilityEw0.addView(view);
                    return;
                }
                return;
            }
            C1603210rp1 c1603210rp1 = this.LLILLL;
            if (c1603210rp1 == null) {
                return;
            }
            c1603210rp1.addView(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void g82(boolean z) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.g82(z);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.setSkipTouchEvent(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void hJ2(String str) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.hJ2(str);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null || str == null || str.isEmpty()) {
            return;
        }
        ((ArrayList) c1603210rp1.LL).add(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void jb1(InterfaceC1603270rp7 interfaceC1603270rp7) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.jb1(interfaceC1603270rp7);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        c1603210rp1.LJIIIZ(interfaceC1603270rp7);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void p41(InterfaceC1603270rp7 interfaceC1603270rp7) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.p41(interfaceC1603270rp7);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        ((ArrayList) c1603210rp1.LLJJJJJIL).add(interfaceC1603270rp7);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void removeView(View view) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.removeView(view);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1603210rp1, view);
        c1603210rp1.removeView(view);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void setLoadEmptyText(CharSequence charSequence) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.setLoadEmptyText(charSequence);
                return;
            }
            return;
        }
        C1603210rp1 c1603210rp1 = this.LLILLL;
        if (c1603210rp1 == null) {
            return;
        }
        TextView textView = (TextView) C786410Ut5.Sd(R.layout.i9w, C786410Ut5.ne(c1603210rp1.getContext()), null);
        textView.setGravity(17);
        textView.setTextColor(C960203pA.LIZ(R.attr.eh, c1603210rp1.getContext()));
        textView.setText(charSequence);
        c1603210rp1.setLoadMoreEmptyView(textView);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void u31(C0O0I c0o0i) {
        if (LLILZLL) {
            ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
            if (iLoadMoreAbilityEw0 != null) {
                iLoadMoreAbilityEw0.u31(c0o0i);
                return;
            }
            return;
        }
        ((ArrayList) this.LLILZIL).add(c0o0i);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            if (LLILZLL) {
                ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
                if (iLoadMoreAbilityEw0 != null) {
                    iLoadMoreAbilityEw0.addView(view, layoutParams);
                    return;
                }
                return;
            }
            C1603210rp1 c1603210rp1 = this.LLILLL;
            if (c1603210rp1 == null) {
                return;
            }
            c1603210rp1.addView(view, layoutParams);
        }
    }
}
