package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC1261460ivo;
import X.AbstractC1623806Xk;
import X.AbstractC1906720ziY;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XHY;
import X.C0XQ7;
import X.C1075800e6M;
import X.C1261270ivV;
import X.C1261350ivd;
import X.C1261450ivn;
import X.C1261480ivq;
import X.C1261860iwS;
import X.C1388190mED;
import X.C1449105lp;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1720106oR;
import X.C1954807lC;
import X.C19EG;
import X.C20620315mT;
import X.C20620515mV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C491001vg;
import X.C491101vh;
import X.C626160OhC;
import X.InterfaceC1055110dYz;
import X.InterfaceC1073860e3E;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class RecUserBehaviorMonImpl implements InterfaceC1073860e3E {
    public static C20620315mT LLJJIJIIJIL = new C20620315mT(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), false, 62);
    public final C1261270ivV LL;
    public final String LLILLJJLI;
    public final Function0<Long> LLILLL;
    public final Function2<String, JSONObject, Unit> LLILZ;
    public String LLILZIL;
    public C1075800e6M LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public long LLJIJIL;
    public final boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Pair<String, ? extends InterfaceC1055110dYz> LLJILLL;
    public long LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    public RecUserBehaviorMonImpl() {
        throw null;
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // X.InterfaceC1073860e3E
    public final AbstractC1906720ziY i62() {
        return (AbstractC1906720ziY) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC1073860e3E
    public final void m6() throws JSONException {
        String str;
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        if (this.LLJJ == -1) {
            return;
        }
        JSONObject jSONObjectPut = ((JSONObject) this.LLJJI.getValue()).put("stay_duration", this.LLILLL.invoke().longValue() - this.LLJJ);
        C0XHY c0xhy = C0XHY.LIZ;
        boolean z = this.LLJILJIL;
        c0xhy.getClass();
        JSONObject jSONObjectPut2 = jSONObjectPut.put("is_valid", C0XHY.LJFF(z)).put("show_cnt", this.LLIZ).put("click_cnt", this.LLIZLLLIL).put("paging_cnt", this.LLJ).put("load_time", C0XHY.LIZIZ(c0xhy, this.LLJI)).put("first_item_load_time", C0XHY.LIZIZ(c0xhy, this.LLJIJIL));
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = this.LLILZLL.LIZ;
        if ((abstractC1623806Xk instanceof C491101vh) || (abstractC1623806Xk instanceof C1623706Xj)) {
            str = "loading";
        } else if (abstractC1623806Xk instanceof C491001vg) {
            str = "error";
        } else {
            if (!(abstractC1623806Xk instanceof C1623606Xi)) {
                throw new C1954807lC();
            }
            str = "normal";
        }
        jSONObjectPut2.put("state", str).putOpt("extra", this.LLILZIL);
        C0XHY.LIZLLL(new AwS575S0100000_31(this, 934));
    }

    @Override // X.InterfaceC1073860e3E
    public final void vg2() {
        if (this.LLJILJILJ) {
            return;
        }
        LIZ("NOTIFICATION");
    }

    public RecUserBehaviorMonImpl(C1261270ivV c1261270ivV) {
        String strLIZIZ = c1261270ivV.LIZIZ();
        C1449105lp c1449105lp = C1449105lp.LL;
        C20620515mV c20620515mV = new C20620515mV(C0XHY.LIZ);
        this.LL = c1261270ivV;
        this.LLILLJJLI = strLIZIZ;
        this.LLILLL = c1449105lp;
        this.LLILZ = c20620515mV;
        this.LLILZLL = new C1075800e6M(null, 7);
        this.LLJI = -1L;
        this.LLJIJIL = -1L;
        this.LLJILJIL = true;
        this.LLJJ = -1L;
        this.LLJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1317));
        this.LLJJIII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 416));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1319));
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        if (this.LLJILJILJ) {
            return;
        }
        if ((abstractC1261460ivo instanceof C1261350ivd) && (abstractC1261460ivo.LIZ instanceof C1261860iwS)) {
            if (this.LLIZ == 0) {
                this.LLJIJIL = this.LLILLL.invoke().longValue() - this.LLJJ;
            }
            this.LLIZ++;
        }
        if (((abstractC1261460ivo instanceof C1261480ivq) || (abstractC1261460ivo instanceof C1261450ivn)) && (abstractC1261460ivo.LIZ instanceof C1261860iwS)) {
            this.LLIZLLLIL++;
        }
    }

    public final void LIZ(final String str) {
        C19EG c19egLIZIZ;
        if (this.LLJILLL != null) {
            return;
        }
        C0XHY.LIZ.getClass();
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && (c19egLIZIZ = C1388190mED.LIZIZ(topActivity)) != null) {
            final Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egLIZIZ);
            InterfaceC1055110dYz interfaceC1055110dYz = new InterfaceC1055110dYz() { // from class: X.15mS
                @Override // X.InterfaceC1583780rJg
                public final String getHoxNodeTag() {
                    return "";
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeShow(Bundle bundle) {
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeHide(Bundle bundle) throws JSONException {
                    this.LL.m6();
                    hoxLIZ.PQ2(str, this);
                }
            };
            hoxLIZ.wQ2(str, interfaceC1055110dYz);
            this.LLJILLL = new Pair<>(str, interfaceC1055110dYz);
        }
    }

    @Override // X.InterfaceC1073860e3E
    public final void av(String str) {
        int iIntValue;
        if (this.LLJILJILJ) {
            return;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String str2 = LLJJIJIIJIL.LIZ;
        if (curUserId != null && !Intrinsics.LJFF(str2, curUserId)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("change user, ");
            sbLIZ.append(str2);
            sbLIZ.append(" to ");
            sbLIZ.append(curUserId);
            C1720106oR.LJI("PerfMonitor", C2188811AlT.LIZIZ(sbLIZ));
            LLJJIJIIJIL = new C20620315mT(curUserId, true, 30);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start tracing key: ");
        sbLIZ2.append(this.LLILLJJLI);
        C1720106oR.LJI("PerfMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        long jLongValue = this.LLILLL.invoke().longValue();
        this.LLJJ = jLongValue;
        Map<String, Integer> map = LLJJIJIIJIL.LJ;
        Integer num = map.get(this.LLILLJJLI);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i3 = iIntValue + 1;
        map.put(this.LLILLJJLI, Integer.valueOf(i3));
        LLJJIJIIJIL.LIZIZ++;
        ((JSONObject) this.LLJJI.getValue()).put("enter_cnt", i3).put("all_enter_cnt", LLJJIJIIJIL.LIZIZ);
        long j = LLJJIJIIJIL.LIZJ;
        if (j != -1) {
            long j2 = jLongValue - j;
            ((JSONObject) this.LLJJI.getValue()).put("all_rec_duration", j2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("enter global scene, duration(S): ");
            sbLIZ3.append(j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            C1720106oR.LJI("PerfMonitor", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C20620315mT c20620315mT = LLJJIJIIJIL;
        c20620315mT.LIZJ = jLongValue;
        Long l = c20620315mT.LIZLLL.get(this.LLILLJJLI);
        if (l != null) {
            long jLongValue2 = l.longValue();
            if (jLongValue2 != -1) {
                long j3 = jLongValue - jLongValue2;
                ((JSONObject) this.LLJJI.getValue()).put("rec_duration", j3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("enter same scene, duration(S): ");
                sbLIZ4.append(j3 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                C1720106oR.LJI("PerfMonitor", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        LLJJIJIIJIL.LIZLLL.put(this.LLILLJJLI, Long.valueOf(jLongValue));
        if (str != null) {
            LIZ(str);
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLILZLL = c1075800e6M;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            if (this.LLJI == -1) {
                this.LLJI = this.LLILLL.invoke().longValue() - this.LLJJ;
            }
        } else if (abstractC1623806Xk instanceof C1623706Xj) {
            this.LLJ = 1;
        }
        if (c1075800e6M.LIZIZ instanceof C1623706Xj) {
            this.LLJ++;
        }
    }

    @Override // X.InterfaceC1073860e3E
    public final void setExtra(String str) {
        this.LLILZIL = str;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws JSONException {
        C19EG c19egLIZIZ;
        if (event == Lifecycle.Event.ON_DESTROY) {
            m6();
        }
        if (this.LLJILJILJ) {
            Pair<String, ? extends InterfaceC1055110dYz> pair = this.LLJILLL;
            if (pair != null) {
                String first = pair.getFirst();
                InterfaceC1055110dYz second = pair.getSecond();
                C0XHY.LIZ.getClass();
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null && (c19egLIZIZ = C1388190mED.LIZIZ(topActivity)) != null) {
                    Hox.LLJILJIL.LIZ(c19egLIZIZ).PQ2(first, second);
                }
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
