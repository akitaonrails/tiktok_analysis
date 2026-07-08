package com.ss.android.ugc.aweme.tako.feed.topicon;

import X.C09RD;
import X.C09RE;
import X.C1857750yRZ;
import X.C418440Gaw;
import X.C426750GoL;
import X.C705890RmV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1584350rKb;
import X.InterfaceC1570900qyu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoTabIconLayoutProtocol implements TabIconCustomLayoutProtocol {
    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final void WT0(ViewGroup viewGroup) {
        View childAt;
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        ViewGroup viewGroup2 = null;
        ViewGroup viewGroup3 = null;
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view = (View) c09re.next();
            Object tag = view.getTag();
            if (Intrinsics.LJFF(tag, EnumC1584350rKb.SEARCH.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup2 = (ViewGroup) view;
                } else {
                    viewGroup2 = null;
                }
            } else if (Intrinsics.LJFF(tag, EnumC1584350rKb.TAKO.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup3 = (ViewGroup) view;
                } else {
                    viewGroup3 = null;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            C786410Ut5.W5(viewGroup, layoutParams);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            if (viewGroup2 != null) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = iLIZIZ;
                    layoutParams2.height = iLIZIZ2;
                    C786410Ut5.W5(viewGroup2, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            if (viewGroup2 != null && (childAt = viewGroup2.getChildAt(0)) != null) {
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = iLIZIZ;
                    layoutParams4.height = iLIZIZ2;
                    layoutParams4.gravity = 8388627;
                    C786410Ut5.W5(childAt, layoutParams4);
                    if (C426750GoL.LIZLLL(childAt.getContext())) {
                        C1857750yRZ.LJIILIIL(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), childAt);
                    } else {
                        C1857750yRZ.LJIIL(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), childAt);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            if (viewGroup3 != null) {
                ViewGroup.LayoutParams layoutParams5 = viewGroup3.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.width = iLIZIZ3;
                    layoutParams5.height = iLIZIZ4;
                    C786410Ut5.W5(viewGroup3, layoutParams5);
                    View childAt2 = viewGroup3.getChildAt(0);
                    if (childAt2 != null) {
                        ViewGroup.LayoutParams layoutParams6 = childAt2.getLayoutParams();
                        if (layoutParams6 != null) {
                            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                            layoutParams7.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                            layoutParams7.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                            layoutParams7.gravity = 8388629;
                            C786410Ut5.W5(childAt2, layoutParams7);
                            if (C426750GoL.LIZLLL(childAt2.getContext())) {
                                C1857750yRZ.LJIIL(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))), childAt2);
                                return;
                            } else {
                                C1857750yRZ.LJIILIIL(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))), childAt2);
                                return;
                            }
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final void Yv2(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            C786410Ut5.W5(viewGroup, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final boolean eJ(Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair) {
        List<? extends InterfaceC1570900qyu> second = pair.getSecond();
        if ((second instanceof Collection) && second.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = second.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((InterfaceC1570900qyu) it2.next()).getTag(), EnumC1584350rKb.TAKO.getTag())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final void vo2(C705890RmV c705890RmV) {
        ViewGroup.LayoutParams layoutParams = c705890RmV.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            C786410Ut5.W5(c705890RmV, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
