package com.ss.android.ugc.trill.download.ui;

import X.AbstractC1382550m57;
import X.AbstractC21169117sn;
import X.C1376270luz;
import X.InterfaceC21168617si;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadUIProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeUIProtocol implements DownloadUIProtocol {
    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadUIProtocol
    public final <CONTEXT extends AbstractC21169117sn> InterfaceC21168617si vn0(CONTEXT context) {
        AbstractC1382550m57 abstractC1382550m57 = (AbstractC1382550m57) context;
        if (C1376270luz.LJ()) {
            final String str = abstractC1382550m57.LJI;
            final Aweme aweme = abstractC1382550m57.LJFF;
            final int i = abstractC1382550m57.LIZJ;
            return new InterfaceC21168617si(i, aweme, str) { // from class: X.0m0m
                public final String LIZ;
                public final Aweme LIZIZ;
                public final int LIZJ;

                @Override // X.InterfaceC21168617si
                public final void onCancel() {
                    LIZJ(LIZIZ(this, 3, this.LIZIZ, 0, this.LIZ, 0, 20));
                }

                @Override // X.InterfaceC21168617si
                public final void onSuccess() {
                    LIZJ(LIZIZ(this, 4, this.LIZIZ, 0, this.LIZ, 1, 4));
                }

                public static void LIZJ(C0SU5 c0su5) {
                    C707370Rot.LIZ.LIZIZ("video_download_status").postValue(c0su5);
                }

                @Override // X.InterfaceC21168617si
                public final void LIZ(Context context2) {
                    LIZJ(LIZIZ(this, 1, this.LIZIZ, 0, this.LIZ, 0, 20));
                }

                @Override // X.InterfaceC21168617si
                public final void onFailed(int i2) {
                    LIZJ(LIZIZ(this, 5, this.LIZIZ, 0, this.LIZ, 0, 20));
                }

                @Override // X.InterfaceC21168617si
                public final void onProgress(int i2) {
                    LIZJ(LIZIZ(this, 2, this.LIZIZ, i2, this.LIZ, 0, 16));
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = aweme;
                    this.LIZJ = i;
                }

                public static C0SU5 LIZIZ(C1379860m0m c1379860m0m, int i2, Aweme aweme2, int i3, String str2, int i4, int i5) {
                    if ((i5 & 4) != 0) {
                        i3 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i4 = 0;
                    }
                    int i6 = c1379860m0m.LIZJ;
                    if (i6 != EnumC1379880m0o.AWEME_STORY_PHOTO.getType() && i6 != EnumC1379880m0o.AWEME_IMAGE.getType()) {
                        if (i6 == EnumC1379880m0o.AWEME_VIDEO.getType()) {
                            C0SU5 c0su5 = C0SU5.LIZ;
                            C0SU5.LIZIZ = i2;
                            C0SU5.LIZJ = i3;
                            C0SU5.LIZLLL = aweme2;
                            C0SU5.LJ = false;
                            C0SU5.LJFF = 0;
                            return c0su5;
                        }
                        C0SU5 c0su52 = C0SU5.LIZ;
                        C0SU5.LIZIZ = i2;
                        C0SU5.LIZJ = i3;
                        C0SU5.LIZLLL = aweme2;
                        C0SU5.LJ = false;
                        C0SU5.LJFF = 0;
                        return c0su52;
                    }
                    C0SU5 c0su53 = C0SU5.LIZ;
                    C0SU5.LIZIZ = i2;
                    C0SU5.LIZJ = i3;
                    C0SU5.LIZLLL = aweme2;
                    C0SU5.LJ = true;
                    C0SU5.LJFF = i4;
                    return c0su53;
                }
            };
        }
        return new DownloadDialogProvider(abstractC1382550m57.LJI, abstractC1382550m57.LJII, abstractC1382550m57.LJFF);
    }
}
