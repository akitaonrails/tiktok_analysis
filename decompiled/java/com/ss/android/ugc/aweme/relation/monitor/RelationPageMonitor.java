package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC1623806Xk;
import X.AbstractC20621015ma;
import X.C0XHY;
import X.C1261270ivV;
import X.C1449205lq;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1720106oR;
import X.C1954807lC;
import X.C20620915mZ;
import X.C20621115mb;
import X.C20621215mc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C491001vg;
import X.C491101vh;
import X.EnumC325100Com;
import X.InterfaceC1264300j0O;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class RelationPageMonitor implements InterfaceC1264300j0O {
    public static final Map<String, Long> LLJILJIL = new LinkedHashMap();
    public static final Map<String, Integer> LLJILJILJ = new LinkedHashMap();
    public final C1261270ivV LL;
    public final String LLILLJJLI;
    public final Function0<Long> LLILLL;
    public final Function2<String, JSONObject, Unit> LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public C20621215mc LLIZ;
    public final boolean LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public AbstractC1623806Xk<Unit> LLJIJIL;

    public RelationPageMonitor() {
        throw null;
    }

    @Override // X.InterfaceC1264300j0O
    public final void XR() throws JSONException {
        if (this.LLILZLL) {
            return;
        }
        long jLongValue = this.LLILLL.invoke().longValue();
        Map<String, Integer> map = LLJILJILJ;
        Integer num = (Integer) ((LinkedHashMap) map).get(this.LLILLJJLI);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        map.put(this.LLILLJJLI, Integer.valueOf(iIntValue));
        Long l = (Long) ((LinkedHashMap) LLJILJIL).get(this.LLILLJJLI);
        C20621215mc c20621215mc = new C20621215mc(iIntValue, l != null ? jLongValue - l.longValue() : -1L, jLongValue);
        this.LLIZ = c20621215mc;
        LIZ(c20621215mc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trace start!");
        C1720106oR.LJI("Relation_Page", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1264300j0O
    public final void kz() {
        if (this.LLILZIL == 0) {
            C20621215mc c20621215mc = this.LLIZ;
            this.LLJI = c20621215mc != null ? this.LLILLL.invoke().longValue() - c20621215mc.LJ : -1L;
        }
        this.LLILZIL++;
    }

    @Override // X.InterfaceC1264300j0O
    public final void m6() throws JSONException {
        C20621215mc c20621215mc;
        if (this.LLILZLL || (c20621215mc = this.LLIZ) == null) {
            return;
        }
        long jLongValue = this.LLILLL.invoke().longValue();
        LLJILJIL.put(this.LLILLJJLI, Long.valueOf(jLongValue));
        LIZ(new C20621115mb(this.LLILZIL, this.LLJIJIL, jLongValue - c20621215mc.LJ, this.LLJ, this.LLJI));
        this.LLILZLL = true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trace end!");
        C1720106oR.LJI("Relation_Page", C2188811AlT.LIZIZ(sbLIZ));
    }

    public RelationPageMonitor(C1261270ivV c1261270ivV) {
        String strLIZIZ = c1261270ivV.LIZIZ();
        C1449205lq c1449205lq = C1449205lq.LL;
        C20620915mZ c20620915mZ = new C20620915mZ(C0XHY.LIZ);
        this.LL = c1261270ivV;
        this.LLILLJJLI = strLIZIZ;
        this.LLILLL = c1449205lq;
        this.LLILZ = c20620915mZ;
        this.LLIZLLLIL = true;
        this.LLJ = -1L;
        this.LLJI = -1L;
        this.LLJIJIL = new C1623706Xj();
    }

    @Override // X.InterfaceC1264300j0O
    public final void Bx(AbstractC1623806Xk<Unit> abstractC1623806Xk) {
        long jLongValue;
        this.LLJIJIL = abstractC1623806Xk;
        if ((abstractC1623806Xk instanceof C1623606Xi) || (abstractC1623806Xk instanceof C491001vg)) {
            C20621215mc c20621215mc = this.LLIZ;
            if (c20621215mc != null) {
                jLongValue = this.LLILLL.invoke().longValue() - c20621215mc.LJ;
            } else {
                jLongValue = -1;
            }
            this.LLJ = jLongValue;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trace state: ");
        sbLIZ.append(abstractC1623806Xk);
        sbLIZ.append('!');
        C1720106oR.LJI("Relation_Page", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(AbstractC20621015ma abstractC20621015ma) throws JSONException {
        String str;
        Object objValueOf;
        JSONObject jSONObject = new JSONObject();
        C0XHY c0xhy = C0XHY.LIZ;
        JSONObject jSONObjectPut = jSONObject.put("action", abstractC20621015ma.LIZ);
        EnumC325100Com enumC325100Com = abstractC20621015ma.LIZIZ;
        c0xhy.getClass();
        C0XHY.LIZ(jSONObjectPut.put("net_status", C0XHY.LJ(enumC325100Com)), this.LL.LIZJ());
        if (abstractC20621015ma instanceof C20621215mc) {
            C20621215mc c20621215mc = (C20621215mc) abstractC20621015ma;
            JSONObject jSONObjectPut2 = jSONObject.put("enter_cnt", c20621215mc.LIZJ);
            long j = c20621215mc.LIZLLL;
            if (j <= 0) {
                objValueOf = -1L;
            } else {
                objValueOf = Integer.valueOf((int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
            jSONObjectPut2.put("enter_duration", objValueOf);
        } else if (abstractC20621015ma instanceof C20621115mb) {
            C20621115mb c20621115mb = (C20621115mb) abstractC20621015ma;
            AbstractC1623806Xk<Unit> abstractC1623806Xk = c20621115mb.LIZLLL;
            if (abstractC1623806Xk instanceof C491001vg) {
                str = "error";
            } else if (!(abstractC1623806Xk instanceof C1623706Xj) && !Intrinsics.LJFF(abstractC1623806Xk, C491101vh.LIZ)) {
                if (abstractC1623806Xk instanceof C1623606Xi) {
                    str = "normal";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "loading";
            }
            jSONObject.put("state", str).put("show_cnt", c20621115mb.LIZJ).put("stay_duration", c20621115mb.LJ).put("load_time", C0XHY.LIZIZ(c0xhy, c20621115mb.LJFF)).put("first_item_load_time", C0XHY.LIZIZ(c0xhy, c20621115mb.LJI));
        } else {
            throw new C1954807lC();
        }
        jSONObject.put("is_valid", C0XHY.LJFF(this.LLIZLLLIL));
        this.LLILZ.invoke("relation_list_page_track", jSONObject);
    }

    @Override // X.InterfaceC1264300j0O
    public final void dt1(RecyclerView recyclerView) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationPage_");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LL.LIZLLL);
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LJ(recyclerView, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws JSONException {
        if (event == Lifecycle.Event.ON_DESTROY) {
            m6();
        }
        if (this.LLILZLL) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
