package kotlin.jvm.internal;

import X.C09AY;
import X.C0YUD;
import X.C1397620mTQ;
import X.C15438062q;
import X.C2097908Jt;
import X.C865340Xx6;
import X.C880600Ygc;
import X.C880610Ygd;
import X.C880720Ygo;
import X.C885310YoD;
import X.C885760Yow;
import X.C889840YvW;
import X.C889910Yvd;
import X.C889930Yvf;
import X.EnumC880480YgQ;
import X.InterfaceC863600XuI;
import android.content.Context;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS35S0310000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS35S0310000_14 awS35S0310000_14, Object obj) {
        ((C865340Xx6) awS35S0310000_14.l0).LIZ.LJJJJ((List) awS35S0310000_14.l1, Boolean.valueOf(awS35S0310000_14.z3), (Map) awS35S0310000_14.l2, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S0310000_14 awS35S0310000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(2, ((Context) awS35S0310000_14.l0).getString(R.string.gm7), new AwS35S0310000_14((Context) awS35S0310000_14.l0, (C885760Yow) awS35S0310000_14.l1, (List) awS35S0310000_14.l2, awS35S0310000_14.z3, 2));
        c1397620mTQ.LIZJ(1, ((Context) awS35S0310000_14.l0).getString(R.string.f1_), new AwS593S0100000_14((C885760Yow) awS35S0310000_14.l1, 193));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS35S0310000_14 awS35S0310000_14, Object obj) {
        String quantityString;
        C885760Yow c885760Yow = (C885760Yow) awS35S0310000_14.l0;
        if (awS35S0310000_14.z3) {
            quantityString = ((Context) awS35S0310000_14.l1).getString(2131846459);
        } else {
            quantityString = ((Context) awS35S0310000_14.l1).getResources().getQuantityString(2131755678, ((List) awS35S0310000_14.l2).size(), String.valueOf(((List) awS35S0310000_14.l2).size()));
        }
        c885760Yow.LJ(quantityString);
        C0YUD c0yudLIZJ = ((C885760Yow) awS35S0310000_14.l0).LIZ.LIZJ();
        if (c0yudLIZJ != null) {
            c0yudLIZJ.LIZ((List) awS35S0310000_14.l2);
        }
        C885310YoD.LJIL(C885310YoD.LIZ, ((C885760Yow) awS35S0310000_14.l0).LIZ.LIZIZ(), ((List) awS35S0310000_14.l2).size(), ((C885760Yow) awS35S0310000_14.l0).LIZ.LIZLLL());
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0Yvd] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0Yvd] */
    public static final Object invoke$3(AwS35S0310000_14 awS35S0310000_14, Object obj) {
        Integer num;
        C889840YvW c889840YvW = (C889840YvW) obj;
        List<C889910Yvd> list = c889840YvW.LL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C889910Yvd c889910Yvd : list) {
            linkedHashMap.put(c889910Yvd.LIZ, c889910Yvd);
        }
        List<FilterTabType> list2 = (List) awS35S0310000_14.l0;
        Map map = (Map) awS35S0310000_14.l2;
        ArrayList arrayList = new ArrayList();
        for (FilterTabType filterTabType : list2) {
            ?? LIZ = linkedHashMap.get(filterTabType);
            if (LIZ != 0 || ((LIZ = C880600Ygc.LIZ(filterTabType)) != 0 && (map == null || (num = (Integer) map.get(filterTabType)) == null || num.intValue() < 0 || (LIZ = C889910Yvd.LIZ(LIZ, num, null, 95)) != 0))) {
                arrayList.add(LIZ);
            }
        }
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C889910Yvd) it2.next()).LIZ);
        }
        List<EnumC880480YgQ> listLJ = c889930Yvf.LJ(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<EnumC880480YgQ> it3 = listLJ.iterator();
        while (it3.hasNext()) {
            C880720Ygo c880720YgoLIZ = C880610Ygd.LIZ(it3.next());
            if (c880720YgoLIZ != null) {
                arrayList3.add(c880720YgoLIZ);
            }
        }
        if (awS35S0310000_14.z3) {
            return C889840YvW.LIZ(c889840YvW, arrayList, arrayList3, new Pair(((Pair) awS35S0310000_14.l1).getFirst(), Boolean.TRUE), (Set) ((Pair) awS35S0310000_14.l1).getSecond(), null, 16);
        }
        return C889840YvW.LIZ(c889840YvW, arrayList, arrayList3, null, null, null, 28);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS35S0310000_14(android.content.Context r3, X.C885760Yow r4, java.util.List r5, boolean r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r4
            r1.z3 = r6
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z3 = r6
            r1.l2 = r5
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS35S0310000_14.<init>(android.content.Context, X.0Yow, java.util.List, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S0310000_14(C865340Xx6 c865340Xx6, C865340Xx6 c865340Xx62, List<String> list, boolean z, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = c865340Xx6;
        this.l1 = c865340Xx62;
        this.z3 = list;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S0310000_14(List list, List<? extends FilterTabType> list2, boolean z, Pair<? extends FilterTabType, ? extends Set<? extends EnumC880480YgQ>> pair, Map<FilterTabType, Integer> map) {
        super(1);
        this.$t = map;
        this.l0 = list;
        this.z3 = list2;
        this.l1 = z;
        this.l2 = pair;
    }
}
