package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376120luk;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.provider.Telephony;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SmsChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "sms";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376120luk() { // from class: X.0lvA
            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "sms";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "SMS";
            }

            public static TuxIconDrawable LJFF(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.rw;
                    } else {
                        i = R.attr.rv;
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
            public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
                return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                int i;
                int iIntValue;
                if (context == null) {
                    return LJFF(context, z);
                }
                if (!Intrinsics.LJFF(Telephony.Sms.getDefaultSmsPackage(context), "com.google.android.apps.messaging")) {
                    return LJFF(context, z);
                }
                C1361400lX0 c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context);
                if (c1361400lX0LIZIZ != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.rw;
                    } else {
                        i = R.attr.px;
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
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207960577, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
                try {
                    String strLIZ = AbstractC1376120luk.LIZ(c1371420lnA);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                    String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
                    C1374110lrV.LIZIZ(defaultSmsPackage, CardStruct.IStatusCode.DEFAULT);
                    if (defaultSmsPackage != null) {
                        intent.setPackage(defaultSmsPackage);
                    }
                    boolean zLJ = LJ(context, intent);
                    AutoDFIDManager.LIZIZ();
                    return zLJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AutoDFIDManager.LIZIZ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                String strLIZ = C1374110lrV.LIZ(c1374270lrl);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("video/*");
                intent.putExtra("android.intent.extra.STREAM", c1374270lrl.LIZIZ);
                if (strLIZ != null && strLIZ.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                }
                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
                C1374110lrV.LIZIZ(defaultSmsPackage, "2");
                if (defaultSmsPackage != null) {
                    intent.setPackage(defaultSmsPackage);
                }
                return LJ(context, intent);
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                String strLIZ = C1374110lrV.LIZ(c1375540lto);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", c1375540lto.LIZIZ);
                if (strLIZ != null && strLIZ.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                }
                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
                C1374110lrV.LIZIZ(defaultSmsPackage, "1");
                if (defaultSmsPackage != null) {
                    intent.setPackage(defaultSmsPackage);
                }
                return LJ(context, intent);
            }
        };
    }
}
