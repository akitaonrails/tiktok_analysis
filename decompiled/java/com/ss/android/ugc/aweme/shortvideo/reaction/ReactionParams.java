package com.ss.android.ugc.aweme.shortvideo.reaction;

import X.C09CT;
import X.C580950MqT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ReactionParams implements Serializable, Parcelable {
    public static final Parcelable.Creator<ReactionParams> CREATOR = new C580950MqT(5);

    @C09CT("non_reacted_video")
    public boolean nonReacted;

    @C09CT("reaction_from_id")
    public String reactionFromId;

    @C09CT("reaction_origin_id")
    public String reactionOriginId;

    @C09CT("reaction_view_id")
    public String reactionViewId;

    @C09CT("video_height")
    public int videoHeight;

    @C09CT("video_path")
    public String videoPath;

    @C09CT("video_width")
    public int videoWidth;

    @C09CT("wav_path")
    public String wavPath;

    @C09CT("react_shape_list")
    public List<CopiedReactionWindowInfo> windowInfoList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean removeReactionWindowInfo() {
        if (this.windowInfoList.size() <= 0) {
            return false;
        }
        List<CopiedReactionWindowInfo> list = this.windowInfoList;
        ListProtector.remove(list, list.size() - 1);
        return true;
    }

    public ReactionParams() {
        this.windowInfoList = new ArrayList();
    }

    public ReactionParams(Parcel parcel) {
        boolean z;
        this.windowInfoList = new ArrayList();
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.windowInfoList = parcel.createTypedArrayList(CopiedReactionWindowInfo.CREATOR);
    }

    public void addReactionWindowInfo(CopiedReactionWindowInfo copiedReactionWindowInfo) {
        this.windowInfoList.add(copiedReactionWindowInfo);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeByte(this.nonReacted ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.windowInfoList);
    }
}
