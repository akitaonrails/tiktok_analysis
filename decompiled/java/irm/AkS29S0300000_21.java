package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1347450lAV;
import X.C1398210mUN;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC1341680l1C;
import X.InterfaceC1398220mUO;
import X.InterfaceC1631620sYq;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MDPSquareShowMoreViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class AkS29S0300000_21 extends AbstractViewOnClickListenerC1173120gdK {
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

    public static final void LIZ$0(AkS29S0300000_21 akS29S0300000_21, View view) {
        IMDPMusicAwemeModelAbility iMDPMusicAwemeModelAbility = (IMDPMusicAwemeModelAbility) akS29S0300000_21.l0;
        String strKZ1 = null;
        if (iMDPMusicAwemeModelAbility != null && iMDPMusicAwemeModelAbility.Ta2(null)) {
            IMDPMusicAwemeModelAbility iMDPMusicAwemeModelAbility2 = (IMDPMusicAwemeModelAbility) akS29S0300000_21.l0;
            if (iMDPMusicAwemeModelAbility2 != null) {
                iMDPMusicAwemeModelAbility2.c5("show_more");
            }
            IMDPMusicAwemeModelAbility iMDPMusicAwemeModelAbility3 = (IMDPMusicAwemeModelAbility) akS29S0300000_21.l0;
            if (iMDPMusicAwemeModelAbility3 != null) {
                iMDPMusicAwemeModelAbility3.Y32();
            }
        } else {
            IMDPMusicAwemeModelAbility iMDPMusicAwemeModelAbility4 = (IMDPMusicAwemeModelAbility) akS29S0300000_21.l0;
            if (iMDPMusicAwemeModelAbility4 != null && iMDPMusicAwemeModelAbility4.pa0()) {
                IMDPMusicAwemeModelAbility iMDPMusicAwemeModelAbility5 = (IMDPMusicAwemeModelAbility) akS29S0300000_21.l0;
                if (iMDPMusicAwemeModelAbility5 != null) {
                    iMDPMusicAwemeModelAbility5.Y32();
                }
            } else {
                MDPSquareShowMoreViewHolder mDPSquareShowMoreViewHolder = (MDPSquareShowMoreViewHolder) akS29S0300000_21.l1;
                mDPSquareShowMoreViewHolder.LLIZ = true;
                C786410Ut5.LJLLLLLL(4, mDPSquareShowMoreViewHolder.itemView);
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) akS29S0300000_21.l2;
        if (iMDPMobAbility != null) {
            strKZ1 = iMDPMobAbility.KZ1();
        }
        c2344009Gk.LJIIIIZZ("music_id", strKZ1);
        C20684815ws.LJIILLIIL("click_show_more_in_mdp", c2344009Gk.LIZ);
    }

    public static final void LIZ$1(AkS29S0300000_21 akS29S0300000_21, View view) {
        InterfaceC1398220mUO interfaceC1398220mUO = ((C1398210mUN) akS29S0300000_21.l0).LLLI;
        if (interfaceC1398220mUO != null) {
            interfaceC1398220mUO.onClickTopDesc((Aweme) akS29S0300000_21.l1, (View) akS29S0300000_21.l2);
        }
    }

    public static final void LIZ$2(AkS29S0300000_21 akS29S0300000_21, View view) {
        EnumC1341680l1C enumC1341680l1C;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) akS29S0300000_21.l0;
        TuxIconView tuxIconView = (TuxIconView) akS29S0300000_21.l1;
        C1347450lAV c1347450lAV = (C1347450lAV) akS29S0300000_21.l2;
        int id = tuxIconView.getId();
        c1347450lAV.getClass();
        String strLIZLLL = C1347450lAV.LIZLLL(id);
        C1347450lAV c1347450lAV2 = (C1347450lAV) akS29S0300000_21.l2;
        int id2 = ((TuxIconView) akS29S0300000_21.l1).getId();
        c1347450lAV2.getClass();
        if (id2 == R.id.ll7) {
            enumC1341680l1C = EnumC1341680l1C.PHOTO;
        } else if (id2 == R.id.lfo) {
            enumC1341680l1C = EnumC1341680l1C.EMOJI;
        } else if (id2 == R.id.l99) {
            enumC1341680l1C = EnumC1341680l1C.MENTION;
        } else {
            enumC1341680l1C = EnumC1341680l1C.TEXT;
        }
        interfaceC1631620sYq.invoke(tuxIconView, strLIZLLL, enumC1341680l1C);
    }

    public AkS29S0300000_21(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
