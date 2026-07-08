package kotlin.jvm.internal;

import X.C09AY;
import X.C550560LiY;
import X.C551030LjJ;
import X.C552770Lm7;
import com.ss.android.ugc.aweme.autopick.api.AutoPickServiceApi;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS7S0220000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

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

    /* JADX WARN: Removed duplicated region for block: B:110:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0469 A[EDGE_INSN: B:132:0x0469->B:72:0x0469 BREAK  A[LOOP:0: B:66:0x044d->B:133:0x044d]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS7S0220000_8 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S0220000_8.invoke$0(kotlin.jvm.internal.AwS7S0220000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS7S0220000_8 awS7S0220000_8, Object obj) {
        CreativeInfo creativeInfo = (CreativeInfo) awS7S0220000_8.l0;
        boolean z = awS7S0220000_8.z2;
        boolean z2 = awS7S0220000_8.z3;
        C550560LiY c550560LiY = (C550560LiY) awS7S0220000_8.l1;
        return C551030LjJ.LIZIZ((C552770Lm7) obj, creativeInfo, z, z2, c550560LiY, new AwS587S0100000_8(c550560LiY, 696));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0220000_8(CreativeInfo creativeInfo, boolean z, boolean z2, C550560LiY c550560LiY, int i) {
        super(1);
        this.$t = i;
        this.l0 = creativeInfo;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = c550560LiY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0220000_8(boolean z, MvChoosePhotoScene mvChoosePhotoScene, boolean z2, AutoPickServiceApi autoPickServiceApi, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = mvChoosePhotoScene;
        this.z3 = z2;
        this.l1 = autoPickServiceApi;
    }
}
