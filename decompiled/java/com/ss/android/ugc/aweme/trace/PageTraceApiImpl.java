package com.ss.android.ugc.aweme.trace;

import X.C0V3K;
import X.C0VGA;
import X.C786410Ut5;
import X.C806950Vl7;
import X.C807150VlR;
import X.C807280Vle;
import X.C807290Vlf;
import X.C807320Vli;
import X.C807330Vlj;
import X.EnumC807060VlI;
import X.EnumC807300Vlg;
import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PageTraceApiImpl implements IPageTraceApi, C0V3K {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Map<String, C807290Vlf> LIZ = new LinkedHashMap();
    public final BPEAHandler LIZIZ;
    public volatile C807290Vlf LIZJ;

    public static boolean LJIIIIZZ() {
        return !C806950Vl7.LIZIZ.LIZ();
    }

    @Override // X.C0V3K
    public final void LIZ() {
        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS113S0100000_13(this, 124));
    }

    public PageTraceApiImpl() {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZIZ = bPEAHandler;
        if (LJIIIIZZ()) {
            return;
        }
        C786410Ut5.LJLIIL(30000L, bPEAHandler, new ARunnableS113S0100000_13(this, 123));
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final String LIZIZ(String str) {
        C807290Vlf c807290Vlf;
        if (LJIIIIZZ()) {
            return "";
        }
        if (str != null) {
            c807290Vlf = (C807290Vlf) ((LinkedHashMap) this.LIZ).get(str);
        } else {
            c807290Vlf = this.LIZJ;
        }
        if (c807290Vlf == null || c807290Vlf.LIZIZ.length() == 0) {
            return "";
        }
        return C807280Vle.LIZIZ.LJ(c807290Vlf.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final Pair<String, String> LJ(String str) {
        C807290Vlf c807290Vlf;
        if (LJIIIIZZ()) {
            return null;
        }
        if (str != null) {
            c807290Vlf = (C807290Vlf) ((LinkedHashMap) this.LIZ).get(str);
        } else {
            c807290Vlf = this.LIZJ;
        }
        if (c807290Vlf == null || c807290Vlf.LIZIZ.length() == 0) {
            return null;
        }
        return new Pair<>(c807290Vlf.LIZ, c807290Vlf.LIZIZ);
    }

    public static void LJII(C807290Vlf c807290Vlf, JSONObject jSONObject) {
        String str;
        int i = c807290Vlf.LJFF + 1;
        C807280Vle c807280Vle = C807280Vle.LIZIZ;
        String strLJ = c807280Vle.LJ(c807290Vlf.LIZIZ);
        EnumC807060VlI enumC807060VlI = EnumC807060VlI.ORIGIN_LOG;
        C807150VlR c807150VlR = new C807150VlR(strLJ);
        c807150VlR.LJI = c807290Vlf.LIZ;
        c807150VlR.LJII = Boolean.FALSE;
        c807150VlR.LJIIIIZZ = i;
        c807150VlR.LIZJ = jSONObject;
        c807280Vle.LIZLLL(enumC807060VlI, c807150VlR);
        String str2 = c807290Vlf.LIZIZ;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (i <= 1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c807280Vle.LJIIIZ(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        String str4 = c807290Vlf.LIZIZ;
        if (C0VGA.LIZJ()) {
            str3 = "1";
        }
        c807280Vle.LJIIIZ(str4, "is_force", str3);
        c807280Vle.LIZIZ(c807290Vlf.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LIZJ(C807320Vli c807320Vli, JSONObject jSONObject) {
        if (LJIIIIZZ()) {
            return;
        }
        C807290Vlf c807290Vlf = new C807290Vlf(c807320Vli.LIZIZ, EnumC807300Vlg.CREATED);
        this.LIZ.put(c807320Vli.LIZ, c807290Vlf);
        LJIIIZ(c807290Vlf, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LIZLLL(C807320Vli c807320Vli, JSONObject jSONObject) {
        if (LJIIIIZZ()) {
            return;
        }
        C807290Vlf c807290Vlf = (C807290Vlf) ((LinkedHashMap) this.LIZ).get(c807320Vli.LIZ);
        if (c807290Vlf == null || c807290Vlf.LJ - c807290Vlf.LJFF != 1) {
            return;
        }
        if (c807290Vlf.LIZLLL == EnumC807300Vlg.VISIBLE) {
            LJII(c807290Vlf, jSONObject);
        }
        c807290Vlf.LJII = jSONObject;
        c807290Vlf.LJFF++;
        c807290Vlf.LIZLLL = EnumC807300Vlg.INVISIBLE;
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJFF(C807320Vli c807320Vli, JSONObject jSONObject) {
        C807290Vlf c807290VlfRemove;
        if (LJIIIIZZ() || (c807290VlfRemove = this.LIZ.remove(c807320Vli.LIZ)) == null) {
            return;
        }
        if (c807290VlfRemove.LJFF != c807290VlfRemove.LJ) {
            C807280Vle.LIZIZ.LJII(c807290VlfRemove.LIZIZ);
        } else if (c807290VlfRemove.LIZLLL == EnumC807300Vlg.CREATED) {
            LJII(c807290VlfRemove, jSONObject);
        }
        c807290VlfRemove.LIZLLL = EnumC807300Vlg.DESTROYED;
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJI(C807320Vli c807320Vli, JSONObject jSONObject) {
        if (LJIIIIZZ()) {
            return;
        }
        C807290Vlf c807290Vlf = (C807290Vlf) ((LinkedHashMap) this.LIZ).get(c807320Vli.LIZ);
        if (c807290Vlf == null || c807290Vlf.LJ - c807290Vlf.LJFF != 0) {
            return;
        }
        if (c807290Vlf.LIZLLL == EnumC807300Vlg.INVISIBLE) {
            LJIIIZ(c807290Vlf, jSONObject);
        }
        c807290Vlf.LJI = jSONObject;
        c807290Vlf.LJ++;
        c807290Vlf.LIZLLL = EnumC807300Vlg.VISIBLE;
    }

    public final void LJIIIZ(C807290Vlf c807290Vlf, JSONObject jSONObject) {
        this.LIZJ = c807290Vlf;
        C807280Vle c807280Vle = C807280Vle.LIZIZ;
        String strLJFF = c807280Vle.LJFF(c807290Vlf.LIZ);
        c807290Vlf.LIZIZ = strLJFF;
        c807290Vlf.LIZJ.add(C807330Vlj.LIZIZ.LIZ(strLJFF));
        String strLJ = c807280Vle.LJ(c807290Vlf.LIZIZ);
        EnumC807060VlI enumC807060VlI = EnumC807060VlI.ORIGIN_LOG;
        C807150VlR c807150VlR = new C807150VlR(strLJ);
        c807150VlR.LJI = c807290Vlf.LIZ;
        c807150VlR.LJII = Boolean.TRUE;
        c807150VlR.LJIIIIZZ = c807290Vlf.LJ + 1;
        c807150VlR.LIZJ = jSONObject;
        c807280Vle.LIZLLL(enumC807060VlI, c807150VlR);
    }
}
