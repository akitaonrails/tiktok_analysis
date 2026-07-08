package kotlin.jvm.internal;

import X.AbstractC1584410rKh;
import X.C09AY;
import X.C1383310m6L;
import X.C1556690qbz;
import X.C1573490r35;
import X.C1573630r3J;
import X.C1573670r3N;
import X.C1579450rCh;
import X.C1579940rDU;
import X.C1592080rX4;
import X.C1611580s2W;
import X.C1612160s3S;
import X.C1697810uHb;
import X.C1853920yLO;
import X.C291001Au;
import X.C908580Zke;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSkylightAssem;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS36S0001000_24 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f992i0;

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
    public AwS36S0001000_24(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f992i0 = i;
    }

    public static final Object invoke$0(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C1383310m6L.LIZ((C1383310m6L) obj, null, 3, awS36S0001000_24.f992i0, 1);
    }

    public static final Object invoke$1(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C1383310m6L.LIZ((C1383310m6L) obj, null, 2, awS36S0001000_24.f992i0, 1);
    }

    public static final Object invoke$10(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C1556690qbz.LIZ((C1556690qbz) obj, null, awS36S0001000_24.f992i0, 5);
    }

    public static final Object invoke$11(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        AbstractC1584410rKh abstractC1584410rKhLIZIZ;
        TopTabProtocol topTabProtocol = (TopTabProtocol) obj;
        if (topTabProtocol.LJII() == awS36S0001000_24.f992i0 && (abstractC1584410rKhLIZIZ = topTabProtocol.LJI().LIZIZ()) != null) {
            abstractC1584410rKhLIZIZ.LJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C1853920yLO.LIZ((C1853920yLO) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, new C291001Au(Integer.valueOf(awS36S0001000_24.f992i0)), null, 12582911);
    }

    public static final Object invoke$13(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C1853920yLO.LIZ((C1853920yLO) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, awS36S0001000_24.f992i0, null, null, null, null, null, null, null, 16711679);
    }

    public static final Object invoke$14(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        TextView customTextView = c1592080rX4.getCustomTextView();
        if (customTextView != null) {
            customTextView.setTextColor(awS36S0001000_24.f992i0);
        }
        ImageView customImageView = c1592080rX4.getCustomImageView();
        if (customImageView != null) {
            customImageView.setImageTintList(ColorStateList.valueOf(awS36S0001000_24.f992i0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        Pair pair = new Pair(Integer.valueOf(awS36S0001000_24.f992i0), Integer.valueOf(awS36S0001000_24.f992i0));
        int i = BaseSkylightAssem.LLJIJIL;
        int i2 = awS36S0001000_24.f992i0;
        return C1579450rCh.LIZ((C1579450rCh) obj, pair, null, null, null, null, C1579940rDU.LIZ(i2, i2), 30);
    }

    public static final Object invoke$3(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        MyListSceneEnum myListSceneEnum;
        C1573630r3J c1573630r3J = (C1573630r3J) obj;
        int i = awS36S0001000_24.f992i0;
        if (i == 0) {
            myListSceneEnum = MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY;
        } else {
            myListSceneEnum = MyListSceneEnum.MY_LIST_SCENE_COLLECTION_FAVOURITE;
        }
        return C1573630r3J.LIZ(c1573630r3J, myListSceneEnum, i, false, false, null, false, 252);
    }

    public static final Object invoke$4(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C1612160s3S.LIZ((C1612160s3S) obj, new C1611580s2W(true, false, false, awS36S0001000_24.f992i0, false, 16), null, null, null, null, false, false, null, null, null, null, null, false, null, null, null, 262142);
    }

    public static final Object invoke$5(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        C1853920yLO c1853920yLO = (C1853920yLO) obj;
        int i = awS36S0001000_24.f992i0;
        int iIntValue = c1853920yLO.LLJ.LIZ.intValue();
        if (i == 3 ? C1697810uHb.LJIIJJI(4, 5, 6, 7).contains(Integer.valueOf(iIntValue)) : i == 4 ? iIntValue != 3 : i == 5 ? !C1697810uHb.LJIIJJI(4, 6).contains(Integer.valueOf(iIntValue)) : i == 6 ? iIntValue != 5 : i != 7 || iIntValue == 5) {
            i = iIntValue;
        }
        return C1853920yLO.LIZ(c1853920yLO, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(i)), null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16776959);
    }

    public static final Object invoke$6(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        return C908580Zke.LIZ((C908580Zke) obj, null, Integer.valueOf(awS36S0001000_24.f992i0), null, 13);
    }

    public static final Object invoke$7(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        C1573670r3N c1573670r3N = MyListSceneEnum.Companion;
        int i = awS36S0001000_24.f992i0;
        c1573670r3N.getClass();
        return C1573630r3J.LIZ((C1573630r3J) obj, C1573670r3N.LIZ(i), awS36S0001000_24.f992i0, false, false, null, false, 252);
    }

    public static final Object invoke$8(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        C1573670r3N c1573670r3N = MyListSceneEnum.Companion;
        int i = awS36S0001000_24.f992i0;
        c1573670r3N.getClass();
        return C1573490r35.LIZ((C1573490r35) obj, C1573670r3N.LIZ(i), null, null, 13);
    }

    public static final Object invoke$9(AwS36S0001000_24 awS36S0001000_24, Object obj) {
        MyListSceneEnum myListSceneEnum;
        C1573490r35 c1573490r35 = (C1573490r35) obj;
        if (awS36S0001000_24.f992i0 == 0) {
            myListSceneEnum = MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY;
        } else {
            myListSceneEnum = MyListSceneEnum.MY_LIST_SCENE_COLLECTION_FAVOURITE;
        }
        return C1573490r35.LIZ(c1573490r35, myListSceneEnum, null, null, 13);
    }
}
