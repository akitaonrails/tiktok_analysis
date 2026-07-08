package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C0TZM;
import X.C1094580eae;
import X.C1094610eah;
import X.C1114730f79;
import X.C1143680frq;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C19MB;
import X.C19ME;
import X.C2187701Ajg;
import X.C497740JfY;
import X.C500980Jkm;
import X.C518180KTw;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogStyleSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinDialogV2 extends AbsNewFansClubJoinDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJDHELIOS8/ZiMtJzwwJDAuZzo6ZispPis6KSkjLmEVKSs/CiMmKg8jICEXISQgJigFeg==";
    public final boolean LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public ConstraintLayout LLJLIL;
    public View LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public LinearLayout LLJLLIL;
    public LinearLayout LLJLLL;
    public LinearLayout LLJZ;
    public LinearLayout LLJZIJLIL;
    public LinearLayout LLL;
    public LinearLayout LLLF;
    public LinearLayout LLLFF;
    public TextView LLLFFI;
    public TextView LLLFZ;
    public TextView LLLI;

    public FansClubJoinDialogV2() {
        this(false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.style.aid : R.style.ain;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g65);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (!this.LLJJLIIIJLLLLLLLZ && isShowing()) {
            String str = this.LLJJJJLIIL;
            if (str == null) {
                str = "other_close";
            }
            C518180KTw.LJJIIZI(this.dataChannel, str);
            this.LLJJJJLIIL = null;
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void VR() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View view = getView();
        if (view != null && (viewFindViewById4 = view.findViewById(R.id.bps)) != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 67), viewFindViewById4);
        }
        View view2 = getView();
        if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.h7n)) != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 68), viewFindViewById3);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.iwn)) != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 69), viewFindViewById2);
        }
        View view4 = getView();
        if (view4 == null || (viewFindViewById = view4.findViewById(R.id.mmb)) == null) {
            return;
        }
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 70), viewFindViewById);
    }

    public FansClubJoinDialogV2(boolean z) {
        super(z);
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void NR(View view) {
        Room room;
        User owner;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        if (C1114730f79.LIZ()) {
            WR(0, this.LLJLLIL);
            WR(1, this.LLJLLL);
            WR(2, this.LLJZ);
            WR(3, this.LLJZIJLIL);
            ImageView imageView = (ImageView) view.findViewById(R.id.bps);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.bpm);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.user_profile);
            TextView textView = this.LLLFZ;
            ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
            if (textView != null) {
                layoutParams = textView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams4.topMargin = C497740JfY.LJIIIZ(R.dimen.aro);
                TextView textView2 = this.LLLFZ;
                if (textView2 != null) {
                    C786410Ut5.g6(textView2, marginLayoutParams4);
                }
            }
            TextView textView3 = this.LLLI;
            if (textView3 != null) {
                layoutParams2 = textView3.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams3.topMargin = C497740JfY.LJIIIZ(R.dimen.arn);
                TextView textView4 = this.LLLI;
                if (textView4 != null) {
                    C786410Ut5.g6(textView4, marginLayoutParams3);
                }
            }
            if (imageView != null) {
                layoutParams3 = imageView.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams2.width = C497740JfY.LJIIIZ(R.dimen.ari);
                marginLayoutParams2.height = C497740JfY.LJIIIZ(R.dimen.arh);
                marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(16.0f));
                C786410Ut5.c6(imageView, marginLayoutParams2);
            }
            if (imageView2 != null) {
                layoutParams4 = imageView2.getLayoutParams();
            } else {
                layoutParams4 = null;
            }
            if ((layoutParams4 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.width = C497740JfY.LJIIIZ(R.dimen.arj);
                marginLayoutParams.height = C497740JfY.LJIIIZ(R.dimen.arj);
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.topMargin = 0;
                C786410Ut5.c6(imageView2, marginLayoutParams);
            }
            if (imageView3 != null) {
                layoutParams5 = imageView3.getLayoutParams();
            } else {
                layoutParams5 = null;
            }
            if (layoutParams5 instanceof C19ME) {
                marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            }
            if (marginLayoutParams5 != null) {
                marginLayoutParams5.width = C497740JfY.LJIIIZ(R.dimen.arf);
                marginLayoutParams5.height = C497740JfY.LJIIIZ(R.dimen.arf);
                marginLayoutParams5.setMarginStart((int) C497740JfY.LIZIZ(27.0f));
                C786410Ut5.c6(imageView3, marginLayoutParams5);
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLJLIL);
            c19mb.LJI(R.id.user_profile, 3);
            c19mb.LJI(R.id.user_profile, 4);
            c19mb.LJIIIIZZ(R.id.user_profile, 3, R.id.bps, 3);
            c19mb.LJIIIIZZ(R.id.user_profile, 4, R.id.bps, 4);
            c19mb.LJI(R.id.bpm, 6);
            c19mb.LJI(R.id.bpm, 4);
            c19mb.LJI(R.id.bpm, 3);
            c19mb.LJIIIZ(R.id.bpm, 6, R.id.user_profile, 6, C497740JfY.LJIIIZ(R.dimen.arf) / 2);
            c19mb.LJIIIZ(R.id.bpm, 3, R.id.y1s, 3, (int) C497740JfY.LIZIZ(19.0f));
            c19mb.LIZIZ(this.LLJLIL);
            FansClubPrivilegeConfigSetting fansClubPrivilegeConfigSetting = FansClubPrivilegeConfigSetting.INSTANCE;
            FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig = fansClubPrivilegeConfigSetting.getValue().badgeIconBgConfig;
            if (liveFansPrivilegeElementConfig != null) {
                C1143680frq.LJ(imageView, liveFansPrivilegeElementConfig.channel, liveFansPrivilegeElementConfig.iconFileName, ImageView.ScaleType.FIT_XY);
            }
            FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig2 = fansClubPrivilegeConfigSetting.getValue().badgeIconConfig;
            if (liveFansPrivilegeElementConfig2 != null) {
                C1143680frq.LJ(imageView2, liveFansPrivilegeElementConfig2.channel, liveFansPrivilegeElementConfig2.iconFileName, ImageView.ScaleType.FIT_XY);
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.eze;
            c1324610kZfLJIIIZ.LJJI(imageView3);
            return;
        }
        View viewFindViewById = view.findViewById(R.id.iy1);
        View viewFindViewById2 = view.findViewById(R.id.bsr);
        View viewFindViewById3 = view.findViewById(R.id.f754mmc);
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v3_exclusive_gifts.png");
        C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v3_entrance_spotlight.png");
        C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v3_level_up.png");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ(owner.getAvatarThumb());
            Boolean bool = Boolean.TRUE;
            c1324610kZfLJIIIZ2.LJIILIIL = bool;
            c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.eze;
            c1324610kZfLJIIIZ2.LJJI(this.LLIZLLLIL);
            View viewFindViewById4 = view.findViewById(R.id.bps);
            View viewFindViewById5 = view.findViewById(R.id.bpm);
            View viewFindViewById6 = view.findViewById(R.id.user_profile);
            C1143680frq.LJ(viewFindViewById4, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v3_badge_background.png", ImageView.ScaleType.FIT_XY);
            C1143680frq.LJ(viewFindViewById5, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v3_badge.png", ImageView.ScaleType.FIT_XY);
            C1324610kZf c1324610kZfLJIIIZ3 = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
            c1324610kZfLJIIIZ3.LJIILIIL = bool;
            c1324610kZfLJIIIZ3.LJIIIZ = R.drawable.eze;
            c1324610kZfLJIIIZ3.LJJI(viewFindViewById6);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void PR(View view) {
        super.PR(view);
        this.LLJLIL = (ConstraintLayout) view.findViewById(R.id.u2u);
        this.LLJLL = (LinearLayout) view.findViewById(R.id.ne0);
        this.LLJLLIL = (LinearLayout) view.findViewById(R.id.nda);
        this.LLJLLL = (LinearLayout) view.findViewById(R.id.nhj);
        this.LLJZ = (LinearLayout) view.findViewById(R.id.niv);
        this.LLJZIJLIL = (LinearLayout) view.findViewById(R.id.ndf);
        this.LLL = (LinearLayout) view.findViewById(R.id.h7n);
        this.LLLF = (LinearLayout) view.findViewById(R.id.iwn);
        this.LLLFF = (LinearLayout) view.findViewById(R.id.mmb);
        this.LLLFFI = (TextView) view.findViewById(R.id.tv_privilege_new_tip);
        this.LLLFZ = (TextView) view.findViewById(R.id.ho2);
        this.LLLI = (TextView) view.findViewById(R.id.y1s);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (!this.LLJJLIIIJLLLLLLLZ) {
            C518180KTw.LJJIIZI(this.dataChannel, "click_return");
            this.LLJJJJLIIL = null;
        }
    }

    public final void WR(int i, ViewGroup viewGroup) {
        int size;
        ImageView imageView;
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig;
        FansClubPrivilegeConfigSetting fansClubPrivilegeConfigSetting = FansClubPrivilegeConfigSetting.INSTANCE;
        List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list = fansClubPrivilegeConfigSetting.getValue().privilegeElements;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (i >= size) {
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        TextView textView = null;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.lry);
            textView = (TextView) viewGroup.findViewById(R.id.tv_privilege);
        } else {
            imageView = null;
        }
        List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list2 = fansClubPrivilegeConfigSetting.getValue().privilegeElements;
        if (list2 != null && (liveFansPrivilegeElementConfig = (FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig) ListProtector.get(list2, i)) != null) {
            C1094610eah.LIZ.getClass();
            C1094610eah.LIZ(imageView, textView, liveFansPrivilegeElementConfig);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int size;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewTreeObserver viewTreeObserver;
        JoinDialogViewModel joinDialogViewModel;
        this.LLILZ = "badage_reward";
        super.onViewCreated(view, bundle);
        SR();
        if (FansClubJoinDialogStyleSetting.INSTANCE.getValue() != 3 && (joinDialogViewModel = this.LLILLL) != null) {
            joinDialogViewModel.wQ2();
        }
        this.LLJL = (FrameLayout) view.findViewById(R.id.u2r);
        this.LLJLILLLLZIIL = view.findViewById(R.id.uy1);
        ViewGroup.LayoutParams layoutParams = null;
        if (!C1114730f79.LIZ()) {
            int iLJIILLIIL = (int) ((((double) C497740JfY.LJIILLIIL()) * 0.7d) - ((double) ((int) C497740JfY.LIZIZ(186.0f))));
            FrameLayout frameLayout = this.LLJL;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    if (iLJIILLIIL >= ((int) C497740JfY.LIZIZ(360.0f))) {
                        iLJIILLIIL = (int) C497740JfY.LIZIZ(360.0f);
                    }
                    layoutParams2.height = iLJIILLIIL;
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.a6(frameLayout, layoutParams2);
            }
        }
        FrameLayout frameLayout2 = this.LLJL;
        if (frameLayout2 != null && (viewTreeObserver = frameLayout2.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0ec3
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View childAt;
                    FrameLayout frameLayout3 = this.LL.LLJL;
                    int bottom = (frameLayout3 == null || (childAt = frameLayout3.getChildAt(0)) == null) ? 0 : childAt.getBottom();
                    FrameLayout frameLayout4 = this.LL.LLJL;
                    int height = frameLayout4 != null ? frameLayout4.getHeight() : 0;
                    FrameLayout frameLayout5 = this.LL.LLJL;
                    if (bottom - (height + (frameLayout5 != null ? frameLayout5.getScrollY() : 0)) <= 0) {
                        View view2 = this.LL.LLJLILLLLZIIL;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(8, view2);
                            return;
                        }
                        return;
                    }
                    View view3 = this.LL.LLJLILLLLZIIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                }
            };
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
        }
        if (C1114730f79.LIZ()) {
            LinearLayout linearLayout = this.LLJLL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            LinearLayout linearLayout2 = this.LLL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
            LinearLayout linearLayout3 = this.LLLF;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(8, linearLayout3);
            }
            LinearLayout linearLayout4 = this.LLLFF;
            if (linearLayout4 != null) {
                C786410Ut5.LJZL(8, linearLayout4);
            }
        } else {
            LinearLayout linearLayout5 = this.LLJLL;
            if (linearLayout5 != null) {
                C786410Ut5.LJZL(8, linearLayout5);
            }
            TextView textView = this.LLLFFI;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            LinearLayout linearLayout6 = this.LLL;
            if (linearLayout6 != null) {
                C786410Ut5.LJZL(0, linearLayout6);
            }
            LinearLayout linearLayout7 = this.LLLF;
            if (linearLayout7 != null) {
                C786410Ut5.LJZL(0, linearLayout7);
            }
            LinearLayout linearLayout8 = this.LLLFF;
            if (linearLayout8 != null) {
                C786410Ut5.LJZL(0, linearLayout8);
            }
        }
        if (C1114730f79.LIZ()) {
            FansClubPrivilegeConfigSetting fansClubPrivilegeConfigSetting = FansClubPrivilegeConfigSetting.INSTANCE;
            if (Intrinsics.LJFF(fansClubPrivilegeConfigSetting.getValue().showNewIcon, Boolean.TRUE)) {
                int i = fansClubPrivilegeConfigSetting.getValue().showNewIconPos + 1;
                List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list = fansClubPrivilegeConfigSetting.getValue().privilegeElements;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                C1094580eae c1094580eae = C1094580eae.LIZ;
                TextView textView2 = this.LLLFFI;
                c1094580eae.getClass();
                C1094580eae.LJIIIIZZ(textView2);
                C1094580eae.LJIILIIL(this.LLLFFI);
                TextView textView3 = this.LLLFFI;
                if (textView3 != null) {
                    layoutParams = textView3.getLayoutParams();
                }
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && size > 0) {
                    TextView textView4 = this.LLLFFI;
                    if (textView4 != null) {
                        C786410Ut5.LLIL(textView4, 0);
                    }
                    marginLayoutParams.setMarginStart(((i * C497740JfY.LJIIZILJ()) / (size * 2)) + ((int) C497740JfY.LIZIZ(9.0f)));
                    TextView textView5 = this.LLLFFI;
                    if (textView5 != null) {
                        C786410Ut5.g6(textView5, marginLayoutParams);
                    }
                }
            }
        }
        if (!this.LLJJLIIIJLLLLLLLZ) {
            C518180KTw.LJJIJ(this.dataChannel);
        }
    }
}
