package com.bytedance.pumbaa.hybrid.engine.impl;

import X.C0VZK;
import X.C0WLQ;
import X.C0WN8;
import X.C0WNL;
import X.C0WO1;
import X.C0WO7;
import X.C822130WMx;
import X.C822160WNa;
import X.C822200WNe;
import X.C823050WQl;
import X.EnumC822260WNk;
import Y.ARunnableS113S0100000_13;
import android.os.SystemClock;
import com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine;
import com.bytedance.pumbaa.hybrid.engine.api.model.AspectDynamicModel;
import com.bytedance.pumbaa.hybrid.engine.api.model.ValueModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridEngineService implements IHybridEngine {
    public static final /* synthetic */ int LJ = 0;
    public volatile boolean LIZ;
    public volatile C822200WNe LIZIZ;
    public final ConcurrentHashMap<EnumC822260WNk, C0WNL> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C0WO7, C0WO1> LIZLLL = new ConcurrentHashMap<>();

    @Override // com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine
    public final void init() throws JSONException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = (Boolean) C0VZK.LIZIZ().LIZJ(Boolean.TYPE, "pns_hybrid_revamp_dynamic", Boolean.valueOf(C822160WNa.LIZ));
        this.LIZ = bool != null ? bool.booleanValue() : C822160WNa.LIZ;
        if (this.LIZ) {
            if (this.LIZ) {
                C823050WQl.LIZLLL().execute(new ARunnableS113S0100000_13(this, 204));
            }
            this.LIZLLL.put(C0WO7.Contains, new C0WO1() { // from class: X.0WNl
                @Override // X.C0WO1
                public final boolean LIZ(C0WO4 c0wo4, C0WO0 c0wo0) {
                    String str;
                    String str2;
                    if (c0wo0.LIZ.type != EnumC822390WNx.Str || !(c0wo4.value().value instanceof String)) {
                        return false;
                    }
                    Object obj = c0wo4.value().value;
                    if (!(obj instanceof String) || (str = (String) obj) == null) {
                        return false;
                    }
                    Object obj2 = c0wo0.LIZ.value;
                    if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                        return false;
                    }
                    return a0.LJJIIZI(str, str2, false);
                }
            });
            this.LIZLLL.put(C0WO7.Equal, new C0WO1() { // from class: X.0WNn
                @Override // X.C0WO1
                public final boolean LIZ(C0WO4 c0wo4, C0WO0 c0wo0) {
                    Long lValueOf;
                    Number number;
                    Number number2;
                    EnumC822390WNx enumC822390WNx = c0wo4.value().type;
                    if (enumC822390WNx != c0wo0.LIZ.type) {
                        return false;
                    }
                    Object obj = c0wo4.value().value;
                    Object obj2 = c0wo0.LIZ.value;
                    if (obj != null && obj2 != null) {
                        int i = C822320WNq.LIZ[enumC822390WNx.ordinal()];
                        Object objValueOf = null;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return Intrinsics.LJFF(obj, obj2);
                                }
                                if (!(obj instanceof Boolean)) {
                                    obj = null;
                                }
                                if (obj2 instanceof Boolean) {
                                    objValueOf = obj2;
                                }
                                return Intrinsics.LJFF(obj, objValueOf);
                            }
                            if (!(obj instanceof String)) {
                                obj = null;
                            }
                            if (obj2 instanceof String) {
                                objValueOf = obj2;
                            }
                            return Intrinsics.LJFF(obj, objValueOf);
                        }
                        if ((obj instanceof Number) && (number2 = (Number) obj) != null) {
                            lValueOf = Long.valueOf(number2.longValue());
                        } else {
                            lValueOf = null;
                        }
                        if ((obj2 instanceof Number) && (number = (Number) obj2) != null) {
                            objValueOf = Long.valueOf(number.longValue());
                        }
                        return Intrinsics.LJFF(lValueOf, objValueOf);
                    }
                    return Intrinsics.LJFF(obj, obj2);
                }
            });
            this.LIZLLL.put(C0WO7.In, new C0WO1() { // from class: X.0WNm
                @Override // X.C0WO1
                public final boolean LIZ(C0WO4 c0wo4, C0WO0 c0wo0) {
                    List list;
                    Long lValueOf;
                    Long lValueOf2;
                    boolean zLJFF;
                    Number number;
                    Number number2;
                    Object obj;
                    Object obj2;
                    ValueModel valueModel = c0wo0.LIZ;
                    if (valueModel.type != EnumC822390WNx.Array) {
                        return false;
                    }
                    Object obj3 = valueModel.value;
                    if (!(obj3 instanceof List) || (list = (List) obj3) == null || list.isEmpty()) {
                        return false;
                    }
                    Object obj4 = c0wo4.value().value;
                    if (list.isEmpty()) {
                        return false;
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i = C822360WNu.LIZ[c0wo0.LIZ.subType.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    continue;
                                } else {
                                    if (!(next instanceof Boolean)) {
                                        next = null;
                                    }
                                    if (obj4 instanceof Boolean) {
                                        obj2 = obj4;
                                    } else {
                                        obj2 = null;
                                    }
                                    zLJFF = Intrinsics.LJFF(next, obj2);
                                }
                            } else {
                                if (!(next instanceof String)) {
                                    next = null;
                                }
                                if (obj4 instanceof String) {
                                    obj = obj4;
                                } else {
                                    obj = null;
                                }
                                zLJFF = Intrinsics.LJFF(next, obj);
                            }
                        } else {
                            if ((next instanceof Number) && (number2 = (Number) next) != null) {
                                lValueOf = Long.valueOf(number2.longValue());
                            } else {
                                lValueOf = null;
                            }
                            if ((obj4 instanceof Number) && (number = (Number) obj4) != null) {
                                lValueOf2 = Long.valueOf(number.longValue());
                            } else {
                                lValueOf2 = null;
                            }
                            zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
                        }
                        if (zLJFF) {
                            return true;
                        }
                    }
                    return false;
                }
            });
            this.LIZLLL.put(C0WO7.StartWith, new C0WO1() { // from class: X.0WNp
                @Override // X.C0WO1
                public final boolean LIZ(C0WO4 c0wo4, C0WO0 c0wo0) {
                    String str;
                    String str2;
                    if (c0wo0.LIZ.type != EnumC822390WNx.Str || !(c0wo4.value().value instanceof String)) {
                        return false;
                    }
                    Object obj = c0wo4.value().value;
                    if (!(obj instanceof String) || (str = (String) obj) == null) {
                        return false;
                    }
                    Object obj2 = c0wo0.LIZ.value;
                    if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                        return false;
                    }
                    return u.LJJIIJZLJL(str, str2, false);
                }
            });
            this.LIZLLL.put(C0WO7.EndWith, new C0WO1() { // from class: X.0WNo
                @Override // X.C0WO1
                public final boolean LIZ(C0WO4 c0wo4, C0WO0 c0wo0) {
                    String str;
                    String str2;
                    if (c0wo0.LIZ.type != EnumC822390WNx.Str || !(c0wo4.value().value instanceof String)) {
                        return false;
                    }
                    Object obj = c0wo4.value().value;
                    if (!(obj instanceof String) || (str = (String) obj) == null) {
                        return false;
                    }
                    Object obj2 = c0wo0.LIZ.value;
                    if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                        return false;
                    }
                    return u.LJIIZILJ(str, str2, false);
                }
            });
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (jElapsedRealtime2 < 0) {
                jElapsedRealtime2 = 0;
            }
            C0WLQ.LIZ(jElapsedRealtime2, "init");
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine
    public final boolean enable() {
        return this.LIZ;
    }

    @Override // com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine
    public final C0WNL LIZ(EnumC822260WNk enumC822260WNk) {
        return this.LIZJ.get(enumC822260WNk);
    }

    @Override // com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine
    public final AspectDynamicModel LIZIZ(C0WN8 c0wn8) {
        Map<C0WN8, AspectDynamicModel> map;
        C822200WNe c822200WNe = this.LIZIZ;
        if (c822200WNe == null || (map = c822200WNe.LIZ) == null) {
            return null;
        }
        return map.get(c0wn8);
    }

    @Override // com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine
    public final C0WO1 LIZLLL(C0WO7 c0wo7) {
        return this.LIZLLL.get(c0wo7);
    }

    @Override // com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine
    public final void LIZJ(EnumC822260WNk enumC822260WNk, C822130WMx c822130WMx) {
        this.LIZJ.put(enumC822260WNk, c822130WMx);
    }
}
