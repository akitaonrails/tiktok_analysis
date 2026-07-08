package com.ss.android.ugc.aweme.sidebar.components.section;

import X.C1580320rE6;
import X.C1580600rEY;
import X.C1580610rEZ;
import X.C1580820rEu;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C421650Gg7;
import X.C723850SaN;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C805803Cu;
import X.C814420VxA;
import X.InterfaceC1580560rEU;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.sidebar.components.SideBarComponent;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponentUiData;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarListSectionComponent extends SideBarSectionComponent {
    public C1580610rEZ LLJJJJ;
    public C1580600rEY LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C421650Gg7 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public SideBarSectionComponentConfig LLJLIL;
    public SideBarSectionComponentUiData LLJLILLLLZIIL;
    public final AwS568S0100000_24 LLJLL = new AwS568S0100000_24(this, 1145);

    public final boolean Fp() {
        SideBarSectionComponentConfig sideBarSectionComponentConfigIp = this.LLJLIL;
        if (sideBarSectionComponentConfigIp == null) {
            sideBarSectionComponentConfigIp = ip();
        }
        if (!Intrinsics.LJFF(lp("revisit_edu_show_guide"), Boolean.TRUE)) {
            return false;
        }
        if (Intrinsics.LJFF(sideBarSectionComponentConfigIp != null ? sideBarSectionComponentConfigIp.sectionId : null, "tiktok_minis")) {
            return Intrinsics.LJFF(sideBarSectionComponentConfigIp != null ? sideBarSectionComponentConfigIp.sectionType : null, "sidebar_box_list");
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C421650Gg7 c421650Gg7 = this.LLJJL;
        if (c421650Gg7 != null) {
            c421650Gg7.LIZ(null);
        }
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = 0;
        Set<Function0<Unit>> set = C1580320rE6.LIZ;
        AwS568S0100000_24 awS568S0100000_24 = this.LLJLL;
        C1580320rE6.LIZ.remove(awS568S0100000_24);
        C1580320rE6.LIZIZ.remove(Integer.valueOf(awS568S0100000_24.hashCode()));
    }

    public static RecyclerView Ep(View view) {
        ViewGroup viewGroup;
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewEp = Ep(viewGroup.getChildAt(i));
            if (recyclerViewEp != null) {
                return recyclerViewEp;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent, com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0rEW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1156300gCC) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 100), 6);
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent
    /* JADX INFO: renamed from: Bp */
    public final void tp(View view, SideBarSectionComponentConfig sideBarSectionComponentConfig) {
        SideBarSectionComponentUiData sideBarSectionComponentUiData;
        InterfaceC1580560rEU interfaceC1580560rEU;
        n nVar;
        super.tp(view, sideBarSectionComponentConfig);
        h hVar = null;
        if (sideBarSectionComponentConfig != null && (nVar = sideBarSectionComponentConfig.sectionUiData) != null) {
            sideBarSectionComponentUiData = (SideBarSectionComponentUiData) C1580820rEu.LIZ(nVar.toString(), SideBarSectionComponentUiData.class);
        } else {
            sideBarSectionComponentUiData = null;
        }
        this.LLJLILLLLZIIL = sideBarSectionComponentUiData;
        this.LLJLIL = sideBarSectionComponentConfig;
        if (sideBarSectionComponentConfig != null) {
            List<? extends InterfaceC1580560rEU> list = sideBarSectionComponentConfig.LIZ;
            if (list != null && list.isEmpty()) {
                sideBarSectionComponentConfig.LIZ = C1697810uHb.LJIILJJIL(new SideBarComponentUiData(null, "side_bar_list", "", null));
            }
            List<? extends InterfaceC1580560rEU> list2 = sideBarSectionComponentConfig.LIZ;
            if (list2 != null && (interfaceC1580560rEU = (InterfaceC1580560rEU) ListProtector.get(list2, 0)) != null) {
                n nVar2 = new n();
                if (sideBarSectionComponentUiData != null) {
                    hVar = sideBarSectionComponentUiData.componentList;
                }
                nVar2.LJJIFFI("item_list", hVar);
                interfaceC1580560rEU.LIZJ(nVar2);
            }
        }
        Set<Function0<Unit>> set = C1580320rE6.LIZ;
        C1580320rE6.LIZ(this.LLJLL);
        if (Fp() && !this.LLJJJJLIIL && !this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJLIIIJLLLLLLLZ = true;
            this.LLJL = 0;
            HandlerHook.viewPostDelay(getContentView(), new ARunnableS124S0100000_24(this, 134), 200L);
        }
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void sp(InterfaceC1580560rEU interfaceC1580560rEU, List list) {
        String str;
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        int iLIZIZ;
        int iLIZIZ2;
        float f;
        Resources resources;
        DisplayMetrics displayMetrics;
        SideBarSectionComponentConfig sideBarSectionComponentConfig = (SideBarSectionComponentConfig) interfaceC1580560rEU;
        boolean zLJFF = Intrinsics.LJFF(lp("is_small_screen"), Boolean.TRUE);
        if (sideBarSectionComponentConfig != null) {
            str = sideBarSectionComponentConfig.sectionType;
        } else {
            str = null;
        }
        int i = 0;
        if (Intrinsics.LJFF(str, "sidebar_box_list")) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                i = displayMetrics.widthPixels;
            }
            float f2 = i * 0.85f;
            if (!zLJFF) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            float f3 = f2 - (iLIZIZ * 2);
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            float f4 = 2;
            float f5 = ((f3 - (iLIZIZ2 * 2)) - (iLIZIZ3 * 3)) / f4;
            int i2 = 8;
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            while (true) {
                f = f5 - (iLIZIZ4 * 2);
                if (f >= 0.0f || i2 <= 0) {
                    break;
                }
                i2--;
                iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            }
            float fLIZIZ = ((f3 - ((iLIZIZ3 + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))) * 2)) * 3)) - (f4 * f)) / f4;
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            this.LLJJJJJIL = new C1580600rEY(new C805803Cu(fLIZIZ));
            this.LLJJJJ = new C1580610rEZ(3, iLIZIZ5, (int) f);
        } else if (Intrinsics.LJFF(str, "sidebar_row_list")) {
            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            this.LLJJJJJIL = new C1580600rEY(new AwS16S0010000_1(zLJFF, 30));
            this.LLJJJJ = new C1580610rEZ(1, iLIZIZ6, iLIZIZ7);
        } else {
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        for (InterfaceC1580560rEU interfaceC1580560rEU2 : (ArrayList) list) {
            Context context2 = getContext();
            if (context2 != null) {
                frameLayout = new FrameLayout(context2);
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
                frameLayout.setId(View.generateViewId());
            } else {
                frameLayout = null;
            }
            View contentView = getContentView();
            if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
                viewGroup.addView(frameLayout);
            }
            C723850SaN.LIZLLL(this, new AwS233S0300000_24(this, interfaceC1580560rEU2, frameLayout, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent, com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final /* bridge */ /* synthetic */ void tp(View view, InterfaceC1580560rEU interfaceC1580560rEU) {
        tp(view, (SideBarSectionComponentConfig) interfaceC1580560rEU);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent, com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void up(SideBarComponent<?> sideBarComponent, InterfaceC1580560rEU interfaceC1580560rEU) {
        super.up(sideBarComponent, interfaceC1580560rEU);
        sideBarComponent.zp(this.LLJJJJ, "list_config", false);
        sideBarComponent.zp(this.LLJJJJJIL, "container_config", false);
        sideBarComponent.zp(ip(), "parent_config", false);
        sideBarComponent.zp(lp("common_event_params"), "common_event_params", false);
        sideBarComponent.zp(lp("section_load_start_timestamp"), "section_load_start_timestamp", false);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void zp(Object obj, String str, boolean z) {
        super.zp(obj, str, z);
        if (Intrinsics.LJFF(str, "revisit_edu_show_guide")) {
            if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                if (Fp() && !this.LLJJJJLIIL && !this.LLJJLIIIJLLLLLLLZ) {
                    this.LLJJLIIIJLLLLLLLZ = true;
                    this.LLJL = 0;
                    HandlerHook.viewPostDelay(getContentView(), new ARunnableS124S0100000_24(this, 134), 200L);
                    return;
                }
                return;
            }
            this.LLJJJJLIIL = false;
            C421650Gg7 c421650Gg7 = this.LLJJL;
            if (c421650Gg7 != null) {
                c421650Gg7.LIZ(null);
            }
            this.LLJJL = null;
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLJL = 0;
        }
    }
}
