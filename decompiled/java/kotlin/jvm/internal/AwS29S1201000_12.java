package kotlin.jvm.internal;

import X.1JLP;
import X.1JLc;
import X.C013C;
import X.C041J;
import X.C09AY;
import X.C0TEO;
import X.C1533950q1J;
import X.C16F5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import Y.ARunnableS17S1200000_12;
import android.view.View;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS29S1201000_12 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS29S1201000_12 awS29S1201000_12) {
        int i = awS29S1201000_12.i3;
        if (i != 0) {
            if (i != 1) {
                C16F5 c16f5 = ((GameCastWiredFragment) awS29S1201000_12.l1).LLIZ;
                if (c16f5 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(awS29S1201000_12.s0);
                    sbLIZ.append("...");
                    c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                View view = (View) awS29S1201000_12.l2;
                HandlerHook.viewPostDelay(view, new ARunnableS17S1200000_12((GameCastWiredFragment) awS29S1201000_12.l1, view, awS29S1201000_12.s0, 2), 500L);
            } else {
                C16F5 c16f52 = ((GameCastWiredFragment) awS29S1201000_12.l1).LLIZ;
                if (c16f52 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(awS29S1201000_12.s0);
                    sbLIZ2.append("..");
                    c16f52.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
                View view2 = (View) awS29S1201000_12.l2;
                HandlerHook.viewPostDelay(view2, new ARunnableS17S1200000_12((GameCastWiredFragment) awS29S1201000_12.l1, view2, awS29S1201000_12.s0, 1), 500L);
            }
        } else {
            C16F5 c16f53 = ((GameCastWiredFragment) awS29S1201000_12.l1).LLIZ;
            if (c16f53 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(awS29S1201000_12.s0);
                sbLIZ3.append('.');
                c16f53.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
            View view3 = (View) awS29S1201000_12.l2;
            HandlerHook.viewPostDelay(view3, new ARunnableS17S1200000_12((GameCastWiredFragment) awS29S1201000_12.l1, view3, awS29S1201000_12.s0, 6), 500L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S1201000_12 awS29S1201000_12) {
        int i = awS29S1201000_12.i3;
        if (i != 0) {
            if (i != 1) {
                C16F5 c16f5 = ((GameCastWiredFragmentV2) awS29S1201000_12.l1).LLIZ;
                if (c16f5 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(awS29S1201000_12.s0);
                    sbLIZ.append("...");
                    c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                View view = (View) awS29S1201000_12.l2;
                HandlerHook.viewPostDelay(view, new ARunnableS17S1200000_12((GameCastWiredFragmentV2) awS29S1201000_12.l1, view, awS29S1201000_12.s0, 5), 500L);
            } else {
                C16F5 c16f52 = ((GameCastWiredFragmentV2) awS29S1201000_12.l1).LLIZ;
                if (c16f52 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(awS29S1201000_12.s0);
                    sbLIZ2.append("..");
                    c16f52.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
                View view2 = (View) awS29S1201000_12.l2;
                HandlerHook.viewPostDelay(view2, new ARunnableS17S1200000_12((GameCastWiredFragmentV2) awS29S1201000_12.l1, view2, awS29S1201000_12.s0, 4), 500L);
            }
        } else {
            C16F5 c16f53 = ((GameCastWiredFragmentV2) awS29S1201000_12.l1).LLIZ;
            if (c16f53 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(awS29S1201000_12.s0);
                sbLIZ3.append('.');
                c16f53.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
            View view3 = (View) awS29S1201000_12.l2;
            HandlerHook.viewPostDelay(view3, new ARunnableS17S1200000_12((GameCastWiredFragmentV2) awS29S1201000_12.l1, view3, awS29S1201000_12.s0, 3), 500L);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AwS29S1201000_12 awS29S1201000_12) {
        String strLIZJ;
        boolean z;
        1JLP r1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(awS29S1201000_12.s0);
        1JLc r0 = ((C0TEO) awS29S1201000_12.l1).LIZJ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            strLIZJ = r1.LIZJ(awS29S1201000_12.i3, arrayList);
        } else {
            strLIZJ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detectIps ip = ");
        sbLIZ.append(awS29S1201000_12.s0);
        sbLIZ.append(",port = ");
        sbLIZ.append(awS29S1201000_12.i3);
        C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ));
        C013C c013c = (C013C) awS29S1201000_12.l2;
        if (strLIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        c013c.element = z;
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final /* bridge */ /* synthetic */ Object invoke$3(AwS29S1201000_12 awS29S1201000_12) {
        ?? LIZJ;
        1JLP r1;
        ArrayList arrayList = new ArrayList();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(awS29S1201000_12.s0, new String[]{";"}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (C1533950q1J.LJ((String) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        1JLc r0 = ((C0TEO) awS29S1201000_12.l1).LIZJ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            LIZJ = r1.LIZJ(awS29S1201000_12.i3, arrayList);
        } else {
            LIZJ = 0;
        }
        if (C041J.LIZ(LIZJ)) {
            ((C0TEO) awS29S1201000_12.l1).LIZ = LIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detectIps ip = ");
        sbLIZ.append(awS29S1201000_12.s0);
        sbLIZ.append(",port = ");
        sbLIZ.append(awS29S1201000_12.i3);
        C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ));
        ((C259800zU) awS29S1201000_12.l2).element = LIZJ;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1201000_12(int i, GameCastWiredFragment gameCastWiredFragment, String str, View view, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l1 = gameCastWiredFragment;
        this.s0 = str;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1201000_12(int i, GameCastWiredFragmentV2 gameCastWiredFragmentV2, String str, View view, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l1 = gameCastWiredFragmentV2;
        this.s0 = str;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS29S1201000_12(String str, String str2, C0TEO c0teo, int i, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.s0 = str;
        this.l1 = str2;
        this.i3 = c0teo;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1201000_12(String str, C0TEO c0teo, int i, C013C c013c, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c0teo;
        this.i3 = i;
        this.l2 = c013c;
    }
}
