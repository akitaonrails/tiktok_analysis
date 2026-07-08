package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C346630DiP;
import X.C349910Dnh;
import X.C354570DvD;
import X.C356900Dyy;
import X.C357320Dze;
import X.C365960EWk;
import X.C372540Ej6;
import X.InterfaceC356810Dyp;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS89S0210000_5 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS89S0210000_5 awS89S0210000_5) {
        ((C372540Ej6) awS89S0210000_5.l0).LIZ((Function2) awS89S0210000_5.l1, awS89S0210000_5.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS89S0210000_5 awS89S0210000_5) {
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(((AwemeDraft) awS89S0210000_5.l0).LJIIJJI);
        NLEModel model = nLEEditorLIZ.getModel();
        if (model == null) {
            int i = C365960EWk.LIZ;
            boolean z = awS89S0210000_5.z2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEFeedbackLog updateNLEPath advanced EP skip: restore returned null model isSave=");
            sbLIZ.append(z);
            C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            NLEInfoModel nLEInfoModel = ((AwemeDraft) awS89S0210000_5.l0).LIZ.nleInfoModel;
            nLEInfoModel.nleModel = model;
            nLEInfoModel.nleDataChange = false;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS89S0210000_5.l1;
            if (videoPublishEditModel != null) {
                videoPublishEditModel.setNleDataChange(false);
            }
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS89S0210000_5.l1;
            if (videoPublishEditModel2 != null) {
                videoPublishEditModel2.setNleModel(NLEModel.dynamicCast(model.deepClone()));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS89S0210000_5 r18) {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS89S0210000_5.invoke$2(kotlin.jvm.internal.AwS89S0210000_5):java.lang.Object");
    }

    public static final Object invoke$3(AwS89S0210000_5 awS89S0210000_5) {
        if (awS89S0210000_5.z2) {
            InterfaceC356810Dyp interfaceC356810Dyp = ((C357320Dze) awS89S0210000_5.l0).LIZJ;
            if (interfaceC356810Dyp != null) {
                interfaceC356810Dyp.onProgress(100);
            }
            InterfaceC356810Dyp interfaceC356810Dyp2 = ((C357320Dze) awS89S0210000_5.l0).LIZJ;
            if (interfaceC356810Dyp2 != null) {
                interfaceC356810Dyp2.LIZIZ((C354570DvD) awS89S0210000_5.l1);
            }
            ((C357320Dze) awS89S0210000_5.l0).LIZJ = null;
        } else {
            InterfaceC356810Dyp interfaceC356810Dyp3 = ((C357320Dze) awS89S0210000_5.l0).LIZJ;
            if (interfaceC356810Dyp3 != null) {
                interfaceC356810Dyp3.LIZ(new C356900Dyy(-1, "magic_handler_error"));
            }
            ((C357320Dze) awS89S0210000_5.l0).LIZJ = null;
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS89S0210000_5(com.ss.android.ugc.aweme.draft.model.AwemeDraft r3, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.z2 = r5
            r1.l1 = r4
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z2 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS89S0210000_5.<init>(com.ss.android.ugc.aweme.draft.model.AwemeDraft, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS89S0210000_5(C372540Ej6 c372540Ej6, C372540Ej6 c372540Ej62, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c372540Ej6;
        this.l1 = c372540Ej62;
        this.z2 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0210000_5(boolean z, C357320Dze c357320Dze, C354570DvD c354570DvD, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c357320Dze;
        this.l1 = c354570DvD;
    }
}
