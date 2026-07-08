package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui;

import X.C01GW;
import X.C1558520qew;
import X.C1913107eT;
import X.C21415918rV;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C725080ScM;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC652500Pia;
import X.InterfaceC652790Pj3;
import X.InterfaceC723720SaA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class AggregatedVideoCardAssem extends SearchAggregatedCardAssem<InterfaceC652500Pia> {
    public C21415918rV LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public TextView LLJLLIL;
    public View LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 667));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f0z;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final int up() {
        return R.id.df_;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCreate begin ");
            sbLIZ.append(this);
            interfaceC723720SaA.log("AssemList", C2188811AlT.LIZIZ(sbLIZ));
        }
        super.onCreate();
        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
        if (interfaceC723720SaA2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onCreate end ");
            sbLIZ2.append(this);
            interfaceC723720SaA2.log("AssemList", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws Exception {
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewCreated begin ");
            sbLIZ.append(this);
            interfaceC723720SaA.log("AssemList", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            super.onViewCreated(view);
            this.LLJLLL = view.findViewById(R.id.jhz);
            yp(view);
            this.LLJLIL = (C21415918rV) view.findViewById(R.id.u2w);
            this.LLJLL = view.findViewById(R.id.uja);
            this.LLJLILLLLZIIL = view.findViewById(R.id.view_blank_for_scroll);
            InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
            if (interfaceC723720SaA2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onViewCreated end ");
                sbLIZ2.append(this);
                interfaceC723720SaA2.log("AssemList", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC723720SaA interfaceC723720SaA3 = C725080ScM.LIZIZ;
            if (interfaceC723720SaA3 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onViewCreated error ");
                sbLIZ3.append(e.getStackTrace());
                interfaceC723720SaA3.log("AssemList", C2188811AlT.LIZIZ(sbLIZ3));
            }
            throw e;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((InterfaceC652500Pia) obj);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC652500Pia interfaceC652500Pia) {
        String strLIZIZ;
        RecyclerView.ViewHolder viewHolderK4;
        int i;
        super.up(interfaceC652500Pia);
        View view = null;
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null && (viewHolderK4 = searchServiceCenter$CardCommonAbility.k4()) != null) {
            int layoutPosition = viewHolderK4.getLayoutPosition();
            View view2 = this.LLJLLL;
            if (view2 == null) {
                view2 = null;
            }
            if (layoutPosition != 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        TextView textView = this.LLJLLIL;
        if (textView == null) {
            textView = null;
        }
        InterfaceC652790Pj3 interfaceC652790Pj3 = (InterfaceC652790Pj3) this.LLJZ.getValue();
        if (interfaceC652790Pj3 == null || (strLIZIZ = interfaceC652790Pj3.LIZIZ(interfaceC652500Pia, getContext())) == null) {
            strLIZIZ = "";
        }
        textView.setText(strLIZIZ);
        InterfaceC652790Pj3 interfaceC652790Pj32 = (InterfaceC652790Pj3) this.LLJZ.getValue();
        if (interfaceC652790Pj32 != null) {
            interfaceC652790Pj32.LIZ();
        }
        C21415918rV c21415918rV = this.LLJLIL;
        if (c21415918rV == null) {
            c21415918rV = null;
        }
        c21415918rV.setEnable(false);
        c21415918rV.setOnScrollToEndListener(null);
        View view3 = this.LLJLILLLLZIIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(8, view3);
        View view4 = this.LLJLL;
        if (view4 != null) {
            view = view4;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void yp(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLJLLIL = (TextView) view.findViewById(R.id.ugy);
        Integer numValueOf = Integer.valueOf(C1913107eT.LJFF());
        if (numValueOf.intValue() > 0 && 1 != 0) {
            int iIntValue = numValueOf.intValue();
            TextView textView = this.LLJLLIL;
            if (textView == null) {
                textView = null;
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
            }
        }
    }
}
