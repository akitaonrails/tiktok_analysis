package com.ss.android.ugc.aweme.im.messagelist.impl;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0Z2W;
import X.C0ZT3;
import X.C0ZT4;
import X.C0ZTC;
import X.C13BV;
import X.C13IQ;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1661506ez;
import X.C1666706fp;
import X.C1697810uHb;
import X.C1708606ma;
import X.C276600Ask;
import X.C452501pT;
import X.C454640HsE;
import X.C457780HxI;
import X.C890330YwJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC896020ZDc;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.protocols.AIGroupShotGetStartedBannerDynamicCardProtocol;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardCenterProtocol;
import com.ss.android.ugc.aweme.im.messagelist.protocols.GroupTypingIndicatorProtocol;
import com.ss.android.ugc.aweme.im.messagelist.protocols.MessageRequestFakeInlineMsgProtocol;
import com.ss.android.ugc.aweme.im.messagelist.protocols.SingleTypingIndicatorProtocol;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice.SystemNoticeProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationBannerProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.preshown.PreshownStickerBannerProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.ShareEffectProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedShareSimpleProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileProtocol;
import com.ss.android.ugc.aweme.im.service.legacy.IMMediaCardBridge;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageListImpl implements IMMessageListApi {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0ZT4());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C0ZTC());

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi
    public final InterfaceC896020ZDc LIZ() {
        return (InterfaceC896020ZDc) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi
    public final C0Z2W LIZIZ() {
        return (C0Z2W) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi
    public final void LIZJ(Fragment fragment, Assembler assembler, C457780HxI c457780HxI, SessionInfo sessionInfo, boolean z) {
        List<Object> listLIZ;
        List<Object> listLIZIZ;
        final IMMessageListProtocol iMMessageListProtocolLJFF;
        final IMMessageListProtocol iMMessageListProtocolLJ;
        final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        assembler.vQ2(fragment, AFwS236S0000000_6.get$arr$(418));
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        C13IQ<? extends AbstractC738140SxQ> c13iqLJFF = c454640HsE.LIZIZ().getImSocialAvatarService().LJFF();
        if (c13iqLJFF != null) {
            assembler.vQ2(fragment, new AwS581S0100000_2((C13IQ) c13iqLJFF, (C13IQ<? extends UISlotAssem>) 430));
        }
        final CollapseInlineProtocol collapseInlineProtocol = new CollapseInlineProtocol(fragment, c457780HxI);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(collapseInlineProtocol));
        Lifecycle lifecycle = fragment.getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, collapseInlineProtocol);
                    }
                }
            });
        }
        final PreshownStickerBannerProtocol preshownStickerBannerProtocol = new PreshownStickerBannerProtocol(fragment, c457780HxI);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(preshownStickerBannerProtocol));
        Lifecycle lifecycle2 = fragment.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, preshownStickerBannerProtocol);
                    }
                }
            });
        }
        final TypingRecommendationBannerProtocol typingRecommendationBannerProtocol = new TypingRecommendationBannerProtocol(fragment, c457780HxI);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(typingRecommendationBannerProtocol));
        Lifecycle lifecycle3 = fragment.getLifecycle();
        if (lifecycle3 != null) {
            lifecycle3.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, typingRecommendationBannerProtocol);
                    }
                }
            });
        }
        if (sessionInfo.isGroupChat() && C1666706fp.LIZIZ()) {
            final GroupTypingIndicatorProtocol groupTypingIndicatorProtocol = new GroupTypingIndicatorProtocol();
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(groupTypingIndicatorProtocol));
            Lifecycle lifecycle4 = fragment.getLifecycle();
            if (lifecycle4 != null) {
                lifecycle4.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, groupTypingIndicatorProtocol);
                        }
                    }
                });
            }
        } else if (sessionInfo.isSingleChat() && C1661506ez.LIZIZ()) {
            final SingleTypingIndicatorProtocol singleTypingIndicatorProtocol = new SingleTypingIndicatorProtocol();
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(singleTypingIndicatorProtocol));
            Lifecycle lifecycle5 = fragment.getLifecycle();
            if (lifecycle5 != null) {
                lifecycle5.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$5
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, singleTypingIndicatorProtocol);
                        }
                    }
                });
            }
        }
        final ProfileProtocol profileProtocol = new ProfileProtocol(c457780HxI);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(profileProtocol));
        Lifecycle lifecycle6 = fragment.getLifecycle();
        if (lifecycle6 != null) {
            lifecycle6.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$6
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, profileProtocol);
                    }
                }
            });
        }
        IMAIGroupShotBridgeApi.LIZ.getClass();
        IMAIGroupShotBridgeApi iMAIGroupShotBridgeApiLIZ = C1708606ma.LIZ();
        if (iMAIGroupShotBridgeApiLIZ != null && (iMMessageListProtocolLJ = iMAIGroupShotBridgeApiLIZ.LJ(fragment)) != null && (iMMessageListProtocolLJ instanceof IMMessageListProtocol)) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(iMMessageListProtocolLJ));
            Lifecycle lifecycle7 = fragment.getLifecycle();
            if (lifecycle7 != null) {
                lifecycle7.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$lambda$2$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, iMMessageListProtocolLJ);
                        }
                    }
                });
            }
        }
        IMAIGroupShotBridgeApi iMAIGroupShotBridgeApiLIZ2 = C1708606ma.LIZ();
        if (iMAIGroupShotBridgeApiLIZ2 != null && (iMMessageListProtocolLJFF = iMAIGroupShotBridgeApiLIZ2.LJFF(fragment)) != null && (iMMessageListProtocolLJFF instanceof IMMessageListProtocol)) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(iMMessageListProtocolLJFF));
            Lifecycle lifecycle8 = fragment.getLifecycle();
            if (lifecycle8 != null) {
                lifecycle8.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$lambda$4$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, iMMessageListProtocolLJFF);
                        }
                    }
                });
            }
        }
        final UnifiedShareSimpleProtocol unifiedShareSimpleProtocol = new UnifiedShareSimpleProtocol(sessionInfo);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, C1697810uHb.LJIILJJIL(unifiedShareSimpleProtocol));
        Lifecycle lifecycle9 = fragment.getLifecycle();
        if (lifecycle9 != null) {
            lifecycle9.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$7
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, unifiedShareSimpleProtocol);
                    }
                }
            });
        }
        final ShareEffectProtocol shareEffectProtocol = new ShareEffectProtocol();
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, C1697810uHb.LJIILJJIL(shareEffectProtocol));
        Lifecycle lifecycle10 = fragment.getLifecycle();
        if (lifecycle10 != null) {
            lifecycle10.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$8
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, shareEffectProtocol);
                    }
                }
            });
        }
        final SystemNoticeProtocol systemNoticeProtocol = new SystemNoticeProtocol(fragment);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(systemNoticeProtocol));
        Lifecycle lifecycle11 = fragment.getLifecycle();
        if (lifecycle11 != null) {
            lifecycle11.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$9
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, systemNoticeProtocol);
                    }
                }
            });
        }
        assembler.vQ2(fragment, AFwS248S0000000_14.get$arr$(390));
        C13IQ<? extends AbstractC738140SxQ> c13iqLIZJ = c454640HsE.LIZIZ().getImAvatarDuoService().LIZJ();
        if (c13iqLIZJ != null) {
            assembler.vQ2(fragment, new AwS581S0100000_2((C13IQ) c13iqLIZJ, (C13IQ<? extends UISlotAssem>) 431));
        }
        IMMediaCardBridge.LIZ.getClass();
        IMMediaCardBridge value = C0ZT3.LIZIZ.getValue();
        if (value == null || (listLIZ = value.LIZ(c457780HxI)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        ArrayList<SkeletonMessageListProtocol> arrayList = new ArrayList();
        for (Object obj : listLIZ) {
            if (obj instanceof SkeletonMessageListProtocol) {
                arrayList.add(obj);
            }
        }
        for (final SkeletonMessageListProtocol skeletonMessageListProtocol : arrayList) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, C1697810uHb.LJIILJJIL(skeletonMessageListProtocol));
            Lifecycle lifecycle12 = fragment.getLifecycle();
            if (lifecycle12 != null) {
                lifecycle12.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$lambda$6$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, skeletonMessageListProtocol);
                        }
                    }
                });
            }
        }
        final DynamicCardCenterProtocol dynamicCardCenterProtocol = new DynamicCardCenterProtocol(fragment);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(dynamicCardCenterProtocol));
        Lifecycle lifecycle13 = fragment.getLifecycle();
        if (lifecycle13 != null) {
            lifecycle13.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$10
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, dynamicCardCenterProtocol);
                    }
                }
            });
        }
        if (C276600Ask.LIZ()) {
            final AIGroupShotGetStartedBannerDynamicCardProtocol aIGroupShotGetStartedBannerDynamicCardProtocol = new AIGroupShotGetStartedBannerDynamicCardProtocol(fragment);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(aIGroupShotGetStartedBannerDynamicCardProtocol));
            Lifecycle lifecycle14 = fragment.getLifecycle();
            if (lifecycle14 != null) {
                lifecycle14.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$11
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, aIGroupShotGetStartedBannerDynamicCardProtocol);
                        }
                    }
                });
            }
        }
        IMChatListApi.LJJIII.getClass();
        if (C890330YwJ.LIZ().LJJIJIIJIL(fragment.getContext()) && sessionInfo.isMessageRequest() && !z) {
            final MessageRequestFakeInlineMsgProtocol messageRequestFakeInlineMsgProtocol = new MessageRequestFakeInlineMsgProtocol(fragment);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, C1697810uHb.LJIILJJIL(messageRequestFakeInlineMsgProtocol));
            Lifecycle lifecycle15 = fragment.getLifecycle();
            if (lifecycle15 != null) {
                lifecycle15.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$$inlined$registerProtocol$12
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMMessageListProtocol.class, messageRequestFakeInlineMsgProtocol);
                        }
                    }
                });
            }
        }
        IMMediaCardBridge.LIZ.getClass();
        IMMediaCardBridge value2 = C0ZT3.LIZIZ.getValue();
        if (value2 == null || (listLIZIZ = value2.LIZIZ(fragment, c457780HxI)) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        ArrayList<SkeletonMessageListProtocol> arrayList2 = new ArrayList();
        for (Object obj2 : listLIZIZ) {
            if (obj2 instanceof SkeletonMessageListProtocol) {
                arrayList2.add(obj2);
            }
        }
        for (final SkeletonMessageListProtocol skeletonMessageListProtocol2 : arrayList2) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, C1697810uHb.LJIILJJIL(skeletonMessageListProtocol2));
            Lifecycle lifecycle16 = fragment.getLifecycle();
            if (lifecycle16 != null) {
                lifecycle16.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.assembler.MessageCellKt$messageCell$lambda$8$lambda$7$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, SkeletonMessageListProtocol.class, skeletonMessageListProtocol2);
                        }
                    }
                });
            }
        }
        assembler.vQ2(fragment, new AwS593S0100000_14(sessionInfo, 223));
        assembler.vQ2(fragment, AFwS229S0000000_2.get$arr$(623));
        assembler.QQ2(fragment, AFwS248S0000000_14.get$arr$(392));
        assembler.QQ2(fragment, AFwS248S0000000_14.get$arr$(391));
    }
}
