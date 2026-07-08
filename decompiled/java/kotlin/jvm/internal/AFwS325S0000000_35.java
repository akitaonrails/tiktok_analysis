package kotlin.jvm.internal;

import X.C09AY;
import X.C0YS1;
import X.C2256641DUg;
import X.C2256651DUh;
import X.C2256701DUm;
import X.C2263001Dhq;
import X.C2267061DoO;
import X.C380260EvY;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AFwS325S0000000_35 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(11);
    public final int $t;

    public static AFwS325S0000000_35 get$arr$(int i) {
        AFwS325S0000000_35 aFwS325S0000000_35 = (AFwS325S0000000_35) arr$.get(i);
        if (aFwS325S0000000_35 != null) {
            return aFwS325S0000000_35;
        }
        arr$.compareAndSet(i, null, new AFwS325S0000000_35(i));
        return (AFwS325S0000000_35) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS325S0000000_35(int i) {
        super(2);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        SearchRelatedSuggestionUiAssem.LLJ.getClass();
        C2263001Dhq.LIZIZ(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        c2267061DoO.LJ(null);
        c2267061DoO.LIZJ(null);
        c2267061DoO.LIZLLL(obj2);
        return c2267061DoO;
    }

    public static final Object invoke$2(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        return SessionInfo.LIZ((SessionInfo) obj, (SessionShowInfo) obj2, 13);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        C0YS1.LIZJ("VideoMsgSender", "send video success");
        C2256641DUg.LIZIZ(true, (C2256701DUm) obj, (C869590Y9l) obj2, null, null);
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        C0YS1.LIZJ("PhotoMsgSender", "send photo success");
        C2256641DUg.LIZIZ(true, (C2256701DUm) obj, (C869590Y9l) obj2, null, null);
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        ((C2256651DUh) MediaUploadPerformanceMonitor.LIZIZ.LIZ((String) obj)).LJ.put("concurrent_upload_count", String.valueOf(iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        c2267061DoO.LJIILIIL(null);
        c2267061DoO.LIZJ(null);
        c2267061DoO.LJIILJJIL(obj2);
        return c2267061DoO;
    }

    public static final Object invoke$8(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        c2267061DoO.LJIILJJIL(null);
        c2267061DoO.LIZJ(null);
        c2267061DoO.LJIILIIL(obj2);
        return c2267061DoO;
    }

    public static final Object invoke$9(AFwS325S0000000_35 aFwS325S0000000_35, Object obj, Object obj2) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        c2267061DoO.LIZLLL(null);
        c2267061DoO.LIZJ(null);
        c2267061DoO.LJ(obj2);
        return c2267061DoO;
    }
}
