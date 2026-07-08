package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1068220du8;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS3S1111000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS3S1111000_16 awS3S1111000_16, Object obj) {
        Object obj2;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1068220du8.LIZ.getClass();
        c1023640ckE.withParam(C1068220du8.LJII, String.valueOf(awS3S1111000_16.i3));
        c1023640ckE.withParam(C1068220du8.LJIIIIZZ, awS3S1111000_16.s0);
        C1002190cBd c1002190cBd = C1068220du8.LJIIIZ;
        String str = "1";
        if (awS3S1111000_16.z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, obj2);
        C1002190cBd c1002190cBd2 = C1068220du8.LIZIZ;
        if (((BaseResponse) awS3S1111000_16.l1).status_code != 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd2, str);
        c1023640ckE.withParam(C1068220du8.LJIIJ, ((BaseResponse) awS3S1111000_16.l1).status_msg);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S1111000_16 awS3S1111000_16, Object obj) {
        String str;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1068220du8.LIZ.getClass();
        c1023640ckE.withParam(C1068220du8.LJII, String.valueOf(awS3S1111000_16.i3));
        c1023640ckE.withParam(C1068220du8.LJIIIIZZ, awS3S1111000_16.s0);
        C1002190cBd c1002190cBd = C1068220du8.LJIIIZ;
        if (awS3S1111000_16.z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C1068220du8.LIZIZ, CardStruct.IStatusCode.DEFAULT);
        c1023640ckE.withParam(C1068220du8.LJIIJ, ((Throwable) awS3S1111000_16.l1).getMessage());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1111000_16(int i, String str, boolean z, BaseResponse baseResponse, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = baseResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1111000_16(Throwable th, boolean z, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = th;
    }
}
