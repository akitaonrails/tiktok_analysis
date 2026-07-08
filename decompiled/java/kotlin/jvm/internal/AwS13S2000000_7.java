package kotlin.jvm.internal;

import X.C09AY;
import X.C510740K1g;
import android.text.SpannableStringBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AwS13S2000000_7 extends C09AY implements Function1 {
    public final int $t;
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

    public static final Object invoke$0(AwS13S2000000_7 awS13S2000000_7, Object obj) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        int iLJJJ = a0.LJJJ(awS13S2000000_7.s0, awS13S2000000_7.s1, 0, false, 6);
        if (iLJJJ >= 0) {
            C510740K1g.LIZLLL(spannableStringBuilder, iLJJJ, iLJJJ + awS13S2000000_7.s1.length(), 33, false, 33);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S2000000_7 awS13S2000000_7, Object obj) {
        boolean z;
        TemplateInfo templateInfo = (TemplateInfo) obj;
        if (Intrinsics.LJFF(awS13S2000000_7.s0, templateInfo.iapId) && Intrinsics.LJFF(awS13S2000000_7.s1, templateInfo.id)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S2000000_7(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
