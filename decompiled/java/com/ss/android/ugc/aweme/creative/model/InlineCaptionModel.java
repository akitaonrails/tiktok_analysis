package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class InlineCaptionModel implements Parcelable {
    public static final Parcelable.Creator<InlineCaptionModel> CREATOR = new Parcelable.Creator<InlineCaptionModel>() { // from class: X.0EZ8
        @Override // android.os.Parcelable.Creator
        public final InlineCaptionModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(InlineCaptionModel.class.getClassLoader()));
                }
            }
            return new InlineCaptionModel(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final InlineCaptionModel[] newArray(int i) {
            return new InlineCaptionModel[i];
        }
    };

    @C09CT("asr_service")
    public String asrService;

    @C09CT("audio_uri")
    public String audioUri;

    @C09CT("recognized_language")
    public String recognizedLanguage;

    @C09CT("r")
    public float rotation;

    @C09CT("s")
    public float scale;

    @C09CT("select_language")
    public String selectLanguage;

    @C09CT("select_language_code")
    public String selectLanguageCode;

    @C09CT("task_id")
    public String taskId;

    @C09CT("utterance_list")
    public ArrayList<StickerItemModel> utterances;

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    public InlineCaptionModel() {
        this(null, null, null, null, null, null, "", 0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioUri);
        ArrayList<StickerItemModel> arrayList = this.utterances;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<StickerItemModel> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeString(this.selectLanguageCode);
        parcel.writeString(this.selectLanguage);
        parcel.writeString(this.recognizedLanguage);
        parcel.writeString(this.asrService);
        parcel.writeString(this.taskId);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
    }

    public InlineCaptionModel(String str, ArrayList<StickerItemModel> arrayList, String str2, String str3, String str4, String str5, String str6, float f, float f2, float f3, float f4) {
        this.audioUri = str;
        this.utterances = arrayList;
        this.selectLanguageCode = str2;
        this.selectLanguage = str3;
        this.recognizedLanguage = str4;
        this.asrService = str5;
        this.taskId = str6;
        this.x = f;
        this.y = f2;
        this.rotation = f3;
        this.scale = f4;
    }
}
