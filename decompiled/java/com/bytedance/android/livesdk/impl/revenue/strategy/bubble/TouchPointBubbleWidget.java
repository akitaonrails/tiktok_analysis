package com.bytedance.android.livesdk.impl.revenue.strategy.bubble;

import X.AbstractC253200yQ;
import X.AbstractC253300yR;
import X.C001A;
import X.C0IJT;
import X.C1148030fyr;
import X.C1161920gLG;
import X.C1954807lC;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C252600yK;
import X.C252700yL;
import X.C252800yM;
import X.C252900yN;
import X.C253000yO;
import X.C253100yP;
import X.C253400yS;
import X.C253500yT;
import X.C253600yU;
import X.C253800yW;
import X.C254000yY;
import X.C254700yf;
import X.C474500IjA;
import X.C5183020f;
import X.C776250Uch;
import X.C784440Upu;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuideTarget;
import com.bytedance.android.livesdk.model.message.StyleDictateParams;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.BagItem;
import webcast.data.BubbleCondition;
import webcast.data.EntryData;

/* JADX INFO: loaded from: classes.dex */
public final class TouchPointBubbleWidget extends LiveRecyclableWidget implements OnIMMessageListener {
    public static final Map<String, C253100yP> LLILLJJLI = C2097608Jq.LJIIIIZZ(new Pair("Gift", new C253100yP("gift_icon")), new Pair("Decoration", new C253100yP("decoration")));
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "tp_bubble";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.GIFT_GUIDE_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    public static void x1(GiftGuideMessage giftGuideMessage) {
        String string;
        long j;
        StyleDictateParams styleDictateParams = giftGuideMessage.styleDictateParams;
        if (styleDictateParams == null) {
            return;
        }
        C253100yP c253100yP = LLILLJJLI.get(styleDictateParams.pointingTargetType);
        if (c253100yP == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown pointingTargetType: ");
            sbLIZ.append(styleDictateParams.pointingTargetType);
            C20441214yg.LIZIZ("TouchPointBubbleWidget", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String str = styleDictateParams.bubbleContentId;
        String str2 = c253100yP.LIZ;
        GuideTarget guideTarget = giftGuideMessage.guideTarget;
        if (guideTarget != null) {
            string = Long.valueOf(guideTarget.targetId).toString();
        } else {
            string = null;
        }
        GuideTarget guideTarget2 = giftGuideMessage.guideTarget;
        if (guideTarget2 != null) {
            j = guideTarget2.periodId;
        } else {
            j = 0;
        }
        C784440Upu.LIZ().LIZIZ(new C254700yf(giftGuideMessage, str, str2, string, j));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.GIFT_GUIDE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        String str;
        String str2;
        AbstractC253300yR c252600yK;
        List<BubbleCondition> list;
        AbstractC253200yQ c252700yL;
        IEffectService iEffectService;
        IRoomStickerOuterService iRoomStickerOuterService;
        String str3;
        Long lLJIILIIL;
        if (!(iMessage instanceof GiftGuideMessage)) {
            return;
        }
        GiftGuideMessage giftGuideMessage = (GiftGuideMessage) iMessage;
        if (giftGuideMessage.guideMessageType != 1 || (dataChannel = this.dataChannel) == null) {
            return;
        }
        StyleDictateParams styleDictateParams = giftGuideMessage.styleDictateParams;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bubble_im_receive");
        if (styleDictateParams == null || (str = styleDictateParams.bubbleContentId) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "bubble_content_id");
        c474500IjALIZ.LJJII(String.valueOf(giftGuideMessage.getMessageId()), "message_id");
        c474500IjALIZ.LJJII(giftGuideMessage.biz, "message_type");
        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        DataChannel dataChannel2 = this.dataChannel;
        if (giftGuideMessage.guideMessageType != 1) {
            c252600yK = new C253000yO("not_tp_bubble");
        } else {
            StyleDictateParams styleDictateParams2 = giftGuideMessage.styleDictateParams;
            if (styleDictateParams2 == null) {
                c252600yK = new C253000yO("params_null");
            } else if (styleDictateParams2.bubbleContentId.length() == 0) {
                c252600yK = new C253000yO("bubble_content_id_empty");
            } else if (styleDictateParams2.pointingTargetType.length() == 0) {
                c252600yK = new C253000yO("pointing_target_type_empty");
            } else if (styleDictateParams2.bubbleDecorationList.isEmpty()) {
                c252600yK = new C253000yO("decoration_empty");
            } else {
                EntryData entryData = styleDictateParams2.entryData;
                if (entryData != null && (list = entryData.bubbleCondition) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<BubbleCondition> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            BubbleCondition next = it2.next();
                            int i = next.type;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 4) {
                                            if (i == 5 && (lLJIILIIL = C2095008Iq.LJIILIIL(next.giftId)) != null) {
                                                long jLongValue = lLJIILIIL.longValue();
                                                String str4 = next.uri;
                                                if (str4.length() == 0) {
                                                    c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                                    };
                                                } else {
                                                    IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                                                    if (iGiftService == null) {
                                                        c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                                        };
                                                    } else if (C252800yM.LIZ(jLongValue, str4, iGiftService.getGiftPages())) {
                                                        c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                                        };
                                                    } else {
                                                        c252700yL = new C252700yL(new C253800yW(jLongValue, str4));
                                                    }
                                                }
                                            } else {
                                                c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                                };
                                            }
                                        } else {
                                            Integer numLJIIJJI = C2095008Iq.LJIIJJI(next.bagItemType);
                                            if (numLJIIJJI != null) {
                                                int iIntValue = numLJIIJJI.intValue();
                                                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(next.bagItemId);
                                                if (lLJIILIIL2 != null) {
                                                    long jLongValue2 = lLJIILIIL2.longValue();
                                                    List<BagItem> list2 = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
                                                    if (list2 != null && !list2.isEmpty()) {
                                                        for (BagItem bagItem : list2) {
                                                            if (bagItem.itemType == iIntValue && bagItem.itemId == jLongValue2) {
                                                                c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                                                };
                                                                break;
                                                            }
                                                        }
                                                        c252700yL = new C252700yL(new C254000yY(iIntValue, jLongValue2));
                                                    } else {
                                                        c252700yL = new C252700yL(new C254000yY(iIntValue, jLongValue2));
                                                    }
                                                } else {
                                                    c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                                    };
                                                }
                                            } else {
                                                c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                                };
                                            }
                                        }
                                    } else {
                                        String str5 = next.resourceId;
                                        if (str5.length() == 0 || (iRoomStickerOuterService = (IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)) == null) {
                                            c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                            };
                                        } else {
                                            RoomSticker roomStickerRy1 = iRoomStickerOuterService.ry1(dataChannel2);
                                            if (roomStickerRy1 != null) {
                                                str3 = roomStickerRy1.LIZ;
                                            } else {
                                                str3 = null;
                                            }
                                            if (Intrinsics.LJFF(str3, str5)) {
                                                c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                                };
                                            } else {
                                                c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                                };
                                            }
                                        }
                                    }
                                } else {
                                    String str6 = next.resourceId;
                                    if (str6.length() == 0 || (iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class)) == null || iEffectService.isWearSpecialEffect(Collections.singletonList(str6))) {
                                        c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                        };
                                    } else {
                                        c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                        };
                                    }
                                }
                            } else {
                                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(next.bagItemType);
                                if (numLJIIJJI2 != null) {
                                    int iIntValue2 = numLJIIJJI2.intValue();
                                    Long lLJIILIIL3 = C2095008Iq.LJIILIIL(next.bagItemId);
                                    if (lLJIILIIL3 != null) {
                                        long jLongValue3 = lLJIILIIL3.longValue();
                                        List<BagItem> list3 = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
                                        if (list3 != null && !list3.isEmpty()) {
                                            for (BagItem bagItem2 : list3) {
                                                if (bagItem2.itemType == iIntValue2 && bagItem2.itemId == jLongValue3) {
                                                    c252700yL = new AbstractC253200yQ() { // from class: X.00yT
                                                    };
                                                    break;
                                                }
                                            }
                                            c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                            };
                                        } else {
                                            c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                            };
                                        }
                                    } else {
                                        c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                        };
                                    }
                                } else {
                                    c252700yL = new AbstractC253200yQ() { // from class: X.00yS
                                    };
                                }
                            }
                            if (!(c252700yL instanceof C253500yT)) {
                                if (c252700yL instanceof C253400yS) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("condition_failed_type_");
                                    sbLIZ.append(next.type);
                                    c252600yK = new C253000yO(C2188811AlT.LIZIZ(sbLIZ));
                                    break;
                                }
                                if (c252700yL instanceof C252700yL) {
                                    arrayList.add(((C252700yL) c252700yL).LIZ);
                                } else {
                                    throw new C1954807lC();
                                }
                            }
                        } else if (!arrayList.isEmpty()) {
                            c252600yK = new C252600yK(new C5183020f((List) arrayList, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 125));
                        }
                    }
                } else {
                    c252600yK = new AbstractC253300yR() { // from class: X.00yU
                    };
                }
            }
        }
        if (c252600yK instanceof C253600yU) {
            x1(giftGuideMessage);
            return;
        }
        if (c252600yK instanceof C253000yO) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("validation failed: ");
            sbLIZ2.append(((C253000yO) c252600yK).LIZ);
            C20441214yg.LIZIZ("TouchPointBubbleWidget", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (c252600yK instanceof C252600yK) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("validation async pending: ");
            C252600yK c252600yK2 = (C252600yK) c252600yK;
            sbLIZ3.append(c252600yK2.LIZ);
            C20441214yg.LIZIZ("TouchPointBubbleWidget", C2188811AlT.LIZIZ(sbLIZ3));
            c252600yK2.LIZIZ.invoke(new C252900yN(this, iMessage, c252600yK));
            return;
        }
        throw new C1954807lC();
    }
}
