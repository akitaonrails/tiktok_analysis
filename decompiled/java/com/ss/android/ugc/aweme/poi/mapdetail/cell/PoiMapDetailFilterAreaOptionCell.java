package com.ss.android.ugc.aweme.poi.mapdetail.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1179830go9;
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
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiMapDetailFilterAreaOptionCell extends PowerCell<C1179830go9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailFilterAreaOptionCell.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailAreaFilterVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapDetailFilterAreaOptionCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailAreaFilterVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2915);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(209);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2926), awS577S0100000_33, AFwS224S0000000_33.get$arr$(404), new AwS577S0100000_33((C03K6) this, 2901), new AwS577S0100000_33((C03K6) this, 2903), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2905), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2907), null, new AwS577S0100000_33((C03K6) this, 2908));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2902);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2904);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2906);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 114));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2909);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2910);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2911);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2912);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2913);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2914), awS577S0100000_33, AFwS224S0000000_33.get$arr$(405), new AwS577S0100000_33((C03K6) this, 2916), new AwS577S0100000_33((C03K6) this, 2917), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2918), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2919), null, new AwS577S0100000_33((C03K6) this, 2920));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2921), awS577S0100000_33, AFwS224S0000000_33.get$arr$(406), new AwS577S0100000_33((C03K6) this, 2922), new AwS577S0100000_33((C03K6) this, 2923), new AwS577S0100000_33((C03K6) this, 2924), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2925));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.hxn);
        this.LLILLL = (TuxIconView) this.itemView.findViewById(R.id.hxq);
        C1189060h32.LJJIIJ(this.itemView, new AwS597S0100000_18(this, 400));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1179830go9 c1179830go9 = (C1179830go9) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1179830go9.LLILLJJLI.displayText);
        }
        if (c1179830go9.LLILZ) {
            TuxIconView tuxIconView = this.LLILLL;
            if (tuxIconView != null) {
                C339190DRl.LIZLLL(tuxIconView);
                return;
            }
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
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e4i, viewGroup, false);
    }
}
