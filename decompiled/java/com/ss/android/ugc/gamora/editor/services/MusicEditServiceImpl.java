package com.ss.android.ugc.gamora.editor.services;

import X.C0C64;
import X.C0E50;
import X.C0EYG;
import X.C1402800mbm;
import X.C1402890mbv;
import X.C1403860mdU;
import X.C1432320nNO;
import X.C1456980o1A;
import X.C1459590o5N;
import X.C1459920o5u;
import X.C1459930o5v;
import X.C1461010o7f;
import X.C19A3;
import X.C19EG;
import X.C348100Dkm;
import X.C348970DmB;
import X.C362740EKa;
import X.C363500EMy;
import X.C858290Xlj;
import X.InterfaceC1451050nrb;
import X.InterfaceC1455610nyx;
import X.InterfaceC1455860nzM;
import X.InterfaceC572860MdQ;
import android.content.Context;
import android.util.Size;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicEditServiceImpl implements IMusicEditService {
    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final C1459930o5v LIZLLL() {
        C363500EMy.LIZ.getClass();
        return C363500EMy.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final void LJIIIZ() {
        C363500EMy.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJII() {
        return C0E50.LIZ;
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final NLEModel LJ(NLEModel nLEModel) {
        return C348970DmB.LJ(nLEModel, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJFF(C348100Dkm c348100Dkm) {
        C363500EMy.LIZ.getClass();
        NLEModel model = c348100Dkm.LIZ.getModel();
        C362740EKa.LIZ.getClass();
        return C362740EKa.LJFF(model);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !u4.LJLL(videoPublishEditModel)) {
            return false;
        }
        C1402800mbm.LIZ.getClass();
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story2_studio_auto_music", true);
        if (iLJIJ != 2) {
            if (iLJIJ == 0) {
                return false;
            }
            if (iLJIJ == 1 && ((Keva) C1402800mbm.LIZIZ.getValue()).getBoolean("has_choose_music", false)) {
                return false;
            }
        }
        if (videoPublishEditModel.getCanvasVideoData() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final void LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C1402800mbm.LIZ.getClass();
        if (u4.LJLL(videoPublishEditModel)) {
            CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
            if (C1402890mbv.LIZ(videoPublishEditModel) && !Intrinsics.LJFF("slideshow_rec", videoPublishEditModel.getMusicOrigin())) {
                str = "shoot_page_selected";
            } else if (C1456980o1A.LJFF(videoPublishEditModel) == 1) {
                str = "with_music_default";
            } else {
                str = "no_music_default";
            }
            commonMobParamModel.storyMusicOrigin = str;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        return C0EYG.LIZ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJIILIIL(InterfaceC1455860nzM interfaceC1455860nzM) {
        if (!(interfaceC1455860nzM instanceof InterfaceC1451050nrb) && !(interfaceC1455860nzM instanceof InterfaceC572860MdQ)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJIILL(NLEModel nLEModel) {
        return C348970DmB.LIZLLL(nLEModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJIJ(VideoPublishEditModel videoPublishEditModel) {
        return u4.LJIIIIZZ(videoPublishEditModel);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, boolean r11) {
        /*
            r9 = this;
            X.0mbm r0 = X.C1402800mbm.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r10.getCanvasVideoData()
            if (r0 == 0) goto L18
            X.01GW r0 = X.C1402800mbm.LIZIZ
            java.lang.Object r1 = r0.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            java.lang.String r0 = "has_choose_music"
            r1.storeBoolean(r0, r11)
        L18:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r10.creativeModel
            com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r3 = r0.commonMobModel
            java.lang.String r2 = r3.storyMusicOrigin
            java.lang.String r8 = "no_music_manual"
            java.lang.String r7 = "no_music_default"
            java.lang.String r6 = "with_music_default"
            java.lang.String r5 = "with_music_manual"
            java.lang.String r4 = "with_music_change"
            if (r11 == 0) goto L5c
            if (r2 == 0) goto L33
            int r0 = r2.hashCode()
            switch(r0) {
                case 437170217: goto L4d;
                case 1552124387: goto L44;
                case 1677076078: goto L3d;
                case 1832345081: goto L54;
                case 2069442782: goto L36;
                default: goto L33;
            }
        L33:
            r3.storyMusicOrigin = r2
            return
        L36:
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L4b
            goto L33
        L3d:
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L4b
            goto L33
        L44:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L4b
            goto L33
        L4b:
            r2 = r4
            goto L33
        L4d:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L5a
            goto L33
        L54:
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L33
        L5a:
            r2 = r5
            goto L33
        L5c:
            if (r2 == 0) goto L33
            int r1 = r2.hashCode()
            r0 = 1552124387(0x5c8389e3, float:2.9619864E17)
            if (r1 == r0) goto L80
            r0 = 1677076078(0x63f6266e, float:9.0813364E21)
            if (r1 == r0) goto L79
            r0 = 1832345081(0x6d375df9, float:3.5468352E27)
            if (r1 != r0) goto L33
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L33
            r2 = r7
            goto L33
        L79:
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L87
            goto L33
        L80:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L87
            goto L33
        L87:
            r2 = r8
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.services.MusicEditServiceImpl.LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean):void");
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final boolean LJIJI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        return C1403860mdU.LIZ(videoPublishEditModel, z);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final C1459930o5v LIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, AwS566S0100000_22 awS566S0100000_22) {
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJIIIIZZ == null) {
            C363500EMy.LJIIIIZZ = new C1459930o5v(c19eg, videoPublishEditModel, awS566S0100000_22);
        }
        C1459930o5v c1459930o5v = C363500EMy.LJIIIIZZ;
        if (c1459930o5v != null) {
            return c1459930o5v;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final C1461010o7f LIZIZ(long j, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        return new C1461010o7f(j, nLEModel, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final C1459920o5u LJIIIIZZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, AwS558S0100000_14 awS558S0100000_14) {
        return new C1459920o5u(c19eg, videoPublishEditModel, awS558S0100000_14);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final void LJIIZILJ(Long l, String str, String str2) {
        C363500EMy.LIZ.getClass();
        C363500EMy.LJIIL = str;
        C363500EMy.LJIILL = l;
        C363500EMy.LJIILJJIL = true;
        C363500EMy.LJIILIIL = str2;
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final C1459590o5N LIZJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C19A3 c19a3, InterfaceC1455610nyx interfaceC1455610nyx) {
        return new C1459590o5N(c19eg, videoPublishEditModel, c19a3, interfaceC1455610nyx);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final void LJIIJ(VideoPublishEditModel videoPublishEditModel, SrcImageInfo srcImageInfo, Size size, String str, AwS643S0100000_29 awS643S0100000_29, AwS678S0100000_29 awS678S0100000_29, AFwS261S0000000_22 aFwS261S0000000_22, AFwS261S0000000_22 aFwS261S0000000_222) throws Throwable {
        new C1432320nNO(videoPublishEditModel).LJIIIIZZ(videoPublishEditModel, srcImageInfo, size, str, awS643S0100000_29, awS678S0100000_29, aFwS261S0000000_22, aFwS261S0000000_222);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IMusicEditService
    public final TuxPanel LJIILJJIL(FragmentManager fragmentManager, Context context, PreCheckResult preCheckResult, VideoPublishEditModel videoPublishEditModel, String str, String str2, int i, Integer num, AwS128S1100000_14 awS128S1100000_14) {
        return C858290Xlj.LIZ(fragmentManager, context, preCheckResult, videoPublishEditModel, str, str2, i, num, awS128S1100000_14);
    }
}
