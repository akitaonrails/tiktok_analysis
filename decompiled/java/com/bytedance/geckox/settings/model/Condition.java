package com.bytedance.geckox.settings.model;

import X.C098200Yq;
import X.C09CT;
import X.C09DE;
import X.C15438062q;
import X.C189200o6;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class Condition {

    @C09CT("i_case")
    public final boolean ignoreCase;
    public final Operator o;

    @C09CT("t")
    public final Integer t;
    public boolean transformFailed;

    @C09DE(serialize = false)
    public Object transformedValue;
    public final Object v;

    public final List<Integer> getIntListValue() {
        Integer num;
        Object c098200Yq;
        if (this.transformedValue == null && !this.transformFailed && (num = this.t) != null && num.intValue() == 3) {
            try {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.v.toString(), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
                }
                this.transformedValue = arrayList;
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                this.transformFailed = true;
            }
        }
        Object obj = this.transformedValue;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public final Integer getIntValue() {
        Integer num;
        Object c098200Yq;
        if (this.transformedValue == null && !this.transformFailed && (num = this.t) != null && num.intValue() == 1) {
            try {
                this.transformedValue = Integer.valueOf(CastIntegerProtector.parseInt(this.v.toString()));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                this.transformFailed = true;
            }
        }
        Object obj = this.transformedValue;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    public final List<String> getStringListValue() {
        Integer num;
        Object c098200Yq;
        if (this.transformedValue == null && !this.transformFailed && (num = this.t) != null && num.intValue() == 2) {
            try {
                this.transformedValue = a0.LJJLIIIJILLIZJL(this.v.toString(), new String[]{","}, 0, 6);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                this.transformFailed = true;
            }
        }
        Object obj = this.transformedValue;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public final void setTransformFailed(boolean z) {
        this.transformFailed = z;
    }

    public final void setTransformedValue(Object obj) {
        this.transformedValue = obj;
    }

    public Condition(Object obj, Operator operator, Object obj2, boolean z, boolean z2, Integer num) {
        this.v = obj;
        this.o = operator;
        this.transformedValue = obj2;
        this.transformFailed = z;
        this.ignoreCase = z2;
        this.t = num;
    }
}
