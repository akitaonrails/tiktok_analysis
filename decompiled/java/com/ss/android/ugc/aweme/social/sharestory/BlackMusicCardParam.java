package com.ss.android.ugc.aweme.social.sharestory;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.social.sharestory.BlackMusicCardParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class BlackMusicCardParam implements Serializable, Parcelable {

    @C09CT("audio_wave_chroma_max")
    public final float audioChromaMax;

    @C09CT("audio_wave_chroma_min")
    public final float audioChromaMin;

    @C09CT("audio_wave_lightness_max")
    public final float audioLMax;

    @C09CT("audio_wave_lightness_min")
    public final float audioLMin;

    @C09CT("audio_wave_merging_tolerance")
    public final float audioTolerance;

    @C09CT("background_chroma_max")
    public final float bgChromaMax;

    @C09CT("background_chroma_min")
    public final float bgChromaMin;

    @C09CT("background_lightness_addition")
    public final float bgLAddition;

    @C09CT("background_lightness_max")
    public final float bgLMax;

    @C09CT("background_lightness_min")
    public final float bgLMin;

    @C09CT("background_merging_tolerance")
    public final float bgTolerance;

    @C09CT("text_lightness")
    public final float textL;
    public static final Parcelable.Creator<BlackMusicCardParam> CREATOR = new Parcelable.Creator<BlackMusicCardParam>() { // from class: X.15Qn
        @Override // android.os.Parcelable.Creator
        public final BlackMusicCardParam createFromParcel(Parcel parcel) {
            return new BlackMusicCardParam(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BlackMusicCardParam[] newArray(int i) {
            return new BlackMusicCardParam[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bgTolerance);
        parcel.writeFloat(this.bgChromaMin);
        parcel.writeFloat(this.bgChromaMax);
        parcel.writeFloat(this.bgLMin);
        parcel.writeFloat(this.bgLMax);
        parcel.writeFloat(this.bgLAddition);
        parcel.writeFloat(this.textL);
        parcel.writeFloat(this.audioTolerance);
        parcel.writeFloat(this.audioChromaMin);
        parcel.writeFloat(this.audioChromaMax);
        parcel.writeFloat(this.audioLMin);
        parcel.writeFloat(this.audioLMax);
    }

    public BlackMusicCardParam() {
        this(8.0f, 0.0f, 0.12f, 0.3f, 0.6f, 8.0f, 0.85f, 50.0f, 0.0f, 0.1f, 0.8f, 1.0f);
    }

    public final float getAudioChromaMax() {
        return this.audioChromaMax;
    }

    public final float getAudioChromaMin() {
        return this.audioChromaMin;
    }

    public final float getAudioLMax() {
        return this.audioLMax;
    }

    public final float getAudioLMin() {
        return this.audioLMin;
    }

    public final float getAudioTolerance() {
        return this.audioTolerance;
    }

    public final float getBgChromaMax() {
        return this.bgChromaMax;
    }

    public final float getBgChromaMin() {
        return this.bgChromaMin;
    }

    public final float getBgLAddition() {
        return this.bgLAddition;
    }

    public final float getBgLMax() {
        return this.bgLMax;
    }

    public final float getBgLMin() {
        return this.bgLMin;
    }

    public final float getBgTolerance() {
        return this.bgTolerance;
    }

    public final float getTextL() {
        return this.textL;
    }

    public BlackMusicCardParam(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.bgTolerance = f;
        this.bgChromaMin = f2;
        this.bgChromaMax = f3;
        this.bgLMin = f4;
        this.bgLMax = f5;
        this.bgLAddition = f6;
        this.textL = f7;
        this.audioTolerance = f8;
        this.audioChromaMin = f9;
        this.audioChromaMax = f10;
        this.audioLMin = f11;
        this.audioLMax = f12;
    }
}
