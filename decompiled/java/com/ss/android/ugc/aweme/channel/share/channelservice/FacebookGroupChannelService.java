package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class FacebookGroupChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "facebook_group";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB() { // from class: X.0lvD
            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.facebook.katana";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "facebook_group";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Facebook Group";
            }

            public static final Intent LJJJJZ(Context context, Intent intent) throws Throwable {
                List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/h1PMFD2+hc9SNy+GaJIsX4CrP4AAP6vbO0Ocdg==", null));
                ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
                Iterator it2 = listLJJJJZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((ResolveInfo) it2.next()).activityInfo.name);
                }
                for (String str : arrayList) {
                    if (a0.LJJIIZI(str, "ShareToGroupsAlias", false)) {
                        intent.setClassName("com.facebook.katana", str);
                        return intent;
                    }
                }
                return null;
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

            public final Intent LJJJJJL(Context context, AbstractC1375550ltp abstractC1375550ltp) throws Throwable {
                if (abstractC1375550ltp instanceof C1371420lnA) {
                    if (C516560KNq.LIZ(context, "com.facebook.katana")) {
                        Intent intentLJFF = LJFF(context, (C1371420lnA) abstractC1375550ltp);
                        Intent intentLJJJJZ = LJJJJZ(context, intentLJFF);
                        if (intentLJJJJZ == null) {
                            return intentLJFF;
                        }
                        return intentLJJJJZ;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://www.facebook.com/sharer/sharer.php?u=");
                    sbLIZ.append(AbstractC1376120luk.LIZ((C1371420lnA) abstractC1375550ltp));
                    return new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                }
                if (abstractC1375550ltp instanceof C1375540lto) {
                    Intent intentLJJ = LJJ(context, (C1375540lto) abstractC1375550ltp);
                    Intent intentLJJJJZ2 = LJJJJZ(context, intentLJJ);
                    if (intentLJJJJZ2 == null) {
                        return intentLJJ;
                    }
                    return intentLJJJJZ2;
                }
                if (abstractC1375550ltp instanceof C1374270lrl) {
                    Intent intentLJJIIZ = LJJIIZ(context, (C1374270lrl) abstractC1375550ltp);
                    Intent intentLJJJJZ3 = LJJJJZ(context, intentLJJIIZ);
                    if (intentLJJJJZ3 == null) {
                        return intentLJJIIZ;
                    }
                    return intentLJJJJZ3;
                }
                return null;
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) throws Throwable {
                Intent intentLJJJJJL = LJJJJJL(context, c1371420lnA);
                if (intentLJJJJJL != null) {
                    return LJ(context, intentLJJJJJL);
                }
                return false;
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) throws Throwable {
                Intent intentLJJJJJL = LJJJJJL(context, c1374270lrl);
                if (intentLJJJJJL != null) {
                    return LJ(context, intentLJJJJJL);
                }
                return false;
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) throws Throwable {
                Intent intentLJJJJJL = LJJJJJL(context, c1375540lto);
                if (intentLJJJJJL != null) {
                    return LJ(context, intentLJJJJJL);
                }
                return false;
            }
        };
    }
}
