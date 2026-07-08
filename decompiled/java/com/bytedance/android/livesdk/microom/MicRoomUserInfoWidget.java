package com.bytedance.android.livesdk.microom;

import X.C011Z;
import X.C09JN;
import X.C0IJT;
import X.C0JSS;
import X.C0KVO;
import X.C0KVU;
import X.C0KYL;
import X.C0TZM;
import X.C1096340edU;
import X.C1099380eiO;
import X.C1099430eiT;
import X.C1099610eil;
import X.C1119850fFP;
import X.C1121670fIL;
import X.C1126540fQC;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C12ES;
import X.C1324570kZb;
import X.C1324720kZq;
import X.C16F5;
import X.C16FV;
import X.C1701940uOG;
import X.C1834150xpV;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2093608Ic;
import X.C2273311DyT;
import X.C418440Gaw;
import X.C466640IRq;
import X.C474130IiZ;
import X.C474500IjA;
import X.C496970JeJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521890KdP;
import X.C522060Kdg;
import X.C760370TsB;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1096020ecy;
import X.EnumC760350Ts9;
import X.InterfaceC1085480eLy;
import X.InterfaceC500940Jki;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS142S0100000_7;
import Y.ALAdapterS4S0100000_7;
import Y.ALAdapterS4S0200000_7;
import Y.ARunnableS107S0100000_7;
import Y.AUListenerS217S0200000_7;
import Y.AfS176S0100000_7;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ShowUserProfileEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.BorderInfoUpdateEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconNeedHideTextSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionAudienceEntranceEnhanceSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class MicRoomUserInfoWidget extends RoomRecycleWidget {
    public C1324720kZq LL;
    public Room LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC500940Jki LLILZIL;
    public View LLIZ;
    public View LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public ImageView LLJIJIL;
    public boolean LLJILJIL;
    public View LLJJ;
    public ViewGroup LLJJI;
    public ViewGroup LLJJIII;
    public C16F5 LLJJIJI;
    public LiveIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public C1126540fQC LLJJJ;
    public ImageView LLJJJIL;
    public ImageView LLJJJJ;
    public TextView LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public C1099610eil LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C1096340edU LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public final C11NJ LLILZ = new C11NJ();
    public boolean LLILZLL = ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1();
    public String LLJILJILJ = "";
    public String LLJILLL = "";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h5z;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup = this.LLJJJJLIIL;
        Drawable background = viewGroup != null ? viewGroup.getBackground() : null;
        if (!(background instanceof GradientDrawable) || (gradientDrawable = (GradientDrawable) background) == null) {
            return;
        }
        gradientDrawable.setColor(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(this.LLILLJJLI, null) ? C20736316Cj.LIZIZ(R.attr.ep5, C1834150xpV.LJII(this.context)) : C20736316Cj.LIZIZ(R.attr.exm, C1834150xpV.LJII(this.context)));
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(16.0f));
    }

    public final void B1() {
        C16F5 c16f5;
        C16F5 c16f52;
        if (!this.LLJILJIL || (c16f5 = this.LLJ) == null || (c16f52 = this.LLJI) == null) {
            return;
        }
        ViewGroup viewGroup = this.LLJJI;
        int width = viewGroup != null ? viewGroup.getWidth() + ((int) C497740JfY.LIZIZ(4.0f)) : 0;
        float fMeasureText = c16f52.getPaint().measureText(this.LLJILJILJ) - c16f52.getWidth();
        if (fMeasureText <= 0.0f) {
            c16f5.setMaxWidth(c16f5.getWidth() + width);
            return;
        }
        float f = width;
        if (fMeasureText <= f) {
            c16f5.setMaxWidth((int) (c16f5.getWidth() + (f - fMeasureText)));
        }
    }

    public final void D1() {
        User owner;
        Room room = this.LLILLJJLI;
        if (room == null) {
            return;
        }
        User owner2 = room.getOwner();
        UserProfileEvent userProfileEvent = new UserProfileEvent(owner2 != null ? owner2.getId() : 0L);
        userProfileEvent.mSource = "video_head";
        Room room2 = this.LLILLJJLI;
        userProfileEvent.setEnigmaOutside((room2 == null || (owner = room2.getOwner()) == null) ? null : owner.enigmaInfo);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(ShowUserProfileEvent.class, userProfileEvent);
        }
    }

    public final void y1() {
        C1096340edU c1096340edU;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        View view2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup viewGroup;
        User owner;
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        ImageModel imageModel;
        C16F5 c16f5;
        TextPaint paint;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        C1099610eil c1099610eil;
        User owner2;
        FollowInfo followInfo;
        User owner3;
        FollowInfo followInfo2;
        C1096340edU c1096340edU2 = this.LLJLIL;
        if (c1096340edU2 != null) {
            c1096340edU2.LIZ(EnumC1096020ecy.UNFOLLOW);
        }
        Room room = this.LLILLJJLI;
        if ((((room == null || (owner3 = room.getOwner()) == null || (followInfo2 = owner3.getFollowInfo()) == null) ? -1L : followInfo2.getFollowStatus()) == 2 || (room != null && (owner2 = room.getOwner()) != null && (followInfo = owner2.getFollowInfo()) != null && followInfo.getFollowStatus() == 1)) && (c1096340edU = this.LLJLIL) != null) {
            c1096340edU.LIZ(EnumC1096020ecy.FOLLOWED);
        }
        C1324720kZq c1324720kZq = this.LL;
        if (c1324720kZq == null) {
            c1324720kZq = null;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 8);
        Room room2 = this.LLILLJJLI;
        if (room2 != null) {
            if (room2.getOwner() == null) {
                return;
            }
            this.LLJJL = (C1099610eil) findViewById(R.id.b1y);
            if (C1099380eiO.LIZ(C500260Jjc.LJIIZILJ(this.dataChannel)) && (c1099610eil = this.LLJJL) != null) {
                c1099610eil.setUseNewMute(true);
            }
            if (!this.LLILLL && room2.getOwner().getAvatarThumb() != null) {
                C1121670fIL.LJIIL(this.LLJJL, room2.getOwner().getAvatarThumb(), R.drawable.el_);
                C0JSS.LJIIIIZZ(this.LLJJL, room2.getOwner().getAvatarThumb(), 0, 0, R.drawable.el_, new C521890KdP(this, 3));
                this.LLILLL = true;
            }
            C16F5 c16f52 = (C16F5) findViewById(R.id.b0x);
            if (this.LLILZLL) {
                c16f52.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)));
            } else {
                c16f52.setMaxWidth(Integer.MAX_VALUE);
            }
            this.LLJ = c16f52;
            ImageView imageView = (ImageView) findViewById(R.id.bbw);
            this.LLJIJIL = imageView;
            if (imageView != null) {
                User owner4 = room2.getOwner();
                if (owner4.getAuthenticationInfo() != null) {
                    C12ES.LJIILL(0, this.LLJIJIL);
                    C0JSS.LJFF(this.LLJIJIL, owner4.getAuthenticationInfo().authenticationBadge, 0, new C522060Kdg(this, 2));
                } else {
                    C12ES.LJIILL(8, this.LLJIJIL);
                    ImageView imageView2 = this.LLJIJIL;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(null);
                    }
                }
            }
            C16F5 c16f53 = this.LLJ;
            if (c16f53 != null) {
                c16f53.LJJJI(R.style.a91);
            }
            View viewFindViewById = findViewById(R.id.jhs);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
                    return;
                }
                marginLayoutParams5.setMarginStart(0);
                C786410Ut5.W5(viewFindViewById, marginLayoutParams5);
            }
            this.LLJI = (C16F5) findViewById(R.id.v_p);
            C16F5 c16f54 = this.LLJI;
            if (c16f54 != null) {
                ViewGroup.LayoutParams layoutParams4 = c16f54.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    int iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
                    marginLayoutParams4.setMarginEnd(iLIZIZ);
                    marginLayoutParams4.rightMargin = iLIZIZ;
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(3.0f);
                    marginLayoutParams4.setMarginStart(iLIZIZ2);
                    marginLayoutParams4.leftMargin = iLIZIZ2;
                    C786410Ut5.y6(c16f54, marginLayoutParams4);
                }
            }
            this.LLJILLL = C0KVU.LIZ(room2.getOwner());
            this.LLJILJILJ = C497740JfY.LJIJI(2131853638);
            C16F5 c16f55 = this.LLJ;
            if (c16f55 != null) {
                c16f55.setText(this.LLJILLL);
            }
            if (this.LLILZLL) {
                C16F5 c16f56 = this.LLJ;
                if (((c16f56 == null || (paint = c16f56.getPaint()) == null) ? 0.0f : paint.measureText(this.LLJILLL)) > ((int) C497740JfY.LIZIZ(80.0f))) {
                    C16F5 c16f57 = this.LLJ;
                    if (c16f57 != null) {
                        c16f57.setTextSize(12.0f);
                    }
                    C16F5 c16f58 = this.LLJ;
                    if (c16f58 != null) {
                        c16f58.setLetterSpacing(-0.04f);
                    }
                } else {
                    C16F5 c16f59 = this.LLJ;
                    if (c16f59 != null) {
                        c16f59.setTextSize(12.0f);
                    }
                    C16F5 c16f510 = this.LLJ;
                    if (c16f510 != null) {
                        c16f510.setLetterSpacing(0.0f);
                    }
                }
            } else {
                C16F5 c16f511 = this.LLJ;
                if (c16f511 != null) {
                    c16f511.setTextSize(12.0f);
                }
                C16F5 c16f512 = this.LLJ;
                if (c16f512 != null) {
                    c16f512.setLetterSpacing(0.0f);
                }
            }
            C16F5 c16f513 = this.LLJI;
            if (c16f513 != null) {
                c16f513.setText(this.LLJILJILJ);
            }
            if (!this.LLILZLL && (c16f5 = this.LLJ) != null) {
                HandlerHook.viewPost(c16f5, new ARunnableS107S0100000_7(this, 92));
            }
            C16F5 c16f514 = this.LLJ;
            if (c16f514 != null) {
                C786410Ut5.l8(c16f514, new ACListenerS142S0100000_7(this, 83));
            }
            C1099610eil c1099610eil2 = this.LLJJL;
            if (c1099610eil2 != null) {
                C786410Ut5.H8(c1099610eil2, new ACListenerS142S0100000_7(this, 84));
            }
            BorderInfo borderInfoLIZ = C496970JeJ.LIZ(room2.getOwner());
            if (borderInfoLIZ != null && (imageModel = borderInfoLIZ.icon) != null) {
                C1324720kZq c1324720kZq2 = this.LL;
                if (c1324720kZq2 == null) {
                    c1324720kZq2 = null;
                }
                C1324570kZb.LIZIZ(imageModel, c1324720kZq2);
                C1324720kZq c1324720kZq3 = this.LL;
                if (c1324720kZq3 == null) {
                    c1324720kZq3 = null;
                }
                C786410Ut5.LLJJIII(c1324720kZq3, 0);
                C496970JeJ.LIZIZ(room2.getOwner(), "top_left_corner", "top_left_corner", C500260Jjc.LJIIZILJ(this.dataChannel));
            }
            C1(C496970JeJ.LIZ(room2.getOwner()));
            IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
            if (iBarrageService != null && (interfaceC1085480eLyO41 = iBarrageService.O41(room2.getId())) != null && interfaceC1085480eLyO41.isEnabled() && interfaceC1085480eLyO41.LIZIZ()) {
                interfaceC1085480eLyO41.LIZ(this.LLJJL);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MuteMicChannel.class, new AwS586S0100000_7(this, 160));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, BorderInfoUpdateEvent.class, new AwS586S0100000_7(this, 161));
        }
        InterfaceC500940Jki interfaceC500940Jki = this.LLILZIL;
        if (interfaceC500940Jki != null) {
            Room room3 = this.LLILLJJLI;
            C11NZ<FollowPair> c11nzLIZIZ = interfaceC500940Jki.LIZIZ((room3 == null || (owner = room3.getOwner()) == null) ? 0L : owner.getId());
            if (c11nzLIZIZ != null) {
                this.LLILZ.LIZ(c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 83), new C09JN() { // from class: X.0IZQ
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("MicRoomUserInfoWidget@481.initWithRoom$4$2");
                        C1C7U.LIZIZ("MicRoomUserInfoWidget@481.initWithRoom$4$2");
                    }
                }));
            }
        }
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).Ve2(this.LLILLJJLI) && (viewGroup = this.LLJJJJLIIL) != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        show();
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
        if (iProgrammedLiveService != null && iProgrammedLiveService.lm1() && (view2 = getView()) != null && (layoutParams2 = view2.getLayoutParams()) != null) {
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams3.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
            View view3 = getView();
            if (view3 != null) {
                C786410Ut5.W5(view3, marginLayoutParams3);
            }
        }
        if (!Intrinsics.LJFF(this.dataChannel.gg0(C0TZM.class), Boolean.TRUE) && (view = getView()) != null && (layoutParams = view.getLayoutParams()) != null) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(8.0f);
            View view4 = getView();
            if (view4 != null) {
                C786410Ut5.W5(view4, marginLayoutParams2);
            }
        }
        C1099610eil c1099610eil3 = this.LLJJL;
        if (c1099610eil3 != null) {
            ViewGroup.LayoutParams layoutParams5 = c1099610eil3.getLayoutParams();
            layoutParams5.width = (int) C497740JfY.LIZIZ(22.0f);
            layoutParams5.height = (int) C497740JfY.LIZIZ(22.0f);
            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                int iLIZIZ3 = (int) C497740JfY.LIZIZ(1.0f);
                marginLayoutParams.leftMargin = iLIZIZ3;
                marginLayoutParams.setMarginStart(iLIZIZ3);
            }
            C786410Ut5.B6(c1099610eil3, layoutParams5);
        }
    }

    public MicRoomUserInfoWidget() {
        if (!SubscriptionAudienceEntranceEnhanceSetting.INSTANCE.getValue() || C497740JfY.LJJI(C497740JfY.LJIIZILJ()) <= SubscriptionIconHideTextMinimumDimensionSetting.INSTANCE.getValue()) {
            return;
        }
        SubscriptionIconNeedHideTextSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(com.bytedance.android.livesdk.model.BorderInfo r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L7d
            com.bytedance.android.live.base.model.ImageModel r0 = r6.icon
            if (r0 == 0) goto L7d
            android.view.ViewGroup r0 = r5.LLJJJJLIIL
            if (r0 == 0) goto L7b
            android.graphics.drawable.Drawable r2 = r0.getBackground()
        Lf:
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r6 == 0) goto L79
            java.lang.String r0 = r6.avatarBackgroundColor
        L15:
            java.lang.String r4 = ""
            if (r0 == 0) goto L6c
            if (r6 == 0) goto L6a
            java.lang.String r0 = r6.avatarBackgroundColor
        L1d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 != 0) goto L6c
            if (r6 == 0) goto L68
            java.lang.String r0 = r6.avatarBackgroundColor
        L27:
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.setColor(r0)
        L2e:
            if (r6 == 0) goto L5a
            java.lang.String r0 = r6.avatarBackgroundBorderColor
            if (r0 == 0) goto L5a
            if (r6 == 0) goto L58
            java.lang.String r0 = r6.avatarBackgroundBorderColor
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 != 0) goto L5a
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r1 = (int) r0
            if (r6 == 0) goto L49
            java.lang.String r3 = r6.avatarBackgroundBorderColor
        L49:
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            r2.setStroke(r1, r0)
        L50:
            android.view.ViewGroup r0 = r5.LLJJJJLIIL
            if (r0 == 0) goto L57
            r0.setBackground(r2)
        L57:
            return
        L58:
            r0 = r3
            goto L38
        L5a:
            android.content.Context r1 = r5.context
            r0 = 2131107314(0x7f061df2, float:1.7827204E38)
            int r1 = X.C20736316Cj.LIZIZ(r0, r1)
            r0 = 0
            r2.setStroke(r0, r1)
            goto L50
        L68:
            r0 = r3
            goto L27
        L6a:
            r0 = r3
            goto L1d
        L6c:
            android.content.Context r1 = r5.context
            r0 = 2131103647(0x7f060f9f, float:1.7819766E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r1)
            r2.setColor(r0)
            goto L2e
        L79:
            r0 = r3
            goto L15
        L7b:
            r2 = r3
            goto Lf
        L7d:
            r5.A1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget.C1(com.bytedance.android.livesdk.model.BorderInfo):void");
    }

    public final void E1(boolean z) {
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setClickable(z);
        }
        C1099610eil c1099610eil = this.LLJJL;
        if (c1099610eil != null) {
            c1099610eil.setClickable(z);
        }
        C16F5 c16f52 = this.LLJJIJI;
        if (c16f52 != null) {
            c16f52.setClickable(z);
        }
        LiveIconView liveIconView = this.LLJJIJIIJIL;
        if (liveIconView != null) {
            liveIconView.setClickable(z);
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            view.setClickable(z);
        }
        ImageView imageView = this.LLJJJIL;
        if (imageView != null) {
            imageView.setClickable(z);
        }
        TextView textView = this.LLJJJJJIL;
        if (textView != null) {
            textView.setClickable(z);
        }
        ImageView imageView2 = this.LLJJJJ;
        if (imageView2 != null) {
            imageView2.setClickable(z);
        }
        ViewGroup viewGroup = this.LLJJLIIIJLLLLLLLZ;
        if (viewGroup != null) {
            viewGroup.setClickable(z);
        }
    }

    public final void onEvent(C0KVO c0kvo) {
        boolean z = c0kvo.LIZ;
        if (z != this.LLJLILLLLZIIL) {
            this.LLJLILLLLZIIL = z;
            C1096340edU c1096340edU = this.LLJLIL;
            if (c1096340edU != null) {
                c1096340edU.LJFF();
            }
            if (this.LLJLILLLLZIIL) {
                this.LLJLL = this.LLJJI.getMeasuredWidth();
                this.LLJLLIL = this.LLJJI.getMeasuredHeight();
                this.LLJLLL = this.LLJJI.getVisibility();
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.LLJLLL == 0) {
                    GradientDrawable gradientDrawable = (GradientDrawable) this.LLJJI.getBackground();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS217S0200000_7(this, gradientDrawable, 12));
                    valueAnimatorOfFloat.addListener(new ALAdapterS4S0200000_7(this, gradientDrawable, 11));
                    valueAnimatorOfFloat.setDuration(200L);
                    animatorSet.playTogether(valueAnimatorOfFloat);
                }
                animatorSet.addListener(new ALAdapterS4S0100000_7(this, 25));
                animatorSet.start();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_clear_screen_anchor_show");
                c474500IjALIZ.LJJII(c0kvo.LIZIZ, "clear_type");
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                c474500IjALIZ.LIZ();
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            C1096340edU c1096340edU2 = this.LLJLIL;
            if (c1096340edU2 != null) {
                EnumC1096020ecy enumC1096020ecy = c1096340edU2.LJIILL;
                if (enumC1096020ecy == EnumC1096020ecy.FOLLOW_ANIM) {
                    c1096340edU2.LJIIJ();
                } else if (enumC1096020ecy != EnumC1096020ecy.FOLLOWED) {
                    GradientDrawable gradientDrawable2 = (GradientDrawable) this.LLJJI.getBackground();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS217S0200000_7(this, gradientDrawable2, 11));
                    valueAnimatorOfFloat2.addListener(new ALAdapterS4S0200000_7(this, gradientDrawable2, 10));
                    valueAnimatorOfFloat2.setDuration(200L);
                    animatorSet2.playTogether(valueAnimatorOfFloat2);
                }
                c1096340edU2.LJIILL = EnumC1096020ecy.FOLLOWED;
            }
            animatorSet2.addListener(new ALAdapterS4S0100000_7(this, 26));
            animatorSet2.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        this.LLILLJJLI = room;
        y1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C16F5 c16f5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str;
        ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 89);
        this.LL = (C1324720kZq) findViewById(R.id.azb);
        this.LLJJJJLIIL = (ViewGroup) findViewById(R.id.oaz);
        this.LLIZ = findViewById(R.id.jhk);
        this.LLIZLLLIL = findViewById(R.id.p0o);
        this.LLJJ = findViewById(R.id.hkc);
        this.LLJJI = (ViewGroup) findViewById(R.id.iew);
        this.LLJJIII = (ViewGroup) findViewById(R.id.idv);
        C16F5 c16f52 = (C16F5) findViewById(R.id.idt);
        this.LLJJIJI = c16f52;
        if (c16f52 != null) {
            C786410Ut5.l8(c16f52, new ACListenerS142S0100000_7(this, 85));
        }
        this.LLJL = findViewById(R.id.iey);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.acc);
        this.LLJJIJIIJIL = liveIconView;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 86));
        }
        View viewFindViewById = findViewById(R.id.wi8);
        this.LLJJIJIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(aCListenerS142S0100000_7, viewFindViewById);
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJJJ = (C1126540fQC) findViewById(R.id.ifg);
        ImageView imageView = (ImageView) findViewById(R.id.wi_);
        this.LLJJJIL = imageView;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, aCListenerS142S0100000_7);
        }
        TextView textView = this.LLJJJJJIL;
        if (textView != null) {
            C786410Ut5.T7(textView, aCListenerS142S0100000_7);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.rvp);
        this.LLJJJJ = imageView2;
        if (imageView2 != null) {
            C786410Ut5.Q7(imageView2, new ACListenerS142S0100000_7(this, 87));
        }
        this.LLJJJJJIL = (TextView) findViewById(R.id.wik);
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.dz4);
        }
        C16F5 c16f53 = this.LLJJIJI;
        if (c16f53 != null) {
            c16f53.setTextColor(this.context.getResources().getColor(R.color.ac4));
        }
        LiveIconView liveIconView2 = this.LLJJIJIIJIL;
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(this.context.getResources().getColor(R.color.ac4));
        }
        if (!this.LLILZLL) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.ob5);
            this.LLJJLIIIJLLLLLLLZ = viewGroup2;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            ViewGroup viewGroup3 = this.LLJJLIIIJLLLLLLLZ;
            if (viewGroup3 != null) {
                C786410Ut5.K7(viewGroup3, new ACListenerS142S0100000_7(this, 88));
            }
            IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.tp1()) {
                str = "live_house_user";
            } else {
                str = "basic_user";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_show_list_entrance");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII(str, "show_list_user_type");
            c474500IjALIZ.LJJII("live_detail_page_icon", "request_page");
            c474500IjALIZ.LIZ();
        } else {
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.ob5);
            this.LLJJLIIIJLLLLLLLZ = viewGroup4;
            if (viewGroup4 != null) {
                C786410Ut5.LJLZ(8, viewGroup4);
            }
        }
        String strLIZ = C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        if ((Intrinsics.LJFF(strLIZ, "id-ID") || a0.LJJIIZI(strLIZ, "zh", false)) && (c16f5 = this.LLJJIJI) != null) {
            c16f5.setTextSize(1, 13.0f);
        }
        C16FV c16fv = (C16FV) findViewById(R.id.oau);
        ViewGroup.LayoutParams layoutParams = c16fv.getLayoutParams();
        layoutParams.width = (int) C497740JfY.LIZIZ(12.0f);
        layoutParams.height = (int) C497740JfY.LIZIZ(12.0f);
        C20743516Fd c20743516Fd = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(7.0f));
            marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(7.0f);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fv);
        c16fv.setLayoutParams(layoutParams);
        c16fv.setBackground(null);
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dv3, this.context);
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezr, C1834150xpV.LJII(this.context)));
            c20743516Fd = c20743516FdLIZLLL;
        }
        c16fv.setImageDrawable(c20743516Fd);
        ViewGroup viewGroup5 = this.LLJJLIIIJLLLLLLLZ;
        if (viewGroup5 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(12.0f));
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exm, viewGroup5.getContext()));
            viewGroup5.setBackground(gradientDrawable);
            ViewGroup.LayoutParams layoutParams2 = viewGroup5.getLayoutParams();
            layoutParams2.height = (int) C497740JfY.LIZIZ(24.0f);
            C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(7.0f), viewGroup5);
            C500260Jjc.LJLJJI((int) C497740JfY.LIZIZ(7.0f), viewGroup5);
            C786410Ut5.X5(layoutParams2, viewGroup5);
        }
        C16F5 c16f54 = this.LLJJIJI;
        if (c16f54 != null) {
            c16f54.setTextSize(1, 12.0f);
            c16f54.setPadding(c16f54.getPaddingLeft(), c16f54.getPaddingTop(), (int) C497740JfY.LIZIZ(5.0f), c16f54.getPaddingBottom());
        }
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            View view2 = this.contentView;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(view2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        this.LLJILJIL = false;
        C1096340edU c1096340edU = this.LLJLIL;
        if (c1096340edU != null) {
            c1096340edU.LJIJ(false);
        }
        this.LLILZ.LJ();
        A1();
    }

    public final void x1(Room room) {
        String str;
        String str2;
        FollowInfo followInfo;
        B1();
        C1096340edU c1096340edU = this.LLJLIL;
        if (c1096340edU != null) {
            c1096340edU.LIZ(EnumC1096020ecy.FOLLOW_ANIM);
        }
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null && !iMicRoomService.tp1()) {
            str = "loyal_audience_c_anchor";
        } else {
            str = "carousel_audience_c_anchor";
        }
        long id = room.getOwner().getId();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099430eiT c1099430eiT = new C1099430eiT();
        c1099430eiT.LIZIZ(id);
        room.getRequestId();
        c1099430eiT.LIZLLL();
        c1099430eiT.LIZLLL();
        c1099430eiT.LIZLLL();
        long followStatus = 0;
        c1099430eiT.LJ(0L);
        room.getLabels();
        c1099430eiT.LIZLLL();
        interfaceC500940JkiUser.LIZ(c1099430eiT.LIZJ()).LJJLL(new AfS176S0100000_7(this, 251), new AfS176S0100000_7(this, 252));
        try {
            HashMap map = new HashMap();
            map.put("growth_deepevent", "1");
            if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
                map.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
            }
            w.LIZ.getClass();
            String strLJIILJJIL = w.LJIILJJIL();
            if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF("click_push_live_cd_user", strLJIILJJIL)) {
                map.put("is_subscribe", "1");
            } else {
                map.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            if (!a0.LJJIIZI(str, "carousel_audience_c", false) && !a0.LJJIIZI(str, "loyal_audience_c", false)) {
                str = "live_over";
            }
            if (C497740JfY.LJIL()) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            map.put("room_orientation", str2);
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            }
            if (followStatus != 1 && followStatus != 3) {
                map.put("follow_type", "single");
            } else {
                map.put("follow_type", "mutual");
            }
            map.put("click_user_position", "follow_icon");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("follow");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJIZ(this.dataChannel);
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIILLIIL(new C474130IiZ(str, room.getOwner().getId()));
            c474500IjALIZ.LJIIJJI("live_interact");
            c474500IjALIZ.LJIILL("core");
            if (Intrinsics.LJFF(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "manual_pk")) {
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                    c474500IjALIZ.LJJII("pk_phase", "match_status");
                } else {
                    c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.PUNISH, "match_status");
                }
                c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
            c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "connection_type");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void z1(String str) {
        Context context = this.context;
        if (context != null) {
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
            c760370TsBLIZ.LJIJJLI("bottom");
            c760370TsBLIZ.LJIILL("end");
            c760370TsBLIZ.LJIIIIZZ("bottom");
            c760370TsBLIZ.LJIILIIL("end");
            c760370TsBLIZ.LJIIIZ(434, EnumC760350Ts9.DP);
            EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.PERCENT;
            c760370TsBLIZ.LJIILJJIL(100, enumC760350Ts9);
            c760370TsBLIZ.LJJ(100, enumC760350Ts9);
            c760370TsBLIZ.LJIILLIIL(375, EnumC760350Ts9.DP);
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x027d  */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.bytedance.ies.sdk.widgets.RecycleSource r35, java.lang.Object[] r36) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget.onLoad(com.bytedance.ies.sdk.widgets.RecycleSource, java.lang.Object[]):void");
    }
}
