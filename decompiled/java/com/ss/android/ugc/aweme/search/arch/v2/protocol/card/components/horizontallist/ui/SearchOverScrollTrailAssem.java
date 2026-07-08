package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.ui;

import X.C1559260qg8;
import X.C21415918rV;
import X.C654550Plt;
import X.C687700QyG;
import X.C723580SZw;
import X.EnumC652870PjB;
import X.InterfaceC1146704e9;
import X.InterfaceC652810Pj5;
import X.InterfaceC655560PnW;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS128S0110000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchOverScrollTrailAssem extends ReusedUIContentAssem<SearchOverScrollTrailAssem> implements InterfaceC652810Pj5, InterfaceC737790Swr, InterfaceC1146704e9 {
    public final SearchOverScrollTrailAssem LLJJJJ = this;
    public final C1559260qg8 LLJJJJJIL = new C1559260qg8(new C723580SZw(this, C654550Plt.class, null), checkSupervisorPrepared());
    public C21415918rV LLJJJJLIIL;
    public TuxSpinner LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public InterfaceC655560PnW LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C21415918rV c21415918rV = this.LLJJJJLIIL;
        if (c21415918rV != null) {
            c21415918rV.setOnScrollToEndListener(null);
        }
        C21415918rV c21415918rV2 = this.LLJJJJLIIL;
        if (c21415918rV2 != null) {
            c21415918rV2.setOnScrollThresholdHitListener(null);
        }
        C21415918rV c21415918rV3 = this.LLJJJJLIIL;
        if (c21415918rV3 != null) {
            c21415918rV3.setOnNestedScrollAcceptedListener(null);
        }
        this.LLJL = null;
    }

    public SearchOverScrollTrailAssem() {
        new ArrayList();
    }

    @Override // X.InterfaceC652810Pj5
    public final void Ik(EnumC652870PjB enumC652870PjB) {
        new AwS411S0200000_10(enumC652870PjB, this, 22).invoke();
    }

    @Override // X.InterfaceC652810Pj5
    public final void Jn(InterfaceC655560PnW interfaceC655560PnW) {
        this.LLJL = interfaceC655560PnW;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchHorizontalListScope.class}).unbindAbility(this.LLJJJJ, InterfaceC652810Pj5.class);
    }

    @Override // X.InterfaceC652810Pj5
    public final void bm(String str) {
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C21415918rV c21415918rV;
        this.LLJJJJLIIL = (C21415918rV) view.findViewById(R.id.u8d);
        this.LLJJL = (TuxSpinner) view.findViewById(R.id.u96);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.u97);
        C21415918rV c21415918rV2 = this.LLJJJJLIIL;
        if (c21415918rV2 != null) {
            c21415918rV2.setOnScrollToEndListener(new AwS554S0100000_10(this, 1217));
        }
        C21415918rV c21415918rV3 = this.LLJJJJLIIL;
        if (c21415918rV3 != null) {
            c21415918rV3.setOnScrollThresholdHitListener(new AwS554S0100000_10(this, 1218));
        }
        C654550Plt c654550Plt = (C654550Plt) this.LLJJJJJIL.getValue();
        if ((c654550Plt == null || c654550Plt.LLJJJ) && (c21415918rV = this.LLJJJJLIIL) != null) {
            c21415918rV.setOnNestedScrollAcceptedListener(AFwS241S0000000_10.get$arr$(531));
        }
        Ik(EnumC652870PjB.SCROLL_TO_OPEN);
        p7(false);
    }

    @Override // X.InterfaceC652810Pj5
    public final void p7(boolean z) {
        new AwS128S0110000_10(this, z, 3).invoke();
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchHorizontalListScope.class}).bindAbility(this.LLJJJJ, InterfaceC652810Pj5.class);
    }
}
