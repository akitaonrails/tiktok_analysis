package com.ss.android.ugc.profile.business.ur.aigc;

import X.C01GW;
import X.C1221880hty;
import X.C19EG;
import X.C346240Dhm;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileAigcIntroFragment extends BaseFragment {
    public String LLIZLLLIL;
    public String LLJ;
    public SmartImageView LLJIJIL;
    public TuxTextView LLJILJIL;
    public boolean LLJILJILJ;
    public TuxSheet LLJILLL;
    public boolean LLJJ;
    public boolean LLIZ = true;
    public final C01GW LLJI = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C1221880hty c1221880hty = C1221880hty.LIZ;
        Boolean boolValueOf = Boolean.valueOf(this.LLJJ);
        Boolean boolValueOf2 = Boolean.valueOf(!this.LLIZ);
        c1221880hty.getClass();
        C1221880hty.LIZJ(boolValueOf, boolValueOf2, "close");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onResume();
        C19EG activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.LIZIZ(new C346240Dhm(this, 2));
    }
}
