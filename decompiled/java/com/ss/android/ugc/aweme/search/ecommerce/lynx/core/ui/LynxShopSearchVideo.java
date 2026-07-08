package com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui;

import X.C1308910kAL;
import X.C138500fv;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2188811AlT;
import X.C661440Px0;
import X.C661850Pxf;
import X.C661890Pxj;
import X.C7740030o;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC676520QgE;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ecommerce.IECMixContentPlayAbility;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo;
import com.zhiliaoapp.musically.R;
import j27.s;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.text.a0;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxShopSearchVideo extends LynxSearchVideo {
    public volatile int LLILLL;

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1312540kGC(name = "soundControl")
    public void setSoundControl(int i) {
    }

    public final void LJJIJ() {
        C661890Pxj c661890Pxj;
        InterfaceC676520QgE autoPlayHandler;
        IECMixContentPlayAbility iECMixContentPlayAbility;
        if (!this.mView.isAttachedToWindow() || ((C661440Px0) this.mView).getAwemeStruct() == null || ((C661440Px0) this.mView).getSessionIdStr().length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyPlayableReady skipped: attached=");
            sbLIZ.append(this.mView.isAttachedToWindow());
            sbLIZ.append(", hasAweme=");
            sbLIZ.append(((C661440Px0) this.mView).getAwemeStruct() != null);
            sbLIZ.append(", hasSessionId=");
            sbLIZ.append(((C661440Px0) this.mView).getSessionIdStr().length() > 0);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        LynxView lynxViewLJIILJJIL = this.mContext.LJIILJJIL();
        if (lynxViewLJIILJJIL == null || (iECMixContentPlayAbility = (IECMixContentPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(lynxViewLJIILJJIL, null), IECMixContentPlayAbility.class, null)) == null || (autoPlayHandler = iECMixContentPlayAbility.pC1()) == null) {
            T t = this.mView;
            if (!(t instanceof C661890Pxj) || (c661890Pxj = (C661890Pxj) t) == null || (autoPlayHandler = c661890Pxj.getAutoPlayHandler()) == null) {
                return;
            }
        }
        autoPlayHandler.LJII(this.mView);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1967107nB
    public void play() {
        ((C661440Px0) this.mView).setAutoPlay(false);
        C661850Pxf core = ((C661440Px0) this.mView).getCore();
        if (core != null) {
            core.setEnableProgressCallback(true);
        }
        ((C661440Px0) this.mView).LJIL(this.LLILLL);
        super.play();
    }

    public LynxShopSearchVideo(s sVar) {
        super(sVar);
        this.LLILLL = 1;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    /* JADX INFO: renamed from: LJJIIZI */
    public final C661440Px0 createView(Context context) {
        if (context == null) {
            context = this.mContext;
        }
        C661890Pxj c661890Pxj = new C661890Pxj(context);
        c661890Pxj.setEventChangeListener(new AwS446S0200000_10(this, c661890Pxj, 3));
        c661890Pxj.setPlayStatusActionHandler(new AwS589S0100000_10(this, 149));
        return c661890Pxj;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1312540kGC(name = "aweme")
    public final void setAweme(String str) {
        int iIntValue;
        if (str != null) {
            Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, new TypeToken<Aweme>() { // from class: X.0Pxm
            }.getType());
            ((C661440Px0) this.mView).setIsECommerce(true);
            C661440Px0 c661440Px0 = (C661440Px0) this.mView;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bw, this.mContext.LIZ());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c661440Px0.setCoverPlaceholder(iIntValue);
            if (aweme != null && aweme.getAid() != null) {
                ((C661440Px0) this.mView).LIZLLL(aweme);
                if (C138500fv.LIZ()) {
                    LJJIJ();
                }
            }
            IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
            if (iEcomSearchService != null) {
                iEcomSearchService.LJJIJIIJI(aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1312540kGC(name = "muted")
    public void setMuted(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LLILLL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1312540kGC(name = "poster")
    public void setPoster(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            ((C661440Px0) this.mView).setPoster(str);
        }
    }

    @InterfaceC1312540kGC(name = fe.e)
    public final void setSessionId(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sessionid -> ");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null) {
            ((C661440Px0) this.mView).setSessionIdStr(str);
            if (C138500fv.LIZ()) {
                LJJIJ();
            }
        }
    }

    @InterfaceC1967107nB
    public final void setShareEcomVideoPlayer(ReadableMap readableMap) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setShareVideoPlayer map: ");
        if (readableMap != null) {
            string = readableMap.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (readableMap != null) {
            String string2 = readableMap.getString("aid");
            if (!TextUtils.isEmpty(string2)) {
                ((C661440Px0) this.mView).setShareEComVideoPlayerBeforeLaunchDetail(string2);
            }
        }
    }
}
