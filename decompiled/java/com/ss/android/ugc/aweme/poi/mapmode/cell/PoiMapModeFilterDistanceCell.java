package com.ss.android.ugc.aweme.poi.mapmode.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1174920ggE;
import X.C1189060h32;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeFilterVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiMapModeFilterDistanceCell extends PowerCell<C1174920ggE> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeFilterDistanceCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeFilterDistanceCell.class, "filteVM", "getFilteVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeFilterVM;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeFilterDistanceCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2956);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(211);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2943), awS577S0100000_33, AFwS224S0000000_33.get$arr$(410), new AwS577S0100000_33((C03K6) this, 2933), new AwS577S0100000_33((C03K6) this, 2944), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2947), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2950), null, new AwS577S0100000_33((C03K6) this, 2953));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2929);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2931);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2934);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 115));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2939);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2942);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2945);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2948);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2951);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2954), awS577S0100000_33, AFwS224S0000000_33.get$arr$(409), new AwS577S0100000_33((C03K6) this, 2958), new AwS577S0100000_33((C03K6) this, 2960), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2962), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2964), null, new AwS577S0100000_33((C03K6) this, 2966));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2967), awS577S0100000_33, AFwS224S0000000_33.get$arr$(411), new AwS577S0100000_33((C03K6) this, 2969), new AwS577S0100000_33((C03K6) this, 2971), new AwS577S0100000_33((C03K6) this, 2974), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2976));
        }
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeFilterVM.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 2978);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(210);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2928), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(408), new AwS577S0100000_33((C03K6) this, 2932), new AwS577S0100000_33((C03K6) this, 2935), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2937), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 2940), null, new AwS577S0100000_33((C03K6) this, 2946));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 2949);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2952);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 2955);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj2, awS577S0100000_3311, 116));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 2957);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 2959);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 2961);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 2963);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 2965);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2968), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(412), new AwS577S0100000_33((C03K6) this, 2970), new AwS577S0100000_33((C03K6) this, 2972), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2973), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 2975), null, new AwS577S0100000_33((C03K6) this, 2977));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2927), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(407), new AwS577S0100000_33((C03K6) this, 2930), new AwS577S0100000_33((C03K6) this, 2936), new AwS577S0100000_33((C03K6) this, 2938), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 2941));
        }
        this.LL = assemVMLazy;
    }

    public final PoiMapModeFilterVM I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (PoiMapModeFilterVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.hxn);
        this.LLILLL = (TuxIconView) this.itemView.findViewById(R.id.hxq);
        C1189060h32.LJJIIJ(this.itemView, new AwS597S0100000_18(this, 407));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174920ggE c1174920ggE = (C1174920ggE) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1174920ggE.LLILLJJLI);
        }
        if (c1174920ggE.LLILZ) {
            TuxIconView tuxIconView = this.LLILLL;
            if (tuxIconView != null) {
                C339190DRl.LIZLLL(tuxIconView);
            }
            I5().LL = c1174920ggE.LL;
            I5();
            this.itemView.getTop();
            I5();
            getBindingAdapterPosition();
            return;
        }
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 == null) {
            return;
        }
        C337180DJs.LIZIZ(tuxIconView2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e4v, viewGroup, false);
    }
}
