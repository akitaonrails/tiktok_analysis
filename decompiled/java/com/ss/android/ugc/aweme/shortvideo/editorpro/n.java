package com.ss.android.ugc.aweme.shortvideo.editorpro;

import X.C0ETY;
import X.C0LZD;
import X.C0MGL;
import X.C1441190nbh;
import X.C1631190sY9;
import X.C1631200sYA;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C351220Dpo;
import X.C558340Lv6;
import X.C579510Mo9;
import X.C580090Mp5;
import X.C580110Mp7;
import X.C580200MpG;
import X.C786410Ut5;
import X.InterfaceC1628590sTx;
import X.InterfaceC1630630sXF;
import X.InterfaceC1647420syK;
import X.InterfaceC1648870t0f;
import X.InterfaceC1650230t2r;
import X.InterfaceC1651080t4E;
import X.InterfaceC579700MoS;
import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS238S0000000_8;
import mn3.e0;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements InterfaceC579700MoS {
    public final ShortVideoContext LIZ;
    public final Activity LIZIZ;
    public final C580090Mp5 LIZJ;
    public final InterfaceC1647420syK LIZLLL;
    public final InterfaceC1650230t2r LJ;
    public final C1DRG LJFF;
    public final C1631190sY9 LJI;

    @Override // X.InterfaceC579700MoS
    public final boolean LIZ(C0LZD c0lzd) {
        File fileHo;
        int i;
        boolean z;
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.cameraComponentModel.isEditorProRecordMode || shortVideoContext.LJJJJIZL()) {
            CameraComponentModel cameraComponentModel = this.LIZ.cameraComponentModel;
            if (cameraComponentModel.editorProRecordEnableMusic || !cameraComponentModel.enableRecordingMp4) {
                return false;
            }
            Workspace workspace = cameraComponentModel.mWorkspace;
            String absolutePath = null;
            if (workspace != null) {
                fileHo = workspace.Ho();
            } else {
                fileHo = null;
            }
            if (fileHo != null && fileHo.exists()) {
                String strLIZ = C580200MpG.LIZ(this.LIZ);
                String absolutePath2 = fileHo.getAbsolutePath();
                NLEResType.VIDEO.swigValue();
                C558340Lv6 c558340Lv6LJFF = C351220Dpo.LJFF(absolutePath2);
                if (c558340Lv6LJFF.LJIIIIZZ <= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EditorProRecordGoNextHandler: mp4 ");
                    sbLIZ.append(fileHo.getAbsolutePath());
                    sbLIZ.append(" duration less than 0!");
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
                multiEditVideoRecordData.setThreadSafeSegmentDataList(new ArrayList());
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                multiEditVideoSegmentRecordData.videoPath = fileHo.getAbsolutePath();
                multiEditVideoSegmentRecordData.audioPath = "";
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                multiEditVideoSegmentRecordData.videoLength = timeUnit.toMicros(c558340Lv6LJFF.LJIIIIZZ);
                multiEditVideoSegmentRecordData.audioLength = 0L;
                multiEditVideoSegmentRecordData.width = c558340Lv6LJFF.LIZIZ;
                multiEditVideoSegmentRecordData.height = c558340Lv6LJFF.LIZJ;
                multiEditVideoSegmentRecordData.setStartTime(0L);
                multiEditVideoSegmentRecordData.setEndTime(timeUnit.toMicros(c558340Lv6LJFF.LJIIIIZZ));
                list.add(multiEditVideoSegmentRecordData);
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData;
                C1441190nbh c1441190nbhLIZIZ = this.LIZ.cameraComponentModel.LIZIZ();
                multiEditVideoStatusRecordData.editSegments = c1441190nbhLIZIZ;
                multiEditVideoStatusRecordData.videoMetaData = strLIZ;
                boolean zLJJJJIZL = this.LIZ.LJJJJIZL();
                RetakeVideoContext retakeVideoContextLJIIZILJ = this.LIZ.LJIIZILJ();
                if (retakeVideoContextLJIIZILJ != null) {
                    i = retakeVideoContextLJIIZILJ.retakeIndex;
                } else {
                    i = -1;
                }
                ShortVideoContext shortVideoContext2 = this.LIZ;
                if (zLJJJJIZL) {
                    RetakeVideoContext retakeVideoContextLJIIZILJ2 = shortVideoContext2.LJIIZILJ();
                    if (retakeVideoContextLJIIZILJ2 != null) {
                        z = retakeVideoContextLJIIZILJ2.isPip;
                    } else {
                        shortVideoContext2 = this.LIZ;
                        z = shortVideoContext2.cameraComponentModel.editorProRecordUsedForPip;
                    }
                } else {
                    z = shortVideoContext2.cameraComponentModel.editorProRecordUsedForPip;
                }
                if (zLJJJJIZL) {
                    this.LIZ.LJIIZILJ();
                }
                C580110Mp7 c580110Mp7 = new C580110Mp7(this.LIZ, false, multiEditVideoStatusRecordData, c1441190nbhLIZIZ, zLJJJJIZL, i, z);
                if (C1631200sYA.LIZ(this.LJI)) {
                    ((C0ETY) this.LJFF.LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS238S0000000_8(0));
                } else {
                    InterfaceC1630630sXF interfaceC1630630sXFLIZJ = this.LIZLLL.NV().LIZJ();
                    if (interfaceC1630630sXFLIZJ != null) {
                        interfaceC1630630sXFLIZJ.aD(8);
                    }
                }
                InterfaceC1651080t4E interfaceC1651080t4ELIZJ = this.LIZLLL.I42().LIZJ();
                if (interfaceC1651080t4ELIZJ != null) {
                    interfaceC1651080t4ELIZJ.Ee2();
                }
                InterfaceC1628590sTx interfaceC1628590sTxLIZJ = this.LIZLLL.NL1().LIZJ();
                if (interfaceC1628590sTxLIZJ != null) {
                    Boolean bool = Boolean.FALSE;
                    interfaceC1628590sTxLIZJ.Y7(bool, bool, bool);
                }
                InterfaceC1648870t0f interfaceC1648870t0fLIZJ = this.LIZLLL.ir2().LIZJ();
                if (interfaceC1648870t0fLIZJ != null) {
                    interfaceC1648870t0fLIZJ.showDockBar(false);
                }
                C0MGL c0mglLIZJ = this.LIZLLL.Vt2().LIZJ();
                if (c0mglLIZJ != null) {
                    c0mglLIZJ.GN2(false);
                }
                C786410Ut5.LJLLLLLL(8, this.LJ.getPreviewView());
                this.LIZJ.LIZ(new C579510Mo9(this.LIZIZ, c580110Mp7));
                return true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EditorProRecordGoNextHandler: mp4 ");
            if (fileHo != null) {
                absolutePath = fileHo.getAbsolutePath();
            }
            sbLIZ2.append(absolutePath);
            sbLIZ2.append(" not exists!");
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        return false;
    }

    public n(ShortVideoContext shortVideoContext, C19EG c19eg, C580090Mp5 c580090Mp5, InterfaceC1647420syK interfaceC1647420syK, e0 e0Var, C1DRG c1drg) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c19eg;
        this.LIZJ = c580090Mp5;
        this.LIZLLL = interfaceC1647420syK;
        this.LJ = e0Var;
        this.LJFF = c1drg;
        this.LJI = (C1631190sY9) c1drg.LJIIL("lazyControlProgressConfig", C1631190sY9.class);
    }
}
