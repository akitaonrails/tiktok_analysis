package com.ss.android.ugc.profile.business.creator.monetization;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1248950ibd;
import X.C1252710ihh;
import X.C13LE;
import X.C1612930s4h;
import X.C2188811AlT;
import X.InterfaceC1250630ieL;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureCollectionsProtocol extends AdvancedFeatureProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_paid_collections";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        ProfileHeaderAdvancedFeatureViewModel profileHeaderAdvancedFeatureViewModel = this.LLJJJIL;
        if (profileHeaderAdvancedFeatureViewModel != null) {
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS598S0100000_19(this, 308));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_series_dollar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        boolean zLLZZZIL;
        String str;
        String uid;
        String uid2;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        List<Action> list;
        String url;
        Action.RouterInfo router;
        String url2;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        InterfaceC1250630ieL interfaceC1250630ieL;
        Context context = getContext();
        if (context != null) {
            Fragment fragment = this.LLILZ;
            if (fragment != null && (interfaceC1250630ieL = (InterfaceC1250630ieL) C1252710ihh.LJII(fragment, C13LE.LIZ(InterfaceC1250630ieL.class))) != null) {
                zLLZZZIL = interfaceC1250630ieL.LLZZZIL();
            } else {
                zLLZZZIL = false;
            }
            if (this.LLJI) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("aweme://paidcontent/collections?creator_uid=");
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            String str2 = "";
            if (profileCommonInfoLJIILIIL == null || (userProfileInfo2 = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo2.getUid()) == null) {
                uid = "";
            }
            sbLIZ2.append(uid);
            sbLIZ2.append("&enter_from=");
            sbLIZ2.append(str);
            sbLIZ2.append("&is_ad=");
            sbLIZ2.append(zLLZZZIL);
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1612930s4h c1612930s4h = C1612930s4h.LIZIZ;
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            ProfileCommonInfo profileCommonInfoLJIILIIL2 = LJIILIIL();
            if (profileCommonInfoLJIILIIL2 == null || (userProfileInfo = profileCommonInfoLJIILIIL2.getUserProfileInfo()) == null || (uid2 = userProfileInfo.getUid()) == null) {
                uid2 = "";
            }
            boolean z = this.LLJI;
            if (zLLZZZIL) {
                str2 = "ads";
            }
            c1612930s4h.LIZIZ(z ? 1 : 0, "click_collections_profile_entrance", str, curUserId, uid2, str2);
            C1248950ibd c1248950ibd = this.LLIZ;
            if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && profileComponents.actions != null) {
                if (c1248950ibd != null && (profileComponents2 = c1248950ibd.LLILLJJLI) != null && (list = profileComponents2.actions) != null) {
                    for (Action action : list) {
                        Action.RouterInfo router2 = action.getRouter();
                        if (router2 != null && (url = router2.getUrl()) != null && a0.LJJIIZI(url, "paidcontent/collections", false) && (router = action.getRouter()) != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            Action.RouterInfo router3 = action.getRouter();
                            if (router3 != null) {
                                url2 = router3.getUrl();
                            } else {
                                url2 = null;
                            }
                            sbLIZ3.append(url2);
                            sbLIZ3.append("&is_ad=");
                            sbLIZ3.append(zLLZZZIL);
                            router.setUrl(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    AwS598S0100000_19 awS598S0100000_19 = this.LLJJLIIIJLLLLLLLZ;
                    if (awS598S0100000_19 != null) {
                        awS598S0100000_19.invoke(list);
                        return true;
                    }
                }
            } else {
                SmartRouter.buildRoute(context, strLIZIZ).open();
            }
        }
        return true;
    }
}
