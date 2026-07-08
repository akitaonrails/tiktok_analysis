package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZDX;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1575440r6E;
import X.C19EG;
import X.C912570Zr5;
import X.C913380ZsO;
import X.InterfaceC876950Yaj;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.msg.VibeMessageCell;

/* JADX INFO: loaded from: classes15.dex */
public class AbS327S0300000_14 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void LIZ$0(AbS327S0300000_14 abS327S0300000_14, View view) {
        boolean z;
        C19EG c19egLIZIZ;
        String displayName;
        C0Y8Y coreInfo;
        if (view != null) {
            VibeMessageCell vibeMessageCell = (VibeMessageCell) abS327S0300000_14.l0;
            IMUser iMUser = (IMUser) abS327S0300000_14.l1;
            C912570Zr5 c912570Zr5 = (C912570Zr5) abS327S0300000_14.l2;
            vibeMessageCell.I5(false);
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(iMUser)) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            String displayName2 = null;
            if (C0ZDX.LJJIJIIJIL(c912570Zr5.LLILLJJLI)) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c912570Zr5.LLILLJJLI.getConversationId());
                if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null) {
                    displayName2 = coreInfo.getName();
                }
            } else if (z) {
                IMUser iMUserLIZLLL = C1575440r6E.LIZLLL(String.valueOf(C0YNP.LJII(c912570Zr5.LLILLJJLI.getConversationId())));
                if (iMUserLIZLLL != null) {
                    displayName2 = iMUserLIZLLL.getDisplayName();
                }
            } else if (iMUser == null || (displayName2 = iMUser.getDisplayName()) == null) {
                displayName2 = "";
            }
            Context context = vibeMessageCell.itemView.getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                if (displayName2 == null) {
                    displayName2 = "";
                }
                if (iMUser != null && (displayName = iMUser.getDisplayName()) != null) {
                    str = displayName;
                }
                imChatService.LJFF(c19egLIZIZ, supportFragmentManager, displayName2, str, c912570Zr5.LL, c912570Zr5.LLILLJJLI, null, null, c912570Zr5.LLILLL, z, "click_message_bubble", c912570Zr5.LLILZIL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(wh6.AbS327S0300000_14 r22, android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS327S0300000_14.LIZ$1(wh6.AbS327S0300000_14, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS327S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
