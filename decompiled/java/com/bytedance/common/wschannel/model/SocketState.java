package com.bytedance.common.wschannel.model;

import X.C2188811AlT;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SocketState implements Parcelable {
    public static final Parcelable.Creator<SocketState> CREATOR = new C854630Xfp(8);
    public int channelId;
    public int channelType;
    public String connectionExtraInfo;
    public int connectionState;
    public int connectionType;
    public String connectionUrl;
    public String error;
    public int errorCode;
    public boolean privateProtocolEnabled;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LJLIIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.channelId);
            jSONObject.put("type", this.connectionType);
            jSONObject.put("state", this.connectionState);
            jSONObject.put("url", this.connectionUrl);
            jSONObject.put("channel_type", this.channelType);
            jSONObject.put("error", this.error);
            jSONObject.put("error_code", this.errorCode);
            jSONObject.put("private_protocol_enable", this.privateProtocolEnabled ? 1 : 0);
            if (!TextUtils.isEmpty(this.connectionExtraInfo)) {
                jSONObject.put("extra_info", this.connectionExtraInfo);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocketState{connectionType=");
        sbLIZ.append(this.connectionType);
        sbLIZ.append(", connectionState=");
        sbLIZ.append(this.connectionState);
        sbLIZ.append(", connectionUrl='");
        sbLIZ.append(this.connectionUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", channelType=");
        sbLIZ.append(this.channelType);
        sbLIZ.append(", error='");
        sbLIZ.append(this.error);
        sbLIZ.append('\'');
        sbLIZ.append(", privateProtocol=");
        sbLIZ.append(this.privateProtocolEnabled);
        sbLIZ.append('\'');
        sbLIZ.append(", connectionExtraInfo='");
        sbLIZ.append(this.connectionExtraInfo);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocketState() {
    }

    public SocketState(Parcel parcel) {
        boolean z;
        this.connectionType = parcel.readInt();
        this.connectionState = parcel.readInt();
        this.connectionUrl = parcel.readString();
        this.channelId = parcel.readInt();
        this.channelType = parcel.readInt();
        this.error = parcel.readString();
        this.errorCode = parcel.readInt();
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.privateProtocolEnabled = z;
        this.connectionExtraInfo = parcel.readString();
    }

    public static SocketState LIZ(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.channelId = jSONObject.optInt("channel_id", Integer.MIN_VALUE);
        socketState.connectionType = jSONObject.optInt("type", -1);
        socketState.connectionState = jSONObject.optInt("state", -1);
        socketState.connectionUrl = jSONObject.optString("url", "");
        socketState.channelType = jSONObject.optInt("channel_type");
        socketState.error = jSONObject.optString("error", "");
        socketState.errorCode = jSONObject.optInt("error_code");
        boolean z = false;
        if (jSONObject.optInt("private_protocol_enable", 0) > 0) {
            z = true;
        }
        socketState.privateProtocolEnabled = z;
        socketState.connectionExtraInfo = jSONObject.optString("extra_info");
        return socketState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.connectionType);
        parcel.writeInt(this.connectionState);
        parcel.writeString(this.connectionUrl);
        parcel.writeInt(this.channelId);
        parcel.writeInt(this.channelType);
        parcel.writeString(this.error);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.privateProtocolEnabled ? 1 : 0);
        parcel.writeString(this.connectionExtraInfo);
    }
}
