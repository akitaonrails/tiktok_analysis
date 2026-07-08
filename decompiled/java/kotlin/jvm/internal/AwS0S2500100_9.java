package kotlin.jvm.internal;

import X.C09AY;
import X.C957403oi;
import X.EnumC586340MzA;
import X.EnumC598910NeL;
import X.EnumC598920NeM;
import X.EnumC599040NeY;
import X.EnumC599160Nek;
import X.EnumC599330Nf1;
import X.EnumC599340Nf2;
import X.EnumC599400Nf8;
import X.EnumC599500NfI;
import X.EnumC599530NfL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS0S2500100_9 extends C09AY implements Function1 {
    public final int $t;
    public long j7;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
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

    public static final Object invoke$0(AwS0S2500100_9 awS0S2500100_9, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("name", awS0S2500100_9.s0);
        c957403oi.LIZLLL("type", ((EnumC599530NfL) awS0S2500100_9.l2).getValue());
        c957403oi.LIZLLL("step", ((EnumC598910NeL) awS0S2500100_9.l3).getValue());
        c957403oi.LIZLLL("current_container", ((EnumC599400Nf8) awS0S2500100_9.l4).getSource());
        c957403oi.LIZLLL("operation", Integer.valueOf(((EnumC599040NeY) awS0S2500100_9.l5).getValue()));
        String str = awS0S2500100_9.s1;
        if (str != null) {
            c957403oi.LIZLLL("message", str);
        }
        EnumC598920NeM enumC598920NeM = (EnumC598920NeM) awS0S2500100_9.l6;
        if (enumC598920NeM != null) {
            c957403oi.LIZLLL("code", enumC598920NeM.getCode());
        }
        c957403oi.LIZLLL("duration", Long.valueOf(awS0S2500100_9.j7));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2500100_9 awS0S2500100_9, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("event_name", awS0S2500100_9.s0);
        c957403oi.LIZLLL("event_type", ((EnumC599500NfI) awS0S2500100_9.l2).getValue());
        c957403oi.LIZLLL("step", ((EnumC599160Nek) awS0S2500100_9.l3).getValue());
        c957403oi.LIZLLL("current_container", ((EnumC599340Nf2) awS0S2500100_9.l4).getValue());
        c957403oi.LIZLLL("operation", ((EnumC599330Nf1) awS0S2500100_9.l5).getValue());
        String str = awS0S2500100_9.s1;
        if (str != null) {
            c957403oi.LIZLLL("message", str);
        }
        EnumC586340MzA enumC586340MzA = (EnumC586340MzA) awS0S2500100_9.l6;
        if (enumC586340MzA != null) {
            c957403oi.LIZLLL("code", enumC586340MzA.getValue());
        }
        c957403oi.LIZLLL("duration", Long.valueOf(awS0S2500100_9.j7));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2500100_9(String str, EnumC599500NfI enumC599500NfI, EnumC599160Nek enumC599160Nek, EnumC599340Nf2 enumC599340Nf2, EnumC599330Nf1 enumC599330Nf1, String str2, EnumC586340MzA enumC586340MzA, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = enumC599500NfI;
        this.l3 = enumC599160Nek;
        this.l4 = enumC599340Nf2;
        this.l5 = enumC599330Nf1;
        this.s1 = str2;
        this.l6 = enumC586340MzA;
        this.j7 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2500100_9(String str, EnumC599530NfL enumC599530NfL, EnumC598910NeL enumC598910NeL, EnumC599400Nf8 enumC599400Nf8, EnumC599040NeY enumC599040NeY, String str2, EnumC598920NeM enumC598920NeM, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = enumC599530NfL;
        this.l3 = enumC598910NeL;
        this.l4 = enumC599400Nf8;
        this.l5 = enumC599040NeY;
        this.s1 = str2;
        this.l6 = enumC598920NeM;
        this.j7 = j;
    }
}
