package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C1466660oGm;
import X.C2188811AlT;
import X.C2401009ay;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class InfoStickerModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<InfoStickerModel> CREATOR = new C1466660oGm(7);

    @C09CT("sticker_dir")
    public String infoStickerDraftDir;

    @C09CT("text_align")
    public int mAlign;

    @C09CT("bg_mode")
    public int mBgMode;

    @C09CT("bg_color")
    public int mColor;

    @C09CT("text_font_id")
    public String mFontId;

    @C09CT("text_font_path")
    public String mFontPath;

    @C09CT("text_font")
    public String mFontType;

    @C09CT("text_audio_length")
    public int mTextAudioLength;

    @C09CT("stickers")
    public List<StickerItemModel> stickers;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getNotEmptyInfoStickerIds() {
        return getNotEmptyInfoStickerIds(null);
    }

    public void clearInfoSticker() {
        Iterator<StickerItemModel> it2 = this.stickers.iterator();
        while (it2.hasNext()) {
            StickerItemModel next = it2.next();
            if (next.isImageSticker() || next.isLyric() || next.isNormalInfoSticker()) {
                it2.remove();
            }
        }
    }

    public void clearSticker() {
        this.stickers.clear();
    }

    public void clearTextStickers() {
        Iterator<StickerItemModel> it2 = this.stickers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isNormalTextSticker()) {
                it2.remove();
            }
        }
    }

    public String getInfoStickerIds() {
        return C2401009ay.LIZ(this.stickers) ? "" : getNotEmptyInfoStickerIds();
    }

    public StickerItemModel getLyricStickerModel() {
        if (C2401009ay.LIZ(this.stickers)) {
            return null;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isLyric()) {
                return stickerItemModel;
            }
        }
        return null;
    }

    public String getOtherEffect() {
        if (C2401009ay.LIZ(this.stickers)) {
            return "[]";
        }
        JSONArray jSONArray = new JSONArray();
        for (StickerItemModel stickerItemModel : this.stickers) {
            try {
                if (stickerItemModel != null && stickerItemModel.type == 10) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, stickerItemModel.stickerId);
                    jSONObject.put("type", "giphy");
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONArray.toString();
    }

    public int getSubtitleRule() {
        if (C2401009ay.LIZ(this.stickers)) {
            return -1;
        }
        for (int i = 0; i < this.stickers.size(); i++) {
            StickerItemModel stickerItemModel = (StickerItemModel) ListProtector.get(this.stickers, i);
            if (stickerItemModel != null && stickerItemModel.isSubtitleRule()) {
                return i;
            }
        }
        return -1;
    }

    public boolean hasAnimTimestampSticker() {
        if (C2401009ay.LIZ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isAnimTimestampSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasImageSticker() {
        if (C2401009ay.LIZ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isImageSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLocalHashTagSticker() {
        if (C2401009ay.LIZ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isLocalHashTagSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLyricSticker() {
        if (C2401009ay.LIZ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isLyric()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSubtitle() {
        if (C2401009ay.LIZ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isSubtitle()) {
                return true;
            }
        }
        return false;
    }

    public InfoStickerModel() {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InfoStickerModel m186clone() {
        try {
            InfoStickerModel infoStickerModel = (InfoStickerModel) super.clone();
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (stickerItemModel != null) {
                    arrayList.add(stickerItemModel.clone());
                }
            }
            infoStickerModel.stickers = arrayList;
            return infoStickerModel;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoStickerModel@");
        sbLIZ.append(Integer.toHexString(hashCode()));
        sbLIZ.append("{infoStickerDraftDir='");
        sbLIZ.append(this.infoStickerDraftDir);
        sbLIZ.append('\'');
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InfoStickerModel(Parcel parcel) {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
        this.infoStickerDraftDir = parcel.readString();
        this.stickers = parcel.createTypedArrayList(StickerItemModel.CREATOR);
        this.mFontType = parcel.readString();
        this.mFontId = parcel.readString();
        this.mFontPath = parcel.readString();
        this.mColor = parcel.readInt();
        this.mBgMode = parcel.readInt();
        this.mAlign = parcel.readInt();
        this.mTextAudioLength = parcel.readInt();
    }

    public void addSticker(StickerItemModel stickerItemModel) {
        this.stickers.add(stickerItemModel);
    }

    public String getNotEmptyInfoStickerIds(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (bool != null) {
                if (bool.equals(Boolean.valueOf(stickerItemModel.isFromEditorPro))) {
                    if (TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(',');
                        }
                        sb.append(stickerItemModel.stickerId);
                    }
                }
            } else if (stickerItemModel != null) {
                if (TextUtils.isEmpty(stickerItemModel.stickerId)) {
                }
            }
        }
        return sb.toString();
    }

    public void removeSticker(StickerItemModel stickerItemModel) {
        this.stickers.remove(stickerItemModel);
    }

    public InfoStickerModel(InfoStickerModel infoStickerModel) {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
        this.infoStickerDraftDir = infoStickerModel.infoStickerDraftDir;
        this.stickers = new ArrayList(infoStickerModel.stickers);
        this.mFontType = infoStickerModel.mFontType;
        this.mFontId = infoStickerModel.mFontId;
        this.mFontPath = infoStickerModel.mFontPath;
        this.mColor = infoStickerModel.mColor;
        this.mBgMode = infoStickerModel.mBgMode;
        this.mAlign = infoStickerModel.mAlign;
        this.mTextAudioLength = infoStickerModel.mTextAudioLength;
    }

    public InfoStickerModel(String str) {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            this.infoStickerDraftDir = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            this.infoStickerDraftDir = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.stickers = new ArrayList();
    }

    public void addSticker(int i, StickerItemModel stickerItemModel) {
        ListProtector.add(this.stickers, i, stickerItemModel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.infoStickerDraftDir);
        parcel.writeTypedList(this.stickers);
        parcel.writeString(this.mFontType);
        parcel.writeString(this.mFontId);
        parcel.writeString(this.mFontPath);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mAlign);
        parcel.writeInt(this.mTextAudioLength);
    }
}
