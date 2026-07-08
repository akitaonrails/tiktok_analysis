package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class WhatsappChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "whatsapp";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(final C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB(c1377070lwH) { // from class: X.0lxk
            public final C1377070lwH LL;
            public final IWrapChannel LLILLJJLI;
            public final Activity LLILLL;

            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.whatsapp";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "whatsapp";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                Function1<String, String> function1;
                String strInvoke;
                C1377070lwH c1377070lwH2 = this.LL;
                return (c1377070lwH2 == null || (function1 = c1377070lwH2.LIZIZ) == null || (strInvoke = function1.invoke("whatsapp")) == null) ? "WhatsApp" : strInvoke;
            }

            {
                Activity activity;
                InterfaceC1378050lxr interfaceC1378050lxr;
                this.LL = c1377070lwH;
                C1378040lxq.LIZ.getClass();
                IWrapChannel iWrapChannelLIZ = C1378040lxq.LIZ("whatsapp");
                this.LLILLJJLI = iWrapChannelLIZ;
                if (iWrapChannelLIZ == null) {
                    this.LLILLJJLI = C1378040lxq.LIZ("wrap_whatsapp");
                }
                if (c1377070lwH != null && (interfaceC1378050lxr = c1377070lwH.LIZ) != null) {
                    activity = interfaceC1378050lxr.get();
                } else {
                    activity = null;
                }
                this.LLILLL = activity;
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.si;
                    } else {
                        i = R.attr.sh;
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
                Boolean boolValueOf;
                boolean zBooleanValue = false;
                AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207960321, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
                try {
                    Activity activity = this.LLILLL;
                    if (activity == null) {
                        AutoDFIDManager.LIZIZ();
                        return false;
                    }
                    IWrapChannel iWrapChannel = this.LLILLJJLI;
                    if (iWrapChannel != null && (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJ(c1371420lnA, activity, c0m7y))) != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                    AutoDFIDManager.LIZIZ();
                    return zBooleanValue;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AutoDFIDManager.LIZIZ();
                    throw th;
                }
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                Boolean boolValueOf;
                boolean zBooleanValue = false;
                AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207960321, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
                try {
                    Activity activity = this.LLILLL;
                    if (activity == null) {
                        AutoDFIDManager.LIZIZ();
                        return false;
                    }
                    IWrapChannel iWrapChannel = this.LLILLJJLI;
                    if (iWrapChannel != null && (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJLJLI(c1374270lrl, activity, c0m7y))) != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                    AutoDFIDManager.LIZIZ();
                    return zBooleanValue;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AutoDFIDManager.LIZIZ();
                    throw th;
                }
            }

            @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
                Boolean boolValueOf;
                boolean zBooleanValue = false;
                AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207960321, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
                try {
                    Activity activity = this.LLILLL;
                    if (activity == null) {
                        AutoDFIDManager.LIZIZ();
                        return false;
                    }
                    IWrapChannel iWrapChannel = this.LLILLJJLI;
                    if (iWrapChannel != null && (boolValueOf = Boolean.valueOf(iWrapChannel.LJJLIIIJ(c1371430lnB, activity, c0m7y))) != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                    AutoDFIDManager.LIZIZ();
                    return zBooleanValue;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AutoDFIDManager.LIZIZ();
                    throw th;
                }
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                Boolean boolValueOf;
                boolean zBooleanValue = false;
                AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207960321, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
                try {
                    Activity activity = this.LLILLL;
                    if (activity == null) {
                        AutoDFIDManager.LIZIZ();
                        return false;
                    }
                    IWrapChannel iWrapChannel = this.LLILLJJLI;
                    if (iWrapChannel != null && (boolValueOf = Boolean.valueOf(iWrapChannel.LJJJLL(c1375540lto, activity, c0m7y))) != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                    AutoDFIDManager.LIZIZ();
                    return zBooleanValue;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AutoDFIDManager.LIZIZ();
                    throw th;
                }
            }
        };
    }
}
