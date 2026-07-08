package kotlin.jvm.internal;

import X.C09AY;
import X.C0MJ0;
import X.C0MJ5;
import X.C0PEM;
import X.C1397620mTQ;
import X.C1398350mUb;
import X.C1415050mvX;
import X.C1415130mvf;
import X.C1426005i6;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS2S2500000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S2500000_8 awS2S2500000_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131829676, new AwS3S2400000_8((String[]) awS2S2500000_8.l2, (String[]) awS2S2500000_8.l3, (C19EG) awS2S2500000_8.s0, (String) awS2S2500000_8.l4, (Function0<Unit>) awS2S2500000_8.l5, (ShortVideoContext) awS2S2500000_8.s1, (String) 0));
        c1397620mTQ.LJII(2131829675, new AwS93S1200000_8((Function0) awS2S2500000_8.l6, (Function0<Unit>) awS2S2500000_8.l5, (ShortVideoContext) awS2S2500000_8.s1, (String) 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2500000_8 awS2S2500000_8, Object obj) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1415050mvX c1415050mvX = C1415050mvX.LIZ;
        String str2 = awS2S2500000_8.s0;
        int i = !zBooleanValue ? 1 : 0;
        if (zBooleanValue) {
            str = null;
        } else {
            str = "apply_soundsync";
        }
        c1415050mvX.getClass();
        C1415050mvX.LIZIZ(i, str2, "apply_soundsync", str, null);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        String str3 = awS2S2500000_8.s1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DONE key=");
        sbLIZ.append(awS2S2500000_8.s0);
        sbLIZ.append(" success=");
        sbLIZ.append(zBooleanValue);
        C1426005i6.LIZ(c1398350mUb, str3, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC497601wk interfaceC497601wk = ((C1415130mvf) awS2S2500000_8.l2).LJ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C0MJ0(zBooleanValue, (C1415130mvf) awS2S2500000_8.l2, (Function0) awS2S2500000_8.l3, (EditPreviewInfo) awS2S2500000_8.l4, (VideoPublishEditModel) awS2S2500000_8.l5, (Function0) awS2S2500000_8.l6, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2500000_8(String str, String str2, C1415130mvf c1415130mvf, Function0 function0, EditPreviewInfo editPreviewInfo, VideoPublishEditModel videoPublishEditModel, C0MJ5 c0mj5, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1415130mvf;
        this.l3 = function0;
        this.l4 = editPreviewInfo;
        this.l5 = videoPublishEditModel;
        this.l6 = c0mj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S2500000_8(String[] strArr, String[] strArr2, C19EG c19eg, String str, Function0<Unit> function0, ShortVideoContext shortVideoContext, String str2, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l2 = strArr;
        this.l3 = strArr2;
        this.s0 = c19eg;
        this.l4 = str;
        this.l5 = function0;
        this.s1 = shortVideoContext;
        this.l6 = str2;
    }
}
