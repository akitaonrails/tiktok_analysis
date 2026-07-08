package kotlin.jvm.internal;

import X.C09AY;
import X.C1420250n3v;
import X.C1656090tCJ;
import X.C1846220y8y;
import X.C2188811AlT;
import Y.ARunnableS122S0100000_22;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS19S1210000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S1210000_22 awS19S1210000_22) {
        C1656090tCJ c1656090tCJ = (C1656090tCJ) awS19S1210000_22.l1;
        List<String> list = (List) awS19S1210000_22.l2;
        String str = awS19S1210000_22.s0;
        boolean z = awS19S1210000_22.z3;
        HashMap<Integer, List<String>> multiStickers = c1656090tCJ.LJIIJJI.getMultiStickers();
        if (multiStickers == null || multiStickers.isEmpty()) {
            c1656090tCJ.LJIIJJI.initSegmentEffectPhoto();
        }
        if (z && c1656090tCJ.LJIJJLI) {
            c1656090tCJ.LJIIJJI.addMultiImagesAfterShoot(list);
        } else {
            c1656090tCJ.LJIIJJI.addMultiImages(list);
        }
        c1656090tCJ.LJIIJJI.bindSegmentEffectPhoto(list, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S1210000_22 awS19S1210000_22) {
        if (awS19S1210000_22.z3) {
            String str = awS19S1210000_22.s0;
            String str2 = ((TemplateCategoryData) awS19S1210000_22.l1).key;
            Keva kevaLIZIZ = C1420250n3v.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("template_tab_lottie_played_");
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            kevaLIZIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
        C1846220y8y c1846220y8y = (C1846220y8y) awS19S1210000_22.l2;
        String str3 = ((TemplateCategoryData) awS19S1210000_22.l1).key;
        if (!c1846220y8y.LLJLLIL.contains(str3)) {
            c1846220y8y.LLJLL.add(str3);
            HandlerHook.viewPost(c1846220y8y, new ARunnableS122S0100000_22(c1846220y8y, 7));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS19S1210000_22(C1656090tCJ c1656090tCJ, C1656090tCJ c1656090tCJ2, List<String> list, String str, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l1 = c1656090tCJ;
        this.l2 = c1656090tCJ2;
        this.s0 = list;
        this.z3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1210000_22(boolean z, String str, TemplateCategoryData templateCategoryData, C1846220y8y c1846220y8y, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.s0 = str;
        this.l1 = templateCategoryData;
        this.l2 = c1846220y8y;
    }
}
