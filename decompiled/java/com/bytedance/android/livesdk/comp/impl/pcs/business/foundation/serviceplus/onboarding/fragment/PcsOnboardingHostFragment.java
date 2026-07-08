package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment;

import X.C1845220y7M;
import X.C19EG;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingHostFragment extends PcsOnboardingLightModeSheetFragment {
    public static WeakReference<PcsOnboardingHostFragment> LLLFF = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISHELIOSoiZzw2OjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9GCY/BiExJyQ+LSY9Lw0jOjsVOiQrJCo9PA==";
    public C1845220y7M LLJLLL;
    public int LLJZ;
    public Integer LLJZIJLIL;
    public Bundle LLL;
    public boolean LLLF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19EG activity;
        WeakReference<PcsOnboardingHostFragment> weakReference = LLLFF;
        if ((weakReference != null ? weakReference.get() : null) == this) {
            LLLFF = null;
        }
        super.onDestroyView();
        if (this.LLJZ == 0 || (activity = getActivity()) == null) {
            return;
        }
        activity.setTheme(this.LLJZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        NavHostFragment navHostFragment;
        super.onResume();
        Integer num = this.LLJZIJLIL;
        if (num != null) {
            int iIntValue = num.intValue();
            Bundle bundle = this.LLL;
            this.LLJZIJLIL = null;
            this.LLL = null;
            Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.drj);
            if (!(fragmentLJJJJZ instanceof NavHostFragment) || (navHostFragment = (NavHostFragment) fragmentLJJJJZ) == null) {
                return;
            }
            navHostFragment.NR().LJIIJJI(iIntValue, bundle, null);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.dimBehindType = 2;
        sheetOptions.LIZ(6, null);
        sheetOptions.isHeaderHidden = true;
        sheetOptions.cornerRadius = 0;
        return sheetOptions;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        int i = 0;
        try {
            i = requireActivity().getPackageManager().getActivityInfo(requireActivity().getComponentName(), 0).theme;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingLightModeSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingHostFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext().setTheme(R.style.xx);
        return C786410Ut5.Td(layoutInflater, R.layout.gkp, viewGroup, false);
    }
}
