package com.ss.android.ugc.aweme;

import X.C06AI;
import X.C06OD;
import X.C1645106cL;
import X.C1690806ji;
import X.C1698906l1;
import X.C19EG;
import X.C913140Zs0;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.IMChatNoticeHandlerFactory;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.pushguide.PushGuideFeature;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.List;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMChatNoticeHandlerFactoryImpl implements IMChatNoticeHandlerFactory {
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.IMChatNoticeHandlerFactory
    public final C1698906l1 LIZ(C19EG c19eg, C913140Zs0 c913140Zs0, ViewGroup viewGroup) {
        return new C1698906l1(c19eg, c913140Zs0, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06ji] */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.IMChatNoticeHandlerFactory
    public final C1690806ji LIZIZ(Context context, boolean z, SessionInfo sessionInfo) {
        return new C06OD<C06AI>(context, z, sessionInfo) { // from class: X.06ji
            public final Context LLILLL;
            public final boolean LLILZ;
            public final SessionInfo LLILZIL;
            public Class<?> LLILZLL;

            @Override // X.C06OD
            public final void LIZLLL() {
                Class<?> cls = this.LLILZLL;
                if (cls != null) {
                    PopupManager.LIZJ(cls);
                }
            }

            @Override // X.C06OD
            public final Object LJI(C06OO c06oo) {
                Class<?> clsLJFF;
                PopupInstanceConfig popupInstanceConfig;
                final C06ME c06me = new C06ME();
                if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("dm");
                    unifiedAuthPopupConfigLIZJ.setSceneId("dm");
                    unifiedAuthPopupConfigLIZJ.setEnterFrom("notification_page");
                    List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                    if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                        popupInstanceConfig.setPopupCombinationType(1);
                    }
                    this.LLILZLL = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LLILLL, new C10DS() { // from class: X.06jt
                        @Override // X.C10DS
                        public final void LIZ(String str) {
                        }

                        @Override // X.C10DS
                        public final void onShow(int i) {
                        }

                        @Override // X.C10DS
                        public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                            c06me.LLZLI();
                        }
                    }, unifiedAuthPopupConfigLIZJ);
                } else {
                    C1917290zzb c1917290zzb = new C1917290zzb(null, "notification_page", null, "dm", null, null, null, null, null, 8181);
                    PushGuideFeature pushGuideFeatureLIZ = PushGuideFeature.LIZ.LIZ();
                    if (pushGuideFeatureLIZ != null) {
                        clsLJFF = pushGuideFeatureLIZ.LJFF(this.LLILLL, c1917290zzb, new InterfaceC1917380zzk() { // from class: X.06ju
                            @Override // X.InterfaceC1917380zzk
                            public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                                c06me.LLZLI();
                            }
                        });
                    } else {
                        clsLJFF = null;
                    }
                    this.LLILZLL = clsLJFF;
                }
                if (this.LLILZLL == null) {
                    return null;
                }
                C1679506ht.LIZ.LIZLLL().storeLong(C1679506ht.LJIIIIZZ("key_last_dm_push_popup_display_timestamp"), System.currentTimeMillis());
                return c06me;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
            @Override // X.C06OD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJII(X.C06OO r4, X.InterfaceC1364105Vn r5) {
                /*
                    r3 = this;
                    X.06AI r4 = (X.C06AI) r4
                    X.06Mv r0 = r3.LL
                    boolean r0 = r0.isDebugMode()
                    r2 = 1
                    if (r0 != 0) goto L56
                    boolean r0 = r3.LLILZ
                    if (r0 != 0) goto L5b
                    android.content.Context r1 = r3.LLILLL
                    boolean r0 = X.C824390WVp.LIZJ(r1)
                    if (r0 != 0) goto L5b
                    X.06QK r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.pushguide.PushGuideFeature.LIZ
                    com.ss.android.ugc.aweme.im.saas.host.api.feature.pushguide.PushGuideFeature r0 = r0.LIZ()
                    if (r0 == 0) goto L5b
                    boolean r0 = r0.LJIIL(r1)
                    if (r0 != r2) goto L5b
                    com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager$Companion r0 = com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager.Companion
                    com.ss.android.ugc.aweme.services.IDMPushInlineMsgManager r0 = r0.getInst()
                    if (r0 == 0) goto L5b
                    boolean r0 = r0.checkUnifiedFreCtl()
                    if (r0 != r2) goto L5b
                    com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r3.LLILZIL
                    boolean r0 = r0.isFriendChat()
                    if (r0 == 0) goto L5b
                    com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r3.LLILZIL
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.getSingleChatFromUser()
                    r1 = 2
                    if (r0 == 0) goto L5b
                    int r0 = r0.getFollowStatus()
                    if (r0 != r1) goto L5b
                    int r0 = r4.LIZJ
                    if (r0 != r1) goto L5b
                    X.06ht r0 = X.C1679506ht.LIZ
                    boolean r0 = r0.LIZJ()
                    if (r0 == 0) goto L5b
                L56:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L5b:
                    r2 = 0
                    goto L56
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1690806ji.LJII(X.06OO, X.05Vn):java.lang.Object");
            }

            {
                super(EnumC1596306Mv.OUT_PUSH_GUIDE_POPUP);
                this.LLILLL = context;
                this.LLILZ = z;
                this.LLILZIL = sessionInfo;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.IMChatNoticeHandlerFactory
    public final C1645106cL LIZJ(ViewGroup viewGroup, SessionInfo sessionInfo, String str, AwS368S0200000_2 awS368S0200000_2, AwS368S0200000_2 awS368S0200000_22) {
        return new C1645106cL(viewGroup, sessionInfo, str, awS368S0200000_2, awS368S0200000_22);
    }
}
