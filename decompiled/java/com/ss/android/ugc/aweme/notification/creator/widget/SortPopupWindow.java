package com.ss.android.ugc.aweme.notification.creator.widget;

import X.C1308910kAL;
import X.C214906198m;
import X.C418440Gaw;
import X.C426750GoL;
import X.C434140H0q;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS41S0201000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes7.dex */
public final class SortPopupWindow extends C214906198m implements LifecycleEventObserver {
    public final Function1<NoticeSortModel, Unit> LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C434140H0q.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                lifecycleOwner.getLifecycle().removeObserver(this);
                dismiss();
                return;
            }
            return;
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        dismiss();
    }

    public SortPopupWindow(Context context, List list, AwS607S0100000_28 awS607S0100000_28) {
        int iIntValue;
        super(context);
        this.LL = awS607S0100000_28;
        setContentView(C786410Ut5.Sd(R.layout.aaw, C786410Ut5.ne(context), null));
        setHeight(-2);
        setWidth(-2);
        ViewGroup viewGroup = (ViewGroup) getContentView().findViewById(R.id.vpf);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TuxTextView tuxTextView = new TuxTextView(getContentView().getContext(), null, 6, 0);
            viewGroup.addView(tuxTextView, layoutParams);
            tuxTextView.setText(((NoticeSortModel) ListProtector.get(list, i)).sortName);
            tuxTextView.setGravity(17);
            tuxTextView.setTuxFont(52);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
            C786410Ut5.h9(tuxTextView, new ACListenerS41S0201000_6(this, list, i, 2));
            if (i < list.size() - 1) {
                View view = new View(getContentView().getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.b2t));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                view.setBackgroundColor(iIntValue);
                viewGroup.addView(view, layoutParams2);
            }
        }
    }
}
