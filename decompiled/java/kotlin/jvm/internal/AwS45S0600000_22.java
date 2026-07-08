package kotlin.jvm.internal;

import X.C09AY;
import X.C0C2U;
import X.C12BX;
import X.C12BY;
import X.C1413340msm;
import X.C1432320nNO;
import X.C1450070nq1;
import X.C2188811AlT;
import X.C415650GRn;
import X.C5183020f;
import X.InterfaceC1631620sYq;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public class AwS45S0600000_22 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS45S0600000_22 awS45S0600000_22, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEImagePublishEditPresenter [multi-images] compile image item failed, index: ");
        sbLIZ.append(((C1413340msm) awS45S0600000_22.l0).LIZ);
        sbLIZ.append(", code: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", msg: ");
        sbLIZ.append(str);
        sbLIZ.append(", failedCount: ");
        sbLIZ.append(((C1413340msm) awS45S0600000_22.l0).LIZJ);
        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        if (((C1413340msm) awS45S0600000_22.l0).LIZJ >= 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VEImagePublishEditPresenter [multi-images] compile failed, failed to max count, index: ");
            sbLIZ2.append(((C1413340msm) awS45S0600000_22.l0).LIZ);
            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS45S0600000_22.l1;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(Integer.valueOf(iIntValue), obj2, str);
            }
        } else if (C0C2U.LIZ(Integer.valueOf(iIntValue))) {
            C1413340msm c1413340msm = (C1413340msm) awS45S0600000_22.l0;
            c1413340msm.LIZJ++;
            ((C1432320nNO) awS45S0600000_22.l2).LJI(c1413340msm, (List) awS45S0600000_22.l3, (CreativeModel) awS45S0600000_22.l4, (Function2) awS45S0600000_22.l5, (InterfaceC1631620sYq) awS45S0600000_22.l1, null, false);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("VEImagePublishEditPresenter multi-images] compile image item failed, code(");
            sbLIZ3.append(iIntValue);
            sbLIZ3.append(") is not in allowed list, index: ");
            sbLIZ3.append(((C1413340msm) awS45S0600000_22.l0).LIZ);
            sbLIZ3.append(", msg: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", failedCount: ");
            sbLIZ3.append(((C1413340msm) awS45S0600000_22.l0).LIZJ);
            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ3));
            InterfaceC1631620sYq interfaceC1631620sYq2 = (InterfaceC1631620sYq) awS45S0600000_22.l1;
            if (interfaceC1631620sYq2 != null) {
                interfaceC1631620sYq2.invoke(Integer.valueOf(iIntValue), obj2, str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0600000_22 awS45S0600000_22, Object obj, Object obj2, Object obj3) {
        C12BY.LIZJ((User) awS45S0600000_22.l0, (StoryNoteInfoModel) awS45S0600000_22.l1, new AwS37S0600000_22((C415650GRn) obj, (C415650GRn) obj2, (Bitmap) awS45S0600000_22.l2, (C12BX) awS45S0600000_22.l3, (View) awS45S0600000_22.l4, (Function1<? super Bitmap, Unit>) awS45S0600000_22.l5, (ImageView) 4));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0600000_22(C1413340msm c1413340msm, C1413340msm c1413340msm2, InterfaceC1631620sYq<? super Integer, ? super Exception, ? super String, Unit> interfaceC1631620sYq, C1432320nNO c1432320nNO, List<SingleImageData> list, CreativeModel creativeModel, Function2<? super Integer, ? super ImageSynthesisResult, Unit> function2) {
        super(3);
        this.$t = function2;
        this.l0 = c1413340msm;
        this.l1 = c1413340msm2;
        this.l2 = interfaceC1631620sYq;
        this.l3 = c1432320nNO;
        this.l4 = list;
        this.l5 = creativeModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0600000_22(User user, StoryNoteInfoModel storyNoteInfoModel, C12BX c12bx, View view, C5183020f c5183020f, ImageView imageView, int i) {
        super(3);
        this.$t = i;
        this.l0 = user;
        this.l1 = storyNoteInfoModel;
        this.l2 = c12bx;
        this.l3 = view;
        this.l4 = c5183020f;
        this.l5 = imageView;
    }
}
