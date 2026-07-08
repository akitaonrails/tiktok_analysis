package kotlin.jvm.internal;

import X.C09AY;
import X.C20337914i1;
import X.C20359714lX;
import X.C20360614lg;
import X.C20379114of;
import X.C784920Uqg;
import X.InterfaceC1106030et7;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartGuideDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public class AwS3S0420000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

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

    public static final Object invoke$0(AwS3S0420000_31 awS3S0420000_31) {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(((C20359714lX) awS3S0420000_31.l0).LIZ);
        if (playbookAnchorServiceV2LIZIZ != null) {
            Playbook playbook = (Playbook) awS3S0420000_31.l1;
            AwS3S0420000_31 awS3S0420000_312 = new AwS3S0420000_31((C20359714lX) awS3S0420000_31.l0, (C20379114of) awS3S0420000_31.l2, (C20360614lg) awS3S0420000_31.l3, playbook, awS3S0420000_31.z4, awS3S0420000_31.z5, 1);
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.Q9;
            Integer numLIZIZ = c20337914i1.LIZIZ();
            if (numLIZIZ != null && numLIZIZ.intValue() == 0) {
                playbookAnchorServiceV2LIZIZ.LJIJI("auto_start_guide_dialog");
                FragmentManager fragmentManagerLJJJJJL = playbookAnchorServiceV2LIZIZ.LJJJJJL();
                if (fragmentManagerLJJJJJL != null) {
                    PlaybookAutoStartGuideDialog playbookAutoStartGuideDialog = new PlaybookAutoStartGuideDialog();
                    playbookAutoStartGuideDialog.LL = playbook;
                    playbookAutoStartGuideDialog.LLILLJJLI = awS3S0420000_312;
                    playbookAutoStartGuideDialog.show(fragmentManagerLJJJJJL, "PlaybookGuideDialog");
                } else {
                    awS3S0420000_312.invoke();
                }
                c20337914i1.LJFF(1);
            } else {
                awS3S0420000_312.invoke();
            }
        } else {
            C20359714lX.LJIILIIL((C20359714lX) awS3S0420000_31.l0, (C20379114of) awS3S0420000_31.l2, (C20360614lg) awS3S0420000_31.l3, (Playbook) awS3S0420000_31.l1, awS3S0420000_31.z4, awS3S0420000_31.z5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0420000_31 awS3S0420000_31) {
        C20359714lX.LJIILIIL((C20359714lX) awS3S0420000_31.l0, (C20379114of) awS3S0420000_31.l1, (C20360614lg) awS3S0420000_31.l2, (Playbook) awS3S0420000_31.l3, awS3S0420000_31.z4, awS3S0420000_31.z5);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS3S0420000_31(X.C20359714lX r3, X.C20379114of r4, X.C20360614lg r5, webcast.data.multi_guest_play.Playbook r6, boolean r7, boolean r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l0 = r3
            r1.z4 = r7
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r1.z5 = r8
            r0 = 0
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r6
            r1.z4 = r7
            r1.l2 = r4
            r1.l3 = r5
            r1.z5 = r8
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS3S0420000_31.<init>(X.14lX, X.14of, X.14lg, webcast.data.multi_guest_play.Playbook, boolean, boolean, int):void");
    }
}
