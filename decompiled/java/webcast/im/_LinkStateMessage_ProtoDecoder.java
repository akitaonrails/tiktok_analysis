package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._BackGroundImageState_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._LinkUserState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkStateMessage_ProtoDecoder implements C0IMD<LinkStateMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkStateMessage linkStateMessage) {
        LinkStateMessage linkStateMessage2 = linkStateMessage;
        CommonMessageData commonMessageData = linkStateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LayoutState layoutState = linkStateMessage2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<LinkUserState> list = linkStateMessage2.userStates;
        if (list == null) {
            linkStateMessage2.userStates = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LinkUserState> it2 = linkStateMessage2.userStates.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PosIdentity> list2 = linkStateMessage2.uiPos;
        if (list2 == null) {
            linkStateMessage2.uiPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<PosIdentity> it3 = linkStateMessage2.uiPos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<SpotInfo> list3 = linkStateMessage2.spotList;
        if (list3 == null) {
            linkStateMessage2.spotList = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (SpotInfo spotInfo : linkStateMessage2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        if (linkStateMessage2.audioMutedRemoteChannels == null) {
            linkStateMessage2.audioMutedRemoteChannels = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LinkStateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkStateMessage linkStateMessage = new LinkStateMessage();
        linkStateMessage.audioMutedRemoteChannels = new ArrayList();
        linkStateMessage.spotList = new ArrayList();
        linkStateMessage.userStates = new ArrayList();
        linkStateMessage.uiPos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkStateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkStateMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkStateMessage.scene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        linkStateMessage.version = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkStateMessage.needAck = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        linkStateMessage.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkStateMessage.userStates.add(_LinkUserState_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        linkStateMessage.clientSendTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkStateMessage.stateType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkStateMessage.background = _BackGroundImageState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkStateMessage.wallpaperUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        linkStateMessage.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        linkStateMessage.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 15:
                        linkStateMessage.audioMutedRemoteChannels.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 16:
                        linkStateMessage.linkerMode = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkStateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkStateMessage linkStateMessage, List list) {
    }
}
