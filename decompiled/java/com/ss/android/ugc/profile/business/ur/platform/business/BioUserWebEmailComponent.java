package com.ss.android.ugc.profile.business.ur.platform.business;

import X.C08JS;
import X.C0WZX;
import X.C1216270hkv;
import X.C1248720ibG;
import X.C1251350ifV;
import X.C1253930ijf;
import X.C1558520qew;
import X.C1701330uNH;
import X.C19M4;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344809Gs;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ad.platform.BioEmailData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class BioUserWebEmailComponent extends BioUserWebUIComponent<BioEmailData> {
    public boolean LLJLL;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final int Ap() {
        return R.raw.icon_envelope;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        String bioEmail;
        BioEmailData bioEmailData = (BioEmailData) this.LLJJLIIIJLLLLLLLZ;
        if (bioEmailData == null || (bioEmail = bioEmailData.getBioEmail()) == null) {
            bioEmail = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mailto:");
        sbLIZ.append(bioEmail);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ != null && !TextUtils.isEmpty(strLIZIZ)) {
            Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(strLIZIZ));
            try {
                Context context = getContext();
                if (context != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDjuEi1eEMVbTO26z3Ljb3uGoIPQGq0C3o3gbbOUnXEflXkkQvEAPkrP8D", null));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJFF("ProfileEnterpriseAssem", e.getMessage());
            }
        }
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        User userVQ2 = profilePlatformViewModelYp != null ? profilePlatformViewModelYp.vQ2() : null;
        c1253930ijf.getClass();
        C1253930ijf.LIZ(userVQ2, "email");
        kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_EMAIL), EnumC1248370iah.BIO);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final String Bp() {
        return C1216270hkv.LIZJ(2131833256);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        C1251350ifV state;
        String uid;
        String bioEmail;
        UserProfileInfo userProfileInfo;
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            profilePlatformViewModelYp.KQ2(new AwS598S0100000_19(this, 393));
        }
        ProfilePlatformViewModel profilePlatformViewModelYp2 = yp();
        if (profilePlatformViewModelYp2 != null) {
            profilePlatformViewModelYp2.JQ2(new AwS598S0100000_19(this, 394));
        }
        ProfilePlatformViewModel profilePlatformViewModelYp3 = yp();
        if (profilePlatformViewModelYp3 != null && (state = profilePlatformViewModelYp3.getState()) != null && state.LLILLJJLI && !this.LLJLL) {
            this.LLJLL = true;
            IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBioUserMailLinkAbility.class, null);
            if (iBioUserMailLinkAbility != null) {
                String enterFrom = getEnterFrom();
                ProfileCommonInfo profileCommonInfoVo = Vo();
                String str = "";
                if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                    uid = "";
                }
                BioEmailData bioEmailData = (BioEmailData) this.LLJJLIIIJLLLLLLLZ;
                if (bioEmailData != null && (bioEmail = bioEmailData.getBioEmail()) != null) {
                    str = bioEmail;
                }
                iBioUserMailLinkAbility.Pi1(enterFrom, "email", uid, str);
            }
        }
        ProfilePlatformViewModel profilePlatformViewModelYp4 = yp();
        if (profilePlatformViewModelYp4 != null) {
            profilePlatformViewModelYp4.FQ2(new AwS598S0100000_19(this, 395));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        super.tp();
        lp(EnumC1248370iah.BIO, "HAS_EMAIL", C1216270hkv.LIZLLL(this.LLJLILLLLZIIL));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        super.So(profileComponentUIConfig);
        C19M4 c19m4 = this.LLJLILLLLZIIL;
        if (c19m4 != null) {
            c19m4.setCompoundDrawablePadding(C1216270hkv.LIZIZ(4));
        }
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioEmailData.class);
    }
}
