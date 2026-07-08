package kotlin.jvm.internal;

import X.AbstractC214814194y;
import X.C09AY;
import X.C0L4W;
import X.C0L53;
import X.C0MES;
import X.C0MUK;
import X.C0VSJ;
import X.C1403010mc7;
import X.C1417310mzB;
import X.C19A3;
import X.C1DRG;
import X.C2188811AlT;
import X.C2487409ou;
import X.C524780Ki4;
import X.C538330L9j;
import X.C564410MBr;
import X.C565310MFd;
import X.C570490MZb;
import X.C573020Mdg;
import X.C786410Ut5;
import X.EnumC1412640mre;
import X.InterfaceC573150Mdt;
import X.InterfaceC578430MmP;
import Y.ARunnableS8S1300000_8;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS35S1400000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS35S1400000_8 awS35S1400000_8) {
        Bundle bundleBJ2;
        float f;
        Pair pair;
        ((C0L4W) awS35S1400000_8.l1).exit();
        C1417310mzB c1417310mzB = (C1417310mzB) awS35S1400000_8.l2;
        NLEModel nLEModel = c1417310mzB.LJII;
        if (nLEModel != null) {
            C1DRG c1drg = (C1DRG) awS35S1400000_8.l3;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS35S1400000_8.l4;
            String str = awS35S1400000_8.s0;
            AbstractC214814194y abstractC214814194y = (AbstractC214814194y) c1drg.LJII(AbstractC214814194y.class, null);
            InterfaceC578430MmP interfaceC578430MmP = (InterfaceC578430MmP) c1drg.LJIIL(null, InterfaceC578430MmP.class);
            if ((interfaceC578430MmP != null && (bundleBJ2 = interfaceC578430MmP.BJ2()) != null) || (bundleBJ2 = abstractC214814194y.mArguments) != null) {
                if (c1417310mzB.LIZJ == EnumC1412640mre.CUT_SAME.getValue() && !c1417310mzB.LIZ()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                bundleBJ2.putFloat("voice_volume", f);
                C0L53.LIZ.getClass();
                CreativeModel creativeModelLIZJ = C0MUK.LIZJ(bundleBJ2);
                creativeModelLIZJ.creationTypeModel.creationMode = 1;
                NLEInfoModel nLEInfoModel = creativeModelLIZJ.nleInfoModel;
                s sVar = s.LIZ;
                int value = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
                sVar.getClass();
                nLEInfoModel.nleData = s.LJJLIIIJJIZ(nLEModel, value);
                int[] importVideoSize = AVSettingsWrapper.getImportVideoSize();
                if (importVideoSize != null && importVideoSize.length == 2) {
                    pair = new Pair(Integer.valueOf(importVideoSize[0]), Integer.valueOf(importVideoSize[1]));
                } else {
                    pair = new Pair(1920, 1080);
                }
                VideoFileInfo videoFileInfo = new VideoFileInfo(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), nLEModel.getDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(s.LJIIL(videoPublishEditModel.getCreativeInfo()));
                sbLIZ.append(s.LJJII());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C570490MZb.LJI(new C0VSJ(strLIZIZ));
                creativeModelLIZJ.editModel.editPreviewInfo = new C538330L9j(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null) {
                    if (str != null) {
                        Workspace workspace = videoPublishEditModel.getWorkspace();
                        if (workspace != null) {
                            workspace.MC(str);
                        }
                        C786410Ut5.LJJIJL(bundleBJ2, "workspace", videoPublishEditModel.getWorkspace());
                    }
                    C786410Ut5.LJJJI("path", videoPublishEditModel.getMMusicPath(), bundleBJ2);
                    C786410Ut5.LJJIZ(bundleBJ2, "music_model", C1403010mc7.LIZ.getMusicService().transformAVMusic(aVMusicExtractAVMusic));
                    C786410Ut5.LJJJI("music_origin", "auto_cut_music_recommend", bundleBJ2);
                    bundleBJ2.putBoolean("extra_need_add_recent", true);
                    C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aVMusicExtractAVMusic.getMusicId(), bundleBJ2);
                }
                C565310MFd.LIZJ(abstractC214814194y, bundleBJ2, true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S1400000_8 awS35S1400000_8) {
        C0MES c0mes = C0MES.LIZ;
        C19A3 c19a3 = (C19A3) awS35S1400000_8.l1;
        c0mes.getClass();
        C0MES.LIZLLL(c19a3);
        C2487409ou.LIZLLL(200L, new ARunnableS8S1300000_8((ShortVideoContext) awS35S1400000_8.l4, (Function0) awS35S1400000_8.l2, (VideoPublishEditModel) awS35S1400000_8.l3, awS35S1400000_8.s0, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS35S1400000_8 awS35S1400000_8) {
        C0MES c0mes = C0MES.LIZ;
        C19A3 c19a3 = (C19A3) awS35S1400000_8.l1;
        c0mes.getClass();
        C0MES.LIZLLL(c19a3);
        Function0 function0 = (Function0) awS35S1400000_8.l2;
        if (function0 != null) {
            function0.invoke();
        }
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS35S1400000_8.l3;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS35S1400000_8.l4;
        String str = awS35S1400000_8.s0;
        c564410MBr.getClass();
        C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "cancel", str, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS35S1400000_8 awS35S1400000_8) {
        C0MES c0mes = C0MES.LIZ;
        C19A3 c19a3 = (C19A3) awS35S1400000_8.l1;
        c0mes.getClass();
        C0MES.LIZLLL(c19a3);
        Function0 function0 = (Function0) awS35S1400000_8.l2;
        if (function0 != null) {
            function0.invoke();
        }
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS35S1400000_8.l3;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS35S1400000_8.l4;
        String str = awS35S1400000_8.s0;
        c564410MBr.getClass();
        C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "reject", str, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS35S1400000_8 awS35S1400000_8) {
        C524780Ki4.LIZ.step("av_image_edit", "end downloadEffectTemplateAsset");
        InterfaceC573150Mdt interfaceC573150Mdt = ((C573020Mdg) awS35S1400000_8.l1).LJIIJ;
        if (interfaceC573150Mdt != null) {
            interfaceC573150Mdt.onFinish(true);
        }
        ((C573020Mdg) awS35S1400000_8.l1).LIZIZ((MvCreateVideoData) awS35S1400000_8.l2, (Pair) awS35S1400000_8.l3, (ArrayList) awS35S1400000_8.l4, awS35S1400000_8.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1400000_8(C0L4W c0l4w, C1417310mzB c1417310mzB, C1DRG c1drg, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0l4w;
        this.l2 = c1417310mzB;
        this.l3 = c1drg;
        this.l4 = videoPublishEditModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S1400000_8(C573020Mdg c573020Mdg, C573020Mdg c573020Mdg2, MvCreateVideoData mvCreateVideoData, Pair<Integer, Integer> pair, ArrayList<MediaModel> arrayList, String str) {
        super(0);
        this.$t = str;
        this.l1 = c573020Mdg;
        this.l2 = c573020Mdg2;
        this.l3 = mvCreateVideoData;
        this.l4 = pair;
        this.s0 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S1400000_8(C19A3 c19a3, C19A3 c19a32, Function0<Unit> function0, VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, String str) {
        super(0);
        this.$t = str;
        this.l1 = c19a3;
        this.l2 = c19a32;
        this.l3 = function0;
        this.l4 = videoPublishEditModel;
        this.s0 = shortVideoContext;
    }
}
