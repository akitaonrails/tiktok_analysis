package com.google.android.gms.auth.api.signin;

import X.C786410Ut5;
import X.C817940W6u;
import X.C833460Wmm;
import X.C833470Wmn;
import X.InterfaceC831640Wjq;
import X.InterfaceC833080WmA;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements InterfaceC833080WmA, InterfaceC831640Wjq, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zaa;
    public static final Scope zab;
    public static final Scope zac;
    public static final Scope zad;
    public static final Scope zae;
    public static Comparator<Scope> zag;
    public final int LL;
    public final ArrayList<Scope> zah;
    public Account zai;
    public boolean zaj;
    public final boolean zak;
    public final boolean zal;
    public String zam;
    public String zan;
    public ArrayList<GoogleSignInOptionsExtensionParcelable> zao;
    public String zap;
    public Map<Integer, GoogleSignInOptionsExtensionParcelable> zaq;

    public GoogleSignInOptions() {
        throw null;
    }

    static {
        Scope scope = new Scope(1, "profile");
        zaa = scope;
        zab = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        zac = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        zad = scope3;
        zae = new Scope(1, "https://www.googleapis.com/auth/games");
        C833470Wmn c833470Wmn = new C833470Wmn();
        ((HashSet) c833470Wmn.LIZ).add(scope2);
        ((HashSet) c833470Wmn.LIZ).add(scope);
        DEFAULT_SIGN_IN = c833470Wmn.LIZ();
        C833470Wmn c833470Wmn2 = new C833470Wmn();
        ((HashSet) c833470Wmn2.LIZ).add(scope3);
        c833470Wmn2.LIZ.addAll(Arrays.asList(new Scope[0]));
        DEFAULT_GAMES_SIGN_IN = c833470Wmn2.LIZ();
        CREATOR = new Parcelable.Creator<GoogleSignInOptions>() { // from class: X.0Wmp
            @Override // android.os.Parcelable.Creator
            public final GoogleSignInOptions createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                ArrayList arrayListLJIIJJI = null;
                int iLJIJJLI = 0;
                boolean zLJIILIIL = false;
                boolean zLJIILIIL2 = false;
                boolean zLJIILIIL3 = false;
                ArrayList arrayListLJIIJJI2 = null;
                Account account = null;
                String strLJII = null;
                String strLJII2 = null;
                String strLJII3 = null;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            break;
                        case 2:
                            arrayListLJIIJJI2 = C0W6J.LJIIJJI(parcel, i, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) C0W6J.LJI(parcel, i, Account.CREATOR);
                            break;
                        case 4:
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 5:
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 6:
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 7:
                            strLJII = C0W6J.LJII(i, parcel);
                            break;
                        case '\b':
                            strLJII2 = C0W6J.LJII(i, parcel);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            strLJII3 = C0W6J.LJII(i, parcel);
                            break;
                        default:
                            C0W6J.LJJII(i, parcel);
                            break;
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new GoogleSignInOptions(iLJIJJLI, arrayListLJIIJJI2, account, zLJIILIIL, zLJIILIIL2, zLJIILIIL3, strLJII, strLJII2, GoogleSignInOptions.LLIIIL(arrayListLJIIJJI), strLJII3);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
                return new GoogleSignInOptions[i];
            }
        };
        zag = new Comparator<Scope>() { // from class: X.0WmL
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Scope scope4, Scope scope5) {
                return scope4.zzb.compareTo(scope5.zzb);
            }
        };
    }

    public final ArrayList<Scope> LJLZ() {
        return new ArrayList<>(this.zah);
    }

    public final String LLIFFJFJJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator<Scope> it2 = this.zah.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().zzb);
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) ListProtector.get(arrayList2, i)).zzb);
        }
        Collections.sort(arrayList);
        C833460Wmm c833460Wmm = new C833460Wmm();
        c833460Wmm.LIZ(arrayList);
        c833460Wmm.LIZ(this.zai);
        c833460Wmm.LIZ(this.zam);
        c833460Wmm.LIZ = (((((c833460Wmm.LIZ * 31) + (this.zal ? 1 : 0)) * 31) + (this.zaj ? 1 : 0)) * 31) + (this.zak ? 1 : 0);
        c833460Wmm.LIZ(this.zap);
        return c833460Wmm.LIZ;
    }

    public static GoogleSignInOptions LLFFF(String str) {
        String strOptString;
        Account account;
        String strOptString2;
        String strOptString3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, JSONArrayProtectorUtils.getString(jSONArray, i)));
        }
        if (jSONObject.has("accountName")) {
            strOptString = jSONObject.optString("accountName");
        } else {
            strOptString = null;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            account = new Account(strOptString, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "idTokenRequested");
        boolean z2 = JSONObjectProtectorUtils.getBoolean(jSONObject, "serverAuthRequested");
        boolean z3 = JSONObjectProtectorUtils.getBoolean(jSONObject, "forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            strOptString2 = jSONObject.optString("serverClientId");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            strOptString3 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, strOptString2, strOptString3, new HashMap(), null);
    }

    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> LLIIIL(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.zab), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[Catch: ClassCastException -> 0x007f, TryCatch #0 {ClassCastException -> 0x007f, blocks: (B:5:0x0004, B:7:0x000e, B:9:0x0016, B:11:0x0026, B:13:0x0032, B:15:0x0036, B:17:0x003a, B:19:0x0042, B:21:0x004a, B:23:0x0050, B:25:0x0056, B:27:0x005c, B:28:0x0065, B:31:0x0070), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[Catch: ClassCastException -> 0x007f, TryCatch #0 {ClassCastException -> 0x007f, blocks: (B:5:0x0004, B:7:0x000e, B:9:0x0016, B:11:0x0026, B:13:0x0032, B:15:0x0036, B:17:0x003a, B:19:0x0042, B:21:0x004a, B:23:0x0050, B:25:0x0056, B:27:0x005c, B:28:0x0065, B:31:0x0070), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r3.zao     // Catch: java.lang.ClassCastException -> L7f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r0 > 0) goto L7e
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r4.zao     // Catch: java.lang.ClassCastException -> L7f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r0 > 0) goto L7e
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r0 = r3.zah     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r0 = r4.LJLZ()     // Catch: java.lang.ClassCastException -> L7f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7e
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zah     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r0 = r4.LJLZ()     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r1.containsAll(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L7e
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L70
            android.accounts.Account r0 = r4.zai     // Catch: java.lang.ClassCastException -> L7f
            if (r0 != 0) goto L7e
        L3a:
            java.lang.String r0 = r3.zam     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L65
            java.lang.String r0 = r4.zam     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L7e
        L4a:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r4.zal     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7e
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r4.zaj     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7e
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r4.zak     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7e
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r0 = r4.zap     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.ClassCastException -> L7f
            goto L79
        L65:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r0 = r4.zam     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 != 0) goto L4a
            goto L7d
        L70:
            android.accounts.Account r0 = r4.zai     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L7e
            goto L3a
        L79:
            if (r0 == 0) goto L7e
            r0 = 1
            return r0
        L7d:
            return r2
        L7e:
            return r2
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIL(parcel, 2, LJLZ(), false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zai, i, false);
        C817940W6u.LIZ(parcel, 4, this.zaj);
        C817940W6u.LIZ(parcel, 5, this.zak);
        C817940W6u.LIZ(parcel, 6, this.zal);
        C817940W6u.LJIJ(parcel, 7, this.zam, false);
        C817940W6u.LJIJ(parcel, 8, this.zan, false);
        C817940W6u.LJIL(parcel, 9, this.zao, false);
        C817940W6u.LJIJ(parcel, 10, this.zap, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.LL = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList<>(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
