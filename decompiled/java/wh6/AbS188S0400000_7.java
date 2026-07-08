package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C0JCX;
import X.C0K2G;
import X.C0K2I;
import X.C0K3V;
import X.C0K3Y;
import X.C0K51;
import X.C0K54;
import X.C0KS8;
import X.C0KSH;
import X.C0KSX;
import X.C0KSY;
import X.C0KT5;
import X.C1095140ebY;
import X.C16FS;
import X.C2097608Jq;
import X.C474500IjA;
import X.C475510Ikn;
import X.C511370K3r;
import X.C511390K3t;
import X.C518180KTw;
import X.InterfaceC517920KSw;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinFragment;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes8.dex */
public class AbS188S0400000_7 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS188S0400000_7 abS188S0400000_7, View view) {
        boolean z;
        String str;
        C1095140ebY c1095140ebY;
        if (view != null) {
            C16FS c16fs = (C16FS) abS188S0400000_7.l0;
            if (!c16fs.LLJJIJI) {
                c16fs.LJ();
                SuperFanJoinFragment superFanJoinFragment = (SuperFanJoinFragment) abS188S0400000_7.l1;
                SuperFanViewModel superFanViewModel = superFanJoinFragment.LLILLJJLI;
                if (superFanViewModel != null) {
                    C0KT5 c0kt5MR = superFanJoinFragment.MR();
                    final SuperFanJoinFragment superFanJoinFragment2 = (SuperFanJoinFragment) abS188S0400000_7.l1;
                    final C16FS c16fs2 = (C16FS) abS188S0400000_7.l0;
                    superFanViewModel.zQ2(c0kt5MR, new InterfaceC517920KSw() { // from class: X.1Dh5
                        @Override // X.InterfaceC517920KSw
                        public final void onFailure() {
                            C500260Jjc.LJJLIIIJILLIZJL(new AwS436S0200000_35(superFanJoinFragment2, c16fs2, 61));
                        }

                        @Override // X.InterfaceC517920KSw
                        public final void onSuccess() {
                            C500260Jjc.LJJLIIIJILLIZJL(new AwS579S0100000_35(superFanJoinFragment2, 259));
                        }
                    });
                }
                SuperFanJoinFragment superFanJoinFragment3 = (SuperFanJoinFragment) abS188S0400000_7.l1;
                if (((C0KS8) abS188S0400000_7.l2).LIZIZ != null && C0KSX.LIZIZ((C0KSY) abS188S0400000_7.l3)) {
                    z = true;
                } else {
                    z = false;
                }
                Fragment parentFragment = superFanJoinFragment3.getParentFragment();
                if (parentFragment instanceof SuperFanJoinDialog) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_superfan_purchase_page_click");
                    c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(superFanJoinFragment3));
                    c474500IjALIZ.LJJII(((SuperFanJoinDialog) parentFragment).LLJLLL, "source_page");
                    DataChannel dataChannelLJ = C475510Ikn.LJ(superFanJoinFragment3);
                    if (dataChannelLJ != null && (c1095140ebY = (C1095140ebY) dataChannelLJ.gg0(FansClubChannel.class)) != null) {
                        c474500IjALIZ.LJJII(Long.valueOf(c1095140ebY.LIZ), "fans_club_level");
                        c474500IjALIZ.LJJII(C518180KTw.LJJII(c1095140ebY.LJ, c1095140ebY.LIZ, false), "fans_club_status");
                    }
                    if (superFanJoinFragment3.LLIZLLLIL) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ.LJJII(str, "if_discount");
                    c474500IjALIZ.LIZ();
                } else if (parentFragment instanceof FansClubJoinDialog) {
                    C518180KTw.LJJIIJ(C475510Ikn.LJ(superFanJoinFragment3), ((FansClubJoinDialog) parentFragment).LLJZ, "superfan", -1, superFanJoinFragment3.LLIZLLLIL, false);
                }
                C0KSH.LJIILL(C475510Ikn.LJ(superFanJoinFragment3), superFanJoinFragment3.LL, z);
            }
        }
    }

    public static final void LIZ$1(AbS188S0400000_7 abS188S0400000_7, View view) {
        if (view != null) {
            if (((SpacePost) abS188S0400000_7.l0).previewMode) {
                C511390K3t.LIZ((C511370K3r) abS188S0400000_7.l1, ((C0K2G) abS188S0400000_7.l2).itemView.getContext());
            } else if (C0K51.LJI(Boolean.valueOf(((C511370K3r) abS188S0400000_7.l1).LLILZIL)) && ((C0K2G) abS188S0400000_7.l2).LL.AQ2()) {
                C0JCX.LIZ(2131839561);
            } else {
                C0K2G c0k2g = (C0K2G) abS188S0400000_7.l2;
                SpacePost spacePost = ((C0K2I) abS188S0400000_7.l3).LIZ;
                c0k2g.getClass();
                String str = spacePost.videoJumpUrl;
                if (str != null) {
                    C0K54.LIZ().LJ(c0k2g.itemView.getContext(), str, C2097608Jq.LJ());
                }
            }
            ((C0K2G) abS188S0400000_7.l2).LL.xQ2().LIZ((SpacePost) abS188S0400000_7.l0, "video_inner");
        }
    }

    public static final void LIZ$2(AbS188S0400000_7 abS188S0400000_7, View view) {
        if (view != null) {
            ((C0K3V) abS188S0400000_7.l0).P5((User) abS188S0400000_7.l1);
            C0K3Y c0k3y = (C0K3Y) abS188S0400000_7.l2;
            if (c0k3y != null) {
                c0k3y.LIZ((SpacePost) abS188S0400000_7.l3, "enter_homepage");
            }
        }
    }

    public static final void LIZ$3(AbS188S0400000_7 abS188S0400000_7, View view) {
        if (view != null) {
            ((C0K3V) abS188S0400000_7.l0).P5((User) abS188S0400000_7.l1);
            C0K3Y c0k3y = (C0K3Y) abS188S0400000_7.l2;
            if (c0k3y != null) {
                c0k3y.LIZ((SpacePost) abS188S0400000_7.l3, "enter_homepage");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS188S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
