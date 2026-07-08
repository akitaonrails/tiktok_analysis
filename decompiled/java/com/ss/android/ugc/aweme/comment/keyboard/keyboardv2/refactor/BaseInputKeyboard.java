package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C1558360qeg;
import X.C1558520qew;
import X.C724240Sb0;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseInputKeyboard extends BaseInputAssem implements IKeyboardInputPanelAssemAbility {
    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IKeyboardInputPanelAssemAbility.class, null, null);
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IKeyboardEditAbility.class, null, null);
        }
    }
}
