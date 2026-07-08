package com.ss.android.ugc.aweme.im.service.impl;

import X.C051M;
import X.C054G;
import X.C0PEM;
import X.C0Y3I;
import X.C0Y3O;
import X.C0Y3R;
import X.C0YNY;
import X.C13LP;
import X.C15438062q;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2241931Cox;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C462270IAv;
import X.C462280IAw;
import X.C869590Y9l;
import X.InterfaceC874680YTa;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AwemeCardManager implements IAwemeCardManager {
    public static boolean LIZLLL;
    public static final AwemeCardManager LIZIZ = new AwemeCardManager();
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public static final ConcurrentHashMap<Long, List<C869590Y9l>> LJ = new ConcurrentHashMap<>();
    public static final Map<String, String> LJFF = new LinkedHashMap();
    public static final Map<String, String> LJI = new LinkedHashMap();
    public static final ConcurrentHashMap<String, Integer> LJII = new ConcurrentHashMap<>();

    public static final class Service implements IAwemeCardManager {
        public final /* synthetic */ AwemeCardManager LIZIZ = AwemeCardManager.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
        public final void LIZ(C869590Y9l c869590Y9l) {
            this.LIZIZ.LIZ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
        public final void LIZIZ(C869590Y9l c869590Y9l, String str) {
            this.LIZIZ.LIZIZ(c869590Y9l, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
        public final String LIZJ(String str) {
            return this.LIZIZ.LIZJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
        public final String LIZLLL(String str) {
            return this.LIZIZ.LIZLLL(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
        public final void LJ(String str, List<? extends C869590Y9l> list) {
            this.LIZIZ.LJ(str, list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
        public final void LJFF(List<? extends C869590Y9l> list) {
            this.LIZIZ.LJFF(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
    public final void LIZ(C869590Y9l c869590Y9l) {
        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C2241931Cox.LIZJ(c869590Y9l, AwemeCardTemplate.class);
        if (awemeCardTemplate != null) {
            String scene = c869590Y9l.getScene();
            LIZIZ.getClass();
            LJI.put(String.valueOf(c869590Y9l.getMsgId()), GsonProtectorUtils.toJson(C051M.LIZ, LJI(scene, awemeCardTemplate)));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
    public final String LIZJ(String str) {
        return (String) ((LinkedHashMap) LJFF).get(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
    public final String LIZLLL(String str) {
        return (String) ((LinkedHashMap) LJI).get(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
    public final void LJFF(List<? extends C869590Y9l> list) {
        C869590Y9l c869590Y9l;
        AwemeCardTemplate awemeCardTemplate;
        if (list != null && !list.isEmpty() && LIZLLL) {
            try {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C869590Y9l c869590Y9l2 : list) {
                    linkedHashMap.put(Long.valueOf(c869590Y9l2.getMsgId()), c869590Y9l2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : Collections.synchronizedMap(LJ).entrySet()) {
                    Long l = (Long) entry.getKey();
                    List list2 = (List) entry.getValue();
                    if (linkedHashMap.keySet().contains(l) && (c869590Y9l = (C869590Y9l) linkedHashMap.get(l)) != null && (awemeCardTemplate = (AwemeCardTemplate) C2241931Cox.LIZJ(c869590Y9l, AwemeCardTemplate.class)) != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Pair<C869590Y9l, Map<String, C0Y3O>> pairLJIIIIZZ = LIZIZ.LJIIIIZZ((C869590Y9l) it2.next(), c869590Y9l.getScene(), awemeCardTemplate);
                            if (pairLJIIIIZZ != null) {
                                C869590Y9l first = pairLJIIIIZZ.getFirst();
                                linkedHashMap2.put(first.getUuid(), new Pair(first, pairLJIIIIZZ.getSecond()));
                            }
                        }
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(C13LP.LLIIII(linkedHashMap2.values()), true, new C0Y3I("aweme card refresh"));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateAllReplyMsgs error: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[PHI: r1
      0x0076: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:39:0x0074, B:37:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJI(java.lang.String r6, com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate r7) {
        /*
            r5 = 0
            if (r7 == 0) goto Laa
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = ""
            if (r6 != 0) goto Ld
            r6 = r3
        Ld:
            java.lang.String r0 = "scene"
            r2.put(r0, r6)
            com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r0 = r7.baseVideoComponent
            if (r0 == 0) goto L1a
            java.lang.String r1 = r0.id
            if (r1 != 0) goto L1b
        L1a:
            r1 = r3
        L1b:
            java.lang.String r0 = "aid"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r7.previewHintComponent
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent r0 = r0.quotePreviewType
            if (r0 == 0) goto L30
            int r0 = r0.getValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L30:
            boolean r0 = X.C2242571Cpz.LIZ(r7)
            r4 = 0
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r0 = r7.fallbackInfo
            com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent r1 = r0.status
            com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent r0 = com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent.STORY_EXPIRED
            if (r1 != r0) goto La8
            com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r0 = r7.baseUserComponent
            java.lang.Long r0 = r0.userId
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C1572306Dp.LIZ(r0)
            if (r0 == 0) goto La8
        L4d:
            com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent r0 = com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent.PICTURE
            int r1 = r0.getValue()
            if (r5 == 0) goto L9b
            int r0 = r5.intValue()
            if (r0 != r1) goto L9b
            if (r4 != 0) goto L9b
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r7.previewHintComponent
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent r0 = r0.quotePicturePreview
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.previewImage
            if (r0 == 0) goto L73
            java.util.List<java.lang.String> r0 = r0.urls
            if (r0 == 0) goto L73
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            if (r1 != 0) goto L76
        L73:
            r1 = r3
        L74:
            if (r5 == 0) goto L7d
        L76:
            java.lang.String r0 = r5.toString()
            if (r0 == 0) goto L7d
            r3 = r0
        L7d:
            java.lang.String r0 = "type"
            r2.put(r0, r3)
            java.lang.String r0 = "content"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r0 = r7.fallbackInfo
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.image
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r0 = r0.iconType
            int r0 = r0.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fallback_info"
            r2.put(r0, r1)
            return r2
        L9b:
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r7.previewHintComponent
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.quotePreviewText
            if (r0 == 0) goto L73
            java.lang.String r1 = r0.text
            if (r1 != 0) goto L74
            goto L73
        La8:
            r4 = 1
            goto L4d
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.AwemeCardManager.LJI(java.lang.String, com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate):java.util.Map");
    }

    public static void LJII(C869590Y9l c869590Y9l, List list) {
        if (c869590Y9l != null) {
            if (!c869590Y9l.isDeleted()) {
                AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C2241931Cox.LIZJ(c869590Y9l, AwemeCardTemplate.class);
                if (awemeCardTemplate != null) {
                    AwemeCardManager awemeCardManager = LIZIZ;
                    String scene = c869590Y9l.getScene();
                    awemeCardManager.getClass();
                    LJIIIZ(list, scene, awemeCardTemplate);
                    return;
                }
                return;
            }
            AwemeCardManager awemeCardManager2 = LIZIZ;
            String scene2 = c869590Y9l.getScene();
            awemeCardManager2.getClass();
            LJIIIZ(list, scene2, null);
            return;
        }
        LJIIIZ(list, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
    public final void LIZIZ(C869590Y9l c869590Y9l, String str) {
        C23250099c.LIZLLL(LIZJ, null, null, new C462280IAw(c869590Y9l, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IAwemeCardManager
    public final void LJ(String str, List<? extends C869590Y9l> list) {
        if (list != null && !list.isEmpty()) {
            C23250099c.LIZLLL(LIZJ, null, null, new C462270IAv(str, list, null), 3);
        }
    }

    public static void LJIIIZ(List list, String str, AwemeCardTemplate awemeCardTemplate) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = Collections.synchronizedList(list).iterator();
            while (it2.hasNext()) {
                Pair<C869590Y9l, Map<String, C0Y3O>> pairLJIIIIZZ = LIZIZ.LJIIIIZZ((C869590Y9l) it2.next(), str, awemeCardTemplate);
                if (pairLJIIIIZZ != null) {
                    C869590Y9l first = pairLJIIIIZZ.getFirst();
                    linkedHashMap.put(first.getUuid(), new Pair(first, pairLJIIIIZZ.getSecond()));
                }
            }
            if (!linkedHashMap.isEmpty()) {
                C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(C13LP.LLIIII(linkedHashMap.values()), true, new C0Y3I("update reply aweme card"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateReplyMsgs error: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final synchronized Pair<C869590Y9l, Map<String, C0Y3O>> LJIIIIZZ(C869590Y9l c869590Y9l, String str, AwemeCardTemplate awemeCardTemplate) {
        if (awemeCardTemplate == null) {
            return null;
        }
        String json = GsonProtectorUtils.toJson(C051M.LIZ, LJI(str, awemeCardTemplate));
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("quoted_preview"), json)) {
            return null;
        }
        c869590Y9l.addLocalExt("quoted_preview", json);
        LJFF.put(c869590Y9l.getUuid(), json);
        return new Pair<>(c869590Y9l, C2097908Jt.LIZJ(new Pair("quoted_preview", new C0Y3R(json))));
    }
}
