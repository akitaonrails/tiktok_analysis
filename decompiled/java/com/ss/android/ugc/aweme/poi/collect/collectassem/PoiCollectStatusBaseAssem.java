package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C019F;
import X.C01GW;
import X.C0XPD;
import X.C1184350gvR;
import X.C1184530gvj;
import X.C1188450h23;
import X.C1208950hZ7;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C622680Oba;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C848230XPh;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import Y.ATListenerS451S0100000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS7S3100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiCollectStatusBaseAssem extends PoiDetailBaseUiSlotComponent<Object> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public View LLJJIJI;
    public final boolean LLJJIJIIJIL = true;
    public final boolean LLJJIJIL = true;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public final C1559260qg8 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCollectStatusBaseAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/collect/PoiCollectStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCollectStatusBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectStatusViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 905), AFwS256S0000000_18.get$arr$(289), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 904));
        this.LLJJJJ = new C1559260qg8(new C723590SZx(this, C1184530gvj.class, "PoiCollectHierarchyData"), checkSupervisorPrepared());
    }

    public abstract void Ep(boolean z);

    public final void Fp() {
        View view;
        if (this.LLJJIJIIJIL) {
            Object parent = zp().getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null || Float.valueOf(view.getAlpha()).floatValue() > 0.01d) {
                Gp();
                if (!C848230XPh.LL.LJI()) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    C0XPD.LIZJ(fragmentLJI, "poi_detail", "", null, new C1208950hZ7(this, fragmentLJI, 1));
                    return;
                }
                C1184350gvR c1184350gvRSp = sp();
                String str = c1184350gvRSp.LIZ;
                if (str == null) {
                    return;
                }
                Ip(str);
                Bp().vQ2(str, new AwS7S3100000_18(str, c1184350gvRSp.LIZIZ, c1184350gvRSp.LIZJ, this, 2), null);
            }
        }
    }

    public void Gp() {
    }

    public abstract void Jp(boolean z);

    public HashMap<String, String> Yg1() {
        return null;
    }

    public abstract View zp();

    private final PageFinder yp() {
        return (PageFinder) this.LLJJJIL.getValue();
    }

    public final C1184530gvj Ap() {
        return (C1184530gvj) this.LLJJJJ.getValue();
    }

    public final PoiCollectStatusViewModel Bp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiCollectStatusViewModel) assemVMLazy.getValue();
    }

    public final View tp() {
        View view = this.LLJJIJI;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    public C1184350gvR sp() {
        Boolean boolLIZIZ;
        String str = Ap().LL;
        return new C1184350gvR(Ap().LL, Ap().LLILZ, Ap().LLILZIL, (str == null || (boolLIZIZ = C1188450h23.LIZIZ(str)) == null) ? Ap().LLILLJJLI : boolLIZIZ.booleanValue());
    }

    public boolean up() {
        return this.LLJJIJIL;
    }

    public final void Ip(String str) {
        Jp(Intrinsics.LJFF(C1188450h23.LIZIZ(str), Boolean.TRUE));
        Ep(!Bp().getState().LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCollectedStatusChange(X.C614900O9w r22) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem.onCollectedStatusChange(X.0O9w):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = view;
        zp().setOnTouchListener(new ATListenerS451S0100000_18(this, 5));
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 45), zp());
        C1184350gvR c1184350gvRSp = sp();
        Jp(c1184350gvRSp.LIZLLL);
        Bp().setState(new AwS32S0010000_18(c1184350gvRSp.LIZLLL, 5));
    }
}
