package com.ss.android.ugc.aweme.poi.map.assem;

import X.C019F;
import X.C1179620gno;
import X.C1179950goL;
import X.C1192290h8F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C444960Hcc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationDetailInfoAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1179950goL.class, "LocationDetailInfoHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public FrameLayout LLJI;
    public TextView LLJIJIL;
    public TextView LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocationDetailInfoAssem.class, "mapViewModel", "getMapViewModel()Lcom/ss/android/ugc/aweme/poi/map/PoiMapViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocationDetailInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1357), AFwS256S0000000_18.get$arr$(446), null, true);
    }

    public final PoiListApi.PoiDetailResponse Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return ((C1179620gno) assemVMLazy.getValue().getState()).LL.LIZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.i7c);
        C786410Ut5.I7(new AbS508S0200000_18(this, frameLayout, 19, 42), frameLayout);
        this.LLJI = frameLayout;
        this.LLJIJIL = (TextView) view.findViewById(R.id.tv_poi_name);
        this.LLJILJIL = (TextView) view.findViewById(R.id.tv_poi_address);
        Context context = getContext();
        if (context != null) {
            TextView textView = this.LLJIJIL;
            TextView textView2 = null;
            if (textView == null) {
                textView = null;
            }
            int i2 = 4;
            if (C444960Hcc.LIZJ(context)) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            TextView textView3 = this.LLJILJIL;
            if (textView3 != null) {
                textView2 = textView3;
            }
            if (!C444960Hcc.LIZJ(context)) {
                i2 = 3;
            }
            textView2.setTextDirection(i2);
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0goK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1179620gno) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 134), 6);
        C1192290h8F.LIZ(this, "poi_map_detail_main", null, true, null, null, 26);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 386));
    }
}
