package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.AbstractC677840QiM;
import X.AbstractC677870QiP;
import X.C1396605dM;
import X.C1ER1;
import X.C2344009Gk;
import X.C674800QdS;
import X.C675150Qe1;
import X.C675270QeD;
import X.C677890QiR;
import X.C678740Qjo;
import X.C678800Qju;
import X.C679270Qkf;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class NoResultJumpGSAssem extends MixReusedUIAssem<NoResultJumpGSAssem, C678740Qjo> {
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bp6;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C678800Qju c678800Qju;
        C675150Qe1 c675150Qe1;
        String str;
        JSONObject jSONObject;
        String strOptString;
        LogPbBean logPbBean;
        LogPbBean logPbBean2;
        C674800QdS c674800QdS;
        AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) obj;
        AbstractC677870QiP abstractC677870QiP = abstractC677840QiM.LL;
        String imprId = null;
        if ((abstractC677870QiP instanceof C678800Qju) && (c678800Qju = (C678800Qju) abstractC677870QiP) != null) {
            View viewFindViewById = this.LLJLIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.pae);
                } else {
                    viewFindViewById = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(c678800Qju.LJI);
            View viewFindViewById2 = this.LLJLILLLLZIIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.pa9);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(c678800Qju.LJII);
            String latestSearchId = C1ER1.LIZIZ.getLatestSearchId();
            C1396605dM c1396605dM = op().LLILZ;
            if (c1396605dM == null) {
                c1396605dM = null;
            }
            C675270QeD c675270QeD = c1396605dM.LIZLLL.LJFF;
            if (c675270QeD instanceof C675150Qe1) {
                c675150Qe1 = (C675150Qe1) c675270QeD;
            } else {
                c675150Qe1 = null;
            }
            String str2 = "";
            if (c675150Qe1 == null || (c674800QdS = c675150Qe1.LJFF) == null || (str = c674800QdS.keyword) == null) {
                str = "";
            }
            Object obj2 = ((LinkedHashMap) op().LLILLL).get("searchInitParams");
            if (obj2 instanceof JSONObject) {
                jSONObject = (JSONObject) obj2;
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                strOptString = "";
            } else {
                String strOptString2 = jSONObject.optString("enter_from", "");
                strOptString = jSONObject.optString("search_entrance", "");
                str2 = strOptString2;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            C677890QiR c677890QiR = abstractC677840QiM.LLILLL;
            if (c677890QiR != null) {
                logPbBean = c677890QiR.LIZ;
            } else {
                logPbBean = null;
            }
            c2344009Gk.LJ(logPbBean, "log_pb");
            C677890QiR c677890QiR2 = abstractC677840QiM.LLILLL;
            if (c677890QiR2 != null && (logPbBean2 = c677890QiR2.LIZ) != null) {
                imprId = logPbBean2.getImprId();
            }
            c2344009Gk.LJIIIIZZ("impr_id", imprId);
            c2344009Gk.LJIIIIZZ("search_id", latestSearchId);
            c2344009Gk.LJIIIIZZ("search_entrance", strOptString);
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("search_keyword", str);
            c2344009Gk.LJIIIIZZ("guide_show_type", "mall_no_result");
            C679270Qkf.LIZIZ("search_nolessresult_guide_module_show", c2344009Gk.LIZ);
        }
    }
}
