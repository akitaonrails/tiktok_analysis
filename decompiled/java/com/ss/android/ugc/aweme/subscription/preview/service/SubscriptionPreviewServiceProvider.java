package com.ss.android.ugc.aweme.subscription.preview.service;

import X.C01GW;
import X.C10AN;
import X.C10AO;
import X.C10AQ;
import X.C10FW;
import X.C13LE;
import X.C19201510Ab;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC726100Se0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SubscriptionPreviewServiceProvider implements SubscriptionPreviewService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(208));
    public volatile C10AN LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubscriptionPreviewServiceProvider.class, "subscriptionPreviewService", "getSubscriptionPreviewService()Lcom/ss/android/ugc/aweme/subscription/preview/SubscriptionPreviewService;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final SubscriptionPreviewService LJ() {
        C10AN c10an = this.LIZIZ;
        if (c10an == null) {
            synchronized (this) {
                c10an = this.LIZIZ;
                if (c10an == null) {
                    C10AN c10an2 = new C10AN(((InterfaceC726100Se0) this.LIZ.getValue()).LIZJ());
                    this.LIZIZ = c10an2;
                    return c10an2;
                }
            }
        }
        return c10an;
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final C10AO LIZIZ() {
        return LJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final void LIZ(C10AQ c10aq) {
        ((C10AN) LJ()).LIZ(c10aq);
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final Fragment LIZLLL(FragmentManager fragmentManager, C10FW c10fw) {
        return ((C10AN) LJ()).LIZLLL(fragmentManager, c10fw);
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final Fragment LIZJ(FragmentManager fragmentManager, C19201510Ab c19201510Ab, int i) {
        return ((C10AN) LJ()).LIZJ(fragmentManager, c19201510Ab, i);
    }
}
