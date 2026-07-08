package ttpobfuscated;

import X.C098200Yq;
import X.C09BH;
import X.C0VSJ;
import X.C13LE;
import X.C13LP;
import X.C189200o6;
import X.C1954807lC;
import X.C2095008Iq;
import X.C2197108jB;
import X.InterfaceC1364105Vn;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ttpobfuscated.h5;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class me implements h5 {
    public final SharedPreferences a;
    public final String b = C13LE.LIZ(me.class).LJI();

    public me(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final String a(String str) {
        if (!this.a.contains(str)) {
            this.a.edit().putString(str, "").apply();
            return "";
        }
        return this.a.getString(str, null);
    }

    @Override // ttpobfuscated.h5
    public Object a(List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) throws h5.a.b {
        Object obj;
        try {
            ArrayList arrayList = new ArrayList();
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list);
            Map<String, ?> all = this.a.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!kotlin.text.u.LJJIIJZLJL(entry.getKey(), "[FOLDER]", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!hashSetLLIFFJFJJ.contains(entry2.getKey())) {
                    arrayList.add(entry2.getKey());
                }
                arrayList2.add(Unit.LIZ);
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return obj;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("Error while getting tracked files", str, thM5exceptionOrNullimpl);
        throw new h5.a.b();
    }

    @Override // ttpobfuscated.h5
    public Object b(List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) throws h5.a.c {
        Object obj;
        try {
            ArrayList arrayList = new ArrayList();
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list);
            Map<String, ?> all = this.a.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (kotlin.text.u.LJJIIJZLJL(entry.getKey(), "[FOLDER]", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                String strSubstring = ((String) ((Map.Entry) it2.next()).getKey()).substring(8);
                if (!hashSetLLIFFJFJJ.contains(strSubstring)) {
                    arrayList.add(strSubstring);
                }
                arrayList2.add(Unit.LIZ);
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return obj;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("Error while getting tracked folders", str, thM5exceptionOrNullimpl);
        throw new h5.a.c();
    }

    public final byte[] a(File file, boolean z) {
        Object objLJ;
        Object obj = null;
        if (z) {
            objLJ = null;
        } else {
            try {
                objLJ = C09BH.LJ(file);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLJ = new C098200Yq(th);
                C189200o6.m2constructorimpl(objLJ);
            }
        }
        C189200o6.m2constructorimpl(objLJ);
        if (C189200o6.m5exceptionOrNullimpl(objLJ) == null) {
            obj = objLJ;
        }
        return (byte[]) obj;
    }

    @Override // ttpobfuscated.h5
    public Object a(String str, boolean z, InterfaceC1364105Vn<? super g5> interfaceC1364105Vn) throws h5.a.C0055a {
        String path;
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!z) {
                path = c0vsj.getPath();
            } else {
                path = "[FOLDER]" + c0vsj.getPath();
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(a(path));
            if (!c0vsj.exists() && lLJIILIIL == null) {
                return new g5(c0vsj.getPath(), d5.NOT_CREATED, z, null);
            }
            if (c0vsj.exists() && lLJIILIIL == null) {
                return new g5(c0vsj.getPath(), d5.CREATED, z, a(c0vsj, z));
            }
            if (c0vsj.exists() && lLJIILIIL != null && c0vsj.lastModified() > lLJIILIIL.longValue()) {
                return new g5(c0vsj.getPath(), d5.MODIFIED, z, a(c0vsj, z));
            }
            if (c0vsj.exists() && lLJIILIIL != null && c0vsj.lastModified() == lLJIILIIL.longValue()) {
                return new g5(c0vsj.getPath(), d5.UNCHANGED, z, a(c0vsj, z));
            }
            if (!c0vsj.exists() && lLJIILIIL != null) {
                return new g5(c0vsj.getPath(), d5.DELETED, z, null);
            }
            throw new IllegalStateException("Invalid file State");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                throw new C2197108jB();
            }
            q3.a aVar = q3.a;
            String str2 = this.b;
            aVar.getClass();
            q3.a.c.b("Error while reading the file deltas", str2, thM5exceptionOrNullimpl);
            throw new h5.a.C0055a(str, z);
        }
    }

    @Override // ttpobfuscated.h5
    public Object b(String str, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws h5.a.d {
        Object c098200Yq;
        String path;
        String strValueOf;
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!z) {
                path = c0vsj.getPath();
            } else {
                path = "[FOLDER]" + c0vsj.getPath();
            }
            a(path);
            boolean zExists = c0vsj.exists();
            if (!zExists) {
                strValueOf = "";
            } else if (zExists) {
                strValueOf = String.valueOf(c0vsj.lastModified());
            } else {
                throw new C1954807lC();
            }
            this.a.edit().putString(path, strValueOf).apply();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str2 = this.b;
        aVar.getClass();
        q3.a.c.b("Error while updating the file creation deltas", str2, thM5exceptionOrNullimpl);
        throw new h5.a.d(str, z);
    }
}
