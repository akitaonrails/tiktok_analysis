package kotlin.jvm.internal;

import X.C09AY;
import X.C0EJ9;
import X.C0FMH;
import X.C0FO3;
import X.C1402910mbx;
import X.C1439810nZT;
import X.C194431114z;
import X.C383400F1m;
import X.C383460F1s;
import X.C389110FNl;
import X.C389250FNz;
import X.InterfaceC1631620sYq;
import X.InterfaceC388160FJu;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public class AwS654S0100000_5 extends C09AY implements InterfaceC1631620sYq {
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
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C0EJ9 c0ej9, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0ej9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C383460F1s c383460F1s, int i) {
        super(3);
        this.$t = i;
        this.l0 = c383460F1s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(InterfaceC388160FJu interfaceC388160FJu, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC388160FJu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C0FMH c0fmh, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0fmh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C389110FNl c389110FNl, int i) {
        super(3);
        this.$t = i;
        this.l0 = c389110FNl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C389250FNz c389250FNz, int i) {
        super(3);
        this.$t = i;
        this.l0 = c389250FNz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C1439810nZT c1439810nZT, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1439810nZT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(C194431114z c194431114z, int i) {
        super(3);
        this.$t = i;
        this.l0 = c194431114z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS654S0100000_5(VideoPublishEditModel videoPublishEditModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = videoPublishEditModel;
    }

    public static final Object invoke$0(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        TextTemplateTools.DependItem dependItem = (TextTemplateTools.DependItem) obj;
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) ((C0FMH) awS654S0100000_5.l0).LIZLLL.getValue();
        String str = dependItem.id;
        String str2 = dependItem.type;
        c1402910mbx.getClass();
        C1402910mbx.LJII(videoPublishEditModel, true, jLongValue, false, zBooleanValue, "", str, str2);
        return Unit.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:241|155|(2:157|(2:244|159)(2:246|245))(1:243)|160|(1:162)|163|(1:167)|168|(1:170)|171|(1:173)|174|222|175|(3:177|(2:179|(2:189|(3:193|226|194))(5:185|228|186|189|(4:191|193|226|194)))(0)|245)|199|247|245) */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0745, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0724 A[Catch: RuntimeException -> 0x0745, PHI: r12
      0x0724: PHI (r12v5 com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData) = 
      (r12v4 com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData)
      (r12v7 com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData)
      (r12v7 com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData)
      (r12v7 com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData)
      (r12v7 com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData)
     binds: [B:178:0x06fe, B:180:0x0708, B:182:0x0710, B:184:0x071c, B:186:0x071f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0745, blocks: (B:175:0x06ec, B:177:0x06f4, B:179:0x0700, B:181:0x070a, B:183:0x0712, B:189:0x0724, B:191:0x0730), top: B:222:0x06ec }] */
    /* JADX WARN: Type inference failed for: r100v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel] */
    /* JADX WARN: Type inference failed for: r101v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel] */
    /* JADX WARN: Type inference failed for: r102v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel] */
    /* JADX WARN: Type inference failed for: r103v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.EditViewUIState] */
    /* JADX WARN: Type inference failed for: r104v0, types: [X.0F7T] */
    /* JADX WARN: Type inference failed for: r105v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel] */
    /* JADX WARN: Type inference failed for: r108v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r112v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r50v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r54v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r58v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r63v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel] */
    /* JADX WARN: Type inference failed for: r69v0, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r72v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel] */
    /* JADX WARN: Type inference failed for: r74v0, types: [com.ss.ugc.effectplatform.model.TemplateEffectExtra] */
    /* JADX WARN: Type inference failed for: r76v0, types: [com.ss.ugc.effectplatform.model.DiffEffect] */
    /* JADX WARN: Type inference failed for: r78v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel] */
    /* JADX WARN: Type inference failed for: r79v1, types: [com.ss.android.ugc.aweme.sticker.data.TextStickerInfo] */
    /* JADX WARN: Type inference failed for: r80v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel] */
    /* JADX WARN: Type inference failed for: r81v1, types: [X.0FVR] */
    /* JADX WARN: Type inference failed for: r82v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r82v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel] */
    /* JADX WARN: Type inference failed for: r83v0, types: [com.ss.android.ugc.effectmanager.effect.model.EffectLabel] */
    /* JADX WARN: Type inference failed for: r84v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r84v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r87v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r91v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r92v0, types: [X.0F7S] */
    /* JADX WARN: Type inference failed for: r93v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel] */
    /* JADX WARN: Type inference failed for: r94v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel] */
    /* JADX WARN: Type inference failed for: r96v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r97v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS654S0100000_5 r112, java.lang.Object r113, java.lang.Object r114, java.lang.Object r115) {
        /*
            Method dump skipped, instruction units count: 2042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS654S0100000_5.invoke$1(kotlin.jvm.internal.AwS654S0100000_5, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        TextTemplateTools.DependItem dependItem = (TextTemplateTools.DependItem) obj;
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS654S0100000_5.l0;
        String str = dependItem.id;
        String str2 = dependItem.type;
        c1402910mbx.getClass();
        C1402910mbx.LJII(videoPublishEditModel, true, jLongValue, true, zBooleanValue, "", str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        TextTemplateTools.DependItem dependItem = (TextTemplateTools.DependItem) obj;
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = ((C194431114z) awS654S0100000_5.l0).D5();
        String str = dependItem.id;
        String str2 = dependItem.type;
        c1402910mbx.getClass();
        C1402910mbx.LJII(videoPublishEditModelD5, true, jLongValue, false, zBooleanValue, "", str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ((C389110FNl) awS654S0100000_5.l0).R5(((Number) obj).intValue(), (ResourceItem) obj2, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C383400F1m c383400F1m = ((C383460F1s) awS654S0100000_5.l0).LLILZ;
        if (c383400F1m != null) {
            c383400F1m.LIZ.LLLLIL().LIZJ.invoke(obj, Float.valueOf(fFloatValue), Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C0EJ9 c0ej9 = (C0EJ9) awS654S0100000_5.l0;
        c0ej9.LLLLLJIL(c0ej9.LLJJJJ, (RecyclerView.ViewHolder) obj, (List) obj2, Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C0EJ9 c0ej9 = (C0EJ9) awS654S0100000_5.l0;
        c0ej9.LLLLLJIL(c0ej9.LLJJJIL, (RecyclerView.ViewHolder) obj, (List) obj2, Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C389250FNz c389250FNz = (C389250FNz) awS654S0100000_5.l0;
        c389250FNz.LLLLIL().LJIIIIZZ.invoke();
        c389250FNz.LLLLIL().LIZ.invoke(Integer.valueOf(iIntValue), ((C0FO3) obj).LIZ, Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS654S0100000_5 awS654S0100000_5, Object obj, Object obj2, Object obj3) {
        TextTemplateTools.DependItem dependItem = (TextTemplateTools.DependItem) obj;
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        InterfaceC388160FJu interfaceC388160FJu = (InterfaceC388160FJu) awS654S0100000_5.l0;
        if (interfaceC388160FJu != null) {
            interfaceC388160FJu.LJ(jLongValue, zBooleanValue, dependItem.id, dependItem.type);
        }
        return Unit.LIZ;
    }
}
