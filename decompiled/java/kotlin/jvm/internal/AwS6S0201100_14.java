package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y7A;
import X.C0Y7D;
import X.C0Y7K;
import X.C868500Y5g;
import X.C868620Y5s;
import X.C868720Y6c;
import com.bytedance.im.core.proto.MessageBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS6S0201100_14 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0201100_14 awS6S0201100_14, Object obj) {
        C0Y7A c0y7a = new C0Y7A(((C868620Y5s) awS6S0201100_14.l0).LIZ);
        MessageBody messageBody = (MessageBody) awS6S0201100_14.l1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS6S0201100_14.j3;
        C868620Y5s c868620Y5s = (C868620Y5s) awS6S0201100_14.l0;
        int i = c868620Y5s.LIZIZ;
        c0y7a.LIZ((C0Y7K) obj, new C0Y7D(c868620Y5s.LIZJ, jCurrentTimeMillis, ((C868620Y5s) awS6S0201100_14.l0).LJFF, i, c868620Y5s.LJ, awS6S0201100_14.i2, c868620Y5s.LIZLLL.getValue()), messageBody);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0201100_14 awS6S0201100_14, Object obj) {
        C0Y7A c0y7a = new C0Y7A(((C868720Y6c) awS6S0201100_14.l0).LIZ);
        MessageBody messageBody = (MessageBody) awS6S0201100_14.l1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS6S0201100_14.j3;
        C868720Y6c c868720Y6c = (C868720Y6c) awS6S0201100_14.l0;
        int i = c868720Y6c.LIZJ;
        c0y7a.LIZ((C0Y7K) obj, new C0Y7D(c868720Y6c.LIZIZ, jCurrentTimeMillis, ((C868720Y6c) awS6S0201100_14.l0).LJFF, i, c868720Y6c.LJ, awS6S0201100_14.i2, c868720Y6c.LIZLLL.getValue()), messageBody);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S0201100_14 awS6S0201100_14, Object obj) {
        C0Y7A c0y7a = new C0Y7A(((C868500Y5g) awS6S0201100_14.l0).LIZ);
        MessageBody messageBody = (MessageBody) awS6S0201100_14.l1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS6S0201100_14.j3;
        C868500Y5g c868500Y5g = (C868500Y5g) awS6S0201100_14.l0;
        int i = c868500Y5g.LIZIZ;
        c0y7a.LIZ((C0Y7K) obj, new C0Y7D(c868500Y5g.LIZJ, jCurrentTimeMillis, ((C868500Y5g) awS6S0201100_14.l0).LJFF, i, awS6S0201100_14.i2, c868500Y5g.LIZLLL, c868500Y5g.LJ.getValue()), messageBody);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0201100_14(C868500Y5g c868500Y5g, MessageBody messageBody, long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c868500Y5g;
        this.l1 = messageBody;
        this.j3 = j;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0201100_14(C868620Y5s c868620Y5s, MessageBody messageBody, long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c868620Y5s;
        this.l1 = messageBody;
        this.j3 = j;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0201100_14(C868720Y6c c868720Y6c, MessageBody messageBody, long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c868720Y6c;
        this.l1 = messageBody;
        this.j3 = j;
        this.i2 = i;
    }
}
