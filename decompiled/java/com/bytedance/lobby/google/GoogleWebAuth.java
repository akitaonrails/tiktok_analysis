package com.bytedance.lobby.google;

import X.AbstractC1515220pX6;
import X.AbstractC19484711Kz;
import X.C0W02;
import X.C0WWJ;
import X.C0WWL;
import X.C11S5;
import X.C1701940uOG;
import X.C1741990vQr;
import X.C1742000vQs;
import X.C1742040vQw;
import X.C19EG;
import X.C1AWO;
import X.C2188811AlT;
import X.C2193501At2;
import X.C2193521At4;
import X.C2193541At6;
import X.C2193561At8;
import X.C2193571At9;
import X.C2193621AtE;
import X.C2193641AtG;
import X.C2193651AtH;
import X.C2193741AtQ;
import X.C2277811EDr;
import X.C2336109Dj;
import X.C2396409aE;
import X.C839620Wwi;
import X.C847650XNb;
import X.C847770XNn;
import X.C851480Xak;
import X.InterfaceC1742030vQv;
import X.InterfaceC1742050vQx;
import X.InterfaceC1742060vQy;
import X.InterfaceC2193631AtF;
import Y.AfS149S0200000_13;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.LobbyGoogleApi;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes35.dex */
public class GoogleWebAuth extends GoogleWebAuthProvider implements C1AWO, InterfaceC1742030vQv {
    public InterfaceC1742060vQy LLILZ;
    public LobbyViewModel LLILZIL;

    @Override // X.C1AWO
    public final /* synthetic */ void KY0(int i) {
    }

    @Override // X.C1AWO
    public final void mQ(C19EG c19eg, Bundle bundle) {
    }

    @Override // X.C1AWO
    public final void onDestroy() {
        InterfaceC1742060vQy interfaceC1742060vQy = this.LLILZ;
        if (interfaceC1742060vQy != null) {
            C1742040vQw c1742040vQw = (C1742040vQw) interfaceC1742060vQy;
            if (c1742040vQw.LIZ != null) {
                c1742040vQw.LIZ = null;
            }
            if (c1742040vQw.LIZIZ != null) {
                c1742040vQw.LIZIZ = null;
            }
            C2193641AtG c2193641AtG = c1742040vQw.LIZJ;
            if (c2193641AtG == null || c2193641AtG.LJ) {
                return;
            }
            C0WWJ c0wwj = c2193641AtG.LIZJ;
            synchronized (c0wwj) {
                if (c0wwj.LIZLLL != null) {
                    Context context = c0wwj.LIZ.get();
                    if (context != null) {
                        context.unbindService(c0wwj.LIZLLL);
                    }
                    c0wwj.LIZIZ.set(null);
                    C0WWL.LIZ("CustomTabsService is disconnected", new Object[0]);
                }
            }
            c2193641AtG.LJ = true;
        }
    }

    @Override // com.bytedance.lobby.internal.BaseProvider, X.C1ATS
    public final boolean isAvailable() {
        return C0W02.LIZ(LobbyCore.getApplication(), C2193651AtH.LIZJ.LIZ) != null;
    }

    public GoogleWebAuth(C2277811EDr c2277811EDr) {
        super(LobbyCore.getApplication(), c2277811EDr);
    }

    public final void vQ2(C2193561At8 c2193561At8) {
        String str;
        if (c2193561At8.LIZIZ != null) {
            boolean z = true;
            C2193741AtQ c2193741AtQ = new C2193741AtQ("google_web", 1);
            c2193741AtQ.LIZ = false;
            if (TextUtils.isEmpty(c2193561At8.LIZIZ)) {
                str = "-1";
            } else {
                str = c2193561At8.LIZIZ;
            }
            C851480Xak c851480Xak = new C851480Xak(CastIntegerProtector.parseInt(str), c2193561At8.LIZJ);
            if (!c2193561At8.LIZ && CastIntegerProtector.parseInt(c2193561At8.LIZIZ) != C2193621AtE.LIZIZ.code) {
                z = false;
            }
            c851480Xak.setCancelled(z);
            c2193741AtQ.LIZIZ = c851480Xak;
            this.LLILZIL.xQ2(new AuthResult(c2193741AtQ));
        }
    }

    public final void wQ2(Bundle bundle) {
        AbstractC19484711Kz<LobbyGoogleApi.UserInfoResponse> userInfo;
        C2193741AtQ c2193741AtQ = new C2193741AtQ("google_web", 1);
        String string = bundle.getString("access_token", "");
        c2193741AtQ.LIZ = true;
        c2193741AtQ.LJ = string;
        c2193741AtQ.LJFF = bundle.getString("id_token", "");
        LobbyGoogleApi.GoogleApi googleApi = LobbyGoogleApi.LIZ;
        if (C839620Wwi.LIZ) {
            AbstractC1515220pX6 abstractC1515220pX6LIZJ = ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).LIZIZ().LIZJ(C2336109Dj.LJI());
            abstractC1515220pX6LIZJ.LJ(C2396409aE.LIZIZ());
            LobbyGoogleApi.GoogleApiV2 googleApiV2 = (LobbyGoogleApi.GoogleApiV2) abstractC1515220pX6LIZJ.LJFF().create(LobbyGoogleApi.GoogleApiV2.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bearer ");
            sbLIZ.append(string);
            userInfo = googleApiV2.getUserInfo(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            LobbyGoogleApi.GoogleApi googleApi2 = LobbyGoogleApi.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Bearer ");
            sbLIZ2.append(string);
            userInfo = googleApi2.getUserInfo(C2188811AlT.LIZIZ(sbLIZ2));
        }
        userInfo.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS149S0200000_13(c2193741AtQ, this, 2), new AfS149S0200000_13(c2193741AtQ, this, 3));
    }

