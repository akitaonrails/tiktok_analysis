package kotlin.jvm.internal;

import X.C09AY;
import X.C0HAU;
import X.C0HVI;
import X.C0HVW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1697810uHb;
import X.C1761940vx2;
import X.C1762010vx9;
import X.C289860BXs;
import X.C424040Gjy;
import X.C425800Gmo;
import X.C438710HIf;
import X.C631370Opb;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1631620sYq;
import X.InterfaceC1762510vxx;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class AFwS331S0000000_6 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static AFwS331S0000000_6 get$arr$(int i) {
        AFwS331S0000000_6 aFwS331S0000000_6 = (AFwS331S0000000_6) arr$.get(i);
        if (aFwS331S0000000_6 != null) {
            return aFwS331S0000000_6;
        }
        arr$.compareAndSet(i, null, new AFwS331S0000000_6(i));
        return (AFwS331S0000000_6) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS331S0000000_6(int i) {
        super(3);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS331S0000000_6 aFwS331S0000000_6, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AFwS331S0000000_6 aFwS331S0000000_6, Object obj, Object obj2, Object obj3) {
        int i;
        PdpCarouselInnerIndicatorAssem pdpCarouselInnerIndicatorAssem = (PdpCarouselInnerIndicatorAssem) obj;
        C1762010vx9 c1762010vx9 = (C1762010vx9) C631370Opb.LIZ(pdpCarouselInnerIndicatorAssem);
        if (c1762010vx9 != null) {
            int i2 = ((C1761940vx2) pdpCarouselInnerIndicatorAssem.sp().getState()).LLILZLL;
            C424040Gjy c424040Gjy = pdpCarouselInnerIndicatorAssem.LLJL;
            if (c424040Gjy != null) {
                int size = c1762010vx9.LL.size();
                if (size > 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, c424040Gjy);
                if (size > 1) {
                    C786410Ut5.LJLLLLLL(0, c424040Gjy);
                    List<CarouselElement> list = c1762010vx9.LL;
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (CarouselElement carouselElement : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            Integer numValueOf = Integer.valueOf(i3);
                            numValueOf.intValue();
                            Integer num = carouselElement.elementType;
                            int value = C0HAU.VIDEO.getValue();
                            if (num != null && num.intValue() == value) {
                                arrayList.add(numValueOf);
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    c424040Gjy.LJ(C13LP.LLIIJI(arrayList), c1762010vx9.LL.size());
                    c424040Gjy.setSelectedIndex(i2);
                    InterfaceC1762510vxx interfaceC1762510vxxOp = pdpCarouselInnerIndicatorAssem.op();
                    if (interfaceC1762510vxxOp != null) {
                        interfaceC1762510vxxOp.gk(new AwS174S0101000_6(pdpCarouselInnerIndicatorAssem, i2, 6));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AFwS331S0000000_6 aFwS331S0000000_6, Object obj, Object obj2, Object obj3) {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) obj;
        String str = (String) obj2;
        UrlModel urlModel = (UrlModel) obj3;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
        c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) reusedUISlotAssem.getContentView().findViewById(R.id.v3t));
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        if (C289860BXs.LIZ()) {
            C425800Gmo.LIZ((C425800Gmo) reusedUISlotAssem.getContentView().findViewById(R.id.so0), C438710HIf.LIZ(urlModel), str, 52);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AFwS331S0000000_6 r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            X.19EG r3 = (X.C19EG) r3
            java.lang.String r4 = (java.lang.String) r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            X.0HKW r2 = X.C0HKW.LIZ
            if (r4 == 0) goto L46
            int r1 = r4.hashCode()
            r0 = -327157911(0xffffffffec7ff769, float:-1.2377778E27)
            if (r1 == r0) goto L3b
            r0 = 24793163(0x17a504b, float:4.5975355E-38)
            if (r1 == r0) goto L30
            r0 = 1404665567(0x53b97edf, float:1.593395E12)
            if (r1 != r0) goto L46
            java.lang.String r0 = "imagine_studio"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
            X.0HKX r0 = X.C0HKX.MIX_STUDIO
        L27:
            r2.getClass()
            X.C0HKW.LIZ(r3, r0, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            java.lang.String r0 = "social_avatar_sticker_anchor"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
            X.0HKX r0 = X.C0HKX.ANCHOR
            goto L27
        L3b:
            java.lang.String r0 = "social_avatar_sticker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
            X.0HKX r0 = X.C0HKX.STICKER_POST
            goto L27
        L46:
            X.0HKX r0 = X.C0HKX.CAMERA
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS331S0000000_6.invoke$3(kotlin.jvm.internal.AFwS331S0000000_6, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AFwS331S0000000_6 aFwS331S0000000_6, Object obj, Object obj2, Object obj3) {
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 == C0HVI.ALBUM_NO_PERMISSION && obj3 == C0HVW.NO_TAKE_PHOTO_PERMISSION) {
            C786410Ut5.LJLLLLLL(8, uIAssem.LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(0, uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }
}
