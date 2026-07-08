package kotlin.jvm.internal;

import X.C09AY;
import X.C426930God;
import X.C510730K1f;
import X.C510740K1g;
import X.C521550Kcr;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS26S0102000_7 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AwS26S0102000_7 awS26S0102000_7, Object obj) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        C510740K1g.LIZLLL(spannableStringBuilder, awS26S0102000_7.i1, awS26S0102000_7.i2, 52, true, 33);
        C510740K1g.LIZJ(spannableStringBuilder, new ForegroundColorSpan(C426930God.LIZ(R.attr.a1h, ((C510730K1f) awS26S0102000_7.l0).itemView.getContext())), awS26S0102000_7.i1, awS26S0102000_7.i2, 33);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S0102000_7 awS26S0102000_7, Object obj) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        C510740K1g.LIZLLL(spannableStringBuilder, awS26S0102000_7.i1, awS26S0102000_7.i2, 62, true, 33);
        C510740K1g.LIZJ(spannableStringBuilder, new C521550Kcr((Context) awS26S0102000_7.l0, 13), awS26S0102000_7.i1, awS26S0102000_7.i2, 33);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0102000_7(int i, int i2, C510730K1f c510730K1f, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = c510730K1f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0102000_7(int i, int i2, Context context, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = context;
    }
}
