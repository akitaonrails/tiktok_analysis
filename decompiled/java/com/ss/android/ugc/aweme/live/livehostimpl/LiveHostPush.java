package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0Z9W;
import X.C13LP;
import X.C1619110sEf;
import X.C1697810uHb;
import X.C1904580zf6;
import X.C1908480zlO;
import X.C19323510in;
import X.C2097608Jq;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.watch.push.ILivePushService;
import com.bytedance.android.livesdkapi.host.IHostPush;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveHostPush implements IHostPush {
    public C0Z9W LL;
    public C1904580zf6 LLILLJJLI;

    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final void unregisterPushHandler() {
        C0Z9W c0z9w = this.LL;
        if (c0z9w != null) {
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            c1908480zlO.LJI(c0z9w);
            c1908480zlO.LJIIZILJ(c0z9w);
        }
        this.LL = null;
        C1904580zf6 c1904580zf6 = this.LLILLJJLI;
        if (c1904580zf6 != null) {
            C1908480zlO.LIZIZ.LJIIZILJ(c1904580zf6);
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0zf6, X.15q8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final void registerPushHandler(Function0<Unit> function0) {
        C0Z9W c0z9w = new C0Z9W(function0);
        this.LL = c0z9w;
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        if (c1908480zlO.LJIJ(2436) == null) {
            c1908480zlO.LJ(c0z9w);
        }
        c1908480zlO.LJIILL(c0z9w, c0z9w.LLILLL);
        ?? r1 = new C1619110sEf() { // from class: X.0zf6
            @Override // X.C1619110sEf, X.InterfaceC20643015q8
            public final void LIZIZ(InnerPushMessage innerPushMessage) {
                ILivePushService iLivePushService = (ILivePushService) PluggableExtentionKt.pluggableSpi$default(ILivePushService.class, false, false, false, 14, null);
                if (iLivePushService != null) {
                    iLivePushService.MX1(false);
                }
            }

            @Override // X.C1619110sEf, X.InterfaceC20643015q8
            public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
                ILivePushService iLivePushService = (ILivePushService) PluggableExtentionKt.pluggableSpi$default(ILivePushService.class, false, false, false, 14, null);
                if (iLivePushService != null) {
                    iLivePushService.MX1(true);
                }
            }
        };
        this.LLILLJJLI = r1;
        c1908480zlO.LJIILL(r1, new int[]{30, 31});
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPush
    public final void sendPush(ImageModel imageModel, String str, String str2, ImageModel imageModel2) {
        List listSingletonList;
        String str3;
        List urls;
        List urls2;
        Object objLJJJLL;
        if (imageModel != null && (urls2 = imageModel.getUrls()) != null && (objLJJJLL = C13LP.LJJJLL(urls2)) != null) {
            listSingletonList = Collections.singletonList(objLJJJLL);
        } else {
            listSingletonList = null;
        }
        if (imageModel2 != null && (urls = imageModel2.getUrls()) != null) {
            str3 = (String) C13LP.LJJJLL(urls);
        } else {
            str3 = null;
        }
        new C19323510in(2436, "inner_live_guidance_push", new InnerPushConfig(0L, new InnerPushFreqControlStrategy(C1697810uHb.LJIIJJI(new InnerPushPopupLimitStrategy(-1371044329, 2, 3600L, null), new InnerPushPopupLimitStrategy(-1371044328, 6, 86400L, null)), null), 0, C1697810uHb.LJIIJJI(2, 3, 4, 5, 6, 7, 8, 9), 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, listSingletonList, null, null, null, null, null, null, null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, str, null, str2, null, 2, null, 1, null, str3, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), C2097608Jq.LJIIJ(new Pair("business_tag", "Live")), null, 396).LIZIZ();
    }
}
