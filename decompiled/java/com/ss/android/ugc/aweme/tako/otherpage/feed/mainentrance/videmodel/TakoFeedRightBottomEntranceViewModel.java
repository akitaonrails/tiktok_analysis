package com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel;

import X.C0IDR;
import X.C118300cf;
import X.C14T5;
import X.C2189821An6;
import X.C259800zU;
import X.C709570RsR;
import X.C718560SGo;
import X.C786410Ut5;
import X.C817403Hg;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnPreDrawListenerC429930GtT;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS10S0002000_11;
import kotlin.jvm.internal.AwS250S0300000_6;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoFeedRightBottomEntranceViewModel extends ITakoFeedRightBottomEntranceViewModel {
    public AwS555S0100000_11 LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C709570RsR(1.0f, 0, 0, false, true);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel
    public final void yQ2() {
        AwS555S0100000_11 awS555S0100000_11 = this.LL;
        if (awS555S0100000_11 != null) {
            awS555S0100000_11.invoke();
        }
        this.LL = null;
        this.LLILLJJLI = false;
        C718560SGo c718560SGo = new C718560SGo(new AwS590S0100000_11(this, 275));
        EventBus.LIZLLL().LJIJJ(c718560SGo);
        this.LL = new AwS555S0100000_11(c718560SGo, 1632);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel
    public final void zQ2() {
        AwS555S0100000_11 awS555S0100000_11 = this.LL;
        if (awS555S0100000_11 != null) {
            awS555S0100000_11.invoke();
        }
        this.LL = null;
        this.LLILLJJLI = false;
        setState(AFwS243S0000000_11.get$arr$(492));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AwS555S0100000_11 awS555S0100000_11 = this.LL;
        if (awS555S0100000_11 != null) {
            awS555S0100000_11.invoke();
        }
        this.LL = null;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel
    public final void vQ2(boolean z) {
        setState(new AwS26S0010000_11(z, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0GtT, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel
    public final void wQ2(View view) {
        final AwS462S0200000_27 awS462S0200000_27 = new AwS462S0200000_27(this, view, 7);
        ViewParent parent = view.getParent();
        final C259800zU c259800zU = new C259800zU();
        T parent2 = parent;
        while (true) {
            if (!(parent2 instanceof View)) {
                break;
            }
            View view2 = (View) parent2;
            if (view2.getId() == R.id.widget_container) {
                c259800zU.element = parent2;
                break;
            }
            parent2 = view2.getParent();
        }
        if (c259800zU.element != 0) {
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = ((View) c259800zU.element).getVisibility();
            final C817403Hg c817403Hg = new C817403Hg();
            c817403Hg.element = ((View) c259800zU.element).getAlpha();
            awS462S0200000_27.invoke(Integer.valueOf(c118300cf.element), Float.valueOf(c817403Hg.element));
            ?? r3 = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0GtT
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int visibility = c259800zU.element.getVisibility();
                    float alpha = c259800zU.element.getAlpha();
                    C118300cf c118300cf2 = c118300cf;
                    if (visibility == c118300cf2.element && alpha == c817403Hg.element) {
                        return true;
                    }
                    c118300cf2.element = visibility;
                    c817403Hg.element = alpha;
                    awS462S0200000_27.invoke(Integer.valueOf(visibility), Float.valueOf(alpha));
                    return true;
                }
            };
            if (((View) c259800zU.element).isAttachedToWindow() && ((View) c259800zU.element).getViewTreeObserver().isAlive()) {
                C786410Ut5.y3(((View) c259800zU.element).getViewTreeObserver(), r3);
            }
            C0IDR c0idr = new C0IDR(r3, 8);
            ((View) c259800zU.element).addOnAttachStateChangeListener(c0idr);
            final AwS250S0300000_6 awS250S0300000_6 = new AwS250S0300000_6(c259800zU, (ViewTreeObserverOnPreDrawListenerC429930GtT) r3, c0idr, 22);
            addCloseable(new AutoCloseable() { // from class: X.0RsY
                @Override // java.lang.AutoCloseable
                public final void close() {
                    awS250S0300000_6.invoke();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel
    public final void AQ2(int i, int i2) {
        setState(new AwS10S0002000_11(i, i2, 0));
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel
    public final void xQ2(InterfaceC665370Q7z interfaceC665370Q7z, Context context, C2189821An6 c2189821An6, Aweme aweme) {
        C14T5.LIZ(interfaceC665370Q7z, context, c2189821An6, aweme);
    }
}
