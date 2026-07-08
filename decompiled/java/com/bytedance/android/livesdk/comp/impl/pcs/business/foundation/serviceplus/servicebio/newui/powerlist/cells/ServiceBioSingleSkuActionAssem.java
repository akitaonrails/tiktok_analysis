package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.AbstractC1781930wTH;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C1143680frq;
import X.C1158740gG8;
import X.C1324610kZf;
import X.C13LE;
import X.C13LP;
import X.C1546210qL5;
import X.C1558850qfT;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1781870wTB;
import X.C1819620xS4;
import X.C1823290xXz;
import X.C1825600xbi;
import X.C1825640xbm;
import X.C1836840xtq;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C384050F3z;
import X.C426750GoL;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1785280wYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1785270wYf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class ServiceBioSingleSkuActionAssem extends ServiceBioBaseAssemCell implements InterfaceC712990Rxx<C1781870wTB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public C1836840xtq LLJLIL;
    public ImageView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public LinearLayout LLJLLL;
    public final int LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ServiceBioSingleSkuActionAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ServiceBioSingleSkuActionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1558850qfT(c19719912DlLIZ), null, new C1825640xbm());
        this.LLJZ = R.layout.gv2;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ImageView op() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l7s) : null;
            this.LLJLILLLLZIIL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final LinearLayout sp() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oim) : null;
            this.LLJLLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C1836840xtq tp() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.keu) : null;
            this.LLJLIL = (C1836840xtq) viewFindViewById;
        }
        return (C1836840xtq) viewFindViewById;
    }

    public final TuxTextView up() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z87) : null;
            this.LLJLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell
    public final int getLayoutId() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1781870wTB c1781870wTB) {
        final AbstractC1781930wTH abstractC1781930wTH;
        ImageView imageViewOp;
        EnumC1785280wYg itemType;
        EnumC1785280wYg itemType2;
        View childAt;
        View childAt2;
        C1781870wTB c1781870wTB2 = c1781870wTB;
        C1158740gG8.LIZIZ(getContentView(), String.valueOf(c1781870wTB2.hashCode()), new C1825600xbi(this, c1781870wTB2));
        View contentView = getContentView();
        C384050F3z c384050F3z = new C384050F3z();
        C1546210qL5.LIZ.getClass();
        c384050F3z.LJIIIIZZ = Float.valueOf(C1546210qL5.LIZ(22));
        c384050F3z.LJIIIZ = Float.valueOf(C1546210qL5.LIZ(22));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.exx);
        contentView.setBackground(c384050F3z.LIZ(getContentView().getContext()));
        Object obj = c1781870wTB2.LLJIJIL;
        View viewFindViewById = null;
        if (obj instanceof AbstractC1781930wTH) {
            abstractC1781930wTH = (AbstractC1781930wTH) obj;
        } else {
            abstractC1781930wTH = null;
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xbe
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                AbstractC1781930wTH abstractC1781930wTH2;
                C1823210xXr c1823210xXr;
                C1825780xc0 c1825780xc0;
                if (view != null && (abstractC1781930wTH2 = abstractC1781930wTH) != null && (c1823210xXr = ((C1823290xXz) this.LLJJLIIIJLLLLLLLZ.getValue()).LL) != null && (c1825780xc0 = c1823210xXr.LIZIZ) != null) {
                    c1825780xc0.LIZ(this.getContentView().getContext(), abstractC1781930wTH2, EnumC1420700n4e.FEATURE_LIST);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, getContentView());
        ImageView imageViewOp2 = op();
        if (imageViewOp2 != null) {
            C500260Jjc.LJIILIIL(imageViewOp2);
        }
        C1836840xtq c1836840xtqTp = tp();
        if (c1836840xtqTp != null) {
            C500260Jjc.LJIILIIL(c1836840xtqTp);
        }
        ImageView imageViewOp3 = op();
        if (imageViewOp3 != null) {
            imageViewOp3.setImageDrawable(null);
        }
        ImageView imageViewOp4 = op();
        if (imageViewOp4 != null) {
            imageViewOp4.setBackground(null);
        }
        ImageView imageViewOp5 = op();
        if (imageViewOp5 != null) {
            C426750GoL.LJIIL(imageViewOp5, 0, 0, 0, 0, 16);
        }
        ImageView imageViewOp6 = op();
        if (imageViewOp6 != null) {
            ViewGroup.LayoutParams layoutParams = imageViewOp6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(80));
                layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(80));
                C786410Ut5.W5(imageViewOp6, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (c1781870wTB2.LLILLL != null) {
            C500260Jjc.LJLJLJ(op(), true);
            C1143680frq.LJ(op(), "tiktok_live_subscription_demand_1", c1781870wTB2.LLILLL, ImageView.ScaleType.FIT_XY);
        } else {
            String str = c1781870wTB2.LLILZ;
            if (str != null && !a0.LJJJIL(str)) {
                String str2 = c1781870wTB2.LLILZ;
                if (str2 != null && (imageViewOp = op()) != null) {
                    C500260Jjc.LLFFF(imageViewOp);
                    C426750GoL.LJIIL(imageViewOp, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(8))), 16);
                    C1324610kZf url = C1819620xS4.LIZ().setUrl(str2);
                    url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    url.LJIJI(Float.valueOf(C1546210qL5.LIZ(20)));
                    int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ey9, imageViewOp.getContext());
                    float fLIZ = C1546210qL5.LIZ(1);
                    url.LJJIIJ = iLIZIZ;
                    url.LJJIII = fLIZ;
                    url.LJJI(imageViewOp);
                }
            } else if (c1781870wTB2.LLILZIL != null) {
                C500260Jjc.LJLJLJ(tp(), true);
                C1836840xtq c1836840xtqTp2 = tp();
                if (c1836840xtqTp2 != null) {
                    C1836840xtq.i0(c1836840xtqTp2, c1781870wTB2.LLILZIL, false, true, 2);
                }
                C1836840xtq c1836840xtqTp3 = tp();
                if (c1836840xtqTp3 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xbf
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view) {
                            AbstractC1781930wTH abstractC1781930wTH2;
                            C1823210xXr c1823210xXr;
                            C1825780xc0 c1825780xc0;
                            if (view != null && (abstractC1781930wTH2 = abstractC1781930wTH) != null && (c1823210xXr = ((C1823290xXz) this.LLJJLIIIJLLLLLLLZ.getValue()).LL) != null && (c1825780xc0 = c1823210xXr.LIZIZ) != null) {
                                c1825780xc0.LIZ(this.getContentView().getContext(), abstractC1781930wTH2, EnumC1420700n4e.FEATURE_LIST);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, c1836840xtqTp3);
                }
            }
        }
        C426750GoL.LJIIL(getContentView(), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(64))), 23);
        if (c1781870wTB2.LLJILJIL) {
            EnumC1785280wYg enumC1785280wYg = EnumC1785280wYg.CALENDLY;
            List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1785280wYg.COURSE, enumC1785280wYg);
            InterfaceC1785270wYf interfaceC1785270wYf = c1781870wTB2.LLJIJIL;
            if (interfaceC1785270wYf != null) {
                itemType = interfaceC1785270wYf.getItemType();
            } else {
                itemType = null;
            }
            if (C13LP.LJJJJ(itemType, listLJIIJJI)) {
                C500260Jjc.LLFFF(sp());
                InterfaceC1785270wYf interfaceC1785270wYf2 = c1781870wTB2.LLJIJIL;
                if (interfaceC1785270wYf2 != null) {
                    itemType2 = interfaceC1785270wYf2.getItemType();
                } else {
                    itemType2 = null;
                }
                if (itemType2 == enumC1785280wYg) {
                    LinearLayout linearLayoutSp = sp();
                    if (linearLayoutSp != null && (childAt2 = linearLayoutSp.getChildAt(1)) != null) {
                        C426750GoL.LJIIIZ(childAt2, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(63))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(63))), 0, false, 16);
                    }
                } else {
                    LinearLayout linearLayoutSp2 = sp();
                    if (linearLayoutSp2 != null && (childAt = linearLayoutSp2.getChildAt(1)) != null) {
                        C426750GoL.LJIIIZ(childAt, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(113))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(113))), 0, false, 16);
                    }
                }
                View view = this.LLJLL;
                if (view == null) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        viewFindViewById = viewLJJIJL.findViewById(R.id.z88);
                    }
                    this.LLJLL = (TuxTextView) viewFindViewById;
                    view = viewFindViewById;
                }
                C500260Jjc.LJIILIIL(view);
                C500260Jjc.LJIILIIL(up());
                return;
            }
        }
        C500260Jjc.LJIILIIL(sp());
        View view2 = this.LLJLL;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.z88);
            }
            this.LLJLL = (TuxTextView) viewFindViewById;
            view2 = viewFindViewById;
        }
        TextView textView = (TextView) view2;
        if (textView != null) {
            textView.setText(c1781870wTB2.LL);
        }
        String str3 = c1781870wTB2.LLILLJJLI;
        if (str3 != null && !a0.LJJJIL(str3)) {
            TuxTextView tuxTextViewUp = up();
            if (tuxTextViewUp != null) {
                C786410Ut5.LLLLZLL(tuxTextViewUp, 0);
            }
            TuxTextView tuxTextViewUp2 = up();
            if (tuxTextViewUp2 == null) {
                return;
            }
            tuxTextViewUp2.setText(c1781870wTB2.LLILLJJLI);
            return;
        }
        TuxTextView tuxTextViewUp3 = up();
        if (tuxTextViewUp3 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextViewUp3, 8);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1781870wTB c1781870wTB) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1781870wTB c1781870wTB) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
