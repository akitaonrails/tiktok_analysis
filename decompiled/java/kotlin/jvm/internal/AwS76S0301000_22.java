package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1308910kAL;
import X.C1452090ntH;
import X.C1453160nv0;
import X.InterfaceC1452170ntP;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS76S0301000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS76S0301000_22 awS76S0301000_22) {
        PublishService publishService = (PublishService) awS76S0301000_22.l0;
        return publishService.LIZLLL(publishService, PublishService.LIZIZ((Bitmap) awS76S0301000_22.l1, (PublishModel) awS76S0301000_22.l2), awS76S0301000_22.i3 / 100.0f);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final Object invoke$1(AwS76S0301000_22 awS76S0301000_22) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiterC3;
        int iIntValue = 0;
        if (!((C013C) awS76S0301000_22.l0).element) {
            if (((C1453160nv0) awS76S0301000_22.l1).LJIILLIIL && (vEEditorAutoStartStopArbiterC3 = ((C1452090ntH) awS76S0301000_22.l2).c3()) != null) {
                vEEditorAutoStartStopArbiterC3.LIZJ(true, false, ((C1453160nv0) awS76S0301000_22.l1).LJI);
            }
            InterfaceC1452170ntP interfaceC1452170ntPO4 = ((C1452090ntH) awS76S0301000_22.l2).O4();
            if (interfaceC1452170ntPO4 != null) {
                interfaceC1452170ntPO4.setBackgroundColor(awS76S0301000_22.i3);
            }
            VideoPublishEditContainerScene videoPublishEditContainerSceneKc = ((C1452090ntH) awS76S0301000_22.l2).Kc();
            if (videoPublishEditContainerSceneKc != null) {
                videoPublishEditContainerSceneKc.LLLLLLIL(awS76S0301000_22.i3);
            }
            ((C1452090ntH) awS76S0301000_22.l2).V.setValue(Integer.valueOf(awS76S0301000_22.i3));
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, ((C1452090ntH) awS76S0301000_22.l2).getActivity());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            VideoPublishEditContainerScene videoPublishEditContainerSceneKc2 = ((C1452090ntH) awS76S0301000_22.l2).Kc();
            if (videoPublishEditContainerSceneKc2 != null) {
                videoPublishEditContainerSceneKc2.LLLLLLIL(iIntValue);
            }
            ((C1452090ntH) awS76S0301000_22.l2).V.setValue(Integer.valueOf(iIntValue));
        }
        ?? r0 = ((C1453160nv0) awS76S0301000_22.l1).LJIIJJI;
        if (r0 != 0) {
            r0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS76S0301000_22(C013C c013c, C013C c013c2, C1453160nv0 c1453160nv0, C1452090ntH<Object> c1452090ntH, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c1453160nv0;
        this.i3 = c1452090ntH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0301000_22(PublishService publishService, int i, Bitmap bitmap, PublishModel publishModel, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = publishService;
        this.i3 = i;
        this.l1 = bitmap;
        this.l2 = publishModel;
    }
}
