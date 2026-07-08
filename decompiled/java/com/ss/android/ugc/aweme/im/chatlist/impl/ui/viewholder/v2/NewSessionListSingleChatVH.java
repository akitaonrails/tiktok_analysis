package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.C01GW;
import X.C0I0B;
import X.C0J7X;
import X.C0S1B;
import X.C0Z86;
import X.C0Z8L;
import X.C0ZPE;
import X.C0ZPF;
import X.C0ZPH;
import X.C1256620io0;
import X.C1257180iou;
import X.C1492305sn;
import X.C1591220rVg;
import X.C1605650rsx;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607300rvc;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1906570ziJ;
import X.C19EG;
import X.C1AF0;
import X.C2201941BFw;
import X.C293020Be8;
import X.C420101kF;
import X.C427660Gpo;
import X.C452501pT;
import X.C486660J6q;
import X.C737760Swo;
import X.C786410Ut5;
import X.C895200Z9y;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1605470rsf;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1615506Uf;
import X.EnumC1994907rf;
import X.InterfaceC1398730mVD;
import X.InterfaceC1583770rJf;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.NewSessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class NewSessionListSingleChatVH extends SessionListSingleChatVH {
    public final C01GW LLLLJ;
    public boolean LLLLJI;
    public final C01GW LLLLL;
    public InterfaceC1398730mVD LLLLLIL;
    public Long LLLLLILLIL;
    public SlimRoom LLLLLJIL;
    public C0ZPE LLLLLJLJLL;
    public C0ZPF LLLLLL;
    public User LLLLLLIL;
    public boolean LLLLLLJ;
    public final MutableLiveData<C0ZPH> LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final AwS593S0100000_14 LLLLLLLLLL;
    public NewSessionListSingleChatVH$addChangeNodeObserver$1 LLLLLLLZIL;

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH, X.InterfaceC1508640pMU
    public final String T() {
        return "NewSessionListSingleChatVH";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final String b6() {
        return "new_session_list_single_chat_vh";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    public final void r7(C0Z8L c0z8l) {
    }

    public final AvatarComponentView R7() {
        return (AvatarComponentView) this.LLLLJ.getValue();
    }

    public final void V7() {
        C0J7X c0j7x;
        if (((Number) C293020Be8.LIZ.getValue()).intValue() != 0 && (c0j7x = (C0J7X) this.LLLLLLLLL.getValue()) != null) {
            c0j7x.LIZIZ(getActivity(), Lifecycle.State.CREATED);
        }
        if (C420101kF.LIZ(EnumC1606080rte.DM)) {
            this.LLLLLLL.setValue(new C0ZPH(false, "view_recycle"));
        }
    }

    public final void W7() {
        if (((Number) C293020Be8.LIZ.getValue()).intValue() != 0) {
            Long l = this.LLLLLILLIL;
            if (l != null) {
                U7(Long.valueOf(l.longValue()));
            }
            C0J7X c0j7x = (C0J7X) this.LLLLLLLLL.getValue();
            if (c0j7x != null) {
                c0j7x.LIZIZ(getActivity(), Lifecycle.State.RESUMED);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    public final void O7() {
        try {
            C895200Z9y.LIZ(R7());
            View realAvatarView = R7().getRealAvatarView();
            if (realAvatarView != null) {
                C895200Z9y.LIZ(realAvatarView);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "NewSessionListSingleChatVH optimizeAvatarView error");
        }
    }

    public final LifecycleOwner S7() {
        return C1591220rVg.LIZLLL() ? C946803n0.LIZ(this.itemView) : IMainSAFLifecycleKt.findSAFExpLifecycleOwner(this.itemView, getActivity());
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final C427660Gpo c6() {
        return R7().getAvatar();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    public final Boolean u7() {
        return Boolean.valueOf(C1607300rvc.LIZIZ(R7()));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final Function1<C0Z8L, Unit> U5() {
        return this.LLLLLLLLLL;
    }

    public NewSessionListSingleChatVH(View view) {
        super(view);
        this.LLLLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 416));
        this.LLLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(116));
        this.LLLLLLJ = true;
        this.LLLLLLL = new MutableLiveData<>(C0ZPH.LIZJ);
        this.LLLLLLLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(117));
        this.LLLLLLLLLL = new AwS593S0100000_14(this, 48);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    public final void L7(EnumC1605470rsf enumC1605470rsf) {
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLLLLIL;
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LJIIIIZZ(enumC1605470rsf);
        }
    }

    public final void U7(Long l) {
        String string;
        String uid;
        String string2;
        String uid2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", "message");
        linkedHashMap.put("enter_method", "dm_head");
        linkedHashMap.put("action_type", "click");
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        String str = "";
        if (curUserId == null) {
            curUserId = "";
        }
        linkedHashMap.put("user_id", curUserId);
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("room_id", string);
        User user = this.LLLLLLIL;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        linkedHashMap.put("anchor_id", uid);
        User user2 = this.LLLLLLIL;
        if (user2 == null || (string2 = Integer.valueOf(user2.getFollowStatus()).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("follow_status", string2);
        linkedHashMap.put("mg_distribution_type", "anchor");
        User user3 = this.LLLLLLIL;
        if (user3 != null && (uid2 = user3.getUid()) != null) {
            str = uid2;
        }
        linkedHashMap.put("distribution_user_list", str);
        C486660J6q.LJIIJ(linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final /* bridge */ /* synthetic */ void f6(C0Z86 c0z86) {
        f6((C0Z8L) c0z86);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    /* JADX INFO: renamed from: n7 */
    public final void f6(C0Z8L c0z8l) {
        if (c0z8l.getActivityStatusViewData() != null) {
            C1492305sn.LIZ().LJIILLIIL(System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
        V7();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
        if (this.LLLLLLJ) {
            W7();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ZPE, androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ZPF, X.0rJf] */
    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    public final void p7(C0Z8L c0z8l) {
        Lifecycle lifecycle;
        NewSessionListSingleChatVH$addChangeNodeObserver$1 newSessionListSingleChatVH$addChangeNodeObserver$1;
        LifecycleOwner lifecycleOwnerS7;
        Lifecycle lifecycle2;
        C0J7X c0j7x;
        boolean z = false;
        if (!this.LLLLJI) {
            this.LLLLJI = true;
            AvatarComponentView avatarComponentViewR7 = R7();
            C1608750rxx config = avatarComponentViewR7.getConfig();
            A7();
            new AwS593S0100000_14(this, 316).invoke(config.LIZ);
            config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.DM, new C1606770rul(null, new AwS628S0100000_14(this, 69), new AwS593S0100000_14(this, 317), null, new AwS558S0100000_14(this, 1562), AFwS201S0000000_14.get$arr$(526), new AwS593S0100000_14(this, 318), null, null, 393), 4)), new C1607280rva(new C1607310rvd(EnumC1606090rtf.DM, s7(), false, false, (C897520ZIw) this.LLLLL.getValue(), 14)), new C1256620io0(new C1257180iou(8, EnumC1994907rf.ANIM_BADGE, null, null, 124), 2));
            new AwS593S0100000_14(this, 319).invoke(config.LIZJ);
            avatarComponentViewR7.LJFF(avatarComponentViewR7.getConfig());
            avatarComponentViewR7.getClickListener().LIZ(1, new ACListenerS126S0200000_24(this, avatarComponentViewR7, 35));
            avatarComponentViewR7.getClickListener().LIZ(3, new ACListenerS149S0100000_14(this, 76));
            this.itemView.setTag(R.id.kah, avatarComponentViewR7);
        }
        IMUser imUser = c0z8l.getImUser();
        if (imUser == null) {
            return;
        }
        IMUser.Companion.getClass();
        final User userLJII = C2201941BFw.LJII(imUser);
        C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
        EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
        userLJII.setStoryStatus(c1605650rsx.LJIIZILJ(enumC1615506Uf, userLJII.getUid()));
        userLJII.setAllStoryMetadata(c1605650rsx.LJIJI(enumC1615506Uf, userLJII.getUid()));
        if (userLJII.getStoryStatus() > 0) {
            R7().LJIILJJIL(52, null);
        } else {
            R7().LJIILJJIL(56, null);
        }
        this.LLLLLLIL = userLJII;
        if (c0z8l.getSessionType() != 0) {
            userLJII = null;
        }
        LifecycleOwner lifecycleOwnerS72 = S7();
        if (lifecycleOwnerS72 != null) {
            z = false;
            C0S1B.LIZ(R7(), c0z8l.getUid(), userLJII, lifecycleOwnerS72, false, null, 56);
        }
        final C19EG activity = getActivity();
        final String uid = c0z8l.getUid();
        this.LLLLLILLIL = null;
        this.LLLLLJIL = null;
        if (activity != null && ((Number) C293020Be8.LIZ.getValue()).intValue() != 0) {
            C0ZPE c0zpe = this.LLLLLJLJLL;
            if (c0zpe != null && (c0j7x = (C0J7X) this.LLLLLLLLL.getValue()) != null) {
                c0j7x.LIZ(uid, c0zpe);
            }
            ?? r3 = new Observer() { // from class: X.0ZPE
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Long l;
                    SlimRoom slimRoom;
                    long jLongValue;
                    Pair pair = (Pair) obj;
                    if (pair != null) {
                        l = (Long) pair.getFirst();
                    } else {
                        l = null;
                    }
                    User user = userLJII;
                    if (user != null) {
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        user.roomId = jLongValue;
                    }
                    NewSessionListSingleChatVH newSessionListSingleChatVH = this;
                    if (newSessionListSingleChatVH.LLLLLILLIL == null && l != null) {
                        newSessionListSingleChatVH.U7(l);
                    }
                    NewSessionListSingleChatVH newSessionListSingleChatVH2 = this;
                    newSessionListSingleChatVH2.LLLLLILLIL = l;
                    if (pair != null) {
                        slimRoom = (SlimRoom) pair.getSecond();
                    } else {
                        slimRoom = null;
                    }
                    newSessionListSingleChatVH2.LLLLLJIL = slimRoom;
                    NewSessionListSingleChatVH newSessionListSingleChatVH3 = this;
                    if (newSessionListSingleChatVH3.LLLLLILLIL != null) {
                        newSessionListSingleChatVH3.R7().LJIILJJIL(52, null);
                    } else if (C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, uid) <= 0) {
                        this.R7().LJIILJJIL(56, null);
                    }
                    C0S1B.LIZ(this.R7(), uid, userLJII, activity, false, null, 56);
                }
            };
            C0J7X c0j7x2 = (C0J7X) this.LLLLLLLLL.getValue();
            if (c0j7x2 != 0) {
                c0j7x2.LIZJ(uid, IMainSAFLifecycleKt.requireMainSAFLifecycle(activity, null, z), r3);
            }
            this.LLLLLJLJLL = r3;
            Hox hoxLIZ = Hox.LLJILJIL.LIZ(activity);
            C0ZPF c0zpf = this.LLLLLL;
            if (c0zpf != null) {
                hoxLIZ.OQ2(c0zpf);
                if (C1591220rVg.LIZLLL() && (newSessionListSingleChatVH$addChangeNodeObserver$1 = this.LLLLLLLZIL) != null && (lifecycleOwnerS7 = S7()) != null && (lifecycle2 = lifecycleOwnerS7.getLifecycle()) != null) {
                    lifecycle2.removeObserver(newSessionListSingleChatVH$addChangeNodeObserver$1);
                }
            }
            ?? r32 = new InterfaceC1583770rJf() { // from class: X.0ZPF
                @Override // X.InterfaceC1583770rJf
                public final void A4(String str, String str2) {
                    if (Intrinsics.LJFF(str2, "NOTIFICATION")) {
                        this.LL.W7();
                    } else {
                        this.LL.V7();
                    }
                    this.LL.LLLLLLJ = Intrinsics.LJFF(str2, "NOTIFICATION");
                }
            };
            hoxLIZ.vQ2(r32);
            if (C1591220rVg.LIZLLL()) {
                NewSessionListSingleChatVH$addChangeNodeObserver$1 newSessionListSingleChatVH$addChangeNodeObserver$12 = new NewSessionListSingleChatVH$addChangeNodeObserver$1(hoxLIZ, r32);
                LifecycleOwner lifecycleOwnerS73 = S7();
                if (lifecycleOwnerS73 != null && (lifecycle = lifecycleOwnerS73.getLifecycle()) != null) {
                    lifecycle.addObserver(newSessionListSingleChatVH$addChangeNodeObserver$12);
                }
                this.LLLLLLLZIL = newSessionListSingleChatVH$addChangeNodeObserver$12;
            }
            this.LLLLLL = r32;
        }
    }

    public NewSessionListSingleChatVH(ViewGroup viewGroup) {
        this(C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.cmz, viewGroup, false, 24));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH
    public final void I7(Context context, ViewGroup viewGroup) {
        C786410Ut5.Sd(R.layout.dsr, C786410Ut5.ne(context), viewGroup);
    }
}
