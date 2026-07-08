package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion;

import X.C01GW;
import X.C038L;
import X.C03B0;
import X.C048X;
import X.C10515049h;
import X.C1054004Ag;
import X.C13BV;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1749000vcA;
import X.C1751560vgI;
import X.C1759650vtL;
import X.C1759820vtc;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.EnumC1759660vtM;
import X.EnumC1759800vta;
import X.EnumC2008407tq;
import X.InterfaceC1748810vbr;
import Y.AObjectS365S0200000_26;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.BorderStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAreas;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PromotionCardConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS110S1000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpDealsEntranceVH extends AbsFullSpanVH<USDealsEntranceVO> {
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public LinearLayout LLJJJJ;
    public final C01GW LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0vte, android.view.View, android.view.ViewGroup] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int value;
        C1054004Ag c1054004Ag;
        PdpComponentArea pdpComponentArea;
        PdpComponentArea pdpComponentArea2;
        PdpComponentArea pdpComponentArea3;
        Integer numLIZ;
        Integer numLIZ2;
        Integer numValueOf;
        Integer num;
        Integer num2;
        CustomColor customColor;
        String string;
        PopUpButtonExtraInfo popUpButtonExtraInfo;
        VoucherInfo voucherInfo;
        USDealsEntranceVO uSDealsEntranceVO = (USDealsEntranceVO) obj;
        View viewFindViewById = this.LLJJIJIL;
        HashMap<String, Object> mapLJIIJ = null;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.yy7);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIJIL = (TuxTextView) viewFindViewById;
        }
        c6((TuxTextView) viewFindViewById, uSDealsEntranceVO.title, uSDealsEntranceVO);
        View viewFindViewById2 = this.LLJJJ;
        if (viewFindViewById2 == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.yy5);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJ = (TuxTextView) viewFindViewById2;
        }
        c6((TuxTextView) viewFindViewById2, uSDealsEntranceVO.subTitle, uSDealsEntranceVO);
        View viewFindViewById3 = this.LLJJJIL;
        if (viewFindViewById3 == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.yy3);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJJIL = (TuxTextView) viewFindViewById3;
        }
        c6((TuxTextView) viewFindViewById3, uSDealsEntranceVO.actionText, uSDealsEntranceVO);
        final Context context = this.itemView.getContext();
        List<PdpComponentCard> list = uSDealsEntranceVO.cardList;
        View viewFindViewById4 = this.LLJJJJ;
        if (viewFindViewById4 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById4 = viewLJJIJL.findViewById(R.id.nca);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJJJ = (LinearLayout) viewFindViewById4;
        }
        C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById4);
        ((PdpViewModel) this.LLJJJJJIL.getValue()).LLLLL.LIZIZ.clear();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (PdpComponentCard pdpComponentCard : list) {
            C1759820vtc c1759820vtc = new C1759820vtc(context);
            Integer num3 = pdpComponentCard.cardType;
            if (num3 != null) {
                value = num3.intValue();
            } else {
                value = EnumC2008407tq.CARD_PROMOTION.getValue();
            }
            c1759820vtc.LIZ = Integer.valueOf(value);
            final HashMap map = new HashMap();
            Integer num4 = c1759820vtc.LIZ;
            int value2 = EnumC2008407tq.CARD_PROMOTION.getValue();
            if (num4 != null && num4.intValue() == value2) {
                ?? r9 = new ConstraintLayout(context, map) { // from class: X.0vte
                    public final Map<String, Object> LL;
                    public LinearLayout LLILLJJLI;
                    public LinearLayout LLILLL;
                    public LinearLayout LLILZ;
                    public final LinearLayout LLILZIL;
                    public final LinearLayout LLILZLL;
                    public final LinearLayout LLIZ;

                    public final LinearLayout getLeftAreaFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.mjd);
                            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
                        }
                        return (LinearLayout) callbackFindViewById;
                    }

                    public final LinearLayout getMiddleAreaFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILLL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.obt);
                            this.LLILLL = (LinearLayout) callbackFindViewById;
                        }
                        return (LinearLayout) callbackFindViewById;
                    }

                    public final LinearLayout getRightAreaFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILZ;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.tk6);
                            this.LLILZ = (LinearLayout) callbackFindViewById;
                        }
                        return (LinearLayout) callbackFindViewById;
                    }

                    public final Map<String, Object> getGlobalParams() {
                        return this.LL;
                    }

                    public final void setLeftAreaFromXml(LinearLayout linearLayout) {
                        this.LLILLJJLI = linearLayout;
                    }

                    public final void setMiddleAreaFromXml(LinearLayout linearLayout) {
                        this.LLILLL = linearLayout;
                    }

                    public final void setRightAreaFromXml(LinearLayout linearLayout) {
                        this.LLILZ = linearLayout;
                    }

                    {
                        super(context, null, 0);
                        this.LL = map;
                        C19ME c19me = new C19ME(-1, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(c19me);
                        C954703oH.LIZ(context, R.layout.ari, this, true);
                        this.LLILZIL = getLeftAreaFromXml();
                        this.LLILZLL = getMiddleAreaFromXml();
                        this.LLIZ = getRightAreaFromXml();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x0042 A[SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r1v10, types: [X.0vtf, X.0vth] */
                    /* JADX WARN: Type inference failed for: r1v11, types: [X.0vtd, X.0vth] */
                    /* JADX WARN: Type inference failed for: r1v16 */
                    /* JADX WARN: Type inference failed for: r1v17 */
                    /* JADX WARN: Type inference failed for: r1v18 */
                    /* JADX WARN: Type inference failed for: r1v19 */
                    /* JADX WARN: Type inference failed for: r1v3, types: [X.0vth] */
                    /* JADX WARN: Type inference failed for: r1v8, types: [X.0vth, X.0vtj] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void e0(android.view.ViewGroup r10, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentArea r11, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r12) {
                        /*
                            Method dump skipped, instruction units count: 296
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1759840vte.e0(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentArea, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel):void");
                    }

                    public final void h0(EnumC1759800vta enumC1759800vta, PdpComponentArea pdpComponentArea4, PdpViewModel pdpViewModel) {
                        int i = C1759790vtZ.LIZ[enumC1759800vta.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    if (pdpComponentArea4 != null) {
                                        C786410Ut5.LJZL(0, this.LLIZ);
                                        e0(this.LLIZ, pdpComponentArea4, pdpViewModel);
                                        return;
                                    } else {
                                        C786410Ut5.LJZL(8, this.LLIZ);
                                        return;
                                    }
                                }
                                throw new C1954807lC();
                            }
                            e0(this.LLILZLL, pdpComponentArea4, pdpViewModel);
                            return;
                        }
                        if (pdpComponentArea4 != null && pdpComponentArea4.components != null) {
                            C786410Ut5.LJZL(0, this.LLILZIL);
                            e0(this.LLILZIL, pdpComponentArea4, pdpViewModel);
                        } else {
                            C786410Ut5.LJZL(8, this.LLILZIL);
                        }
                    }
                };
                PdpViewModel pdpViewModel = (PdpViewModel) this.LLJJJJJIL.getValue();
                C1759650vtL.LIZ.getClass();
                Integer num5 = pdpComponentCard.bizType;
                int value3 = EnumC1759660vtM.BIZ_TYPE_COUPON.getValue();
                if (num5 != null && num5.intValue() == value3) {
                    PdpComponentAction pdpComponentAction = pdpComponentCard.action;
                    if (pdpComponentAction == null || (popUpButtonExtraInfo = pdpComponentAction.extraInfo) == null || (voucherInfo = popUpButtonExtraInfo.voucherInfo) == null || (string = voucherInfo.voucherTypeId) == null) {
                        string = pdpComponentCard.bizType.toString();
                    }
                    C1748720vbi.LJFF(r9, new C1751560vgI(), new AwS110S1000000_26(string, 1), new AwS392S0200000_26(pdpComponentCard, pdpViewModel, 116));
                } else {
                    int value4 = EnumC1759660vtM.BIZ_TYPE_CAMPAIGN.getValue();
                    if (num5 != null && num5.intValue() == value4) {
                        C1748720vbi.LJFF(r9, new C048X(), new AwS570S0100000_26(pdpComponentCard, 1281), new AwS605S0100000_26(pdpComponentCard, 536));
                    } else {
                        int value5 = EnumC1759660vtM.BIZ_TYPE_TASK.getValue();
                        if (num5 != null && num5.intValue() == value5 && pdpViewModel != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
                            String str = pdpComponentCard.daInfo;
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                            if (interfaceC1748810vbrLJJIJLIJ != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C1749000vcA(), new AwS109S1200000_26(c1054004Ag, (Integer) 1, str, 41));
                            }
                        }
                    }
                }
                C786410Ut5.I7(new AjS44S0200000_26(pdpComponentCard, pdpViewModel, 63), r9);
                PdpComponentAreas pdpComponentAreas = pdpComponentCard.areas;
                EnumC1759800vta enumC1759800vta = EnumC1759800vta.LEFT;
                if (pdpComponentAreas != null) {
                    pdpComponentArea = pdpComponentAreas.left;
                } else {
                    pdpComponentArea = null;
                }
                r9.h0(enumC1759800vta, pdpComponentArea, pdpViewModel);
                EnumC1759800vta enumC1759800vta2 = EnumC1759800vta.MIDDLE;
                if (pdpComponentAreas != null) {
                    pdpComponentArea2 = pdpComponentAreas.middle;
                } else {
                    pdpComponentArea2 = null;
                }
                r9.h0(enumC1759800vta2, pdpComponentArea2, pdpViewModel);
                EnumC1759800vta enumC1759800vta3 = EnumC1759800vta.RIGHT;
                if (pdpComponentAreas != null) {
                    pdpComponentArea3 = pdpComponentAreas.right;
                } else {
                    pdpComponentArea3 = null;
                }
                r9.h0(enumC1759800vta3, pdpComponentArea3, pdpViewModel);
                PromotionCardConfig promotionCardConfig = pdpComponentCard.cardConfig;
                if (promotionCardConfig != null) {
                    CustomColor customColor2 = promotionCardConfig.backgroundColor;
                    if (customColor2 != null) {
                        numLIZ = C038L.LIZ(customColor2, r9.getContext(), Boolean.TRUE);
                    } else {
                        numLIZ = null;
                    }
                    BorderStyle borderStyle = promotionCardConfig.borderStyle;
                    if (borderStyle != null && (customColor = borderStyle.borderColor) != null) {
                        numLIZ2 = C038L.LIZ(customColor, r9.getContext(), Boolean.TRUE);
                    } else {
                        numLIZ2 = null;
                    }
                    BorderStyle borderStyle2 = promotionCardConfig.borderStyle;
                    if (borderStyle2 != null && (num2 = borderStyle2.borderWidth) != null) {
                        numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2)));
                    } else {
                        numValueOf = null;
                    }
                    BorderStyle borderStyle3 = promotionCardConfig.borderStyle;
                    if (borderStyle3 != null) {
                        num = borderStyle3.borderRadius;
                    } else {
                        num = null;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    if (numLIZ != null) {
                        gradientDrawable.setColor(numLIZ.intValue());
                    }
                    if (num != null && num.intValue() > 0) {
                        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(num));
                    }
                    r9.setBackground(gradientDrawable);
                    int iIntValue = 0;
                    View childAt = r9.getChildAt(0);
                    if (childAt != null) {
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        if (num != null && num.intValue() > 0) {
                            gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(num));
                        }
                        if (numValueOf != null && numValueOf.intValue() != 0) {
                            int iIntValue2 = numValueOf.intValue();
                            if (numLIZ2 != null) {
                                iIntValue = numLIZ2.intValue();
                            }
                            gradientDrawable2.setStroke(iIntValue2, iIntValue);
                        }
                        childAt.setForeground(gradientDrawable2);
                    }
                }
                View viewFindViewById5 = this.LLJJJJ;
                if (viewFindViewById5 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById5 = viewLJJIJL2.findViewById(R.id.nca);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LLJJJJ = (LinearLayout) viewFindViewById5;
                }
                ((ViewGroup) viewFindViewById5).addView(r9);
            }
        }
        String str2 = uSDealsEntranceVO.daInfo;
        if (str2 != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str2);
        }
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS215S0000000_26.get$arr$(540), new AwS580S0100000_1((HashMap) mapLJIIJ, (HashMap<String, Object>) 992));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpDealsEntranceVH(ViewGroup viewGroup, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.arm, viewGroup, false);
        }
        super(view);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1609));
    }

    public final void c6(TuxTextView tuxTextView, ECRichText eCRichText, USDealsEntranceVO uSDealsEntranceVO) {
        if (eCRichText != null) {
            C03B0 c03b0 = new C03B0(tuxTextView, "PdpCouponPromotion_content");
            C03B0.LIZ(c03b0, eCRichText, new AObjectS365S0200000_26(this, uSDealsEntranceVO, 0), null, false, null, null, 124);
            tuxTextView.setText(c03b0.LIZJ);
        }
    }
}
