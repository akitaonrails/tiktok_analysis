package com.ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGameDualDeviceActivityArgs implements IRouteArg {
    public String anchorId;
    public int audioSource;
    public Float bitRateScale;
    public String connectType;
    public String didSink;
    public String enterFrom;
    public Integer fps;
    public int isRtc;
    public int landscape;
    public int micScale;
    public int pcVersion;
    public String roomId;
    public int serverMode;
    public String settings;
    public String sinkPlatform;
    public String sourceIp;
    public int sourcePort;
    public String timestamp;
    public String uuid;
    public int version;
    public int videoHeight;
    public int videoWidth;
    public static final Parcelable.Creator<LiveGameDualDeviceActivityArgs> CREATOR = new Parcelable.Creator<LiveGameDualDeviceActivityArgs>() { // from class: X.0Urn
        @Override // android.os.Parcelable.Creator
        public final LiveGameDualDeviceActivityArgs createFromParcel(Parcel parcel) {
            Float fValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new LiveGameDualDeviceActivityArgs(string, i, string2, i2, i3, i4, i5, fValueOf, numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveGameDualDeviceActivityArgs[] newArray(int i) {
            return new LiveGameDualDeviceActivityArgs[i];
        }
    };
    public static final int $stable = 8;

    public LiveGameDualDeviceActivityArgs() {
        this(null, -1, null, -1, -1, -1, -1, null, null, null, null, null, -1, -1, -1, -1, null, null, null, null, 0, null);
    }

    public final LiveGameDualDeviceActivityArgs copy(String str, int i, String str2, int i2, int i3, int i4, int i5, Float f, Integer num, String str3, String str4, String str5, int i6, int i7, int i8, int i9, String str6, String str7, String str8, String str9, int i10, String str10) {
        return new LiveGameDualDeviceActivityArgs(str, i, str2, i2, i3, i4, i5, f, num, str3, str4, str5, i6, i7, i8, i9, str6, str7, str8, str9, i10, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveGameDualDeviceActivityArgs)) {
            return false;
        }
        LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs = (LiveGameDualDeviceActivityArgs) obj;
        return Intrinsics.LJFF(this.sourceIp, liveGameDualDeviceActivityArgs.sourceIp) && this.sourcePort == liveGameDualDeviceActivityArgs.sourcePort && Intrinsics.LJFF(this.roomId, liveGameDualDeviceActivityArgs.roomId) && this.videoWidth == liveGameDualDeviceActivityArgs.videoWidth && this.videoHeight == liveGameDualDeviceActivityArgs.videoHeight && this.version == liveGameDualDeviceActivityArgs.version && this.pcVersion == liveGameDualDeviceActivityArgs.pcVersion && Intrinsics.LJFF(this.bitRateScale, liveGameDualDeviceActivityArgs.bitRateScale) && Intrinsics.LJFF(this.fps, liveGameDualDeviceActivityArgs.fps) && Intrinsics.LJFF(this.anchorId, liveGameDualDeviceActivityArgs.anchorId) && Intrinsics.LJFF(this.sinkPlatform, liveGameDualDeviceActivityArgs.sinkPlatform) && Intrinsics.LJFF(this.settings, liveGameDualDeviceActivityArgs.settings) && this.audioSource == liveGameDualDeviceActivityArgs.audioSource && this.micScale == liveGameDualDeviceActivityArgs.micScale && this.serverMode == liveGameDualDeviceActivityArgs.serverMode && this.landscape == liveGameDualDeviceActivityArgs.landscape && Intrinsics.LJFF(this.uuid, liveGameDualDeviceActivityArgs.uuid) && Intrinsics.LJFF(this.enterFrom, liveGameDualDeviceActivityArgs.enterFrom) && Intrinsics.LJFF(this.timestamp, liveGameDualDeviceActivityArgs.timestamp) && Intrinsics.LJFF(this.didSink, liveGameDualDeviceActivityArgs.didSink) && this.isRtc == liveGameDualDeviceActivityArgs.isRtc && Intrinsics.LJFF(this.connectType, liveGameDualDeviceActivityArgs.connectType);
    }

    public int hashCode() {
        String str = this.sourceIp;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.sourcePort) * 31;
        String str2 = this.roomId;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31) + this.version) * 31) + this.pcVersion) * 31;
        Float f = this.bitRateScale;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.fps;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.anchorId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sinkPlatform;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.settings;
        int iHashCode7 = (((((((((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.audioSource) * 31) + this.micScale) * 31) + this.serverMode) * 31) + this.landscape) * 31;
        String str6 = this.uuid;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.enterFrom;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.timestamp;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.didSink;
        int iHashCode11 = (((iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.isRtc) * 31;
        String str10 = this.connectType;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "LiveGameDualDeviceActivityArgs(sourceIp=" + this.sourceIp + ", sourcePort=" + this.sourcePort + ", roomId=" + this.roomId + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", version=" + this.version + ", pcVersion=" + this.pcVersion + ", bitRateScale=" + this.bitRateScale + ", fps=" + this.fps + ", anchorId=" + this.anchorId + ", sinkPlatform=" + this.sinkPlatform + ", settings=" + this.settings + ", audioSource=" + this.audioSource + ", micScale=" + this.micScale + ", serverMode=" + this.serverMode + ", landscape=" + this.landscape + ", uuid=" + this.uuid + ", enterFrom=" + this.enterFrom + ", timestamp=" + this.timestamp + ", didSink=" + this.didSink + ", isRtc=" + this.isRtc + ", connectType=" + this.connectType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sourceIp);
        parcel.writeInt(this.sourcePort);
        parcel.writeString(this.roomId);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.version);
        parcel.writeInt(this.pcVersion);
        Float f = this.bitRateScale;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.fps;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.anchorId);
        parcel.writeString(this.sinkPlatform);
        parcel.writeString(this.settings);
        parcel.writeInt(this.audioSource);
        parcel.writeInt(this.micScale);
        parcel.writeInt(this.serverMode);
        parcel.writeInt(this.landscape);
        parcel.writeString(this.uuid);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.didSink);
        parcel.writeInt(this.isRtc);
        parcel.writeString(this.connectType);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final int getAudioSource() {
        return this.audioSource;
    }

    public final Float getBitRateScale() {
        return this.bitRateScale;
    }

    public final String getConnectType() {
        return this.connectType;
    }

    public final String getDidSink() {
        return this.didSink;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final Integer getFps() {
        return this.fps;
    }

    public final int getLandscape() {
        return this.landscape;
    }

    public final int getMicScale() {
        return this.micScale;
    }

    public final int getPcVersion() {
        return this.pcVersion;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final int getServerMode() {
        return this.serverMode;
    }

    public final String getSettings() {
        return this.settings;
    }

    public final String getSinkPlatform() {
        return this.sinkPlatform;
    }

    public final String getSourceIp() {
        return this.sourceIp;
    }

    public final int getSourcePort() {
        return this.sourcePort;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final int isRtc() {
        return this.isRtc;
    }

    public static LiveGameDualDeviceActivityArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Float f;
        Integer num6;
        String str3;
        String str4;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num11;
        String str9;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int iIntValue9;
        int iIntValue10;
        String str10 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("source_ip")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("source_ip"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("source_port")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("source_port"), Integer.class);
            if (num == null) {
                i += 2;
            }
        } else {
            i += 2;
            num = null;
        }
        if (bundle.containsKey("room_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("room_id"), String.class);
        } else {
            i += 4;
            str2 = null;
        }
        if (bundle.containsKey("video_w")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("video_w"), Integer.class);
            if (num2 == null) {
                i += 8;
            }
        } else {
            i += 8;
            num2 = null;
        }
        if (bundle.containsKey("video_h")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("video_h"), Integer.class);
            if (num3 == null) {
                i += 16;
            }
        } else {
            i += 16;
            num3 = null;
        }
        if (bundle.containsKey("ver")) {
            num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("ver"), Integer.class);
            if (num4 == null) {
                i += 32;
            }
        } else {
            i += 32;
            num4 = null;
        }
        if (bundle.containsKey("pc_version")) {
            num5 = (Integer) RouteParser.INSTANCE.parse(bundle.get("pc_version"), Integer.class);
            if (num5 == null) {
                i += 64;
            }
        } else {
            i += 64;
            num5 = null;
        }
        if (bundle.containsKey("bit_rate_scale")) {
            f = (Float) RouteParser.INSTANCE.parse(bundle.get("bit_rate_scale"), Float.class);
        } else {
            i += 128;
            f = null;
        }
        if (bundle.containsKey("fps")) {
            num6 = (Integer) RouteParser.INSTANCE.parse(bundle.get("fps"), Integer.class);
        } else {
            i += 256;
            num6 = null;
        }
        if (bundle.containsKey("anchor_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("anchor_id"), String.class);
        } else {
            i += 512;
            str3 = null;
        }
        if (bundle.containsKey("sink_platform")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("sink_platform"), String.class);
        } else {
            i += 1024;
        }
        if (bundle.containsKey("settings")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("settings"), String.class);
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            str4 = null;
        }
        if (bundle.containsKey("audio_source")) {
            num7 = (Integer) RouteParser.INSTANCE.parse(bundle.get("audio_source"), Integer.class);
            if (num7 == null) {
                i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            }
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            num7 = null;
        }
        if (bundle.containsKey("mic_scale")) {
            num8 = (Integer) RouteParser.INSTANCE.parse(bundle.get("mic_scale"), Integer.class);
            if (num8 == null) {
                i += 8192;
            }
        } else {
            i += 8192;
            num8 = null;
        }
        if (bundle.containsKey("server_mode")) {
            num9 = (Integer) RouteParser.INSTANCE.parse(bundle.get("server_mode"), Integer.class);
            if (num9 == null) {
                i += 16384;
            }
        } else {
            i += 16384;
            num9 = null;
        }
        if (bundle.containsKey("landscape")) {
            num10 = (Integer) RouteParser.INSTANCE.parse(bundle.get("landscape"), Integer.class);
            if (num10 == null) {
                i += 32768;
            }
        } else {
            i += 32768;
            num10 = null;
        }
        if (bundle.containsKey("uuid")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("uuid"), String.class);
        } else {
            i += 65536;
            str5 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 131072;
            str6 = null;
        }
        if (bundle.containsKey("timestamp")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("timestamp"), String.class);
        } else {
            i += 262144;
            str7 = null;
        }
        if (bundle.containsKey("did_sink")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("did_sink"), String.class);
        } else {
            i += 524288;
            str8 = null;
        }
        if (bundle.containsKey("is_rtc")) {
            num11 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_rtc"), Integer.class);
            if (num11 == null) {
                i += 1048576;
            }
        } else {
            i += 1048576;
            num11 = null;
        }
        if (bundle.containsKey("connect_type")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("connect_type"), String.class);
        } else {
            i += 2097152;
            str9 = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        } else {
            iIntValue4 = 0;
        }
        if (num5 != null) {
            iIntValue5 = num5.intValue();
        } else {
            iIntValue5 = 0;
        }
        if (num7 != null) {
            iIntValue6 = num7.intValue();
        } else {
            iIntValue6 = 0;
        }
        if (num8 != null) {
            iIntValue7 = num8.intValue();
        } else {
            iIntValue7 = 0;
        }
        if (num9 != null) {
            iIntValue8 = num9.intValue();
        } else {
            iIntValue8 = 0;
        }
        if (num10 != null) {
            iIntValue9 = num10.intValue();
        } else {
            iIntValue9 = 0;
        }
        if (num11 != null) {
            iIntValue10 = num11.intValue();
        } else {
            iIntValue10 = 0;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            iIntValue = -1;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            iIntValue2 = -1;
        }
        if ((i & 16) != 0) {
            iIntValue3 = -1;
        }
        if ((i & 32) != 0) {
            iIntValue4 = -1;
        }
        if ((i & 64) != 0) {
            iIntValue5 = -1;
        }
        if ((i & 128) != 0) {
            f = null;
        }
        if ((i & 256) != 0) {
            num6 = null;
        }
        if ((i & 512) != 0) {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            iIntValue6 = -1;
        }
        if ((i & 8192) != 0) {
            iIntValue7 = -1;
        }
        if ((i & 16384) != 0) {
            iIntValue8 = -1;
        }
        if ((32768 & i) != 0) {
            iIntValue9 = -1;
        }
        if ((65536 & i) != 0) {
            str5 = null;
        }
        if ((131072 & i) != 0) {
            str6 = null;
        }
        if ((262144 & i) != 0) {
            str7 = null;
        }
        if ((524288 & i) != 0) {
            str8 = null;
        }
        if ((1048576 & i) != 0) {
            iIntValue10 = 0;
        }
        if ((i & 2097152) != 0) {
            str9 = null;
        }
        return new LiveGameDualDeviceActivityArgs(str, iIntValue, str2, iIntValue2, iIntValue3, iIntValue4, iIntValue5, f, num6, str3, str10, str4, iIntValue6, iIntValue7, iIntValue8, iIntValue9, str5, str6, str7, str8, iIntValue10, str9);
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAudioSource(int i) {
        this.audioSource = i;
    }

    public final void setBitRateScale(Float f) {
        this.bitRateScale = f;
    }

    public final void setConnectType(String str) {
        this.connectType = str;
    }

    public final void setDidSink(String str) {
        this.didSink = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFps(Integer num) {
        this.fps = num;
    }

    public final void setLandscape(int i) {
        this.landscape = i;
    }

    public final void setMicScale(int i) {
        this.micScale = i;
    }

    public final void setPcVersion(int i) {
        this.pcVersion = i;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setRtc(int i) {
        this.isRtc = i;
    }

    public final void setServerMode(int i) {
        this.serverMode = i;
    }

    public final void setSettings(String str) {
        this.settings = str;
    }

    public final void setSinkPlatform(String str) {
        this.sinkPlatform = str;
    }

    public final void setSourceIp(String str) {
        this.sourceIp = str;
    }

    public final void setSourcePort(int i) {
        this.sourcePort = i;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public LiveGameDualDeviceActivityArgs(String str, int i, String str2, int i2, int i3, int i4, int i5, Float f, Integer num, String str3, String str4, String str5, int i6, int i7, int i8, int i9, String str6, String str7, String str8, String str9, int i10, String str10) {
        this.sourceIp = str;
        this.sourcePort = i;
        this.roomId = str2;
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.version = i4;
        this.pcVersion = i5;
        this.bitRateScale = f;
        this.fps = num;
        this.anchorId = str3;
        this.sinkPlatform = str4;
        this.settings = str5;
        this.audioSource = i6;
        this.micScale = i7;
        this.serverMode = i8;
        this.landscape = i9;
        this.uuid = str6;
        this.enterFrom = str7;
        this.timestamp = str8;
        this.didSink = str9;
        this.isRtc = i10;
        this.connectType = str10;
    }
}
