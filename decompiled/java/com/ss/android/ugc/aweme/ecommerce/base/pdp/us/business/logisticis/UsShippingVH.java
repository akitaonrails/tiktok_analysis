package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis;

import X.C01GW;
import X.C03EF;
import X.C03FI;
import X.C03IT;
import X.C03K8;
import X.C03K9;
import X.C03KA;
import X.C0H1U;
import X.C1018703yb;
import X.C1019103yf;
import X.C1054004Ag;
import X.C12ES;
import X.C1326790kdB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1697810uHb;
import X.C1735430vGH;
import X.C1741890vQh;
import X.C1743750vTh;
import X.C1744700vVE;
import X.C1756510voH;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C770702zh;
import X.C7736030k;
import X.C786410Ut5;
import X.C811903Fd;
import X.C814420VxA;
import X.C954703oH;
import X.EnumC1014603xw;
import X.InterfaceC1735440vGI;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPAppendix;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticUIConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.AwS88S0201000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class UsShippingVH extends AbsFullSpanVH<C811903Fd> {
    public final ECBaseFragment LLJJIJIL;
    public final View LLJJJ;
    public TuxIconView LLJJJIL;
    public LinearLayout LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public final C01GW LLJJL;
    public final List<C1735430vGH> LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxIconView e6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ml6) : null;
            this.LLJJJIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final LinearLayout f6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oc0) : null;
            this.LLJJJJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final PdpViewModel h6() {
        return (PdpViewModel) this.LLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        Iterator<C1735430vGH> it2 = this.LLJJLIIIJLLLLLLLZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C03FI c03fi;
        Integer num;
        PDPShippingModule pDPShippingModule;
        Float fLJIIIIZZ;
        PDPShippingModule pDPShippingModule2;
        Icon icon;
        PDPShippingModule pDPShippingModule3;
        boolean z;
        int iLIZJ;
        boolean z2;
        Integer num2;
        int iLIZJ2;
        boolean z3;
        PDPShippingModule pDPShippingModule4;
        Icon icon2;
        Image icon3;
        PDPLogisticUIConfig pDPLogisticUIConfig;
        C811903Fd c811903Fd = (C811903Fd) obj;
        UsShippingVH usShippingVH = this;
        View viewFindViewById = usShippingVH.LLJJJJLIIL;
        PDPShippingModuleMeta pDPShippingModuleMeta = null;
        if (viewFindViewById == null) {
            View view = usShippingVH.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ulj);
            } else {
                viewFindViewById = null;
            }
            usShippingVH.LLJJJJLIIL = (ConstraintLayout) viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        if (constraintLayout != null) {
            PDPLogisticModule pDPLogisticModule = c811903Fd.LLILLJJLI;
            if (pDPLogisticModule != null) {
                pDPLogisticUIConfig = pDPLogisticModule.uiConfig;
            } else {
                pDPLogisticUIConfig = null;
            }
            C03KA.LIZ(pDPLogisticUIConfig, constraintLayout);
        }
        PDPLogisticModule pDPLogisticModule2 = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule2 != null && (pDPShippingModule4 = pDPLogisticModule2.pdpShippingModule) != null && (icon2 = pDPShippingModule4.descriptionListIcon) != null) {
            C786410Ut5.LJLLLLLL(0, usShippingVH.e6());
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            if (C1744700vVE.LJ(usShippingVH.itemView.getContext(), null)) {
                icon3 = icon2.getIconDark();
            } else {
                icon3 = icon2.getIcon();
            }
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon3);
            c1331670kl3LIZLLL.LJJI(usShippingVH.e6());
            C786410Ut5.h3(c1331670kl3LIZLLL);
        } else {
            C786410Ut5.LJLLLLLL(8, usShippingVH.e6());
        }
        C786410Ut5.LJJJJJL(usShippingVH.f6());
        PDPLogisticModule pDPLogisticModule3 = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule3 != null && (pDPShippingModule3 = pDPLogisticModule3.pdpShippingModule) != null) {
            List<LinkRichText> list = pDPShippingModule3.descriptionList;
            if (list != null) {
                int i = 0;
                z = false;
                for (LinkRichText linkRichText : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        LinkRichText linkRichText2 = linkRichText;
                        Integer num3 = linkRichText2.textFontType;
                        if (num3 != null) {
                            iLIZJ2 = C7736030k.LIZJ(Integer.valueOf(num3.intValue()), null);
                        } else {
                            iLIZJ2 = 51;
                        }
                        if (i == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C03K9 c03k9D6 = usShippingVH.d6(linkRichText2, z, z3, 6, iLIZJ2);
                        if (c03k9D6 != null) {
                            usShippingVH.f6().addView(c03k9D6);
                            z = true;
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                z = false;
            }
            List<PDPAppendix> list2 = pDPShippingModule3.appendixList;
            if (list2 != null) {
                int i3 = 0;
                for (PDPAppendix pDPAppendix : list2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        PDPAppendix pDPAppendix2 = pDPAppendix;
                        LinkRichText linkRichText3 = pDPAppendix2.richText;
                        if (linkRichText3 != null && (num2 = linkRichText3.textFontType) != null) {
                            iLIZJ = C7736030k.LIZJ(Integer.valueOf(num2.intValue()), null);
                        } else {
                            iLIZJ = 51;
                        }
                        LinkRichText linkRichText4 = pDPAppendix2.richText;
                        if (i3 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        usShippingVH = usShippingVH;
                        z = z;
                        C03K9 c03k9D62 = usShippingVH.d6(linkRichText4, z, z2, 8, iLIZJ);
                        if (c03k9D62 != null) {
                            usShippingVH.f6().addView(c03k9D62);
                            z = true;
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        View viewFindViewById2 = usShippingVH.LLJJJJJIL;
        if (viewFindViewById2 == null) {
            View view2 = usShippingVH.itemView;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.tkb);
            } else {
                viewFindViewById2 = null;
            }
            usShippingVH.LLJJJJJIL = (TuxIconView) viewFindViewById2;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById2;
        PDPLogisticModule pDPLogisticModule4 = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule4 != null && (pDPShippingModule2 = pDPLogisticModule4.pdpShippingModule) != null && (icon = pDPShippingModule2.descriptionListArrow) != null) {
            C786410Ut5.LJLLLLLL(0, tuxIconView);
            C03KA.LIZIZ(tuxIconView, icon, usShippingVH.itemView.getContext());
        } else {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
            tuxIconView.LIZ();
        }
        C786410Ut5.I7(new AjS40S0200000_1(c811903Fd, usShippingVH, 64), usShippingVH.itemView);
        View view3 = usShippingVH.itemView;
        view3.setContentDescription(view3.getResources().getString(2131823599));
        C811903Fd c811903FdX5 = usShippingVH.X5();
        PdpViewModel pdpViewModelH6 = usShippingVH.h6();
        Map mapC6 = c6(c811903FdX5, null);
        PDPLogisticModule pDPLogisticModule5 = c811903FdX5.LLILLJJLI;
        if (pDPLogisticModule5 != null && (pDPShippingModule = pDPLogisticModule5.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null) {
            String str = pDPShippingModuleMeta.deliveryFlag;
            if (str != null) {
                mapC6.put("delivery_flag", str);
            }
            String str2 = pDPShippingModuleMeta.freeShippingThresholdPrice;
            if (str2 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str2)) != null) {
                mapC6.put("free_shipping_threshold", Float.valueOf(fLJIIIIZZ.floatValue()));
            }
        }
        String str3 = c811903FdX5.LLILLL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        mapC6.put("sku_id", str3);
        C1054004Ag c1054004Ag = pdpViewModelH6.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            mapC6.putAll(c1054004Ag.LJIIJJI(c811903FdX5.LLILLL));
        }
        if (pDPShippingModuleMeta != null) {
            String str5 = pDPShippingModuleMeta.edtType;
            if (str5 != null) {
                mapC6.put("edt_type", str5);
            }
            String str6 = pDPShippingModuleMeta.deliveryInfo;
            if (str6 != null) {
                mapC6.put("delivery_info", str6);
            }
        }
        PreOrderInfo preOrderInfo = c811903FdX5.LL;
        if (preOrderInfo != null && (num = preOrderInfo.shippingDays) != null) {
            mapC6.put("preorder_shipdays", Integer.valueOf(num.intValue()));
        }
        String str7 = c811903FdX5.LLILLL;
        if (str7 != null) {
            str4 = str7;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logistics_");
        sbLIZ.append(str4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1054004Ag c1054004Ag2 = pdpViewModelH6.LLJLILLLLZIIL;
        if (c1054004Ag2 != null && (c03fi = c1054004Ag2.LJJIIZI) != null) {
            c03fi.LIZ(strLIZIZ, new AwS402S0200000_1(pdpViewModelH6, (PdpViewModel) mapC6, (Map<String, Object>) 77));
        }
    }

    public static Map c6(C811903Fd c811903Fd, Map map) {
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta;
        LogisticsMeta logisticsMeta;
        String str;
        HashMap<String, Object> mapLJIIJ;
        PDPShippingModule pDPShippingModule2;
        PDPShippingModuleMeta pDPShippingModuleMeta2;
        LogisticsMeta logisticsMeta2;
        String str2;
        HashMap<String, Object> mapLJIIJ2;
        PDPShippingModule pDPShippingModule3;
        PDPShippingModuleMeta pDPShippingModuleMeta3;
        LogisticsMeta logisticsMeta3;
        String str3;
        HashMap<String, Object> mapLJIIJ3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        PDPLogisticModule pDPLogisticModule = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule != null && (pDPShippingModule3 = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta3 = pDPShippingModule3.meta) != null && (logisticsMeta3 = pDPShippingModuleMeta3.logistic) != null && (str3 = logisticsMeta3.eventTracking) != null && (mapLJIIJ3 = C1741890vQh.LJIIJ(str3)) != null) {
            linkedHashMap.putAll(mapLJIIJ3);
        }
        PDPLogisticModule pDPLogisticModule2 = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule2 != null && (pDPShippingModule2 = pDPLogisticModule2.pdpShippingModule) != null && (pDPShippingModuleMeta2 = pDPShippingModule2.meta) != null && (logisticsMeta2 = pDPShippingModuleMeta2.logistic) != null && (str2 = logisticsMeta2.promotionDaInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str2)) != null) {
            linkedHashMap.putAll(mapLJIIJ2);
        }
        PDPLogisticModule pDPLogisticModule3 = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule3 != null && (pDPShippingModule = pDPLogisticModule3.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null && (logisticsMeta = pDPShippingModuleMeta.logistic) != null && (str = logisticsMeta.voucherDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UsShippingVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        View viewLIZ;
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.b3_, viewGroup, false);
        } else {
            viewLIZ = view;
        }
        super(viewLIZ);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = view;
        this.LLJJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1374));
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
    }

    public final void i6(String str, Map<String, ? extends Object> map, C811903Fd c811903Fd) {
        PDPShippingModuleMeta pDPShippingModuleMeta;
        Integer num;
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta2;
        Float fLJIIIIZZ;
        PDPShippingModule pDPShippingModule2;
        PDPLogisticModule pDPLogisticModule = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule != null && (pDPShippingModule2 = pDPLogisticModule.pdpShippingModule) != null) {
            pDPShippingModuleMeta = pDPShippingModule2.meta;
        } else {
            pDPShippingModuleMeta = null;
        }
        Map mapC6 = c6(c811903Fd, map);
        PDPLogisticModule pDPLogisticModule2 = c811903Fd.LLILLJJLI;
        if (pDPLogisticModule2 != null && (pDPShippingModule = pDPLogisticModule2.pdpShippingModule) != null && (pDPShippingModuleMeta2 = pDPShippingModule.meta) != null) {
            String str2 = pDPShippingModuleMeta2.deliveryFlag;
            if (str2 != null) {
                mapC6.put("delivery_flag", str2);
            }
            String str3 = pDPShippingModuleMeta2.freeShippingThresholdPrice;
            if (str3 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3)) != null) {
                mapC6.put("free_shipping_threshold", Float.valueOf(fLJIIIIZZ.floatValue()));
            }
        }
        String str4 = c811903Fd.LLILLL;
        if (str4 == null) {
            str4 = "";
        }
        mapC6.put("sku_id", str4);
        C1054004Ag c1054004Ag = h6().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            mapC6.putAll(c1054004Ag.LJIIJJI(c811903Fd.LLILLL));
        }
        if (pDPShippingModuleMeta != null) {
            String str5 = pDPShippingModuleMeta.edtType;
            if (str5 != null) {
                mapC6.put("edt_type", str5);
            }
            String str6 = pDPShippingModuleMeta.deliveryInfo;
            if (str6 != null) {
                mapC6.put("delivery_info", str6);
            }
        }
        PreOrderInfo preOrderInfo = c811903Fd.LL;
        if (preOrderInfo != null && (num = preOrderInfo.shippingDays) != null) {
            mapC6.put("preorder_shipdays", Integer.valueOf(num.intValue()));
        }
        C1054004Ag c1054004Ag2 = h6().LLJLILLLLZIIL;
        if (c1054004Ag2 != null) {
            C1018703yb.LJII("tiktokec_module_click", new AwS86S1200000_1(c1054004Ag2, str, mapC6, 44));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C03K9 d6(LinkRichText linkRichText, boolean z, boolean z2, int i, int i2) {
        Image icon;
        Image icon2;
        C811903Fd c811903FdX5 = X5();
        if (linkRichText == null) {
            return null;
        }
        C03K9 c03k9 = new C03K9(this.itemView.getContext());
        if (!z) {
            C426750GoL.LJIIL(c03k9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 29);
        } else if (z2) {
            C426750GoL.LJIIL(c03k9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), null, null, 29);
        } else {
            C426750GoL.LJIIL(c03k9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, 29);
        }
        new AwS88S0201000_1(i2, linkRichText, this, 11).invoke(c03k9.getComTextFromXml());
        Icon icon3 = linkRichText.prefixIcon;
        if (icon3 != null) {
            if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
                icon2 = icon3.getIconDark();
            } else {
                icon2 = icon3.getIcon();
            }
            if (icon2 != null) {
                C03IT imageUrlModel = icon2.toImageUrlModel();
                C12ES.LJIILL(0, c03k9.getPrefixIconFromXml());
                if (imageUrlModel != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL.LJJ(c03k9.getPrefixIconFromXml());
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                } else {
                    C0H1U.LIZIZ(c03k9.getPrefixIconFromXml());
                }
                C786410Ut5.G6(c03k9.getPrefixIconFromXml(), c03k9.getPrefixIconFromXml().getLayoutParams());
            }
        }
        Icon icon4 = linkRichText.suffixIcon;
        if (icon4 != null) {
            if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
                icon = icon4.getIconDark();
            } else {
                icon = icon4.getIcon();
            }
            if (icon != null) {
                C03IT imageUrlModel2 = icon.toImageUrlModel();
                C12ES.LJIILL(0, c03k9.getIconFromXml());
                if (imageUrlModel2 != null) {
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(imageUrlModel2);
                    c1331670kl3LJIIJ.LJJ(c03k9.getIconFromXml());
                    C786410Ut5.h3(c1331670kl3LJIIJ);
                } else {
                    C0H1U.LIZIZ(c03k9.getIconFromXml());
                }
                C786410Ut5.G6(c03k9.getIconFromXml(), c03k9.getIconFromXml().getLayoutParams());
            }
        }
        String str = linkRichText.link;
        if (str != null) {
            c03k9.setDefaultClickListener(new C03K8(this, str, linkRichText));
        }
        RichTextUtil richTextUtil = RichTextUtil.LIZ;
        final Context context = this.itemView.getContext();
        final AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(c811903FdX5, this, 264);
        AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(c03k9, 731);
        final AwS580S0100000_1 awS580S0100000_12 = new AwS580S0100000_1(c03k9, 733);
        final AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(c03k9, 187);
        final AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1634);
        final AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1(c03k9, 1635);
        final int i3 = 0;
        final Integer num = null;
        richTextUtil.getClass();
        final String str2 = linkRichText.template;
        Map<String, LinkText> map = linkRichText.arguments;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null) {
            for (String str3 : map.keySet()) {
                LinkText linkText = map.get(str3);
                if (linkText != null) {
                    if (C770702zh.LIZIZ(linkText.getEndTime())) {
                        try {
                            String endTime = linkText.getEndTime();
                            if (endTime != null) {
                                try {
                                    long j = (CastLongProtector.parseLong(endTime) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - System.currentTimeMillis();
                                    RichTextUtil.LIZ.getClass();
                                    linkedHashMap.put(str3, RichTextUtil.LJIIIIZZ(linkText, j));
                                    linkedHashMap2.put(str3, Long.valueOf(j));
                                } catch (Throwable th) {
                                    th = th;
                                    TryCatchGuardChecker.doCheck(th);
                                    C1019103yf.LIZ(EnumC1014603xw.ERR41, th, null);
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            th = th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        TryCatchGuardChecker.doCheck(th);
                        C1019103yf.LIZ(EnumC1014603xw.ERR41, th, null);
                    } else {
                        linkedHashMap.put(str3, linkText);
                    }
                }
            }
        }
        Object objLJJJLIIL = C13LP.LJJJLIIL(linkedHashMap2.keySet());
        if (objLJJJLIIL != null) {
            Long l = (Long) linkedHashMap2.get(objLJJJLIIL);
            if (l != null) {
                l.longValue();
                if (l.longValue() >= 0) {
                    C1735430vGH c1735430vGH = new C1735430vGH(l.longValue(), 1000L, null);
                    final Object[] objArr = null == true ? 1 : 0;
                    InterfaceC1735440vGI interfaceC1735440vGI = new InterfaceC1735440vGI() { // from class: X.03K5
                        @Override // X.InterfaceC1735440vGI
                        public final void LIZLLL() {
                            Function0<Unit> function0 = awS545S0100000_1;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }

                        @Override // X.InterfaceC1735440vGI
                        public final void onStart() {
                            String str4 = str2;
                            if (str4 == null) {
                                Function1<SpannableStringBuilder, Unit> function1 = awS580S0100000_12;
                                if (function1 != null) {
                                    function1.invoke(null);
                                    return;
                                }
                                return;
                            }
                            RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                            Context context2 = context;
                            Map<String, LinkText> map2 = linkedHashMap;
                            Integer num2 = num;
                            int i4 = i3;
                            boolean z3 = objArr;
                            Integer num3 = num;
                            Function1<LinkText, Unit> function12 = awS367S0200000_1;
                            Function0<Unit> function0 = awS545S0100000_12;
                            richTextUtil2.getClass();
                            SpannableStringBuilder spannableStringBuilderLIZLLL = RichTextUtil.LIZLLL(context2, str4, map2, num2, i4, z3, num3, null, function12, "normal_checkout", null, false, false, null, function0);
                            Function1<SpannableStringBuilder, Unit> function13 = awS580S0100000_12;
                            if (function13 != null) {
                                function13.invoke(spannableStringBuilderLIZLLL);
                            }
                        }

                        @Override // X.InterfaceC1735440vGI
                        public final void LJJI(long j2) {
                            if (str2 == null) {
                                Function2<Long, SpannableStringBuilder, Unit> function2 = awS615S0100000_1;
                                if (function2 != null) {
                                    function2.invoke(Long.valueOf(j2), null);
                                    return;
                                }
                                return;
                            }
                            for (String str4 : linkedHashMap.keySet()) {
                                LinkText linkText2 = linkedHashMap.get(str4);
                                if (linkText2 != null) {
                                    if (C770702zh.LIZIZ(linkText2.getEndTime())) {
                                        try {
                                            String endTime2 = linkText2.getEndTime();
                                            if (endTime2 != null) {
                                                long j3 = (CastLongProtector.parseLong(endTime2) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - System.currentTimeMillis();
                                                RichTextUtil.LIZ.getClass();
                                                linkedHashMap.put(str4, RichTextUtil.LJIIIIZZ(linkText2, j3));
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            C1019103yf.LIZ(EnumC1014603xw.ERR42, th3, null);
                                        }
                                    } else {
                                        linkedHashMap.put(str4, linkText2);
                                    }
                                }
                            }
                            RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                            Context context2 = context;
                            String str5 = str2;
                            Map<String, LinkText> map2 = linkedHashMap;
                            Integer num2 = num;
                            int i4 = i3;
                            boolean z3 = objArr;
                            Integer num3 = num;
                            Function1<LinkText, Unit> function1 = awS367S0200000_1;
                            Function0<Unit> function0 = awS545S0100000_12;
                            richTextUtil2.getClass();
                            SpannableStringBuilder spannableStringBuilderLIZLLL = RichTextUtil.LIZLLL(context2, str5, map2, num2, i4, z3, num3, null, function1, "normal_checkout", null, false, false, null, function0);
                            Function2<Long, SpannableStringBuilder, Unit> function22 = awS615S0100000_1;
                            if (function22 == null) {
                                return;
                            }
                            function22.invoke(Long.valueOf(j2), spannableStringBuilderLIZLLL);
                        }
                    };
                    c1735430vGH.LLJI = interfaceC1735440vGI;
                    if (c1735430vGH.LLILZLL) {
                        interfaceC1735440vGI.LIZLLL();
                    }
                    c1735430vGH.LJFF();
                    ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(c1735430vGH);
                }
            } else {
                RichTextUtil.LIZ.getClass();
                awS580S0100000_1.invoke(RichTextUtil.LIZLLL(context, str2, linkedHashMap, null, 0, false, null, null, awS367S0200000_1, "normal_checkout", null, false, false, null, awS545S0100000_12));
            }
        } else {
            richTextUtil.getClass();
            awS580S0100000_1.invoke(RichTextUtil.LIZLLL(context, str2, linkedHashMap, null, 0, false, null, null, awS367S0200000_1, "normal_checkout", null, false, false, null, awS545S0100000_12));
        }
        C03EF comTextFromXml = c03k9.getComTextFromXml();
        if ((comTextFromXml instanceof TextView) && comTextFromXml != null) {
            C1756510voH.LIZ(comTextFromXml, null);
        }
        return c03k9;
    }
}
