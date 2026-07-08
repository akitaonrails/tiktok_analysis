package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AbstractC845740XFs;
import X.AbstractC846040XGw;
import X.AnonymousClass0951;
import X.C095G;
import X.C09IC;
import X.C0XG3;
import X.C0XGR;
import X.C0XH5;
import X.C0XZV;
import X.C1BNE;
import X.C1DEK;
import X.C20684815ws;
import X.C2252321DDq;
import X.C324280CnS;
import X.C793770VBv;
import X.C845590XFd;
import X.C845720XFq;
import X.C848000XOk;
import X.InterfaceC346201Wa;
import androidx.lifecycle.ViewModel;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SOTLViewModel extends ViewModel {
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final AnonymousClass0951 LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C1DEK LLIZLLLIL;
    public final InterfaceC346201Wa<AbstractC845740XFs> LLJ;
    public C845720XFq LLJI;
    public C0XG3 LLJIJIL;

    public SOTLViewModel() {
        C845590XFd.LIZ.getClass();
        this.LLILZ = C845590XFd.LIZJ;
        this.LLILZIL = C324280CnS.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLILZLL = c2252321DDqLIZ;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C1DEK c1dekLIZ = C095G.LIZ(-2, null, 6);
        this.LLIZLLLIL = c1dekLIZ;
        this.LLJ = C09IC.LJJIIJ(c1dekLIZ);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLIZLLLIL.LJIIJJI(null);
        this.LLJIJIL = null;
    }

    public final void vQ2(OneTapLoginShareInfo oneTapLoginShareInfo) {
        C0XG3 c0xg3LIZ;
        C0XG3 c0xg3 = this.LLJIJIL;
        if (c0xg3 != null) {
            c0xg3LIZ = C0XG3.LIZ(c0xg3, 0L, 0L, System.currentTimeMillis(), 0L, null, null, null, 503);
        } else {
            c0xg3LIZ = null;
        }
        this.LLJIJIL = c0xg3LIZ;
        this.LLILZLL.setValue(Boolean.TRUE);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("login_panel_type", this.LL);
        c0xgr.LIZLLL("platform", this.LL);
        c0xgr.LIZLLL("is_register", CardStruct.IStatusCode.DEFAULT);
        c0xgr.LIZLLL("enter_from", this.LLILLJJLI);
        c0xgr.LIZLLL("enter_method", this.LLILLL);
        C20684815ws.LJIILLIIL("login_submit", c0xgr.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", this.LL);
        C793770VBv.LJII("login_submit", jSONObject, null, null);
        AbstractC846040XGw<C0XZV> abstractC846040XGw = new AbstractC846040XGw<C0XZV>() { // from class: X.0XG2
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
            @Override // X.AbstractC846040XGw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C0XGA r18) {
                /*
                    Method dump skipped, instruction units count: 211
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XG2.LIZ(X.0XGA):void");
            }
        };
        TTAccountInit.LIZ();
        C0XH5.LIZ(C848000XOk.LIZ(), oneTapLoginShareInfo.userId, oneTapLoginShareInfo.idToken, oneTapLoginShareInfo.deviceSecret, oneTapLoginShareInfo.idTokenId, null, abstractC846040XGw).LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(boolean r12) {
        /*
            r11 = this;
            X.0XG3 r7 = r11.LLJIJIL
            if (r7 != 0) goto L5
            return
        L5:
            r8 = 0
            X.0XGR r6 = new X.0XGR     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            r6.<init>()     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            java.lang.String r2 = "sotl_total_duration_ms"
            long r0 = r7.LIZIZ()     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            r6.LIZIZ(r0, r2)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            java.lang.String r10 = "sotl_fetch_token_duration_ms"
            long r2 = r7.LIZIZ     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L28
            long r0 = r7.LIZJ     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto L28
            long r0 = r0 - r2
            goto L2a
        L28:
            r0 = 0
        L2a:
            r6.LIZIZ(r0, r10)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            java.lang.String r10 = "sotl_oidc_login_duration_ms"
            long r2 = r7.LIZLLL     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3e
            long r0 = r7.LJ     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto L3e
            long r4 = r0 - r2
        L3e:
            r6.LIZIZ(r4, r10)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            java.lang.String r1 = "sotl_has_token_at_click"
            boolean r0 = r7.LJFF     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            if (r0 == 0) goto L5c
            java.lang.String r0 = "1"
        L4a:
            r6.LIZLLL(r1, r0)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            java.lang.String r1 = "sotl_login_status"
            if (r12 == 0) goto L59
            java.lang.String r0 = "success"
        L55:
            r6.LIZLLL(r1, r0)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            goto L5f
        L59:
            java.lang.String r0 = "fail"
            goto L55
        L5c:
            java.lang.String r0 = "0"
            goto L4a
        L5f:
            if (r12 != 0) goto L7f
            java.lang.String r1 = r7.LJI     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            if (r1 == 0) goto L6b
            java.lang.String r0 = "sotl_fail_stage"
            r6.LIZJ(r0, r1)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
        L6b:
            java.lang.String r1 = r7.LJII     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            if (r1 == 0) goto L75
            java.lang.String r0 = "sotl_error_code"
            r6.LIZJ(r0, r1)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
        L75:
            java.lang.String r1 = r7.LJIIIIZZ     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            if (r1 == 0) goto L7f
            java.lang.String r0 = "sotl_error_desc"
            r6.LIZJ(r0, r1)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
        L7f:
            java.lang.String r1 = "sotl_login_flow"
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LIZ     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            X.C20684815ws.LJIILLIIL(r1, r0)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8f
            goto L8c
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8f
        L8c:
            r11.LLJIJIL = r8
            return
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8f
            r11.LLJIJIL = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLViewModel.wQ2(boolean):void");
    }
}
