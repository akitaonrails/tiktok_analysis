package kotlin.jvm.internal;

import X.AbstractC551020LjI;
import X.C098200Yq;
import X.C09AY;
import X.C0FQS;
import X.C0LAB;
import X.C0LDE;
import X.C0LDJ;
import X.C0ME9;
import X.C0MEC;
import X.C189200o6;
import X.C2486109oh;
import X.C2487409ou;
import X.C259800zU;
import X.C381330ExH;
import X.C381350ExJ;
import X.C470601sO;
import X.C550580Lia;
import X.C564410MBr;
import X.C565060MEe;
import X.C576730Mjf;
import X.C786410Ut5;
import X.InterfaceC537900L7s;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AwS124S1200000_8 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS124S1200000_8 awS124S1200000_8) {
        Iterator<InterfaceC537900L7s> it2 = ((C0FQS) awS124S1200000_8.l1).LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(awS124S1200000_8.s0, (C381350ExJ) awS124S1200000_8.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS124S1200000_8 awS124S1200000_8) {
        Iterator<InterfaceC537900L7s> it2 = ((C0FQS) awS124S1200000_8.l1).LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(awS124S1200000_8.s0, (C381330ExH) awS124S1200000_8.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS124S1200000_8 awS124S1200000_8) {
        Function0<Unit> function0H3 = ((C0ME9) awS124S1200000_8.l1).H3(((AILiveDialogConfigList.AILiveDialogConfig) awS124S1200000_8.l2).action);
        if (function0H3 != null) {
            function0H3.invoke();
        }
        if (Intrinsics.LJFF(((AILiveDialogConfigList.AILiveDialogConfig) awS124S1200000_8.l2).action, C0MEC.FAIL_QUOTA.getValue())) {
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = ((C0ME9) awS124S1200000_8.l1).getEditModel();
            c564410MBr.getClass();
            C564410MBr.LJIIZILJ(editModel, "notify_me");
        } else {
            C564410MBr c564410MBr2 = C564410MBr.LIZ;
            VideoPublishEditModel editModel2 = ((C0ME9) awS124S1200000_8.l1).getEditModel();
            String str = awS124S1200000_8.s0;
            c564410MBr2.getClass();
            C564410MBr.LJIIL(1, editModel2, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS124S1200000_8 awS124S1200000_8) {
        if (Intrinsics.LJFF(((AILiveDialogConfigList.AILiveDialogConfig) awS124S1200000_8.l1).action, C0MEC.FAIL_QUOTA.getValue())) {
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = ((C0ME9) awS124S1200000_8.l2).getEditModel();
            c564410MBr.getClass();
            C564410MBr.LJIIZILJ(editModel, "not_now");
        } else {
            C564410MBr c564410MBr2 = C564410MBr.LIZ;
            VideoPublishEditModel editModel2 = ((C0ME9) awS124S1200000_8.l2).getEditModel();
            String str = awS124S1200000_8.s0;
            c564410MBr2.getClass();
            C564410MBr.LJIIL(0, editModel2, str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$4(AwS124S1200000_8 awS124S1200000_8) {
        C576730Mjf.LJIIJJI("CameraLayoutNLECompiler", "startPhotoCompile onCompileDone");
        ((C0LDE) awS124S1200000_8.l1).LJFF(awS124S1200000_8.s0);
        C0LDE.LJIIJJI.put(((C0LDE) awS124S1200000_8.l1).LIZ.getCreationId(), (Pair<String, List<MediaModel>>) ((C259800zU) awS124S1200000_8.l2).element);
        C0LDJ c0ldj = C0LDJ.LIZ;
        C0LAB c0lab = ((C0LDE) awS124S1200000_8.l1).LJIIJ;
        c0ldj.getClass();
        C0LDJ.LJI(c0lab);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS124S1200000_8 awS124S1200000_8) {
        ((C565060MEe) awS124S1200000_8.l1).LIZJ();
        final Function0 function0 = (Function0) awS124S1200000_8.l2;
        final C565060MEe c565060MEe = (C565060MEe) awS124S1200000_8.l1;
        final String str = awS124S1200000_8.s0;
        final String str2 = "feed";
        C2487409ou.LIZLLL(200L, new Runnable() { // from class: X.0MEh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AILiveService@d7b2.showFirstGuide$guideConfig$2$1");
                try {
                    function0.invoke();
                    C564410MBr c564410MBr = C564410MBr.LIZ;
                    String str3 = str2;
                    String str4 = c565060MEe.LIZIZ;
                    String str5 = str;
                    c564410MBr.getClass();
                    C564410MBr.LJIILL(null, null, "proceed", str3, str4, str5);
                    C0M8O.LIZ.getClass();
                    C0M8O.LJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AILiveService@d7b2.showFirstGuide$guideConfig$2$1");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS124S1200000_8 awS124S1200000_8) {
        int i;
        if (C2486109oh.LIZIZ(awS124S1200000_8.s0)) {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) awS124S1200000_8.l1;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(TEVideoUtils.nativeCheckMp3File(awS124S1200000_8.s0)));
            }
        } else {
            IAVInfoService.IGetInfoCallback iGetInfoCallback2 = (IAVInfoService.IGetInfoCallback) awS124S1200000_8.l1;
            if (iGetInfoCallback2 != null) {
                if (C2486109oh.LIZLLL((Context) awS124S1200000_8.l2, awS124S1200000_8.s0)) {
                    i = 0;
                } else {
                    i = -1;
                }
                iGetInfoCallback2.finish(Integer.valueOf(i));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS124S1200000_8 awS124S1200000_8) throws JSONException {
        Object c098200Yq;
        JSONObject jSONObject;
        C470601sO c470601sO = C470601sO.LIZ;
        AbstractC551020LjI abstractC551020LjI = (AbstractC551020LjI) awS124S1200000_8.l1;
        String str = awS124S1200000_8.s0;
        Function1 function1 = (Function1) awS124S1200000_8.l2;
        try {
            String strLIZJ = abstractC551020LjI.LIZJ();
            if (strLIZJ != null && strLIZJ.length() != 0) {
                jSONObject = new JSONObject(abstractC551020LjI.LIZJ());
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("client_task_id", str);
            function1.invoke(jSONObject);
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof CancellationException)) {
                c470601sO.getClass();
                C470601sO.LIZ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                throw th;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = awS124S1200000_8.s0;
        Function1 function12 = (Function1) awS124S1200000_8.l2;
        jSONObject2.put("client_task_id", str2);
        function12.invoke(jSONObject2);
        String strJ3 = C786410Ut5.J3(jSONObject2);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = strJ3;
        }
        return ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(c098200Yq);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS124S1200000_8(X.C0ME9 r3, com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList.AILiveDialogConfig r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 2 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS124S1200000_8.<init>(X.0ME9, com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList$AILiveDialogConfig, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1200000_8(C0FQS c0fqs, String str, C381330ExH c381330ExH, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0fqs;
        this.s0 = str;
        this.l2 = c381330ExH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1200000_8(C0FQS c0fqs, String str, C381350ExJ c381350ExJ, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0fqs;
        this.s0 = str;
        this.l2 = c381350ExJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S1200000_8(C0LDE c0lde, C0LDE c0lde2, String str, C259800zU<Pair<String, List<MediaModel>>> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l1 = c0lde;
        this.s0 = c0lde2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S1200000_8(AbstractC551020LjI abstractC551020LjI, AbstractC551020LjI<C550580Lia<T>> abstractC551020LjI2, String str, Function1<? super JSONObject, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = abstractC551020LjI;
        this.s0 = abstractC551020LjI2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1200000_8(C565060MEe c565060MEe, String str, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l1 = c565060MEe;
        this.l2 = function0;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1200000_8(Context context, String str, IAVInfoService.IGetInfoCallback iGetInfoCallback, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = iGetInfoCallback;
        this.l2 = context;
    }
}
