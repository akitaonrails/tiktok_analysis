package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C0C64;
import X.C0EMB;
import X.C113H;
import X.C1324780kZw;
import X.C1324800kZy;
import X.C1325710kbR;
import X.C1414930mvL;
import X.C1450070nq1;
import X.C1450940nrQ;
import X.C1450990nrV;
import X.C1452870nuX;
import X.C1457740o2O;
import X.C1457830o2X;
import X.C1459010o4R;
import X.C1459960o5y;
import X.C1463020oAu;
import X.C1463050oAx;
import X.C1465110oEH;
import X.C2188811AlT;
import X.C348100Dkm;
import X.C557050Lt1;
import X.InterfaceC1451320ns2;
import X.InterfaceC1452170ntP;
import X.InterfaceC1459100o4a;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadStickPointResources;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS101S0210000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS101S0210000_22 awS101S0210000_22) {
        InterfaceC1459100o4a interfaceC1459100o4aLJIIIZ = ((C1465110oEH) awS101S0210000_22.l0).LJIIIZ();
        if (interfaceC1459100o4aLJIIIZ != null) {
            interfaceC1459100o4aLJIIIZ.LJII((MusicModel) awS101S0210000_22.l1, LifecycleOwnerKt.getLifecycleScope(((C1465110oEH) awS101S0210000_22.l0).LIZ), awS101S0210000_22.z2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS101S0210000_22 awS101S0210000_22) {
        ((C1450940nrQ) awS101S0210000_22.l0).LIZ.setImageURI(null);
        Bitmap bitmap = ((C1450940nrQ) awS101S0210000_22.l0).LJIIIZ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C1450940nrQ c1450940nrQ = (C1450940nrQ) awS101S0210000_22.l0;
        c1450940nrQ.LJIIIZ = (Bitmap) awS101S0210000_22.l1;
        c1450940nrQ.LJIIJ = awS101S0210000_22.z2;
        c1450940nrQ.LJIJ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS101S0210000_22 awS101S0210000_22) {
        boolean z;
        if (((C1450990nrV) awS101S0210000_22.l0).LJIJJLI().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showNleReadyView: position=");
        sbLIZ.append(((C1450990nrV) awS101S0210000_22.l0).LLLLJI);
        sbLIZ.append(" currentPos=");
        sbLIZ.append(((C1450990nrV) awS101S0210000_22.l0).LLLLL().h7());
        sbLIZ.append(" isNeedPause=");
        sbLIZ.append(awS101S0210000_22.z2);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1450990nrV c1450990nrV = (C1450990nrV) awS101S0210000_22.l0;
        if (c1450990nrV.LLLLJI != c1450990nrV.LLLLL().h7()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showNleReadyView: position mismatch, skip position=");
            sbLIZ2.append(((C1450990nrV) awS101S0210000_22.l0).LLLLJI);
            sbLIZ2.append(" currentPos=");
            sbLIZ2.append(((C1450990nrV) awS101S0210000_22.l0).LLLLL().h7());
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("image_edit_live_photo_surface_visibility_fix", true) && !z) {
                C1450070nq1.LIZ("showNleReadyView: surface NOT visible, skip to force re-render when visible");
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("showNleReadyView: changeSurfaceViewVisible(true) and hide imageViewManager position=");
                sbLIZ3.append(((C1450990nrV) awS101S0210000_22.l0).LLLLJI);
                C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                C1450990nrV c1450990nrV2 = (C1450990nrV) awS101S0210000_22.l0;
                InterfaceC1451320ns2 interfaceC1451320ns2 = (InterfaceC1451320ns2) c1450990nrV2.LLLL.getValue(c1450990nrV2, C1450990nrV.LLLLLLLLLL[8]);
                if (interfaceC1451320ns2 != null) {
                    interfaceC1451320ns2.N30();
                }
                ((C1450990nrV) awS101S0210000_22.l0).LLLLJ(true);
                C1450940nrQ c1450940nrQ = ((C1450990nrV) awS101S0210000_22.l0).LLJLIL;
                if (c1450940nrQ == null) {
                    c1450940nrQ = null;
                }
                c1450940nrQ.LIZLLL();
                C1450990nrV c1450990nrV3 = (C1450990nrV) awS101S0210000_22.l0;
                c1450990nrV3.getClass();
                C01TT.LIZLLL(new AwS566S0100000_22(c1450990nrV3, 179));
                C1450990nrV c1450990nrV4 = (C1450990nrV) awS101S0210000_22.l0;
                c1450990nrV4.LLLLLJIL = true;
                Function0<Unit> function0 = c1450990nrV4.LLLLLJLJLL;
                if (function0 != null) {
                    function0.invoke();
                }
                ((C1450990nrV) awS101S0210000_22.l0).LLLLLJLJLL = null;
                if (awS101S0210000_22.z2) {
                    ((INLEPlayer) awS101S0210000_22.l1).pause();
                    ((INLEPlayer) awS101S0210000_22.l1).seekTime(0L);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS101S0210000_22 awS101S0210000_22) {
        boolean z;
        long jCurrentTimeMillis;
        ((C1463020oAu) awS101S0210000_22.l0).getEditModel().creativeModel.musicBuzModel.syncClickFrom = "album_next";
        C1463050oAx c1463050oAx = null;
        C0EMB.LIZ(((C1463020oAu) awS101S0210000_22.l0).getEditModel(), true, ((AVMusic) awS101S0210000_22.l1).getMusicId(), "start", null, null);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C1463020oAu c1463020oAu = (C1463020oAu) awS101S0210000_22.l0;
        C1463050oAx c1463050oAx2 = c1463020oAu.LLLLJI;
        C557050Lt1 c557050Lt1 = null;
        if (c1463050oAx2 != null) {
            c1463050oAx = c1463050oAx2;
        }
        int mMusicStart = c1463020oAu.getEditModel().getMMusicStart();
        if (!awS101S0210000_22.z2 || (!C1414930mvL.LIZLLL(((C1463020oAu) awS101S0210000_22.l0).getEditModel()) && !C1414930mvL.LJFF(((C1463020oAu) awS101S0210000_22.l0).getEditModel()))) {
            z = true;
        } else {
            z = false;
        }
        if (awS101S0210000_22.z2 && C1414930mvL.LJ(((C1463020oAu) awS101S0210000_22.l0).getEditModel())) {
            jCurrentTimeMillis = System.currentTimeMillis() + ((long) C0C64.LJIILLIIL().LJIJ(31744, 2000, "studio_sound_sync_edit_loading_delay", true));
        } else {
            jCurrentTimeMillis = -1;
        }
        if (LazyLoadStickPointResources.LIZ()) {
            c557050Lt1 = ((C1463020oAu) awS101S0210000_22.l0).LLLLLJLJLL;
        }
        AVMusic aVMusic = (AVMusic) awS101S0210000_22.l1;
        C1463050oAx.LJIIJJI(c1463050oAx, aVMusic, mMusicStart, z, awS101S0210000_22.z2, jCurrentTimeMillis, c557050Lt1, new AwS388S0200000_22((C1463020oAu) awS101S0210000_22.l0, aVMusic, jCurrentTimeMillis2, 36), 20);
        ((C1463020oAu) awS101S0210000_22.l0).getEditModel().creativeModel.soundSyncModel.soundSyncFrom = "default";
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS101S0210000_22 awS101S0210000_22) {
        if (!awS101S0210000_22.z2) {
            ((C1457740o2O) awS101S0210000_22.l0).lg();
            ((C1457740o2O) awS101S0210000_22.l0).LLILLJJLI.hide((C1457830o2X) awS101S0210000_22.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS101S0210000_22 awS101S0210000_22) {
        InterfaceC1459100o4a interfaceC1459100o4aLLLJL = ((C1459010o4R) awS101S0210000_22.l0).LLLJL();
        if (interfaceC1459100o4aLLLJL != null) {
            interfaceC1459100o4aLLLJL.LJII((MusicModel) awS101S0210000_22.l1, LifecycleOwnerKt.getLifecycleScope((C1459010o4R) awS101S0210000_22.l0), awS101S0210000_22.z2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS101S0210000_22 r6) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS101S0210000_22.invoke$6(kotlin.jvm.internal.AwS101S0210000_22):java.lang.Object");
    }

    public static final Object invoke$7(AwS101S0210000_22 awS101S0210000_22) {
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession2;
        INLEMediaRuntime mediaRuntimeApi;
        Function0 function0 = (Function0) awS101S0210000_22.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C348100Dkm c348100DkmLIZLLL2 = ((C1452870nuX) awS101S0210000_22.l1).LIZJ().LIZLLL();
        if (c348100DkmLIZLLL2 != null && (iNLEMediaSession2 = c348100DkmLIZLLL2.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession2.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi.setPreviewFillMode(NLEPlayerPreviewMode.FILL);
        }
        if (awS101S0210000_22.z2 && (c348100DkmLIZLLL = ((C1452870nuX) awS101S0210000_22.l1).LIZJ().LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.play();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS101S0210000_22 awS101S0210000_22) {
        C1325710kbR[] c1325710kbRArrLIZIZ;
        C1324800kZy c1324800kZy = ((C113H) awS101S0210000_22.l0).LLJ;
        if (c1324800kZy != null) {
            String str = ((EffectModel) awS101S0210000_22.l1).iconUrl;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            boolean z = awS101S0210000_22.z2;
            if (!TextUtils.isEmpty(str)) {
                c1325710kbRArrLIZIZ = C1324780kZw.LIZIZ(config, str);
            } else {
                c1325710kbRArrLIZIZ = null;
            }
            C1324780kZw.LIZ(c1324800kZy, c1325710kbRArrLIZIZ, null, z, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C1450940nrQ c1450940nrQ, Bitmap bitmap, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1450940nrQ;
        this.l1 = bitmap;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C1450990nrV c1450990nrV, boolean z, INLEPlayer iNLEPlayer, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1450990nrV;
        this.z2 = z;
        this.l1 = iNLEPlayer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C1459010o4R c1459010o4R, boolean z, MusicModel musicModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1459010o4R;
        this.z2 = z;
        this.l1 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C1459960o5y c1459960o5y, boolean z, InterfaceC1452170ntP interfaceC1452170ntP, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1459960o5y;
        this.z2 = z;
        this.l1 = interfaceC1452170ntP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C1463020oAu c1463020oAu, AVMusic aVMusic, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1463020oAu;
        this.l1 = aVMusic;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C1465110oEH c1465110oEH, boolean z, MusicModel musicModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1465110oEH;
        this.z2 = z;
        this.l1 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(C113H c113h, EffectModel effectModel, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c113h;
        this.l1 = effectModel;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0210000_22(Function0 function0, Function0<Unit> function02, C1452870nuX c1452870nuX, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function0;
        this.l1 = function02;
        this.z2 = c1452870nuX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0210000_22(boolean z, C1457740o2O c1457740o2O, C1457830o2X c1457830o2X, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c1457740o2O;
        this.l1 = c1457830o2X;
    }
}
