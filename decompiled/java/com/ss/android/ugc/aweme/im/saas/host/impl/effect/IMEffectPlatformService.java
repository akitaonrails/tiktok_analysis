package com.ss.android.ugc.aweme.im.saas.host.impl.effect;

import X.C06T7;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0ZYI;
import X.C189200o6;
import X.C2213981Bky;
import X.C2252611DEt;
import X.InterfaceC1364105Vn;
import X.InterfaceC1635390sev;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.effect.EffectPlatformFeature;
import com.ss.android.ugc.aweme.im.saas.host.impl.effect.IMEffectPlatformService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.models.CategoryExtra;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes26.dex */
public final class IMEffectPlatformService implements EffectPlatformFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.effect.EffectPlatformFeature
    public final Object LIZ(final C06T7 c06t7, InterfaceC1364105Vn<? super C0ZYI> interfaceC1364105Vn) {
        boolean z;
        Object c098200Yq;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpiForReal(CreativeToolsPluginService.class);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C189200o6.m2constructorimpl(null);
            c2252611DEt.resumeWith(null);
        } else {
            try {
                IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) PluggableExtentionKt.pluggableSpiForReal(IEffectPlatformFactory.class);
                if (iEffectPlatformFactory != null) {
                    EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
                    effectPlatformBuilder.setContext(C2213981Bky.LIZIZ.getApplicationContext());
                    effectPlatformBuilder.setSingleton(true);
                    c098200Yq = iEffectPlatformFactory.create(effectPlatformBuilder);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = null;
            }
            InterfaceC1635390sev interfaceC1635390sev = (InterfaceC1635390sev) c098200Yq;
            if (interfaceC1635390sev == null) {
                C189200o6.m2constructorimpl(null);
                c2252611DEt.resumeWith(null);
            } else {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC1635390sev.LJJJJI("im_message_bubble", false, false, new IFetchEffectChannelListener() { // from class: X.0sf8
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        if (!c2252611DEt.isActive()) {
                            return;
                        }
                        InterfaceC20236714Gf<C0ZYI> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                        C2240108q7.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, c06t7.isPreload(), false);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                        List<EffectCategoryResponse> category_responses;
                        CategoryExtra categoryExtra;
                        Long l;
                        List<Effect> all_category_effects;
                        String str;
                        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                        if (c2252611DEt.isActive()) {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            if (effectChannelResponse2 != null && (all_category_effects = effectChannelResponse2.getAll_category_effects()) != null) {
                                IMEffectPlatformService iMEffectPlatformService = this;
                                for (Effect effect : all_category_effects) {
                                    List<String> url_prefix = effectChannelResponse2.getUrl_prefix();
                                    iMEffectPlatformService.getClass();
                                    try {
                                        MessageBubbleStyle.MessageBubbleStyleData messageBubbleStyleData = (MessageBubbleStyle.MessageBubbleStyleData) C051M.LIZIZ(MessageBubbleStyle.MessageBubbleStyleData.class, effect.getExtra());
                                        if (messageBubbleStyleData != null && (str = (String) C13LP.LJJJLL(url_prefix)) != null) {
                                            MessageBubbleStyle messageBubbleStyle = new MessageBubbleStyle(effect.getName(), effect.getResource_id(), str, messageBubbleStyleData, effect.getHint(), System.currentTimeMillis());
                                            concurrentHashMap.put(messageBubbleStyle.resourceId, messageBubbleStyle);
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                            if (effectChannelResponse2 != null && (category_responses = effectChannelResponse2.getCategory_responses()) != null) {
                                int i = 0;
                                for (EffectCategoryResponse effectCategoryResponse : category_responses) {
                                    int i2 = i + 1;
                                    if (i >= 0) {
                                        EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
                                        ArrayList arrayList = new ArrayList();
                                        for (Effect effect2 : effectCategoryResponse2.getTotal_effects()) {
                                            if (concurrentHashMap.containsKey(effect2.getResourceId())) {
                                                arrayList.add(effect2.getResourceId());
                                            }
                                        }
                                        try {
                                            categoryExtra = (CategoryExtra) C051M.LIZIZ(CategoryExtra.class, effectCategoryResponse2.getExtra());
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            categoryExtra = null;
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj : arrayList) {
                                            MessageBubbleStyle messageBubbleStyle2 = (MessageBubbleStyle) concurrentHashMap.get(obj);
                                            if (messageBubbleStyle2 != null) {
                                                Long lValueOf = Long.valueOf(jCurrentTimeMillis2);
                                                if (lValueOf != null && (l = messageBubbleStyle2.data.endDate) != null) {
                                                    if (lValueOf.longValue() > l.longValue()) {
                                                    }
                                                }
                                                arrayList2.add(obj);
                                            }
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            concurrentHashMap2.put(effectCategoryResponse2.getKey(), new Object(effectCategoryResponse2.getKey(), effectCategoryResponse2.getName(), arrayList2, i, categoryExtra) { // from class: X.0ZYH
                                                public final String LIZ;
                                                public final String LIZIZ;
                                                public final List<String> LIZJ;
                                                public final int LIZLLL;
                                                public final CategoryExtra LJ;

                                                {
                                                    this.LIZ = str;
                                                    this.LIZIZ = str;
                                                    this.LIZJ = arrayList2;
                                                    this.LIZLLL = i;
                                                    this.LJ = categoryExtra;
                                                }
                                            });
                                        }
                                        i = i2;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            InterfaceC20236714Gf<C0ZYI> interfaceC20236714Gf = c2252611DEt;
                            Object obj2 = new Object(concurrentHashMap, concurrentHashMap2) { // from class: X.0ZYI
                                public final Map<String, MessageBubbleStyle> LIZ;
                                public final Map<String, C0ZYH> LIZIZ;

                                {
                                    this.LIZ = concurrentHashMap;
                                    this.LIZIZ = concurrentHashMap2;
                                }
                            };
                            C189200o6.m2constructorimpl(obj2);
                            interfaceC20236714Gf.resumeWith(obj2);
                            C2240108q7.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, c06t7.isPreload(), true);
                        }
                    }
                });
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
