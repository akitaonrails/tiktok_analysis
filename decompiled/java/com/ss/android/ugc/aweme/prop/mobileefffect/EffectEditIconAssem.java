package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C019F;
import X.C01GW;
import X.C1322110kVd;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1776190wK1;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C420320Gdy;
import X.C426750GoL;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1737230vJB;
import X.EnumC429230GsL;
import X.InterfaceC1737080vIw;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectEditIconAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public C1322110kVd LLJJIJI;
    public View LLJJIJIIJIL;
    public final List<View> LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectEditIconAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/mobileefffect/EffectEditVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectEditIconAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectEditVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 848), AFwS268S0000000_26.get$arr$(444), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(242));
    }

    public final MobileEffectData hp() {
        return (MobileEffectData) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        int i = C420320Gdy.LIZ[hp().iconViewType.ordinal()];
        if (i == 1) {
            return R.layout.ftz;
        }
        if (i == 2) {
            return R.layout.fty;
        }
        throw new C1954807lC();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC1737080vIw interfaceC1737080vIw;
        super.onViewCreated(view);
        int i = C420320Gdy.LIZ[hp().iconViewType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LLJJIJI = (C1322110kVd) view.findViewById(R.id.gx9);
                View viewFindViewById = view.findViewById(R.id.gvh);
                this.LLJJIJIIJIL = viewFindViewById;
                List<View> list = this.LLJJIJIL;
                if (viewFindViewById == null) {
                    viewFindViewById = null;
                }
                ((ArrayList) list).add(viewFindViewById);
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LLJJIJI = (C1322110kVd) view.findViewById(R.id.gx9);
            Context context = getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_plus_small;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                c419910GdJ.LJ = Integer.valueOf(R.attr.e3);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                if (layerDrawableLJIILIIL != null) {
                    C1322110kVd c1322110kVd = this.LLJJIJI;
                    if (c1322110kVd == null) {
                        c1322110kVd = null;
                    }
                    c1322110kVd.setImageDrawable(layerDrawableLJIILIIL);
                }
            }
            this.LLJJIJIIJIL = view.findViewById(R.id.gvh);
            List<View> list2 = this.LLJJIJIL;
            C1322110kVd c1322110kVd2 = this.LLJJIJI;
            if (c1322110kVd2 == null) {
                c1322110kVd2 = null;
            }
            ((ArrayList) list2).add(c1322110kVd2);
            List<View> list3 = this.LLJJIJIL;
            View view2 = this.LLJJIJIIJIL;
            if (view2 == null) {
                view2 = null;
            }
            ((ArrayList) list3).add(view2);
        }
        if (hp().iconViewType == EnumC429230GsL.EFFECT_IMG_CREATOR) {
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
            C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vHB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1736830vIX) obj).LLILZLL;
                }
            }, new C2217381BqS() { // from class: X.0vHO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1736830vIX) obj).LLILZIL;
                }
            }, null, new AwS675S0100000_26(this, 8), 12);
        } else {
            AssemVMLazy assemVMLazy2 = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJJIL;
            AssemViewModel value = assemVMLazy2.getValue();
            selectSubscribe(value, new C2217381BqS() { // from class: X.0vHA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1736830vIX) obj).LLILZLL;
                }
            }, new C2217381BqS() { // from class: X.0vHM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1736830vIX) obj).LLILZ;
                }
            }, new C2217381BqS() { // from class: X.0vHN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1736830vIX) obj).LLILZIL;
                }
            }, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C1776190wK1(this, 4));
        }
        Iterator it2 = ((ArrayList) this.LLJJIJIL).iterator();
        while (it2.hasNext()) {
            C786410Ut5.I7(new ACListenerS160S0100000_26(this, 36), (View) it2.next());
        }
        if (hp().iconViewType == EnumC429230GsL.EFFECT_IMG_CREATOR) {
            InterfaceC1737080vIw interfaceC1737080vIw2 = (InterfaceC1737080vIw) this.LLJJJ.getValue();
            if ((interfaceC1737080vIw2 == null || interfaceC1737080vIw2.LJIIL(EnumC1737230vJB.ICON_EDIT) == null) && (interfaceC1737080vIw = (InterfaceC1737080vIw) this.LLJJJ.getValue()) != null) {
                interfaceC1737080vIw.LJFF(EnumC1737230vJB.ICON_EDIT);
            }
        }
    }
}
