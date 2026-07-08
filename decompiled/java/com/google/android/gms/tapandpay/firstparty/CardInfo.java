package com.google.android.gms.tapandpay.firstparty;

import X.AbstractC19966313Af;
import X.C0W0T;
import X.C0W3L;
import X.C2188811AlT;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzaf;
import com.google.android.gms.tapandpay.firstparty.zzah;
import com.google.android.gms.tapandpay.firstparty.zzaj;
import com.google.android.gms.tapandpay.firstparty.zzan;
import com.google.android.gms.tapandpay.firstparty.zzaz;
import com.google.android.gms.tapandpay.firstparty.zzb;
import com.google.android.gms.tapandpay.firstparty.zze;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new Parcelable.Creator() { // from class: X.0W6S
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            int iLJIJJLI4 = 0;
            int iLJIJJLI5 = 0;
            int iLJIJJLI6 = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            boolean zLJIILIIL4 = false;
            int iLJIJJLI7 = 0;
            boolean zLJIILIIL5 = false;
            int iLJIJJLI8 = 0;
            boolean zLJIILIIL6 = false;
            int iLJIJJLI9 = 0;
            String strLJII2 = null;
            byte[] bArrLIZJ = null;
            String strLJII3 = null;
            String strLJII4 = null;
            TokenStatus tokenStatus = null;
            String strLJII5 = null;
            Uri uri = null;
            zzaj zzajVar = null;
            String strLJII6 = null;
            zzaz zzazVar = null;
            String strLJII7 = null;
            byte[] bArrLIZJ2 = null;
            zzah zzahVar = null;
            zzaf zzafVar = null;
            String strLJII8 = null;
            zzan[] zzanVarArr = null;
            ArrayList arrayListLJIIJJI = null;
            String strLJII9 = null;
            String strLJII10 = null;
            zze zzeVar = null;
            String strLJII11 = null;
            String strLJII12 = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
            long jLJJ3 = 0;
            long jLJJ4 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 4:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        tokenStatus = (TokenStatus) C0W6J.LJI(parcel, i, TokenStatus.CREATOR);
                        break;
                    case '\b':
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        zzajVar = (zzaj) C0W6J.LJI(parcel, i, zzaj.CREATOR);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                    case 14:
                    case 19:
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case 15:
                        zzazVar = (zzaz) C0W6J.LJI(parcel, i, zzaz.CREATOR);
                        break;
                    case 16:
                        strLJII7 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        iLJIJJLI5 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 21:
                        iLJIJJLI6 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 22:
                        zzahVar = (zzah) C0W6J.LJI(parcel, i, zzah.CREATOR);
                        break;
                    case 23:
                        zzafVar = (zzaf) C0W6J.LJI(parcel, i, zzaf.CREATOR);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        strLJII8 = C0W6J.LJII(i, parcel);
                        break;
                    case 25:
                        zzanVarArr = (zzan[]) C0W6J.LJIIJ(parcel, i, zzan.CREATOR);
                        break;
                    case 26:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 27:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zzb.CREATOR);
                        break;
                    case 28:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 29:
                        zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 30:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 31:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case ' ':
                        zLJIILIIL4 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        jLJJ3 = C0W6J.LJJ(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        strLJII9 = C0W6J.LJII(i, parcel);
                        break;
                    case '#':
                        strLJII10 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        zzeVar = (zze) C0W6J.LJI(parcel, i, zze.CREATOR);
                        break;
                    case '%':
                        iLJIJJLI7 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case '&':
                        zLJIILIIL5 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case '\'':
                        strLJII11 = C0W6J.LJII(i, parcel);
                        break;
                    case '(':
                        iLJIJJLI8 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case ')':
                        zLJIILIIL6 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case '*':
                        jLJJ4 = C0W6J.LJJ(i, parcel);
                        break;
                    case '+':
                        strLJII12 = C0W6J.LJII(i, parcel);
                        break;
                    case ',':
                        iLJIJJLI9 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case '-':
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CardInfo(strLJII, strLJII2, bArrLIZJ, strLJII3, strLJII4, iLJIJJLI, tokenStatus, strLJII5, uri, iLJIJJLI2, iLJIJJLI3, zzajVar, strLJII6, zzazVar, strLJII7, bArrLIZJ2, iLJIJJLI4, iLJIJJLI5, iLJIJJLI6, zzahVar, zzafVar, strLJII8, zzanVarArr, zLJIILIIL, arrayListLJIIJJI, zLJIILIIL2, zLJIILIIL3, jLJJ, jLJJ2, zLJIILIIL4, jLJJ3, strLJII9, strLJII10, zzeVar, iLJIJJLI7, zLJIILIIL5, strLJII11, iLJIJJLI8, zLJIILIIL6, jLJJ4, strLJII12, iLJIJJLI9);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CardInfo[i];
        }
    };
    public static final AbstractC19966313Af zzQ = AbstractC19966313Af.zzi(10, 9);
    public final String LL;
    public final String LLILLJJLI;
    public final byte[] LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final TokenStatus LLIZ;
    public final String LLIZLLLIL;
    public final Uri LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final zzaj LLJILJIL;
    public final String LLJILJILJ;
    public final zzaz LLJILLL;
    public final String LLJJ;
    public final byte[] LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final zzah LLJJIJIL;
    public final zzaf LLJJJ;
    public final String LLJJJIL;
    public final zzan[] LLJJJJ;
    public final boolean LLJJJJJIL;
    public final List LLJJJJLIIL;
    public final boolean LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final long LLJL;
    public final long LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final long LLJLL;
    public final String LLJLLIL;
    public final String LLJLLL;
    public final zze LLJZ;
    public final int LLJZIJLIL;
    public final boolean LLL;
    public final String LLLF;
    public final int LLLFF;
    public final boolean LLLFFI;
    public final long LLLFZ;
    public final String LLLI;
    public final int LLLII;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, Integer.valueOf(this.LLILZLL), this.LLIZ, this.LLIZLLLIL, this.LLJ, Integer.valueOf(this.LLJI), Integer.valueOf(this.LLJIJIL), this.LLJILJILJ, this.LLJILLL, Integer.valueOf(this.LLJJIII), Integer.valueOf(this.LLJJIJI), Integer.valueOf(this.LLJJIJIIJIL), this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, Boolean.valueOf(this.LLJJJJJIL), this.LLJJJJLIIL, Boolean.valueOf(this.LLJJL), Boolean.valueOf(this.LLJJLIIIJLLLLLLLZ), Long.valueOf(this.LLJL), Boolean.valueOf(this.LLJLILLLLZIIL), Long.valueOf(this.LLJLL), this.LLJLLIL, this.LLJLLL, this.LLJZ, Integer.valueOf(this.LLJZIJLIL), Boolean.valueOf(this.LLL), Integer.valueOf(this.LLLFF), Boolean.valueOf(this.LLLFFI), Long.valueOf(this.LLLFZ), this.LLLI, Integer.valueOf(this.LLLII)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "billingCardId");
        c0w3l.LIZ(this.LLILLJJLI, "auxClientTokenId");
        byte[] bArr = this.LLILLL;
        c0w3l.LIZ(bArr == null ? null : Arrays.toString(bArr), "serverToken");
        c0w3l.LIZ(this.LLILZ, "cardholderName");
        c0w3l.LIZ(this.LLILZIL, "displayName");
        c0w3l.LIZ(Integer.valueOf(this.LLILZLL), "cardNetwork");
        c0w3l.LIZ(this.LLIZ, "tokenStatus");
        c0w3l.LIZ(this.LLIZLLLIL, "panLastDigits");
        c0w3l.LIZ(this.LLJ, "cardImageUrl");
        c0w3l.LIZ(Integer.valueOf(this.LLJI), "cardColor");
        c0w3l.LIZ(Integer.valueOf(this.LLJIJIL), "overlayTextColor");
        zzaj zzajVar = this.LLJILJIL;
        c0w3l.LIZ(zzajVar == null ? null : zzajVar.toString(), "issuerInfo");
        c0w3l.LIZ(this.LLJILJILJ, "tokenLastDigits");
        c0w3l.LIZ(this.LLJILLL, "transactionInfo");
        c0w3l.LIZ(this.LLJJ, "issuerTokenId");
        byte[] bArr2 = this.LLJJI;
        c0w3l.LIZ(bArr2 == null ? null : Arrays.toString(bArr2), "inAppCardToken");
        c0w3l.LIZ(Integer.valueOf(this.LLJJIII), "cachedEligibility");
        c0w3l.LIZ(Integer.valueOf(this.LLJJIJI), "paymentProtocol");
        c0w3l.LIZ(Integer.valueOf(this.LLJJIJIIJIL), "tokenType");
        c0w3l.LIZ(this.LLJJIJIL, "inStoreCvmConfig");
        c0w3l.LIZ(this.LLJJJ, "inAppCvmConfig");
        c0w3l.LIZ(this.LLJJJIL, "tokenDisplayName");
        zzan[] zzanVarArr = this.LLJJJJ;
        c0w3l.LIZ(zzanVarArr != null ? Arrays.toString(zzanVarArr) : null, "onlineAccountCardLinkInfos");
        c0w3l.LIZ(Boolean.valueOf(this.LLJJJJJIL), "allowAidSelection");
        String strJoin = TextUtils.join(", ", this.LLJJJJLIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(strJoin);
        sbLIZ.append(e3.f);
        c0w3l.LIZ(C2188811AlT.LIZIZ(sbLIZ), "badges");
        c0w3l.LIZ(Boolean.valueOf(this.LLJJL), "upgradeAvailable");
        c0w3l.LIZ(Boolean.valueOf(this.LLJJLIIIJLLLLLLLZ), "requiresSignature");
        c0w3l.LIZ(Long.valueOf(this.LLJL), "googleTokenId");
        c0w3l.LIZ(Boolean.valueOf(this.LLJLILLLLZIIL), "isTransit");
        c0w3l.LIZ(Long.valueOf(this.LLJLL), "googleWalletId");
        c0w3l.LIZ(this.LLJLLIL, "devicePaymentMethodId");
        c0w3l.LIZ(this.LLJLLL, "cloudPaymentMethodId");
        c0w3l.LIZ(Long.valueOf(this.LLLFZ), "auxiliaryGoogleTokenId");
        c0w3l.LIZ(this.LLLI, "auxiliaryIssuerTokenId");
        c0w3l.LIZ(Integer.valueOf(this.LLLII), "auxiliaryNetwork");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (C0W0T.LIZIZ(this.LL, cardInfo.LL) && C0W0T.LIZIZ(this.LLILLJJLI, cardInfo.LLILLJJLI) && Arrays.equals(this.LLILLL, cardInfo.LLILLL) && C0W0T.LIZIZ(this.LLILZ, cardInfo.LLILZ) && C0W0T.LIZIZ(this.LLILZIL, cardInfo.LLILZIL) && this.LLILZLL == cardInfo.LLILZLL && C0W0T.LIZIZ(this.LLIZ, cardInfo.LLIZ) && C0W0T.LIZIZ(this.LLIZLLLIL, cardInfo.LLIZLLLIL) && C0W0T.LIZIZ(this.LLJ, cardInfo.LLJ) && this.LLJI == cardInfo.LLJI && this.LLJIJIL == cardInfo.LLJIJIL && C0W0T.LIZIZ(this.LLJILJIL, cardInfo.LLJILJIL) && C0W0T.LIZIZ(this.LLJILJILJ, cardInfo.LLJILJILJ) && C0W0T.LIZIZ(this.LLJILLL, cardInfo.LLJILLL) && this.LLJJIII == cardInfo.LLJJIII && this.LLJJIJI == cardInfo.LLJJIJI && this.LLJJIJIIJIL == cardInfo.LLJJIJIIJIL && C0W0T.LIZIZ(this.LLJJIJIL, cardInfo.LLJJIJIL) && C0W0T.LIZIZ(this.LLJJJ, cardInfo.LLJJJ) && C0W0T.LIZIZ(this.LLJJJIL, cardInfo.LLJJJIL) && Arrays.equals(this.LLJJJJ, cardInfo.LLJJJJ) && this.LLJJJJJIL == cardInfo.LLJJJJJIL && C0W0T.LIZIZ(this.LLJJJJLIIL, cardInfo.LLJJJJLIIL) && this.LLJJL == cardInfo.LLJJL && this.LLJJLIIIJLLLLLLLZ == cardInfo.LLJJLIIIJLLLLLLLZ && this.LLJL == cardInfo.LLJL && this.LLJLILLLLZIIL == cardInfo.LLJLILLLLZIIL && this.LLJLL == cardInfo.LLJLL && C0W0T.LIZIZ(this.LLJLLIL, cardInfo.LLJLLIL) && C0W0T.LIZIZ(this.LLJLLL, cardInfo.LLJLLL) && C0W0T.LIZIZ(this.LLJZ, cardInfo.LLJZ) && this.LLJZIJLIL == cardInfo.LLJZIJLIL && this.LLL == cardInfo.LLL && this.LLLFF == cardInfo.LLLFF && this.LLLFFI == cardInfo.LLLFFI && this.LLLII == cardInfo.LLLII && this.LLLFZ == cardInfo.LLLFZ && C0W0T.LIZIZ(this.LLLI, cardInfo.LLLI)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJ(parcel, 3, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILZ, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZIL, false);
        C817940W6u.LJIIJ(parcel, 6, this.LLILZLL);
        C817940W6u.LJIIZILJ(parcel, 7, this.LLIZ, i, false);
        C817940W6u.LJIJ(parcel, 8, this.LLIZLLLIL, false);
        C817940W6u.LJIIZILJ(parcel, 9, this.LLJ, i, false);
        C817940W6u.LJIIJ(parcel, 10, this.LLJI);
        C817940W6u.LJIIJ(parcel, 11, this.LLJIJIL);
        C817940W6u.LJIIZILJ(parcel, 12, this.LLJILJIL, i, false);
        C817940W6u.LJIJ(parcel, 13, this.LLJILJILJ, false);
        C817940W6u.LJIIZILJ(parcel, 15, this.LLJILLL, i, false);
        C817940W6u.LJIJ(parcel, 16, this.LLJJ, false);
        C817940W6u.LJ(parcel, 17, this.LLJJI, false);
        C817940W6u.LJIIJ(parcel, 18, this.LLJJIII);
        C817940W6u.LJIIJ(parcel, 20, this.LLJJIJI);
        C817940W6u.LJIIJ(parcel, 21, this.LLJJIJIIJIL);
        C817940W6u.LJIIZILJ(parcel, 22, this.LLJJIJIL, i, false);
        C817940W6u.LJIIZILJ(parcel, 23, this.LLJJJ, i, false);
        C817940W6u.LJIJ(parcel, 24, this.LLJJJIL, false);
        C817940W6u.LJIJJLI(parcel, 25, this.LLJJJJ, i);
        C817940W6u.LIZ(parcel, 26, this.LLJJJJJIL);
        C817940W6u.LJIL(parcel, 27, this.LLJJJJLIIL, false);
        C817940W6u.LIZ(parcel, 28, this.LLJJL);
        C817940W6u.LIZ(parcel, 29, this.LLJJLIIIJLLLLLLLZ);
        C817940W6u.LJIILJJIL(30, this.LLJL, parcel);
        C817940W6u.LJIILJJIL(31, this.LLJLIL, parcel);
        C817940W6u.LIZ(parcel, 32, this.LLJLILLLLZIIL);
        C817940W6u.LJIILJJIL(33, this.LLJLL, parcel);
        C817940W6u.LJIJ(parcel, 34, this.LLJLLIL, false);
        C817940W6u.LJIJ(parcel, 35, this.LLJLLL, false);
        C817940W6u.LJIIZILJ(parcel, 36, this.LLJZ, i, false);
        C817940W6u.LJIIJ(parcel, 37, this.LLJZIJLIL);
        C817940W6u.LIZ(parcel, 38, this.LLL);
        C817940W6u.LJIJ(parcel, 39, this.LLLF, false);
        C817940W6u.LJIIJ(parcel, 40, this.LLLFF);
        C817940W6u.LIZ(parcel, 41, this.LLLFFI);
        C817940W6u.LJIILJJIL(42, this.LLLFZ, parcel);
        C817940W6u.LJIJ(parcel, 43, this.LLLI, false);
        C817940W6u.LJIIJ(parcel, 44, this.LLLII);
        C817940W6u.LJIJ(parcel, 45, this.LLILLJJLI, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CardInfo(String str, String str2, byte[] bArr, String str3, String str4, int i, TokenStatus tokenStatus, String str5, Uri uri, int i2, int i3, zzaj zzajVar, String str6, zzaz zzazVar, String str7, byte[] bArr2, int i4, int i5, int i6, zzah zzahVar, zzaf zzafVar, String str8, zzan[] zzanVarArr, boolean z, List list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str9, String str10, zze zzeVar, int i7, boolean z5, String str11, int i8, boolean z6, long j4, String str12, int i9) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bArr;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = i;
        this.LLIZ = tokenStatus;
        this.LLIZLLLIL = str5;
        this.LLJ = uri;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = zzajVar;
        this.LLJILJILJ = str6;
        this.LLJILLL = zzazVar;
        this.LLJJ = str7;
        this.LLJJI = bArr2;
        this.LLJJIII = i4;
        this.LLJJIJI = i5;
        this.LLJJIJIIJIL = i6;
        this.LLJJIJIL = zzahVar;
        this.LLJJJ = zzafVar;
        this.LLJJJIL = str8;
        this.LLJJJJ = zzanVarArr;
        this.LLJJJJJIL = z;
        this.LLJJJJLIIL = list;
        this.LLJJL = z2;
        this.LLJJLIIIJLLLLLLLZ = z3;
        this.LLJL = j;
        this.LLJLIL = j2;
        this.LLJLILLLLZIIL = z4;
        this.LLJLL = j3;
        this.LLJLLIL = str9;
        this.LLJLLL = str10;
        this.LLJZ = zzeVar;
        this.LLJZIJLIL = i7;
        this.LLL = z5;
        this.LLLF = str11;
        this.LLLFF = i8;
        this.LLLFFI = z6;
        this.LLLFZ = j4;
        this.LLLI = str12;
        this.LLLII = i9;
    }
}
