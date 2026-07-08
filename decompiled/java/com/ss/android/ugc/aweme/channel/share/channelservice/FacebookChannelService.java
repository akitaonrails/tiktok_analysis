package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class FacebookChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "facebook";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(final C1377070lwH c1377070lwH) {
        if (c1377070lwH == null || c1377070lwH.LIZ == null) {
            return null;
        }
        return new AbstractC1376390lvB(c1377070lwH) { // from class: X.0lxm
            public final IWrapChannel LL;
            public final Activity LLILLJJLI;

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
                return true;
            }

            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.facebook.katana";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "facebook";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Facebook";
            }

            {
                Activity activity;
                InterfaceC1378050lxr interfaceC1378050lxr;
                C1378040lxq.LIZ.getClass();
                IWrapChannel iWrapChannelLIZ = C1378040lxq.LIZ("facebook");
                this.LL = iWrapChannelLIZ;
                if (iWrapChannelLIZ == null) {
                    this.LL = C1378040lxq.LIZ("wrap_facebook");
                }
                if (c1377070lwH != null && (interfaceC1378050lxr = c1377070lwH.LIZ) != null) {
                    activity = interfaceC1378050lxr.get();
                } else {
                    activity = null;
                }
                this.LLILLJJLI = activity;
            }

            @Override // X.AbstractC1376390lvB, X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJIIZILJ(Context context) {
                IWrapChannel iWrapChannel = this.LL;
                if (iWrapChannel != null) {
                    return iWrapChannel.LJIIZILJ(context);
                }
                return super.LJIIZILJ(context);
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.pw;
                    } else {
                        i = R.attr.pv;
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

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                IWrapChannel iWrapChannel;
                Boolean boolValueOf;
                Activity activity = this.LLILLJJLI;
                if (activity == null || (iWrapChannel = this.LL) == null || (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJ(c1371420lnA, activity, c0m7y))) == null) {
                    return false;
                }
                return boolValueOf.booleanValue();
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                IWrapChannel iWrapChannel;
                Boolean boolValueOf;
                Activity activity = this.LLILLJJLI;
                if (activity == null || (iWrapChannel = this.LL) == null || (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJLJLI(c1374270lrl, activity, c0m7y))) == null) {
                    return false;
                }
                return boolValueOf.booleanValue();
            }

            @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
                IWrapChannel iWrapChannel;
                Boolean boolValueOf;
                Activity activity = this.LLILLJJLI;
                if (activity == null || (iWrapChannel = this.LL) == null || (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJ(c1371430lnB, activity, c0m7y))) == null) {
                    return false;
                }
                return boolValueOf.booleanValue();
            }

            @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
                try {
                    if (this.LLILLJJLI == null) {
                        return false;
                    }
                    return super.LJJIIJ(abstractC1375550ltp, context, c0m7y);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
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
