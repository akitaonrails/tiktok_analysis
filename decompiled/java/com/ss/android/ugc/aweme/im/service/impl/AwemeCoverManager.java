package com.ss.android.ugc.aweme.im.service.impl;

import X.C05GP;
import X.C06UO;
import X.C099R;
import X.C0I7V;
import X.C0PEM;
import X.C0Y3I;
import X.C0Y3O;
import X.C0Y3P;
import X.C0Y3Q;
import X.C0Y3R;
import X.C0YNY;
import X.C0ZDX;
import X.C13LP;
import X.C1954807lC;
import X.C327170Cs7;
import X.C327180Cs8;
import X.C869590Y9l;
import X.InterfaceC1335505Kn;
import X.InterfaceC1364105Vn;
import X.InterfaceC874680YTa;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.AwemeStatusBean;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.IHighlightFetchManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AwemeCoverManager implements IAwemeCoverManager {
    public static final AwemeCoverManager LIZIZ = new AwemeCoverManager();

    public static final class Service implements IAwemeCoverManager {
        public final /* synthetic */ AwemeCoverManager LIZIZ = AwemeCoverManager.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final C0I7V LIZ(Context context, C869590Y9l c869590Y9l, boolean z) {
            return this.LIZIZ.LIZ(context, c869590Y9l, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final void LIZIZ(List<? extends C869590Y9l> list, boolean z) {
            this.LIZIZ.LIZIZ(list, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final void LIZJ(C327180Cs8 c327180Cs8, List list) {
            this.LIZIZ.LIZJ(c327180Cs8, list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final void LIZLLL(C869590Y9l c869590Y9l) {
            this.LIZIZ.LIZLLL(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final Object LJ(Set<String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LJ(set, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final void LJLJJLL() {
            this.LIZIZ.LJLJJLL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
        public final void LJLJL() {
            this.LIZIZ.LJLJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final void LJLJJLL() {
        AwemeCardManager.LIZIZ.getClass();
        AwemeCardManager.LIZLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final void LJLJL() {
        AwemeFetchManager.LIZIZ.getClass();
        AwemeFetchManager.LIZJ.clear();
        AwemeCardManager.LIZIZ.getClass();
        AwemeCardManager.LIZLLL = false;
        AwemeCardManager.LJ.clear();
        ((LinkedHashMap) AwemeCardManager.LJFF).clear();
        AwemeCardManager.LJII.clear();
        ((LinkedHashMap) AwemeCardManager.LJI).clear();
        IHighlightFetchManager.LIZ.getClass();
        IHighlightFetchManager value = C06UO.LIZIZ.getValue();
        if (value != null) {
            value.LIZ();
        }
    }

    public static Pair LJII(String str) {
        C327170Cs7 c327170Cs7LIZJ = AwemeFetchManager.LIZIZ.LIZJ(str);
        if (c327170Cs7LIZJ != null) {
            return new Pair(c327170Cs7LIZJ.LIZ, c327170Cs7LIZJ.LIZIZ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final void LIZLLL(C869590Y9l c869590Y9l) {
        InterfaceC1335505Kn eventCenter;
        String strLIZ = C0ZDX.LIZ(c869590Y9l);
        if (strLIZ == null) {
            return;
        }
        Pair pairLJII = LJII(strLIZ);
        if (pairLJII == null) {
            List listSingletonList = Collections.singletonList(c869590Y9l);
            IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
            if (iIMPreloadService != null && (eventCenter = iIMPreloadService.getEventCenter()) != null) {
                eventCenter.LIZ(new C05GP(listSingletonList));
                return;
            }
            return;
        }
        Map<String, C0Y3O> mapLJI = LJI((AwemeStatusBean) pairLJII.getFirst(), (Aweme) pairLJII.getSecond());
        if (mapLJI == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0Y3O> entry : mapLJI.entrySet()) {
            if (true ^ Intrinsics.LJFF(c869590Y9l.getLocalExt().get(entry.getKey()), ((C0Y3R) entry.getValue()).LIZ)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            LJFF(c869590Y9l, linkedHashMap);
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l, linkedHashMap)), true, new C0Y3I("Aweme local ext refresh"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(C869590Y9l c869590Y9l, Map map) {
        String strValueOf;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C0Y3O c0y3o = (C0Y3O) entry.getValue();
            Map<String, String> localExt = c869590Y9l.getLocalExt();
            if (c0y3o instanceof C0Y3R) {
                strValueOf = ((C0Y3R) c0y3o).LIZ;
            } else if (c0y3o instanceof C0Y3Q) {
                c0y3o.getClass();
                strValueOf = String.valueOf(0L);
            } else {
                if (c0y3o instanceof C0Y3P) {
                    "LocalExtValue.Bytes is not supported by applyDeltaInPlace; computeLocalExtDelta currently produces only Text values".toString();
                    throw new IllegalStateException("LocalExtValue.Bytes is not supported by applyDeltaInPlace; computeLocalExtDelta currently produces only Text values");
                }
                throw new C1954807lC();
            }
            localExt.put(key, strValueOf);
        }
    }

    public static final Map<String, C0Y3O> LJI(AwemeStatusBean awemeStatusBean, Aweme aweme) {
        int i;
        InteractionPermission allowCreateSticker;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (awemeStatusBean != null) {
            linkedHashMap.put("feed_video_status_flag", new C0Y3R(String.valueOf(awemeStatusBean.getStatus())));
        }
        if (aweme != null) {
            linkedHashMap.put("aweme_id", new C0Y3R(aweme.getAid()));
            User author = aweme.getAuthor();
            if (author != null && author.isAdFake()) {
                linkedHashMap.put("feed_ad_fake_nickname", new C0Y3R(aweme.getAuthor().getNickname()));
            }
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null && (allowCreateSticker = interactPermission.getAllowCreateSticker()) != null) {
                i = allowCreateSticker.status;
            } else {
                i = 2;
            }
            linkedHashMap.put("video_sticker_status", new C0Y3R(String.valueOf(i)));
        }
        if (!(true ^ linkedHashMap.isEmpty())) {
            return null;
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final void LIZIZ(List<? extends C869590Y9l> list, boolean z) {
        InterfaceC1335505Kn eventCenter;
        if (list == null || list.isEmpty()) {
            return;
        }
        LIZIZ.getClass();
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (eventCenter = iIMPreloadService.getEventCenter()) != null) {
            eventCenter.LIZ(new C05GP(list));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final void LIZJ(C327180Cs8 c327180Cs8, List list) {
        List<C869590Y9l> list2;
        ArrayList<Pair> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
            String strLIZ = C0ZDX.LIZ(c869590Y9l);
            if (strLIZ != null) {
                arrayList.add(new Pair(c869590Y9l, strLIZ));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Object second = pair.getSecond();
            Object arrayList2 = linkedHashMap.get(second);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(second, arrayList2);
            }
            ((List) arrayList2).add(pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C327170Cs7 c327170Cs7 : c327180Cs8.LIZ.values()) {
            AwemeStatusBean awemeStatusBean = c327170Cs7.LIZ;
            Aweme aweme = c327170Cs7.LIZIZ;
            String awemeId = awemeStatusBean.getAwemeId();
            if (awemeId != null && (list2 = (List) linkedHashMap.get(awemeId)) != null && aweme != null) {
                for (C869590Y9l c869590Y9l2 : list2) {
                    Map<String, C0Y3O> mapLJI = LJI(awemeStatusBean, aweme);
                    if (mapLJI != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry<String, C0Y3O> entry : mapLJI.entrySet()) {
                            if (!Intrinsics.LJFF(c869590Y9l2.getLocalExt().get(entry.getKey()), ((C0Y3R) entry.getValue()).LIZ)) {
                                linkedHashMap3.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!linkedHashMap3.isEmpty()) {
                            LIZIZ.getClass();
                            LJFF(c869590Y9l2, linkedHashMap3);
                            linkedHashMap2.put(c869590Y9l2.getUuid(), new Pair(c869590Y9l2, linkedHashMap3));
                        }
                    }
                }
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(C13LP.LLIIII(linkedHashMap2.values()), true, new C0Y3I("Aweme cover refresh"));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final Object LJ(Set<String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = AwemeFetchManager.LIZIZ.LIZ(C13LP.LLIIII(set), false, C0PEM.LIZJ, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager
    public final C0I7V LIZ(Context context, C869590Y9l c869590Y9l, boolean z) {
        if (z) {
            return new C0I7V(context, 25);
        }
        return null;
    }
}
