package com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui;

import X.C14EU;
import X.C1ACD;
import X.C2188811AlT;
import X.C658550PsL;
import X.C658660PsW;
import X.C7740030o;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.reflect.TypeToken;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive;
import j27.s;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxEcomSearchLive extends LynxSearchLive {
    public static final /* synthetic */ int LLILLL = 0;
    public volatile int LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    @InterfaceC1312540kGC(name = "soundControl")
    public void setSoundControl(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        EventBus.LIZLLL().LJJI(this);
        C658550PsL c658550PsL = (C658550PsL) this.mView;
        if (c658550PsL != null) {
            c658550PsL.LJIJJ();
        }
    }

    public LynxEcomSearchLive(s sVar) {
        super(sVar);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    public final C658550PsL LJJIIZI(final Context context) {
        C658550PsL c658550PsL = new C658550PsL(context) { // from class: X.0PsZ
        };
        c658550PsL.setEventChangeListener(new AwS624S0100000_10(this, 25));
        c658550PsL.setFirstFrameHandler(new AwS554S0100000_10(this, 1005));
        return c658550PsL;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    @InterfaceC1967107nB
    public void getPlayerTag(Callback callback) {
        String playerTag;
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C1ACD c1acd = ((C658550PsL) this.mView).getDataProvider().LJIIIIZZ;
        if (c1acd == null || (playerTag = c1acd.getPlayerTag()) == null) {
            playerTag = "";
        }
        javaOnlyMap.putString("player_tag", playerTag);
        callback.invoke(0, javaOnlyMap);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWindowVisibilityChanged(C658660PsW c658660PsW) {
        String roomId;
        String roomId2;
        C658550PsL c658550PsL = (C658550PsL) this.mView;
        if (c658550PsL != null) {
            roomId = c658550PsL.getRoomId();
        } else {
            roomId = null;
        }
        if (Intrinsics.LJFF(roomId, c658660PsW.LIZ)) {
            C658550PsL c658550PsL2 = (C658550PsL) this.mView;
            if (c658550PsL2 != null && (roomId2 = c658550PsL2.getRoomId()) != null) {
                CastLongProtector.parseLong(roomId2);
            }
            if (c658660PsW.LIZJ && c658660PsW.LIZIZ == 0) {
                C658550PsL c658550PsL3 = (C658550PsL) this.mView;
                if (c658550PsL3 != null) {
                    c658550PsL3.LJIIZILJ();
                    return;
                }
                return;
            }
            C658550PsL c658550PsL4 = (C658550PsL) this.mView;
            if (c658550PsL4 == null) {
                return;
            }
            c658550PsL4.LJIJJ();
        }
    }

    @InterfaceC1312540kGC(name = "aweme")
    public final void setAweme(String str) {
        if (str != null) {
            Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, new TypeToken<Aweme>() { // from class: X.0PsX
            }.getType());
            ((C658550PsL) this.mView).setIsECommerce(true);
            ((C658550PsL) this.mView).LJIIL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    @InterfaceC1312540kGC(name = "muted")
    public void setMuted(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LLILLJJLI = i;
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            ((C658550PsL) this.mView).setPoster(str);
        }
    }

    @InterfaceC1312540kGC(name = fe.e)
    public final void setSessionId(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sessionid -> ");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context, Object obj) {
        return LJJIIZI(context);
    }
}
