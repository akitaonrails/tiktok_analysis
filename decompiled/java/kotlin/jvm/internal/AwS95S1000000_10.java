package kotlin.jvm.internal;

import X.C09AY;
import X.C13LE;
import X.C1537480q70;
import X.C1538140q84;
import X.C1538590q8n;
import X.C19719912Dl;
import X.C639570P6t;
import X.C651640PhC;
import X.C703302op;
import android.net.Uri;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationCardVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.nimble.TakoNimbleMixCardAssem;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS95S1000000_10 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return this.s0;
            case 2:
                return this.s0;
            case 3:
                return this.s0;
            case 4:
                return this.s0;
            case 5:
                return this.s0;
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return this.s0;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return this.s0;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS95S1000000_10 awS95S1000000_10) {
        C639570P6t c639570P6t = C639570P6t.LIZ;
        String str = awS95S1000000_10.s0;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchReviewAggregationCardVM.class);
        c639570P6t.getClass();
        return C639570P6t.LIZ(str, c19719912DlLIZ);
    }

    public static final Object invoke$10(AwS95S1000000_10 awS95S1000000_10) {
        if (C703302op.LIZ(awS95S1000000_10.s0)) {
            Uri.Builder builderBuildUpon = UriProtector.parse(awS95S1000000_10.s0).buildUpon();
            builderBuildUpon.appendQueryParameter("enable_extra_info", "1");
            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
            String string = builderBuildUpon.toString();
            C1538140q84 c1538140q84 = C1538140q84.LIZ;
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LJFF = false;
            c1538590q8n.LJI = false;
            c1538590q8n.LIZLLL = true;
            c1538590q8n.LJ = false;
            c1538590q8n.LIZIZ = true;
            c1538590q8n.LIZ = true;
            return c1538140q84.LIZJ(string, c1538590q8n);
        }
        return new C1537480q70();
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS95S1000000_10 awS95S1000000_10) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(awS95S1000000_10.s0);
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS95S1000000_10 awS95S1000000_10) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(awS95S1000000_10.s0);
    }

    public static final Object invoke$6(AwS95S1000000_10 awS95S1000000_10) {
        C651640PhC.LIZJ.remove(awS95S1000000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS95S1000000_10 awS95S1000000_10) {
        C651640PhC.LIZJ.remove(awS95S1000000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS95S1000000_10 awS95S1000000_10) {
        return new TakoNimbleMixCardAssem(awS95S1000000_10.s0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1000000_10(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
