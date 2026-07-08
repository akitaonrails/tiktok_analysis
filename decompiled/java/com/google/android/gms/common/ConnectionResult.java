package com.google.android.gms.common;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public final int LL;
    public final int zzb;
    public final PendingIntent zzc;
    public final String zzd;
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new Parcelable.Creator() { // from class: X.0WXy
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            PendingIntent pendingIntent = null;
            String strLJII = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ConnectionResult(iLJIJJLI, iLJIJJLI2, strLJII, pendingIntent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ConnectionResult[i];
        }
    };

    public ConnectionResult() {
        throw null;
    }

    public ConnectionResult(int i, int i2, String str, PendingIntent pendingIntent) {
        this.LL = i;
        this.zzb = i2;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    public final boolean LJLZ() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    public final boolean LLFFF() {
        return this.zzb == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(LLI(this.zzb), "statusCode");
        c0w3l.LIZ(this.zzc, "resolution");
        c0w3l.LIZ(this.zzd, "message");
        return c0w3l.toString();
    }

    public ConnectionResult(int i) {
        this(1, i, null, null);
    }

    public static String LLI(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case BdTuring.TYPE_ECAF /* 9 */:
                        return "SERVICE_INVALID";
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return "DEVELOPER_ERROR";
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                return "SIGN_IN_FAILED";
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.zzb == connectionResult.zzb && C0W0T.LIZIZ(this.zzc, connectionResult.zzc) && C0W0T.LIZIZ(this.zzd, connectionResult.zzd)) {
            return true;
        }
        return false;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, null, pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
