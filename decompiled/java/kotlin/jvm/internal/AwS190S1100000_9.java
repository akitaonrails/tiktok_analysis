package kotlin.jvm.internal;

import X.C09AY;
import X.C1389890mGx;
import X.C734790Ss1;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS190S1100000_9 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS190S1100000_9(C734790Ss1 c734790Ss1, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c734790Ss1;
        this.s0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS190S1100000_9 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r0 = r8 instanceof X.C614080O6s
            r4 = 0
            if (r0 == 0) goto Lc0
            X.0O6s r8 = (X.C614080O6s) r8
            if (r8 == 0) goto Lc1
            java.lang.Throwable r5 = r8.getE()
        Lf:
            boolean r0 = r5 instanceof X.C0XIR
            if (r0 == 0) goto Lbc
            X.0XIR r5 = (X.C0XIR) r5
            if (r5 == 0) goto Lbc
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM r2 = (com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM) r2
            int r0 = r5.getErrorCode()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r1 = r5.getErrorCode()
            r0 = 3009020(0x2de9fc, float:4.216535E-39)
            if (r1 != r0) goto L39
            r0 = 1
            X.C614440O8c.LIZ = r0
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 92
            r1.<init>(r5, r0)
            r2.setState(r1)
        L39:
            java.lang.String r2 = "api"
        L3b:
            if (r8 == 0) goto Lba
            java.lang.Throwable r1 = r8.getE()
        L41:
            boolean r0 = r1 instanceof X.C1494690ozz
            if (r0 == 0) goto L53
            X.0ozz r1 = (X.C1494690ozz) r1
            if (r1 == 0) goto L53
            int r0 = r1.getCronetInternalErrorCode()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "net"
        L53:
            java.lang.String r5 = r6.s0
            java.lang.String r0 = "click_bubble_add"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L7b
            java.lang.String r1 = r6.s0
            java.lang.String r0 = "click_bubble_more_add"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7b
            java.lang.String r1 = r6.s0
            java.lang.String r0 = "click_bubble_create"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7b
            java.lang.String r1 = r6.s0
            java.lang.String r0 = "click_bubble_more_create"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7d
        L7b:
            java.lang.String r5 = "click_bubble"
        L7d:
            X.0O8a r1 = new X.0O8a
            r1.<init>()
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM r0 = (com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM) r0
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L92
            java.lang.String r0 = r0.mEventType
            if (r0 != 0) goto L94
        L92:
            java.lang.String r0 = ""
        L94:
            r1.LIZLLL = r0
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM r0 = (com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM) r0
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto Lac
            java.lang.String r4 = r0.getAid()
        Lac:
            r1.LJIJI = r4
            r1.LJIILLIIL = r5
            r1.LJIIZILJ = r3
            r1.LJIJ = r2
            r1.LJIILJJIL()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lba:
            r1 = r4
            goto L41
        Lbc:
            r2 = r4
            r3 = r4
            goto L3b
        Lc0:
            r8 = r4
        Lc1:
            r5 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS190S1100000_9.invoke$0(kotlin.jvm.internal.AwS190S1100000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS190S1100000_9 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS190S1100000_9.invoke$1(kotlin.jvm.internal.AwS190S1100000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS190S1100000_9 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r3 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r3
            java.lang.Object r0 = r2.l1
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L18
            int r1 = r3.retrieveIncrementalId()
            int r0 = r0.intValue()
            if (r0 != r1) goto L48
        L12:
            r0 = 1
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L18:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getAweme()
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getAid()
        L23:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 != 0) goto L12
            X.0NMY r0 = X.C0NMY.GENERAL_SEARCH
            java.util.List r0 = X.C0PH8.LIZ(r3, r0)
            if (r0 == 0) goto L3d
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L3d
            java.lang.String r1 = r0.getAid()
        L3d:
            java.lang.String r0 = r2.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L48
            goto L12
        L46:
            r0 = r1
            goto L23
        L48:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS190S1100000_9.invoke$2(kotlin.jvm.internal.AwS190S1100000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS190S1100000_9 awS190S1100000_9, Object obj, Object obj2) {
        if (((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() <= 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(((C734790Ss1) awS190S1100000_9.l1).LL);
            c1389890mGx.LJIIJ(awS190S1100000_9.s0);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS190S1100000_9 awS190S1100000_9, Object obj, Object obj2) {
        if (((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() <= 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(((C734790Ss1) awS190S1100000_9.l1).LL);
            c1389890mGx.LJIIJ(awS190S1100000_9.s0);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS190S1100000_9(VideoFavoriteVM videoFavoriteVM, String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = videoFavoriteVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS190S1100000_9(Integer num, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = num;
        this.s0 = str;
    }
}
