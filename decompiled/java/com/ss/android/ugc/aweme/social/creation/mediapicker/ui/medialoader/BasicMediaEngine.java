package com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader;

import X.C0L2B;
import X.C0LJI;
import X.C0M9E;
import X.C13Z4;
import X.C13ZC;
import X.C1666900tTk;
import X.C1667200tUE;
import X.C20030013Ys;
import X.C444430Hbl;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine;
import kotlin.jvm.internal.AwS119S0201000_6;

/* JADX INFO: loaded from: classes9.dex */
public final class BasicMediaEngine implements MediaEngine {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BasicMediaEngine> CREATOR = new Parcelable.Creator<BasicMediaEngine>() { // from class: X.0M9D
        @Override // android.os.Parcelable.Creator
        public final BasicMediaEngine createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new BasicMediaEngine();
        }

        @Override // android.os.Parcelable.Creator
        public final BasicMediaEngine[] newArray(int i) {
            return new BasicMediaEngine[i];
        }
    };
    public final C0L2B imageLoader = new C0L2B();
    public C0LJI perfTrackingData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final C0LJI LIZ() {
        return this.perfTrackingData;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void pB(C0LJI c0lji) {
        this.perfTrackingData = c0lji;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void kQ(SocMediaResource socMediaResource, InterfaceC1680500tpg interfaceC1680500tpg) {
        C0M9E.LIZ(this, socMediaResource, interfaceC1680500tpg);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void tl(SocMediaResource socMediaResource, InterfaceC1680500tpg interfaceC1680500tpg) {
        C0M9E.LIZIZ(this, socMediaResource, interfaceC1680500tpg);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yg(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r24, boolean r25, X.InterfaceC1685750ty9 r26, X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine.Yg(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, boolean, X.0ty9, X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void vh(SocMediaResource socMediaResource, boolean z, int i, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(674868699);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 8323) == 8322 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1666900tTk.LIZ(C1667200tUE.LIZIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ)), C13Z4.LIZJ(1661815779, new AwS119S0201000_6(i, socMediaResource, this, 0), c13zcLJIIJ), c13zcLJIIJ, 54, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C444430Hbl(this, socMediaResource, z, i, interfaceC1685750ty9, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3  */
    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bk(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r22, boolean r23, int r24, boolean r25, android.util.Size r26, X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine.Bk(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, boolean, int, boolean, android.util.Size, X.0tpg, int):void");
    }
}
