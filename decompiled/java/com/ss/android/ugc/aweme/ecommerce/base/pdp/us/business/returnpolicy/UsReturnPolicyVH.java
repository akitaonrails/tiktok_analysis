package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy;

import X.C01GW;
import X.C03K9;
import X.C03KA;
import X.C03KE;
import X.C03KF;
import X.C10515049h;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1697810uHb;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C7736030k;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.List;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS36S0301000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsReturnPolicyVH extends AbsFullSpanVH<C03KE> {
    public final ECBaseFragment LLJJIJIL;
    public TuxIconView LLJJJ;
    public LinearLayout LLJJJIL;
    public TuxIconView LLJJJJ;
    public ConstraintLayout LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxIconView c6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ml6) : null;
            this.LLJJJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final LinearLayout d6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oc0) : null;
            this.LLJJJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH
    public final boolean W5() {
        return Intrinsics.LJFF(X5().LLILLL, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [X.03Dx] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r24v0, types: [kotlin.jvm.functions.Function1] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        Icon icon;
        List<LinkRichText> list;
        int iLIZJ;
        boolean z;
        Integer num;
        Icon icon2;
        Image icon3;
        C03KE c03ke = (C03KE) obj;
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ulj);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJJJIL = (ConstraintLayout) viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        if (constraintLayout != null) {
            C03KA.LIZ(c03ke.LLILZIL, constraintLayout);
        }
        PDPReturnPolicyModule pDPReturnPolicyModule = c03ke.LLILLJJLI;
        if (pDPReturnPolicyModule != null && (icon2 = pDPReturnPolicyModule.descriptionListIcon) != null) {
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
        if (d6().getChildCount() > 0) {
            C786410Ut5.LJJJJJL(d6());
        }
        PDPReturnPolicyModule pDPReturnPolicyModule2 = c03ke.LLILLJJLI;
        if (pDPReturnPolicyModule2 != null && (list = pDPReturnPolicyModule2.descriptionList) != null) {
            int i = 0;
            boolean z2 = false;
            for (LinkRichText linkRichText : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    LinkRichText linkRichText2 = linkRichText;
                    Integer num2 = linkRichText2.textFontType;
                    if (num2 != null) {
                        iLIZJ = C7736030k.LIZJ(Integer.valueOf(num2.intValue()), null);
                    } else {
                        iLIZJ = 51;
                    }
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C03K9 c03k9 = new C03K9(this.itemView.getContext());
                    if (!z2) {
                        num = null;
                        C426750GoL.LJIIL(c03k9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 29);
                    } else if (z) {
                        num = null;
                        C426750GoL.LJIIL(c03k9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, 29);
                    } else {
                        num = null;
                        C426750GoL.LJIIL(c03k9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, 29);
                    }
                    SpannableStringBuilder spannableStringBuilderLJ = RichTextUtil.LJ(RichTextUtil.LIZ, this.itemView.getContext(), linkRichText2, num, 0, false, num, num, num, num, false, false, num, new AwS545S0100000_1(c03k9, 1582), num, 12284);
                    if (spannableStringBuilderLJ != null) {
                        new AwS36S0301000_1(iLIZJ, spannableStringBuilderLJ, linkRichText2, this, 9).invoke(c03k9.getComTextFromXml());
                        d6().addView(c03k9);
                        z2 = true;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        View viewFindViewById2 = this.LLJJJJ;
        if (viewFindViewById2 == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.tkb);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJJ = (TuxIconView) viewFindViewById2;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById2;
        PDPReturnPolicyModule pDPReturnPolicyModule3 = c03ke.LLILLJJLI;
        if (pDPReturnPolicyModule3 != null && (icon = pDPReturnPolicyModule3.descriptionListArrow) != null) {
            C786410Ut5.LJLLLLLL(0, tuxIconView);
            C03KA.LIZIZ(tuxIconView, icon, this.itemView.getContext());
        } else {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
            tuxIconView.LIZ();
        }
        C03KF c03kf = new Object() { // from class: X.03KF
        };
        PdpViewModel pdpViewModel = (PdpViewModel) this.LLJJJJLIIL.getValue();
        View view3 = this.itemView;
        c03kf.getClass();
        String str = c03ke.LLILZ;
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("return_policy_");
        sbLIZ.append(str);
        C1748720vbi.LJFF(view3, new C10515049h(), new AwS86S1000000_1(C2188811AlT.LIZIZ(sbLIZ), 18), new AwS367S0200000_1(c03ke, pdpViewModel, 222));
        C786410Ut5.I7(new AjS40S0200000_1(this, c03ke, 48), this.itemView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UsReturnPolicyVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.b39, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1379));
    }
}
