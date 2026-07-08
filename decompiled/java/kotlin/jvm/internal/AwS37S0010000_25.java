package kotlin.jvm.internal;

import X.C05YF;
import X.C09AY;
import X.C0C64;
import X.C0F2E;
import X.C0LCS;
import X.C1453000nuk;
import X.C15438062q;
import X.C1557610qdT;
import X.C1630350sWn;
import X.C1637540siO;
import X.C1661900tLg;
import X.C1661930tLj;
import X.C1662190tM9;
import X.C1662500tMe;
import X.C1662520tMg;
import X.C1675860tiC;
import X.C1680770tq7;
import X.C1685850tyJ;
import X.C1685910tyP;
import X.C1688520u2c;
import X.C1695210uDP;
import X.C1780100wQK;
import X.C194561119z;
import X.C21593019ey;
import X.C375830EoP;
import X.C419910GdJ;
import X.C529130Kp5;
import X.C529150Kp7;
import X.EnumC1466150oFx;
import X.EnumC1662690tMx;
import X.EnumC1778840wOI;
import X.InterfaceC1647520syU;
import X.InterfaceC1649820t2C;
import X.InterfaceC1675870tiD;
import X.InterfaceC1679550to9;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelState;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story.StoryEditFilterState;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterState;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionPanelState;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS37S0010000_25 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0010000_25(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0010000_25(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        float f;
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        if (awS37S0010000_25.z0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        interfaceC1679550to9.setAlpha(f);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        FilterPanelState filterPanelState = (FilterPanelState) obj;
        return filterPanelState.copy(filterPanelState.ui, filterPanelState.selectedFilter, awS37S0010000_25.z0, filterPanelState.data, filterPanelState.enterFilterBoxEvent, filterPanelState.pendingSelected);
    }

    public static final Object invoke$10(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        EnumC1662690tMx enumC1662690tMx;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        if (awS37S0010000_25.z0) {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_MIC_FOR_LIVE_TAB_STATE;
        } else {
            enumC1662690tMx = EnumC1662690tMx.ONLY_REQUIRE_MIC_PERMISSION_STATE;
        }
        return C1662500tMe.LIZ(c1662500tMe, enumC1662690tMx, null, null, false, false, null, false, false, false, false, null, null, false, null, 32766);
    }

    public static final Object invoke$11(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        EnumC1662690tMx enumC1662690tMx;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        if (awS37S0010000_25.z0) {
            enumC1662690tMx = EnumC1662690tMx.ONLY_REQUIRE_MIC_PERMISSION_STATE;
        } else {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_MIC_PERMISSION_STATE;
        }
        return C1662500tMe.LIZ(c1662500tMe, enumC1662690tMx, null, null, false, false, null, false, false, false, false, null, null, false, null, 32766);
    }

    public static final Object invoke$12(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        EnumC1662690tMx enumC1662690tMx;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        if (awS37S0010000_25.z0) {
            enumC1662690tMx = EnumC1662690tMx.ONLY_REQUIRE_CAMERA_PERMISSION_STATE;
        } else {
            enumC1662690tMx = EnumC1662690tMx.REQUIRE_CAMERA_PERMISSION_STATE;
        }
        return C1662500tMe.LIZ(c1662500tMe, enumC1662690tMx, null, null, false, false, null, false, false, false, false, null, null, false, null, 32766);
    }

    public static final Object invoke$13(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C0F2E.LIZ((C0F2E) obj, awS37S0010000_25.z0, null, false, 6);
    }

    public static final Object invoke$14(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        StoryEditFilterState storyEditFilterState = (StoryEditFilterState) obj;
        return storyEditFilterState.copy(new C529130Kp5(awS37S0010000_25.z0), storyEditFilterState.curFilter, storyEditFilterState.cancelStatus, storyEditFilterState.data, storyEditFilterState.ui);
    }

    public static final Object invoke$15(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        C1661930tLj c1661930tLj = (C1661930tLj) obj;
        C1661900tLg c1661900tLg = c1661930tLj.LIZLLL;
        boolean z = awS37S0010000_25.z0;
        boolean z2 = c1661900tLg.LIZ;
        boolean z3 = c1661900tLg.LIZIZ;
        c1661900tLg.getClass();
        return C1661930tLj.LIZ(c1661930tLj, null, new C1661900tLg(z2, z3, z), 7);
    }

    public static final Object invoke$16(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        C1661930tLj c1661930tLj = (C1661930tLj) obj;
        C1661900tLg c1661900tLg = c1661930tLj.LIZLLL;
        boolean z = awS37S0010000_25.z0;
        boolean z2 = c1661900tLg.LIZ;
        boolean z3 = c1661900tLg.LIZJ;
        c1661900tLg.getClass();
        return C1661930tLj.LIZ(c1661930tLj, null, new C1661900tLg(z2, z, z3), 7);
    }

    public static final Object invoke$17(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        long jLIZLLL;
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fLIZJ = C1680770tq7.LIZJ(interfaceC1675870tiD.LIZIZ()) / 2.0f;
        if (awS37S0010000_25.z0) {
            jLIZLLL = C1685910tyP.LJ;
        } else {
            jLIZLLL = C1685850tyJ.LIZLLL(4288585374L);
        }
        C1675860tiC.LIZLLL(interfaceC1675870tiD, jLIZLLL, fLIZJ, jFloatToRawIntBits, 0.0f, null, 120);
        C1675860tiC.LIZLLL(interfaceC1675870tiD, C1685910tyP.LIZIZ, fLIZJ * 0.88f, jFloatToRawIntBits, 0.0f, new C1695210uDP(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) / 30.0f, 0.0f, 0, 0, null, 30), 104);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        EffectInfoPanelState effectInfoPanelState = (EffectInfoPanelState) obj;
        return effectInfoPanelState.copy(effectInfoPanelState.effect, effectInfoPanelState.creatorName, effectInfoPanelState.userId, awS37S0010000_25.z0, effectInfoPanelState.isFavoriteVisible, effectInfoPanelState.isReportAndBlockVisible, effectInfoPanelState.isDiscoverVisible, effectInfoPanelState.isPreviouslyVisible, effectInfoPanelState.wasVisible, effectInfoPanelState.ui);
    }

    public static final Object invoke$19(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        EditFilterState editFilterState = (EditFilterState) obj;
        return editFilterState.copy(editFilterState.panelShow, editFilterState.photoEditorHidePanel, new C0LCS<>(new C1453000nuk(false, (FilterBean) null, false, (String) null, !awS37S0010000_25.z0, 28)), new C529150Kp7(), editFilterState.switchFilter, editFilterState.data, editFilterState.gestureService, editFilterState.unRegisterGestureService, editFilterState.ui);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) ((C05YF) obj);
        List<StickerModel> listLLLILZLLLI = interfaceC1647520syU.LLLILZLLLI(EnumC1466150oFx.COMMENT);
        ArrayList<CommentStickerModel> arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        for (CommentStickerModel commentStickerModel : arrayList) {
            interfaceC1647520syU.J4(commentStickerModel.copy(commentStickerModel.baseStickerModel, commentStickerModel.commentStickerModel, commentStickerModel.alpha, awS37S0010000_25.z0, commentStickerModel.isCommentDeleted));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        EditFilterState editFilterState = (EditFilterState) obj;
        return editFilterState.copy(editFilterState.panelShow, editFilterState.photoEditorHidePanel, editFilterState.curFilter, editFilterState.cancelStatus, new C529130Kp5(awS37S0010000_25.z0), editFilterState.data, editFilterState.gestureService, editFilterState.unRegisterGestureService, editFilterState.ui);
    }

    public static final Object invoke$21(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C21593019ey.LIZ((C21593019ey) obj, null, null, null, null, new C375830EoP(Boolean.valueOf(awS37S0010000_25.z0)), null, null, 223);
    }

    public static final Object invoke$22(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        Effect effect;
        OptionPanelState optionPanelState = (OptionPanelState) obj;
        C194561119z c194561119z = new C194561119z();
        if (awS37S0010000_25.z0) {
            effect = optionPanelState.getEffect();
        } else {
            effect = null;
        }
        return optionPanelState.copy(c194561119z, effect, optionPanelState.isBottomSheetVisible);
    }

    public static final Object invoke$23(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        OptionPanelState optionPanelState = (OptionPanelState) obj;
        return optionPanelState.copy(optionPanelState.ui, optionPanelState.effect, awS37S0010000_25.z0);
    }

    public static final Object invoke$24(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1630350sWn.LIZ((C1630350sWn) obj, null, null, false, awS37S0010000_25.z0, false, null, null, null, 1007);
    }

    public static final Object invoke$25(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1630350sWn.LIZ((C1630350sWn) obj, null, null, false, awS37S0010000_25.z0, false, null, null, null, 1007);
    }

    public static final Object invoke$26(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1630350sWn.LIZ((C1630350sWn) obj, null, null, false, awS37S0010000_25.z0, false, null, null, null, 1007);
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        ((InterfaceC1649820t2C) ((C05YF) obj)).tq2(awS37S0010000_25.z0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1637540siO.LIZ((C1637540siO) obj, null, false, false, false, !awS37S0010000_25.z0, false, null, false, 959);
    }

    public static final Object invoke$29(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        int i;
        Integer numValueOf;
        TuxIconView tuxIconView = (TuxIconView) obj;
        boolean z = awS37S0010000_25.z0;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_like_fill;
        } else {
            i = R.raw.icon_like;
        }
        c419910GdJ.LIZ = i;
        if (z) {
            numValueOf = Integer.valueOf(R.attr.a04);
        } else {
            numValueOf = Integer.valueOf(R.attr.a00);
        }
        c419910GdJ.LJ = numValueOf;
        tuxIconView.setTuxIcon(c419910GdJ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1662190tM9.LIZ((C1662190tM9) obj, awS37S0010000_25.z0, null, false, 6);
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        ((InterfaceC1649820t2C) ((C05YF) obj)).W9(awS37S0010000_25.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1688520u2c.LIZ((C1688520u2c) obj, null, null, null, 0, 0, awS37S0010000_25.z0, false, 95);
    }

    public static final Object invoke$32(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1688520u2c.LIZ((C1688520u2c) obj, null, null, null, 0, 0, false, awS37S0010000_25.z0, 63);
    }

    public static final Object invoke$33(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1557610qdT.LIZ((C1557610qdT) obj, null, null, 0, awS37S0010000_25.z0, 7);
    }

    public static final Object invoke$4(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        VEDisplaySettings.Builder builder = (VEDisplaySettings.Builder) obj;
        if (awS37S0010000_25.z0) {
            if (Build.VERSION.SDK_INT >= 34) {
                builder.setHDR10BitDynamicRangeProfile(2L, 2L);
            } else {
                builder.setHDR10BitDynamicRangeProfile(2L, 4L);
            }
        } else {
            builder.setHDR10BitDynamicRangeProfile(1L, 1L);
        }
        builder.setFitMode(EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        C1780100wQK c1780100wQK = (C1780100wQK) obj;
        if (awS37S0010000_25.z0) {
            c1780100wQK.LIZIZ.enableHdr10BitEncode = true;
            c1780100wQK.LJI(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1);
        } else {
            c1780100wQK.LIZIZ.enableHdr10BitEncode = false;
            c1780100wQK.LJI(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1662500tMe.LIZ((C1662500tMe) obj, null, null, null, false, false, null, false, false, false, false, null, null, false, Boolean.valueOf(awS37S0010000_25.z0), 16383);
    }

    public static final Object invoke$7(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        return C1662500tMe.LIZ((C1662500tMe) obj, null, null, null, false, false, null, false, false, false, false, null, new C1662520tMg((Boolean) null, Boolean.valueOf(awS37S0010000_25.z0), (Boolean) null, 11), false, null, 28671);
    }

    public static final Object invoke$8(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        boolean z;
        boolean z2;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        C375830EoP c375830EoP = new C375830EoP(Boolean.TRUE);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_close_visible_on_living", true, true) && awS37S0010000_25.z0) {
            z = false;
        } else {
            z = true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_close_visible_on_living", true, true) && awS37S0010000_25.z0) {
            z2 = false;
        } else {
            z2 = true;
        }
        return C1662500tMe.LIZ(c1662500tMe, null, null, null, false, false, c375830EoP, z2, z, false, true, null, null, false, null, 31279);
    }

    public static final Object invoke$9(AwS37S0010000_25 awS37S0010000_25, Object obj) {
        C375830EoP c375830EoP = new C375830EoP(Boolean.valueOf(awS37S0010000_25.z0));
        boolean z = awS37S0010000_25.z0;
        return C1662500tMe.LIZ((C1662500tMe) obj, null, null, null, false, false, c375830EoP, z, z, false, z, null, null, false, null, 31279);
    }
}
