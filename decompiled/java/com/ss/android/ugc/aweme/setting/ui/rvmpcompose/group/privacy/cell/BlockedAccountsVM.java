package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell;

import X.C0PEM;
import X.C23250099c;
import X.C323001Nc;
import X.C323201Ne;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;

/* JADX INFO: loaded from: classes.dex */
public final class BlockedAccountsVM extends PrivacyItemVM {
    public boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM
    public final void vQ2() {
        this.LLILZ = true;
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM
    public final void xQ2() {
    }

    public BlockedAccountsVM() {
        super("blocked_accounts_entrance");
        this.LLILZ = true;
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (C323201Ne.LIZ[event.ordinal()] == 1 && this.LLILZ) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C323001Nc(this, null), 2);
        }
    }
}
