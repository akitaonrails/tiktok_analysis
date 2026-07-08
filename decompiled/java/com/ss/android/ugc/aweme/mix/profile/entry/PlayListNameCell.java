package com.ss.android.ugc.aweme.mix.profile.entry;

import X.C1169370gXH;
import X.C1169380gXI;
import X.C1388190mED;
import X.C197039127h;
import X.C2187701Ajg;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C487280J9a;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import X.ViewTreeObserverOnPreDrawListenerC1208820hYu;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PlayListNameCell extends PowerCell<C1169370gXH> implements InterfaceC487330J9f {
    public C1169370gXH LL;
    public C197039127h LLILLJJLI;
    public LinearLayout LLILLL;
    public View LLILZ;
    public TuxTextView LLILZIL;
    public WeakReference<ViewTreeObserver.OnPreDrawListener> LLILZLL = new WeakReference<>(null);

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        C197039127h c197039127h;
        ViewTreeObserver viewTreeObserver;
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        if (iPostModeService != null && iPostModeService.LJJ()) {
            C487280J9a.LIZJ(this);
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.LLILZLL.get();
            if (onPreDrawListener != null && (c197039127h = this.LLILLJJLI) != null && (viewTreeObserver = c197039127h.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
                C2187701Ajg.LIZIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x02d5  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r22) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int iHashCode;
        int i;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ != null) {
            iHashCode = activityLIZ.hashCode();
        } else {
            iHashCode = -1;
        }
        C487280J9a.LIZ(iHashCode, this);
        if (!C268330AfP.LJI() && C2532609wC.LIZJ()) {
            i = R.layout.eeu;
        } else {
            i = R.layout.ees;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        if (C268330AfP.LJI()) {
            C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.l26);
            c197039127h.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_exp_profile_exp_icon_playlist_fill));
            c197039127h.setIconTintColorRes(R.attr.a01);
            return viewTd;
        }
        if (C2532609wC.LIZJ()) {
            this.LLILLL = (LinearLayout) viewTd.findViewById(R.id.qn5);
            this.LLILZ = viewTd.findViewById(R.id.fz3);
            this.LLILZIL = (TuxTextView) viewTd.findViewById(R.id.qn6);
        }
        ((TextView) viewTd.findViewById(R.id.l26)).setMinWidth(C1169380gXI.LLJJL);
        return viewTd;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1169370gXH c1169370gXH;
        ViewTreeObserver viewTreeObserver;
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null && (c1169370gXH = this.LL) != null) {
            if (C268330AfP.LJI() && (!c1169370gXH.LLJI)) {
                return;
            }
            if ((!C2532609wC.LIZJ() || c1169370gXH.LLJI) && (viewTreeObserver = c197039127h.getViewTreeObserver()) != null) {
                ViewTreeObserverOnPreDrawListenerC1208820hYu viewTreeObserverOnPreDrawListenerC1208820hYu = new ViewTreeObserverOnPreDrawListenerC1208820hYu(this, c1169370gXH, c197039127h, 0);
                if (!Intrinsics.LJFF(this.LLILZLL.get(), viewTreeObserverOnPreDrawListenerC1208820hYu)) {
                    C786410Ut5.D3(c197039127h.getViewTreeObserver(), this.LLILZLL.get());
                    this.LLILZLL = new WeakReference<>(viewTreeObserverOnPreDrawListenerC1208820hYu);
                }
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1208820hYu);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1208820hYu, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
    }

    public final boolean I5(C1169370gXH c1169370gXH, C197039127h c197039127h, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        int i;
        boolean z;
        boolean z2;
        int iMeasureText = (int) c197039127h.getPaint().measureText(String.valueOf(c1169370gXH.LLILLL));
        if (C2537109wv.LJIIIZ()) {
            i = C1169380gXI.LLJJJJLIIL;
        } else {
            i = C1169380gXI.LLJJJJJIL;
        }
        int i2 = iMeasureText + i;
        int i3 = C1169380gXI.LLJJL;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = c197039127h.getLayoutParams().width;
        boolean z3 = false;
        if ((i4 <= C1169380gXI.LLJLIL || i4 <= i2) && i4 >= i2) {
            if (!C1169380gXI.LLJLILLLLZIIL) {
                ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
                if (layoutParams.width != i2) {
                    layoutParams.width = i2;
                    C786410Ut5.J6(c197039127h, layoutParams);
                }
                if (onPreDrawListener != null) {
                    C786410Ut5.D3(c197039127h.getViewTreeObserver(), onPreDrawListener);
                }
                return true;
            }
            if (i4 == C1169380gXI.LLJLIL && C1169380gXI.LLJLL) {
                if (onPreDrawListener != null) {
                    C786410Ut5.D3(c197039127h.getViewTreeObserver(), onPreDrawListener);
                }
                return true;
            }
            if (C1169380gXI.LLJLL) {
                ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
                layoutParams2.width = C1169380gXI.LLJLIL;
                C786410Ut5.J6(c197039127h, layoutParams2);
                if (onPreDrawListener != null) {
                    C786410Ut5.D3(c197039127h.getViewTreeObserver(), onPreDrawListener);
                }
                return true;
            }
            if (c197039127h.getRight() >= C1169380gXI.LLJLLL) {
                C1169380gXI.LLJLILLLLZIIL = false;
                if (onPreDrawListener != null) {
                    C786410Ut5.D3(c197039127h.getViewTreeObserver(), onPreDrawListener);
                }
                return true;
            }
            if (getLayoutPosition() < C1169380gXI.LLJLLIL - 1) {
                if (C1169380gXI.LLJLILLLLZIIL && c197039127h.getWidth() <= C1169380gXI.LLJLIL) {
                    z3 = true;
                }
                C1169380gXI.LLJLILLLLZIIL = z3;
                return true;
            }
            if (getLayoutPosition() == C1169380gXI.LLJLLIL - 1) {
                if (C1169380gXI.LLJLILLLLZIIL && c197039127h.getWidth() <= C1169380gXI.LLJLIL) {
                    z = true;
                } else {
                    z = false;
                }
                C1169380gXI.LLJLILLLLZIIL = z;
                C1169380gXI.LLJLL = z;
                if (z) {
                    return false;
                }
                if (onPreDrawListener != null) {
                    C786410Ut5.D3(c197039127h.getViewTreeObserver(), onPreDrawListener);
                }
            }
            return true;
        }
        ViewGroup.LayoutParams layoutParams3 = c197039127h.getLayoutParams();
        layoutParams3.width = i2;
        C786410Ut5.J6(c197039127h, layoutParams3);
        if (i2 <= C1169380gXI.LLJLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1169380gXI.LLJLILLLLZIIL = z2;
        C1169380gXI.LLJLL = false;
        return true;
    }
}
