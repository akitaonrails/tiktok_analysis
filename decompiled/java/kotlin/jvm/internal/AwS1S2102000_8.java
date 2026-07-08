package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C0LDJ;
import X.C0MH8;
import X.C1AF0;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2471909mP;
import X.C576730Mjf;
import X.C576760Mji;
import X.C576800Mjm;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS1S2102000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS1S2102000_8 awS1S2102000_8) throws Throwable {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        boolean z = false;
        if (C2286708xd.LIZJ(awS1S2102000_8.s0)) {
            boolean zLIZJ = C2471909mP.LIZJ(awS1S2102000_8.s0, awS1S2102000_8.s1);
            if (zLIZJ) {
                C0MH8.LIZ.LIZ((VideoPublishEditModel) awS1S2102000_8.l2, new CoverNewItem(awS1S2102000_8.i3, awS1S2102000_8.s1, awS1S2102000_8.i4, null, 0L, null, Float.valueOf(((VideoPublishEditModel) awS1S2102000_8.l2).getVideoCoverStartTm()), 56, null), false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("new cover copied: ");
                CoverPublishModel coverPublishModel = ((VideoPublishEditModel) awS1S2102000_8.l2).creativeModel.coverPublishModel;
                if (coverPublishModel != null) {
                    newCoverList = coverPublishModel.getNewCoverList();
                } else {
                    newCoverList = null;
                }
                sbLIZ.append(newCoverList);
                C0MH8.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                zLIZJ = false;
                C0MH8.LIZ.getClass();
                C0MH8.LJIIL("copy failed");
            }
            z = zLIZJ;
        } else {
            C1AF0.LJ(new Throwable("copyFromPath, origin file not exist"));
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS1S2102000_8 awS1S2102000_8) {
        C576730Mjf.LJIIIZ("CameraLayoutGoNextComponent", "onCompileDone");
        ((C576760Mji) awS1S2102000_8.l2).LLJJLIIIJLLLLLLLZ.onNext(new C576800Mjm(awS1S2102000_8.s0, awS1S2102000_8.s1, awS1S2102000_8.i3, awS1S2102000_8.i4));
        C0LDJ c0ldj = C0LDJ.LIZ;
        C0LAB c0lab = ((C576760Mji) awS1S2102000_8.l2).LLJLLIL;
        c0ldj.getClass();
        C0LDJ.LJI(c0lab);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2102000_8(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String str2, int i3) {
        super(0);
        this.$t = i3;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = videoPublishEditModel;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2102000_8(C576760Mji c576760Mji, String str, String str2, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l2 = c576760Mji;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
        this.i4 = i2;
    }
}
