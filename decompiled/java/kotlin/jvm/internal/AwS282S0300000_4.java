package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C05MH;
import X.C09AY;
import X.C0CJ1;
import X.C0CJ4;
import X.C0CJ5;
import X.C0CWG;
import X.C0DZ2;
import X.C0PEM;
import X.C13DV;
import X.C13LP;
import X.C1558520qew;
import X.C1697820uHc;
import X.C1855920yOc;
import X.C1857470yR7;
import X.C1858150ySD;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C296780BkC;
import X.C331070CyP;
import X.C341220DZg;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC339730DTn;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS108S0200000_4;
import Y.ARunnableS73S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsPanelAssemViewModel;
import com.ss.android.ugc.aweme.settingsrequest.FetchABCDNConfig;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedRequest;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtLikeInfo;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AwS282S0300000_4 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS282S0300000_4 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r0 = r8.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131825852(0x7f1114bc, float:1.9284572E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L58
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L61
        L58:
            kotlin.jvm.internal.AwS405S0200000_4 r6 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 2
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L61:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r8.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131825851(0x7f1114bb, float:1.928457E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L9c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto La6
        L9c:
            kotlin.jvm.internal.AwS548S0100000_4 r6 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 20
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        La6:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$0(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS282S0300000_4 awS282S0300000_4, Object obj, Object obj2) {
        List list = (List) obj2;
        ((ViewOnAttachStateChangeListenerC20604515jv) awS282S0300000_4.l0).getState().LJIILL(list, new ARunnableS73S0200000_4(list, (List<C331070CyP>) awS282S0300000_4.l0, (ViewOnAttachStateChangeListenerC20604515jv) 14));
        if (list.size() > 3) {
            C786410Ut5.LJLLLLLL(0, (View) awS282S0300000_4.l1);
        } else {
            C786410Ut5.LJLLLLLL(8, (View) awS282S0300000_4.l1);
        }
        C786410Ut5.I7(new ACListenerS108S0200000_4(list, (SearchProsConsPanelAssemViewModel) awS282S0300000_4.l2, 1), (View) awS282S0300000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS282S0300000_4 awS282S0300000_4, Object obj, Object obj2) {
        final n nVar = (n) obj;
        final Set set = (Set) obj2;
        if (((n) awS282S0300000_4.l0) != null) {
            FetchABTestCommonOptimizedChunkTask fetchABTestCommonOptimizedChunkTask = (FetchABTestCommonOptimizedChunkTask) awS282S0300000_4.l1;
            n nVar2 = (n) awS282S0300000_4.l2;
            fetchABTestCommonOptimizedChunkTask.getClass();
            try {
                if (C296780BkC.LIZ()) {
                    if (!nVar2.LJJIJIIJIL("__CDN_URL__")) {
                        Iterator<T> it2 = fetchABTestCommonOptimizedChunkTask.LLILLJJLI.LJFF.LIZ().iterator();
                        while (it2.hasNext()) {
                            fetchABTestCommonOptimizedChunkTask.LJ((String) it2.next());
                        }
                    } else {
                        h hVarLJJIIZI = nVar2.LJJIIZI("__CDN_URL__");
                        HashMap map = new HashMap();
                        int size = hVarLJJIIZI.size();
                        for (int i = 0; i < size; i++) {
                            if (((q) hVarLJJIIZI.LJJIIJZLJL(i)).LL instanceof String) {
                                C0CJ5 c0cj5 = new C0CJ5(hVarLJJIIZI.LJJIIJZLJL(i).LJIL());
                                String str = c0cj5.LIZJ;
                                Object arrayList = map.get(str);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    map.put(str, arrayList);
                                }
                                ((List) arrayList).add(c0cj5);
                            }
                        }
                        for (String str2 : fetchABTestCommonOptimizedChunkTask.LLILLJJLI.LJFF.LIZ()) {
                            if (!map.containsKey(str2)) {
                                fetchABTestCommonOptimizedChunkTask.LJ(str2);
                                C0CJ1 c0cj1 = fetchABTestCommonOptimizedChunkTask.LLILLJJLI.LJFF;
                                Set<String> setLIZ = c0cj1.LIZ();
                                setLIZ.remove(str2);
                                ((Keva) c0cj1.LJFF.getValue()).storeStringSet(c0cj1.LIZLLL, setLIZ);
                            }
                        }
                        if (!map.isEmpty()) {
                            final HashMap map2 = new HashMap();
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                map2.put(((Map.Entry) it3.next()).getKey(), Boolean.FALSE);
                            }
                            for (final Map.Entry entry : map.entrySet()) {
                                C799900VZk.LIZ.getClass();
                                C799890VZj c799890VZj = new C799890VZj();
                                c799890VZj.LIZ(new FetchABCDNConfig((List) entry.getValue(), new C0CJ4() { // from class: X.0C6z
                                    @Override // X.C0CJ4
                                    public final void onFailed() {
                                    }

                                    @Override // X.C0CJ4
                                    public final void LIZ() {
                                        HashMap<String, Boolean> map3 = map2;
                                        String key = entry.getKey();
                                        Boolean bool = Boolean.TRUE;
                                        map3.put(key, bool);
                                        if (Intrinsics.LJFF(map2.get(entry.getKey()), bool)) {
                                            Collection<Boolean> collectionValues = map2.values();
                                            if (!collectionValues.isEmpty()) {
                                                Iterator<T> it4 = collectionValues.iterator();
                                                while (it4.hasNext()) {
                                                    if (!Intrinsics.LJFF(it4.next(), Boolean.TRUE)) {
                                                        return;
                                                    }
                                                }
                                            }
                                            Set<String> set2 = set;
                                            if (set2 == null || set2.isEmpty()) {
                                                Map<String, Integer> map4 = C308300C6q.LIZ;
                                                C308300C6q.LIZJ(nVar);
                                            } else {
                                                Map<String, Integer> map5 = C308300C6q.LIZ;
                                                C308300C6q.LIZLLL(nVar, set);
                                            }
                                        }
                                    }
                                }));
                                c799890VZj.LIZIZ();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS282S0300000_4 awS282S0300000_4, Object obj, Object obj2) {
        String str;
        String str2;
        TakoSug takoSug;
        Message message;
        TakoMixFeed takoMixFeedLJIIIZ;
        Message message2;
        TakoSug takoSugOv2;
        Message message3;
        int iIntValue = ((Number) obj2).intValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - C1857470yR7.LIZIZ >= 500) {
            C1857470yR7.LIZIZ = jCurrentTimeMillis;
            BatchUpdateMessage batchUpdateMessageLJ = null;
            BatchUpdateMessage batchUpdateMessageLJ2 = C1855920yOc.LJ(Message.LIZLLL((Message) awS282S0300000_4.l0, null, 0, true, 0, false, null, false, -536870913, 2097151), Collections.singletonList(1));
            List list = (List) awS282S0300000_4.l1;
            if (list != null && (message3 = (Message) C13LP.LJJJLZIJ(iIntValue, list)) != null) {
                batchUpdateMessageLJ = C1855920yOc.LJ(Message.LIZLLL(message3, null, 0, false, 0, false, null, false, -536870913, 2097151), Collections.singletonList(1));
            }
            IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS282S0300000_4.l2, IMessageAbility.class, null);
            if (iMessageAbility != null) {
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                c13dvLIZIZ.add(batchUpdateMessageLJ2);
                if (batchUpdateMessageLJ != null) {
                    c13dvLIZIZ.add(batchUpdateMessageLJ);
                }
                C1858150ySD.LIZJ(iMessageAbility, batchUpdateMessageLJ2, C1697820uHc.LIZ(c13dvLIZIZ), true, null, 8);
            }
            IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS282S0300000_4.l2, IMessageAbility.class, null);
            if (iMessageAbility2 != null && (takoSugOv2 = iMessageAbility2.ov2()) != null) {
                str = takoSugOv2.answerMsgId;
            } else {
                str = null;
            }
            if (batchUpdateMessageLJ != null && (message2 = batchUpdateMessageLJ.LIZ) != null) {
                str2 = message2.msgId;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str, str2)) {
                C1857470yR7 c1857470yR7 = C1857470yR7.LIZ;
                if (batchUpdateMessageLJ != null && (message = batchUpdateMessageLJ.LIZ) != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null) {
                    takoSug = takoMixFeedLJIIIZ.cacheSug;
                } else {
                    takoSug = null;
                }
                InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS282S0300000_4.l2;
                c1857470yR7.getClass();
                if (takoSug != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0CWG(interfaceC665370Q7z, takoSug, null), 3);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS282S0300000_4 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = r7
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r6.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131835130(0x7f1138fa, float:1.930339E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r4.LJJIIJ(r0)
            java.lang.Object r0 = r6.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r6.l1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r6.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS405S0200000_4 r6 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 56
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$12(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS282S0300000_4 awS282S0300000_4, Object obj, Object obj2) {
        final n nVar = (n) obj;
        final Set set = (Set) obj2;
        if (((n) awS282S0300000_4.l0) != null) {
            FetchABTestCommonOptimizedRequest fetchABTestCommonOptimizedRequest = (FetchABTestCommonOptimizedRequest) awS282S0300000_4.l1;
            n nVar2 = (n) awS282S0300000_4.l2;
            fetchABTestCommonOptimizedRequest.getClass();
            try {
                if (C296780BkC.LIZ()) {
                    if (!nVar2.LJJIJIIJIL("__CDN_URL__")) {
                        Iterator<T> it2 = fetchABTestCommonOptimizedRequest.LLILLJJLI.LJFF.LIZ().iterator();
                        while (it2.hasNext()) {
                            fetchABTestCommonOptimizedRequest.LJ((String) it2.next());
                        }
                    } else {
                        h hVarLJJIIZI = nVar2.LJJIIZI("__CDN_URL__");
                        HashMap map = new HashMap();
                        int size = hVarLJJIIZI.size();
                        for (int i = 0; i < size; i++) {
                            if (((q) hVarLJJIIZI.LJJIIJZLJL(i)).LL instanceof String) {
                                C0CJ5 c0cj5 = new C0CJ5(hVarLJJIIZI.LJJIIJZLJL(i).LJIL());
                                String str = c0cj5.LIZJ;
                                Object arrayList = map.get(str);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    map.put(str, arrayList);
                                }
                                ((List) arrayList).add(c0cj5);
                            }
                        }
                        for (String str2 : fetchABTestCommonOptimizedRequest.LLILLJJLI.LJFF.LIZ()) {
                            if (!map.containsKey(str2)) {
                                fetchABTestCommonOptimizedRequest.LJ(str2);
                                C0CJ1 c0cj1 = fetchABTestCommonOptimizedRequest.LLILLJJLI.LJFF;
                                Set<String> setLIZ = c0cj1.LIZ();
                                setLIZ.remove(str2);
                                ((Keva) c0cj1.LJFF.getValue()).storeStringSet(c0cj1.LIZLLL, setLIZ);
                            }
                        }
                        if (!map.isEmpty()) {
                            final HashMap map2 = new HashMap();
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                map2.put(((Map.Entry) it3.next()).getKey(), Boolean.FALSE);
                            }
                            for (final Map.Entry entry : map.entrySet()) {
                                C799900VZk.LIZ.getClass();
                                C799890VZj c799890VZj = new C799890VZj();
                                c799890VZj.LIZ(new FetchABCDNConfig((List) entry.getValue(), new C0CJ4() { // from class: X.0C70
                                    @Override // X.C0CJ4
                                    public final void onFailed() {
                                    }

                                    @Override // X.C0CJ4
                                    public final void LIZ() {
                                        HashMap<String, Boolean> map3 = map2;
                                        String key = entry.getKey();
                                        Boolean bool = Boolean.TRUE;
                                        map3.put(key, bool);
                                        if (Intrinsics.LJFF(map2.get(entry.getKey()), bool)) {
                                            Collection<Boolean> collectionValues = map2.values();
                                            if (!collectionValues.isEmpty()) {
                                                Iterator<T> it4 = collectionValues.iterator();
                                                while (it4.hasNext()) {
                                                    if (!Intrinsics.LJFF(it4.next(), Boolean.TRUE)) {
                                                        return;
                                                    }
                                                }
                                            }
                                            Set<String> set2 = set;
                                            if (set2 == null || set2.isEmpty()) {
                                                Map<String, Integer> map4 = C308300C6q.LIZ;
                                                C308300C6q.LIZJ(nVar);
                                            } else {
                                                Map<String, Integer> map5 = C308300C6q.LIZ;
                                                C308300C6q.LIZLLL(nVar, set);
                                            }
                                        }
                                    }
                                }));
                                c799890VZj.LIZIZ();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS282S0300000_4 r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$3(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS282S0300000_4 awS282S0300000_4, Object obj, Object obj2) {
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceLJJIIZI;
        String uid;
        ThoughtInfo thoughtInfoLIZIZ;
        String str;
        Integer num;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str2 = (String) obj2;
        String str3 = ((ThoughtInfo) awS282S0300000_4.l0).thoughtId;
        if (str3 != null) {
            SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
            String uid2 = null;
            if (socialThoughtService != null) {
                iSocialThoughtDataCenterServiceLJJIIZI = socialThoughtService.LJJIIZI();
            } else {
                iSocialThoughtDataCenterServiceLJJIIZI = null;
            }
            User user = (User) awS282S0300000_4.l1;
            boolean z = false;
            if ((user == null || (uid = user.getUid()) == null || uid.length() <= 0) && ((uid = ((ThoughtInfo) awS282S0300000_4.l0).authorUid) == null || uid.length() <= 0)) {
                uid = "";
            }
            if (iSocialThoughtDataCenterServiceLJJIIZI == null || (thoughtInfoLIZIZ = iSocialThoughtDataCenterServiceLJJIIZI.LIZIZ(uid)) == null) {
                thoughtInfoLIZIZ = (ThoughtInfo) awS282S0300000_4.l0;
            }
            ThoughtInteractionInfo thoughtInteractionInfo = thoughtInfoLIZIZ.viewerInteraction;
            if (thoughtInteractionInfo == null) {
                thoughtInteractionInfo = new ThoughtInteractionInfo(null, null);
            }
            ThoughtLikeInfo thoughtLikeInfo = thoughtInteractionInfo.likeInfo;
            if (thoughtLikeInfo != null && (num = thoughtLikeInfo.type) != null && num.intValue() == 1) {
                z = true;
            }
            if (z != zBooleanValue) {
                List<String> list = ((SocialThoughtPanelFragment) awS282S0300000_4.l2).LLJILJIL;
                if (zBooleanValue) {
                    str = "like";
                } else {
                    str = "unlike";
                }
                ((ArrayList) list).add(str);
                ThoughtInteractionInfo thoughtInteractionInfoCopy = thoughtInteractionInfo.copy(thoughtInteractionInfo.userInfo, new ThoughtLikeInfo(Integer.valueOf(zBooleanValue ? 1 : 0)));
                if (iSocialThoughtDataCenterServiceLJJIIZI != null) {
                    iSocialThoughtDataCenterServiceLJJIIZI.LJII("", thoughtInfoLIZIZ.copy(thoughtInfoLIZIZ.thoughtId, thoughtInfoLIZIZ.textContent, thoughtInfoLIZIZ.createTimeMs, thoughtInfoLIZIZ.privacySetting, thoughtInfoLIZIZ.interactionPreview, thoughtInteractionInfoCopy, thoughtInfoLIZIZ.authorUid, thoughtInfoLIZIZ.isPublishing));
                }
                AnonymousClass0956 anonymousClass0956 = ((SocialThoughtPanelFragment) awS282S0300000_4.l2).LLJILLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                ((SocialThoughtPanelFragment) awS282S0300000_4.l2).LLJILLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(ProcessLifecycleOwner.Companion.get()), C0PEM.LIZJ, null, new C05MH(zBooleanValue, str3, thoughtInteractionInfo, iSocialThoughtDataCenterServiceLJJIIZI, thoughtInfoLIZIZ, null), 2);
                SocialThoughtPanelFragment socialThoughtPanelFragment = (SocialThoughtPanelFragment) awS282S0300000_4.l2;
                String str4 = socialThoughtPanelFragment.LLIZLLLIL;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = socialThoughtPanelFragment.LLJ;
                if (str5 == null) {
                    str5 = "";
                }
                User user2 = (User) awS282S0300000_4.l1;
                if (user2 != null) {
                    uid2 = user2.getUid();
                }
                C341220DZg.LJIILIIL(str4, str5, str2, (ThoughtInfo) awS282S0300000_4.l0, C341220DZg.LJIILL((User) awS282S0300000_4.l1, uid2), zBooleanValue);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS282S0300000_4 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828544(0x7f111f40, float:1.9290032E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            java.util.Map r0 = (java.util.Map) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r2 = r9.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS271S0300000_27 r7 = new kotlin.jvm.internal.AwS271S0300000_27
            r0 = 18
            r7.<init>(r2, r3, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131828543(0x7f111f3f, float:1.929003E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            java.util.Map r0 = (java.util.Map) r0
            boolean r3 = r5.LJII(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r9.l0
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r3 != 0) goto La7
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto Lb1
        La7:
            kotlin.jvm.internal.AwS428S0200000_27 r7 = new kotlin.jvm.internal.AwS428S0200000_27
            r0 = 78
            r7.<init>(r2, r1, r0)
            r5.LJJIJIIJI(r7)
        Lb1:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$5(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS282S0300000_4 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828544(0x7f111f40, float:1.9290032E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS407S0200000_6 r8 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 71
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131828543(0x7f111f3f, float:1.929003E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r6.LJJIIJ(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l2
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS405S0200000_4 r8 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 37
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$6(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS282S0300000_4 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r1
            r0 = 2131842148(0x7f115464, float:1.9317624E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            X.19EG r0 = (X.C19EG) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l1
            X.19EG r2 = (X.C19EG) r2
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS405S0200000_4 r6 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 46
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r1
            r0 = 2131842147(0x7f115463, float:1.9317622E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L95
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L9f
        L95:
            kotlin.jvm.internal.AwS548S0100000_4 r6 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 481(0x1e1, float:6.74E-43)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L9f:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$7(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS282S0300000_4 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = r7
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r1
            r0 = 2131855477(0x7f118875, float:1.9344658E38)
            java.lang.String r5 = r1.getString(r0)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l1
            X.19EG r0 = (X.C19EG) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r6.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r6.l1
            X.19EG r2 = (X.C19EG) r2
            java.lang.Object r1 = r6.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS405S0200000_4 r6 = new kotlin.jvm.internal.AwS405S0200000_4
            r0 = 47
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5e:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$8(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS282S0300000_4 r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS282S0300000_4.invoke$9(kotlin.jvm.internal.AwS282S0300000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(C0DZ2 c0dz2, Bundle bundle, SocialThoughtPanelFragment socialThoughtPanelFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0dz2;
        this.l1 = bundle;
        this.l2 = socialThoughtPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, View view, SearchProsConsPanelAssemViewModel searchProsConsPanelAssemViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = view;
        this.l2 = searchProsConsPanelAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS282S0300000_4(Activity activity, Activity activity2, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(Context context, Map map, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = map;
        this.l1 = context;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS282S0300000_4(Context context, Context context2, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(ViewGroup viewGroup, EnumC339730DTn enumC339730DTn, CreateTabBottomBtnViewModel createTabBottomBtnViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC339730DTn;
        this.l1 = createTabBottomBtnViewModel;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(n nVar, FetchABTestCommonOptimizedChunkTask fetchABTestCommonOptimizedChunkTask, n nVar2, int i) {
        super(2);
        this.$t = i;
        this.l0 = nVar;
        this.l1 = fetchABTestCommonOptimizedChunkTask;
        this.l2 = nVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(n nVar, FetchABTestCommonOptimizedRequest fetchABTestCommonOptimizedRequest, n nVar2, int i) {
        super(2);
        this.$t = i;
        this.l0 = nVar;
        this.l1 = fetchABTestCommonOptimizedRequest;
        this.l2 = nVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS282S0300000_4(LiveHighLightPageFragment liveHighLightPageFragment, LiveHighLightPageFragment liveHighLightPageFragment2, C19EG c19eg, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = liveHighLightPageFragment;
        this.l1 = liveHighLightPageFragment2;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0300000_4(ThoughtInfo thoughtInfo, User user, SocialThoughtPanelFragment socialThoughtPanelFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = thoughtInfo;
        this.l1 = user;
        this.l2 = socialThoughtPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS282S0300000_4(Message message, Message message2, List<Message> list, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(2);
        this.$t = interfaceC665370Q7z;
        this.l0 = message;
        this.l1 = message2;
        this.l2 = list;
    }
}
