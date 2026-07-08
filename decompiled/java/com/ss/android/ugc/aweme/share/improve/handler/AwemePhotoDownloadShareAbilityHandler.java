package com.ss.android.ugc.aweme.share.improve.handler;

import X.C123100dR;
import X.C1372410lol;
import X.C1373440lqQ;
import X.C1373990lrJ;
import X.C1374080lrS;
import X.C1374720lsU;
import X.C13LE;
import X.C15438062q;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoDownloadShareModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemePhotoDownloadShareAbilityHandler extends TTShareDefaultHandler<AwemeSharePackage> {
    public final Function1<Boolean, Unit> LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LJIIL(InterfaceC1369790lkX interfaceC1369790lkX, ShareContentType shareContentType) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC1371340ln2 LJFF() {
        return new InterfaceC1371340ln2() { // from class: X.0lrH
            @Override // X.InterfaceC1371340ln2
            public final void LIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                this.LIZ.LLILLJJLI.invoke(Boolean.TRUE);
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, C1374170lrb c1374170lrb) {
                Activity activityLIZ;
                if (c1374170lrb.LIZ == AnonymousClass0560.SHARE_LINK_FORM_LINK_EMPTY.getNum() && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    Bundle bundle = baseSharePackage.extras;
                    if (bundle != null) {
                        bundle.putInt("link_form", 1);
                    }
                    if (C299060Bns.LIZ()) {
                        C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                        c1389880mGw.LJIIIIZZ(2131848062);
                        c1389880mGw.LJIIJ();
                    } else {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131848062);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LIZ(C1374080lrS c1374080lrS) {
        ShareContentType shareContentType = c1374080lrS.LJ.LIZ;
        if (shareContentType == ShareContentType.LINK) {
            return C123100dR.LIZ(c1374080lrS.LIZ);
        }
        if (shareContentType != ShareContentType.LINK_PLUS_PHOTO && shareContentType != ShareContentType.LINK_PLUS_PHOTOS && shareContentType != ShareContentType.PHOTO && shareContentType != ShareContentType.PHOTOS) {
            if (shareContentType == ShareContentType.ILEGAL) {
                return false;
            }
        } else {
            List<String> list = c1374080lrS.LIZIZ;
            if (list == null || list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public AwemePhotoDownloadShareAbilityHandler(Context context, Function1 function1) {
        super(context);
        this.LLILLJJLI = function1;
        C13LE.LIZ(AwemeSharePackage.class);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJI(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = baseSharePackage.itemType;
        String str2 = baseSharePackage.description;
        c1373440lqQ.getClass();
        return C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJII(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
            return C1374720lsU.LIZIZ().getString(2131845764);
        }
        return baseSharePackage.title;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final ShareContentType[] LJIIIIZZ(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        C1372410lol.LIZ.getClass();
        ShareContentType shareContentType = C1373990lrJ.LIZIZ.get(Integer.valueOf(C1372410lol.LIZ(interfaceC1369790lkX)));
        if (shareContentType == null) {
            shareContentType = ShareContentType.ILEGAL;
        }
        Bundle bundle = baseSharePackage.extras;
        String str = C1373990lrJ.LIZ.get(shareContentType);
        if (str == null) {
            str = "";
        }
        C786410Ut5.LJJJI("share_form", str, bundle);
        return new ShareContentType[]{shareContentType};
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1369790lkX r9, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1374000lrK
            if (r0 == 0) goto L98
            r4 = r11
            X.0lrK r4 = (X.C1374000lrK) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L9f
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r10 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r1 = r10.extras
            java.lang.String r0 = "share_url"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            return r2
        L2e:
            X.C155000ia.LIZIZ(r2)
            r4.LL = r10
            r4.LLILZ = r0
            X.099m r6 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r6.<init>(r0)
            X.00w2 r3 = new X.00w2
            r3.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r3.element = r0
            boolean r0 = r10 instanceof com.ss.android.ugc.aweme.share.improve.pkg.AwemePhotoDownloadSharePackage
            if (r0 == 0) goto L4f
            if (r10 != 0) goto L57
        L4f:
            java.lang.String r0 = ""
            X.C189200o6.m2constructorimpl(r0)
            r6.resumeWith(r0)
        L57:
            java.lang.String r7 = r10.url
            java.lang.String r2 = r10.itemType
            java.lang.String r1 = r9.key()
            r0 = 4
            X.11Kn r2 = X.C1374720lsU.LJ(r7, r2, r1, r10, r0)
            Y.AkS482S0100000_21 r1 = new Y.AkS482S0100000_21
            r0 = 9
            r1.<init>(r10, r0)
            X.11Jk r1 = r2.LJIIJ(r1)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Ko r1 = r1.LJIJJ(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11Ii r2 = r1.LJIILIIL(r0)
            Y.AfS100S0300000_2 r1 = new Y.AfS100S0300000_2
            r0 = 2
            r1.<init>(r10, r3, r6, r0)
            r2.LJIILLIIL(r1)
            java.lang.Object r2 = r6.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L95
            X.C099Q.LIZJ(r4)
        L95:
            if (r2 != r5) goto L24
            return r5
        L98:
            X.0lrK r4 = new X.0lrK
            r4.<init>(r8, r11)
            goto L12
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoDownloadShareAbilityHandler.LJIIIZ(X.0lkX, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        String[] strArr;
        PhotoDownloadShareModel photoDownloadShareModel;
        ShareModel shareModel = baseSharePackage.shareModel;
        Set<String> set = null;
        if ((shareModel instanceof PhotoDownloadShareModel) && (photoDownloadShareModel = (PhotoDownloadShareModel) shareModel) != null) {
            set = photoDownloadShareModel.successLocalPathList;
        }
        if (set != null && !set.isEmpty()) {
            C1372410lol.LIZ.getClass();
            int iLIZ = C1372410lol.LIZ(interfaceC1369790lkX);
            if (iLIZ != 4 && iLIZ != 5) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            } else if (set.size() > 0) {
                strArr = new String[]{((String[]) set.toArray(new String[0]))[0]};
            } else {
                strArr = new String[0];
            }
            baseSharePackage.extras.putInt("downloaded_pic_cnt", strArr.length);
            return strArr;
        }
        return new String[0];
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return super.LJIILIIL(context, baseSharePackage, interfaceC1369790lkX, view, interfaceC1364105Vn);
    }
}
