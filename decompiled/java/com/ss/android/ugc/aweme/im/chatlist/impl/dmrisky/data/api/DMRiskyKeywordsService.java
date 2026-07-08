package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0Z5C;
import X.C0Z5D;
import X.C0Z5F;
import X.C0Z5G;
import X.C0Z5J;
import X.C0ZDX;
import X.C1336205Ku;
import X.C1486305rp;
import X.C1758706uf;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DMRiskyKeywordsService implements IDMRiskyKeywordsService {
    public volatile List<String> LIZJ;
    public final Set<C0Z5D> LIZ = new LinkedHashSet();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1758706uf());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1486305rp());
    public final PrivacySettingsFeature LJ = C1336205Ku.LIZ(false).getImPrivacySettings();

    @Override // com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService
    public final void LJ() {
        this.LIZJ = null;
        C0Z5G c0z5g = C0Z5G.LL;
        c0z5g.getClass();
        AnonymousClass0956 anonymousClass0956 = C0Z5G.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0Z5G.LLILZ = C23250099c.LIZLLL(c0z5g, null, null, new C0Z5F(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r7) {
        /*
            r6 = this;
            r0 = 202190(0x315ce, float:2.83329E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r7 instanceof X.C0Z5E
            if (r0 == 0) goto L33
            r4 = r7
            X.0Z5E r4 = (X.C0Z5E) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLL = r2
        L19:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L69
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r5 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            throw r1
        L33:
            X.0Z5E r4 = new X.0Z5E
            r4.<init>(r6, r7)
            goto L19
        L39:
            X.C155000ia.LIZIZ(r3)
            java.util.List<java.lang.String> r0 = r6.LIZJ
            if (r0 == 0) goto L46
            if (r5 == 0) goto L45
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L45:
            return r0
        L46:
            X.01GW r0 = r6.LIZLLL
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L56
            X.13BV r0 = X.C13BV.INSTANCE
        L50:
            if (r5 == 0) goto L55
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L55:
            return r0
        L56:
            X.01GW r0 = r6.LIZLLL     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.RiskyKeywordsService r0 = (com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.RiskyKeywordsService) r0     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L77
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L7a
            java.lang.Object r3 = r0.getRiskyKeywords(r4)     // Catch: java.lang.Exception -> L7a
            if (r3 != r2) goto L6c
            goto L81
        L69:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L7a
        L6c:
            com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.model.RiskyKeywords r3 = (com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.model.RiskyKeywords) r3     // Catch: java.lang.Exception -> L7a
            if (r3 == 0) goto L77
            java.util.List<java.lang.String> r0 = r3.words     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L77
            r6.LIZJ = r0     // Catch: java.lang.Exception -> L7a
            goto L50
        L77:
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L7a
            goto L50
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.13BV r0 = X.C13BV.INSTANCE
            goto L50
        L81:
            if (r5 == 0) goto L86
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.DMRiskyKeywordsService.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService
    public final void LIZJ(C0Z5G c0z5g) {
        this.LIZ.add(c0z5g);
    }

    @Override // com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService
    public final void LIZLLL(C869590Y9l c869590Y9l) {
        if (C0ZDX.LJJIJIIJIL(c869590Y9l)) {
            Map<String, String> localExt = c869590Y9l.getLocalExt();
            if (localExt != null) {
                localExt.put("key_group_chat_filtered_keyword_revealed_before", "1");
                return;
            }
            return;
        }
        C0Z5J.LJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService
    public final void LJFF(List<String> list) {
        this.LIZJ = list;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C0Z5C(list, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService
    public final boolean LIZ(C869590Y9l c869590Y9l, boolean z) {
        TextContent textContent;
        GreetingCardInfoComponent greetingCardInfoComponentLJI;
        if (((Boolean) this.LIZIZ.getValue()).booleanValue() && c869590Y9l.getLocalExt().containsKey("debug_risk_message")) {
            return true;
        }
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        if (C0ZDX.LJJIJIIJIL(c869590Y9l) && this.LJ.LJIIJ()) {
            Map<String, String> localExt = c869590Y9l.getLocalExt();
            String str = null;
            if (localExt != null) {
                str = localExt.get("key_group_chat_filtered_keyword_revealed_before");
            }
            if (!Intrinsics.LJFF(str, "1")) {
                if (Intrinsics.LJFF(c869590Y9l.getScene(), "greeting_card") && (greetingCardInfoComponentLJI = C0ZDX.LJI(c869590Y9l)) != null) {
                    C0Z5G c0z5g = C0Z5G.LL;
                    String str2 = greetingCardInfoComponentLJI.receiverText;
                    c0z5g.getClass();
                    if (C0Z5G.LIZIZ(str2) || C0Z5G.LIZIZ(greetingCardInfoComponentLJI.senderText) || C0Z5G.LIZIZ(greetingCardInfoComponentLJI.contentText)) {
                        return true;
                    }
                    return false;
                }
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, TextContent.class);
                if ((orParseJsonContent instanceof TextContent) && (textContent = (TextContent) orParseJsonContent) != null) {
                    String text = textContent.getText();
                    if (text != null) {
                        C0Z5G.LL.getClass();
                        if (C0Z5G.LIZIZ(text)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            }
        }
        if (C0Z5J.LIZ(c869590Y9l) == null) {
            return false;
        }
        if (!C0Z5J.LIZLLL(c869590Y9l) || z) {
            return true;
        }
        return false;
    }
}
