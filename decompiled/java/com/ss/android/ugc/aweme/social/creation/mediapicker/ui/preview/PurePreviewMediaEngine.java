package com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview;

import X.C01GW;
import X.C05P0;
import X.C05V6;
import X.C0C64;
import X.C0L2B;
import X.C0LJI;
import X.C0M9E;
import X.C0MAQ;
import X.C0VSJ;
import X.C13GF;
import X.C13Z4;
import X.C13ZC;
import X.C1403905eX;
import X.C1404305eb;
import X.C1666420tSy;
import X.C1667200tUE;
import X.C1668040tVa;
import X.C1668160tVm;
import X.C1668230tVt;
import X.C1669050tXD;
import X.C1670540tZc;
import X.C1670560tZe;
import X.C1670620tZk;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1696790uFx;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20084413iE;
import X.C2286708xd;
import X.C23214097s;
import X.C23271099x;
import X.C2471909mP;
import X.C259800zU;
import X.C274430ApF;
import X.C452501pT;
import X.InterfaceC1668050tVb;
import X.InterfaceC1670590tZh;
import X.InterfaceC1671600tbK;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC497601wk;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import android.widget.VideoView;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS0S0322000_25;
import kotlin.jvm.internal.AwS1S0312000_25;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS3S0302000_6;
import kotlin.jvm.internal.AwS4S0311000_8;
import kotlin.jvm.internal.AwS57S0301000_6;
import kotlin.jvm.internal.AwS5S0311000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS62S0210000_8;

/* JADX INFO: loaded from: classes26.dex */
public final class PurePreviewMediaEngine implements MediaEngine {
    public static final int $stable = 0;
    public final Integer fixedThumbnailSize;
    public final C05V6 log;
    public C0LJI perfTrackingData;
    public final float thumbnailBitmapResizeFactor;
    public static final C1404305eb Companion = new Object() { // from class: X.05eb
    };
    public static final Parcelable.Creator<PurePreviewMediaEngine> CREATOR = new Parcelable.Creator<PurePreviewMediaEngine>() { // from class: X.0M9F
        @Override // android.os.Parcelable.Creator
        public final PurePreviewMediaEngine createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new PurePreviewMediaEngine();
        }

