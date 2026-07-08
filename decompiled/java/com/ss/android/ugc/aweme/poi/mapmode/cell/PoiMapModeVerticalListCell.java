package com.ss.android.ugc.aweme.poi.mapmode.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1174410gfP;
import X.C1179120gn0;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1189060h32;
import X.C1189360h3W;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2441009hQ;
import X.C296700Bk4;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C497820Jfg;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeVerticalListCell extends PowerCell<C1174410gfP> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LL;
    public View LLILLJJLI;
    public SmartImageView LLILLL;
    public C1179120gn0 LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public String LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeVerticalListCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapModeVerticalListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1614);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(519);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1599), awS562S0100000_18, AFwS206S0000000_18.get$arr$(404), new AwS562S0100000_18((C03K6) this, 1600), new AwS562S0100000_18((C03K6) this, 1602), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1604), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1606), null, new AwS562S0100000_18((C03K6) this, 1607));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1601);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1603);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1605);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 82));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1608);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1609);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1610);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1611);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1612);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1613), awS562S0100000_18, AFwS206S0000000_18.get$arr$(405), new AwS562S0100000_18((C03K6) this, 1615), new AwS562S0100000_18((C03K6) this, 1616), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1617), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1618), null, new AwS562S0100000_18((C03K6) this, 1619));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1620), awS562S0100000_18, AFwS206S0000000_18.get$arr$(406), new AwS562S0100000_18((C03K6) this, 1621), new AwS562S0100000_18((C03K6) this, 1622), new AwS562S0100000_18((C03K6) this, 1623), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1598));
        }
        this.LL = assemVMLazy;
    }

    public final PoiMapModePageVM I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = this.itemView.findViewById(R.id.msz);
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.f58);
        this.LLILZ = (C1179120gn0) this.itemView.findViewById(R.id.df4);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.fyj);
        this.LLILZLL = this.itemView.findViewById(R.id.eux);
        this.LLIZ = this.itemView.findViewById(R.id.ve0);
        View view = this.LLILLJJLI;
        if (view != null) {
            C1189060h32.LJJIIJ(view, new AwS597S0100000_18(this, 414));
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 415));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e54, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String str;
        String str2;
        int iIntValue;
        C1174410gfP c1174410gfP = (C1174410gfP) interfaceC1891350zJl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("list_view onBindItemView  index: ");
        sbLIZ.append(getBindingAdapterPosition());
        sbLIZ.append(" hashcode: ");
        sbLIZ.append(this.itemView.hashCode());
        sbLIZ.append(" poiId: ");
        PoiDiscoveryCard poiDiscoveryCard = c1174410gfP.LL;
        if (poiDiscoveryCard != null) {
            str = poiDiscoveryCard.poiId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("  poiName: ");
        PoiDiscoveryCard poiDiscoveryCard2 = c1174410gfP.LL;
        if (poiDiscoveryCard2 != null) {
            str2 = poiDiscoveryCard2.poiName;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1174410gfP.LLILLJJLI) {
            View view = this.LLIZ;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
            View view2 = this.LLILZLL;
            if (view2 != null) {
                C339190DRl.LIZIZ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLIZ;
        if (view3 != null) {
            C339190DRl.LIZIZ(view3);
        }
        View view4 = this.LLILZLL;
        if (view4 != null) {
            C339190DRl.LIZLLL(view4);
        }
        PoiDiscoveryCard poiDiscoveryCard3 = c1174410gfP.LL;
        if (poiDiscoveryCard3 == null) {
            return;
        }
        String str3 = poiDiscoveryCard3.poiHeaderImg;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (!Intrinsics.LJFF(this.LLIZLLLIL, str3)) {
            this.LLIZLLLIL = str3;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, this.itemView.getContext());
            if (numLIZJ != null) {
                int iIntValue2 = numLIZJ.intValue();
                C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_map_mode", "poi_map_mode_card_list_img", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null)).LIZIZ(str3);
                if (!C296700Bk4.LIZ()) {
                    c1189360h3WLIZIZ.LIZ.LJIJJ = new ColorDrawable(iIntValue2);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ei);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
                    c1189360h3WLIZIZ.LJFF(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext())));
                }
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C418440Gaw.LIZIZ(12);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, this.itemView.getContext());
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = 0;
                }
                int iLJIIL = C2441009hQ.LJIIL(iIntValue, 30);
                float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
                c1331750klB.LIZJ = iLJIIL;
                c1331750klB.LIZIZ = fLIZIZ;
                c1189360h3WLIZIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
                c1189360h3WLIZIZ.LIZLLL(this.LLILLL);
                c1189360h3WLIZIZ.LIZIZ();
            }
        }
        int iLIZIZ = (((C497820Jfg.LIZIZ(this.itemView.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
        C1179120gn0 c1179120gn0 = this.LLILZ;
        if (c1179120gn0 != null) {
            c1179120gn0.LJII(poiDiscoveryCard3, true, iLIZIZ, new AwS419S0200000_18(this, poiDiscoveryCard3, 141));
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView == null) {
            return;
        }
        if (C123100dR.LIZ(poiDiscoveryCard3.poiDistanceFromCenter)) {
            str4 = poiDiscoveryCard3.poiDistanceFromCenter;
        } else {
            String str5 = poiDiscoveryCard3.formattedAddress;
            if (str5 != null) {
                str4 = str5;
            }
        }
        tuxTextView.setText(str4);
    }
}
