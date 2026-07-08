package kotlin.jvm.internal;

import X.C05PU;
import X.C09AY;
import X.C13LP;
import X.C1697810uHb;
import X.C1836210xsp;
import X.C1853060yK0;
import X.C1853320yKQ;
import X.C1853870yLJ;
import X.C1856050yOp;
import X.C1858660yT2;
import X.C20600815jK;
import X.C291001Au;
import X.C323580CmK;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second.TakoSecondLevelQuestionnaireFragment;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS133S0101000_27 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS133S0101000_27 awS133S0101000_27, Object obj) {
        int i;
        if (!((Boolean) obj).booleanValue() && ((C1836210xsp) awS133S0101000_27.l0).LLILLJJLI < awS133S0101000_27.i1) {
            i = 0;
        } else {
            i = ((C1836210xsp) awS133S0101000_27.l0).LLILLJJLI - awS133S0101000_27.i1;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$1(AwS133S0101000_27 awS133S0101000_27, Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        ArrayList arrayList = (ArrayList) TakoSecondLevelQuestionnaireFragment.LLJI;
        if (arrayList.contains(Integer.valueOf(awS133S0101000_27.i1))) {
            arrayList.remove(Integer.valueOf(awS133S0101000_27.i1));
        } else {
            arrayList.add(Integer.valueOf(awS133S0101000_27.i1));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((TakoSecondLevelQuestionnaireFragment) awS133S0101000_27.l0).LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(((TakoSecondLevelQuestionnaireFragment) awS133S0101000_27.l0).MR(), null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS133S0101000_27 r5, java.lang.Object r6) {
        /*
            X.0yKQ r6 = (X.C1853320yKQ) r6
            int r2 = r6.LLJI
            int r1 = r5.i1
            r4 = 1
            if (r1 == r4) goto L5c
            r0 = 2
            if (r1 == r0) goto L50
            r0 = 4
            if (r1 == r0) goto L4c
            r0 = 8
            if (r1 == r0) goto L48
            r0 = 16
            if (r1 == r0) goto L45
            r0 = 32
            if (r1 != r0) goto L68
            r3 = r2 & (-17)
        L1d:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel r0 = (com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel) r0
            r0.getClass()
            boolean r1 = X.C1853480yKg.LIZ(r2)
            boolean r0 = X.C1853480yKg.LIZ(r3)
            if (r1 == 0) goto L40
            if (r0 == 0) goto L43
        L30:
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel r2 = (com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel) r2
            kotlin.jvm.internal.AwS9S0011000_27 r1 = new kotlin.jvm.internal.AwS9S0011000_27
            r0 = 1
            r1.<init>(r3, r4, r0)
            r2.setState(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            if (r0 == 0) goto L43
            goto L30
        L43:
            r4 = 0
            goto L30
        L45:
            r3 = r2 | 16
            goto L1d
        L48:
            r1 = r1 | r2
            r3 = r1 & (-5)
            goto L1d
        L4c:
            r1 = r1 | r2
            r3 = r1 & (-9)
            goto L1d
        L50:
            boolean r0 = X.C07EJ.LIZ()
            if (r0 != 0) goto L68
            int r0 = r5.i1
            r0 = r0 | r2
            r3 = r0 & (-2)
            goto L1d
        L5c:
            boolean r0 = X.C07EJ.LIZ()
            if (r0 != 0) goto L68
            int r0 = r5.i1
            r0 = r0 | r2
            r3 = r0 & (-3)
            goto L1d
        L68:
            r3 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS133S0101000_27.invoke$2(kotlin.jvm.internal.AwS133S0101000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS133S0101000_27 awS133S0101000_27, Object obj) {
        int iNextIndex;
        Object objLIZ;
        String id;
        C05PU c05pu = (C05PU) obj;
        if (c05pu == null) {
            return null;
        }
        TakoAnswerBaseAssem takoAnswerBaseAssem = (TakoAnswerBaseAssem) awS133S0101000_27.l0;
        int i = awS133S0101000_27.i1;
        List<ITakoHighLightAnimProtocol> listZq = takoAnswerBaseAssem.zq(i);
        C323580CmK c323580CmK = new C323580CmK(2);
        c323580CmK.LIZ(takoAnswerBaseAssem.LLLLLIL.getValue());
        c323580CmK.LIZIZ(TakoAnswerBaseAssem.xq(i, listZq));
        List listLJIIJJI = C1697810uHb.LJIIJJI(c323580CmK.LIZLLL(new C05PU[c323580CmK.LIZJ()]));
        ListIterator listIterator = listLJIIJJI.listIterator(listLJIIJJI.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                C05PU c05pu2 = (C05PU) listIterator.previous();
                if (c05pu2 != null) {
                    id = c05pu2.getId();
                } else {
                    id = null;
                }
                if (Intrinsics.LJFF(id, c05pu.getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        int i2 = iNextIndex + 1;
        if (i2 > 0) {
            objLIZ = C1856050yOp.LIZ(i2, listLJIIJJI);
        } else {
            objLIZ = null;
        }
        Objects.toString(objLIZ);
        if (i2 <= 0) {
            return null;
        }
        return C1856050yOp.LIZ(i2, listLJIIJJI);
    }

    public static final Object invoke$4(AwS133S0101000_27 awS133S0101000_27, Object obj) {
        ((TakoPhotoChooseViewModel) awS133S0101000_27.l0).setState(new AwS39S0001000_27(awS133S0101000_27.i1, 8));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS133S0101000_27 awS133S0101000_27, Object obj) {
        TikTokMediaModel next;
        C1853060yK0 c1853060yK0 = (C1853060yK0) obj;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(awS133S0101000_27.i1, c1853060yK0.LLILLJJLI);
        if (tikTokMediaModel != null) {
            Iterator<TikTokMediaModel> it2 = c1853060yK0.LLILZIL.LIZ.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((MediaModel) it2.next()).id, ((MediaModel) tikTokMediaModel).id)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Iterator<TikTokMediaModel> it3 = c1853060yK0.LLILZIL.LIZ.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((MediaModel) next).id, ((MediaModel) tikTokMediaModel).id)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TikTokMediaModel tikTokMediaModel2 = next;
            if (tikTokMediaModel2 != null) {
                tikTokMediaModel = tikTokMediaModel2;
            }
            ((TakoPhotoChooseViewModel) awS133S0101000_27.l0).setState(new AwS35S0102000_27(i, tikTokMediaModel, awS133S0101000_27.i1, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS133S0101000_27 awS133S0101000_27, Object obj) {
        return C1853320yKQ.LIZ((C1853320yKQ) obj, null, null, new C291001Au(new C1853870yLJ((List) awS133S0101000_27.l0, awS133S0101000_27.i1, 4)), null, null, null, null, null, 0, false, 2043);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS133S0101000_27(int r3, com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 4 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS133S0101000_27.<init>(int, com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0101000_27(int i, TakoSecondLevelQuestionnaireFragment takoSecondLevelQuestionnaireFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = takoSecondLevelQuestionnaireFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0101000_27(int i, TemplateListViewModel templateListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = templateListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0101000_27(int i, int i2, List<TikTokMediaModel> list) {
        super(1);
        this.$t = list;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0101000_27(C1836210xsp c1836210xsp, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1836210xsp;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0101000_27(TakoAnswerBaseAssem takoAnswerBaseAssem, TakoAnswerBaseAssem<C1858660yT2> takoAnswerBaseAssem2, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoAnswerBaseAssem;
        this.i1 = takoAnswerBaseAssem2;
    }
}
