package kotlin.jvm.internal;

import X.C09AY;
import X.C1412800mru;
import X.C1412860ms0;
import X.C1413640mtG;
import X.C1413890mtf;
import X.C1416070mxB;
import X.C1418670n1N;
import X.C1424190nAH;
import X.C1426550nE5;
import X.C1426570nE7;
import X.C1426770nER;
import X.C1454030nwP;
import X.C2097608Jq;
import X.C347650Dk3;
import X.C348100Dkm;
import X.C375830EoP;
import X.C786410Ut5;
import X.EnumC1416050mx9;
import X.EnumC355960DxS;
import X.InterfaceC391070FUz;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.RecordFilterModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.bduploader.BDImageXUploaderBase;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS72S1000000_22 extends C09AY implements Function1 {
    public final int $t;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S1000000_22(int i) {
        super(1);
        this.$t = i;
        this.s0 = "/top/photo/v1";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S1000000_22(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return C1426570nE7.LIZ((C1426570nE7) obj, 0, new Pair(awS72S1000000_22.s0, 1), null, 27);
    }

    public static final Object invoke$1(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return C1426550nE5.LIZ((C1426550nE5) obj, null, null, null, 0, false, false, null, null, null, new C375830EoP(awS72S1000000_22.s0), null, null, 14335);
    }

    public static final Object invoke$10(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        InterfaceC391070FUz interfaceC391070FUzLJFF = ((C348100Dkm) obj).LJFF();
        C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
        c347650Dk3.LIZJ = awS72S1000000_22.s0;
        interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI("new_avatar_uri", awS72S1000000_22.s0, bundle);
        C786410Ut5.LJJJI("enter_method", "direct_post", bundle);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return Boolean.valueOf(C1454030nwP.LIZIZ((SingleImageData) obj, awS72S1000000_22.s0));
    }

    public static final Object invoke$13(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return C1426770nER.LIZ((C1426770nER) obj, null, false, new C375830EoP(awS72S1000000_22.s0), null, 191);
    }

    public static final Object invoke$14(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        ((BDImageXUploaderBase) obj).setTopPath(awS72S1000000_22.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        C1416070mxB c1416070mxB = c1418670n1N.LJIJJ.get(awS72S1000000_22.s0);
        if (c1416070mxB == null) {
            c1416070mxB = new C1416070mxB(0);
        }
        return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N.LJIJJ, new Pair(awS72S1000000_22.s0, C1416070mxB.LIZ(c1416070mxB, EnumC1416050mx9.SUCCESS, null, false, 0.0f, 0.0f, 0.0f, false, 126))), false, 3145727);
    }

    public static final Object invoke$3(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        C1416070mxB c1416070mxB = c1418670n1N.LJIJJ.get(awS72S1000000_22.s0);
        if (c1416070mxB != null && c1416070mxB.LIZJ) {
            return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N.LJIJJ, new Pair(awS72S1000000_22.s0, C1416070mxB.LIZ(c1416070mxB, null, null, false, 0.0f, 0.0f, 0.0f, false, 123))), false, 3145727);
        }
        return c1418670n1N;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        String str;
        RecordFilterModel recordFilterModel = ((TimeSpeedModelExtension) obj).getRecordFilterModel();
        if (recordFilterModel != null) {
            str = recordFilterModel.filterId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, String.valueOf(awS72S1000000_22.s0))) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        String str;
        RecordFilterModel recordFilterModel = ((TimeSpeedModelExtension) obj).getRecordFilterModel();
        if (recordFilterModel != null) {
            str = recordFilterModel.filterId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, String.valueOf(awS72S1000000_22.s0))) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final Object invoke$6(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return C1424190nAH.LIZ((C1424190nAH) obj, 0, new Pair(awS72S1000000_22.s0, 1), null, null, 59);
    }

    public static final Object invoke$7(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return C1413890mtf.LIZ((C1413890mtf) obj, null, null, null, false, null, null, null, null, null, new C1413640mtG(awS72S1000000_22.s0), null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, 134217215);
    }

    public static final Object invoke$8(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        String asset_id;
        Asset asset;
        C1412860ms0 c1412860ms0LIZ = ((C1412800mru) obj).LIZ();
        if (c1412860ms0LIZ != null && (asset = c1412860ms0LIZ.LIZ) != null) {
            asset_id = asset.getAsset_id();
        } else {
            asset_id = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(asset_id, awS72S1000000_22.s0));
    }

    public static final Object invoke$9(AwS72S1000000_22 awS72S1000000_22, Object obj) {
        return C1413890mtf.LIZ((C1413890mtf) obj, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, awS72S1000000_22.s0, null, false, false, null, 130023423);
    }
}
