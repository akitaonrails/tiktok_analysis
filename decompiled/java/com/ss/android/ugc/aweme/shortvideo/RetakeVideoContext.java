package com.ss.android.ugc.aweme.shortvideo;

import X.C2298208zU;
import X.C383280F1a;
import X.EnumC20228214Cy;
import X.InterfaceC383290F1b;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VERecordData;

/* JADX INFO: loaded from: classes6.dex */
public final class RetakeVideoContext implements Parcelable, InterfaceC383290F1b {
    public static final C383280F1a CREATOR = new Parcelable.Creator<RetakeVideoContext>() { // from class: X.0F1a
        @Override // android.os.Parcelable.Creator
        public final RetakeVideoContext createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            CreativeInfo creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
            if (creativeInfo == null) {
                creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            }
            RetakeVideoContext retakeVideoContext = new RetakeVideoContext(creativeInfo);
            retakeVideoContext.duration = parcel.readLong();
            retakeVideoContext.start = parcel.readLong();
            retakeVideoContext.retakeIndex = parcel.readInt();
            retakeVideoContext.recordData = (VERecordData) parcel.readParcelable(VERecordData.class.getClassLoader());
            String string = parcel.readString();
            if (string == null) {
                string = C2298208zU.LIZLLL(((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).pathService(), retakeVideoContext.creativeInfo, EnumC20228214Cy.RECORD, null, false, 12);
            }
            retakeVideoContext.retakeDir = string;
            retakeVideoContext.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
            retakeVideoContext.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
            retakeVideoContext.musicOrigin = parcel.readString();
            boolean z8 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            retakeVideoContext.isFromEditorPro = z;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            retakeVideoContext.isAddClips = z2;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            retakeVideoContext.disableBGM = z3;
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            retakeVideoContext.isReplace = z4;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            retakeVideoContext.originFromUploadPage = z5;
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            retakeVideoContext.isRetakeOriginUploadSource = z6;
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            retakeVideoContext.isPip = z7;
            if (parcel.readInt() == 0) {
                z8 = false;
            }
            retakeVideoContext.originFromNowsPage = z8;
            retakeVideoContext.durationWithSpeed = parcel.readLong();
            return retakeVideoContext;
        }

        @Override // android.os.Parcelable.Creator
        public final RetakeVideoContext[] newArray(int i) {
            return new RetakeVideoContext[i];
        }
    };
    public final CreativeInfo creativeInfo;
    public boolean disableBGM;
    public long duration;
    public long durationWithSpeed;
    public boolean isAddClips;
    public boolean isFromEditorPro;
    public boolean isFromLibrary;
    public boolean isPip;
    public boolean isReplace;
    public boolean isRetakeOriginUploadSource;
    public MultiEditVideoStatusRecordData multiEditVideoRecordData;
    public String musicOrigin;
    public boolean originFromNowsPage;
    public boolean originFromUploadPage;
    public VERecordData recordData;
    public String retakeDir;
    public int retakeIndex;
    public long start;
    public StitchParams stitchParams;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RetakeVideoContext(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
        this.retakeDir = C2298208zU.LIZLLL(((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).pathService(), creativeInfo, EnumC20228214Cy.RECORD, null, false, 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.start);
        parcel.writeInt(this.retakeIndex);
        parcel.writeParcelable(this.recordData, i);
        parcel.writeString(this.retakeDir);
        parcel.writeParcelable(this.multiEditVideoRecordData, i);
        parcel.writeParcelable(this.stitchParams, i);
        String str = this.musicOrigin;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.isFromEditorPro ? 1 : 0);
        parcel.writeInt(this.isAddClips ? 1 : 0);
        parcel.writeInt(this.disableBGM ? 1 : 0);
        parcel.writeInt(this.isReplace ? 1 : 0);
        parcel.writeInt(this.originFromUploadPage ? 1 : 0);
        parcel.writeInt(this.isRetakeOriginUploadSource ? 1 : 0);
        parcel.writeInt(this.isPip ? 1 : 0);
        parcel.writeInt(this.originFromNowsPage ? 1 : 0);
        parcel.writeLong(this.durationWithSpeed);
    }
}
