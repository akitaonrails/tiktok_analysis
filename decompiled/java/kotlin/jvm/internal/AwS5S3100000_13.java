package kotlin.jvm.internal;

import X.C09AY;
import X.C0VGA;
import X.C0WZX;
import X.C0XGR;
import X.C20684815ws;
import X.C2204961BRm;
import X.C807040VlG;
import X.C807160VlS;
import X.InterfaceC807030VlF;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class AwS5S3100000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS5S3100000_13 awS5S3100000_13, Object obj) throws Throwable {
        String str = (String) obj;
        Editable editableLLJILLL = C2204961BRm.LLJILLL((EditText) awS5S3100000_13.l3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4Oa68zpln4Mus5Z9pvfUQ", null));
        if (TextUtils.isEmpty(editableLLJILLL)) {
            ((EditText) awS5S3100000_13.l3).setText(str);
        } else {
            int iLJJJ = a0.LJJJ(editableLLJILLL.toString(), e3.g, 0, false, 6);
            if (iLJJJ != -1) {
                editableLLJILLL.replace(iLJJJ, editableLLJILLL.length(), str);
            } else {
                editableLLJILLL.append((CharSequence) str);
            }
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", awS5S3100000_13.s0);
        c0xgr.LIZLLL("enter_method", awS5S3100000_13.s1);
        c0xgr.LIZLLL("bind_type", awS5S3100000_13.s2);
        C20684815ws.LJIILLIIL("choose_recommend_email_suffix", c0xgr.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S3100000_13 awS5S3100000_13, Object obj) {
        InterfaceC807030VlF interfaceC807030VlF;
        ((Number) obj).longValue();
        C807040VlG c807040VlG = ((TraceLogWrapApiImpl) awS5S3100000_13.l3).LIZIZ;
        String str = awS5S3100000_13.s0;
        String str2 = awS5S3100000_13.s1;
        String str3 = awS5S3100000_13.s2;
        c807040VlG.getClass();
        C807160VlS c807160VlS = C0VGA.LIZ.get(str);
        if (c807160VlS != null) {
            c807040VlG.LIZ.getClass();
            Object obj2 = c807160VlS.LIZLLL;
            if ((obj2 instanceof InterfaceC807030VlF) && (interfaceC807030VlF = (InterfaceC807030VlF) obj2) != null) {
                interfaceC807030VlF.LIZIZ(str2, str3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S3100000_13(EditText editText, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = editText;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S3100000_13(TraceLogWrapApiImpl traceLogWrapApiImpl, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = traceLogWrapApiImpl;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
