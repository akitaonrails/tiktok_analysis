package kotlin.jvm.internal;

import X.C013C;
import X.C020W;
import X.C09AY;
import X.C0CNO;
import X.C0M0P;
import X.C0M22;
import X.C0M2A;
import X.C0M2Z;
import X.C0MAE;
import X.C118300cf;
import X.C13LP;
import X.C1665940tSC;
import X.C1697810uHb;
import X.C19719212De;
import X.C2188811AlT;
import X.C259800zU;
import X.C5180020c;
import X.C523310Kfh;
import X.C562430M4b;
import X.InterfaceC1631630sYr;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS1S0700000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S0700000_8 awS1S0700000_8, Object obj) {
        C0CNO.LIZLLL(0L, new C523310Kfh((MvChoosePhotoScene) awS1S0700000_8.l0, ((Boolean) obj).booleanValue(), (C259800zU) awS1S0700000_8.l1, (C013C) awS1S0700000_8.l2, (RecordConfig.Builder) awS1S0700000_8.l3, (C118300cf) awS1S0700000_8.l4, (C118300cf) awS1S0700000_8.l5, (C259800zU) awS1S0700000_8.l6));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0700000_8 awS1S0700000_8, Object obj) {
        boolean z;
        int i;
        C0MAE c0mae = (C0MAE) obj;
        int i2 = 0;
        if (((List) awS1S0700000_8.l0).size() == 1) {
            z = true;
        } else {
            z = false;
        }
        List list = (List) awS1S0700000_8.l0;
        C0M22 c0m22 = (C0M22) awS1S0700000_8.l1;
        Set set = (Set) awS1S0700000_8.l2;
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS1S0700000_8.l3;
        Function1 function1 = (Function1) awS1S0700000_8.l4;
        Function1 function12 = (Function1) awS1S0700000_8.l5;
        Function1 function13 = (Function1) awS1S0700000_8.l6;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C0M2A c0m2a = (C0M2A) obj2;
                if (i2 == 0) {
                    i = 8;
                } else {
                    i = 22;
                }
                AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(function13, (Function1<? super C0M2A, Unit>) c0m2a, (C0M2A) 167);
                List listLJJJIL = C13LP.LJJJIL(c0m2a.LIZIZ, 3);
                String string = c0m2a.LIZ.toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("header_");
                sbLIZ.append(string);
                c0mae.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "section_header", new C19719212De(-1388195280, new C0M2Z(c0m2a, c0m22, i, z, awS409S0200000_8, set), true));
                Function1 function14 = function1;
                c0mae.LIZJ(listLJJJIL.size(), new C020W(new C5180020c(string, 17), listLJJJIL, 107), new C020W(AFwS239S0000000_8.get$arr$(393), listLJJJIL, 108), new C19719212De(-632812321, new C1665940tSC(listLJJJIL, c0m22, set, interfaceC1631630sYr, function14, function12), true));
                i2 = i3;
                function1 = function14;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c0mae.LIZIZ("tail_spacer", "spacer", C562430M4b.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0700000_8(MvChoosePhotoScene mvChoosePhotoScene, MvChoosePhotoScene mvChoosePhotoScene2, C259800zU<TemplateSlot> c259800zU, C013C c013c, RecordConfig.Builder builder, C118300cf c118300cf, C118300cf c118300cf2, C259800zU<String> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = mvChoosePhotoScene;
        this.l1 = mvChoosePhotoScene2;
        this.l2 = c259800zU;
        this.l3 = c013c;
        this.l4 = builder;
        this.l5 = c118300cf;
        this.l6 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0700000_8(List list, List<C0M2A> list2, C0M22 c0m22, Set<String> set, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, Function1<? super String, Unit> function1, Function1<? super C0M0P, Unit> function12, Function1<? super C0M2A, Unit> function13) {
        super(1);
        this.$t = function13;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c0m22;
        this.l3 = set;
        this.l4 = interfaceC1631630sYr;
        this.l5 = function1;
        this.l6 = function12;
    }
}
