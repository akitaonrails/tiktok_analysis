package com.bytedance.android.livesdk.pack.viewmodel;

import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C01GW;
import X.C09JN;
import X.C1123290fKx;
import X.C1123770fLj;
import X.C1125380fOK;
import X.C1125800fP0;
import X.C1126040fPO;
import X.C1126150fPZ;
import X.C1126980fQu;
import X.C1127930fSR;
import X.C1128300fT2;
import X.C1128580fTU;
import X.C1128860fTw;
import X.C1128870fTx;
import X.C1128940fU4;
import X.C1128970fU7;
import X.C1130020fVo;
import X.C1130100fVw;
import X.C1131140fXc;
import X.C1138640fji;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C13LP;
import X.C158B;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2684012c;
import X.C293001Bo;
import X.C293101Bp;
import X.C452501pT;
import X.C480460Ism;
import X.C497740JfY;
import X.EnumC1125400fOM;
import X.EnumC1129230fUX;
import X.EnumC1129500fUy;
import X.EnumC1131060fXU;
import X.InterfaceC1131100fXY;
import X.InterfaceC1631620sYq;
import Y.AObserverS221S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.AfS6S0100100_17;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRivalsScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveGiftSendSourceMatchListSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.pack.api.PackRetrofitApi;
import com.bytedance.android.livesdk.pack.model.SendItemErrorExtra;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS482S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.data.BagItemPreUpdateInfo;
import webcast.data.Group;

/* JADX INFO: loaded from: classes18.dex */
public final class BagListViewModel extends ViewModel {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public DataChannel LL;
    public final MutableLiveData<List<AbstractC1126600fQI<? extends AnonymousClass0054>>> LLILLJJLI;
    public final Map<Long, Group> LLILLL;
    public final MutableLiveData<AbstractC1126600fQI<? extends AnonymousClass0054>> LLILZ;
    public final MutableLiveData<AbstractC1126600fQI<? extends AnonymousClass0054>> LLILZIL;
    public C1126980fQu LLILZLL;
    public final C11NJ LLIZ;
    public final C11NJ LLIZLLLIL;
    public final MutableLiveData<EnumC1129500fUy> LLJ;
    public final MutableLiveData<Boolean> LLJI;
    public final C01GW LLJIJIL;
    public final ARunnableS117S0100000_17 LLJILJIL;

