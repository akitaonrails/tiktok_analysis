package com.facebook;

import X.C0W7K;
import X.C1BJ0;
import X.C1BJS;
import X.C1D13;
import X.C2202721BIw;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;
    public static final C2202721BIw Companion = new C2202721BIw();
    public static final C1BJ0 DEFAULT_ACCESS_TOKEN_SOURCE;
    public static final Date DEFAULT_EXPIRATION_TIME;
    public static final Date DEFAULT_LAST_REFRESH_TIME;
    public static final Date MAX_DATE;
    public final String applicationId;
    public final Date dataAccessExpirationTime;
    public final Set<String> declinedPermissions;
    public final Set<String> expiredPermissions;
    public final Date expires;
    public final String graphDomain;
    public final Date lastRefresh;
    public final Set<String> permissions;
    public final C1BJ0 source;
    public final String token;
    public final String userId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = C1BJ0.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C1D13(0);
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put("last_refresh", this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put("application_id", this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put("data_access_expiration_time", this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        synchronized (FacebookSdk.LIZ) {
        }
        sb.append(TextUtils.join(", ", this.permissions));
        sb.append("]}");
        return sb.toString();
    }

    public AccessToken(Parcel parcel) {
        C1BJ0 c1bj0ValueOf;
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.permissions = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.declinedPermissions = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.expiredPermissions = Collections.unmodifiableSet(new HashSet(arrayList));
        String string = parcel.readString();
        C0W7K.LJ(string, "token");
        this.token = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            c1bj0ValueOf = C1BJ0.valueOf(string2);
        } else {
            c1bj0ValueOf = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = c1bj0ValueOf;
        this.lastRefresh = new Date(parcel.readLong());
        String string3 = parcel.readString();
        C0W7K.LJ(string3, "applicationId");
        this.applicationId = string3;
        String string4 = parcel.readString();
        C0W7K.LJ(string4, "userId");
        this.userId = string4;
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.LJFF(this.expires, accessToken.expires) && Intrinsics.LJFF(this.permissions, accessToken.permissions) && Intrinsics.LJFF(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.LJFF(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.LJFF(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.LJFF(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.LJFF(this.applicationId, accessToken.applicationId) && Intrinsics.LJFF(this.userId, accessToken.userId) && Intrinsics.LJFF(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
                return false;
            }
            if (Intrinsics.LJFF(str, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeStringList(new ArrayList(this.expiredPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.dataAccessExpirationTime.getTime());
        parcel.writeString(this.graphDomain);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C1BJ0 c1bj0, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, c1bj0, date, date2, date3, "facebook");
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C1BJ0 c1bj0, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        Date date4 = date2;
        Date date5 = date3;
        String str5 = str4;
        C0W7K.LIZIZ(str, "accessToken");
        C0W7K.LIZIZ(str2, "applicationId");
        C0W7K.LIZIZ(str3, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        this.permissions = Collections.unmodifiableSet(hashSet);
        if (collection2 != null) {
            hashSet2 = new HashSet(collection2);
        } else {
            hashSet2 = new HashSet();
        }
        this.declinedPermissions = Collections.unmodifiableSet(hashSet2);
        if (collection3 != null) {
            hashSet3 = new HashSet(collection3);
        } else {
            hashSet3 = new HashSet();
        }
        this.expiredPermissions = Collections.unmodifiableSet(hashSet3);
        this.token = str;
        c1bj0 = c1bj0 == null ? DEFAULT_ACCESS_TOKEN_SOURCE : c1bj0;
        if (str5 != null && str5.equals("instagram")) {
            int i = C1BJS.LIZ[c1bj0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1bj0 = C1BJ0.INSTAGRAM_WEB_VIEW;
                    }
                } else {
                    c1bj0 = C1BJ0.INSTAGRAM_CUSTOM_CHROME_TAB;
                }
            } else {
                c1bj0 = C1BJ0.INSTAGRAM_APPLICATION_WEB;
            }
        }
        this.source = c1bj0;
        this.lastRefresh = date4 == null ? DEFAULT_LAST_REFRESH_TIME : date4;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date5 == null || date5.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date5;
        this.graphDomain = str5 == null ? "facebook" : str5;
    }
}
