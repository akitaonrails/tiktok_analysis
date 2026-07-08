package com.ss.android.ugc.aweme.poi.mapmode.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1174430gfR;
import X.C1174730gfv;
import X.C1177230gjx;
import X.C1179120gn0;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1206904nr;
import X.C123100dR;
import X.C1247530iZL;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1367960lha;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
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
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS2S4400000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeHorizontalCardCell extends PowerCell<C1174430gfR> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LL;
    public View LLILLJJLI;
    public SmartImageView LLILLL;
    public C1179120gn0 LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeHorizontalCardCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    public PoiMapModeHorizontalCardCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1485);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(514);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1469), awS562S0100000_18, AFwS206S0000000_18.get$arr$(389), new AwS562S0100000_18((C03K6) this, 1471), new AwS562S0100000_18((C03K6) this, 1473), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1475), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1477), null, new AwS562S0100000_18((C03K6) this, 1478));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1472);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1474);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1476);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 77));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1479);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1480);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1481);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1482);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1483);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1484), awS562S0100000_18, AFwS206S0000000_18.get$arr$(390), new AwS562S0100000_18((C03K6) this, 1486), new AwS562S0100000_18((C03K6) this, 1487), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1488), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1489), null, new AwS562S0100000_18((C03K6) this, 1490));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1491), awS562S0100000_18, AFwS206S0000000_18.get$arr$(391), new AwS562S0100000_18((C03K6) this, 1492), new AwS562S0100000_18((C03K6) this, 1493), new AwS562S0100000_18((C03K6) this, 1467), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1468));
        }
        this.LL = assemVMLazy;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1470));
    }

    public final HashMap<String, String> L5() {
        PoiDiscoveryCard poiDiscoveryCard;
        PoiDiscoveryCard poiDiscoveryCard2;
        HashMap<String, String> map = new HashMap<>();
        C1189060h32.LJJ("enter_from", "map_mode", map);
        C1174430gfR item = getItem();
        String str = null;
        C1189060h32.LJJ("target_poi_id", (item == null || (poiDiscoveryCard2 = item.LL) == null) ? null : poiDiscoveryCard2.poiId, map);
        C1174430gfR item2 = getItem();
        if (item2 != null && (poiDiscoveryCard = item2.LL) != null) {
            str = poiDiscoveryCard.collectInfo;
        }
        C1189060h32.LIZLLL(str, map);
        return map;
    }

    public final PageFinder N5() {
        return (PageFinder) this.LLJILJIL.getValue();
    }

    public final PoiMapModePageVM P5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    public final PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility I5() {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            return (PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility.class, null);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = this.itemView.findViewById(R.id.msz);
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.f58);
        this.LLILZ = (C1179120gn0) this.itemView.findViewById(R.id.df4);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.fyj);
        this.LLILZLL = this.itemView.findViewById(R.id.hpr);
        this.LLIZ = (TuxIconView) this.itemView.findViewById(R.id.hpt);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.hpu);
        this.LLJ = this.itemView.findViewById(R.id.tsz);
        this.itemView.findViewById(R.id.tt1);
        this.itemView.findViewById(R.id.tt2);
        this.LLJI = this.itemView.findViewById(R.id.eux);
        this.LLJIJIL = this.itemView.findViewById(R.id.ve0);
        View view = this.LLILLJJLI;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C1189060h32.LJJIIJ(view2, new AwS597S0100000_18(this, 409));
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            C1189060h32.LJJIIJ(view3, new AwS597S0100000_18(this, 410));
        }
        View view4 = this.LLJ;
        if (view4 != null) {
            C1189060h32.LJJIIJ(view4, new AwS597S0100000_18(this, 411));
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 412));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        C1174430gfR c1174430gfR = (C1174430gfR) interfaceC1891350zJl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("card_view onBindItemView  index: ");
        sbLIZ.append(getBindingAdapterPosition());
        sbLIZ.append("  poiId: ");
        PoiDiscoveryCard poiDiscoveryCard = c1174430gfR.LL;
        String string = null;
        if (poiDiscoveryCard != null) {
            str = poiDiscoveryCard.poiId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("  poiName: ");
        PoiDiscoveryCard poiDiscoveryCard2 = c1174430gfR.LL;
        if (poiDiscoveryCard2 != null) {
            str2 = poiDiscoveryCard2.poiName;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1174430gfR.LLILLJJLI) {
            View view = this.LLJIJIL;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
            View view2 = this.LLJI;
            if (view2 != null) {
                C339190DRl.LIZIZ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            C339190DRl.LIZIZ(view3);
        }
        View view4 = this.LLJI;
        if (view4 != null) {
            C339190DRl.LIZLLL(view4);
        }
        PoiDiscoveryCard poiDiscoveryCard3 = c1174430gfR.LL;
        if (poiDiscoveryCard3 == null) {
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, this.itemView.getContext());
        String str3 = "";
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C1180600gpO c1180600gpO = new C1180600gpO("poi_map_mode", "poi_map_mode_card_list_img", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
            String str4 = poiDiscoveryCard3.poiHeaderImg;
            if (str4 == null) {
                str4 = "";
            }
            C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(str4);
            if (!C296700Bk4.LIZ()) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a0x);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
                c1189360h3WLIZIZ.LJFF(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext())));
            }
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(12);
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = fLIZIZ;
            c1189360h3WLIZIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
            c1189360h3WLIZIZ.LIZLLL(this.LLILLL);
            c1189360h3WLIZIZ.LIZIZ();
        }
        int iLIZIZ = (((((C497820Jfg.LIZIZ(this.itemView.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
        C1179120gn0 c1179120gn0 = this.LLILZ;
        if (c1179120gn0 != null) {
            c1179120gn0.LJII(poiDiscoveryCard3, false, iLIZIZ, null);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            if (C123100dR.LIZ(poiDiscoveryCard3.poiDistanceFromCenter)) {
                str3 = poiDiscoveryCard3.poiDistanceFromCenter;
            } else {
                String str5 = poiDiscoveryCard3.formattedAddress;
                if (str5 != null) {
                    str3 = str5;
                }
            }
            tuxTextView.setText(str3);
        }
        if (Intrinsics.LJFF(poiDiscoveryCard3.isCollected(), Boolean.TRUE)) {
            TuxIconView tuxIconView = this.LLIZ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_bookmark_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1i);
                tuxIconView.setTuxIcon(c419910GdJ2);
            }
            TuxTextView tuxTextView2 = this.LLIZLLLIL;
            if (tuxTextView2 == null) {
                return;
            }
            if (C1206904nr.LIZ()) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131844689);
                }
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    string = context2.getString(2131821909);
                }
            }
            tuxTextView2.setText(string);
            return;
        }
        TuxIconView tuxIconView2 = this.LLIZ;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_bookmark;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.a1i);
            tuxIconView2.setTuxIcon(c419910GdJ3);
        }
        TuxTextView tuxTextView3 = this.LLIZLLLIL;
        if (tuxTextView3 == null) {
            return;
        }
        if (C1206904nr.LIZ()) {
            Context context3 = getContext();
            if (context3 != null) {
                string = context3.getString(2131844688);
            }
        } else {
            Context context4 = getContext();
            if (context4 != null) {
                string = context4.getString(2131821908);
            }
        }
        tuxTextView3.setText(string);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e4y, viewGroup, false);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        String str;
        String str2;
        PoiDiscoveryCard poiDiscoveryCard;
        PoiDiscoveryCard poiDiscoveryCard2;
        C1174430gfR item;
        String str3;
        C1177230gjx cardInfo;
        PoiDiscoveryCard poiDiscoveryCard3;
        PoiDiscoveryCard poiDiscoveryCard4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("card_view onPageSelected, position is ");
        sbLIZ.append(i);
        sbLIZ.append(", poi_id:");
        C1174430gfR item2 = getItem();
        String str4 = null;
        if (item2 != null && (poiDiscoveryCard4 = item2.LL) != null) {
            str = poiDiscoveryCard4.poiId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility poiMapModeHorizontalCardAbilityI5 = I5();
        if (poiMapModeHorizontalCardAbilityI5 != null && !poiMapModeHorizontalCardAbilityI5.d4() && (item = getItem()) != null && !item.LLILLJJLI) {
            PoiMapModePageVM poiMapModePageVMP5 = P5();
            C1174430gfR item3 = getItem();
            if (item3 != null && (poiDiscoveryCard3 = item3.LL) != null) {
                str3 = poiDiscoveryCard3.poiId;
            } else {
                str3 = null;
            }
            poiMapModePageVMP5.yQ2(str3, true);
            PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility poiMapModeHorizontalCardAbilityI52 = I5();
            if (poiMapModeHorizontalCardAbilityI52 != null && (cardInfo = poiMapModeHorizontalCardAbilityI52.getCardInfo()) != null) {
                int i2 = cardInfo.LIZ;
                if (i2 < i) {
                    R5("right", cardInfo);
                } else if (i2 > i) {
                    R5("left", cardInfo);
                }
            }
        }
        PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility poiMapModeHorizontalCardAbilityI53 = I5();
        if (poiMapModeHorizontalCardAbilityI53 != null) {
            C1174430gfR item4 = getItem();
            if (item4 != null && (poiDiscoveryCard2 = item4.LL) != null) {
                str2 = poiDiscoveryCard2.poiId;
            } else {
                str2 = null;
            }
            C1174430gfR item5 = getItem();
            if (item5 != null && (poiDiscoveryCard = item5.LL) != null) {
                str4 = poiDiscoveryCard.collectInfo;
            }
            poiMapModeHorizontalCardAbilityI53.e2(new C1177230gjx(i, str2, str4));
        }
    }

    public final void R5(String str, C1177230gjx c1177230gjx) {
        String pagePoiId;
        String fromPoiId;
        String fromGroupId;
        String pageCollectInfo;
        String initialPoiEnterFrom;
        String initialPoiEnterMethod;
        String poiDetailEnterFrom;
        String poiDetailEnterMethod;
        MapModeType mapModeType;
        String type;
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        String str2 = c1177230gjx.LIZIZ;
        PoiMapModeDataParams poiMapModeDataParams = P5().LLILZIL;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (poiMapModeDataParams != null) {
            pagePoiId = poiMapModeDataParams.getPagePoiId();
        } else {
            pagePoiId = null;
        }
        PoiMapModeMobParams poiMapModeMobParams = P5().LLILZLL;
        if (poiMapModeMobParams != null) {
            fromPoiId = poiMapModeMobParams.getFromPoiId();
        } else {
            fromPoiId = null;
        }
        PoiMapModeMobParams poiMapModeMobParams2 = P5().LLILZLL;
        if (poiMapModeMobParams2 != null) {
            fromGroupId = poiMapModeMobParams2.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        PoiMapModeMobParams poiMapModeMobParams3 = P5().LLILZLL;
        if (poiMapModeMobParams3 != null) {
            pageCollectInfo = poiMapModeMobParams3.getPageCollectInfo();
        } else {
            pageCollectInfo = null;
        }
        String str3 = c1177230gjx.LIZJ;
        PoiMapModeMobParams poiMapModeMobParams4 = P5().LLILZLL;
        if (poiMapModeMobParams4 != null) {
            initialPoiEnterFrom = poiMapModeMobParams4.getInitialPoiEnterFrom();
        } else {
            initialPoiEnterFrom = null;
        }
        PoiMapModeMobParams poiMapModeMobParams5 = P5().LLILZLL;
        if (poiMapModeMobParams5 != null) {
            initialPoiEnterMethod = poiMapModeMobParams5.getInitialPoiEnterMethod();
        } else {
            initialPoiEnterMethod = null;
        }
        PoiMapModeMobParams poiMapModeMobParams6 = P5().LLILZLL;
        if (poiMapModeMobParams6 != null) {
            poiDetailEnterFrom = poiMapModeMobParams6.getPoiDetailEnterFrom();
        } else {
            poiDetailEnterFrom = null;
        }
        PoiMapModeMobParams poiMapModeMobParams7 = P5().LLILZLL;
        if (poiMapModeMobParams7 != null) {
            poiDetailEnterMethod = poiMapModeMobParams7.getPoiDetailEnterMethod();
        } else {
            poiDetailEnterMethod = null;
        }
        PoiMapModeMobParams poiMapModeMobParams8 = P5().LLILZLL;
        if (poiMapModeMobParams8 != null) {
            mapModeType = poiMapModeMobParams8.getMapModeType();
        } else {
            mapModeType = null;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        PageFinder pageFinderN5 = N5();
        c1174730gfv.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", fromPoiId, linkedHashMap);
        C1189060h32.LJJ("poi_id", pagePoiId, linkedHashMap);
        C1189060h32.LJJ("from_group_id", fromGroupId, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", initialPoiEnterFrom, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", initialPoiEnterMethod, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", poiDetailEnterFrom, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", poiDetailEnterMethod, linkedHashMap);
        if (mapModeType != null) {
            type = mapModeType.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        C1189060h32.LIZ(pageCollectInfo, linkedHashMap);
        C1189060h32.LIZLLL(str3, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderN5);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("swipe_poi_card", linkedHashMap, c1185050gwZ);
    }

    public final void S5(Context context, ArrayList arrayList, String str, String str2, Location location, String str3) {
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().LJI(context)) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PageFinder pageFinderN5 = N5();
            c1185430gxB.getClass();
            C1185430gxB.LJIL(pageFinderN5, "map_mode", str);
            return;
        }
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZ = context.getResources().getString(2131844800);
        c1247530iZL.LIZJ(R.raw.icon_arrow_up_right_ltr);
        c1247530iZL.LIZJ = 0;
        c1247530iZL.LIZ(new AwS2S4400000_18(context, location, str2, str3, str, this, 1));
        arrayList.add(c1247530iZL);
    }
}
