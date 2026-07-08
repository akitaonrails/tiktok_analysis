package kotlin.jvm.internal;

import X.C09AY;
import X.C201996141y;
import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS129S1000000_29 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1000000_29(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS129S1000000_29 awS129S1000000_29, Object obj, Object obj2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(awS129S1000000_29.s0);
        C201996141y.LIZ.getClass();
        C201996141y.LJIIIZ(spannableStringBuilder, (Context) obj, (Function0) obj2);
        return spannableStringBuilder;
    }

    public static final Object invoke$1(AwS129S1000000_29 awS129S1000000_29, Object obj, Object obj2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(awS129S1000000_29.s0);
        C201996141y.LIZ.getClass();
        C201996141y.LJIIIZ(spannableStringBuilder, (Context) obj, (Function0) obj2);
        return spannableStringBuilder;
    }
}
