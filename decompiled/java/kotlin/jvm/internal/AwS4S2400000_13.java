package kotlin.jvm.internal;

import X.C09AY;
import X.C0WZX;
import X.C0XWD;
import X.C2204961BRm;
import X.C5183020f;
import Y.AObjectS356S0100000_13;
import Y.AObjectS388S0100000_13;
import android.content.ContentResolver;
import android.net.Uri;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS4S2400000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS4S2400000_13 awS4S2400000_13, Object obj) {
        return C2204961BRm.LJJJ((ContentResolver) awS4S2400000_13.l2, (Uri) awS4S2400000_13.l3, (String[]) awS4S2400000_13.l4, awS4S2400000_13.s0, (String[]) awS4S2400000_13.l5, awS4S2400000_13.s1, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8JkXbf8ZNEOhg+Y15ZsKoA21i13S2CRXGtR8W7GPOl/KiiFysiy", null));
    }

    public static final Object invoke$1(AwS4S2400000_13 awS4S2400000_13, Object obj) {
        OneClickLoginService oneClickLoginService = (OneClickLoginService) awS4S2400000_13.l2;
        oneClickLoginService.LJIIIIZZ(oneClickLoginService.LJIIJJI(), (C0XWD) awS4S2400000_13.l3, awS4S2400000_13.s0, awS4S2400000_13.s1, new AwS557S0100000_13((Function0) awS4S2400000_13.l4, 171), new C5183020f((Function1) awS4S2400000_13.l5, (Function1<? super Long, Object>) 267));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S2400000_13(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, int i) {
        super(1);
        this.$t = i;
        this.l2 = contentResolver;
        this.l3 = uri;
        this.l4 = strArr;
        this.s0 = str;
        this.l5 = strArr2;
        this.s1 = "sort_key";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S2400000_13(OneClickLoginService oneClickLoginService, C0XWD c0xwd, String str, String str2, AObjectS388S0100000_13 aObjectS388S0100000_13, AObjectS356S0100000_13 aObjectS356S0100000_13, int i) {
        super(1);
        this.$t = i;
        this.l2 = oneClickLoginService;
        this.l3 = c0xwd;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = aObjectS388S0100000_13;
        this.l5 = aObjectS356S0100000_13;
    }
}
