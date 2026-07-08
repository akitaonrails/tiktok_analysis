package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.C098200Yq;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C1685300txQ;
import X.C1819620xS4;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187701Ajg;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1881340z3c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class ImageDetailFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITHELIOSViJCYrJCQ1JjonZic5OiY9LTY/ZywyOiFiLi4+LSwiPT08ZgwhKCg2DCA4KCY/DjctLiI2JjE=";
    public ImageModel LL;
    public C1324720kZq LLILLJJLI;
    public ViewPager LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final int LLILZLL = (int) (((C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(16.0f)) * 2)) / 1080.0f) * 1920.0f);
    public InterfaceC1881340z3c LLIZ;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List urls;
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.li4);
        this.LLILLJJLI = c1324720kZq;
        if (c1324720kZq != null && (layoutParams = c1324720kZq.getLayoutParams()) != null) {
            layoutParams.height = this.LLILZLL;
        }
        ViewPager viewPager = this.LLILLL;
        if (viewPager != null && (viewTreeObserver = viewPager.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0z94
                /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onGlobalLayout() {
                    /*
                        r5 = this;
                        com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.ImageDetailFragment r2 = r5.LL
                        androidx.viewpager.widget.ViewPager r1 = r2.LLILLL
                        if (r1 == 0) goto L20
                        int r0 = r1.getWidth()
                        r2.LLILZ = r0
                        int r0 = r1.getHeight()
                        r2.LLILZIL = r0
                        android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                        if (r1 == 0) goto L20
                        r1.removeOnGlobalLayoutListener(r5)
                        java.lang.Class<android.view.ViewTreeObserver$OnGlobalLayoutListener> r0 = android.view.ViewTreeObserver.OnGlobalLayoutListener.class
                        X.C2187701Ajg.LIZIZ(r1, r5, r0)
                    L20:
                        com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.ImageDetailFragment r3 = r5.LL
                        com.bytedance.android.live.base.model.ImageModel r0 = r3.LL
                        if (r0 == 0) goto L8f
                        int r4 = r0.getImageType()
                    L2a:
                        X.0z3c r0 = r3.LLIZ
                        r2 = 0
                        if (r0 == 0) goto L59
                        X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
                        if (r1 == 0) goto L59
                        X.0z3c r0 = r1.LIZ
                        java.lang.String r1 = r1.LIZIZ
                        if (r0 == 0) goto L8d
                        X.0z5U r0 = r0.LJJIIZI()
                        java.lang.Object r1 = r0.LIZ(r1)
                        boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
                        if (r0 != 0) goto L48
                        r1 = r2
                    L48:
                        java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                        if (r1 == 0) goto L8d
                        java.lang.String r0 = "scene"
                        java.lang.Object r1 = r1.get(r0)
                    L52:
                        boolean r0 = r1 instanceof java.lang.Integer
                        if (r0 == 0) goto L57
                        r2 = r1
                    L57:
                        java.lang.Integer r2 = (java.lang.Integer) r2
                    L59:
                        boolean r0 = X.C1884080z82.LIZ(r2)
                        if (r0 == 0) goto L7d
                        int r2 = r3.LLILZIL
                        int r1 = X.C1884730z95.LIZIZ(r4, r2)
                        int r0 = r3.LLILZ
                        if (r1 <= r0) goto L6e
                        int r2 = X.C1884730z95.LIZ(r4, r0)
                        r1 = r0
                    L6e:
                        X.0kZq r0 = r3.LLILLJJLI
                        if (r0 == 0) goto L75
                        X.C500260Jjc.LJJZ(r2, r0)
                    L75:
                        X.0kZq r0 = r3.LLILLJJLI
                        if (r0 == 0) goto L7c
                        X.C500260Jjc.LJLJLLL(r1, r0)
                    L7c:
                        return
                    L7d:
                        int r1 = r3.LLILZ
                        int r2 = X.C1884730z95.LIZ(r4, r1)
                        int r0 = r3.LLILZIL
                        if (r2 <= r0) goto L6e
                        int r1 = X.C1884730z95.LIZIZ(r4, r0)
                        r2 = r0
                        goto L6e
                    L8d:
                        r1 = r2
                        goto L52
                    L8f:
                        r4 = 1
                        goto L2a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC1884720z94.onGlobalLayout():void");
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ImageModel imageModel = this.LL;
        if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = (String) C13LP.LJJJLL(urls)) == null) {
            str = "";
        }
        C1324720kZq c1324720kZq2 = this.LLILLJJLI;
        if (c1324720kZq2 != null) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
            url.LJIL = true;
            url.LJJI(c1324720kZq2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gn2, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
