package kotlin.jvm.internal;

import X.C09AY;
import X.C0H1U;
import X.C11G4;
import X.C127K;
import X.C1697810uHb;
import X.C1709570uaZ;
import X.C1723010uwF;
import X.C1723020uwG;
import X.C1723030uwH;
import X.C1723040uwI;
import X.C1723050uwJ;
import X.C1723070uwL;
import X.C1761940vx2;
import X.C1762010vx9;
import X.C1763800w02;
import X.C1763840w06;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C631370Opb;
import X.C724240Sb0;
import X.C759420Tqe;
import X.C759430Tqf;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1631620sYq;
import Y.ACListenerS128S0200000_26;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselCreatorVideoEntranceAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselTryOnEntranceAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public class AFwS348S0000000_26 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(11);
    public final int $t;

    public static AFwS348S0000000_26 get$arr$(int i) {
        AFwS348S0000000_26 aFwS348S0000000_26 = (AFwS348S0000000_26) arr$.get(i);
        if (aFwS348S0000000_26 != null) {
            return aFwS348S0000000_26;
        }
        arr$.compareAndSet(i, null, new AFwS348S0000000_26(i));
        return (AFwS348S0000000_26) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS348S0000000_26(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        C759420Tqe c759420Tqe = (C759420Tqe) obj;
        C759430Tqf c759430Tqf = (C759430Tqf) obj2;
        ((Number) obj3).intValue();
        if ((c759420Tqe instanceof C1723050uwJ) && (c759430Tqf instanceof C1723030uwH)) {
            C1723050uwJ c1723050uwJ = (C1723050uwJ) c759420Tqe;
            C1723030uwH c1723030uwH = (C1723030uwH) c759430Tqf;
            c1723050uwJ.LLILZ.setIconRes(C1723040uwI.LIZ(R.raw.icon_info_circle, c1723030uwH.LIZLLL));
            c1723050uwJ.LLILLJJLI.setText(c1723030uwH.LIZIZ);
            c1723050uwJ.LLILLL.setText(c1723030uwH.LIZJ);
            if (c1723030uwH.LJ) {
                C786410Ut5.LLLLLLZZ(c1723050uwJ.LLILZIL, 0);
                C786410Ut5.a9(c1723050uwJ.LLILZIL, new ACListenerS128S0200000_26(c1723050uwJ, c1723030uwH, 0));
            } else {
                C786410Ut5.LLLLLLZZ(c1723050uwJ.LLILZIL, 8);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        C759420Tqe c759420Tqe = (C759420Tqe) obj;
        C759430Tqf c759430Tqf = (C759430Tqf) obj2;
        ((Number) obj3).intValue();
        if ((c759420Tqe instanceof C1723070uwL) && (c759430Tqf instanceof C1723020uwG)) {
            C1723070uwL c1723070uwL = (C1723070uwL) c759420Tqe;
            C1723020uwG c1723020uwG = (C1723020uwG) c759430Tqf;
            C786410Ut5.LJJJJJL(c1723070uwL.LLILLL);
            List<C1723010uwF> list = c1723020uwG.LIZJ;
            if (list != null && !list.isEmpty()) {
                C786410Ut5.LLLLZLL(c1723070uwL.LLILLJJLI, 0);
                TuxTextView tuxTextView = c1723070uwL.LLILLJJLI;
                String str = c1723020uwG.LIZIZ;
                if (str == null) {
                    str = "";
                }
                tuxTextView.setText(str);
            } else {
                C786410Ut5.LLLLZLL(c1723070uwL.LLILLJJLI, 4);
            }
            List<C1723010uwF> list2 = c1723020uwG.LIZJ;
            if (list2 != null) {
                int i = 0;
                for (C1723010uwF c1723010uwF : list2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C1723010uwF c1723010uwF2 = c1723010uwF;
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1723070uwL.LLILLL.getContext()), R.layout.dva, c1723070uwL.LLILLL, false);
                        c1723070uwL.LLILLL.addView(viewTd);
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i == c1723020uwG.LIZJ.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C127K c127k = (C127K) viewTd.findViewById(R.id.utx);
                        c127k.setTitle(c1723010uwF2.LIZ);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ.LIZ = C1723040uwI.LIZ(0, c1723010uwF2.LIZJ);
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                        c127k.setIcon(c419910GdJ);
                        ((C11G4) c127k.getAccessory()).LJIILL(new ACListenerS128S0200000_26(c1723070uwL, c1723010uwF2, 1));
                        c127k.LJ(z, z2);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AFwS348S0000000_26 r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS348S0000000_26.invoke$10(kotlin.jvm.internal.AFwS348S0000000_26, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        ((PaymentOption) obj2).LJJIFFI((C1709570uaZ) obj, (String) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        C1709570uaZ c1709570uaZ = (C1709570uaZ) obj;
        c1709570uaZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCVVInputFinishedAndChanged_");
        sbLIZ.append("embedded_cashier");
        c1709570uaZ.LJJJIL(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        PdpCarouselCreatorVideoEntranceAssem pdpCarouselCreatorVideoEntranceAssem = (PdpCarouselCreatorVideoEntranceAssem) obj;
        if (C631370Opb.LIZ(pdpCarouselCreatorVideoEntranceAssem) != null) {
            C1762010vx9 c1762010vx9 = (C1762010vx9) C631370Opb.LIZ(pdpCarouselCreatorVideoEntranceAssem);
            int i = ((C1761940vx2) pdpCarouselCreatorVideoEntranceAssem.op().getState()).LLILZLL;
            C1763800w02 c1763800w02 = pdpCarouselCreatorVideoEntranceAssem.LLJJLIIIJLLLLLLLZ;
            if (c1763800w02 != null) {
                c1763800w02.LIZJ(c1762010vx9.LLJ);
            }
            C1763800w02 c1763800w022 = pdpCarouselCreatorVideoEntranceAssem.LLJJLIIIJLLLLLLLZ;
            if (c1763800w022 != null) {
                C786410Ut5.P9(c1763800w022, new ACListenerS128S0200000_26(c1762010vx9, pdpCarouselCreatorVideoEntranceAssem, 34));
            }
            pdpCarouselCreatorVideoEntranceAssem.sp(c1762010vx9, i);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) throws Throwable {
        int iIntValue;
        PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem = (PdpCarouselPageViewerAssem) obj;
        List list = (List) obj2;
        C1762010vx9 c1762010vx9 = (C1762010vx9) C631370Opb.LIZ(pdpCarouselPageViewerAssem);
        if (c1762010vx9 != null) {
            if (list.isEmpty()) {
                Integer num = ((C1762010vx9) C631370Opb.LIZ(pdpCarouselPageViewerAssem)).LLILLL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                pdpCarouselPageViewerAssem.Ep(c1762010vx9, iIntValue);
            } else {
                pdpCarouselPageViewerAssem.Ep(c1762010vx9, ((C1761940vx2) pdpCarouselPageViewerAssem.zp().getState()).LLILZLL);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AFwS348S0000000_26 aFwS348S0000000_26, Object obj, Object obj2, Object obj3) {
        C1762010vx9 c1762010vx9;
        String str;
        ECBaseFragment eCBaseFragment;
        PdpCarouselTryOnEntranceAssem pdpCarouselTryOnEntranceAssem = (PdpCarouselTryOnEntranceAssem) obj;
        if (!((List) obj2).isEmpty() && (c1762010vx9 = (C1762010vx9) C631370Opb.LIZ(pdpCarouselTryOnEntranceAssem)) != null) {
            int i = ((C1761940vx2) pdpCarouselTryOnEntranceAssem.tp().getState()).LLILZLL;
            TryOnData tryOnData = c1762010vx9.LLIZLLLIL;
            Integer numValueOf = null;
            if (tryOnData != null) {
                str = tryOnData.schema;
            } else {
                str = null;
            }
            if (str != null) {
                pdpCarouselTryOnEntranceAssem.LLJL = true;
                if (tryOnData != null) {
                    numValueOf = Integer.valueOf(tryOnData.hashCode());
                }
                if (!Intrinsics.LJFF(pdpCarouselTryOnEntranceAssem.LLJLIL, numValueOf)) {
                    pdpCarouselTryOnEntranceAssem.LLJLIL = numValueOf;
                    TryOnData tryOnData2 = c1762010vx9.LLIZLLLIL;
                    if (tryOnData2 != null) {
                        PdpViewModel pdpViewModelLX = pdpCarouselTryOnEntranceAssem.sp().lX();
                        Fragment fragmentLJI = C724240Sb0.LJI(pdpCarouselTryOnEntranceAssem);
                        if ((fragmentLJI instanceof PdpFragment) && (eCBaseFragment = (ECBaseFragment) fragmentLJI) != null) {
                            C1763840w06 c1763840w06 = pdpCarouselTryOnEntranceAssem.LLJJLIIIJLLLLLLLZ;
                            if (c1763840w06 != null) {
                                c1763840w06.i0(tryOnData2, pdpViewModelLX, eCBaseFragment);
                            }
                        } else {
                            pdpCarouselTryOnEntranceAssem.LLJL = false;
                            C1763840w06 c1763840w062 = pdpCarouselTryOnEntranceAssem.LLJJLIIIJLLLLLLLZ;
                            if (c1763840w062 != null) {
                                C0H1U.LIZIZ(c1763840w062);
                            }
                        }
                    }
                }
                pdpCarouselTryOnEntranceAssem.up(c1762010vx9, i);
            } else {
                C1763840w06 c1763840w063 = pdpCarouselTryOnEntranceAssem.LLJJLIIIJLLLLLLLZ;
                if (c1763840w063 != null) {
                    C0H1U.LIZIZ(c1763840w063);
                }
                pdpCarouselTryOnEntranceAssem.LLJL = false;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AFwS348S0000000_26 r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS348S0000000_26.invoke$9(kotlin.jvm.internal.AFwS348S0000000_26, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
