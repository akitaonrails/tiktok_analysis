package kotlin.jvm.internal;

import X.C09AY;
import X.C497740JfY;
import X.C766270U4b;
import X.C916750Zxp;
import X.C917840Zza;
import X.C953110auT;
import X.C953120auU;
import X.C953620avI;
import X.EnumC937290aUx;
import X.EnumC952890au7;
import X.EnumC953170auZ;
import X.EnumC953330aup;
import X.InterfaceC917550Zz7;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS0S6710000_15 extends C09AY implements Function2 {
    public final int $t;
    public Object l10;
    public Object l11;
    public Object l12;
    public Object l6;
    public Object l7;
    public Object l8;
    public Object l9;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public boolean z13;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S6710000_15 awS0S6710000_15, Object obj, Object obj2) {
        InterfaceC917550Zz7 interfaceC917550Zz7;
        InterfaceC917550Zz7 interfaceC917550Zz72;
        String str = (String) obj;
        if (str.length() > 0) {
            WeakReference weakReference = (WeakReference) awS0S6710000_15.l6;
            if (weakReference != null && (interfaceC917550Zz72 = (InterfaceC917550Zz7) weakReference.get()) != null) {
                interfaceC917550Zz72.LJFF((C916750Zxp) awS0S6710000_15.l7, str);
            }
            if (awS0S6710000_15.z13) {
                C953620avI.LIZLLL(C953110auT.LIZ(awS0S6710000_15.s0, (EnumC937290aUx) awS0S6710000_15.l8, (EnumC953330aup) awS0S6710000_15.l9, awS0S6710000_15.s1, (WeakReference) awS0S6710000_15.l6, (C917840Zza) awS0S6710000_15.l10, (EnumC952890au7) awS0S6710000_15.l11, (C916750Zxp) awS0S6710000_15.l7, awS0S6710000_15.s2, awS0S6710000_15.s3, (Long) awS0S6710000_15.l12, awS0S6710000_15.s4, awS0S6710000_15.s5, str));
            }
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855118));
            WeakReference weakReference2 = (WeakReference) awS0S6710000_15.l6;
            if (weakReference2 != null && (interfaceC917550Zz7 = (InterfaceC917550Zz7) weakReference2.get()) != null) {
                interfaceC917550Zz7.LJ((C916750Zxp) awS0S6710000_15.l7, EnumC953170auZ.UPLOAD_FAIL, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S6710000_15 awS0S6710000_15, Object obj, Object obj2) {
        String str = (String) obj;
        if (str.length() > 0) {
            if (awS0S6710000_15.z13) {
                C953620avI.LIZLLL(C953120auU.LIZ(awS0S6710000_15.s0, (EnumC937290aUx) awS0S6710000_15.l6, (EnumC953330aup) awS0S6710000_15.l7, awS0S6710000_15.s1, (Void) awS0S6710000_15.l8, (C917840Zza) awS0S6710000_15.l9, (EnumC952890au7) awS0S6710000_15.l10, (C916750Zxp) awS0S6710000_15.l11, awS0S6710000_15.s2, awS0S6710000_15.s3, (Long) awS0S6710000_15.l12, awS0S6710000_15.s4, awS0S6710000_15.s5, str));
            }
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855118));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S6710000_15(WeakReference weakReference, WeakReference<InterfaceC917550Zz7> weakReference2, C916750Zxp c916750Zxp, boolean z, String str, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str2, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, String str3, String str4, Long l, String str5, String str6) {
        super(2);
        this.$t = str6;
        this.l6 = weakReference;
        this.l7 = weakReference2;
        this.z13 = c916750Zxp;
        this.s0 = z;
        this.l8 = str;
        this.l9 = enumC937290aUx;
        this.s1 = enumC953330aup;
        this.l10 = str2;
        this.l11 = c917840Zza;
        this.s2 = enumC952890au7;
        this.s3 = str3;
        this.l12 = str4;
        this.s4 = l;
        this.s5 = str5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S6710000_15(boolean z, String str, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str2, Void r8, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, String str3, String str4, Long l, String str5, String str6, int i) {
        super(2);
        this.$t = i;
        this.z13 = z;
        this.s0 = str;
        this.l6 = enumC937290aUx;
        this.l7 = enumC953330aup;
        this.s1 = str2;
        this.l8 = r8;
        this.l9 = c917840Zza;
        this.l10 = enumC952890au7;
        this.l11 = c916750Zxp;
        this.s2 = str3;
        this.s3 = str4;
        this.l12 = l;
        this.s4 = str5;
        this.s5 = str6;
    }
}
