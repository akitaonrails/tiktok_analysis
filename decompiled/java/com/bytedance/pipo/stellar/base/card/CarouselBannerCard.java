package com.bytedance.pipo.stellar.base.card;

import X.AbstractC1720840usk;
import X.AbstractC20628015ni;
import X.AbstractC712240Rwk;
import X.C01GW;
import X.C098200Yq;
import X.C1173220gdU;
import X.C1720940usu;
import X.C1721080ut8;
import X.C1721420utg;
import X.C189200o6;
import X.C20600815jK;
import X.C20627315nb;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1720670usT;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnAttachStateChangeListenerC785980UsO;
import Y.ARunnableS17S0100100_12;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pipo.stellar.base.card.CarouselBannerCard;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselBannerDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselBannerCard extends AbstractC1720840usk<CarouselBannerDO> {
    public int LLILZLL;
    public int LLIZ;
    public ARunnableS17S0100100_12 LLJI;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 35));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 34));
    public long LLIZLLLIL = 3000;
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adk;
    }

    public final ViewOnAttachStateChangeListenerC20631115oD LJI() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLILZ.getValue();
    }

    public static final class CarouselItemCell extends PowerCell<C1721080ut8> implements InterfaceC20631915oL {
        @Override // X.InterfaceC20631915oL
        public final void Z4() {
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final int getLayoutId() {
            return R.layout.fa7;
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onItemViewCreated() {
        }

        @Override // X.InterfaceC20631915oL
        public final void onPageSelected(int i) {
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
            AbstractC20628015ni abstractC20628015ni;
            View view;
            C1721080ut8 c1721080ut8 = (C1721080ut8) interfaceC1891350zJl;
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.w2v);
            C786410Ut5.LJJJJIZL(frameLayout);
            Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
            AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(this.itemView.getContext(), c1721080ut8.LLILLJJLI, c1721080ut8.LL, null);
            if (abstractC1720840uskLIZ != null && (view = abstractC1720840uskLIZ.LLILLJJLI) != null) {
                frameLayout.addView(view);
            }
            if ((frameLayout instanceof C20627315nb) && (abstractC20628015ni = (AbstractC20628015ni) frameLayout) != null) {
                abstractC20628015ni.setLoading(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.pipo.stellar.base.model.CarouselBannerDO r10, X.EnumC1720670usT r11) {
        /*
            r9 = this;
            java.lang.Integer r0 = r10.getDotSize()
            if (r0 == 0) goto Lae
            int r8 = r0.intValue()
        La:
            android.view.View r0 = r9.LLILLJJLI
            if (r0 == 0) goto Lb1
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto Lb1
            X.0usU r0 = X.EnumC1720670usT.Companion
            r0.getClass()
            android.content.Context r3 = X.C1720680usU.LIZJ(r11, r1)
            com.bytedance.pipo.stellar.base.model.ColorDO r2 = r10.getSelectDotColor()
            if (r2 == 0) goto L30
            X.0utU r1 = X.C1721300utU.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.getClass()
            java.lang.Integer r7 = X.C1721300utU.LJIILIIL(r2, r3, r0)
            if (r7 != 0) goto L37
        L30:
            r0 = 2131100567(0x7f060397, float:1.781352E38)
            java.lang.Integer r7 = X.C1308910kAL.LIZJ(r0, r3)
        L37:
            com.bytedance.pipo.stellar.base.model.ColorDO r2 = r10.getDotColor()
            if (r2 == 0) goto L4a
            X.0utU r1 = X.C1721300utU.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.getClass()
            java.lang.Integer r6 = X.C1721300utU.LJIILIIL(r2, r3, r0)
            if (r6 != 0) goto L51
        L4a:
            r0 = 2131100568(0x7f060398, float:1.7813521E38)
            java.lang.Integer r6 = X.C1308910kAL.LIZJ(r0, r3)
        L51:
            X.01GW r0 = r9.LLILZIL
            java.lang.Object r4 = r0.getValue()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto Lb1
            int r3 = r4.getChildCount()
            r2 = 0
        L60:
            if (r2 >= r3) goto Lb1
            android.view.View r1 = r4.getChildAt(r2)
            X.0F3z r5 = new X.0F3z
            r5.<init>()
            int r0 = r9.LLILZLL
            if (r2 != r0) goto Lac
            r0 = r7
        L70:
            r5.LIZ = r0
            int r0 = r8 / 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.LIZJ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r5.LJII = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r5.LJI = r0
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = r5.LIZ(r0)
            r1.setBackground(r0)
            int r2 = r2 + 1
            goto L60
        Lac:
            r0 = r6
            goto L70
        Lae:
            r8 = 6
            goto La
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.stellar.base.card.CarouselBannerCard.LJII(com.bytedance.pipo.stellar.base.model.CarouselBannerDO, X.0usT):void");
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, CarouselBannerDO carouselBannerDO, final EnumC1720670usT enumC1720670usT) {
        Object c098200Yq;
        long j;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        InterfaceC1733780vDc viewItemOperator2;
        InterfaceC1733780vDc viewItemOperator3;
        final CarouselBannerDO carouselBannerDO2 = carouselBannerDO;
        super.LJFF(view, carouselBannerDO2, enumC1720670usT);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI = LJI();
        if (viewOnAttachStateChangeListenerC20631115oDLJI != null && (viewItemOperator3 = viewOnAttachStateChangeListenerC20631115oDLJI.getViewItemOperator()) != null) {
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = 3;
            viewItemOperator3.LIZLLL(c1173220gdU);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI2 = LJI();
        if (viewOnAttachStateChangeListenerC20631115oDLJI2 != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oDLJI2.getViewItemOperator()) != null) {
            viewItemOperator2.LIZJ(CarouselItemCell.class);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI3 = LJI();
        if (viewOnAttachStateChangeListenerC20631115oDLJI3 != null) {
            viewOnAttachStateChangeListenerC20631115oDLJI3.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0ut9
                @Override // X.AbstractC712240Rwk
                public final void onPageScrollStateChanged(int i) {
                    CarouselBannerCard carouselBannerCard;
                    ARunnableS17S0100100_12 aRunnableS17S0100100_12;
                    if (i != 0) {
                        if (i == 1 && (aRunnableS17S0100100_12 = (carouselBannerCard = this.LL).LLJI) != null) {
                            carouselBannerCard.LLJ.removeCallbacks(aRunnableS17S0100100_12);
                            return;
                        }
                        return;
                    }
                    CarouselBannerCard carouselBannerCard2 = this.LL;
                    long j2 = carouselBannerCard2.LLIZLLLIL;
                    ARunnableS17S0100100_12 aRunnableS17S0100100_122 = carouselBannerCard2.LLJI;
                    if (aRunnableS17S0100100_122 != null) {
                        carouselBannerCard2.LLJ.removeCallbacks(aRunnableS17S0100100_122);
                    }
                    if (carouselBannerCard2.LLIZ <= 1) {
                        return;
                    }
                    ARunnableS17S0100100_12 aRunnableS17S0100100_123 = new ARunnableS17S0100100_12(carouselBannerCard2, j2, 2);
                    carouselBannerCard2.LLJI = aRunnableS17S0100100_123;
                    C786410Ut5.LJLIIL(j2, carouselBannerCard2.LLJ, aRunnableS17S0100100_123);
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) {
                    Map<String, Object> mapLJ;
                    BaseWidgetDO baseWidgetDO;
                    Function0<Map<String, Object>> function0;
                    CarouselBannerCard carouselBannerCard = this.LL;
                    carouselBannerCard.LLILZLL = i;
                    carouselBannerCard.LJII(carouselBannerDO2, enumC1720670usT);
                    CarouselBannerCard carouselBannerCard2 = this.LL;
                    CarouselBannerDO carouselBannerDO3 = carouselBannerDO2;
                    C1720760usc c1720760usc = carouselBannerCard2.LL;
                    Map<String, Object> mapLJ2 = null;
                    if (c1720760usc != null && (function0 = c1720760usc.LIZJ) != null) {
                        mapLJ = function0.invoke();
                    } else {
                        mapLJ = null;
                    }
                    List<CardDO> items = carouselBannerDO3.getItems();
                    if (items != null && (baseWidgetDO = (BaseWidgetDO) C13LP.LJJJLZIJ(i, items)) != null) {
                        mapLJ2 = baseWidgetDO.getTrackingParams();
                    }
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("rank", Integer.valueOf(i)));
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    mapLJIIJ.putAll(mapLJ);
                    Map<String, Object> trackingParams = carouselBannerDO3.getTrackingParams();
                    if (trackingParams == null) {
                        trackingParams = C2097608Jq.LJ();
                    }
                    mapLJIIJ.putAll(trackingParams);
                    if (mapLJ2 == null) {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    mapLJIIJ.putAll(mapLJ2);
                    C1716310ulR.LIZ.getClass();
                    C1716310ulR.LIZLLL("pipo_card_show", mapLJIIJ);
                }
            });
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI4 = LJI();
        if (viewOnAttachStateChangeListenerC20631115oDLJI4 != null) {
            viewOnAttachStateChangeListenerC20631115oDLJI4.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC785980UsO(this, 3));
        }
        ArrayList arrayList = new ArrayList();
        List<CardDO> items = carouselBannerDO2.getItems();
        if (items != null) {
            ArrayList arrayList2 = new ArrayList();
            for (CardDO cardDO : items) {
                Integer cardValid = cardDO.getCardValid();
                if (cardValid != null && cardValid.intValue() == 1) {
                    arrayList2.add(cardDO);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1721080ut8((CardDO) it2.next(), this.LL));
            }
        }
        this.LLIZ = arrayList.size();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI5 = LJI();
        if (viewOnAttachStateChangeListenerC20631115oDLJI5 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oDLJI5.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            state.LIZLLL(arrayList, null);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLJI6 = LJI();
        if (viewOnAttachStateChangeListenerC20631115oDLJI6 != null) {
            viewOnAttachStateChangeListenerC20631115oDLJI6.setCurrentItem(0, false);
        }
        if (this.LLIZ > 1) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view2 = new View(view.getContext());
                int dotSize = carouselBannerDO2.getDotSize();
                if (dotSize == null) {
                    dotSize = 6;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dotSize));
                int dotSize2 = carouselBannerDO2.getDotSize();
                if (dotSize2 == null) {
                    dotSize2 = 6;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dotSize2)));
                if (i != arrayList.size() - 1) {
                    int dotPadding = carouselBannerDO2.getDotPadding();
                    if (dotPadding == null) {
                        dotPadding = 6;
                    }
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dotPadding)));
                }
                C786410Ut5.W5(view2, layoutParams);
                ViewGroup viewGroup = (ViewGroup) this.LLILZIL.getValue();
                if (viewGroup != null) {
                    viewGroup.addView(view2);
                }
            }
            LJII(carouselBannerDO2, enumC1720670usT);
            try {
                String stayDuration = carouselBannerDO2.getStayDuration();
                if (stayDuration != null) {
                    j = CastLongProtector.parseLong(stayDuration);
                } else {
                    j = 3000;
                }
                c098200Yq = Long.valueOf(j);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = 3000L;
            }
            long jLongValue = ((Number) c098200Yq).longValue();
            this.LLIZLLLIL = jLongValue;
            ARunnableS17S0100100_12 aRunnableS17S0100100_12 = this.LLJI;
            if (aRunnableS17S0100100_12 != null) {
                this.LLJ.removeCallbacks(aRunnableS17S0100100_12);
            }
            if (this.LLIZ > 1) {
                ARunnableS17S0100100_12 aRunnableS17S0100100_122 = new ARunnableS17S0100100_12(this, jLongValue, 2);
                this.LLJI = aRunnableS17S0100100_122;
                C786410Ut5.LJLIIL(jLongValue, this.LLJ, aRunnableS17S0100100_122);
                return;
            }
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.LLILZIL.getValue();
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        ARunnableS17S0100100_12 aRunnableS17S0100100_123 = this.LLJI;
        if (aRunnableS17S0100100_123 != null) {
            this.LLJ.removeCallbacks(aRunnableS17S0100100_123);
        }
    }
}
