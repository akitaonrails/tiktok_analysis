package com.tiktok.ttkmedia.configcenter;

import X.C1467880oIk;
import X.C1467960oIs;
import X.InterfaceC1467440oI2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class BaseConfig implements InterfaceC1467440oI2 {
    public long LIZIZ;
    public final int LIZJ;
    public final Map<Integer, C1467880oIk> LIZLLL = new ConcurrentHashMap();
    public Map<Integer, C1467880oIk> LJ = null;

    private final native long _create(long j, int i, int i2);

    private final native float _getFloatOption(long j, int i, float f);

    private final native int _getIntOption(long j, int i, int i2);

    private final native long _getLongOption(long j, int i, long j2);

    private final native String _getStringOption(long j, int i);

    private final native boolean _isKeySet(long j, int i);

    private final native void _release(long j);

    private final native void _remove(long j, int i);

    private final native void _reset(long j);

    private final native void _resetOptions(long j, Map map);

    private final native void _setFloatOption(long j, int i, float f);

    private final native void _setIntOption(long j, int i, int i2);

    private final native void _setJsonOption(long j, int i, JSONObject jSONObject);

    private final native void _setLongOption(long j, int i, long j2);

    private final native void _setStringOption(long j, int i, String str);

    @Override // X.InterfaceC1699160uJm
    public final int LJIIIIZZ(int i) {
        return 0;
    }

    @Override // X.InterfaceC1467440oI2
    public final Map<Integer, C1467880oIk> LIZLLL() {
        Map<Integer, C1467880oIk> map = this.LJ;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // X.InterfaceC1467440oI2
    public final void LJII() {
        this.LJ = new ConcurrentHashMap();
    }

    @Override // X.InterfaceC1467440oI2
    public final void release() {
        long j = this.LIZIZ;
        if (j != 0) {
            _release(j);
            this.LIZIZ = 0L;
        }
    }

    @Override // X.InterfaceC1467440oI2
    public final Map<Integer, C1467880oIk> LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1467440oI2
    public final long getNativeHandle() {
        return this.LIZIZ;
    }

    public final boolean LJIIJ(int i) {
        if (((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(i))) {
            return true;
        }
        long j = this.LIZIZ;
        if (j != 0) {
            return _isKeySet(j, i);
        }
        return false;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZ(int i, String str) {
        C1467880oIk c1467880oIk = new C1467880oIk(i, 4, this.LIZJ, str);
        LJIIIZ(i, c1467880oIk);
        ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(i), c1467880oIk);
        long j = this.LIZIZ;
        if (j != 0) {
            _setStringOption(j, i, str);
        }
        return c1467880oIk;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZIZ(int i, long j) {
        C1467880oIk c1467880oIk = new C1467880oIk(i, 2, this.LIZJ, Long.valueOf(j));
        LJIIIZ(i, c1467880oIk);
        ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(i), c1467880oIk);
        long j2 = this.LIZIZ;
        if (j2 != 0) {
            _setLongOption(j2, i, j);
        }
        return c1467880oIk;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZJ(int i, int i2) {
        C1467880oIk c1467880oIk = new C1467880oIk(i, 1, this.LIZJ, Integer.valueOf(i2));
        LJIIIZ(i, c1467880oIk);
        ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(i), c1467880oIk);
        long j = this.LIZIZ;
        if (j != 0) {
            _setIntOption(j, i, i2);
        }
        return c1467880oIk;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LJ(int i, JSONObject jSONObject) {
        C1467880oIk c1467880oIk = new C1467880oIk(i, 5, this.LIZJ, jSONObject);
        LJIIIZ(i, c1467880oIk);
        ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(i), c1467880oIk);
        long j = this.LIZIZ;
        if (j != 0) {
            _setJsonOption(j, i, jSONObject);
        }
        return c1467880oIk;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LJFF(float f, int i) {
        C1467880oIk c1467880oIk = new C1467880oIk(i, 3, this.LIZJ, Float.valueOf(f));
        LJIIIZ(i, c1467880oIk);
        ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(i), c1467880oIk);
        long j = this.LIZIZ;
        if (j != 0) {
            _setFloatOption(j, i, f);
        }
        return c1467880oIk;
    }

    public final void LJIIIZ(int i, C1467880oIk c1467880oIk) {
        if (this.LJ != null && LJIIJ(i)) {
            ((ConcurrentHashMap) this.LJ).put(Integer.valueOf(i), c1467880oIk);
        }
    }

    public BaseConfig(C1467960oIs c1467960oIs, int i, int i2) {
        long j_create = 0;
        if (c1467960oIs != null) {
            c1467960oIs.getClass();
        }
        try {
            j_create = _create(0L, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZIZ = j_create;
        this.LIZJ = i;
    }
}
