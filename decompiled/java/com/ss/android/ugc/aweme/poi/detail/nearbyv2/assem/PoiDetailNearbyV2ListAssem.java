package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.C019F;
import X.C0IDG;
import X.C1176050gi3;
import X.C1189060h32;
import X.C13LE;
import X.C1637806bA;
import X.C1723500ux2;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.cell.PoiNearbyV2NormalCardCell;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.cell.PoiNearbyV2TransportCell;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2ListAssem extends ReusedUIContentAssem<PoiDetailNearbyV2ListAssem> implements InterfaceC712990Rxx<PoiNearbyV2Model> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLJJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2ListAssem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyV2ListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1171), AFwS256S0000000_18.get$arr$(415), null, true);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.r0r);
        this.LLJJJJJIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50001, PoiNearbyV2TransportCell.class), new C1723500ux2(50002, PoiNearbyV2TransportCell.class), new C1723500ux2(50003, PoiNearbyV2NormalCardCell.class));
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0IDG(12));
        }
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gi4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176080gi6) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS302S0000000_18.get$arr$(29), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiNearbyV2Model poiNearbyV2Model) {
        int marginStart;
        Integer numValueOf;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginEnd;
        int marginStart2;
        Integer numValueOf2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int marginEnd2;
        PoiDetailNearbyV2TabAssem.LLJLIL.getClass();
        int i = 0;
        Integer numValueOf3 = null;
        if (C1176050gi3.LIZ(poiNearbyV2Model)) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJJJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    marginStart2 = 0;
                }
                Integer numValueOf4 = Integer.valueOf(marginStart2);
                Integer numValueOf5 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewOnAttachStateChangeListenerC20604515jv2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    } else {
                        marginEnd2 = 0;
                    }
                    numValueOf2 = Integer.valueOf(marginEnd2);
                } else {
                    numValueOf2 = null;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    ViewGroup.LayoutParams layoutParams3 = viewOnAttachStateChangeListenerC20604515jv3.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        i = marginLayoutParams2.bottomMargin;
                    }
                    numValueOf3 = Integer.valueOf(i);
                }
                C1189060h32.LJJII(viewOnAttachStateChangeListenerC20604515jv, numValueOf4, numValueOf5, numValueOf2, numValueOf3);
                return;
            }
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = viewOnAttachStateChangeListenerC20604515jv4.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart();
        } else {
            marginStart = 0;
        }
        Integer numValueOf6 = Integer.valueOf(marginStart);
        Integer numValueOf7 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            ViewGroup.LayoutParams layoutParams5 = viewOnAttachStateChangeListenerC20604515jv5.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            numValueOf = Integer.valueOf(marginEnd);
        } else {
            numValueOf = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
            ViewGroup.LayoutParams layoutParams6 = viewOnAttachStateChangeListenerC20604515jv6.getLayoutParams();
            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                i = marginLayoutParams.bottomMargin;
            }
            numValueOf3 = Integer.valueOf(i);
        }
        C1189060h32.LJJII(viewOnAttachStateChangeListenerC20604515jv4, numValueOf6, numValueOf7, numValueOf, numValueOf3);
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
        up(interfaceC1587906Jp);
    }
}
