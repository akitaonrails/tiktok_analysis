package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C01D1;
import X.C01GW;
import X.C0DXR;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1548870qPN;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1712610ufT;
import X.C1714100uhs;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1192660h8q;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.n;
import com.ss.android.ugc.aweme.giftcard.checkout.cell.CashierCell;
import com.ss.android.ugc.aweme.giftcard.checkout.cell.SendHowCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS653S0100000_4;
import wh6.AbS705S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class GiftCardCheckoutAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 677));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 558));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 562));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 676));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 560));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 563));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 559));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 557));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 556));
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftCardCheckoutAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/giftcard/checkout/GiftCardCheckoutVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GiftCardCheckoutAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftCardCheckoutVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 561), AFwS268S0000000_26.get$arr$(320), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 675));
        this.LLJJIJIIJIL = new C1559260qg8(new C723580SZw(this, C1712610ufT.class, "GIFT_CARD_CHECKOUT_SOURCE_KEY"), checkSupervisorPrepared());
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(187));
    }

    public final InterfaceC1192660h8q Go() {
        return (InterfaceC1192660h8q) this.LLJJIJI.getValue();
    }

    public final GiftCardCheckoutVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (GiftCardCheckoutVM) assemVMLazy.getValue();
    }

    public final void Jo() {
        InterfaceC1192660h8q interfaceC1192660h8qGo;
        if (getContext() == null || (interfaceC1192660h8qGo = Go()) == null) {
            return;
        }
        interfaceC1192660h8qGo.LJIIIIZZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Lo(false);
    }

    public final void Lo(boolean z) {
        if (this.LLJJJIL) {
            return;
        }
        this.LLJJJIL = true;
        C1548870qPN c1548870qPN = new C1548870qPN();
        n nVar = new n();
        nVar.LJJII(Boolean.valueOf(z), "payment_completed");
        c1548870qPN.LJ("giftcard_checkout_closed", nVar.toString());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer numLIZJ;
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLIZLLLIL.getValue();
        C0OM1 c0om1 = new C0OM1();
        final int iIntValue = 0;
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1528));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = (String) this.LLJJIJIL.getValue();
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        C1714100uhs.LIZ.getClass();
        C1714100uhs.LIZLLL("back");
        ((RecyclerView) this.LLJ.getValue()).setLayoutManager(new LinearLayoutManager(LJJIJL().getContext(), 1, false));
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJIILJJIL(SendHowCell.class);
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJIILJJIL(CashierCell.class);
        RecyclerView recyclerView = (RecyclerView) this.LLJ.getValue();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        recyclerView.addItemDecoration(new C0DXR(iIntValue, iLIZIZ) { // from class: X.0EZ0
            public final int LL;
            public final int LLILLJJLI = 1;
            public final float LLILLL = 0.0f;
            public final float LLILZ = 0.0f;
            public final boolean LLILZIL = true;
            public final Paint LLILZLL;

            {
                this.LL = iLIZIZ;
                Paint paint = new Paint(1);
                paint.setColor(iIntValue);
                paint.setStyle(Paint.Style.FILL);
                this.LLILZLL = paint;
            }

            @Override // X.C0DXR
            public final void LIZLLL(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                int i;
                ViewGroup.MarginLayoutParams marginLayoutParams2;
                int i2;
                if (this.LLILLJJLI == 1) {
                    int measuredWidth = recyclerView2.getMeasuredWidth();
                    int childCount = recyclerView2.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = recyclerView2.getChildAt(i3);
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams instanceof RecyclerView.LayoutParams) {
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        } else {
                            marginLayoutParams2 = null;
                        }
                        int top = childAt.getTop();
                        if (marginLayoutParams2 != null) {
                            i2 = marginLayoutParams2.topMargin;
                        } else {
                            i2 = 0;
                        }
                        int i4 = top + i2;
                        int i5 = i4 - this.LL;
                        if (this.LLILZIL) {
                            canvas.drawRect(0 + this.LLILLL, i5, measuredWidth - this.LLILZ, i4, this.LLILZLL);
                        } else {
                            float f = i5;
                            float f2 = i4;
                            canvas.drawRect(0.0f, f, this.LLILLL, f2, this.LLILZLL);
                            float f3 = measuredWidth;
                            canvas.drawRect(f3 - this.LLILZ, f, f3, f2, this.LLILZLL);
                        }
                    }
                    return;
                }
                int measuredHeight = recyclerView2.getMeasuredHeight();
                int childCount2 = recyclerView2.getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = recyclerView2.getChildAt(i6);
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    if (layoutParams2 instanceof RecyclerView.LayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = null;
                    }
                    int left = childAt2.getLeft();
                    if (marginLayoutParams != null) {
                        i = marginLayoutParams.leftMargin;
                    } else {
                        i = 0;
                    }
                    int i7 = left + i;
                    int i8 = i7 - this.LL;
                    if (this.LLILZIL) {
                        canvas.drawRect(i8, 0 + this.LLILLL, i7, measuredHeight - this.LLILZ, this.LLILZLL);
                    } else {
                        float f4 = i8;
                        float f5 = this.LLILLL;
                        float f6 = i7;
                        canvas.drawRect(f4, 0 + f5, f6, f5, this.LLILZLL);
                        float f7 = measuredHeight;
                        canvas.drawRect(f4, f7 - this.LLILZ, f6, f7, this.LLILZLL);
                    }
                }
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                recyclerView2.getChildAdapterPosition(view2);
                if (this.LLILLJJLI == 1) {
                    rect.set(0, 0, 0, this.LL);
                } else {
                    rect.set(0, 0, this.LL, 0);
                }
            }
        });
        C786410Ut5.I7(new AbS705S0100000_26(this, 12), (View) this.LLJJ.getValue());
        GiftCardCheckoutVM giftCardCheckoutVMHo = Ho();
        C1712610ufT c1712610ufT = (C1712610ufT) this.LLJJIJIIJIL.getValue();
        giftCardCheckoutVMHo.LLILZ = c1712610ufT;
        C1714100uhs.LJI = giftCardCheckoutVMHo.LL;
        String str5 = null;
        if (c1712610ufT != null) {
            str = c1712610ufT.LLIZ;
            str2 = c1712610ufT.LLILZLL;
            str3 = c1712610ufT.LLILZIL;
            str4 = c1712610ufT.LLIZLLLIL;
            str5 = c1712610ufT.LLILLJJLI;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        C1714100uhs.LIZIZ = str;
        C1714100uhs.LIZJ = str2;
        C1714100uhs.LIZLLL = str3;
        C1714100uhs.LJFF = str4;
        C1714100uhs.LJ = str5;
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0ufP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1712550ufN) obj).LL;
            }
        }, this, null, new AwS605S0100000_26(this, 777), new AwS570S0100000_26(this, 1532), new AwS605S0100000_26(this, 778), 4, null);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0ufQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1712550ufN) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.0ufR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1712550ufN) obj).LLJ;
            }
        }, null, new AwS653S0100000_4(this, 23), 12);
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0ufS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1712550ufN) obj).LLILLJJLI;
            }
        }, this, null, new AwS605S0100000_26(this, 779), new AwS570S0100000_26(this, 1529), new AwS605S0100000_26(this, 774), 4, null);
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0ufO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1712550ufN) obj).LLILLL;
            }
        }, this, null, new AwS605S0100000_26(this, 775), new AwS570S0100000_26(this, 1530), new AwS605S0100000_26(this, 776), 4, null);
        Ho().vQ2();
    }
}
