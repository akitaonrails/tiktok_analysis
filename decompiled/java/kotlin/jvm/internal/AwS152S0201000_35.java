package kotlin.jvm.internal;

import X.C048M;
import X.C09AY;
import X.C1054104Ah;
import X.C1748720vbi;
import X.C1DGP;
import X.C1DIE;
import X.C1DUJ;
import X.C1DYW;
import X.C1DYZ;
import X.C2253341DHo;
import X.C2254091DKl;
import X.EnumC2249781D3w;
import X.InterfaceC2240011Clr;
import X.InterfaceC2253331DHn;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.solution.gear_center.LyraxGearCenterImpl;
import com.ss.solution.gear_center.LyraxManualLevelSource;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS152S0201000_35 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS152S0201000_35 awS152S0201000_35) {
        return C1DGP.LIZ(new AwS116S0201000_35(awS152S0201000_35.i2, (ShortVideoContext) awS152S0201000_35.l1, (C2254091DKl) awS152S0201000_35.l0, 1));
    }

    public static final Object invoke$1(AwS152S0201000_35 awS152S0201000_35) {
        C1054104Ah c1054104Ah = ((SeaPdpCouponsViewHolder) awS152S0201000_35.l0).e6().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJIILJJIL(awS152S0201000_35.i2 + 1, (Voucher) awS152S0201000_35.l1);
        }
        Integer costType = ((Voucher) awS152S0201000_35.l1).getCostType();
        if (costType != null && costType.intValue() == 3) {
            C1748720vbi.LIZLLL(((SeaPdpCouponsViewHolder) awS152S0201000_35.l0).itemView, new C048M(), AFwS283S0000000_35.get$arr$(5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS152S0201000_35 awS152S0201000_35) {
        LyraxManualLevelSource lyraxManualLevelSource;
        LyraxGearCenterImpl lyraxGearCenterImpl = ((VideoQualityStrategyManagerV2) awS152S0201000_35.l0).LJ;
        if (lyraxGearCenterImpl != null) {
            int i = awS152S0201000_35.i2;
            VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2 = (VideoQualityStrategyManagerV2) awS152S0201000_35.l0;
            EnumC2249781D3w enumC2249781D3w = (EnumC2249781D3w) awS152S0201000_35.l1;
            videoQualityStrategyManagerV2.getClass();
            int i2 = VideoQualityStrategyManagerV2.WhenMappings.LIZLLL[enumC2249781D3w.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    lyraxManualLevelSource = LyraxManualLevelSource.Default;
                } else {
                    lyraxManualLevelSource = LyraxManualLevelSource.ManualProbe;
                }
            } else {
                lyraxManualLevelSource = LyraxManualLevelSource.Selected;
            }
            lyraxGearCenterImpl.setManualLevel(i, lyraxManualLevelSource);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS152S0201000_35 awS152S0201000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYW) awS152S0201000_35.l0).getNativeAddress$machine_core_release();
        int i = awS152S0201000_35.i2;
        long nativeAddress$machine_core_release2 = ((C1DYZ) awS152S0201000_35.l1).getNativeAddress$machine_core_release();
        c1duj.getClass();
        return Boolean.valueOf(TTMContainer.ttmNativePutAddress(nativeAddress$machine_core_release, null, i, nativeAddress$machine_core_release2));
    }

    public static final Object invoke$4(AwS152S0201000_35 awS152S0201000_35) {
        VECameraController vECameraController = (VECameraController) awS152S0201000_35.l0;
        vECameraController.LLJJIJIIJIL = false;
        vECameraController.LLJJIJIL = -1;
        C2253341DHo.LIZ = -1;
        vECameraController.LLL = 0.0f;
        vECameraController.LLLF = 0.0f;
        InterfaceC2240011Clr interfaceC2240011Clr = vECameraController.LLJJ;
        if (interfaceC2240011Clr != null) {
            C1DIE c1die = (C1DIE) awS152S0201000_35.l1;
            interfaceC2240011Clr.LJIIL(c1die.LIZ, c1die.LIZIZ);
        }
        CopyOnWriteArrayList<InterfaceC2253331DHn> copyOnWriteArrayList = ((VECameraController) awS152S0201000_35.l0).LLJILJIL;
        int i = awS152S0201000_35.i2;
        C1DIE c1die2 = (C1DIE) awS152S0201000_35.l1;
        Iterator<InterfaceC2253331DHn> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, c1die2.LIZ, c1die2.LIZIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0201000_35(int i, ShortVideoContext shortVideoContext, C2254091DKl c2254091DKl, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c2254091DKl;
        this.l1 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0201000_35(C1DYW c1dyw, int i, C1DYZ c1dyz, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1dyw;
        this.i2 = i;
        this.l1 = c1dyz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0201000_35(VECameraController vECameraController, C1DIE c1die, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = vECameraController;
        this.l1 = c1die;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0201000_35(SeaPdpCouponsViewHolder seaPdpCouponsViewHolder, Voucher voucher, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = seaPdpCouponsViewHolder;
        this.l1 = voucher;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0201000_35(VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2, int i, EnumC2249781D3w enumC2249781D3w, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = videoQualityStrategyManagerV2;
        this.i2 = i;
        this.l1 = enumC2249781D3w;
    }
}
