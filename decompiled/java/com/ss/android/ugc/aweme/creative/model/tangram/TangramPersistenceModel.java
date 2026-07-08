package com.ss.android.ugc.aweme.creative.model.tangram;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel;
import com.ss.ugc.aweme.creation.base.ChallengeModel;
import com.ss.ugc.aweme.creation.base.MentionModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class TangramPersistenceModel implements Parcelable {
    public static final Parcelable.Creator<TangramPersistenceModel> CREATOR = new Parcelable.Creator<TangramPersistenceModel>() { // from class: X.0MTq
        @Override // android.os.Parcelable.Creator
        public final TangramPersistenceModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z;
            MentionModel mentionModel = (MentionModel) parcel.readParcelable(TangramPersistenceModel.class.getClassLoader());
            ChallengeModel challengeModel = (ChallengeModel) parcel.readParcelable(TangramPersistenceModel.class.getClassLoader());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            TrackModel trackModel = (TrackModel) parcel.readParcelable(TangramPersistenceModel.class.getClassLoader());
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TangramPersistenceModel(mentionModel, challengeModel, arrayListCreateStringArrayList, string, trackModel, linkedHashMap, linkedHashMap2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final TangramPersistenceModel[] newArray(int i) {
            return new TangramPersistenceModel[i];
        }
    };

    @C09CT("challenge_model")
    public ChallengeModel challengeModel;

    @C09CT("challenges")
    public List<String> challenges;

    @C09CT("extra_create_aweme_form_map")
    public Map<String, String> extraCreateAwemeFormMap;

    @C09CT("extra_map")
    public Map<String, String> extraMap;

    @C09CT("mention_model")
    public MentionModel mentionModel;

    @C09CT("publish_title")
    public String publishTitle;

    @C09CT("track_model")
    public TrackModel trackModel;

    @C09CT("use_canvas_style")
    public boolean useCanvasStyle;

    public TangramPersistenceModel() {
        this(null, null, null, null, null, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mentionModel, i);
        parcel.writeParcelable(this.challengeModel, i);
        parcel.writeStringList(this.challenges);
        parcel.writeString(this.publishTitle);
        parcel.writeParcelable(this.trackModel, i);
        Map<String, String> map = this.extraMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, String> map2 = this.extraCreateAwemeFormMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeInt(this.useCanvasStyle ? 1 : 0);
    }

    public TangramPersistenceModel(MentionModel mentionModel, ChallengeModel challengeModel, List<String> list, String str, TrackModel trackModel, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.mentionModel = mentionModel;
        this.challengeModel = challengeModel;
        this.challenges = list;
        this.publishTitle = str;
        this.trackModel = trackModel;
        this.extraMap = map;
        this.extraCreateAwemeFormMap = map2;
        this.useCanvasStyle = z;
    }
}
