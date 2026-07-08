package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class AudioCopyrightDetectModel implements Parcelable {
    public static final Parcelable.Creator<AudioCopyrightDetectModel> CREATOR = new Parcelable.Creator<AudioCopyrightDetectModel>() { // from class: X.0Xjl
        @Override // android.os.Parcelable.Creator
        public final AudioCopyrightDetectModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            HashMap map;
            PreCheckResultModel preCheckResultModelCreateFromParcel;
            HashMap map2;
            PreCheckResultModel preCheckResultModelCreateFromParcel2;
            int i;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i2 = parcel.readInt();
                map = new HashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    Integer numValueOf = Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        preCheckResultModelCreateFromParcel = null;
                    } else {
                        preCheckResultModelCreateFromParcel = PreCheckResultModel.CREATOR.createFromParcel(parcel);
                    }
                    map.put(numValueOf, preCheckResultModelCreateFromParcel);
                }
            }
            if (parcel.readInt() == 0) {
                map2 = null;
            } else {
                int i4 = parcel.readInt();
                map2 = new HashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    Integer numValueOf2 = Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        preCheckResultModelCreateFromParcel2 = null;
                    } else {
                        preCheckResultModelCreateFromParcel2 = PreCheckResultModel.CREATOR.createFromParcel(parcel);
                    }
                    map2.put(numValueOf2, preCheckResultModelCreateFromParcel2);
                }
            }
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            int i7 = 0;
            while (true) {
                i = parcel.readInt();
                if (i7 == i6) {
                    break;
                }
                arrayList.add(Integer.valueOf(i));
                i7++;
            }
            int i8 = parcel.readInt();
            HashMap map3 = new HashMap(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                map3.put(parcel.readString(), parcel.readString());
            }
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
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new AudioCopyrightDetectModel(z, z2, string, z3, map, map2, arrayList, i, map3, z4, z5, j, z6, z7, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioCopyrightDetectModel[] newArray(int i) {
            return new AudioCopyrightDetectModel[i];
        }
    };

    @C040H
    public String changeMusicFrom;

    @C040H
    public boolean changeMusicImmediately;

    @C040H
    public boolean continueSelected;

    @C040H
    public boolean copyrightClaimShowing;

    @C040H
    public long detectDuration;

    @C040H
    public HashMap<Integer, PreCheckResultModel> detectResults;

    @C040H
    public ArrayList<Integer> detectScenes;

    @C040H
    public long detectStart;

    @C040H
    public boolean editorProImmediately;

    @C040H
    public boolean goMusicPage;

    @C040H
    public boolean hasClipTrimmedInEditor;

    @C09CT("has_shopAnchor")
    public boolean hasShopAnchor;

    @C040H
    public HashMap<Integer, PreCheckResultModel> lastDetectResults;

    @C040H
    public int operation;

    @C040H
    public HashMap<String, String> pathMap;

    public AudioCopyrightDetectModel() {
        this(false, false, "", false, null, null, new ArrayList(), -1, new HashMap(), false, false, 0L, false, false, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.changeMusicImmediately ? 1 : 0);
        parcel.writeInt(this.editorProImmediately ? 1 : 0);
        parcel.writeString(this.changeMusicFrom);
        parcel.writeInt(this.hasShopAnchor ? 1 : 0);
        HashMap<Integer, PreCheckResultModel> map = this.detectResults;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<Integer, PreCheckResultModel> entry : map.entrySet()) {
                parcel.writeInt(entry.getKey().intValue());
                PreCheckResultModel value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
        HashMap<Integer, PreCheckResultModel> map2 = this.lastDetectResults;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<Integer, PreCheckResultModel> entry2 : map2.entrySet()) {
                parcel.writeInt(entry2.getKey().intValue());
                PreCheckResultModel value2 = entry2.getValue();
                if (value2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value2.writeToParcel(parcel, i);
                }
            }
        }
        ArrayList<Integer> arrayList = this.detectScenes;
        parcel.writeInt(arrayList.size());
        Iterator<Integer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeInt(this.operation);
        HashMap<String, String> map3 = this.pathMap;
        parcel.writeInt(map3.size());
        for (Map.Entry<String, String> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeString(entry3.getValue());
        }
        parcel.writeInt(this.continueSelected ? 1 : 0);
        parcel.writeInt(this.copyrightClaimShowing ? 1 : 0);
        parcel.writeLong(this.detectStart);
        parcel.writeInt(this.hasClipTrimmedInEditor ? 1 : 0);
        parcel.writeInt(this.goMusicPage ? 1 : 0);
        parcel.writeLong(this.detectDuration);
    }

    public final String getChangeMusicFrom() {
        return this.changeMusicFrom;
    }

    public final boolean getChangeMusicImmediately() {
        return this.changeMusicImmediately;
    }

    public final boolean getContinueSelected() {
        return this.continueSelected;
    }

    public final boolean getCopyrightClaimShowing() {
        return this.copyrightClaimShowing;
    }

    public final long getDetectDuration() {
        return this.detectDuration;
    }

    public final HashMap<Integer, PreCheckResultModel> getDetectResults() {
        return this.detectResults;
    }

    public final ArrayList<Integer> getDetectScenes() {
        return this.detectScenes;
    }

    public final long getDetectStart() {
        return this.detectStart;
    }

    public final boolean getEditorProImmediately() {
        return this.editorProImmediately;
    }

    public final boolean getGoMusicPage() {
        return this.goMusicPage;
    }

    public final boolean getHasClipTrimmedInEditor() {
        return this.hasClipTrimmedInEditor;
    }

    public final boolean getHasShopAnchor() {
        return this.hasShopAnchor;
    }

    public final HashMap<Integer, PreCheckResultModel> getLastDetectResults() {
        return this.lastDetectResults;
    }

    public final int getOperation() {
        return this.operation;
    }

    public final HashMap<String, String> getPathMap() {
        return this.pathMap;
    }

    public final void setChangeMusicFrom(String str) {
        this.changeMusicFrom = str;
    }

    public final void setChangeMusicImmediately(boolean z) {
        this.changeMusicImmediately = z;
    }

    public final void setContinueSelected(boolean z) {
        this.continueSelected = z;
    }

    public final void setCopyrightClaimShowing(boolean z) {
        this.copyrightClaimShowing = z;
    }

    public final void setDetectDuration(long j) {
        this.detectDuration = j;
    }

    public final void setDetectResults(HashMap<Integer, PreCheckResultModel> map) {
        this.detectResults = map;
    }

    public final void setDetectScenes(ArrayList<Integer> arrayList) {
        this.detectScenes = arrayList;
    }

    public final void setDetectStart(long j) {
        this.detectStart = j;
    }

    public final void setEditorProImmediately(boolean z) {
        this.editorProImmediately = z;
    }

    public final void setGoMusicPage(boolean z) {
        this.goMusicPage = z;
    }

    public final void setHasClipTrimmedInEditor(boolean z) {
        this.hasClipTrimmedInEditor = z;
    }

    public final void setHasShopAnchor(boolean z) {
        this.hasShopAnchor = z;
    }

    public final void setLastDetectResults(HashMap<Integer, PreCheckResultModel> map) {
        this.lastDetectResults = map;
    }

    public final void setOperation(int i) {
        this.operation = i;
    }

    public final void setPathMap(HashMap<String, String> map) {
        this.pathMap = map;
    }

    public AudioCopyrightDetectModel(boolean z, boolean z2, String str, boolean z3, HashMap<Integer, PreCheckResultModel> map, HashMap<Integer, PreCheckResultModel> map2, ArrayList<Integer> arrayList, int i, HashMap<String, String> map3, boolean z4, boolean z5, long j, boolean z6, boolean z7, long j2) {
        this.changeMusicImmediately = z;
        this.editorProImmediately = z2;
        this.changeMusicFrom = str;
        this.hasShopAnchor = z3;
        this.detectResults = map;
        this.lastDetectResults = map2;
        this.detectScenes = arrayList;
        this.operation = i;
        this.pathMap = map3;
        this.continueSelected = z4;
        this.copyrightClaimShowing = z5;
        this.detectStart = j;
        this.hasClipTrimmedInEditor = z6;
        this.goMusicPage = z7;
        this.detectDuration = j2;
    }
}
