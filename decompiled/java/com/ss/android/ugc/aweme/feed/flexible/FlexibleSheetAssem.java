package com.ss.android.ugc.aweme.feed.flexible;

import X.C019F;
import X.C01GW;
import X.C09RD;
import X.C09RE;
import X.C0S4J;
import X.C1066370dr9;
import X.C13LE;
import X.C1558520qew;
import X.C1594190raT;
import X.C1594210raV;
import X.C1637806bA;
import X.C19719912Dl;
import X.C21658219pU;
import X.C21659719pj;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C418830GbZ;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1995507rl;
import X.InterfaceC21658919pb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.flexible.ui.FlexibleBottomSheetBehavior;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FlexibleSheetAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public View LLIZLLLIL;
    public RadiusLayout LLJ;
    public C418830GbZ LLJI;
    public C1066370dr9 LLJIJIL;
    public final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
    public final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    public FrameLayout LLJILLL;
    public View LLJJ;
    public FlexibleBottomSheetBehavior LLJJI;
    public final AssemVMLazy LLJJIII;
    public InterfaceC21658919pb LLJJIJI;
    public int LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public C21658219pU LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C21659719pj LLJLLIL;
    public InterfaceC420801kM LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FlexibleSheetAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/feed/flexible/FlexiblePanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        new C0S4J("flexible_root");
    }

    public FlexibleSheetAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FlexiblePanelVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS574S0100000_30(c19719912DlLIZ, 58), AFwS274S0000000_30.get$arr$(60), null, true);
        this.LLJJIJIL = 0.9f;
        this.LLJJJ = 0.9f;
        this.LLJL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(302));
        this.LLJLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 57));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 56));
        this.LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2184));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void Go() {
        C1066370dr9 c1066370dr9;
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            return;
        }
        C21659719pj c21659719pj = this.LLJLLIL;
        boolean z = !((c21659719pj == null || c21659719pj.needShowGrabber) ? false : true);
        if (!((c21659719pj != null ? c21659719pj.grabberBackgroundMode : null) == EnumC1995507rl.IMMERSIVE_BACKGROUND)) {
            if (z) {
                C786410Ut5.fd(frameLayout, this.LLJILJIL);
                return;
            } else {
                C786410Ut5.fd(frameLayout, 0.0f);
                return;
            }
        }
        C786410Ut5.fd(frameLayout, 0.0f);
        if (!z || (c1066370dr9 = this.LLJIJIL) == null) {
            return;
        }
        c1066370dr9.bringToFront();
    }

    public final float Ho() {
        C21659719pj c21659719pj = this.LLJLLIL;
        if ((c21659719pj == null || c21659719pj.needShowGrabber) ? false : true) {
            return 0.0f;
        }
        if ((c21659719pj != null ? c21659719pj.grabberBackgroundMode : null) != EnumC1995507rl.IMMERSIVE_BACKGROUND) {
            return this.LLJILJIL;
        }
        return 0.0f;
    }

    public final FlexiblePanelVM No() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (FlexiblePanelVM) assemVMLazy.getValue();
    }

    public final C1594210raV Lo() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        return C1594190raT.LIZIZ(C724240Sb0.LJI(this), fragmentLJI != null ? fragmentLJI.getActivity() : null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC420801kM interfaceC420801kM = this.LLJLLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public static View Jo(View view) {
        View viewJo;
        if (view == null || !(view instanceof ViewGroup)) {
            return null;
        }
        Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
        do {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                return null;
            }
            View view2 = (View) c09re.next();
            if (view2.getFitsSystemWindows()) {
                return view2;
            }
            viewJo = Jo(view2);
        } while (viewJo == null);
        return viewJo;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(final android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.flexible.FlexibleSheetAssem.onViewCreated(android.view.View):void");
    }
}
