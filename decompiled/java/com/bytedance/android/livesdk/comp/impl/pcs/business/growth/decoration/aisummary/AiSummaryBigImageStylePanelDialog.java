package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1812500xGa;
import X.AbstractC1812590xGj;
import X.AbstractC1812820xH6;
import X.AbstractC712240Rwk;
import X.C0HQZ;
import X.C0JJO;
import X.C1161920gLG;
import X.C1808500xA8;
import X.C1812230xG9;
import X.C1812520xGc;
import X.C1812540xGe;
import X.C1812630xGn;
import X.C1812670xGr;
import X.C1812850xH9;
import X.C1812880xHC;
import X.C1813080xHW;
import X.C1813280xHq;
import X.C1954807lC;
import X.C20441214yg;
import X.C20632315oP;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C475510Ikn;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC768840UDy;
import X.InterfaceC1180504jb;
import X.InterfaceC1813000xHO;
import X.InterfaceC1813060xHU;
import X.InterfaceC1813270xHp;
import X.InterfaceC440740HQa;
import X.InterfaceC775640Ubi;
import X.ViewOnClickListenerC1836610xtT;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryBigImageStylePanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummaryBigImageStylePanelDialog extends LiveSheetFragment implements InterfaceC1813270xHp<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6, AiSummaryViewModel>, InterfaceC1813000xHO {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0Oio7HELIOSPSd9LCAvJj0yPCwjJ2EyITY5JCIyOjxiCCYAPSghKD0qCiwrACIyLyAfPTY/LRUtJyo/DCwtJSA0";
    public C20632315oP LLJLLL;
    public C1808500xA8 LLJZ;
    public C1812850xH9 LLJZIJLIL;
    public ViewOnClickListenerC1836610xtT LLL;
    public String LLLF;
    public int LLLFF;
    public final C1812230xG9 LLLFFI = new AbstractC712240Rwk() { // from class: X.0xG9
        @Override // X.AbstractC712240Rwk
        public final void onPageSelected(int i) {
            C1808500xA8 c1808500xA8;
            C1812850xH9 c1812850xH9;
            AiSummaryBigImageStylePanelDialog aiSummaryBigImageStylePanelDialog = this.LL;
            int i2 = aiSummaryBigImageStylePanelDialog.LLLFF;
            if (i2 != 3 && i2 != 4 && (c1808500xA8 = aiSummaryBigImageStylePanelDialog.LLJZ) != null && i >= 0 && i < ((ArrayList) c1808500xA8.LLILZ).size() && (c1812850xH9 = (C1812850xH9) ListProtector.get(c1808500xA8.LLILZ, i)) != null) {
                this.LL.uS().vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "show", "", "design_2", "big", i)));
            }
        }
    };

    @Override // X.InterfaceC1813000xHO
    public final String getEntrance() {
        return null;
    }

    public final AiSummaryViewModel uS() {
        return (AiSummaryViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
        int iIntValue;
        C1812670xGr c1812670xGr = (C1812670xGr) interfaceC775640Ubi;
        AbstractC1812590xGj abstractC1812590xGj = c1812670xGr.LIZ;
        int i = C1812630xGn.LIZ[c1812670xGr.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.LLL;
                        if (viewOnClickListenerC1836610xtT != null) {
                            viewOnClickListenerC1836610xtT.LJFF();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LLL;
                if (viewOnClickListenerC1836610xtT2 == null) {
                    return;
                }
                viewOnClickListenerC1836610xtT2.LJI();
                return;
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = this.LLL;
            if (viewOnClickListenerC1836610xtT3 == null) {
                return;
            }
            viewOnClickListenerC1836610xtT3.LJ();
            return;
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT4 = this.LLL;
        if (viewOnClickListenerC1836610xtT4 != null) {
            viewOnClickListenerC1836610xtT4.LIZLLL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render success, item size: ");
        sbLIZ.append(abstractC1812590xGj.LL.size());
        C20441214yg.LIZIZ("AiSummary", C2188811AlT.LIZIZ(sbLIZ));
        C1808500xA8 c1808500xA8 = this.LLJZ;
        if (c1808500xA8 != null) {
            List<C1812850xH9> list = abstractC1812590xGj.LL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateData, itemList size: ");
            sbLIZ2.append(list.size());
            C20441214yg.LIZIZ("AiSummary", C2188811AlT.LIZIZ(sbLIZ2));
            ((ArrayList) c1808500xA8.LLILZ).clear();
            ((ArrayList) c1808500xA8.LLILZ).addAll(list);
            c1808500xA8.notifyDataSetChanged();
        }
        Iterator<C1812850xH9> it2 = abstractC1812590xGj.LL.iterator();
        int i2 = 0;
        while (true) {
            String str = null;
            if (it2.hasNext()) {
                String str2 = it2.next().LIZIZ;
                C1812850xH9 c1812850xH9 = this.LLJZIJLIL;
                if (c1812850xH9 != null) {
                    str = c1812850xH9.LIZIZ;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() >= 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        C20632315oP c20632315oP = this.LLJLLL;
        if (c20632315oP == null) {
            return;
        }
        c20632315oP.LJ(iIntValue, false);
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        DataChannel dataChannelLJ;
        Context context;
        AbstractC1812820xH6 abstractC1812820xH6 = (AbstractC1812820xH6) interfaceC1180504jb;
        if (abstractC1812820xH6.LIZ() && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (context = getContext()) != null) {
            C1812880xHC.LIZJ(abstractC1812820xH6, this, context, dataChannelLJ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        String strValueOf = null;
        C1813080xHW.LJ(null);
        C20632315oP c20632315oP = this.LLJLLL;
        if (c20632315oP != null) {
            c20632315oP.LJI(this.LLLFFI);
        }
        if (i == 999) {
            return;
        }
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this));
        String str = this.LLLF;
        if (str != null) {
            C0JJO c0jjoXf = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf();
            if (jLJJLIIIJ != 0) {
                strValueOf = String.valueOf(jLJJLIIIJ);
            }
            c0jjoXf.LIZJ(str, strValueOf, C475510Ikn.LJ(this), new Bundle(), null);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final String strValueOf = String.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)));
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.grh);
        this.LLL = viewOnClickListenerC1836610xtT;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0xHE
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    AiSummaryViewModel aiSummaryViewModelUS = this.LIZ.uS();
                    EnumC768840UDy enumC768840UDyLIZ = C497700JfU.LIZ.LIZ();
                    AiSummaryBigImageStylePanelDialog aiSummaryBigImageStylePanelDialog = this.LIZ;
                    int i = aiSummaryBigImageStylePanelDialog.LLLFF;
                    String str = strValueOf;
                    String str2 = aiSummaryBigImageStylePanelDialog.LLLF;
                    if (str2 == null) {
                        str2 = "live_capsule";
                    }
                    aiSummaryViewModelUS.vQ2(new C1812520xGc(enumC768840UDyLIZ, i, str, str2, 3));
                }
            });
        }
        ((TextView) view.findViewById(R.id.h3h)).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        this.LLJZ = new C1808500xA8(LifecycleOwnerKt.getLifecycleScope(this), uS(), new C1812540xGe(this));
        final C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.viewPager);
        View view2 = null;
        if (c20632315oP != null) {
            c20632315oP.setAdapter(this.LLJZ);
            C0HQZ c0hqz = new C0HQZ();
            ((ArrayList) c0hqz.LIZ).add(new InterfaceC440740HQa() { // from class: X.0Gd2
                @Override // X.InterfaceC440740HQa
                public final void LIZ(View view3, float f) {
                    float fAbs = Math.abs(f);
                    float f2 = 1;
                    float fMax = Math.max(0.9f, f2 - (0.15f * fAbs));
                    C786410Ut5.Ob(view3, fMax);
                    C786410Ut5.pc(view3, fMax);
                    C786410Ut5.T4(view3, Math.max(0.5f, f2 - (fAbs * 0.5f)));
                    view3.setPivotX(view3.getWidth() / 2.0f);
                    view3.setPivotY(view3.getHeight() / 2.0f);
                }
            });
            c20632315oP.setPageTransformer(c0hqz);
            View childAt = c20632315oP.getChildAt(0);
            if (childAt instanceof RecyclerView) {
                view2 = childAt;
            }
            if (view2 != null) {
                view2.setOverScrollMode(2);
            }
            c20632315oP.setOffscreenPageLimit(2);
            c20632315oP.setOrientation(0);
            c20632315oP.setClipToPadding(false);
            c20632315oP.setClipChildren(false);
            HandlerHook.viewPost(c20632315oP, new Runnable() { // from class: X.06TD
                public final void LIZ() {
                    int width = (int) ((view.getWidth() - (((c20632315oP.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26))) * 0.62288135f)) / 2);
                    c20632315oP.setPadding(width, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), width, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AiSummaryBigImageStylePanelDialog@1554.initViewPager$2$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AiSummaryBigImageStylePanelDialog@1554.initViewPager$2$2");
                }
            });
        } else {
            c20632315oP = null;
        }
        this.LLJLLL = c20632315oP;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(this.LLLFFI);
        }
        View viewFindViewById = view.findViewById(R.id.e1y);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xHH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.LL.close(1);
                }
            }, viewFindViewById);
        }
        C1813280xHq.LIZ(this, uS(), this);
        AiSummaryViewModel aiSummaryViewModelUS = uS();
        EnumC768840UDy enumC768840UDyLIZ = C497700JfU.LIZ.LIZ();
        int i = this.LLLFF;
        String str = this.LLLF;
        if (str == null) {
            str = "live_capsule";
        }
        aiSummaryViewModelUS.vQ2(new C1812520xGc(enumC768840UDyLIZ, i, strValueOf, str, 3));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fy0, viewGroup, false);
    }
}
