package com.ss.android.ugc.profile.business.ad.platform.business;

import X.AbstractC1542200qEc;
import X.C08JS;
import X.C1050610dRj;
import X.C1216270hkv;
import X.C1248720ibG;
import X.C1251350ifV;
import X.C1541950qED;
import X.C20684815ws;
import X.C2344009Gk;
import X.C736480Suk;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.model.ExpandEmailAndPhone;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ad.platform.BioEmailData;
import com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessEmailComponent;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BioBusinessEmailComponent extends BioBusinessBaseUIComponent<BioEmailData> {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ap() {
        return "HAS_EMAIL".toLowerCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        final String bioEmail;
        C1251350ifV state;
        String uid;
        String nickname;
        String uniqueId;
        C1251350ifV state2;
        BioEmailData bioEmailData = (BioEmailData) this.LLJJLIIIJLLLLLLLZ;
        String str = "";
        if (bioEmailData == null || (bioEmail = bioEmailData.getBioEmail()) == null) {
            bioEmail = "";
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        User user = getUser();
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        Aweme aweme = null;
        c1050610dRj.LJIILL((profilePlatformViewModelZo == null || (state2 = profilePlatformViewModelZo.getState()) == null) ? null : state2.LLJILJILJ, user, getEnterFrom(), bioEmail);
        kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_EMAIL), EnumC1248370iah.BIO);
        final ExpandEmailAndPhone expandEmailAndPhoneLJIIIIZZ = BAProfilePageServiceImpl.LJIIL().LJIIIIZZ();
        if (!Intrinsics.LJFF(expandEmailAndPhoneLJIIIIZZ.getEnable(), Boolean.TRUE)) {
            IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
            Context context = getContext();
            ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
            if (profilePlatformViewModelZo2 != null && (state = profilePlatformViewModelZo2.getState()) != null) {
                aweme = state.LLJILJILJ;
            }
            iBAProfilePageServiceLJIIL.LJ(context, 2, bioEmail, aweme, null, null, null);
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=email_phone_leads_card").buildUpon();
        User user2 = getUser();
        if (user2 == null || (uid = user2.getUid()) == null) {
            uid = "";
        }
        builderBuildUpon.appendQueryParameter("ba_uid", uid);
        User user3 = getUser();
        if (user3 == null || (nickname = user3.getNickname()) == null) {
            nickname = "";
        }
        builderBuildUpon.appendQueryParameter("nickName", nickname);
        User user4 = getUser();
        if (user4 != null && (uniqueId = user4.getUniqueId()) != null) {
            str = uniqueId;
        }
        builderBuildUpon.appendQueryParameter("userName", str);
        builderBuildUpon.appendQueryParameter("email", bioEmail);
        String string = builderBuildUpon.build().toString();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(string);
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0ie1
            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                String schema;
                String uid2;
                String nickname2;
                String uniqueId2;
                if (C123100dR.LIZ(expandEmailAndPhoneLJIIIIZZ.getSchema()) && (schema = expandEmailAndPhoneLJIIIIZZ.getSchema()) != null) {
                    BioBusinessEmailComponent bioBusinessEmailComponent = this;
                    String str3 = bioEmail;
                    SparkContext sparkContext2 = new SparkContext();
                    sparkContext2.LJJLIIJ(schema);
                    User user5 = bioBusinessEmailComponent.getUser();
                    String str4 = "";
                    if (user5 == null || (uid2 = user5.getUid()) == null) {
                        uid2 = "";
                    }
                    sparkContext2.LJJJZ("ba_uid", uid2);
                    User user6 = bioBusinessEmailComponent.getUser();
                    if (user6 == null || (nickname2 = user6.getNickname()) == null) {
                        nickname2 = "";
                    }
                    sparkContext2.LJJJZ("nickName", nickname2);
                    User user7 = bioBusinessEmailComponent.getUser();
                    if (user7 != null && (uniqueId2 = user7.getUniqueId()) != null) {
                        str4 = uniqueId2;
                    }
                    sparkContext2.LJJJZ("userName", str4);
                    sparkContext2.LJJJZ("email", str3);
                    Context context2 = this.getContext();
                    if (context2 != null) {
                        C1541950qED.LIZJ.getClass();
                        new C1541950qED(context2, sparkContext2).LIZIZ();
                    }
                }
            }
        });
        Context context2 = getContext();
        if (context2 != null) {
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context2, sparkContext).LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Function0<Unit> zp() {
        return new AwS563S0100000_19(this, 2047);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer Bp() {
        return Integer.valueOf(R.raw.icon_envelope);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ep() {
        return C1216270hkv.LIZJ(2131833851);
    }

    public final User getUser() {
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            return profilePlatformViewModelZo.vQ2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        super.tp();
        getContext();
        String enterFrom = getEnterFrom();
        User user = getUser();
        String uid = user != null ? user.getUid() : null;
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("link_type", "download_link");
        C20684815ws.LJIILIIL("show_link", enterFrom, uid, CardStruct.IStatusCode.DEFAULT, c736480Suk.LIZIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user2 = getUser();
        c2344009Gk.LJIIIIZZ("author_id", user2 != null ? user2.getUid() : null);
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJIIIIZZ("link_type", "email");
        C20684815ws.LJIILLIIL("show_link", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioEmailData.class);
    }
}
