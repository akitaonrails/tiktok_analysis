package com.tts.oecverify.verify;

import X.AbstractC202199149t;
import X.C149V;
import X.C14A2;
import X.C14A3;
import X.C1C7U;
import X.C202185149f;
import X.C202191149l;
import X.InterfaceC202181149b;
import X.InterfaceC202182149c;
import Y.ARunnableS38S0400000_30;
import android.app.Activity;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.BdTuringCallback;
import com.tts.oecverify.BdTuringConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class LoginVerifyService implements C14A2 {
    public final InterfaceC202182149c mLoginHandler;
    public final C14A3 reportCallback;

    /* JADX INFO: renamed from: lambda$semisugar$execute$lambda-0$0, reason: not valid java name */
    public static /* synthetic */ void m357lambda$semisugar$execute$lambda0$0(AbstractC202199149t abstractC202199149t, LoginVerifyService loginVerifyService, Activity activity, BdTuringCallback bdTuringCallback) {
        C1C7U.LIZ("LoginVerifyService@d640.execute$1L");
        m356execute$lambda0(abstractC202199149t, loginVerifyService, activity, bdTuringCallback);
        C1C7U.LIZIZ("LoginVerifyService@d640.execute$1L");
    }

    @Override // X.C14A2
    public boolean isProcess(int i) {
        return i == 14;
    }

    public LoginVerifyService() {
        BdTuringConfig config = BdTuring.getInstance().getConfig();
        this.mLoginHandler = config == null ? null : config.getVerifyLoginHandler();
        this.reportCallback = new C14A3() { // from class: X.14A0
            @Override // X.C14A3
            public final void LIZIZ(String str, int i, long j, String str2, String str3, int i2, String str4) {
            }

            @Override // X.C14A3
            public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
                C202191149l.LJIIJ(i, i2, i3, i4, str, str2, str3, str4);
            }
        };
    }

    public final C14A3 getReportCallback() {
        return this.reportCallback;
    }

    @Override // X.C14A2
    public boolean execute(AbstractC202199149t abstractC202199149t, BdTuringCallback bdTuringCallback) {
        Activity topActivity;
        BdTuringConfig config = BdTuring.getInstance().getConfig();
        if (config == null) {
            topActivity = null;
        } else {
            topActivity = config.getTopActivity();
        }
        if (this.mLoginHandler != null && topActivity != null) {
            Activity activity = abstractC202199149t.LIZ;
            if (activity != null) {
                activity.runOnUiThread(new ARunnableS38S0400000_30(abstractC202199149t, this, topActivity, bdTuringCallback, 3));
            }
            return true;
        }
        C202185149f c202185149f = C202185149f.LIZ;
        C202185149f.LJIIIIZZ(this.reportCallback, abstractC202199149t.LIZIZ(), 9, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), abstractC202199149t.LJIIJ());
        C202191149l.LJII(abstractC202199149t, C149V.VERIFY_POP_LOGIN_FAIL.getCode(), 0L, null, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.149s] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m356execute$lambda0(final AbstractC202199149t abstractC202199149t, final LoginVerifyService loginVerifyService, Activity activity, final BdTuringCallback bdTuringCallback) {
        C202191149l.LIZ = System.currentTimeMillis();
        C202191149l.LJI(0, abstractC202199149t.LJIIJ(), abstractC202199149t.LJII(), abstractC202199149t.LJFF(), abstractC202199149t.LJ());
        loginVerifyService.mLoginHandler.LIZ(activity, new InterfaceC202181149b() { // from class: X.149s
            @Override // X.InterfaceC202181149b
            public final void LIZIZ(JSONObject jSONObject) {
                C202185149f c202185149f = C202185149f.LIZ;
                C202185149f.LJIIIIZZ(this.LIZ.getReportCallback(), abstractC202199149t.LIZIZ(), 0, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), abstractC202199149t.LJIIJ());
                C202191149l.LJIILL(0, abstractC202199149t.LJIIJ(), 0, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), 0, abstractC202199149t.LJ());
                bdTuringCallback.onSuccess(0, jSONObject);
            }

            @Override // X.InterfaceC202181149b
            public final void onFail(int i) {
                if (i != 1 && i != 8) {
                    if (i == 9) {
                        C202185149f c202185149f = C202185149f.LIZ;
                        C202185149f.LJIIIIZZ(this.LIZ.getReportCallback(), abstractC202199149t.LIZIZ(), 9, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), abstractC202199149t.LJIIJ());
                        C202191149l.LJII(abstractC202199149t, C149V.VERIFY_POP_LOGIN_FAIL.getCode(), 0L, null, null);
                    }
                } else {
                    C202185149f c202185149f2 = C202185149f.LIZ;
                    C202185149f.LJIIIIZZ(this.LIZ.getReportCallback(), abstractC202199149t.LIZIZ(), i, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), abstractC202199149t.LJIIJ());
                    C202191149l.LJIILL(i, abstractC202199149t.LJIIJ(), 0, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), 0, abstractC202199149t.LJ());
                }
                bdTuringCallback.onFail(i, null);
            }
        });
    }
}
