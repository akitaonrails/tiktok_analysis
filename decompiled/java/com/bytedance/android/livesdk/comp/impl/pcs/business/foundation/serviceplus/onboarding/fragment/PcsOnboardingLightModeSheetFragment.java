package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment;

import X.C0DRA;
import X.C19EG;
import X.C1A6V;
import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PcsOnboardingLightModeSheetFragment extends LiveSheetFragment {
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(67108864);
            C0DRA.LIZ(window, false);
            window.setStatusBarColor(0);
            new C1A6V(window, window.getDecorView()).LIZJ(true);
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0DQk
            public final void LIZ() {
                View viewFindViewById;
                C19EG activity2 = this.LL.getActivity();
                if (activity2 == null || (viewFindViewById = activity2.findViewById(R.id.content)) == null) {
                    return;
                }
                C13E8 c13e8 = new C13E8();
                c13e8.addLast(viewFindViewById);
                while (!c13e8.isEmpty()) {
                    View view2 = (View) c13e8.removeFirst();
                    if (view2.getPaddingTop() > 0) {
                        view2.setFitsSystemWindows(false);
                        view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
                        return;
                    } else if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            c13e8.addLast(viewGroup.getChildAt(i));
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingLightModeSheetFragment@9e75.onViewCreated$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingLightModeSheetFragment@9e75.onViewCreated$2");
            }
        });
    }
}
