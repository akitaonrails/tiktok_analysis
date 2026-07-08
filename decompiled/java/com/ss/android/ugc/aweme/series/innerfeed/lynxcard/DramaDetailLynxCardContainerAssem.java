package com.ss.android.ugc.aweme.series.innerfeed.lynxcard;

import X.C1537720q7O;
import X.C189S;
import X.C189U;
import X.C2188811AlT;
import X.C2189821An6;
import X.C725770SdT;
import X.C786410Ut5;
import X.EnumC680310QmL;
import X.InterfaceC725740SdQ;
import X.InterfaceC725760SdS;
import Y.ARunnableS65S0300000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class DramaDetailLynxCardContainerAssem extends ReusedUIContentAssem<DramaDetailLynxCardContainerAssem> implements InterfaceC725740SdQ, InterfaceC725760SdS {
    public C189S LLJJJJ;
    public ARunnableS65S0300000_32 LLJJJJJIL;

    @Override // X.InterfaceC725740SdQ
    public final void LJIILIIL(Aweme aweme) {
    }

    @Override // X.InterfaceC725760SdS
    public final InterfaceC725740SdQ Ug() {
        return this;
    }

    @Override // X.InterfaceC725740SdQ
    public final void al() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C189S c189s = this.LLJJJJ;
        if (c189s != null) {
            c189s.LIZ();
        }
    }

    @Override // X.InterfaceC725760SdS
    public final void k5() {
        C189U.LIZ.getClass();
        ((Map) C189U.LIZIZ.getValue()).clear();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // X.InterfaceC725760SdS
    public final EnumC680310QmL getPriority() {
        return EnumC680310QmL.DRAMA_PRIORITY;
    }

    @Override // X.InterfaceC725740SdQ
    public final void A2(Aweme aweme) throws JSONException {
        String aid;
        SparkContext sparkContext;
        C189U c189u = C189U.LIZ;
        String str = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c189u.getClass();
        C189S c189sLIZIZ = C189U.LIZIZ(aid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resume:cid=");
        if (c189sLIZIZ != null && (sparkContext = c189sLIZIZ.LIZLLL) != null) {
            str = sparkContext.containerId;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("show_type", "other");
        if (c189sLIZIZ != null) {
            c189sLIZIZ.LIZIZ("on_card_appear", jSONObject);
        }
    }

    @Override // X.InterfaceC725760SdS
    public final boolean S3(C2189821An6 c2189821An6) {
        return Intrinsics.LJFF(c2189821An6.getEventType(), "paid_series_detail_page");
    }

    @Override // X.InterfaceC725740SdQ
    public final void Ya(Aweme aweme) throws JSONException {
        String aid;
        SparkContext sparkContext;
        C189U c189u = C189U.LIZ;
        String str = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c189u.getClass();
        C189S c189sLIZIZ = C189U.LIZIZ(aid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause:cid=");
        if (c189sLIZIZ != null && (sparkContext = c189sLIZIZ.LIZLLL) != null) {
            str = sparkContext.containerId;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hide_type", "other");
        if (c189sLIZIZ != null) {
            c189sLIZIZ.LIZIZ("on_card_disappear", jSONObject);
        }
    }

    @Override // X.InterfaceC725740SdQ
    public final void a5(Aweme aweme) {
        String aid;
        SparkContext sparkContext;
        C189U c189u = C189U.LIZ;
        String str = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c189u.getClass();
        C189S c189sLIZIZ = C189U.LIZIZ(aid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbind:cid=");
        if (c189sLIZIZ != null && (sparkContext = c189sLIZIZ.LIZLLL) != null) {
            str = sparkContext.containerId;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC725740SdQ
    public final void Kc(Aweme aweme, String str) throws JSONException {
        Object first;
        String aid;
        boolean z = true;
        if (str.length() == 0) {
            return;
        }
        C189U.LIZ.getClass();
        if (str.length() != 0) {
            z = false;
        }
        Pair pair = null;
        if (!z) {
            for (Map.Entry entry : ((Map) C189U.LIZIZ.getValue()).entrySet()) {
                if (Intrinsics.LJFF(((C189S) entry.getValue()).LIZLLL.containerId, str)) {
                    pair = new Pair(entry.getKey(), entry.getValue());
                    first = pair.getFirst();
                    break;
                }
            }
            first = null;
        } else {
            first = null;
        }
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (Intrinsics.LJFF(first, aid)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("show_type", "audio_resource_loaded");
            ((C189S) pair.getSecond()).LIZIZ("on_card_appear", jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    @Override // X.InterfaceC725740SdQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ce(android.view.View r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r4 = this;
            r2 = 0
            if (r6 == 0) goto L9
            java.lang.String r1 = r6.getAid()
            if (r1 != 0) goto Lb
        L9:
            java.lang.String r1 = ""
        Lb:
            X.189U r0 = X.C189U.LIZ
            r0.getClass()
            X.189S r3 = X.C189U.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "sel:cid="
            r1.append(r0)
            if (r3 == 0) goto L25
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LIZLLL
            if (r0 == 0) goto L25
            java.lang.String r2 = r0.containerId
        L25:
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L75
            if (r5 == 0) goto L75
            android.view.View r1 = r4.LJJIJL()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L40
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L40
            X.C786410Ut5.LJJJJI(r1)
        L40:
            if (r3 == 0) goto L70
            X.0q7O r0 = r3.LIZJ
            r0.getClass()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L5d
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L5d
            X.0q7O r0 = r3.LIZJ
            r0.getClass()
            X.C786410Ut5.LJJJLZIJ(r0, r1)
        L5d:
            X.0q7O r1 = r3.LIZJ
            r1.getClass()
            if (r2 == 0) goto L70
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L70
            r0.addView(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L75
        L70:
            java.lang.String r0 = "drama add lynx card view is null"
            X.C1AF0.LIZJ(r0)
        L75:
            Y.ARunnableS65S0300000_32 r1 = new Y.ARunnableS65S0300000_32
            r0 = 12
            r1.<init>(r4, r5, r3, r0)
            Y.ARunnableS65S0300000_32 r0 = r4.LLJJJJJIL
            if (r0 == 0) goto L83
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r5, r0)
        L83:
            r4.LLJJJJJIL = r1
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.lynxcard.DramaDetailLynxCardContainerAssem.ce(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC725740SdQ
    public final void fb(int i, Aweme aweme) throws JSONException {
        String aid;
        String aid2;
        String str = "";
        if (i != 1) {
            if (i == 2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("orientation", "landscape");
                C189U c189u = C189U.LIZ;
                if (aweme != null && (aid2 = aweme.getAid()) != null) {
                    str = aid2;
                }
                c189u.getClass();
                C189S c189sLIZIZ = C189U.LIZIZ(str);
                if (c189sLIZIZ != null) {
                    c189sLIZIZ.LIZIZ("on_screen_rotate", jSONObject);
                    return;
                }
                return;
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("orientation", "vertical");
        C189U c189u2 = C189U.LIZ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str = aid;
        }
        c189u2.getClass();
        C189S c189sLIZIZ2 = C189U.LIZIZ(str);
        if (c189sLIZIZ2 == null) {
            return;
        }
        c189sLIZIZ2.LIZIZ("on_screen_rotate", jSONObject2);
    }

    @Override // X.InterfaceC725740SdQ
    public final void u2(View view, Aweme aweme) throws JSONException {
        String aid;
        String str;
        ViewGroup viewGroup;
        SparkContext sparkContext;
        C189U c189u = C189U.LIZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c189u.getClass();
        C189S c189sLIZIZ = C189U.LIZIZ(aid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsel:cid=");
        if (c189sLIZIZ != null && (sparkContext = c189sLIZIZ.LIZLLL) != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null && c189sLIZIZ != null) {
            C1537720q7O c1537720q7O = c189sLIZIZ.LIZJ;
            c1537720q7O.getClass();
            ViewParent parent = c1537720q7O.getParent();
            if (parent != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C1537720q7O c1537720q7O2 = c189sLIZIZ.LIZJ;
                c1537720q7O2.getClass();
                C786410Ut5.LJJJLZIJ(c1537720q7O2, viewGroup);
            }
        }
        ARunnableS65S0300000_32 aRunnableS65S0300000_32 = this.LLJJJJJIL;
        if (aRunnableS65S0300000_32 != null) {
            HandlerHook.viewRemoveCallbacks(view, aRunnableS65S0300000_32);
            this.LLJJJJJIL = null;
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hide_type", "draw");
        jSONObject.put("page_down", true);
        if (c189sLIZIZ == null) {
            return;
        }
        c189sLIZIZ.LIZIZ("on_card_disappear", jSONObject);
    }

    @Override // X.InterfaceC725740SdQ
    public final boolean h6(Aweme aweme, C2189821An6 c2189821An6, C725770SdT c725770SdT) {
        String aid;
        SparkContext sparkContext;
        C189U c189u = C189U.LIZ;
        String str = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c189u.getClass();
        C189S c189sLIZIZ = C189U.LIZIZ(aid);
        if (c189sLIZIZ != null) {
            this.LLJJJJ = c189sLIZIZ;
            return true;
        }
        Context context = LJJIJL().getContext();
        c189u.getClass();
        this.LLJJJJ = C189U.LIZ(aweme, context, c2189821An6, c725770SdT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind:cid=");
        C189S c189s = this.LLJJJJ;
        if (c189s != null && (sparkContext = c189s.LIZLLL) != null) {
            str = sparkContext.containerId;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    @Override // X.InterfaceC725760SdS
    public final boolean G4(Aweme aweme, C2189821An6 c2189821An6, String str, Context context, C725770SdT c725770SdT) {
        if (!Intrinsics.LJFF(str, EnumC680310QmL.DRAMA_PRIORITY.getContainerType())) {
            return false;
        }
        C189U.LIZ.getClass();
        DetailLynxCardStruct lynxCardStruct = aweme.getLynxCardStruct();
        if (lynxCardStruct == null || lynxCardStruct.dynamicPatch == null) {
            return false;
        }
        Map map = (Map) C189U.LIZIZ.getValue();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (map.get(aid) != null) {
            return false;
        }
        C189U.LIZ(aweme, context, c2189821An6, c725770SdT);
        return true;
    }
}
