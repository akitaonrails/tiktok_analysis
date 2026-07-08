package kotlin.jvm.internal;

import X.AbstractC19531111bB;
import X.C05EY;
import X.C09AY;
import X.C0HZQ;
import X.C0PEM;
import X.C11VM;
import X.C11VO;
import X.C12HN;
import X.C1638280sja;
import X.C19371010qS;
import X.C197039127h;
import X.C19759412Sq;
import X.C19759512Sr;
import X.C19EG;
import X.C19IN;
import X.C1DFH;
import X.C20622515mp;
import X.C2107308Nj;
import X.C21366318jV;
import X.C23250099c;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneAgreementFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneFinishFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS686S0100000_2;
import wh6.AbS708S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AwS145S0110000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS145S0110000_29 awS145S0110000_29) {
        int i;
        C1638280sja c1638280sja = C21366318jV.LIZLLL;
        C19EG c19eg = (C19EG) awS145S0110000_29.l0;
        if (awS145S0110000_29.z1) {
            i = 2131827321;
        } else {
            i = 2131827315;
        }
        c1638280sja.getClass();
        C1638280sja.LIZJ(i, 0, c19eg).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS145S0110000_29 awS145S0110000_29) {
        ((AbstractC19531111bB) awS145S0110000_29.l0).K4(awS145S0110000_29.z1);
        ((AbstractC19531111bB) awS145S0110000_29.l0).P4();
        ((AbstractC19531111bB) awS145S0110000_29.l0).z8();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS145S0110000_29 awS145S0110000_29) {
        C19371010qS.LIZ("cd_start_activity_to_request_net_duration");
        ((ChallengeDetailJediViewModel) ((ChallengeDetailFragment) awS145S0110000_29.l0).LLLIIL.getValue()).hR2(((ChallengeDetailFragment) awS145S0110000_29.l0).ZR().getCid(), ((ChallengeDetailFragment) awS145S0110000_29.l0).ZR().getClickReason(), ((ChallengeDetailFragment) awS145S0110000_29.l0).ZR().getPreviewToken(), ((ChallengeDetailFragment) awS145S0110000_29.l0).ZR().isHashTag(), awS145S0110000_29.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS145S0110000_29 awS145S0110000_29) {
        C0HZQ c0hzq = ((C19759512Sr) awS145S0110000_29.l0).LLJLL;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setChecked(awS145S0110000_29.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS145S0110000_29 awS145S0110000_29) {
        C0HZQ c0hzq = ((C19759412Sq) awS145S0110000_29.l0).LLJZ;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setChecked(awS145S0110000_29.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS145S0110000_29 awS145S0110000_29) {
        if (awS145S0110000_29.z1) {
            ((C12HN) awS145S0110000_29.l0).LJIIZILJ.setValue(0);
        } else {
            ((C12HN) awS145S0110000_29.l0).LJIIZILJ.setValue(8);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS145S0110000_29 awS145S0110000_29) {
        ((C11VM) awS145S0110000_29.l0).LJIIIZ();
        C11VM c11vm = (C11VM) awS145S0110000_29.l0;
        c11vm.LLJJJJ = false;
        if (Intrinsics.LJFF(c11vm.LLJI, "full_screen")) {
            TuxIconView tuxIconView = ((C11VM) awS145S0110000_29.l0).LLJ;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C11VM c11vm2 = (C11VM) awS145S0110000_29.l0;
            TuxIconView tuxIconView2 = c11vm2.LLJ;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.I7(new AbS686S0100000_2(c11vm2, 19), tuxIconView2);
        } else {
            TuxIconView tuxIconView3 = ((C11VM) awS145S0110000_29.l0).LLIZLLLIL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            final C11VM c11vm3 = (C11VM) awS145S0110000_29.l0;
            TuxIconView tuxIconView4 = c11vm3.LLIZLLLIL;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.I7(new C19IN() { // from class: X.05HH
                {
                    super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                }

                @Override // X.C19IN
                public final void LIZ(View view) {
                    int i;
                    if (Intrinsics.LJFF(c11vm3.LLJIJIL, "finish_page")) {
                        InterfaceC497601wk coroutineScope = c11vm3.getCoroutineScope();
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(coroutineScope, C2107308Nj.LIZ, null, new C05HG(c11vm3, null), 2);
                        return;
                    }
                    C11VK c11vk = C11VK.LIZ;
                    C11VM c11vm4 = c11vm3;
                    String str = c11vm4.LLJIJIL;
                    InstantCloneRecordFragment instantCloneRecordFragment = c11vm4.LLJJI;
                    if (instantCloneRecordFragment != null) {
                        i = instantCloneRecordFragment.LLILZ;
                    } else {
                        i = 1;
                    }
                    c11vk.getClass();
                    C11VK.LJI(i, str);
                    InstantClonePanelAbility instantClonePanelAbility = c11vm3.LLJJIJIIJIL;
                    if (instantClonePanelAbility != null) {
                        instantClonePanelAbility.closePanel();
                    }
                    c11vm3.LLJJJJ = true;
                }
            }, tuxIconView4);
        }
        C11VM c11vm4 = (C11VM) awS145S0110000_29.l0;
        FrameLayout frameLayout = (FrameLayout) c11vm4.findViewById(c11vm4.getFragmentContainerViewId());
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        C11VM c11vm5 = (C11VM) awS145S0110000_29.l0;
        TuxIconView tuxIconView5 = c11vm5.LLILZIL;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        C786410Ut5.I7(new AbS708S0100000_29(c11vm5, 5), tuxIconView5);
        C197039127h c197039127h = c11vm5.LLILZLL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setButtonVariant(1);
        C197039127h c197039127h2 = c11vm5.LLILZLL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.I7(new AbS708S0100000_29(c11vm5, 6), c197039127h2);
        C197039127h c197039127h3 = c11vm5.LLIZ;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        C786410Ut5.I7(new AbS686S0100000_2(c11vm5, 18), c197039127h3);
        C11VM c11vm6 = (C11VM) awS145S0110000_29.l0;
        c11vm6.getClass();
        String str = c11vm6.LLJI;
        InstantCloneAgreementFragment instantCloneAgreementFragment = new InstantCloneAgreementFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("view_mode", str, bundle);
        instantCloneAgreementFragment.setArguments(bundle);
        c11vm6.LLJJ = instantCloneAgreementFragment;
        String str2 = c11vm6.LLJI;
        InstantCloneRecordFragment instantCloneRecordFragment = new InstantCloneRecordFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("view_mode", str2, bundle2);
        instantCloneRecordFragment.setArguments(bundle2);
        c11vm6.LLJJI = instantCloneRecordFragment;
        String str3 = c11vm6.LLJI;
        InstantCloneFinishFragment instantCloneFinishFragment = new InstantCloneFinishFragment();
        Bundle bundle3 = new Bundle();
        C786410Ut5.LJJJI("view_mode", str3, bundle3);
        instantCloneFinishFragment.setArguments(bundle3);
        c11vm6.LLJJIII = instantCloneFinishFragment;
        FragmentManager fragmentManagerLJIIJ = C20622515mp.LJIIJ(c11vm6);
        if (fragmentManagerLJIIJ != null) {
            c11vm6.LLJILJILJ = fragmentManagerLJIIJ;
        }
        C11VO c11vo = new C11VO(c11vm6);
        c11vm6.getClass();
        InstantCloneAgreementFragment instantCloneAgreementFragment2 = c11vm6.LLJJ;
        if (instantCloneAgreementFragment2 != null) {
            instantCloneAgreementFragment2.LLILLJJLI = c11vo;
        }
        InstantCloneRecordFragment instantCloneRecordFragment2 = c11vm6.LLJJI;
        if (instantCloneRecordFragment2 != null) {
            instantCloneRecordFragment2.LLILLJJLI = c11vo;
        }
        InstantCloneFinishFragment instantCloneFinishFragment2 = c11vm6.LLJJIII;
        if (instantCloneFinishFragment2 != null) {
            instantCloneFinishFragment2.LLILLJJLI = c11vo;
        }
        C11VM c11vm7 = (C11VM) awS145S0110000_29.l0;
        boolean z = awS145S0110000_29.z1;
        InterfaceC497601wk coroutineScope = c11vm7.getCoroutineScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(coroutineScope, C2107308Nj.LIZ, null, new C05EY(c11vm7, z, null), 2);
        InstantClonePanelAbility instantClonePanelAbility = ((C11VM) awS145S0110000_29.l0).LLJJIJIIJIL;
        if (instantClonePanelAbility != null) {
            instantClonePanelAbility.pauseVideo();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0110000_29(C11VM c11vm, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c11vm;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS145S0110000_29(AbstractC19531111bB abstractC19531111bB, AbstractC19531111bB<API_COMPONENT> abstractC19531111bB2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = abstractC19531111bB;
        this.z1 = abstractC19531111bB2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0110000_29(C19759412Sq c19759412Sq, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19759412Sq;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0110000_29(C19759512Sr c19759512Sr, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19759512Sr;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0110000_29(C19EG c19eg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0110000_29(ChallengeDetailFragment challengeDetailFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = challengeDetailFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0110000_29(boolean z, C12HN c12hn, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c12hn;
    }
}
