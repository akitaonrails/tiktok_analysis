package com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui;

import X.C1308910kAL;
import X.C2188811AlT;
import X.C661440Px0;
import X.C661850Pxf;
import X.C7740030o;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo;
import com.zhiliaoapp.musically.R;
import j27.s;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxEcomSearchVideo extends LynxSearchVideo {
    public volatile int LLILLL;

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1312540kGC(name = "soundControl")
    public void setSoundControl(int i) {
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1967107nB
    public void play() {
        ((C661440Px0) this.mView).setAutoPlay(false);
        C661850Pxf core = ((C661440Px0) this.mView).getCore();
        if (core != null) {
            core.setEnableProgressCallback(true);
        }
        super.play();
    }

    public LynxEcomSearchVideo(s sVar) {
        super(sVar);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    /* JADX INFO: renamed from: LJJIIZI */
    public final C661440Px0 createView(final Context context) {
        if (context != null) {
            C661440Px0 c661440Px0 = new C661440Px0(context) { // from class: X.0Pxn
            };
            c661440Px0.setEventChangeListener(new AwS624S0100000_10(this, 24));
            c661440Px0.setPlayStatusActionHandler(new AwS589S0100000_10(this, 148));
            return c661440Px0;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1312540kGC(name = "aweme")
    public final void setAweme(String str) {
        int iIntValue;
        if (str != null) {
            Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, new TypeToken<Aweme>() { // from class: X.0Pxl
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
            ((C661440Px0) this.mView).LIZLLL(aweme);
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
