package com.ss.android.ugc.aweme.legacy.network.viewmodel;

import X.AnonymousClass1171;
import X.C01GW;
import X.C07JE;
import X.C0QR9;
import X.C0QRA;
import X.C0QRB;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC668100QIm;
import Y.AkS473S0100000_10;
import android.os.Looper;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SuggestWordsViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(133));
    public C0QRB LLILLJJLI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0QRB c0qrb = this.LLILLJJLI;
        if (c0qrb != null) {
            if (!c0qrb.isDisposed()) {
                c0qrb.dispose();
            }
            this.LLILLJJLI = null;
        }
    }

    public final void vQ2(C0QRA c0qra, AnonymousClass1171 anonymousClass1171) {
        C11NZ<SuggestWordResponse> c11nzLIZ;
        if (ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
            return;
        }
        C0QRB c0qrb = this.LLILLJJLI;
        if (c0qrb != null) {
            if (!c0qrb.isDisposed()) {
                c0qrb.dispose();
            }
            this.LLILLJJLI = null;
        }
        AtomicBoolean atomicBoolean = C0QR9.LIZJ;
        if (!atomicBoolean.get() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && C07JE.LIZ()) {
            c11nzLIZ = C11NZ.LJJJJZ(1).LJJJ(new AkS473S0100000_10(c0qra, 3), false);
        } else {
            C0QR9.LIZ.getClass();
            c11nzLIZ = ((InterfaceC668100QIm) C0QR9.LIZIZ.getValue()).LIZ(c0qra.LIZ, C0QR9.LIZ(), c0qra.LIZIZ, ((ISearchService) ServiceManager.get().getService(ISearchService.class)).q0(), ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLFFI(true, false), c0qra.LIZJ);
            atomicBoolean.set(true);
        }
        C11O8 c11o8LJJJLZIJ = c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        C0QRB c0qrb2 = new C0QRB(new AwS376S0200000_10(anonymousClass1171, this, 26), new AwS376S0200000_10(anonymousClass1171, this, 27));
        this.LLILLJJLI = c0qrb2;
        c11o8LJJJLZIJ.LIZIZ(c0qrb2);
    }
}
