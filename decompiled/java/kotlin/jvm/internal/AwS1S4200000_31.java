package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC20325014fw;
import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS1S4200000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AwS1S4200000_31 awS1S4200000_31, Object obj) {
        ((CredentialManagerService) awS1S4200000_31.l4).LJJ((Activity) awS1S4200000_31.l5, awS1S4200000_31.s0, awS1S4200000_31.s1, true, true, true, awS1S4200000_31.s2, awS1S4200000_31.s3, (InterfaceC20325014fw) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S4200000_31 awS1S4200000_31, Object obj) {
        ((CredentialManagerService) awS1S4200000_31.l4).LJJ((Activity) awS1S4200000_31.l5, awS1S4200000_31.s0, awS1S4200000_31.s1, true, true, true, awS1S4200000_31.s2, awS1S4200000_31.s3, (InterfaceC20325014fw) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S4200000_31(CredentialManagerService credentialManagerService, Activity activity, String str, String str2, String str3, String str4, int i) {
        super(1);
        this.$t = i;
        this.l4 = credentialManagerService;
        this.l5 = activity;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
