package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc;

import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C0DXR;
import X.C1192680h8s;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1709250ua3;
import X.C1709640uag;
import X.C1710260ubg;
import X.C1710270ubh;
import X.C1710390ubt;
import X.C1710400ubu;
import X.C1710450ubz;
import X.C1710760ucU;
import X.C1775690wJD;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C413040GHm;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1709240ua2;
import X.EnumC1710410ubv;
import X.EnumC1710490uc3;
import X.EnumC995340c0a;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCBillingStateElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCCardNumberElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCDateElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCDefaultBillingAddressSwitchViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCNfcScanTipsViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCNormalElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCRealBindHintViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.DividerLineViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.SaveNewCardViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.SecurityInfoViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.SpacerViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.TitleViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.TextStyle;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS640S0100000_26;
import wh6.AbS705S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCAddCardAssem extends UIContentAssem {
    public static final C1710760ucU LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static C1709640uag LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C197039127h LLJ;
    public View LLJI;
    public FrameLayout LLJIJIL;
    public LinearLayout LLJILJIL;
    public AppCompatImageView LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ucU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCAddCardAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = new Object() { // from class: X.0ucU
        };
    }

    public CCDCAddCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 835), AFwS268S0000000_26.get$arr$(397), null, true);
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 834));
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ckd) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final CCDCAddCardViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jo() {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardAssem.Jo():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1709240ua2 enumC1709240ua2LIZIZ;
        int i;
        C1192680h8s c1192680h8s;
        ViewGroup viewGroup;
        POConfiguration.CCDCBindType cCDCBindType;
        boolean z;
        Context context;
        String string;
        Context applicationContext;
        TextStyle textStyle;
        String string2;
        POConfiguration pOConfiguration;
        PaymentOption paymentOptionLJ;
        PaymentOption paymentOption;
        C1709640uag c1709640uag = LLJJIJI;
        EnumC1709240ua2 enumC1709240ua2LIZIZ2 = null;
        if (c1709640uag != null) {
            CCDCAddCardViewModel cCDCAddCardViewModelHo = Ho();
            cCDCAddCardViewModelHo.LLILLJJLI = c1709640uag;
            List<PaymentOption> listLJIIIIZZ = c1709640uag.LIZJ.LJIIIIZZ();
            if (listLJIIIIZZ != null && (paymentOption = (PaymentOption) C13LP.LJJJLZIJ(0, listLJIIIIZZ)) != null) {
                paymentOptionLJ = PaymentOption.LJ(paymentOption, null, null, null, null, null, null, 536870911);
            } else {
                paymentOptionLJ = null;
            }
            cCDCAddCardViewModelHo.LLILZLL = paymentOptionLJ;
            C1710390ubt c1710390ubt = new C1710390ubt(c1709640uag.LJIIIIZZ, EnumC995340c0a.ELEMENT);
            cCDCAddCardViewModelHo.LLILLL = c1710390ubt;
            EnumC1710490uc3 enumC1710490uc3 = EnumC1710490uc3.CARD_NUMBER;
            ((ArrayList) c1710390ubt.LIZJ).add(new C1710400ubu(enumC1710490uc3, null, new C1710260ubg(cCDCAddCardViewModelHo), EnumC1710410ubv.CARD_UNSUPPORTED));
            C1710390ubt c1710390ubt2 = cCDCAddCardViewModelHo.LLILLL;
            if (c1710390ubt2 != null) {
                ((ArrayList) c1710390ubt2.LIZJ).add(new C1710400ubu(enumC1710490uc3, null, new C1710270ubh(cCDCAddCardViewModelHo), EnumC1710410ubv.CARD_INVALID));
            }
            C1710390ubt c1710390ubt3 = cCDCAddCardViewModelHo.LLILLL;
            if (c1710390ubt3 != null) {
                ((ArrayList) c1710390ubt3.LIZJ).add(new C1710400ubu(EnumC1710490uc3.EXPIRATION_DATE, null, new C1710450ubz(cCDCAddCardViewModelHo), EnumC1710410ubv.DATE_HAS_BEEN_EXPIRED));
            }
        }
        Ho().LL = C724240Sb0.LIZ(this);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gMH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159290gH1) obj).LLILLJJLI;
            }
        }, null, AnonymousClass0208.get$arr$(25), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gML
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159290gH1) obj).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 49), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gLp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159290gH1) obj).LL;
            }
        }, null, AFwS285S0000000_2.get$arr$(37), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gQD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159290gH1) obj).LLILZLL);
            }
        }, null, new AwS616S0100000_2(this, 85), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gLq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159290gH1) obj).LLILZIL;
            }
        }, null, new AwS640S0100000_26(this, 82), 6);
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.qjt);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 2);
        gridLayoutManager.LLIZ = new C1775690wJD(viewOnAttachStateChangeListenerC20604515jv, 1);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(gridLayoutManager);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.19b8
            public static final /* synthetic */ int LLILLL = 0;
            public final int LL = -1;
            public final Paint LLILLJJLI = new Paint();

            @Override // X.C0DXR
            public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                C21569319b9 c21569319b9;
                int bottom;
                int bottom2;
                for (View view2 : new C2500209qy(recyclerView, 30)) {
                    if (view2.getTag(R.id.qi5) != null) {
                        Object tag = view2.getTag(R.id.qi5);
                        if ((tag instanceof C21569319b9) && (c21569319b9 = (C21569319b9) tag) != null) {
                            int left = view2.getLeft();
                            int right = view2.getRight();
                            if (c21569319b9.LJIIIIZZ) {
                                if (c21569319b9.LJ == 48) {
                                    bottom2 = view2.getTop() - c21569319b9.LIZ;
                                } else {
                                    bottom2 = view2.getBottom();
                                }
                                int i2 = c21569319b9.LIZ + bottom2;
                                this.LLILLJJLI.setColor(0);
                                canvas.drawRect(left, bottom2, right, i2, this.LLILLJJLI);
                            }
                            if (c21569319b9.LJI) {
                                if (c21569319b9.LIZLLL == 48) {
                                    bottom = view2.getTop() - c21569319b9.LJFF;
                                } else {
                                    bottom = view2.getBottom();
                                }
                                int i3 = c21569319b9.LJFF + bottom;
                                this.LLILLJJLI.setColor(this.LL);
                                float f = c21569319b9.LJII;
                                canvas.drawRect(left + f, bottom, right - f, i3, this.LLILLJJLI);
                            }
                        }
                    }
                }
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                C21569319b9 c21569319b9;
                int i2;
                int i3;
                int i4;
                int i5;
                Object tag = view2.getTag(R.id.qi5);
                if ((tag instanceof C21569319b9) && (c21569319b9 = (C21569319b9) tag) != null) {
                    int i6 = 0;
                    if (c21569319b9.LJIIIIZZ) {
                        if (c21569319b9.LJ == 48) {
                            i6 = c21569319b9.LIZ;
                            i2 = 0;
                        } else {
                            i2 = c21569319b9.LIZ;
                        }
                        i3 = c21569319b9.LIZJ;
                        i4 = c21569319b9.LIZIZ;
                    } else {
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                    }
                    if (c21569319b9.LJI) {
                        int i7 = c21569319b9.LIZLLL;
                        if (i7 == 48) {
                            int i8 = c21569319b9.LJFF;
                            if (i6 < i8) {
                                i6 = i8;
                            }
                        } else if (i7 == 80 && i2 < (i5 = c21569319b9.LJFF)) {
                            i2 = i5;
                        }
                    }
                    rect.set(i3, i6, i4, i2);
                }
            }
        });
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(CCDCCardNumberElementViewHolder.class, CCDCNormalElementViewHolder.class, CCDCDateElementViewHolder.class, SaveNewCardViewHolder.class, SecurityInfoViewHolder.class, CCDCRealBindHintViewHolder.class, SpacerViewHolder.class, CCDCNfcScanTipsViewHolder.class, CCDCBillingStateElementViewHolder.class, DividerLineViewHolder.class, TitleViewHolder.class, CCDCDefaultBillingAddressSwitchViewHolder.class);
        Ho().LLJI = new AwS605S0100000_26(this, 491);
        C197039127h c197039127hGo = Go();
        c197039127hGo.setEnabled(Ho().zQ2());
        C786410Ut5.I7(new AbS705S0100000_26(this, 5, 42), c197039127hGo);
        C1709640uag c1709640uag2 = LLJJIJI;
        if (c1709640uag2 != null) {
            PaymentOption paymentOptionEQ2 = Ho().EQ2();
            if (paymentOptionEQ2 != null && (pOConfiguration = paymentOptionEQ2.config) != null) {
                cCDCBindType = pOConfiguration.bindType;
            } else {
                cCDCBindType = null;
            }
            if (cCDCBindType == POConfiguration.CCDCBindType.REAL) {
                z = true;
            } else {
                z = false;
            }
            if (c1709640uag2.LJII) {
                Context context2 = getContext();
                if (context2 != null) {
                    string2 = context2.getString(2131857117);
                } else {
                    string2 = null;
                }
                c197039127hGo.setText(string2);
            } else if (z) {
                CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo = c1709640uag2.LJIIIIZZ.LIZJ;
                if ((globalDisplayInfo == null || (textStyle = globalDisplayInfo.textStyle) == null || (string = textStyle.ccdcCtaButtonText) == null) && ((context = getContext()) == null || (string = context.getString(2131857120)) == null)) {
                    IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpi$default(IAppContextManagerService.class, false, false, false, 14, null);
                    if (iAppContextManagerService != null && (applicationContext = iAppContextManagerService.getApplicationContext()) != null) {
                        string = applicationContext.getString(2131857120);
                    } else {
                        string = null;
                    }
                }
                c197039127hGo.setText(string);
            }
        }
        C1709640uag c1709640uag3 = LLJJIJI;
        if (c1709640uag3 != null) {
            enumC1709240ua2LIZIZ = c1709640uag3.LIZIZ();
        } else {
            enumC1709240ua2LIZIZ = null;
        }
        if (enumC1709240ua2LIZIZ == null) {
            i = -1;
        } else {
            i = C1709250ua3.LIZ[enumC1709240ua2LIZIZ.ordinal()];
        }
        if (i == 1) {
            View viewFindViewById2 = this.LLJILJIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.y5l);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJIL = (LinearLayout) viewFindViewById2;
            }
            C337180DJs.LIZJ(viewFindViewById2);
            View viewFindViewById3 = this.LLJILJILJ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById3 = viewLJJIJL3.findViewById(R.id.y5n);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILJILJ = (AppCompatImageView) viewFindViewById3;
            }
            ((AppCompatImageView) viewFindViewById3).setImageDrawable(new C413040GHm());
        } else {
            View viewFindViewById4 = this.LLJILJIL;
            if (viewFindViewById4 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById4 = viewLJJIJL4.findViewById(R.id.y5l);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILJIL = (LinearLayout) viewFindViewById4;
            }
            C337180DJs.LIZ(viewFindViewById4);
        }
        View viewFindViewById5 = this.LLJIJIL;
        if (viewFindViewById5 == null) {
            View viewLJJIJL5 = LJJIJL();
            if (viewLJJIJL5 != null) {
                viewFindViewById5 = viewLJJIJL5.findViewById(R.id.wor);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJIJIL = (FrameLayout) viewFindViewById5;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById5;
        C1709640uag c1709640uag4 = LLJJIJI;
        if (c1709640uag4 != null && (c1192680h8s = c1709640uag4.LJFF) != null) {
            ViewParent parent = c1192680h8s.LIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1192680h8s.LIZ, viewGroup);
            }
            C786410Ut5.LJJJJIZL(frameLayout);
            frameLayout.addView(c1192680h8s.LIZ, new FrameLayout.LayoutParams(-1, -2));
            C337180DJs.LIZJ(frameLayout);
            c1192680h8s.LIZIZ.invoke(null);
        } else {
            C337180DJs.LIZ(frameLayout);
        }
        C1709640uag c1709640uag5 = LLJJIJI;
        if (c1709640uag5 != null) {
            enumC1709240ua2LIZIZ2 = c1709640uag5.LIZIZ();
        }
        if (enumC1709240ua2LIZIZ2 == EnumC1709240ua2.TOKO) {
            Context context3 = getContext();
            if (context3 != null) {
                Go().LJJJJL(new AwS580S0100000_1(context3, 435));
            }
        } else {
            Go().setButtonVariant(0);
        }
        Jo();
    }
}
