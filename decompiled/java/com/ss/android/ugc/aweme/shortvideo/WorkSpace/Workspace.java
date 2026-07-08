package com.ss.android.ugc.aweme.shortvideo.WorkSpace;

import X.C14D3;
import X.C2219091BtD;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;
import java.io.File;

/* JADX INFO: loaded from: classes36.dex */
public final class Workspace implements Parcelable {
    public static final Parcelable.Creator<Workspace> CREATOR = new C2325341G0m(11);
    public final WorkspaceImpl LL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final File Ho() {
        return this.LL.Ho();
    }

    public final File LIZ() {
        return this.LL.s4();
    }

    public final File LIZIZ() {
        return this.LL.uR();
    }

    public final File LIZJ() {
        return this.LL.UK();
    }

    public final File LIZLLL() {
        return this.LL.cF();
    }

    public final File LJ() {
        return this.LL.GQ();
    }

    public final File LJFF() {
        return this.LL.XK();
    }

    public final String getMusicPath() {
        return this.LL.getMusicPath();
    }

    public final void wQ() {
        this.LL.wQ();
    }

    public Workspace(Parcel parcel) {
        WorkspaceImpl workspaceImpl = (WorkspaceImpl) parcel.readParcelable(C2219091BtD.LIZ().getClassLoader());
        this.LL = workspaceImpl;
        if (workspaceImpl instanceof C14D3) {
            ((C14D3) workspaceImpl).LIZ();
        }
    }

    public final void MC(String str) {
        this.LL.MC(str);
    }

    public Workspace(CreativePathWorkspaceImpl creativePathWorkspaceImpl) {
        this.LL = creativePathWorkspaceImpl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.LL, i);
    }
}
