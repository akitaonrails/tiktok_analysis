package com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle;

import X.C1005210cGV;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1175120ggY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1558520qew;
import X.C197039127h;
import X.C20248814Kw;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2007707tj;
import X.InterfaceC665370Q7z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBottomButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRectangleBottomBarComponent extends PoiDetailBaseUiContentComponent<PoiRectangleBottomBarModule> {
    public LinearLayout LLJI;
    public final Map<Integer, C197039127h> LLJIJIL = new LinkedHashMap();

    public final boolean Lo() {
        PoiBottomButtonGroup poiBottomButtonGroup;
        List<PoiButton> list;
        PoiRectangleBottomBarModule poiRectangleBottomBarModule = (PoiRectangleBottomBarModule) C1174850gg7.LIZJ(this);
        return C1175120ggY.LIZJ((poiRectangleBottomBarModule == null || (poiBottomButtonGroup = poiRectangleBottomBarModule.getPoiBottomButtonGroup()) == null || (list = poiBottomButtonGroup.buttonList) == null) ? null : Integer.valueOf(list.size())) <= 2;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = C1173980gei.LIZ(this);
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, C1173980gei.LIZ(this), new C1185050gwZ(PageFinder.via(LJJIJL())), 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173970geh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CG1(com.ss.android.ugc.aweme.slash.component.BaseComponentData r25) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle.PoiRectangleBottomBarComponent.CG1(com.ss.android.ugc.aweme.slash.component.BaseComponentData):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(view.getContext());
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        C786410Ut5.Td(layoutInflaterNe, R.layout.e73, viewGroup, true);
        this.LLJI = (LinearLayout) LJJIJL().findViewById(R.id.rai);
    }

    public final C197039127h No(PoiButton poiButton, boolean z) {
        String str;
        DynamicIcon dynamicIcon = poiButton.icon;
        if (dynamicIcon == null || (str = poiButton.buttonName) == null) {
            return null;
        }
        C197039127h c197039127h = new C197039127h(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        c197039127h.setButtonVariant(1);
        if (z) {
            Integer dynamicIcon2 = dynamicIcon.parseDynamicIcon(LJJIJL().getContext(), null);
            if (dynamicIcon2 != null) {
                c197039127h.setButtonStartIcon(Integer.valueOf(dynamicIcon2.intValue()));
                c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                c197039127h.setTag(new C1005210cGV(poiButton, EnumC2007707tj.HAVE_ICON, false, false));
            }
        } else {
            c197039127h.setTag(new C1005210cGV(poiButton, EnumC2007707tj.NO_ICON, false, false));
        }
        c197039127h.setButtonSize(2);
        c197039127h.setMaxWidth(Integer.MAX_VALUE);
        c197039127h.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        c197039127h.setTuxFont(42);
        c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h.setClickable(true);
        c197039127h.setText(str);
        c197039127h.setId(View.generateViewId());
        C2211631BhB.LJ(c197039127h, new AwS384S0200000_18(AFwS256S0000000_18.get$arr$(373), (Function1<? super C20248814Kw, Unit>) new AwS262S0300000_18(poiButton, c197039127h, this, 8), (Function0<Unit>) 35));
        return c197039127h;
    }
}
