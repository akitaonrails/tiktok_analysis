package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0H2W;
import X.C0H6Q;
import X.C0H7H;
import X.C0HGK;
import X.C0HGY;
import X.C0HHA;
import X.C0HOC;
import X.C0HWW;
import X.C0HYP;
import X.C434640H2o;
import X.C435840H7e;
import X.C438260HGm;
import X.C440370HOp;
import X.C440440HOw;
import X.C440500HPc;
import X.C786410Ut5;
import X.EnumC437540HDs;
import X.EnumC440220HOa;
import X.EnumC440340HOm;
import X.EnumC440360HOo;
import X.EnumC441640HTm;
import X.InterfaceC440090HNn;
import X.InterfaceC440230HOb;
import android.view.View;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class AkS25S0300000_6 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS25S0300000_6 akS25S0300000_6, View view) {
        ((MusProfileEditFragment) akS25S0300000_6.l0).CT().LJIILLIIL(new C0HHA(((View) akS25S0300000_6.l1).getContext(), "click_edit_profile_top_banner", "sa_popup_banner_homepage_profile", null, null, 4, false, false, null, false, null, 4024), (EnumC437540HDs) akS25S0300000_6.l2, null);
        View view2 = ((MusProfileEditFragment) akS25S0300000_6.l0).LLZLI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C0HYP.LIZ.getClass();
        C0HYP.LJ().storeBoolean("edit_profile_inline_notice_has_clicked", true);
        C0HWW.LIZ.getClass();
        C0HWW.LJIIIIZZ("click");
    }

    public static final void LIZ$1(AkS25S0300000_6 akS25S0300000_6, View view) {
        String str;
        Integer numValueOf;
        int iIntValue;
        String strLIZLLL;
        C0HGK c0hgk;
        FriendsIDInfo friendsIDInfo;
        MixStudioHomePageAssem mixStudioHomePageAssem = (MixStudioHomePageAssem) akS25S0300000_6.l0;
        EnumC440220HOa enumC440220HOa = EnumC440220HOa.GENERATE;
        int i = MixStudioHomePageAssem.LLLZI;
        String str2 = null;
        mixStudioHomePageAssem.Gp(enumC440220HOa, null);
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb = ((MixStudioHomePageAssem) akS25S0300000_6.l0).mp().getState().LLILLJJLI;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2 = ((MixStudioHomePageAssem) akS25S0300000_6.l0).mp().getState().LLILLL;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3 = ((MixStudioHomePageAssem) akS25S0300000_6.l0).mp().getState().LLILZ;
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmVQ2 = ((MixStudioHomePageAssem) akS25S0300000_6.l0).hp().vQ2();
        boolean zIsNewUser = ((MixStudioHomePageAssem) akS25S0300000_6.l0).hp().isNewUser();
        InterfaceC440090HNn interfaceC440090HNn = ((C0HOC) akS25S0300000_6.l1).LIZ;
        c440370HOp.getClass();
        C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNn);
        C0HOC c0hoc = (C0HOC) akS25S0300000_6.l1;
        C0H7H c0h7h = c0hoc.LIZIZ;
        EnumC440340HOm enumC440340HOm = EnumC440340HOm.HOME_PAGE;
        String strLJIIL = C440370HOp.LJIIL(c0hoc.LIZ);
        Integer num = ((C0HOC) akS25S0300000_6.l1).LIZJ;
        C440500HPc c440500HPcUp = ((MixStudioHomePageAssem) akS25S0300000_6.l0).up();
        if (c440500HPcUp != null && (friendsIDInfo = c440500HPcUp.LLJ) != null) {
            str = friendsIDInfo.chatType;
        } else {
            str = null;
        }
        String strLIZLLL2 = ((InterfaceC440230HOb) akS25S0300000_6.l2).LIZLLL();
        if (C0H6Q.LIZ()) {
            numValueOf = Integer.valueOf(((MixStudioHomePageAssem) akS25S0300000_6.l0).op().wQ2());
        } else {
            Integer numLIZ = interfaceC440230HOb.LIZ();
            if (numLIZ != null) {
                int iIntValue2 = numLIZ.intValue();
                Integer numLIZ2 = interfaceC440230HOb2.LIZ();
                if (numLIZ2 != null) {
                    iIntValue = numLIZ2.intValue();
                } else {
                    iIntValue = 0;
                }
                numValueOf = Integer.valueOf(iIntValue2 + iIntValue);
            } else {
                numValueOf = null;
            }
        }
        Integer numLIZJ = ((InterfaceC440230HOb) akS25S0300000_6.l2).LIZJ();
        if (C0H6Q.LIZ()) {
            strLIZLLL = ((MixStudioHomePageAssem) akS25S0300000_6.l0).op().zQ2();
        } else {
            strLIZLLL = interfaceC440230HOb3.LIZLLL();
        }
        InterfaceC440090HNn interfaceC440090HNn2 = ((C0HOC) akS25S0300000_6.l1).LIZ;
        if ((interfaceC440090HNn2 instanceof C0HGK) && (c0hgk = (C0HGK) interfaceC440090HNn2) != null) {
            str2 = c0hgk.LIZ;
        }
        C440370HOp.LIZJ(enumC441640HTmVQ2, zIsNewUser, c0hgyLJIILIIL, c0h7h, enumC440340HOm, strLJIIL, num, str, strLIZLLL2, numValueOf, numLIZJ, strLIZLLL, str2, C440370HOp.LJIILL(interfaceC440090HNn2));
        ((MixStudioHomePageAssem) akS25S0300000_6.l0).hp().setState(new AwS585S0100000_6(EnumC440360HOo.HOME_PAGE, 271));
        MixStudioHomePageViewModel mixStudioHomePageViewModelMp = ((MixStudioHomePageAssem) akS25S0300000_6.l0).mp();
        EnumC441640HTm enumC441640HTmVQ22 = ((MixStudioHomePageAssem) akS25S0300000_6.l0).hp().vQ2();
        mixStudioHomePageViewModelMp.getClass();
        mixStudioHomePageViewModelMp.withState(new AwS372S0200000_6(mixStudioHomePageViewModelMp, enumC441640HTmVQ22, 61));
    }

    public static final void LIZ$2(AkS25S0300000_6 akS25S0300000_6, View view) {
        C435840H7e.LIZ(((C434640H2o) akS25S0300000_6.l0).LIZIZ, false, "click_words_source_banner", null, null, 24);
        Function0 function0 = (Function0) akS25S0300000_6.l1;
        if (function0 != null && ((Boolean) function0.invoke()).booleanValue()) {
            return;
        }
        C438260HGm c438260HGm = C438260HGm.LIZ;
        C0H2W c0h2w = (C0H2W) akS25S0300000_6.l2;
        C434640H2o c434640H2o = (C434640H2o) akS25S0300000_6.l0;
        c438260HGm.getClass();
        C438260HGm.LIZ(c0h2w, c434640H2o, false, null);
    }

    public AkS25S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
