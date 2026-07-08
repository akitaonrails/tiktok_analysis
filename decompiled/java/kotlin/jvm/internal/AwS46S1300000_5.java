package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0E48;
import X.C0EC6;
import X.C0EC7;
import X.C0EG1;
import X.C0FSX;
import X.C0FVT;
import X.C0FWP;
import X.C122Q;
import X.C1397620mTQ;
import X.C1416310mxZ;
import X.C1664590tQ1;
import X.C19519111Yf;
import X.C361680EFy;
import X.InterfaceC1461660o8i;
import X.InterfaceC391240FVq;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS46S1300000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS46S1300000_5 awS46S1300000_5, Object obj) {
        C122Q c122qB02;
        List<StickerItemModel> list;
        TextStickerModel textStickerModelPj;
        C0FVT c0fvtKR;
        C0FWP c0fwpRi;
        C0FVT c0fvtKR2;
        C0FVT c0fvtKR3;
        InterfaceC391240FVq interfaceC391240FVqQj;
        if (C1416310mxZ.LJJLIIIJJIZ(((C19519111Yf) awS46S1300000_5.l1).LJJJLIIL())) {
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((C19519111Yf) awS46S1300000_5.l1).w2().AT().LIZJ();
            if (interfaceC1461660o8iLIZJ != null && (c0fvtKR2 = interfaceC1461660o8iLIZJ.kR()) != null) {
                textStickerModelPj = c0fvtKR2.Pj((TextStickerData) awS46S1300000_5.l2, true, AFwS234S0000000_5.get$arr$(121));
                if (textStickerModelPj != null) {
                    C19519111Yf c19519111Yf = (C19519111Yf) awS46S1300000_5.l1;
                    InterfaceC1461660o8i interfaceC1461660o8iLIZJ2 = c19519111Yf.w2().AT().LIZJ();
                    if (interfaceC1461660o8iLIZJ2 != null && (c0fvtKR3 = interfaceC1461660o8iLIZJ2.kR()) != null && (interfaceC391240FVqQj = c0fvtKR3.qj()) != null) {
                        interfaceC391240FVqQj.LLILII(true, C1664590tQ1.LJIIIZ(c19519111Yf).getString(2131858296), textStickerModelPj.getId(), C0FSX.BOTTOM, 51, Integer.valueOf(R.attr.ee), 5000, null, null);
                    }
                }
            } else {
                textStickerModelPj = null;
            }
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ3 = ((C19519111Yf) awS46S1300000_5.l1).w2().AT().LIZJ();
            if (interfaceC1461660o8iLIZJ3 != null && (c0fvtKR = interfaceC1461660o8iLIZJ3.kR()) != null && (c0fwpRi = c0fvtKR.Ri()) != null && textStickerModelPj != null) {
                c0fwpRi.LJIIJ(textStickerModelPj, false);
            }
        } else {
            ((StickerItemModel) awS46S1300000_5.l3).extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), (TextStickerData) awS46S1300000_5.l2);
            InfoStickerModel infoStickerModel = ((C19519111Yf) awS46S1300000_5.l1).LJJJLIIL().getInfoStickerModel();
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                list.add((StickerItemModel) awS46S1300000_5.l3);
            }
            ((C19519111Yf) awS46S1300000_5.l1).G2().Tx0(new AwS584S0100000_5((C19519111Yf) awS46S1300000_5.l1, 194));
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ4 = ((C19519111Yf) awS46S1300000_5.l1).w2().AT().LIZJ();
            if (interfaceC1461660o8iLIZJ4 != null && (c122qB02 = interfaceC1461660o8iLIZJ4.B02()) != null) {
                c122qB02.YH((TextStickerData) awS46S1300000_5.l2, awS46S1300000_5.s0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS46S1300000_5 awS46S1300000_5, Object obj) {
        ((C0EC7) ((C0EG1) awS46S1300000_5.l1).LIZJ.getValue()).Bi0(new C0EC6("click_secondary_menu", "replace"), false);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS46S1300000_5.l2;
        if (videoPublishEditModel != null) {
            C361680EFy.LJJJJ(videoPublishEditModel, (C0E48) awS46S1300000_5.l3, awS46S1300000_5.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS46S1300000_5 awS46S1300000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131829622, new AwS46S1300000_5((C0EG1) awS46S1300000_5.l1, (VideoPublishEditModel) awS46S1300000_5.l2, (C0E48) awS46S1300000_5.l3, awS46S1300000_5.s0, 1));
        c1397620mTQ.LJII(2131829621, AFwS234S0000000_5.get$arr$(372));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S1300000_5(C0EG1 c0eg1, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0eg1;
        this.l2 = videoPublishEditModel;
        this.l3 = c0e48;
        this.s0 = "1";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S1300000_5(C0EG1 c0eg1, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0eg1;
        this.l2 = videoPublishEditModel;
        this.l3 = c0e48;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S1300000_5(C19519111Yf c19519111Yf, TextStickerData textStickerData, StickerItemModel stickerItemModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19519111Yf;
        this.l2 = textStickerData;
        this.l3 = stickerItemModel;
        this.s0 = str;
    }
}
