package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.InterfaceC20325014fw;
import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondReplacePasskeyPopupEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS0S4310000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z7;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S4310000_31 awS0S4310000_31, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String string = ((Activity) awS0S4310000_31.l4).getString(2131839114);
        CredentialManagerService credentialManagerService = (CredentialManagerService) awS0S4310000_31.l5;
        Activity activity = (Activity) awS0S4310000_31.l4;
        String str = awS0S4310000_31.s0;
        String str2 = awS0S4310000_31.s1;
        boolean z = awS0S4310000_31.z7;
        c1397620mTQ.LIZJ(0, string, new AwS0S4310000_31(activity, (InterfaceC20325014fw) awS0S4310000_31.l6, credentialManagerService, str, str2, awS0S4310000_31.s2, awS0S4310000_31.s3, z, 1));
        c1397620mTQ.LJII(2131839115, null);
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S4310000_31 awS0S4310000_31, Object obj) {
        RespondReplacePasskeyPopupEvent respondReplacePasskeyPopupEvent = new RespondReplacePasskeyPopupEvent();
        respondReplacePasskeyPopupEvent.LJI("info_page", "enter_from");
        respondReplacePasskeyPopupEvent.LJI("click", "enter_method");
        respondReplacePasskeyPopupEvent.LJI(1, "result");
        respondReplacePasskeyPopupEvent.LJIIIIZZ();
        ((CredentialManagerService) awS0S4310000_31.l4).LJJ((Activity) awS0S4310000_31.l5, awS0S4310000_31.s0, awS0S4310000_31.s1, awS0S4310000_31.z7, false, false, awS0S4310000_31.s2, awS0S4310000_31.s3, (InterfaceC20325014fw) awS0S4310000_31.l6);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S4310000_31(android.app.Activity r3, X.InterfaceC20325014fw r4, com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, int r11) {
        /*
            r2 = this;
            r2.$t = r11
            if (r11 == 0) goto L1a
            r1 = r2
            r1.l4 = r5
            r1.l5 = r3
            r1.s0 = r6
            r1.s1 = r7
            r1.z7 = r10
            r1.s2 = r8
            r1.s3 = r9
            r1.l6 = r4
            r0 = 1
        L16:
            r1.<init>(r0)
            return
        L1a:
            r1 = r2
            r1.l4 = r3
            r1.l5 = r5
            r1.s0 = r6
            r1.s1 = r7
            r1.z7 = r10
            r1.s2 = r8
            r1.s3 = r9
            r1.l6 = r4
            r0 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S4310000_31.<init>(android.app.Activity, X.14fw, com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }
}
