package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C0HTT;
import X.C1017070cZd;
import X.C10EU;
import X.C1210450hbX;
import X.C1261180ivM;
import X.C1371600lnS;
import X.C1372730lpH;
import X.C1372740lpI;
import X.C1373400lqM;
import X.C1373450lqR;
import X.C1375510ltl;
import X.C1375980luW;
import X.C1376170lup;
import X.C291010Bat;
import X.C313130CPf;
import X.C729980SkG;
import X.C736320SuU;
import X.C737030Svd;
import X.EnumC1373410lqN;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS316S0300000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowSharePackage extends PhotoSharePackage {
    public static Aweme shareAweme;
    public C1372730lpH nowShareParams;
    public static final C1372740lpI Companion = new C1372740lpI();
    public static final int $stable = 8;

    public final EnumC1373410lqN LJJIIJZLJL() {
        C1372740lpI c1372740lpI = Companion;
        String str = this.itemType;
        c1372740lpI.getClass();
        if (!C1372740lpI.LIZIZ(str)) {
            String str2 = this.itemType;
            if (!Intrinsics.LJFF(str2, "now_others_post") && !Intrinsics.LJFF(str2, "now_others_video_post")) {
                return EnumC1373410lqN.SHARE_NOW;
            }
        }
        EnumC1373410lqN enumC1373410lqN = C1373400lqM.LIZ.get(this.itemType);
        return enumC1373410lqN == null ? EnumC1373410lqN.SHARE_DEFAULT : enumC1373410lqN;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final void LJJ(C1371600lnS c1371600lnS) {
        AwemeStatus statusSafety;
        List<SharePlatform> list;
        Aweme aweme;
        Activity activityLJJI;
        AwemeStatus statusSafety2;
        C1372730lpH c1372730lpH;
        AwemeACLShare awemeACLShare;
        ACLCommonShare downloadGeneral;
        if (C729980SkG.LJIIIIZZ(this.nowShareParams.LIZJ)) {
            C0HTT<C737030Svd> c0htt = this.nowShareParams.LIZLLL;
            if (c0htt != null) {
                Activity activityLJJI2 = LJJI();
                if (activityLJJI2 != null && (c1372730lpH = this.nowShareParams) != null && !C10EU.LJIIIIZZ() && (((awemeACLShare = c1372730lpH.LIZJ.awemeACLShareInfo) == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 0) && AwemeExtKt.isSharedStoryVisible(c1372730lpH.LIZJ) && !c1372730lpH.LIZJ.getIsCommentPostVideo())) {
                    if (c1372730lpH.LIZJ.getAwemeType() == 43) {
                        c1371600lnS.LIZJ(new C1376170lup(activityLJJI2, c1372730lpH.LIZJ, c1372730lpH.LIZ, "click_download_icon", null, 48));
                    } else {
                        c1371600lnS.LIZJ(new C1375510ltl(activityLJJI2, c1372730lpH.LIZ, c1372730lpH.LIZJ));
                    }
                }
                C1372730lpH c1372730lpH2 = this.nowShareParams;
                c1371600lnS.LIZJ(new C1375980luW(c1372730lpH2.LIZJ, c1372730lpH2.LIZ, c1372730lpH2.LIZIZ, c0htt));
            }
            if (!AwemeExtKt.isPrivate(this.nowShareParams.LIZJ)) {
                C1372730lpH c1372730lpH3 = this.nowShareParams;
                c1371600lnS.LIZJ(new C1210450hbX(c1372730lpH3.LIZJ, c1372730lpH3.LIZ, c1372730lpH3.LIZIZ));
            }
            boolean zLJJIIJ = LJJIIJ(this.nowShareParams.LIZJ, c1371600lnS, true);
            c1371600lnS.LJJIIJZLJL = true;
            c1371600lnS.LJJI = R.string.tba;
            c1371600lnS.LJJIII = R.string.f1_;
            if (!C10EU.LJIIIIZZ() && !AwemeExtKt.isScheduleVideo(this.nowShareParams.LIZJ)) {
                if ((this.nowShareParams.LIZJ.isAd() && (statusSafety2 = AwemeExtKt.getStatusSafety(this.nowShareParams.LIZJ)) != null && !statusSafety2.isAllowShare()) || C1017070cZd.LJJLIL(this.nowShareParams.LIZJ) || AwemeExtKt.isPrivate(this.nowShareParams.LIZJ)) {
                    c1371600lnS.LJJIIJZLJL = false;
                }
            } else {
                c1371600lnS.LJJIIJZLJL = false;
            }
            if (AwemeExtKt.isPrivate(this.nowShareParams.LIZJ)) {
                c1371600lnS.LIZLLL("chat_merge");
            }
            if (!zLJJIIJ) {
                C1372740lpI c1372740lpI = Companion;
                String str = this.itemType;
                c1372740lpI.getClass();
                if (!C1372740lpI.LIZIZ(str) && (aweme = this.params.LIZIZ) != null && (activityLJJI = LJJI()) != null) {
                    c1371600lnS.LJJJJLL = true;
                    c1371600lnS.LJJJJJL = true;
                    c1371600lnS.LJJJJZ = new AwS316S0300000_16(activityLJJI, aweme, this, 1);
                }
            }
        } else {
            final C1372730lpH c1372730lpH4 = this.nowShareParams;
            final C0HTT<C737030Svd> c0htt2 = c1372730lpH4.LIZLLL;
            if (c0htt2 != null) {
                final Aweme aweme2 = c1372730lpH4.LIZJ;
                final String str2 = c1372730lpH4.LIZ;
                final String str3 = c1372730lpH4.LIZIZ;
                c1371600lnS.LIZJ(new C736320SuU(c0htt2, c1372730lpH4, aweme2, str2, str3) { // from class: X.0lpJ
                    public final /* synthetic */ C0HTT<C737030Svd> LLJ;
                    public final /* synthetic */ C1372730lpH LLJI;

                    @Override // X.C736320SuU
                    public final void LIZ() {
                        C0HTT<C737030Svd> c0htt3 = this.LLJ;
                        if (c0htt3 != null) {
                            c0htt3.LLIIL(new C737030Svd(1, this.LLJI));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(aweme2, c0htt2, str2, str3);
                        this.LLJ = c0htt2;
                        this.LLJI = c1372730lpH4;
                    }
                });
                if (AwemeExtKt.getFollowStatus(this.nowShareParams.LIZJ) == 1 || AwemeExtKt.getFollowStatus(this.nowShareParams.LIZJ) == 2) {
                    C1372730lpH c1372730lpH5 = this.nowShareParams;
                    c1371600lnS.LIZJ(new C1261180ivM(c1372730lpH5.LIZJ, c0htt2, c1372730lpH5));
                }
            }
            if (Intrinsics.LJFF(this.nowShareParams.LIZIZ, "share_button")) {
                LJJIIJ(this.nowShareParams.LIZJ, c1371600lnS, false);
                if (C10EU.LJIIIIZZ() || AwemeExtKt.isScheduleVideo(this.nowShareParams.LIZJ) || (this.nowShareParams.LIZJ.isAd() && (statusSafety = AwemeExtKt.getStatusSafety(this.nowShareParams.LIZJ)) != null && !statusSafety.isAllowShare())) {
                    c1371600lnS.LJJIIJZLJL = false;
                } else {
                    c1371600lnS.LJJIIJZLJL = true;
                }
            } else {
                c1371600lnS.LJIILLIIL = true;
                c1371600lnS.LJJIIJZLJL = false;
            }
            c1371600lnS.LJJJI = false;
            c1371600lnS.LJJJJJL = false;
            c1371600lnS.LJJIII = R.string.f1_;
            c1371600lnS.LJJI = R.string.tba;
        }
        ShareSettings shareSettings = C313130CPf.LIZIZ().LLILLL;
        if (shareSettings != null && (list = shareSettings.sharePlatforms) != null) {
            for (SharePlatform sharePlatform : list) {
                if (C1373450lqR.LIZ(sharePlatform.platformId, LJJIIJZLJL()) == -1) {
                    c1371600lnS.LIZLLL(sharePlatform.platformId);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowSharePackage(android.app.Activity r44, X.C1372730lpH r45) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage.<init>(android.app.Activity, X.0lpH):void");
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJIIJJI(InterfaceC1370310llN interfaceC1370310llN, Context context) {
        shareAweme = this.nowShareParams.LIZJ;
        return false;
    }

    public final boolean LJJIIJ(Aweme aweme, C1371600lnS c1371600lnS, boolean z) {
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && awemeACLShare.getShareListStatus() == 0) {
            if (!C10EU.LJIIIIZZ() && !AwemeExtKt.isScheduleVideo(aweme)) {
                if (z && !C291010Bat.LIZ()) {
                    c1371600lnS.LJIILLIIL = true;
                    return true;
                }
                if (!AwemeExtKt.isPrivate(this.nowShareParams.LIZJ)) {
                    return false;
                }
                c1371600lnS.LJIILLIIL = true;
                return true;
            }
            c1371600lnS.LJIILLIIL = true;
            return true;
        }
        c1371600lnS.LJIILLIIL = true;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        shareAweme = this.nowShareParams.LIZJ;
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (X.C1373540lqa.LJIILJJIL(r4) == false) goto L12;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165 A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(X.InterfaceC1369790lkX r23, android.content.Context r24, android.view.View r25, X.C0M7Y r26, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage.LJII(X.0lkX, android.content.Context, android.view.View, X.0M7Y, kotlin.jvm.functions.Function1):boolean");
    }
}
