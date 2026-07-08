package com.bytedance.effectcreatormobile.infrastructure.ui.view;

import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public class BottomMultiPageDialog extends BottomDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWspLyk2KzEvOyoyPCo+JCAxISkpZyY9LjctHELIOSOjshPSY4PD02ZjAlZzk6LTJiCyAnPCohBDo/PCwcKCg2DCwtJSA0";
    public FrameLayout LLILLL;

    @Override // com.bytedance.effectcreatormobile.infrastructure.ui.view.BottomDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.effectcreatormobile.infrastructure.ui.view.BottomDialog
    public final View OR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LLILLL = frameLayout;
        frameLayout.setId(R.id.ccr);
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 == null) {
            return null;
        }
        return frameLayout2;
    }
}
