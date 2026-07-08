package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06P6;
import X.C09AY;
import X.C0ZZ5;
import X.C123100dR;
import X.C127K;
import X.C18JY;
import X.C1908480zlO;
import X.C19223110Ij;
import X.C19292410dm;
import X.C19EG;
import X.C201955140j;
import X.C20663515tR;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2230008oU;
import X.C234400vO;
import X.C259800zU;
import X.C291001Au;
import X.C385220F8m;
import X.C539110LCj;
import X.C856290XiV;
import X.C857660Xki;
import X.C857670Xkj;
import X.C857700Xkm;
import X.C896420ZEq;
import X.C901600ZYo;
import X.C901670ZYv;
import X.C902980Zbc;
import X.C903010Zbf;
import X.InterfaceC1335605Ko;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2257101DWa;
import X.InterfaceC539120LCk;
import X.InterfaceC902990Zbd;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS114S0100000_14;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$setNetworkObserverConfig$businessLogicConfig$1$1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.networkstate.ChatRoomNetworkStateViewModel;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS292S0300000_14 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS292S0300000_14 awS292S0300000_14, Object obj, Object obj2) {
        C902980Zbc c902980Zbc = (C902980Zbc) obj2;
        if (c902980Zbc.LLILLJJLI && !c902980Zbc.LLILLL && !c902980Zbc.LL) {
            HandlerHook.viewPost((ViewOnAttachStateChangeListenerC20604515jv) awS292S0300000_14.l0, new ARunnableS114S0100000_14((Fragment) awS292S0300000_14.l1, 17));
            AssemVMLazy assemVMLazy = (AssemVMLazy) awS292S0300000_14.l2;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
            assemVMLazy.getValue().setState(AFwS248S0000000_14.get$arr$(367));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS292S0300000_14 awS292S0300000_14, Object obj, Object obj2) {
        int iIntValue;
        Integer numLIZ;
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS292S0300000_14.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        C291001Au<Integer> c291001Au = ((C234400vO) assemVMLazy.getValue().getState()).LL;
        if (c291001Au != null && (numLIZ = c291001Au.LIZ()) != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -1;
        }
        ChatLinearLayoutManager chatLinearLayoutManager = (ChatLinearLayoutManager) awS292S0300000_14.l0;
        if (chatLinearLayoutManager != null) {
            chatLinearLayoutManager.LJIJ(iIntValue);
        }
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) ((C01GW) awS292S0300000_14.l2).getValue();
        if (chatroomEventAbility != null) {
            chatroomEventAbility.QU0(new C06P6(false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS292S0300000_14 awS292S0300000_14, Object obj, Object obj2) {
        ((AbstractC738140SxQ) obj).getLifecycle().addObserver(new CommonMessageListConfigKt$setNetworkObserverConfig$businessLogicConfig$1$1((SessionInfo) awS292S0300000_14.l0, (InterfaceC902990Zbd) awS292S0300000_14.l1, (Handler) awS292S0300000_14.l2));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS292S0300000_14 awS292S0300000_14, Object obj, Object obj2) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        Integer numValueOf;
        CreativeModel creativeModel2;
        PrivacySettingModel privacySettingModel2;
        ContentCheckInfo contentCheckInfo2;
        CreativeModel creativeModel3;
        PrivacySettingModel privacySettingModel3;
        ContentCheckInfo contentCheckInfo3;
        C127K c127k = (C127K) obj;
        Boolean bool = (Boolean) obj2;
        C19EG c19eg = (C19EG) awS292S0300000_14.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS292S0300000_14.l1;
        C19223110Ij c19223110Ij = (C19223110Ij) ((C259800zU) awS292S0300000_14.l2).element;
        if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (privacySettingModel3 = creativeModel3.privacySettingModel) != null && (contentCheckInfo3 = privacySettingModel3.contentCheckInfo) != null) {
            contentCheckInfo3.manualChangeSwitch = Intrinsics.LJFF(bool, Boolean.TRUE);
        }
        InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857670Xkj.LIZ();
        String uid = null;
        if (interfaceC2257101DWaLIZ != null) {
            uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
        }
        C856290XiV.LIZIZ(videoPublishEditModel, bool, uid);
        if (c19eg != null) {
            Integer numLJ = C857660Xki.LJ(videoPublishEditModel);
            if (numLJ != null && numLJ.intValue() < 0) {
                C385220F8m c385220F8m = C385220F8m.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("processContentCheckClick  remainCount:");
                sbLIZ.append(numLJ);
                sbLIZ.append(' ');
                C201955140j.LJII(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C857660Xki.LJIIIIZZ(c19eg, false, c19eg.getSupportFragmentManager());
                SpannableString spannableStringLIZIZ = C857660Xki.LIZIZ(c19eg, videoPublishEditModel);
                if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (contentCheckInfo = privacySettingModel.contentCheckInfo) != null && (numValueOf = Integer.valueOf(contentCheckInfo.usageCountToday)) != null && numValueOf.intValue() >= 3) {
                    if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (privacySettingModel2 = creativeModel2.privacySettingModel) != null && (contentCheckInfo2 = privacySettingModel2.contentCheckInfo) != null) {
                        contentCheckInfo2.manualChangeSwitch = false;
                    }
                    if (c127k != null) {
                        c127k.setSubtitle(spannableStringLIZIZ);
                    }
                    if (c19223110Ij != null) {
                        c19223110Ij.LJI = spannableStringLIZIZ;
                    }
                } else {
                    if (c127k != null) {
                        c127k.setSubtitle(spannableStringLIZIZ);
                    }
                    if (c19223110Ij != null) {
                        c19223110Ij.LJI = spannableStringLIZIZ;
                    }
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        C857700Xkm.LIZ.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putInt("enable", zBooleanValue ? 1 : 0);
                        C20684815ws.LJIILL("content_check_toggle_click", bundle);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS292S0300000_14 awS292S0300000_14, Object obj, Object obj2) {
        String str;
        String pushSentString;
        InnerPushUITemplate uiTemplate;
        LightInteractionCommonResource lightInteractionCommonResource = (LightInteractionCommonResource) obj2;
        String str2 = null;
        if (lightInteractionCommonResource != null && (pushSentString = lightInteractionCommonResource.getPushSentString()) != null && pushSentString.length() > 0 && (uiTemplate = ((InnerPushMessage) awS292S0300000_14.l0).getUiTemplate()) != null) {
            uiTemplate.setContent(pushSentString);
        }
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, (InnerPushMessage) awS292S0300000_14.l0, "click", 3);
        InnerPushUITemplate uiTemplate2 = ((InnerPushMessage) awS292S0300000_14.l0).getUiTemplate();
        if (uiTemplate2 != null) {
            str = uiTemplate2.rightSchemaUrl;
        } else {
            str = null;
        }
        InnerPushUITemplate uiTemplate3 = ((InnerPushMessage) awS292S0300000_14.l0).getUiTemplate();
        if (uiTemplate3 != null) {
            if (C123100dR.LIZ(str)) {
                InnerPushUITemplate uiTemplate4 = ((InnerPushMessage) awS292S0300000_14.l0).getUiTemplate();
                if (uiTemplate4 != null) {
                    str2 = uiTemplate4.rightSchemaUrl;
                }
            } else {
                InnerPushUITemplate uiTemplate5 = ((InnerPushMessage) awS292S0300000_14.l0).getUiTemplate();
                if (uiTemplate5 != null) {
                    str2 = uiTemplate5.globalSchemaUrl;
                }
            }
            uiTemplate3.setGlobalSchemaUrl(str2);
        }
        C539110LCj.LIZIZ((InterfaceC539120LCk) awS292S0300000_14.l1, (InnerPushMessage) awS292S0300000_14.l0, new int[]{2}, false, 12);
        ((C896420ZEq) awS292S0300000_14.l2).LJIIIIZZ((InnerPushMessage) awS292S0300000_14.l0, "inner_push");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS292S0300000_14 awS292S0300000_14, Object obj, Object obj2) {
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        ((C259800zU) awS292S0300000_14.l0).element = obj2;
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
        if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
            interfaceC1335605KoLIZIZ.LIZJ(((C901670ZYv) awS292S0300000_14.l1).LIZ);
        }
        ((C901600ZYo) awS292S0300000_14.l2).LJI(((C901670ZYv) awS292S0300000_14.l1).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS292S0300000_14(C259800zU c259800zU, C259800zU<C2230008oU> c259800zU2, C901670ZYv c901670ZYv, C901600ZYo c901600ZYo) {
        super(2);
        this.$t = c901600ZYo;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c901670ZYv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS292S0300000_14(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2, Fragment fragment, AssemVMLazy<C902980Zbc, ChatRoomNetworkStateViewModel> assemVMLazy) {
        super(2);
        this.$t = assemVMLazy;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = viewOnAttachStateChangeListenerC20604515jv2;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS292S0300000_14(C19EG c19eg, C19EG c19eg2, VideoPublishEditModel videoPublishEditModel, C259800zU<C19223110Ij> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS292S0300000_14(SessionInfo sessionInfo, C903010Zbf c903010Zbf, BPEAHandler bPEAHandler, int i) {
        super(2);
        this.$t = i;
        this.l0 = sessionInfo;
        this.l1 = c903010Zbf;
        this.l2 = bPEAHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS292S0300000_14(ChatLinearLayoutManager chatLinearLayoutManager, ChatLinearLayoutManager chatLinearLayoutManager2, AssemVMLazy<C234400vO, CollapseInlineVM> assemVMLazy, C01GW<? extends ChatroomEventAbility> c01gw) {
        super(2);
        this.$t = c01gw;
        this.l0 = chatLinearLayoutManager;
        this.l1 = chatLinearLayoutManager2;
        this.l2 = assemVMLazy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS292S0300000_14(InnerPushMessage innerPushMessage, C20663515tR c20663515tR, C896420ZEq c896420ZEq, int i) {
        super(2);
        this.$t = i;
        this.l0 = innerPushMessage;
        this.l1 = c20663515tR;
        this.l2 = c896420ZEq;
    }
}
