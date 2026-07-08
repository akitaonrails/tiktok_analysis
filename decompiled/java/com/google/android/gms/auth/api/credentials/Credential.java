package com.google.android.gms.auth.api.credentials;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new Parcelable.Creator() { // from class: X.0VzM
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            Uri uri = null;
            ArrayList arrayListLJIIJJI = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            String strLJII6 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                        break;
                    case 4:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, IdToken.CREATOR);
                        break;
                    case 5:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                    case '\b':
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new Credential(strLJII, strLJII2, uri, arrayListLJIIJJI, strLJII3, strLJII4, strLJII5, strLJII6);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Credential[i];
        }
    };
    public final String zba;
    public final String zbb;
    public final Uri zbc;
    public final List zbd;
    public final String zbe;
    public final String zbf;
    public final String zbg;
    public final String zbh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbe, this.zbf});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.zba, credential.zba) && TextUtils.equals(this.zbb, credential.zbb) && C0W0T.LIZIZ(this.zbc, credential.zbc) && TextUtils.equals(this.zbe, credential.zbe) && TextUtils.equals(this.zbf, credential.zbf)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zba, false);
        C817940W6u.LJIJ(parcel, 2, this.zbb, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zbc, i, false);
        C817940W6u.LJIL(parcel, 4, this.zbd, false);
        C817940W6u.LJIJ(parcel, 5, this.zbe, false);
        C817940W6u.LJIJ(parcel, 6, this.zbf, false);
        C817940W6u.LJIJ(parcel, 9, this.zbg, false);
        C817940W6u.LJIJ(parcel, 10, this.zbh, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List listUnmodifiableList;
        Boolean boolValueOf;
        boolean z;
        C0W3J.LJIIIZ(str, "credential identifier cannot be null");
        String strTrim = str.trim();
        C0W3J.LJFF("credential identifier cannot be empty", strTrim);
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                boolValueOf = Boolean.FALSE;
            } else {
                Uri uri2 = UriProtector.parse(str4);
                if (uri2.isAbsolute() && uri2.isHierarchical() && !TextUtils.isEmpty(uri2.getScheme()) && !TextUtils.isEmpty(uri2.getAuthority())) {
                    if (!"http".equalsIgnoreCase(uri2.getScheme()) && !"https".equalsIgnoreCase(uri2.getScheme())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
            }
            if (!boolValueOf.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.zbb = str2;
        this.zbc = uri;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.zbd = listUnmodifiableList;
        this.zba = strTrim;
        this.zbe = str3;
        this.zbf = str4;
        this.zbg = str5;
        this.zbh = str6;
    }
}
