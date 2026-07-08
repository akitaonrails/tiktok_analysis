package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C0MY0;
import X.C0MZI;
import X.C13LP;
import X.C15438062q;
import X.C2286708xd;
import X.C580950MqT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class EditPreviewInfo implements Parcelable, Serializable {
    public int calculateHeight;
    public int calculateSourceHeight;
    public int calculateSourceWidth;
    public int calculateWidth;
    public String draftDir;
    public final String initDraftDir;
    public int previewHeight;
    public int previewVideoLength;
    public int previewWidth;

    @C0MY0
    public String[] reverseAudioArray;

    @C0MY0(blockCreative = true)
    public String[] reverseVideoArray;
    public long sceneIn;
    public long sceneOut;

    @C0MY0
    public String[] tempVideoArray;
    public final List<EditVideoSegment> videoList;
    public static final C0MZI Companion = new Object() { // from class: X.0MZI
    };
    public static final Parcelable.Creator<EditPreviewInfo> CREATOR = new C580950MqT(3);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int[] getTotalVideoHeight() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EditVideoSegment> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getVideoFileInfo().getHeight()));
        }
        return C13LP.LLII(arrayList);
    }

    public final long getTotalVideoSize() {
        Iterator<EditVideoSegment> it2 = this.videoList.iterator();
        long jLJIIL = 0;
        while (it2.hasNext()) {
            jLJIIL += C2286708xd.LJIIL(it2.next().getVideoPath());
        }
        return jLJIIL;
    }

    public final int[] getTotalVideoWidth() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EditVideoSegment> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getVideoFileInfo().getWidth()));
        }
        return C13LP.LLII(arrayList);
    }

    public final String reverseVideo() {
        String[] strArr = this.reverseVideoArray;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    public final int getCalculateHeight() {
        return this.calculateHeight;
    }

    public final int getCalculateSourceHeight() {
        return this.calculateSourceHeight;
    }

    public final int getCalculateSourceWidth() {
        return this.calculateSourceWidth;
    }

    public final int getCalculateWidth() {
        return this.calculateWidth;
    }

    public final String getDraftDir() {
        return this.draftDir;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewVideoLength() {
        return this.previewVideoLength;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final String[] getReverseAudioArray() {
        return this.reverseAudioArray;
    }

    public final String[] getReverseVideoArray() {
        return this.reverseVideoArray;
    }

    public final long getSceneIn() {
        return this.sceneIn;
    }

    public final long getSceneOut() {
        return this.sceneOut;
    }

    public final String[] getTempVideoArray() {
        return this.tempVideoArray;
    }

    public final List<EditVideoSegment> getVideoList() {
        return this.videoList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditPreviewInfo(Parcel parcel) {
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(EditVideoSegment.CREATOR);
        this(arrayListCreateTypedArrayList == null ? new ArrayList() : arrayListCreateTypedArrayList, parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), "");
        String string = parcel.readString();
        this.draftDir = string == null ? "" : string;
        this.calculateWidth = parcel.readInt();
        this.calculateHeight = parcel.readInt();
        this.previewVideoLength = parcel.readInt();
        this.reverseVideoArray = parcel.createStringArray();
        this.reverseAudioArray = parcel.createStringArray();
        this.tempVideoArray = parcel.createStringArray();
    }

    public final EditPreviewInfo cloneWithNewVideos(List<EditVideoSegment> list) {
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(list, this.previewWidth, this.previewHeight, this.sceneIn, this.sceneOut, this.draftDir);
        editPreviewInfo.calculateWidth = this.calculateWidth;
        editPreviewInfo.calculateHeight = this.calculateHeight;
        editPreviewInfo.previewVideoLength = this.previewVideoLength;
        editPreviewInfo.reverseVideoArray = this.reverseVideoArray;
        editPreviewInfo.reverseAudioArray = this.reverseAudioArray;
        editPreviewInfo.tempVideoArray = this.tempVideoArray;
        return editPreviewInfo;
    }

    public final void setCalculateHeight(int i) {
        this.calculateHeight = i;
    }

    public final void setCalculateSourceHeight(int i) {
        this.calculateSourceHeight = i;
    }

    public final void setCalculateSourceWidth(int i) {
        this.calculateSourceWidth = i;
    }

    public final void setCalculateWidth(int i) {
        this.calculateWidth = i;
    }

    public final void setDraftDir(String str) {
        this.draftDir = str;
    }

    public final void setPreviewHeight(int i) {
        this.previewHeight = i;
    }

    public final void setPreviewVideoLength(int i) {
        this.previewVideoLength = i;
    }

    public final void setPreviewWidth(int i) {
        this.previewWidth = i;
    }

    public final void setReverseAudioArray(String[] strArr) {
        this.reverseAudioArray = strArr;
    }

    public final void setReverseVideoArray(String[] strArr) {
        this.reverseVideoArray = strArr;
    }

    public final void setSceneIn(long j) {
        this.sceneIn = j;
    }

    public final void setSceneOut(long j) {
        this.sceneOut = j;
    }

    public final void setTempVideoArray(String[] strArr) {
        this.tempVideoArray = strArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.videoList);
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeLong(this.sceneIn);
        parcel.writeLong(this.sceneOut);
        parcel.writeString(this.draftDir);
        parcel.writeInt(this.calculateWidth);
        parcel.writeInt(this.calculateHeight);
        parcel.writeInt(this.previewVideoLength);
        parcel.writeStringArray(this.reverseVideoArray);
        parcel.writeStringArray(this.reverseAudioArray);
        parcel.writeStringArray(this.tempVideoArray);
    }

    public final void updateReverseVideoContent(String[] strArr, String[] strArr2, String[] strArr3) {
        this.reverseVideoArray = strArr;
        this.reverseAudioArray = strArr2;
        this.tempVideoArray = strArr3;
    }

    public EditPreviewInfo(List<EditVideoSegment> list, int i, int i2, long j, long j2, String str) {
        this.videoList = list;
        this.previewWidth = i;
        this.previewHeight = i2;
        this.sceneIn = j;
        this.sceneOut = j2;
        this.initDraftDir = str;
        this.draftDir = str;
    }

    public /* synthetic */ EditPreviewInfo(List list, int i, int i2, long j, long j2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? -1L : j, (i3 & 16) != 0 ? -1L : j2, str);
    }
}
