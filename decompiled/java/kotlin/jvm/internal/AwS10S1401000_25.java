package kotlin.jvm.internal;

import X.AbstractC1556970qcR;
import X.C09AY;
import X.C09I6;
import X.C09I8;
import X.C1390380mHk;
import X.C13BV;
import X.C15438062q;
import X.C1621190sI1;
import X.C1674100tfM;
import X.C1683340tuG;
import X.C1683450tuR;
import X.C19GS;
import X.C2188811AlT;
import X.C341440Da2;
import X.InterfaceC1645720sva;
import X.InterfaceC1665500tRU;
import X.InterfaceC1669590tY5;
import X.InterfaceC1680500tpg;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerMessageModule;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS10S1401000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S1401000_25 awS10S1401000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683340tuG.LJIIIZ((InterfaceC1669590tY5) awS10S1401000_25.l1, (C1683450tuR) awS10S1401000_25.l2, (Function1) awS10S1401000_25.l3, awS10S1401000_25.s0, (Function0) awS10S1401000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS10S1401000_25.i5 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S1401000_25 awS10S1401000_25, Object obj, Object obj2) {
        List<C1621190sI1> list;
        List<C1621190sI1> list2;
        List<C1621190sI1> list3;
        List<? extends VEFrame> list4 = (List) obj2;
        int i = C09I8.LIZ[((C09I6) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ((UploadPicStickerMessageModule) awS10S1401000_25.l1).vQ2().setValue(Boolean.FALSE);
                    if (!((List) awS10S1401000_25.l4).isEmpty()) {
                        InterfaceC1645720sva interfaceC1645720svaT5 = ((l0) awS10S1401000_25.l2).t5();
                        List list5 = (List) awS10S1401000_25.l4;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list5, 10));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((C1621190sI1) it2.next()).LJFF);
                        }
                        interfaceC1645720svaT5.Sn(arrayList, C13BV.INSTANCE);
                        UploadPicStickerARPresenter uploadPicStickerARPresenter = ((l0) awS10S1401000_25.l2).f;
                        if (uploadPicStickerARPresenter != null && (list3 = uploadPicStickerARPresenter.LLLLIILL) != null) {
                            ((ArrayList) list3).clear();
                        }
                    }
                } else {
                    C19GS c19gs = ((l0) awS10S1401000_25.l2).LLILLJJLI;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(((l0) awS10S1401000_25.l2).LLILLJJLI.getString(2131821933));
                    C1390380mHk.LIZ(c19gs, 3002, creativeToastBuilder);
                    ((UploadPicStickerMessageModule) awS10S1401000_25.l1).vQ2().setValue(Boolean.FALSE);
                    if (!((List) awS10S1401000_25.l4).isEmpty()) {
                        InterfaceC1645720sva interfaceC1645720svaT52 = ((l0) awS10S1401000_25.l2).t5();
                        List list6 = (List) awS10S1401000_25.l4;
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C1621190sI1) it3.next()).LJFF);
                        }
                        interfaceC1645720svaT52.Sn(arrayList2, C13BV.INSTANCE);
                        UploadPicStickerARPresenter uploadPicStickerARPresenter2 = ((l0) awS10S1401000_25.l2).f;
                        if (uploadPicStickerARPresenter2 != null && (list2 = uploadPicStickerARPresenter2.LLLLIILL) != null) {
                            ((ArrayList) list2).clear();
                        }
                    }
                }
            } else {
                ((UploadPicStickerMessageModule) awS10S1401000_25.l1).vQ2().setValue(Boolean.FALSE);
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (i2 < awS10S1401000_25.i5) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(awS10S1401000_25.s0);
                    i2++;
                    sbLIZ.append(i2);
                    arrayList3.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                ((l0) awS10S1401000_25.l2).t5().qo(arrayList3, list4);
                UploadPicStickerARPresenter uploadPicStickerARPresenter3 = ((l0) awS10S1401000_25.l2).f;
                if (uploadPicStickerARPresenter3 != null && (list = uploadPicStickerARPresenter3.LLLLIILL) != null) {
                    List list7 = (List) awS10S1401000_25.l3;
                    ArrayList arrayList4 = (ArrayList) list;
                    arrayList4.clear();
                    arrayList4.addAll(list7);
                }
                l0 l0Var = (l0) awS10S1401000_25.l2;
                l0Var.j = arrayList3;
                C1621190sI1[] c1621190sI1Arr = (C1621190sI1[]) ((List) awS10S1401000_25.l3).toArray(new C1621190sI1[0]);
                l0Var.Kf((C1621190sI1[]) Arrays.copyOf(c1621190sI1Arr, c1621190sI1Arr.length));
                ((l0) awS10S1401000_25.l2).LLLLLLL = ((List) awS10S1401000_25.l3).size();
            }
        } else {
            ((UploadPicStickerMessageModule) awS10S1401000_25.l1).vQ2().setValue(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S1401000_25 awS10S1401000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674100tfM.LIZJ(awS10S1401000_25.s0, (InterfaceC1665500tRU) awS10S1401000_25.l1, (PurchaseOptionWithPrice) awS10S1401000_25.l2, (Function1) awS10S1401000_25.l3, (Function1) awS10S1401000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS10S1401000_25.i5 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1401000_25(InterfaceC1669590tY5 interfaceC1669590tY5, InterfaceC1669590tY5 interfaceC1669590tY52, C1683450tuR c1683450tuR, Function1<? super String, Unit> function1, String str, Function0<Unit> function0, int i) {
        super(2);
        this.$t = i;
        this.l1 = interfaceC1669590tY5;
        this.l2 = interfaceC1669590tY52;
        this.l3 = c1683450tuR;
        this.s0 = function1;
        this.l4 = str;
        this.i5 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1401000_25(UploadPicStickerMessageModule uploadPicStickerMessageModule, UploadPicStickerMessageModule uploadPicStickerMessageModule2, int i, String str, l0 l0Var, List<C1621190sI1> list, List<C1621190sI1> list2) {
        super(2);
        this.$t = list2;
        this.l1 = uploadPicStickerMessageModule;
        this.i5 = uploadPicStickerMessageModule2;
        this.s0 = i;
        this.l2 = str;
        this.l3 = l0Var;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1401000_25(String str, String str2, InterfaceC1665500tRU<PurchaseOptionWithPrice> interfaceC1665500tRU, PurchaseOptionWithPrice purchaseOptionWithPrice, Function1<? super PurchaseOptionWithPrice, Unit> function1, Function1<? super AbstractC1556970qcR, Unit> function12, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = interfaceC1665500tRU;
        this.l3 = purchaseOptionWithPrice;
        this.l4 = function1;
        this.i5 = function12;
    }
}
