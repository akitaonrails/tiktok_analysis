package com.ss.android.ugc.aweme.arch.widgets.base;

import X.AbstractC813200VvC;
import X.C1052980dVY;
import X.C1053000dVa;
import X.C18L3;
import X.C19EG;
import X.C19EH;
import X.C786410Ut5;
import X.InterfaceC487670JAn;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class WidgetManager extends Fragment {
    public static final String LLJIJIL = WidgetManager.class.getCanonicalName();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ+KiHELIOSd9PywoLionO2suKDw2ZhIlLSg2PAgtJy40LTc=";
    public Thread LL;
    public Fragment LLILZ;
    public View LLILZIL;
    public Context LLILZLL;
    public C18L3 LLIZ;
    public DataCenter LLJ;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public final C1052980dVY LLILLL = new C1052980dVY(this);
    public final List<Widget> LLIZLLLIL = new CopyOnWriteArrayList();
    public final C1053000dVa LLJI = new AbstractC813200VvC() { // from class: X.0dVa
        @Override // X.AbstractC813200VvC
        public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            WidgetManager widgetManager = this.LL;
            if (fragment == widgetManager.LLILZ) {
                fragmentManager.LLIILZL(widgetManager.LLJI);
                C19EH c19ehLJIIJ = fragment.getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIIZILJ(this.LL);
                c19ehLJIIJ.LJIIL();
            }
        }
    };

    public final void RR(ListItemWidget listItemWidget) {
        if (listItemWidget == null) {
            return;
        }
        listItemWidget.LLILZIL = this.LLILLL;
        listItemWidget.LL = this.LLILZLL;
        listItemWidget.LLILZ = this.LLJ;
        ((CopyOnWriteArrayList) this.LLIZLLLIL).add(listItemWidget);
        getLifecycle().addObserver(listItemWidget);
    }

    public final void UR(DataCenter dataCenter) {
        this.LLJ = dataCenter;
        Iterator it2 = ((CopyOnWriteArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((Widget) it2.next()).LLILZ = dataCenter;
        }
    }

    public static WidgetManager SR(View view, Fragment fragment) {
        return OR(null, fragment, view, fragment.getContext());
    }

    public final void MR(int i, Widget widget) {
        if (widget == null) {
            return;
        }
        NR(this.LLILZIL.findViewById(i), widget);
    }

    public final void NR(View view, Widget widget) {
        if (widget == null) {
            return;
        }
        widget.LLILZIL = this.LLILLL;
        widget.LL = this.LLILZLL;
        widget.LLILZ = this.LLJ;
        widget.LLILLL = view;
        ((CopyOnWriteArrayList) this.LLIZLLLIL).add(widget);
        if (this.LL == null) {
            this.LL = Looper.getMainLooper().getThread();
        }
        if (C786410Ut5.u3() == this.LL) {
            getLifecycle().addObserver(widget);
        } else {
            C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS79S0200000_10(widget, this, 103));
        }
    }

    public final void PR(int i, final Widget widget) {
        if (widget != null) {
            widget.LLILZIL = this.LLILLL;
            widget.LL = this.LLILZLL;
            widget.LLILZ = this.LLJ;
            final ViewGroup viewGroup = (ViewGroup) this.LLILZIL.findViewById(i);
            widget.LLILLJJLI = viewGroup;
            if (widget.LJIIJ() == 0) {
                widget.LLILLL = null;
                ((CopyOnWriteArrayList) this.LLIZLLLIL).add(widget);
                getLifecycle().addObserver(widget);
                return;
            }
            this.LLIZ.LIZ(widget.LJIIJ(), viewGroup, new InterfaceC487670JAn() { // from class: X.0dVZ
                @Override // X.InterfaceC487670JAn
                public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                    if (!this.LIZJ.isRemoving() && !this.LIZJ.isDetached() && this.LIZJ.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                        WidgetManager widgetManager = this.LIZJ;
                        Widget widget2 = widget;
                        ViewGroup viewGroup3 = viewGroup;
                        widgetManager.getClass();
                        widget2.LLILLL = view;
                        if ((viewGroup3 instanceof ViewGroup) && view != null) {
                            viewGroup3.addView(view);
                        }
                        ((CopyOnWriteArrayList) widgetManager.LLIZLLLIL).add(widget2);
                        widgetManager.getLifecycle().addObserver(widget2);
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it2 = ((CopyOnWriteArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((Widget) it2.next()).LJIIL(i, i2, intent);
        }
    }

    public static WidgetManager OR(C19EG c19eg, Fragment fragment, View view, Context context) {
        FragmentManager childFragmentManager;
        if (c19eg != null) {
            childFragmentManager = c19eg.getSupportFragmentManager();
        } else if (fragment != null) {
            childFragmentManager = fragment.getChildFragmentManager();
        } else {
            return null;
        }
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.LLILZ = fragment;
        widgetManager.LLILZIL = view;
        widgetManager.LLILZLL = context;
        widgetManager.LLIZ = new C18L3(context);
        C786410Ut5.ne(widgetManager.LLILZLL);
        if (fragment != null && fragment.getFragmentManager() != null) {
            fragment.getFragmentManager().LJZL(widgetManager.LLJI, false);
        }
        C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
        c19ehLJIIJ.LIZLLL(widgetManager, LLJIJIL);
        c19ehLJIIJ.LJIIL();
        return widgetManager;
    }
}
