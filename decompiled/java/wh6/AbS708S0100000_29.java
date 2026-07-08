package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0LAB;
import X.C11VK;
import X.C11VM;
import X.C1404250me7;
import X.C1528405yc;
import X.C20684815ws;
import X.C580700Mq4;
import X.C580710Mq5;
import X.C869590Y9l;
import X.C875230YVd;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.msg.PublicGroupOnboardingCardAssem;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity;
import com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsFragment;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AbS708S0100000_29 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS708S0100000_29(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null && view.getAlpha() >= 1.0E-5d) {
            ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) abS708S0100000_29.l0;
            challengeDetailFragment.SR(challengeDetailFragment.requireContext());
        }
    }

    public static final void LIZ$1(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null) {
            ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) abS708S0100000_29.l0;
            challengeDetailFragment.SR(challengeDetailFragment.requireContext());
        }
    }

    public static final void LIZ$2(AbS708S0100000_29 abS708S0100000_29, View view) {
        String conversationId;
        if (view != null) {
            PublicGroupOnboardingCardAssem publicGroupOnboardingCardAssem = (PublicGroupOnboardingCardAssem) abS708S0100000_29.l0;
            C869590Y9l c869590Y9l = publicGroupOnboardingCardAssem.LLL.LIZJ;
            if (c869590Y9l != null) {
                SessionInfo sessionInfoSp = publicGroupOnboardingCardAssem.sp();
                if (sessionInfoSp != null) {
                    conversationId = sessionInfoSp.getConversationId();
                } else {
                    conversationId = null;
                }
                C1528405yc.LIZ(publicGroupOnboardingCardAssem.LLL.LIZ(), "group_onboarding_card", "close", conversationId);
                C875230YVd.LIZ(c869590Y9l, false, null);
            }
        }
    }

    public static final void LIZ$3(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null) {
            ((UGCPreviewActivity) abS708S0100000_29.l0).finish();
            C580710Mq5 c580710Mq5 = ((UGCPreviewActivity) abS708S0100000_29.l0).LLJILJIL;
            C580710Mq5 c580710Mq52 = null;
            if (c580710Mq5 == null) {
                c580710Mq5 = null;
            }
            C20684815ws.LJIILLIIL("exit_template_preview_page", C1404250me7.LIZ(c580710Mq5.LIZJ()).LIZ);
            C580710Mq5 c580710Mq53 = ((UGCPreviewActivity) abS708S0100000_29.l0).LLJILJIL;
            if (c580710Mq53 == null) {
                c580710Mq53 = null;
            }
            String aid = c580710Mq53.LIZ().getAid();
            UGCPreviewActivity uGCPreviewActivity = (UGCPreviewActivity) abS708S0100000_29.l0;
            long j = uGCPreviewActivity.LLJILJILJ;
            C580710Mq5 c580710Mq54 = uGCPreviewActivity.LLJILJIL;
            if (c580710Mq54 != null) {
                c580710Mq52 = c580710Mq54;
            }
            C1404250me7.LIZIZ(1, aid, j, c580710Mq52.LIZJ());
        }
    }

    public static final void LIZ$4(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null) {
            UGCPreviewActivity uGCPreviewActivity = (UGCPreviewActivity) abS708S0100000_29.l0;
            C580710Mq5 c580710Mq5 = uGCPreviewActivity.LLJILJIL;
            C580710Mq5 c580710Mq52 = null;
            if (c580710Mq5 == null) {
                c580710Mq5 = null;
            }
            C580700Mq4.LIZ(uGCPreviewActivity, c580710Mq5, 0);
            C580710Mq5 c580710Mq53 = ((UGCPreviewActivity) abS708S0100000_29.l0).LLJILJIL;
            if (c580710Mq53 == null) {
                c580710Mq53 = null;
            }
            C0LAB c0labLIZ = C1404250me7.LIZ(c580710Mq53.LIZJ());
            c0labLIZ.LJ("enter_method", "click_add_media");
            C20684815ws.LJIILLIIL("add_clips", c0labLIZ.LIZ);
            C580710Mq5 c580710Mq54 = ((UGCPreviewActivity) abS708S0100000_29.l0).LLJILJIL;
            if (c580710Mq54 == null) {
                c580710Mq54 = null;
            }
            String aid = c580710Mq54.LIZ().getAid();
            UGCPreviewActivity uGCPreviewActivity2 = (UGCPreviewActivity) abS708S0100000_29.l0;
            long j = uGCPreviewActivity2.LLJILJILJ;
            C580710Mq5 c580710Mq55 = uGCPreviewActivity2.LLJILJIL;
            if (c580710Mq55 != null) {
                c580710Mq52 = c580710Mq55;
            }
            C1404250me7.LIZIZ(0, aid, j, c580710Mq52.LIZJ());
        }
    }

    public static final void LIZ$5(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C11VM) abS708S0100000_29.l0).LLJJIJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII()) {
                return;
            }
            ((C11VM) abS708S0100000_29.l0).LJ("agreement_page");
        }
    }

    public static final void LIZ$6(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null) {
            ((C11VM) abS708S0100000_29.l0).LJ("agreement_page");
            C11VK.LIZ.getClass();
            C11VK.LJIIJJI("decline");
        }
    }

    public static final void LIZ$7(AbS708S0100000_29 abS708S0100000_29, View view) {
        ((Function0) abS708S0100000_29.l0).invoke();
    }

    public static final void LIZ$8(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null && view.getAlpha() >= 1.0E-5d) {
            TTSVoiceDetailsFragment tTSVoiceDetailsFragment = (TTSVoiceDetailsFragment) abS708S0100000_29.l0;
            tTSVoiceDetailsFragment.PR(tTSVoiceDetailsFragment.requireContext());
        }
    }

    public static final void LIZ$9(AbS708S0100000_29 abS708S0100000_29, View view) {
        if (view != null) {
            TTSVoiceDetailsFragment tTSVoiceDetailsFragment = (TTSVoiceDetailsFragment) abS708S0100000_29.l0;
            tTSVoiceDetailsFragment.PR(tTSVoiceDetailsFragment.requireContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS708S0100000_29(AwS430S0200000_29 awS430S0200000_29, int i) {
        super(500L);
        this.$t = i;
        this.l0 = awS430S0200000_29;
    }
}
