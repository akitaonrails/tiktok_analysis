package com.ss.android.ugc.aweme.account.provider;

import X.C01GW;
import X.C09CT;
import X.C0XFC;
import X.C0XFF;
import X.C13BV;
import X.C13LP;
import X.C14BS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2362209Nk;
import X.C452501pT;
import X.C7740030o;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class OneTapLoginTokenProvider extends ContentProvider {
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C0XFC());
    public OneTapLoginTokens LLILLL;
    public long LLILZ;

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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            return Intrinsics.LJFF(this.userId, token.userId) && Intrinsics.LJFF(this.idToken, token.idToken) && Intrinsics.LJFF(this.idTokenId, token.idTokenId) && Intrinsics.LJFF(this.deviceSecret, token.deviceSecret) && Intrinsics.LJFF(this.username, token.username) && Intrinsics.LJFF(this.avatarUrl, token.avatarUrl) && this.isSelected == token.isSelected && this.lastUpdated == token.lastUpdated;
        }

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

    public final void LIZIZ() {
        OneTapLoginTokens oneTapLoginTokens;
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initializeData - isInitialized: ");
                sbLIZ.append(this.LL);
                C0XFF.LIZJ("OneTapLoginProvider", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LL) {
                    return;
                }
                KevaBuilder.getInstance().setContext(getContext());
                C0XFF.LIZJ("OneTapLoginProvider", "reading blob from keva");
                String strLIZ = ((C14BS) this.LLILLJJLI.getValue()).LIZ(Keva.getRepo("ONE_TAP_LOGIN_TOKEN_PROVIDER").getString("BLOB", ""));
                if (strLIZ == null || strLIZ.length() == 0) {
                    C0XFF.LIZJ("OneTapLoginProvider", "found no tokens on disk, initializing token structure");
                    oneTapLoginTokens = new OneTapLoginTokens(C13BV.INSTANCE, "1.0", "", null, 8, null);
                    LIZLLL(oneTapLoginTokens);
                } else {
                    try {
                        oneTapLoginTokens = (OneTapLoginTokens) C7740030o.LIZ().getGson().LJII(strLIZ, OneTapLoginTokens.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Error parsing the deserializedBlob: ");
                        sbLIZ2.append(e.getMessage());
                        C0XFF.LIZIZ("OneTapLoginProvider", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (oneTapLoginTokens == null) {
                        C0XFF.LIZJ("OneTapLoginProvider", "found no tokens on disk, initializing token structure");
                        oneTapLoginTokens = new OneTapLoginTokens(C13BV.INSTANCE, "1.0", "", null, 8, null);
                        LIZLLL(oneTapLoginTokens);
                    }
                }
                this.LLILLL = oneTapLoginTokens;
                this.LL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C0XFF.LIZJ("OneTapLoginProvider", "onCreate");
        this.LLILZ = SystemClock.elapsedRealtime();
        return true;
    }

    public static final class OneTapLoginTokens {
        public static final int $stable = 8;

        @C09CT("certs_hash")
        public String certsHash;
        public transient String certsMap;

        @C09CT("tokens")
        public List<Token> tokens;

        @C09CT("version")
        public String version;

        public OneTapLoginTokens() {
            this(null, null, null, null, 15, null);
        }

        public final void setCertsHash(String str) {
            this.certsHash = str;
        }

        public final void setCertsMap(String str) {
            this.certsMap = str;
        }

        public final void setTokens(List<Token> list) {
            this.tokens = list;
        }

        public final void setVersion(String str) {
            this.version = str;
        }

        public OneTapLoginTokens(List<Token> list, String str, String str2, String str3) {
            this.tokens = list;
            this.version = str;
            this.certsHash = str2;
            this.certsMap = str3;
        }

        public OneTapLoginTokens(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[PHI: r1
      0x00b1: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v14 java.lang.String) binds: [B:28:0x00af, B:26:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.account.provider.OneTapLoginTokenProvider.OneTapLoginTokens r12) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.provider.OneTapLoginTokenProvider.LIZLLL(com.ss.android.ugc.aweme.account.provider.OneTapLoginTokenProvider$OneTapLoginTokens):void");
    }

    public static void LIZ(MatrixCursor matrixCursor, Token token) {
        matrixCursor.newRow().add("user_id", token.userId).add("id_token", token.idToken).add("id_token_id", token.idTokenId).add("device_secret", token.deviceSecret).add("username", token.username).add("avatar_url", token.avatarUrl).add("is_selected", Integer.valueOf(token.isSelected ? 1 : 0)).add("last_updated", Long.valueOf(token.lastUpdated));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0194 A[PHI: r1
      0x0194: PHI (r1v10 java.lang.String) = (r1v9 java.lang.String), (r1v15 java.lang.String) binds: [B:61:0x012d, B:63:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri insert(android.net.Uri r24, android.content.ContentValues r25) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.provider.OneTapLoginTokenProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String packageName;
        OneTapLoginTokens oneTapLoginTokens;
        C2362209Nk.LIZ(uri, "delete");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete, callingPackage: ");
        sbLIZ.append(getCallingPackage());
        C0XFF.LIZJ("OneTapLoginProvider", C2188811AlT.LIZIZ(sbLIZ));
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            Context context = getContext();
            OneTapLoginTokens oneTapLoginTokens2 = null;
            if (context != null) {
                packageName = context.getPackageName();
            } else {
                packageName = null;
            }
            if (Intrinsics.LJFF(callingPackage, packageName) && str != null) {
                LIZIZ();
                if (Intrinsics.LJFF(str, "ALL_KEYS")) {
                    OneTapLoginTokens oneTapLoginTokens3 = this.LLILLL;
                    if (oneTapLoginTokens3 == null) {
                        oneTapLoginTokens3 = null;
                    }
                    oneTapLoginTokens3.setTokens(C13BV.INSTANCE);
                    LIZJ(0, "oidc_delete_token", null, null);
                } else {
                    OneTapLoginTokens oneTapLoginTokens4 = this.LLILLL;
                    if (oneTapLoginTokens4 == null) {
                        oneTapLoginTokens4 = null;
                    }
                    Iterator<Token> it2 = oneTapLoginTokens4.tokens.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Token next = it2.next();
                        if (Intrinsics.LJFF(next.userId, str)) {
                            OneTapLoginTokens oneTapLoginTokens5 = this.LLILLL;
                            if (oneTapLoginTokens5 == null) {
                                oneTapLoginTokens = null;
                                oneTapLoginTokens5 = null;
                            } else {
                                oneTapLoginTokens = oneTapLoginTokens5;
                            }
                            oneTapLoginTokens.setTokens(C13LP.LJLIIIL(next, oneTapLoginTokens5.tokens));
                            OneTapLoginTokens oneTapLoginTokens6 = this.LLILLL;
                            if (oneTapLoginTokens6 == null) {
                                oneTapLoginTokens6 = null;
                            }
                            LIZJ(oneTapLoginTokens6.tokens.size(), "oidc_delete_token", null, "logout");
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("writing ");
                OneTapLoginTokens oneTapLoginTokens7 = this.LLILLL;
                if (oneTapLoginTokens7 == null) {
                    oneTapLoginTokens7 = null;
                }
                sb.append(oneTapLoginTokens7.tokens.size());
                sb.append(" tokens to storage");
                C0XFF.LIZJ("OneTapLoginProvider", sb.toString());
                OneTapLoginTokens oneTapLoginTokens8 = this.LLILLL;
                if (oneTapLoginTokens8 != null) {
                    oneTapLoginTokens2 = oneTapLoginTokens8;
                }
                LIZLLL(oneTapLoginTokens2);
            }
        }
        return 0;
    }

    public static void LIZJ(int i, String str, Boolean bool, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "token_num");
        if (str2 != null) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, str2);
        }
        if (bool != null) {
            c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "from_standalone");
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (X.C820970WIl.LIZ(r2, r5) == false) goto L25;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor query(android.net.Uri r19, java.lang.String[] r20, java.lang.String r21, java.lang.String[] r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.provider.OneTapLoginTokenProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
