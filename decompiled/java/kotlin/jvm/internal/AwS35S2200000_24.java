package kotlin.jvm.internal;

import X.AbstractC1569120qw2;
import X.AbstractC712110RwX;
import X.C09AY;
import X.C123100dR;
import X.C1569060qvw;
import X.C1569070qvx;
import X.C1605720rt4;
import X.C1741560vQA;
import X.C1893580zNM;
import X.C2188811AlT;
import X.C712120RwY;
import X.C712130RwZ;
import X.C727510SgH;
import X.C727780Sgi;
import X.C727890Sgt;
import X.EnumC1605740rt6;
import android.content.Context;
import com.ss.android.ugc.aweme.story.api.SkylightStoryNegativeFeedbackInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS35S2200000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS35S2200000_24 awS35S2200000_24) {
        Object next;
        List list = (List) ((LinkedHashMap) C1569070qvx.LIZLLL).get((AbstractC1569120qw2) awS35S2200000_24.l2);
        if (list != null) {
            String str = awS35S2200000_24.s1;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((SkylightStoryNegativeFeedbackInfo) next).authorId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SkylightStoryNegativeFeedbackInfo skylightStoryNegativeFeedbackInfo = (SkylightStoryNegativeFeedbackInfo) next;
            if (skylightStoryNegativeFeedbackInfo != null) {
                skylightStoryNegativeFeedbackInfo.selectedMethodList.add(Integer.valueOf(((AbstractC712110RwX) awS35S2200000_24.l3).LIZ));
                if (Intrinsics.LJFF((AbstractC712110RwX) awS35S2200000_24.l3, C712120RwY.LIZIZ)) {
                    C1569070qvx.LJIIIZ.put((AbstractC1569120qw2) awS35S2200000_24.l2, Boolean.TRUE);
                }
                if (Intrinsics.LJFF((AbstractC712110RwX) awS35S2200000_24.l3, C712130RwZ.LIZIZ) && C123100dR.LIZ(awS35S2200000_24.s0)) {
                    Map<AbstractC1569120qw2, C1569060qvw> map = C1569070qvx.LJIIJ;
                    C1569060qvw c1569060qvw = (C1569060qvw) ((LinkedHashMap) map).get((AbstractC1569120qw2) awS35S2200000_24.l2);
                    if (c1569060qvw == null) {
                        c1569060qvw = new C1569060qvw(null);
                        map.put((AbstractC1569120qw2) awS35S2200000_24.l2, c1569060qvw);
                    }
                    if (!c1569060qvw.LIZIZ.contains(awS35S2200000_24.s0)) {
                        c1569060qvw.LIZ.add(awS35S2200000_24.s0);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S2200000_24 awS35S2200000_24) {
        C1893580zNM.LJ(C1893580zNM.LIZ, (Context) awS35S2200000_24.l2, null, awS35S2200000_24.s0, awS35S2200000_24.s1, false, (Map) awS35S2200000_24.l3, null, null, 192);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS35S2200000_24 awS35S2200000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS35S2200000_24.s0);
        sbLIZ.append('[');
        sbLIZ.append(((C1741560vQA) awS35S2200000_24.l2).LIZIZ);
        sbLIZ.append("][");
        sbLIZ.append(awS35S2200000_24.s1);
        sbLIZ.append("]: ");
        sbLIZ.append((Map) awS35S2200000_24.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS35S2200000_24 awS35S2200000_24) {
        C727780Sgi c727780Sgi = ((C1605720rt4) awS35S2200000_24.l2).LIZJ().get(awS35S2200000_24.s0);
        if (c727780Sgi != null && c727780Sgi.LIZ == 1) {
            C727510SgH c727510SgHLJIILJJIL = ((C1605720rt4) awS35S2200000_24.l2).LIZJ.LJIILJJIL(awS35S2200000_24.s0, c727780Sgi, awS35S2200000_24.s1);
            C727780Sgi c727780Sgi2 = c727510SgHLJIILJJIL.LIZ;
            C727890Sgt c727890Sgt = C727890Sgt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markOneStoryRead: ");
            sbLIZ.append(awS35S2200000_24.s1);
            sbLIZ.append(", status: ");
            sbLIZ.append(c727780Sgi2.LIZ);
            sbLIZ.append(", version: ");
            sbLIZ.append(c727780Sgi2.LIZIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c727890Sgt.getClass();
            C727890Sgt.LIZIZ("SocPubStatusCache", strLIZIZ);
            if (c727780Sgi2.LIZ == 2) {
                ((Function1) awS35S2200000_24.l3).invoke(c727510SgHLJIILJJIL);
                ((C1605720rt4) awS35S2200000_24.l2).LIZLLL(awS35S2200000_24.s0, c727780Sgi2, EnumC1605740rt6.MARK_READ);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S2200000_24(Context context, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = context;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S2200000_24(AbstractC712110RwX abstractC712110RwX, AbstractC1569120qw2 abstractC1569120qw2, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = abstractC1569120qw2;
        this.l3 = abstractC712110RwX;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S2200000_24(C1605720rt4 c1605720rt4, C1605720rt4 c1605720rt42, String str, String str2, Function1<? super C727510SgH, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l2 = c1605720rt4;
        this.s0 = c1605720rt42;
        this.s1 = str;
        this.l3 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S2200000_24(String str, String str2, C1741560vQA c1741560vQA, String str3, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = c1741560vQA;
        this.l3 = str3;
    }
}
