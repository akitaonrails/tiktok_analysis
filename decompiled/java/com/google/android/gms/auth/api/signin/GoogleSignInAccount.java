package com.google.android.gms.auth.api.signin;

import X.C0W3J;
import X.C786410Ut5;
import X.C817940W6u;
import X.C833180WmK;
import X.InterfaceC19786612bI;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new Parcelable.Creator<GoogleSignInAccount>() { // from class: X.0WmH
        @Override // android.os.Parcelable.Creator
        public final GoogleSignInAccount createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            Uri uri = null;
            String strLJII5 = null;
            String strLJII6 = null;
            ArrayList arrayListLJIIJJI = null;
            String strLJII7 = null;
            String strLJII8 = null;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
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
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                        break;
                    case 7:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, Scope.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        strLJII7 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strLJII8 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GoogleSignInAccount(iLJIJJLI, strLJII, strLJII2, strLJII3, strLJII4, uri, strLJII5, jLJJ, strLJII6, arrayListLJIIJJI, strLJII7, strLJII8);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
            return new GoogleSignInAccount[i];
        }
    };
    public static InterfaceC19786612bI zaa = C833180WmK.LIZ;
    public final int LL;
    public final List<Scope> LLILLJJLI;
    public String zad;
    public String zae;
    public String zaf;
    public String zag;
    public Uri zah;
    public String zai;
    public long zaj;
    public String zak;
    public String zal;
    public String zam;
    public Set<Scope> zan = new HashSet();

    public final Set<Scope> LJLZ() {
        HashSet hashSet = new HashSet(this.LLILLJJLI);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    public final String LLI() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.zad;
            if (str != null) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_UID, str);
            }
            String str2 = this.zae;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.zaf;
            if (str3 != null) {
                jSONObject.put("email", str3);
            }
            String str4 = this.zag;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.zal;
            if (str5 != null) {
                jSONObject.put("givenName", str5);
            }
            String str6 = this.zam;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.zah;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.zai;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.LLILLJJLI;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: X.0WmJ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Scope) obj).zzb.compareTo(((Scope) obj2).zzb);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.zzb);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + LJLZ().hashCode();
    }

    public static GoogleSignInAccount LLFFF(String str) {
        Uri uri;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strOptString6 = null;
        if (zIsEmpty) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString7 = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(strOptString7)) {
            uri = UriProtector.parse(strOptString7);
        } else {
            uri = null;
        }
        long j = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, "expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, JSONArrayProtectorUtils.getString(jSONArray, i)));
        }
        String strOptString8 = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID);
        if (jSONObject.has("tokenId")) {
            strOptString = jSONObject.optString("tokenId");
        } else {
            strOptString = null;
        }
        if (jSONObject.has("email")) {
            strOptString2 = jSONObject.optString("email");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("displayName")) {
            strOptString3 = jSONObject.optString("displayName");
        } else {
            strOptString3 = null;
        }
        if (jSONObject.has("givenName")) {
            strOptString4 = jSONObject.optString("givenName");
        } else {
            strOptString4 = null;
        }
        if (jSONObject.has("familyName")) {
            strOptString6 = jSONObject.optString("familyName");
        }
        Long lValueOf = Long.valueOf(j);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "obfuscatedIdentifier");
        long jLongValue = lValueOf.longValue();
        C0W3J.LJI(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString8, strOptString, strOptString2, strOptString3, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString4, strOptString6);
        if (jSONObject.has("serverAuthCode")) {
            strOptString5 = jSONObject.optString("serverAuthCode");
        } else {
            strOptString5 = null;
        }
        googleSignInAccount.zai = strOptString5;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.zak.equals(this.zak) || !googleSignInAccount.LJLZ().equals(LJLZ())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.zad, false);
        C817940W6u.LJIJ(parcel, 3, this.zae, false);
        C817940W6u.LJIJ(parcel, 4, this.zaf, false);
        C817940W6u.LJIJ(parcel, 5, this.zag, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.zah, i, false);
        C817940W6u.LJIJ(parcel, 7, this.zai, false);
        C817940W6u.LJIILJJIL(8, this.zaj, parcel);
        C817940W6u.LJIJ(parcel, 9, this.zak, false);
        C817940W6u.LJIL(parcel, 10, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 11, this.zal, false);
        C817940W6u.LJIJ(parcel, 12, this.zam, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.LL = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.LLILLJJLI = list;
        this.zal = str7;
        this.zam = str8;
    }
}
