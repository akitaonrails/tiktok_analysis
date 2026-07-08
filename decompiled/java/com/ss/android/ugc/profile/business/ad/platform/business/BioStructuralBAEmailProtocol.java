package com.ss.android.ugc.profile.business.ad.platform.business;

import X.AbstractC1542200qEc;
import X.C08JS;
import X.C1050610dRj;
import X.C1251350ifV;
import X.C1541950qED;
import X.C20684815ws;
import X.C2344009Gk;
import X.C736480Suk;
import X.ViewOnLongClickListenerC1265920j30;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.model.ExpandEmailAndPhone;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ad.platform.BioEmailData;
import com.ss.android.ugc.profile.business.ad.platform.business.BioStructuralBAEmailProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralBAEmailProtocol extends BioStructuralBABaseProtocol<BioEmailData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_business_account_email";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        View view = this.LLILZLL;
        if (view != null) {
            view.setOnLongClickListener(new ViewOnLongClickListenerC1265920j30(this, 1));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        getContext();
        String str = this.LLJJIJIL;
        User user = this.LLJJJJ;
        String uid = user != null ? user.getUid() : null;
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("link_type", "download_link");
        C20684815ws.LJIILIIL("show_link", str, uid, CardStruct.IStatusCode.DEFAULT, c736480Suk.LIZIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user2 = this.LLJJJJ;
        c2344009Gk.LJIIIIZZ("author_id", user2 != null ? user2.getUid() : null);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        c2344009Gk.LJIIIIZZ("link_type", "email");
        C20684815ws.LJIILLIIL("show_link", c2344009Gk.LIZ);
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        final String bioEmail;
        Aweme aweme;
        C1251350ifV state;
        String uid;
        String nickname;
        String uniqueId;
        C1251350ifV state2;
        BioEmailData bioEmailData = (BioEmailData) this.LLJILJIL;
        String str = "";
        if (bioEmailData == null || (bioEmail = bioEmailData.getBioEmail()) == null) {
            bioEmail = "";
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        User user = this.LLJJJJ;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        Aweme aweme2 = null;
        if (iProfilePlatformVM != null && (state2 = iProfilePlatformVM.getState()) != null) {
            aweme = state2.LLJILJILJ;
        } else {
            aweme = null;
        }
        c1050610dRj.LJIILL(aweme, user, this.LLJJIJIL, bioEmail);
        final ExpandEmailAndPhone expandEmailAndPhoneLJIIIIZZ = BAProfilePageServiceImpl.LJIIL().LJIIIIZZ();
        if (Intrinsics.LJFF(expandEmailAndPhoneLJIIIIZZ.getEnable(), Boolean.TRUE)) {
            Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=email_phone_leads_card").buildUpon();
            User user2 = this.LLJJJJ;
            if (user2 == null || (uid = user2.getUid()) == null) {
                uid = "";
            }
            builderBuildUpon.appendQueryParameter("ba_uid", uid);
            User user3 = this.LLJJJJ;
            if (user3 == null || (nickname = user3.getNickname()) == null) {
                nickname = "";
            }
            builderBuildUpon.appendQueryParameter("nickName", nickname);
            User user4 = this.LLJJJJ;
            if (user4 != null && (uniqueId = user4.getUniqueId()) != null) {
                str = uniqueId;
            }
            builderBuildUpon.appendQueryParameter("userName", str);
            builderBuildUpon.appendQueryParameter("email", bioEmail);
            String string = builderBuildUpon.build().toString();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0ie0
                @Override // X.AbstractC1537870q7d
                public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                    String schema;
                    String uid2;
                    String nickname2;
                    String uniqueId2;
                    if (C123100dR.LIZ(expandEmailAndPhoneLJIIIIZZ.getSchema()) && (schema = expandEmailAndPhoneLJIIIIZZ.getSchema()) != null) {
                        BioStructuralBAEmailProtocol bioStructuralBAEmailProtocol = this;
                        String str3 = bioEmail;
                        SparkContext sparkContext2 = new SparkContext();
                        sparkContext2.LJJLIIJ(schema);
                        User user5 = bioStructuralBAEmailProtocol.LLJJJJ;
                        String str4 = "";
                        if (user5 == null || (uid2 = user5.getUid()) == null) {
                            uid2 = "";
                        }
                        sparkContext2.LJJJZ("ba_uid", uid2);
                        User user6 = bioStructuralBAEmailProtocol.LLJJJJ;
                        if (user6 == null || (nickname2 = user6.getNickname()) == null) {
                            nickname2 = "";
                        }
                        sparkContext2.LJJJZ("nickName", nickname2);
                        User user7 = bioStructuralBAEmailProtocol.LLJJJJ;
                        if (user7 != null && (uniqueId2 = user7.getUniqueId()) != null) {
                            str4 = uniqueId2;
                        }
                        sparkContext2.LJJJZ("userName", str4);
                        sparkContext2.LJJJZ("email", str3);
                        Context context = this.getContext();
                        if (context != null) {
                            C1541950qED.LIZJ.getClass();
                            new C1541950qED(context, sparkContext2).LIZIZ();
                        }
                    }
                }
            });
            Context context = getContext();
            if (context != null) {
                C1541950qED.LIZJ.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            }
            return true;
        }
        IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
        Context context2 = getContext();
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null && (state = iProfilePlatformVM2.getState()) != null) {
            aweme2 = state.LLJILJILJ;
        }
        iBAProfilePageServiceLJIIL.LJ(context2, 2, bioEmail, aweme2, null, null, null);
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BioEmailData bioEmailData;
        try {
            bioEmailData = (BioEmailData) C08JS.LIZ(nVar.toString(), BioEmailData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            bioEmailData = null;
        }
        this.LLJILJIL = bioEmailData;
    }
}
