package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0P3O;
import X.C1210880hcE;
import X.C1440005kM;
import X.C1575450r6F;
import X.C1579480rCk;
import X.C1579490rCl;
import X.C1579830rDJ;
import X.C1579860rDM;
import X.C1579870rDN;
import X.C1579880rDO;
import X.C1607610rw7;
import X.C197039127h;
import X.C2097608Jq;
import X.InterfaceC1579970rDX;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.guidecard.component.FriendsGuideCardRootAssem;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class AbS510S0200000_24 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS510S0200000_24 abS510S0200000_24, View view) {
        C1579490rCl c1579490rCl;
        InterfaceC1579970rDX callback;
        if (view != null && (c1579490rCl = ((C1579870rDN) abS510S0200000_24.l0).LL) != null && (callback = ((C1579880rDO) abS510S0200000_24.l1).getCallback()) != null) {
            callback.LIZ(c1579490rCl);
        }
    }

    public static final void LIZ$1(AbS510S0200000_24 abS510S0200000_24, View view) {
        C1579480rCk c1579480rCk;
        InterfaceC1579970rDX callback;
        if (view != null && (c1579480rCk = ((C1579860rDM) abS510S0200000_24.l0).LL) != null && (callback = ((C1579830rDJ) abS510S0200000_24.l1).getCallback()) != null) {
            callback.LIZ(c1579480rCk);
        }
    }

    public static final void LIZ$2(AbS510S0200000_24 abS510S0200000_24, View view) {
        C1575450r6F c1575450r6F;
        VibeFeedConsumeViewModel vibeFeedConsumeViewModel;
        String strOptString;
        if (view != null && (vibeFeedConsumeViewModel = (c1575450r6F = (C1575450r6F) abS510S0200000_24.l0).LJ) != null) {
            C0P3O c0p3o = C0P3O.REACH_TYPE_GROUP_INLINE_MSG_REMINDER_CARD;
            Pair[] pairArr = new Pair[3];
            JSONObject jSONObject = c1575450r6F.LJFF;
            String strOptString2 = null;
            if (jSONObject != null) {
                strOptString2 = jSONObject.optString("enter_type");
            }
            String str = "";
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            pairArr[0] = new Pair("enter_type", strOptString2);
            JSONObject jSONObject2 = ((C1575450r6F) abS510S0200000_24.l0).LJFF;
            if (jSONObject2 != null && (strOptString = jSONObject2.optString("enter_type")) != null) {
                str = strOptString;
            }
            pairArr[1] = new Pair("enter_method", str);
            pairArr[2] = new Pair("enter_from", "shared_feed");
            vibeFeedConsumeViewModel.AQ2("click btn", c0p3o, C2097608Jq.LJIIJ(pairArr), new AwS568S0100000_24((C197039127h) abS510S0200000_24.l1, 1693), new AwS379S0200000_13((C1575450r6F) abS510S0200000_24.l0, (C197039127h) abS510S0200000_24.l1, 7), new AwS568S0100000_24((C197039127h) abS510S0200000_24.l1, 1694));
        }
    }

    public static final void LIZ$3(AbS510S0200000_24 abS510S0200000_24, View view) {
        if (view != null) {
            FriendsGuideCardRootAssem friendsGuideCardRootAssem = (FriendsGuideCardRootAssem) abS510S0200000_24.l0;
            Aweme aweme = (Aweme) abS510S0200000_24.l1;
            friendsGuideCardRootAssem.getClass();
            C1607610rw7.LIZ.getClass();
            C1607610rw7.LIZJ = true;
            C1607610rw7.LIZLLL();
            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "freinds_guide_card_delete", aweme));
        }
    }

    public static final void LIZ$4(AbS510S0200000_24 abS510S0200000_24, View view) {
        if (view != null) {
            FriendsGuideCardRootAssem friendsGuideCardRootAssem = (FriendsGuideCardRootAssem) abS510S0200000_24.l0;
            Aweme aweme = (Aweme) abS510S0200000_24.l1;
            friendsGuideCardRootAssem.getClass();
            C1607610rw7.LIZ.getClass();
            C1607610rw7.LIZJ = true;
            C1607610rw7.LIZLLL();
            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "freinds_guide_card_delete", aweme));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS510S0200000_24(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
