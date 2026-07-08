package com.bytedance.scene.navigation;

import X.AbstractC214793194d;
import X.C19BA;
import X.InterfaceC363130ELn;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.Record;

/* JADX INFO: loaded from: classes33.dex */
public class Record implements Parcelable {
    public static final Parcelable.Creator<Record> CREATOR = new Parcelable.Creator<Record>() { // from class: X.19Aj
        @Override // android.os.Parcelable.Creator
        public final Record createFromParcel(Parcel parcel) {
            return new Record(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Record[] newArray(int i) {
            return new Record[i];
        }
    };
    public boolean LL;
    public String LLILLJJLI;
    public Configuration LLILLL;
    public boolean LLILZ;
    public ActivityStatusRecord mActivityStatusRecord;
    public boolean mIsTranslucent;
    public AbstractC214793194d mNavigationAnimationExecutor;
    public Bundle mPreviousSavedState;
    public Object mPushResult;
    public InterfaceC363130ELn mPushResultCallback;
    public Scene mScene;
    public C19BA mSceneResultHandler;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZIZ() {
        this.mActivityStatusRecord = ActivityStatusRecord.LIZ(this.mScene.requireActivity());
    }

    public Record() {
    }

    public Record(Parcel parcel) {
        boolean z;
        this.mActivityStatusRecord = (ActivityStatusRecord) parcel.readParcelable(ActivityStatusRecord.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsTranslucent = z;
        this.LLILLJJLI = parcel.readString();
        parcel.readParcelable(Configuration.class.getClassLoader());
        this.LLILZ = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mActivityStatusRecord, i);
        parcel.writeByte(this.mIsTranslucent ? (byte) 1 : (byte) 0);
        parcel.writeString(this.LLILLJJLI);
        parcel.writeParcelable(null, i);
        parcel.writeByte(this.LLILZ ? (byte) 1 : (byte) 0);
    }

    public static Record LIZ(Scene scene, boolean z, AbstractC214793194d abstractC214793194d) {
        Record record = new Record();
        record.mScene = scene;
        record.LLILLJJLI = scene.getClass().getName();
        record.mIsTranslucent = z;
        record.mNavigationAnimationExecutor = abstractC214793194d;
        return record;
    }
}
