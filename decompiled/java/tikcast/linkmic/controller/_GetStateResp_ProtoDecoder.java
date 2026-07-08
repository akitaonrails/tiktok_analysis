package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
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
import tikcast.linkmic.common._WallpaperImageState_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetStateResp_ProtoDecoder implements C0IMD<GetStateResp> {
    @Override // X.C0IMD
    public final void LIZ(GetStateResp getStateResp) {
        GetStateResp getStateResp2 = getStateResp;
        LayoutState layoutState = getStateResp2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<LinkUserState> list = getStateResp2.states;
        if (list == null) {
            getStateResp2.states = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LinkUserState> it2 = getStateResp2.states.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PosIdentity> list2 = getStateResp2.uiPos;
        if (list2 == null) {
            getStateResp2.uiPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<PosIdentity> it3 = getStateResp2.uiPos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<SpotInfo> list3 = getStateResp2.spotList;
        if (list3 == null) {
            getStateResp2.spotList = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (SpotInfo spotInfo : getStateResp2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        if (getStateResp2.audioMutedRemoteChannels == null) {
            getStateResp2.audioMutedRemoteChannels = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GetStateResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetStateResp getStateResp = new GetStateResp();
        getStateResp.uiPos = new ArrayList();
        getStateResp.audioMutedRemoteChannels = new ArrayList();
        getStateResp.states = new ArrayList();
        getStateResp.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        getStateResp.version = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        getStateResp.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        getStateResp.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        getStateResp.states.add(_LinkUserState_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        getStateResp.backGroundImage = _BackGroundImageState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        getStateResp.wallpaperImage = _WallpaperImageState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        getStateResp.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        getStateResp.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        getStateResp.audioMutedRemoteChannels.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getStateResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetStateResp getStateResp, List list) {
    }
}
