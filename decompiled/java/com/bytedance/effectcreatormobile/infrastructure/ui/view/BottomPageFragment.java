package com.bytedance.effectcreatormobile.infrastructure.ui.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.infrastructure.ui.view.BottomDialog;
import com.bytedance.effectcreatormobile.infrastructure.ui.view.BottomMultiPageDialog;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BottomPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWspLyk2KzEvOyoyPCo+JCAxISkpZyY9LjHELIOSctOjshPSY4PD02ZjAlZzk6LTJiCyAnPCohGS40LQM+KCg+LSs4";

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnKeyListener(new View.OnKeyListener() { // from class: X.0HZj
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                FragmentManager childFragmentManager;
                C19EH c19ehLJIIJ;
                FragmentManager childFragmentManager2;
                List<Fragment> listLJJLIIIJL;
                BottomDialog bottomDialog;
                if (i != 4) {
                    return false;
                }
                Fragment fragment = this.LL;
                Fragment parentFragment = fragment.getParentFragment();
                if (parentFragment != null && (childFragmentManager2 = parentFragment.getChildFragmentManager()) != null && (listLJJLIIIJL = childFragmentManager2.LJJLIIIJL()) != null && listLJJLIIIJL.size() == 1) {
                    Fragment parentFragment2 = fragment.getParentFragment();
                    if ((parentFragment2 instanceof BottomMultiPageDialog) && (bottomDialog = (BottomDialog) parentFragment2) != null) {
                        BottomDialog.MR(bottomDialog);
                    }
                } else {
                    Fragment parentFragment3 = fragment.getParentFragment();
                    if (parentFragment3 != null && (childFragmentManager = parentFragment3.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                        c19ehLJIIJ.LJIIZILJ(fragment);
                        c19ehLJIIJ.LJIIIZ();
                        return true;
                    }
                }
                return true;
            }
        });
    }
}
