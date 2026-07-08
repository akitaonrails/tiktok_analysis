package com.ss.android.ugc.aweme.challenge.viewmodel;

import X.AbstractC19484711Kz;
import X.C004I;
import X.C11S5;
import X.C1252530ihP;
import X.InterfaceC300801Eo;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.AFwS317S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ChallengeDetailState(C1252530ihP.LIZ);
    }

    public final void hR2(final String str, final int i, final String str2, final boolean z, final boolean z2) {
        execute(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1128
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<ChallengeDetail> interfaceC2329309At) {
                try {
                    if (!z2) {
                        AnonymousClass1126 anonymousClass1126 = AnonymousClass1126.LIZ;
                        String str3 = str;
                        int i2 = i;
                        boolean z3 = z;
                        anonymousClass1126.getClass();
                        ChallengeDetail challengeDetailLIZIZ = AnonymousClass1126.LIZIZ(i2, str3, z3);
                        if (challengeDetailLIZIZ != null) {
                            interfaceC2329309At.onSuccess(challengeDetailLIZIZ);
                            return;
                        }
                    }
                    String str4 = str;
                    ChallengeDetail challengeDetailLIZ = AnonymousClass1162.LIZ(i, str4, str2, z);
                    interfaceC2329309At.onSuccess(challengeDetailLIZ);
                    AnonymousClass1126 anonymousClass11262 = AnonymousClass1126.LIZ;
                    String str5 = str;
                    int i3 = i;
                    boolean z4 = z;
                    anonymousClass11262.getClass();
                    C603820NmG<String, AnonymousClass1127> c603820NmG = AnonymousClass1126.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str5);
                    sbLIZ.append('&');
                    sbLIZ.append(i3);
                    sbLIZ.append('&');
                    sbLIZ.append(z4);
                    c603820NmG.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), new AnonymousClass1127(challengeDetailLIZ, System.currentTimeMillis()));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!interfaceC2329309At.isDisposed()) {
                        interfaceC2329309At.onError(th);
                    }
                }
            }
        }).LJJIJIIJI(C11S5.LIZ()), AFwS317S0000000_29.get$arr$(14));
    }
}
