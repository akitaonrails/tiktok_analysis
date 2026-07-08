package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C09N5;
import X.C0CHQ;
import X.C0E6Y;
import X.C0EI4;
import X.C0EI8;
import X.C0F8Z;
import X.C0FMO;
import X.C0FMR;
import X.C0XF1;
import X.C1390380mHk;
import X.C13TS;
import X.C13TV;
import X.C1452610nu7;
import X.C1664680tQA;
import X.C19EG;
import X.C20137413qm;
import X.C2188811AlT;
import X.C2471909mP;
import X.C351010DpT;
import X.C354090DuR;
import X.C355090Dw3;
import X.C361850EGp;
import X.C361980EHc;
import X.C365840EVy;
import X.C370820EgK;
import X.C785410UrT;
import X.C790050Uyx;
import X.InterfaceC354120DuU;
import X.InterfaceC359850E8x;
import X.InterfaceC371190Egv;
import X.ProgressDialogC1399790mWv;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS122S1200000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS122S1200000_5 awS122S1200000_5) {
        ((C0FMR) awS122S1200000_5.l1).LIZJ(awS122S1200000_5.s0, (C0FMO) awS122S1200000_5.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS122S1200000_5 r11) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS122S1200000_5.invoke$1(kotlin.jvm.internal.AwS122S1200000_5):java.lang.Object");
    }

    public static final Object invoke$2(AwS122S1200000_5 awS122S1200000_5) {
        C0F8Z c0f8z = (C0F8Z) awS122S1200000_5.l1;
        AwS122S1200000_5 awS122S1200000_52 = new AwS122S1200000_5(c0f8z, (C0F8Z) awS122S1200000_5.l2, (C1664680tQA<TextStickerModel>) awS122S1200000_5.s0, (String) 1);
        c0f8z.getClass();
        awS122S1200000_52.invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS122S1200000_5 awS122S1200000_5) {
        if (!((EditorProTTSHelper) awS122S1200000_5.l1).LLIZLLLIL) {
            ((Function1) awS122S1200000_5.l2).invoke(Boolean.FALSE);
            if (!C790050Uyx.LIZ(C0CHQ.LIZ)) {
                C19EG c19eg = ((EditorProTTSHelper) awS122S1200000_5.l1).LL;
                if (c19eg != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829876);
                    C1390380mHk.LIZ(c19eg, 6001, creativeToastBuilder);
                }
            } else {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                String str = awS122S1200000_5.s0;
                if (str != null && !TextUtils.isEmpty(str)) {
                    creativeToastBuilder2.message(awS122S1200000_5.s0);
                } else {
                    creativeToastBuilder2.messageRes(2131850137);
                }
                C19EG c19eg2 = ((EditorProTTSHelper) awS122S1200000_5.l1).LL;
                if (c19eg2 != null) {
                    C1390380mHk.LIZ(c19eg2, 1041, creativeToastBuilder2);
                }
            }
            ProgressDialogC1399790mWv progressDialogC1399790mWv = ((EditorProTTSHelper) awS122S1200000_5.l1).LLILZLL;
            if (progressDialogC1399790mWv != null) {
                progressDialogC1399790mWv.dismiss();
                C785410UrT.LIZ(progressDialogC1399790mWv);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS122S1200000_5 awS122S1200000_5) {
        long jLJ;
        boolean mainTrack;
        boolean mainTrack2;
        Uri uriLJIILIIL = C2471909mP.LJIILIIL(((NLETrackSlot) awS122S1200000_5.l1).getMainSegment().getResource().getResourceFile());
        C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
        String strLIZ = C09N5.LIZ(C351010DpT.LIZ().LIZ(), uriLJIILIIL);
        String str = awS122S1200000_5.s0;
        if (str != null) {
            C0E6Y c0e6y = (C0E6Y) awS122S1200000_5.l2;
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            jLJ = C354090DuR.LJ(c0e6y.LIZ, str);
        } else {
            jLJ = 0;
        }
        C20137413qm c20137413qm = C20137413qm.LIZ;
        boolean zLIZJ = C20137413qm.LIZJ(strLIZ);
        long jLJIIIZ = C2471909mP.LJIIIZ(strLIZ);
        if (zLIZJ) {
            C1452610nu7 c1452610nu7LIZ = c20137413qm.LIZ(strLIZ);
            C0EI4 c0ei4 = C0EI4.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) ((C0E6Y) awS122S1200000_5.l2).LJI.getValue();
            int i = c1452610nu7LIZ.LIZ;
            int i2 = c1452610nu7LIZ.LIZIZ;
            NLETrack nLETrackPt = ((C0E6Y) awS122S1200000_5.l2).LIZ.Pt();
            if (nLETrackPt != null) {
                mainTrack2 = nLETrackPt.getMainTrack();
            } else {
                mainTrack2 = false;
            }
            c0ei4.getClass();
            C0EI4.LJIIIZ(videoPublishEditModel, jLJ, zLIZJ, i, i2, -1, -1, jLJIIIZ, mainTrack2);
        } else {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(strLIZ);
            if (videoFileInfo != null) {
                C0EI4 c0ei42 = C0EI4.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) ((C0E6Y) awS122S1200000_5.l2).LJI.getValue();
                int i3 = videoFileInfo.width;
                int i4 = videoFileInfo.height;
                int i5 = videoFileInfo.fps;
                int i6 = videoFileInfo.duration;
                NLETrack nLETrackPt2 = ((C0E6Y) awS122S1200000_5.l2).LIZ.Pt();
                if (nLETrackPt2 != null) {
                    mainTrack = nLETrackPt2.getMainTrack();
                } else {
                    mainTrack = false;
                }
                c0ei42.getClass();
                C0EI4.LJIIIZ(videoPublishEditModel2, jLJ, true, i3, i4, i5, i6, jLJIIIZ, mainTrack);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS122S1200000_5 awS122S1200000_5) {
        C361980EHc c361980EHcLIZ = ((C0EI8) awS122S1200000_5.l1).LIZ(awS122S1200000_5.s0).LIZ();
        InterfaceC359850E8x interfaceC359850E8x = (InterfaceC359850E8x) awS122S1200000_5.l2;
        if (interfaceC359850E8x != null) {
            interfaceC359850E8x.LIZJ(awS122S1200000_5.s0, c361980EHcLIZ, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS122S1200000_5 awS122S1200000_5) {
        ((InterfaceC359850E8x) awS122S1200000_5.l1).LIZJ(awS122S1200000_5.s0, (C361980EHc) awS122S1200000_5.l2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Egu] */
    public static final Object invoke$7(AwS122S1200000_5 awS122S1200000_5) {
        try {
            C13TV c13tv = C13TS.LIZ;
            String str = awS122S1200000_5.s0;
            final Bitmap bitmap = (Bitmap) awS122S1200000_5.l2;
            C13TS.LIZIZ(str, new InterfaceC371190Egv() { // from class: X.0Egu
                @Override // X.InterfaceC371190Egv
                public final boolean LIZ(File file) {
                    C2112908Pn c2112908Pn = C2112908Pn.LIZ;
                    return C2112908Pn.LIZJ(bitmap, file, Bitmap.CompressFormat.JPEG);
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("success to obtain bitmap with ");
            sbLIZ.append((C370820EgK) awS122S1200000_5.l1);
            C355090Dw3.LIZIZ("VideoFrameCache", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Disk cache exception ");
            sbLIZ2.append(e.getMessage());
            C355090Dw3.LIZLLL("VideoFrameCache", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS122S1200000_5 awS122S1200000_5) {
        if (!C0XF1.LIZLLL(C0CHQ.LIZ)) {
            Activity activityLJIIIZ = ((C361850EGp) awS122S1200000_5.l1).LJIIIZ();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131826911);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activityLJIIIZ, 6001, creativeToastBuilder);
        } else if (!((C361850EGp) awS122S1200000_5.l1).LJIJ()) {
            ((C361850EGp) awS122S1200000_5.l1).LJIJI(awS122S1200000_5.s0, false);
        }
        ((Function0) awS122S1200000_5.l2).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1200000_5(C0EI8 c0ei8, InterfaceC359850E8x interfaceC359850E8x, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0ei8;
        this.s0 = "bottom_item_edit_adjust_filter";
        this.l2 = interfaceC359850E8x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1200000_5(InterfaceC359850E8x interfaceC359850E8x, String str, C361980EHc c361980EHc, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC359850E8x;
        this.s0 = str;
        this.l2 = c361980EHc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S1200000_5(C361850EGp c361850EGp, C361850EGp c361850EGp2, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = c361850EGp;
        this.s0 = c361850EGp2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S1200000_5(C0F8Z c0f8z, C0F8Z c0f8z2, C1664680tQA<TextStickerModel> c1664680tQA, String str) {
        super(0);
        this.$t = str;
        this.l1 = c0f8z;
        this.l2 = c0f8z2;
        this.s0 = c1664680tQA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1200000_5(C0FMR c0fmr, String str, C0FMO c0fmo, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0fmr;
        this.s0 = str;
        this.l2 = c0fmo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1200000_5(NLETrackSlot nLETrackSlot, String str, C0E6Y c0e6y, int i) {
        super(0);
        this.$t = i;
        this.l1 = nLETrackSlot;
        this.s0 = str;
        this.l2 = c0e6y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S1200000_5(EditorProTTSHelper editorProTTSHelper, EditorProTTSHelper editorProTTSHelper2, Function1<? super Boolean, Unit> function1, String str) {
        super(0);
        this.$t = str;
        this.l1 = editorProTTSHelper;
        this.l2 = editorProTTSHelper2;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1200000_5(String str, C370820EgK c370820EgK, Bitmap bitmap, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c370820EgK;
        this.l2 = bitmap;
    }
}
