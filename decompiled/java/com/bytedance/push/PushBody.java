package com.bytedance.push;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PushBody implements Parcelable {
    public static final Parcelable.Creator<PushBody> CREATOR = new C854630Xfp(11);
    public long expire_time;
    public String extra;
    public final String groupId;
    public long id;
    public int imageType;
    public String imageUrl;
    public boolean mIsPassThough;
    public String mNotificationChannelId;
    public int messageType;
    public JSONObject msgData;
    public final boolean needFilterMsgByUid;
    public int needFilterMsgByUidType;
    public String open_url;
    public long rid64;
    public final boolean showWhen;
    public final String targetSecUid;
    public String text;
    public String title;
    public boolean useLED;
    public boolean useSound;
    public boolean useVibrator;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String LIZ() {
        JSONObject jSONObject = this.msgData;
        if (jSONObject != null) {
            return C786410Ut5.J3(jSONObject);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushBody{id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", rid64=");
        sbLIZ.append(this.rid64);
        sbLIZ.append(", groupId='");
        sbLIZ.append(this.groupId);
        sbLIZ.append('\'');
        sbLIZ.append(", showWhen=");
        sbLIZ.append(this.showWhen);
        sbLIZ.append(", targetSecUid='");
        sbLIZ.append(this.targetSecUid);
        sbLIZ.append('\'');
        sbLIZ.append(", needFilterMsgByUidType=");
        sbLIZ.append(this.needFilterMsgByUidType);
        sbLIZ.append(", needFilterMsgByUid=");
        sbLIZ.append(this.needFilterMsgByUid);
        sbLIZ.append(", extra='");
        sbLIZ.append(this.extra);
        sbLIZ.append('\'');
        sbLIZ.append(", mNotificationChannelId='");
        sbLIZ.append(this.mNotificationChannelId);
        sbLIZ.append('\'');
        sbLIZ.append(", mIsPassThough=");
        sbLIZ.append(this.mIsPassThough);
        sbLIZ.append(", msgData=");
        sbLIZ.append(this.msgData);
        sbLIZ.append(", text='");
        sbLIZ.append(this.text);
        sbLIZ.append('\'');
        sbLIZ.append(", title='");
        sbLIZ.append(this.title);
        sbLIZ.append('\'');
        sbLIZ.append(", imageUrl='");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.imageType);
        sbLIZ.append(", open_url='");
        sbLIZ.append(this.open_url);
        sbLIZ.append('\'');
        sbLIZ.append(", useLED=");
        sbLIZ.append(this.useLED);
        sbLIZ.append(", useSound=");
        sbLIZ.append(this.useSound);
        sbLIZ.append(", useVibrator=");
        sbLIZ.append(this.useVibrator);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.messageType);
        sbLIZ.append(", expire_time=");
        sbLIZ.append(this.expire_time);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PushBody(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.msgData = jSONObject;
        this.open_url = jSONObject.optString("open_url");
        this.text = jSONObject.optString("text");
        this.title = jSONObject.optString("title");
        this.imageUrl = jSONObject.optString("image_url");
        this.id = jSONObject.optLong(FollowStatusChangeMethod.PARAM_UID, 0L);
        this.rid64 = jSONObject.optLong("rid64", 0L);
        this.useLED = LIZIZ(jSONObject, "use_led");
        this.useSound = LIZIZ(jSONObject, "sound");
        this.useVibrator = LIZIZ(jSONObject, "use_vibrator");
        this.imageType = jSONObject.optInt("image_type", 0);
        if (jSONObject.optInt("pass_through", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsPassThough = z;
        this.mNotificationChannelId = jSONObject.optString("notify_channel");
        this.messageType = jSONObject.optInt("msg_from");
        this.groupId = jSONObject.optString("group_id_str");
        if (jSONObject.optInt("st", 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.showWhen = z2;
        this.targetSecUid = jSONObject.optString("ttpush_sec_target_uid");
        int iOptInt = jSONObject.optInt("ttpush_need_filter_uid", 0);
        this.needFilterMsgByUidType = iOptInt;
        this.needFilterMsgByUid = iOptInt == 1;
        this.extra = jSONObject.optString("extra_str");
        this.expire_time = jSONObject.optLong("expire_time");
    }

    public PushBody(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.id = parcel.readLong();
        this.rid64 = parcel.readLong();
        this.groupId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.showWhen = z;
        this.targetSecUid = parcel.readString();
        this.needFilterMsgByUidType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.needFilterMsgByUid = z2;
        this.extra = parcel.readString();
        this.mNotificationChannelId = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mIsPassThough = z3;
        try {
            this.msgData = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.imageUrl = parcel.readString();
        this.imageType = parcel.readInt();
        this.open_url = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.useLED = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.useSound = z5;
        this.useVibrator = parcel.readByte() != 0;
        this.messageType = parcel.readInt();
        this.expire_time = parcel.readLong();
    }

    public static boolean LIZIZ(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return false;
        }
        int iOptInt = jSONObject.optInt(str, -1);
        if (iOptInt >= 1) {
            return true;
        }
        if (iOptInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.rid64);
        parcel.writeString(this.groupId);
        parcel.writeByte(this.showWhen ? (byte) 1 : (byte) 0);
        parcel.writeString(this.targetSecUid);
        parcel.writeInt(this.needFilterMsgByUidType);
        parcel.writeByte(this.needFilterMsgByUid ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeString(this.mNotificationChannelId);
        parcel.writeByte(this.mIsPassThough ? (byte) 1 : (byte) 0);
        parcel.writeString(C786410Ut5.J3(this.msgData));
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.open_url);
        parcel.writeByte(this.useLED ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useVibrator ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.messageType);
        parcel.writeLong(this.expire_time);
    }
}
