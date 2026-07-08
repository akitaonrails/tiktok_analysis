package com.ss.android.ugc.aweme.subscription.pgc.api.bridge;

import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionSceneContext implements Parcelable {
    public final String anchorSecUid;
    public final long anchorUid;
    public final String enterFromMerge;
    public final String enterMethod;
    public final boolean forceUseNewStyle;
    public final String initPackageId;
    public final boolean isInLiveRoom;
    public final boolean isSubscribed;
    public final long liveSubOnlyLiveMonth;
    public final long liveSubOnlyLiveTier;
    public final String logParam;
    public final String previousPage;
    public final String requestExtraParam;
    public final String requestId;
    public final long roomId;
    public final String scenario;
    public final Uri schemaUri;
    public final boolean showDim;
    public final String showEntrance;
    public final String videoId;
    public static final Parcelable.Creator<SubscriptionSceneContext> CREATOR = new Parcelable.Creator<SubscriptionSceneContext>() { // from class: X.0K60
        @Override // android.os.Parcelable.Creator
        public final SubscriptionSceneContext createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string8 = parcel.readString();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new SubscriptionSceneContext(j, j2, string, string2, string3, string4, string5, string6, z, z2, string7, z3, string8, j3, j4, string9, string10, z4, parcel.readString(), (Uri) parcel.readParcelable(SubscriptionSceneContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SubscriptionSceneContext[] newArray(int i) {
            return new SubscriptionSceneContext[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionSceneContext() {
        long j = 0;
        boolean z = false;
        this(j, j, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048575);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionSceneContext)) {
            return false;
        }
        SubscriptionSceneContext subscriptionSceneContext = (SubscriptionSceneContext) obj;
        return this.roomId == subscriptionSceneContext.roomId && this.anchorUid == subscriptionSceneContext.anchorUid && Intrinsics.LJFF(this.anchorSecUid, subscriptionSceneContext.anchorSecUid) && Intrinsics.LJFF(this.enterFromMerge, subscriptionSceneContext.enterFromMerge) && Intrinsics.LJFF(this.enterMethod, subscriptionSceneContext.enterMethod) && Intrinsics.LJFF(this.showEntrance, subscriptionSceneContext.showEntrance) && Intrinsics.LJFF(this.requestId, subscriptionSceneContext.requestId) && Intrinsics.LJFF(this.videoId, subscriptionSceneContext.videoId) && this.isInLiveRoom == subscriptionSceneContext.isInLiveRoom && this.isSubscribed == subscriptionSceneContext.isSubscribed && Intrinsics.LJFF(this.scenario, subscriptionSceneContext.scenario) && this.forceUseNewStyle == subscriptionSceneContext.forceUseNewStyle && Intrinsics.LJFF(this.initPackageId, subscriptionSceneContext.initPackageId) && this.liveSubOnlyLiveTier == subscriptionSceneContext.liveSubOnlyLiveTier && this.liveSubOnlyLiveMonth == subscriptionSceneContext.liveSubOnlyLiveMonth && Intrinsics.LJFF(this.logParam, subscriptionSceneContext.logParam) && Intrinsics.LJFF(this.requestExtraParam, subscriptionSceneContext.requestExtraParam) && this.showDim == subscriptionSceneContext.showDim && Intrinsics.LJFF(this.previousPage, subscriptionSceneContext.previousPage) && Intrinsics.LJFF(this.schemaUri, subscriptionSceneContext.schemaUri);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((((((((((((((((((((((((((C786410Ut5.Y2(this.roomId) * 31) + C786410Ut5.Y2(this.anchorUid)) * 31) + this.anchorSecUid.hashCode()) * 31) + this.enterFromMerge.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.showEntrance.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.videoId.hashCode()) * 31) + C786410Ut5.Z2(this.isInLiveRoom)) * 31) + C786410Ut5.Z2(this.isSubscribed)) * 31) + this.scenario.hashCode()) * 31) + C786410Ut5.Z2(this.forceUseNewStyle)) * 31) + this.initPackageId.hashCode()) * 31) + C786410Ut5.Y2(this.liveSubOnlyLiveTier)) * 31) + C786410Ut5.Y2(this.liveSubOnlyLiveMonth)) * 31) + this.logParam.hashCode()) * 31) + this.requestExtraParam.hashCode()) * 31) + C786410Ut5.Z2(this.showDim)) * 31) + this.previousPage.hashCode()) * 31;
        Uri uri = this.schemaUri;
        return iY2 + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "SubscriptionSceneContext(roomId=" + this.roomId + ", anchorUid=" + this.anchorUid + ", anchorSecUid=" + this.anchorSecUid + ", enterFromMerge=" + this.enterFromMerge + ", enterMethod=" + this.enterMethod + ", showEntrance=" + this.showEntrance + ", requestId=" + this.requestId + ", videoId=" + this.videoId + ", isInLiveRoom=" + this.isInLiveRoom + ", isSubscribed=" + this.isSubscribed + ", scenario=" + this.scenario + ", forceUseNewStyle=" + this.forceUseNewStyle + ", initPackageId=" + this.initPackageId + ", liveSubOnlyLiveTier=" + this.liveSubOnlyLiveTier + ", liveSubOnlyLiveMonth=" + this.liveSubOnlyLiveMonth + ", logParam=" + this.logParam + ", requestExtraParam=" + this.requestExtraParam + ", showDim=" + this.showDim + ", previousPage=" + this.previousPage + ", schemaUri=" + this.schemaUri + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.roomId);
        parcel.writeLong(this.anchorUid);
        parcel.writeString(this.anchorSecUid);
        parcel.writeString(this.enterFromMerge);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.showEntrance);
        parcel.writeString(this.requestId);
        parcel.writeString(this.videoId);
        parcel.writeInt(this.isInLiveRoom ? 1 : 0);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        parcel.writeString(this.scenario);
        parcel.writeInt(this.forceUseNewStyle ? 1 : 0);
        parcel.writeString(this.initPackageId);
        parcel.writeLong(this.liveSubOnlyLiveTier);
        parcel.writeLong(this.liveSubOnlyLiveMonth);
        parcel.writeString(this.logParam);
        parcel.writeString(this.requestExtraParam);
        parcel.writeInt(this.showDim ? 1 : 0);
        parcel.writeString(this.previousPage);
        parcel.writeParcelable(this.schemaUri, i);
    }

    public final boolean LIZ() {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri = this.schemaUri;
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "preview_mode")) == null) {
            return false;
        }
        return Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1") || u.LJIJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true", true);
    }

    public SubscriptionSceneContext(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, boolean z3, String str8, long j3, long j4, String str9, String str10, boolean z4, String str11, Uri uri) {
        this.roomId = j;
        this.anchorUid = j2;
        this.anchorSecUid = str;
        this.enterFromMerge = str2;
        this.enterMethod = str3;
        this.showEntrance = str4;
        this.requestId = str5;
        this.videoId = str6;
        this.isInLiveRoom = z;
        this.isSubscribed = z2;
        this.scenario = str7;
        this.forceUseNewStyle = z3;
        this.initPackageId = str8;
        this.liveSubOnlyLiveTier = j3;
        this.liveSubOnlyLiveMonth = j4;
        this.logParam = str9;
        this.requestExtraParam = str10;
        this.showDim = z4;
        this.previousPage = str11;
        this.schemaUri = uri;
    }

    public /* synthetic */ SubscriptionSceneContext(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, boolean z3, String str8, long j3, long j4, String str9, String str10, boolean z4, String str11, Uri uri, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? "" : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z3, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i & 8192) != 0 ? 0L : j3, (i & 16384) != 0 ? 0L : j4, (32768 & i) != 0 ? "" : str9, (65536 & i) != 0 ? "" : str10, (131072 & i) != 0 ? false : z4, (262144 & i) == 0 ? str11 : "", (i & 524288) != 0 ? null : uri);
    }
}
