package com.ss.android.ugc.aweme.poi.detail.guides;

import X.AbstractC2211791BhR;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0PEM;
import X.C0XQ7;
import X.C1181890grT;
import X.C1189060h32;
import X.C12KQ;
import X.C12P4;
import X.C12P5;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20627315nb;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C444830HcP;
import X.C444840HcQ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C912410Zqp;
import X.EnumC197015126j;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailGuidesCell extends PowerCell<PoiDetailApi.PoiGuide> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public View LL;
    public C21415018rM LLILLJJLI;
    public ImageView LLILLL;
    public C12P4 LLILZ;
    public C12P4 LLILZIL;
    public C20627315nb LLILZLL;
    public final AssemVMLazy LLIZ;
    public String LLIZLLLIL;
    public Fragment LLJ;
    public PoiListApi.PoiDetailResponse LLJI;
    public final C01GW LLJIJIL;
    public String LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailGuidesCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/guides/PoiDetailGuidesVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailGuidesCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailGuidesVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1155);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(408);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1139), awS562S0100000_18, AFwS206S0000000_18.get$arr$(336), new AwS562S0100000_18((C03K6) this, 1141), new AwS562S0100000_18((C03K6) this, 1143), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1145), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1147), null, new AwS562S0100000_18((C03K6) this, 1148));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1142);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1144);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1146);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 67));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1149);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1150);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1151);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1152);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1153);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1154), awS562S0100000_18, AFwS206S0000000_18.get$arr$(337), new AwS562S0100000_18((C03K6) this, 1156), new AwS562S0100000_18((C03K6) this, 1157), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1158), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1159), null, new AwS562S0100000_18((C03K6) this, 1160));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1161), awS562S0100000_18, AFwS206S0000000_18.get$arr$(338), new AwS562S0100000_18((C03K6) this, 1162), new AwS562S0100000_18((C03K6) this, 1163), new AwS562S0100000_18((C03K6) this, 1136), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1137));
        }
        this.LLIZ = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1140));
    }

    public final HashMap<String, String> I5() {
        Fragment fragmentLJIIJ = this.LLJ;
        if (fragmentLJIIJ == null && (fragmentLJIIJ = C1189060h32.LJIIJ(this)) == null) {
            return null;
        }
        this.LLJ = fragmentLJIIJ;
        this.LLJI = C1181890grT.LIZ(fragmentLJIIJ);
        HashMap<String, String> map = new HashMap<>();
        map.put("enter_from", "poi_detail");
        C1189060h32.LJIJI(map, "poi_id", L5().LL);
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLJI;
        C1189060h32.LJIJI(map, "collect_info", poiDetailResponse != null ? poiDetailResponse.getCollectInfo() : null);
        C1189060h32.LJIJI(map, "from_group_id", L5().LLILLJJLI);
        C1189060h32.LJIJI(map, "to_group_id_list", this.LLJILJIL);
        C1189060h32.LJIJI(map, "user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C1189060h32.LJIJI(map, "index", String.valueOf(getBindingAdapterPosition() + 1));
        return map;
    }

    public final PoiDetailGuidesVM L5() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (PoiDetailGuidesVM) assemVMLazy.getValue();
    }

    public final void N5() {
        C12P5 c12p5 = new C12P5();
        c12p5.LIZJ = -16777216;
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJFF = Float.valueOf(0.6f);
        c12p5.LJII = EnumC197015126j.LINEAR;
        c12p5.LJI = C12KQ.VERTICAL;
        C12P4 c12p4 = this.LLILZIL;
        if (c12p4 != null) {
            c12p4.setTuxDarkLayer(c12p5);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0gc4
            public Function0<String> LJ;
            public final int LJFF = 100;
            public final C1208900hZ2 LJI;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            {
                this.LJ = new AwS562S0100000_18(this, 1138);
                this.LJI = new C1208900hZ2(this, 2);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public final void P5(Integer num) {
        C12P5 c12p5 = new C12P5();
        c12p5.LIZJ = num;
        c12p5.LJ = Float.valueOf(0.8f);
        c12p5.LJFF = Float.valueOf(0.0f);
        c12p5.LJII = EnumC197015126j.EASE_IN;
        c12p5.LJI = C12KQ.VERTICAL;
        C12P4 c12p4 = this.LLILZ;
        if (c12p4 != null) {
            c12p4.setTuxDarkLayer(c12p5);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLJJLIIIJ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numLIZJ;
        PoiDetailApi.PoiGuide poiGuide = (PoiDetailApi.PoiGuide) interfaceC1891350zJl;
        super.onBindItemView(poiGuide);
        List<String> itemIdList = poiGuide.getItemIdList();
        if (itemIdList != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(itemIdList, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        this.LLJILJIL = strLJJLIIIJ;
        String guideId = poiGuide.getGuideId();
        if (guideId != null) {
            this.LLIZLLLIL = guideId;
        }
        String guideTitle = poiGuide.getGuideTitle();
        if (guideTitle != null) {
            View view = this.LL;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int iLIZIZ = marginLayoutParams.width - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2);
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LJIILIIL(guideTitle);
                c444830HcP.LIZIZ.LJ = iLIZIZ;
                c444830HcP.LJIIIZ(3);
                TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
                c444840HcQ.LJIIIZ = textDirectionHeuristic;
                c444840HcQ.LJII = TextUtils.TruncateAt.END;
                c444830HcP.LJII(43);
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                    c444830HcP.LJIILJJIL(numLIZJ.intValue());
                }
                C21415018rM c21415018rM = this.LLILLJJLI;
                if (c21415018rM != null) {
                    c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, false, C1697810uHb.LJIIJJI(new Pair(14, 15), new Pair(14, 14), new Pair(14, 14)), 27));
                }
            } else {
                return;
            }
        }
        UrlStruct img = poiGuide.getImg();
        if (img != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C912410Zqp(img, this, null), 2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dzw, viewGroup, false);
        this.LL = viewTd.findViewById(R.id.jbu);
        this.LLILLJJLI = (C21415018rM) viewTd.findViewById(R.id.jbx);
        this.LLILLL = (ImageView) viewTd.findViewById(R.id.jbv);
        this.LLILZ = (C12P4) viewTd.findViewById(R.id.jby);
        this.LLILZIL = (C12P4) viewTd.findViewById(R.id.jbt);
        this.LLILZLL = (C20627315nb) viewTd.findViewById(R.id.jbw);
        View view = this.LL;
        if (view != null) {
            C1189060h32.LJJIIJ(view, new AwS597S0100000_18(this, 335));
        }
        return viewTd;
    }
}
