package com.ss.android.ugc.aweme.launcher.serviceimpl.account;

import X.C0WZX;
import X.C0XPA;
import X.C0XPB;
import X.C0XPE;
import X.C0XPY;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C847400XMc;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.launcher.service.account.IAccountApi;
import com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;
import java.util.Collection;
import java.util.Locale;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountImpl implements IAccountApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String LIZIZ() {
        return "mobile";
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZ() {
        C0XPA c0xpa = C0XPA.LIZLLL;
        c0xpa.getClass();
        c0xpa.LIZIZ(C0XPY.LIZIZ);
        C0XPB[] c0xpbArr = c0xpa.LIZIZ;
        for (C0XPB c0xpb : c0xpbArr) {
            if (c0xpb.LIZJ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final C0XPE LJ() {
        return new I18nLoginActivityComponent();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String getSessionId() throws Throwable {
        String strLLIZ;
        String shareCookieHost;
        try {
            shareCookieHost = NetworkUtils.getShareCookieHost();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            strLLIZ = "";
        }
        if (!shareCookieHost.toLowerCase(Locale.ROOT).startsWith("https")) {
            throw new IllegalArgumentException("Cookie url must be https");
        }
        strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), shareCookieHost, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7pktJzaxsj5oDBa6+tQ==", null));
        if (TextUtils.isEmpty(strLLIZ)) {
            return null;
        }
        if (TextUtils.isEmpty(strLLIZ)) {
            return "";
        }
        for (String str : strLLIZ.split(";")) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && strArrSplit[0].trim().equals(fe.e)) {
                    return strArrSplit[1];
                }
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZJ(String str) {
        return C0XPA.LIZLLL.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJI(Collection<String> collection) {
        C847400XMc.LIZ(collection);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJFF(String str, String str2, String str3) {
    }
}
