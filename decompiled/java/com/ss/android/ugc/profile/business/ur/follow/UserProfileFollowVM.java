package com.ss.android.ugc.profile.business.ur.follow;

import X.C054G;
import X.C0PEM;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1022820ciu;
import X.C1029590ctp;
import X.C10EU;
import X.C1247710iZd;
import X.C1249090ibr;
import X.C1252190igr;
import X.C1252230igv;
import X.C1252480ihK;
import X.C1559260qg8;
import X.C1DFH;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2184171Adz;
import X.C2296808zG;
import X.C2344009Gk;
import X.C723600SZy;
import X.C844470XAv;
import X.EnumC1252150ign;
import X.EnumC1252200igs;
import X.InterfaceC0148002o;
import X.InterfaceC1035050d2d;
import X.InterfaceC1214350hhp;
import X.InterfaceC736910SvR;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileFollowVM extends AssemViewModel<C1247710iZd> {
    public final InterfaceC736910SvR<InterfaceC1214350hhp> LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1249090ibr.class, "root_data"), true);
    public String LLILLL;
    public String LLILZ;
    public User LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public Integer LLJI;
    public C1252480ihK LLJIJIL;
    public Map<String, String> LLJILJIL;
    public final C054G LLJILJILJ;
    public final MutableLiveData<EnumC1252150ign> LLJILLL;
    public final MutableLiveData<Boolean> LLJJ;
    public final MutableLiveData LLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1247710iZd(0);
    }

    public final C1252230igv wQ2() {
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLILLJJLI.getValue();
        if (c1249090ibr != null) {
            return c1249090ibr.LLIZLLLIL;
        }
        return null;
    }

    public final void xQ2() {
        C1252480ihK c1252480ihK = this.LLJIJIL;
        if (c1252480ihK == null || !c1252480ihK.isFromLive() || TextUtils.isEmpty(c1252480ihK.fromLiveModule)) {
            return;
        }
        C20684815ws.LJIILLIIL("livesdk_personal_detail_follow", C2097608Jq.LJIIIIZZ(new Pair("from_room_id", c1252480ihK.fromRoomId), new Pair("from_anchor_id", c1252480ihK.fromAnchorId), new Pair("room_request_id", c1252480ihK.roomRequestId), new Pair("page_user_id", c1252480ihK.pageUserId), new Pair("from_live_module", c1252480ihK.fromLiveModule), new Pair("enter_from_merge", c1252480ihK.enterFromMerge), new Pair("enter_method", c1252480ihK.enterMethod), new Pair("action_type", c1252480ihK.actionType)));
    }

    public UserProfileFollowVM(C1252190igr c1252190igr) {
        this.LL = c1252190igr;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJILJILJ = C2296808zG.LIZ(C2107308Nj.LIZ);
        MutableLiveData<EnumC1252150ign> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(EnumC1252150ign.LOADING);
        this.LLJILLL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this.LLJJ = mutableLiveData2;
        this.LLJJI = mutableLiveData2;
    }

    public static void AQ2(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "is_follow");
        C20684815ws.LJIILLIIL("choose_punish_pop", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void DQ2(com.ss.android.ugc.aweme.profile.model.User r3) {
        /*
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "others_homepage"
            r2.LJIIIIZZ(r1, r0)
            if (r3 == 0) goto L34
            com.ss.android.ugc.aweme.profile.model.GeneralPermission r0 = r3.getGeneralPermission()
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.profile.model.GeneralPermission r0 = r3.getGeneralPermission()
            int r1 = r0.getFollowToastType()
            r0 = 1
            if (r1 == r0) goto L31
            r0 = 2
            if (r1 != r0) goto L34
            java.lang.String r1 = "suspend"
        L24:
            java.lang.String r0 = "show_type"
            r2.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_punish_pop"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L31:
            java.lang.String r1 = "ban"
            goto L24
        L34:
            java.lang.String r1 = ""
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM.DQ2(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void vQ2(EnumC1252200igs enumC1252200igs) {
        User user;
        User user2;
        User user3;
        User user4;
        GeneralPermission generalPermission;
        User user5;
        if (enumC1252200igs.compareTo(EnumC1252200igs.LOGIN) < 0 && !C0XQ7.LJFF().isLogin()) {
            setState(AFwS257S0000000_19.get$arr$(410));
            return;
        }
        if (enumC1252200igs.compareTo(EnumC1252200igs.BLOCK) < 0 && (user5 = this.LLILZIL) != null && user5.isBlock && !C10EU.LJIIJ(user5.getFollowStatus())) {
            setState(AFwS257S0000000_19.get$arr$(411));
            return;
        }
        if (enumC1252200igs.compareTo(EnumC1252200igs.BAN) < 0 && (user3 = this.LLILZIL) != null && user3.getFollowStatus() == 0 && (user4 = this.LLILZIL) != null && (generalPermission = user4.getGeneralPermission()) != null) {
            int followToastType = generalPermission.getFollowToastType();
            if (followToastType == 1) {
                setState(AFwS257S0000000_19.get$arr$(412));
                return;
            } else if (followToastType == 2) {
                setState(AFwS257S0000000_19.get$arr$(413));
                return;
            }
        }
        if (enumC1252200igs.compareTo(EnumC1252200igs.DOUBLE_CANCEL) < 0 && (user2 = this.LLILZIL) != null && user2.getFollowStatus() == 2) {
            setState(AFwS257S0000000_19.get$arr$(414));
        } else if (enumC1252200igs.compareTo(EnumC1252200igs.REQUESTED) < 0 && (user = this.LLILZIL) != null && user.getFollowStatus() == 4) {
            setState(AFwS257S0000000_19.get$arr$(415));
        } else {
            setState(AFwS257S0000000_19.get$arr$(416));
        }
    }

    public final void zQ2(EnumC1252150ign enumC1252150ign) {
        this.LLJILLL.setValue(enumC1252150ign);
    }

    public static void yQ2(int i, Aweme aweme, String str, FollowStatus followStatus) {
        if (str != null) {
            int i2 = 1;
            if (i == 1 && C1017070cZd.LLF(aweme)) {
                if (Intrinsics.LJFF(str, "feed")) {
                    InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                    C844470XAv.LIZ.getClass();
                    interfaceC1035050d2dLIZLLL.LJJ(C844470XAv.LIZ(), aweme, followStatus);
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "follow", aweme.getAwemeRawAd());
                    if (!followStatus.isCheating()) {
                        i2 = 0;
                    }
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(followStatus.getFollowStatus()), "follow_status");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                    return;
                }
                if (!Intrinsics.LJFF(str, "homepage")) {
                    return;
                }
                InterfaceC1035050d2d interfaceC1035050d2dLIZLLL2 = C1029590ctp.LIZLLL();
                C844470XAv.LIZ.getClass();
                interfaceC1035050d2dLIZLLL2.LIZIZ(C844470XAv.LIZ(), aweme, followStatus);
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "follow", aweme.getAwemeRawAd());
                if (!followStatus.isCheating()) {
                    i2 = 0;
                }
                c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(followStatus.getFollowStatus()), "follow_status");
                c1022820ciuLIZLLL2.LJIIIIZZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(boolean r16, boolean r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, com.ss.android.ugc.aweme.profile.model.User r19, java.lang.String r20, java.lang.String r21, android.content.Context r22) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM.CQ2(boolean, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.lang.String, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0462 A[Catch: JSONException -> 0x047b, TRY_ENTER, TryCatch #1 {JSONException -> 0x047b, blocks: (B:199:0x0427, B:201:0x0435, B:212:0x044f, B:214:0x0455, B:221:0x0466, B:224:0x0472, B:220:0x0462), top: B:408:0x0427 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0693 A[LOOP:2: B:331:0x068d->B:333:0x0693, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07a9 A[LOOP:1: B:399:0x07a3->B:401:0x07a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(com.ss.android.ugc.aweme.feed.model.Aweme r46, com.ss.android.ugc.aweme.profile.model.User r47, android.content.Context r48, boolean r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, android.os.Bundle r54) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM.BQ2(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.User, android.content.Context, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
