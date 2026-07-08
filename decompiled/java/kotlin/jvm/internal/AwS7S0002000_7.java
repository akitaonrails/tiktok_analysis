package kotlin.jvm.internal;

import X.C09AY;
import X.C510740K1g;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS7S0002000_7 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1031i0;
    public int i1;

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

    public static final Object invoke$0(AwS7S0002000_7 awS7S0002000_7, Object obj) {
        C510740K1g.LIZLLL((SpannableStringBuilder) obj, awS7S0002000_7.f1031i0, awS7S0002000_7.i1, 61, false, 33);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0002000_7 awS7S0002000_7, Object obj) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        C510740K1g.LIZJ(spannableStringBuilder, new StrikethroughSpan(), 0, awS7S0002000_7.f1031i0, 34);
        C510740K1g.LIZJ(spannableStringBuilder, new ForegroundColorSpan(awS7S0002000_7.i1), 0, awS7S0002000_7.f1031i0, 34);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0002000_7(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f1031i0 = i;
        this.i1 = i2;
    }
}
