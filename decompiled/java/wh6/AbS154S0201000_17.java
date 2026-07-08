package wh6;

import X.AbstractC1126600fQI;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C1098700ehI;
import X.C1123380fL6;
import X.C1125940fPE;
import X.C1128450fTH;
import X.C1128460fTI;
import X.C1128760fTm;
import X.C1128970fU7;
import X.C1130100fVw;
import X.C293001Bo;
import X.C474500IjA;
import X.C930940aKi;
import X.InterfaceC1098680ehG;
import X.InterfaceC1126580fQG;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public class AbS154S0201000_17 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public int i2;
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS154S0201000_17 abS154S0201000_17, View view) {
        int iLJIILLIIL;
        int i;
        String strLJIILL;
        Long lValueOf;
        Long lValueOf2;
        String str;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        User owner;
        Gift gift;
        Gift.SchemeInfo schemeInfo;
        if (view != null) {
            ((C1125940fPE) abS154S0201000_17.l0).C6();
            C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
            long jLJFF = ((AbstractC1126600fQI) abS154S0201000_17.l1).LJFF();
            InterfaceC1126580fQG interfaceC1126580fQG = ((C1125940fPE) abS154S0201000_17.l0).LLJL;
            if (interfaceC1126580fQG != null) {
                iLJIILLIIL = interfaceC1126580fQG.LJIILLIIL(((AbstractC1126600fQI) abS154S0201000_17.l1).LJFF());
            } else {
                iLJIILLIIL = abS154S0201000_17.i2;
            }
            C1125940fPE c1125940fPE = (C1125940fPE) abS154S0201000_17.l0;
            AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) abS154S0201000_17.l1;
            c1125940fPE.getClass();
            C293001Bo c293001BoZ6 = C1125940fPE.z6(abstractC1126600fQI);
            if (c293001BoZ6 != null && (gift = (Gift) c293001BoZ6.LIZIZ) != null && (schemeInfo = gift.schemeInfo) != null) {
                i = schemeInfo.schemeGiftType;
            } else {
                i = 0;
            }
            InterfaceC1126580fQG interfaceC1126580fQG2 = ((C1125940fPE) abS154S0201000_17.l0).LLJL;
            Long lValueOf3 = null;
            if (interfaceC1126580fQG2 != null) {
                strLJIILL = interfaceC1126580fQG2.LJIILL();
            } else {
                strLJIILL = null;
            }
            c1128760fTm.getClass();
            w.LIZ.getClass();
            String strLJIIIZ = w.LJIIIZ();
            String strLJIIL = w.LJIIL();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            boolean zLJIJJLI = C1128760fTm.LJIJJLI();
            JSONObject jSONObject = new JSONObject();
            C1123380fL6.LIZ(jSONObject);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_scheme_entry_click");
            c474500IjALIZ.LJJIIJZLJL(jSONObject);
            c474500IjALIZ.LJJII(strLJIIIZ, "enter_from_merge");
            c474500IjALIZ.LJJII(strLJIIL, "enter_method");
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "room_id");
            if (room != null && (owner = room.getOwner()) != null) {
                lValueOf2 = Long.valueOf(owner.getId());
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "anchor_id");
            UserService userService = UserService.getInstance();
            if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                lValueOf3 = Long.valueOf(currentUser.getId());
            }
            c474500IjALIZ.LJJII(lValueOf3, "user_id");
            if (zLJIJJLI) {
                str = "anchor";
            } else {
                str = "user";
            }
            c474500IjALIZ.LJJII(str, "user_type");
            c474500IjALIZ.LJJII(Integer.valueOf(iLJIILLIIL), "gift_position");
            c474500IjALIZ.LJJII(Integer.valueOf(GiftManager.inst().getGiftPosition(jLJFF)), "actual_gift_position");
            String str2 = c1128760fTm.LJI;
            if (str2 == null) {
                str2 = "icon";
            }
            c474500IjALIZ.LJJII(str2, "gift_enter_from");
            c474500IjALIZ.LJJII(C1128450fTH.LJFF(), "send_gift_scene");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "scheme_type");
            C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
            c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(c1128970fU7.LJFF), ""), "tab_name");
            c474500IjALIZ.LJJII(Integer.valueOf(GiftManager.inst().getTabLocation(c1128970fU7.LJFF, true)), "tab_location");
            c474500IjALIZ.LJJII(strLJIILL, "request_panel_id");
            c474500IjALIZ.LJJII(Long.valueOf(jLJFF), "gift_id");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LIZ$1(AbS154S0201000_17 abS154S0201000_17, View view) {
        InterfaceC1098680ehG interfaceC1098680ehG;
        if (view != null && (interfaceC1098680ehG = ((C1098700ehI) abS154S0201000_17.l0).LLILLJJLI) != null) {
            interfaceC1098680ehG.LIZ(view, abS154S0201000_17.i2, (BannerInRoom) abS154S0201000_17.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS154S0201000_17(Object obj, Object obj2, int i, int i2) {
        super(500L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
