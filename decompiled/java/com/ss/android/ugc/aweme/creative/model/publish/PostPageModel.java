package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.DescAutoFillTrackModel;
import com.ss.android.ugc.aweme.creative.model.publish.DraftPanelModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class PostPageModel implements Parcelable {
    public static final Parcelable.Creator<PostPageModel> CREATOR = new Parcelable.Creator<PostPageModel>() { // from class: X.0mt3
        @Override // android.os.Parcelable.Creator
        public final PostPageModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AVTextExtraStruct.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(AVTextExtraStruct.CREATOR.createFromParcel(parcel));
            }
            CaptionModel captionModelCreateFromParcel = CaptionModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string3 = parcel.readString();
            int i7 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string5 = parcel.readString();
            int i8 = parcel.readInt();
            float f = parcel.readFloat();
            long j2 = parcel.readLong();
            String string6 = parcel.readString();
            Rect rect = (Rect) parcel.readParcelable(PostPageModel.class.getClassLoader());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new PostPageModel(string, arrayList, arrayList2, captionModelCreateFromParcel, z, i5, i6, j, string2, z2, string3, i7, string4, z3, string5, i8, f, j2, string6, rect, string7, string8, string9, z4, z5, z6, DraftPanelModel.CREATOR.createFromParcel(parcel), parcel.readString(), DescAutoFillTrackModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PostPageModel[] newArray(int i) {
            return new PostPageModel[i];
        }
    };

    @C09CT("caption")
    public CaptionModel captionModel;

    @C040H
    public int ccNotAllowDirectPost;

    @C040H
    public long clickCover;

    @C040H
    public String coverEnterFrom;

    @C09CT("custom_cover_original_path")
    @C0MY0
    public String customCoverOriginalPath;

    @C09CT("custom_cover_path")
    @C0MY0
    public String customCoverPath;

    @C09CT("custom_cover_with_sticker_path")
    @C0MY0
    public String customCoverWithStickerPath;

    @C09CT("desc_auto_fill_track")
    public DescAutoFillTrackModel descAutoFillTrack;

    @C040H
    public Rect disPlayRect;

    @C040H
    public DraftPanelModel draftPanelModel;

    @C040H
    public boolean fromPublishPageEditBtn;

    @C040H
    public boolean isCoverBitmapSet;

    @C09CT("is_direct_publish_by_cc")
    public boolean isDirectPublishByCC;

    @C040H
    public boolean isEnterFromEPDirectly;

    @C09CT("is_from_cc")
    public int isFromCC;

    @C040H
    public boolean isHashtagLimitToastShown;

    @C040H
    public boolean isUpload;

    @C040H
    public String markupCaption;

    @C040H
    public List<AVTextExtraStruct> markupExtra;

    @C040H
    public int mentionEditTextLength;

    @C040H
    public int musicRecType;

    @C040H
    public String previewEnterFrom;

    @C040H
    public String previewEnterFromTab;

    @C040H
    public String textModeDescCandidate;

    @C040H
    public List<AVTextExtraStruct> transientExtra;

    @C040H
    public String uploadItemType;

    @C09CT("click_post_or_save_draft_timestamp")
    public long userClickPostOrSaveDraftTimestamp;

    @C040H
    @C0MY0
    public String videoCoverPath;

    @C040H
    public float videoCoverStartTm;

    public PostPageModel() {
        this(null, null, null, null, false, 0, 0, 0L, null, false, null, 0, null, false, null, 0, 0.0f, 0L, null, null, null, null, null, false, false, false, null, null, null, 536870911, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.markupCaption);
        List<AVTextExtraStruct> list = this.markupExtra;
        parcel.writeInt(list.size());
        Iterator<AVTextExtraStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<AVTextExtraStruct> list2 = this.transientExtra;
        parcel.writeInt(list2.size());
        Iterator<AVTextExtraStruct> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        this.captionModel.writeToParcel(parcel, i);
        parcel.writeInt(this.isDirectPublishByCC ? 1 : 0);
        parcel.writeInt(this.isFromCC);
        parcel.writeInt(this.ccNotAllowDirectPost);
        parcel.writeLong(this.clickCover);
        parcel.writeString(this.coverEnterFrom);
        parcel.writeInt(this.isUpload ? 1 : 0);
        parcel.writeString(this.uploadItemType);
        parcel.writeInt(this.musicRecType);
        parcel.writeString(this.previewEnterFrom);
        parcel.writeInt(this.isEnterFromEPDirectly ? 1 : 0);
        parcel.writeString(this.previewEnterFromTab);
        parcel.writeInt(this.mentionEditTextLength);
        parcel.writeFloat(this.videoCoverStartTm);
        parcel.writeLong(this.userClickPostOrSaveDraftTimestamp);
        parcel.writeString(this.videoCoverPath);
        parcel.writeParcelable(this.disPlayRect, i);
        parcel.writeString(this.customCoverPath);
        parcel.writeString(this.customCoverOriginalPath);
        parcel.writeString(this.customCoverWithStickerPath);
        parcel.writeInt(this.fromPublishPageEditBtn ? 1 : 0);
        parcel.writeInt(this.isCoverBitmapSet ? 1 : 0);
        parcel.writeInt(this.isHashtagLimitToastShown ? 1 : 0);
        this.draftPanelModel.writeToParcel(parcel, i);
        parcel.writeString(this.textModeDescCandidate);
        this.descAutoFillTrack.writeToParcel(parcel, i);
    }

    public PostPageModel(String str, List<AVTextExtraStruct> list, List<AVTextExtraStruct> list2, CaptionModel captionModel, boolean z, int i, int i2, long j, String str2, boolean z2, String str3, int i3, String str4, boolean z3, String str5, int i4, float f, long j2, String str6, Rect rect, String str7, String str8, String str9, boolean z4, boolean z5, boolean z6, DraftPanelModel draftPanelModel, String str10, DescAutoFillTrackModel descAutoFillTrackModel) {
        this.markupCaption = str;
        this.markupExtra = list;
        this.transientExtra = list2;
        this.captionModel = captionModel;
        this.isDirectPublishByCC = z;
        this.isFromCC = i;
        this.ccNotAllowDirectPost = i2;
        this.clickCover = j;
        this.coverEnterFrom = str2;
        this.isUpload = z2;
        this.uploadItemType = str3;
        this.musicRecType = i3;
        this.previewEnterFrom = str4;
        this.isEnterFromEPDirectly = z3;
        this.previewEnterFromTab = str5;
        this.mentionEditTextLength = i4;
        this.videoCoverStartTm = f;
        this.userClickPostOrSaveDraftTimestamp = j2;
        this.videoCoverPath = str6;
        this.disPlayRect = rect;
        this.customCoverPath = str7;
        this.customCoverOriginalPath = str8;
        this.customCoverWithStickerPath = str9;
        this.fromPublishPageEditBtn = z4;
        this.isCoverBitmapSet = z5;
        this.isHashtagLimitToastShown = z6;
        this.draftPanelModel = draftPanelModel;
        this.textModeDescCandidate = str10;
        this.descAutoFillTrack = descAutoFillTrackModel;
    }

    public PostPageModel(String str, List list, List list2, CaptionModel captionModel, boolean z, int i, int i2, long j, String str2, boolean z2, String str3, int i3, String str4, boolean z3, String str5, int i4, float f, long j2, String str6, Rect rect, String str7, String str8, String str9, boolean z4, boolean z5, boolean z6, DraftPanelModel draftPanelModel, String str10, DescAutoFillTrackModel descAutoFillTrackModel, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? C13BV.INSTANCE : list, (i5 & 4) != 0 ? C13BV.INSTANCE : list2, (i5 & 8) != 0 ? new CaptionModel(null, null, null, false, 15, null) : captionModel, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0L : j, (i5 & 256) != 0 ? "" : str2, (i5 & 512) != 0 ? false : z2, (i5 & 1024) != 0 ? "" : str3, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i3, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str4, (i5 & 8192) != 0 ? false : z3, (i5 & 16384) != 0 ? null : str5, (32768 & i5) == 0 ? i4 : -1, (65536 & i5) != 0 ? 0.0f : f, (131072 & i5) != 0 ? 0L : j2, (262144 & i5) != 0 ? null : str6, (524288 & i5) != 0 ? null : rect, (1048576 & i5) != 0 ? null : str7, (2097152 & i5) != 0 ? null : str8, (4194304 & i5) == 0 ? str9 : "", (8388608 & i5) != 0 ? false : z4, (16777216 & i5) != 0 ? false : z5, (33554432 & i5) != 0 ? false : z6, (67108864 & i5) != 0 ? new DraftPanelModel(0) : draftPanelModel, (134217728 & i5) != 0 ? null : str10, (i5 & 268435456) != 0 ? new DescAutoFillTrackModel(null, null, false, false, false, false, false) : descAutoFillTrackModel);
    }
}
