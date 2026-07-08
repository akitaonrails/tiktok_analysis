package com.ss.android.ugc.aweme.theater.common;

import X.C0LQY;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterProfileEventModel implements Parcelable {
    public static final Parcelable.Creator<AITheaterProfileEventModel> CREATOR = new Parcelable.Creator<AITheaterProfileEventModel>() { // from class: X.0L0C
        @Override // android.os.Parcelable.Creator
        public final AITheaterProfileEventModel createFromParcel(Parcel parcel) {
            C0LQY c0lqyValueOf;
            boolean z;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                c0lqyValueOf = null;
            } else {
                c0lqyValueOf = C0LQY.valueOf(parcel.readString());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AITheaterProfileEventModel(c0lqyValueOf, string, string2, string3, string4, string5, string6, string7, string8, string9, numValueOf, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterProfileEventModel[] newArray(int i) {
            return new AITheaterProfileEventModel[i];
        }
    };
    public final String activeFunction;
    public final C0LQY aiBiz;
    public final String cameoCreationId;
    public final String creationId;
    public final String dmConversationId;
    public final String faceIdCreatedWay;
    public final boolean isFromPortraitAssetHubEntrance;
    public final Integer isInsert;
    public final String prepageName;
    public String recallWay;
    public final String sceneName;
    public final String shootWay;

    /* JADX WARN: Multi-variable type inference failed */
    public AITheaterProfileEventModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 4095);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0LQY c0lqy = this.aiBiz;
        if (c0lqy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c0lqy.name());
        }
        parcel.writeString(this.cameoCreationId);
        parcel.writeString(this.prepageName);
        parcel.writeString(this.faceIdCreatedWay);
        parcel.writeString(this.recallWay);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.sceneName);
        parcel.writeString(this.activeFunction);
        parcel.writeString(this.creationId);
        parcel.writeString(this.dmConversationId);
        Integer num = this.isInsert;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isFromPortraitAssetHubEntrance ? 1 : 0);
    }

    public AITheaterProfileEventModel(C0LQY c0lqy, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, boolean z) {
        this.aiBiz = c0lqy;
        this.cameoCreationId = str;
        this.prepageName = str2;
        this.faceIdCreatedWay = str3;
        this.recallWay = str4;
        this.shootWay = str5;
        this.sceneName = str6;
        this.activeFunction = str7;
        this.creationId = str8;
        this.dmConversationId = str9;
        this.isInsert = num;
        this.isFromPortraitAssetHubEntrance = z;
    }

    public /* synthetic */ AITheaterProfileEventModel(C0LQY c0lqy, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, boolean z, int i) {
        this((i & 1) != 0 ? null : c0lqy, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null, (i & 1024) != 0 ? 0 : num, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? z : false);
    }
}
