package com.ss.android.ugc.aweme.im.streak.impl;

import X.AbstractC1538690q8x;
import X.AbstractC1549150qPp;
import X.AbstractC1711506n3;
import X.AnonymousClass0663;
import X.AnonymousClass0668;
import X.C01GW;
import X.C06C6;
import X.C06DG;
import X.C06DK;
import X.C06DM;
import X.C06DN;
import X.C06DO;
import X.C06E4;
import X.C06ET;
import X.C06EU;
import X.C06F2;
import X.C06F4;
import X.C06F5;
import X.C06F6;
import X.C06FA;
import X.C06FD;
import X.C06FE;
import X.C06FF;
import X.C06FH;
import X.C06FI;
import X.C06FL;
import X.C06FM;
import X.C06FO;
import X.C06FS;
import X.C06FT;
import X.C06FV;
import X.C06FW;
import X.C06FX;
import X.C06FZ;
import X.C06G9;
import X.C06GI;
import X.C06GU;
import X.C06GX;
import X.C06GZ;
import X.C06H2;
import X.C06H4;
import X.C06IE;
import X.C06K1;
import X.C06K2;
import X.C06LY;
import X.C094W;
import X.C0I0B;
import X.C0OBZ;
import X.C0PEM;
import X.C0Y3I;
import X.C0Y7P;
import X.C0YA1;
import X.C0YA6;
import X.C0YC9;
import X.C0YNP;
import X.C0YNY;
import X.C0ZDX;
import X.C1091404Oq;
import X.C1205104nZ;
import X.C1208304o5;
import X.C13LP;
import X.C13LQ;
import X.C13SZ;
import X.C1400340mXo;
import X.C1494305t7;
import X.C1500705u9;
import X.C1537900q7g;
import X.C1541950qED;
import X.C15438062q;
import X.C15525065z;
import X.C15580068c;
import X.C1565506Az;
import X.C1566306Bh;
import X.C1566606Bk;
import X.C1567306Br;
import X.C1567406Bs;
import X.C1567706Bv;
import X.C1567806Bw;
import X.C1571306Df;
import X.C1572506Dr;
import X.C1572806Du;
import X.C1575806Ey;
import X.C1575906Ez;
import X.C1576206Fc;
import X.C1576506Ff;
import X.C1576706Fh;
import X.C1577706Fr;
import X.C1577806Fs;
import X.C1582206Hk;
import X.C1582806Hq;
import X.C1583706Hz;
import X.C1587706Jn;
import X.C1590906Kt;
import X.C1598406Nq;
import X.C1664306fR;
import X.C1697810uHb;
import X.C1728606po;
import X.C1770206wW;
import X.C1807670x8n;
import X.C1DW6;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C332801Qw;
import X.C354710DvR;
import X.C374701cv;
import X.C374901cx;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C876310YZh;
import X.C876340YZk;
import X.C879390Yef;
import X.C894660Z7w;
import X.EnumC1578206Fw;
import X.EnumC1578706Gb;
import X.EnumC1579606Gk;
import X.EnumC872590YKz;
import X.InterfaceC1493505sz;
import X.InterfaceC1564806As;
import X.InterfaceC1890940zJ6;
import X.InterfaceC874680YTa;
import X.ViewOnClickListenerC1576306Fd;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.utils.DefaultConditionStrategy;
import com.ss.android.ugc.aweme.im.message.content.utils.DismissConditionStrategyFactory;
import com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.setting.IMSettingBridgeApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS32S1101000_2;
import kotlin.jvm.internal.AwS492S0200000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import wh6.AbS359S0000000_2;
import wh6.AbS496S0200000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakService implements IStreakService, C1DW6 {
    public volatile boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1091404Oq());

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void LIZ() {
        this.LL = false;
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        c1575806Ey.getClass();
        C06F5.LIZ.getClass();
        C06F2 c06f2 = C06F4.LIZIZ.LJII;
        synchronized (c06f2) {
            c06f2.LIZ.evictAll();
        }
        C1575806Ey.LJ.LIZIZ();
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(c1575806Ey);
        C06C6.LIZIZ.getClass();
        C06C6.LJ.LIZ();
        C06C6.LJFF.LIZ();
        C1572506Dr.LIZ().LIZ();
        StreakLynxDataUtils.LIZ.getClass();
        StreakLynxDataUtils.LIZ();
        if (C06GX.LIZ()) {
            C1664306fR.LIZ.LIZ();
            C06GU.LIZ.LIZLLL();
            C1566606Bk.LIZ.LIZIZ();
            ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZLLL(this);
        }
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
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
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

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void M() {
        C1590906Kt.LIZ("StreakResProviderFactory, prepareLazyResource");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06FH(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean W() {
        Integer numValueOf;
        if (!C1205104nZ.LIZIZ) {
            return false;
        }
        IMSettingBridgeApi.LIZ.getClass();
        IMSettingBridgeApi value = C06FT.LIZIZ.getValue();
        return (value == null || (numValueOf = Integer.valueOf(value.LIZIZ())) == null || numValueOf.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Map<String, InterfaceC1890940zJ6> Y() {
        AtomicBoolean atomicBoolean = C15525065z.LIZ;
        return C2097908Jt.LIZJ(new Pair("streak_pet_invite_banner", C15525065z.LIZIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Pair<String, Map<String, String>> Z() {
        AtomicBoolean atomicBoolean = C15525065z.LIZ;
        C1567406Bs c1567406Bs = C1567406Bs.LLILLJJLI;
        long jLIZIZ = C1567406Bs.LIZIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("local_max_streak_end_time", String.valueOf(jLIZIZ));
        linkedHashMap.put("local_time", String.valueOf(C1567806Bw.LJI()));
        if (C15525065z.LIZ.getAndSet(false)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass0668(jLIZIZ, null), 3);
        }
        return new Pair<>("streak_pet_invite_banner", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final String a0() throws Throwable {
        C1583706Hz.LIZIZ.getClass();
        Pair pairLJIIJJI = C1583706Hz.LJIIJJI();
        if (((Number) pairLJIIJJI.getFirst()).intValue() == 1) {
            C1590906Kt.LIZIZ("StreakSharePanelResProvider, streakSharePanelEggAnimationRes first get is empty");
            C23250099c.LJ(C23271099x.INSTANCE, new AnonymousClass0663(null));
            pairLJIIJJI = C1583706Hz.LJIIJJI();
        } else {
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakSharePanelResProvider,get res success streakSharePanelEggAnimationRes = ");
            sbLIZ.append(pairLJIIJJI);
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return (String) pairLJIIJJI.getSecond();
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Class<? extends AbstractC1549150qPp<?, ?>> c0() {
        return (Class) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void y() {
        DismissConditionStrategyFactory dismissConditionStrategyFactory = DismissConditionStrategyFactory.INSTANCE;
        dismissConditionStrategyFactory.addStrategy("streak_status", new DefaultConditionStrategy() { // from class: X.06Gn
            {
                AFwS285S0000000_2.get$arr$(24);
            }
        });
        dismissConditionStrategyFactory.addStrategy("streak_pet_status", new DefaultConditionStrategy() { // from class: X.06Gm
            {
                AFwS285S0000000_2.get$arr$(23);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final String A() {
        List listLJLJJLL;
        C1576206Fc c1576206FcLIZ = C1572506Dr.LIZ();
        synchronized (c1576206FcLIZ.LIZJ) {
            try {
                LinkedList<C06GI> linkedList = c1576206FcLIZ.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (C06GI c06gi : linkedList) {
                    if (c1576206FcLIZ.LIZ.LIZJ(c06gi.LIZJ)) {
                        arrayList.add(c06gi);
                    }
                }
                listLJLJJLL = C13LP.LJLJJLL(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLJJLL, 10));
        Iterator it2 = listLJLJJLL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c1576206FcLIZ.LIZJ((C06GI) it2.next()));
        }
        return c1576206FcLIZ.LIZLLL(arrayList2);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void c() {
        if (C06GX.LIZ() && !this.LL) {
            this.LL = true;
            C1590906Kt.LIZ("StreakService initWhenLogin");
            C06FZ.LIZ.getClass();
            C06F5.LIZ.getClass();
            StreakServerDataSource streakServerDataSource = C06F4.LIZIZ.LJFF;
            streakServerDataSource.getClass();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dm_repo_streak_");
                sbLIZ.append(curUserId);
                if (!Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getBoolean("is_streak_data_fetched", false)) {
                    streakServerDataSource.LIZIZ.set(true);
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1577806Fs(streakServerDataSource, null), 3);
                }
            }
            C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
            c1575806Ey.getClass();
            C15580068c.LIZ.getClass();
            C15580068c.LIZ(c1575806Ey);
            C1590906Kt.LIZ("StreakResProviderFactory, init");
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06FI(null), 3);
            IMChatListBridgeApi.LIZ.getClass();
            IMChatListBridgeApi value = C1566306Bh.LIZIZ.getValue();
            if (value != null) {
                value.LIZLLL();
            }
            C1582206Hk.LIZ.getClass();
            IMSettingBridgeApi.LIZ.getClass();
            IMSettingBridgeApi value2 = C06FT.LIZIZ.getValue();
            if (value2 != null) {
                value2.LIZ(new C1567706Bv());
            }
            C1572806Du.LL.init();
            C1567406Bs.LLILLJJLI.getClass();
            C23250099c.LIZLLL(C1567406Bs.LLILZ, null, null, new C1567306Br(null), 3);
            C06FF c06ff = C06FF.LL;
            c06ff.getClass();
            IStreakService.LJJIIZ.getClass();
            C06LY.LIZ().x(c06ff);
            ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean D(String str) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        List listSingletonList = Collections.singletonList(EnumC1579606Gk.SECONDARY_ACTIVE);
        if (streakDataLJIIIIZZ != null) {
            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false);
        } else {
            enumC1579606GkLJIIIIZZ = null;
        }
        return C13LP.LJJJJ(enumC1579606GkLJIIIIZZ, listSingletonList);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean E(String str) {
        boolean z;
        C06C6.LIZIZ.getClass();
        StreakPetData streakPetDataLIZ = C06C6.LIZ(str);
        if (streakPetDataLIZ != null) {
            if (C1571306Df.LJI(streakPetDataLIZ)) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if ((streakPetDataLIZ != null && C1571306Df.LJ(streakPetDataLIZ)) || !z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean G(String str) {
        return C06DO.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Map<Integer, StreakInlineMsgInfo> I(String str) {
        if (!C06GX.LIZ()) {
            return null;
        }
        C1565506Az.LIZ.getClass();
        return C1565506Az.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void J(C06F6 c06f6) {
        C1575806Ey.LIZJ.getClass();
        WeakHashMap<C06F6, Object> weakHashMap = C1575806Ey.LJFF;
        synchronized (weakHashMap) {
            try {
                weakHashMap.remove(c06f6);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void L(String str) {
        C1500705u9 c1500705u9 = C1500705u9.LIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1500705u9.getClass();
        C23250099c.LIZLLL(C1500705u9.LIZLLL, null, null, new C1494305t7(interfaceC1493505szLIZIZ, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final String O(int i) {
        if (i == AbstractC1711506n3.LIZ) {
            C0I0B.LJFF.LIZJ();
            return C894660Z7w.LIZ().getString(2131832128);
        }
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131831523);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void Q(String str) {
        C1566606Bk.LIZ.LLLJIL(str);
        C1572806Du.LL.LLLJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean R(C869590Y9l c869590Y9l) {
        C1565506Az.LIZ.getClass();
        String scene = c869590Y9l.getScene();
        if (c869590Y9l.getMsgType() != 1 || scene == null || !u.LJJIIJZLJL(scene, "streak_", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Integer S(String str) {
        StreakData streakDataR;
        List listLJIIJJI;
        Integer numValueOf = null;
        if (!((Boolean) C06FW.LIZ.getValue()).booleanValue()) {
            return null;
        }
        IStreakService iStreakService = (IStreakService) PluggableExtentionKt.pluggableSpiForReal(IStreakService.class);
        if (iStreakService != null && (streakDataR = iStreakService.r(str, false)) != null) {
            long j = streakDataR.activeBefore;
            long j2 = streakDataR.endAt;
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j4 = j * j3;
            int iLIZ = C879390Yef.LIZ(str);
            if (iLIZ == AbstractC1711506n3.LIZ) {
                listLJIIJJI = C1697810uHb.LJIIJJI(1, 15);
            } else if (iLIZ == AbstractC1711506n3.LIZIZ) {
                listLJIIJJI = C1697810uHb.LJIIJJI(1, 15, 1031);
            } else {
                listLJIIJJI = null;
            }
            List listLJIIJ = interfaceC874680YTaLIZ.LJIIJ(str, j4, listLJIIJJI, 1, j3 * j2, 50000);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJIIJ) {
                C869590Y9l c869590Y9l = (C869590Y9l) obj;
                if (C0ZDX.LJJJJIZL(c869590Y9l) && c869590Y9l.getMsgStatus() == 2) {
                    arrayList.add(obj);
                }
            }
            C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLL(arrayList);
            if (c869590Y9l2 != null) {
                numValueOf = Integer.valueOf(c869590Y9l2.getMsgType());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("query messageList size=");
            sbLIZ.append(arrayList.size());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return numValueOf;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void U(Function0 function0) {
        StreakLynxDataUtils.LIZ.getClass();
        synchronized (StreakLynxDataUtils.LIZIZ) {
            try {
                ConcurrentHashMap<String, Function0<Pair<String, Object>>> concurrentHashMap = StreakLynxDataUtils.LIZJ;
                if (concurrentHashMap.containsKey("sticker_info")) {
                    return;
                }
                concurrentHashMap.put("sticker_info", function0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void X(Function0 function0) {
        C1576206Fc c1576206FcLIZ = C1572506Dr.LIZ();
        synchronized (c1576206FcLIZ.LIZJ) {
            try {
                if (c1576206FcLIZ.LJFF.containsKey("sticker_info")) {
                    return;
                }
                c1576206FcLIZ.LJFF.put("sticker_info", function0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void b0(String str) {
        if (!C06GX.LIZ()) {
            return;
        }
        C1565506Az.LIZ.getClass();
        StreakLocalExtHelper.LIZ.getClass();
        StreakLocalExtHelper.LIZ(new AwS32S1101000_2(str, 1, (StreakInlineMsgInfo) null, 1));
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void d(BusinessCommandMessage businessCommandMessage) {
        C06F5.LIZ.getClass();
        C1575906Ez c1575906Ez = C06F4.LIZIZ;
        C1770206wW c1770206wW = new C1770206wW(businessCommandMessage, 3);
        StreakServerDataSource streakServerDataSource = c1575906Ez.LJFF;
        Object obj = c1575906Ez.LJIIIIZZ;
        streakServerDataSource.getClass();
        if (!C06FS.LIZ().enableDMStreak) {
            C1590906Kt.LIZ("StreakDataSource: onReceiveCmdMsg: streak is disable");
            StreakServerDataSource.LJII(c1770206wW, null, null, false, 0, businessCommandMessage);
        } else if (streakServerDataSource.LIZIZ.get()) {
            C1590906Kt.LIZ("StreakDataSource: onReceiveCmdMsg: needPullStreakData");
            StreakServerDataSource.LJII(c1770206wW, null, null, false, 1, businessCommandMessage);
        } else if (businessCommandMessage.getContentPb() == null) {
            C1590906Kt.LIZIZ("StreakDataSource: onReceiveCmdMsg: msg.contentPb == null");
            StreakServerDataSource.LJII(c1770206wW, null, null, false, 2, businessCommandMessage);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1577706Fr(businessCommandMessage, obj, c1770206wW, streakServerDataSource, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final int f(String str) {
        StreakData streakDataR = r(str, true);
        if (streakDataR != null) {
            return C1567806Bw.LJII(streakDataR);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void j(C06H2 c06h2) {
        C06FF.LL.getClass();
        Map<String, Set<String>> map = C06FF.LLILLJJLI;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c06h2.getValue());
                sbLIZ.append("_1");
                map.remove(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C06FF.LIZ(c06h2);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean k(EnumC1578206Fw enumC1578206Fw) {
        if (!C06GX.LIZ() || !C06FS.LIZ().enableStreakBtn || enumC1578206Fw == EnumC1578206Fw.CHAT_LIST) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean m(C869590Y9l c869590Y9l) {
        String scene = c869590Y9l.getScene();
        if (c869590Y9l.getMsgType() == 1) {
            if (Intrinsics.LJFF(scene, "streak_restore") || Intrinsics.LJFF(scene, "streak_restore_pet") || Intrinsics.LJFF(scene, "streak_group_end_with_restore") || Intrinsics.LJFF(scene, "streak_end_with_restore") || Intrinsics.LJFF(scene, "streak_end_with_restore_with_pet")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final EnumC1579606Gk o(StreakData streakData) {
        return C1567806Bw.LJIIIIZZ(streakData, false);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void u(String str) {
        C06FX c06fx = C06FX.LIZ;
        if (C06FX.LIZIZ) {
            C1590906Kt.LIZ("StreakSparkUtil plugin already registered, skip.");
        } else {
            synchronized (c06fx) {
                try {
                    if (C06FX.LIZIZ) {
                        C1590906Kt.LIZ("StreakSparkUtil plugin already registered, skip.");
                    } else {
                        C1590906Kt.LIZ("StreakSparkUtil register StreakSparkContextInjectPlugin");
                        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                        AbstractC1538690q8x abstractC1538690q8x = new AbstractC1538690q8x() { // from class: X.06FY
                            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
                            public volatile C1598406Nq LIZIZ;

                            static {
                                C2217381BqS c2217381BqS = new C2217381BqS(C06FY.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
                                C13LE.LIZ.getClass();
                                LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
                            }

                            @Override // X.AbstractC1538690q8x
                            public final String LJI() {
                                return "chatPageDynamicContext";
                            }

                            {
                                C1598406Nq c1598406Nq = this.LIZIZ;
                                if (c1598406Nq == null) {
                                    synchronized (this) {
                                        c1598406Nq = this.LIZIZ;
                                        if (c1598406Nq == null) {
                                            c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                                            this.LIZIZ = c1598406Nq;
                                        }
                                    }
                                }
                                C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
                            }

                            @Override // X.AbstractC1538690q8x
                            public final void LJ(SparkContext sparkContext, String str2) throws Throwable {
                                Object c098200Yq;
                                Object c098200Yq2;
                                super.LJ(sparkContext, str2);
                                Uri uri = UriProtector.parse(sparkContext.LJIJI());
                                try {
                                    c098200Yq = a0.LJJLIIIJILLIZJL(String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "dynamic_context_handler")), new String[]{","}, 0, 6);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                List list = (List) c098200Yq;
                                if (list == null) {
                                    return;
                                }
                                try {
                                    c098200Yq2 = String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conversation_id"));
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq2 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                    c098200Yq2 = null;
                                }
                                String str3 = (String) c098200Yq2;
                                if (str3 == null) {
                                    return;
                                }
                                boolean z = C1590806Ks.LIZ;
                                C1590806Ks.LIZ("StreakSparkContextInjectPlugin conversation_id = " + str3 + ", contextParam = " + list);
                                if (str3.length() == 0) {
                                    C1590806Ks.LIZ("StreakSparkContextInjectPlugin conversation_id is null");
                                }
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                C23250099c.LJ(C23271099x.INSTANCE, new C372501cZ(str3, list, null, jSONObject2));
                                jSONObject.put("dynamic_context", jSONObject2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("StreakSparkContextInjectPlugin with initData = ");
                                sbLIZ.append((Object) C786410Ut5.J3(jSONObject).subSequence(0, 10));
                                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                                sparkContext.initData = C786410Ut5.J3(jSONObject);
                            }
                        };
                        c1537900q7g.getClass();
                        C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
                        C06FX.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1566606Bk.LIZ.g(str);
        C1572806Du.LL.g(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String v(java.lang.String r5) {
        /*
            r4 = this;
            X.06Fc r3 = X.C1572506Dr.LIZ()
            r3.getClass()
            X.06Ey r0 = X.C1575806Ey.LIZJ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r2 = X.C1575806Ey.LJIIIIZZ(r5)
            if (r2 == 0) goto L2b
            X.06GI r1 = new X.06GI
            X.0I8r r0 = r3.LIZ
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L1e
            java.lang.String r0 = ""
        L1e:
            r1.<init>(r2, r5, r0)
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakFeedbackUserUploadInfo r0 = r3.LIZJ(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            if (r0 != 0) goto L2d
        L2b:
            X.13BV r0 = X.C13BV.INSTANCE
        L2d:
            java.lang.String r0 = r3.LIZLLL(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.StreakService.v(java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void x(C06F6 c06f6) {
        C1575806Ey.LIZJ.getClass();
        C1575806Ey.LIZ(c06f6);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Object B(String str, SystemContent.Key key) {
        int iLJII;
        C06K2 c06k2;
        String str2;
        int iIntValue;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        C1565506Az.LIZ.getClass();
        int iIntValue2 = 0;
        if (key.getAction() == 26) {
            InterfaceC1564806As.LIZIZ.getClass();
            C1575806Ey.LIZJ.getClass();
            StreakData streakDataLJII = C1575806Ey.LJII(str);
            if (streakDataLJII != null) {
                iLJII = C1567806Bw.LJII(streakDataLJII);
            } else {
                iLJII = 0;
            }
        } else {
            iLJII = 0;
        }
        Map<String, String> extra = key.getExtra();
        if (extra != null && (str2 = extra.get("streak_badge_style")) != null) {
            for (EnumC1578706Gb enumC1578706Gb : EnumC1578706Gb.values()) {
                if (Intrinsics.LJFF(enumC1578706Gb.getValue(), str2)) {
                    String str3 = extra.get("streak_badge_streak_num");
                    if (str3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                        iIntValue = numLJIIJJI2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str4 = extra.get("streak_badge_streak_level");
                    if (str4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                        iIntValue2 = numLJIIJJI.intValue();
                    }
                    c06k2 = new C06K2(enumC1578706Gb, iIntValue, iIntValue2, Intrinsics.LJFF(extra.get("streak_badge_num_visible"), "1"), C06IE.NORMAL);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        c06k2 = new C06K2(EnumC1578706Gb.ORANGE, 0, iLJII, false, C06IE.NORMAL);
        return C06K1.LIZ(c06k2);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final int C(String str, boolean z) {
        StreakData streakDataR = r(str, z);
        if (streakDataR != null) {
            return streakDataR.streak;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean P(String str, boolean z) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        StreakData streakDataR = r(str, z);
        List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1579606Gk.ACTIVE, EnumC1579606Gk.SECONDARY_ACTIVE);
        if (streakDataR != null) {
            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakDataR, false);
        } else {
            enumC1579606GkLJIIIIZZ = null;
        }
        return C13LP.LJJJJ(enumC1579606GkLJIIIIZZ, listLJIIJJI);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1520305xJ b(X.C0Y8T r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.StreakService.b(X.0Y8T, java.lang.String):X.05xJ");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final int d0(long j, String str) {
        C06FO.LIZ.getClass();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
        calendar.setTimeInMillis(j);
        return calendar.get(6);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final C354710DvR g(int i, String str) {
        C06FO c06fo = C06FO.LIZ;
        C06FM c06fm = C06FM.LL;
        c06fo.getClass();
        return C06FO.LIZJ(str, i, c06fm);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean h(String str, Map<String, String> map) {
        String str2;
        if (map != null && (str2 = map.get("panel_type")) != null && Intrinsics.LJFF(C06EU.LIZ(str2), C06ET.LIZIZ)) {
            return C06DO.LIZJ(str, map);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final boolean i(int i, String str) {
        C06FL.LIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_milestone_story_");
        sbLIZ.append(str);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getBoolean(String.valueOf(i), false);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void l(Map map, AwS492S0200000_31 awS492S0200000_31) {
        C06F5.LIZ.getClass();
        C1575906Ez c1575906Ez = C06F4.LIZIZ;
        AwS651S0100000_2 awS651S0100000_2 = new AwS651S0100000_2(awS492S0200000_31, 5);
        C06FA c06fa = c1575906Ez.LJ;
        Object obj = c1575906Ez.LJIIIIZZ;
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(c1575906Ez, 665);
        c06fa.getClass();
        if (!C06FS.LIZ().enableDMStreak) {
            C1590906Kt.LIZ("StreakFakeDataSource: onReceiveFakeMsg: streak is disable");
            C06FA.LJII(awS651S0100000_2, null, false, 0);
        } else if (!C1208304o5.LIZIZ) {
            C1590906Kt.LIZ("StreakFakeDataSource: onReceiveFakeMsg: fake writing is disable");
            C06FA.LJII(awS651S0100000_2, null, false, 1);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06FD(map, c06fa, obj, awS651S0100000_2, awS581S0100000_2, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void q(String str, Function1 function1) {
        C06F5.LIZ.getClass();
        C06F4.LIZIZ.LIZIZ(str, "feedback", function1);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final StreakData r(String str, boolean z) {
        if (!C06GX.LIZ()) {
            return null;
        }
        if (z) {
            InterfaceC1564806As.LIZIZ.getClass();
            C1575806Ey.LIZJ.getClass();
            return C1575806Ey.LJII(str);
        }
        InterfaceC1564806As.LIZIZ.getClass();
        C1575806Ey.LIZJ.getClass();
        return C1575806Ey.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void s(int i, String str) {
        C06FL c06fl = C06FL.LIZIZ;
        C1598406Nq c1598406Nq = c06fl.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06fl) {
                c1598406Nq = c06fl.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06fl.LIZ = c1598406Nq;
                }
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(c1598406Nq.LIZ), null, null, new C332801Qw(i, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void H(String str, String str2, String str3) {
        C1500705u9.LIZJ(C1500705u9.LIZIZ, str, str2, str3, 8);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        String conversationId;
        if (c869590Y9l == null || (conversationId = c869590Y9l.getConversationId()) == null || c869590Y9l.getMsgStatus() != 1) {
            return;
        }
        String str = c869590Y9l.getLocalExt().get("s:log_id");
        if (str == null) {
            str = "";
        }
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakService: onSendMessage: logId=");
        sbLIZ.append(str);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            iIMDebugService.LJIIIIZZ();
        }
        b0(conversationId);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(java.lang.Integer r18, java.lang.String r19, X.InterfaceC1364105Vn r20) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.StreakService.T(java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final ViewOnClickListenerC1576306Fd V(Context context, EnumC1578206Fw enumC1578206Fw, Function1 function1) {
        if (!C06FS.LIZ().enableDMStreak) {
            return null;
        }
        C01GW c01gw = C06GX.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2 && C13LQ.LJJIJIIJI(enumC1578206Fw, new EnumC1578206Fw[]{EnumC1578206Fw.DM_IN_APP_PUSH, EnumC1578206Fw.NOTICE_IN_APP_PUSH}) >= 0) {
            return null;
        }
        C1590906Kt.LIZ("StreakResProviderFactory, beforeCreateStreakHandler");
        C06GU.LIZLLL.LIZ.LIZIZ();
        C06GZ c06gz = C06GU.LIZLLL.LIZIZ;
        if (c06gz != null) {
            c06gz.LIZIZ();
        }
        return new ViewOnClickListenerC1576306Fd(context, enumC1578206Fw, function1);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        String strLJJLIIIJ;
        C06E4.LIZ.getClass();
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPSPGlobalStream onGetMessage message_list=");
        String strLJJLIIIJ2 = null;
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS229S0000000_2.get$arr$(824), 31);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(", msgSource=");
        sbLIZ.append(i);
        sbLIZ.append(", stack=");
        sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C869590Y9l c869590Y9l : list) {
                String conversationId = c869590Y9l.getConversationId();
                Object arrayList = linkedHashMap.get(conversationId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(conversationId, arrayList);
                }
                ((List) arrayList).add(c869590Y9l);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_psp_on_get_message", new C0OBZ((String) entry.getKey(), i, (List) entry.getValue()), (ExecutorService) null);
            }
        }
        C1566606Bk.LIZ.d5(list, i, c0y7p);
        boolean z2 = C1590906Kt.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("StreakService onGetMessage message_list=");
        if (list != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS229S0000000_2.get$arr$(326), 31);
        }
        sbLIZ2.append(strLJJLIIIJ2);
        sbLIZ2.append(", msgSource=");
        sbLIZ2.append(i);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Map t(String str, boolean z, List list) {
        Map mapLJIIZILJ;
        C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
        long j = C06FV.LIZ().featureRequestTimeOut;
        c1582806Hq.getClass();
        String strLJ = C1582806Hq.LJ(str, z);
        if (list == null) {
            return C2097608Jq.LJ();
        }
        try {
            return (Map) C23250099c.LJ(C23271099x.INSTANCE, new C374701cv(j, strLJ, list, null));
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            boolean z2 = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakSharerFilterManager, getConversationFeatureResultSyncWithTimeout timeout for ");
            sbLIZ.append(strLJ);
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            ConcurrentHashMap<String, Integer> concurrentHashMap = C1582806Hq.LLILZIL.get(strLJ);
            if (concurrentHashMap != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(concurrentHashMap)) != null) {
                return mapLJIIZILJ;
            }
            return C2097608Jq.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final Map z(String str, boolean z, List list) {
        ArrayList arrayList;
        Map mapLJ;
        C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
        long j = C06FV.LIZ().featureRequestTimeOut;
        c1582806Hq.getClass();
        String strLJ = C1582806Hq.LJ(str, z);
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                if (lLJIILIIL != null) {
                    arrayList.add(lLJIILIIL);
                }
            }
        } else {
            arrayList = null;
        }
        try {
            mapLJ = (Map) C23250099c.LJ(C23271099x.INSTANCE, new C374901cx(j, str, z, arrayList, strLJ, null));
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            boolean z2 = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakSharerFilterManager, getFeatureResultSyncWithTimeout timeout for ");
            sbLIZ.append(strLJ);
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            ConcurrentHashMap<Long, Integer> concurrentHashMap = C1582806Hq.LLILZ.get(strLJ);
            if (concurrentHashMap == null || (mapLJ = C2097608Jq.LJIIZILJ(concurrentHashMap)) == null) {
                mapLJ = C2097608Jq.LJ();
            }
        }
        if (mapLJ.isEmpty()) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList2 = new ArrayList(mapLJ.size());
        for (Map.Entry entry : mapLJ.entrySet()) {
            arrayList2.add(new Pair(String.valueOf(((Number) entry.getKey()).longValue()), entry.getValue()));
        }
        return C2097608Jq.LJIILLIIL(arrayList2);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void F(int i, int i2, String str, boolean z) {
        String str2;
        String str3;
        if (!C06GX.LIZ()) {
            return;
        }
        StreakLocalExtHelper.LIZ.getClass();
        StreakLocalExtHelper.LIZ(new AwS87S1000000_2(str, 3));
        C06FF c06ff = C06FF.LL;
        C0I0B.LJFF.LIZIZ();
        c06ff.getClass();
        int iLIZIZ = C1567806Bw.LIZIZ(str);
        int i3 = AbstractC1711506n3.LIZIZ;
        if (iLIZIZ == i3) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(C06FE.CONVERSATION_ID.getValue(), str);
        pairArr[1] = new Pair(C06FE.CONVERSATION_TYPE.getValue(), String.valueOf(iLIZIZ));
        pairArr[2] = new Pair(C06FE.LEVEL.getValue(), String.valueOf(i));
        String value = C06FE.IS_STORY.getValue();
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair(value, str3);
        pairArr[4] = new Pair(C06FE.ENTER_FROM.getValue(), C06H2.CHAT.getValue());
        pairArr[5] = new Pair(C06FE.STREAK_COUNT.getValue(), String.valueOf(i2));
        pairArr[6] = new Pair(C06FE.CHAT_TYPE.getValue(), str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (iLIZIZ == i3) {
            mapLJIIJ.put(C06FE.FROM_USER_ID.getValue(), String.valueOf(C0YNP.LJII(str)));
        }
        C20684815ws.LJIILLIIL("unlock_streak_animation", mapLJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService, X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        C06E4.LIZ.getClass();
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String conversationId = ((C869590Y9l) obj).getConversationId();
                Object arrayList = linkedHashMap.get(conversationId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(conversationId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_receive_on_query_event", new C0OBZ((String) entry.getKey(), 0, (List) entry.getValue()), (ExecutorService) null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void e(String str, String str2, C06H2 c06h2, String str3) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        if (C06DK.LIZIZ(c06h2, 1, C2188811AlT.LIZIZ(sbLIZ))) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06DN(str, str3, c06h2, interfaceC1493505szLIZIZ, null), 3);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, final int i) {
        String strLJJLIIIJ;
        C06E4.LIZ.getClass();
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPSPGlobalStream onUpdateMessage message_list=");
        String strLJJLIIIJ2 = null;
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS229S0000000_2.get$arr$(825), 31);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(", msgSource=");
        sbLIZ.append(i);
        sbLIZ.append(", stack=");
        sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C869590Y9l c869590Y9l : list) {
                String conversationId = c869590Y9l.getConversationId();
                Object arrayList = linkedHashMap.get(conversationId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(conversationId, arrayList);
                }
                ((List) arrayList).add(c869590Y9l);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                final String str = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (((C869590Y9l) obj).getMsgId() != 0) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    String strValueOf = String.valueOf(((C869590Y9l) obj2).getSender());
                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    if (Intrinsics.LJFF(strValueOf, curUserId)) {
                        arrayList3.add(obj2);
                    }
                }
                final ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    C869590Y9l c869590Y9l2 = (C869590Y9l) obj3;
                    if (C06E4.LIZIZ.put(String.valueOf(c869590Y9l2.getMsgId()), String.valueOf(c869590Y9l2.getMsgId())) == null) {
                        arrayList4.add(obj3);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_psp_on_update_message", new ITTMParamData(str, i, arrayList4) { // from class: X.0OBa
                        public final String LIZIZ;
                        public final int LIZJ;
                        public final List<C869590Y9l> LIZLLL;

                        @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                        public final Object getInputData() {
                            return this;
                        }

                        @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                        public final int getType() {
                            return 2;
                        }

                        @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                        public final ITTMParamData getObjectItem(String str2) {
                            if (Intrinsics.LJFF(str2, "message_list")) {
                                return new C595890NYt(this.LIZLLL);
                            }
                            return new TTMParamData("").getActualParamData();
                        }

                        @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                        public final long getIntValue(String str2, int i2) {
                            if (Intrinsics.LJFF(str2, "source")) {
                                return this.LIZJ;
                            }
                            return 0L;
                        }

                        @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                        public final String getStringValue(String str2, int i2) {
                            if (Intrinsics.LJFF(str2, "conversation_id")) {
                                return this.LIZIZ;
                            }
                            return "";
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZIZ = str;
                            this.LIZJ = i;
                            this.LIZLLL = arrayList4;
                        }
                    }, (ExecutorService) null);
                }
            }
        }
        boolean z2 = C1590906Kt.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("StreakService onUpdateMessage message_list=");
        if (list != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS229S0000000_2.get$arr$(327), 31);
        }
        sbLIZ2.append(strLJJLIIIJ2);
        sbLIZ2.append(", msgSource=");
        sbLIZ2.append(i);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void w(String str, String str2, C06H2 c06h2, String str3) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        if (C06DK.LIZIZ(c06h2, 2, C2188811AlT.LIZIZ(sbLIZ))) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06DM(str, str3, c06h2, interfaceC1493505szLIZIZ, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void n(String str, int i, String str2, C06H2 c06h2, String str3, C869590Y9l c869590Y9l) {
        C06FF c06ff = C06FF.LL;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c06ff.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        if (C06FF.LJ(c06h2, 1, C2188811AlT.LIZIZ(sbLIZ))) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06DG(c869590Y9l, str, str3, interfaceC1493505szLIZIZ, c06h2, i, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final C1728606po p(boolean z, FrameLayout frameLayout, int i, String str, AwS546S0100000_2 awS546S0100000_2, AwS581S0100000_2 awS581S0100000_2) {
        C1728606po c1728606po = new C1728606po(frameLayout.getContext(), null, 0);
        c1728606po.setLayoutDirection(C426750GoL.LIZLLL(c1728606po.getContext()) ? 1 : 0);
        c1728606po.LLLII(i, str, z);
        c1728606po.LLJJJ = awS581S0100000_2;
        c1728606po.LLJJIJIL = awS546S0100000_2;
        C786410Ut5.I7(new AbS359S0000000_2(0), c1728606po.getShadowBackground());
        for (View view : c1728606po.getElementViewList()) {
            if (!Intrinsics.LJFF(view, c1728606po.getPostToStoryButton()) && !Intrinsics.LJFF(view, c1728606po.getCloseIcon()) && !Intrinsics.LJFF(view, c1728606po.getReferenceView()) && !Intrinsics.LJFF(view, c1728606po.getSubtitleReferenceView()) && !Intrinsics.LJFF(view, c1728606po.getPostToStoryReferenceView())) {
                C786410Ut5.I7(new AbS359S0000000_2(1), view);
            }
        }
        C786410Ut5.I7(new AbS686S0100000_2(awS581S0100000_2, 26), c1728606po.getCloseIcon());
        C786410Ut5.I7(new AbS496S0200000_2(awS546S0100000_2, awS581S0100000_2, 3), c1728606po.getPostToStoryButton());
        frameLayout.addView(c1728606po, 0, new ViewGroup.LayoutParams(-1, -1));
        return c1728606po;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void K(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2) {
        C1500705u9.LIZ(C1500705u9.LIZIZ, str, str2, str3, "internal", str4, str5, num, num2, 256);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakService
    public final void N(Activity activity, C06G9 c06g9, C06H2 c06h2, C06ET c06et, String str, String str2, String str3, C06H4 c06h4) {
        String value;
        if (!C06GX.LIZ()) {
            return;
        }
        C1576506Ff c1576506Ff = C1576506Ff.LIZIZ;
        if (c06h4 != null) {
            value = c06h4.getValue();
        } else {
            value = null;
        }
        C1576706Fh c1576706Fh = new C1576706Fh(null, str3, c06h2, str2, value, null, null, null, 993);
        c1576506Ff.getClass();
        C1576506Ff.LIZ(activity, c06g9, str, c06et, c1576706Fh);
    }
}
