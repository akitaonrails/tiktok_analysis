package com.ss.android.ugc.aweme.shortvideo.cut.model;

import X.C12YO;
import X.C2401009ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class CutVideoContext implements Parcelable, Serializable {
    public static final Parcelable.Creator<CutVideoContext> CREATOR = new C12YO(1);
    public float totalSpeed;
    public List<VideoSegment> videoSegmentList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void resetVideoSegmentList() {
        if (C2401009ay.LIZ(this.videoSegmentList)) {
            return;
        }
        for (int i = 0; i < this.videoSegmentList.size(); i++) {
            ((VideoSegment) ListProtector.get(this.videoSegmentList, i)).LJIIIZ();
        }
    }

    public CutVideoContext() {
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.videoSegmentList;
    }

    public CutVideoContext(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.videoSegmentList = arrayList;
        parcel.readList(arrayList, VideoSegment.class.getClassLoader());
    }

    public void setSpeed(float f) {
        this.totalSpeed = f;
    }

    public void setVideoSegmentList(List<VideoSegment> list) {
        this.videoSegmentList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.totalSpeed);
        parcel.writeList(this.videoSegmentList);
    }
}
