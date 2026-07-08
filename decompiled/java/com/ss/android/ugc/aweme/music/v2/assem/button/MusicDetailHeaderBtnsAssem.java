package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C418440Gaw;
import X.C426750GoL;
import X.C628830OlV;
import X.C638460P2m;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicDetailHeaderBtnsAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public class MusicDetailHeaderBtnsAssem extends DynamicAssem {
    public C638460P2m LLJJI;
    public final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, C628830OlV>> it2 = ip().LLJILJIL.entrySet().iterator();
        while (it2.hasNext()) {
            C628830OlV value = it2.next().getValue();
            value.LLIZLLLIL = R.id.fq6;
            arrayList.add(value);
        }
        C723850SaN.LIZLLL(this, new AwS375S0200000_9(this, (MusicDetailHeaderBtnsAssem) arrayList, (List<C628830OlV>) 81));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        C786410Ut5.b6(horizontalScrollView, new ViewGroup.LayoutParams(-1, -2));
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setScrollBarSize(0);
        C638460P2m c638460P2m = new C638460P2m(context, null);
        c638460P2m.setId(R.id.fq6);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i = this.LLJJIJI;
        int i2 = this.LLJJIII;
        marginLayoutParams.setMargins(i, i2, i, i2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c638460P2m);
        c638460P2m.setLayoutParams(marginLayoutParams);
        c638460P2m.setOrientation(0);
        c638460P2m.setGravity(16);
        this.LLJJI = c638460P2m;
        horizontalScrollView.addView(c638460P2m);
        Zo(horizontalScrollView);
        super.xo();
    }

    public final void lp(LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        int iLIZIZ2;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = null;
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                if (i == 0) {
                    iLIZIZ = 0;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 4, Resources.getSystem().getDisplayMetrics()));
                }
                layoutParams.setMarginStart(iLIZIZ);
                if (i == linearLayout.getChildCount() - 1) {
                    iLIZIZ2 = 0;
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 4, Resources.getSystem().getDisplayMetrics()));
                }
                layoutParams.setMarginEnd(iLIZIZ2);
                if (linearLayout.getChildCount() <= 2) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    childAt.measure(0, 0);
                    layoutParams.width = childAt.getMeasuredWidth();
                    layoutParams.weight = 0.0f;
                }
                layoutParams3 = layoutParams;
            }
            C786410Ut5.W5(childAt, layoutParams3);
        }
        if (linearLayout.getChildCount() != 0) {
            C426750GoL.LJIIIZ(linearLayout, Integer.valueOf(this.LLJJIJI), Integer.valueOf(this.LLJJIII), Integer.valueOf(this.LLJJIJI), Integer.valueOf(this.LLJJIII), false, 16);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        C638460P2m c638460P2m = this.LLJJI;
        if (c638460P2m != null) {
            c638460P2m.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.0P2p
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewAdded(View view2, View view3) {
                    MusicDetailHeaderBtnsAssem musicDetailHeaderBtnsAssem = this.LL;
                    C638460P2m c638460P2m2 = musicDetailHeaderBtnsAssem.LLJJI;
                    if (c638460P2m2 == null) {
                        return;
                    }
                    View contentView = musicDetailHeaderBtnsAssem.getContentView();
                    int i = 0;
                    if (c638460P2m2.getChildCount() == 0) {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, contentView);
                    HandlerHook.viewPost(c638460P2m2, new ARunnableS78S0200000_9(this.LL, c638460P2m2, 35));
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewRemoved(View view2, View view3) {
                    MusicDetailHeaderBtnsAssem musicDetailHeaderBtnsAssem = this.LL;
                    C638460P2m c638460P2m2 = musicDetailHeaderBtnsAssem.LLJJI;
                    if (c638460P2m2 == null) {
                        return;
                    }
                    View contentView = musicDetailHeaderBtnsAssem.getContentView();
                    int i = 0;
                    if (c638460P2m2.getChildCount() == 0) {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, contentView);
                    HandlerHook.viewPost(c638460P2m2, new ARunnableS78S0200000_9(this.LL, c638460P2m2, 36));
                }
            });
        }
    }
}
