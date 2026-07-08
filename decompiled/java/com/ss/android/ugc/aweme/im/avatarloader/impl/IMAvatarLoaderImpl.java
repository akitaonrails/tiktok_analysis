package com.ss.android.ugc.aweme.im.avatarloader.impl;

import X.AbstractC897790ZJx;
import X.C01GW;
import X.C0ZK0;
import X.C0ZKE;
import X.C0ZKG;
import X.C0ZKN;
import X.C1326900kdM;
import X.C1331670kl3;
import X.C422800Ghy;
import X.C452501pT;
import X.InterfaceC1334290kpH;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMAvatarLoaderImpl implements IMAvatarLoaderApi {
    public static final IMAvatarLoaderImpl LIZIZ = new IMAvatarLoaderImpl();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(90));

    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
    public final C0ZKN LIZ() {
        return new C0ZKN((C0ZK0) LIZJ.getValue());
    }

    public static final class Service implements IMAvatarLoaderApi {
        public final /* synthetic */ IMAvatarLoaderImpl LIZIZ = IMAvatarLoaderImpl.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
        public final C0ZKN LIZ() {
            return this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
        public final C0ZKE LIZIZ(C422800Ghy c422800Ghy, String str) {
            return this.LIZIZ.LIZIZ(c422800Ghy, str);
        }

        @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
        public final C0ZKG LIZJ(InterfaceC1334290kpH interfaceC1334290kpH, String str) {
            return this.LIZIZ.LIZJ(interfaceC1334290kpH, str);
        }

        @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
        public final C1331670kl3 LIZLLL(C1331670kl3 c1331670kl3) {
            this.LIZIZ.getClass();
            C1326900kdM.LIZIZ(c1331670kl3);
            return c1331670kl3;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
    public final C1331670kl3 LIZLLL(C1331670kl3 c1331670kl3) {
        C1326900kdM.LIZIZ(c1331670kl3);
        return c1331670kl3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ZKE] */
    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
    public final C0ZKE LIZIZ(final C422800Ghy c422800Ghy, final String str) {
        final C0ZK0 c0zk0 = (C0ZK0) LIZJ.getValue();
        return new AbstractC897790ZJx(str, c0zk0, c422800Ghy) { // from class: X.0ZKE
            public final C422800Ghy LJ;

            @Override // X.AbstractC897790ZJx
            public final void LJFF(UrlModel urlModel, String str2) {
                Object obj = urlModel;
                if (urlModel == null) {
                    obj = str2;
                }
                C451690HnT.LIZ(obj, this.LJ);
            }

            {
                this.LJ = c422800Ghy;
            }

            @Override // X.AbstractC897790ZJx
            public final void LJIIIZ(UrlModel urlModel, C0ZKF c0zkf, int i, final C897800ZJy c897800ZJy) {
                boolean z;
                C1331100kk8 c1331100kk8;
                int i2 = c0zkf.LIZIZ;
                if (i2 <= 0) {
                    i2 = R.drawable.fhx;
                }
                int i3 = c0zkf.LIZ;
                int iIntValue = 0;
                if (c0zkf.LIZJ > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C422800Ghy c422800Ghy2 = this.LJ;
                if (c422800Ghy2 instanceof C417390GYf) {
                    ((C417390GYf) c422800Ghy2).setShouldDrawBorder(!z);
                }
                C1331070kk5 hierarchy = this.LJ.getHierarchy();
                if (hierarchy != null && (c1331100kk8 = hierarchy.LIZJ) != null) {
                    c1331100kk8.LIZIZ = true;
                    if (z) {
                        c1331100kk8.LJFF(c0zkf.LIZJ);
                        c1331100kk8.LJIIIZ(c0zkf.LIZLLL);
                        c1331100kk8.LJFF = c0zkf.LJ;
                    } else {
                        C0I0B.LJFF.LIZJ();
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, C894660Z7w.LIZ());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        c1331100kk8.LJFF = iIntValue;
                    }
                }
                C422800Ghy c422800Ghy3 = this.LJ;
                String str2 = this.LIZ;
                InterfaceC1320650kTH interfaceC1320650kTH = new InterfaceC1320650kTH() { // from class: X.0ZKD
                    @Override // X.InterfaceC1320650kTH
                    public final void LIZ(String str3, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZIZ(String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZLLL(String str3, Throwable th) {
                        C897800ZJy c897800ZJy2 = c897800ZJy;
                        if (c897800ZJy2 != null) {
                            c897800ZJy2.LIZIZ();
                        }
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJ(String str3, Object obj, Animatable animatable) {
                        C897800ZJy c897800ZJy2 = c897800ZJy;
                        if (c897800ZJy2 != null) {
                            c897800ZJy2.LIZ();
                        }
                    }
                };
                if (c422800Ghy3 != null && c422800Ghy3.getContext() != null) {
                    Drawable drawableLIZIZ = C451690HnT.LIZIZ(c422800Ghy3, i, true);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = i2;
                    C0I98.LIZLLL(c422800Ghy3, urlModel, str2, c419910GdJ.LIZ(c422800Ghy3.getContext()), drawableLIZIZ, null, interfaceC1320650kTH, i3, i3, null, false);
                }
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [X.0ZKC] */
            @Override // X.AbstractC897790ZJx
            public final void LJI(String str2, UrlModel urlModel, C0ZKF c0zkf, int i, final C897800ZJy c897800ZJy) {
                UrlModel urlModelLJIILIIL = urlModel;
                int i2 = c0zkf.LIZIZ;
                if (i2 <= 0) {
                    i2 = R.drawable.fhx;
                }
                if (urlModelLJIILIIL == null) {
                    if (str2 != null) {
                        urlModelLJIILIIL = C0I98.LJIILIIL(str2);
                    } else {
                        urlModelLJIILIIL = null;
                    }
                }
                C451690HnT.LJ(this.LJ, urlModelLJIILIIL, this.LIZ, i2, i, new InterfaceC1320650kTH() { // from class: X.0ZKC
                    @Override // X.InterfaceC1320650kTH
                    public final void LIZ(String str3, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZIZ(String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZLLL(String str3, Throwable th) {
                        C897800ZJy c897800ZJy2 = c897800ZJy;
                        if (c897800ZJy2 != null) {
                            c897800ZJy2.LIZIZ();
                        }
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJ(String str3, Object obj, Animatable animatable) {
                        C897800ZJy c897800ZJy2 = c897800ZJy;
                        if (c897800ZJy2 != null) {
                            c897800ZJy2.LIZ();
                        }
                    }
                }, 928);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi
    public final C0ZKG LIZJ(InterfaceC1334290kpH interfaceC1334290kpH, String str) {
        return new C0ZKG(str, (C0ZK0) LIZJ.getValue(), interfaceC1334290kpH);
    }
}
