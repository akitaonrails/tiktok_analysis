package kotlin.jvm.internal;

import X.C09AY;
import X.C0T82;
import X.C0VSJ;
import X.C1897250zTH;
import X.C2268608ui;
import X.C2270208uy;
import X.C2284908xL;
import android.net.Uri;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS50S2100000_3 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS50S2100000_3 awS50S2100000_3) {
        C2284908xL c2284908xL = C2284908xL.LIZ;
        String str = awS50S2100000_3.s0;
        Uri uri = (Uri) awS50S2100000_3.l2;
        String str2 = awS50S2100000_3.s1;
        if (str2 == null) {
            str2 = "";
        }
        c2284908xL.getClass();
        C2284908xL.LIZ(uri, str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS50S2100000_3 awS50S2100000_3) {
        C2268608ui c2268608uiLJ = C2270208uy.LJ((VideoPublishEditModel) awS50S2100000_3.l2, "list");
        if (c2268608uiLJ == null) {
            return new C2268608ui(awS50S2100000_3.s0, false, awS50S2100000_3.s1, null, null, 15358);
        }
        return c2268608uiLJ;
    }

    public static final Object invoke$2(AwS50S2100000_3 awS50S2100000_3) {
        String str;
        String str2 = awS50S2100000_3.s0;
        if (str2 != null && str2.length() != 0 && (str = awS50S2100000_3.s1) != null && str.length() != 0 && C0T82.LIZ(new C0VSJ(((C1897250zTH) awS50S2100000_3.l2).LJIIIIZZ(), awS50S2100000_3.s0), awS50S2100000_3.s1)) {
            File fileLJI = ((C1897250zTH) awS50S2100000_3.l2).LJI(awS50S2100000_3.s1);
            C1897250zTH c1897250zTH = (C1897250zTH) awS50S2100000_3.l2;
            new AwS547S0100000_3(fileLJI, 151);
            c1897250zTH.getClass();
            if (fileLJI != null) {
                return fileLJI.getAbsolutePath();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S2100000_3(Uri uri, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = uri;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S2100000_3(VideoPublishEditModel videoPublishEditModel, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = videoPublishEditModel;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S2100000_3(String str, String str2, C1897250zTH c1897250zTH, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1897250zTH;
    }
}
