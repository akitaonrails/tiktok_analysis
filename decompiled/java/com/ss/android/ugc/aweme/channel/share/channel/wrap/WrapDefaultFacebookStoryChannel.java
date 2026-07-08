package com.ss.android.ugc.aweme.channel.share.channel.wrap;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C1371420lnA;
import X.C1374270lrl;
import X.C1375540lto;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;

/* JADX INFO: loaded from: classes22.dex */
public final class WrapDefaultFacebookStoryChannel extends IWrapChannel {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJJL() {
        return "wrap_facebook_story";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJZ() {
        return "com.facebook.android";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJ(C1371420lnA c1371420lnA, Activity activity, C0M7Y c0m7y) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJJLL(C1375540lto c1375540lto, Activity activity, C0M7Y c0m7y) {
        return LJJLIIIJLLLLLLLZ(c1375540lto, activity, c1375540lto.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJLJLI(C1374270lrl c1374270lrl, Activity activity, C0M7Y c0m7y) {
        return LJJLIIIJLLLLLLLZ(c1374270lrl, activity, c1374270lrl.LIZIZ);
    }

    public final boolean LJJLIIIJLLLLLLLZ(AbstractC1375550ltp abstractC1375550ltp, Context context, Uri uri) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        String strLIZ = abstractC1375550ltp.LIZ("media_type", "");
        String strLIZ2 = abstractC1375550ltp.LIZ("content_url", "video/*");
        String strLIZ3 = abstractC1375550ltp.LIZ("fb_app_id", "");
        if (!TextUtils.isEmpty(strLIZ)) {
            intent.setType(strLIZ);
        }
        if (!TextUtils.isEmpty(strLIZ3)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", strLIZ3);
        }
        if (!TextUtils.isEmpty(strLIZ2)) {
            intent.putExtra("content_url", strLIZ2);
        }
        if (uri != null) {
            intent.setDataAndType(uri, strLIZ);
            intent.setFlags(1);
        }
        return LJ(context, intent);
    }
}
