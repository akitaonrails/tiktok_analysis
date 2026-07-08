package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376120luk;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class FacebookStoryChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "facebook_story";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(final C1377070lwH c1377070lwH) {
        if (c1377070lwH == null || c1377070lwH.LIZ == null) {
            return null;
        }
        return new AbstractC1376120luk(c1377070lwH) { // from class: X.0lxn
            public final IWrapChannel LL;
            public final Activity LLILLJJLI;

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                return false;
            }

            @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "facebook_story";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Story";
            }

            {
                Activity activity;
                InterfaceC1378050lxr interfaceC1378050lxr;
                C1378040lxq.LIZ.getClass();
                IWrapChannel iWrapChannelLIZ = C1378040lxq.LIZ("facebook_story");
                this.LL = iWrapChannelLIZ;
                if (iWrapChannelLIZ == null) {
                    this.LL = C1378040lxq.LIZ("wrap_facebook_story");
                }
                if (c1377070lwH != null && (interfaceC1378050lxr = c1377070lwH.LIZ) != null) {
                    activity = interfaceC1378050lxr.get();
                } else {
                    activity = null;
                }
                this.LLILLJJLI = activity;
            }

            @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJIIZILJ(Context context) {
                Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
                intent.setType("video/mp4");
                if (context.getPackageManager().resolveActivity(intent, 0) == null) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
                Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
                intent.setType("video/mp4");
                if (context.getPackageManager().resolveActivity(intent, 0) == null) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.pu;
                    } else {
                        i = R.attr.pt;
                    }
                    Integer numLIZ = C1369540lk8.LIZ(i, c1361400lX0LIZIZ);
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c419910GdJ.LIZ = iIntValue;
                    return c419910GdJ.LIZ(c1361400lX0LIZIZ);
                }
                return null;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                IWrapChannel iWrapChannel;
                Boolean boolValueOf;
                Activity activity = this.LLILLJJLI;
                if (activity == null || (iWrapChannel = this.LL) == null || (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJLJLI(c1374270lrl, activity, c0m7y))) == null) {
                    return false;
                }
                return boolValueOf.booleanValue();
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                IWrapChannel iWrapChannel;
                Boolean boolValueOf;
                Activity activity = this.LLILLJJLI;
                if (activity == null || (iWrapChannel = this.LL) == null || (boolValueOf = Boolean.valueOf(iWrapChannel.LJJJLL(c1375540lto, activity, c0m7y))) == null) {
                    return false;
                }
                return boolValueOf.booleanValue();
            }
        };
    }
}
