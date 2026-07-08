package com.ss.android.ugc.aweme.relation.auth.widget.ext;

import X.AbstractC848400XPy;
import X.C09JN;
import X.C0XQ7;
import X.C1074810e4l;
import X.C11NJ;
import X.C11S5;
import X.C1234230iDt;
import X.C1370940lmO;
import X.C1373440lqQ;
import X.C1701940uOG;
import X.C20642515q3;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1234240iDu;
import X.InterfaceC1369790lkX;
import Y.AfS185S0100000_16;
import Y.AfS40S1100000_2;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS56S1300000_16;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class InviteFriendsSharePackageV2 extends LinkDefaultSharePackage {
    public static final C1074810e4l Companion = new Object() { // from class: X.0e4l
    };
    public final C11NJ compositeDisposable;
    public final boolean enableInviteSystem;
    public final String enterFrom;
    public final InterfaceC1234240iDu inviteFriendsApi;
    public final String inviteMode;
    public SmgSettingsModel smgSettingsModel;

    public final void LJJI() {
        this.compositeDisposable.LJ();
    }

    public final void LJJIII() {
        this.compositeDisposable.LIZ(this.inviteFriendsApi.LIZLLL().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS185S0100000_16(this, 8), new C09JN() { // from class: X.0e4m
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("InviteFriendsSharePackageV2@4fd5.setup$2");
                C1C7U.LIZIZ("InviteFriendsSharePackageV2@4fd5.setup$2");
            }
        }));
    }

    public final String LJJIFFI() {
        String nickname;
        String text;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (nickname = curUser.getNickname()) == null) {
            nickname = "";
        }
        SmgSettingsModel smgSettingsModel = this.smgSettingsModel;
        String strLJJIII = (smgSettingsModel == null || (text = smgSettingsModel.getText()) == null) ? null : u.LJJIII(text, "%@", nickname, false);
        if (strLJJIII == null) {
            try {
                strLJJIII = C786410Ut5.j4(C20642515q3.LJI(2131829480), Arrays.copyOf(new Object[]{nickname}, 1));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strLJJIII = C20642515q3.LJI(2131829480);
            }
        }
        return strLJJIII != null ? strLJJIII : "";
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJI(Context context, InterfaceC1369790lkX interfaceC1369790lkX) {
        String url;
        SmgSettingsModel smgSettingsModel = this.smgSettingsModel;
        if (smgSettingsModel == null || (url = smgSettingsModel.getUrl()) == null || url.length() == 0) {
            url = "https://m.tiktok.com/invitef/download";
        }
        String strLJJ = LJJ(url, interfaceC1369790lkX.key());
        C621180OYa.LIZIZ.LJJLI(2, interfaceC1369790lkX.key(), "others_video_share_list");
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = this.itemType;
        String strLJJIFFI = LJJIFFI();
        c1373440lqQ.getClass();
        LJJII(strLJJ, new AwS56S1300000_16(interfaceC1369790lkX, this, C1373440lqQ.LIZ(interfaceC1369790lkX, str, strLJJIFFI), context, 7));
        return true;
    }

    public final String LJJ(String str, String str2) {
        String str3;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (this.enableInviteSystem) {
            str3 = "manual";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        return UriProtector.parse(str).buildUpon().appendQueryParameter("user_id", curUserId).appendQueryParameter("enter_from", this.enterFrom).appendQueryParameter("invitemode", this.inviteMode).appendQueryParameter("invitesystem", str3).appendQueryParameter("platform", str2).appendQueryParameter("copytype", CardStruct.IStatusCode.DEFAULT).build().toString();
    }

    public final void LJJII(String str, Function1<? super String, Unit> function1) {
        this.compositeDisposable.LIZ(this.inviteFriendsApi.LIZJ(str).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS40S1100000_2(str, function1, 0), new C09JN() { // from class: X.05Nh
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("InviteFriendsSharePackageV2@4fd5.getShortenUrl$2");
                C1C7U.LIZIZ("InviteFriendsSharePackageV2@4fd5.getShortenUrl$2");
            }
        }));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsSharePackageV2(String str, String str2, boolean z, C1370940lmO c1370940lmO, int i) {
        C1234230iDt c1234230iDt;
        super(c1370940lmO);
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            c1234230iDt = C1234230iDt.LIZIZ;
        } else {
            c1234230iDt = null;
        }
        this.inviteMode = str;
        this.enterFrom = str2;
        this.enableInviteSystem = z;
        this.inviteFriendsApi = c1234230iDt;
        this.compositeDisposable = new C11NJ();
    }
}
