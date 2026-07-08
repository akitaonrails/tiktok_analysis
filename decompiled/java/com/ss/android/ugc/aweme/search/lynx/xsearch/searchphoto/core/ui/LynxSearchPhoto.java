package com.ss.android.ugc.aweme.search.lynx.xsearch.searchphoto.core.ui;

import X.C661450Px1;
import X.InterfaceC1967107nB;
import android.content.Context;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo;
import j27.s;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxSearchPhoto extends LynxSearchVideo {
    public LynxSearchPhoto(s sVar) {
        super(sVar);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo, com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIJ, reason: merged with bridge method [inline-methods] */
    public final C661450Px1 createView(Context context) {
        if (context == null) {
            context = this.mContext;
        }
        C661450Px1 c661450Px1 = new C661450Px1(context);
        c661450Px1.setEventChangeListener(new AwS624S0100000_10(this, 28));
        c661450Px1.setLynxContext(this.mContext);
        return c661450Px1;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @InterfaceC1967107nB
    public void seek(ReadableMap readableMap, Callback callback) {
        C661450Px1 c661450Px1;
        int i = readableMap.getInt("seekTime");
        int i2 = readableMap.getInt("position");
        boolean z = readableMap.getBoolean("play");
        T t = this.mView;
        if ((t instanceof C661450Px1) && (c661450Px1 = (C661450Px1) t) != null) {
            c661450Px1.LJJI(i, z);
            c661450Px1.setPlayPosition(i2);
        }
    }
}
