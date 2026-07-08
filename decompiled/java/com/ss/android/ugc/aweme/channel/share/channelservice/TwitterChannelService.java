package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class TwitterChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "twitter";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB() { // from class: X.0lum
            public String LL;
            public Uri LLILLJJLI;

            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.twitter.android";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "twitter";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                Context applicationContext;
                String string;
                InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
                return (interfaceC1370110ll3 == null || (applicationContext = interfaceC1370110ll3.getApplicationContext()) == null || (string = applicationContext.getString(2131847894)) == null) ? "X" : string;
            }

            public final Intent LJJJJJL(Context context) throws Throwable {
                boolean z;
                ActivityInfo activityInfo;
                boolean z2;
                String strEncode;
                boolean z3;
                Intent intent = new Intent("android.intent.action.SEND");
                StringBuilder sb = new StringBuilder();
                String str = this.LL;
                if (str != null) {
                    if (sb.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        sb.append(' ');
                    }
                    sb.append(str);
                }
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                intent.setType("text/plain");
                Uri uri = this.LLILLJJLI;
                if (uri != null) {
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    intent.setType("image/*");
                }
                List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/h1PMFD2+hc9AafnKkm78Nf4mI8eE3Q==", null));
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
                Iterator it2 = listLJJJJZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((ResolveInfo) it2.next()).activityInfo.name);
                }
                String strLJII = C1370370llT.LJ.LJII();
                if (strLJII != null && strLJII.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && arrayList.contains(strLJII)) {
                    intent.setClassName("com.twitter.android", strLJII);
                } else {
                    Iterator it3 = listLJJJJZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ResolveInfo resolveInfo = (ResolveInfo) it3.next();
                            if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
                                String str2 = activityInfo.packageName;
                                if (str2 != null && u.LJJIIJZLJL(str2, "com.twitter.android", false)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                                    break;
                                }
                            }
                        } else {
                            intent = null;
                            break;
                        }
                    }
                }
                if (intent != null) {
                    return intent;
                }
                Object[] objArr = new Object[2];
                String str3 = this.LL;
                String strEncode2 = "";
                if (str3 == null) {
                    strEncode = "";
                } else {
                    try {
                        strEncode = URLEncoder.encode(str3, "UTF8");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        strEncode = "";
                    }
                }
                objArr[0] = strEncode;
                try {
                    strEncode2 = URLEncoder.encode("", "UTF8");
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                objArr[1] = strEncode2;
                return new Intent("android.intent.action.VIEW", UriProtector.parse(C786410Ut5.j4("https://twitter.com/intent/tweet?text=%s&url=%s", Arrays.copyOf(objArr, 2))));
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.s9;
                    } else {
                        i = R.attr.s8;
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
                this.LL = AbstractC1376120luk.LIZ(c1371420lnA);
                return LJ(context, LJJJJJL(context));
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                this.LL = C1374110lrV.LIZ(c1375540lto);
                this.LLILLJJLI = c1375540lto.LIZIZ;
                return LJ(context, LJJJJJL(context));
            }
        };
    }
}
