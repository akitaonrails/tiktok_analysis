package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C375830EoP;
import X.C381530Exb;
import X.C383980F3s;
import X.C530600KrS;
import X.C538050L8h;
import X.C554100LoG;
import X.C555030Lpl;
import X.C559140LwO;
import X.C563540M8i;
import X.EnumC559120LwM;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import iyl.i3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS116S0101000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((C555030Lpl) awS116S0101000_8.l0).Z4((MentionDataItem) obj, awS116S0101000_8.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        MentionDataItem mentionDataItem = (MentionDataItem) obj;
        ((C554100LoG) awS116S0101000_8.l0).N5(mentionDataItem, awS116S0101000_8.i1);
        ((C554100LoG) awS116S0101000_8.l0).S5(mentionDataItem, awS116S0101000_8.i1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((String[]) awS116S0101000_8.l0)[awS116S0101000_8.i1] = obj;
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        String str = (String) obj;
        C538050L8h c538050L8h = (C538050L8h) awS116S0101000_8.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compressNextVideo Fail: index=");
        sbLIZ.append(awS116S0101000_8.i1);
        sbLIZ.append(", CompletedCount=");
        sbLIZ.append(((C538050L8h) awS116S0101000_8.l0).LJII);
        sbLIZ.append(", error msg=");
        sbLIZ.append(str);
        C381530Exb.LIZIZ(c538050L8h, C2188811AlT.LIZIZ(sbLIZ));
        C383980F3s.LIZIZ(new AwS157S1100000_8((C538050L8h) awS116S0101000_8.l0, str, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((C554100LoG) awS116S0101000_8.l0).N5((MentionDataItem) obj, awS116S0101000_8.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        return C559140LwO.LIZ((C559140LwO) obj, null, (EnumC559120LwM) awS116S0101000_8.l0, awS116S0101000_8.i1, null, null, 25);
    }

    public static final Object invoke$4(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        return C530600KrS.LIZ((C530600KrS) obj, null, null, null, null, new C375830EoP(new Pair(Integer.valueOf(awS116S0101000_8.i1), (TikTokMediaModel) awS116S0101000_8.l0)), null, null, 239);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((String[]) awS116S0101000_8.l0)[awS116S0101000_8.i1] = obj;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((String[]) awS116S0101000_8.l0)[awS116S0101000_8.i1] = obj;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        i3 i3Var = (i3) obj;
        if (awS116S0101000_8.i1 == 1800) {
            return i3.LJIIIZ(i3Var, 0, 0, 0, null, 0, false, ((Boolean) awS116S0101000_8.l0).booleanValue(), false, false, false, null, null, 0, null, null, null, false, null, false, 0.0f, null, 268435327);
        }
        return i3.LJIIIZ(i3Var, 0, 0, 0, null, 0, false, ((Boolean) awS116S0101000_8.l0).booleanValue(), ((Boolean) awS116S0101000_8.l0).booleanValue(), false, false, null, null, 0, null, null, null, false, null, false, 0.0f, null, 268435071);
    }

    public static final Object invoke$8(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((SocialMediaPickerViewModel) awS116S0101000_8.l0).onEvent$social_creation_mediapicker_release(new C563540M8i(awS116S0101000_8.i1));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AwS116S0101000_8 awS116S0101000_8, Object obj) {
        ((String[]) awS116S0101000_8.l0)[awS116S0101000_8.i1] = obj;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(int i, TikTokMediaModel tikTokMediaModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = tikTokMediaModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(int i, Boolean bool, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(int i, String[] strArr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = strArr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(C538050L8h c538050L8h, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c538050L8h;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(C554100LoG c554100LoG, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c554100LoG;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(C555030Lpl c555030Lpl, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c555030Lpl;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(EnumC559120LwM enumC559120LwM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC559120LwM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0101000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = socialMediaPickerViewModel;
        this.i1 = i;
    }
}
