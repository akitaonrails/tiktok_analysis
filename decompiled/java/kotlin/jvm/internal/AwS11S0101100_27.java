package kotlin.jvm.internal;

import X.C09AY;
import X.C1001850cB5;
import X.C1023640ckE;
import X.C1850190yFN;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS11S0101100_27 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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

    public static final Object invoke$0(AwS11S0101100_27 awS11S0101100_27, Object obj) {
        boolean z;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(ListProtector.get((List) ((CommerceMusicSubstituteMusicListViewModel) awS11S0101100_27.l0).LLILZ.getValue(), awS11S0101100_27.i1));
        C1850190yFN.LIZ.getClass();
        c1023640ckE.withParam(C1850190yFN.LJIILLIIL, Long.valueOf(awS11S0101100_27.j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        C1001850cB5 c1001850cB5 = C1850190yFN.LJIILL;
        if (awS11S0101100_27.j2 > ((MusicModel) ListProtector.get((List) ((CommerceMusicSubstituteMusicListViewModel) awS11S0101100_27.l0).LLILZ.getValue(), awS11S0101100_27.i1)).getDuration()) {
            z = true;
        } else {
            z = false;
        }
        c1023640ckE.withParam(c1001850cB5, Boolean.valueOf(z));
        c1023640ckE.withParam(C1850190yFN.LJIILJJIL, Integer.valueOf(awS11S0101100_27.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0101100_27 awS11S0101100_27, Object obj) {
        int duration;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS11S0101100_27.l0);
        C1850190yFN.LIZ.getClass();
        c1023640ckE.withParam(C1850190yFN.LJIIIIZZ, Double.valueOf(awS11S0101100_27.j2 / 1000.0d));
        c1023640ckE.withParam(C1850190yFN.LJFF, Integer.valueOf(awS11S0101100_27.i1));
        C1001850cB5 c1001850cB5 = C1850190yFN.LJII;
        long j = awS11S0101100_27.j2;
        Video video = ((Aweme) awS11S0101100_27.l0).getVideo();
        boolean z = false;
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        if (j > duration) {
            z = true;
        }
        c1023640ckE.withParam(c1001850cB5, Boolean.valueOf(z));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0101100_27(int i, long j, Aweme aweme, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.j2 = j;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0101100_27(CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = commerceMusicSubstituteMusicListViewModel;
        this.i1 = i;
        this.j2 = j;
    }
}
