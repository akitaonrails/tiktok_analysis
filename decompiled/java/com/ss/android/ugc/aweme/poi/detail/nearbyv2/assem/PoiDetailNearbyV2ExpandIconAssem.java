package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2ExpandIconAssem extends ReusedUIContentAssem<PoiDetailNearbyV2ExpandIconAssem> implements InterfaceC712990Rxx<PoiNearbyV2Model> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public View LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public PoiNearbyV2Model LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2ExpandIconAssem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyV2ExpandIconAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1170), AFwS256S0000000_18.get$arr$(414), null, true);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJ = view.findViewById(R.id.r0q);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZ = R.raw.icon_chevron_expand_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(view.getContext()));
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            view2.setBackground(layerDrawableLJIILIIL);
        }
        View view3 = this.LLJJJJ;
        if (view3 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 36), view3);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiNearbyV2Model poiNearbyV2Model) {
        this.LLJJJJLIIL = poiNearbyV2Model;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(PoiNearbyV2Model poiNearbyV2Model) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(PoiNearbyV2Model poiNearbyV2Model) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        this.LLJJJJLIIL = (PoiNearbyV2Model) interfaceC1587906Jp;
    }
}
