package com.google.gson;

import X.C093Y;
import X.C09C6;
import X.C09CD;
import X.C13LP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.Excluder;
import com.ss.android.ugc.aweme.experiment.GsonTypeAdapterOpt;
import com.ss.android.ugc.aweme.gsonopt.BaseAdapterFactory;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static final Gson LIZ = new Gson();
    public static final HashSet<Class<? extends Object>> LIZIZ = C093Y.LIZJ(String.class, Integer.class, Long.class, Float.class, Double.class, Character.class, Short.class, Byte.class, Number.class, Boolean.class, AtomicInteger.class, AtomicBoolean.class, AtomicLong.class, AtomicLongArray.class, AtomicIntegerArray.class, StringBuilder.class, StringBuffer.class, BigDecimal.class, BigInteger.class, URL.class, URI.class, UUID.class, Currency.class, Locale.class, InetAddress.class, BitSet.class, Date.class, Time.class, java.sql.Date.class, Timestamp.class, Calendar.class, n.class, h.class, k.class);

    public static boolean LIZIZ(Type type) {
        if (type == null || C13LP.LJJJJ(type, LIZIZ)) {
            return true;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive() || cls.isAnnotation() || k.class.isAssignableFrom(cls)) {
                return true;
            }
            if (cls.isArray()) {
                return LIZIZ(cls.getComponentType());
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(Gson gson) {
        List<v> list;
        if (gson == null || (list = gson.LJ) == null) {
            return false;
        }
        Iterator<v> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof BaseAdapterFactory) {
                return true;
            }
        }
        return false;
    }

    public static Gson LIZLLL(Gson gson) {
        List<v> list;
        if (gson == null) {
            return null;
        }
        try {
            Map<Gson, Gson> map = C09C6.LIZ;
            if (!((GsonTypeAdapterOpt) C09CD.LIZIZ.getValue()).enableGsonToJsonFix || (list = gson.LJ) == null || list.isEmpty() || !LIZJ(gson)) {
                return null;
            }
            Excluder excluder = gson.LJFF;
            d dVar = gson.LJI;
            Map<Type, g<?>> map2 = gson.LJII;
            boolean z = gson.LJIIIIZZ;
            boolean z2 = gson.LJIIIZ;
            boolean z3 = gson.LJIIJ;
            boolean z4 = gson.LJIIJJI;
            boolean z5 = gson.LJIIL;
            boolean z6 = gson.LJIILIIL;
            boolean z7 = gson.LJIILJJIL;
            t tVar = gson.LJIJ;
            String str = gson.LJIILL;
            int i = gson.LJIILLIIL;
            int i2 = gson.LJIIZILJ;
            List<v> list2 = gson.LJIJI;
            ArrayList arrayList = new ArrayList();
            for (v vVar : list2) {
                if (!LIZ(LIZ, vVar)) {
                    arrayList.add(vVar);
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            List<v> list3 = gson.LJIJJ;
            ArrayList arrayList2 = new ArrayList();
            for (v vVar2 : list3) {
                if (!LIZ(LIZ, vVar2)) {
                    arrayList2.add(vVar2);
                }
            }
            List listLLIIII2 = C13LP.LLIIII(arrayList2);
            List<v> list4 = gson.LJ;
            ArrayList arrayList3 = new ArrayList();
            for (v vVar3 : list4) {
                if (!LIZ(LIZ, vVar3)) {
                    arrayList3.add(vVar3);
                }
            }
            return new Gson(excluder, dVar, map2, z, z2, z3, z4, z5, z6, z7, tVar, str, i, i2, listLLIIII, listLLIIII2, C13LP.LLIIII(arrayList3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean LIZ(Gson gson, v vVar) {
        List<v> list;
        if (vVar != null) {
            if (vVar instanceof BaseAdapterFactory) {
                return true;
            }
            if (gson != null && (list = gson.LJ) != null) {
                for (v vVar2 : list) {
                    if (Intrinsics.LJFF(vVar2, vVar) || Intrinsics.LJFF(vVar.getClass(), vVar2.getClass())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
