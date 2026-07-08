package com.ss.android.ugc.aweme.account.passwordless.leaked;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1669720tYI;
import X.C1669770tYN;
import X.C1669800tYQ;
import X.C1BNE;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2344009Gk;
import X.InterfaceC20325014fw;
import android.app.Activity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes26.dex */
public final class NoPasskeyPageViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final AnonymousClass0951 LLILZ;
    public String LLILZIL;
    public int LLILZLL;

    public NoPasskeyPageViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1669770tYN.LIZ);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(Boolean.TRUE);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLILZIL = "";
    }

    public final void vQ2(Activity activity) {
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String str = this.LLILZIL;
        c1669720tYI.getClass();
        C1669720tYI.LIZLLL(str, "continue");
        this.LL.setValue(C1669800tYQ.LIZ);
        String str2 = this.LLILZIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", "passkey_create");
        C20684815ws.LJIILLIIL("passkey_prompt_try_show", c2344009Gk.LIZ);
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
        if (iCredentialManagerService != null) {
            iCredentialManagerService.LJIIIZ(activity, new InterfaceC20325014fw() { // from class: X.0tYL
                @Override // X.InterfaceC20325014fw
                public final void LJ() {
                }

                @Override // X.InterfaceC20325014fw
                public final void onSuccess(String str3) {
                    NoPasskeyPageViewModel noPasskeyPageViewModel = this.LIZ;
                    noPasskeyPageViewModel.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(noPasskeyPageViewModel), C0PEM.LIZJ, null, new C1669740tYK(noPasskeyPageViewModel, null), 2);
                }

                @Override // X.InterfaceC20325014fw
                public final void LIZ(Throwable th, boolean z, boolean z2) {
                    NoPasskeyPageViewModel noPasskeyPageViewModel = this.LIZ;
                    int i = noPasskeyPageViewModel.LLILZLL;
                    if (i == 0) {
                        noPasskeyPageViewModel.LL.setValue(C1669820tYS.LIZ);
                    } else if (i >= 1) {
                        noPasskeyPageViewModel.LL.setValue(C1669810tYR.LIZ);
                    }
                    this.LIZ.LLILZLL++;
                }
            }, false, "", "leaked_credential_popup");
        }
    }
}
