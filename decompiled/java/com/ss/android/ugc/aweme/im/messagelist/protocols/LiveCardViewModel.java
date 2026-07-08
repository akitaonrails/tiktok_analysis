package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AnonymousClass0951;
import X.C01GW;
import X.C069P;
import X.C09IC;
import X.C09IR;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZFW;
import X.C0ZVS;
import X.C0ZZ1;
import X.C0ZZ9;
import X.C0ZZP;
import X.C0ZZV;
import X.C11NJ;
import X.C11NZ;
import X.C1229100i5c;
import X.C13LE;
import X.C1509305vX;
import X.C1528505yd;
import X.C1705506m5;
import X.C1BNE;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C461720I8s;
import X.C869590Y9l;
import X.C879350Yeb;
import X.C898250ZLr;
import X.C901740ZZc;
import X.C914160Zte;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC781210Ukh;
import X.InterfaceC876950Yaj;
import Y.AfS47S1100000_14;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveCardViewModel extends AssemViewModel<InterfaceC0148002o> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(139));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(137));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(142));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(141));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(143));
    public final C01GW LLILZLL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(138));
    public final C2252321DDq LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public final C2252331DDr LLJ;
    public final C2252331DDr LLJI;
    public final C2252321DDq LLJIJIL;
    public final AnonymousClass0951 LLJILJIL;
    public final C01GW LLJILJILJ;
    public final EventLiveData<FollowStatus> LLJILLL;
    public final C01GW LLJJ;
    public final ConcurrentHashMap<String, Boolean> LLJJI;
    public volatile C901740ZZc LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveCardViewModel.class, "imLiveLoggerUtil", "getImLiveLoggerUtil()Lcom/ss/android/ugc/aweme/im/chatroom/api/IIMLiveLoggerUtil;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final HashMap<String, NewLiveRoomStruct> AQ2() {
        return (HashMap) this.LLILLL.getValue();
    }

    public final HashMap<String, C0ZZV> BQ2() {
        return (HashMap) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(11);
    }

    public final HashMap<String, Boolean> zQ2() {
        return (HashMap) this.LLILZ.getValue();
    }

    public LiveCardViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLIZ = c2252321DDqLIZ;
        this.LLIZLLLIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);
        this.LLJ = c2252331DDrLIZIZ;
        this.LLJI = c2252331DDrLIZIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(Boolean.FALSE);
        this.LLJIJIL = c2252321DDqLIZ2;
        this.LLJILJIL = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(140));
        IMHostApiRelationService.LIZ.getClass();
        IMHostApiRelationService iMHostApiRelationServiceLIZ = C898250ZLr.LIZ();
        this.LLJILLL = iMHostApiRelationServiceLIZ != null ? iMHostApiRelationServiceLIZ.getRelationObservable() : null;
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 526));
        this.LLJJI = new ConcurrentHashMap<>();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LLILLJJLI.getValue()).LJ();
        EventLiveData<FollowStatus> eventLiveData = this.LLJILLL;
        if (eventLiveData != null) {
            eventLiveData.removeObserver((Observer) this.LLJJ.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventLiveData<FollowStatus> eventLiveData = this.LLJILLL;
        if (eventLiveData != null) {
            eventLiveData.observeForever((Observer) this.LLJJ.getValue());
        }
    }

    public static void CQ2(ShareLiveContent shareLiveContent) {
        C879350Yeb c879350Yeb = C879350Yeb.LIZ;
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        String roomSecOwnerId = shareLiveContent.getRoomSecOwnerId();
        c879350Yeb.getClass();
        C879350Yeb.LIZ(roomOwnerId, roomSecOwnerId, null);
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        if (iIMChatAnalyticsLIZ != null) {
            iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, shareLiveContent.getRoomOwnerId(), "chat", "click_head", String.valueOf(System.currentTimeMillis()));
        }
    }

    public static Pair EQ2(C869590Y9l c869590Y9l) {
        ShareLiveContent shareLiveContent;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveContent.class);
        if (!(orParseJsonContent instanceof ShareLiveContent) || (shareLiveContent = (ShareLiveContent) orParseJsonContent) == null) {
            return null;
        }
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        if (roomOwnerId == null) {
            roomOwnerId = "";
        }
        return new Pair(roomOwnerId, shareLiveContent.getRoomSecOwnerId());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(X.C0ZZX r22) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel.DQ2(X.0ZZX):void");
    }

    public final void GQ2(String str) {
        C2252321DDq c2252321DDq = this.LLIZ;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), str)) {
        }
    }

    public static void vQ2(String str, Map map) {
        String strLIZ;
        map.put("conversation_id", str);
        IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpiForReal(IIMAnalyticsUtil.class);
        if (iIMAnalyticsUtil == null || (strLIZ = iIMAnalyticsUtil.LIZ(str)) == null) {
            strLIZ = "";
        }
        map.put("chat_type", strLIZ);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && c0y8tLIZ.isGroupChat()) {
            map.put("group_type", C1229100i5c.LJI(str));
            map.put("group_owner_account_type", C1528505yd.LIZ(String.valueOf(C0ZFW.LJJI(c0y8tLIZ))));
        }
    }

    public final void xQ2(String str, String str2) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null) {
            wQ2(lLJIILIIL.longValue(), str2, false);
        }
    }

    public final boolean yQ2(String str, String str2) {
        if (str.length() != 0 && Intrinsics.LJFF(C461720I8s.LIZIZ(), str)) {
            return true;
        }
        Boolean bool = this.LLJJI.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(str, str2, "im_chat");
        if (iMUserLIZLLL != null && iMUserLIZLLL.getFollowStatus() != 0) {
            return true;
        }
        return false;
    }

    public final void FQ2(C0ZZ9 c0zz9, C869590Y9l c869590Y9l, ShareLiveContent shareLiveContent) {
        String str;
        C0ZZ1 roomInfo = c0zz9.getRoomInfo();
        if (roomInfo != null && (str = roomInfo.LIZIZ) != null && AQ2().containsKey(str) && (!BQ2().containsKey(str)) && !((Set) this.LLILZLL.getValue()).contains(Long.valueOf(c869590Y9l.getMsgId()))) {
            ((Set) this.LLILZLL.getValue()).add(Long.valueOf(c869590Y9l.getMsgId()));
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C0ZZP(this, c869590Y9l, shareLiveContent, str, null), 2);
        }
    }

    public final void wQ2(long j, String str, boolean z) {
        C11NZ c11nzLJFF;
        if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            return;
        }
        final String strValueOf = String.valueOf(j);
        if (!z && zQ2().containsKey(strValueOf)) {
            return;
        }
        IMLiveService.LIZ.getClass();
        IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
        if (iMLiveServiceLIZ != null && (c11nzLJFF = iMLiveServiceLIZ.LJFF(j, str)) != null) {
            if (!zQ2().containsKey(strValueOf)) {
                zQ2().put(strValueOf, Boolean.TRUE);
            }
            ((C11NJ) this.LLILLJJLI.getValue()).LIZ(c11nzLJFF.LJJZ(new AfS47S1100000_14(this, strValueOf, 0), new AfS47S1100000_14(this, strValueOf, 1), new InterfaceC781210Ukh() { // from class: X.0ZZS
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    this.LIZ.zQ2().put(strValueOf, Boolean.FALSE);
                    this.LIZ.LLJ.LIZJ(Unit.LIZ);
                    Collection<Boolean> collectionValues = this.LIZ.zQ2().values();
                    if (!collectionValues.isEmpty()) {
                        Iterator<T> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            if (!(!((Boolean) it2.next()).booleanValue())) {
                                return;
                            }
                        }
                    }
                    this.LIZ.LLJIJIL.setValue(Boolean.TRUE);
                }
            }));
        }
    }
}
