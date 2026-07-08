package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C037B;
import X.C03IJ;
import X.C03K6;
import X.C1201930hNn;
import X.C1203730hQh;
import X.C1388190mED;
import X.C13LE;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PopularRegionsCell extends PowerCell<C037B> implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public LinearLayout LL;
    public final List<TuxTextView> LLILLJJLI = new ArrayList();
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PopularRegionsCell.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PopularRegionsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3723);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(256);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3734), awS577S0100000_33, AFwS224S0000000_33.get$arr$(527), new AwS577S0100000_33((C03K6) this, 3709), new AwS577S0100000_33((C03K6) this, 3711), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3713), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3715), null, new AwS577S0100000_33((C03K6) this, 3716));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3710);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3712);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3714);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 145));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3717);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3718);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3719);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3720);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3721);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3722), awS577S0100000_33, AFwS224S0000000_33.get$arr$(525), new AwS577S0100000_33((C03K6) this, 3724), new AwS577S0100000_33((C03K6) this, 3725), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3726), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3727), null, new AwS577S0100000_33((C03K6) this, 3728));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3729), awS577S0100000_33, AFwS224S0000000_33.get$arr$(526), new AwS577S0100000_33((C03K6) this, 3730), new AwS577S0100000_33((C03K6) this, 3731), new AwS577S0100000_33((C03K6) this, 3732), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3733));
        }
        this.LLILLL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (LinearLayout) this.itemView.findViewById(R.id.ngi);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C037B c037b = (C037B) interfaceC1891350zJl;
        super.onBindItemView(c037b);
        if (!c037b.LL.isEmpty()) {
            int i = 0;
            for (LocationRegion locationRegion : c037b.LL) {
                int i2 = i + 1;
                LinearLayout linearLayout = null;
                if (i >= 0) {
                    LocationRegion locationRegion2 = locationRegion;
                    if (i >= ((ArrayList) this.LLILLJJLI).size()) {
                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.itemView.getContext());
                        LinearLayout linearLayout2 = this.LL;
                        if (linearLayout2 == null) {
                            linearLayout2 = null;
                        }
                        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.dsi, linearLayout2, false);
                        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.xfk);
                        TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.xfn);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                        tuxTextView.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
                        tuxTextView.setTag(Integer.valueOf(i));
                        C786410Ut5.h9(tuxTextView, this);
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                        tuxTextView2.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
                        tuxTextView2.setTag(Integer.valueOf(i2));
                        C786410Ut5.h9(tuxTextView2, this);
                        ((ArrayList) this.LLILLJJLI).add(tuxTextView);
                        ((ArrayList) this.LLILLJJLI).add(tuxTextView2);
                        LinearLayout linearLayout3 = this.LL;
                        if (linearLayout3 == null) {
                            linearLayout3 = null;
                        } else {
                            linearLayout = linearLayout3;
                        }
                        linearLayout3.addView(viewTd, linearLayout.getChildCount() - 1);
                    }
                    TuxTextView tuxTextView3 = (TuxTextView) ListProtector.get(this.LLILLJJLI, i);
                    tuxTextView3.setText(locationRegion2.getName());
                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<LocationRegion> list;
        String str;
        if (view == null) {
            return;
        }
        int iIntValue = ((Integer) view.getTag()).intValue();
        C037B item = getItem();
        if (item != null && (list = item.LL) != null) {
            LocationRegion locationRegion = (LocationRegion) ListProtector.get(list, iIntValue);
            if (C1388190mED.LIZIZ(this.itemView.getContext()) != null) {
                C1203730hQh.LIZ.getClass();
                RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
                C1201930hNn c1201930hNn = C1201930hNn.LIZ;
                String name = locationRegion.getName();
                if (roamingLocationInfoLIZ != null) {
                    str = roamingLocationInfoLIZ.manualRegionName;
                } else {
                    str = null;
                }
                c1201930hNn.getClass();
                C1201930hNn.LIZ("popular_region", name, str);
            }
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
            assemVMLazy.getValue().setState(new AwS105S0110000_18(locationRegion, false, 0));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dsj, viewGroup, false);
    }
}
