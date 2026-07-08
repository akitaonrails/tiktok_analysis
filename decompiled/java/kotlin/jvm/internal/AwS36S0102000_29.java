package kotlin.jvm.internal;

import X.C004I;
import X.C09AY;
import X.C0LAB;
import X.C11A3;
import X.C11A6;
import X.C11A9;
import X.C11AC;
import X.C11E5;
import X.C1403450mcp;
import X.C1761680vwc;
import X.C20684815ws;
import Y.ARunnableS0S0100300_29;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS36S0102000_29 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS36S0102000_29 awS36S0102000_29, Object obj) {
        FTCCountdownState fTCCountdownState = (FTCCountdownState) obj;
        C11A6 c11a6 = ((C11A3) awS36S0102000_29.l0).LLJIJIL;
        if (c11a6 != null) {
            c11a6.LIZIZ(awS36S0102000_29.i1, awS36S0102000_29.i2, fTCCountdownState.getMusicPath());
        }
        ((C11A3) awS36S0102000_29.l0).LLLILZ(awS36S0102000_29.i2, fTCCountdownState.getStartTime(), fTCCountdownState.getMaxDuration());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S0102000_29 awS36S0102000_29, Object obj) {
        CountdownState countdownState = (CountdownState) obj;
        C11AC c11ac = ((C11A9) awS36S0102000_29.l0).LLJILJIL;
        if (c11ac != null) {
            c11ac.LIZIZ(awS36S0102000_29.i1, awS36S0102000_29.i2, countdownState.getMusicPath());
        }
        C11A9 c11a9 = (C11A9) awS36S0102000_29.l0;
        long j = awS36S0102000_29.i2;
        long startTime = countdownState.getStartTime();
        long maxDuration = countdownState.getMaxDuration();
        SafeHandler safeHandler = c11a9.LLJJIJI;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new ARunnableS0S0100300_29(c11a9, j, startTime, maxDuration, 1));
        C1403450mcp c1403450mcp = C1403450mcp.LIZ;
        ShortVideoContext shortVideoContextLLLIL = ((C11A9) awS36S0102000_29.l0).LLLIL();
        int startTime2 = awS36S0102000_29.i2 - ((int) countdownState.getStartTime());
        c1403450mcp.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContextLLLIL.shootWay);
        c0lab.LJ("creation_id", shortVideoContextLLLIL.getCreationId());
        c0lab.LIZ(startTime2, "to_status");
        c0lab.LJ("shoot_tab_name", shortVideoContextLLLIL.LJIJJLI());
        C20684815ws.LJIILLIIL("select_recording_limit", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS36S0102000_29 awS36S0102000_29, Object obj) {
        ListState listState = (ListState) obj;
        if (awS36S0102000_29.i1 > 0 && awS36S0102000_29.i2 >= 0) {
            listState.getList().size();
        }
        ArrayList arrayList = new ArrayList(listState.getList());
        int i = 1;
        if (1 <= awS36S0102000_29.i1) {
            while (awS36S0102000_29.i2 < arrayList.size()) {
                ListProtector.remove(arrayList, awS36S0102000_29.i2);
                if (i == awS36S0102000_29.i1) {
                    break;
                }
                i++;
            }
        }
        ListMiddleware listMiddleware = (ListMiddleware) awS36S0102000_29.l0;
        listMiddleware.getClass();
        listMiddleware.LIZLLL().dR2(new AwS395S0200000_29(listMiddleware, (C11E5<C004I, C004I>) new AwS392S0200000_26(arrayList, (List<Object>) listMiddleware, (ListMiddleware<C004I, Object, C1761680vwc>) 140), (Function1<C004I, C004I>) 83));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0102000_29(int i, int i2, int i3, ListMiddleware<C004I, Object, C1761680vwc> listMiddleware) {
        super(1);
        this.$t = listMiddleware;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0102000_29(C11A3 c11a3, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c11a3;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0102000_29(C11A9 c11a9, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c11a9;
        this.i1 = i;
        this.i2 = i2;
    }
}
