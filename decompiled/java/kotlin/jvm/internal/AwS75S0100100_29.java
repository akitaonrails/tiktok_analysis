package kotlin.jvm.internal;

import X.C09AY;
import X.C110L;
import X.C19715812Bw;
import X.C19759012Sm;
import X.C19764712Ur;
import X.C201955140j;
import X.C2188811AlT;
import X.InterfaceC19765012Uu;
import Y.ARunnableS122S0100000_22;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.view.profileImageEditor.ProfileNaviProfileImageEditorFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS75S0100100_29 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.12Sm, X.12Sn] */
    public static final Object invoke$0(AwS75S0100100_29 awS75S0100100_29) {
        ?? r6 = new C19759012Sm() { // from class: X.12Sn
        };
        long j = awS75S0100100_29.j1;
        C19764712Ur c19764712Ur = (C19764712Ur) awS75S0100100_29.l0;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        r6.LIZ = j / j2;
        r6.LIZIZ = c19764712Ur.LIZ.getDuration() / j2;
        Iterator<InterfaceC19765012Uu> it2 = ((C19764712Ur) awS75S0100100_29.l0).LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(r6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS75S0100100_29 awS75S0100100_29) {
        C19715812Bw c19715812Bw = (C19715812Bw) awS75S0100100_29.l0;
        if (c19715812Bw.H4(c19715812Bw.K4(), ((C19715812Bw) awS75S0100100_29.l0).LLJJIJIIJIL) == LivePhotoPreviewMode.LIVE_PHOTO && awS75S0100100_29.j1 >= 0) {
            C19715812Bw c19715812Bw2 = (C19715812Bw) awS75S0100100_29.l0;
            if (!c19715812Bw2.LLJJJ) {
                Runnable runnable = c19715812Bw2.LLJJIJIL;
                if (runnable != null) {
                    HandlerHook.viewRemoveCallbacks(c19715812Bw2.LLJILJILJ.mView, runnable);
                }
                C19715812Bw c19715812Bw3 = (C19715812Bw) awS75S0100100_29.l0;
                c19715812Bw3.LLJJIJIL = new ARunnableS122S0100000_22(c19715812Bw3, 43);
                HandlerHook.viewPostDelay(c19715812Bw3.LLJILJILJ.mView, c19715812Bw3.LLJJIJIL, 500L);
                ((C19715812Bw) awS75S0100100_29.l0).LLJJJ = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS75S0100100_29 awS75S0100100_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("done handle dismissal ");
        sbLIZ.append(System.currentTimeMillis() - awS75S0100100_29.j1);
        sbLIZ.append("ms");
        C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
        ((ProfileNaviProfileImageEditorFragment) awS75S0100100_29.l0).SR(false);
        ProfileNaviCreatorViewModel profileNaviCreatorViewModelMR = ((ProfileNaviProfileImageEditorFragment) awS75S0100100_29.l0).MR();
        profileNaviCreatorViewModelMR.getClass();
        profileNaviCreatorViewModelMR.setStateImmediate(AFwS273S0000000_29.get$arr$(312));
        profileNaviCreatorViewModelMR.setStateImmediate(AFwS273S0000000_29.get$arr$(313));
        C110L.LIZ();
        ((ProfileNaviProfileImageEditorFragment) awS75S0100100_29.l0).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS75S0100100_29 awS75S0100100_29) {
        long j = 30000;
        String strLJJJJJL = a0.LJJJJJL('0', 2, String.valueOf((j - awS75S0100100_29.j1) / 60000));
        String strLJJJJJL2 = a0.LJJJJJL('0', 2, String.valueOf(((j - awS75S0100100_29.j1) % 60000) / 1000));
        TuxTextView tuxTextView = ((InstantCloneRecordFragment) awS75S0100100_29.l0).LLILZLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJJJJL);
        sbLIZ.append(':');
        sbLIZ.append(strLJJJJJL2);
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        ((InstantCloneRecordFragment) awS75S0100100_29.l0).LLILZIL = 30000 - awS75S0100100_29.j1;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0100100_29(long j, ProfileNaviProfileImageEditorFragment profileNaviProfileImageEditorFragment, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = profileNaviProfileImageEditorFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0100100_29(long j, InstantCloneRecordFragment instantCloneRecordFragment, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = instantCloneRecordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0100100_29(C19715812Bw c19715812Bw, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19715812Bw;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0100100_29(C19764712Ur c19764712Ur, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19764712Ur;
        this.j1 = j;
    }
}
