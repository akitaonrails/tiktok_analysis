package k5a;

import X.C01TT;
import X.C13BV;
import X.C2097608Jq;
import X.C560530Lyd;
import X.InterfaceC1423310n8r;
import com.bytedance.als.h0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public class j<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO> implements InterfaceC1423310n8r<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO> {
    public final h0<CATEGORY> LIZ = new h0<>(null);
    public final h0<DATA> LIZIZ = new h0<>(null);
    public final h0<List<CATEGORY>> LIZJ = new h0<>(C13BV.INSTANCE);
    public final h0<Map<CATEGORY, Pair<FETCH_DATA_RESULT_EXTRA_DATA, List<DATA>>>> LIZLLL = new h0<>(C2097608Jq.LJ());
    public final C560530Lyd<ERROR_DATA> LJ = new C560530Lyd<>();

    @Override // X.InterfaceC1423310n8r
    public final h0 Hv() {
        h0<CATEGORY> h0Var = this.LIZ;
        h0Var.getClass();
        return h0Var;
    }

    @Override // X.InterfaceC1423310n8r
    public final h0 Jv() {
        h0<DATA> h0Var = this.LIZIZ;
        h0Var.getClass();
        return h0Var;
    }

    @Override // X.InterfaceC1423310n8r
    public final h0 Kv() {
        h0<Map<CATEGORY, Pair<FETCH_DATA_RESULT_EXTRA_DATA, List<DATA>>>> h0Var = this.LIZLLL;
        h0Var.getClass();
        return h0Var;
    }

    @Override // X.InterfaceC1423310n8r
    public final DATA Mv() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC1423310n8r
    public final CATEGORY Y8() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1423310n8r
    public final List<CATEGORY> t() {
        return this.LIZJ.LIZJ();
    }

    @Override // X.InterfaceC1423310n8r
    public final h0 xe() {
        h0<List<CATEGORY>> h0Var = this.LIZJ;
        h0Var.getClass();
        return h0Var;
    }

    @Override // X.InterfaceC1423310n8r
    public final C560530Lyd wo() {
        return this.LJ;
    }

    @Override // X.InterfaceC1423310n8r
    public final void Iv(DATA data) {
        C01TT.LIZLLL(new AwS423S0200000_22((j) this, (j<CATEGORY, DATA, int, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO>) data, 82));
    }

    @Override // X.InterfaceC1423310n8r
    public final void Lv(List<? extends CATEGORY> list) {
        C01TT.LIZLLL(new AwS423S0200000_22((j) this, (List) list, 79));
    }

    @Override // X.InterfaceC1423310n8r
    public final List<DATA> Ov(CATEGORY category) {
        Pair<FETCH_DATA_RESULT_EXTRA_DATA, List<DATA>> pair = this.LIZLLL.LIZJ().get(category);
        if (pair != null) {
            return pair.getSecond();
        }
        return null;
    }

    @Override // X.InterfaceC1423310n8r
    public final void Qv(ERROR_DATA error_data) {
        C01TT.LIZLLL(new AwS423S0200000_22((j) this, (j<CATEGORY, DATA, int, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO>) error_data, 81));
    }

    @Override // X.InterfaceC1423310n8r
    public void Pv(CATEGORY category, List<? extends CATEGORY> list) {
        C01TT.LIZLLL(new AwS266S0300000_22(list, (List<? extends j<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO>>) category, this, (j<j<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO>, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO>) 29));
    }

    @Override // X.InterfaceC1423310n8r
    public void Nv(CATEGORY category, FETCH_DATA_RESULT_EXTRA_DATA fetch_data_result_extra_data, List<? extends DATA> list) {
        Map<CATEGORY, Pair<FETCH_DATA_RESULT_EXTRA_DATA, List<DATA>>> mapLIZJ = this.LIZLLL.LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJ());
        linkedHashMap.putAll(mapLIZJ);
        linkedHashMap.put(category, new Pair(fetch_data_result_extra_data, list));
        C01TT.LIZLLL(new AwS423S0200000_22((j) this, (Map) linkedHashMap, 80));
    }
}
