package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0E4A;
import X.C0E5S;
import X.C0E9V;
import X.C0EGB;
import X.C0EGE;
import X.C0EHK;
import X.C0ELJ;
import X.C0EOK;
import X.C0LSZ;
import X.C1664590tQ1;
import X.C189200o6;
import X.C201955140j;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C355090Dw3;
import X.C356720Dyg;
import X.C358740E4q;
import X.C372830EjZ;
import X.InterfaceC20236714Gf;
import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS165S0400000_5 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS165S0400000_5 awS165S0400000_5, Object obj, Object obj2) {
        String uuid;
        C0E48 c0e48C3;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLEEditor nLEEditorLJI;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        ((Number) obj2).longValue();
        C0E5S c0e5sQ3 = ((C356720Dyg) awS165S0400000_5.l0).q3();
        if (c0e5sQ3 != null) {
            c0e5sQ3.QD2(true, false);
        }
        ((C356720Dyg) awS165S0400000_5.l0).Ax0(false);
        nLETrackSlot.setExtra("creation_async_task_id", ((C0LSZ) awS165S0400000_5.l1).LIZ);
        C0E48 c0e48C32 = ((C356720Dyg) awS165S0400000_5.l0).c3();
        if (c0e48C32 != null && (nLEEditorLJI = c0e48C32.LLFII().LJI()) != null) {
            nLEEditorLJI.commit();
        }
        if (((C356720Dyg) awS165S0400000_5.l0).c3() != null) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) awS165S0400000_5.l2;
            C356720Dyg c356720Dyg = (C356720Dyg) awS165S0400000_5.l0;
            String uuid2 = nLETrackSlot2.getUUID();
            C0E48 c0e48C33 = c356720Dyg.c3();
            if (c0e48C33 != null && (nLETrackSlotLLLLLLIL = c0e48C33.LLLLLLIL()) != null) {
                uuid = nLETrackSlotLLLLLLIL.getUUID();
            } else {
                uuid = null;
            }
            if (Intrinsics.LJFF(uuid2, uuid) && (c0e48C3 = c356720Dyg.c3()) != null) {
                c0e48C3.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 126), "select_slot_event", false);
            }
        }
        Pair<String, String> pairRemove = ((C356720Dyg) awS165S0400000_5.l0).LLJJ.remove(((NLETrackSlot) awS165S0400000_5.l2).getUUID());
        if (pairRemove != null) {
            ((C356720Dyg) awS165S0400000_5.l0).LLJJ.put(nLETrackSlot.getUUID(), pairRemove);
        }
        ((C356720Dyg) awS165S0400000_5.l0).Ax0(true);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS165S0400000_5.l3;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
        return unit;
    }

    public static final Object invoke$1(AwS165S0400000_5 awS165S0400000_5, Object obj, Object obj2) {
        int navBarHeight;
        boolean zBooleanValue;
        C372830EjZ c372830EjZ;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProScene init video w ");
        sbLIZ.append(((PairIntInt) awS165S0400000_5.l0).getFirst());
        sbLIZ.append(" h ");
        sbLIZ.append(((PairIntInt) awS165S0400000_5.l0).getSecond());
        sbLIZ.append(" display w ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" h ");
        sbLIZ.append(iIntValue2);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C0EOK c0eokH5 = ((C0EGB) awS165S0400000_5.l1).H5();
        if (c0eokH5 != null) {
            c0eokH5.sq(Integer.valueOf(iIntValue2), Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        C0EGE c0ege = ((C0EGB) awS165S0400000_5.l1).LLILZ.LLLILZ;
        if (c0ege != null && (c372830EjZ = c0ege.LJIIJ) != null) {
            navBarHeight = c372830EjZ.getNavBarHeight();
        } else {
            navBarHeight = C372830EjZ.LLJJJJ;
        }
        Activity activityLJII = C1664590tQ1.LJII((C0EGB) awS165S0400000_5.l1);
        boolean zIsCreatedFromEditNow = ((C0ELJ) awS165S0400000_5.l2).isCreatedFromEditNow();
        Boolean boolIsPhoto9To16 = ((C0ELJ) awS165S0400000_5.l2).isPhoto9To16();
        if (boolIsPhoto9To16 != null) {
            zBooleanValue = boolIsPhoto9To16.booleanValue();
        } else {
            zBooleanValue = false;
        }
        int iLJ = C0EHK.LJ(navBarHeight, activityLJII, zIsCreatedFromEditNow, zBooleanValue);
        C0E9V.LIZ((C0E48) awS165S0400000_5.l3, ((PairIntInt) awS165S0400000_5.l0).getFirst(), ((PairIntInt) awS165S0400000_5.l0).getSecond(), iIntValue, iIntValue2, ((C0EGB) awS165S0400000_5.l1).D5().LJIJJLI(), iLJ);
        ((C0EGB) awS165S0400000_5.l1).D5().DN0(iLJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateSurfaceSizeInternal w ");
        sbLIZ2.append(((PairIntInt) awS165S0400000_5.l0).getFirst());
        sbLIZ2.append(" h ");
        sbLIZ2.append(((PairIntInt) awS165S0400000_5.l0).getSecond());
        sbLIZ2.append(" display w ");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(" h ");
        sbLIZ2.append(iIntValue2);
        sbLIZ2.append(" marginTop=");
        sbLIZ2.append(iLJ);
        C355090Dw3.LJ("EditorProSceneV2", C2188811AlT.LIZIZ(sbLIZ2));
        C0E4A.LIZIZ((C0E48) awS165S0400000_5.l3, "enter_ep_resize_new");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0400000_5(C356720Dyg c356720Dyg, C0LSZ c0lsz, NLETrackSlot nLETrackSlot, C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c356720Dyg;
        this.l1 = c0lsz;
        this.l2 = nLETrackSlot;
        this.l3 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0400000_5(PairIntInt pairIntInt, C0EGB c0egb, C0ELJ c0elj, C0E48 c0e48, int i) {
        super(2);
        this.$t = i;
        this.l0 = pairIntInt;
        this.l1 = c0egb;
        this.l2 = c0elj;
        this.l3 = c0e48;
    }
}
