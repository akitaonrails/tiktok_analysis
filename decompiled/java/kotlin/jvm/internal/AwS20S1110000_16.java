package kotlin.jvm.internal;

import X.C09AY;
import X.C1025140cme;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS20S1110000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S1110000_16 awS20S1110000_16) throws Throwable {
        Uri uri;
        if (!awS20S1110000_16.z2) {
            Context context = (Context) awS20S1110000_16.l1;
            String str = awS20S1110000_16.s0;
            if (str != null) {
                uri = UriProtector.parse(str);
            } else {
                uri = null;
            }
            C1025140cme.LJI(context, uri);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S1110000_16 awS20S1110000_16) {
        Uri uri;
        if (!awS20S1110000_16.z2) {
            Context context = (Context) awS20S1110000_16.l1;
            String str = awS20S1110000_16.s0;
            if (str != null) {
                uri = UriProtector.parse(str);
            } else {
                uri = null;
            }
            C1025140cme.LJ(context, uri);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S1110000_16 awS20S1110000_16) {
        Uri uri;
        if (!awS20S1110000_16.z2) {
            Context context = (Context) awS20S1110000_16.l1;
            String str = awS20S1110000_16.s0;
            if (str != null) {
                uri = UriProtector.parse(str);
            } else {
                uri = null;
            }
            C1025140cme.LJ(context, uri);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1110000_16(Context context, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l1 = context;
        this.s0 = str;
    }
}