        @Override // android.os.Parcelable.Creator
        public final PurePreviewMediaEngine[] newArray(int i) {
            return new PurePreviewMediaEngine[i];
        }
    };
    public static final PurePreviewMediaEngine instance = new PurePreviewMediaEngine();
    public final C01GW useComposeImage$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(198));
    public final C0L2B imageLoader = new C0L2B();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public PurePreviewMediaEngine() {
        Integer numValueOf;
        C05V6 c05v6 = new C05V6("PurePreviewMediaEngine");
        c05v6.LIZ = true;
        this.log = c05v6;
        this.thumbnailBitmapResizeFactor = C23214097s.LIZ() ? C274430ApF.LIZ() : 1.0f;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_use_fixed_thumbnail_size", true) != 0) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_use_fixed_thumbnail_size", true);
            numValueOf = Integer.valueOf((iLJIJ == 1 || iLJIJ != 2) ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : 200);
        } else {
            numValueOf = null;
        }
        this.fixedThumbnailSize = numValueOf;
    }

    public final C0LJI LJI() {
        return this.perfTrackingData;
    }

    public final Size LJFF(Size size) {
        Integer num = this.fixedThumbnailSize;
        if (num != null) {
            int iIntValue = num.intValue();
            return new Size(iIntValue, iIntValue);
        }
        float f = this.thumbnailBitmapResizeFactor;
        return new Size((int) (size.getWidth() * f), (int) (size.getHeight() * f));
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

    public final void LIZIZ(SocMediaResource socMediaResource, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-216227261);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS236S0000000_6.get$arr$(305);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean z2 = true;
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 896) != 256) {
                z2 = false;
            }
            boolean z3 = z | z2;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS372S0200000_6(socMediaResource, this, 25);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ((i2 & 112) | 6, 0, c13zcLJIIJ, interfaceC1685750ty9, function1, (Function1) objLJJ2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS57S0301000_6(this, socMediaResource, interfaceC1685750ty9, i, 0);
        }
    }

    public final void LIZ(SocMediaResource socMediaResource, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1361195699);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c13zcLJIIJ.LJJIL(C13GF.LIZ);
            C259800zU c259800zU = new C259800zU();
            C1680540tpk.LIZ(Boolean.valueOf(z), lifecycleOwner.getLifecycle(), new AwS62S0210000_8(lifecycleOwner, (LifecycleOwner) c259800zU, (C259800zU<VideoView>) z, true), c13zcLJIIJ);
            InterfaceC1668050tVb.LIZ.getClass();
            C1668160tVm.LIZ(interfaceC1685750ty9, C1668040tVa.LJFF, false, C13Z4.LIZJ(-507544439, new C0MAQ(socMediaResource, z, c259800zU), c13zcLJIIJ), c13zcLJIIJ, ((i2 >> 6) & 14) | 3120, 4);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S0311000_8(this, socMediaResource, z, interfaceC1685750ty9, i, 1);
        }
    }

    public final void LIZLLL(SocMediaResource socMediaResource, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC1670590tZh c1670560tZe;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(793177765);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i | i4;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(interfaceC1685750ty92);
            if (C2286708xd.LIZJ(socMediaResource.tiktokMediaModel.LJFF())) {
                c1670560tZe = new C1670560tZe(new C0VSJ(C2471909mP.LJIJ(socMediaResource.tiktokMediaModel)), null);
            } else {
                c1670560tZe = C1670620tZk.LIZ;
            }
            String str = socMediaResource.name;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS236S0000000_6.get$arr$(306);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS604S0100000_25(socMediaResource, 244);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1670540tZc.LIZ(c1670560tZe, str, interfaceC1685750ty9LIZLLL, null, null, null, null, null, function1, null, (Function1) objLJJ2, null, c13zcLJIIJ, 100663296, 0, 2808);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S0302000_6(this, socMediaResource, interfaceC1685750ty92, i, i2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void Yg(SocMediaResource socMediaResource, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2093847771);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJII = c13zcLJIIJ.LJII(interfaceC497601wk) | c13zcLJIIJ.LJII(context);
            int i7 = i2 & 14;
            if (i7 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = zLJII | z2;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1403905eX(interfaceC497601wk, context, socMediaResource, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ3, c13zcLJIIJ);
            if (z) {
                c13zcLJIIJ.LJJIIJZLJL(-2008216022);
                LIZ(socMediaResource, z, interfaceC1685750ty9, c13zcLJIIJ, (i2 & 112) | i7 | (i2 & 896) | (i2 & 7168));
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-2008118248);
                Bitmap bitmap = (Bitmap) c05p0.getValue();
                if (bitmap != null) {
                    C1696790uFx c1696790uFx = new C1696790uFx(bitmap);
                    String str = socMediaResource.name;
                    InterfaceC1671600tbK interfaceC1671600tbK = new InterfaceC1671600tbK() { // from class: X.0jqS
                        @Override // X.InterfaceC1671600tbK
                        public final long LIZ(long j, long j2) {
                            float fMin = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L);
                            int i8 = C1296550jqP.LIZ;
                            return jFloatToRawIntBits;
                        }
                    };
                    InterfaceC1668050tVb.LIZ.getClass();
                    C1668230tVt.LIZIZ(c1696790uFx, str, interfaceC1685750ty9, C1668040tVa.LJFF, interfaceC1671600tbK, 0.0f, c13zcLJIIJ, (i2 & 896) | 3072, 224);
                }
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS5S0311000_25(this, socMediaResource, z, interfaceC1685750ty9, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r22, boolean r23, int r24, boolean r25, X.InterfaceC1680500tpg r26, int r27) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine.LIZJ(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, boolean, int, boolean, X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void vh(SocMediaResource socMediaResource, boolean z, int i, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        int i4;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-955699160);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
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
        if ((i3 & 9347) == 9346 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(696114906);
            if (i > 0) {
                interfaceC1685750ty9LIZ = C1667200tUE.LIZ(interfaceC1685750ty9, C1669050tXD.LIZIZ(C1666420tSy.LIZ(Integer.valueOf(i), c13zcLJIIJ)));
            } else {
                interfaceC1685750ty9LIZ = interfaceC1685750ty9;
            }
            c13zcLJIIJ.LJJJJL(false);
            if (((Boolean) this.useComposeImage$delegate.getValue()).booleanValue()) {
                c13zcLJIIJ.LJJIIJZLJL(104866162);
                LIZLLL(socMediaResource, interfaceC1685750ty9LIZ, c13zcLJIIJ, (i3 & 14) | ((i3 >> 6) & 896), 0);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(104943662);
                LIZIZ(socMediaResource, interfaceC1685750ty9LIZ, c13zcLJIIJ, ((i3 >> 6) & 896) | (i3 & 14));
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0312000_25(this, socMediaResource, z, i, interfaceC1685750ty9, i2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine
    public final void Bk(SocMediaResource socMediaResource, boolean z, int i, boolean z2, Size size, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2128655721);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJII(size)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (((Boolean) this.useComposeImage$delegate.getValue()).booleanValue()) {
            c13zcLJIIJ.LJJIIJZLJL(-409302923);
            LJ(socMediaResource, z, i, z2, size, c13zcLJIIJ, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3));
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(-409197957);
            LIZJ(socMediaResource, z, i, z2, c13zcLJIIJ, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 >> 3) & 57344));
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0322000_25(this, socMediaResource, z, i, z2, size, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r22, boolean r23, int r24, boolean r25, android.util.Size r26, X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine.LJ(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, boolean, int, boolean, android.util.Size, X.0tpg, int):void");
    }
}
