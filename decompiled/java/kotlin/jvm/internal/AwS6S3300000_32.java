package kotlin.jvm.internal;

import X.C01CU;
import X.C098200Yq;
import X.C09AY;
import X.C1547310qMr;
import X.C189200o6;
import X.C18BA;
import X.C18C3;
import X.C18CJ;
import X.C1915807eu;
import X.C1953207kw;
import X.C1AF0;
import X.C21186917vf;
import X.C21187017vg;
import X.C21187617vm;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC21187117vh;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AwS6S3300000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S3300000_32 awS6S3300000_32, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("finder", C18BA.LIZIZ((PageFinder) awS6S3300000_32.l3));
        PageInfo pageInfo = (PageInfo) awS6S3300000_32.l4;
        if (pageInfo != null) {
            jSONObject.put("btm_page", pageInfo.getPageBtm());
        }
        jSONObject.put("biz", ((List) awS6S3300000_32.l5).toString());
        jSONObject.put("resumed_btm_page", awS6S3300000_32.s0);
        jSONObject.put("resumed_page", awS6S3300000_32.s1);
        Regex regex = C18C3.LIZ;
        jSONObject.put("last_btm_id", C18C3.LJII(C18CJ.LJ));
        jSONObject.put("token", C18C3.LJII(awS6S3300000_32.s2));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS6S3300000_32 awS6S3300000_32, Object obj) {
        Object next;
        Object next2;
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign(Scene.SCENE_SERVICE, awS6S3300000_32.s0);
        laneParams.plusAssign("path", ((C21187617vm) awS6S3300000_32.l3).LJIIJJI);
        laneParams.plusAssign("source", awS6S3300000_32.s1);
        int value = EnumC21187117vh.SUCCESS.getValue();
        JSONObject jSONObject = new JSONObject();
        for (C21186917vf c21186917vf : (List) awS6S3300000_32.l4) {
            if (c21186917vf.LIZIZ.getValue() > value) {
                value = c21186917vf.LIZIZ.getValue();
            }
            if (true ^ c21186917vf.LIZJ.isEmpty()) {
                try {
                    String str3 = c21186917vf.LIZ;
                    JSONObject jSONObject2 = new JSONObject();
                    for (C21187017vg c21187017vg : c21186917vf.LIZJ) {
                        String str4 = c21187017vg.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c21187017vg.LIZIZ.getValue());
                        sbLIZ.append(" result:");
                        sbLIZ.append(c21187017vg.LIZ());
                        jSONObject2.put(str4, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    jSONObject.put(str3, jSONObject2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
        Object obj2 = null;
        if (value == EnumC21187117vh.CRITICAL.getValue()) {
            C01CU c01cu = (C01CU) awS6S3300000_32.l5;
            if (c01cu != null) {
                str = c01cu.LIZJ;
            } else {
                str = null;
            }
            laneParams.plusAssign("mime_type", str);
            C01CU c01cu2 = (C01CU) awS6S3300000_32.l5;
            if (c01cu2 != null) {
                str2 = c01cu2.LIZIZ;
            } else {
                str2 = null;
            }
            laneParams.plusAssign("param_body", str2);
        }
        laneParams.plusAssign("result", Integer.valueOf(value));
        laneParams.plusAssign("errors", C786410Ut5.J3(jSONObject));
        laneParams.plusAssign("cost_time", Long.valueOf(System.currentTimeMillis() - ((C21187617vm) awS6S3300000_32.l3).LJIIL));
        laneParams.plusAssign("app_channel", C1547310qMr.LIZ());
        Iterator it2 = ((List) awS6S3300000_32.l4).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C21186917vf) next).LIZLLL != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C21186917vf c21186917vf2 = (C21186917vf) next;
        if (c21186917vf2 != null) {
            laneParams.plusAssign("js_version", c21186917vf2.LIZLLL);
        }
        Iterator it3 = ((List) awS6S3300000_32.l4).iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (((C21186917vf) next2).LJ != null) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C21186917vf c21186917vf3 = (C21186917vf) next2;
        if (c21186917vf3 != null) {
            laneParams.plusAssign("rule_version", c21186917vf3.LJ);
        }
        Iterator it4 = ((List) awS6S3300000_32.l4).iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            if (((C21186917vf) next3).LJFF != null) {
                obj2 = next3;
                break;
            }
        }
        C21186917vf c21186917vf4 = (C21186917vf) obj2;
        if (c21186917vf4 != null) {
            laneParams.plusAssign("btm", c21186917vf4.LJFF);
        }
        String str5 = awS6S3300000_32.s1;
        C21187617vm c21187617vm = (C21187617vm) awS6S3300000_32.l3;
        String str6 = awS6S3300000_32.s2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (str6 != null) {
                jSONObject3.put("log_id", str6);
            }
            laneParams.plusAssign("context", C786410Ut5.J3(jSONObject3));
            if (C1915807eu.LIZ().enable) {
                laneParams.plusAssign("cluster_key", C1953207kw.LIZJ(str5, c21187617vm.LJIIJJI));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S3300000_32(PageFinder pageFinder, PageFinder pageFinder2, PageInfo pageInfo, List<String> list, String str, String str2, String str3) {
        super(1);
        this.$t = str3;
        this.l3 = pageFinder;
        this.l4 = pageFinder2;
        this.l5 = pageInfo;
        this.s0 = list;
        this.s1 = str;
        this.s2 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S3300000_32(String str, String str2, C21187617vm c21187617vm, String str3, List<C21186917vf> list, C01CU c01cu, String str4) {
        super(1);
        this.$t = str4;
        this.s0 = str;
        this.l3 = str2;
        this.s1 = c21187617vm;
        this.l4 = str3;
        this.l5 = list;
        this.s2 = c01cu;
    }
}
