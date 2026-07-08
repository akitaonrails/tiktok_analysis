package kotlin.jvm.internal;

import X.C013C;
import X.C098200Yq;
import X.C09AY;
import X.C0M2T;
import X.C0M5N;
import X.C13LP;
import X.C1404610meh;
import X.C1431070nLN;
import X.C1433610nPT;
import X.C1434970nRf;
import X.C1436440nU2;
import X.C1452090ntH;
import X.C1453160nv0;
import X.C189200o6;
import X.C538590LAj;
import X.C540370LHf;
import X.InterfaceC1452170ntP;
import X.InterfaceC540360LHe;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.story.ICStoryService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lth.o;

/* JADX INFO: loaded from: classes23.dex */
public class AwS24S0401000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final Object invoke$0(AwS24S0401000_22 awS24S0401000_22) {
        if (((C013C) awS24S0401000_22.l0).element) {
            InterfaceC1452170ntP interfaceC1452170ntPO4 = ((C1452090ntH) awS24S0401000_22.l1).O4();
            if (interfaceC1452170ntPO4 != null) {
                interfaceC1452170ntPO4.setBackgroundColor(awS24S0401000_22.i4);
            }
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiterC3 = ((C1452090ntH) awS24S0401000_22.l1).c3();
            if (vEEditorAutoStartStopArbiterC3 != null) {
                vEEditorAutoStartStopArbiterC3.LIZJ(false, ((C013C) awS24S0401000_22.l2).element, false);
            }
        }
        ?? r0 = ((C1453160nv0) awS24S0401000_22.l3).LJIIL;
        if (r0 != 0) {
            r0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0401000_22 awS24S0401000_22) {
        Object c098200Yq;
        Object next;
        PublishModel publishModel;
        ICStoryService iCStoryServiceStoryService;
        IStoryPublishService iStoryPublishServiceStoryPublishService;
        Iterator<Object> it2 = ((C1404610meh) awS24S0401000_22.l0).LIZ.iterator();
        while (true) {
            c098200Yq = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1434970nRf) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C1434970nRf)) {
            next = null;
        }
        C1434970nRf c1434970nRf = (C1434970nRf) next;
        if (c1434970nRf != null && (publishModel = c1434970nRf.LIZ) != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS24S0401000_22.l2;
            List<String> listLIZIZ = C1433610nPT.LIZIZ(videoPublishEditModel);
            publishModel.videoCoverPaths = listLIZIZ;
            String str = (String) C13LP.LJJJLL(listLIZIZ);
            if (str != null && str.length() > 0) {
                try {
                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                    if (iExternalService != null && (iCStoryServiceStoryService = iExternalService.storyService()) != null && (iStoryPublishServiceStoryPublishService = iCStoryServiceStoryService.storyPublishService()) != null) {
                        iStoryPublishServiceStoryPublishService.updatePreviewCoverPath(videoPublishEditModel.getCreationId(), str);
                        c098200Yq = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        final C1436440nU2 c1436440nU2 = (C1436440nU2) awS24S0401000_22.l1;
        final VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS24S0401000_22.l2;
        int i = awS24S0401000_22.i4;
        final C1431070nLN c1431070nLN = (C1431070nLN) awS24S0401000_22.l3;
        c1436440nU2.getClass();
        C0M5N c0m5n = C0M5N.LIZ;
        C540370LHf c540370LHf = new C540370LHf(new C538590LAj(videoPublishEditModel2, new C0M2T(true, "SaveDraftBeforePublishTask", null, i, true, 8), false), new InterfaceC540360LHe() { // from class: X.0nUq
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveDraft failed, creationId=");
                sbLIZ.append(videoPublishEditModel2.getCreationId());
                sbLIZ.append(", result=");
                sbLIZ.append(c540340LHc.LIZ);
                C201955140j.LJIJJ(c830690WiJ, "SaveDraftBeforePublishTask", C2188811AlT.LIZIZ(sbLIZ));
                C1431070nLN c1431070nLN2 = c1431070nLN;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("saveDraftBeforePublish failed: ");
                sbLIZ2.append(c540340LHc.LIZ);
                c1431070nLN2.LIZLLL(777006, new C1431180nLY(C2188811AlT.LIZIZ(sbLIZ2), null));
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) {
                Activity activityLIZIZ;
                C19EG c19egLIZIZ;
                try {
                    C1436440nU2 c1436440nU22 = c1436440nU2;
                    VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                    AwemeDraft awemeDraft = c540340LHc.LIZIZ;
                    c1436440nU22.getClass();
                    o.LJJ.LJIIIIZZ().LIZ().LJFF(awemeDraft);
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
                        new C1439160nYQ(c19egLIZIZ, new C1421880n6Y(c19egLIZIZ, videoPublishEditModel3)).LIZ(awemeDraft);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C201955140j.LJIIIZ(C830690WiJ.LIZIZ, "SaveDraftBeforePublishTask", "fire side effects failed", th2);
                }
                videoPublishEditModel2.creativeModel.draftInfoModel.saveDraftRoutedToWaveDag = false;
                c1431070nLN.LJ(c540340LHc.LIZIZ, false);
            }
        });
        c0m5n.getClass();
        C0M5N.LIZ(c540370LHf);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0401000_22(int i, C1452090ntH c1452090ntH, C1453160nv0 c1453160nv0, C013C c013c, C013C c013c2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c013c;
        this.l1 = c1452090ntH;
        this.i4 = i;
        this.l2 = c013c2;
        this.l3 = c1453160nv0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0401000_22(C1404610meh c1404610meh, C1436440nU2 c1436440nU2, VideoPublishEditModel videoPublishEditModel, int i, C1431070nLN c1431070nLN, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1404610meh;
        this.l1 = c1436440nU2;
        this.l2 = videoPublishEditModel;
        this.i4 = i;
        this.l3 = c1431070nLN;
    }
}