    public static String BQ2() {
        User userLIZJ;
        long id;
        List<C1125380fOK> list = C1125800fP0.LIZIZ;
        LinkedList linkedList = (LinkedList) list;
        if ((linkedList.size() == 1 ? ((C1125380fOK) C13LP.LJJJJZI(list)).LIZIZ : linkedList.size() > 1 ? EnumC1125400fOM.GUEST_IN_ALL : EnumC1125400fOM.ANCHOR) == EnumC1125400fOM.GUEST) {
            User userLIZJ2 = C1125800fP0.LIZJ();
            id = userLIZJ2 != null ? userLIZJ2.getId() : 0L;
        } else {
            if (!C1125800fP0.LJFF() || (userLIZJ = C1125800fP0.LIZJ()) == null) {
                return null;
            }
            id = userLIZJ.getId();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(id);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((Handler) this.LLJIJIL.getValue()).removeCallbacks(this.LLJILJIL);
        this.LLJI.setValue(Boolean.FALSE);
        this.LLILZ.setValue(null);
        this.LLILZIL.setValue(null);
        this.LLILLJJLI.setValue(C13BV.INSTANCE);
        this.LLJ.setValue(EnumC1129500fUy.LOADING);
        this.LLIZ.LJ();
        this.LLIZLLLIL.LJ();
    }

    public BagListViewModel() {
        MutableLiveData<List<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = new MutableLiveData<>();
        this.LLILZIL = new MutableLiveData<>();
        this.LLIZ = new C11NJ();
        this.LLIZLLLIL = new C11NJ();
        MutableLiveData<EnumC1129500fUy> mutableLiveData2 = new MutableLiveData<>();
        this.LLJ = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLJI = mutableLiveData3;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(101));
        mutableLiveData2.setValue(EnumC1129500fUy.LOADING);
        mutableLiveData.setValue(C13BV.INSTANCE);
        mutableLiveData3.observeForever(new AObserverS221S0100000_17(this, 22));
        mutableLiveData.observeForever(new Observer() { // from class: X.0fNu
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listLJJJJLI) {
                    T t = ((AbstractC1126600fQI) obj2).LIZIZ;
                    if (t != 0 && (t instanceof C1128940fU4)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C1128940fU4) ((AbstractC1126600fQI) it2.next()).LIZIZ).LIZ);
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                if (dataChannelGlobal != null) {
                    dataChannelGlobal.JQ2(C1148030fyr.class, arrayList2);
                }
            }
        });
        this.LLJILJIL = new ARunnableS117S0100000_17(this, 111);
    }

    public static String xQ2(long[] jArr) {
        if (jArr.length != 4) {
            return "";
        }
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        if (j > 0) {
            if (j3 > 0) {
                j2++;
            }
            long j5 = 24;
            long j6 = j + (j2 / j5);
            long j7 = j2 % j5;
            if (j7 != 0) {
                return C497740JfY.LJIJJ(2131841038, Long.valueOf(j6), Long.valueOf(j7));
            }
            return C497740JfY.LJIJJ(2131841039, Long.valueOf(j6));
        }
        if (j2 > 0) {
            if (j4 > 0) {
                j3++;
            }
            long j8 = 60;
            long j9 = j2 + (j3 / j8);
            long j10 = j3 % j8;
            if (j10 != 0) {
                return C497740JfY.LJIJJ(2131841040, Long.valueOf(j9), Long.valueOf(j10));
            }
            return C497740JfY.LJIJJ(2131841041, Long.valueOf(j9));
        }
        if (j3 < 0) {
            return "";
        }
        if (j4 > 0) {
            j3++;
        }
        return C497740JfY.LJIJJ(2131841042, Long.valueOf(j3));
    }

    public final AbstractC1126600fQI<? extends AnonymousClass0054> wQ2(Gift gift) {
        if (gift.type == 3) {
            return new C2684012c(gift);
        }
        if (gift.LJ()) {
            return new C293001Bo(gift);
        }
        return new C1126040fPO(gift);
    }

    public static long[] AQ2(long j, Long l) {
        if (l == null) {
            C20441214yg.LJ("BagListViewModel", "Expire time is null");
            return new long[]{0, 0, 0, 0};
        }
        long jLongValue = l.longValue() - j;
        if (jLongValue > 0) {
            return new long[]{jLongValue / 86400000, (jLongValue % 86400000) / 3600000, (jLongValue % 3600000) / 60000, (jLongValue % 60000) / 1000};
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expire time ");
        sbLIZ.append(l);
        sbLIZ.append(" ahead of current time ");
        sbLIZ.append(j);
        C20441214yg.LJ("BagListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return new long[]{0, 0, 0, 0};
    }

    public final void CQ2(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, Function1<? super AbstractC1126600fQI<? extends AnonymousClass0054>, Unit> function1) {
        if (abstractC1126600fQI instanceof C1126980fQu) {
            int i = C1138640fji.LIZ;
            Gift giftLJI = C1138640fji.LJI(((C1128940fU4) abstractC1126600fQI.LIZIZ).LJIIJJI);
            if (giftLJI == null) {
                function1.invoke(abstractC1126600fQI);
                return;
            }
            C1128940fU4 c1128940fU4 = (C1128940fU4) abstractC1126600fQI.LIZIZ;
            int i2 = c1128940fU4.LJIIJ;
            if (i2 != 101 && i2 != 10) {
                if (!c1128940fU4.LJIIL && c1128940fU4.LJIL > 0) {
                    function1.invoke(new C1127930fSR((C1128940fU4) abstractC1126600fQI.LIZIZ, giftLJI));
                    return;
                }
                if (c1128940fU4.LJIIJJI != C1128580fTU.LIZ()) {
                    C1128940fU4 c1128940fU42 = (C1128940fU4) abstractC1126600fQI.LIZIZ;
                    if (c1128940fU42.LJIIJJI != 56560) {
                        if (c1128940fU42.LJIIJ == 100) {
                            function1.invoke(wQ2(giftLJI));
                            return;
                        } else {
                            function1.invoke(abstractC1126600fQI);
                            return;
                        }
                    }
                }
                if (((C1128940fU4) abstractC1126600fQI.LIZIZ).LJIIL) {
                    function1.invoke(wQ2(giftLJI));
                    return;
                } else {
                    function1.invoke(abstractC1126600fQI);
                    return;
                }
            }
            function1.invoke(abstractC1126600fQI);
            return;
        }
        function1.invoke(abstractC1126600fQI);
    }

    public final void EQ2(C1126980fQu c1126980fQu, boolean z, boolean z2) {
        C1128940fU4 c1128940fU4;
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> value = this.LLILLJJLI.getValue();
        LinkedList linkedList = new LinkedList();
        if (value != null) {
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : value) {
                if (!(abstractC1126600fQI instanceof C1126980fQu)) {
                    linkedList.add(abstractC1126600fQI);
                } else if (abstractC1126600fQI != null && (c1128940fU4 = (C1128940fU4) abstractC1126600fQI.LIZIZ) != null) {
                    C1126980fQu c1126980fQu2 = (C1126980fQu) abstractC1126600fQI;
                    if (c1126980fQu.LJJIIJZLJL(c1126980fQu2)) {
                        c1128940fU4.LJIILJJIL = z;
                        c1128940fU4.LJIJJLI = z2;
                        c1128940fU4.LJJ = true;
                    }
                    C1126980fQu c1126980fQu3 = new C1126980fQu(c1128940fU4);
                    c1126980fQu3.LIZJ = c1126980fQu2.LIZJ;
                    c1126980fQu3.LIZLLL = c1126980fQu2.LIZLLL;
                    linkedList.add(c1126980fQu3);
                }
            }
        }
        this.LLILLJJLI.setValue(linkedList);
    }

    public final void yQ2(int i, long j, long j2, long j3, final Function1<? super List<? extends AbstractC1126600fQI<C1128940fU4>>, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncGiftList scene=");
        sbLIZ.append(i);
        sbLIZ.append(" roomId=");
        sbLIZ.append(j);
        sbLIZ.append(" anchorId=");
        sbLIZ.append(j2);
        sbLIZ.append(" userId=");
        sbLIZ.append(j3);
        C20441214yg.LJIIIZ("BAGS", C2188811AlT.LIZIZ(sbLIZ));
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1128860fTw.LJIIIIZZ("match_item_list_request", new JSONObject(), new JSONObject(), false, "");
        this.LLJ.setValue(EnumC1129500fUy.LOADING);
        this.LLIZLLLIL.LJ();
        this.LLIZ.LIZ(C1123770fLj.LIZ(i, j, j2, j3, BQ2()).LJJLL(new C09JN() { // from class: X.0fU0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x02fa  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x03c9  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0224  */
            /* JADX WARN: Type inference failed for: r6v14, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.lang.Object] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r44) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 1022
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1128900fU0.accept(java.lang.Object):void");
            }
        }, new AfS6S0100100_17(jElapsedRealtime, this, 3)));
    }

    public static void DQ2(BagListViewModel bagListViewModel, C1126980fQu c1126980fQu, long j, long j2, String str, AwS561S0100000_17 awS561S0100000_17, AwS482S0200000_17 awS482S0200000_17, int i) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        Number numberValueOf;
        C1128940fU4 c1128940fU4;
        AbstractC1126600fQI<? extends AnonymousClass0054> next;
        C1126980fQu c1126980fQu2;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2;
        Number numberValueOf2;
        C1128940fU4 c1128940fU42;
        AbstractC1126600fQI<? extends AnonymousClass0054> next2;
        C1126980fQu c1126980fQu3;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3;
        Room room;
        Number numberValueOf3;
        C1128940fU4 c1128940fU43;
        DataChannel dataChannel;
        Room room2;
        AbstractC1126600fQI<? extends AnonymousClass0054> next3;
        C1126980fQu c1126980fQu4;
        AwS482S0200000_17 awS482S0200000_172 = awS482S0200000_17;
        AwS561S0100000_17 awS561S0100000_172 = awS561S0100000_17;
        if ((i & 16) != 0) {
            awS561S0100000_172 = null;
        }
        if ((i & 32) != 0) {
            awS482S0200000_172 = null;
        }
        C1128940fU4 c1128940fU44 = (C1128940fU4) c1126980fQu.LIZIZ;
        if (c1128940fU44.LJIIL) {
            bagListViewModel.EQ2(c1126980fQu, true, false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = c1128940fU44.LJIIJ;
            if (i2 != 100 && i2 != 101 && i2 != 10) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("match_item_type", ((C1128940fU4) c1126980fQu.LIZIZ).LIZ());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("match_item_expiretime", ((C1128940fU4) c1126980fQu.LIZIZ).LIZLLL);
                C1128860fTw.LJIIIIZZ("match_item_send_request", jSONObject, jSONObject2, true, "native_panel");
            }
            int i3 = ((C1128940fU4) c1126980fQu.LIZIZ).LJIIJ;
            if (i3 == 100) {
                bagListViewModel.LLILZLL = c1126980fQu;
                List<AbstractC1126600fQI<? extends AnonymousClass0054>> value = bagListViewModel.LLILLJJLI.getValue();
                if (value != null) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = value.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = next3;
                            if ((abstractC1126600fQI4 instanceof C1126980fQu) && (c1126980fQu4 = (C1126980fQu) abstractC1126600fQI4) != null && c1126980fQu4.LJJIIJZLJL(c1126980fQu)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    abstractC1126600fQI3 = next3;
                } else {
                    abstractC1126600fQI3 = null;
                }
                if (!(abstractC1126600fQI3 instanceof C1126980fQu)) {
                    abstractC1126600fQI3 = null;
                }
                boolean z = c1126980fQu instanceof C293101Bp;
                long j3 = c1126980fQu.LJIJ;
                EnumC1129230fUX enumC1129230fUX = EnumC1129230fUX.GIFT_PANEL_PORTRAIT;
                EnumC1125400fOM enumC1125400fOMLIZIZ = C1125800fP0.LIZIZ();
                EnumC1125400fOM enumC1125400fOM = EnumC1125400fOM.GUEST;
                if (enumC1125400fOMLIZIZ != enumC1125400fOM) {
                    enumC1125400fOM = EnumC1125400fOM.ANCHOR;
                }
                C1126150fPZ c1126150fPZ = new C1126150fPZ(enumC1129230fUX, enumC1125400fOM);
                C1130020fVo c1130020fVo = InterfaceC1131100fXY.LIZ;
                C1128940fU4 c1128940fU45 = (C1128940fU4) c1126980fQu.LIZIZ;
                long j4 = c1128940fU45.LJIIJJI;
                int i4 = c1128940fU45.LJIIJ;
                DataChannel dataChannel2 = bagListViewModel.LL;
                if (dataChannel2 != null) {
                    room = (Room) dataChannel2.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
                int i5 = c1128970fU7.LJFF;
                c1130020fVo.getClass();
                C1128870fTx c1128870fTxLIZ = C1130020fVo.LIZ(j4, i4, 1, z, room, i5, c1126150fPZ);
                c1128870fTxLIZ.LJJIJLIJ = str;
                c1128870fTxLIZ.LJIILIIL = j3;
                c1128870fTxLIZ.LJIILJJIL = C1128300fT2.LJI(GiftManager.inst().findGiftById(((C1128940fU4) c1126980fQu.LIZIZ).LJIIJJI), j3, null);
                String str2 = "backpack";
                c1128870fTxLIZ.LJLIIIL = "backpack";
                c1128870fTxLIZ.LJJIJIIJIL = c1128970fU7.LJFF;
                c1128870fTxLIZ.LJJIJIL = GiftManager.inst().getTabName(c1128970fU7.LJFF);
                c1128870fTxLIZ.LJJIJL = c1128970fU7.LJFF;
                c1128870fTxLIZ.LJJII = C158B.LIZ();
                String str3 = c1128970fU7.LIZJ;
                if (Intrinsics.LJFF(str3, "rose_campaign_panel") || Intrinsics.LJFF(str3, "rose_campaign_backpack") || Intrinsics.LJFF(str3, "daily_gift_button") || Intrinsics.LJFF(str3, "first_gift_basic_button") || Intrinsics.LJFF(str3, "first_gift_limited_button") || LiveGiftSendSourceMatchListSettings.INSTANCE.hasMatchSource(str3)) {
                    str2 = str3;
                }
                c1128870fTxLIZ.LJLJJI = str2;
                c1128870fTxLIZ.LJIIIIZZ = EnumC1131060fXU.BACKPACK_SEND_SCENE_FREE_GIFT;
                User userLIZJ = C1125800fP0.LIZJ();
                if (userLIZJ != null || ((dataChannel = bagListViewModel.LL) != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && (userLIZJ = room2.getOwner()) != null)) {
                    c1128870fTxLIZ.LJLJL = C1123290fKx.LIZ(userLIZJ);
                    C1128940fU4 c1128940fU46 = (C1128940fU4) c1126980fQu.LIZIZ;
                    int i6 = c1128940fU46.LJIJ;
                    if (i6 <= 0) {
                        bagListViewModel.EQ2(c1126980fQu, false, false);
                        return;
                    }
                    long j5 = i6;
                    long j6 = c1128940fU46.LIZIZ;
                    if (j5 <= j6) {
                        numberValueOf3 = Integer.valueOf(i6);
                    } else {
                        numberValueOf3 = Long.valueOf(j6);
                    }
                    c1128870fTxLIZ.LIZLLL = numberValueOf3.intValue();
                    if (abstractC1126600fQI3 != null && (c1128940fU43 = (C1128940fU4) abstractC1126600fQI3.LIZIZ) != null) {
                        c1128940fU43.LJIJ = 0;
                    }
                    C1131140fXc.LIZLLL(bagListViewModel.LL, c1128870fTxLIZ);
                    return;
                }
                return;
            }
            if (i3 == 101) {
                List<AbstractC1126600fQI<? extends AnonymousClass0054>> value2 = bagListViewModel.LLILLJJLI.getValue();
                if (value2 != null) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it3 = value2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = next2;
                            if ((abstractC1126600fQI5 instanceof C1126980fQu) && (c1126980fQu3 = (C1126980fQu) abstractC1126600fQI5) != null && c1126980fQu3.LJJIIJZLJL(c1126980fQu)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    abstractC1126600fQI2 = next2;
                } else {
                    abstractC1126600fQI2 = null;
                }
                if (!(abstractC1126600fQI2 instanceof C1126980fQu)) {
                    abstractC1126600fQI2 = null;
                }
                C1128940fU4 c1128940fU47 = (C1128940fU4) c1126980fQu.LIZIZ;
                int i7 = c1128940fU47.LJIJ;
                long j7 = i7;
                long j8 = c1128940fU47.LIZIZ;
                if (j7 <= j8) {
                    numberValueOf2 = Integer.valueOf(i7);
                } else {
                    numberValueOf2 = Long.valueOf(j8);
                }
                int iIntValue = numberValueOf2.intValue();
                if (iIntValue <= 0) {
                    bagListViewModel.EQ2(c1126980fQu, false, false);
                    if (awS561S0100000_172 != null) {
                        awS561S0100000_172.invoke();
                    }
                    if (awS482S0200000_172 == null) {
                        return;
                    }
                    awS482S0200000_172.invoke(Boolean.FALSE, null, null);
                    return;
                }
                if (abstractC1126600fQI2 != null && (c1128940fU42 = (C1128940fU4) abstractC1126600fQI2.LIZIZ) != null) {
                    c1128940fU42.LJIJ = 0;
                }
                bagListViewModel.vQ2(c1128940fU44, iIntValue, j, j2, c1126980fQu, jElapsedRealtime, BQ2(), awS561S0100000_172, awS482S0200000_172);
                return;
            }
            if (i3 == 10) {
                List<AbstractC1126600fQI<? extends AnonymousClass0054>> value3 = bagListViewModel.LLILLJJLI.getValue();
                if (value3 != null) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it4 = value3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI6 = next;
                            if ((abstractC1126600fQI6 instanceof C1126980fQu) && (c1126980fQu2 = (C1126980fQu) abstractC1126600fQI6) != null && c1126980fQu2.LJJIIJZLJL(c1126980fQu)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    abstractC1126600fQI = next;
                } else {
                    abstractC1126600fQI = null;
                }
                if (!(abstractC1126600fQI instanceof C1126980fQu)) {
                    abstractC1126600fQI = null;
                }
                C1128940fU4 c1128940fU48 = (C1128940fU4) c1126980fQu.LIZIZ;
                int i8 = c1128940fU48.LJIJ;
                long j9 = i8;
                long j10 = c1128940fU48.LIZIZ;
                if (j9 <= j10) {
                    numberValueOf = Integer.valueOf(i8);
                } else {
                    numberValueOf = Long.valueOf(j10);
                }
                int iIntValue2 = numberValueOf.intValue();
                if (iIntValue2 <= 0) {
                    bagListViewModel.EQ2(c1126980fQu, false, false);
                    if (awS561S0100000_172 != null) {
                        awS561S0100000_172.invoke();
                    }
                    if (awS482S0200000_172 == null) {
                        return;
                    }
                    awS482S0200000_172.invoke(Boolean.FALSE, null, null);
                    return;
                }
                if (abstractC1126600fQI != null && (c1128940fU4 = (C1128940fU4) abstractC1126600fQI.LIZIZ) != null) {
                    c1128940fU4.LJIJ = 0;
                }
                bagListViewModel.vQ2(c1128940fU44, iIntValue2, j, j2, c1126980fQu, jElapsedRealtime, BQ2(), awS561S0100000_172, awS482S0200000_172);
                return;
            }
            bagListViewModel.vQ2(c1128940fU44, 1L, j, j2, c1126980fQu, jElapsedRealtime, null, awS561S0100000_172, awS482S0200000_172);
        }
    }

    public final void vQ2(final C1128940fU4 c1128940fU4, final long j, final long j2, long j3, final C1126980fQu c1126980fQu, final long j4, String str, final Function0<Unit> function0, final InterfaceC1631620sYq<? super Boolean, ? super BagItemConsumeResponse.Data, ? super Throwable, Unit> interfaceC1631620sYq) {
        final boolean z;
        int i = c1128940fU4.LJIIJ;
        if (i != 100 && i != 101 && i != 10) {
            z = true;
        } else {
            z = false;
        }
        C480460Ism.LIZ().getClass();
        C11NZ<BaseResponse<BagItemConsumeResponse.Data, SendItemErrorExtra>> c11nzSendItem = ((PackRetrofitApi) C480460Ism.LIZLLL(PackRetrofitApi.class)).sendItem(UserService.getInstance().user().getCurrentUserId(), c1128940fU4.LJIIJ, c1128940fU4.LJIIJJI, j, c1128940fU4.LIZLLL, j2, j3, str);
        if (c11nzSendItem != null) {
            final boolean z2 = z;
            c11nzSendItem.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0fU3
                @Override // X.C09JN
                public final void accept(Object obj) throws JSONException {
                    BagItemConsumeResponse.Data data;
                    long j5;
                    long j6;
                    Long lValueOf;
                    Map<Long, Long> mapLJJLJLI;
                    String str2;
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
                    C1128940fU4 c1128940fU42;
                    C1126980fQu c1126980fQu2;
                    long j7;
                    Long lValueOf2;
                    AbstractC1126600fQI<? extends AnonymousClass0054> next;
                    C1128940fU4 c1128940fU43;
                    C970820bN2 c970820bN2;
                    C978270bZ3 c978270bZ3;
                    long j8;
                    C974800bTS c974800bTS;
                    C1C7U.LIZ("BagListViewModel@cb9.callMatchCosumeAPI$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && (data = (BagItemConsumeResponse.Data) baseResponse.data) != null) {
                        if (z) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("match_item_type", ((C1128940fU4) c1126980fQu.LIZIZ).LIZ());
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("match_item_expiretime", ((C1128940fU4) c1126980fQu.LIZIZ).LIZLLL);
                            jSONObject2.put("cost", jElapsedRealtime - j4);
                            jSONObject2.put("log_id", baseResponse.LIZIZ);
                            C1128860fTw.LJIIIIZZ("match_item_send_succeed", jSONObject, jSONObject2, true, "native_panel");
                        }
                        long jLIZ = C158B.LIZ() - ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).er();
                        if (jLIZ > 1000000) {
                            DataChannel dataChannel = this.LL.LL;
                            if (dataChannel != null && (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) != null) {
                                j8 = c974800bTS.LIZ;
                            } else {
                                j8 = 0;
                            }
                            jLIZ = 1000 * (LiveInteractBattleDurationSetting.INSTANCE.getValue() - j8);
                        }
                        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
                        DataChannel dataChannel2 = this.LL.LL;
                        if (dataChannel2 != null && (c978270bZ3 = (C978270bZ3) dataChannel2.gg0(BattleLeftScoreChannel.class)) != null) {
                            j5 = c978270bZ3.LIZ;
                        } else {
                            j5 = 0;
                        }
                        DataChannel dataChannel3 = this.LL.LL;
                        if (dataChannel3 != null && (c970820bN2 = (C970820bN2) dataChannel3.gg0(BattleRivalsScoreUpdateChannel.class)) != null) {
                            j6 = c970820bN2.LIZ;
                        } else {
                            j6 = 0;
                        }
                        C1130340fWK c1130340fWKLIZ = C1135020fds.LIZ(j5, j6);
                        if (iLiveMatchService.xB0() == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                            InterfaceC973730bRj interfaceC973730bRjYf2 = iLiveMatchService.yf2(false);
                            if (interfaceC973730bRjYf2 != null) {
                                mapLJJLJLI = interfaceC973730bRjYf2.LJJLJLI();
                            } else {
                                mapLJJLJLI = null;
                            }
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(j5 - j6);
                            mapLJJLJLI = null;
                        }
                        C1126980fQu c1126980fQu3 = c1126980fQu;
                        Long lValueOf3 = Long.valueOf(data.battleId);
                        long j9 = data.count;
                        long j10 = c1130340fWKLIZ.LIZ;
                        long j11 = c1130340fWKLIZ.LIZIZ;
                        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_send_match_item");
                        c474500IjALIZ.LJIL();
                        C1128860fTw.LJ(c474500IjALIZ);
                        C1128860fTw.LIZLLL(c474500IjALIZ, c1126980fQu3);
                        C1128460fTI.LIZ(c474500IjALIZ, null);
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).L6()) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c474500IjALIZ.LJJII(str2, "is_enlarge_mode");
                        c474500IjALIZ.LJJII("1", "is_available");
                        c474500IjALIZ.LJJII(String.valueOf(j9), "match_item_cnts");
                        c474500IjALIZ.LJJII(String.valueOf(j5), "team_score_when_used");
                        c474500IjALIZ.LJJII(Long.valueOf(j10), "score_diff_with_highest_used");
                        c474500IjALIZ.LJJII(Long.valueOf(j11), "score_diff_with_lowest_used");
                        c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "time_diff_when_used");
                        C1128460fTI.LIZIZ(c474500IjALIZ);
                        if (lValueOf != null) {
                            lValueOf.longValue();
                            c474500IjALIZ.LJJII(lValueOf, "score_diff_when_used");
                        }
                        if (mapLJJLJLI != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            for (Map.Entry<Long, Long> entry : mapLJJLJLI.entrySet()) {
                                jSONObject3.put(String.valueOf(entry.getKey().longValue()), entry.getValue().longValue());
                            }
                            c474500IjALIZ.LJJII(C786410Ut5.J3(jSONObject3), "all_pair_anchor_score");
                        }
                        if (lValueOf3 != null && lValueOf3.longValue() > 0) {
                            c474500IjALIZ.LJJII(lValueOf3, "pk_id");
                        }
                        c474500IjALIZ.LIZ();
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        InterfaceC1631620sYq<Boolean, BagItemConsumeResponse.Data, Throwable, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        if (interfaceC1631620sYq2 != null) {
                            interfaceC1631620sYq2.invoke(Boolean.TRUE, data, null);
                        }
                        if (C500260Jjc.LJJLIIIJ(this.LL.LL) == j2) {
                            if (data.itemType == 101) {
                                long j12 = j;
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("vote_num", j12);
                                C389001fE.LIZ("live_revenue_moy_vote_success_event", jSONObject4, System.currentTimeMillis(), false);
                            }
                            this.LL.EQ2(c1126980fQu, false, false);
                            BagListViewModel bagListViewModel = this.LL;
                            List<AbstractC1126600fQI<? extends AnonymousClass0054>> value = bagListViewModel.LLILLJJLI.getValue();
                            LinkedList linkedList = new LinkedList();
                            List<AbstractC1126600fQI<? extends AnonymousClass0054>> value2 = bagListViewModel.LLILLJJLI.getValue();
                            if (value2 != null) {
                                Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = value2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = next;
                                        if ((abstractC1126600fQI2 instanceof C1126980fQu) && abstractC1126600fQI2 != null && (c1128940fU43 = (C1128940fU4) abstractC1126600fQI2.LIZIZ) != null && c1128940fU43.LJIIJJI == data.itemId) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                abstractC1126600fQI = next;
                            } else {
                                abstractC1126600fQI = null;
                            }
                            boolean z3 = abstractC1126600fQI instanceof C1126980fQu;
                            if (value != null) {
                                for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 : value) {
                                    if (!(abstractC1126600fQI3 instanceof C1126980fQu)) {
                                        linkedList.add(abstractC1126600fQI3);
                                    } else if (abstractC1126600fQI3 != null && (c1128940fU42 = (C1128940fU4) abstractC1126600fQI3.LIZIZ) != null) {
                                        if (c1128940fU42.LJIIJJI == data.itemId && c1128940fU42.LJIIJ == data.itemType && c1128940fU42.LJIIL == data.available) {
                                            long j13 = data.count;
                                            if (j13 == 0) {
                                                AbstractC1126600fQI<? extends AnonymousClass0054> value3 = bagListViewModel.LLILZ.getValue();
                                                if ((value3 instanceof C1126980fQu) && (c1126980fQu2 = (C1126980fQu) value3) != null && c1126980fQu2.LJJIIJZLJL((C1126980fQu) abstractC1126600fQI3)) {
                                                    bagListViewModel.LLILZIL.setValue(bagListViewModel.LLILZ.getValue());
                                                    bagListViewModel.LLILZ.setValue(null);
                                                }
                                            } else {
                                                c1128940fU42.LIZIZ = j13;
                                                BagItemPreUpdateInfo bagItemPreUpdateInfo = data.preUpdateInfo;
                                                if (bagItemPreUpdateInfo != null) {
                                                    j7 = bagItemPreUpdateInfo.count;
                                                } else {
                                                    j7 = j13 - 1;
                                                }
                                                c1128940fU42.LIZJ = Long.valueOf(j7);
                                                c1128940fU42.LIZLLL = data.minExpireAt;
                                                BagItemPreUpdateInfo bagItemPreUpdateInfo2 = data.preUpdateInfo;
                                                if (bagItemPreUpdateInfo2 != null) {
                                                    lValueOf2 = Long.valueOf(bagItemPreUpdateInfo2.minExpireAt);
                                                } else {
                                                    lValueOf2 = null;
                                                }
                                                c1128940fU42.LJ = lValueOf2;
                                                c1128940fU42.LJFF = BagListViewModel.xQ2(BagListViewModel.AQ2(C158B.LIZ(), Long.valueOf(data.minExpireAt)));
                                                c1128940fU42.LJIILJJIL = false;
                                                c1128940fU42.LJJ = true;
                                            }
                                        }
                                        C1126980fQu c1126980fQu4 = new C1126980fQu(c1128940fU42);
                                        c1126980fQu4.LIZJ = abstractC1126600fQI3.LIZJ;
                                        c1126980fQu4.LIZLLL = abstractC1126600fQI3.LIZLLL;
                                        linkedList.add(c1126980fQu4);
                                    }
                                }
                            }
                            if (linkedList.isEmpty()) {
                                bagListViewModel.LLJ.setValue(EnumC1129500fUy.EMPTY);
                            }
                            bagListViewModel.LLILLJJLI.setValue(linkedList);
                        }
                    } else {
                        InterfaceC1631620sYq<Boolean, BagItemConsumeResponse.Data, Throwable, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq;
                        boolean z4 = z;
                        C1126980fQu c1126980fQu5 = c1126980fQu;
                        long j14 = j4;
                        Throwable th = new Throwable("response_data_null");
                        if (interfaceC1631620sYq3 != null) {
                            interfaceC1631620sYq3.invoke(Boolean.FALSE, null, th);
                        }
                        if (z4 && LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("match_item_type", ((C1128940fU4) c1126980fQu5.LIZIZ).LIZ());
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("match_item_expiretime", ((C1128940fU4) c1126980fQu5.LIZIZ).LIZLLL);
                            jSONObject6.put("cost", jElapsedRealtime2 - j14);
                            C1128860fTw.LIZ(th, jSONObject6);
                            C1128860fTw.LJIIIIZZ("match_item_send_failed", jSONObject5, jSONObject6, true, "native_panel");
                        }
                    }
                    C1C7U.LIZIZ("BagListViewModel@cb9.callMatchCosumeAPI$1");
                }
            }, new C09JN() { // from class: X.0fTz
                /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r21) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 275
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1128890fTz.accept(java.lang.Object):void");
                }
            });
        }
    }
}
