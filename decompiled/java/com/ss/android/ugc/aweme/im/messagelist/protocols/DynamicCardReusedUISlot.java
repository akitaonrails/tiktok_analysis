package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C069P;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C09R3;
import X.C0I6Y;
import X.C0Q2J;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z7V;
import X.C0ZFW;
import X.C0ZVW;
import X.C0ZVX;
import X.C0ZVZ;
import X.C1229100i5c;
import X.C1383370m6R;
import X.C13DA;
import X.C13LE;
import X.C13LP;
import X.C155000ia;
import X.C1559260qg8;
import X.C1598406Nq;
import X.C1637806bA;
import X.C1668706g9;
import X.C1807670x8n;
import X.C18ST;
import X.C18SV;
import X.C19719912Dl;
import X.C19MX;
import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C337180DJs;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C461640I8k;
import X.C461720I8s;
import X.C462590ICb;
import X.C462620ICe;
import X.C687700QyG;
import X.C723580SZw;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.C900070ZSr;
import X.C946803n0;
import X.EnumC900680ZVa;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC497601wk;
import X.InterfaceC712990Rxx;
import X.InterfaceC876950Yaj;
import X.InterfaceC900060ZSq;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.dynamic.DynamicCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import njp.a;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardReusedUISlot extends ReusedUISlotAssem<DynamicCardReusedUISlot> implements InterfaceC712990Rxx<InterfaceC900060ZSq>, C18ST, C18SV, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, C0Q2J.class, null), checkSupervisorPrepared());
    public IMDynamicCardFrame LLJLILLLLZIIL;
    public View LLJLL;
    public TuxTextView LLJLLIL;
    public TuxSpinner LLJLLL;
    public final AssemVMLazy LLJZ;
    public final C01GW LLJZIJLIL;
    public AnonymousClass0956 LLL;
    public final C01GW LLLF;
    public volatile C1598406Nq LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DynamicCardReusedUISlot.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DynamicCardReusedUISlot.class, "dynamicCardViewModel", "getDynamicCardViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/dynamic/DynamicCardViewModel;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public DynamicCardReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicCardViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 525), AFwS248S0000000_14.get$arr$(137), null, true);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 524));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 523));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cla;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.C18ST
    public final Map<String, Object> ib() {
        return C2097608Jq.LJIIIIZZ(new Pair("im_chat_youthful_design_experiment", 3), new Pair("im_message_bubble_layout_setting_corner_radius_dp", Float.valueOf(IMMessageBubbleLayoutSetting.LIZ().cornerRadiusDp)));
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.C18SV
    public final void C5() {
        View view = this.LLJLL;
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        TuxSpinner tuxSpinner = this.LLJLLL;
        if (tuxSpinner != null) {
            C337180DJs.LIZ(tuxSpinner);
        }
        TuxTextView tuxTextView = this.LLJLLIL;
        if (tuxTextView != null) {
            C337180DJs.LIZ(tuxTextView);
        }
        IMDynamicCardFrame iMDynamicCardFrame = this.LLJLILLLLZIIL;
        if (iMDynamicCardFrame != null) {
            C1383370m6R.LJIILJJIL(-2, -2, iMDynamicCardFrame);
        }
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 55), LJJIJL());
    }

    @Override // X.C18ST
    public final Map<String, String> G8() {
        C0Z7V c0z7vLJIILJJIL;
        Map<String, String> mapLJI;
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        return (iIMBusinessChatService == null || (c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL()) == null || (mapLJI = c0z7vLJIILJJIL.LJI(tp())) == null) ? C2097608Jq.LJ() : mapLJI;
    }

    @Override // X.C18ST
    public final Map<String, Object> ou() {
        String string;
        String str;
        IMUser iMUserLJIIL;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str2;
        IMUser iMUserLJIIL2;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo2;
        String str3;
        UrlModel avatarThumb;
        List<String> urlList;
        Object objLJJJLZIJ;
        UrlModel avatarThumb2;
        List<String> urlList2;
        Object objLJJJLZIJ2;
        IMUserBizInfo imUserBizInfo2;
        IMUserB2CAccountInfo userB2CAccountInfo3;
        C13DA c13da = new C13DA();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c13da.put("conversation_id", tp().getConversationId());
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(tp().getConversationId());
        String str4 = "";
        if (c0y8tLIZ == null || (string = Long.valueOf(c0y8tLIZ.getConversationShortId()).toString()) == null) {
            string = "";
        }
        c13da.put("conversation_short_id", string);
        c13da.put("process_id", tp().getUuid());
        c13da.put("is_group", Integer.valueOf(tp().isGroupChat() ? 1 : 0));
        String strLIZIZ = C461720I8s.LIZIZ();
        c13da.put("cur_uid", strLIZIZ);
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL3 = C069P.LIZ().LJ().LJIIL(strLIZIZ, null, "im_local_db");
        if (iMUserLJIIL3 == null || (imUserBizInfo2 = iMUserLJIIL3.getImUserBizInfo()) == null || (userB2CAccountInfo3 = imUserBizInfo2.getUserB2CAccountInfo()) == null || (str = userB2CAccountInfo3.userTags) == null) {
            str = "";
        }
        c13da.put("account_type", str);
        IMUser iMUserLJIIL4 = C069P.LIZ().LJ().LJIIL(strLIZIZ, null, "im_local_db");
        if (iMUserLJIIL4 != null && (avatarThumb2 = iMUserLJIIL4.getAvatarThumb()) != null && (urlList2 = avatarThumb2.getUrlList()) != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, urlList2)) != null) {
            c13da.put("cur_avatar_url", objLJJJLZIJ2);
        }
        String singleChatFromUserId = tp().getSingleChatFromUserId();
        if (singleChatFromUserId == null) {
            singleChatFromUserId = "";
        }
        c13da.put("other_uid", singleChatFromUserId);
        IMUser iMUserLJIIL5 = C069P.LIZ().LJ().LJIIL(singleChatFromUserId, null, "im_local_db");
        if (iMUserLJIIL5 != null && (avatarThumb = iMUserLJIIL5.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList)) != null) {
            c13da.put("peer_avatar_url", objLJJJLZIJ);
        }
        c13da.put("enter_from", tp().getEnterFromForMob());
        c13da.put("enter_method", tp().getEnterMethod());
        int chatType = tp().getChatType();
        c13da.put("chat_type", chatType != 1 ? chatType != 3 ? "private" : C1229100i5c.LIZLLL(tp().getConversationId()) : "stranger");
        if (tp().isGroupChat()) {
            c13da.put("group_type", C1229100i5c.LJI(tp().getConversationId()));
            C0ZFW c0zfw = C0ZFW.LIZ;
            c13da.put("is_master", Integer.valueOf(C0ZFW.LJIJ(tp().getConversationId()) ? 1 : 0));
            String strLJJIFFI = c0zfw.LJJIFFI(tp().getConversationId());
            if (strLJJIFFI != null && (iMUserLJIIL2 = C069P.LIZ().LJ().LJIIL(strLJJIFFI, null, "im_local_db")) != null && (imUserBizInfo = iMUserLJIIL2.getImUserBizInfo()) != null && (userB2CAccountInfo2 = imUserBizInfo.getUserB2CAccountInfo()) != null && (str3 = userB2CAccountInfo2.userTags) != null) {
                linkedHashMap.put("group_owner_account_type", str3);
            }
        }
        c13da.put("event_extra", linkedHashMap);
        String singleChatFromUserId2 = tp().getSingleChatFromUserId();
        if (singleChatFromUserId2 != null && (iMUserLJIIL = C069P.LIZ().LJ().LJIIL(singleChatFromUserId2, null, "im_local_db")) != null) {
            c13da.put("follow_status", Integer.valueOf(iMUserLJIIL.getFollowStatus()));
            c13da.put("follower_status", Integer.valueOf(iMUserLJIIL.getFollowerStatus()));
            IMUserBizInfo imUserBizInfo3 = iMUserLJIIL.getImUserBizInfo();
            if (imUserBizInfo3 != null && (userB2CAccountInfo = imUserBizInfo3.getUserB2CAccountInfo()) != null && (str2 = userB2CAccountInfo.userTags) != null) {
                str4 = str2;
            }
            c13da.put("other_user_account_type", str4);
        }
        return c13da.build();
    }

    public final C0ZVX sp() {
        return (C0ZVX) this.LLLF.getValue();
    }

    public final SessionInfo tp() {
        return ((C457780HxI) this.LLJL.getValue()).LL;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLL = null;
        C0ZVX c0zvxSp = sp();
        if (c0zvxSp != null) {
            c0zvxSp.LJFF();
        }
        C786410Ut5.I7(null, LJJIJL());
    }

    @Override // X.C18ST
    public final Map<String, String> getBusinessData() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBusinessData curMsg.uuid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
        sbLIZ.append(c869590Y9lLIZ != null ? c869590Y9lLIZ.getUuid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        return C2097608Jq.LJ();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes11.dex */
    @C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot$onViewCreated$3", f = "DynamicCardProtocol.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public AnonymousClass3(InterfaceC1364105Vn<? super AnonymousClass3> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return DynamicCardReusedUISlot.this.new AnonymousClass3(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Lifecycle lifecycle;
            C1C7U.LIZ("DynamicCardReusedUISlot@db04.onViewCreated$3");
            C099R.LJFF();
            C155000ia.LIZIZ(obj);
            Fragment fragmentLIZ = C946803n0.LIZ(DynamicCardReusedUISlot.this.LJJIJL());
            if (fragmentLIZ != null && (lifecycle = fragmentLIZ.getLifecycle()) != null) {
                final DynamicCardReusedUISlot dynamicCardReusedUISlot = DynamicCardReusedUISlot.this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot.onViewCreated.3.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        C0ZVX c0zvxSp;
                        if (event == Lifecycle.Event.ON_DESTROY && (c0zvxSp = dynamicCardReusedUISlot.sp()) != null) {
                            c0zvxSp.LIZ();
                        }
                    }
                });
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DynamicCardReusedUISlot@db04.onViewCreated$3");
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @Override // X.C18SV
    public final void b6(EnumC900680ZVa enumC900680ZVa) {
        int i = C0ZVZ.LIZ[enumC900680ZVa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                TuxSpinner tuxSpinner = this.LLJLLL;
                if (tuxSpinner != null) {
                    C337180DJs.LIZ(tuxSpinner);
                }
                TuxTextView tuxTextView = this.LLJLLIL;
                if (tuxTextView != null) {
                    C337180DJs.LIZ(tuxTextView);
                }
            } else {
                TuxSpinner tuxSpinner2 = this.LLJLLL;
                if (tuxSpinner2 != null) {
                    C337180DJs.LIZ(tuxSpinner2);
                }
                TuxTextView tuxTextView2 = this.LLJLLIL;
                if (tuxTextView2 != null) {
                    C337180DJs.LIZJ(tuxTextView2);
                }
            }
        } else {
            TuxSpinner tuxSpinner3 = this.LLJLLL;
            if (tuxSpinner3 != null) {
                C337180DJs.LIZJ(tuxSpinner3);
            }
            TuxTextView tuxTextView3 = this.LLJLLIL;
            if (tuxTextView3 != null) {
                C337180DJs.LIZ(tuxTextView3);
            }
        }
        View view = this.LLJLL;
        if (view != null) {
            C337180DJs.LIZJ(view);
        }
        C786410Ut5.I7(null, LJJIJL());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL.getValue();
        View viewFindViewById = ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.findViewById(R.id.nzx);
        if (viewFindViewById != null) {
            viewFindViewById.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        }
        C19MX c19mx = (C19MX) ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.findViewById(R.id.ev_);
        if (c19mx != null) {
            c19mx.setReferencedIds(new int[]{R.id.apb, R.id.eu1});
        }
        this.LLJLILLLLZIIL = (IMDynamicCardFrame) LJJIJL().findViewById(R.id.mdv);
        int iLIZJ = C461640I8k.LIZJ(C461640I8k.LIZ, ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.getContext(), ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, 0.9f, 0.0f, 120);
        IMDynamicCardFrame iMDynamicCardFrame = this.LLJLILLLLZIIL;
        if (iMDynamicCardFrame != null) {
            iMDynamicCardFrame.setMaxWidthPx(iLIZJ);
        }
        this.LLJLL = LJJIJL().findViewById(R.id.hm0);
        this.LLJLLIL = (TuxTextView) LJJIJL().findViewById(R.id.hc5);
        this.LLJLLL = (TuxSpinner) LJJIJL().findViewById(R.id.nnd);
        C1598406Nq c1598406Nq = this.LLLFF;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLLFF;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLLFF = c1598406Nq;
                }
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(c1598406Nq.LIZIZ), null, null, new AnonymousClass3(null), 3);
        LJJIJL().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 1));
    }

    public final void op(C462620ICe c462620ICe) {
        IMDynamicCardFrame iMDynamicCardFrame = this.LLJLILLLLZIIL;
        if (iMDynamicCardFrame != null) {
            iMDynamicCardFrame.setBackground(C462590ICb.LIZIZ(new C462620ICe(c462620ICe.LIZ, c462620ICe.LIZIZ), LJJIJL()));
        }
        IMDynamicCardFrame iMDynamicCardFrame2 = this.LLJLILLLLZIIL;
        if (iMDynamicCardFrame2 != null) {
            iMDynamicCardFrame2.setRoundingParams(c462620ICe.LIZ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC900060ZSq interfaceC900060ZSq) {
        InterfaceC900060ZSq interfaceC900060ZSq2 = interfaceC900060ZSq;
        C0ZVX c0zvxSp = sp();
        if (c0zvxSp != null) {
            c0zvxSp.LJ(C0I6Y.LIZ(interfaceC900060ZSq2), interfaceC900060ZSq2.LJJLIL());
        }
        op(interfaceC900060ZSq2.LIZJ());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC900060ZSq interfaceC900060ZSq) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC900060ZSq interfaceC900060ZSq) {
    }

    @Override // X.C18SV
    public final void j5(int i, int i2) {
        IMDynamicCardFrame iMDynamicCardFrame = this.LLJLILLLLZIIL;
        if (iMDynamicCardFrame != null) {
            C1383370m6R.LJIILJJIL(i, i2, iMDynamicCardFrame);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        boolean z;
        C900070ZSr c900070ZSr;
        C0ZVX c0zvxSp;
        InterfaceC900060ZSq interfaceC900060ZSq = (InterfaceC900060ZSq) interfaceC1587906Jp;
        View view = ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL;
        C0ZVX c0zvxSp2 = sp();
        if (c0zvxSp2 != null && c0zvxSp2.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        view.setTag(R.id.k_q, Boolean.TRUE);
        view.setTag(R.id.k_s, Boolean.valueOf(z));
        if (this.LLL == null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1598406Nq c1598406Nq = this.LLLFF;
            if (c1598406Nq == null) {
                synchronized (this) {
                    c1598406Nq = this.LLLFF;
                    if (c1598406Nq == null) {
                        c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                        this.LLLFF = c1598406Nq;
                    }
                }
            }
            this.LLL = C23250099c.LIZLLL(lifecycleScope, c1598406Nq.LIZIZ, null, new C0ZVW(this, interfaceC900060ZSq, null), 2);
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C900070ZSr) && (c900070ZSr = (C900070ZSr) obj2) != null) {
                    if (c900070ZSr.LIZ && (c0zvxSp = sp()) != null) {
                        c0zvxSp.LJ(C0I6Y.LIZ(interfaceC900060ZSq), interfaceC900060ZSq.LJJLIL());
                    }
                    if (c900070ZSr.LIZIZ) {
                        op(interfaceC900060ZSq.LIZJ());
                    }
                }
            }
            return;
        }
        C0ZVX c0zvxSp3 = sp();
        if (c0zvxSp3 != null) {
            c0zvxSp3.LJ(C0I6Y.LIZ(interfaceC900060ZSq), interfaceC900060ZSq.LJJLIL());
        }
        op(interfaceC900060ZSq.LIZJ());
    }
}
