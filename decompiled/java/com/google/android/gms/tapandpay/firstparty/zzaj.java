package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzaj;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new Parcelable.Creator() { // from class: X.0W6U
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            String strLJII6 = null;
            String strLJII7 = null;
            String strLJII8 = null;
            String strLJII9 = null;
            String strLJII10 = null;
            String strLJII11 = null;
            String strLJII12 = null;
            String strLJII13 = null;
            String strLJII14 = null;
            String strLJII15 = null;
            String strLJII16 = null;
            String strLJII17 = null;
            String strLJII18 = null;
            String strLJII19 = null;
            String strLJII20 = null;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        strLJII7 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLJII8 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strLJII9 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        strLJII10 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strLJII11 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        strLJII12 = C0W6J.LJII(i, parcel);
                        break;
                    case 14:
                        strLJII13 = C0W6J.LJII(i, parcel);
                        break;
                    case 15:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 16:
                        strLJII14 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        strLJII15 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        strLJII16 = C0W6J.LJII(i, parcel);
                        break;
                    case 19:
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        strLJII17 = C0W6J.LJII(i, parcel);
                        break;
                    case 21:
                        strLJII18 = C0W6J.LJII(i, parcel);
                        break;
                    case 22:
                        strLJII19 = C0W6J.LJII(i, parcel);
                        break;
                    case 23:
                        strLJII20 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzaj(strLJII, strLJII2, strLJII3, strLJII4, strLJII5, strLJII6, strLJII7, strLJII8, strLJII9, strLJII10, strLJII11, strLJII12, strLJII13, jLJJ, strLJII14, strLJII15, strLJII16, strLJII17, strLJII18, strLJII19, strLJII20, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzaj[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final long LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final int LLJJJIL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, Long.valueOf(this.LLJILLL), this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, Integer.valueOf(this.LLJJJIL)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "issuerName");
        c0w3l.LIZ(this.LLILLJJLI, "issuerPhoneNumber");
        c0w3l.LIZ(this.LLILLL, "appLogoUrl");
        c0w3l.LIZ(this.LLILZ, "appName");
        c0w3l.LIZ(this.LLILZIL, "appDeveloperName");
        c0w3l.LIZ(this.LLILZLL, "appPackageName");
        c0w3l.LIZ(this.LLIZ, "privacyNoticeUrl");
        c0w3l.LIZ(this.LLIZLLLIL, "termsAndConditionsUrl");
        c0w3l.LIZ(this.LLJ, "productShortName");
        c0w3l.LIZ(this.LLJI, "appAction");
        c0w3l.LIZ(this.LLJIJIL, "appIntentExtraMessage");
        c0w3l.LIZ(this.LLJILJIL, "issuerMessageHeadline");
        c0w3l.LIZ(this.LLJILJILJ, "issuerMessageBody");
        c0w3l.LIZ(Long.valueOf(this.LLJILLL), "issuerMessageExpiryTimestampMillis");
        c0w3l.LIZ(this.LLJJ, "issuerMessageLinkPackageName");
        c0w3l.LIZ(this.LLJJI, "issuerMessageLinkAction");
        c0w3l.LIZ(this.LLJJIII, "issuerMessageLinkExtraText");
        c0w3l.LIZ(this.LLJJIJI, "issuerMessageLinkUrl");
        c0w3l.LIZ(this.LLJJIJIIJIL, "issuerMessageLinkText");
        c0w3l.LIZ(this.LLJJIJIL, "issuerWebLinkUrl");
        c0w3l.LIZ(this.LLJJJ, "issuerWebLinkText");
        c0w3l.LIZ(Integer.valueOf(this.LLJJJIL), "issuerMessageType");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaj) {
            zzaj zzajVar = (zzaj) obj;
            if (C0W0T.LIZIZ(this.LL, zzajVar.LL) && C0W0T.LIZIZ(this.LLILLJJLI, zzajVar.LLILLJJLI) && C0W0T.LIZIZ(this.LLILLL, zzajVar.LLILLL) && C0W0T.LIZIZ(this.LLILZ, zzajVar.LLILZ) && C0W0T.LIZIZ(this.LLILZIL, zzajVar.LLILZIL) && C0W0T.LIZIZ(this.LLILZLL, zzajVar.LLILZLL) && C0W0T.LIZIZ(this.LLIZ, zzajVar.LLIZ) && C0W0T.LIZIZ(this.LLIZLLLIL, zzajVar.LLIZLLLIL) && C0W0T.LIZIZ(this.LLJ, zzajVar.LLJ) && C0W0T.LIZIZ(this.LLJI, zzajVar.LLJI) && C0W0T.LIZIZ(this.LLJIJIL, zzajVar.LLJIJIL) && C0W0T.LIZIZ(this.LLJILJIL, zzajVar.LLJILJIL) && C0W0T.LIZIZ(this.LLJILJILJ, zzajVar.LLJILJILJ) && this.LLJILLL == zzajVar.LLJILLL && C0W0T.LIZIZ(this.LLJJ, zzajVar.LLJJ) && C0W0T.LIZIZ(this.LLJJI, zzajVar.LLJJI) && C0W0T.LIZIZ(this.LLJJIII, zzajVar.LLJJIII) && C0W0T.LIZIZ(this.LLJJIJI, zzajVar.LLJJIJI) && C0W0T.LIZIZ(this.LLJJIJIIJIL, zzajVar.LLJJIJIIJIL) && C0W0T.LIZIZ(this.LLJJIJIL, zzajVar.LLJJIJIL) && C0W0T.LIZIZ(this.LLJJJ, zzajVar.LLJJJ) && C0W0T.LIZIZ(Integer.valueOf(this.LLJJJIL), Integer.valueOf(zzajVar.LLJJJIL))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZ, false);
        C817940W6u.LJIJ(parcel, 6, this.LLILZIL, false);
        C817940W6u.LJIJ(parcel, 7, this.LLILZLL, false);
        C817940W6u.LJIJ(parcel, 8, this.LLIZ, false);
        C817940W6u.LJIJ(parcel, 9, this.LLIZLLLIL, false);
        C817940W6u.LJIJ(parcel, 10, this.LLJ, false);
        C817940W6u.LJIJ(parcel, 11, this.LLJI, false);
        C817940W6u.LJIJ(parcel, 12, this.LLJIJIL, false);
        C817940W6u.LJIJ(parcel, 13, this.LLJILJIL, false);
        C817940W6u.LJIJ(parcel, 14, this.LLJILJILJ, false);
        C817940W6u.LJIILJJIL(15, this.LLJILLL, parcel);
        C817940W6u.LJIJ(parcel, 16, this.LLJJ, false);
        C817940W6u.LJIJ(parcel, 17, this.LLJJI, false);
        C817940W6u.LJIJ(parcel, 18, this.LLJJIII, false);
        C817940W6u.LJIJ(parcel, 20, this.LLJJIJI, false);
        C817940W6u.LJIJ(parcel, 21, this.LLJJIJIIJIL, false);
        C817940W6u.LJIJ(parcel, 22, this.LLJJIJIL, false);
        C817940W6u.LJIJ(parcel, 23, this.LLJJJ, false);
        C817940W6u.LJIIJ(parcel, 24, this.LLJJJIL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzaj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = str10;
        this.LLJIJIL = str11;
        this.LLJILJIL = str12;
        this.LLJILJILJ = str13;
        this.LLJILLL = j;
        this.LLJJ = str14;
        this.LLJJI = str15;
        this.LLJJIII = str16;
        this.LLJJIJI = str17;
        this.LLJJIJIIJIL = str18;
        this.LLJJIJIL = str19;
        this.LLJJJ = str20;
        this.LLJJJIL = i;
    }
}
