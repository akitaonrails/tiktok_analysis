package com.ss.android.ugc.aweme.shortvideo.record;

import X.InterfaceC2253801DJi;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;

/* JADX INFO: loaded from: classes26.dex */
public final class v1 implements InterfaceC2253801DJi {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public boolean LJFF;

    @Override // X.InterfaceC2253801DJi
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC2253801DJi
    public final boolean LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2253801DJi
    public final int LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2253801DJi
    public final String LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2253801DJi
    public final String LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2253801DJi
    public final int LJFF() {
        return this.LJ;
    }

    public v1(CameraComponentModel cameraComponentModel) {
        boolean z;
        if (cameraComponentModel.gameDuetResource != null) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        DuetContext duetContext = cameraComponentModel.duetContext;
        String str = duetContext.duetAudioPath;
        this.LIZIZ = str == null ? "" : str;
        String str2 = duetContext.duetVideoPath;
        this.LIZJ = str2 != null ? str2 : "";
        this.LIZLLL = duetContext.duetVideoWidth;
        this.LJ = duetContext.duetVideoHeight;
    }
}
