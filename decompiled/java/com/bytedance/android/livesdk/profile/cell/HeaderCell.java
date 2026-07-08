package com.bytedance.android.livesdk.profile.cell;

import X.AbstractC495800JcQ;
import X.C0GU1;
import X.C0IJT;
import X.C0IXL;
import X.C0IXW;
import X.C0UX6;
import X.C1119920fFW;
import X.C1148430fzV;
import X.C1161920gLG;
import X.C11NJ;
import X.C1324720kZq;
import X.C16F5;
import X.C176600m4;
import X.C1819620xS4;
import X.C1850730yGF;
import X.C19348710mr;
import X.C19374310qz;
import X.C19MX;
import X.C20736316Cj;
import X.C431500Gw0;
import X.C431620GwC;
import X.C474500IjA;
import X.C489050JFv;
import X.C495920Jcc;
import X.C495980Jci;
import X.C496970JeJ;
import X.C497740JfY;
import X.C498170JgF;
import X.C498210JgJ;
import X.C498240JgM;
import X.C498520Jgo;
import X.C500260Jjc;
import X.C521550Kcr;
import X.C782710Un7;
import X.C786410Ut5;
import X.EnumC19356310o5;
import X.EnumC495780JcO;
import X.EnumC496240Jd8;
import X.EnumC498130JgB;
import X.InterfaceC1364105Vn;
import X.InterfaceC496380JdM;
import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.BorderInfoUpdateEvent;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.dataChannel.ShowPrivilegeCenterEvent;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveU18HiddenCountSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdkapi.dataChannel.EnterLiveSourceChannel;
import com.bytedance.android.livesdkapi.depend.model.live.ProfileCardLabel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import qo2.w;
import tikcast.api.privilege.QueryUserPrivilegesResponse;
import webcast.api.room.GetRoomProfileCardResponse;
import webcast.api.room.PrivilegeEntrance;

