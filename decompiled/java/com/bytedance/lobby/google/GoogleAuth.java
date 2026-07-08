package com.bytedance.lobby.google;

import X.AbstractC831960WkM;
import X.AbstractC831970WkN;
import X.C0W3J;
import X.C0W4N;
import X.C0W4V;
import X.C0WY0;
import X.C0WZX;
import X.C1701330uNH;
import X.C19EG;
import X.C1AWO;
import X.C2188811AlT;
import X.C2193741AtQ;
import X.C2204961BRm;
import X.C2277811EDr;
import X.C786410Ut5;
import X.C831920WkI;
import X.C831930WkJ;
import X.C832010WkR;
import X.C832350Wkz;
import X.C833470Wmn;
import X.C833480Wmo;
import X.C833530Wmt;
import X.C833590Wmz;
import X.C833600Wn0;
import X.C833690Wn9;
import X.C834830Woz;
import X.C835460Wq0;
import X.C835510Wq5;
import X.C851480Xak;
import X.InterfaceC832260Wkq;
import X.InterfaceC832710WlZ;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.GoogleAuth;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleAuth extends GoogleProvider<AuthResult> implements C1AWO, InterfaceC832260Wkq {
    public static final boolean LLJ = C833690Wn9.LIZ;
    public int LLILZ;
    public Bundle LLILZIL;
    public WeakReference<C19EG> LLILZLL;
    public boolean LLIZ;
    public C831920WkI LLIZLLLIL;

    @Override // X.InterfaceC832280Wks
    public final void Js(int i) {
    }

    @Override // X.C1AWO
    public final /* synthetic */ void KY0(int i) {
    }

    @Override // com.bytedance.lobby.internal.BaseProvider, X.C1ATS
    public final boolean isAvailable() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean z = C786410Ut5.b4(GoogleApiAvailability.getInstance(), LobbyCore.getApplication()) == 0;
        return super.isAvailable() && z;
    }

    @Override // X.C1AWO
    public final void onDestroy() {
        if (this.LLIZLLLIL != null) {
            this.LLIZLLLIL = null;
        }
    }

    public GoogleAuth(C2277811EDr c2277811EDr) {
        super(LobbyCore.getApplication(), c2277811EDr);
    }

    public final GoogleSignInOptions wQ2(Bundle bundle) {
        boolean z;
        C833470Wmn c833470Wmn = new C833470Wmn(GoogleSignInOptions.DEFAULT_SIGN_IN);
        boolean z2 = true;
        if (bundle.getBoolean("google_request_profile", true)) {
            ((HashSet) c833470Wmn.LIZ).add(GoogleSignInOptions.zaa);
        }
        if (bundle.getBoolean("google_request_id", true)) {
            ((HashSet) c833470Wmn.LIZ).add(GoogleSignInOptions.zac);
        }
        if (bundle.getBoolean("google_request_email", true)) {
            ((HashSet) c833470Wmn.LIZ).add(GoogleSignInOptions.zab);
        }
        if (bundle.getBoolean("google_request_id_token", true)) {
            String str = this.LLILLL.LIZJ;
            c833470Wmn.LIZLLL = true;
            C0W3J.LJI(str);
            String str2 = c833470Wmn.LJ;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            } else {
                z = true;
            }
            C0W3J.LIZ("two different server client ids provided", z);
            c833470Wmn.LJ = str;
        }
        if (bundle.getBoolean("google_request_server_auth_code", false)) {
            boolean z3 = bundle.getBoolean("google_force_refresh_token", false);
            String str3 = this.LLILLL.LIZJ;
            c833470Wmn.LIZIZ = true;
            C0W3J.LJI(str3);
            String str4 = c833470Wmn.LJ;
            if (str4 != null && !str4.equals(str3)) {
                z2 = false;
            }
            C0W3J.LIZ("two different server client ids provided", z2);
            c833470Wmn.LJ = str3;
            c833470Wmn.LIZJ = z3;
        }
        return c833470Wmn.LIZ();
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
        final C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LLILZLL;
        if (weakReference != null) {
            c19eg = weakReference.get();
        } else {
            c19eg = null;
        }
        if (this.LLIZ && c19eg != null) {
            this.LLIZ = false;
            final AbstractC831960WkM abstractC831960WkMVQ2 = vQ2(c19eg, wQ2(this.LLILZIL));
            yQ2(abstractC831960WkMVQ2, new InterfaceC832710WlZ() { // from class: X.0Wmx
                @Override // X.InterfaceC832710WlZ
                public final void LIZ(InterfaceC832870Wlp interfaceC832870Wlp) throws Throwable {
                    GoogleAuth googleAuth = this.LIZ;
                    C19EG c19eg2 = c19eg;
                    AbstractC831960WkM abstractC831960WkM = abstractC831960WkMVQ2;
                    googleAuth.getClass();
                    GoogleAuth.xQ2(c19eg2, abstractC831960WkM);
                }
            });
        }
    }

    public static void xQ2(C19EG c19eg, AbstractC831960WkM abstractC831960WkM) throws Throwable {
        C833530Wmt.LIZLLL.getClass();
        Intent intentLIZ = C832350Wkz.LIZ(abstractC831960WkM.LJIIIZ(), ((C833480Wmo) abstractC831960WkM.LJIIIIZZ(C833530Wmt.LJFF)).LL);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intentLIZ, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intentLIZ, c19eg);
        C2204961BRm.LLJJJJJIL(101, intentLIZ, c19eg, new C0WZX("dzBzEgAjS8/YVFkiQFyIaW1ZwJwqpyN94KRUrRsT8mKhZI9qNw==", null));
    }

    public static void yQ2(AbstractC831960WkM abstractC831960WkM, final InterfaceC832710WlZ interfaceC832710WlZ) {
        if (!abstractC831960WkM.LJIIJJI()) {
            return;
        }
        C833530Wmt.LIZLLL.getClass();
        C832350Wkz.LIZIZ(abstractC831960WkM, abstractC831960WkM.LJIIIZ(), false).LIZIZ(new InterfaceC832710WlZ() { // from class: X.0Wlo
            @Override // X.InterfaceC832710WlZ
            public final void LIZ(InterfaceC832870Wlp interfaceC832870Wlp) {
                InterfaceC832710WlZ interfaceC832710WlZ2 = interfaceC832710WlZ;
                if (interfaceC832710WlZ2 != null) {
                    interfaceC832710WlZ2.LIZ(interfaceC832870Wlp);
                }
            }
        });
    }

    @Override // X.C1AWO
    public final void mQ(C19EG c19eg, Bundle bundle) {
        final LobbyViewModel lobbyViewModelVQ2 = LobbyViewModel.vQ2(c19eg);
        if (!isAvailable()) {
            C834830Woz.LIZIZ(lobbyViewModelVQ2, "google", 2);
            return;
        }
        AbstractC831960WkM abstractC831960WkMVQ2 = vQ2(c19eg, wQ2(bundle));
        if (abstractC831960WkMVQ2.LJIIJJI()) {
            yQ2(abstractC831960WkMVQ2, new InterfaceC832710WlZ() { // from class: X.0Wmq
                @Override // X.InterfaceC832710WlZ
                public final void LIZ(InterfaceC832870Wlp interfaceC832870Wlp) {
                    LobbyViewModel lobbyViewModel = lobbyViewModelVQ2;
                    Status status = (Status) interfaceC832870Wlp;
                    if (GoogleAuth.LLJ) {
                        status.getClass();
                    }
                    C2193741AtQ c2193741AtQ = new C2193741AtQ("google", 2);
                    c2193741AtQ.LIZ = status.LJLZ();
                    lobbyViewModel.xQ2(new AuthResult(c2193741AtQ));
                }
            });
            return;
        }
        C2193741AtQ c2193741AtQ = new C2193741AtQ("google", 2);
        c2193741AtQ.LIZ = false;
        c2193741AtQ.LIZIZ = new C851480Xak(new IllegalStateException("GoogleApiClient is not connected yet"));
        lobbyViewModelVQ2.xQ2(new AuthResult(c2193741AtQ));
    }

    @Override // X.C1AWO
    public final void n20(final C19EG c19eg, Bundle bundle) throws Throwable {
        LobbyViewModel lobbyViewModelVQ2 = LobbyViewModel.vQ2(c19eg);
        if (!isAvailable()) {
            C834830Woz.LIZIZ(lobbyViewModelVQ2, "google", 1);
            return;
        }
        this.LLILZLL = new WeakReference<>(c19eg);
        this.LLILZIL = bundle;
        final AbstractC831960WkM abstractC831960WkMVQ2 = vQ2(c19eg, wQ2(bundle));
        if (bundle.getBoolean("google_force_sign_out", true)) {
            abstractC831960WkMVQ2.LIZLLL();
            if (abstractC831960WkMVQ2.LJIIJJI()) {
                yQ2(abstractC831960WkMVQ2, new InterfaceC832710WlZ() { // from class: X.0Wmw
                    @Override // X.InterfaceC832710WlZ
                    public final void LIZ(InterfaceC832870Wlp interfaceC832870Wlp) throws Throwable {
                        GoogleAuth googleAuth = this.LIZ;
                        C19EG c19eg2 = c19eg;
                        AbstractC831960WkM abstractC831960WkM = abstractC831960WkMVQ2;
                        googleAuth.getClass();
                        GoogleAuth.xQ2(c19eg2, abstractC831960WkM);
                    }
                });
                return;
            } else {
                this.LLIZ = true;
                return;
            }
        }
        xQ2(c19eg, abstractC831960WkMVQ2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final AbstractC831960WkM vQ2(C19EG c19eg, GoogleSignInOptions googleSignInOptions) {
        if (this.LLIZLLLIL == null) {
            C831930WkJ c831930WkJ = new C831930WkJ(c19eg);
            C832010WkR<GoogleSignInOptions> c832010WkR = C833530Wmt.LIZIZ;
            C0W3J.LJIIIZ(c832010WkR, "Api must not be null");
            c831930WkJ.LJI.put(c832010WkR, googleSignInOptions);
            AbstractC831970WkN<?, O> abstractC831970WkN = c832010WkR.LIZ;
            C0W3J.LJIIIZ(abstractC831970WkN, "Base client builder must not be null");
            List<Scope> impliedScopes = abstractC831970WkN.getImpliedScopes(googleSignInOptions);
            c831930WkJ.LIZIZ.addAll(impliedScopes);
            c831930WkJ.LIZ.addAll(impliedScopes);
            c831930WkJ.LJIILIIL.add(this);
            this.LLIZLLLIL = c831930WkJ.LIZ();
        }
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1AWO
    public final void ID0(C19EG c19eg, int i, int i2, Intent intent) throws Throwable {
        C833590Wmz c833590Wmz;
        C835510Wq5 c835510Wq5LIZLLL;
        C851480Xak c851480Xak;
        this.LLILZLL = new WeakReference<>(c19eg);
        C0W4N c0w4n = C832350Wkz.LIZ;
        GoogleSignInAccount googleSignInAccount = null;
        if (intent == null) {
            c833590Wmz = new C833590Wmz(null, Status.RESULT_INTERNAL_ERROR);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.RESULT_INTERNAL_ERROR;
                }
                c833590Wmz = new C833590Wmz(null, status);
            } else {
                c833590Wmz = new C833590Wmz(googleSignInAccount2, Status.RESULT_SUCCESS);
            }
        }
        GoogleSignInAccount googleSignInAccount3 = c833590Wmz.LLILLJJLI;
        if (c833590Wmz.LL.LJLZ() && googleSignInAccount3 != null) {
            c835510Wq5LIZLLL = C835460Wq0.LJ(googleSignInAccount3);
        } else {
            c835510Wq5LIZLLL = C835460Wq0.LIZLLL(C0WY0.LIZ(c833590Wmz.LL));
        }
        try {
            e = null;
            googleSignInAccount = (GoogleSignInAccount) c835510Wq5LIZLLL.LJIIJJI(C0W4V.class);
        } catch (C0W4V e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
        }
        if (googleSignInAccount == null) {
            if (e != null) {
                int statusCode = e.getStatusCode();
                if (statusCode == 7 || statusCode == 8) {
                    int i3 = this.LLILZ + 1;
                    this.LLILZ = i3;
                    if (i3 <= 3) {
                        n20(c19eg, this.LLILZIL);
                        return;
                    }
                }
                if (statusCode != 5) {
                    if (statusCode != 6) {
                        if (statusCode != 7) {
                            if (statusCode != 8) {
                                if (statusCode != 13) {
                                    if (statusCode != 15) {
                                        if (statusCode != 16) {
                                            switch (statusCode) {
                                                case 12500:
                                                    c851480Xak = new C851480Xak(3, statusCode, "Sign in failed with the selected Google account. There is nothing user can do to recover from the sign in failure. Switching to another account may or may not help. Check adb log to see details if any");
                                                    break;
                                                case 12501:
                                                    c851480Xak = new C851480Xak(4, statusCode, "The sign in was cancelled by the user. i.e. user cancelled some of the sign in resolutions, e.g. account picking or OAuth consent");
                                                    break;
                                                case 12502:
                                                    c851480Xak = new C851480Xak(-999, statusCode, "A sign in process is currently in progress and the current one cannot continue. e.g. the user clicks the SignInButton multiple times and more than one sign in intent was launched");
                                                    break;
                                                default:
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("Unknown error code = ");
                                                    sbLIZ.append(statusCode);
                                                    sbLIZ.append(", check documentation");
                                                    c851480Xak = new C851480Xak(7, statusCode, C2188811AlT.LIZIZ(sbLIZ));
                                                    break;
                                            }
                                        } else {
                                            c851480Xak = new C851480Xak(4, statusCode, "The result was canceled either due to client disconnect or cancel()");
                                        }
                                    } else {
                                        c851480Xak = new C851480Xak(-999, statusCode, "Timed out while awaiting the result");
                                    }
                                } else {
                                    c851480Xak = new C851480Xak(7, statusCode, "The operation failed with no more detailed information from Google");
                                }
                            } else {
                                c851480Xak = new C851480Xak(3, statusCode, "Google internal error occurred. Retrying should resolve the problem");
                            }
                        } else {
                            c851480Xak = new C851480Xak(5, statusCode, "Google network error occurred. Retrying should resolve the problem");
                        }
                    } else {
                        c851480Xak = new C851480Xak(3, statusCode, "Completing the operation requires some form of resolution");
                    }
                } else {
                    c851480Xak = new C851480Xak(3, statusCode, "The client attempted to connect to the service with an invalid account name specified");
                }
            } else {
                c851480Xak = new C851480Xak(6, "GoogleSignInAccount and ApiException are both null");
            }
            C2193741AtQ c2193741AtQ = new C2193741AtQ("google", 1);
            c2193741AtQ.LIZ = false;
            c2193741AtQ.LIZIZ = c851480Xak;
            LobbyViewModel.vQ2(c19eg).xQ2(new AuthResult(c2193741AtQ));
            return;
        }
        C2193741AtQ c2193741AtQ2 = new C2193741AtQ("google", 1);
        c2193741AtQ2.LIZ = true;
        c2193741AtQ2.LIZLLL = googleSignInAccount.zad;
        C833600Wn0 c833600Wn0 = new C833600Wn0();
        C786410Ut5.LJJJI("email", googleSignInAccount.zaf, c833600Wn0.LIZ());
        C786410Ut5.LJJJI("display_name", googleSignInAccount.zag, c833600Wn0.LIZ());
        C786410Ut5.LJJJI("code", googleSignInAccount.zai, c833600Wn0.LIZ());
        c2193741AtQ2.LJIIIZ = c833600Wn0.LIZ();
        c2193741AtQ2.LJ = googleSignInAccount.zae;
        LobbyViewModel.vQ2(c19eg).xQ2(new AuthResult(c2193741AtQ2));
    }
}
