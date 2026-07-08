package com.ss.android.ugc.aweme.channel.share.handler;

import X.C06KX;
import X.C0PEM;
import X.C1371320ln0;
import X.C1374080lrS;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardShareAbilityHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseChannelShareHandler<T extends BaseSharePackage> implements C06KX {
    public boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage) {
        return false;
    }

    public boolean LJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        return !(this instanceof BulletinBoardShareAbilityHandler);
    }

    public abstract InterfaceC1371340ln2 LJFF();

    public abstract Object LJIIIZ(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    public abstract Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn);

    public abstract Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    public static boolean LIZJ(ShareContentType shareContentType) {
        if (shareContentType != ShareContentType.PHOTO && shareContentType != ShareContentType.PHOTOS && shareContentType != ShareContentType.VIDEO && shareContentType != ShareContentType.LINK_PLUS_PHOTOS && shareContentType != ShareContentType.LINK_PLUS_PHOTO && shareContentType != ShareContentType.LINK_PLUS_VIDEO) {
            return false;
        }
        return true;
    }

    public boolean LIZ(C1374080lrS c1374080lrS) {
        List<String> list;
        ShareContentType shareContentType = c1374080lrS.LJ.LIZ;
        if ((shareContentType == ShareContentType.LINK || shareContentType == ShareContentType.LINK_PLUS_VIDEO || shareContentType == ShareContentType.LINK_PLUS_PHOTO || shareContentType == ShareContentType.LINK_PLUS_PHOTOS) && c1374080lrS.LIZ.length() == 0) {
            return false;
        }
        if (LIZJ(shareContentType) && ((list = c1374080lrS.LIZIZ) == null || list.isEmpty())) {
            return false;
        }
        return true;
    }

    public String LJI(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        return baseSharePackage.description;
    }

    public String LJII(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        return baseSharePackage.title;
    }

    public ShareContentType[] LJIIIIZZ(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        ShareContentType[] shareContentTypeArr = baseSharePackage.shareContentTypes;
        if (shareContentTypeArr == null) {
            return new ShareContentType[]{ShareContentType.LINK};
        }
        return shareContentTypeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIIL(X.InterfaceC1369790lkX r4, com.ss.android.ugc.aweme.share.base.model.ShareContentType r5) {
        /*
            r3 = this;
            java.lang.String r2 = r4.key()
            int[] r1 = X.C1374020lrM.LIZ
            int r0 = r5.ordinal()
            r0 = r1[r0]
            r1 = 0
            switch(r0) {
                case 1: goto L28;
                case 2: goto L31;
                case 3: goto L31;
                case 4: goto L12;
                case 5: goto L1d;
                case 6: goto L3a;
                case 7: goto L3a;
                default: goto L10;
            }
        L10:
            r1 = 1
        L11:
            return r1
        L12:
            X.01GW r0 = X.C1374640lsM.LIZ
            java.util.List<java.lang.String> r0 = X.C1374640lsM.LJII
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L11
            goto L10
        L1d:
            X.01GW r0 = X.C1374640lsM.LIZ
            java.util.List<java.lang.String> r0 = X.C1374640lsM.LJII
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L11
            goto L10
        L28:
            X.01GW r0 = X.C1374640lsM.LIZ
            java.util.List<java.lang.String> r0 = X.C1374640lsM.LJ
            boolean r1 = r0.contains(r2)
            return r1
        L31:
            X.01GW r0 = X.C1374640lsM.LIZ
            java.util.List<java.lang.String> r0 = X.C1374640lsM.LJFF
            boolean r1 = r0.contains(r2)
            return r1
        L3a:
            X.01GW r0 = X.C1374640lsM.LIZ
            java.util.List<java.lang.String> r0 = X.C1374640lsM.LJI
            boolean r1 = r0.contains(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler.LJIIL(X.0lkX, com.ss.android.ugc.aweme.share.base.model.ShareContentType):boolean");
    }

    public final void LJIIJJI(Context context, View view, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1371320ln0(this, context, baseSharePackage, interfaceC1369790lkX, view, null), 3);
    }
}
