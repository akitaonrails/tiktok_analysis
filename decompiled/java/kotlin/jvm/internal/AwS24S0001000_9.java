package kotlin.jvm.internal;

import X.C09AY;
import X.C0O14;
import X.C0O15;
import X.C0OG4;
import X.C0OI7;
import X.C0OII;
import X.C0OKY;
import X.C0OL6;
import X.C0ORP;
import X.C0OYC;
import X.C1623606Xi;
import X.C291001Au;
import X.C491001vg;
import X.C607950Nsv;
import X.C616100OEm;
import X.C617050OId;
import X.C617220OIu;
import X.C626430Ohd;
import X.C627660Ojc;
import X.C628860OlY;
import X.C630370Onz;
import X.C632690Orj;
import X.EnumC617060OIe;
import X.InterfaceC1891350zJl;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS24S0001000_9 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f976i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0001000_9(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f976i0 = i;
    }

    public static final Object invoke$0(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        C626430Ohd c626430Ohd = (C626430Ohd) obj;
        float f = c626430Ohd.LL;
        long j = c626430Ohd.LLILLJJLI;
        float f2 = (f * j) + awS24S0001000_9.f976i0;
        long j2 = j + 1;
        return C626430Ohd.LIZ(c626430Ohd, f2 / j2, j2, 0L, false, false, null, 60);
    }

    public static final Object invoke$1(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, new C291001Au(new C0OL6(R.raw.icon_exclamation_mark_circle_fill, awS24S0001000_9.f976i0)), false, new C491001vg(new Throwable("download failed")), null, 1476395007);
    }

    public static final Object invoke$10(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        C0O15 c0o15 = (C0O15) obj;
        C291001Au c291001Au = new C291001Au(Integer.valueOf(awS24S0001000_9.f976i0));
        C627660Ojc<C607950Nsv> c627660Ojc = c0o15.LLILLJJLI;
        c0o15.getClass();
        return new C0O15(c291001Au, c627660Ojc);
    }

    public static final Object invoke$11(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C628860OlY.LIZ((C628860OlY) obj, null, new C291001Au(Integer.valueOf(awS24S0001000_9.f976i0)), null, null, 27);
    }

    public static final Object invoke$12(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        C617220OIu c617220OIu;
        InboxEntranceFunction inboxEntranceFunction;
        C0OKY c0oky = (C0OKY) obj;
        ArrayList arrayList = new ArrayList();
        List<InterfaceC1891350zJl> list = c0oky.LLJJ;
        int i = awS24S0001000_9.f976i0;
        for (Object objLIZ : list) {
            if ((objLIZ instanceof C617220OIu) && (inboxEntranceFunction = (c617220OIu = (C617220OIu) objLIZ).LL) != null && inboxEntranceFunction.functionType == C0ORP.PIN.getType()) {
                InboxEntranceFunction inboxEntranceFunction2 = c617220OIu.LL;
                objLIZ = C617220OIu.LIZ(c617220OIu, inboxEntranceFunction2.copy(inboxEntranceFunction2.name, inboxEntranceFunction2.functionType, i, inboxEntranceFunction2.iconModel));
            }
            arrayList.add(objLIZ);
        }
        return C0OKY.LIZ(c0oky, null, null, null, null, null, null, 0L, null, null, null, null, null, null, arrayList, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147467263);
    }

    public static final Object invoke$13(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        int i = awS24S0001000_9.f976i0;
        obj.getClass();
        return new C632690Orj(i);
    }

    public static final Object invoke$14(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C0OG4.LIZ((C0OG4) obj, new C1623606Xi(Integer.valueOf(awS24S0001000_9.f976i0)), null, null, 6);
    }

    public static final Object invoke$15(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C0OG4.LIZ((C0OG4) obj, new C1623606Xi(Integer.valueOf(awS24S0001000_9.f976i0)), null, null, 6);
    }

    public static final Object invoke$16(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C630370Onz.LIZ((C630370Onz) obj, 0, 0, new C291001Au(Integer.valueOf(awS24S0001000_9.f976i0)), null, 11);
    }

    public static final Object invoke$17(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C0OYC.LIZ((C0OYC) obj, null, null, new C1623606Xi(Integer.valueOf(awS24S0001000_9.f976i0)), null, 0L, 27);
    }

    public static final Object invoke$2(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, new C291001Au(new C0OL6(R.raw.icon_tick_circle_fill, awS24S0001000_9.f976i0)), false, new C1623606Xi(Unit.LIZ), null, 1476395007);
    }

    public static final Object invoke$3(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        ((C0OI7) obj).LIZ(C0OII.LIZ, C617050OId.LIZ(EnumC617060OIe.Companion, awS24S0001000_9.f976i0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        ((C0OI7) obj).LIZ(C0OII.LIZ, C617050OId.LIZ(EnumC617060OIe.Companion, awS24S0001000_9.f976i0));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, new C291001Au(new C0OL6(R.raw.icon_exclamation_mark_circle_fill, awS24S0001000_9.f976i0)), false, new C491001vg(new Throwable("enableDownload is false")), null, 1476395007);
    }

    public static final Object invoke$6(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = (MusicDownloadPlayHelper) obj;
        musicDownloadPlayHelper.LLJI = "popular_song";
        musicDownloadPlayHelper.LLJILJIL = awS24S0001000_9.f976i0;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C616100OEm.LIZ((C616100OEm) obj, 0.0d, awS24S0001000_9.f976i0, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, 65533);
    }

    public static final Object invoke$8(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        return C616100OEm.LIZ((C616100OEm) obj, 0.0d, 0, null, false, awS24S0001000_9.f976i0, null, null, null, null, null, null, null, null, null, null, null, 65519);
    }

    public static final Object invoke$9(AwS24S0001000_9 awS24S0001000_9, Object obj) {
        C0O14 c0o14 = (C0O14) obj;
        C291001Au c291001Au = new C291001Au(Integer.valueOf(awS24S0001000_9.f976i0));
        C627660Ojc<C607950Nsv> c627660Ojc = c0o14.LLILLJJLI;
        c0o14.getClass();
        return new C0O14(c291001Au, c627660Ojc);
    }
}
