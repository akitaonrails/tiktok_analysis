package com.ss.android.ugc.aweme.account.provider;

import X.C01GW;
import X.C09CT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13BV;
import X.C14BS;
import X.C1BWL;
import X.C2362209Nk;
import X.C452501pT;
import X.C786410Ut5;
import X.C820970WIl;
import X.C848280XPm;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountInfoProvider extends ContentProvider {
    public OneTapLoginTokens LLILLJJLI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(92));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(93));

    public static final class Token {

        @C09CT("avatar_url")
        public String avatarUrl;

        @C09CT("device_secret")
        public String deviceSecret;

        @C09CT("id_token")
        public String idToken;

        @C09CT("id_token_id")
        public String idTokenId;

        @C09CT("is_selected")
        public boolean isSelected;

        @C09CT("last_updated")
        public long lastUpdated;

        @C09CT("user_id")
        public String userId;

        @C09CT("username")
        public String username;

        public Token() {
            this("", "", "", "", "", "", false, -1L);
        }

        public Token(String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j) {
            this.userId = str;
            this.idToken = str2;
            this.idTokenId = str3;
            this.deviceSecret = str4;
            this.username = str5;
            this.avatarUrl = str6;
            this.isSelected = z;
            this.lastUpdated = j;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    public final boolean LIZIZ() {
        String callingPackage = getCallingPackage();
        if (callingPackage == null || callingPackage.length() == 0) {
            return false;
        }
        Context context = getContext();
        if (Intrinsics.LJFF(callingPackage, context != null ? context.getPackageName() : null)) {
            return true;
        }
        C820970WIl c820970WIl = C820970WIl.LIZ;
        Application applicationLIZ = C1BWL.LIZ();
        c820970WIl.getClass();
        return C820970WIl.LIZ(applicationLIZ, callingPackage);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        KevaBuilder.getInstance().setContext(getContext());
        return true;
    }

    public static final class OneTapLoginTokens {

        @C09CT("tokens")
        public List<Token> tokens;

        @C09CT("version")
        public String version;

        public OneTapLoginTokens() {
            this(null, null, 3, null);
        }

        public OneTapLoginTokens(List<Token> list, String str) {
            this.tokens = list;
            this.version = str;
        }

        public OneTapLoginTokens(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str);
        }
    }

    public static void LIZ(MatrixCursor matrixCursor, Token token) {
        matrixCursor.newRow().add("user_id", token.userId).add("id_token", token.idToken).add("id_token_id", token.idTokenId).add("device_secret", token.deviceSecret).add("username", token.username).add("avatar_url", token.avatarUrl).add("is_selected", Integer.valueOf(token.isSelected ? 1 : 0)).add("last_updated", Long.valueOf(token.lastUpdated));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) throws Throwable {
        String string = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11067, "com/ss/android/ugc/aweme/account/provider/AccountInfoProvider", "call", this, new Object[]{str, str2, bundle}, "android.os.Bundle", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFex9vAxux7Epp5w1HrK8H3jg+spO/romWV7TJA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Bundle) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        Object obj = str;
        if (objArr != null) {
            Object obj2 = objArr[0];
            Object obj3 = str;
            if (obj2 != null) {
                obj3 = obj2;
            }
            Object obj4 = objArr[1];
            Object obj5 = objArr[2];
            obj = obj3;
        }
        if (Intrinsics.LJFF(obj, "ping")) {
            return Bundle.EMPTY;
        }
        if (!Intrinsics.LJFF("device_ticket", obj) || !LIZIZ()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Keva keva = (Keva) C848280XPm.LIZ.getValue();
        if (keva != null) {
            string = keva.getString("device_migrate_ticket", "");
        }
        C786410Ut5.LJJJI("device_migrate_ticket", string, bundle2);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        Object obj;
        boolean z;
        List listLJJLIIIJILLIZJL;
        String string;
        boolean z2 = true;
        OneTapLoginTokens oneTapLoginTokens = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/account/provider/AccountInfoProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFex9vAxux7Epp5w1HrK8H3jg+spO/romWV7TJA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj2 = objArr[0];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr[1];
            obj = objArr[2];
            if (obj == null) {
                obj = str;
            }
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
        } else {
            uri2 = uri;
            obj = str;
        }
        C2362209Nk.LIZ(uri2, "query");
        if (!LIZIZ()) {
            return null;
        }
        if (Intrinsics.LJFF(obj, "device_ticket")) {
            final MatrixCursor matrixCursor = new MatrixCursor(new String[0]);
            return new CursorWrapper(matrixCursor) { // from class: X.0XFB
                @Override // android.database.CursorWrapper, android.database.Cursor
                public final Bundle getExtras() {
                    Bundle bundle = new Bundle();
                    Keva keva = (Keva) C848280XPm.LIZ.getValue();
                    C786410Ut5.LJJJI("device_migrate_ticket", keva != null ? keva.getString("device_migrate_ticket", "") : null, bundle);
                    return bundle;
                }
            };
        }
        System.currentTimeMillis();
        synchronized (this) {
            try {
                String strLIZ = ((C14BS) this.LL.getValue()).LIZ(KevaImpl.getRepo("ONE_TAP_LOGIN_TOKEN_PROVIDER", 1).getString("BLOB", ""));
                if (strLIZ != null && strLIZ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    try {
                        oneTapLoginTokens = (OneTapLoginTokens) ((Gson) this.LLILLL.getValue()).LJII(strLIZ, OneTapLoginTokens.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (oneTapLoginTokens == null) {
                    oneTapLoginTokens = new OneTapLoginTokens(C13BV.INSTANCE, "1.0");
                    KevaImpl.getRepo("ONE_TAP_LOGIN_TOKEN_PROVIDER", 1).storeString("BLOB", ((C14BS) this.LL.getValue()).LIZIZ(((Gson) this.LLILLL.getValue()).LJIILL(oneTapLoginTokens)));
                }
                this.LLILLJJLI = oneTapLoginTokens;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"user_id", "id_token", "id_token_id", "device_secret", "username", "avatar_url", "is_selected", "last_updated"});
        Keva keva = (Keva) C848280XPm.LIZ.getValue();
        String str3 = "";
        if (keva != null && (string = keva.getString("user_ids", "")) != null) {
            str3 = string;
        }
        if (str3.length() != 0) {
            z2 = false;
        }
        if (z2) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        } else {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6);
        }
        OneTapLoginTokens oneTapLoginTokens2 = this.LLILLJJLI;
        if (oneTapLoginTokens2 == null) {
            return matrixCursor2;
        }
        for (Token token : oneTapLoginTokens2.tokens) {
            if (listLJJLIIIJILLIZJL.contains(token.userId)) {
                if (Intrinsics.LJFF(obj, "ALL_KEYS")) {
                    LIZ(matrixCursor2, token);
                } else {
                    if (obj == null && token.isSelected) {
                        LIZ(matrixCursor2, token);
                        return matrixCursor2;
                    }
                    if (obj != null && Intrinsics.LJFF(obj, token.userId)) {
                        LIZ(matrixCursor2, token);
                        return matrixCursor2;
                    }
                }
            }
        }
        return matrixCursor2;
    }
}
