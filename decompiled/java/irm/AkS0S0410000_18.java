package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1180880gpq;
import X.C1198230hHp;
import X.C1389890mGx;
import X.C2188811AlT;
import X.C2344009Gk;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.content.poicampaign.HashtagInfo;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public class AkS0S0410000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS0S0410000_18 akS0S0410000_18, View view) {
        ((MyMomentsMainElementsAssem) akS0S0410000_18.l0).Ho(akS0S0410000_18.z4, (Boolean) akS0S0410000_18.l1, (MyMomentsData) akS0S0410000_18.l2, (Context) akS0S0410000_18.l3);
    }

    public static final void LIZ$1(AkS0S0410000_18 akS0S0410000_18, View view) {
        String string;
        Integer num;
        String str;
        MyMomentsData myMomentsData;
        Integer num2;
        MyMomentsData myMomentsData2;
        HashtagInfo hashtagInfo;
        HashtagInfo hashtagInfo2;
        String str2;
        HashtagInfo hashtagInfo3;
        String str3;
        Context context;
        String string2;
        MyMomentsData myMomentsData3 = (MyMomentsData) akS0S0410000_18.l0;
        Long l = null;
        if (myMomentsData3 == null || (hashtagInfo3 = myMomentsData3.hashtagInfo) == null || (str3 = hashtagInfo3.hashtagName) == null || (context = ((TuxTextView) akS0S0410000_18.l1).getContext()) == null || (string2 = context.getString(2131823059)) == null || (string = u.LJJIFFI(string2, "%1$s", str3, false)) == null) {
            Context context2 = ((TuxTextView) akS0S0410000_18.l1).getContext();
            if (context2 != null) {
                string = context2.getString(2131823059);
            } else {
                string = null;
            }
        }
        if (!akS0S0410000_18.z4) {
            MyMomentsData myMomentsData4 = (MyMomentsData) akS0S0410000_18.l0;
            if (myMomentsData4 != null && (hashtagInfo2 = myMomentsData4.hashtagInfo) != null && (str2 = hashtagInfo2.hashtagName) != null) {
                MyMomentsMainElementsAssem myMomentsMainElementsAssem = (MyMomentsMainElementsAssem) akS0S0410000_18.l2;
                Context context3 = ((TuxTextView) akS0S0410000_18.l1).getContext();
                myMomentsMainElementsAssem.getClass();
                MyMomentsMainElementsAssem.ap(context3, str2);
            }
            if (string != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(FragmentManager.LJJJJLL((View) akS0S0410000_18.l3));
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        C1180880gpq c1180880gpq = C1180880gpq.LIZ;
        String str4 = ((MyMomentsMainElementsAssem) akS0S0410000_18.l2).Jo().LL.LIZ;
        MyMomentsData myMomentsData5 = (MyMomentsData) akS0S0410000_18.l0;
        if (myMomentsData5 != null) {
            num = myMomentsData5.userType;
        } else {
            num = null;
        }
        Fragment fragmentLJJJJLL = FragmentManager.LJJJJLL((TuxTextView) akS0S0410000_18.l1);
        c1180880gpq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("enter_method", "main_new_post_icon");
        c2344009Gk.LJ(num, "is_poi_publish_new_user");
        C1180880gpq.LIZLLL(c2344009Gk);
        c2344009Gk.LJIIIIZZ("current_page", "my_year_campaign_landing_page");
        C1180880gpq.LJ(fragmentLJJJJLL, "ttls_my_year_campaign_new_post_click", c2344009Gk.LIZ);
        C1198230hHp c1198230hHpLIZ = ((MyMomentsMainElementsAssem) akS0S0410000_18.l2).Lo().getState().LL.LIZ();
        if (c1198230hHpLIZ != null && (myMomentsData2 = c1198230hHpLIZ.LIZIZ) != null && (hashtagInfo = myMomentsData2.hashtagInfo) != null) {
            l = hashtagInfo.hashtagId;
        }
        C1198230hHp c1198230hHpLIZ2 = ((MyMomentsMainElementsAssem) akS0S0410000_18.l2).Lo().getState().LL.LIZ();
        if (c1198230hHpLIZ2 != null && (myMomentsData = c1198230hHpLIZ2.LIZIZ) != null && (num2 = myMomentsData.userType) != null && num2.intValue() == 1) {
            str = "my_year_campaign_new_user";
        } else {
            str = "my_year_campaign_old_user";
        }
        Context context4 = ((TuxTextView) akS0S0410000_18.l1).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://openShoot?landing_back=1&shoot_way=");
        sbLIZ.append(str);
        sbLIZ.append("&type=use_challenge&challenge_id=");
        sbLIZ.append(l);
        SmartRouter.buildRoute(context4, C2188811AlT.LIZIZ(sbLIZ)).open();
    }

    public AkS0S0410000_18(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z4 = z;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
