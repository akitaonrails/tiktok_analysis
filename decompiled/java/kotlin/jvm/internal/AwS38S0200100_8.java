package kotlin.jvm.internal;

import X.C09AY;
import X.C536880L3u;
import X.C536890L3v;
import X.C537840L7m;
import android.content.Intent;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS38S0200100_8 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS38S0200100_8 awS38S0200100_8) {
        ((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).trackReadMetaDataDuration(awS38S0200100_8.j2);
        ((MvChoosePhotoScene) awS38S0200100_8.l0).X((Function1) awS38S0200100_8.l1, true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S0200100_8 awS38S0200100_8) {
        C536880L3u c536880L3uLIZ = ((C536880L3u) awS38S0200100_8.l0).LIZ();
        c536880L3uLIZ.LIZLLL = System.currentTimeMillis() - awS38S0200100_8.j2;
        C536890L3v c536890L3v = C536890L3v.LIZ;
        CutsameDataItem cutsameDataItem = ((C537840L7m) awS38S0200100_8.l1).LIZIZ;
        String str = cutsameDataItem.templateUrl;
        String strValueOf = String.valueOf(cutsameDataItem.md5);
        c536890L3v.getClass();
        C536890L3v.LIZJ(c536880L3uLIZ, str, strValueOf);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0200100_8(long j, C537840L7m c537840L7m, C536880L3u c536880L3u, int i) {
        super(0);
        this.$t = i;
        this.l0 = c536880L3u;
        this.j2 = j;
        this.l1 = c537840L7m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS38S0200100_8) (LINE:67174403) kotlin.jvm.internal.AwS38S0200100_8.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS38S0200100_8) (LINE:67174405) kotlin.jvm.internal.AwS38S0200100_8.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS38S0200100_8] */
    public AwS38S0200100_8(long j, long j2, MvChoosePhotoScene mvChoosePhotoScene, Function1<? super Intent, Unit> function1) {
        long j3;
        Object obj;
        c09ay.$t = function1;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = mvChoosePhotoScene;
        ?? c09ay = new C09AY(0);
    }
}
