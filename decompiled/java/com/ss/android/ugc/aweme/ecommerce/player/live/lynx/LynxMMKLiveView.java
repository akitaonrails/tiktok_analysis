package com.ss.android.ugc.aweme.ecommerce.player.live.lynx;

import X.C1311730kEt;
import X.C1775590wJ3;
import X.C1851070yGn;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C418601k0;
import X.EnumC1782940wUu;
import X.EnumC2176021AEe;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import j27.s;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxMMKLiveView extends UISimpleView<C1775590wJ3> {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        C1775590wJ3 c1775590wJ3 = (C1775590wJ3) this.mView;
        if (c1775590wJ3.LLJJIJIIJIL && !c1775590wJ3.LLJJJ) {
            c1775590wJ3.LJIJI();
        }
        if (c1775590wJ3.LLJJJJJIL) {
            c1775590wJ3.LLJJJJJIL = false;
            C418601k0.LIZ(new AwS576S0100000_32(c1775590wJ3, 22));
        }
    }

    public LynxMMKLiveView(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        if (c1311730kEt != null) {
            if (c1311730kEt.LJIIIIZZ("qualities")) {
                C1775590wJ3 c1775590wJ3 = (C1775590wJ3) this.mView;
                if (c1775590wJ3.isAttachedToWindow()) {
                    c1775590wJ3.LJIIJ(c1775590wJ3.LLJJIJI, null);
                }
                if (c1311730kEt == null) {
                    return;
                }
            }
            if (c1311730kEt.LJIIIIZZ("poster")) {
                C1775590wJ3 c1775590wJ32 = (C1775590wJ3) this.mView;
                boolean z = C1775590wJ3.LLLIL;
                c1775590wJ32.LJIILIIL(false);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context != null) {
            return new C1775590wJ3(context, this.mContext.LJIILJJIL());
        }
        "Required context must be non-null".toString();
        throw new IllegalArgumentException("Required context must be non-null");
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap) {
        String string;
        C1775590wJ3 c1775590wJ3 = (C1775590wJ3) this.mView;
        c1775590wJ3.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        c1775590wJ3.LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
        if (readableMap != null) {
            string = readableMap.getString("uuid");
        } else {
            string = null;
        }
        if (TextUtils.equals(string, c1775590wJ3.LLJJIII) && !(!c1775590wJ3.LIZIZ())) {
            c1775590wJ3.LJIILL(EnumC2176021AEe.PLAY_SELECTION);
        }
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap) {
        ((C1775590wJ3) this.mView).LJIILLIIL(readableMap);
    }

    @InterfaceC1312540kGC(name = "actiontype")
    public final void setActionType(String str) {
        ((C1775590wJ3) this.mView).setActionType(str);
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        ((C1775590wJ3) this.mView).setAutoPlay(bool);
    }

    @InterfaceC1312540kGC(name = "enterfrommerge")
    public final void setEnterFromMerge(String str) {
        ((C1775590wJ3) this.mView).setEnterFromMerge(str);
    }

    @InterfaceC1312540kGC(name = "entermethod")
    public final void setEnterMethod(String str) {
        ((C1775590wJ3) this.mView).setEnterMethod(str);
    }

    @InterfaceC1312540kGC(name = "mute")
    public final void setMute(Boolean bool) {
        ((C1775590wJ3) this.mView).setMute(bool);
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectfit(String str) {
        ((C1775590wJ3) this.mView).setObjectfit(str);
    }

    @InterfaceC1312540kGC(name = "optimizetype")
    public final void setOptimizeType(String str) {
        ((C1775590wJ3) this.mView).setOptimizeType(str);
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        ((C1775590wJ3) this.mView).setPoster(str);
    }

    @InterfaceC1312540kGC(name = "qualities")
    public final void setQualities(String str) {
        ((C1775590wJ3) this.mView).setQualities(str);
    }

    @InterfaceC1312540kGC(name = "roomid")
    public final void setRoomId(String str) {
        ((C1775590wJ3) this.mView).setRoomId(str);
    }

    @InterfaceC1312540kGC(name = "streamurl")
    public final void setStreamURL(String str) {
        ((C1775590wJ3) this.mView).setStreamURL(str);
    }

    @InterfaceC1312540kGC(name = "uuid")
    public final void setUuId(String str) {
        ((C1775590wJ3) this.mView).setUuId(str);
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap) {
        C1775590wJ3 c1775590wJ3 = (C1775590wJ3) this.mView;
        c1775590wJ3.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        c1775590wJ3.LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
        c1775590wJ3.LJIIIZ();
        c1775590wJ3.LLJJJ = false;
        c1775590wJ3.LJIILIIL(false);
        if (c1775590wJ3.LLJJJJ > 0 && c1775590wJ3.LLJJJIL) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - c1775590wJ3.LLJJJJ);
            EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_STOP;
            c1775590wJ3.LJIJ(CardStruct.IStatusCode.DEFAULT, strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C418601k0.LIZ(new AwS576S0100000_32(c1775590wJ3, 23));
        C1851070yGn c1851070yGn = c1775590wJ3.LLJZIJLIL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "stop", null, null);
        }
    }
}
