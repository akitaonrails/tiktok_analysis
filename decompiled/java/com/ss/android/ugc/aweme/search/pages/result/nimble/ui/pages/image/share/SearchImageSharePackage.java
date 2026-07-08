package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share;

import X.C1370940lmO;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.mob.SearchNimbleImageMob;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImageSharePackage extends SharePackage {
    public static final int $stable = 8;
    public final ImageData imageData;
    public final SearchImageShareModel imageModel;
    public final Map<String, String> mobParams;
    public final SearchNimbleImageMob searchNimbleImageMob;

    public SearchImageSharePackage(C1370940lmO c1370940lmO, SearchNimbleImageMob searchNimbleImageMob) {
        SearchImageShareModel searchImageShareModel;
        ImageData imageData;
        super(c1370940lmO);
        this.searchNimbleImageMob = searchNimbleImageMob;
        ShareModel shareModel = this.shareModel;
        if (shareModel instanceof SearchImageShareModel) {
            searchImageShareModel = (SearchImageShareModel) shareModel;
        } else {
            searchImageShareModel = null;
        }
        this.imageModel = searchImageShareModel;
        if (searchImageShareModel != null) {
            imageData = searchImageShareModel.imageData;
        } else {
            imageData = null;
        }
        this.imageData = imageData;
        this.mobParams = searchImageShareModel != null ? searchImageShareModel.mobParams : null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
        ImageData imageData = this.imageData;
        if (imageData != null) {
            this.searchNimbleImageMob.LJ("click_share", imageData);
        }
    }
}