    @Override // X.C1AWO
    public final void n20(C19EG c19eg, Bundle bundle) {
        this.LLILZIL = (LobbyViewModel) ViewModelProviders.of(c19eg).get(LobbyViewModel.class);
        InterfaceC1742050vQx interfaceC1742050vQx = (InterfaceC1742050vQx) C847650XNb.LIZ(InterfaceC1742050vQx.class);
        C1742000vQs c1742000vQs = new C1742000vQs();
        c1742000vQs.LIZJ = "code";
        HashSet hashSet = new HashSet();
        hashSet.add("profile");
        c1742000vQs.LIZ = hashSet;
        c1742000vQs.LIZIZ = "app_auth";
        c1742000vQs.LIZLLL = UriProtector.parse(this.LLILLL.LIZLLL.getString("google_auth_redirect_uri", null));
        this.LLILZ = interfaceC1742050vQx.LIZIZ(c19eg, new C1741990vQr(c1742000vQs), this);
    }

    @Override // X.C1AWO
    public final void ID0(C19EG c19eg, int i, int i2, Intent intent) {
        InterfaceC1742060vQy interfaceC1742060vQy = this.LLILZ;
        if (interfaceC1742060vQy != null) {
            final C1742040vQw c1742040vQw = (C1742040vQw) interfaceC1742060vQy;
            if (i == 100) {
                try {
                    if (intent == null) {
                        if (c1742040vQw.LIZ != null) {
                            C847770XNn.LIZ(0, null, "activity result null", false);
                            ((GoogleWebAuth) c1742040vQw.LIZ).vQ2(new C2193561At8("activity result null"));
                            return;
                        }
                        return;
                    }
                    C2193521At4 c2193521At4LIZIZ = C2193521At4.LIZIZ(intent);
                    C2193571At9 c2193571At9FromIntent = C2193571At9.fromIntent(intent);
                    final C2193541At6 c2193541At6 = new C2193541At6(c2193521At4LIZIZ, c2193571At9FromIntent);
                    if (c2193521At4LIZIZ != null) {
                        if (c1742040vQw.LIZIZ == null) {
                            if (c1742040vQw.LIZ != null) {
                                C847770XNn.LIZ(0, null, "context null", false);
                                ((GoogleWebAuth) c1742040vQw.LIZ).vQ2(new C2193561At8("context null"));
                                return;
                            }
                            return;
                        }
                        C2193641AtG c2193641AtG = c1742040vQw.LIZJ;
                        C2193501At2 c2193501At2LIZ = c2193521At4LIZIZ.LIZ();
                        InterfaceC2193631AtF interfaceC2193631AtF = new InterfaceC2193631AtF() { // from class: X.1At7
                            /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
                            /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
                            @Override // X.InterfaceC2193631AtF
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(X.C2193491At1 r8, X.C2193571At9 r9) {
                                /*
                                    Method dump skipped, instruction units count: 234
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C2193551At7.LIZ(X.1At1, X.1At9):void");
                            }
                        };
                        c2193641AtG.getClass();
                        c2193641AtG.LIZJ(c2193501At2LIZ, interfaceC2193631AtF);
                        return;
                    }
                    if (c2193571At9FromIntent != null) {
                        C2193561At8 c2193561At8 = new C2193561At8(c2193571At9FromIntent.code, c2193571At9FromIntent.error, c2193571At9FromIntent.errorDescription);
                        if (c2193571At9FromIntent.code == C2193621AtE.LIZJ.code) {
                            c2193561At8.LIZ = true;
                        }
                        if (c1742040vQw.LIZ != null) {
                            String str = c2193561At8.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(c2193561At8.LIZJ);
                            sbLIZ.append(", ");
                            sbLIZ.append(c2193561At8.LIZLLL);
                            C847770XNn.LIZ(0, str, C2188811AlT.LIZIZ(sbLIZ), c2193561At8.LIZ);
                            ((GoogleWebAuth) c1742040vQw.LIZ).vQ2(c2193561At8);
                            return;
                        }
                        return;
                    }
                    if (c1742040vQw.LIZ != null) {
                        C847770XNn.LIZ(0, null, "response null", false);
                        ((GoogleWebAuth) c1742040vQw.LIZ).vQ2(new C2193561At8("response null"));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (c1742040vQw.LIZ != null) {
                        C847770XNn.LIZ(0, null, e.getMessage(), false);
                        ((GoogleWebAuth) c1742040vQw.LIZ).vQ2(new C2193561At8(e.getMessage()));
                    }
                }
            }
        }
    }
}
