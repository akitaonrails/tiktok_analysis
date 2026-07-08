package com.ss.android.ugc.nearby.toolzone;

import X.C1602160rnK;
import X.C1723500ux2;
import X.C2188811AlT;
import X.C415530GRb;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS32S0200000_18;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.nearby.container.model.NearbyTool;
import com.ss.android.ugc.nearby.container.model.NearbyToolZoneModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyToolZoneCellAssem extends ReusedUISlotAssem<NearbyToolZoneCellAssem> implements InterfaceC712990Rxx<NearbyToolZoneModel> {
    public View LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public C415530GRb LLJLIL;
    public boolean LLJLILLLLZIIL = true;
    public AsS32S0200000_18 LLJLL;
    public NearbyToolZoneModel LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dsc;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.y6j);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.y6l);
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50001, NearbyToolDoubleCell.class), new C1723500ux2(50002, NearbyToolTripleCell.class), new C1723500ux2(50003, NearbyToolNormalCell.class));
        this.LLJL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLJLIL = (C415530GRb) view.findViewById(R.id.y6k);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(NearbyToolZoneModel nearbyToolZoneModel) {
        Integer numValueOf;
        Integer numValueOf2;
        LinearLayoutManager linearLayoutManager;
        NearbyToolZoneModel nearbyToolZoneModel2 = nearbyToolZoneModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindItemView hashCode=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", powerListHash=");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            numValueOf = Integer.valueOf(viewOnAttachStateChangeListenerC20604515jv.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" ,item hash=");
        sbLIZ.append(nearbyToolZoneModel2.hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(nearbyToolZoneModel2, this.LLJLLIL)) {
            this.LLJLLIL = nearbyToolZoneModel2;
            List<NearbyTool> list = nearbyToolZoneModel2.tools;
            if (list != null) {
                numValueOf2 = Integer.valueOf(list.size());
            } else {
                numValueOf2 = null;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && numValueOf2 != null && numValueOf2.intValue() >= 2) {
                if (numValueOf2.intValue() <= 4) {
                    final Context context = viewOnAttachStateChangeListenerC20604515jv2.getContext();
                    linearLayoutManager = new LinearLayoutManager(context) { // from class: com.ss.android.ugc.nearby.toolzone.NearbyToolZoneCellAssem$initPowerList$1$1
                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public final boolean canScrollHorizontally() {
                            return false;
                        }
                    };
                } else {
                    linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 0, false);
                }
                viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(linearLayoutManager);
                if (numValueOf2.intValue() == 2) {
                    View view = this.LLJJLIIIJLLLLLLLZ;
                    if (view != null) {
                        view.setBackground(null);
                    }
                } else {
                    View view2 = this.LLJJLIIIJLLLLLLLZ;
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.cpf);
                    }
                }
                if (numValueOf2.intValue() > 4) {
                    C415530GRb c415530GRb = this.LLJLIL;
                    if (c415530GRb != null) {
                        int visibility = c415530GRb.getVisibility();
                        c415530GRb.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c415530GRb);
                    }
                    AsS32S0200000_18 asS32S0200000_18 = new AsS32S0200000_18(this, numValueOf2, 2);
                    this.LLJLL = asS32S0200000_18;
                    viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(asS32S0200000_18);
                } else {
                    C415530GRb c415530GRb2 = this.LLJLIL;
                    if (c415530GRb2 != null) {
                        int visibility2 = c415530GRb2.getVisibility();
                        c415530GRb2.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility2, 8, c415530GRb2);
                    }
                    AsS32S0200000_18 asS32S0200000_182 = this.LLJLL;
                    if (asS32S0200000_182 != null) {
                        viewOnAttachStateChangeListenerC20604515jv2.removeOnScrollListener(asS32S0200000_182);
                    }
                }
                viewOnAttachStateChangeListenerC20604515jv2.getState().LJFF(null);
                viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL(nearbyToolZoneModel2.tools, null);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(NearbyToolZoneModel nearbyToolZoneModel) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(NearbyToolZoneModel nearbyToolZoneModel) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
