package com.ss.android.vesdk;

import X.C08FF;
import X.C1864730ycp;
import X.EnumC1782440wU6;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class VEAudioEncodeSettings implements Parcelable {
    public int mBps;
    public int mChannelCount;
    public ENCODE_STANDARD mCodec;
    public boolean mHwEnc;
    public int mSampleRate;
    public static final VEAudioEncodeSettings DEFAULT = new VEAudioEncodeSettings();
    public static final Parcelable.Creator<VEAudioEncodeSettings> CREATOR = new C1864730ycp(15);

    public static final class Builder {
        public String externalSettingsJsonStr;
        public boolean mHwEnc;
        public ENCODE_STANDARD mCodec = ENCODE_STANDARD.ENCODE_STANDARD_WAV;
        public EnumC1782440wU6 mScene = EnumC1782440wU6.COMPILE;
        public int mSampleRate = 44100;
        public int mBps = 131072;
        public int mChannelCount = 2;

        private void parseExternalSetting() {
            try {
                JSONObject jSONObject = new JSONObject(this.externalSettingsJsonStr);
                parseJsonSettings(this.mScene.equals(EnumC1782440wU6.COMPILE) ? JSONObjectProtectorUtils.getJSONObject(jSONObject, "compile") : this.mScene.equals(EnumC1782440wU6.RECORD) ? JSONObjectProtectorUtils.getJSONObject(jSONObject, "record") : this.mScene.equals(EnumC1782440wU6.COMPILE_WATERMARK) ? JSONObjectProtectorUtils.getJSONObject(jSONObject, "watermark_compile") : null);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public VEAudioEncodeSettings Build() {
            if (this.externalSettingsJsonStr != null) {
                parseExternalSetting();
            }
            return new VEAudioEncodeSettings(this);
        }

        private ENCODE_STANDARD getCodecFromName(String str) {
            ENCODE_STANDARD encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
            if (str != null && !"AAC".equals(str.toUpperCase())) {
                if ("PCM".equals(str.toUpperCase())) {
                    return ENCODE_STANDARD.ENCODE_STANDARD_PCM;
                }
                if (!"WAV".equals(str.toUpperCase())) {
                    return encode_standard;
                }
                return ENCODE_STANDARD.ENCODE_STANDARD_WAV;
            }
            return encode_standard;
        }

        private void parseJsonSettings(JSONObject jSONObject) {
            try {
                this.mCodec = getCodecFromName(JSONObjectProtectorUtils.getString(jSONObject, "mCodec"));
                this.mSampleRate = JSONObjectProtectorUtils.getInt(jSONObject, "mSampleRate");
                this.mBps = JSONObjectProtectorUtils.getInt(jSONObject, "mBps");
                this.mChannelCount = JSONObjectProtectorUtils.getInt(jSONObject, "mChannelCount");
                this.mHwEnc = JSONObjectProtectorUtils.getBoolean(jSONObject, "mHwEnc");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public Builder setBps(int i) {
            this.mBps = i;
            return this;
        }

        public Builder setChannelCount(int i) {
            this.mChannelCount = i;
            return this;
        }

        public Builder setCodec(ENCODE_STANDARD encode_standard) {
            this.mCodec = encode_standard;
            return this;
        }

        public Builder setHwEnc(boolean z) {
            this.mHwEnc = z;
            return this;
        }

        public Builder setSampleRate(int i) {
            this.mSampleRate = i;
            return this;
        }

        public Builder setExternalSettings(String str, EnumC1782440wU6 enumC1782440wU6) {
            this.externalSettingsJsonStr = str;
            this.mScene = enumC1782440wU6;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "{\"mCodec\":" + this.mCodec + ",\"mSampleRate\":" + this.mSampleRate + ",\"mBps\":" + this.mBps + ",\"mChannelCount\":" + this.mChannelCount + ",\"mHwEnc\":" + this.mHwEnc + '}';
    }

    public VEAudioEncodeSettings() {
        this.mSampleRate = 44100;
        this.mBps = 128000;
        this.mChannelCount = 2;
    }

    public int getBps() {
        return this.mBps;
    }

    public int getChannelCount() {
        return this.mChannelCount;
    }

    public ENCODE_STANDARD getCodec() {
        return this.mCodec;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public boolean isHwEnc() {
        return this.mHwEnc;
    }

    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;

        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new C1864730ycp(14);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_STANDARD valueOf(String str) {
            return (ENCODE_STANDARD) C08FF.LIZ(ENCODE_STANDARD.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public VEAudioEncodeSettings(Parcel parcel) {
        boolean z;
        this.mSampleRate = 44100;
        this.mBps = 131072;
        this.mChannelCount = 2;
        this.mCodec = (ENCODE_STANDARD) parcel.readParcelable(ENCODE_STANDARD.class.getClassLoader());
        this.mSampleRate = parcel.readInt();
        this.mBps = parcel.readInt();
        this.mChannelCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mHwEnc = z;
    }

    public void setBps(int i) {
        this.mBps = i;
    }

    public void setChannelCount(int i) {
        this.mChannelCount = i;
    }

    public void setCodec(ENCODE_STANDARD encode_standard) {
        this.mCodec = encode_standard;
    }

    public void setHwEnc(boolean z) {
        this.mHwEnc = z;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }

    public VEAudioEncodeSettings(Builder builder) {
        this.mSampleRate = 44100;
        this.mBps = 131072;
        this.mChannelCount = 2;
        this.mCodec = builder.mCodec;
        this.mSampleRate = builder.mSampleRate;
        this.mBps = builder.mBps;
        this.mChannelCount = builder.mChannelCount;
        this.mHwEnc = builder.mHwEnc;
    }

    public /* synthetic */ VEAudioEncodeSettings(Builder builder, C1864730ycp c1864730ycp) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mCodec, i);
        parcel.writeInt(this.mSampleRate);
        parcel.writeInt(this.mBps);
        parcel.writeInt(this.mChannelCount);
        parcel.writeByte(this.mHwEnc ? (byte) 1 : (byte) 0);
    }
}
