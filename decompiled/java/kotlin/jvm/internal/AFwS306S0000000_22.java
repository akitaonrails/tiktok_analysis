package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C11NZ;
import X.C1412720mrm;
import X.C1412800mru;
import X.C1429320nIY;
import X.C1429550nIv;
import X.C20684815ws;
import X.C303380Buq;
import X.EnumC1430380nKG;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetParentType;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public class AFwS306S0000000_22 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(17);
    public final int $t;

    public static AFwS306S0000000_22 get$arr$(int i) {
        AFwS306S0000000_22 aFwS306S0000000_22 = (AFwS306S0000000_22) arr$.get(i);
        if (aFwS306S0000000_22 != null) {
            return aFwS306S0000000_22;
        }
        arr$.compareAndSet(i, null, new AFwS306S0000000_22(i));
        return (AFwS306S0000000_22) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS306S0000000_22(int i) {
        super(2);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        return C1429550nIv.LIZ((EnumC1430380nKG) obj, (String) obj2);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$11(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$12(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("exit_method", (String) obj);
        c0lab.LJFF("is_intercept", zBooleanValue);
        C20684815ws.LJIILLIIL("creative_exit_intercept", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        StickerItemModel stickerItemModel = (StickerItemModel) obj;
        StickerItemModel stickerItemModel2 = (StickerItemModel) obj2;
        IAVPublishService iAVPublishService = C1429320nIY.LIZ;
        boolean z = false;
        if (stickerItemModel2.getId() == stickerItemModel.getId() && stickerItemModel2.scale == stickerItemModel.scale && stickerItemModel2.maxScale == stickerItemModel.maxScale && stickerItemModel2.minScale == stickerItemModel.minScale && stickerItemModel2.rotateAngle == stickerItemModel.rotateAngle && stickerItemModel2.currentOffsetX == stickerItemModel.currentOffsetX && stickerItemModel2.currentOffsetY == stickerItemModel.currentOffsetY && stickerItemModel2.isAnimate == stickerItemModel.isAnimate && stickerItemModel2.isImageStickerLayer == stickerItemModel.isImageStickerLayer && Intrinsics.LJFF(stickerItemModel2.pinAlgorithmFile, stickerItemModel.pinAlgorithmFile) && stickerItemModel2.isPin == stickerItemModel.isPin && stickerItemModel2.x == stickerItemModel.x && stickerItemModel2.y == stickerItemModel.y && stickerItemModel2.w == stickerItemModel.w && stickerItemModel2.h == stickerItemModel.h && stickerItemModel2.isAnimationLoop == stickerItemModel.isAnimationLoop && Intrinsics.LJFF(stickerItemModel2.inStickerId, stickerItemModel.inStickerId) && Intrinsics.LJFF(stickerItemModel2.inPath, stickerItemModel.inPath) && stickerItemModel2.inDuration == stickerItemModel.inDuration && Intrinsics.LJFF(stickerItemModel2.outPath, stickerItemModel.outPath) && stickerItemModel2.outDuration == stickerItemModel.outDuration && stickerItemModel2.ratio == stickerItemModel.ratio && Intrinsics.LJFF(stickerItemModel2.stickerMobParams, stickerItemModel.stickerMobParams) && Intrinsics.LJFF(stickerItemModel2.adjustTextStyleInEditorPro, stickerItemModel.adjustTextStyleInEditorPro) && Intrinsics.LJFF(stickerItemModel2.adjustTextParagraph, stickerItemModel.adjustTextParagraph) && Intrinsics.LJFF(stickerItemModel2.adjustTextFontInEditorPro, stickerItemModel.adjustTextFontInEditorPro) && Intrinsics.LJFF(stickerItemModel2.adjustTextColorInEditorPro, stickerItemModel.adjustTextColorInEditorPro) && Intrinsics.LJFF(stickerItemModel2.adjustTextPositionInEditorPro, stickerItemModel.adjustTextPositionInEditorPro) && Intrinsics.LJFF(stickerItemModel2.isEditorProTrimLength, stickerItemModel.isEditorProTrimLength) && Intrinsics.LJFF(stickerItemModel2.isEditorProText, stickerItemModel.isEditorProText) && Intrinsics.LJFF(stickerItemModel2.isEditorProCopyText, stickerItemModel.isEditorProCopyText) && Intrinsics.LJFF(stickerItemModel2.isEditorProTTS, stickerItemModel.isEditorProTTS) && Intrinsics.LJFF(stickerItemModel2.editorProTTSID, stickerItemModel.editorProTTSID) && Intrinsics.LJFF(stickerItemModel2.isEditorProCaption, stickerItemModel.isEditorProCaption) && stickerItemModel2.isDynamicSticker == stickerItemModel.isDynamicSticker && Intrinsics.LJFF(stickerItemModel2.getDrawRect(), stickerItemModel.getDrawRect()) && Intrinsics.LJFF(stickerItemModel2.providerEffect, stickerItemModel.providerEffect) && Intrinsics.LJFF(stickerItemModel2.resId, stickerItemModel.resId) && Intrinsics.LJFF(stickerItemModel2.panel, stickerItemModel.panel) && stickerItemModel2.isFromEditorPro == stickerItemModel.isFromEditorPro && Intrinsics.LJFF(stickerItemModel2.utf8Code, stickerItemModel.utf8Code) && stickerItemModel2.photoModeShareToStoryRatio == stickerItemModel.photoModeShareToStoryRatio && stickerItemModel2.isAttributionLink == stickerItemModel.isAttributionLink) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        return ((C11NZ) obj2).LJLI((C11NZ) obj);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        int value;
        Integer numValueOf;
        int iIntValue = ((Number) obj).intValue();
        C1412800mru c1412800mru = (C1412800mru) obj2;
        String strLIZIZ = c1412800mru.LIZIZ();
        Asset asset = c1412800mru.LIZLLL;
        if (asset != null) {
            value = asset.getAsset_parent_type();
        } else {
            value = AssetParentType.TEMPLATE.getValue();
        }
        Asset asset2 = c1412800mru.LIZLLL;
        if (asset2 != null) {
            numValueOf = Integer.valueOf(asset2.getAsset_type());
        } else {
            numValueOf = null;
        }
        String str = c1412800mru.LIZIZ;
        if (str.length() <= 0) {
            str = null;
        }
        return new C1412720mrm(strLIZIZ, str, value, iIntValue, numValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AFwS306S0000000_22 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r3 = r8.getFirst()
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r3 = (com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) r3
            java.lang.Object r4 = r8.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            com.ss.android.ugc.effectmanager.effect.model.AssetParentType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetParentType.TEMPLATE
            int r6 = r0.getValue()
            int r0 = r3.templateType
            X.0mre r0 = X.C1412660mrg.LIZJ(r0)
            r2 = 0
            if (r0 == 0) goto L2e
            int[] r1 = X.C1412670mrh.LIZIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L44;
                case 3: goto L47;
                case 4: goto L4a;
                case 5: goto L4d;
                case 6: goto L50;
                case 7: goto L53;
                case 8: goto L56;
                case 9: goto L59;
                case 10: goto L5c;
                default: goto L2e;
            }
        L2e:
            r8 = r2
        L2f:
            java.lang.String r5 = r3.name
            if (r5 == 0) goto L3f
            int r0 = r5.length()
            if (r0 <= 0) goto L3f
        L39:
            X.0mrm r3 = new X.0mrm
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L3f:
            r5 = r2
            goto L39
        L41:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.CAPCUT_TEMPLATE
            goto L5e
        L44:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.UGC_TEMPLATE
            goto L5e
        L47:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.AUTOCUT_AI_TEMPLATE_V2
            goto L5e
        L4a:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.PUGC_TEMPLATE
            goto L5e
        L4d:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.IMAGE_TEXT_TEMPLATE
            goto L5e
        L50:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.AIGT
            goto L5e
        L53:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.SOUND_SYNC
            goto L5e
        L56:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.AI_ALIVE_TEMPLATE
            goto L5e
        L59:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.AUTO_PICK_TEMPLATE
            goto L5e
        L5c:
            com.ss.android.ugc.effectmanager.effect.model.AssetType r0 = com.ss.android.ugc.effectmanager.effect.model.AssetType.LYRICS_RULE_TEMPLATE
        L5e:
            if (r0 == 0) goto L2e
            int r0 = r0.getValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS306S0000000_22.invoke$4(kotlin.jvm.internal.AFwS306S0000000_22, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Runnable) obj2).run();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        C303380Buq.LIZ((String) obj, (Map) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        C303380Buq.LIZ((String) obj, (Map) obj2);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$8(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$9(AFwS306S0000000_22 aFwS306S0000000_22, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }
}
