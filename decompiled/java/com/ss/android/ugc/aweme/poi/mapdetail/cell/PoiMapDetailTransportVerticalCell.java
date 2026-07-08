package com.ss.android.ugc.aweme.poi.mapdetail.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1175120ggY;
import X.C1175830ghh;
import X.C1180070goX;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C698190Ra5;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1334360kpO;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.cells.AddressInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailTransportVerticalCell extends PowerCell<C1175830ghh> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public SmartImageView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailTransportVerticalCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e4l;
    }

    public PoiMapDetailTransportVerticalCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1428);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(493);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1439), awS562S0100000_18, AFwS206S0000000_18.get$arr$(381), new AwS562S0100000_18((C03K6) this, 1414), new AwS562S0100000_18((C03K6) this, 1416), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1418), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1420), null, new AwS562S0100000_18((C03K6) this, 1421));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1415);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1417);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1419);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 75));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1422);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1423);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1424);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1425);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1426);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1427), awS562S0100000_18, AFwS206S0000000_18.get$arr$(379), new AwS562S0100000_18((C03K6) this, 1429), new AwS562S0100000_18((C03K6) this, 1430), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1431), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1432), null, new AwS562S0100000_18((C03K6) this, 1433));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1434), awS562S0100000_18, AFwS206S0000000_18.get$arr$(380), new AwS562S0100000_18((C03K6) this, 1435), new AwS562S0100000_18((C03K6) this, 1436), new AwS562S0100000_18((C03K6) this, 1437), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1438));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.r4h);
        this.itemView.findViewById(R.id.r4g);
        this.LLILLL = (TuxIconView) this.itemView.findViewById(R.id.r4f);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.r4e);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.r4k);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.r4j);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 37));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String coverImg;
        AddressInfo addressInfo;
        DynamicIcon dynamicIcon;
        C698190Ra5 dynamicToken;
        TuxIconView tuxIconView;
        AddressInfo addressInfo2;
        String str;
        String poiName;
        Context context;
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        C1175830ghh c1175830ghh = (C1175830ghh) interfaceC1891350zJl;
        super.onBindItemView(c1175830ghh);
        String categoryName = null;
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_map_detail_transport_cover", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_13_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8))), null));
        PoiGeneralCard poiGeneralCard = c1175830ghh.LL;
        if (poiGeneralCard != null) {
            coverImg = poiGeneralCard.getCoverImg();
        } else {
            coverImg = null;
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZJ(coverImg));
        c1189360h3WLIZ.LIZ.LJJIJL(this.itemView.getContext());
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null && (context = smartImageView.getContext()) != null) {
            SmartImageView smartImageView2 = this.LLILLJJLI;
            if (smartImageView2 != null && (layoutParams4 = smartImageView2.getLayoutParams()) != null) {
                numValueOf = Integer.valueOf(layoutParams4.width);
            } else {
                numValueOf = null;
            }
            int iLIZJ = C1175120ggY.LIZJ(numValueOf);
            SmartImageView smartImageView3 = this.LLILLJJLI;
            if (smartImageView3 != null && (layoutParams3 = smartImageView3.getLayoutParams()) != null) {
                numValueOf2 = Integer.valueOf(layoutParams3.height);
            } else {
                numValueOf2 = null;
            }
            C1180070goX.LIZ(c1189360h3WLIZ, context, iLIZJ, C1175120ggY.LIZJ(numValueOf2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
            SmartImageView smartImageView4 = this.LLILLJJLI;
            int i2 = 0;
            if (smartImageView4 != null && (layoutParams2 = smartImageView4.getLayoutParams()) != null) {
                i = layoutParams2.width;
            } else {
                i = 0;
            }
            SmartImageView smartImageView5 = this.LLILLJJLI;
            if (smartImageView5 != null && (layoutParams = smartImageView5.getLayoutParams()) != null) {
                i2 = layoutParams.height;
            }
            c1189360h3WLIZ.LJI(i, i2);
            c1189360h3WLIZ.LIZ.LJJIII = EnumC1334360kpO.HIGH;
            c1189360h3WLIZ.LIZLLL(this.LLILLJJLI);
            c1189360h3WLIZ.LIZIZ();
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            PoiGeneralCard poiGeneralCard2 = c1175830ghh.LL;
            if (poiGeneralCard2 != null) {
                poiName = poiGeneralCard2.getPoiName();
            } else {
                poiName = null;
            }
            tuxTextView.setText(poiName);
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            PoiGeneralCard poiGeneralCard3 = c1175830ghh.LL;
            if (poiGeneralCard3 != null) {
                categoryName = poiGeneralCard3.getCategoryName();
            }
            tuxTextView2.setText(categoryName);
        }
        PoiGeneralCard poiGeneralCard4 = c1175830ghh.LL;
        if (poiGeneralCard4 != null && (addressInfo2 = poiGeneralCard4.getAddressInfo()) != null && (str = addressInfo2.distanceContent) != null) {
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(str);
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                C337180DJs.LIZJ(tuxTextView4);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                C786410Ut5.LJLLLLLL(4, tuxTextView5);
            }
        }
        PoiGeneralCard poiGeneralCard5 = c1175830ghh.LL;
        if (poiGeneralCard5 != null && (addressInfo = poiGeneralCard5.getAddressInfo()) != null && (dynamicIcon = addressInfo.distanceIcon) != null && (dynamicToken = dynamicIcon.parseDynamicToken(this.itemView.getContext())) != null && (tuxIconView = this.LLILLL) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = dynamicToken.LIZ;
            c419910GdJ.LIZLLL = dynamicToken.LIZIZ;
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }
}
