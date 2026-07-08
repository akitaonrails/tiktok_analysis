package kotlin.jvm.internal;

import X.C09AY;
import X.C0QEB;
import X.C0QN9;
import X.C653660PkS;
import X.C670730QSp;
import X.EnumC670740QSq;
import android.content.Context;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS0S4500000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
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

    public static final Object invoke$0(AwS0S4500000_10 awS0S4500000_10, Object obj) {
        C0QEB c0qeb = C0QEB.LIZ;
        Word word = (Word) awS0S4500000_10.l4;
        C653660PkS c653660PkS = (C653660PkS) awS0S4500000_10.l5;
        String value = EnumC670740QSq.REPORT.getValue();
        String str = awS0S4500000_10.s0;
        String str2 = awS0S4500000_10.s1;
        String str3 = awS0S4500000_10.s2;
        String str4 = awS0S4500000_10.s3;
        c0qeb.getClass();
        C0QEB.LIZJ(word, c653660PkS, value, str, str2, str3, str4);
        C670730QSp c670730QSp = C670730QSp.LIZ;
        Context context = (Context) awS0S4500000_10.l6;
        Word word2 = (Word) awS0S4500000_10.l4;
        C653660PkS c653660PkS2 = (C653660PkS) awS0S4500000_10.l5;
        String str5 = awS0S4500000_10.s0;
        C0QN9 c0qn9 = (C0QN9) awS0S4500000_10.l7;
        String str6 = awS0S4500000_10.s1;
        String str7 = awS0S4500000_10.s2;
        Function1 function1 = (Function1) awS0S4500000_10.l8;
        c670730QSp.getClass();
        C670730QSp.LIZLLL(context, word2, c653660PkS2, str5, c0qn9, str6, str7, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S4500000_10 awS0S4500000_10, Object obj) {
        C0QEB c0qeb = C0QEB.LIZ;
        Word word = (Word) awS0S4500000_10.l4;
        C653660PkS c653660PkS = (C653660PkS) awS0S4500000_10.l5;
        String value = EnumC670740QSq.REPORT.getValue();
        String str = awS0S4500000_10.s0;
        String str2 = awS0S4500000_10.s1;
        String str3 = awS0S4500000_10.s2;
        String str4 = awS0S4500000_10.s3;
        c0qeb.getClass();
        C0QEB.LIZJ(word, c653660PkS, value, str, str2, str3, str4);
        C670730QSp c670730QSp = C670730QSp.LIZ;
        Context context = (Context) awS0S4500000_10.l6;
        Word word2 = (Word) awS0S4500000_10.l4;
        C653660PkS c653660PkS2 = (C653660PkS) awS0S4500000_10.l5;
        String str5 = awS0S4500000_10.s0;
        C0QN9 c0qn9 = (C0QN9) awS0S4500000_10.l7;
        String str6 = awS0S4500000_10.s1;
        String str7 = awS0S4500000_10.s2;
        Function1 function1 = (Function1) awS0S4500000_10.l8;
        c670730QSp.getClass();
        C670730QSp.LIZLLL(context, word2, c653660PkS2, str5, c0qn9, str6, str7, function1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S4500000_10(Word word, Word word2, C653660PkS c653660PkS, String str, String str2, String str3, String str4, Context context, C0QN9 c0qn9, Function1<? super String, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l4 = word;
        this.l5 = word2;
        this.s0 = c653660PkS;
        this.s1 = str;
        this.s2 = str2;
        this.s3 = str3;
        this.l6 = str4;
        this.l7 = context;
        this.l8 = c0qn9;
    }
}
