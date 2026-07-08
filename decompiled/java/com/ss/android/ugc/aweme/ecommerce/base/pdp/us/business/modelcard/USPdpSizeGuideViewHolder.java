package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.modelcard;

import X.C01GW;
import X.C0H9H;
import X.C10515049h;
import X.C1308910kAL;
import X.C13LP;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.C958103op;
import X.C999003vQ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelFigure;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class USPdpSizeGuideViewHolder extends AbsFullSpanVH<C999003vQ> {
    public final ECBaseFragment LLJJIJIL;
    public LinearLayout LLJJJ;
    public ConstraintLayout LLJJJIL;
    public ConstraintLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout c6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nfb) : null;
            this.LLJJJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView d6() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.yyy) : null;
            this.LLJJJJJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        ModelInfo modelInfo;
        List<ModelFigure> list;
        List<ModelFigure> list2;
        List<ModelFigure> list3;
        ModelInfo modelInfo2;
        C999003vQ c999003vQ = (C999003vQ) obj;
        C786410Ut5.LJJJJJL(c6());
        if (c999003vQ.LL != null) {
            View viewFindViewById = this.LLJJJIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.q79);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJJIL = (ConstraintLayout) viewFindViewById;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            View viewFindViewById2 = this.LLJJJJ;
            if (viewFindViewById2 == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.q78);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJJJ = (ConstraintLayout) viewFindViewById2;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            d6().setText(c999003vQ.LLILLL);
            d6().setTuxFont(52);
            View viewFindViewById3 = this.LLJJJJLIIL;
            if (viewFindViewById3 == null) {
                View view2 = this.itemView;
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.yyz);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJJJLIIL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(c999003vQ.LL.sizeInformationTitle);
            View viewFindViewById4 = this.LLJJL;
            if (viewFindViewById4 == null) {
                View view3 = this.itemView;
                if (view3 != null) {
                    viewFindViewById4 = view3.findViewById(R.id.yzb);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJJL = (TuxTextView) viewFindViewById4;
            }
            TextView textView = (TextView) viewFindViewById4;
            List<ModelInfo> list4 = c999003vQ.LL.modelInfos;
            if (list4 != null && (modelInfo2 = (ModelInfo) C13LP.LJJJLL(list4)) != null) {
                str = modelInfo2.wearsSize;
            } else {
                str = null;
            }
            textView.setText(str);
            if (c999003vQ.LLILLJJLI == null && c999003vQ.LLILZ == null) {
                View viewFindViewById5 = this.LLJJJIL;
                if (viewFindViewById5 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById5 = viewLJJIJL2.findViewById(R.id.q79);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LLJJJIL = (ConstraintLayout) viewFindViewById5;
                }
                C0H9H.LJI(C958103op.LIZJ, viewFindViewById5);
            }
            List<ModelInfo> list5 = c999003vQ.LL.modelInfos;
            if (list5 != null && (modelInfo = (ModelInfo) C13LP.LJJJLL(list5)) != null && (list = modelInfo.modelFigures) != null) {
                int i = 0;
                for (ModelFigure modelFigure : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ModelFigure modelFigure2 = modelFigure;
                        C01GW c01gw = C954703oH.LIZ;
                        View viewLIZ = C954703oH.LIZ(this.itemView.getContext(), R.layout.atg, c6(), false);
                        if (i == 0) {
                            viewLIZ.setPadding(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                        } else {
                            ModelInfo modelInfo3 = (ModelInfo) C13LP.LJJJLL(c999003vQ.LL.modelInfos);
                            if (modelInfo3 != null && (list2 = modelInfo3.modelFigures) != null && i == list2.size() - 1) {
                                viewLIZ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0, 0);
                            } else {
                                viewLIZ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                            }
                        }
                        ((TextView) viewLIZ.findViewById(R.id.yyc)).setText(modelFigure2.name);
                        ((TextView) viewLIZ.findViewById(R.id.yyd)).setText(modelFigure2.value);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.weight = 1.0f;
                        c6().addView(viewLIZ, layoutParams);
                        ModelInfo modelInfo4 = (ModelInfo) C13LP.LJJJLL(c999003vQ.LL.modelInfos);
                        if (modelInfo4 == null || (list3 = modelInfo4.modelFigures) == null || i != list3.size() - 1) {
                            LinearLayout linearLayoutC6 = c6();
                            View view4 = new View(this.itemView.getContext());
                            C786410Ut5.W5(view4, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41))));
                            view4.setBackground(C1308910kAL.LJ(R.attr.ng, view4.getContext()));
                            linearLayoutC6.addView(view4);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(348), AFwS228S0000000_1.get$arr$(672));
        C786410Ut5.I7(new AjS60S0100000_1(this, 99), d6());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public USPdpSizeGuideViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.b34, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1375));
    }
}