/* JADX INFO: loaded from: classes8.dex */
public final class HeaderCell extends AbstractC495800JcQ<Pair<? extends PrivilegeCenterConfig, ? extends GetRoomProfileCardResponse.ResponseData>> implements InterfaceC496380JdM, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLII = 0;
    public C1324720kZq LLILZIL;
    public View LLILZLL;
    public C1324720kZq LLIZ;
    public C0GU1 LLIZLLLIL;
    public C16F5 LLJ;
    public C1324720kZq LLJI;
    public C16F5 LLJIJIL;
    public View LLJILJIL;
    public C498520Jgo LLJILJILJ;
    public C498170JgF LLJILLL;
    public LiveIconView LLJJ;
    public C16F5 LLJJI;
    public View LLJJIII;
    public ViewGroup LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C431620GwC LLJJIJIL;
    public View LLJJJ;
    public C1324720kZq LLJJJIL;
    public C1324720kZq LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public View LLJJJJLIIL;
    public PrivilegeCenterConfig LLJJL;
    public EnumC498130JgB LLJJLIIIJLLLLLLLZ;
    public Animator LLJL;
    public boolean LLJLIL;
    public long LLJLILLLLZIIL;
    public GetRoomProfileCardResponse.ResponseData LLJLL;
    public User LLJLLIL;
    public C498210JgJ LLJLLL;
    public final DataChannel LLJZ;
    public final Room LLJZIJLIL;
    public final UserProfileEvent LLL;
    public final C11NJ LLLF;
    public final boolean LLLFF;
    public boolean LLLFFI;
    public final EnumC495780JcO LLLFZ;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLLI;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.h00;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        Animator animator = this.LLJL;
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.LLLF.LJ();
        if (LiveMarkViewerOptimizationSetting.INSTANCE.getValue() && this.LL.LIZJ.LJI) {
            C782710Un7 c782710Un7 = C782710Un7.LIZ;
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_MARK_VIEWER;
            c782710Un7.getClass();
            C782710Un7.LJIILJJIL.remove(c0ux6);
        }
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view;
        C19MX c19mx;
        View view2 = this.LLILLL;
        this.LLILZIL = view2 != null ? (C1324720kZq) view2.findViewById(R.id.bh2) : null;
        View view3 = this.LLILLL;
        this.LLILZLL = view3 != null ? view3.findViewById(R.id.bic) : null;
        View view4 = this.LLILLL;
        this.LLIZ = view4 != null ? (C1324720kZq) view4.findViewById(R.id.bhu) : null;
        View view5 = this.LLILLL;
        this.LLIZLLLIL = view5 != null ? (C0GU1) view5.findViewById(R.id.p97) : null;
        View view6 = this.LLILLL;
        this.LLJ = view6 != null ? (C16F5) view6.findViewById(R.id.p94) : null;
        View view7 = this.LLILLL;
        this.LLJI = view7 != null ? (C1324720kZq) view7.findViewById(R.id.bbw) : null;
        View view8 = this.LLILLL;
        this.LLJIJIL = view8 != null ? (C16F5) view8.findViewById(R.id.user_name) : null;
        View view9 = this.LLILLL;
        this.LLJILJIL = view9 != null ? view9.findViewById(R.id.l8h) : null;
        View view10 = this.LLILLL;
        this.LLJILJILJ = view10 != null ? (C498520Jgo) view10.findViewById(R.id.m4t) : null;
        View view11 = this.LLILLL;
        this.LLJILLL = view11 != null ? (C498170JgF) view11.findViewById(R.id.a2s) : null;
        View view12 = this.LLILLL;
        this.LLJJ = view12 != null ? (LiveIconView) view12.findViewById(R.id.a3c) : null;
        View view13 = this.LLILLL;
        this.LLJJI = view13 != null ? (C16F5) view13.findViewById(R.id.a4x) : null;
        View view14 = this.LLILLL;
        this.LLJJIII = view14 != null ? view14.findViewById(R.id.nyp) : null;
        View view15 = this.LLILLL;
        this.LLJJIJI = view15 != null ? (ViewGroup) view15.findViewById(R.id.hjx) : null;
        View view16 = this.LLILLL;
        this.LLJJIJIIJIL = view16 != null ? (C16F5) view16.findViewById(R.id.iek) : null;
        View view17 = this.LLILLL;
        this.LLJJIJIL = view17 != null ? (C431620GwC) view17.findViewById(R.id.pid) : null;
        View view18 = this.LLILLL;
        if (view18 != null && (c19mx = (C19MX) view18.findViewById(R.id.fyb)) != null) {
            c19mx.setReferencedIds(new int[]{R.id.p97, R.id.user_name, R.id.iej});
        }
        View view19 = this.LLILLL;
        this.LLJJJ = view19 != null ? view19.findViewById(R.id.i90) : null;
        View view20 = this.LLILLL;
        this.LLJJJIL = view20 != null ? (C1324720kZq) view20.findViewById(R.id.lrx) : null;
        View view21 = this.LLILLL;
        this.LLJJJJ = view21 != null ? (C1324720kZq) view21.findViewById(R.id.lry) : null;
        View view22 = this.LLILLL;
        this.LLJJJJJIL = view22 != null ? (FrameLayout) view22.findViewById(R.id.i91) : null;
        View view23 = this.LLILLL;
        this.LLJJJJLIIL = view23 != null ? view23.findViewById(R.id.rvz) : null;
        this.LLJZ.BQ2(this.LL.LIZIZ, BorderInfoUpdateEvent.class, new AwS586S0100000_7(this, 432));
        C495980Jci c495980Jci = this.LL;
        if (c495980Jci.LIZJ.LIZLLL) {
            this.LLJZ.BQ2(c495980Jci.LIZIZ, ShowPrivilegeCenterEvent.class, new AwS583S0100000_4(this, 255));
        }
        C495980Jci c495980Jci2 = this.LL;
        if (!c495980Jci2.LIZJ.LIZLLL || (view = this.LLJJJJLIIL) == null) {
            return;
        }
        RedDotExtensionKt.LJIIJ(C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER, view, c495980Jci2.LIZIZ, null, "user_preview", 4);
    }

    public final String LJIJ() {
        boolean z = this.LL.LIZJ.LJI;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        return z ? C489050JFv.LIZ(this.LL, iInteractService) : C489050JFv.LIZIZ(this.LL, iInteractService);
    }

    public final void LJIJI() {
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C1324720kZq c1324720kZq = this.LLJJJIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        C1324720kZq c1324720kZq2 = this.LLJJJJ;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 8);
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public final void LJIJJ() {
        String strLJIJI;
        String strLJJIFFI;
        String strLJIJI2;
        if (this.LL.LIZJ.LIZLLL) {
            C431620GwC c431620GwC = this.LLJJIJIL;
            if (c431620GwC != null) {
                User user = this.LLJLLIL;
                if (user == null) {
                    user = null;
                }
                if (TextUtils.isEmpty(user.getAutoGraph())) {
                    strLJIJI = C497740JfY.LJIJI(2131851991);
                } else {
                    User user2 = this.LLJLLIL;
                    strLJIJI = u.LJJIFFI((user2 != null ? user2 : null).getAutoGraph(), "\n", " ", false);
                }
                c431620GwC.setOriginalText(LJIIZILJ(strLJIJI));
                return;
            }
            return;
        }
        GetRoomProfileCardResponse.ResponseData responseData = this.LLJLL;
        GetRoomProfileCardResponse.Bio bio = responseData != null ? responseData.bio : null;
        if (bio == null) {
            C431620GwC c431620GwC2 = this.LLJJIJIL;
            if (c431620GwC2 != null) {
                c431620GwC2.setOriginalText(LJIIZILJ(C497740JfY.LJIJI(2131851991)));
                c431620GwC2.setSuffixText("");
                return;
            }
            return;
        }
        boolean z = !TextUtils.isEmpty(bio.descriptionTranslation);
        if (z) {
            strLJJIFFI = this.LLJLIL ? u.LJJIFFI(bio.descriptionTranslation, "\n", " ", false) : u.LJJIFFI(bio.description, "\n", " ", false);
            strLJIJI2 = this.LLJLIL ? C497740JfY.LJIJI(2131844040) : C497740JfY.LJIJI(2131844041);
            if (strLJIJI2 == null) {
                strLJIJI2 = "";
            }
        } else {
            strLJJIFFI = !TextUtils.isEmpty(bio.description) ? u.LJJIFFI(bio.description, "\n", " ", false) : C497740JfY.LJIJI(2131851991);
            strLJIJI2 = "";
        }
        C431620GwC c431620GwC3 = this.LLJJIJIL;
        if (c431620GwC3 != null) {
            c431620GwC3.setOriginalText(LJIIZILJ(strLJJIFFI));
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJI2);
                C1119920fFW.LJ(this.LL.LIZ, spannableStringBuilder, 0, strLJIJI2.length(), 33, 6, 500);
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex0, this.LL.LIZ)), 0, strLJIJI2.length(), 33);
                C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan() { // from class: X.0GVD
                    @Override // android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                        return (int) paint.measureText(charSequence, i, i2);
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                        if (charSequence != null) {
                            canvas.drawText(charSequence, i, i2, f, i4, paint);
                        }
                    }
                }, 0, strLJIJI2.length(), 33);
                C786410Ut5.q2(spannableStringBuilder, new C521550Kcr(this, 7), 0, strLJIJI2.length(), 33);
                c431620GwC3.setSuffixText(spannableStringBuilder);
            } else {
                c431620GwC3.setSuffixText("");
            }
            c431620GwC3.setLinksClickable(true);
            if (C431500Gw0.LJI == null) {
                C431500Gw0.LJI = new C431500Gw0();
            }
            c431620GwC3.setMovementMethod(C431500Gw0.LJI);
            c431620GwC3.setHighlightColor(0);
        }
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C431620GwC c431620GwC = this.LLJJIJIL;
        if (c431620GwC != null) {
            c431620GwC.LLJJI = "";
            c431620GwC.LLJJIII = "";
        }
    }

    @Override // X.InterfaceC496380JdM
    public final void o1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("log_enter_live_source", this.LLJZ.gg0(EnterLiveSourceChannel.class));
        User user = this.LLJLLIL;
        if (user == null) {
            user = null;
        }
        linkedHashMap.put("sec_user_id", user.getSecUid());
        linkedHashMap.put("room_id", String.valueOf(this.LLJZIJLIL.getId()));
        linkedHashMap.put("from_request_id", this.LLJZIJLIL.getRequestId());
        linkedHashMap.put("enter_from", "live");
        linkedHashMap.put("return_live", "1");
        w.LIZ.getClass();
        linkedHashMap.put("extra_from_pre_page", w.LJIIIZ());
        if (this.LLJZIJLIL.hasCommerceGoods) {
            linkedHashMap.put("from_scene", "10");
        }
        linkedHashMap.put("is_from_live", "true");
        linkedHashMap.put("from_anchor_id", String.valueOf(this.LLJZIJLIL.getOwnerUserId()));
        linkedHashMap.put("room_request_id", this.LLJZIJLIL.getRequestId());
        User user2 = this.LLJLLIL;
        if (user2 == null) {
            user2 = null;
        }
        linkedHashMap.put("page_user_id", String.valueOf(user2.getId()));
        linkedHashMap.put("from_live_module", this.LLL.getFromLiveModule());
        linkedHashMap.put("live_enter_module", LJIJ());
        linkedHashMap.put("enter_from_merge", w.LJIIIZ());
        linkedHashMap.put("enter_method", w.LJIIL());
        linkedHashMap.put("room_request_id", w.LJIJI());
        linkedHashMap.put("action_type", w.LIZLLL());
        IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
        User user3 = this.LLJLLIL;
        if (user3 == null) {
            user3 = null;
        }
        iHostUser.cacheUserBeforeEnterProfile(user3);
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (!Intrinsics.LJFF(this.LL.LJIIIIZZ.clickModule, "live_reflow_system_prompt")) {
            User user4 = this.LLJLLIL;
            if (user4 == null) {
                user4 = null;
            }
            iHostAction.openUserProfilePage(user4.getId(), linkedHashMap);
        } else if (((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).isSharer(this.LL.LJIIIIZZ.userId).booleanValue()) {
            User user5 = this.LLJLLIL;
            if (user5 == null) {
                user5 = null;
            }
            iHostAction.openShareUserProfilePage(user5.getId(), linkedHashMap, C176600m4.LIZ(), "live_profile_card_sharer");
        } else {
            User user6 = this.LLJLLIL;
            if (user6 == null) {
                user6 = null;
            }
            iHostAction.openShareUserProfilePage(user6.getId(), linkedHashMap, C176600m4.LIZ(), "live_profile_card_receiver");
        }
        User user7 = this.LLJLLIL;
        if (user7 == null) {
            user7 = null;
        }
        if (user7.getFollowInfo() != null) {
            if (C0IXW.LJFF(this.LLJZ)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("refer", "photo");
                C0IXW c0ixw = C0IXW.LIZ;
                C0IXW.LIZ("live_ad", "otherclick", linkedHashMap2, null);
            }
            C474500IjA c474500IjALIZJ = C0IJT.LIZJ("enter_personal_detail");
            c474500IjALIZJ.LJIJJLI(this.LLJZ);
            c474500IjALIZJ.LJJII("click_head", "enter_method");
            User user8 = this.LLJLLIL;
            if (user8 == null) {
                user8 = null;
            }
            c474500IjALIZJ.LJJII(Long.valueOf(user8.getId()), "to_user_id");
            User user9 = this.LLJLLIL;
            if (user9 == null) {
                user9 = null;
            }
            c474500IjALIZJ.LJJII(Long.valueOf(user9.getId()), "anchor_id");
            User user10 = this.LLJLLIL;
            if (user10 == null) {
                user10 = null;
            }
            FollowInfo followInfo = user10.getFollowInfo();
            c474500IjALIZJ.LJJII(followInfo != null ? Long.valueOf(followInfo.getFollowStatus()) : null, "follow_status");
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C0IXL c0ixl = (C0IXL) dataChannelGlobal.gg0(C1148430fzV.class);
            c474500IjALIZJ.LJJII(c0ixl != null ? c0ixl.LJIIIIZZ : null, "live_request_id");
            C0IXL c0ixl2 = (C0IXL) dataChannelGlobal.gg0(C1148430fzV.class);
            c474500IjALIZJ.LJJII(c0ixl2 != null ? c0ixl2.LJIIIIZZ : null, "room_request_id");
            c474500IjALIZJ.LJJII(LJIJ(), "live_enter_module");
            c474500IjALIZJ.LJJII("live", "enter_from");
            c474500IjALIZJ.LJJII("live", "enter_from_method");
            c474500IjALIZJ.LJJII("normal", "play_mode");
            User user11 = this.LLJLLIL;
            if (user11 == null) {
                user11 = null;
            }
            FollowInfo followInfo2 = user11.getFollowInfo();
            c474500IjALIZJ.LJJII(followInfo2 != null ? Long.valueOf(followInfo2.getFollowStatus()) : null, "relation_tag");
            c474500IjALIZJ.LJJII(String.valueOf(this.LLJZIJLIL.getId()), "from_room_id");
            c474500IjALIZJ.LJJII(Long.valueOf(System.currentTimeMillis()), "profile_entrance_id");
            c474500IjALIZJ.LIZ();
        }
        this.LL.LIZLLL.dismiss();
    }

    @Override // X.InterfaceC496380JdM
    public final Pair<View, View> p1() {
        return new Pair<>(this.LLILZIL, this.LLIZ);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLLFZ;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLLI;
    }

    public HeaderCell(C495920Jcc c495920Jcc) {
        EnumC496240Jd8 enumC496240Jd8;
        super(c495920Jcc);
        this.LLJJLIIIJLLLLLLLZ = EnumC498130JgB.LLILLL;
        this.LLJLIL = true;
        DataChannel dataChannel = c495920Jcc.LJIIJJI;
        this.LLJZ = dataChannel;
        this.LLJZIJLIL = c495920Jcc.LJFF;
        this.LLL = c495920Jcc.LJIIIIZZ;
        this.LLLF = new C11NJ();
        this.LLLFF = LiveU18HiddenCountSetting.INSTANCE.showEngagementCount(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel)));
        c495920Jcc.LIZIZ.getLifecycle().addObserver(this);
        this.LLLFZ = EnumC495780JcO.HEADER;
        Boolean bool = Boolean.TRUE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC496240Jd8.LABELS);
        if (c495920Jcc.LIZJ.LIZLLL) {
            enumC496240Jd8 = EnumC496240Jd8.PRIVILEGE_ENTRANCE;
        } else {
            enumC496240Jd8 = EnumC496240Jd8.BIO;
        }
        arrayList.add(enumC496240Jd8);
        this.LLLI = new Pair<>(bool, arrayList);
    }

    public static Pair LJJ(GetRoomProfileCardResponse.ResponseData responseData) {
        boolean z;
        QueryUserPrivilegesResponse.EntranceConfig entranceConfig;
        PrivilegeEntrance privilegeEntrance = responseData.privilegeEntrance;
        if (privilegeEntrance != null && privilegeEntrance.showEntrance) {
            z = true;
        } else {
            z = false;
            if (privilegeEntrance == null) {
                entranceConfig = null;
            }
            return new Pair(new PrivilegeCenterConfig(z, entranceConfig, null, 4, null), responseData);
        }
        entranceConfig = new QueryUserPrivilegesResponse.EntranceConfig();
        entranceConfig.img = privilegeEntrance.entranceIcon;
        entranceConfig.background = privilegeEntrance.entranceIconBackground;
        entranceConfig.showRedDot = privilegeEntrance.showRedDot;
        entranceConfig.openSchema = privilegeEntrance.openSchema;
        return new Pair(new PrivilegeCenterConfig(z, entranceConfig, null, 4, null), responseData);
    }

    @Override // X.AbstractC495790JcP
    public final /* bridge */ /* synthetic */ Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
        return LJJ(responseData);
    }

    public final CharSequence LJIIZILJ(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        String str = (String) charSequence;
        C1119920fFW.LJ(this.LL.LIZ, spannableStringBuilder, 0, str.length(), 18, 7, 400);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex6, this.LL.LIZ)), 0, str.length(), 18);
        return spannableStringBuilder;
    }

    public final void LJIL(Map<String, String> map) {
        int i;
        int i2;
        int i3;
        List<ProfileCardLabel> list;
        String str;
        GetRoomProfileCardResponse.Bio bio;
        PrivilegeCenterConfig privilegeCenterConfig;
        if (this.LLLFFI) {
            return;
        }
        this.LLLFFI = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_general_module_show");
        c474500IjALIZ.LJIJJLI(this.LLJZ);
        c474500IjALIZ.LJJII(this.LL.LJIIIIZZ.clickModule, "click_module");
        c474500IjALIZ.LJJII(this.LL.LIZJ.LIZ(), "card_click_view");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJFF.getId()), "actual_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJFF.getOwnerUserId()), "actual_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJI.getId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJII), "to_user_id");
        c474500IjALIZ.LJJII(1, "is_head_show");
        int i4 = 0;
        if (this.LLJJLIIIJLLLLLLLZ == EnumC498130JgB.LLILLL) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_report_show");
        if (this.LLJJLIIIJLLLLLLLZ == EnumC498130JgB.LLILLJJLI) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_more_show");
        if (this.LLJJLIIIJLLLLLLLZ == EnumC498130JgB.LL && (privilegeCenterConfig = this.LLJJL) != null && privilegeCenterConfig.showEntrance) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_privilege_show");
        User user = this.LLJLLIL;
        String str2 = null;
        if (user == null) {
            user = null;
        }
        List<BadgeStruct> badgeList = user.getBadgeList();
        if (badgeList != null && !badgeList.isEmpty()) {
            Iterator<BadgeStruct> it2 = badgeList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().exhibitionType == 1) {
                    i4 = 1;
                    break;
                }
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "is_user_tag_show");
        GetRoomProfileCardResponse.ResponseData responseData = this.LLJLL;
        if (responseData != null && (bio = responseData.bio) != null) {
            str2 = bio.descriptionTranslation;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(1 ^ (TextUtils.isEmpty(str2) ? 1 : 0)), "is_translation_show");
        GetRoomProfileCardResponse.ResponseData responseData2 = this.LLJLL;
        if (responseData2 != null && (list = responseData2.labels) != null) {
            Iterator<ProfileCardLabel> it3 = list.iterator();
            while (it3.hasNext()) {
                int i5 = it3.next().type;
                if (i5 != 13) {
                    if (i5 == 15) {
                        str = "is_top_buyers_tag_show";
                    } else {
                        switch (i5) {
                            case 1:
                                str = "is_moderator_tag_show";
                                break;
                            case 2:
                                str = "is_new_gifter_tag_show";
                                break;
                            case 3:
                                str = "is_top_user_tag_show";
                                break;
                            case 4:
                                str = "is_state_controlled_media_tag_show";
                                break;
                            case 5:
                                str = "is_live_pro_tag_show";
                                break;
                            case 6:
                                str = "is_live_pro_gamer_tag_show";
                                break;
                            case 7:
                                str = "is_global_community_favorites_tag_show";
                                break;
                            case 8:
                                str = "is_global_best_team_tag_show";
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                str = "is_region_community_favorites_tag_show";
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                str = "is_region_best_team_tag_show";
                                break;
                        }
                    }
                } else {
                    str = "is_music_talent_tag_show";
                }
                c474500IjALIZ.LJJII("1", str);
            }
        }
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public final void LJJI(boolean z) {
        String strLIZLLL = C498240JgM.LIZLLL("personal_profile", this.LL.LIZ, this.LLJZIJLIL, this.LLJJL, z);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LL.LIZ, strLIZLLL, null);
    }

    public final void LJJIFFI(BorderInfo borderInfo) {
        if (borderInfo == null) {
            C500260Jjc.LJIILIIL(this.LLIZ);
            C500260Jjc.LLFFF(this.LLILZLL);
            return;
        }
        C500260Jjc.LLFFF(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLILZLL);
        C1819620xS4.LIZ().LJIIIZ(borderInfo.icon).LJJI(this.LLIZ);
        User user = this.LLJLLIL;
        if (user == null) {
            return;
        }
        C496970JeJ.LIZIZ(user, borderInfo.source, "profile_card", this.LL.LIZJ.LJI);
    }

    public static String LJIJJLI(HeaderCell headerCell, long j) {
        C19348710mr c19348710mr;
        String string;
        headerCell.getClass();
        if (!LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
            return C1850730yGF.LJIIIIZZ(j);
        }
        if (j < 10000) {
            c19348710mr = new C19348710mr(null, null, null, 15);
        } else {
            c19348710mr = new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13);
        }
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(j), c19348710mr, null, 1, 20);
        if (charSequenceLIZ != null && (string = charSequenceLIZ.toString()) != null) {
            return string;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027b  */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.android.live.base.model.user.User r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.profile.cell.HeaderCell.LJIIIZ(com.bytedance.android.live.base.model.user.User, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse.ResponseData r7, X.InterfaceC1364105Vn<? super kotlin.Pair<com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig, webcast.api.room.GetRoomProfileCardResponse.ResponseData>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C496560Jde
            if (r0 == 0) goto L21
            r5 = r8
            X.0Jde r5 = (X.C496560Jde) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L40
        L21:
            X.0Jde r5 = new X.0Jde
            r5.<init>(r6, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            X.0Jdd r0 = new X.0Jdd     // Catch: java.lang.Throwable -> L46
            r0.<init>(r6, r7, r2)     // Catch: java.lang.Throwable -> L46
            r5.LLILLL = r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = X.C2296808zG.LJ(r0, r5)     // Catch: java.lang.Throwable -> L46
            if (r4 != r3) goto L43
            return r3
        L40:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L46
        L43:
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L46
            return r4
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.profile.cell.HeaderCell.LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse$ResponseData, X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super Pair<PrivilegeCenterConfig, GetRoomProfileCardResponse.ResponseData>> interfaceC1364105Vn) {
        return LJJ(responseData);
    }
}
