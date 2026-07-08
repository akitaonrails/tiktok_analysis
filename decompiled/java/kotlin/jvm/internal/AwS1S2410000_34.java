package kotlin.jvm.internal;

import X.C09AY;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195011AvT;
import X.C2196371Axf;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS1S2410000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public boolean z6;

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

    public static final Object invoke$0(AwS1S2410000_34 awS1S2410000_34) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadPkgForJSB failed for schema: ");
        sbLIZ.append(awS1S2410000_34.s0);
        sbLIZ.append(", pkg: ");
        sbLIZ.append(awS1S2410000_34.s1);
        C1720106oR.LIZ("MiniGameRenderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        MiniGameRenderServiceImpl.LJII((AtomicBoolean) awS1S2410000_34.l4, (C2196371Axf) awS1S2410000_34.l5, awS1S2410000_34.z6, false, 301, (SchemaParserData) awS1S2410000_34.l2);
        C2195011AvT c2195011AvT = (C2195011AvT) ((WeakReference) awS1S2410000_34.l3).get();
        if (c2195011AvT != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("downloadPkgForJSB failed, pkg=");
            sbLIZ2.append(awS1S2410000_34.s1);
            c2195011AvT.LJIIIZ(301, C2188811AlT.LIZIZ(sbLIZ2), false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2410000_34 awS1S2410000_34) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadPkgForJSB failed for schema: ");
        sbLIZ.append(awS1S2410000_34.s0);
        sbLIZ.append(", pkg: ");
        sbLIZ.append(awS1S2410000_34.s1);
        C1720106oR.LIZ("MiniGameRenderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        MiniGameRenderServiceImpl.LJII((AtomicBoolean) awS1S2410000_34.l4, (C2196371Axf) awS1S2410000_34.l5, awS1S2410000_34.z6, false, 301, (SchemaParserData) awS1S2410000_34.l2);
        C2195011AvT c2195011AvT = (C2195011AvT) ((WeakReference) awS1S2410000_34.l3).get();
        if (c2195011AvT != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("downloadPkgForJSB failed, pkg=");
            sbLIZ2.append(awS1S2410000_34.s1);
            c2195011AvT.LJIIIZ(301, C2188811AlT.LIZIZ(sbLIZ2), false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S2410000_34(String str, String str2, String str3, SchemaParserData schemaParserData, WeakReference<C2195011AvT> weakReference, AtomicBoolean atomicBoolean, C2196371Axf c2196371Axf, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = schemaParserData;
        this.l4 = weakReference;
        this.l5 = atomicBoolean;
        this.z6 = c2196371Axf;
    }
}
