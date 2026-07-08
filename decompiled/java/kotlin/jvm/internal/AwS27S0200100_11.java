package kotlin.jvm.internal;

import X.C09AY;
import X.C291001Au;
import X.C730490Sl5;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS27S0200100_11 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS27S0200100_11 awS27S0200100_11, Object obj) {
        VideoDiggVM videoDiggVM = (VideoDiggVM) awS27S0200100_11.l0;
        videoDiggVM.setState(new AwS27S0200100_11(videoDiggVM, awS27S0200100_11.j2, (Aweme) awS27S0200100_11.l1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S0200100_11 awS27S0200100_11, Object obj) {
        VideoDiggVM videoDiggVM = (VideoDiggVM) awS27S0200100_11.l0;
        videoDiggVM.setState(new AwS27S0200100_11(videoDiggVM, awS27S0200100_11.j2, (Aweme) awS27S0200100_11.l1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS27S0200100_11 awS27S0200100_11, Object obj) {
        C730490Sl5 c730490Sl5 = (C730490Sl5) obj;
        return C730490Sl5.LIZ(c730490Sl5, ((VideoDiggVM) awS27S0200100_11.l0).AQ2(awS27S0200100_11.j2, (Aweme) awS27S0200100_11.l1, true), new C291001Au(Boolean.valueOf(c730490Sl5.LL)), null, null, null, 57);
    }

    public static final Object invoke$3(AwS27S0200100_11 awS27S0200100_11, Object obj) {
        C730490Sl5 c730490Sl5 = (C730490Sl5) obj;
        return C730490Sl5.LIZ(c730490Sl5, ((VideoDiggVM) awS27S0200100_11.l0).AQ2(awS27S0200100_11.j2, (Aweme) awS27S0200100_11.l1, true), new C291001Au(Boolean.valueOf(c730490Sl5.LL)), null, null, null, 57);
    }

    public static final Object invoke$4(AwS27S0200100_11 awS27S0200100_11, Object obj) {
        C730490Sl5 c730490Sl5 = (C730490Sl5) obj;
        VideoDiggVM videoDiggVM = (VideoDiggVM) awS27S0200100_11.l0;
        long j = awS27S0200100_11.j2;
        Aweme aweme = (Aweme) awS27S0200100_11.l1;
        boolean z = true;
        if (aweme.getUserDigg() != 1) {
            z = false;
        }
        return C730490Sl5.LIZ(c730490Sl5, videoDiggVM.AQ2(j, aweme, z), null, null, null, null, 61);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0200100_11(VideoDiggVM videoDiggVM, long j, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.j2 = j;
        this.l1 = aweme;
    }
}
