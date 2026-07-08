package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.logisticis;

import X.C01GW;
import X.C03C8;
import X.C03EF;
import X.C03FI;
import X.C1054104Ah;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C748702w9;
import X.C765002ym;
import X.C786410Ut5;
import X.C807203Di;
import X.C814420VxA;
import X.C919503ib;
import X.C960603pE;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaShippingVH extends AbsFullSpanVH<C807203Di> implements InterfaceC1631620sYq<View, String, ECRichTextExtraInfo, Unit> {
    public TuxIconView LLJJIJIL;
    public LinearLayout LLJJJ;
    public TuxIconView LLJJJIL;
    public final C01GW LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH
    public final boolean W5() {
        return ((C807203Di) this.LLILLJJLI).LLILZLL;
    }

    public final TuxIconView c6() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ml6) : null;
            this.LLJJIJIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJJJ.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaShippingVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.axk, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 114));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [X.03Dh, android.view.View] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute] */
    /* JADX WARN: Type inference failed for: r3v31, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int i;
        C03FI c03fi;
        String str;
        HashMap<String, Object> mapLJIIJ;
        Float fLJIIIIZZ;
        PDPShippingModule pDPShippingModule;
        View viewFindViewById;
        PDPShippingModule pDPShippingModule2;
        List<LinkRichText> list;
        boolean z;
        String str2;
        ?? r4;
        ?? linkTextType;
        Object textAttribute;
        Object iconAttribute;
        String darkColor;
        String color;
        ?? viewWidth;
        Image icon;
        Image iconDark;
        String link;
        String link2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        PDPShippingModule pDPShippingModule3;
        Icon icon2;
        Image icon3;
        C807203Di c807203Di = (C807203Di) obj;
        PDPLogisticModule pDPLogisticModule = c807203Di.LLILZ;
        View view = null;
        view = null;
        view = null;
        view = null;
        int i2 = 0;
        if (pDPLogisticModule != null && (pDPShippingModule3 = pDPLogisticModule.pdpShippingModule) != null && (icon2 = pDPShippingModule3.descriptionListIcon) != null) {
            C786410Ut5.LJLLLLLL(0, c6());
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
                icon3 = icon2.getIconDark();
            } else {
                icon3 = icon2.getIcon();
            }
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon3);
            c1331670kl3LIZLLL.LJJI(c6());
            C786410Ut5.h3(c1331670kl3LIZLLL);
        } else {
            C786410Ut5.LJLLLLLL(8, c6());
        }
        View viewFindViewById2 = this.LLJJJ;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.oc0);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJ = (LinearLayout) viewFindViewById2;
        }
        C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById2);
        PDPLogisticModule pDPLogisticModule2 = c807203Di.LLILZ;
        if (pDPLogisticModule2 != null && (pDPShippingModule2 = pDPLogisticModule2.pdpShippingModule) != null && (list = pDPShippingModule2.descriptionList) != null) {
            int i3 = 0;
            for (LinkRichText linkRichText : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    LinkRichText linkRichText2 = linkRichText;
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (linkRichText2 != null) {
                        final Context context = this.itemView.getContext();
                        ?? r2 = new LinearLayout(context) { // from class: X.03Dh
                            public C03EF LL;
                            public SmartImageView LLILLJJLI;
                            public SmartImageView LLILLL;
                            public SmartImageView LLILZ;

                            public final SmartImageView getActionIconFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.a11);
                                    this.LLILLJJLI = (SmartImageView) callbackFindViewById;
                                }
                                return (SmartImageView) callbackFindViewById;
                            }

                            public final SmartImageView getPrefixIconFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LLILLL;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.ro7);
                                    this.LLILLL = (SmartImageView) callbackFindViewById;
                                }
                                return (SmartImageView) callbackFindViewById;
                            }

                            public final SmartImageView getSuffixIconFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LLILZ;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.wn7);
                                    this.LLILZ = (SmartImageView) callbackFindViewById;
                                }
                                return (SmartImageView) callbackFindViewById;
                            }

                            public final C03EF getTvRichTextFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LL;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.z69);
                                    this.LL = (C03EF) callbackFindViewById;
                                }
                                return (C03EF) callbackFindViewById;
                            }

                            public final C03EF getTextView() {
                                return getTvRichTextFromXml();
                            }

                            {
                                super(context, null, 0);
                                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f875anj, this, true);
                            }

                            public final void setActionIconFromXml(SmartImageView smartImageView) {
                                this.LLILLJJLI = smartImageView;
                            }

                            public final void setDefaultClickListener(Function0<Unit> function0) {
                                getTextView().setDefaultClickListener(new AwS545S0100000_1(function0, (Function0<Unit>) 1587));
                            }

                            public final void setPrefixIconFromXml(SmartImageView smartImageView) {
                                this.LLILLL = smartImageView;
                            }

                            public final void setSuffixIconFromXml(SmartImageView smartImageView) {
                                this.LLILZ = smartImageView;
                            }

                            public final void setTvRichTextFromXml(C03EF c03ef) {
                                this.LL = c03ef;
                            }

                            public final void LIZ(SmartImageView smartImageView, Icon icon4) {
                                Image icon5;
                                if (icon4 != null) {
                                    Integer viewWidth2 = icon4.getViewWidth();
                                    Integer viewHeight = icon4.getViewHeight();
                                    if (viewWidth2 != null && viewHeight != null) {
                                        C1744700vVE.LJII(smartImageView, (int) C0H9H.LIZ(viewWidth2.intValue()), (int) C0H9H.LIZ(viewHeight.intValue()));
                                    }
                                    if (!C1744700vVE.LJ(getContext(), null) || (icon5 = icon4.getIconDark()) == null) {
                                        icon5 = icon4.getIcon();
                                        if (icon5 != null) {
                                        }
                                        C0H1U.LIZIZ(smartImageView);
                                        return;
                                    }
                                    C03IT imageUrlModel = icon5.toImageUrlModel();
                                    if (imageUrlModel != null) {
                                        C12ES.LJIILL(0, smartImageView);
                                        C1326790kdB.LIZ.getClass();
                                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel);
                                        c1331670kl3LIZLLL2.LJJ(smartImageView);
                                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                                        return;
                                    }
                                    C0H1U.LIZIZ(smartImageView);
                                    return;
                                }
                                C0H1U.LIZIZ(smartImageView);
                            }
                        };
                        ViewGroup.LayoutParams layoutParams = r2.getTvRichTextFromXml().getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams.setMarginStart(i2);
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.setMarginEnd(i2);
                            marginLayoutParams.bottomMargin = i2;
                        }
                        r2.LIZ(r2.getActionIconFromXml(), linkRichText2.actionIcon);
                        r2.LIZ(r2.getPrefixIconFromXml(), linkRichText2.prefixIcon);
                        r2.LIZ(r2.getSuffixIconFromXml(), linkRichText2.suffixIcon);
                        LinkRichText linkRichTextLIZ = LinkRichText.LIZ(linkRichText2);
                        C03EF tvRichTextFromXml = r2.getTvRichTextFromXml();
                        HashMap map = new HashMap();
                        Map<String, LinkText> map2 = linkRichTextLIZ.arguments;
                        if (map2 != null) {
                            Object obj2 = view;
                            for (Map.Entry<String, LinkText> entry : map2.entrySet()) {
                                LinkText value = entry.getValue();
                                String key = entry.getKey();
                                if (value != null) {
                                    linkTextType = value.getLinkTextType();
                                    String text = value.getText();
                                    String link3 = value.getLink();
                                    Font fontLIZ = C748702w9.LIZ(value.getTextFontType());
                                    Boolean hasUnderscore = value.getHasUnderscore();
                                    Boolean hasStrike = value.getHasStrike();
                                    CommonColor textRawColor = value.getTextRawColor();
                                    if (textRawColor == null || (darkColor = textRawColor.getDarkColor()) == null) {
                                        darkColor = value.getDarkColor();
                                    }
                                    CommonColor textRawColor2 = value.getTextRawColor();
                                    if (textRawColor2 == null || (color = textRawColor2.getColor()) == null) {
                                        color = value.getColor();
                                    }
                                    textAttribute = new TextAttribute(text, link3, fontLIZ, hasUnderscore, hasStrike, Boolean.FALSE, new CustomColor(darkColor, color), null, null);
                                    Icon icon4 = value.getIcon();
                                    if (icon4 != null) {
                                        viewWidth = icon4.getViewWidth();
                                    } else {
                                        viewWidth = obj2;
                                    }
                                    Icon icon5 = value.getIcon();
                                    ?? viewHeight = obj2;
                                    if (icon5 != null) {
                                        viewHeight = icon5.getViewHeight();
                                    }
                                    Size size = new Size(viewWidth, viewHeight);
                                    Icon icon6 = value.getIcon();
                                    if (icon6 != null) {
                                        icon = icon6.getIcon();
                                    } else {
                                        icon = null;
                                    }
                                    Icon icon7 = value.getIcon();
                                    if (icon7 != null) {
                                        iconDark = icon7.getIconDark();
                                    } else {
                                        iconDark = null;
                                    }
                                    Icon icon8 = value.getIcon();
                                    if (icon8 != null) {
                                        link = icon8.getLink();
                                    } else {
                                        link = null;
                                    }
                                    com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon icon9 = new com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon(icon, iconDark, link, null);
                                    Icon icon10 = value.getIcon();
                                    if (icon10 != null) {
                                        link2 = icon10.getLink();
                                    } else {
                                        link2 = null;
                                    }
                                    iconAttribute = new IconAttribute(size, icon9, link2, null);
                                } else {
                                    linkTextType = obj2;
                                    textAttribute = obj2;
                                    iconAttribute = obj2;
                                }
                                map.put(key, new ECRichTextAttribute(linkTextType, textAttribute, iconAttribute, null, null, null));
                                obj2 = null;
                            }
                        }
                        String strLIZIZ = linkRichTextLIZ.template;
                        Icon icon11 = linkRichTextLIZ.prefixIcon;
                        if (icon11 != null) {
                            ECRichTextAttribute eCRichTextAttributeLIZIZ = C748702w9.LIZIZ(icon11);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("{{prefix_icon}}");
                            sbLIZ.append(strLIZIZ);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            map.put("{{prefix_icon}}", eCRichTextAttributeLIZIZ);
                        }
                        Icon icon12 = linkRichTextLIZ.suffixIcon;
                        if (icon12 != null) {
                            ECRichTextAttribute eCRichTextAttributeLIZIZ2 = C748702w9.LIZIZ(icon12);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append("{{suffix_icon}}");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            map.put("{{suffix_icon}}", eCRichTextAttributeLIZIZ2);
                        }
                        String str3 = linkRichTextLIZ.link;
                        Font fontLIZ2 = C748702w9.LIZ(linkRichTextLIZ.textFontType);
                        CustomColor customColor = new CustomColor(linkRichTextLIZ.darkTextColor, linkRichTextLIZ.textColor);
                        Integer num = linkRichTextLIZ.lines;
                        Boolean bool = Boolean.FALSE;
                        TextAttribute textAttribute2 = new TextAttribute(null, str3, fontLIZ2, bool, bool, bool, customColor, null, num);
                        RichTextExtraInfo richTextExtraInfo = linkRichTextLIZ.extraInfo;
                        if (richTextExtraInfo != null) {
                            str2 = richTextExtraInfo.daInfo;
                        } else {
                            str2 = null;
                        }
                        C03C8.LIZLLL(tvRichTextFromXml, new ECRichText(strLIZIZ, map, textAttribute2, null, new ECRichTextExtraInfo(str2, null)), "pdp_delivery_shipping_content", this, true);
                        r2.setDefaultClickListener(new AwS402S0200000_1(this, c807203Di, 51));
                        if (!z) {
                            r4 = r2;
                            C426750GoL.LJIIL(r2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, 29);
                        } else {
                            r4 = r2;
                        }
                        View viewFindViewById3 = this.LLJJJ;
                        if (viewFindViewById3 == null) {
                            View viewLJJIJL2 = LJJIJL();
                            if (viewLJJIJL2 != null) {
                                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.oc0);
                            } else {
                                viewFindViewById3 = null;
                            }
                            this.LLJJJ = (LinearLayout) viewFindViewById3;
                        }
                        ((ViewGroup) viewFindViewById3).addView(r4);
                    }
                    i3 = i4;
                    view = null;
                    i2 = 0;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        TuxIconView tuxIconView = this.LLJJJIL;
        View view2 = tuxIconView;
        if (tuxIconView == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.tkb);
            } else {
                viewFindViewById = view;
            }
            this.LLJJJIL = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        PDPLogisticModule pDPLogisticModule3 = c807203Di.LLILZ;
        if (pDPLogisticModule3 != null && (pDPShippingModule = pDPLogisticModule3.pdpShippingModule) != null && pDPShippingModule.descriptionListArrow != null) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        C786410Ut5.I7(new AjS40S0200000_1(this, c807203Di, 33), this.itemView);
        PDPLogisticModule pDPLogisticModule4 = ((C807203Di) this.LLILLJJLI).LLILZ;
        ?? r5 = view;
        if (pDPLogisticModule4 != null) {
            PDPShippingModule pDPShippingModule4 = pDPLogisticModule4.pdpShippingModule;
            r5 = view;
            if (pDPShippingModule4 != null) {
                r5 = pDPShippingModule4.meta;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r5 != 0) {
            String str4 = r5.deliveryFlag;
            if (str4 != null) {
                linkedHashMap.put("delivery_flag", str4);
            }
            String str5 = r5.freeShippingThresholdPrice;
            if (str5 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str5)) != null) {
                linkedHashMap.put("free_shipping_threshold", Float.valueOf(fLJIIIIZZ.floatValue()));
            }
        }
        String str6 = ((C807203Di) this.LLILLJJLI).LLILZIL;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("sku_id", str6);
        C1054104Ah c1054104Ah = d6().LLJLIL;
        if (c1054104Ah != null) {
            linkedHashMap.putAll(c1054104Ah.LJIIJ(((C807203Di) this.LLILLJJLI).LLILZIL));
        }
        C765002ym c765002ym = ((C807203Di) this.LLILLJJLI).LL;
        if (c765002ym != null && (str = c765002ym.LJIIJJI) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        String str8 = ((C807203Di) this.LLILLJJLI).LLILZIL;
        if (str8 != null) {
            str7 = str8;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("logistics_");
        sbLIZ3.append(str7);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        C1054104Ah c1054104Ah2 = d6().LLJLIL;
        if (c1054104Ah2 != null && (c03fi = c1054104Ah2.LJJIIJ) != null) {
            c03fi.LIZ(strLIZIZ2, new AwS245S0300000_1(this, (SeaShippingVH) linkedHashMap, (Map<String, Object>) r5, (PDPShippingModuleMeta) 23));
        }
    }

    public final void e6(String str, Map<String, ? extends Object> map, C807203Di c807203Di) {
        PDPShippingModuleMeta pDPShippingModuleMeta;
        String str2;
        PDPShippingModule pDPShippingModule;
        PDPShippingModule pDPShippingModule2;
        PDPShippingModuleMeta pDPShippingModuleMeta2;
        Float fLJIIIIZZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PDPLogisticModule pDPLogisticModule = c807203Di.LLILZ;
        if (pDPLogisticModule != null && (pDPShippingModule2 = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta2 = pDPShippingModule2.meta) != null) {
            String str3 = pDPShippingModuleMeta2.deliveryFlag;
            if (str3 != null) {
                linkedHashMap.put("delivery_flag", str3);
            }
            String str4 = pDPShippingModuleMeta2.freeShippingThresholdPrice;
            if (str4 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str4)) != null) {
                linkedHashMap.put("free_shipping_threshold", Float.valueOf(fLJIIIIZZ.floatValue()));
            }
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        String str5 = c807203Di.LLILZIL;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("sku_id", str5);
        PDPLogisticModule pDPLogisticModule2 = c807203Di.LLILZ;
        String str6 = null;
        if (pDPLogisticModule2 != null && (pDPShippingModule = pDPLogisticModule2.pdpShippingModule) != null) {
            pDPShippingModuleMeta = pDPShippingModule.meta;
        } else {
            pDPShippingModuleMeta = null;
        }
        C1054104Ah c1054104Ah = d6().LLJLIL;
        if (c1054104Ah != null) {
            C765002ym c765002ym = c807203Di.LL;
            PdpShipping pdpShipping = c807203Di.LLILLJJLI;
            if (pDPShippingModuleMeta != null) {
                str6 = pDPShippingModuleMeta.deliveryInfo;
                str2 = pDPShippingModuleMeta.edtType;
            } else {
                str2 = null;
            }
            C1054104Ah.LJJII(c1054104Ah, "logistics", c765002ym, pdpShipping, str, linkedHashMap, str6, str2, c807203Di.LLILLL, null, 256);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(View view, String str, ECRichTextExtraInfo eCRichTextExtraInfo) {
        HashMap<String, Object> mapLJIIJ;
        String str2;
        String str3 = str;
        if (str3 != null) {
            if (a0.LJJIIZI(str3, "ec/free_shipping_guide", false)) {
                d6().LLLLLLIL.LIZIZ(this.itemView.getContext(), C960603pE.LIZLLL(this.itemView));
                C765002ym c765002ym = ((C807203Di) this.LLILLJJLI).LL;
                if (c765002ym != null && (str2 = c765002ym.LJIIJJI) != null) {
                    mapLJIIJ = C1741890vQh.LJIIJ(str2);
                } else {
                    mapLJIIJ = null;
                }
                e6("free_shipping", mapLJIIJ, (C807203Di) this.LLILLJJLI);
            } else {
                Context context = this.itemView.getContext();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("intro_sheet_node_id", C960603pE.LIZLLL(this.itemView));
                C919503ib.LIZIZ(context, str3, linkedHashMap, false).open();
            }
        }
        return Unit.LIZ;
    }
}
