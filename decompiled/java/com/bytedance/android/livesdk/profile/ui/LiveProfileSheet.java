package com.bytedance.android.livesdk.profile.ui;

import X.AbstractC19994813Le;
import X.AbstractC495740JcK;
import X.AbstractC495790JcP;
import X.AbstractC496140Jcy;
import X.C05JW;
import X.C0GSI;
import X.C0IJT;
import X.C0IXW;
import X.C0JGA;
import X.C0KBR;
import X.C1095570ecF;
import X.C1161920gLG;
import X.C1324570kZb;
import X.C1324720kZq;
import X.C1331070kk5;
import X.C1331090kk7;
import X.C1331100kk8;
import X.C1388190mED;
import X.C1391850mK7;
import X.C15438062q;
import X.C16FS;
import X.C16FZ;
import X.C19322110iZ;
import X.C19719612Di;
import X.C19EG;
import X.C1CC3;
import X.C2268791DrB;
import X.C23250099c;
import X.C418440Gaw;
import X.C439101nJ;
import X.C466640IRq;
import X.C467770IVz;
import X.C467820IWe;
import X.C474500IjA;
import X.C475750IlB;
import X.C495680JcE;
import X.C495700JcG;
import X.C495710JcH;
import X.C495720JcI;
import X.C495730JcJ;
import X.C495750JcL;
import X.C495760JcM;
import X.C495770JcN;
import X.C495820JcS;
import X.C495830JcT;
import X.C495920Jcc;
import X.C495950Jcf;
import X.C496120Jcw;
import X.C496260JdA;
import X.C496270JdB;
import X.C496470JdV;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1083260eIO;
import X.EnumC1105670esX;
import X.EnumC495780JcO;
import X.EnumC495860JcW;
import X.InterfaceC1090170eTX;
import X.InterfaceC1142670fqD;
import X.InterfaceC2183451Acp;
import X.InterfaceC495690JcF;
import X.InterfaceC495840JcU;
import X.InterfaceC495890JcZ;
import X.InterfaceC496380JdM;
import X.InterfaceC496390JdN;
import X.InterfaceC496480JdW;
import X.InterfaceC496990JeL;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS74S0300000_7;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSheetRadiusOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveBulletinSupportSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileFestHonorsSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.profile.cell.BulletinBoardCell;
import com.bytedance.android.livesdk.profile.cell.FrameExplanationCell;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import com.bytedance.android.livesdk.profile.cell.LikeCell;
import com.bytedance.android.livesdk.profile.cell.NormalOperationCell;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.profile.util.LiveProfileHeightSlardarSampleRateSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.EcommerceRoomTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import webcast.api.room.AvatarFrameExplanation;
import webcast.api.room.BulletinData;
import webcast.api.room.FestHonors;
import webcast.api.room.GetRoomProfileCardResponse;
import webcast.data.GroupChatInfo;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveProfileSheet extends LiveSheetFragment implements InterfaceC496990JeL, InterfaceC495890JcZ, InterfaceC495840JcU {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSHELIOSR9ODcjLyY/LWs5IGEfITMpGT08LiwgLBw7LSA4";
    public C495920Jcc LLJLLL;
    public AbstractC496140Jcy<?> LLJZ;
    public C495820JcS LLJZIJLIL;
    public C496470JdV LLL;
    public ViewGroup LLLF;
    public ViewGroup LLLFF;
    public ViewGroup LLLFFI;
    public C1324720kZq LLLFZ;
    public C496260JdA LLLI;
    public FrameLayout LLLII;
    public HorizontalScrollView LLLIIII;
    public LinearLayout LLLIIIIL;
    public LinearLayout LLLIIIL;
    public View LLLIIL;
    public C0GSI LLLIILIL;
    public FrameLayout LLLIL;
    public LinearLayout LLLILZ;
    public FrameLayout LLLILZJ;
    public FrameLayout LLLILZLLLI;
    public ViewGroup LLLIZZ;
    public C16FZ LLLJ;
    public ViewGroup LLLJIL;
    public C16FS LLLJL;
    public LinearLayout LLLL;
    public ViewGroup LLLLII;
    public User LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public C496270JdB<C496120Jcw> LLLLJ;
    public final ValueAnimator LLLLLIL;
    public final ValueAnimator LLLLLILLIL;
    public final ARunnableS107S0100000_7 LLLLLJIL;
    public final List<AbstractC495740JcK> LLLLIIIILLL = new ArrayList();
    public final Map<EnumC495860JcW, List<AbstractC495790JcP<?>>> LLLLIIL = new LinkedHashMap();
    public long LLLLJI = -1;
    public final float LLLLL = 1.0f;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    static {
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(EnumC495860JcW.HEADER, new C0JGA<Pair<? extends PrivilegeCenterConfig, ? extends GetRoomProfileCardResponse.ResponseData>>() { // from class: X.0JdX
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new HeaderCell(c495920Jcc);
            }
        });
        ILiveProfileService iLiveProfileService = (ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class);
        EnumC495860JcW enumC495860JcW = EnumC495860JcW.HONOR;
        iLiveProfileService.nN0(enumC495860JcW, new C0JGA<Unit>() { // from class: X.0JdH
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(final C495920Jcc c495920Jcc) {
                return new AbstractC498420Jge(c495920Jcc) { // from class: X.0JdR
                    public final EnumC495780JcO LLJJJJJIL = EnumC495780JcO.USER_LEVEL;
                    public final int LLJJJJLIIL = 8;

                    @Override // X.AbstractC495790JcP
                    public final EnumC495780JcO LIZLLL() {
                        return this.LLJJJJJIL;
                    }

                    @Override // X.AbstractC498420Jge
                    public final int LJJIIJZLJL() {
                        return this.LLJJJJLIIL;
                    }
                };
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW, new C0JGA<Unit>() { // from class: X.0JdI
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(final C495920Jcc c495920Jcc) {
                return new AbstractC498420Jge(c495920Jcc) { // from class: X.0JdP
                    public final EnumC495780JcO LLJJJJJIL = EnumC495780JcO.FANS_CLUB;
                    public final int LLJJJJLIIL = 10;

                    @Override // X.AbstractC495790JcP
                    public final EnumC495780JcO LIZLLL() {
                        return this.LLJJJJJIL;
                    }

                    @Override // X.AbstractC498420Jge
                    public final int LJJIIJZLJL() {
                        return this.LLJJJJLIIL;
                    }
                };
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW, new C0JGA<Unit>() { // from class: X.0JdJ
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(final C495920Jcc c495920Jcc) {
                return new AbstractC498420Jge(c495920Jcc) { // from class: X.0JdQ
                    public final EnumC495780JcO LLJJJJJIL = EnumC495780JcO.SUBSCRIBE_MEDAL;
                    public final int LLJJJJLIIL = 4;

                    @Override // X.AbstractC495790JcP
                    public final EnumC495780JcO LIZLLL() {
                        return this.LLJJJJJIL;
                    }

                    @Override // X.AbstractC498420Jge
                    public final int LJJIIJZLJL() {
                        return this.LLJJJJLIIL;
                    }
                };
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW, new C0JGA<Unit>() { // from class: X.0JdK
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(final C495920Jcc c495920Jcc) {
                return new AbstractC498420Jge(c495920Jcc) { // from class: X.0JdO
                    public final EnumC495780JcO LLJJJJJIL = EnumC495780JcO.CREATOR_LEAGUE;
                    public final int LLJJJJLIIL = 13;

                    @Override // X.AbstractC495790JcP
                    public final EnumC495780JcO LIZLLL() {
                        return this.LLJJJJJIL;
                    }

                    @Override // X.AbstractC498420Jge
                    public final int LJJIIJZLJL() {
                        return this.LLJJJJLIIL;
                    }
                };
            }
        });
        ILiveProfileService iLiveProfileService2 = (ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class);
        EnumC495860JcW enumC495860JcW2 = EnumC495860JcW.BUSINESS;
        iLiveProfileService2.nN0(enumC495860JcW2, new C0JGA<Unit>() { // from class: X.0JdL
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new C498490Jgl(c495920Jcc);
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW2, new C0JGA<Unit>() { // from class: X.0JdD
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new C496650Jdn(c495920Jcc);
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW2, new C0JGA<GroupChatInfo>() { // from class: X.0JG4
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new AbstractC495800JcQ<GroupChatInfo>(c495920Jcc) { // from class: X.0JG3
                    public ViewGroup LLILZIL;
                    public C16F5 LLILZLL;
                    public C16F5 LLIZ;
                    public FrameLayout LLIZLLLIL;
                    public User LLJ;
                    public final EnumC495780JcO LLJI;
                    public final Pair<Boolean, List<EnumC496240Jd8>> LLJIJIL;
                    public final boolean LLJILJIL;
                    public final C01GW LLJILJILJ;

                    @Override // X.AbstractC495790JcP
                    public final int LJ() {
                        return R.layout.h23;
                    }

                    @Override // X.AbstractC495790JcP
                    public final void LJIIJ() {
                        View view = this.LLILLL;
                        this.LLILZIL = view != null ? (ViewGroup) view.findViewById(R.id.kz7) : null;
                        View view2 = this.LLILLL;
                        this.LLILZLL = view2 != null ? (C16F5) view2.findViewById(R.id.kzn) : null;
                        View view3 = this.LLILLL;
                        this.LLIZ = view3 != null ? (C16F5) view3.findViewById(R.id.kzl) : null;
                        View view4 = this.LLILLL;
                        this.LLIZLLLIL = view4 != null ? (FrameLayout) view4.findViewById(R.id.hec) : null;
                    }

                    @Override // X.InterfaceC495840JcU
                    public final void cC() {
                        EventBus.LIZLLL().LJJI(this);
                        C500260Jjc.LJIILIIL(this.LLILLL);
                    }

                    @Override // X.AbstractC495790JcP
                    public final EnumC495780JcO LIZLLL() {
                        return this.LLJI;
                    }

                    @Override // X.AbstractC495790JcP
                    public final boolean LJFF() {
                        return this.LLJILJIL;
                    }

                    @Override // X.AbstractC495790JcP
                    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
                        return this.LLJIJIL;
                    }

                    {
                        super(c495920Jcc);
                        this.LLJI = EnumC495780JcO.GROUP_CHAT;
                        this.LLJIJIL = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
                        this.LLJILJIL = true;
                        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(c495920Jcc, 691));
                    }

                    @Override // X.AbstractC495790JcP
                    public final Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
                        return responseData.groupChatInfo;
                    }

                    @C14EU(threadMode = ThreadMode.MAIN)
                    public final void onClickFollowInJoinGroupEvent(C0JG5 c0jg5) {
                        User user = this.LLJ;
                        if (user == null) {
                            return;
                        }
                        String strLIZLLL = ((C488970JFn) this.LLJILJILJ.getValue()).LIZLLL(user);
                        w.LIZ.getClass();
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("anchor_id", String.valueOf(w.LJ())), new Pair("room_id", String.valueOf(w.LJIJJ())), new Pair("enter_from_merge", w.LJIIIZ()), new Pair("enter_method", w.LJIIL()), new Pair("action_type", w.LIZLLL()), new Pair("request_page", strLIZLLL), new Pair("click_user_position", "profile_card_group"));
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
                        c474500IjALIZ.LJJIIZI(mapLJIIJ);
                        c474500IjALIZ.LIZ();
                    }

                    @Override // X.AbstractC495790JcP
                    public final boolean LJIIIZ(User user, Object obj) {
                        String nickName;
                        GroupChatInfo groupChatInfo = (GroupChatInfo) obj;
                        if (groupChatInfo == null || groupChatInfo.status != 3) {
                            return false;
                        }
                        C16F5 c16f5 = this.LLIZ;
                        if (c16f5 != null) {
                            c16f5.setText(String.valueOf(groupChatInfo.groupCnt));
                        }
                        C16F5 c16f52 = this.LLILZLL;
                        if (c16f52 != null) {
                            String strLJIJI = C497740JfY.LJIJI(2131850371);
                            User owner = this.LL.LJFF.getOwner();
                            if (owner == null || (nickName = owner.getNickName()) == null) {
                                nickName = "";
                            }
                            c16f52.setText(u.LJJIII(strLJIJI, "%@", nickName, false));
                        }
                        ViewGroup viewGroup = this.LLILZIL;
                        if (viewGroup != null) {
                            C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
                            ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 238);
                            C495980Jci c495980Jci = this.LL;
                            EnumC495860JcW enumC495860JcW3 = EnumC495860JcW.BUSINESS;
                            c495870JcX.getClass();
                            C495870JcX.LIZIZ(viewGroup, aCListenerS142S0100000_7, false, c495980Jci, enumC495860JcW3, "group_chat", null);
                        }
                        C500260Jjc.LLFFF(this.LLILLL);
                        this.LLJ = user;
                        C500260Jjc.LLFFF(this.LLILLL);
                        EventBus.LIZLLL().LJIJJ(this);
                        return true;
                    }

                    @Override // X.AbstractC495790JcP
                    public final Object LJIILJJIL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super GroupChatInfo> interfaceC1364105Vn) {
                        return responseData.groupChatInfo;
                    }

                    @Override // X.AbstractC495790JcP
                    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super GroupChatInfo> interfaceC1364105Vn) {
                        return responseData.groupChatInfo;
                    }
                };
            }
        });
        if (LiveProfileFestHonorsSetting.INSTANCE.enable()) {
            ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW2, new C0JGA<FestHonors>() { // from class: X.0JGC
                @Override // X.C0JGA
                public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                    return new AbstractC495800JcQ<FestHonors>(c495920Jcc) { // from class: X.0JGB
                        public ViewGroup LLILZIL;
                        public C16F5 LLILZLL;
                        public C1324720kZq LLIZ;
                        public C1324720kZq LLIZLLLIL;
                        public final EnumC495780JcO LLJ;
                        public final boolean LLJI;
                        public final Pair<Boolean, List<EnumC496240Jd8>> LLJIJIL;

                        @Override // X.AbstractC495790JcP
                        public final int LJ() {
                            return R.layout.gzj;
                        }

                        @Override // X.AbstractC495790JcP
                        public final void LJIIJ() {
                            View view = this.LLILLL;
                            this.LLILZIL = view != null ? (ViewGroup) view.findViewById(R.id.eqx) : null;
                            View view2 = this.LLILLL;
                            this.LLILZLL = view2 != null ? (C16F5) view2.findViewById(R.id.title) : null;
                            View view3 = this.LLILLL;
                            this.LLIZ = view3 != null ? (C1324720kZq) view3.findViewById(R.id.i01) : null;
                            View view4 = this.LLILLL;
                            this.LLIZLLLIL = view4 != null ? (C1324720kZq) view4.findViewById(R.id.ugs) : null;
                        }

                        @Override // X.InterfaceC495840JcU
                        public final void cC() {
                            C1324720kZq c1324720kZq = this.LLIZ;
                            if (c1324720kZq != null) {
                                c1324720kZq.setController(null);
                            }
                            C1324720kZq c1324720kZq2 = this.LLIZLLLIL;
                            if (c1324720kZq2 != null) {
                                c1324720kZq2.setController(null);
                            }
                            C500260Jjc.LJIILIIL(this.LLILLL);
                        }

                        @Override // X.AbstractC495790JcP
                        public final EnumC495780JcO LIZLLL() {
                            return this.LLJ;
                        }

                        @Override // X.AbstractC495790JcP
                        public final boolean LJFF() {
                            return this.LLJI;
                        }

                        @Override // X.AbstractC495790JcP
                        public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
                            return this.LLJIJIL;
                        }

                        {
                            super(c495920Jcc);
                            this.LLJ = EnumC495780JcO.FEST_HONORS;
                            this.LLJI = c495920Jcc.LJ;
                            this.LLJIJIL = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
                        }

                        @Override // X.AbstractC495790JcP
                        public final Map LJIIJJI(Object obj) {
                            String str;
                            FestHonors festHonors = (FestHonors) obj;
                            if (festHonors != null) {
                                int size = festHonors.honors.size();
                                if (size != 0) {
                                    if (size != 1) {
                                        str = "2";
                                    } else {
                                        str = "1";
                                    }
                                } else {
                                    str = CardStruct.IStatusCode.DEFAULT;
                                }
                                return C2097908Jt.LIZJ(new Pair("fest_honors_icon_count", str));
                            }
                            return null;
                        }

                        @Override // X.AbstractC495790JcP
                        public final Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
                            return responseData.festHonors;
                        }

                        @Override // X.AbstractC495790JcP
                        public final boolean LJIIIZ(User user, Object obj) {
                            FestHonors festHonors = (FestHonors) obj;
                            if (festHonors == null || LJIIIIZZ(user)) {
                                return false;
                            }
                            List<FestHonors.Honor> list = festHonors.honors;
                            try {
                                ViewGroup viewGroup = this.LLILZIL;
                                if (viewGroup != null) {
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(8.0f));
                                    gradientDrawable.setColor(Color.parseColor(festHonors.backgroundColor));
                                    gradientDrawable.setStroke((int) C497740JfY.LIZIZ(0.5f), Color.parseColor(festHonors.borderColor));
                                    viewGroup.setBackground(gradientDrawable);
                                }
                                C16F5 c16f5 = this.LLILZLL;
                                if (c16f5 != null) {
                                    c16f5.setTextColor(Color.parseColor(festHonors.textColor));
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (list.size() > 1) {
                                C1324610kZf url = C1819620xS4.LIZ().setUrl(((FestHonors.Honor) ListProtector.get(list, 0)).iconUrl);
                                url.LJIJJ = ImageView.ScaleType.FIT_CENTER;
                                url.LJJI(this.LLIZ);
                                C1324610kZf url2 = C1819620xS4.LIZ().setUrl(((FestHonors.Honor) ListProtector.get(list, 1)).iconUrl);
                                url2.LJIJJ = ImageView.ScaleType.FIT_CENTER;
                                url2.LJJI(this.LLIZLLLIL);
                                C500260Jjc.LLFFF(this.LLIZ);
                                C500260Jjc.LLFFF(this.LLIZLLLIL);
                            } else if (list.size() > 0) {
                                C1324610kZf url3 = C1819620xS4.LIZ().setUrl(((FestHonors.Honor) ListProtector.get(list, 0)).iconUrl);
                                url3.LJIJJ = ImageView.ScaleType.FIT_CENTER;
                                url3.LJJI(this.LLIZLLLIL);
                                C500260Jjc.LLFFF(this.LLIZLLLIL);
                            }
                            View view = this.LLILLL;
                            if (view != null) {
                                C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
                                ACListenerS74S0300000_7 aCListenerS74S0300000_7 = new ACListenerS74S0300000_7(festHonors, user, this, 12);
                                C495980Jci c495980Jci = this.LL;
                                EnumC495860JcW enumC495860JcW3 = EnumC495860JcW.BUSINESS;
                                c495870JcX.getClass();
                                C495870JcX.LIZIZ(view, aCListenerS74S0300000_7, true, c495980Jci, enumC495860JcW3, "fest_honors", null);
                            }
                            C500260Jjc.LLFFF(this.LLILLL);
                            return true;
                        }

                        @Override // X.AbstractC495790JcP
                        public final Object LJIILJJIL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super FestHonors> interfaceC1364105Vn) {
                            return responseData.festHonors;
                        }

                        @Override // X.AbstractC495790JcP
                        public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super FestHonors> interfaceC1364105Vn) {
                            return responseData.festHonors;
                        }
                    };
                }
            });
        }
        if (LiveBulletinSupportSetting.INSTANCE.enable()) {
            ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW2, new C0JGA<BulletinData>() { // from class: X.0JG2
                @Override // X.C0JGA
                public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                    return new BulletinBoardCell(c495920Jcc);
                }
            });
        }
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(EnumC495860JcW.OPERATION, new C0JGA<Unit>() { // from class: X.0Jc9
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new NormalOperationCell(c495920Jcc);
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(EnumC495860JcW.OVERLAY, new C0JGA<Unit>() { // from class: X.0JGE
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new C0JGD(c495920Jcc);
            }
        });
        ILiveProfileService iLiveProfileService3 = (ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class);
        EnumC495860JcW enumC495860JcW3 = EnumC495860JcW.EXPAND;
        iLiveProfileService3.nN0(enumC495860JcW3, new C0JGA<Unit>() { // from class: X.0JGX
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new LikeCell(c495920Jcc);
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(enumC495860JcW3, new C0JGA<GetUserInteractionSummaryResponse.ResponseData>() { // from class: X.0JdF
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new C496610Jdj(c495920Jcc);
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(EnumC495860JcW.FRAME_EXPLANATION, new C0JGA<AvatarFrameExplanation>() { // from class: X.0JdG
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new FrameExplanationCell(c495920Jcc);
            }
        });
        ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).nN0(EnumC495860JcW.ENIGMA, new C0JGA<GetRoomProfileCardResponse.ResponseData>() { // from class: X.0JdE
            @Override // X.C0JGA
            public final AbstractC495790JcP LIZ(C495920Jcc c495920Jcc) {
                return new C496770Jdz(c495920Jcc);
            }
        });
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        Iterator<AbstractC495740JcK> it2 = this.LLLLIIIILLL.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroup = it2.next().LIZJ;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
        }
        HorizontalScrollView horizontalScrollView = this.LLLIIII;
        if (horizontalScrollView != null) {
            horizontalScrollView.scrollTo(0, 0);
        }
        C496260JdA c496260JdA = this.LLLI;
        if (c496260JdA != null) {
            c496260JdA.scrollTo(0, 0);
        }
        C500260Jjc.LJIILIIL(this.LLLFF);
        C500260Jjc.LJIILIIL(this.LLLIZZ);
        C500260Jjc.LJIILIIL(this.LLLJIL);
        C500260Jjc.LJIILIIL(this.LLLL);
        wS();
    }

    @Override // X.InterfaceC496990JeL, X.InterfaceC495890JcZ
    public final void dismiss() {
        C19322110iZ.LIZ(this.LLLLJI);
        this.LLLLIL = true;
    }

    public final int getLayoutId() {
        C495920Jcc c495920Jcc = this.LLJLLL;
        return (c495920Jcc == null || !c495920Jcc.LJ) ? R.layout.hm6 : R.layout.hm3;
    }

    @Override // X.InterfaceC495890JcZ
    public final boolean isShowing() {
        return this.LLJJIJIL.LJ("live_profile_sheet");
    }

    @Override // X.InterfaceC496990JeL
    public final void o1() {
        Object obj;
        InterfaceC496380JdM interfaceC496380JdM;
        Object next;
        List list = (List) ((LinkedHashMap) this.LLLLIIL).get(EnumC495860JcW.HEADER);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((AbstractC495790JcP) next).LIZLLL() == EnumC495780JcO.HEADER) {
                        break;
                    }
                }
            }
            obj = (AbstractC495790JcP) next;
        } else {
            obj = null;
        }
        if (!(obj instanceof InterfaceC496380JdM) || (interfaceC496380JdM = (InterfaceC496380JdM) obj) == null) {
            return;
        }
        interfaceC496380JdM.o1();
    }

    @Override // X.InterfaceC496990JeL
    public final boolean op() {
        Object obj;
        AbstractC495790JcP abstractC495790JcP;
        Object next;
        Object next2;
        List list = (List) ((LinkedHashMap) this.LLLLIIL).get(EnumC495860JcW.FRAME_EXPLANATION);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((AbstractC495790JcP) next2).LIZLLL() == EnumC495780JcO.FRAME_EXPLANATION) {
                    break;
                }
            }
            obj = (AbstractC495790JcP) next2;
        } else {
            obj = null;
        }
        InterfaceC496480JdW interfaceC496480JdW = obj instanceof InterfaceC496480JdW ? (InterfaceC496480JdW) obj : null;
        List list2 = (List) ((LinkedHashMap) this.LLLLIIL).get(EnumC495860JcW.HEADER);
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((AbstractC495790JcP) next).LIZLLL() == EnumC495780JcO.HEADER) {
                    break;
                }
            }
            abstractC495790JcP = (AbstractC495790JcP) next;
        } else {
            abstractC495790JcP = null;
        }
        InterfaceC496380JdM interfaceC496380JdM = abstractC495790JcP instanceof InterfaceC496380JdM ? (InterfaceC496380JdM) abstractC495790JcP : null;
        if (interfaceC496480JdW == null || interfaceC496380JdM == null) {
            return false;
        }
        Pair<View, View> pairP1 = interfaceC496380JdM.p1();
        interfaceC496480JdW.LIZIZ(pairP1.getFirst(), pairP1.getSecond());
        wS();
        this.LLLLLILLIL.start();
        return true;
    }

    public final void wS() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.LLLLLILLIL.isRunning() && (valueAnimator2 = this.LLLLLILLIL) != null) {
            valueAnimator2.cancel();
        }
        if (this.LLLLLIL.isRunning() && (valueAnimator = this.LLLLLIL) != null) {
            valueAnimator.cancel();
        }
        ViewGroup viewGroup = this.LLLFFI;
        if (viewGroup != null) {
            C786410Ut5.R4(this.LLLLL, viewGroup);
        }
    }

    public final List<AbstractC495790JcP<?>> yS() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) this.LLLLIIL).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.addAll((Collection) ((Map.Entry) it2.next()).getValue());
        }
        return arrayList;
    }

    public final List<AbstractC495790JcP<?>> zS() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) this.LLLLIIL).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.addAll((Collection) ((Map.Entry) it2.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AbstractC495790JcP) obj).LJI().getFirst().booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public LiveProfileSheet() {
        C2268791DrB c2268791DrB = new C2268791DrB(0.25f, 0.1f, 0.25f, 1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(c2268791DrB);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 7));
        this.LLLLLIL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(c2268791DrB);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS257S0100000_7(this, 8));
        this.LLLLLILLIL = valueAnimatorOfFloat2;
        this.LLLLLJIL = new ARunnableS107S0100000_7(this, 97);
    }

    @Override // X.InterfaceC496990JeL
    public final void C5() {
        wS();
        this.LLLLLIL.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context;
        C19EG c19egLIZIZ;
        super.onDestroy();
        C495920Jcc c495920Jcc = this.LLJLLL;
        if (c495920Jcc == null || (context = c495920Jcc.LIZ) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        ((LiveProfilePreloadViewModel) ViewModelProviders.of(c19egLIZIZ).get(LiveProfilePreloadViewModel.class)).LLILZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC495840JcU interfaceC495840JcU;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onDestroyView();
        C500260Jjc.LJIILIIL(this.LLLFF);
        C500260Jjc.LJIILIIL(this.LLLIZZ);
        C500260Jjc.LJIILIIL(this.LLLJ);
        C500260Jjc.LJIILIIL(this.LLLJIL);
        C1324720kZq c1324720kZq = this.LLLFZ;
        if (c1324720kZq != null) {
            c1324720kZq.setImageURI((String) null);
        }
        ViewGroup viewGroup3 = this.LLLF;
        if (viewGroup3 != null && this.LLJZIJLIL != null) {
            int layoutId = getLayoutId();
            cC();
            ViewParent parent = viewGroup3.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewGroup3, viewGroup2);
            }
            C495830JcT.LIZ(layoutId, viewGroup3);
        }
        for (AbstractC495790JcP abstractC495790JcP : (ArrayList) yS()) {
            if (this.LLJZIJLIL != null && (abstractC495790JcP instanceof InterfaceC495840JcU) && (interfaceC495840JcU = (InterfaceC495840JcU) abstractC495790JcP) != null) {
                interfaceC495840JcU.cC();
                View view = abstractC495790JcP.LLILLL;
                if (view != null) {
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                        C786410Ut5.LJJJLZIJ(view, viewGroup);
                    }
                    C495830JcT.LIZ(abstractC495790JcP.LJ(), view);
                }
            }
        }
    }

    public final void BS(FragmentManager fragmentManager) {
        AbstractC496140Jcy<?> abstractC496140Jcy;
        String str;
        Object obj;
        String str2;
        String str3;
        SubscribeInfo subscribeInfo;
        String str4;
        int subscriberCount;
        MutableLiveData<C496270JdB<C496120Jcw>> mutableLiveData;
        AbstractC496140Jcy<?> abstractC496140Jcy2 = this.LLJZ;
        if (abstractC496140Jcy2 != null) {
            LifecycleOwnerKt.getLifecycleScope(this);
            abstractC496140Jcy2.LIZJ();
        }
        AbstractC496140Jcy<?> abstractC496140Jcy3 = this.LLJZ;
        EcommerceRoomTag ecommerceRoomTag = null;
        if ((abstractC496140Jcy3 == null || (mutableLiveData = abstractC496140Jcy3.LIZLLL) == null || mutableLiveData.getValue() == null) && (abstractC496140Jcy = this.LLJZ) != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C23250099c.LIZLLL(lifecycleScope, abstractC496140Jcy.LJ, null, new C05JW(abstractC496140Jcy, abstractC496140Jcy.LIZ(lifecycleScope, abstractC496140Jcy.LIZ.LIZJ.LJIIIIZZ), null), 2);
        }
        boolean zLJI = MethodIDManager.LJI(72100);
        if (this.LLLLIL) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C1391850mK7.LIZIZ(this, "live_anchor_info_panel_nscreen");
            C19322110iZ.LJFF(fragmentManager, this, "live_profile_sheet", new InterfaceC1090170eTX() { // from class: X.0JdS
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                    this.LIZ.LLLLJI = j;
                }
            }, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        C496470JdV c496470JdV = this.LLL;
        if (c496470JdV != null) {
            C495920Jcc c495920Jcc = c496470JdV.LIZ;
            DataChannel dataChannel = c495920Jcc.LJIIJJI;
            Room room = c495920Jcc.LJFF;
            boolean z = c495920Jcc.LIZJ.LJI;
            UserProfileEvent userProfileEvent = c495920Jcc.LJIIIIZZ;
            w.LIZ.getClass();
            String strLJIILJJIL = w.LJIILJJIL();
            String strLIZ = c496470JdV.LIZ();
            if (z) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).upLoadLiveEcoEvent(room.getId(), 1);
            }
            Map mapLIZ = C475750IlB.LIZ();
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_click_user", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIJJLI(dataChannel);
            c474500IjALIZIZ.LJJIZ(dataChannel);
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJFF(C0IXW.LIZIZ(null, dataChannel, "user_live_duration"));
            if (!z) {
                str = "live_detail";
            } else {
                str = "live_take_detail";
            }
            c474500IjALIZIZ.LJIILJJIL(str);
            c474500IjALIZIZ.LJIIJJI("live_interact");
            c474500IjALIZIZ.LJJII(strLIZ, "click_type");
            c474500IjALIZIZ.LJJII(userProfileEvent.clickModule, "click_module");
            c474500IjALIZIZ.LJJII(userProfileEvent.clickMethod, "click_method");
            c474500IjALIZIZ.LJJII(c496470JdV.LIZ.LIZJ.LIZ(), "card_click_view");
            c474500IjALIZIZ.LJJII(Long.valueOf(userProfileEvent.msgId), "message_id");
            c474500IjALIZIZ.LJJII(Long.valueOf(userProfileEvent.releaseId), "message_release_id");
            c474500IjALIZIZ.LJJII(strLIZ, "request_page");
            c474500IjALIZIZ.LJJII(String.valueOf(c496470JdV.LIZ.LJII), "to_user_id");
            c474500IjALIZIZ.LJJII(C466640IRq.LIZJ().LIZLLL(), "enter_live_method");
            String str5 = "1";
            if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF(strLJIILJJIL, "click_push_live_cd_user")) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZIZ.LJJII(obj, "is_subscribe");
            c474500IjALIZIZ.LJJII(Boolean.valueOf(((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).hU(room)), "is_program_live");
            c474500IjALIZIZ.LJJII(Boolean.valueOf(((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).n42(room)), "is_line_up_live");
            if (c496470JdV.LIZ.LJ) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            c474500IjALIZIZ.LJJII(str2, "room_orientation");
            if (TextUtils.isEmpty(userProfileEvent.mClickUserPosition)) {
                str3 = "profile_card";
            } else {
                str3 = userProfileEvent.mClickUserPosition;
            }
            c474500IjALIZIZ.LJJII(str3, "click_user_position");
            c474500IjALIZIZ.LJJII(Integer.valueOf(c496470JdV.LIZ.LIZJ.LIZLLL ? 1 : 0), "is_self");
            c474500IjALIZIZ.LJJIIZI(C467820IWe.LIZIZ());
            c474500IjALIZIZ.LJJII(0, "user_level");
            c474500IjALIZIZ.LJJIIZI(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(Long.valueOf(c496470JdV.LIZ.LJII)));
            c474500IjALIZIZ.LJJII(room.getGuestRequestId(), "guest_request_id");
            c474500IjALIZIZ.LJJII(Integer.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()), "guest_cnt");
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount() <= 0) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZIZ.LJJII(str5, "is_guest_connection");
            c474500IjALIZIZ.LJJIIZI(mapLIZ);
            if (C500260Jjc.LJJIIZ(userProfileEvent.crmLabel)) {
                c474500IjALIZIZ.LJJII(userProfileEvent.crmLabel, "crm_label");
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
            c474500IjALIZIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
            c474500IjALIZIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            c474500IjALIZIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
            User owner = room.getOwner();
            if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                if (subscribeInfo.isAnchorQualified()) {
                    str4 = "open";
                } else {
                    str4 = "close";
                }
                c474500IjALIZIZ.LJJII(str4, "subscription_status");
                if (subscribeInfo.isAnchorQualified()) {
                    subscriberCount = subscribeInfo.getSubscriberCount();
                } else {
                    subscriberCount = 0;
                }
                c474500IjALIZIZ.LJJII(Integer.valueOf(subscriberCount), "subscriber");
                c474500IjALIZIZ.LJJIIZI(userProfileEvent.extraParams);
            }
            List<EcommerceRoomTag> list = room.ecommerceRoomTags;
            if (list != null) {
                Iterator<EcommerceRoomTag> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    EcommerceRoomTag next = it2.next();
                    EcommerceRoomTag ecommerceRoomTag2 = next;
                    if (ecommerceRoomTag2.tagName.length() > 0 && ecommerceRoomTag2.tagShowTime > 0) {
                        ecommerceRoomTag = next;
                        break;
                    }
                }
                EcommerceRoomTag ecommerceRoomTag3 = ecommerceRoomTag;
                if (ecommerceRoomTag3 != null) {
                    c474500IjALIZIZ.LJJIIZI(C500260Jjc.LL(ecommerceRoomTag3.daInfo));
                }
            }
            Map<String, String> map = userProfileEvent.trackExtra;
            if (map != null) {
                c474500IjALIZIZ.LJJIIZI(map);
            }
            if (dataChannel.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW) {
                c474500IjALIZIZ.LJIILJJIL("live_extended_comment_filed");
            }
            String str6 = userProfileEvent.mEventPage;
            if (str6 != null) {
                c474500IjALIZIZ.LJIILJJIL(str6);
            }
            Map<String, String> map2 = userProfileEvent.mRankInfo;
            if (map2 != null) {
                c474500IjALIZIZ.LJJIIZI(map2);
            }
            String str7 = userProfileEvent.messageType;
            if (str7 != null) {
                c474500IjALIZIZ.LJJII(str7, "message_type");
            }
            String str8 = userProfileEvent.anchorRecommendationType;
            if (str8 != null) {
                c474500IjALIZIZ.LJJII(str8, "anchor_recommendation_type");
            }
            c474500IjALIZIZ.LIZ();
        }
    }

    public final void ES(final BorderInfo borderInfo) {
        float f;
        C1331070kk5 hierarchy;
        C1324720kZq c1324720kZq;
        if (borderInfo != null && borderInfo.profileDecorationRibbon != null) {
            C500260Jjc.LLFFF(this.LLLFZ);
            C1324570kZb.LIZJ(this.LLLFZ, borderInfo.profileDecorationRibbon, null, null, new InterfaceC1142670fqD() { // from class: X.0JeI
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str, Exception exc) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                    ViewGroup.LayoutParams layoutParams;
                    int iLIZIZ;
                    int iLJFF;
                    C1331070kk5 hierarchy2;
                    Long lValueOf;
                    Object obj;
                    Room room;
                    User user;
                    ViewGroup.LayoutParams layoutParams2;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    View viewFindViewById;
                    ViewGroup.MarginLayoutParams marginLayoutParams2;
                    C1324720kZq c1324720kZq2 = this.LIZ.LLLFZ;
                    Long lValueOf2 = null;
                    if (c1324720kZq2 != null) {
                        layoutParams = c1324720kZq2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams3 == null) {
                        return;
                    }
                    boolean z = true;
                    if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                        iLJFF = (int) C497740JfY.LIZIZ(375.0f);
                    } else {
                        C495920Jcc c495920Jcc = this.LIZ.LLJLLL;
                        if (c495920Jcc != null && c495920Jcc.LJ) {
                            iLJFF = C14KS.LJFF();
                        } else {
                            int iLIZLLL = C14KS.LIZLLL();
                            Context context = this.LIZ.getContext();
                            if (context != null) {
                                iLIZIZ = C20244614Jg.LIZIZ(context);
                            } else {
                                iLIZIZ = 0;
                            }
                            iLJFF = iLIZLLL + iLIZIZ;
                        }
                    }
                    marginLayoutParams3.width = iLJFF;
                    marginLayoutParams3.height = iLJFF / 3;
                    C495920Jcc c495920Jcc2 = this.LIZ.LLJLLL;
                    if ((c495920Jcc2 != null && c495920Jcc2.LJ) || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                        int i3 = (int) (marginLayoutParams3.height * 0.2f);
                        ViewGroup viewGroup = this.LIZ.LLLF;
                        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.fho)) != null) {
                            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                if (marginLayoutParams2 != null) {
                                    marginLayoutParams2.bottomMargin = i3;
                                }
                            } else {
                                marginLayoutParams2 = null;
                            }
                            C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
                        }
                        if (borderInfo.isTallerAvatarBackground) {
                            LiveProfileSheet liveProfileSheet = this.LIZ;
                            int i4 = -i3;
                            C20484615Do c20484615Do = liveProfileSheet.LLJJIJIL;
                            if (c20484615Do != null && c20484615Do.LJII() && i4 != liveProfileSheet.LLJIJIL) {
                                liveProfileSheet.LLJIJIL = i4;
                                C1095570ecF c1095570ecF = liveProfileSheet.LLJI;
                                if (c1095570ecF != null) {
                                    c1095570ecF.setExtraOffset(i4);
                                }
                            }
                            LinearLayout linearLayout = this.LIZ.LLLL;
                            if (linearLayout != null) {
                                layoutParams2 = linearLayout.getLayoutParams();
                            } else {
                                layoutParams2 = null;
                            }
                            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                LiveProfileSheet liveProfileSheet2 = this.LIZ;
                                marginLayoutParams.bottomMargin = ((int) C497740JfY.LIZIZ(8.0f)) + i3;
                                LinearLayout linearLayout2 = liveProfileSheet2.LLLL;
                                if (linearLayout2 != null) {
                                    C786410Ut5.d6(linearLayout2, marginLayoutParams);
                                }
                            }
                        }
                    } else {
                        marginLayoutParams3.height = (int) (marginLayoutParams3.height * 0.8f);
                        PointF pointF = new PointF(0.0f, 0.6f);
                        C1324720kZq c1324720kZq3 = this.LIZ.LLLFZ;
                        if (c1324720kZq3 != null && (hierarchy2 = c1324720kZq3.getHierarchy()) != null) {
                            hierarchy2.LJIILIIL(2).LJIJ(pointF);
                        }
                    }
                    LiveProfileSheet liveProfileSheet3 = this.LIZ;
                    User user2 = liveProfileSheet3.LLLLIILL;
                    C495920Jcc c495920Jcc3 = liveProfileSheet3.LLJLLL;
                    if (c495920Jcc3 != null && (user = c495920Jcc3.LJI) != null) {
                        lValueOf = Long.valueOf(user.getId());
                    } else {
                        lValueOf = null;
                    }
                    C495920Jcc c495920Jcc4 = this.LIZ.LLJLLL;
                    if (c495920Jcc4 != null && (room = c495920Jcc4.LJFF) != null) {
                        lValueOf2 = Long.valueOf(room.getOwnerUserId());
                    }
                    boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
                    BorderInfo borderInfoLIZ = C496970JeJ.LIZ(user2);
                    if (borderInfoLIZ != null) {
                        if (user2.getLiveRoomId() == 0) {
                            z = false;
                        }
                        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_privilege_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                        String str2 = "anchor";
                        if (zLJFF) {
                            obj = "anchor";
                        } else {
                            obj = "user";
                        }
                        c474500IjALIZIZ.LJJII(obj, "user_type");
                        if (!z) {
                            str2 = "user";
                        }
                        c474500IjALIZIZ.LJJII(str2, "to_user_type");
                        c474500IjALIZIZ.LJJII("profile_card", "privilege_scenario");
                        c474500IjALIZIZ.LJJII("profile_card", "privilege_type");
                        c474500IjALIZIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                        c474500IjALIZIZ.LJJII(Long.valueOf(user2.getId()), "to_user_id");
                        c474500IjALIZIZ.LJJII(Integer.valueOf(C0IUA.LIZJ), "online_user");
                        PrivilegeLogExtra privilegeLogExtra = borderInfoLIZ.ribbonLogExtra;
                        if (privilegeLogExtra != null) {
                            c474500IjALIZIZ.LJJII(privilegeLogExtra.privilege_id, "privilege_id");
                            c474500IjALIZIZ.LJJII(privilegeLogExtra.privilege_order_id, "privilege_order_id");
                            c474500IjALIZIZ.LJJII(privilegeLogExtra.privilege_version, "privilege_version_id");
                            c474500IjALIZIZ.LJJII(privilegeLogExtra.data_version, "data_version_id");
                        }
                        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                            c474500IjALIZIZ.LJIL();
                            c474500IjALIZIZ.LIZ();
                            return;
                        }
                        c474500IjALIZIZ.LJJIJLIJ();
                        w wVar = w.LIZ;
                        wVar.getClass();
                        c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
                        c474500IjALIZIZ.LJJII(wVar.LIZJ(), "live_type");
                        c474500IjALIZIZ.LJIIIIZZ();
                        c474500IjALIZIZ.LJJIJL();
                    }
                }
            }, false);
            C495920Jcc c495920Jcc = this.LLJLLL;
            if (c495920Jcc != null && !c495920Jcc.LJ) {
                if (LiveSheetRadiusOptSetting.INSTANCE.getValue()) {
                    f = 26.0f;
                } else {
                    f = 8.0f;
                }
                float[] fArr = {(int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f), 0.0f, 0.0f};
                C1324720kZq c1324720kZq2 = this.LLLFZ;
                if (c1324720kZq2 != null && !c1324720kZq2.hasHierarchy() && (c1324720kZq = this.LLLFZ) != null) {
                    c1324720kZq.setHierarchy(new C1331090kk7(getResources()).LIZ());
                }
                C1324720kZq c1324720kZq3 = this.LLLFZ;
                if (c1324720kZq3 != null && (hierarchy = c1324720kZq3.getHierarchy()) != null) {
                    hierarchy.LJJIII(C1331100kk8.LIZIZ(fArr[0], fArr[1], fArr[2], fArr[3]));
                    return;
                }
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLLFZ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        Dialog dialog;
        String str;
        SheetOptions sheetOptions = new SheetOptions();
        UserProfileEvent userProfileEvent = null;
        sheetOptions.LIZ(3, null);
        sheetOptions.draggable = LiveProfileStyleOptimizeSetting.INSTANCE.isSlideEnable();
        C495920Jcc c495920Jcc = this.LLJLLL;
        if (c495920Jcc != null) {
            userProfileEvent = c495920Jcc.LJIIIIZZ;
        }
        int i = 1;
        if (userProfileEvent == null || (!userProfileEvent.getEnterFromRankList().booleanValue() && !Intrinsics.LJFF(userProfileEvent.mClickUserPosition, "redpacket") && !Intrinsics.LJFF(userProfileEvent.mClickUserPosition, "portal") && !Intrinsics.LJFF(userProfileEvent.mClickUserPosition, "draw_guess_round_summary") && !Intrinsics.LJFF(userProfileEvent.mClickUserPosition, "connection_list") && (((str = userProfileEvent.mSource) == null || !Intrinsics.LJFF(str, "guest_connection")) && !Intrinsics.LJFF(userProfileEvent.mSource, "group_live_gift_panel") && !userProfileEvent.isShowMask.booleanValue()))) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Fragment parentFragment = this;
            loop0: while (parentFragmentManager != null) {
                List<Fragment> listLJJLIIIJL = parentFragmentManager.LJJLIIIJL();
                ArrayList<DialogFragment> arrayList = new ArrayList();
                for (Fragment fragment : listLJJLIIIJL) {
                    if (fragment instanceof DialogFragment) {
                        arrayList.add(fragment);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (DialogFragment dialogFragment : arrayList) {
                        if ((dialogFragment instanceof DialogFragment) && dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                            break loop0;
                        }
                    }
                }
                if (parentFragment == null || (parentFragment = parentFragment.getParentFragment()) == null) {
                    break;
                }
                parentFragmentManager = parentFragment.getParentFragmentManager();
            }
            i = 2;
        }
        sheetOptions.dimBehindType = i;
        return sheetOptions;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS(X.C496120Jcw r31) {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.profile.ui.LiveProfileSheet.uS(X.0Jcw):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) throws JSONException {
        DataChannel dataChannel;
        User user;
        int height;
        boolean z;
        int i2;
        String str;
        C1CC3 c1cc3MN2;
        MutableLiveData<C496270JdB<C496120Jcw>> mutableLiveData;
        C496270JdB<C496120Jcw> value;
        C496120Jcw c496120Jcw;
        DataChannel dataChannel2;
        C495920Jcc c495920Jcc = this.LLJLLL;
        if (c495920Jcc != null && (dataChannel2 = c495920Jcc.LJIIJJI) != null) {
            dataChannel2.zW(UserProfileShowingChannel.class, Boolean.FALSE);
        }
        C496470JdV c496470JdV = this.LLL;
        if (c496470JdV != null) {
            AbstractC496140Jcy<?> abstractC496140Jcy = this.LLJZ;
            if (abstractC496140Jcy != null && (mutableLiveData = abstractC496140Jcy.LIZLLL) != null && (value = mutableLiveData.getValue()) != null && (c496120Jcw = value.LIZIZ) != null) {
                user = c496120Jcw.LIZ;
            } else {
                user = null;
            }
            ViewGroup viewGroup = this.LLLF;
            if (viewGroup != null) {
                height = viewGroup.getHeight();
            } else {
                height = 0;
            }
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (user != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_duration");
                c474500IjALIZ.LJIJJLI(c496470JdV.LIZ.LJIIJJI);
                c474500IjALIZ.LJJII(String.valueOf(c496470JdV.LIZ.LJII), "to_user_id");
                c474500IjALIZ.LJJII(c496470JdV.LIZ(), "request_page");
                c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - c496470JdV.LIZJ), "duration");
                c474500IjALIZ.LJJII(c496470JdV.LIZ.LJIIIIZZ.clickModule, "click_module");
                UserAttr userAttr = user.getUserAttr();
                if (userAttr != null && userAttr.isAdmin) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_moderator");
                if (z) {
                    str = "pull";
                } else {
                    str = "click";
                }
                c474500IjALIZ.LJJII(str, "close_type");
                c474500IjALIZ.LIZ();
                if (AbstractC19994813Le.Default.nextDouble() < LiveProfileHeightSlardarSampleRateSetting.INSTANCE.getValue() && (c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("request_page", c496470JdV.LIZ());
                    jSONObject.put("click_module", c496470JdV.LIZ.LJIIIIZZ.clickModule);
                    jSONObject.put("is_landscape", !c496470JdV.LIZ.LJ ? 1 : 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("loading_height", Float.valueOf(C439101nJ.LIZIZ(c496470JdV.LIZLLL)));
                    jSONObject2.put("final_height", Float.valueOf(C439101nJ.LIZIZ(height)));
                    jSONObject2.put("height_diff", Float.valueOf(C439101nJ.LIZIZ(height - c496470JdV.LIZLLL)));
                    c1cc3MN2.LJIL("interact_metric", "ttlive_profile_dialog_height", jSONObject, jSONObject2, new JSONObject());
                }
            }
        }
        ViewGroup viewGroup2 = this.LLLF;
        if (viewGroup2 != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup2, this.LLLLLJIL);
        }
        C495920Jcc c495920Jcc2 = this.LLJLLL;
        if (c495920Jcc2 != null && (dataChannel = c495920Jcc2.LJIIJJI) != null) {
            dataChannel.LC0(PanelStateEvent.class, new C0KBR(false, EnumC1105670esX.PROFILE, 0, 0));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View hS(LayoutInflater layoutInflater, C1095570ecF c1095570ecF) {
        C495920Jcc c495920Jcc = this.LLJLLL;
        if (c495920Jcc != null) {
            if (c495920Jcc.LJ) {
                this.LLLLII = new FrameLayout(c495920Jcc.LIZ);
            }
            return this.LLLLII;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0JcR] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        C0GSI c0gsi;
        MutableLiveData<C496270JdB<C496120Jcw>> mutableLiveData;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C496260JdA c496260JdA;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onViewCreated(view, bundle);
        if (this.LLL != null) {
            SystemClock.elapsedRealtime();
        }
        this.LLLF = (ViewGroup) view.findViewById(R.id.n4e);
        C495920Jcc c495920Jcc = this.LLJLLL;
        if (c495920Jcc != null && c495920Jcc.LJ) {
            viewFindViewById = view.findViewById(R.id.bp1);
        } else {
            viewFindViewById = view.findViewById(R.id.n4e);
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            if (LiveSheetRadiusOptSetting.INSTANCE.getValue()) {
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(R.drawable.dq1);
                }
            } else if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.dq0);
            }
        } else if (LiveSheetRadiusOptSetting.INSTANCE.getValue()) {
            C495920Jcc c495920Jcc2 = this.LLJLLL;
            if (c495920Jcc2 != null && c495920Jcc2.LJ) {
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(R.drawable.dq2);
                }
            } else if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.dpy);
            }
        }
        this.LLLFF = (ViewGroup) view.findViewById(R.id.pbi);
        this.LLLFFI = (ViewGroup) view.findViewById(R.id.evi);
        this.LLLFZ = (C1324720kZq) view.findViewById(R.id.fhi);
        this.LLLI = (C496260JdA) view.findViewById(R.id.u3e);
        this.LLLII = (FrameLayout) view.findViewById(R.id.jjy);
        this.LLLIIII = (HorizontalScrollView) view.findViewById(R.id.jqy);
        this.LLLIIIIL = (LinearLayout) view.findViewById(R.id.jqx);
        this.LLLIIIL = (LinearLayout) view.findViewById(R.id.d6d);
        this.LLLIIL = view.findViewById(R.id.vry);
        this.LLLIILIL = (C0GSI) view.findViewById(R.id.uy1);
        this.LLLIL = (FrameLayout) view.findViewById(R.id.pos);
        ViewGroup.LayoutParams layoutParams4 = null;
        if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
            FrameLayout frameLayout = this.LLLIL;
            if (frameLayout != null) {
                layoutParams3 = frameLayout.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            FrameLayout frameLayout2 = this.LLLIL;
            if (frameLayout2 != null) {
                layoutParams4 = frameLayout2.getLayoutParams();
            }
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            LinearLayout linearLayout = this.LLLIIIIL;
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            }
        }
        this.LLLILZ = (LinearLayout) view.findViewById(R.id.pwv);
        this.LLLILZJ = (FrameLayout) view.findViewById(R.id.ik4);
        this.LLLILZLLLI = (FrameLayout) view.findViewById(R.id.ik3);
        this.LLLIZZ = (ViewGroup) view.findViewById(R.id.nlq);
        this.LLLJ = (C16FZ) view.findViewById(R.id.nnp);
        this.LLLJIL = (ViewGroup) view.findViewById(R.id.hb1);
        this.LLLJL = (C16FS) view.findViewById(R.id.tec);
        this.LLLL = (LinearLayout) view.findViewById(R.id.hg4);
        ?? r8 = new InterfaceC495690JcF() { // from class: X.0JcR
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            @Override // X.InterfaceC495690JcF
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZ(X.AbstractC495790JcP<?> r6) {
                /*
                    r5 = this;
                    com.bytedance.android.livesdk.profile.ui.LiveProfileSheet r0 = r5.LIZ
                    X.0JcS r4 = r0.LLJZIJLIL
                    r2 = 0
                    if (r4 == 0) goto L2f
                    boolean r0 = r6 instanceof X.InterfaceC495840JcU
                    if (r0 == 0) goto L30
                    if (r6 == 0) goto L30
                    int r0 = r6.LJ()
                    java.util.Map<java.lang.Integer, java.util.List<android.view.View>> r1 = X.C495820JcS.LIZJ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                    java.lang.Object r0 = r1.get(r0)
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L30
                    java.lang.Object r0 = X.C19719612Di.LJJIIZI(r0)
                    android.view.View r0 = (android.view.View) r0
                    if (r0 == 0) goto L30
                    r2 = r0
                L2a:
                    r6.LLILLL = r2
                    r6.LJIIJ()
                L2f:
                    return r2
                L30:
                    boolean r0 = r6.LJII()
                    r3 = 0
                    if (r0 == 0) goto L42
                    android.view.LayoutInflater r1 = r4.LIZIZ
                    int r0 = r6.LJ()
                    android.view.View r2 = X.C786410Ut5.Td(r1, r0, r2, r3)
                    goto L2a
                L42:
                    android.view.LayoutInflater r1 = r4.LIZ
                    int r0 = r6.LJ()
                    android.view.View r2 = X.C786410Ut5.Td(r1, r0, r2, r3)
                    goto L2a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C495810JcR.LIZ(X.0JcP):android.view.View");
            }
        };
        C495920Jcc c495920Jcc3 = this.LLJLLL;
        if (c495920Jcc3 != null) {
            List<AbstractC495740JcK> list = this.LLLLIIIILLL;
            C495770JcN c495770JcN = new C495770JcN(c495920Jcc3, r8);
            c495770JcN.LJ(this.LLLII, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495770JcN.LJ));
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(c495770JcN);
            C495730JcJ c495730JcJ = new C495730JcJ(c495920Jcc3, r8);
            c495730JcJ.LJ(this.LLLIIIIL, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495730JcJ.LJ));
            arrayList.add(c495730JcJ);
            C495720JcI c495720JcI = new C495720JcI(c495920Jcc3, r8);
            c495720JcI.LJ(this.LLLIIIL, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495720JcI.LJI));
            arrayList.add(c495720JcI);
            C495680JcE c495680JcE = new C495680JcE(c495920Jcc3, r8);
            c495680JcE.LJ(this.LLLIL, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495680JcE.LJFF));
            arrayList.add(c495680JcE);
            C495750JcL c495750JcL = new C495750JcL(c495920Jcc3, r8);
            c495750JcL.LJ(this.LLLILZ, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495750JcL.LJ));
            arrayList.add(c495750JcL);
            C495710JcH c495710JcH = new C495710JcH(c495920Jcc3, r8);
            c495710JcH.LJ(this.LLLL, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495710JcH.LJ));
            arrayList.add(c495710JcH);
            C495760JcM c495760JcM = new C495760JcM(c495920Jcc3, r8);
            c495760JcM.LJ(this.LLLILZJ, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495760JcM.LJ));
            arrayList.add(c495760JcM);
            C495700JcG c495700JcG = new C495700JcG(c495920Jcc3, r8);
            c495700JcG.LJ(this.LLLILZLLLI, this.LLLLII, (List) ((LinkedHashMap) this.LLLLIIL).get(c495700JcG.LJ));
            arrayList.add(c495700JcG);
        }
        for (AbstractC495790JcP abstractC495790JcP : (ArrayList) C15438062q.LJIJJLI(((LinkedHashMap) this.LLLLIIL).values())) {
            if ((abstractC495790JcP instanceof InterfaceC496390JdN) && abstractC495790JcP != null && (c496260JdA = this.LLLI) != null) {
                ((ArrayList) c496260JdA.LL).add(abstractC495790JcP);
            }
        }
        ViewGroup viewGroup2 = this.LLLIZZ;
        if (viewGroup2 != null && (layoutParams2 = viewGroup2.getLayoutParams()) != null) {
            C495920Jcc c495920Jcc4 = this.LLJLLL;
            if (c495920Jcc4 != null) {
                C495950Jcf c495950Jcf = c495920Jcc4.LIZJ;
                if (c495950Jcf != null && c495950Jcf.LIZLLL) {
                    layoutParams2.height = (int) C497740JfY.LIZIZ(255.0f);
                } else {
                    C495950Jcf c495950Jcf2 = c495920Jcc4.LIZJ;
                    if (c495950Jcf2 != null && !c495950Jcf2.LJII) {
                        layoutParams2.height = (int) C497740JfY.LIZIZ(327.0f);
                    }
                }
            }
            ViewGroup viewGroup3 = this.LLLIZZ;
            if (viewGroup3 != null) {
                C786410Ut5.X5(layoutParams2, viewGroup3);
            }
        }
        C495920Jcc c495920Jcc5 = this.LLJLLL;
        if (c495920Jcc5 != null && !c495920Jcc5.LJ && (viewGroup = this.LLLF) != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.height = C497740JfY.LJIILLIIL();
            ViewGroup viewGroup4 = this.LLLF;
            if (viewGroup4 != null) {
                C786410Ut5.X5(layoutParams, viewGroup4);
            }
        }
        C16FS c16fs = this.LLLJL;
        if (c16fs != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 5), c16fs);
        }
        AbstractC496140Jcy<?> abstractC496140Jcy = this.LLJZ;
        if (abstractC496140Jcy != null && (mutableLiveData = abstractC496140Jcy.LIZLLL) != null) {
            mutableLiveData.observe(this, new AObserverS211S0100000_7(this, 11));
        }
        C496260JdA c496260JdA2 = this.LLLI;
        if (c496260JdA2 != null && (c0gsi = this.LLLIILIL) != null) {
            ((ArrayList) c496260JdA2.LL).add(c0gsi);
        }
        C496260JdA c496260JdA3 = this.LLLI;
        if (c496260JdA3 != null) {
            ((ArrayList) c496260JdA3.LL).add(new InterfaceC496390JdN() { // from class: X.0Jd1
                @Override // X.InterfaceC496390JdN
                public final void LIZJ(boolean z) {
                }

                @Override // X.InterfaceC496390JdN
                public final void LIZ(C21578619ce c21578619ce, int i) {
                    int iIntValue;
                    DataChannel dataChannel;
                    Integer num;
                    LiveProfileSheet liveProfileSheet = this.LL;
                    C1324720kZq c1324720kZq = liveProfileSheet.LLLFZ;
                    if (c1324720kZq != null) {
                        float f = 1;
                        C495920Jcc c495920Jcc6 = liveProfileSheet.LLJLLL;
                        if (c495920Jcc6 != null && (dataChannel = c495920Jcc6.LJIIJJI) != null && (num = (Integer) dataChannel.gg0(C0TZQ.class)) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C786410Ut5.h5(c1324720kZq, f - (C497740JfY.LJJI(i - iIntValue) / 36));
                        if (c1324720kZq.getAlpha() > 0.0f) {
                            C500260Jjc.LLFFF(c1324720kZq);
                        } else {
                            C500260Jjc.LJIILIIL(c1324720kZq);
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        C495820JcS c495820JcS = this.LLJZIJLIL;
        if (c495820JcS != null) {
            int layoutId = getLayoutId();
            List list = (List) ((LinkedHashMap) C495820JcS.LIZJ).get(Integer.valueOf(layoutId));
            if (list == null || (view = (View) C19719612Di.LJJIIZI(list)) == null) {
                View viewTd = C786410Ut5.Td(c495820JcS.LIZ, layoutId, null, false);
                if (viewTd != null) {
                    return viewTd;
                }
            } else {
                return view;
            }
        }
        return C786410Ut5.Td(layoutInflater, getLayoutId(), null, false);
    }
}
