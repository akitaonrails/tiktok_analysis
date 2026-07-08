package com.ss.android.ugc.aweme.share.business.config;

import X.C0M7Y;
import X.C1372180loO;
import X.C1372210loR;
import X.C1373450lqR;
import X.C1374530lsB;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C786410Ut5;
import X.EnumC1369700lkO;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.business.config.CoinAwemeChannelShareProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinAwemeChannelShareProtocol extends AwemeChannelShareProtocol {
    public final boolean LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final List<String> Ay2() {
        return this.LLJI ? C1697810uHb.LJIILJJIL("copy") : new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Drawable DC() {
        if (this.LLILZ == null) {
            return null;
        }
        C1372210loR c1372210loR = C1372210loR.LIZ;
        Context context = this.LLILLL;
        c1372210loR.getClass();
        return C1372210loR.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeChannelShareProtocol, com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lo7
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                C1895800zQw.LJIILJJIL();
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                String str;
                if (interfaceC1369790lkX.LJJIII()) {
                    if (Intrinsics.LJFF(this.LIZ.LLILZLL, "homepage_hot")) {
                        str = "homepage";
                    } else {
                        str = "feed_detail";
                    }
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                    CoinAwemeChannelShareProtocol coinAwemeChannelShareProtocol = this.LIZ;
                    C1895800zQw.LJII(coinAwemeChannelShareProtocol.LLILZIL, coinAwemeChannelShareProtocol.LLJIJIL, coinAwemeChannelShareProtocol.LLJILJIL, str, interfaceC1369790lkX.key());
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeChannelShareProtocol, com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Comparator<InterfaceC1369790lkX> Pz0() {
        C1372180loO c1372180loO;
        Comparator<InterfaceC1369790lkX> comparator = this.LLJ;
        if ((comparator instanceof C1372180loO) && (c1372180loO = (C1372180loO) comparator) != null) {
            c1372180loO.LIZJ().addAll(Ay2());
        }
        return comparator;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Function1<C0M7Y, Unit> UR1() {
        if (this.LLILZ == null || this.LLJI) {
            return null;
        }
        return new AwS600S0100000_21(this, 169);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Boolean Vv2() {
        return Boolean.valueOf(!this.LLJI);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final String jv0() {
        if (this.LLILZ == null) {
            return null;
        }
        C786410Ut5.LJJJI("scenario", "incentive", this.LL.extras);
        C786410Ut5.LJJJI("is_referral", "1", this.LL.extras);
        C1372210loR.LIZ.getClass();
        return C1372210loR.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Boolean z72() {
        return Boolean.valueOf(!this.LLJI);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final EnumC1369700lkO tC2() {
        return EnumC1369700lkO.MIDDLE;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Set<String> V41(List<? extends InterfaceC1369790lkX> list) {
        if (this.LLILZIL == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
            InterfaceC1369790lkX interfaceC1369790lkX2 = interfaceC1369790lkX;
            C1374530lsB c1374530lsB = C1374530lsB.LIZ;
            Aweme aweme = this.LLILZIL;
            c1374530lsB.getClass();
            if (C1373450lqR.LJI(aweme, interfaceC1369790lkX2) || C1373450lqR.LJII(aweme, interfaceC1369790lkX2) || !interfaceC1369790lkX2.LJJIII() || (interfaceC1369790lkX2 instanceof QrCodeChannel)) {
                arrayList.add(interfaceC1369790lkX);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC1369790lkX) it2.next()).key());
        }
        return C13LP.LLIIJI(arrayList2);
    }

    public CoinAwemeChannelShareProtocol(Context context, BaseSharePackage baseSharePackage) {
        String string;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        super(context, baseSharePackage);
        AwemeSharePackage awemeSharePackage = this.LLILZ;
        boolean z = false;
        if (awemeSharePackage != null && (bundle3 = awemeSharePackage.extras) != null) {
            z = bundle3.getBoolean("is_referral", false);
        }
        this.LLJI = z;
        String string2 = null;
        if (z) {
            if (Intrinsics.LJFF(this.LLIZ, "feed_card")) {
                string = this.LLIZ;
            } else {
                AwemeSharePackage awemeSharePackage2 = this.LLILZ;
                if (awemeSharePackage2 != null && (bundle2 = awemeSharePackage2.extras) != null) {
                    string = bundle2.getString("referral_enter_from");
                } else {
                    string = null;
                }
            }
        } else if (Intrinsics.LJFF(this.LLIZ, "feed_card")) {
            string = this.LLIZ;
        } else {
            string = this.LLILZLL;
        }
        this.LLJIJIL = string;
        if (z) {
            if (Intrinsics.LJFF(this.LLIZ, "feed_card")) {
                string2 = this.LLIZ;
            } else {
                AwemeSharePackage awemeSharePackage3 = this.LLILZ;
                if (awemeSharePackage3 != null && (bundle = awemeSharePackage3.extras) != null) {
                    string2 = bundle.getString("referral_page_enter_from");
                }
            }
        } else {
            string2 = Intrinsics.LJFF(this.LLIZ, "feed_card") ? this.LLIZ : this.LLILZLL;
        }
        this.LLJILJIL = string2;
    }
}
