package com.ss.android.ugc.aweme.main.assems.mainfragment.protocol;

import X.C0J6N;
import X.EnumC1584350rKb;
import X.InterfaceC1570900qyu;
import com.bytedance.tiktok.homepage.mainfragment.IMFLeftIconProtocol;
import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveLeftIconProtocol implements IMFLeftIconProtocol {
    public LiveIconGenerator LL;

    @Override // X.InterfaceC1570980qz2
    public final void LIZ() {
        LiveIconGenerator liveIconGenerator = this.LL;
        if (liveIconGenerator != null) {
            liveIconGenerator.LIZIZ(C0J6N.DARK);
        }
    }

    @Override // X.InterfaceC1570980qz2
    public final InterfaceC1570900qyu LIZJ() {
        LiveIconGenerator liveIconGenerator = this.LL;
        if (liveIconGenerator != null) {
            return liveIconGenerator;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1570980qz2
    public final String LIZLLL() {
        return EnumC1584350rKb.LIVE.getTag();
    }

    @Override // X.InterfaceC1570980qz2
    public final void T1() {
        LiveIconGenerator liveIconGenerator = this.LL;
        if (liveIconGenerator != null) {
            liveIconGenerator.LIZIZ(C0J6N.DEFAULT);
        }
    }

    @Override // X.InterfaceC1570980qz2
    public final void j6() {
        LiveIconGenerator liveIconGenerator = this.LL;
        if (liveIconGenerator != null) {
            liveIconGenerator.LIZIZ(C0J6N.DEFAULT);
        }
    }

    @Override // X.InterfaceC1570980qz2
    public final MFLeftIconPriority LJ() {
        return MFLeftIconPriority.LIVE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFLeftIconProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap1(com.ss.android.ugc.aweme.main.MainFragment r7, X.InterfaceC1617760sCU r8, com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r9) {
        /*
            r6 = this;
            r5 = 0
            if (r9 == 0) goto L7c
            kotlin.Pair r0 = r9.pI()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r0.getFirst()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L3a
            java.util.Iterator r3 = r0.iterator()
        L15:
            r4 = r5
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r3.next()
            X.0qyu r2 = (X.InterfaceC1570900qyu) r2
            java.lang.String r1 = r2.getTag()
            X.0rKb r0 = X.EnumC1584350rKb.LIVE
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L16
            boolean r0 = r2 instanceof com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator
            if (r0 == 0) goto L15
            r4 = r2
            com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator r4 = (com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator) r4
            goto L16
        L3a:
            r4 = r5
            if (r9 == 0) goto L75
        L3d:
            kotlin.Pair r0 = r9.pI()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.getSecond()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L75
            java.util.Iterator r3 = r0.iterator()
        L4f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r2 = r3.next()
            X.0qyu r2 = (X.InterfaceC1570900qyu) r2
            java.lang.String r1 = r2.getTag()
            X.0rKb r0 = X.EnumC1584350rKb.LIVE
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
            boolean r0 = r2 instanceof com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator
            if (r0 == 0) goto L73
            r4 = r2
            com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator r4 = (com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator) r4
            goto L4f
        L73:
            r4 = r5
            goto L4f
        L75:
            if (r4 == 0) goto L7c
            r4.LLILLL = r7
            r4.LLILZ = r8
            goto L81
        L7c:
            com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator r4 = new com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator
            r4.<init>(r7, r8)
        L81:
            r6.LL = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.LiveLeftIconProtocol.ap1(com.ss.android.ugc.aweme.main.MainFragment, X.0sCU, com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility):void");
    }
}
