package com.ss.android.ugc.aweme.live;

import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C0I0B;
import X.C0PEM;
import X.C0Y3I;
import X.C0Y7P;
import X.C0Y8T;
import X.C0YA1;
import X.C0YA6;
import X.C0YAE;
import X.C0YC9;
import X.C0YI5;
import X.C0Z9N;
import X.C0ZVS;
import X.C13LP;
import X.C1501705uJ;
import X.C1501805uK;
import X.C1501905uL;
import X.C1502005uM;
import X.C1598106Nn;
import X.C1598206No;
import X.C1598606Ns;
import X.C1770006wU;
import X.C1BNE;
import X.C1DW6;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C842240X2g;
import X.C869590Y9l;
import X.C876310YZh;
import X.C876340YZk;
import X.EnumC872590YKz;
import X.InterfaceC1612206Sy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatLiveEntranceResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatWatchLiveInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatPageLiveViewModel extends ViewModel implements InterfaceC1612206Sy, GenericLifecycleObserver {
    public final SessionInfo LL;
    public final LifecycleOwner LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 672));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(580));
    public final C1598606Ns LLILZIL;
    public final C054G LLILZLL;
    public final C01GW LLIZ;
    public final C2252321DDq LLIZLLLIL;

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // X.InterfaceC1612206Sy
    public final boolean Yk2() {
        this.LLILZ.getValue().getClass();
        return C1598106Nn.LIZ();
    }

    @Override // X.InterfaceC1612206Sy
    public final C2252321DDq dO2() {
        return this.LLIZLLLIL;
    }

    public static boolean wQ2(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null || c869590Y9l.getMsgType() != 2000 || !Intrinsics.LJFF(c869590Y9l.getScene(), "live_group_mic_connect")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1612206Sy
    public final AnonymousClass0956 aI(HashMap map) {
        return C23250099c.LIZLLL(this.LLILZLL, C0PEM.LIZJ, null, new C1501705uJ(this, map, null), 2);
    }

    @Override // X.InterfaceC1612206Sy
    public final void hC2(GroupChatLiveEntranceResponse.ResponseData responseData) {
        User user;
        String string;
        String str;
        C1598606Ns c1598606Ns;
        ImageModel avatarThumb;
        List<String> listLIZ;
        if (responseData == null) {
            c1598606Ns = this.LLILZIL;
        } else {
            GroupChatWatchLiveInfo groupChatWatchLiveInfo = (GroupChatWatchLiveInfo) C13LP.LJJJLZIJ(0, responseData.watchLiveInfos);
            String string2 = null;
            if (groupChatWatchLiveInfo != null) {
                user = groupChatWatchLiveInfo.userInfo;
            } else {
                user = null;
            }
            GroupChatWatchLiveInfo groupChatWatchLiveInfo2 = (GroupChatWatchLiveInfo) C13LP.LJJJLZIJ(0, responseData.watchLiveInfos);
            if (groupChatWatchLiveInfo2 != null) {
                string = Long.valueOf(groupChatWatchLiveInfo2.roomId).toString();
            } else {
                string = null;
            }
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null) {
                str = (String) C13LP.LJJJLZIJ(0, listLIZ);
            } else {
                str = null;
                if (user != null) {
                }
                this.LLILZ.getValue().getClass();
                c1598606Ns = new C1598606Ns(str, Integer.valueOf(responseData.entranceStatus), string, !C1598106Nn.LIZ(), string2);
            }
            string2 = Long.valueOf(user.getId()).toString();
            this.LLILZ.getValue().getClass();
            c1598606Ns = new C1598606Ns(str, Integer.valueOf(responseData.entranceStatus), string, !C1598106Nn.LIZ(), string2);
        }
        this.LLIZLLLIL.setValue(c1598606Ns);
    }

    @Override // X.InterfaceC1612206Sy
    public final void iv1(C869590Y9l c869590Y9l) {
        String conversationId;
        if (!Intrinsics.LJFF(c869590Y9l.getScene(), "live_group_mic_connect")) {
            return;
        }
        C1598206No.LJFF();
        C1598206No.LJ();
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
        if (iIMGroupLiveAnalytics != null) {
            C0Y8T c0y8t = (C0Y8T) this.LLILLL.getValue();
            if (c0y8t != null) {
                conversationId = c0y8t.getConversationId();
            } else {
                conversationId = null;
            }
            iIMGroupLiveAnalytics.LIZIZ("click", conversationId, String.valueOf(c869590Y9l.getSender()), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.InterfaceC1612206Sy
    public final void m92(C869590Y9l c869590Y9l) {
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics;
        String conversationId;
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "live_group_mic_connect") && (iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class)) != null) {
            C0Y8T c0y8t = (C0Y8T) this.LLILLL.getValue();
            if (c0y8t != null) {
                conversationId = c0y8t.getConversationId();
            } else {
                conversationId = null;
            }
            iIMGroupLiveAnalytics.LIZIZ("show", conversationId, String.valueOf(c869590Y9l.getSender()), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        ((C876310YZh) c0yi5LIZ).LIZ.LJIJI().LJIIL(this.LL.getConversationId(), this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        ((C876310YZh) c0yi5LIZ).LIZ.LJIJI().LJII(this.LL.getConversationId(), this);
    }

    public GroupChatPageLiveViewModel(SessionInfo sessionInfo, Fragment fragment) {
        this.LL = sessionInfo;
        this.LLILLJJLI = fragment;
        C1598606Ns c1598606Ns = new C1598606Ns(0, 30);
        this.LLILZIL = new C1598606Ns(1, 30);
        new HashSet();
        this.LLILZLL = C2296808zG.LIZ(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 4).plus(C2296908zH.LIZ()));
        this.LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(579));
        this.LLIZLLLIL = C1BNE.LIZ(c1598606Ns);
        fragment.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1612206Sy
    public final Unit aC1(int i, String str) {
        Integer numValueOf;
        String str2;
        boolean zLIZIZ;
        C0YAE member;
        C0Y8T c0y8t = (C0Y8T) this.LLILLL.getValue();
        if (c0y8t != null && (member = c0y8t.getMember()) != null) {
            numValueOf = Integer.valueOf(member.getRole());
        } else {
            numValueOf = null;
        }
        int value = C0Z9N.OWNER.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            str2 = "owner";
        } else {
            int value2 = C0Z9N.ADMIN.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                str2 = "admin";
            } else {
                str2 = "member";
            }
        }
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
        if (iIMGroupLiveAnalytics != null) {
            String conversationId = this.LL.getConversationId();
            boolean zYk2 = Yk2();
            Integer numValueOf2 = Integer.valueOf(i + 1);
            C1598206No c1598206No = C1598206No.LIZ;
            IMLiveService.LIZ.getClass();
            IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
            boolean z = false;
            if (iMLiveServiceLIZ != null) {
                zLIZIZ = iMLiveServiceLIZ.LIZIZ();
            } else {
                zLIZIZ = false;
            }
            if (C1598206No.LIZLLL(c1598206No) < 3 || zLIZIZ) {
                z = true;
            }
            iIMGroupLiveAnalytics.LJFF(str, conversationId, zYk2, numValueOf2, z, str2, C0I0B.LJFF.LIZIZ());
        }
        return Unit.LIZ;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        C869590Y9l c869590Y9lPrevious;
        ListIterator<? extends C869590Y9l> listIterator = list2.listIterator(list2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c869590Y9lPrevious = listIterator.previous();
                if (wQ2(c869590Y9lPrevious)) {
                    break;
                }
            } else {
                c869590Y9lPrevious = null;
                break;
            }
        }
        C869590Y9l c869590Y9l = c869590Y9lPrevious;
        if (c869590Y9l == null) {
            return;
        }
        C23250099c.LIZLLL(this.LLILZLL, C0PEM.LIZJ, null, new C1501805uK(this, c869590Y9l, null), 2);
    }

    public final Unit vQ2(C869590Y9l c869590Y9l, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(c869590Y9l.getMsgId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(((ConcurrentHashMap) this.LLIZ.getValue()).get(strLIZIZ), true)) {
            return Unit.LIZ;
        }
        ((ConcurrentHashMap) this.LLIZ.getValue()).put(strLIZIZ, true);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LL.getConversationId());
        if (lLJIILIIL != null) {
            long jLongValue = lLJIILIIL.longValue();
            IMLiveService iMLiveService = (IMLiveService) PluggableExtentionKt.pluggableSpiForReal(IMLiveService.class);
            if (iMLiveService != null) {
                iMLiveService.i3(jLongValue, AFwS187S0000000_2.get$arr$(583), new AwS581S0100000_2(this, 259));
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1612206Sy
    public final Unit U01(int i, String str, HashMap map) {
        String str2;
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
        String str3 = null;
        if (iIMGroupLiveAnalytics == null) {
            return null;
        }
        String conversationId = this.LL.getConversationId();
        Integer numValueOf = Integer.valueOf(i + 1);
        if (map != null) {
            str3 = (String) map.get("live_host_id");
            str2 = (String) map.get("room_id");
        } else {
            str2 = null;
        }
        iIMGroupLiveAnalytics.LJIIIZ(str, conversationId, numValueOf, str3, str2, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        C869590Y9l c869590Y9lPrevious;
        if (list != null) {
            ListIterator<C869590Y9l> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    c869590Y9lPrevious = listIterator.previous();
                    if (wQ2(c869590Y9lPrevious)) {
                        break;
                    }
                } else {
                    c869590Y9lPrevious = null;
                    break;
                }
            }
            C869590Y9l c869590Y9l = c869590Y9lPrevious;
            if (c869590Y9l != null) {
                C23250099c.LIZLLL(this.LLILZLL, C0PEM.LIZJ, null, new C1501905uL(this, c869590Y9l, null), 2);
            }
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        C869590Y9l c869590Y9lPrevious;
        if (list != null) {
            ListIterator<? extends C869590Y9l> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    c869590Y9lPrevious = listIterator.previous();
                    if (wQ2(c869590Y9lPrevious)) {
                        break;
                    }
                } else {
                    c869590Y9lPrevious = null;
                    break;
                }
            }
            C869590Y9l c869590Y9l = c869590Y9lPrevious;
            if (c869590Y9l != null) {
                C23250099c.LIZLLL(this.LLILZLL, C0PEM.LIZJ, null, new C1502005uM(this, c869590Y9l, null), 2);
            }
        }
    }
}
