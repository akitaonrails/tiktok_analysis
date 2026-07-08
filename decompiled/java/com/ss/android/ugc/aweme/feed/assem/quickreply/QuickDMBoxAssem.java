package com.ss.android.ugc.aweme.feed.assem.quickreply;

import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C425800Gmo;
import X.C426750GoL;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class QuickDMBoxAssem extends BaseCellSlotComponent<QuickDMBoxAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final InterfaceC1731706qJ LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickDMBoxAssem.class, "quickDMViewModel", "getQuickDMViewModel()Lcom/ss/android/ugc/aweme/feed/assem/quickreply/QuickDMViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public QuickDMBoxAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickDMViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 238), null, AFwS243S0000000_11.get$arr$(80));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8o;
    }

    public final QuickDMViewModel Bp() {
        return (QuickDMViewModel) this.LLJLLIL.getValue(this, LLJLLL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        QuickDMViewModel quickDMViewModelBp = Bp();
        subscribe(quickDMViewModelBp, C736820SvI.LIZIZ(quickDMViewModelBp.usedInReusedScene), null, new AwS625S0100000_11(view, 13));
        C425800Gmo c425800Gmo = (C425800Gmo) LJJIJL().findViewById(R.id.g1k);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        Integer numValueOf2 = Integer.valueOf(iLIZIZ);
        ViewGroup.LayoutParams layoutParams = c425800Gmo.getLayoutParams();
        if (numValueOf != null) {
            numValueOf.intValue();
            layoutParams.width = numValueOf.intValue();
        }
        if (numValueOf2 != null) {
            numValueOf2.intValue();
            layoutParams.height = numValueOf2.intValue();
        }
        C786410Ut5.W5(c425800Gmo, layoutParams);
        C426750GoL.LJIIIZ(c425800Gmo, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
        c425800Gmo.setIconRes(R.raw.icon_color_paperplane_circle);
        c425800Gmo.setIconBackgroundSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c425800Gmo.setIconSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
