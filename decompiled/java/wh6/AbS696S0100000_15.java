package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C774720UaE;
import X.C785410UrT;
import X.C786410Ut5;
import X.C929690aIh;
import X.C942270acz;
import X.C942280ad0;
import X.C945810aih;
import X.C946630ak1;
import X.C955400ayA;
import X.C962850bAB;
import X.C964580bCy;
import X.DialogC929590aIX;
import X.EnumC928480aGk;
import X.EnumC964540bCu;
import X.InterfaceC945820aii;
import X.InterfaceC964570bCx;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomInAction;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicLargeViewBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AbS696S0100000_15 extends AbstractViewOnClickListenerC1637610siV {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS696S0100000_15(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(wh6.AbS696S0100000_15 r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS696S0100000_15.LIZ$0(wh6.AbS696S0100000_15, android.view.View):void");
    }

    public static final void LIZ$1(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            DialogC929590aIX dialogC929590aIX = (DialogC929590aIX) abS696S0100000_15.l0;
            dialogC929590aIX.dismiss();
            C785410UrT.LIZ(dialogC929590aIX);
        }
    }

    public static final void LIZ$10(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            C962850bAB c962850bAB = (C962850bAB) abS696S0100000_15.l0;
            c962850bAB.LLILZ.invoke(Integer.valueOf(c962850bAB.getAdapterPosition()));
        }
    }

    public static final void LIZ$11(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            C942270acz.LIZJ("enlarge");
            C942280ad0 c942280ad0 = (C942280ad0) abS696S0100000_15.l0;
            c942280ad0.LLJI = true;
            int[] iArr = new int[2];
            c942280ad0.getWindow().getLocationInWindow(iArr);
            ((C942280ad0) abS696S0100000_15.l0).getDataChannel().LC0(LivePreviewGuestLayoutZoomInAction.class, new C774720UaE(((C942280ad0) abS696S0100000_15.l0).getWindow().getWidth(), ((C942280ad0) abS696S0100000_15.l0).getWindow().getHeight(), iArr));
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LIZ$2(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            ((Function1) abS696S0100000_15.l0).invoke(view);
        }
    }

    public static final void LIZ$3(AbS696S0100000_15 abS696S0100000_15, View view) {
        Context context;
        if (view != null && (context = ((MultiGuestUserInfoFragment) abS696S0100000_15.l0).getContext()) != null) {
            EnumC928480aGk enumC928480aGk = EnumC928480aGk.GUEST_PANEL;
            C929690aIh c929690aIh = new C929690aIh((MultiGuestUserInfoFragment) abS696S0100000_15.l0);
            MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) abS696S0100000_15.l0;
            C786410Ut5.H4(new DialogC929590aIX(context, enumC928480aGk, c929690aIh, multiGuestUserInfoFragment.applyListFilterCurRoom, multiGuestUserInfoFragment.beInviteListFilterCurRoom, multiGuestUserInfoFragment.dataChannel, 0, null, 192));
            ((MultiGuestUserInfoFragment) abS696S0100000_15.l0).RR(false);
        }
    }

    public static final void LIZ$4(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            ((C946630ak1) abS696S0100000_15.l0).C0();
        }
    }

    public static final void LIZ$5(AbS696S0100000_15 abS696S0100000_15, View view) {
        FrameLayout frameLayout;
        if (view != null && (frameLayout = ((C945810aih) abS696S0100000_15.l0).LJFF) != null) {
            int id = frameLayout.getId();
            InterfaceC945820aii interfaceC945820aii = ((C945810aih) abS696S0100000_15.l0).LIZ.LJ;
            if (interfaceC945820aii != null) {
                interfaceC945820aii.LIZ(id);
            }
        }
    }

    public static final void LIZ$6(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            Context context = ((InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder) abS696S0100000_15.l0).itemView.getContext();
            int i = InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder.LLLILZ;
            Map mapLJJJ = C955400ayA.LJJJ("cohost_panel");
            if (mapLJJJ != null) {
                C955400ayA.LLIILII("livesdk_connection_preference_entrace_click", mapLJJJ);
            }
            InterfaceC964570bCx.LIZ.getClass();
            if (C964580bCy.LIZIZ == null && !C964580bCy.LIZJ) {
                C964580bCy.LIZJ = true;
                try {
                    Class.forName("vj0.d");
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            InterfaceC964570bCx interfaceC964570bCx = C964580bCy.LIZIZ;
            if (interfaceC964570bCx != null) {
                interfaceC964570bCx.LIZ(context, EnumC964540bCu.QUICK_PAIR_CARD);
            }
        }
    }

    public static final void LIZ$7(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            ((Function1) abS696S0100000_15.l0).invoke(view);
        }
    }

    public static final void LIZ$8(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            ((Function1) abS696S0100000_15.l0).invoke(view);
        }
    }

    public static final void LIZ$9(AbS696S0100000_15 abS696S0100000_15, View view) {
        if (view != null) {
            ((Function1) abS696S0100000_15.l0).invoke(view);
        }
    }
}
