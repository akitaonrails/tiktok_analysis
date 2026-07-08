package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.C05RV;
import X.C0PEM;
import X.C100100Zj;
import X.C1229100i5c;
import X.C1535205zi;
import X.C1559260qg8;
import X.C1636906b1;
import X.C1661306ex;
import X.C1684506ih;
import X.C1706806mI;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C457780HxI;
import X.C723600SZy;
import X.C909290Zln;
import X.C913380ZsO;
import X.EnumC1660606eq;
import X.EnumC1707006mK;
import X.InterfaceC0148002o;
import X.InterfaceC1646306cX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MessageListFooterViewModel extends AssemViewModel<C1636906b1> implements InterfaceC1646306cX {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1661306ex.class, null), true);
    public C1684506ih LLILLL;
    public volatile boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;

    @Override // X.InterfaceC1646306cX
    public final void EC() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        setStateImmediate(AFwS236S0000000_6.get$arr$(163));
    }

    @Override // X.InterfaceC1646306cX
    public final void bS() {
        setStateImmediate(AFwS236S0000000_6.get$arr$(164));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1636906b1(null, new C291001Au(Boolean.FALSE));
    }

    public final boolean vQ2() {
        SessionInfo sessionInfo;
        C909290Zln c909290Zln;
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
            if ((noticeFeatureLIZ != null ? noticeFeatureLIZ.LIZJ() : null) != C05RV.BUSINESS_INBOX && !sessionInfo.isMessageRequest() && !sessionInfo.isCreatedByOrFromLeadDmAdEntrance() && ((!(sessionInfo instanceof C909290Zln) || (c909290Zln = (C909290Zln) sessionInfo) == null || !c909290Zln.isTCM()) && !IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIIIZ(sessionInfo.getConversationId()))) {
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(sessionInfo.getSingleChatFromUser())) {
                    return true;
                }
                IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
                if (singleChatFromUser != null && singleChatFromUser.isBlock()) {
                    return true;
                }
                IMUser singleChatFromUser2 = sessionInfo.getSingleChatFromUser();
                if (singleChatFromUser2 != null && singleChatFromUser2.isBlocked()) {
                    return true;
                }
                if (!((Boolean) C100100Zj.LIZ.getValue()).booleanValue() || !C1229100i5c.LIZ.LJIIJJI(sessionInfo.getConversationId())) {
                    C1661306ex c1661306ex = (C1661306ex) this.LLILLJJLI.getValue();
                    return (c1661306ex == null || c1661306ex.LIZ(EnumC1660606eq.PRE_SHOWN_STICKER)) ? false : true;
                }
            }
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        SessionInfo sessionInfo;
        super.onPrepared();
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || !sessionInfo.isReportPage()) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1535205zi(this, null), 2);
        }
    }

    @Override // X.InterfaceC1646306cX
    public final synchronized void aO1(EnumC1707006mK enumC1707006mK) {
        withState(new AwS585S0100000_6(this, 97));
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        if (enumC1707006mK == EnumC1707006mK.NON_SCORE_UPDATING_ACTION) {
            return;
        }
        String str = this.LLIZ;
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1706806mI(enumC1707006mK, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:13:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig r10, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0I9Z
            if (r0 == 0) goto L70
            r8 = r11
            X.0I9Z r8 = (X.C0I9Z) r8
            int r2 = r8.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r8.LLIZ = r2
        L12:
            java.lang.Object r0 = r8.LLILZIL
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r8.LLIZ
            r6 = 1
            r5 = 0
            if (r1 == 0) goto L5f
            if (r1 != r6) goto L76
            com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem r2 = r8.LLILZ
            java.lang.Object r4 = r8.LLILLL
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r8.LLILLJJLI
            java.util.Collection r3 = (java.util.Collection) r3
            com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig r10 = r8.LL
            X.C155000ia.LIZIZ(r0)
        L2f:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 != 0) goto L37
        L33:
            java.util.List r0 = java.util.Collections.singletonList(r2)
        L37:
            X.C19719612Di.LJJI(r0, r3)
        L3a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r2 = r4.next()
            com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem r2 = (com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem) r2
            com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig r1 = r2.aimoji
            if (r1 == 0) goto L33
            java.util.List<java.lang.String> r0 = r1.expressions
            if (r0 == 0) goto L33
            r8.LL = r10
            r8.LLILLJJLI = r3
            r8.LLILLL = r4
            r8.LLILZ = r2
            r8.LLIZ = r6
            java.lang.Object r0 = r9.xQ2(r0, r1, r2, r8)
            if (r0 != r7) goto L2f
            return r7
        L5f:
            X.C155000ia.LIZIZ(r0)
            java.util.List<com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem> r0 = r10.preshownStickerItem
            if (r0 == 0) goto L7e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
            goto L3a
        L70:
            X.0I9Z r8 = new X.0I9Z
            r8.<init>(r9, r11)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7e:
            r3 = r5
            goto L82
        L80:
            java.util.List r3 = (java.util.List) r3
        L82:
            r0 = 27
            com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig r0 = com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig.LIZ(r10, r5, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel.wQ2(com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0046, code lost:
    
        r0 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a2 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c9 -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(java.util.List<java.lang.String> r32, com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig r33, com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem r34, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem>> r35) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel.xQ2(java.util.List, com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig, com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem, X.05Vn):java.lang.Object");
    }
}
