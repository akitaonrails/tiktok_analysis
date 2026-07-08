package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1201730hNT;
import X.C1201840hNe;
import X.C1201930hNn;
import X.C1203730hQh;
import X.C123100dR;
import X.C1388190mED;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
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
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class NearbyRegionCell extends PowerCell<C1201840hNe> implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyRegionCell.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NearbyRegionCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3697);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(255);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3708), awS577S0100000_33, AFwS224S0000000_33.get$arr$(524), new AwS577S0100000_33((C03K6) this, 3683), new AwS577S0100000_33((C03K6) this, 3685), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3687), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3689), null, new AwS577S0100000_33((C03K6) this, 3690));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3684);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3686);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3688);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 144));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3691);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3692);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3693);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3694);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3695);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3696), awS577S0100000_33, AFwS224S0000000_33.get$arr$(522), new AwS577S0100000_33((C03K6) this, 3698), new AwS577S0100000_33((C03K6) this, 3699), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3700), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3701), null, new AwS577S0100000_33((C03K6) this, 3702));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3703), awS577S0100000_33, AFwS224S0000000_33.get$arr$(523), new AwS577S0100000_33((C03K6) this, 3704), new AwS577S0100000_33((C03K6) this, 3705), new AwS577S0100000_33((C03K6) this, 3706), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3707));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1201840hNe c1201840hNe = (C1201840hNe) interfaceC1891350zJl;
        super.onBindItemView(c1201840hNe);
        TuxTextView tuxTextView = null;
        if (C123100dR.LIZ(c1201840hNe.LL.getParentName())) {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(c1201840hNe.LL.getParentName());
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
        } else {
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
        }
        TuxTextView tuxTextView5 = this.LLILLJJLI;
        if (tuxTextView5 != null) {
            tuxTextView = tuxTextView5;
        }
        tuxTextView.setText(c1201840hNe.LL.getName());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        C1201840hNe item = getItem();
        if (item == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        String str3 = ((C1201730hNT) assemVMLazy.getValue().getState()).LL;
        if (str3 != null && str3.length() != 0) {
            str = "search_region";
        } else {
            str = "all_regions";
        }
        if (C1388190mED.LIZIZ(this.itemView.getContext()) != null) {
            C1203730hQh.LIZ.getClass();
            RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
            C1201930hNn c1201930hNn = C1201930hNn.LIZ;
            String name = item.LL.getName();
            if (roamingLocationInfoLIZ != null) {
                str2 = roamingLocationInfoLIZ.manualRegionName;
            } else {
                str2 = null;
            }
            c1201930hNn.getClass();
            C1201930hNn.LIZ(str, name, str2);
        }
        this.LL.getValue().setState(new AwS105S0110000_18(item.LL, false, 0));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dsf, viewGroup, false);
        C786410Ut5.I7(this, viewTd);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.zsz);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.zt0);
        return viewTd;
    }
}
