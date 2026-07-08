package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.C1352140lI4;
import X.C1558360qeg;
import X.C1558520qew;
import android.os.Bundle;
import com.bytedance.ies.foundation.fragment.BaseFragment;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseNowKeyboardFragment extends BaseFragment implements INowKeyboardFragmentAbility {
    public C1352140lI4 LLIZ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), INowKeyboardFragmentAbility.class, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, INowKeyboardFragmentAbility.class, null, null);
    }
}
