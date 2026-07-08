package kotlin.jvm.internal;

import X.C09AY;
import X.C1101600ely;
import X.C1115580f8W;
import X.C1115590f8X;
import X.C1127520fRm;
import X.C1127980fSW;
import X.C1128300fT2;
import X.C1128320fT4;
import X.C1128340fT6;
import X.C1128350fT7;
import X.C784440Upu;
import X.EnumC1101860emO;
import X.EnumC1120860fH2;
import X.InterfaceC1631620sYq;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public class AwS666S0100000_17 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
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
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(C1101600ely c1101600ely, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1101600ely;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(C1115580f8W c1115580f8W, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1115580f8W;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(C1115590f8X c1115590f8X, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1115590f8X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(C1127520fRm c1127520fRm, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1127520fRm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(C1128340fT6 c1128340fT6, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1128340fT6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(PreviewServicePlusWidget previewServicePlusWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = previewServicePlusWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS666S0100000_17(QRCodeSharePackage qRCodeSharePackage, int i) {
        super(3);
        this.$t = i;
        this.l0 = qRCodeSharePackage;
    }

    public static final Object invoke$0(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        EnumC1120860fH2 enumC1120860fH2 = (EnumC1120860fH2) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (num != null) {
            PreviewServicePlusWidget previewServicePlusWidget = (PreviewServicePlusWidget) awS666S0100000_17.l0;
            previewServicePlusWidget.LLLI = num.intValue();
            previewServicePlusWidget.T1((ImageView) previewServicePlusWidget.findViewById(R.id.widget_icon));
        }
        if (enumC1120860fH2 == EnumC1120860fH2.GUIDE_SERVICE_PLUS_IN_PENDING_REVOKE) {
            ((PreviewServicePlusWidget) awS666S0100000_17.l0).LLJJJ = System.currentTimeMillis();
            PreviewServicePlusWidget.m2((PreviewServicePlusWidget) awS666S0100000_17.l0, enumC1120860fH2, iIntValue, null, 4);
        } else if (enumC1120860fH2 == EnumC1120860fH2.SERVICE_PLUS_GO_LIVE_DEACTIVATED) {
            ((PreviewServicePlusWidget) awS666S0100000_17.l0).LLJJIJIL = System.currentTimeMillis();
            PreviewServicePlusWidget.m2((PreviewServicePlusWidget) awS666S0100000_17.l0, enumC1120860fH2, iIntValue, null, 4);
        } else if (enumC1120860fH2 == EnumC1120860fH2.GUIDE_SERVICE_PLUS_IN_REVOKED) {
            ((PreviewServicePlusWidget) awS666S0100000_17.l0).LLJJJIL = System.currentTimeMillis();
            PreviewServicePlusWidget.m2((PreviewServicePlusWidget) awS666S0100000_17.l0, enumC1120860fH2, iIntValue, null, 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        View view = ((QRCodeSharePackage) awS666S0100000_17.l0).qrCodeContainerView;
        if (view != null) {
            return new Pair(view, layoutParams);
        }
        return null;
    }

    public static final Object invoke$2(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        InterfaceC1631620sYq<? super C1128350fT7, ? super Boolean, ? super Integer, Unit> interfaceC1631620sYq = ((C1128340fT6) awS666S0100000_17.l0).LLILZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(obj, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        ((C1101600ely) awS666S0100000_17.l0).LJI((EnumC1101860emO) obj, (String) obj2, (String) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        ((C1101600ely) awS666S0100000_17.l0).LJI((EnumC1101860emO) obj, (String) obj2, (String) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        C1128350fT7 c1128350fT7 = (C1128350fT7) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        ((C1127520fRm) awS666S0100000_17.l0).LLILLJJLI.LIZIZ = Long.valueOf(c1128350fT7.LIZJ.colorId.longValue());
        C784440Upu.LIZ().LIZIZ(new C1127980fSW(c1128350fT7.LIZJ.colorId, zBooleanValue));
        Long lValueOf = Long.valueOf(c1128350fT7.LIZIZ);
        Long l = c1128350fT7.LIZJ.colorId;
        Integer numValueOf = Integer.valueOf(iIntValue);
        GiftColorInfo giftColorInfo = c1128350fT7.LIZJ;
        C1127520fRm c1127520fRm = (C1127520fRm) awS666S0100000_17.l0;
        Gift gift = c1127520fRm.LLILZ;
        C1128320fT4.LIZ(numValueOf, C1128300fT2.LJFF(giftColorInfo, C1128300fT2.LJIIIIZZ(gift), c1127520fRm.LLILLJJLI.LIZ), lValueOf, l);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        EmoteModel emoteModel = (EmoteModel) obj;
        int iIntValue = ((Number) obj3).intValue();
        ((C1115580f8W) awS666S0100000_17.l0).LLILZIL.setImageDrawable(emoteModel.emoteResource);
        ((C1115580f8W) awS666S0100000_17.l0).L5(emoteModel, (String) obj2, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS666S0100000_17 awS666S0100000_17, Object obj, Object obj2, Object obj3) {
        EmoteModel emoteModel = (EmoteModel) obj;
        int iIntValue = ((Number) obj3).intValue();
        ((C1115590f8X) awS666S0100000_17.l0).LLILZIL.setImageDrawable(emoteModel.emoteResource);
        ((C1115590f8X) awS666S0100000_17.l0).L5(emoteModel, (String) obj2, iIntValue);
        return Unit.LIZ;
    }
}
