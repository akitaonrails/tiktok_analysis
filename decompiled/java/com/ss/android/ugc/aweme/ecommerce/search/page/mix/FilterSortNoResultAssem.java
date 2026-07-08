package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.AbstractC677840QiM;
import X.AbstractC677870QiP;
import X.C123100dR;
import X.C12ES;
import X.C1540620qC4;
import X.C197039127h;
import X.C678320Qj8;
import X.C678450QjL;
import X.C786410Ut5;
import Y.ACListenerS145S0100000_10;
import Y.ARunnableS102S0100000_2;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class FilterSortNoResultAssem extends MixReusedUIAssem<FilterSortNoResultAssem, C678450QjL> {
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public TuxIconView LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bot;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) throws JSONException {
        C678320Qj8 c678320Qj8;
        AbstractC677870QiP abstractC677870QiP = ((AbstractC677840QiM) obj).LL;
        View viewFindViewById = null;
        if ((abstractC677870QiP instanceof C678320Qj8) && (c678320Qj8 = (C678320Qj8) abstractC677870QiP) != null) {
            View viewFindViewById2 = this.LLJLIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.pae);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(c678320Qj8.LJI);
            View viewFindViewById3 = this.LLJLILLLLZIIL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.pa9);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(c678320Qj8.LJII);
            if (C123100dR.LIZ(c678320Qj8.LJIIIIZZ)) {
                View viewFindViewById4 = this.LLJLL;
                if (viewFindViewById4 == null) {
                    View viewLJJIJL3 = LJJIJL();
                    if (viewLJJIJL3 != null) {
                        viewFindViewById4 = viewLJJIJL3.findViewById(R.id.pab);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLJLL = (C197039127h) viewFindViewById4;
                }
                C197039127h c197039127h = (C197039127h) viewFindViewById4;
                C786410Ut5.LLLLLLJ(c197039127h, 0);
                View view = this.LLJLLIL;
                if (view == null) {
                    View viewLJJIJL4 = LJJIJL();
                    if (viewLJJIJL4 != null) {
                        viewFindViewById = viewLJJIJL4.findViewById(R.id.paa);
                    }
                    this.LLJLLIL = (TuxIconView) viewFindViewById;
                    view = viewFindViewById;
                }
                C12ES.LJIILL(8, view);
                c197039127h.setText(c678320Qj8.LJIIIIZZ);
                c197039127h.setIconTintColor(R.attr.br);
                C786410Ut5.U8(c197039127h, new ACListenerS145S0100000_10(this, 48));
                C1540620qC4 c1540620qC4VQ2 = op().vQ2();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "show");
                c1540620qC4VQ2.LJJIII("filter_search_reselect", jSONObject);
            } else {
                View view2 = this.LLJLLIL;
                if (view2 == null) {
                    View viewLJJIJL5 = LJJIJL();
                    if (viewLJJIJL5 != null) {
                        viewFindViewById = viewLJJIJL5.findViewById(R.id.paa);
                    }
                    this.LLJLLIL = (TuxIconView) viewFindViewById;
                    view2 = viewFindViewById;
                }
                C12ES.LJIILL(0, view2);
            }
            HandlerHook.viewPost(getContentView(), new ARunnableS102S0100000_2(this, 44));
        }
    }
}
