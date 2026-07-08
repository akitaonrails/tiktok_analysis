package com.ss.android.ugc.aweme.composer;

import X.EnumC574990Mgr;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.BasicModelDsl;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class BasicModelDsl extends BasicModel {
    public static final Parcelable.Creator<BasicModelDsl> CREATOR = new Parcelable.Creator<BasicModelDsl>() { // from class: X.0MhM
        @Override // android.os.Parcelable.Creator
        public final BasicModelDsl createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new BasicModelDsl();
        }

        @Override // android.os.Parcelable.Creator
        public final BasicModelDsl[] newArray(int i) {
            return new BasicModelDsl[i];
        }
    };

    public BasicModelDsl() {
        super(EnumC574990Mgr.ComposeType_Default, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null, new ArrayList(), null, new LinkedHashMap(), new LinkedHashMap(), new ArrayList(), null);
    }

    @Override // com.ss.ugc.aweme.creation.base.BasicModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final TrackModel track(Function1<? super TrackModel, Unit> function1) {
        TrackModel trackModel = new TrackModel(null, null, null, null, null, null, null, null, new LinkedHashMap(), null, null, null, null);
        function1.invoke(trackModel);
        setTrack(trackModel);
        return trackModel;
    }
}
