package kotlin.jvm.internal;

import X.AbstractC194560119y;
import X.C05YF;
import X.C09AY;
import X.C0C64;
import X.C0F2E;
import X.C0LCS;
import X.C11A0;
import X.C1443960ngA;
import X.C1448570nnb;
import X.C1453000nuk;
import X.C1622460sK4;
import X.C1622490sK7;
import X.C1628750sUD;
import X.C1644920suI;
import X.C1644940suK;
import X.C1650520t3K;
import X.C1650540t3M;
import X.C1650890t3v;
import X.C1650960t42;
import X.C1650980t44;
import X.C1660530tJT;
import X.C1662500tMe;
import X.C1668200tVq;
import X.C1675860tiC;
import X.C1677480tko;
import X.C1685910tyP;
import X.C194561119z;
import X.C2188811AlT;
import X.C375830EoP;
import X.C577500Mku;
import X.EnumC1662690tMx;
import X.EnumC992840bwY;
import X.InterfaceC1639870sm9;
import X.InterfaceC1644770su3;
import X.InterfaceC1651080t4E;
import X.InterfaceC1669010tX9;
import X.InterfaceC1679550to9;
import Y.AObjectS88S0110000_25;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelState;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.StickerPanelState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.v1;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterState;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import com.tts.oecverify.BdTuring;
import iyl.i3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS111S0110000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        LiveEvent<C1644940suK> liveEventKa0 = ((InterfaceC1644770su3) ((C05YF) obj)).ka0();
        if (liveEventKa0 != null) {
            C1644920suI c1644920suI = (C1644920suI) awS111S0110000_25.l0;
            liveEventKa0.LIZ(c1644920suI, new AObjectS88S0110000_25(c1644920suI, awS111S0110000_25.z1, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        AbstractC194560119y c194561119z;
        InterfaceC1639870sm9 interfaceC1639870sm9Invoke;
        FilterPanelState filterPanelState = (FilterPanelState) obj;
        if (awS111S0110000_25.z1) {
            c194561119z = new C11A0();
            FilterPanelViewModel filterPanelViewModel = (FilterPanelViewModel) awS111S0110000_25.l0;
            filterPanelViewModel.LLJJIII.setValue(EnumC992840bwY.ON_SHOWN);
            if (filterPanelViewModel.LLJJI != -1 && (interfaceC1639870sm9Invoke = filterPanelViewModel.LLIZ.invoke()) != null) {
                interfaceC1639870sm9Invoke.LJIJI(-1, true);
            }
        } else {
            c194561119z = new C194561119z();
            FilterPanelViewModel filterPanelViewModel2 = (FilterPanelViewModel) awS111S0110000_25.l0;
            filterPanelViewModel2.LLJJIII.setValue(EnumC992840bwY.ON_DISMISSED);
            InterfaceC1639870sm9 interfaceC1639870sm9Invoke2 = filterPanelViewModel2.LLIZ.invoke();
            if (interfaceC1639870sm9Invoke2 != null) {
                interfaceC1639870sm9Invoke2.LJIJJ();
            }
        }
        return filterPanelState.copy(c194561119z, filterPanelState.selectedFilter, filterPanelState.disableFilter, filterPanelState.data, filterPanelState.enterFilterBoxEvent, filterPanelState.pendingSelected);
    }

    public static final Object invoke$10(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        float fFloatValue;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        if (awS111S0110000_25.z1) {
            fFloatValue = 1.0f - ((Number) ((C1677480tko) awS111S0110000_25.l0).LIZLLL()).floatValue();
        } else {
            fFloatValue = ((Number) ((C1677480tko) awS111S0110000_25.l0).LIZLLL()).floatValue();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)) / 0.8f;
        float fIntBitsToFloat2 = (-fIntBitsToFloat) + ((Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)) + fIntBitsToFloat) * fFloatValue);
        interfaceC1669010tX9.LLIIJLIL();
        Float fValueOf = Float.valueOf(0.0f);
        long j = C1685910tyP.LJIIIZ;
        Float fValueOf2 = Float.valueOf(0.2f);
        long j2 = C1685910tyP.LJ;
        C1675860tiC.LJIIIZ(interfaceC1669010tX9, C1668200tVq.LIZIZ(new Pair[]{new Pair(fValueOf, new C1685910tyP(j)), new Pair(fValueOf2, new C1685910tyP(j2)), new Pair(Float.valueOf(0.8f), new C1685910tyP(j2)), new Pair(Float.valueOf(1.0f), new C1685910tyP(j))}, fIntBitsToFloat2, fIntBitsToFloat + fIntBitsToFloat2, 8), 0L, 0L, 0.0f, null, 6, 62);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        ((InterfaceC1651080t4E) ((C05YF) obj)).XI0().LIZ((C1650980t44) awS111S0110000_25.l0, awS111S0110000_25.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        VEDisplaySettings.Builder builder = (VEDisplaySettings.Builder) obj;
        if (awS111S0110000_25.z1) {
            VESize vESizeZ1 = ((C1628750sUD) awS111S0110000_25.l0).Z1();
            builder.enablePreviewResolutionDowngrading(true);
            builder.setPreviewDowngradingRenderSize(((C1628750sUD) awS111S0110000_25.l0).Z1());
            C1628750sUD c1628750sUD = (C1628750sUD) awS111S0110000_25.l0;
            c1628750sUD.LLIZLLLIL = vESizeZ1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downgrade to ");
            sbLIZ.append(vESizeZ1);
            c1628750sUD.w2(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            VESize vESizeH2 = ((C1628750sUD) awS111S0110000_25.l0).H2(C1448570nnb.LIZJ(C1660530tJT.LIZLLL(((C1628750sUD) awS111S0110000_25.l0).getCameraApiComponent().zA2())));
            builder.enablePreviewResolutionDowngrading(false);
            builder.setPreviewDowngradingRenderSize(vESizeH2);
            C1628750sUD c1628750sUD2 = (C1628750sUD) awS111S0110000_25.l0;
            c1628750sUD2.LLIZLLLIL = vESizeH2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("back to ");
            sbLIZ2.append(vESizeH2);
            c1628750sUD2.w2(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        EditFilterState editFilterState = (EditFilterState) obj;
        return editFilterState.copy(editFilterState.panelShow, editFilterState.photoEditorHidePanel, new C0LCS<>(new C1453000nuk(false, (FilterBean) awS111S0110000_25.l0, awS111S0110000_25.z1, (String) null, false, 56)), editFilterState.cancelStatus, editFilterState.switchFilter, editFilterState.data, editFilterState.gestureService, editFilterState.unRegisterGestureService, editFilterState.ui);
    }

    public static final Object invoke$14(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        boolean z;
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        if (!awS111S0110000_25.z1 && ((Boolean) ((Function0) awS111S0110000_25.l0).invoke()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1679550to9.LJIILIIL(z);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        String string;
        i3 i3Var = (i3) obj;
        boolean z = awS111S0110000_25.z1;
        if (z) {
            string = ((C1650540t3M) awS111S0110000_25.l0).LJIJJLI().getString(2131824459);
        } else {
            string = ((C1650540t3M) awS111S0110000_25.l0).LJIJJLI().getString(2131824458);
        }
        return i3.LJIIIZ(i3Var, 0, 0, 0, null, 0, z, false, false, false, false, string, null, 0, null, null, null, false, null, false, 0.0f, null, 268433343);
    }

    public static final Object invoke$16(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        String string;
        i3 i3Var = (i3) obj;
        boolean z = awS111S0110000_25.z1;
        C1650890t3v c1650890t3v = (C1650890t3v) awS111S0110000_25.l0;
        if (z) {
            string = ((Context) c1650890t3v.LLILZLL.getValue(c1650890t3v, C1650890t3v.LLJI[0])).getString(2131824459);
        } else {
            string = ((Context) c1650890t3v.LLILZLL.getValue(c1650890t3v, C1650890t3v.LLJI[0])).getString(2131824458);
        }
        return i3.LJIIIZ(i3Var, 0, 0, 0, null, 0, z, false, false, false, false, string, null, 0, null, null, null, false, null, false, 0.0f, null, 268433343);
    }

    public static final Object invoke$17(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        String string;
        i3 i3Var = (i3) obj;
        boolean z = awS111S0110000_25.z1;
        if (z) {
            string = ((C1650520t3K) awS111S0110000_25.l0).LJIJJLI().getString(2131824459);
        } else {
            string = ((C1650520t3K) awS111S0110000_25.l0).LJIJJLI().getString(2131824458);
        }
        return i3.LJIIIZ(i3Var, 0, 0, 0, null, 0, z, false, false, false, false, string, null, 0, null, null, null, false, null, false, 0.0f, null, 268433343);
    }

    public static final Object invoke$18(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        float fFloatValue;
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        if (awS111S0110000_25.z1) {
            fFloatValue = ((Number) ((C1677480tko) awS111S0110000_25.l0).LIZLLL()).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        interfaceC1679550to9.LJFF(fFloatValue);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        i3 i3Var = (i3) obj;
        if (awS111S0110000_25.z1) {
            return i3.LJIIIZ(i3Var, C577500Mku.LIZJ(1), 0, 0, null, 0, false, false, false, false, false, ((C1650960t42) awS111S0110000_25.l0).LIZ(2131824459), null, 0, null, null, null, false, null, false, 0.0f, null, 268433406);
        }
        return i3.LJIIIZ(i3Var, C577500Mku.LIZJ(0), 0, 0, null, 0, false, false, false, false, false, ((C1650960t42) awS111S0110000_25.l0).LIZ(2131824458), null, 0, null, null, null, false, null, false, 0.0f, null, 268433406);
    }

    public static final Object invoke$2(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        AbstractC194560119y c194561119z;
        StickerPanelState stickerPanelState = (StickerPanelState) obj;
        if (awS111S0110000_25.z1 && !((RecordStickerPanelViewModel) awS111S0110000_25.l0).LLJI) {
            c194561119z = new C11A0();
            ((RecordStickerPanelViewModel) awS111S0110000_25.l0).LLIZLLLIL.setValue(Boolean.TRUE);
        } else {
            c194561119z = new C194561119z();
            ((RecordStickerPanelViewModel) awS111S0110000_25.l0).LLIZLLLIL.setValue(Boolean.FALSE);
        }
        return stickerPanelState.copy(c194561119z);
    }

    public static final Object invoke$20(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        C1622490sK7.LIZJ((C1622460sK4) awS111S0110000_25.l0, (Effect) obj, awS111S0110000_25.z1, false, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        EnumC1662690tMx enumC1662690tMx;
        boolean z;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        boolean z2 = awS111S0110000_25.z1;
        if (z2) {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_CAMERA_FOR_LIVE_TAB_STATE;
        } else {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_CAMERA_PERMISSION_STATE;
        }
        if (!z2 && ((v1) awS111S0110000_25.l0).d5()) {
            z = true;
        } else {
            z = false;
        }
        return C1662500tMe.LIZ(c1662500tMe, enumC1662690tMx, null, null, false, false, null, false, false, z, false, null, null, false, null, 32254);
    }

    public static final Object invoke$4(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        EnumC1662690tMx enumC1662690tMx;
        boolean z;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        boolean z2 = awS111S0110000_25.z1;
        if (z2) {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_MIC_FOR_LIVE_TAB_STATE;
        } else {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_MIC_PERMISSION_STATE;
        }
        if (!z2 && ((v1) awS111S0110000_25.l0).d5()) {
            z = true;
        } else {
            z = false;
        }
        return C1662500tMe.LIZ(c1662500tMe, enumC1662690tMx, null, null, false, false, null, false, false, z, false, null, null, false, null, 32254);
    }

    public static final Object invoke$5(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        EnumC1662690tMx enumC1662690tMx;
        boolean z;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        boolean z2 = awS111S0110000_25.z1;
        if (z2) {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_CAMERA_AND_MIC_FOR_LIVE_TAB_STATE;
        } else {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE;
        }
        if (!z2 && ((v1) awS111S0110000_25.l0).d5()) {
            z = true;
        } else {
            z = false;
        }
        return C1662500tMe.LIZ(c1662500tMe, enumC1662690tMx, null, null, false, false, null, false, false, z, false, null, null, false, null, 32254);
    }

    public static final Object invoke$6(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        boolean z;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        C375830EoP c375830EoP = new C375830EoP(Boolean.TRUE);
        boolean z2 = !awS111S0110000_25.z1;
        if (((v1) awS111S0110000_25.l0).P4().couldShowToolbar() && !C1443960ngA.LJIIL(((v1) awS111S0110000_25.l0).getShortVideoContext())) {
            z = true;
        } else {
            z = false;
        }
        return C1662500tMe.LIZ(c1662500tMe, null, null, null, false, false, c375830EoP, z, z2, false, true, null, null, false, null, 31279);
    }

    public static final Object invoke$7(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        boolean z;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        C375830EoP c375830EoP = new C375830EoP(Boolean.TRUE);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_close_visible_on_living", true, true) && awS111S0110000_25.z1) {
            z = false;
        } else {
            z = true;
        }
        return C1662500tMe.LIZ(c1662500tMe, null, null, null, false, false, c375830EoP, ((v1) awS111S0110000_25.l0).P4().couldShowToolbar(), z, false, true, null, null, false, null, 31279);
    }

    public static final Object invoke$8(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        return C0F2E.LIZ((C0F2E) obj, awS111S0110000_25.z1, (Bitmap) awS111S0110000_25.l0, false, 4);
    }

    public static final Object invoke$9(AwS111S0110000_25 awS111S0110000_25, Object obj) {
        return C0F2E.LIZ((C0F2E) obj, awS111S0110000_25.z1, (Bitmap) awS111S0110000_25.l0, false, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(C1622460sK4 c1622460sK4, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1622460sK4;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(C1644920suI c1644920suI, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1644920suI;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(C1650980t44 c1650980t44, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1650980t44;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(C1677480tko c1677480tko, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1677480tko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(Bitmap bitmap, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(FilterBean filterBean, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = filterBean;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, C1628750sUD c1628750sUD, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1628750sUD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, C1650520t3K c1650520t3K, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1650520t3K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, C1650540t3M c1650540t3M, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1650540t3M;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, C1650890t3v c1650890t3v, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1650890t3v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, C1650960t42 c1650960t42, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1650960t42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, FilterPanelViewModel filterPanelViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = filterPanelViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, RecordStickerPanelViewModel recordStickerPanelViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = recordStickerPanelViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S0110000_25(boolean z, v1 v1Var, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = v1Var;
    }
}
