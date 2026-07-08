package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton;

import X.C1184140gv6;
import X.C1559260qg8;
import X.C197039127h;
import X.C20248814Kw;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailHeaderDynamicButtonAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1184140gv6.class, "PoiDetailHeaderDynamicButtonHierarchyData"), checkSupervisorPrepared());
    public LinearLayout LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e04;
    }

    public final C1184140gv6 ip() {
        return (C1184140gv6) this.LLJJI.getValue();
    }

    public final C197039127h hp(PoiButton poiButton) {
        String str;
        DynamicIcon dynamicIcon = poiButton.icon;
        if (dynamicIcon == null || (str = poiButton.buttonName) == null) {
            return null;
        }
        C197039127h c197039127h = new C197039127h(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        c197039127h.setButtonVariant(1);
        Integer dynamicIcon2 = dynamicIcon.parseDynamicIcon(LJJIJL().getContext(), null);
        if (dynamicIcon2 != null) {
            c197039127h.setButtonStartIcon(Integer.valueOf(dynamicIcon2.intValue()));
        }
        c197039127h.setButtonSize(1);
        c197039127h.setMaxWidth(Integer.MAX_VALUE);
        c197039127h.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        c197039127h.LJJLI(true);
        c197039127h.setClickable(true);
        c197039127h.setText(str);
        c197039127h.setTag(poiButton);
        c197039127h.setId(View.generateViewId());
        C2211631BhB.LJ(c197039127h, new AwS384S0200000_18(AFwS256S0000000_18.get$arr$(354), (Function1<? super C20248814Kw, Unit>) new AwS262S0300000_18(poiButton, c197039127h, this, 6), (Function0<Unit>) 35));
        return c197039127h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0229  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton.PoiDetailHeaderDynamicButtonAssem.onViewCreated(android.view.View):void");
    }
}
